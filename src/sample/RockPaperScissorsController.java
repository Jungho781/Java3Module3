package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class RockPaperScissorsController {

    private static final String ROCK="rock";
    private static final String PAPER="paper";
    private static final String SCISSORS="scissors";
    private String string;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private Button rockButton;

    @FXML
    private Button paperButton;

    @FXML
    private Button scissorsButton;

    @FXML
    private Label playerLabel;

    @FXML
    private Label playerScore;

    @FXML
    private Label computerScore;

    @FXML
    private Label computerLabel;

    @FXML
    private TextArea playerThrow;

    @FXML
    private Label results;

    @FXML
    private TextArea computerThrow;

    @FXML
    private void playerTurn(ActionEvent event){
        String playerChoice=null;

//        switch (((Button)event.getSource()).getId()){
//            case "rockButton":
//                string=new String("Rock");
//                playerChoice=ROCK;
//                break;
//            case "paperButton":
//                string=new String("Paper");
//                playerChoice=PAPER;
//                break;
//            case "scissorsButton":
//                string=new String("Scissors");
//                playerChoice=SCISSORS;
//                break;
//        }
        if(event.getSource()==paperButton){
            string=new String("Paper");
            playerChoice=PAPER;

        }
        else if(event.getSource()==rockButton){
            string=new String("Rock");
            playerChoice=ROCK;

        }
        else if(event.getSource()==scissorsButton){
            string=new String("Scissors");
            playerChoice=SCISSORS;

        }
        playerThrow.setText(string);

        winner(playerChoice,computerTurn());

    }
    private String computerTurn(){
        String computerChoice=null;
        int index=(int)(Math.random()*3);
        switch(index){
            case 0:
                string=new String("Rock");
                computerChoice=ROCK;
                break;
            case 1:
                string=new String("Paper");
                computerChoice=PAPER;
                break;
            case 2:
                string =new String("Scissors");
                computerChoice=SCISSORS;
                break;
        }
        computerThrow.setText(string);
        return computerChoice;

    }
    public void playerWin(){
        results.setText("Player Win");
        playerScore.setText(String.valueOf(Integer.parseInt(playerScore.getText())+1));
    }
    public void computerWin(){
        results.setText("Player Loss");
        computerScore.setText(String.valueOf(Integer.parseInt(computerScore.getText())+1));
    }
    public void tie(){
        results.setText("Tie");
    }
    private void winner(String playerChoice, String computerChoice){
        if(playerChoice.equals(computerChoice)){
            tie();
            return;
        }
        if(playerChoice.equals(ROCK)){
            if(computerChoice.equals(PAPER)){
                computerWin();
            }
            else if(computerChoice.equals(SCISSORS)){
                playerWin();
            }
        }
        else if(playerChoice.equals(PAPER)){
            if(computerChoice.equals(ROCK)){
                playerWin();
            }
            else if(computerChoice.equals(SCISSORS)){
                computerWin();
            }
        }
        else if (playerChoice.equals(SCISSORS)){
            if(computerChoice.equals(PAPER)){
                playerWin();
            }
            else if(computerChoice.equals(ROCK)){
                computerWin();
            }
        }
        else{
            if(computerChoice.equals(ROCK)){
                computerWin();
            }
            else if(computerChoice.equals(PAPER)){
                playerWin();
            }
        }

    }

}


