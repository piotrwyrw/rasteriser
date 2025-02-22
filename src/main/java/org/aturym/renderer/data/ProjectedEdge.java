package org.aturym.renderer.data;

import org.aturym.renderer.input.Scene;
import org.aturym.renderer.renderer.VertexProjection;

public class ProjectedEdge {

   private VertexProjection start;
   private VertexProjection destination;

   public ProjectedEdge(VertexProjection start, VertexProjection destination) {
       this.start = start;
       this.start.computeProjectedVertex();

       this.destination = destination;
       this.destination.computeProjectedVertex();
   }

   public static ProjectedEdge project(Edge edge, Scene scene) {
       return new ProjectedEdge(
               new VertexProjection(scene.getFocalLength(), edge.getStart()),
               new VertexProjection(scene.getFocalLength(), edge.getDestination())
       );
   }

    public VertexProjection getStart() {
        return start;
    }

    public VertexProjection getDestination() {
        return destination;
    }
}
