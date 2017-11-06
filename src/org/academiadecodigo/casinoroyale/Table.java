package org.academiadecodigo.casinoroyale;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by codecadet on 04/11/2017.
 */
public class Table {

    /*
    * Properties
    * */


    public static int MAXPLAYERS = 5;
    private DeckFactory deckFactory;
    private Croupier croupier;
    private PlayerHandler[] players;
    private boolean tableOpen;
    private Queue<Card> deck;
    private List<Card> list;


    /*
    * Coonstructor
    * */

    public Table(){

        deckFactory = new DeckFactory();
        this.list = new LinkedList<>(deckFactory.createDeck());
    }


    /*
    *
    * */

    public void getPlayers(){

    }


    /*
    *
    * */

    public void closeTable(){

    }


    /*
    * Recive a list of card from deckfactory,
    * and copy that list to deck Queue to use
    * FIFO feature
    * */

    public void shuffle(){

        Collections.shuffle(list);
        deck = new LinkedList<>(list);

        for(Card item : deck){
            System.out.println(item.getValue() + " of " + item.getType());
        }
    }


    /*
    *
    * */

    public Queue<Card> giveDeck(){

        return deck;
    }


}
