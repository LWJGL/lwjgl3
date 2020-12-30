/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btHingeConstraint = "BTHingeConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "HingeConstraint_new",
        "",

        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btVector3.const.p("pivotInA", ""),
        btVector3.const.p("pivotInB", ""),
        btVector3.const.p("axisInA", ""),
        btVector3.const.p("axisInB", ""),
        bool("useReferenceFrameA", "")
    )

    opaque_p(
        "HingeConstraint_new2",
        "",

        opaque_p("rbA", ""),
        btVector3.const.p("pivotInA", ""),
        btVector3.const.p("axisInA", ""),
        bool("useReferenceFrameA", "")
    )

    opaque_p(
        "HingeConstraint_new3",
        "",

        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("rbAFrame", ""),
        btTransform.const.p("rbBFrame", ""),
        bool("useReferenceFrameA", "")
    )

    opaque_p(
        "HingeConstraint_new4",
        "",

        opaque_p("rbA", ""),
        btTransform.const.p("rbAFrame", ""),
        bool("useReferenceFrameA", "")
    )

    void(
        "HingeConstraint_enableAngularMotor",
        "",

        opaque_p("obj", ""),
        bool("enableMotor", ""),
        btScalar("targetVelocity", ""),
        btScalar("maxMotorImpulse", "")
    )

    void(
        "HingeConstraint_enableMotor",
        "",

        opaque_p("obj", ""),
        bool("enableMotor", "")
    )

    void(
        "HingeConstraint_getAFrame",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    bool(
        "HingeConstraint_getAngularOnly",
        "",

        opaque_p("obj", "")
    )

    void(
        "HingeConstraint_getBFrame",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    bool(
        "HingeConstraint_getEnableAngularMotor",
        "",

        opaque_p("obj", "")
    )

    int(
        "HingeConstraint_getFlags",
        "",

        opaque_p("obj", "")
    )

    void(
        "HingeConstraint_getFrameOffsetA",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "HingeConstraint_getFrameOffsetB",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    btScalar(
        "HingeConstraint_getHingeAngle",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", "")
    )

    btScalar(
        "HingeConstraint_getHingeAngle2",
        "",

        opaque_p("obj", "")
    )

    void(
        "HingeConstraint_getInfo1NonVirtual",
        "",

        opaque_p("obj", ""),
        opaque_p("info", "")
    )

    void(
        "HingeConstraint_getInfo2Internal",
        "",

        opaque_p("obj", ""),
        opaque_p("info", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", ""),
        btVector3.const.p("angVelA", ""),
        btVector3.const.p("angVelB", "")
    )

    void(
        "HingeConstraint_getInfo2InternalUsingFrameOffset",
        "",

        opaque_p("obj", ""),
        opaque_p("info", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", ""),
        btVector3.const.p("angVelA", ""),
        btVector3.const.p("angVelB", "")
    )

    void(
        "HingeConstraint_getInfo2NonVirtual",
        "",

        opaque_p("obj", ""),
        opaque_p("info", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", ""),
        btVector3.const.p("angVelA", ""),
        btVector3.const.p("angVelB", "")
    )

    btScalar(
        "HingeConstraint_getLimitBiasFactor",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "HingeConstraint_getLimitRelaxationFactor",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "HingeConstraint_getLimitSign",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "HingeConstraint_getLimitSoftness",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "HingeConstraint_getLowerLimit",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "HingeConstraint_getMaxMotorImpulse",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "HingeConstraint_getMotorTargetVelocity",
        "",

        opaque_p("obj", "")
    )

    int(
        "HingeConstraint_getSolveLimit",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "HingeConstraint_getUpperLimit",
        "",

        opaque_p("obj", "")
    )

    bool(
        "HingeConstraint_getUseFrameOffset",
        "",

        opaque_p("obj", "")
    )

    bool(
        "HingeConstraint_getUseReferenceFrameA",
        "",

        opaque_p("obj", "")
    )

    bool(
        "HingeConstraint_hasLimit",
        "",

        opaque_p("obj", "")
    )

    void(
        "HingeConstraint_setAngularOnly",
        "",

        opaque_p("obj", ""),
        bool("angularOnly", "")
    )

    void(
        "HingeConstraint_setAxis",
        "",

        opaque_p("obj", ""),
        btVector3.p("axisInA", "")
    )

    void(
        "HingeConstraint_setFrames",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("frameA", ""),
        btTransform.const.p("frameB", "")
    )

    void(
        "HingeConstraint_setLimit",
        "",

        opaque_p("obj", ""),
        btScalar("low", ""),
        btScalar("high", "")
    )

    void(
        "HingeConstraint_setLimit2",
        "",

        opaque_p("obj", ""),
        btScalar("low", ""),
        btScalar("high", ""),
        btScalar("_softness", "")
    )

    void(
        "HingeConstraint_setLimit3",
        "",

        opaque_p("obj", ""),
        btScalar("low", ""),
        btScalar("high", ""),
        btScalar("_softness", ""),
        btScalar("_biasFactor", "")
    )

    void(
        "HingeConstraint_setLimit4",
        "",

        opaque_p("obj", ""),
        btScalar("low", ""),
        btScalar("high", ""),
        btScalar("_softness", ""),
        btScalar("_biasFactor", ""),
        btScalar("_relaxationFactor", "")
    )

    void(
        "HingeConstraint_setMaxMotorImpulse",
        "",

        opaque_p("obj", ""),
        btScalar("maxMotorImpulse", "")
    )

    void(
        "HingeConstraint_setMotorTarget",
        "",

        opaque_p("obj", ""),
        btScalar("targetAngle", ""),
        btScalar("dt", "")
    )

    void(
        "HingeConstraint_setMotorTarget2",
        "",

        opaque_p("obj", ""),
        btQuaternion.const.p("qAinB", ""),
        btScalar("dt", "")
    )

    void(
        "HingeConstraint_setMotorTargetVelocity",
        "",

        opaque_p("obj", ""),
        btScalar("motorTargetVelocity", "")
    )

    void(
        "HingeConstraint_setUseFrameOffset",
        "",

        opaque_p("obj", ""),
        bool("frameOffsetOnOff", "")
    )

    void(
        "HingeConstraint_setUseReferenceFrameA",
        "",

        opaque_p("obj", ""),
        bool("useReferenceFrameA", "")
    )

    void(
        "HingeConstraint_testLimit",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", "")
    )

    void(
        "HingeConstraint_updateRHS",
        "",

        opaque_p("obj", ""),
        btScalar("timeStep", "")
    )

    opaque_p(
        "HingeAccumulatedAngleConstraint_new",
        "",

        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btVector3.const.p("pivotInA", ""),
        btVector3.const.p("pivotInB", ""),
        btVector3.const.p("axisInA", ""),
        btVector3.const.p("axisInB", ""),
        bool("useReferenceFrameA", "")
    )

    opaque_p(
        "HingeAccumulatedAngleConstraint_new2",
        "",

        opaque_p("rbA", ""),
        btVector3.const.p("pivotInA", ""),
        btVector3.const.p("axisInA", ""),
        bool("useReferenceFrameA", "")
    )

    opaque_p(
        "HingeAccumulatedAngleConstraint_new3",
        "",

        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("rbAFrame", ""),
        btTransform.const.p("rbBFrame", ""),
        bool("useReferenceFrameA", "")
    )

    opaque_p(
        "HingeAccumulatedAngleConstraint_new4",
        "",

        opaque_p("rbA", ""),
        btTransform.const.p("rbAFrame", ""),
        bool("useReferenceFrameA", "")
    )

    btScalar(
        "HingeAccumulatedAngleConstraint_getAccumulatedHingeAngle",
        "",

        opaque_p("obj", "")
    )

    void(
        "HingeAccumulatedAngleConstraint_setAccumulatedHingeAngle",
        "",

        opaque_p("obj", ""),
        btScalar("accAngle", "")
    )

}