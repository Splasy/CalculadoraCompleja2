package dad.javafx.calculadora;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
	private ComboBox<String> operadorCombo;
	private TextField nReal1;
	private TextField nImaginario1;
	private TextField nReal2;
	private TextField nImaginario2;
	private TextField nRealRes;
	private TextField nImaginarioRes;
	private Label sumaLabel;
	private Label iLabel;
	private Separator separador;
	@Override
	public void start(Stage primaryStage) throws Exception {
		operadorCombo = new ComboBox<String>();
		operadorCombo.getItems().addAll("+", "-", "*", "/");
		operadorCombo.getSelectionModel().select(0);
		
		nReal1 = new TextField();
		nReal1.setPrefWidth(50);
		nReal1.setAlignment(Pos.CENTER);
		
		
		nReal2 = new TextField();
		nReal2.setPrefWidth(50);
		nReal2.setAlignment(Pos.CENTER);
		
		nRealRes = new TextField();
		nRealRes.setPrefWidth(50);
		nRealRes.setAlignment(Pos.CENTER);
		nRealRes.disabledProperty();
		
		nImaginario1 = new TextField();
		nImaginario1.setPrefWidth(50);
		nImaginario1.setAlignment(Pos.CENTER);
		
		nImaginario2 = new TextField();
		nImaginario2.setPrefWidth(50);
		nImaginario2.setAlignment(Pos.CENTER);
		
		nImaginarioRes = new TextField();
		nImaginarioRes.setPrefWidth(50);
		nImaginarioRes.setAlignment(Pos.CENTER);
		nImaginarioRes.disabledProperty();
		
		sumaLabel = new Label("+");
		
		separador = new Separator();
		separador.setOrientation(Orientation.HORIZONTAL);
		
		
		iLabel = new Label("i");
		
		VBox cajaOperador = new VBox();
		cajaOperador.setAlignment(Pos.CENTER);
		cajaOperador.setSpacing(5);
		cajaOperador.getChildren().addAll(operadorCombo);
		
		HBox cajaDatos1 = new HBox();
		cajaDatos1.setAlignment(Pos.CENTER);
		cajaDatos1.setSpacing(5);
		cajaDatos1.getChildren().addAll(nReal1, sumaLabel, nImaginario1, iLabel);
		
		HBox cajaDatos2 = new HBox();
		cajaDatos2.setAlignment(Pos.CENTER);
		cajaDatos2.setSpacing(5);
		cajaDatos2.getChildren().addAll(nReal2, new Label("+"), nImaginario2, new Label("i"));
		
		HBox cajaResultado = new HBox();
		cajaResultado.setAlignment(Pos.CENTER);
		cajaResultado.setSpacing(5);
		cajaResultado.getChildren().addAll(nRealRes, new Label("+"), nImaginarioRes, new Label("i"));
		
		
		VBox cajaPrincipal = new VBox();
		cajaPrincipal.setAlignment(Pos.CENTER);
		cajaPrincipal.setSpacing(5);
		cajaPrincipal.getChildren().addAll(cajaDatos1, cajaDatos2, separador, cajaResultado);
		
		HBox root = new HBox();
		root.setAlignment(Pos.CENTER);
		root.setSpacing(5);
		root.getChildren().addAll(cajaOperador, cajaPrincipal);
		
		Scene scene = new Scene(root, 480, 320);
		
		primaryStage.setTitle("CalculadoraCompleja");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);

	}

}
