package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Expression;
import java.io.*;
import java.time.LocalTime;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.swing.*;


public class Controller {

    public Button textbutton;
    public Button textbutton1;
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

    @FXML
    TextField textFieldReview;

    @FXML
    TextField textFieldReview1;

    @FXML
    TextArea textAreaStuff;

    @FXML
    TextArea textAreaStuff1;

    @FXML
    TextField insertttile;

    @FXML
    TextField insertttile1;

    @FXML
    TextArea textLotto;

    @FXML
    TextField textFieldLotto;

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



    public void dice() throws IOException, InterruptedException {
        imageView.setVisible(true);
        Random rand = new Random();
        int roll = rand.nextInt((6 - 1) + 1) + 1;

        textArea.setText("");

        textArea.appendText(String.valueOf(roll));
        textArea.setText(String.valueOf(roll));
        new Thread(() -> {

            switch (roll) {

                case 1 -> {
                    tryCatch("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/inverted-dice-1.png");
                }

                case 2 -> {
                    tryCatch("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/inverted-dice-2.png");

                }
                case 3 -> {
                    tryCatch("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/inverted-dice-3.png");


                }
                case 4 -> {
                    tryCatch("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/inverted-dice-4.png");
                }
                case 5 -> {
                    tryCatch("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/inverted-dice-5.png");

                }
                case 6 -> {
                    tryCatch("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/inverted-dice-6.png");
                }
                default -> {
                }
            }
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Platform.runLater(() -> {
                    try {
                        FileInputStream inputstreamtwo = new FileInputStream("C:/Users/NoOne/IdeaProjects/GUI_miniprojekt/src/sample/dicegif.gif");
                        Image diceImgtwo = new Image(inputstreamtwo);
                        imageView.setImage(diceImgtwo);
                        inputstreamtwo.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                });
        }).start();

        action = 6;
    }

    private void tryCatch(String path) {
        try {
            FileInputStream inputstreamtwo = new FileInputStream(path);
            Image diceImgtwo = new Image(inputstreamtwo);
            imageView.setImage(diceImgtwo);
            inputstreamtwo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logs() {
        boolean result;

        try {

            File file = new File(insertttile.getText() + ".txt");
            result = file.createNewFile();
            if (result) {
                textFieldReview.appendText("File created - shutting down" + file.getCanonicalPath());
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter outStream = new BufferedWriter(fileWriter);
                outStream.append(textAreaStuff.getText());
                outStream.close();
                fileWriter.close();
                System.exit(1);
            }
            else {
                textFieldReview.appendText("File existing at " + file.getCanonicalPath());
            }

        } catch (IOException e) {
            System.out.println("Error");
        }

    }
    public void logsLommeregner() {
        boolean result;

        try {

            File file = new File(insertttile1.getText() + ".txt");
            result = file.createNewFile();
            if (result) {
                textFieldReview1.appendText("File created - shutting down" + file.getCanonicalPath());
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter outStream = new BufferedWriter(fileWriter);
                outStream.append(textAreaStuff1.getText());
                outStream.close();
                fileWriter.close();
                System.exit(1);
            }
            else {
                textFieldReview1.appendText("File existing at " + file.getCanonicalPath());
            }

        } catch (IOException e) {
            System.out.println("Error");
        }

    }

    public void Lotto() {

        int[] numbers = new int[45];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int newnumber = random.nextInt((90 - 1) + 1) + 1;

            for (int n = 0; n < numbers.length; n++) {

                if (newnumber == numbers[n]) {

                    while (newnumber == numbers[n]) {

                        newnumber = random.nextInt((90 - 1) + 1) + 1;
                        n = 0;

                    }

                }

            }

            numbers[i] = newnumber;
            System.out.println(newnumber);

        }
        if (textLotto.getText() == null || textLotto.getText().trim().isEmpty()) {
            errorMessage.setStyle("-fx-opacity: 1");
            textLotto.appendText("This is empty - fill a value in it");

        } else {
        for (int i = 0; i < numbers.length; i++) {

                Scanner scanner = new Scanner(textLotto.getText());

                while (scanner.hasNextLine()) {
                    String currentInt = scanner.nextLine();
                    if (Integer.parseInt(currentInt) == numbers[i]) {

                        textFieldLotto.clear();
                        // textLotto.appendText(String.valueOf(currentNumber));
                        textFieldLotto.appendText("It worked");
                        return;
                    } else {
                        textFieldLotto.clear();
                        // textLotto.appendText(String.valueOf(currentNumber));
                        textFieldLotto.appendText("It didnt work");
                    }

                }

            }
        }


    }

}
