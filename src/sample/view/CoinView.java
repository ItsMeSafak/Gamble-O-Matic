package sample.view;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import sample.controller.CoinController;
import sample.controller.HomeController;



public class CoinView extends AbstractView{

    private Stage stageCoin;
    private Scene scene;
    private Parent root;
    private CoinController coinController;

    private HomeController homeController;
    private HomeView homeView;

    private String titel = "Coin-O-Flip";

    public CoinView(CoinController coinController){
        stageCoin = new Stage();
        this.coinController = coinController;
        setupScene();
        scene = new Scene(root);


    }

    public void setupScene(){
        VBox vBox = new VBox(40);
        Button button = new Button("Flip");
        Button home = new Button("Terug naar Home");
        home.setFocusTraversable(false);
        home.setOnAction( e ->{
            this.stageCoin.close();
            homeController = new HomeController();
            homeView = new HomeView(homeController);
            homeView.show(homeView.getStageHome(), homeView.getScene(),homeView.getTitel());
        });
        Label label = new Label("Klik op 'Flip'");
        Font font = new Font(40);
        label.setFont(font);
//        Image heads = new Image("../sample/resource/heads.jpg");
//        Image tails = new Image("../sample/resource/tails.jpg");
//        ImageView view = new ImageView();
//        images.addAll(heads.getUrl(),tails.getUrl());
        button.setOnAction(e ->{
            label.setText(coinController.kopOfMunt());
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

    public Stage getStageCoin() {
        return stageCoin;
    }
//    public void show(){
//        stage.setTitle("Coin-O-Flip");
//        stage.setWidth(300);
//        stage.setHeight(300);
//        stage.setScene(scene);
//        stage.show();
//    }

}
