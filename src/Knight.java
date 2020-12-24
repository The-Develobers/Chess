import java.util.Scanner;
public class Knight {
    Scanner scanner=new Scanner(System.in);
    private final int[][] whitePieces =new int[8][8];

    /*Constructor*/
    public Knight(){
        zero();
        Pawn();
        Rock();
        knight();
        Bishop();
        King();
        Queen();
        display();

        KnightMove();
    }



    public void KnightMove(){
        int[] avaPlacesX =new int[8];
        int[] avaPlacesY =new int[8];

        boolean isMoved=true;

        int x=1;
        int y=0;
        int newX,newY;

        /*Initializing available places with -1*/
        for (int i=0;i<8;i++){
            avaPlacesX[i]=-1;
        }
        for (int i=0;i<8;i++){
            avaPlacesY[i]=-1;
        }
        while(true) {

            /*Available Places to go*/
            if (isMoved){
                /* (x+=2) OR (x-=2) && (y+=1) OR (y-=1) */
                if((x+2 <8) && (y+1 <8) && (whitePieces[x+2][y+1]==0)){
                    avaPlacesX[0]=x+2;
                    avaPlacesY[0]=y+1;
                    System.out.print("("+(x+2)+" , "+(y+1)+")"+" ");
                }
                if((x+2 <8) && (y-1>-1) && (whitePieces[x+2][y-1]==0)){
                    avaPlacesX[1]=x+2;
                    avaPlacesY[1]=y-1;
                    System.out.print("("+(x+2)+" , "+(y-1)+")"+" ");
                }
                if((x-2 >0) && (y+1<8) && (whitePieces[x-2][y+1]==0)){
                    avaPlacesX[2]=x-2;
                    avaPlacesY[2]=y+1;
                    System.out.print("("+(x-2)+" , "+(y+1)+")"+" ");
                }
                if((x-2 >-1) && (y-1>-1) && (whitePieces[x-2][y-1]==0)){
                    avaPlacesX[3]=x-2;
                    avaPlacesY[3]=y-1;
                    System.out.print("("+(x-2)+" , "+(y-1)+")"+" ");
                }

                /* (y+=2) OR (y-=2) && (x+=1) OR (x-=1) */
                if((y+2 <8) && (x+1 <8) && (whitePieces[x+1][y+2]==0)){
                    avaPlacesY[4]=y+2;
                    avaPlacesX[4]=x+1;
                    System.out.print("("+(x+1)+" , "+(y+2)+")"+" ");
                }
                if((y+2 <8) && (x-1>-1) && (whitePieces[x-1][y+2]==0)){
                    avaPlacesY[5]=y+2;
                    avaPlacesX[5]=x-1;
                    System.out.print("("+(x-1)+" , "+(y+2)+")"+" ");
                }
                if((y-2 >-1) && (x+1<8) && (whitePieces[x+1][y-2]==0)){
                    avaPlacesY[6]=y-2;
                    avaPlacesX[6]=x+1;
                    System.out.print("("+(x+1)+" , "+(y-2)+")"+" ");
                }
                if((y-2 >-1) && (x-1>-1) && (whitePieces[x-1][y-2]==0)){
                    avaPlacesY[7]=y-2;
                    avaPlacesX[7]=x-1;
                    System.out.print("("+(x-1)+" , "+(y-2)+")"+" ");
                }
            }

            System.out.println("\nPlease enter the values of x and y:");
            newX=scanner.nextInt();
            newY=scanner.nextInt();

            /*Check the values are in the array*/
            for (int i=0;i<8;i++){
                if (newX == avaPlacesX[i] && newY == avaPlacesY[i] && newX>-1 && newY>-1) {
                    whitePieces[x][y]=0;
                    whitePieces[newX][newY]=3;
                    display();
                    x=newX;
                    y=newY;
                    isMoved=true;

                    /*Initializing available places with -1*/
                    for (int k=0;k<8;k++){
                        avaPlacesX[k]=-1;
                    }
                    for (int k=0;k<8;k++){
                        avaPlacesY[k]=-1;
                    }
                    break;
                }
                else if(i==7){
                    System.out.print("Invalid position");
                    isMoved=false;
                }
            }

        }
    }


    /*Initializing all indices with 0*/
    public void zero(){
        for(int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                whitePieces[i][j]=0;
            }
        }
    }

    public void Pawn(){
        for (int i=0;i<8;i++){
            whitePieces[i][1]=1;
        }
    }

    public void Rock(){
        whitePieces[0][0]=2;
        whitePieces[7][0]=2;
    }

    public void knight(){
        whitePieces[1][0]=3;
        whitePieces[6][0]=3;
    }

    public void Bishop(){
        whitePieces[2][0]=4;
        whitePieces[5][0]=4;
    }

    public void King(){
        whitePieces[3][0]=6;
    }

    public void Queen(){
        whitePieces[4][0]=5;
    }


    public void display(){
        for(int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                System.out.print(whitePieces[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }
}