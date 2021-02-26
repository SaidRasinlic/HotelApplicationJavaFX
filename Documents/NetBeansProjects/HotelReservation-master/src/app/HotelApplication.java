package app;

import app.controller.Controller;
import app.controller.constants.Constants;
import app.gui.LoginView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HotelApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        LoginView loginView = new LoginView();
        Controller controller = Controller.getInstance();
        controller.setLoginView(loginView);
        controller.setPrimaryStage(primaryStage);
        Scene scene = new Scene(loginView, 650, 180);
        primaryStage.setTitle(Constants.LOGIN_VIEW_TITLE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
//ima web modul i session beanove glassfish a tomcat samo web modul
