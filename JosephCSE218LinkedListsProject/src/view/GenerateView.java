package view;

import java.io.File;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.Generate;

public class GenerateView extends Application {
// Everything works
	@Override
	public void start(Stage primaryStage) throws Exception {
		GeneratorPane pane = new GeneratorPane();
		FileChooser fileChooser = new FileChooser();
		Generate generate = new Generate();
		pane.getGenerateBtn().setDisable(true);
		pane.getOpenMenu().setOnAction(e -> {
			File file = fileChooser.showOpenDialog(primaryStage);
			try {
				generate.readFile(file);
			} catch (FileNotFoundException e1) {
				pane.getSongTextArea().setText("VALID FILE PLEASE!!");
				return;
			}
			pane.getGenerateBtn().setDisable(false);
		});
		pane.getGenerateBtn().setOnAction(e -> {

			generate.setCounter(Integer.valueOf(pane.getNumberField().getText()));

			if (!generate.generateLyrics(pane.getWordField().getText())) {
				pane.getWordField().setText("MUST BE A VALID WORD!");
				return;
			}
			pane.getSongTextArea().setText(generate.getLyrics());
			generate.writeFile();
		});

		Scene myScene = new Scene(pane.getBorderPane(), 500, 300);
		Stage stage = new Stage();
		stage.setScene(myScene);
		stage.show();

	}

	public void readFile() {

	}

}
