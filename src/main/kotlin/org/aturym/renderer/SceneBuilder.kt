package org.aturym.renderer

import org.aturym.renderer.data.Triangle
import org.aturym.renderer.data.Vertex
import org.aturym.renderer.input.Scene

data class TrianglePrototype(val a: Int, val b: Int, val c: Int)

class SceneBuilder {

    private val vertices = arrayListOf<Vertex>()
    private val triangles = arrayListOf<TrianglePrototype>()
    private var focalLength = 1.0

    fun addVertex(vertex: Vertex): SceneBuilder {
        vertices.add(vertex)
        return this
    }

    fun addVertex(x: Double, y: Double, z: Double): SceneBuilder {
        vertices.add(Vertex(x, y, z))
        return this
    }

    fun addVertices(vararg vertices: Vertex): SceneBuilder {
        vertices.forEach { addVertex(it) }
        return this
    }

    fun addTriangle(a: Int, b: Int, c: Int): SceneBuilder {
        triangles.add(TrianglePrototype(a, b, c))
        return this
    }

    fun addTriangles(vararg triangles: TrianglePrototype): SceneBuilder {
        triangles.forEach { addTriangle(it.a, it.b, it.c) }
        return this
    }

    fun withFocalLength(length: Double): SceneBuilder {
        focalLength = length
        return this
    }

    fun build(): Scene = Scene(
        triangles.map { prototype ->
            Triangle(
                vertices.get(prototype.a),
                vertices.get(prototype.b),
                vertices.get(prototype.c)
            )
        }.toTypedArray(),
        focalLength
    )

}