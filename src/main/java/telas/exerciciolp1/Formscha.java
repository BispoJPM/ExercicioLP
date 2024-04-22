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

public class Formscha extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Formulário de Chá");

        // VBox para organizar os elementos
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20));

        // Label para o nome do chá
        Label nameLabel = new Label("Nome do Chá:");
        TextField nameInput = new TextField();
        nameInput.setPromptText("Insira o nome do chá");

        // Label para a temperatura do chá
        Label tempLabel = new Label("Temperatura do Chá:");
        TextField tempInput = new TextField();
        tempInput.setPromptText("Insira a temperatura - Somente números");

        // Label para o cheiro do chá
        Label smellLabel = new Label("Cheiro do Chá:");
        TextField smellInput = new TextField();
        smellInput.setPromptText("Insira o cheiro do chá");

        // Botão para submeter o formulário
        Button submitButton = new Button("Enviar");

        // Adicionando os elementos ao VBox
        vbox.getChildren().addAll(nameLabel, nameInput, tempLabel, tempInput, smellLabel, smellInput, submitButton);

        // Imagem de fundo
        ImageView backgroundImageView = new ImageView(new Image("https://github-production-user-asset-6210df.s3.amazonaws.com/142633184/310901740-23cbc9f8-1b2f-4b69-a1f5-5362c1056096.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240422%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240422T013720Z&X-Amz-Expires=300&X-Amz-Signature=6e58f4d4c0e83f0599398a6ecd86288e6ede5503491e5c0df23af6c587477bb6&X-Amz-SignedHeaders=host&actor_id=142633184&key_id=0&repo_id=764385183"));
        backgroundImageView.setFitWidth(400);
        backgroundImageView.setFitHeight(300);

        // StackPane para organizar os elementos
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(backgroundImageView, vbox);

        // Evento para o botão de submeter
        submitButton.setOnAction(event -> {
            // Criando um objeto Chá com os dados do formulário
            Chá tea = new Chá();
            tea.setNome(nameInput.getText());
            tea.setTemperatura(Integer.parseInt(tempInput.getText()));
            tea.setCheiro(smellInput.getText());

            // Exibindo informações do chá na nova janela
            exibirResultado(tea);
        });

        Scene scene = new Scene(stackPane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método para exibir o resultado em uma nova janela
    private void exibirResultado(Chá tea) {
        Stage resultadoStage = new Stage();
        resultadoStage.setTitle("Resultado do Formulário");

        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20));

        Label nameLabel = new Label("Nome do Chá: " + tea.getNome());
        Label tempLabel = new Label("Temperatura do Chá: " + tea.getTemperatura());
        Label smellLabel = new Label("Cheiro do Chá: " + tea.getCheiro());

        vbox.getChildren().addAll(nameLabel, tempLabel, smellLabel);

        Scene scene = new Scene(vbox, 300, 200);
        resultadoStage.setScene(scene);
        resultadoStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
