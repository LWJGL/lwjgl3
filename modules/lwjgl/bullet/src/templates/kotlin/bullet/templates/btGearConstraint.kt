/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btGearConstraint = "BTGearConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "GearConstraint_new",
        "",

        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btVector3.const.p("axisInA", ""),
        btVector3.const.p("axisInB", ""),
        btScalar("ratio", "")
    )

    void(
        "GearConstraint_getAxisA",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "GearConstraint_getAxisB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "GearConstraint_getRatio",
        "",

        opaque_p("obj", "")
    )

    void(
        "GearConstraint_setAxisA",
        "",

        opaque_p("obj", ""),
        btVector3.p("axisA", "")
    )

    void(
        "GearConstraint_setAxisB",
        "",

        opaque_p("obj", ""),
        btVector3.p("axisB", "")
    )

    void(
        "GearConstraint_setRatio",
        "",

        opaque_p("obj", ""),
        btScalar("ratio", "")
    )

}