import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToePlayer;
import cs331Helper.cs331TicTacToeSquare;
import cs331Helper.cs331TicTacToeController;


public class Players implements cs331TicTacToePlayer{

    private String playerIcon;
    cs331TicTacToeBoard playerBoard;
    cs331TicTacToeController playerController;

    public Players(){ //Default constructor

    }

    public Players(cs331TicTacToeBoard b, cs331TicTacToeController c, String playerIcon){   
        this.playerIcon = playerIcon;
        System.out.println("My player icon is: " + playerIcon);
        playerBoard = b;
        playerController = c;
    }

    public String getPlayerIcon(){
        return playerIcon;
    }

    @Override
    public void selectSquare(int row, int col) {  
        System.out.println("Player: selected square " + row + " " + col + " with icon: " + playerIcon);
        playerBoard.squareAt(row, col).markSquare(playerIcon);
        playerController.setControllerMessage("Player " + playerIcon + " has finished their turn");
        playerController.finishedTurn();
        

    }
    
}
