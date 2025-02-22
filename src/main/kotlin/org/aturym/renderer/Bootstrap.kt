package org.aturym.renderer

import org.aturym.renderer.ui.ViewportFrame
import java.nio.file.Files
import kotlin.io.path.Path


fun main() {
    val src = Files.readString(Path("terrain.obj"))

    val scene = parseWavefront(src)
        .withFocalLength(250.0)
        .build()

    ViewportFrame("Renderer", scene)
}