package pl.iseebugs.icondesktop.bmodule;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import pl.iseebugs.icondesktop.UtilClass;

@Log4j2
@Component
public class BController extends UtilClass {

    @FXML
    public Label label;

    @FXML
    public Button button;

    public BController() {
    }

    @FXML
    public void initialize () {
        log.info("Switch to board view.");
    }

    @FXML
    private void handleGoToMainMenu(ActionEvent event) {
        goToView(event, "/pl/iseebugs/main-view.fxml");
    }
}
