/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btContinuousConvexCollision = "BTContinuousConvexCollision".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ContinuousConvexCollision_new",
        "",

        opaque_p("shapeA", ""),
        opaque_p("shapeB", ""),
        opaque_p("simplexSolver", ""),
        opaque_p("penetrationDepthSolver", "")
    )

    opaque_p(
        "ContinuousConvexCollision_new2",
        "",

        opaque_p("shapeA", ""),
        opaque_p("plane", "")
    )

}