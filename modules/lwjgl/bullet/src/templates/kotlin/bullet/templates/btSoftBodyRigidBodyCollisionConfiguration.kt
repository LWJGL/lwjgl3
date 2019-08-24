/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btSoftBodyRigidBodyCollisionConfiguration = "BTSoftBodyRigidBodyCollisionConfiguration".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "SoftBodyRigidBodyCollisionConfiguration_new",
        "",

        void()
    )

    opaque_p(
        "SoftBodyRigidBodyCollisionConfiguration_new2",
        "",

        opaque_p("constructionInfo", "")
    )

}