/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMultiBodyJointLimitConstraint = "BTMultiBodyJointLimitConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MultiBodyJointLimitConstraint_new",
        "",

        opaque_p("body", ""),
        int("link", ""),
        btScalar("lower", ""),
        btScalar("upper", "")
    )

}