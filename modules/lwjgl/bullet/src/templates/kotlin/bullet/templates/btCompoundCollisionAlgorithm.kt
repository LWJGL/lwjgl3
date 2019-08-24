/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btCompoundCollisionAlgorithm = "BTCompoundCollisionAlgorithm".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "CompoundCollisionAlgorithm_CreateFunc_new",
        "",

        void()
    )

    opaque_p(
        "CompoundCollisionAlgorithm_SwappedCreateFunc_new",
        "",

        void()
    )

    opaque_p(
        "CompoundCollisionAlgorithm_new",
        "",

        opaque_p("ci", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        bool("isSwapped", "")
    )

    opaque_p(
        "CompoundCollisionAlgorithm_getChildAlgorithm",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

}