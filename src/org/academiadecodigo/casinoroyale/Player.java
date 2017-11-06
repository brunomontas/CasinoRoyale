package org.academiadecodigo.casinoroyale;

/**
 * Created by codecadet on 04/11/2017.
 */
public class Player {


    private String name;
    private int wallet;
    private int bet;


    /*
    * Constructor recives a name given by the
    * ,client when connects with the server
    * */

    public Player(String name) {

        this.name = name;
        this.wallet = 100;
        this.bet = 0;
    }


    /*
    * Returns the player name
    * */

    public String getName() {

        return name;
    }


    /*
    * Returns the current money of the player
    * */

    public int getWallet() {
        return wallet;
    }


    /*
    * Put money on the player Wallet
    * */

    public int transferMoney() {
        return Integer.parseInt(null);
    }


    /*
    *  Change the value of The propertie bet(in PLayer)
    *
    * */

    public void setBet(int bet) {
        bet += bet;
    }
}
