package pl.iseebugs.icondesktop.amodule;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.iseebugs.icondesktop.UtilClass;

@Log4j2
@Component
public class AController extends UtilClass {

    @FXML
    Label label;

    @Autowired
    AFacade aFacade;

    public AController() {
    }

    @FXML
    public void initialize () {
        label.setText(aFacade.className());
        log.info("Switch to icon view.");
    }

    @FXML
    private void handleGoToMainMenu(ActionEvent event) {
        goToView(event, "/pl/iseebugs/main-view.fxml");
    }


}
