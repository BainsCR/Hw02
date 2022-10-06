//import cs331Helper.cs331TicTacToeGame;
import cs331Helper.*;
import javafx.scene.paint.Color;
 
public class myTicTacToe implements cs331TicTacToeGame{

    cs331TicTacToeController c1 = new cs331TicTacToeController();
    public cs331TicTacToeBoard b1 = new cs331TicTacToeBoard();
    //private int turnCounter = 1;
    Players p1 = new Players(b1,c1,"X");
    Players p2 = new Players(b1,c1,"O");
    Color c = Color.YELLOWGREEN;
    Color taken = Color.KHAKI;
    

    public myTicTacToe(){
        
        c1.addPlayer(p1);
        c1.addPlayer(p2);
        c1.setControllerMessage("Select a square to start playing!");

    }

    

    

    @Override
    public void invalidSquareChosen(int row, int col) {
        System.out.println("Invalid square chosen");
        c1.setControllerMessage("Square has already been taken. Try again");
        b1.squareAt(row, col).flashColor(taken);
    }

    @Override
    public void noWinner() {
        System.out.println("Its a Tie!");
        c1.setControllerMessage("Uh-Oh. Its a Tie");

        
    }

    @Override
    public void playerWins() {
        System.out.println("We have a winner!");
        if(c1.getWinningPlayer()==p1){
            c1.setControllerMessage("Player X has won!");
        }
        else if(c1.getWinningPlayer() == p2){
            c1.setControllerMessage("Player O has won!");
        }
        b1.highlightWinningSquares(c);   
    }

    @Override
    public void restartGame() {
        b1.clearSymbols();
        b1.clearHighlights();
        c1.playAgain();
        c1.setControllerMessage("Select a square to start playing!");
    }

}