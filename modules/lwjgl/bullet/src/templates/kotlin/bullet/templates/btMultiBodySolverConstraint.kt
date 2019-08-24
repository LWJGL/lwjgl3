/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMultiBodySolverConstraint = "BTMultiBodySolverConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MultiBodySolverConstraint_new",
        "",

        void()
    )

    void(
        "MultiBodySolverConstraint_getAngularComponentA",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBodySolverConstraint_getAngularComponentB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "MultiBodySolverConstraint_getAppliedImpulse",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultiBodySolverConstraint_getAppliedPushImpulse",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultiBodySolverConstraint_getCfm",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBodySolverConstraint_getContactNormal1",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBodySolverConstraint_getContactNormal2",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int(
        "MultiBodySolverConstraint_getDeltaVelAindex",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBodySolverConstraint_getDeltaVelBindex",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultiBodySolverConstraint_getFriction",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBodySolverConstraint_getFrictionIndex",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBodySolverConstraint_getJacAindex",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBodySolverConstraint_getJacBindex",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultiBodySolverConstraint_getJacDiagABInv",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBodySolverConstraint_getLinkA",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBodySolverConstraint_getLinkB",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultiBodySolverConstraint_getLowerLimit",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "MultiBodySolverConstraint_getMultiBodyA",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "MultiBodySolverConstraint_getMultiBodyB",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "MultiBodySolverConstraint_getOrgConstraint",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBodySolverConstraint_getOrgDofIndex",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "MultiBodySolverConstraint_getOriginalContactPoint",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBodySolverConstraint_getOverrideNumSolverIterations",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBodySolverConstraint_getRelpos1CrossNormal",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBodySolverConstraint_getRelpos2CrossNormal",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "MultiBodySolverConstraint_getRhs",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultiBodySolverConstraint_getRhsPenetration",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBodySolverConstraint_getSolverBodyIdA",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBodySolverConstraint_getSolverBodyIdB",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultiBodySolverConstraint_getUnusedPadding4",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultiBodySolverConstraint_getUpperLimit",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBodySolverConstraint_setAngularComponentA",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "MultiBodySolverConstraint_setAngularComponentB",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "MultiBodySolverConstraint_setAppliedImpulse",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "MultiBodySolverConstraint_setAppliedPushImpulse",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "MultiBodySolverConstraint_setCfm",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "MultiBodySolverConstraint_setContactNormal1",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "MultiBodySolverConstraint_setContactNormal2",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "MultiBodySolverConstraint_setDeltaVelAindex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultiBodySolverConstraint_setDeltaVelBindex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultiBodySolverConstraint_setFriction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "MultiBodySolverConstraint_setFrictionIndex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultiBodySolverConstraint_setJacAindex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultiBodySolverConstraint_setJacBindex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultiBodySolverConstraint_setJacDiagABInv",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "MultiBodySolverConstraint_setLinkA",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultiBodySolverConstraint_setLinkB",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultiBodySolverConstraint_setLowerLimit",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "MultiBodySolverConstraint_setMultiBodyA",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "MultiBodySolverConstraint_setMultiBodyB",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "MultiBodySolverConstraint_setOrgConstraint",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "MultiBodySolverConstraint_setOrgDofIndex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultiBodySolverConstraint_setOriginalContactPoint",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "MultiBodySolverConstraint_setOverrideNumSolverIterations",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultiBodySolverConstraint_setRelpos1CrossNormal",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "MultiBodySolverConstraint_setRelpos2CrossNormal",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "MultiBodySolverConstraint_setRhs",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "MultiBodySolverConstraint_setRhsPenetration",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "MultiBodySolverConstraint_setSolverBodyIdA",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultiBodySolverConstraint_setSolverBodyIdB",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultiBodySolverConstraint_setUnusedPadding4",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "MultiBodySolverConstraint_setUpperLimit",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "MultiBodySolverConstraint_delete",
        "",

        opaque_p("obj", "")
    )

}