/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.par

import org.lwjgl.generator.*

val PAR_PACKAGE = "org.lwjgl.util.par"

fun config() {
    packageInfo(
        PAR_PACKAGE,
        """
        Contains bindings to the ${url("https://github.com/prideout/par", "par")} library.
        """
    )

    Generator.registerLibraryInit(PAR_PACKAGE, "LibPar", "par", setupAllocator = true)
}

val PAR_SHAPES_T = typedef(uint16_t, "PAR_SHAPES_T")
val PAR_SHAPES_T_p = PAR_SHAPES_T.p

val par_shapes_mesh_p = struct(PAR_PACKAGE, "ParShapesMesh", nativeName = "par_shapes_mesh", mutable = false) {
    documentation = "The {@code par_shapes.h} mesh structure."

    float_p.member("points", "a flat list of 3-tuples (X Y Z X Y Z...) for the vertex positions")
    int.member("npoints", "the number of points")
    PAR_SHAPES_T_p.member("triangles", "flat list of 3-tuples (I J K I J K...)")
    int.member("ntriangles", "the number of triangles")
    float_p.member("normals", "an optional list of 3-tuples (X Y Z X Y Z...) for the vertex normals")
    float_p.member("tcoords", "an optional list of 2-tuples (U V U V U V...) for the vertex texture coordinates")
}.p