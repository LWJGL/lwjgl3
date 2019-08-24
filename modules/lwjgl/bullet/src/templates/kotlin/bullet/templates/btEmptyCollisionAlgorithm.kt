/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btEmptyCollisionAlgorithm = "BTEmptyCollisionAlgorithm".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "EmptyAlgorithm_CreateFunc_new",
        "",

        void()
    )

    opaque_p(
        "EmptyAlgorithm_new",
        "",

        opaque_p("ci", "")
    )

}