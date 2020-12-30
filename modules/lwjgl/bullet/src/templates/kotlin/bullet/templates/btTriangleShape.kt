/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btTriangleShape = "BTTriangleShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "TriangleShape_new",
        "",

        void()
    )

    opaque_p(
        "TriangleShape_new2",
        "",

        btVector3.const.p("p0", ""),
        btVector3.const.p("p1", ""),
        btVector3.const.p("p2", "")
    )

    void(
        "TriangleShape_calcNormal",
        "",

        opaque_p("obj", ""),
        btVector3.p("normal", "")
    )

    void(
        "TriangleShape_getPlaneEquation",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.p("planeNormal", ""),
        btVector3.p("planeSupport", "")
    )

    btScalar[3](
        "TriangleShape_getVertexPtr",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    btVector3.p(
        "TriangleShape_getVertices1",
        "",

        opaque_p("obj", "")
    )

}