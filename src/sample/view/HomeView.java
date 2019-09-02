package sample.view;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import sample.controller.CoinController;
import sample.controller.DobbelController;
import sample.controller.HomeController;


public class HomeView extends AbstractView{

    private Stage stageHome;
    private Scene scene;
    private Parent root;
    private HomeController homeController;

    private DobbelController dobbelController;
    private DobbelView dobbelView;

    private CoinController coinController;
    private CoinView coinView;

    private String titel = "Home";

    public HomeView(HomeController homeController){
        stageHome = new Stage();
        this.homeController = homeController;
        setupScene();
        scene = new Scene(root);

        dobbelController = new DobbelController();
        dobbelView = new DobbelView(dobbelController);

        coinController = new CoinController();
        coinView = new CoinView(coinController);
    }

    public void setupScene(){
        VBox vBox = new VBox(40);
        HBox hBox = new HBox(40);
        Label label = new Label("Welkom bij de Gamble-O-Matic!");
        Button dobbel = new Button("Dobbelsteen");
        dobbel.setFocusTraversable(false);
        dobbel.setOnAction( e ->{
            this.stageHome.close();
            dobbelView.show(dobbelView.getStage(), dobbelView.getScene(),dobbelView.getTitel());
        });

        Button coin = new Button("Coin Flip");
        coin.setFocusTraversable(false);
        coin.setOnAction( e ->{
            this.stageHome.close();
            coinView.show(coinView.getStageCoin(), coinView.getScene(),coinView.getTitel());
        });

        Font font = new Font(30);
        label.setFont(font);
        label.setWrapText(true);
        label.setStyle("-fx-text-alignment: center;");
        hBox.getChildren().addAll(dobbel,coin);
        hBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(label,hBox);
        vBox.setAlignment(Pos.CENTER);
        root = vBox;
    }

    public Scene getScene() {
        return scene;
    }

    public String getTitel() {
        return titel;
    }

    public Stage getStageHome() {
        return stageHome;
    }

    //    public void show(){
//        stage.setTitle("Home");
//        stage.setWidth(300);
//        stage.setHeight(300);
//        stage.setScene(scene);
//        stage.setResizable(false);
//        stage.show();
//    }

}
