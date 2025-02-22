package org.aturym.renderer.data;

import org.aturym.renderer.input.InputTable;
import org.aturym.renderer.renderer.VertexProjection;

public class Edge {

    VertexProjection vpStart;
    VertexProjection vpDestination;


    public Edge(int startIndex, int destionationIndex) {
        Vertex start = InputTable.getVertexAt(startIndex);
        Vertex destination = InputTable.getVertexAt(destionationIndex);

        vpStart = new VertexProjection(InputTable.getFocalLength(), start);
        vpDestination = new VertexProjection(InputTable.getFocalLength(), destination);
        vpStart.computeProjectedVertex();
        vpDestination.computeProjectedVertex();
    }

    public VertexProjection getVpStart() {
        return vpStart;
    }

    public VertexProjection getVpDestination() {
        return vpDestination;
    }
}
