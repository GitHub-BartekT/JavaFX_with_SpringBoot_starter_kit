package pl.iseebugs.icondesktop;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFxApplication {

	public static void main(String[] args) {
		Application.launch(JavaFxApplication.class, args);
	}
}
