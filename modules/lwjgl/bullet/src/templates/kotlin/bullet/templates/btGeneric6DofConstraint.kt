/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btGeneric6DofConstraint = "BTGeneric6DofConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "RotationalLimitMotor_new",
        "",

        void()
    )

    opaque_p(
        "RotationalLimitMotor_new2",
        "",

        opaque_p("limot", "")
    )

    btScalar(
        "RotationalLimitMotor_getAccumulatedImpulse",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor_getBounce",
        "",

        opaque_p("obj", "")
    )

    int(
        "RotationalLimitMotor_getCurrentLimit",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor_getCurrentLimitError",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor_getCurrentPosition",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor_getDamping",
        "",

        opaque_p("obj", "")
    )

    bool(
        "RotationalLimitMotor_getEnableMotor",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor_getHiLimit",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor_getLimitSoftness",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor_getLoLimit",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor_getMaxLimitForce",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor_getMaxMotorForce",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor_getNormalCFM",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor_getStopCFM",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor_getStopERP",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RotationalLimitMotor_getTargetVelocity",
        "",

        opaque_p("obj", "")
    )

    bool(
        "RotationalLimitMotor_isLimited",
        "",

        opaque_p("obj", "")
    )

    bool(
        "RotationalLimitMotor_needApplyTorques",
        "",

        opaque_p("obj", "")
    )

    void(
        "RotationalLimitMotor_setAccumulatedImpulse",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor_setBounce",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor_setCurrentLimit",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "RotationalLimitMotor_setCurrentLimitError",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor_setCurrentPosition",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor_setDamping",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor_setEnableMotor",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "RotationalLimitMotor_setHiLimit",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor_setLimitSoftness",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor_setLoLimit",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor_setMaxLimitForce",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor_setMaxMotorForce",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor_setNormalCFM",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor_setStopCFM",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor_setStopERP",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RotationalLimitMotor_setTargetVelocity",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    btScalar(
        "RotationalLimitMotor_solveAngularLimits",
        "",

        opaque_p("obj", ""),
        btScalar("timeStep", ""),
        btVector3.p("axis", ""),
        btScalar("jacDiagABInv", ""),
        opaque_p("body0", ""),
        opaque_p("body1", "")
    )

    int(
        "RotationalLimitMotor_testLimitValue",
        "",

        opaque_p("obj", ""),
        btScalar("test_value", "")
    )

    void(
        "RotationalLimitMotor_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "TranslationalLimitMotor_new",
        "",

        void()
    )

    opaque_p(
        "TranslationalLimitMotor_new2",
        "",

        opaque_p("other", "")
    )

    void(
        "TranslationalLimitMotor_getAccumulatedImpulse",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int[3](
        "TranslationalLimitMotor_getCurrentLimit",
        "",

        opaque_p("obj", "")
    )

    void(
        "TranslationalLimitMotor_getCurrentLimitError",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor_getCurrentLinearDiff",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "TranslationalLimitMotor_getDamping",
        "",

        opaque_p("obj", "")
    )

    bool[3](
        "TranslationalLimitMotor_getEnableMotor",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TranslationalLimitMotor_getLimitSoftness",
        "",

        opaque_p("obj", "")
    )

    void(
        "TranslationalLimitMotor_getLowerLimit",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor_getMaxMotorForce",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor_getNormalCFM",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "TranslationalLimitMotor_getRestitution",
        "",

        opaque_p("obj", "")
    )

    void(
        "TranslationalLimitMotor_getStopCFM",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor_getStopERP",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor_getTargetVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TranslationalLimitMotor_getUpperLimit",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    bool(
        "TranslationalLimitMotor_isLimited",
        "",

        opaque_p("obj", ""),
        int("limitIndex", "")
    )

    bool(
        "TranslationalLimitMotor_needApplyForce",
        "",

        opaque_p("obj", ""),
        int("limitIndex", "")
    )

    void(
        "TranslationalLimitMotor_setAccumulatedImpulse",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor_setCurrentLimitError",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor_setCurrentLinearDiff",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor_setDamping",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "TranslationalLimitMotor_setLimitSoftness",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "TranslationalLimitMotor_setLowerLimit",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor_setMaxMotorForce",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor_setNormalCFM",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor_setRestitution",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "TranslationalLimitMotor_setStopCFM",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor_setStopERP",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor_setTargetVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "TranslationalLimitMotor_setUpperLimit",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    btScalar(
        "TranslationalLimitMotor_solveLinearAxis",
        "",

        opaque_p("obj", ""),
        btScalar("timeStep", ""),
        btScalar("jacDiagABInv", ""),
        opaque_p("body1", ""),
        btVector3.const.p("pointInA", ""),
        opaque_p("body2", ""),
        btVector3.const.p("pointInB", ""),
        int("limit_index", ""),
        btVector3.const.p("axis_normal_on_a", ""),
        btVector3.const.p("anchorPos", "")
    )

    int(
        "TranslationalLimitMotor_testLimitValue",
        "",

        opaque_p("obj", ""),
        int("limitIndex", ""),
        btScalar("test_value", "")
    )

    void(
        "TranslationalLimitMotor_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Generic6DofConstraint_new",
        "",

        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("frameInA", ""),
        btTransform.const.p("frameInB", ""),
        bool("useLinearReferenceFrameA", "")
    )

    opaque_p(
        "Generic6DofConstraint_new2",
        "",

        opaque_p("rbB", ""),
        btTransform.const.p("frameInB", ""),
        bool("useLinearReferenceFrameB", "")
    )

    void(
        "Generic6DofConstraint_calcAnchorPos",
        "",

        opaque_p("obj", "")
    )

    void(
        "Generic6DofConstraint_calculateTransforms",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", "")
    )

    void(
        "Generic6DofConstraint_calculateTransforms2",
        "",

        opaque_p("obj", "")
    )

    int(
        "Generic6DofConstraint_get_limit_motor_info2",
        "",

        opaque_p("obj", ""),
        opaque_p("limot", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", ""),
        btVector3.const.p("linVelA", ""),
        btVector3.const.p("linVelB", ""),
        btVector3.const.p("angVelA", ""),
        btVector3.const.p("angVelB", ""),
        opaque_p("info", ""),
        int("row", ""),
        btVector3.p("ax1", ""),
        int("rotational", ""),
        int("rotAllowed", "")
    )

    btScalar(
        "Generic6DofConstraint_getAngle",
        "",

        opaque_p("obj", ""),
        int("axis_index", "")
    )

    void(
        "Generic6DofConstraint_getAngularLowerLimit",
        "",

        opaque_p("obj", ""),
        btVector3.p("angularLower", "")
    )

    void(
        "Generic6DofConstraint_getAngularUpperLimit",
        "",

        opaque_p("obj", ""),
        btVector3.p("angularUpper", "")
    )

    void(
        "Generic6DofConstraint_getAxis",
        "",

        opaque_p("obj", ""),
        int("axis_index", ""),
        btVector3.p("value", "")
    )

    void(
        "Generic6DofConstraint_getCalculatedTransformA",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "Generic6DofConstraint_getCalculatedTransformB",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    int(
        "Generic6DofConstraint_getFlags",
        "",

        opaque_p("obj", "")
    )

    void(
        "Generic6DofConstraint_getFrameOffsetA",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "Generic6DofConstraint_getFrameOffsetB",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "Generic6DofConstraint_getInfo1NonVirtual",
        "",

        opaque_p("obj", ""),
        opaque_p("info", "")
    )

    void(
        "Generic6DofConstraint_getInfo2NonVirtual",
        "",

        opaque_p("obj", ""),
        opaque_p("info", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", ""),
        btVector3.const.p("linVelA", ""),
        btVector3.const.p("linVelB", ""),
        btVector3.const.p("angVelA", ""),
        btVector3.const.p("angVelB", "")
    )

    void(
        "Generic6DofConstraint_getLinearLowerLimit",
        "",

        opaque_p("obj", ""),
        btVector3.p("linearLower", "")
    )

    void(
        "Generic6DofConstraint_getLinearUpperLimit",
        "",

        opaque_p("obj", ""),
        btVector3.p("linearUpper", "")
    )

    btScalar(
        "Generic6DofConstraint_getRelativePivotPosition",
        "",

        opaque_p("obj", ""),
        int("axis_index", "")
    )

    opaque_p(
        "Generic6DofConstraint_getRotationalLimitMotor",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    opaque_p(
        "Generic6DofConstraint_getTranslationalLimitMotor",
        "",

        opaque_p("obj", "")
    )

    bool(
        "Generic6DofConstraint_getUseFrameOffset",
        "",

        opaque_p("obj", "")
    )

    bool(
        "Generic6DofConstraint_getUseLinearReferenceFrameA",
        "",

        opaque_p("obj", "")
    )

    bool(
        "Generic6DofConstraint_getUseSolveConstraintObsolete",
        "",

        opaque_p("obj", "")
    )

    bool(
        "Generic6DofConstraint_isLimited",
        "",

        opaque_p("obj", ""),
        int("limitIndex", "")
    )

    void(
        "Generic6DofConstraint_setAngularLowerLimit",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("angularLower", "")
    )

    void(
        "Generic6DofConstraint_setAngularUpperLimit",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("angularUpper", "")
    )

    void(
        "Generic6DofConstraint_setAxis",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("axis1", ""),
        btVector3.const.p("axis2", "")
    )

    void(
        "Generic6DofConstraint_setFrames",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("frameA", ""),
        btTransform.const.p("frameB", "")
    )

    void(
        "Generic6DofConstraint_setLimit",
        "",

        opaque_p("obj", ""),
        int("axis", ""),
        btScalar("lo", ""),
        btScalar("hi", "")
    )

    void(
        "Generic6DofConstraint_setLinearLowerLimit",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("linearLower", "")
    )

    void(
        "Generic6DofConstraint_setLinearUpperLimit",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("linearUpper", "")
    )

    void(
        "Generic6DofConstraint_setUseFrameOffset",
        "",

        opaque_p("obj", ""),
        bool("frameOffsetOnOff", "")
    )

    void(
        "Generic6DofConstraint_setUseLinearReferenceFrameA",
        "",

        opaque_p("obj", ""),
        bool("linearReferenceFrameA", "")
    )

    void(
        "Generic6DofConstraint_setUseSolveConstraintObsolete",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    bool(
        "Generic6DofConstraint_testAngularLimitMotor",
        "",

        opaque_p("obj", ""),
        int("axis_index", "")
    )

    void(
        "Generic6DofConstraint_updateRHS",
        "",

        opaque_p("obj", ""),
        btScalar("timeStep", "")
    )

}