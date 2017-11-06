package org.academiadecodigo.casinoroyale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * Created by codecadet on 04/11/2017.
 */
public class PlayerHandler implements Runnable{

    private Player player;
    private Server server;
    private Socket connection;
    private BufferedReader in;


    /*
    * Constructor recives an accepted client Socket from the server
    * Receives a Server for futures communications
    * */

    public PlayerHandler(Socket client, Server server){

        this.connection = client;
        this.server = server;

    }


    /*
    *
    * */

    @Override
    public void run() {

        try {

            playerCredentials(this.connection);

            boolean shutdownRequested = false;
            while (!shutdownRequested){

                String message;
                if((message = in.readLine()) != null){

                    server.sendMessage(Thread.currentThread().getName() + " : " + message);

                } else{

                    shutdownRequested = true;
                    shuDownConection();

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
    *   Inicial contact with the player
    *   ASK for user credencials (userName and Pass)
    * */

    private void playerCredentials(Socket connection) throws IOException {

        PrintStream out = new PrintStream(connection.getOutputStream());
        out.println("NAME : ");
        in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        Thread.currentThread().setName(in.readLine());
        out.println("Hello " + Thread.currentThread().getName() + " Say Something ");

    }


    /*
    * Close socket connection when PLayer out
    * Remove player from the Arraylis
    * */

    private void shuDownConection() throws IOException {

        connection.close();
        server.playerRemove(this);
    }


    /*
    * */

    public void createPlayer(){


    }


    /*
    * Return the Socket connection
    * */

    public Socket getConnection(){
        return connection;
    }


}
