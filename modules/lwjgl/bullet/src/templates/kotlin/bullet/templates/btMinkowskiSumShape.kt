/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMinkowskiSumShape = "BTMinkowskiSumShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MinkowskiSumShape_new",
        "",

        opaque_p("shapeA", ""),
        opaque_p("shapeB", "")
    )

    opaque_p(
        "MinkowskiSumShape_getShapeA",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "MinkowskiSumShape_getShapeB",
        "",

        opaque_p("obj", "")
    )

    void(
        "MinkowskiSumShape_getTransformA",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "MinkowskiSumShape_GetTransformB",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "MinkowskiSumShape_setTransformA",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("transA", "")
    )

    void(
        "MinkowskiSumShape_setTransformB",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("transB", "")
    )

}