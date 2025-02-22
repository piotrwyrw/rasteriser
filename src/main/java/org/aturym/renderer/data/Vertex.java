package org.aturym.renderer.data;

public class Vertex {

    private int xPosition;
    private int yPosition;
    private int zPosition;

    public Vertex(int xPosition, int yPosition, int zPosition) {
        setPosition(xPosition, 0);
        setPosition(yPosition, 1);
        setPosition(zPosition, 2);
    }

    //axis: 0 = x-axis, 1 = y-axis, 2 = z-axis
    public void setPosition(int position, int axis) {
        switch (axis) {
            case 0 -> this.xPosition = position;
            case 1 -> this.yPosition = position;
            case 2 -> this.zPosition = position;
        }
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public int getZPosition() {
        return zPosition;
    }
}
