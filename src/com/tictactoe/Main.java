package com.tictactoe;

public class Main {
    public static void main (String args[]){

        Field field1 = new Field();
        field1.eraseField();
        field1.showField();
        field1.setValue();
        field1.checkColumn('X', 0);

    }
}

