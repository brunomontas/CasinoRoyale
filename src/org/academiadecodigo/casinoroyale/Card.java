package org.academiadecodigo.casinoroyale;

/**
 * Created by codecadet on 04/11/2017.
 */

public class Card {

    private Type type;
    private Value value;


    /*
    * Constructor
    * */

    public Card(Type type, Value value){

        this.type = type;
        this.value = value;
    }


    /*
    *
    * */

    public Type getType() {
        return type;
    }


    /*
    *
    * */

    public Value getValue() {
        return value;
    }
}
