/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btGjkConvexCast = "BTGjkConvexCast".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "GjkConvexCast_new",
        "",

        opaque_p("convexA", ""),
        opaque_p("convexB", ""),
        opaque_p("simplexSolver", "")
    )

}