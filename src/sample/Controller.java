package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

import java.beans.Expression;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;
import java.util.Random;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.concurrent.TimeUnit;

import javax.management.timer.Timer;


public class Controller {

    // koble fxml til java
    @FXML
    TextField textField1;
    public TextField valueA;
    public TextField valueB;
    public Label errorMessage;

    @FXML
    ImageView imageView;

    @FXML
    TextArea textArea;

    int action = 1;

    public void calculator() {
        if (valueA.getText() == null || valueA.getText().trim().isEmpty() || valueB.getText() == null || valueB.getText().trim().isEmpty()) {
            errorMessage.setStyle("-fx-opacity: 1");
        } else {
            errorMessage.setStyle("-fx-opacity: 0");

            double number1 = Double.parseDouble(valueA.getText());
            double number2 = Double.parseDouble(valueB.getText());

            double sum = number1 + number2;
            int intSum = (int) sum;

            if (sum > intSum) {
                textField1.clear();
                System.out.println("Calculating...");
                textField1.appendText(String.valueOf(sum));
                action = 1;
            } else {
                textField1.clear();
                System.out.println("Calculating...");
                textField1.appendText(String.valueOf((int) sum));
                action = 1;
            }

        }
    }

    public void calculatorSubtraction() {
        if (valueA.getText() == null || valueA.getText().trim().isEmpty() || valueB.getText() == null || valueB.getText().trim().isEmpty()) {
            errorMessage.setStyle("-fx-opacity: 1");
        } else {
            errorMessage.setStyle("-fx-opacity: 0");

            double number1 = Double.parseDouble(valueA.getText());
            double number2 = Double.parseDouble(valueB.getText());

            double sumtwo = (int) (number1 - number2);
            int intSum = (int) sumtwo;

            if (sumtwo < intSum) {
                textField1.clear();
                System.out.println("Calculating...");
                textField1.appendText(String.valueOf(sumtwo));
                action = 2;
            } else {
                textField1.clear();
                System.out.println("Calculating...");
                textField1.appendText(String.valueOf((int) sumtwo));
                action = 2;
            }
        }
    }

    public void calculatorDivision() {
        if (valueA.getText() == null || valueA.getText().trim().isEmpty() || valueB.getText() == null || valueB.getText().trim().isEmpty()) {
            errorMessage.setStyle("-fx-opacity: 1");
        } else {
            errorMessage.setStyle("-fx-opacity: 0");

            double number1 = Double.parseDouble(valueA.getText());
            double number2 = Double.parseDouble(valueB.getText());

            double sumthree = (int) (number1 / number2);
            int intSum = (int) sumthree;

            if (sumthree < intSum) {
                textField1.clear();
                System.out.println("Calculating...");
                textField1.appendText(String.valueOf(sumthree));
                action = 3;
            } else {
                textField1.clear();
                System.out.println("Calculating...");
                textField1.appendText(String.valueOf((int) sumthree));
                action = 3;
            }

        }
    }

    public void calculatorMultiplication() {
        if (valueA.getText() == null || valueA.getText().trim().isEmpty() || valueB.getText() == null || valueB.getText().trim().isEmpty()) {
            errorMessage.setStyle("-fx-opacity: 1");
        } else {
            errorMessage.setStyle("-fx-opacity: 0");

            double number1 = Double.parseDouble(valueA.getText());
            double number2 = Double.parseDouble(valueB.getText());

            double sumfour = (int) (number1 * number2);
            int intSum = (int) sumfour;

            if (sumfour > intSum) {
                textField1.clear();
                System.out.println("Calculating...");
                textField1.appendText(String.valueOf(sumfour));
                action = 4;
            } else {
                textField1.clear();
                System.out.println("Calculating...");
                textField1.appendText(String.valueOf((int) sumfour));
                action = 4;
            }

        }
    }

    public void date() {
        Date date = new Date();

    }

