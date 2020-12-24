import javax.swing.*;
import java.awt.*;
import java.awt.peer.CanvasPeer;

public class Pawn {
    String Color=new String();
    ImageIcon Pawn=new ImageIcon(getClass().getResource("\\Pieces\\W_Pawn.png"));
    JLabel Pawn_l=new JLabel(Pawn);
    board Board=new board();
    public Pawn(int type,int x,int y) {

        if(type==1){

           this.Color="\\Pieces\\W_Pawn.png";
        }
        else if(type==-1){
            this.Color="\\Pieces\\B_Pawn.png";

        }
       Pawn_l.setBounds(Board.Draw[x][y].x, Board.Draw[x][y].y, 63, 63);
    }
    public void setPosition (Point p)
    {
        Pawn_l.setBounds(p.x,p.y, 63, 63);
    }
}
