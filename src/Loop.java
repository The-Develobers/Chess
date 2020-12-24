import javax.swing.*;
import java.awt.*;
import java.awt.event.*;;

public class Loop extends MouseAdapter implements MouseMotionListener {
    int mx,my;
    boolean md;
    Display deeply = new Display(9);
    board b = new board();
    Pawn pawn[] = new Pawn[16];
    Horse horse[] = new Horse[4];
    Rock rock[] = new Rock[4];
    Bishop bishop[] = new Bishop[4];
    Queen queen[] = new Queen[2];
    King king[] = new King[2];
    int pwn_cnt = 0, hrs_cnt = 0, rck_cnt = 0, bshp_cnt = 0, qn_cnt = 0, kng_cnt = 0;
    Point p1=new Point(20,20);
    Point p2 = new Point(20,20);Point p3 = new Point(20,20);

    boolean player=true;
    boolean player2=false;
    Point Mouse=new Point();

    public Loop() {

        for (int i = 0; i < 8; i++) {
            for (int g = 0; g < 8; g++) {
                if (b.arr[i][g] == 1 || b.arr[i][g] == -1) {
                    pawn[pwn_cnt] = new Pawn(b.arr[i][g], g, i);
                    deeply.add(pawn[pwn_cnt++].Pawn_l);
                } else if (b.arr[i][g] == 3 || b.arr[i][g] == -3) {
                    horse[hrs_cnt] = new Horse(b.arr[i][g], g, i);
                    deeply.add(horse[hrs_cnt++].horse_l);
                } else if (b.arr[i][g] == 2 || b.arr[i][g] == -2) {
                    rock[rck_cnt] = new Rock(b.arr[i][g], g, i);
                    deeply.add(rock[rck_cnt++].rock_l);
                } else if (b.arr[i][g] == 4 || b.arr[i][g] == -4) {
                    bishop[bshp_cnt] = new Bishop(b.arr[i][g], g, i);
                    deeply.add(bishop[bshp_cnt++].bishop_l);
                } else if (b.arr[i][g] == 5 || b.arr[i][g] == -5) {
                    queen[qn_cnt] = new Queen(b.arr[i][g], g, i);
                    deeply.add(queen[qn_cnt++].queen_l);
                } else if (b.arr[i][g] == 6 || b.arr[i][g] == -6) {
                    king[kng_cnt] = new King(b.arr[i][g], g, i);
                    deeply.add(king[kng_cnt++].king_l);
                }
            }
        }
        deeply.setSize(612, 650);
        //deeply.addMouseMotionListener(this);

        Gameloop();
    }

    public void mousePressed (MouseEvent e )
    {
        Mouse.x=e.getX();
        Mouse.y=e.getY();
        System.out.println("x = "+Mouse.x+" "+"y = "+Mouse.y);
        System.out.println("x = "+((Mouse.x-55)/63)+" "+ "y ="+((Mouse.y-84)/63));
    }

    public void Gameloop() {
        deeply.addMouseListener(this);
        while (true) {
            pawn[1].setPosition(Mouse);


        }
    }
}






