/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMultiBodyConstraint = "BTMultiBodyConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    void(
        "MultiBodyConstraint_allocateJacobiansMultiDof",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBodyConstraint_createConstraintRows",
        "",

        opaque_p("obj", ""),
        opaque_p("constraintRows", ""),
        opaque_p("data", ""),
        opaque_p("infoGlobal", "")
    )

    void(
        "MultiBodyConstraint_debugDraw",
        "",

        opaque_p("obj", ""),
        opaque_p("drawer", "")
    )

    void(
        "MultiBodyConstraint_finalizeMultiDof",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultiBodyConstraint_getAppliedImpulse",
        "",

        opaque_p("obj", ""),
        int("dof", "")
    )

    int(
        "MultiBodyConstraint_getIslandIdA",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBodyConstraint_getIslandIdB",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultiBodyConstraint_getMaxAppliedImpulse",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "MultiBodyConstraint_getMultiBodyA",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "MultiBodyConstraint_getMultiBodyB",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBodyConstraint_getNumRows",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultiBodyConstraint_getPosition",
        "",

        opaque_p("obj", ""),
        int("row", "")
    )

    void(
        "MultiBodyConstraint_internalSetAppliedImpulse",
        "",

        opaque_p("obj", ""),
        int("dof", ""),
        btScalar("appliedImpulse", "")
    )

    bool(
        "MultiBodyConstraint_isUnilateral",
        "",

        opaque_p("obj", "")
    )

    //btScalar.p(
    opaque_p(
        "MultiBodyConstraint_jacobianA",
        "",

        opaque_p("obj", ""),
        int("row", "")
    )

    //btScalar.p(
    opaque_p(
        "MultiBodyConstraint_jacobianB",
        "",

        opaque_p("obj", ""),
        int("row", "")
    )

    void(
        "MultiBodyConstraint_setMaxAppliedImpulse",
        "",

        opaque_p("obj", ""),
        btScalar("maxImp", "")
    )

    void(
        "MultiBodyConstraint_setPosition",
        "",

        opaque_p("obj", ""),
        int("row", ""),
        btScalar("pos", "")
    )

    void(
        "MultiBodyConstraint_updateJacobianSizes",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBodyConstraint_delete",
        "",

        opaque_p("obj", "")
    )

}