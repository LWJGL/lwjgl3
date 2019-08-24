/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btTriangleBuffer = "BTTriangleBuffer".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "Triangle_new",
        "",

        void()
    )

    int(
        "Triangle_getPartId",
        "",

        opaque_p("obj", "")
    )

    int(
        "Triangle_getTriangleIndex",
        "",

        opaque_p("obj", "")
    )

    void(
        "Triangle_getVertex0",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "Triangle_getVertex1",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "Triangle_getVertex2",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "Triangle_setPartId",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "Triangle_setTriangleIndex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "Triangle_setVertex0",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "Triangle_setVertex1",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "Triangle_setVertex2",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "Triangle_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "TriangleBuffer_new",
        "",

        void()
    )

    void(
        "TriangleBuffer_clearBuffer",
        "",

        opaque_p("obj", "")
    )

    int(
        "TriangleBuffer_getNumTriangles",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "TriangleBuffer_getTriangle",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

}