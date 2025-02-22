package org.aturym.renderer.input;

import org.aturym.renderer.data.Edge;
import org.aturym.renderer.data.Vertex;

public class InputTable {

    public static double focalLength = 100;

    static Vertex[] vertexTable = new Vertex[]{new Vertex(23, 63, 85),
                                        new Vertex(23, -63, 85),
                                        new Vertex(-86, -63, 22),
                                        new Vertex(-86, 63, 22),
                                        new Vertex(86, 63, -24),
                                        new Vertex(86, -63, -24),
                                        new Vertex(-23, -63, -87),
                                        new Vertex(-23, 63, -87)};

    static Edge[] edgeTable = new Edge[]{new Edge(0, 1),
                                        new Edge(1, 2),
                                        new Edge(2, 3),
                                        new Edge(3, 0),
                                        new Edge(4, 5),
                                        new Edge(5, 6),
                                        new Edge(6, 7),
                                        new Edge(7, 4),
                                        new Edge(0, 4),
                                        new Edge(1, 5),
                                        new Edge(2, 6),
                                        new Edge(3, 7)};

    public static double getFocalLength() {
        return focalLength;
    }

    public static Vertex[] getVertexTable() {
        return vertexTable;
    }

    public static Vertex getVertexAt(int index) {
        if(index < 0) return null;
        return vertexTable[index];
    }

    public static Edge[] getEdgeTable() {
        return edgeTable;
    }
}
