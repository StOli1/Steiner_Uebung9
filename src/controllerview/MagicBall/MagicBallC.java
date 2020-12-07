package controllerview.MagicBall;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MagicBallC implements Initializable {

    @FXML
    private TextField txtAnswer;
    @FXML
    private TextField txtQuestion;

    private String myData = "";

    public static void show(Stage stage, String greeting) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MagicBallC.class.getResource("main.fxml"));
            Parent root = fxmlLoader.load();

            //send data to MainController
            MagicBallC ctrl = fxmlLoader.getController();
            ctrl.setMyData(greeting);


            stage.setTitle("Second");
            stage.setScene(new Scene(root, 350, 400));
            stage.show();
        }
        catch(Exception e)
        {
            System.err.println("Something wrong with secondV.fxml: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }

    public void setMyData(String myData) {
        this.myData = myData;
        System.out.println("(MainController) Data received: " + this.myData);
    }

    public void getRandomAnswer(){
        MagicBallAnswers magicBallAnswers = new MagicBallAnswers();
        ArrayList<String> Answers = new ArrayList<String>();

        Answers.addAll(magicBallAnswers.goodAnswers);
        Answers.addAll(magicBallAnswers.neutralAnswers);
        Answers.addAll(magicBallAnswers.badAnswers);

        int random = magicBallAnswers.randomNumber();
        int goodRandom = magicBallAnswers.randomGoodNumber();

        if (txtQuestion.getText().contains("?")){
            txtAnswer.setText(Answers.get(random));
        }
        else if(txtQuestion.getText().contains("SEW")){
            txtAnswer.setText(magicBallAnswers.goodAnswers.get(goodRandom));
        }
        else {
            System.err.println("Something went wrong!");
        }


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
