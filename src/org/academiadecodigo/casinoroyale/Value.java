package org.academiadecodigo.casinoroyale;

/**
 * Created by codecadet on 04/11/2017.
 */
public enum Value {


    TWO    (2),
    TREE   (3),
    FOUR   (4),
    FIVE   (5),
    SIX    (6),
    SEVEN  (7),
    EIGHT  (8),
    NINE   (9),
    TEN    (10),
    JACK   (10),
    QUEEN  (10),
    KING   (10),
    ACE    (11);

    private int value;

    Value(int value){

        this.value = value;
    }
    public int getValue(){

        return this.value;
    }

}
