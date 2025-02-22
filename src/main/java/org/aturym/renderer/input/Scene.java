package org.aturym.renderer.input;

import org.aturym.renderer.data.Triangle;

public class Scene {

    private final Triangle[] triangles;

    private final double focalLength;

    public Scene(Triangle[] triangles, double focalLength) {
        this.triangles = triangles;
        this.focalLength = focalLength;
    }

    public Triangle[] getTriangles() {
        return triangles;
    }

    public double getFocalLength() {
        return focalLength;
    }
}
