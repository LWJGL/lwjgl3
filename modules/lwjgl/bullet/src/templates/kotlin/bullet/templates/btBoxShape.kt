/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btBoxShape = "BTBoxShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "BoxShape_new",
        "",

        btVector3.const.p("boxHalfExtents", "")
    )

    opaque_p(
        "BoxShape_new2",
        "",

        btScalar("boxHalfExtent", "")
    )

    opaque_p(
        "BoxShape_new3",
        "",

        btScalar("boxHalfExtentX", ""),
        btScalar("boxHalfExtentY", ""),
        btScalar("boxHalfExtentZ", "")
    )

    void(
        "BoxShape_getHalfExtentsWithMargin",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "BoxShape_getHalfExtentsWithoutMargin",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "BoxShape_getPlaneEquation",
        "",

        opaque_p("obj", ""),
        btVector4.p("plane", ""),
        int("i", "")
    )

}