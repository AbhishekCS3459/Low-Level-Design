package com.app.tiktactoedesign.model;

public class PlayingPiece {
    public PieceType pieceType;

    PlayingPiece(PieceType pieceType) {
        this.pieceType = pieceType;
    }
    @Override
    public String toString() {
        return pieceType.toString(); // prints X or O
    }
}
