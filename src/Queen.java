import javax.swing.*;

public class Queen {
    String Color=new String();
    ImageIcon queen=new ImageIcon(getClass().getResource("\\Pieces\\B_queen.png"));
    JLabel queen_l=new JLabel(queen);
    board Board=new board();
    public Queen(int type,int x,int y) {
        if(type==5){
            this.Color="\\Pieces\\W_queen.png";
        }
        else if(type==-5){
            this.Color="\\Pieces\\B_queen.png";
        }
        queen_l.setBounds(Board.Draw[x][y].x, Board.Draw[x][y].y, 63, 63);
    }
}
