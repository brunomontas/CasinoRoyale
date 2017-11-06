package org.academiadecodigo.casinoroyale;

/**
 * Created by codecadet on 04/11/2017.
 */

import java.io.IOException;

public class Casino {

    public static void main(String[] args) throws IOException {
        Table table = new Table();
        table.shuffle();
        Server server = new Server(12345);
        server.openServer();

        //Game game = new Game();

    }
}
