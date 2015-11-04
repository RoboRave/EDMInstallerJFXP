/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edminstallerjfxp;

import java.io.File;
import javafx.scene.text.Font;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.DialogPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Zach
 */
public class EDMInstallerJFXP extends Application {
    
    @Override
    public void start(Stage layout) {
        Install = new Button();
        Install.setFont(new Font("Microsoft Sans Serif", 12));
        Install.setText("Install");
        Install.setLayoutX(20);
        Install.setLayoutY(100);
        Install.setPrefSize(75,20);
        Install.setOnAction(this::InstallButtonActionPerformed);
        
        FindPath = new Button();
        FindPath.setFont(new Font("Microsoft Sans Serif", 12));
        FindPath.setText("...");
        FindPath.setLayoutX(270);
        FindPath.setLayoutY(25);
        FindPath.setPrefSize(25,20);
        FindPath.setOnAction(this::FindButtonActionPerformed);
        
        InstallPath = new TextField();
        InstallPath.setFont(new Font("Microsoft Sans Serif", 12));
        InstallPath.setText("Find Path");
        InstallPath.setEditable(false);
        InstallPath.setLayoutX(20);
        InstallPath.setLayoutY(25);
        InstallPath.setPrefSize(240,20);
        
        EDMCheck = new CheckBox();
        EDMCheck.setFont(new Font("Microsoft Sans Serif", 12));
        EDMCheck.setText("Extra Diamonds Mod Version 4.1.0");
        EDMCheck.setLayoutX(20);
        EDMCheck.setLayoutY(70);
        EDMCheck.setPrefSize(220,20);
        EDMCheck.setOnAction(this::EDMCheckBoxActionPerformed);
        
        ForgeCheck = new CheckBox();
        ForgeCheck.setFont(new Font("Microsoft Sans Serif", 12));
        ForgeCheck.setText("MinecraftForge Version 1291");
        ForgeCheck.setLayoutX(20);
        ForgeCheck.setLayoutY(50);
        ForgeCheck.setPrefSize(180,20);
        ForgeCheck.setOnAction(this::ForgeCheckBoxActionPerformed);
        
        //(new File(System.getenv("appdata") + "/.minecraft"));
        FinderDialog = new DialogPane();
        
        FinderChooser = new FileChooser();
        FinderChooser.setTitle("test");
        FinderChooser.setInitialDirectory(new File(System.getenv("appdata") + "/.minecraft"));
        /* 
        Main Pane
        */
        AnchorPane MainPane = new AnchorPane();
        MainPane.getChildren().add(Install);
        MainPane.getChildren().add(FindPath);
        MainPane.getChildren().add(EDMCheck);
        MainPane.getChildren().add(ForgeCheck);
        MainPane.getChildren().add(InstallPath);
        /* 
        End of Main Pane
        */
        //FinderDialog.getChildren().add(FinderChooser);
        /*
        Main Layout of Program
        */
        Window = new Scene(MainPane, 300, 150);
        layout.setTitle("EDM Installer - JavaFX");
        layout.setResizable(false);
        layout.setScene(Window); 
        layout.show();
        /*
        End Main Layout of Program
        */
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
    }
    
    public void InstallButtonActionPerformed(ActionEvent evt)
    {
        System.out.println("hi");
    }
    public void FindButtonActionPerformed(ActionEvent evt)
    {
        System.out.println("his mom");
        FinderDialog.setVisible(true);
    }
    public void EDMCheckBoxActionPerformed(ActionEvent evt){
        System.out.println("hello");
    }
    public void ForgeCheckBoxActionPerformed(ActionEvent evt){
        System.out.println("bye");
    }
    public Button Install;
    public Button FindPath;
    public CheckBox EDMCheck;
    public CheckBox ForgeCheck;
    public TextField InstallPath;
    public DialogPane FinderDialog;
    public FileChooser FinderChooser;
    public static Scene Window;
}
