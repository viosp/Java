package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckBox;
    @FXML
    private Label ourLabel;

    @FXML
    public void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);

    }
    @FXML
    public void onButtonClicked(ActionEvent e) {
        if(e.getSource().equals(helloButton)) {
            System.out.println("Hello, " +nameField.getText());
        } else if(e.getSource().equals(byeButton)) {
            System.out.println("Bye, " +nameField.getText());
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try{
                    String s= Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                    System.out.println("Im going to sleep on this: " +s);
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s= Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                            System.out.println("Im updating the label on the : " +s);
                            ourLabel.setText("we did something");
                        }
                    });

                } catch(InterruptedException event) {
                    //we dont care about this
                }
            }
        };

        new Thread(task).start();


        if(ourCheckBox.isSelected()) {
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }

    @FXML
    public void handleKyReleased(){
        String text = nameField.getText();
        boolean disabledButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disabledButtons);
        byeButton.setDisable(disabledButtons);
    }

    public void handleChange(){
        System.out.println("The checkbox is " +(ourCheckBox.isSelected() ? "checked" : "not checked"));
    }

}
