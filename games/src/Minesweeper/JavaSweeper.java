package Minesweeper;

import javax.swing.*;
import java.awt.*;

public class JavaSweeper extends JFrame {
    private final static short IMAGE_SIZE = 50;
    private JPanel panel;

    public static void main(String[] args) {
        new JavaSweeper();
    }

    private JavaSweeper() {
        initPanel();
        initFrame();
    }

    private void initPanel() {
        panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(getImage("flaged"),0,0,this);
            }
        };
        panel.setPreferredSize(new Dimension(500, 300));
        add(panel);
    }

    private void initFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Sweeper");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    private Image getImage(String name) {
        ImageIcon bomb = new ImageIcon("games\\resources\\img\\" + name + ".png");
        return bomb.getImage();
    }

}








