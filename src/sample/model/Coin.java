package sample.model;

import java.util.Random;

public class Coin {

    private String[] headsOrTails;

    public Coin(){
        headsOrTails = new String[]{"Kop", "Munt"};
    }

    public String getHeadsOrTails() {
        Random random = new Random();
        return headsOrTails[random.nextInt(2)];
    }

}
