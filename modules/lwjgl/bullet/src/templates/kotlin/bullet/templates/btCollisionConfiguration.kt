/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btCollisionConfiguration = "BTCollisionConfiguration".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "CollisionConfiguration_getCollisionAlgorithmCreateFunc",
        "",

        opaque_p("obj", ""),
        int("proxyType0", ""),
        int("proxyType1", "")
    )

    opaque_p(
        "CollisionConfiguration_getCollisionAlgorithmPool",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionConfiguration_getPersistentManifoldPool",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionConfiguration_delete",
        "",

        opaque_p("obj", "")
    )

}