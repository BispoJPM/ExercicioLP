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

public class Formscoxinha extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Formulário de Coxinha");

        // VBox para organizar os elementos
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20));

        // Label para a receita da massa
        Label receitaLabel = new Label("A massa é feita de:");
        // TextField para inserir a receita da massa
        TextField receitaText = new TextField();

        // Label para o tamanho da coxinha
        Label tamanhoLabel = new Label("Qual o tamanho:");
        // TextField para inserir o tamanho da coxinha
        TextField tamanhoText = new TextField();

        // Label para o recheio da coxinha
        Label recheioLabel = new Label("Qual o recheio:");
        // TextField para inserir o recheio da coxinha
        TextField recheioText = new TextField();

        // Botão para submeter o formulário
        Button enviarButton = new Button("Enviar");

        // Adicionando os elementos ao VBox
        vbox.getChildren().addAll(receitaLabel, receitaText, tamanhoLabel, tamanhoText, recheioLabel, recheioText, enviarButton);

        // Imagem de fundo
        Image backgroundImage = new Image("https://github.com/BispoJPM/ExercicioLP/assets/142633184/5f0f0249-1e6b-4c0f-84d8-653c3b0aa223");
        ImageView backgroundImageView = new ImageView(backgroundImage);
        backgroundImageView.setFitWidth(400);
        backgroundImageView.setFitHeight(300);

        // StackPane para organizar os elementos
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(backgroundImageView, vbox);

        // Evento para o botão de submeter
        enviarButton.setOnAction(e -> {
            // Obtendo os valores dos campos de texto
            String receita = receitaText.getText();
            String tamanho = tamanhoText.getText();
            String recheio = recheioText.getText();

            // Exibindo os resultados em uma nova janela
            exibirResultado(receita, tamanho, recheio);
        });

        Scene scene = new Scene(stackPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método para exibir o resultado em uma nova janela
    private void exibirResultado(String receita, String tamanho, String recheio) {
        Stage resultadoStage = new Stage();
        resultadoStage.setTitle("Resultado do Formulário");

        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20));

        Label receitaLabel = new Label("Receita da Massa: " + receita);
        Label tamanhoLabel = new Label("Tamanho da Coxinha: " + tamanho);
        Label recheioLabel = new Label("Recheio da Coxinha: " + recheio);

        vbox.getChildren().addAll(receitaLabel, tamanhoLabel, recheioLabel);

        Scene scene = new Scene(vbox, 300, 200);
        resultadoStage.setScene(scene);
        resultadoStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
