/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btContactConstraint = "BTContactConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
/*
    opaque_p(
        "ContactConstraint_getContactManifold",
        "",

        opaque_p("obj", "")
    )

    void(
        "ContactConstraint_setContactManifold",
        "",

        opaque_p("obj", ""),
        opaque_p("contactManifold", "")
    )
*/
}