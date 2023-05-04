package tictactoe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class OfflineMenuPage extends BorderPane {
    
    Stage parentStage;
    protected final AnchorPane anchorPane;
    protected final Glow glow;
    protected final Button vsComputerBtn;
    protected final DropShadow dropShadow;
    protected final Text menuTxt;
    protected final Glow glow0;
    protected final Button backBtn;
    protected final DropShadow dropShadow0;
    protected final Button vsPersonBtn;
    protected final DropShadow dropShadow1;
    protected final Button recordsBtn;
    protected final DropShadow dropShadow2;
    protected final AnchorPane anchorPane0;
    protected final Glow glow1;
    protected final Text xTxt;
    protected final Glow glow2;
    protected final Text oTxt;
    protected final Glow glow3;
    protected final Text toeTxt;
    protected final Text aTxt;
    protected final Text ticTxt;
    protected final ImageView xoImg;
    protected final ToggleButton soundToggleBtn;
    protected final DropShadow dropShadow3;
    protected final Text soundTxt;

    public OfflineMenuPage(Stage stage) {

        parentStage = stage;
        anchorPane = new AnchorPane();
        glow = new Glow();
        vsComputerBtn = new Button();
        dropShadow = new DropShadow();
        menuTxt = new Text();
        glow0 = new Glow();
        backBtn = new Button();
        dropShadow0 = new DropShadow();
        vsPersonBtn = new Button();
        dropShadow1 = new DropShadow();
        recordsBtn = new Button();
        dropShadow2 = new DropShadow();
        anchorPane0 = new AnchorPane();
        glow1 = new Glow();
        xTxt = new Text();
        glow2 = new Glow();
        oTxt = new Text();
        glow3 = new Glow();
        toeTxt = new Text();
        aTxt = new Text();
        ticTxt = new Text();
        xoImg = new ImageView();
        soundToggleBtn = new ToggleButton();
        dropShadow3 = new DropShadow();
        soundTxt = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(720.0);
        setPrefWidth(1024.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(720.0);
        anchorPane.setPrefWidth(350.0);
        anchorPane.setStyle("-fx-background-color: #F27B7A;");

        anchorPane.setEffect(glow);

        vsComputerBtn.setLayoutX(92.0);
        vsComputerBtn.setLayoutY(240.0);
        vsComputerBtn.setMnemonicParsing(false);
        vsComputerBtn.setPrefHeight(38.0);
        vsComputerBtn.setPrefWidth(157.0);
        vsComputerBtn.setStyle("-fx-background-color: #ffffff;");
        vsComputerBtn.setText("VS Computer");
        vsComputerBtn.setFont(new Font("Bauhaus 93", 19.0));

        vsComputerBtn.setEffect(dropShadow);

        menuTxt.setFill(javafx.scene.paint.Color.WHITE);
        menuTxt.setLayoutX(58.0);
        menuTxt.setLayoutY(130.0);
        menuTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        menuTxt.setStrokeWidth(0.0);
        menuTxt.setText("Menu");
        menuTxt.setFont(new Font("Bauhaus 93", 96.0));

        menuTxt.setEffect(glow0);

        backBtn.setLayoutX(101.0);
        backBtn.setLayoutY(540.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setPrefHeight(37.0);
        backBtn.setPrefWidth(126.0);
        backBtn.setStyle("-fx-background-color: #ffffff;");
        backBtn.setText("Back");
        backBtn.setFont(new Font("Bauhaus 93", 19.0));

        backBtn.setEffect(dropShadow0);

        vsPersonBtn.setLayoutX(101.0);
        vsPersonBtn.setLayoutY(340.0);
        vsPersonBtn.setMnemonicParsing(false);
        vsPersonBtn.setPrefHeight(37.0);
        vsPersonBtn.setPrefWidth(126.0);
        vsPersonBtn.setStyle("-fx-background-color: #ffffff;");
        vsPersonBtn.setText("VS PerSon");
        vsPersonBtn.setFont(new Font("Bauhaus 93", 19.0));

        vsPersonBtn.setEffect(dropShadow1);

        recordsBtn.setLayoutX(101.0);
        recordsBtn.setLayoutY(440.0);
        recordsBtn.setMnemonicParsing(false);
        recordsBtn.setPrefHeight(37.0);
        recordsBtn.setPrefWidth(126.0);
        recordsBtn.setStyle("-fx-background-color: #ffffff;");
        recordsBtn.setText("RecordS");
        recordsBtn.setFont(new Font("Bauhaus 93", 19.0));

        recordsBtn.setEffect(dropShadow2);
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        anchorPane0.setEffect(glow1);

        xTxt.setLayoutX(223.0);
        xTxt.setLayoutY(138.0);
        xTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        xTxt.setStrokeWidth(0.0);
        xTxt.setText("X");
        xTxt.setFont(new Font("Bauhaus 93", 90.0));

        xTxt.setEffect(glow2);

        oTxt.setLayoutX(381.0);
        oTxt.setLayoutY(230.0);
        oTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        oTxt.setStrokeWidth(0.0);
        oTxt.setText("O");
        oTxt.setFont(new Font("Bauhaus 93", 90.0));

        oTxt.setEffect(glow3);

        toeTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        toeTxt.setLayoutX(314.0);
        toeTxt.setLayoutY(107.0);
        toeTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        toeTxt.setStrokeWidth(0.0);
        toeTxt.setText("T   O   E");
        toeTxt.setFont(new Font("Bauhaus 93", 50.0));

        aTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        aTxt.setLayoutX(311.0);
        aTxt.setLayoutY(163.0);
        aTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        aTxt.setStrokeWidth(0.0);
        aTxt.setText("A");
        aTxt.setFont(new Font("Bauhaus 93", 50.0));

        ticTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        ticTxt.setLayoutX(188.0);
        ticTxt.setLayoutY(224.0);
        ticTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticTxt.setStrokeWidth(0.0);
        ticTxt.setText("T   I   C");
        ticTxt.setFont(new Font("Bauhaus 93", 50.0));

        xoImg.setFitHeight(350.0);
        xoImg.setFitWidth(350.0);
        xoImg.setLayoutX(163.0);
        xoImg.setLayoutY(277.0);
        xoImg.setPickOnBounds(true);
        xoImg.setPreserveRatio(true);
        xoImg.setImage(new Image(getClass().getResource("images/game.png").toExternalForm()));

        soundToggleBtn.setLayoutX(519.0);
        soundToggleBtn.setLayoutY(656.0);
        soundToggleBtn.setMnemonicParsing(false);
        soundToggleBtn.setPrefHeight(42.0);
        soundToggleBtn.setPrefWidth(130.0);
        soundToggleBtn.setText("On / Off");

        soundToggleBtn.setEffect(dropShadow3);
        soundToggleBtn.setFont(new Font("Bauhaus 93", 19.0));

        soundTxt.setLayoutX(410.0);
        soundTxt.setLayoutY(692.0);
        soundTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        soundTxt.setStrokeWidth(0.0);
        soundTxt.setText("Sound");
        soundTxt.setFont(new Font("Bauhaus 93", 30.0));
        setCenter(anchorPane0);

        anchorPane.getChildren().add(vsComputerBtn);
        anchorPane.getChildren().add(menuTxt);
        anchorPane.getChildren().add(backBtn);
        anchorPane.getChildren().add(vsPersonBtn);
        anchorPane.getChildren().add(recordsBtn);
        anchorPane0.getChildren().add(xTxt);
        anchorPane0.getChildren().add(oTxt);
        anchorPane0.getChildren().add(toeTxt);
        anchorPane0.getChildren().add(aTxt);
        anchorPane0.getChildren().add(ticTxt);
        anchorPane0.getChildren().add(xoImg);
        anchorPane0.getChildren().add(soundToggleBtn);
        anchorPane0.getChildren().add(soundTxt);
        
        
        
        vsComputerBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ComputerLevelPage root = new ComputerLevelPage(parentStage);
                Scene scene = new Scene(root);
                parentStage.setScene(scene);
            }
        });
        
        vsPersonBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlayerGameBoard root = new PlayerGameBoard(parentStage);
                Scene scene = new Scene(root);
                parentStage.setScene(scene);
            }
        });
        
        
        recordsBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RecordsLoadPage root = new RecordsLoadPage(parentStage);
                Scene scene = new Scene(root);
                parentStage.setScene(scene);
            }
        });
        
        
        backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                WelcomPage root = new WelcomPage(parentStage);
                Scene scene = new Scene(root);
                parentStage.setScene(scene);
            }
        });
        
        

    }
}
