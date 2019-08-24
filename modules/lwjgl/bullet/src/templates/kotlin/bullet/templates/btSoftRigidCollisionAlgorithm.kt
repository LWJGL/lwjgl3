/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btSoftRigidCollisionAlgorithm = "BTSoftRigidCollisionAlgorithm".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "SoftRigidCollisionAlgorithm_CreateFunc_new",
        "",

        void()
    )

    opaque_p(
        "SoftRigidCollisionAlgorithm_new",
        "",

        opaque_p("mf", ""),
        opaque_p("ci", ""),
        opaque_p("col0", ""),
        opaque_p("col1Wrap", ""),
        bool("isSwapped", "")
    )

}