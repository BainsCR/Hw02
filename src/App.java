import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeFrame;
import cs331Helper.cs331TicTacToeGame;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

    public void start(Stage stage){

        cs331TicTacToeFrame frame = new cs331TicTacToeFrame(stage);
        
        myTicTacToe g1 = new myTicTacToe();
     
        // Add the game here to the frame
        frame.addGame(g1);
        
        
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
