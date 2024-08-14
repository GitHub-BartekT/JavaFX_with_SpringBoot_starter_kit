package pl.iseebugs.icondesktop.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;
import pl.iseebugs.icondesktop.UtilClass;

@Component
@FxmlView("main-view.fxml")
@RequiredArgsConstructor
public class MainController extends UtilClass {

    @FXML
    public Label label;


    @FXML
    public void initialize() {
    }

    @FXML
    private void handleGoToBView(ActionEvent event) {
        goToView(event, "/pl/iseebugs/b-view.fxml");
    }

    @FXML
    private void handleGoToAView(ActionEvent event) {
        goToView(event, "/pl/iseebugs/a-view.fxml");
    }
}
