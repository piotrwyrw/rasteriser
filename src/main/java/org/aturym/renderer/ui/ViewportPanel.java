package org.aturym.renderer.ui;

import org.aturym.renderer.data.Edge;
import org.aturym.renderer.data.ProjectedEdge;
import org.aturym.renderer.input.Scene;

import javax.swing.*;
import java.awt.*;

public class ViewportPanel extends JPanel {

    private Scene scene;

    public ViewportPanel(Scene scene) {
        this.scene = scene;

        new Thread(() -> {
            while (true) {
                repaint();
            }
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.BLACK);

        Edge[] edges = scene.getEdges();
        for (int i = 0; i < edges.length; i++) {
            ProjectedEdge currentEdge = ProjectedEdge.project(edges[i], scene);
            g.drawLine(
                    currentEdge.getStart().getXProjected() + (this.getWidth() / 2),
                    currentEdge.getStart().getYProjected() + (this.getHeight() / 2),
                    currentEdge.getDestination().getXProjected() + (this.getWidth() / 2),
                    currentEdge.getDestination().getYProjected() + (this.getHeight() / 2)
            );
        }
    }
}
