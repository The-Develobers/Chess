import java.awt.*;

public class board {
    Point center [][]=new Point[8][8];
    Point Draw [][]=new Point[8][8];
    int arr[][] = {{2,3,4,5,6,4,3,2},
            {1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {-1,-1,-1,-1,-1,-1,-1,-1},
            {-2,-3,-4,-5,-6,-4,-3,-2}};
    public board() {
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                Draw[i][j]=new Point(46+((i)*63),46+((j)*63));
            }
        }
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                center[i][j]=new Point(77+((i)*63),77+((j)*63));
            }
        }
    }
}
