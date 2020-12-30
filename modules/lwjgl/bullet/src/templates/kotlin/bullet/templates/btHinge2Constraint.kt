/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btHinge2Constraint = "BTHinge2Constraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "Hinge2Constraint_new",
        "",

        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btVector3.p("anchor", ""),
        btVector3.p("axis1", ""),
        btVector3.p("axis2", "")
    )

    void(
        "Hinge2Constraint_getAnchor",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "Hinge2Constraint_getAnchor2",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "Hinge2Constraint_getAngle1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "Hinge2Constraint_getAngle2",
        "",

        opaque_p("obj", "")
    )

    void(
        "Hinge2Constraint_getAxis1",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "Hinge2Constraint_getAxis2",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "Hinge2Constraint_setLowerLimit",
        "",

        opaque_p("obj", ""),
        btScalar("ang1min", "")
    )

    void(
        "Hinge2Constraint_setUpperLimit",
        "",

        opaque_p("obj", ""),
        btScalar("ang1max", "")
    )

}