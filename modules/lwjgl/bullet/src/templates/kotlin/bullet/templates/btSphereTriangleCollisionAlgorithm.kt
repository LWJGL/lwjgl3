/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btSphereTriangleCollisionAlgorithm = "BTSphereTriangleCollisionAlgorithm".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "SphereTriangleCollisionAlgorithm_CreateFunc_new",
        "",

        void()
    )

    opaque_p(
        "SphereTriangleCollisionAlgorithm_new",
        "",

        opaque_p("mf", ""),
        opaque_p("ci", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        bool("swapped", "")
    )

    opaque_p(
        "SphereTriangleCollisionAlgorithm_new2",
        "",

        opaque_p("ci", "")
    )

}