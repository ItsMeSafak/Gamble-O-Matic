package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.controller.HomeController;
import sample.view.HomeView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        HomeController homeController = new HomeController();
        HomeView homeView = new HomeView(homeController);
        homeView.show(homeView.getStageHome(), homeView.getScene(), homeView.getTitel());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
