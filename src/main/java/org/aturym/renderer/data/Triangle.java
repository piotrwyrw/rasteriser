package org.aturym.renderer.data;

public class Triangle {

    private Vertex a;
    private Vertex b;
    private Vertex c;

    public Triangle(Vertex a, Vertex b, Vertex c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Edge[] getEdges() {
        return new Edge[]{
                new Edge(a, b),
                new Edge(b, c),
                new Edge(c, a)
        };
    }

    public Vertex getA() {
        return a;
    }

    public Vertex getB() {
        return b;
    }

    public Vertex getC() {
        return c;
    }

}
