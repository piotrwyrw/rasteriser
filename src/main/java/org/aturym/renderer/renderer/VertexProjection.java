package org.aturym.renderer.renderer;

import org.aturym.renderer.data.Vertex;

public class VertexProjection {

    private double focalLength;
    private Vertex vertex;
    private int xProjected;
    private int yProjected;

    public VertexProjection(double focalLength, Vertex vertex) {
        this.focalLength = focalLength;
        this.vertex = vertex;
    }

    public void computeProjectedVertex() {
        computeXProjected();
        computeYProjected();
    }

    public void computeXProjected() {
        int x = vertex.getXPosition();
        int y = vertex.getYPosition();
        int z = vertex.getZPosition();
        this.xProjected = (int) Math.round((focalLength * x) / (focalLength + z));
    }

    public void computeYProjected() {
        int x = vertex.getXPosition();
        int y = vertex.getYPosition();
        int z = vertex.getZPosition();
        this.yProjected = (int) Math.round((focalLength * y) / (focalLength + z));
    }

    public void setFocalLength(double focalLength) {
        if(focalLength < 0) return;
        this.focalLength = focalLength;
    }

    public int getXProjected() {
        return xProjected;
    }

    public int getYProjected() {
        return yProjected;
    }
}
