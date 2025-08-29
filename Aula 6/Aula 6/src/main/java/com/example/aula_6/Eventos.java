package com.example.aula_6;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Eventos extends Application {
    private Button bntOla;
    private Button bntSair;
    private Label lblDigite;
    private Label lblNome;
    private TextField txfNome;

    public void start(Stage stage){
        bntOla = new Button();
        bntOla.setText("Ola");
        bntSair = new Button("Sair");

        lblDigite = new Label("Bem vindo(a), Digite seu nome:");
        lblNome = new Label();

        txfNome = new TextField();

        bntSair.setOnAction(e -> {
            Platform.exit();
        });
        bntOla.setOnAction(e ->{
            lblNome.setText("Ola, " + txfNome.getText());
        });

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(lblDigite, txfNome, lblNome, bntOla, bntSair);
        vBox.setPadding(new Insets(10));

        Scene scene = new Scene(vBox, 300, 200);

        stage.setScene(scene);
        stage.setTitle("Exemplo com Eventos");
        stage.show();

    }

    public static void main(String[] args){
        launch(args);
    }
}
