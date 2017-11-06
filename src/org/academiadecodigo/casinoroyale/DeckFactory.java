package org.academiadecodigo.casinoroyale;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by codecadet on 04/11/2017.
 */
public class DeckFactory{

    /*
    *
    * */

    private final int numberOfDecks = 4;
    private List<Card> deck;


    /*
    *
    * */

    public DeckFactory(){

        deck = new LinkedList<>();
    }


    /*
    *
    * */

    public List<Card> createDeck(){

        for (int i = 0; i < numberOfDecks ; i++) {

            for (Value value : Value.values()) {

                for (Type type : Type.values()) {

                    deck.add(new Card(type, value));
                }
            }
        }
        return deck;
    }

}
