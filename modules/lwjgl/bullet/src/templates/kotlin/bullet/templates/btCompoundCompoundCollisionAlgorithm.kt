/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btCompoundCompoundCollisionAlgorithm = "BTCompoundCompoundCollisionAlgorithm".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "CompoundCompoundCollisionAlgorithm_CreateFunc_new",
        "",

        void()
    )

    opaque_p(
        "CompoundCompoundCollisionAlgorithm_SwappedCreateFunc_new",
        "",

        void()
    )

    opaque_p(
        "CompoundCompoundCollisionAlgorithm_new",
        "",

        opaque_p("ci", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        bool("isSwapped", "")
    )

}