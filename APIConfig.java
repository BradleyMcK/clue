package com.isonas.web.api.rest.v2.endpoints;

import java.io.IOException;

/**
 * This class contains static configuration settings
 */
public class APIConfig {
    public static final int API_VERSION = 2;
    public static final String API_BASEPATH = "/api/v"+API_VERSION+"/";
    public static final int DEFAULT_PAGINATION_LIMIT = 50;
    public static final int DEFAULT_PAGINATION_LIMIT_MAX = 500;




    public static void main(String[] args) {


        try {
            boolean done = false;
            String[] playerList = {"Leo", "Alexa", "Zoe"};

            while (!done) {

                for (String player : playerList) {
                    processPlayerTurn(player);
                }

                //done = takeTurn();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    private static void processPlayerTurn(String player) throws IOException {

        String room = getRoomGuess(player);
        String killer = getKillerGuess(player);
        String weapon = getWeaponGuess(player);

        System.out.println(player + " is guessing " + killer + " in the " + room + " with " + weapon);
    }

    private static String getKillerGuess(String player) throws IOException {

        System.out.println(player + ", who are you guessing is the killer?");

        byte[] guess = new byte[20];
        System.in.read(guess);
        return new String(guess);
    }

    private static String getRoomGuess(String player) throws IOException {

        System.out.println(player + ", where do you think the crime occurred?");

        byte[] guess = new byte[20];
        System.in.read(guess);
        return new String(guess);
    }

    private static String getWeaponGuess(String player) throws IOException {
        System.out.println(player + ", what weapon do you think the killer used?");

        byte[] guess = new byte[20];
        System.in.read(guess);
        return new String(guess);
    }

}
