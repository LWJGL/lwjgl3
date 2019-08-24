/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConeTwistConstraint = "BTConeTwistConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ConeTwistConstraint_new",
        "",

        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("rbAFrame", ""),
        btTransform.const.p("rbBFrame", "")
    )

    opaque_p(
        "ConeTwistConstraint_new2",
        "",

        opaque_p("rbA", ""),
        btTransform.const.p("rbAFrame", "")
    )

    void(
        "ConeTwistConstraint_calcAngleInfo",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConeTwistConstraint_calcAngleInfo2",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", ""),
        btMatrix3x3.const.p("invInertiaWorldA", ""),
        btMatrix3x3.const.p("invInertiaWorldB", "")
    )

    void(
        "ConeTwistConstraint_enableMotor",
        "",

        opaque_p("obj", ""),
        bool("b", "")
    )

    void(
        "ConeTwistConstraint_getAFrame",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    bool(
        "ConeTwistConstraint_getAngularOnly",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConeTwistConstraint_getBFrame",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    btScalar(
        "ConeTwistConstraint_getBiasFactor",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ConeTwistConstraint_getDamping",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ConeTwistConstraint_getFixThresh",
        "",

        opaque_p("obj", "")
    )

    int(
        "ConeTwistConstraint_getFlags",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConeTwistConstraint_getFrameOffsetA",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "ConeTwistConstraint_getFrameOffsetB",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "ConeTwistConstraint_getInfo1NonVirtual",
        "",

        opaque_p("obj", ""),
        opaque_p("info", "")
    )

    void(
        "ConeTwistConstraint_getInfo2NonVirtual",
        "",

        opaque_p("obj", ""),
        opaque_p("info", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", ""),
        btMatrix3x3.const.p("invInertiaWorldA", ""),
        btMatrix3x3.const.p("invInertiaWorldB", "")
    )

    btScalar(
        "ConeTwistConstraint_getLimit",
        "",

        opaque_p("obj", ""),
        int("limitIndex", "")
    )

    btScalar(
        "ConeTwistConstraint_getLimitSoftness",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ConeTwistConstraint_getMaxMotorImpulse",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConeTwistConstraint_getMotorTarget",
        "",

        opaque_p("obj", ""),
        btQuaternion.p("value", "")
    )

    void(
        "ConeTwistConstraint_GetPointForAngle",
        "",

        opaque_p("obj", ""),
        btScalar("fAngleInRadians", ""),
        btScalar("fLength", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "ConeTwistConstraint_getRelaxationFactor",
        "",

        opaque_p("obj", "")
    )

    int(
        "ConeTwistConstraint_getSolveSwingLimit",
        "",

        opaque_p("obj", "")
    )

    int(
        "ConeTwistConstraint_getSolveTwistLimit",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ConeTwistConstraint_getSwingSpan1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ConeTwistConstraint_getSwingSpan2",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ConeTwistConstraint_getTwistAngle",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ConeTwistConstraint_getTwistLimitSign",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ConeTwistConstraint_getTwistSpan",
        "",

        opaque_p("obj", "")
    )

    bool(
        "ConeTwistConstraint_isMaxMotorImpulseNormalized",
        "",

        opaque_p("obj", "")
    )

    bool(
        "ConeTwistConstraint_isMotorEnabled",
        "",

        opaque_p("obj", "")
    )

    bool(
        "ConeTwistConstraint_isPastSwingLimit",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConeTwistConstraint_setAngularOnly",
        "",

        opaque_p("obj", ""),
        bool("angularOnly", "")
    )

    void(
        "ConeTwistConstraint_setDamping",
        "",

        opaque_p("obj", ""),
        btScalar("damping", "")
    )

    void(
        "ConeTwistConstraint_setFixThresh",
        "",

        opaque_p("obj", ""),
        btScalar("fixThresh", "")
    )

    void(
        "ConeTwistConstraint_setFrames",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("frameA", ""),
        btTransform.const.p("frameB", "")
    )

    void(
        "ConeTwistConstraint_setLimit",
        "",

        opaque_p("obj", ""),
        int("limitIndex", ""),
        btScalar("limitValue", "")
    )

    void(
        "ConeTwistConstraint_setLimit2",
        "",

        opaque_p("obj", ""),
        btScalar("_swingSpan1", ""),
        btScalar("_swingSpan2", ""),
        btScalar("_twistSpan", ""),
        btScalar("_softness", ""),
        btScalar("_biasFactor", ""),
        btScalar("_relaxationFactor", "")
    )

    void(
        "ConeTwistConstraint_setMaxMotorImpulse",
        "",

        opaque_p("obj", ""),
        btScalar("maxMotorImpulse", "")
    )

    void(
        "ConeTwistConstraint_setMaxMotorImpulseNormalized",
        "",

        opaque_p("obj", ""),
        btScalar("maxMotorImpulse", "")
    )

    void(
        "ConeTwistConstraint_setMotorTarget",
        "",

        opaque_p("obj", ""),
        btQuaternion.const.p("q", "")
    )

    void(
        "ConeTwistConstraint_setMotorTargetInConstraintSpace",
        "",

        opaque_p("obj", ""),
        btQuaternion.const.p("q", "")
    )

    void(
        "ConeTwistConstraint_updateRHS",
        "",

        opaque_p("obj", ""),
        btScalar("timeStep", "")
    )

}