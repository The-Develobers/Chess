import javax.swing.*;

public class Horse {
    String Color=new String();
    ImageIcon horse=new ImageIcon(getClass().getResource("\\Pieces\\B_horse.png"));
    JLabel horse_l=new JLabel(horse);
    board Board=new board();
    public Horse(int type,int x,int y) {
        if(type==3){
            this.Color="\\Pieces\\W_horse.png";
        }
        else if(type==-3){
            this.Color="\\Pieces\\B_horse.png";
        }
        horse_l.setBounds(Board.Draw[x][y].x, Board.Draw[x][y].y, 63, 63);
    }
}
