package org.aturym.renderer.data;

public class Vertex {

    private int x;
    private int y;
    private int z;

    public Vertex(int x, int y, int z) {
        setPosition(x, Axis.X);
        setPosition(y, Axis.Y);
        setPosition(z, Axis.Z);
    }

    //axis: 0 = x-axis, 1 = y-axis, 2 = z-axis
    public void setPosition(int position, Axis axis) {
        switch (axis) {
            case X -> this.x = position;
            case Y -> this.y = position;
            case Z -> this.z = position;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
