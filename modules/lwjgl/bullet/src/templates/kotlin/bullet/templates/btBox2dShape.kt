/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btBox2dShape = "BTBox2dShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "Box2dShape_new",
        "",

        btVector3.const.p("boxHalfExtents", "")
    )

    opaque_p(
        "Box2dShape_new2",
        "",

        btScalar("boxHalfExtent", "")
    )

    opaque_p(
        "Box2dShape_new3",
        "",

        btScalar("boxHalfExtentX", ""),
        btScalar("boxHalfExtentY", ""),
        btScalar("boxHalfExtentZ", "")
    )

    void(
        "Box2dShape_getCentroid",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "Box2dShape_getHalfExtentsWithMargin",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "Box2dShape_getHalfExtentsWithoutMargin",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btVector3.const.p(
        "Box2dShape_getNormals",
        "",

        opaque_p("obj", "")
    )

    void(
        "Box2dShape_getPlaneEquation",
        "",

        opaque_p("obj", ""),
        btVector4.p("plane", ""),
        int("i", "")
    )

    int(
        "Box2dShape_getVertexCount",
        "",

        opaque_p("obj", "")
    )

    btVector3.const.p(
        "Box2dShape_getVertices",
        "",

        opaque_p("obj", "")
    )

}