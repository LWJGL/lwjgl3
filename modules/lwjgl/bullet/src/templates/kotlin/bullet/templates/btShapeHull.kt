/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btShapeHull = "BTShapeHull".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ShapeHull_new",
        "",

        opaque_p("shape", "")
    )

    bool(
        "ShapeHull_buildHull",
        "",

        opaque_p("obj", ""),
        btScalar("margin", ""),
        int("highRes", "")
    )

    //unsigned_int.const.p(
    opaque_const_p(
        "ShapeHull_getIndexPointer",
        "",

        opaque_p("obj", "")
    )

    btVector3.const.p(
        "ShapeHull_getVertexPointer",
        "",

        opaque_p("obj", "")
    )

    int(
        "ShapeHull_numIndices",
        "",

        opaque_p("obj", "")
    )

    int(
        "ShapeHull_numTriangles",
        "",

        opaque_p("obj", "")
    )

    int(
        "ShapeHull_numVertices",
        "",

        opaque_p("obj", "")
    )

    void(
        "ShapeHull_delete",
        "",

        opaque_p("obj", "")
    )

}