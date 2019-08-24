/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btScaledBvhTriangleMeshShape = "BTScaledBvhTriangleMeshShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ScaledBvhTriangleMeshShape_new",
        "",

        opaque_p("childShape", ""),
        btVector3.const.p("localScaling", "")
    )

    opaque_p(
        "ScaledBvhTriangleMeshShape_getChildShape",
        "",

        opaque_p("obj", "")
    )

}