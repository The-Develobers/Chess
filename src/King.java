import javax.swing.*;

public class King {
    String Color=new String();
    ImageIcon king=new ImageIcon(getClass().getResource("\\Pieces\\B_King.png"));
    JLabel king_l=new JLabel(king);
    board Board=new board();
    public King(int type,int x,int y) {
        if(type==6){
            this.Color="\\Pieces\\W_King.png";
        }
        else if(type==-6){
            this.Color="\\Pieces\\B_King.png";
        }
        king_l.setBounds(Board.Draw[x][y].x, Board.Draw[x][y].y, 63, 63);;
    }
}
