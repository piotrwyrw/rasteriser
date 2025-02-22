package org.aturym.renderer

import org.aturym.renderer.data.Vertex
import org.aturym.renderer.ui.ViewportFrame


fun main() {
    val scene = SceneBuilder()
        .addVertices(
            Vertex(23, 63, 85),
            Vertex(23, -63, 85),
            Vertex(-86, -63, 22),
            Vertex(-86, 63, 22),
            Vertex(86, 63, -24),
            Vertex(86, -63, -24),
            Vertex(-23, -63, -87),
            Vertex(-23, 63, -87)
        )
        .addEdges(
            EdgePrototype(0, 1),
            EdgePrototype(1, 2),
            EdgePrototype(2, 3),
            EdgePrototype(3, 0),
            EdgePrototype(4, 5),
            EdgePrototype(5, 6),
            EdgePrototype(6, 7),
            EdgePrototype(7, 4),
            EdgePrototype(0, 4),
            EdgePrototype(1, 5),
            EdgePrototype(2, 6),
            EdgePrototype(3, 7)
        )
        .withFocalLength(120.0)
        .build()

    ViewportFrame("Renderer", scene)
}