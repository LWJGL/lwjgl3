/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btSphereShape = "BTSphereShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "SphereShape_new",
        "",

        btScalar("radius", "")
    )

    btScalar(
        "SphereShape_getRadius",
        "",

        opaque_p("obj", "")
    )

    void(
        "SphereShape_setUnscaledRadius",
        "",

        opaque_p("obj", ""),
        btScalar("radius", "")
    )

}