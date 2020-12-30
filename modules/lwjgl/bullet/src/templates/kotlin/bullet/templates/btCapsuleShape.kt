/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btCapsuleShape = "BTCapsuleShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "CapsuleShape_new",
        "",

        btScalar("radius", ""),
        btScalar("height", "")
    )

    void(
        "CapsuleShape_deSerializeFloat",
        "",

        opaque_p("obj", ""),
        opaque_p("dataBuffer", "")
    )

    btScalar(
        "CapsuleShape_getHalfHeight",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "CapsuleShape_getRadius",
        "",

        opaque_p("obj", "")
    )

    int(
        "CapsuleShape_getUpAxis",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CapsuleShapeX_new",
        "",

        btScalar("radius", ""),
        btScalar("height", "")
    )

    opaque_p(
        "CapsuleShapeZ_new",
        "",

        btScalar("radius", ""),
        btScalar("height", "")
    )

}