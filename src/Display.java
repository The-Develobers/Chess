import javax.swing.*;
import java.awt.*;

public class  Display extends JFrame {
    Canvas canvas=new Canvas();
    Image img = Toolkit.getDefaultToolkit().getImage("E:\\Folder\\tearm2\\oop\\chess\\src\\chessboard.jpg");
    public Display() {
        //canvas.setPreferredSize(new Dimension(600,600)));


    }
    public Display(int i) {
        //canvas.setPreferredSize(new Dimension(600,600)));

        setResizable(true);
        setTitle("Chess");
        setSize(600,600);
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(img, 0, 0,null);
                setLayout(null);
            }
        });

        pack();
        validate();


    }

}
