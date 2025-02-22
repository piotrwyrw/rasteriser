package org.aturym.renderer.renderer;

import org.aturym.renderer.data.Vertex;

public class VertexProjection {

    private double focalLength;
    private Vertex vertex;
    private double xProjected;
    private double yProjected;

    public VertexProjection(double focalLength, Vertex vertex) {
        this.focalLength = focalLength;
        this.vertex = vertex;
    }

    public void computeProjectedVertex() {
        computeXProjected();
        computeYProjected();
    }

    public void computeXProjected() {
        double x = vertex.getX();
        double y = vertex.getY();
        double z = vertex.getZ();
        this.xProjected = Math.round((focalLength * x) / (focalLength + z));
    }

    public void computeYProjected() {
        double x = vertex.getX();
        double y = vertex.getY();
        double z = vertex.getZ();
        this.yProjected = Math.round((focalLength * y) / (focalLength + z));
    }

    public void setFocalLength(double focalLength) {
        if (focalLength < 0) return;
        this.focalLength = focalLength;
    }

    public double getXProjected() {
        return xProjected;
    }

    public double getYProjected() {
        return yProjected;
    }
}
