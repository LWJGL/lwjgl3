/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btUniversalConstraint = "BTUniversalConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "UniversalConstraint_new",
        "",

        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btVector3.const.p("anchor", ""),
        btVector3.const.p("axis1", ""),
        btVector3.const.p("axis2", "")
    )

    void(
        "UniversalConstraint_getAnchor",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "UniversalConstraint_getAnchor2",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "UniversalConstraint_getAngle1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "UniversalConstraint_getAngle2",
        "",

        opaque_p("obj", "")
    )

    void(
        "UniversalConstraint_getAxis1",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "UniversalConstraint_getAxis2",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "UniversalConstraint_setLowerLimit",
        "",

        opaque_p("obj", ""),
        btScalar("ang1min", ""),
        btScalar("ang2min", "")
    )

    void(
        "UniversalConstraint_setUpperLimit",
        "",

        opaque_p("obj", ""),
        btScalar("ang1max", ""),
        btScalar("ang2max", "")
    )

}