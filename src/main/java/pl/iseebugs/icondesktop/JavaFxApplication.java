package pl.iseebugs.icondesktop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class JavaFxApplication extends Application {

    private ConfigurableApplicationContext context;

    @Override
    public void init() {
        // Uruchomienie Spring Boot
        context = SpringApplication.run(getClass());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Załaduj widok FXML
        Parent root = loadFxml("/pl/iseebugs/main-view.fxml");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @Override
    public void stop() {
        // Zamykanie kontekstu Spring Boot podczas zamykania aplikacji
        context.close();
    }

    private Parent loadFxml(String fxmlPath) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
        loader.setControllerFactory(context::getBean);  // Spring zarządza kontrolerem
        return loader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}

