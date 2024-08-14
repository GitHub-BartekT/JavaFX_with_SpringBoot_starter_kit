package pl.iseebugs.icondesktop.bmodule;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.iseebugs.icondesktop.UtilClass;

@Log4j2
@Component
public class BController extends UtilClass {

    @FXML
    public Label label;

    @Autowired
    BFacade bFacade;

    public BController() {
    }

    @FXML
    public void initialize () {
        label.setText(bFacade.className());
        log.info("Switch to board view.");
    }

    @FXML
    private void handleGoToMainMenu(ActionEvent event) {
        goToView(event, "/pl/iseebugs/main-view.fxml");
    }
}
