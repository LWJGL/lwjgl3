/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btFixedConstraint = "BTFixedConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "FixedConstraint_new",
        "",

        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("frameInA", ""),
        btTransform.const.p("frameInB", "")
    )

}