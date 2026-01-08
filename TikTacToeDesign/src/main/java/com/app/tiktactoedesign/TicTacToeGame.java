package com.app.tiktactoedesign;

import com.app.tiktactoedesign.model.*;

import java.util.*;

public class TicTacToeGame {
    private Deque<Player> players;
    Board gameboard;
    TicTacToeGame(int size){
        initializeGame(size);
    }
    private void initializeGame(int size) {
        players = new LinkedList<Player>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1=new Player("Player1", crossPiece);
        System.out.println("added"+player1+"with+"+crossPiece.pieceType);
        players.add(player1);

        PlayingPiece0 zeroPiece=new PlayingPiece0();
        Player player2=new Player("Player2", zeroPiece);
        System.out.println("added"+player2+"with:"+zeroPiece.pieceType);
        players.add(player2);

        gameboard = new Board(size);
        System.out.println("inatilized the game board with size " + size);
    }

    public String startGame(){
        boolean noWinner=true;
        while(noWinner){
            // take out the first player from the queue
            Player playerTurn=players.removeFirst();

            //get free space in the gameboard
            gameboard.printBoard();
            List<Map<Integer,Integer>> freeSpaces=gameboard.getFreeSpaces();
            if(freeSpaces.isEmpty()){
                // this means that the game is tied as there is not free spaces
                noWinner=false;
                continue;
            }
            System.out.println("Player:"+playerTurn.getName()+"\nEnter row,column where you want to add\n");

            Scanner sc=new Scanner(System.in);
            String row_col=sc.nextLine();
            String[]values=row_col.split(",");
            int inputRow=Integer.parseInt(values[0]);
            int inputColumn=Integer.parseInt(values[1]);

            // add the piece in the board
            boolean pieceAddedSuccessfully=gameboard.addPiece(inputRow,inputColumn, playerTurn.getPlayingPiece());
            if(!pieceAddedSuccessfully){
                System.out.println(playerTurn.getName()+" could not add piece");
                players.addFirst(playerTurn);
                continue;
            }
            // add this player at last
            players.add(playerTurn);
            boolean isWinner=isThereWinner(inputRow,inputColumn,playerTurn.playingPiece.pieceType);
            if(isWinner){
                return "we have the winner as "+playerTurn.getName();
            }
        }

        return "Match Tied";
    }
    private boolean isThereWinner(int inputRow, int inputColumn, PieceType pieceType) {
      boolean rowMatch=true;
      boolean columnMatch=true;
      boolean diagonalMatch=true;
      boolean antiColumnMatch=true;
      // check the match in given row
        for(int idx=0;idx< gameboard.size;++idx){
            if(gameboard.board[inputRow][idx]==null ||gameboard.board[inputRow][idx].pieceType!=pieceType){
                rowMatch=false;
                break;
            }
        }
        // check the match in given column
        for(int jdx=0;jdx<gameboard.size;++jdx){
            if(gameboard.board[jdx][inputColumn]==null || gameboard.board[jdx][inputColumn].pieceType!=pieceType){
                columnMatch=false;
                break;
            }
        }
        // diogonal match
        for(int idx=0,jdx=0;idx<gameboard.size;++idx,++jdx){
            if(gameboard.board[idx][jdx]==null || gameboard.board[idx][jdx].pieceType!=pieceType){
                diagonalMatch=false;
                break;
            }
        }
        // check anti diogonal
        for(int idx=0,jdx= gameboard.size-1;idx<gameboard.size;++idx,--jdx){
            if(gameboard.board[idx][jdx]==null || gameboard.board[idx][jdx].pieceType!=pieceType){
                antiColumnMatch=false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiColumnMatch;
    }

}
