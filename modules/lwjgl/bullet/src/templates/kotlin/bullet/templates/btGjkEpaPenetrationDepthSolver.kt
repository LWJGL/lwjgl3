/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btGjkEpaPenetrationDepthSolver = "BTGjkEpaPenetrationDepthSolver".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "GjkEpaPenetrationDepthSolver_new",
        "",

        void()
    )

}