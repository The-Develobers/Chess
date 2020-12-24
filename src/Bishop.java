import javax.swing.*;

public class Bishop {
    String Color=new String();
    ImageIcon bishop=new ImageIcon(getClass().getResource("\\Pieces\\B_Bishop.png"));
    JLabel bishop_l=new JLabel(bishop);
    board Board=new board();
    public Bishop(int type,int x,int y) {
        if(type==4){
            this.Color="\\Pieces\\W_Bishop.png";
        }
        else if(type==-4){
            this.Color="\\Pieces\\B_Bishop.png";
        }
        bishop_l.setBounds(Board.Draw[x][y].x, Board.Draw[x][y].y, 63, 63);
    }
}
