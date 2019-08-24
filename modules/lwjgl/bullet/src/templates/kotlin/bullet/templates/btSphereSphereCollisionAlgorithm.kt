/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btSphereSphereCollisionAlgorithm = "BTSphereSphereCollisionAlgorithm".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "SphereSphereCollisionAlgorithm_CreateFunc_new",
        "",

        void()
    )

    opaque_p(
        "SphereSphereCollisionAlgorithm_new",
        "",

        opaque_p("mf", ""),
        opaque_p("ci", ""),
        opaque_p("col0Wrap", ""),
        opaque_p("col1Wrap", "")
    )

    opaque_p(
        "SphereSphereCollisionAlgorithm_new2",
        "",

        opaque_p("ci", "")
    )

}