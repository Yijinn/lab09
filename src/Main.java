
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




public class Main extends Application{

	Stage window;
	Scene scene;
	Button button;
	ListView<String> listView1;
	ListView<String> listView2;
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		
		listView1 = new ListView<>();
		listView1.getItems().addAll("a", "b", "c");
		listView1.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		
		button = new Button("Select");
		button.setOnAction(e->buttonClicked());
		
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(listView1, button);
		
		VBox layout2 = new VBox(10);
		layout2.setPadding(new Insets(40,40,40,40));
		
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
		
	}
	
	private void buttonClicked() {
		ObservableList<String> movies;
		movies = listView1.getSelectionModel().getSelectedItems();
		
		for(String m : movies) {
			System.out.println(m);
		}
	}
}
