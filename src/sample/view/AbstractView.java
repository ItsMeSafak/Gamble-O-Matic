package sample.view;

import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class AbstractView {

    public AbstractView(){

    }

    public void show(Stage stage, Scene scene, String titel){
        stage.setTitle(titel);
        stage.setWidth(300);
        stage.setHeight(300);
        stage.setScene(scene);
        stage.show();
    }
}
