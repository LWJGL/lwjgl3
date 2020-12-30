/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btGeneric6DofSpringConstraint = "BTGeneric6DofSpringConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "Generic6DofSpringConstraint_new",
        "",

        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("frameInA", ""),
        btTransform.const.p("frameInB", ""),
        bool("useLinearReferenceFrameA", "")
    )

    opaque_p(
        "Generic6DofSpringConstraint_new2",
        "",

        opaque_p("rbB", ""),
        btTransform.const.p("frameInB", ""),
        bool("useLinearReferenceFrameB", "")
    )

    void(
        "Generic6DofSpringConstraint_enableSpring",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        bool("onOff", "")
    )

    btScalar(
        "Generic6DofSpringConstraint_getDamping",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    btScalar(
        "Generic6DofSpringConstraint_getEquilibriumPoint",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    btScalar(
        "Generic6DofSpringConstraint_getStiffness",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    bool(
        "Generic6DofSpringConstraint_isSpringEnabled",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "Generic6DofSpringConstraint_setDamping",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btScalar("damping", "")
    )

    void(
        "Generic6DofSpringConstraint_setEquilibriumPoint",
        "",

        opaque_p("obj", "")
    )

    void(
        "Generic6DofSpringConstraint_setEquilibriumPoint2",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "Generic6DofSpringConstraint_setEquilibriumPoint3",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btScalar("val", "")
    )

    void(
        "Generic6DofSpringConstraint_setStiffness",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btScalar("stiffness", "")
    )

}