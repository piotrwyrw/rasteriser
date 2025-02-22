package org.aturym.renderer.ui;

import org.aturym.renderer.input.Scene;

import javax.swing.*;
import java.awt.*;

public class ViewportFrame extends JFrame {

    public static int width = 1000;
    public static int height = 1000;

    public ViewportFrame(String title, Scene scene) throws HeadlessException {
        super(title);
        this.setSize(width, height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(new ViewportPanel(scene));
        this.setVisible(true);
    }
}
