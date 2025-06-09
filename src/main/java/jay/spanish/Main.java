package jay.spanish;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        JFrame.setDefaultLookAndFeelDecorated(true);
        SpanishVideo panel = new SpanishVideo();
        JFrame frame = new JFrame(panel.title);
//        frame.setUndecorated(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 600));
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}