package servertictactoe;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public  class AdminLoginPage extends AnchorPane {
    Stage parentStage;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane;
    protected final Text ticTacToeServerTxt;
    protected final Glow glow;
    protected final Text userNameTxt;
    protected final Text passwardTxt;
    protected final TextField userNameValueTxtField;
    protected final TextField passwardValueTxtField;
    protected final Button serverLoginBtn;
    protected final DropShadow dropShadow;

    public AdminLoginPage(Stage stage) {
        parentStage = stage;

        borderPane = new BorderPane();
        anchorPane = new AnchorPane();
        ticTacToeServerTxt = new Text();
        glow = new Glow();
        userNameTxt = new Text();
        passwardTxt = new Text();
        userNameValueTxtField = new TextField();
        passwardValueTxtField = new TextField();
        serverLoginBtn = new Button();
        dropShadow = new DropShadow();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        borderPane.setMaxHeight(USE_PREF_SIZE);
        borderPane.setMaxWidth(USE_PREF_SIZE);
        borderPane.setMinHeight(USE_PREF_SIZE);
        borderPane.setMinWidth(USE_PREF_SIZE);
        borderPane.setPrefHeight(720.0);
        borderPane.setPrefWidth(1024.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        ticTacToeServerTxt.setLayoutX(24.0);
        ticTacToeServerTxt.setLayoutY(81.0);
        ticTacToeServerTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticTacToeServerTxt.setStrokeWidth(0.0);
        ticTacToeServerTxt.setText("Tic_Tac_Toe SERVER");
        ticTacToeServerTxt.setFont(new Font("Bauhaus 93", 60.0));

        ticTacToeServerTxt.setEffect(glow);

        userNameTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        userNameTxt.setLayoutX(155.0);
        userNameTxt.setLayoutY(275.0);
        userNameTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        userNameTxt.setStrokeWidth(0.0);
        userNameTxt.setText("USerName");
        userNameTxt.setFont(new Font("Bauhaus 93", 40.0));

        passwardTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        passwardTxt.setLayoutX(160.0);
        passwardTxt.setLayoutY(364.0);
        passwardTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        passwardTxt.setStrokeWidth(0.0);
        passwardTxt.setText("PaSSward");
        passwardTxt.setFont(new Font("Bauhaus 93", 40.0));

        userNameValueTxtField.setLayoutX(354.0);
        userNameValueTxtField.setLayoutY(246.0);
        userNameValueTxtField.setPrefHeight(40.0);
        userNameValueTxtField.setPrefWidth(440.0);

        passwardValueTxtField.setLayoutX(354.0);
        passwardValueTxtField.setLayoutY(338.0);
        passwardValueTxtField.setPrefHeight(40.0);
        passwardValueTxtField.setPrefWidth(440.0);

        serverLoginBtn.setAlignment(javafx.geometry.Pos.CENTER);
        serverLoginBtn.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        serverLoginBtn.setLayoutX(429.0);
        serverLoginBtn.setLayoutY(458.0);
        serverLoginBtn.setMnemonicParsing(false);
        serverLoginBtn.setPrefHeight(54.0);
        serverLoginBtn.setPrefWidth(209.0);
        serverLoginBtn.setStyle("-fx-background-color: #f79594;");
        serverLoginBtn.setText("Login");
        serverLoginBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        serverLoginBtn.setFont(new Font("Bauhaus 93", 36.0));

        serverLoginBtn.setEffect(dropShadow);
        borderPane.setCenter(anchorPane);

        anchorPane.getChildren().add(ticTacToeServerTxt);
        anchorPane.getChildren().add(userNameTxt);
        anchorPane.getChildren().add(passwardTxt);
        anchorPane.getChildren().add(userNameValueTxtField);
        anchorPane.getChildren().add(passwardValueTxtField);
        anchorPane.getChildren().add(serverLoginBtn);
        getChildren().add(borderPane);
        
        
        serverLoginBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    AdminServerPage root = new AdminServerPage(parentStage);
                    Scene scene = new Scene(root);
                    parentStage.setScene(scene);
                } catch (IOException ex) {
                    Logger.getLogger(AdminLoginPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }
}
