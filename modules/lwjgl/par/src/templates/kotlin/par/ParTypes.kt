/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package par

import org.lwjgl.generator.*

fun config() {
    packageInfo(
        Module.PAR,
        """
        Contains bindings to the ${url("https://github.com/prideout/par", "par")} library.
        """
    )

    Generator.registerLibraryInit(Module.PAR, "LibPar", "par", setupAllocator = true)
}

val PAR_SHAPES_T = typedef(uint32_t, "PAR_SHAPES_T")

val par_shapes_mesh = struct(Module.PAR, "ParShapesMesh", nativeName = "par_shapes_mesh", mutable = false) {
    documentation =
        """
        The {@code par_shapes.h} mesh structure.

        <b>LWJGL note</b>: in the default build, {@code PAR_SHAPES_T} is {@code uint32_t}.
        """

    float.p("points", "a flat list of 3-tuples (X Y Z X Y Z...) for the vertex positions")
    int("npoints", "the number of points")
    PAR_SHAPES_T.p("triangles", "flat list of 3-tuples (I J K I J K...)")
    int("ntriangles", "the number of triangles")
    nullable..float.p("normals", "an optional list of 3-tuples (X Y Z X Y Z...) for the vertex normals")
    nullable..float.p("tcoords", "an optional list of 2-tuples (U V U V U V...) for the vertex texture coordinates")
}