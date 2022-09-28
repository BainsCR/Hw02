import cs331Helper.cs331TicTacToePlayer;
import cs331Helper.cs331TicTacToeBoard;

public class Players implements cs331TicTacToePlayer{

    
    
    private static int sumTrack = 1;
    private String playerIcon;
    cs331TicTacToeBoard myBoard = new cs331TicTacToeBoard();

    public Players(){
        if(sumTrack%2 == 0){
            playerIcon = "O";
        }
        else{
            playerIcon = "X";
        }
        sumTrack = sumTrack + 1;
        System.out.println("My icon is: " + playerIcon);
        //myBoard.squareAt(0, 0);

    }

    @Override
    public void selectSquare(int row, int col) {
        if(sumTrack%2 == 1){
            myBoard.squareAt(row, col).markSquare("X");
            
        }
        else{
            myBoard.squareAt(row, col).markSquare("O");
        }
        sumTrack = sumTrack + 1;
        
        
        
    }
    
}
