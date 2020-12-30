/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btContactSolverInfo = "BTContactSolverInfo".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ContactSolverInfoData_new",
        "",

        void()
    )

    btScalar(
        "ContactSolverInfoData_getDamping",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getErp",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getErp2",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getFriction",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getFrictionCfm",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getFrictionErp",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getGlobalCfm",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getLeastSquaresResidualThreshold",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getLinearSlop",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getMaxErrorReduction",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getMaxGyroscopicForce",
        "",

        opaque_p("obj", "")
    )

    int(
        "ContactSolverInfoData_getMinimumSolverBatchSize",
        "",

        opaque_p("obj", "")
    )

    int(
        "ContactSolverInfoData_getNumIterations",
        "",

        opaque_p("obj", "")
    )

    int(
        "ContactSolverInfoData_getRestingContactRestitutionThreshold",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getRestitution",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getRestitutionVelocityThreshold",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getSingleAxisRollingFrictionThreshold",
        "",

        opaque_p("obj", "")
    )

    int(
        "ContactSolverInfoData_getSolverMode",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getSor",
        "",

        opaque_p("obj", "")
    )

    int(
        "ContactSolverInfoData_getSplitImpulse",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getSplitImpulsePenetrationThreshold",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getSplitImpulseTurnErp",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getTau",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getTimeStep",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ContactSolverInfoData_getWarmstartingFactor",
        "",

        opaque_p("obj", "")
    )

    void(
        "ContactSolverInfoData_setDamping",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setErp",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setErp2",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setFriction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setFrictionCfm",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setFrictionErp",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setGlobalCfm",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setLeastSquaresResidualThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setLinearSlop",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setMaxErrorReduction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setMaxGyroscopicForce",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setMinimumSolverBatchSize",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "ContactSolverInfoData_setNumIterations",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "ContactSolverInfoData_setRestingContactRestitutionThreshold",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "ContactSolverInfoData_setRestitution",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setRestitutionVelocityThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setSingleAxisRollingFrictionThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setSolverMode",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "ContactSolverInfoData_setSor",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setSplitImpulse",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "ContactSolverInfoData_setSplitImpulsePenetrationThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setSplitImpulseTurnErp",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setTau",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setTimeStep",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_setWarmstartingFactor",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ContactSolverInfoData_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "ContactSolverInfo_new",
        "",

        void()
    )

}