    public void dice() throws IOException, InterruptedException {
        imageView.setVisible(true);
        Random rand = new Random();
        int roll = rand.nextInt((6 - 1) + 1) + 1;
        textArea.setText("");

        textArea.appendText(String.valueOf(roll));
        textArea.setText(String.valueOf(roll));
        switch (roll) {

            case 1 -> {
                FileInputStream inputstream = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/inverted-dice-1.png");
                Image diceImg = new Image(inputstream);
                imageView.setImage(diceImg);
                inputstream.close();

                FileInputStream inputstreamtwo = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/dicegif.gif");
                Image diceImgtwo = new Image(inputstreamtwo);
                imageView.setImage(diceImgtwo);
                inputstreamtwo.close();
            }

            case 2 -> {
                FileInputStream inputstream = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/inverted-dice-2.png");
                Image diceImg = new Image(inputstream);
                imageView.setImage(diceImg);
                inputstream.close();

                FileInputStream inputstreamtwo = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/dicegif.gif");
                Image diceImgtwo = new Image(inputstreamtwo);
                imageView.setImage(diceImgtwo);
                inputstreamtwo.close();

            }
            case 3 -> {
                FileInputStream inputstream = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/inverted-dice-3.png");
                Image diceImg = new Image(inputstream);
                imageView.setImage(diceImg);
                inputstream.close();

                FileInputStream inputstreamtwo = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/dicegif.gif");
                Image diceImgtwo = new Image(inputstreamtwo);
                imageView.setImage(diceImgtwo);
                inputstreamtwo.close();

            }
            case 4 -> {
                FileInputStream inputstream = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/inverted-dice-4.png");
                Image diceImg = new Image(inputstream);
                imageView.setImage(diceImg);
                inputstream.close();

                FileInputStream inputstreamtwo = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/dicegif.gif");
                Image diceImgtwo = new Image(inputstreamtwo);
                imageView.setImage(diceImgtwo);
                inputstreamtwo.close();
            }
            case 5 -> {
                FileInputStream inputstream = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/inverted-dice-5.png");
                Image diceImg = new Image(inputstream);
                imageView.setImage(diceImg);
                inputstream.close();

                FileInputStream inputstreamtwo = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/dicegif.gif");
                Image diceImgtwo = new Image(inputstreamtwo);
                imageView.setImage(diceImgtwo);
                inputstreamtwo.close();

            }
            case 6 -> {
                FileInputStream inputstream = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/inverted-dice-6.png");
                Image diceImg = new Image(inputstream);
                imageView.setImage(diceImg);
                inputstream.close();

                FileInputStream inputstreamtwo = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/dicegif.gif");
                Image diceImgtwo = new Image(inputstreamtwo);
                imageView.setImage(diceImgtwo);
                inputstreamtwo.close();


            }
            default -> {
                Thread.sleep(1000);
                FileInputStream inputstreamtwo = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/dicegif.gif");
                Image diceImgtwo = new Image(inputstreamtwo);
                imageView.setImage(diceImgtwo);
                inputstreamtwo.close();
            }

        }
        /*
        FileInputStream inputstreamtwo = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/dicegif.gif");
        Image diceImgtwo = new Image(inputstreamtwo);
        imageView.setImage(diceImgtwo);
        inputstreamtwo.close();
        */
        // Meddelse til Andras - i literally CANT get this to work the way i want to.
        // Once I press "Roll the Dice" - I want it to show the dice that the value landed on (works) - but after
        // two seconds (Wanted to use thread.sleep), the imageView will return to its original gif (where it constantly
        // changes between dice 1-3) halp plz.

        // Okay, so this is NOT WORKING
        action = 6;
    }

    public void Spin() throws IOException, InterruptedException {
        imageView.setVisible(true);

        FileInputStream inputstreamtwo = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/dicegif.gif");
        Image diceImgtwo = new Image(inputstreamtwo);
        imageView.setImage(diceImgtwo);
        inputstreamtwo.close();
    }

}
