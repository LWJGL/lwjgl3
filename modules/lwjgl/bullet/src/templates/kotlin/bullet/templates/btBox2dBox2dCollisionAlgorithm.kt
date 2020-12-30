/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btBox2dBox2dCollisionAlgorithm = "BTBox2dBox2dCollisionAlgorithm".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "Box2dBox2dCollisionAlgorithm_CreateFunc_new",
        "",

        void()
    )

    opaque_p(
        "Box2dBox2dCollisionAlgorithm_new",
        "",

        opaque_p("ci", "")
    )

    opaque_p(
        "Box2dBox2dCollisionAlgorithm_new2",
        "",

        opaque_p("mf", ""),
        opaque_p("ci", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", "")
    )

}