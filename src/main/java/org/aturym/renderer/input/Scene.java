package org.aturym.renderer.input;

import org.aturym.renderer.data.Edge;
import org.aturym.renderer.data.Vertex;

public class Scene {

    private final Vertex[] vertices;
    private final Edge[] edges;

    private final double focalLength;

    public Scene(Vertex[] vertices, Edge[] edges, double focalLength) {
        this.vertices = vertices;
        this.edges = edges;
        this.focalLength = focalLength;
    }

    public Vertex[] getVertices() {
        return vertices;
    }

    public Edge[] getEdges() {
        return edges;
    }

    public double getFocalLength() {
        return focalLength;
    }
}
