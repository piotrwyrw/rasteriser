package org.aturym.renderer.ui;

import org.aturym.renderer.data.Edge;
import org.aturym.renderer.data.ProjectedEdge;
import org.aturym.renderer.data.Triangle;
import org.aturym.renderer.input.Scene;

import javax.swing.*;
import java.awt.*;

public class ViewportPanel extends JPanel {

    private Scene scene;

    private final LinearGradientPaint skyGradient = new LinearGradientPaint(
            ViewportFrame.WIDTH / 2.0f,
            ViewportFrame.HEIGHT,
            ViewportFrame.WIDTH / 2.0f,
            0.0f,
            new float[]{0.0f, 1.0f},
            new Color[]{Color.decode("#1b1b1b"), Color.decode("#b2bec3")}
    );

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
        Graphics2D g2d = (Graphics2D) g;

        Paint oldPaint = g2d.getPaint();
        g2d.setPaint(skyGradient);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g2d.setPaint(oldPaint);

        g.setColor(Color.WHITE);
        Triangle[] triangles = scene.getTriangles();
        for (Triangle triangle : triangles) {
            for (Edge edge : triangle.getEdges()) {
                ProjectedEdge currentEdge = ProjectedEdge.project(edge, scene);
                g.drawLine(
                        (int) (currentEdge.getStart().getXProjected() + (this.getWidth() / 2.0)),
                        (int) (currentEdge.getStart().getYProjected() + (this.getHeight() / 2.0)),
                        (int) (currentEdge.getDestination().getXProjected() + (this.getWidth() / 2.0)),
                        (int) (currentEdge.getDestination().getYProjected() + (this.getHeight() / 2.0))
                );
            }
        }
    }
}
