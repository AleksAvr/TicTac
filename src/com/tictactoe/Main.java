package com.tictactoe;

public class Main {
    public static void main (String [] args){

        Field field1 = new Field();
        field1.eraseField();
        field1.showField();

        Field field2 = new Field(12);
        field2.eraseField();
        field2.showField();

    }
}

