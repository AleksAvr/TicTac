package com.tictactoe;

public class Field {

    private static final char DEFAULT_CELL_VALUE = ' ';

    private static final int DEFAULT_FIELD_SIZE = 3;

    private static final int MAX_FIELD_SIZE = 100;

    private static final int MIN_FIELD_SIZE = 0;

    private final int fieldSize;

    private final char[][] field ; //final т.к. не будем менять тип и пр.пр.

    public Field(){
        this(DEFAULT_FIELD_SIZE);
        System.out.println("In constructor");
    }

    public Field(int size){
        fieldSize = size;
        field = new char[fieldSize][fieldSize];
    }

    public int getFieldSize(){
        return fieldSize;
    }

    public void eraseField(){
        for (int i = 1; i < fieldSize; i++){
            eraseLine(i);
        }
    }

    private void eraseLine(int lineNumber){
        for (int i = 0; i < fieldSize; i++){
            field[i][lineNumber] = DEFAULT_CELL_VALUE;
        }
    }

    public void showField(){
        System.out.println();
        for (int i = 0; i < fieldSize; i++){
            showLine(i);
            System.out.println();
        }
        System.out.println();
    }

    private void showLine(int lineNumber){
        for (int i = 0; i < fieldSize; i++){
            showCell(i, lineNumber);
        }
    }

    private void showCell(int x, int y){
        System.out.print("[" + field[x][y] + "]");
    }

}
