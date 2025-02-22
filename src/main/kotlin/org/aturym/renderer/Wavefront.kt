package org.aturym.renderer

fun parseWavefront(src: String): SceneBuilder {
    val builder = SceneBuilder()

    val lines = src.split("\n").filter { line ->
        line.trim().startsWith("v") || line.trim().startsWith("f")
    }

    lines.forEach { raw ->
        val line = raw.trim()

        // Add vertex
        if (line.startsWith("v ")) {
            val coords = line.split("\\s+".toRegex()).drop(1).map { it.toDouble() }
            println(coords)
            builder.addVertex(coords[0], coords[1], coords[2])
            return@forEach
        }

        // Add face
        if (line.startsWith("f ")) {
            val coords = line.split("\\s+".toRegex()).drop(1).map { coord -> coord.split("/")[0].toInt() - 1 }
            builder.addTriangle(coords[0], coords[1], coords[2])
        }
    }

    return builder
}