package ui;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public static int width = 1000;
    public static int height = 1000;

    public Frame(String title) throws HeadlessException {
        super(title);
        this.setSize(width, height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(new Panel());
        this.setVisible(true);
    }
}
