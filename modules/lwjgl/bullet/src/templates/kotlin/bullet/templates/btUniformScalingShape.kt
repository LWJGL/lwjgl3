/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btUniformScalingShape = "BTUniformScalingShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "UniformScalingShape_new",
        "",

        opaque_p("convexChildShape", ""),
        btScalar("uniformScalingFactor", "")
    )

    opaque_p(
        "UniformScalingShape_getChildShape",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "UniformScalingShape_getUniformScalingFactor",
        "",

        opaque_p("obj", "")
    )

}