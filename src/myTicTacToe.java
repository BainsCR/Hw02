import cs331Helper.cs331TicTacToeGame;
import cs331Helper.*;


public class myTicTacToe implements cs331TicTacToeGame{

    public myTicTacToe(){
        //Empty no args constructor
        cs331TicTacToeBoard b1 = new cs331TicTacToeBoard();
        cs331TicTacToeController c1 = new cs331TicTacToeController();
        c1.setControllerMessage("Select a square to start playing");
        Players p1 = new Players();
        Players p2 = new Players();
        c1.addPlayer(p1);
        c1.addPlayer(p2);
    }

    @Override
    public void invalidSquareChosen(int arg0, int arg1) {
        
        
    }

    @Override
    public void noWinner() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void playerWins() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void restartGame() {
        // TODO Auto-generated method stub
        
    }

}