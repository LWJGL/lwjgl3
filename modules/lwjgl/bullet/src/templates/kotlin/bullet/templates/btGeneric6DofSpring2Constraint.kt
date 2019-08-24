/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btGeneric6DofSpring2Constraint = "BTGeneric6DofSpring2Constraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "RotationalLimitMotor2_new",
        "",

        void()
    )

    opaque_p(
        "RotationalLimitMotor2_new2",
        "",

        opaque_p("limot", "")
    )

    btScalar(
        "RotationalLimitMotor2_getBounce",
        "",

        opaque_p("obj", "")
    )

    int(
        "RotationalLimitMotor2_getCurrentLimit",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor2_getCurrentLimitError",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor2_getCurrentLimitErrorHi",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor2_getCurrentPosition",
        "",

        opaque_p("obj", "")
    )

    bool(
        "RotationalLimitMotor2_getEnableMotor",
        "",

        opaque_p("obj", "")
    )

    bool(
        "RotationalLimitMotor2_getEnableSpring",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor2_getEquilibriumPoint",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor2_getHiLimit",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor2_getLoLimit",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor2_getMaxMotorForce",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor2_getMotorCFM",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor2_getMotorERP",
        "",

        opaque_p("obj", "")
    )

    bool(
        "RotationalLimitMotor2_getServoMotor",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor2_getServoTarget",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor2_getSpringDamping",
        "",

        opaque_p("obj", "")
    )

    bool(
        "RotationalLimitMotor2_getSpringDampingLimited",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor2_getSpringStiffness",
        "",

        opaque_p("obj", "")
    )

    bool(
        "RotationalLimitMotor2_getSpringStiffnessLimited",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor2_getStopCFM",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor2_getStopERP",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor2_getTargetVelocity",
        "",

        opaque_p("obj", "")
    )

    bool(
        "RotationalLimitMotor2_isLimited",
        "",

        opaque_p("obj", "")
    )

    void(
        "RotationalLimitMotor2_setBounce",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_setCurrentLimit",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "RotationalLimitMotor2_setCurrentLimitError",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_setCurrentLimitErrorHi",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_setCurrentPosition",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_setEnableMotor",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "RotationalLimitMotor2_setEnableSpring",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "RotationalLimitMotor2_setEquilibriumPoint",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_setHiLimit",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_setLoLimit",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_setMaxMotorForce",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_setMotorCFM",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_setMotorERP",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_setServoMotor",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "RotationalLimitMotor2_setServoTarget",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_setSpringDamping",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_setSpringDampingLimited",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "RotationalLimitMotor2_setSpringStiffness",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_setSpringStiffnessLimited",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "RotationalLimitMotor2_setStopCFM",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_setStopERP",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_setTargetVelocity",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor2_testLimitValue",
        "",

        opaque_p("obj", ""),
        btScalar("test_value", "")
    )

    void(
        "RotationalLimitMotor2_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "TranslationalLimitMotor2_new",
        "",

        void()
    )

    opaque_p(
        "TranslationalLimitMotor2_new2",
        "",

        opaque_p("other", "")
    )

    void(
        "TranslationalLimitMotor2_getBounce",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int[3](
        "TranslationalLimitMotor2_getCurrentLimit",
        "",

        opaque_p("obj", "")
    )

    void(
        "TranslationalLimitMotor2_getCurrentLimitError",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_getCurrentLimitErrorHi",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_getCurrentLinearDiff",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    bool[3](
        "TranslationalLimitMotor2_getEnableMotor",
        "",

        opaque_p("obj", "")
    )

    bool[3](
        "TranslationalLimitMotor2_getEnableSpring",
        "",

        opaque_p("obj", "")
    )

    void(
        "TranslationalLimitMotor2_getEquilibriumPoint",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_getLowerLimit",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_getMaxMotorForce",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_getMotorCFM",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_getMotorERP",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    bool[3](
        "TranslationalLimitMotor2_getServoMotor",
        "",

        opaque_p("obj", "")
    )

    void(
        "TranslationalLimitMotor2_getServoTarget",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_getSpringDamping",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    bool[3](
        "TranslationalLimitMotor2_getSpringDampingLimited",
        "",

        opaque_p("obj", "")
    )

    void(
        "TranslationalLimitMotor2_getSpringStiffness",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    bool[3](
        "TranslationalLimitMotor2_getSpringStiffnessLimited",
        "",

        opaque_p("obj", "")
    )

    void(
        "TranslationalLimitMotor2_getStopCFM",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_getStopERP",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_getTargetVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_getUpperLimit",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    bool(
        "TranslationalLimitMotor2_isLimited",
        "",

        opaque_p("obj", ""),
        int("limitIndex", "")
    )

    void(
        "TranslationalLimitMotor2_setBounce",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_setCurrentLimitError",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_setCurrentLimitErrorHi",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_setCurrentLinearDiff",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_setEquilibriumPoint",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_setLowerLimit",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_setMaxMotorForce",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_setMotorCFM",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_setMotorERP",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_setServoTarget",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_setSpringDamping",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_setSpringStiffness",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_setStopCFM",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_setStopERP",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_setTargetVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_setUpperLimit",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor2_testLimitValue",
        "",

        opaque_p("obj", ""),
        int("limitIndex", ""),
        btScalar("test_value", "")
    )

    void(
        "TranslationalLimitMotor2_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Generic6DofSpring2Constraint_new",
        "",

        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("frameInA", ""),
        btTransform.const.p("frameInB", ""),
        int("rotOrder", "")
    )

    opaque_p(
        "Generic6DofSpring2Constraint_new2",
        "",

        opaque_p("rbB", ""),
        btTransform.const.p("frameInB", ""),
        int("rotOrder", "")
    )

    btScalar(
        "Generic6DofSpring2Constraint_btGetMatrixElem",
        "",

        btMatrix3x3.const.p("mat", ""),
        int("index", "")
    )

    void(
        "Generic6DofSpring2Constraint_calculateTransforms",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", "")
    )

    void(
        "Generic6DofSpring2Constraint_calculateTransforms2",
        "",

        opaque_p("obj", "")
    )

    void(
        "Generic6DofSpring2Constraint_enableMotor",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        bool("onOff", "")
    )

    void(
        "Generic6DofSpring2Constraint_enableSpring",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        bool("onOff", "")
    )

    btScalar(
        "Generic6DofSpring2Constraint_getAngle",
        "",

        opaque_p("obj", ""),
        int("axis_index", "")
    )

    void(
        "Generic6DofSpring2Constraint_getAngularLowerLimit",
        "",

        opaque_p("obj", ""),
        btVector3.p("angularLower", "")
    )

    void(
        "Generic6DofSpring2Constraint_getAngularLowerLimitReversed",
        "",

        opaque_p("obj", ""),
        btVector3.p("angularLower", "")
    )

    void(
        "Generic6DofSpring2Constraint_getAngularUpperLimit",
        "",

        opaque_p("obj", ""),
        btVector3.p("angularUpper", "")
    )

    void(
        "Generic6DofSpring2Constraint_getAngularUpperLimitReversed",
        "",

        opaque_p("obj", ""),
        btVector3.p("angularUpper", "")
    )

    void(
        "Generic6DofSpring2Constraint_getAxis",
        "",

        opaque_p("obj", ""),
        int("axis_index", ""),
        btVector3.p("value", "")
    )

    void(
        "Generic6DofSpring2Constraint_getCalculatedTransformA",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "Generic6DofSpring2Constraint_getCalculatedTransformB",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "Generic6DofSpring2Constraint_getFrameOffsetA",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "Generic6DofSpring2Constraint_getFrameOffsetB",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "Generic6DofSpring2Constraint_getLinearLowerLimit",
        "",

        opaque_p("obj", ""),
        btVector3.p("linearLower", "")
    )

    void(
        "Generic6DofSpring2Constraint_getLinearUpperLimit",
        "",

        opaque_p("obj", ""),
        btVector3.p("linearUpper", "")
    )

    btScalar(
        "Generic6DofSpring2Constraint_getRelativePivotPosition",
        "",

        opaque_p("obj", ""),
        int("axis_index", "")
    )

    opaque_p(
        "Generic6DofSpring2Constraint_getRotationalLimitMotor",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    int(
        "Generic6DofSpring2Constraint_getRotationOrder",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Generic6DofSpring2Constraint_getTranslationalLimitMotor",
        "",

        opaque_p("obj", "")
    )

    bool(
        "Generic6DofSpring2Constraint_isLimited",
        "",

        opaque_p("obj", ""),
        int("limitIndex", "")
    )

    bool(
        "Generic6DofSpring2Constraint_matrixToEulerZXY",
        "",

        btMatrix3x3.const.p("mat", ""),
        btVector3.p("xyz", "")
    )

    bool(
        "Generic6DofSpring2Constraint_matrixToEulerZYX",
        "",

        btMatrix3x3.const.p("mat", ""),
        btVector3.p("xyz", "")
    )

    bool(
        "Generic6DofSpring2Constraint_matrixToEulerXZY",
        "",

        btMatrix3x3.const.p("mat", ""),
        btVector3.p("xyz", "")
    )

    bool(
        "Generic6DofSpring2Constraint_matrixToEulerXYZ",
        "",

        btMatrix3x3.const.p("mat", ""),
        btVector3.p("xyz", "")
    )

    bool(
        "Generic6DofSpring2Constraint_matrixToEulerYZX",
        "",

        btMatrix3x3.const.p("mat", ""),
        btVector3.p("xyz", "")
    )

    bool(
        "Generic6DofSpring2Constraint_matrixToEulerYXZ",
        "",

        btMatrix3x3.const.p("mat", ""),
        btVector3.p("xyz", "")
    )

    void(
        "Generic6DofSpring2Constraint_setAngularLowerLimit",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("angularLower", "")
    )

    void(
        "Generic6DofSpring2Constraint_setAngularLowerLimitReversed",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("angularLower", "")
    )

    void(
        "Generic6DofSpring2Constraint_setAngularUpperLimit",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("angularUpper", "")
    )

    void(
        "Generic6DofSpring2Constraint_setAngularUpperLimitReversed",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("angularUpper", "")
    )

    void(
        "Generic6DofSpring2Constraint_setAxis",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("axis1", ""),
        btVector3.const.p("axis2", "")
    )

    void(
        "Generic6DofSpring2Constraint_setBounce",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btScalar("bounce", "")
    )

    void(
        "Generic6DofSpring2Constraint_setDamping",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btScalar("damping", ""),
        bool("limitIfNeeded", "")
    )

    void(
        "Generic6DofSpring2Constraint_setEquilibriumPoint",
        "",

        opaque_p("obj", "")
    )

    void(
        "Generic6DofSpring2Constraint_setEquilibriumPoint2",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btScalar("val", "")
    )

    void(
        "Generic6DofSpring2Constraint_setEquilibriumPoint3",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "Generic6DofSpring2Constraint_setFrames",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("frameA", ""),
        btTransform.const.p("frameB", "")
    )

    void(
        "Generic6DofSpring2Constraint_setLimit",
        "",

        opaque_p("obj", ""),
        int("axis", ""),
        btScalar("lo", ""),
        btScalar("hi", "")
    )

    void(
        "Generic6DofSpring2Constraint_setLimitReversed",
        "",

        opaque_p("obj", ""),
        int("axis", ""),
        btScalar("lo", ""),
        btScalar("hi", "")
    )

    void(
        "Generic6DofSpring2Constraint_setLinearLowerLimit",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("linearLower", "")
    )

    void(
        "Generic6DofSpring2Constraint_setLinearUpperLimit",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("linearUpper", "")
    )

    void(
        "Generic6DofSpring2Constraint_setMaxMotorForce",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btScalar("force", "")
    )

    void(
        "Generic6DofSpring2Constraint_setRotationOrder",
        "",

        opaque_p("obj", ""),
        int("order", "")
    )

    void(
        "Generic6DofSpring2Constraint_setServo",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        bool("onOff", "")
    )

    void(
        "Generic6DofSpring2Constraint_setServoTarget",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btScalar("target", "")
    )

    void(
        "Generic6DofSpring2Constraint_setStiffness",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btScalar("stiffness", ""),
        bool("limitIfNeeded", "")
    )

    void(
        "Generic6DofSpring2Constraint_setTargetVelocity",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btScalar("velocity", "")
    )

}