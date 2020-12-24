import javax.swing.*;

public class Rock {
    String Color=new String();
    ImageIcon rock=new ImageIcon(getClass().getResource("\\Pieces\\B_rock.png"));
    JLabel rock_l=new JLabel(rock);
    board Board=new board();
    public Rock(int type,int x,int y) {
        if(type==2){
            this.Color="\\Pieces\\W_rock.png";
        }
        else if(type==-2){
            this.Color="\\Pieces\\B_rock.png";
        }
        rock_l.setBounds(Board.Draw[x][y].x, Board.Draw[x][y].y, 63, 63);
    }
}
