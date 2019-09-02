package sample.view;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import sample.controller.DobbelController;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import sample.controller.HomeController;


public class DobbelView extends AbstractView{

    private Stage stage;
    private Scene scene;
    private Parent root;
    private DobbelController dobbelController;

    private String titel = "Dobbel-O-Matic";

    public DobbelView(DobbelController dobbelController){
        stage = new Stage();
        this.dobbelController = dobbelController;
        setupScene();
        scene = new Scene(root);
    }

    public void setupScene(){
        VBox vBox = new VBox(40);
        Font font = new Font(90);
        Button button = new Button("Gooi");
        Label label = new Label(String.valueOf(dobbelController.getGetal()));
        label.setFont(font);
        button.setOnAction(e -> {
            dobbelController.randomize();
            label.setText(String.valueOf(dobbelController.getGetal()));
        });

        Button home = new Button("Terug naar Home");
        home.setFocusTraversable(false);
        home.setOnAction( e ->{
            HomeController homeController = new HomeController();
            HomeView homeView = new HomeView(homeController);

            this.stage.close();
            homeView.show(homeView.getStageHome(), homeView.getScene(),homeView.getTitel());
        });
        vBox.getChildren().addAll(home,label,button);
        vBox.setAlignment(Pos.CENTER);
        root = vBox;
    }

    public Scene getScene() {
        return scene;
    }

    public String getTitel() {
        return titel;
    }

    public Stage getStage() {
        return stage;
    }
//    public void show(){
//        stage.setTitle("Dobbel-O-Machine");
//        stage.setWidth(300);
//        stage.setHeight(300);
//        stage.setScene(scene);
//        stage.show();
//    }

}
