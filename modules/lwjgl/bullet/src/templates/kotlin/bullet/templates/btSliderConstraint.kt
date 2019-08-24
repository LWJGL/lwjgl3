/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btSliderConstraint = "BTSliderConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "SliderConstraint_new",
        "",

        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("frameInA", ""),
        btTransform.const.p("frameInB", ""),
        bool("useLinearReferenceFrameA", "")
    )

    opaque_p(
        "SliderConstraint_new2",
        "",

        opaque_p("rbB", ""),
        btTransform.const.p("frameInB", ""),
        bool("useLinearReferenceFrameA", "")
    )

    void(
        "SliderConstraint_calculateTransforms",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", "")
    )

    void(
        "SliderConstraint_getAncorInA",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "SliderConstraint_getAncorInB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "SliderConstraint_getAngDepth",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getAngularPos",
        "",

        opaque_p("obj", "")
    )

    void(
        "SliderConstraint_getCalculatedTransformA",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "SliderConstraint_getCalculatedTransformB",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    btScalar(
        "SliderConstraint_getDampingDirAng",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getDampingDirLin",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getDampingLimAng",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getDampingLimLin",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getDampingOrthoAng",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getDampingOrthoLin",
        "",

        opaque_p("obj", "")
    )

    int(
        "SliderConstraint_getFlags",
        "",

        opaque_p("obj", "")
    )

    void(
        "SliderConstraint_getFrameOffsetA",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "SliderConstraint_getFrameOffsetB",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "SliderConstraint_getInfo1NonVirtual",
        "",

        opaque_p("obj", ""),
        opaque_p("info", "")
    )

    void(
        "SliderConstraint_getInfo2NonVirtual",
        "",

        opaque_p("obj", ""),
        opaque_p("info", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", ""),
        btVector3.const.p("linVelA", ""),
        btVector3.const.p("linVelB", ""),
        btScalar("rbAinvMass", ""),
        btScalar("rbBinvMass", "")
    )

    btScalar(
        "SliderConstraint_getLinDepth",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getLinearPos",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getLowerAngLimit",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getLowerLinLimit",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getMaxAngMotorForce",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getMaxLinMotorForce",
        "",

        opaque_p("obj", "")
    )

    bool(
        "SliderConstraint_getPoweredAngMotor",
        "",

        opaque_p("obj", "")
    )

    bool(
        "SliderConstraint_getPoweredLinMotor",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getRestitutionDirAng",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getRestitutionDirLin",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getRestitutionLimAng",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getRestitutionLimLin",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getRestitutionOrthoAng",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getRestitutionOrthoLin",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getSoftnessDirAng",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getSoftnessDirLin",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getSoftnessLimAng",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getSoftnessLimLin",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getSoftnessOrthoAng",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getSoftnessOrthoLin",
        "",

        opaque_p("obj", "")
    )

    bool(
        "SliderConstraint_getSolveAngLimit",
        "",

        opaque_p("obj", "")
    )

    bool(
        "SliderConstraint_getSolveLinLimit",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getTargetAngMotorVelocity",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getTargetLinMotorVelocity",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getUpperAngLimit",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SliderConstraint_getUpperLinLimit",
        "",

        opaque_p("obj", "")
    )

    bool(
        "SliderConstraint_getUseFrameOffset",
        "",

        opaque_p("obj", "")
    )

    bool(
        "SliderConstraint_getUseLinearReferenceFrameA",
        "",

        opaque_p("obj", "")
    )

    void(
        "SliderConstraint_setDampingDirAng",
        "",

        opaque_p("obj", ""),
        btScalar("dampingDirAng", "")
    )

    void(
        "SliderConstraint_setDampingDirLin",
        "",

        opaque_p("obj", ""),
        btScalar("dampingDirLin", "")
    )

    void(
        "SliderConstraint_setDampingLimAng",
        "",

        opaque_p("obj", ""),
        btScalar("dampingLimAng", "")
    )

    void(
        "SliderConstraint_setDampingLimLin",
        "",

        opaque_p("obj", ""),
        btScalar("dampingLimLin", "")
    )

    void(
        "SliderConstraint_setDampingOrthoAng",
        "",

        opaque_p("obj", ""),
        btScalar("dampingOrthoAng", "")
    )

    void(
        "SliderConstraint_setDampingOrthoLin",
        "",

        opaque_p("obj", ""),
        btScalar("dampingOrthoLin", "")
    )

    void(
        "SliderConstraint_setFrames",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("frameA", ""),
        btTransform.const.p("frameB", "")
    )

    void(
        "SliderConstraint_setLowerAngLimit",
        "",

        opaque_p("obj", ""),
        btScalar("lowerLimit", "")
    )

    void(
        "SliderConstraint_setLowerLinLimit",
        "",

        opaque_p("obj", ""),
        btScalar("lowerLimit", "")
    )

    void(
        "SliderConstraint_setMaxAngMotorForce",
        "",

        opaque_p("obj", ""),
        btScalar("maxAngMotorForce", "")
    )

    void(
        "SliderConstraint_setMaxLinMotorForce",
        "",

        opaque_p("obj", ""),
        btScalar("maxLinMotorForce", "")
    )

    void(
        "SliderConstraint_setPoweredAngMotor",
        "",

        opaque_p("obj", ""),
        bool("onOff", "")
    )

    void(
        "SliderConstraint_setPoweredLinMotor",
        "",

        opaque_p("obj", ""),
        bool("onOff", "")
    )

    void(
        "SliderConstraint_setRestitutionDirAng",
        "",

        opaque_p("obj", ""),
        btScalar("restitutionDirAng", "")
    )

    void(
        "SliderConstraint_setRestitutionDirLin",
        "",

        opaque_p("obj", ""),
        btScalar("restitutionDirLin", "")
    )

    void(
        "SliderConstraint_setRestitutionLimAng",
        "",

        opaque_p("obj", ""),
        btScalar("restitutionLimAng", "")
    )

    void(
        "SliderConstraint_setRestitutionLimLin",
        "",

        opaque_p("obj", ""),
        btScalar("restitutionLimLin", "")
    )

    void(
        "SliderConstraint_setRestitutionOrthoAng",
        "",

        opaque_p("obj", ""),
        btScalar("restitutionOrthoAng", "")
    )

    void(
        "SliderConstraint_setRestitutionOrthoLin",
        "",

        opaque_p("obj", ""),
        btScalar("restitutionOrthoLin", "")
    )

    void(
        "SliderConstraint_setSoftnessDirAng",
        "",

        opaque_p("obj", ""),
        btScalar("softnessDirAng", "")
    )

    void(
        "SliderConstraint_setSoftnessDirLin",
        "",

        opaque_p("obj", ""),
        btScalar("softnessDirLin", "")
    )

    void(
        "SliderConstraint_setSoftnessLimAng",
        "",

        opaque_p("obj", ""),
        btScalar("softnessLimAng", "")
    )

    void(
        "SliderConstraint_setSoftnessLimLin",
        "",

        opaque_p("obj", ""),
        btScalar("softnessLimLin", "")
    )

    void(
        "SliderConstraint_setSoftnessOrthoAng",
        "",

        opaque_p("obj", ""),
        btScalar("softnessOrthoAng", "")
    )

    void(
        "SliderConstraint_setSoftnessOrthoLin",
        "",

        opaque_p("obj", ""),
        btScalar("softnessOrthoLin", "")
    )

    void(
        "SliderConstraint_setTargetAngMotorVelocity",
        "",

        opaque_p("obj", ""),
        btScalar("targetAngMotorVelocity", "")
    )

    void(
        "SliderConstraint_setTargetLinMotorVelocity",
        "",

        opaque_p("obj", ""),
        btScalar("targetLinMotorVelocity", "")
    )

    void(
        "SliderConstraint_setUpperAngLimit",
        "",

        opaque_p("obj", ""),
        btScalar("upperLimit", "")
    )

    void(
        "SliderConstraint_setUpperLinLimit",
        "",

        opaque_p("obj", ""),
        btScalar("upperLimit", "")
    )

    void(
        "SliderConstraint_setUseFrameOffset",
        "",

        opaque_p("obj", ""),
        bool("frameOffsetOnOff", "")
    )

    void(
        "SliderConstraint_testAngLimits",
        "",

        opaque_p("obj", "")
    )

    void(
        "SliderConstraint_testLinLimits",
        "",

        opaque_p("obj", "")
    )

}