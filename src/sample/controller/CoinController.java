package sample.controller;

import sample.model.Coin;

public class CoinController {

    Coin coin;

    public CoinController() {
        coin = new Coin();
    }

    public String kopOfMunt(){
        return coin.getHeadsOrTails();
    }
}
