/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btTriangleMesh = "BTTriangleMesh".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "TriangleMesh_new",
        "",

        bool("use32bitIndices", ""),
        bool("use4componentVertices", "")
    )

    void(
        "TriangleMesh_addIndex",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "TriangleMesh_addTriangle",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("vertex0", ""),
        btVector3.const.p("vertex1", ""),
        btVector3.const.p("vertex2", ""),
        bool("removeDuplicateVertices", "")
    )

    void(
        "TriangleMesh_addTriangleIndices",
        "",

        opaque_p("obj", ""),
        int("index1", ""),
        int("index2", ""),
        int("index3", "")
    )

    int(
        "TriangleMesh_findOrAddVertex",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("vertex", ""),
        bool("removeDuplicateVertices", "")
    )

    int(
        "TriangleMesh_getNumTriangles",
        "",

        opaque_p("obj", "")
    )

    bool(
        "TriangleMesh_getUse32bitIndices",
        "",

        opaque_p("obj", "")
    )

    bool(
        "TriangleMesh_getUse4componentVertices",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TriangleMesh_getWeldingThreshold",
        "",

        opaque_p("obj", "")
    )

    void(
        "TriangleMesh_setWeldingThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

}