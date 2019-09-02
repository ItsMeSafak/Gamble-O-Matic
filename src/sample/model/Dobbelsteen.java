package sample.model;

import java.util.Random;

public class Dobbelsteen {

    private int getal;

    public Dobbelsteen(){
    }

    public void randomize(){
        Random random = new Random();
        getal = random.nextInt(6) + 1;
    }

    public int getGetal(){
        return getal;
    }

    public void setGetal(int getal){
        this.getal = getal;
    }

    public void getalPlus(){
        getal++;
    }
}
