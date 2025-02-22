package org.aturym.renderer.data;

public class Vertex {

    private double x;
    private double y;
    private double z;

    public Vertex(double x, double y, double z) {
        setPosition(x, Axis.X);
        setPosition(y, Axis.Y);
        setPosition(z, Axis.Z);
    }

    public void setPosition(double position, Axis axis) {
        switch (axis) {
            case X -> this.x = position;
            case Y -> this.y = position;
            case Z -> this.z = position;
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
