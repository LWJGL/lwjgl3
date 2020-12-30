/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConeShape = "BTConeShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ConeShape_new",
        "",

        btScalar("radius", ""),
        btScalar("height", "")
    )

    int(
        "ConeShape_getConeUpIndex",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ConeShape_getHeight",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ConeShape_getRadius",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConeShape_setConeUpIndex",
        "",

        opaque_p("obj", ""),
        int("upIndex", "")
    )

    void(
        "ConeShape_setHeight",
        "",

        opaque_p("obj", ""),
        btScalar("height", "")
    )

    void(
        "ConeShape_setRadius",
        "",

        opaque_p("obj", ""),
        btScalar("radius", "")
    )

    opaque_p(
        "ConeShapeX_new",
        "",

        btScalar("radius", ""),
        btScalar("height", "")
    )

    opaque_p(
        "ConeShapeZ_new",
        "",

        btScalar("radius", ""),
        btScalar("height", "")
    )

}