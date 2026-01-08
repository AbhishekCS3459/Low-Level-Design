package com.app.tiktactoedesign.model;

import java.util.*;

public class Board {
   public int size;
   public PlayingPiece [][]board;
   public Board(int size) {
      this.size = size;
      this.board = new PlayingPiece[size][size];
   }
   public void printBoard() {
      System.out.println("\n");

      for (int i = 0; i < size; i++) {
         for (int j = 0; j < size; j++) {
            System.out.print((board[i][j] == null ? "-" : board[i][j]) + " ");
         }
         System.out.println(); // move to next row
      }

      System.out.println(); // one blank line after board
   }

   public List<Map<Integer, Integer>> getFreeSpaces() {
      List<Map<Integer, Integer>> freeSpace = new ArrayList<>();

      for (int i = 0; i < size; i++) {
         for (int j = 0; j < size; j++) {
            if (board[i][j] == null) {
               Map<Integer, Integer> row_col = new HashMap<>();
               row_col.put(i, j);
               freeSpace.add(row_col);
            }
         }
      }
      return freeSpace;
   }

   public boolean addPiece(int row, int col, PlayingPiece piece) {
      if(board[row][col] != null) {
         System.out.println("cell occupied cannot add piece");
         return false;
      }
      board[row][col] = piece;
      return true;
   }
}
