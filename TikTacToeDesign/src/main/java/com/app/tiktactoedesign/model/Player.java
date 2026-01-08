package com.app.tiktactoedesign.model;

import lombok.Data;

@Data
public class Player {
    private String name;
    public PlayingPiece playingPiece;
    public Player(String name, PlayingPiece playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
    }
}
