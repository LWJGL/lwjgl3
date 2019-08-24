/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btTypedConstraint = "BTTypedConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "JointFeedback_new",
        "",

        void()
    )

    void(
        "JointFeedback_getAppliedForceBodyA",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "JointFeedback_getAppliedForceBodyB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "JointFeedback_getAppliedTorqueBodyA",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "JointFeedback_getAppliedTorqueBodyB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "JointFeedback_setAppliedForceBodyA",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "JointFeedback_setAppliedForceBodyB",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "JointFeedback_setAppliedTorqueBodyA",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "JointFeedback_setAppliedTorqueBodyB",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "JointFeedback_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "TypedConstraint_btConstraintInfo1_new",
        "",

        void()
    )

    int(
        "TypedConstraint_btConstraintInfo1_getNub",
        "",

        opaque_p("obj", "")
    )

    int(
        "TypedConstraint_btConstraintInfo1_getNumConstraintRows",
        "",

        opaque_p("obj", "")
    )

    void(
        "TypedConstraint_btConstraintInfo1_setNub",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "TypedConstraint_btConstraintInfo1_setNumConstraintRows",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "TypedConstraint_btConstraintInfo1_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "TypedConstraint_btConstraintInfo2_new",
        "",

        void()
    )

    btScalar[1](
        "TypedConstraint_btConstraintInfo2_getCfm",
        "",

        opaque_p("obj", "")
    )

    btScalar[1](
        "TypedConstraint_btConstraintInfo2_getConstraintError",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TypedConstraint_btConstraintInfo2_getDamping",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TypedConstraint_btConstraintInfo2_getErp",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TypedConstraint_btConstraintInfo2_getFps",
        "",

        opaque_p("obj", "")
    )

    //btScalar.p(
    opaque_p(
        "TypedConstraint_btConstraintInfo2_getJ1angularAxis",
        "",

        opaque_p("obj", "")
    )

    //btScalar.p(
    opaque_p(
        "TypedConstraint_btConstraintInfo2_getJ1linearAxis",
        "",

        opaque_p("obj", "")
    )

    //btScalar.p(
    opaque_p(
        "TypedConstraint_btConstraintInfo2_getJ2angularAxis",
        "",

        opaque_p("obj", "")
    )

    //btScalar.p(
    opaque_p(
        "TypedConstraint_btConstraintInfo2_getJ2linearAxis",
        "",

        opaque_p("obj", "")
    )

    btScalar[1](
        "TypedConstraint_btConstraintInfo2_getLowerLimit",
        "",

        opaque_p("obj", "")
    )

    int(
        "TypedConstraint_btConstraintInfo2_getNumIterations",
        "",

        opaque_p("obj", "")
    )

    int(
        "TypedConstraint_btConstraintInfo2_getRowskip",
        "",

        opaque_p("obj", "")
    )

    btScalar[1](
        "TypedConstraint_btConstraintInfo2_getUpperLimit",
        "",

        opaque_p("obj", "")
    )

    void(
        "TypedConstraint_btConstraintInfo2_setCfm",
        "",

        opaque_p("obj", ""),
        Check(1)..btScalar.p("value", "")
    )

    void(
        "TypedConstraint_btConstraintInfo2_setConstraintError",
        "",

        opaque_p("obj", ""),
        Check(1)..btScalar.p("value", "")
    )

    void(
        "TypedConstraint_btConstraintInfo2_setDamping",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "TypedConstraint_btConstraintInfo2_setErp",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "TypedConstraint_btConstraintInfo2_setFps",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "TypedConstraint_btConstraintInfo2_setJ1angularAxis",
        "",

        opaque_p("obj", ""),
        Unsafe..btScalar.p("value", "")
    )

    void(
        "TypedConstraint_btConstraintInfo2_setJ1linearAxis",
        "",

        opaque_p("obj", ""),
        Unsafe..btScalar.p("value", "")
    )

    void(
        "TypedConstraint_btConstraintInfo2_setJ2angularAxis",
        "",

        opaque_p("obj", ""),
        Unsafe..nullable..btScalar.p("value", "")
    )

    void(
        "TypedConstraint_btConstraintInfo2_setJ2linearAxis",
        "",

        opaque_p("obj", ""),
        Unsafe..nullable..btScalar.p("value", "")
    )

    void(
        "TypedConstraint_btConstraintInfo2_setLowerLimit",
        "",

        opaque_p("obj", ""),
        Check(1)..btScalar.p("value", "")
    )

    void(
        "TypedConstraint_btConstraintInfo2_setNumIterations",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "TypedConstraint_btConstraintInfo2_setRowskip",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "TypedConstraint_btConstraintInfo2_setUpperLimit",
        "",

        opaque_p("obj", ""),
        Check(1)..btScalar.p("value", "")
    )

    void(
        "TypedConstraint_btConstraintInfo2_delete",
        "",

        opaque_p("obj", "")
    )

    void(
        "TypedConstraint_buildJacobian",
        "",

        opaque_p("obj", "")
    )

    int(
        "TypedConstraint_calculateSerializeBufferSize",
        "",

        opaque_p("obj", "")
    )

    void(
        "TypedConstraint_enableFeedback",
        "",

        opaque_p("obj", ""),
        bool("needsFeedback", "")
    )

    btScalar(
        "TypedConstraint_getAppliedImpulse",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TypedConstraint_getBreakingImpulseThreshold",
        "",

        opaque_p("obj", "")
    )

    int(
        "TypedConstraint_getConstraintType",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TypedConstraint_getDbgDrawSize",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "TypedConstraint_getFixedBody",
        "",

        void()
    )

    void(
        "TypedConstraint_getInfo1",
        "",

        opaque_p("obj", ""),
        opaque_p("info", "")
    )

    void(
        "TypedConstraint_getInfo2",
        "",

        opaque_p("obj", ""),
        opaque_p("info", "")
    )

    opaque_p(
        "TypedConstraint_getJointFeedback",
        "",

        opaque_p("obj", "")
    )

    int(
        "TypedConstraint_getOverrideNumSolverIterations",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TypedConstraint_getParam",
        "",

        opaque_p("obj", ""),
        int("num", "")
    )

    btScalar(
        "TypedConstraint_getParam2",
        "",

        opaque_p("obj", ""),
        int("num", ""),
        int("axis", "")
    )

    opaque_p(
        "TypedConstraint_getRigidBodyA",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "TypedConstraint_getRigidBodyB",
        "",

        opaque_p("obj", "")
    )

    int(
        "TypedConstraint_getUid",
        "",

        opaque_p("obj", "")
    )

    int(
        "TypedConstraint_getUserConstraintId",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "TypedConstraint_getUserConstraintPtr",
        "",

        opaque_p("obj", "")
    )

    int(
        "TypedConstraint_getUserConstraintType",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TypedConstraint_internalGetAppliedImpulse",
        "",

        opaque_p("obj", "")
    )

    void(
        "TypedConstraint_internalSetAppliedImpulse",
        "",

        opaque_p("obj", ""),
        btScalar("appliedImpulse", "")
    )

    bool(
        "TypedConstraint_isEnabled",
        "",

        opaque_p("obj", "")
    )

    bool(
        "TypedConstraint_needsFeedback",
        "",

        opaque_p("obj", "")
    )

    charUTF8.const.p(
        "TypedConstraint_serialize",
        "",

        opaque_p("obj", ""),
        opaque_p("dataBuffer", ""),
        opaque_p("serializer", "")
    )

    void(
        "TypedConstraint_setBreakingImpulseThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("threshold", "")
    )

    void(
        "TypedConstraint_setDbgDrawSize",
        "",

        opaque_p("obj", ""),
        btScalar("dbgDrawSize", "")
    )

    void(
        "TypedConstraint_setEnabled",
        "",

        opaque_p("obj", ""),
        bool("enabled", "")
    )

    void(
        "TypedConstraint_setJointFeedback",
        "",

        opaque_p("obj", ""),
        opaque_p("jointFeedback", "")
    )

    void(
        "TypedConstraint_setOverrideNumSolverIterations",
        "",

        opaque_p("obj", ""),
        int("overideNumIterations", "")
    )

    void(
        "TypedConstraint_setParam",
        "",

        opaque_p("obj", ""),
        int("num", ""),
        btScalar("value", "")
    )

    void(
        "TypedConstraint_setParam2",
        "",

        opaque_p("obj", ""),
        int("num", ""),
        btScalar("value", ""),
        int("axis", "")
    )

    void(
        "TypedConstraint_setupSolverConstraint",
        "",

        opaque_p("obj", ""),
        opaque_p("ca", ""),
        int("solverBodyA", ""),
        int("solverBodyB", ""),
        btScalar("timeStep", "")
    )

    void(
        "TypedConstraint_setUserConstraintId",
        "",

        opaque_p("obj", ""),
        int("uid", "")
    )

    void(
        "TypedConstraint_setUserConstraintPtr",
        "",

        opaque_p("obj", ""),
        opaque_p("ptr", "")
    )

    void(
        "TypedConstraint_setUserConstraintType",
        "",

        opaque_p("obj", ""),
        int("userConstraintType", "")
    )

    void(
        "TypedConstraint_solveConstraintObsolete",
        "",

        opaque_p("obj", ""),
        opaque_p("__unnamed0", ""),
        opaque_p("__unnamed1", ""),
        btScalar("__unnamed2", "")
    )

    void(
        "TypedConstraint_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AngularLimit_new",
        "",

        void()
    )

    void(
        "AngularLimit_fit",
        "Checks given angle against limit. If limit is active and angle doesn't fit it, the angle returned is modified so it equals to the limit closest to given angle.",

        opaque_p("obj", ""),
        Check(1)..btScalar.p("angle", "")
    )

    btScalar(
        "AngularLimit_getBiasFactor",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "AngularLimit_getCorrection",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "AngularLimit_getError",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "AngularLimit_getHalfRange",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "AngularLimit_getHigh",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "AngularLimit_getLow",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "AngularLimit_getRelaxationFactor",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "AngularLimit_getSign",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "AngularLimit_getSoftness",
        "",

        opaque_p("obj", "")
    )

    bool(
        "AngularLimit_isLimit",
        "",

        opaque_p("obj", "")
    )

    void(
        "AngularLimit_set",
        "",

        opaque_p("obj", ""),
        btScalar("low", ""),
        btScalar("high", ""),
        btScalar("_softness", ""),
        btScalar("_biasFactor", ""),
        btScalar("_relaxationFactor", "")
    )

    void(
        "AngularLimit_test",
        "",

        opaque_p("obj", ""),
        btScalar("angle", "")
    )

    void(
        "AngularLimit_delete",
        "",

        opaque_p("obj", "")
    )

}