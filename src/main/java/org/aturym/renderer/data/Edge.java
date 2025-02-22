package org.aturym.renderer.data;

public class Edge {

    private Vertex start;
    private Vertex destination;

    public Edge(Vertex start, Vertex destination) {
        this.start = start;
        this.destination = destination;
    }

    public Vertex getStart() {
        return start;
    }

    public Vertex getDestination() {
        return destination;
    }
}
