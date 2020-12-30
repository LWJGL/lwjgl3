/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btPoint2PointConstraint = "BTPoint2PointConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ConstraintSetting_new",
        "",

        void()
    )

    btScalar(
        "ConstraintSetting_getDamping",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ConstraintSetting_getImpulseClamp",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ConstraintSetting_getTau",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConstraintSetting_setDamping",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ConstraintSetting_setImpulseClamp",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ConstraintSetting_setTau",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ConstraintSetting_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Point2PointConstraint_new",
        "",

        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btVector3.const.p("pivotInA", ""),
        btVector3.const.p("pivotInB", "")
    )

    opaque_p(
        "Point2PointConstraint_new2",
        "",

        opaque_p("rbA", ""),
        btVector3.const.p("pivotInA", "")
    )

    int(
        "Point2PointConstraint_getFlags",
        "",

        opaque_p("obj", "")
    )

    void(
        "Point2PointConstraint_getInfo1NonVirtual",
        "",

        opaque_p("obj", ""),
        opaque_p("info", "")
    )

    void(
        "Point2PointConstraint_getInfo2NonVirtual",
        "",

        opaque_p("obj", ""),
        opaque_p("info", ""),
        btTransform.const.p("body0_trans", ""),
        btTransform.const.p("body1_trans", "")
    )

    void(
        "Point2PointConstraint_getPivotInA",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "Point2PointConstraint_getPivotInB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "Point2PointConstraint_getSetting",
        "",

        opaque_p("obj", "")
    )

    bool(
        "Point2PointConstraint_getUseSolveConstraintObsolete",
        "",

        opaque_p("obj", "")
    )

    void(
        "Point2PointConstraint_setPivotA",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("pivotA", "")
    )

    void(
        "Point2PointConstraint_setPivotB",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("pivotB", "")
    )

    void(
        "Point2PointConstraint_setUseSolveConstraintObsolete",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "Point2PointConstraint_updateRHS",
        "",

        opaque_p("obj", ""),
        btScalar("timeStep", "")
    )

}