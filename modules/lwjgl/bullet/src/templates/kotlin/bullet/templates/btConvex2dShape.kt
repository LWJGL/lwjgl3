/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConvex2dShape = "BTConvex2dShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "Convex2dShape_new",
        "",

        opaque_p("convexChildShape", "")
    )

    opaque_p(
        "Convex2dShape_getChildShape",
        "",

        opaque_p("obj", "")
    )

}