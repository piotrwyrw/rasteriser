package org.aturym.renderer

import org.aturym.renderer.data.Edge
import org.aturym.renderer.data.Vertex
import org.aturym.renderer.input.Scene

data class EdgePrototype(val startIndex: Int, val endIndex: Int)

class SceneBuilder {

    private val vertices = arrayListOf<Vertex>()
    private val edges = arrayListOf<EdgePrototype>()
    private var focalLength = 1.0

    fun addVertex(vertex: Vertex): SceneBuilder {
        vertices.add(vertex)
        return this
    }

    fun addVertex(x: Int, y: Int, z: Int): SceneBuilder {
        vertices.add(Vertex(x, y, z))
        return this
    }

    fun addVertices(vararg vertices: Vertex): SceneBuilder {
        vertices.forEach { addVertex(it) }
        return this
    }

    fun addEdge(from: Int, to: Int): SceneBuilder {
        edges.add(EdgePrototype(from, to))
        return this
    }

    fun addEdges(vararg edges: EdgePrototype): SceneBuilder {
        edges.forEach { addEdge(it.startIndex, it.endIndex) }
        return this
    }

    fun withFocalLength(length: Double): SceneBuilder {
        focalLength = length
        return this
    }

    fun build(): Scene = Scene(
        vertices.toTypedArray(),
        edges.map { prototype -> Edge(vertices.get(prototype.startIndex), vertices.get(prototype.endIndex)) }
            .toTypedArray(),
        focalLength
    )

}