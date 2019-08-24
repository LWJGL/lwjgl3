/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConvexPenetrationDepthSolver = "BTConvexPenetrationDepthSolver".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    bool(
        "ConvexPenetrationDepthSolver_calcPenDepth",
        "",

        opaque_p("obj", ""),
        opaque_p("simplexSolver", ""),
        opaque_p("convexA", ""),
        opaque_p("convexB", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", ""),
        btVector3.p("v", ""),
        btVector3.p("pa", ""),
        btVector3.p("pb", ""),
        opaque_p("debugDraw", "")
    )

    void(
        "ConvexPenetrationDepthSolver_delete",
        "",

        opaque_p("obj", "")
    )

}