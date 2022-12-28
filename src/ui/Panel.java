package ui;

import data.Edge;
import input.InputTable;
import renderer.VertexProjection;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public Panel() {
        new Thread(() -> {
            while(true) {
                repaint();
                InputTable.focalLength += 0.1;
            }
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.BLACK);

        Edge[] edges = InputTable.getEdgeTable();
        for(int i = 0; i < edges.length; i++) {
            Edge currentEdge = edges[i];
            VertexProjection start = currentEdge.getVpStart();
            VertexProjection destination = currentEdge.getVpDestination();
            g.drawLine(start.getXProjected() + (this.getWidth() / 2), start.getYProjected() + (this.getHeight() / 2), destination.getXProjected() + (this.getWidth() / 2), destination.getYProjected() + (this.getHeight() / 2));
        }
    }
}
