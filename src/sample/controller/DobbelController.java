package sample.controller;

import sample.model.Dobbelsteen;

public class DobbelController {

    private Dobbelsteen dobbelsteen;

    public DobbelController(){
        dobbelsteen = new Dobbelsteen();
    }

    public int getGetal(){
        return dobbelsteen.getGetal();
    }

    public void randomize(){
        dobbelsteen.randomize();
    }

    public void erbij(){
        dobbelsteen.getalPlus();
    }
}
