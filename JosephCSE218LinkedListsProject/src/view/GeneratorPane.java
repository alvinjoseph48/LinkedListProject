package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class GeneratorPane {
	private TextField numberField;
	private TextField wordField;
	private BorderPane borderPane;
	private Menu menu;
	private MenuItem openMenu;
	private MenuBar menuBar;
	private GridPane gridPane;
	private TextArea songTextArea;
	private Button generateBtn;

	public GeneratorPane() {
		borderPane = new BorderPane();
		gridPane = new GridPane();
		numberField = new TextField("Enter Number");
		wordField = new TextField("Enter a word");
		songTextArea = new TextArea();
		generateBtn = new Button("Generate Lyrics");
		menu = new Menu("File");
		openMenu = new MenuItem("Open");
		menuBar = new MenuBar();
	
	
		gridPane.setVgap(20);
		gridPane.setHgap(20);
		gridPane.setPadding(new Insets(15,15,15,15));
		songTextArea.setWrapText(true);
		songTextArea.setPrefSize(450, 100);
	//	songTextArea.setMinSize(400, 100);
		gridPane.add(songTextArea, 0, 0);
		gridPane.add(numberField, 0, 1);
		gridPane.add(wordField, 0, 2);
		gridPane.add(generateBtn, 0,3);
		
		menu.getItems().add(openMenu);
		menuBar.getMenus().add(menu);
		borderPane.setTop(menuBar);
		borderPane.setCenter(gridPane);
		
	
	}

	public BorderPane getBorderPane() {
		return borderPane;
	}

	public void setBorderPane(BorderPane borderPane) {
		this.borderPane = borderPane;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public MenuItem getOpenMenu() {
		return openMenu;
	}

	public void setOpenMenu(MenuItem openMenu) {
		this.openMenu = openMenu;
	}

	public MenuBar getMenuBar() {
		return menuBar;
	}

	public void setMenuBar(MenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public GridPane getGridPane() {
		return gridPane;
	}

	public void setGridPane(GridPane gridPane) {
		this.gridPane = gridPane;
	}

	public TextArea getSongTextArea() {
		return songTextArea;
	}

	public void setSongTextArea(TextArea songTextArea) {
		this.songTextArea = songTextArea;
	}

	public Button getGenerateBtn() {
		return generateBtn;
	}

	public void setGenerateBtn(Button generateBtn) {
		this.generateBtn = generateBtn;
	}

	public TextField getNumberField() {
		return numberField;
	}

	public void setNumberField(TextField numberField) {
		this.numberField = numberField;
	}

	public TextField getWordField() {
		return wordField;
	}

	public void setWordField(TextField wordField) {
		this.wordField = wordField;
	}
	
}
