package telas.exerciciolp1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Formscelular extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Formulário de Celular");

        // VBox para organizar os elementos
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20));

        // Label e TextField para a marca do celular
        Label marcaLabel = new Label("Nome da Marca:");
        TextField marcaText = new TextField();

        // Label e TextField para a quantidade de câmeras do celular
        Label cameraLabel = new Label("Quantas câmeras:");
        TextField cameraText = new TextField();

        // Label e TextField para a cor do celular
        Label corLabel = new Label("Cor:");
        TextField corText = new TextField();

        // Botão para submeter o formulário
        Button enviarButton = new Button("Enviar");

        // Adicionando os elementos ao VBox
        vbox.getChildren().addAll(marcaLabel, marcaText, cameraLabel, cameraText, corLabel, corText, enviarButton);

        // Imagem de fundo
        Image backgroundImage = new Image("https://github.com/BispoJPM/ExercicioLP/assets/142633184/d6ad3cc1-fbac-49e6-b272-903706eb84c4");
        ImageView backgroundImageView = new ImageView(backgroundImage);
        backgroundImageView.setFitWidth(400);
        backgroundImageView.setFitHeight(300);

        // StackPane para organizar os elementos
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(backgroundImageView, vbox);

        // Evento para o botão de submeter
        enviarButton.setOnAction(event -> {
            // Obtendo os valores dos campos de texto
            String marca = marcaText.getText();
            String cameras = cameraText.getText();
            String cor = corText.getText();

            // Exibindo os resultados em uma nova janela
            exibirResultado(marca, cameras, cor);
        });

        Scene scene = new Scene(stackPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método para exibir o resultado em uma nova janela
    private void exibirResultado(String marca, String cameras, String cor) {
        Stage resultadoStage = new Stage();
        resultadoStage.setTitle("Resultado do Formulário");

        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20));

        Label marcaLabel = new Label("Marca: " + marca);
        Label camerasLabel = new Label("Quantidade de câmeras: " + cameras);
        Label corLabel = new Label("Cor: " + cor);

        vbox.getChildren().addAll(marcaLabel, camerasLabel, corLabel);

        Scene scene = new Scene(vbox, 300, 200);
        resultadoStage.setScene(scene);
        resultadoStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
