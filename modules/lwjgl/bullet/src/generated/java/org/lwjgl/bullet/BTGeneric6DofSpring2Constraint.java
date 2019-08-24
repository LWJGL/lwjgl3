/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTGeneric6DofSpring2Constraint {

    protected BTGeneric6DofSpring2Constraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            RotationalLimitMotor2_new                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_new"),
            RotationalLimitMotor2_new2                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_new2"),
            RotationalLimitMotor2_getBounce                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getBounce"),
            RotationalLimitMotor2_getCurrentLimit                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getCurrentLimit"),
            RotationalLimitMotor2_getCurrentLimitError                = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getCurrentLimitError"),
            RotationalLimitMotor2_getCurrentLimitErrorHi              = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getCurrentLimitErrorHi"),
            RotationalLimitMotor2_getCurrentPosition                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getCurrentPosition"),
            RotationalLimitMotor2_getEnableMotor                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getEnableMotor"),
            RotationalLimitMotor2_getEnableSpring                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getEnableSpring"),
            RotationalLimitMotor2_getEquilibriumPoint                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getEquilibriumPoint"),
            RotationalLimitMotor2_getHiLimit                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getHiLimit"),
            RotationalLimitMotor2_getLoLimit                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getLoLimit"),
            RotationalLimitMotor2_getMaxMotorForce                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getMaxMotorForce"),
            RotationalLimitMotor2_getMotorCFM                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getMotorCFM"),
            RotationalLimitMotor2_getMotorERP                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getMotorERP"),
            RotationalLimitMotor2_getServoMotor                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getServoMotor"),
            RotationalLimitMotor2_getServoTarget                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getServoTarget"),
            RotationalLimitMotor2_getSpringDamping                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getSpringDamping"),
            RotationalLimitMotor2_getSpringDampingLimited             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getSpringDampingLimited"),
            RotationalLimitMotor2_getSpringStiffness                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getSpringStiffness"),
            RotationalLimitMotor2_getSpringStiffnessLimited           = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getSpringStiffnessLimited"),
            RotationalLimitMotor2_getStopCFM                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getStopCFM"),
            RotationalLimitMotor2_getStopERP                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getStopERP"),
            RotationalLimitMotor2_getTargetVelocity                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_getTargetVelocity"),
            RotationalLimitMotor2_isLimited                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_isLimited"),
            RotationalLimitMotor2_setBounce                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setBounce"),
            RotationalLimitMotor2_setCurrentLimit                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setCurrentLimit"),
            RotationalLimitMotor2_setCurrentLimitError                = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setCurrentLimitError"),
            RotationalLimitMotor2_setCurrentLimitErrorHi              = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setCurrentLimitErrorHi"),
            RotationalLimitMotor2_setCurrentPosition                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setCurrentPosition"),
            RotationalLimitMotor2_setEnableMotor                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setEnableMotor"),
            RotationalLimitMotor2_setEnableSpring                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setEnableSpring"),
            RotationalLimitMotor2_setEquilibriumPoint                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setEquilibriumPoint"),
            RotationalLimitMotor2_setHiLimit                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setHiLimit"),
            RotationalLimitMotor2_setLoLimit                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setLoLimit"),
            RotationalLimitMotor2_setMaxMotorForce                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setMaxMotorForce"),
            RotationalLimitMotor2_setMotorCFM                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setMotorCFM"),
            RotationalLimitMotor2_setMotorERP                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setMotorERP"),
            RotationalLimitMotor2_setServoMotor                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setServoMotor"),
            RotationalLimitMotor2_setServoTarget                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setServoTarget"),
            RotationalLimitMotor2_setSpringDamping                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setSpringDamping"),
            RotationalLimitMotor2_setSpringDampingLimited             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setSpringDampingLimited"),
            RotationalLimitMotor2_setSpringStiffness                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setSpringStiffness"),
            RotationalLimitMotor2_setSpringStiffnessLimited           = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setSpringStiffnessLimited"),
            RotationalLimitMotor2_setStopCFM                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setStopCFM"),
            RotationalLimitMotor2_setStopERP                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setStopERP"),
            RotationalLimitMotor2_setTargetVelocity                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_setTargetVelocity"),
            RotationalLimitMotor2_testLimitValue                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_testLimitValue"),
            RotationalLimitMotor2_delete                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor2_delete"),
            TranslationalLimitMotor2_new                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_new"),
            TranslationalLimitMotor2_new2                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_new2"),
            TranslationalLimitMotor2_getBounce                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getBounce"),
            TranslationalLimitMotor2_getCurrentLimit                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getCurrentLimit"),
            TranslationalLimitMotor2_getCurrentLimitError             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getCurrentLimitError"),
            TranslationalLimitMotor2_getCurrentLimitErrorHi           = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getCurrentLimitErrorHi"),
            TranslationalLimitMotor2_getCurrentLinearDiff             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getCurrentLinearDiff"),
            TranslationalLimitMotor2_getEnableMotor                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getEnableMotor"),
            TranslationalLimitMotor2_getEnableSpring                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getEnableSpring"),
            TranslationalLimitMotor2_getEquilibriumPoint              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getEquilibriumPoint"),
            TranslationalLimitMotor2_getLowerLimit                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getLowerLimit"),
            TranslationalLimitMotor2_getMaxMotorForce                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getMaxMotorForce"),
            TranslationalLimitMotor2_getMotorCFM                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getMotorCFM"),
            TranslationalLimitMotor2_getMotorERP                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getMotorERP"),
            TranslationalLimitMotor2_getServoMotor                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getServoMotor"),
            TranslationalLimitMotor2_getServoTarget                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getServoTarget"),
            TranslationalLimitMotor2_getSpringDamping                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getSpringDamping"),
            TranslationalLimitMotor2_getSpringDampingLimited          = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getSpringDampingLimited"),
            TranslationalLimitMotor2_getSpringStiffness               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getSpringStiffness"),
            TranslationalLimitMotor2_getSpringStiffnessLimited        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getSpringStiffnessLimited"),
            TranslationalLimitMotor2_getStopCFM                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getStopCFM"),
            TranslationalLimitMotor2_getStopERP                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getStopERP"),
            TranslationalLimitMotor2_getTargetVelocity                = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getTargetVelocity"),
            TranslationalLimitMotor2_getUpperLimit                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_getUpperLimit"),
            TranslationalLimitMotor2_isLimited                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_isLimited"),
            TranslationalLimitMotor2_setBounce                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setBounce"),
            TranslationalLimitMotor2_setCurrentLimitError             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setCurrentLimitError"),
            TranslationalLimitMotor2_setCurrentLimitErrorHi           = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setCurrentLimitErrorHi"),
            TranslationalLimitMotor2_setCurrentLinearDiff             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setCurrentLinearDiff"),
            TranslationalLimitMotor2_setEquilibriumPoint              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setEquilibriumPoint"),
            TranslationalLimitMotor2_setLowerLimit                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setLowerLimit"),
            TranslationalLimitMotor2_setMaxMotorForce                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setMaxMotorForce"),
            TranslationalLimitMotor2_setMotorCFM                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setMotorCFM"),
            TranslationalLimitMotor2_setMotorERP                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setMotorERP"),
            TranslationalLimitMotor2_setServoTarget                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setServoTarget"),
            TranslationalLimitMotor2_setSpringDamping                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setSpringDamping"),
            TranslationalLimitMotor2_setSpringStiffness               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setSpringStiffness"),
            TranslationalLimitMotor2_setStopCFM                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setStopCFM"),
            TranslationalLimitMotor2_setStopERP                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setStopERP"),
            TranslationalLimitMotor2_setTargetVelocity                = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setTargetVelocity"),
            TranslationalLimitMotor2_setUpperLimit                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_setUpperLimit"),
            TranslationalLimitMotor2_testLimitValue                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_testLimitValue"),
            TranslationalLimitMotor2_delete                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor2_delete"),
            Generic6DofSpring2Constraint_new                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_new"),
            Generic6DofSpring2Constraint_new2                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_new2"),
            Generic6DofSpring2Constraint_btGetMatrixElem              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_btGetMatrixElem"),
            Generic6DofSpring2Constraint_calculateTransforms          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_calculateTransforms"),
            Generic6DofSpring2Constraint_calculateTransforms2         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_calculateTransforms2"),
            Generic6DofSpring2Constraint_enableMotor                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_enableMotor"),
            Generic6DofSpring2Constraint_enableSpring                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_enableSpring"),
            Generic6DofSpring2Constraint_getAngle                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getAngle"),
            Generic6DofSpring2Constraint_getAngularLowerLimit         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getAngularLowerLimit"),
            Generic6DofSpring2Constraint_getAngularLowerLimitReversed = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getAngularLowerLimitReversed"),
            Generic6DofSpring2Constraint_getAngularUpperLimit         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getAngularUpperLimit"),
            Generic6DofSpring2Constraint_getAngularUpperLimitReversed = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getAngularUpperLimitReversed"),
            Generic6DofSpring2Constraint_getAxis                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getAxis"),
            Generic6DofSpring2Constraint_getCalculatedTransformA      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getCalculatedTransformA"),
            Generic6DofSpring2Constraint_getCalculatedTransformB      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getCalculatedTransformB"),
            Generic6DofSpring2Constraint_getFrameOffsetA              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getFrameOffsetA"),
            Generic6DofSpring2Constraint_getFrameOffsetB              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getFrameOffsetB"),
            Generic6DofSpring2Constraint_getLinearLowerLimit          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getLinearLowerLimit"),
            Generic6DofSpring2Constraint_getLinearUpperLimit          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getLinearUpperLimit"),
            Generic6DofSpring2Constraint_getRelativePivotPosition     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getRelativePivotPosition"),
            Generic6DofSpring2Constraint_getRotationalLimitMotor      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getRotationalLimitMotor"),
            Generic6DofSpring2Constraint_getRotationOrder             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getRotationOrder"),
            Generic6DofSpring2Constraint_getTranslationalLimitMotor   = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_getTranslationalLimitMotor"),
            Generic6DofSpring2Constraint_isLimited                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_isLimited"),
            Generic6DofSpring2Constraint_matrixToEulerZXY             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_matrixToEulerZXY"),
            Generic6DofSpring2Constraint_matrixToEulerZYX             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_matrixToEulerZYX"),
            Generic6DofSpring2Constraint_matrixToEulerXZY             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_matrixToEulerXZY"),
            Generic6DofSpring2Constraint_matrixToEulerXYZ             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_matrixToEulerXYZ"),
            Generic6DofSpring2Constraint_matrixToEulerYZX             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_matrixToEulerYZX"),
            Generic6DofSpring2Constraint_matrixToEulerYXZ             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_matrixToEulerYXZ"),
            Generic6DofSpring2Constraint_setAngularLowerLimit         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setAngularLowerLimit"),
            Generic6DofSpring2Constraint_setAngularLowerLimitReversed = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setAngularLowerLimitReversed"),
            Generic6DofSpring2Constraint_setAngularUpperLimit         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setAngularUpperLimit"),
            Generic6DofSpring2Constraint_setAngularUpperLimitReversed = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setAngularUpperLimitReversed"),
            Generic6DofSpring2Constraint_setAxis                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setAxis"),
            Generic6DofSpring2Constraint_setBounce                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setBounce"),
            Generic6DofSpring2Constraint_setDamping                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setDamping"),
            Generic6DofSpring2Constraint_setEquilibriumPoint          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setEquilibriumPoint"),
            Generic6DofSpring2Constraint_setEquilibriumPoint2         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setEquilibriumPoint2"),
            Generic6DofSpring2Constraint_setEquilibriumPoint3         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setEquilibriumPoint3"),
            Generic6DofSpring2Constraint_setFrames                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setFrames"),
            Generic6DofSpring2Constraint_setLimit                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setLimit"),
            Generic6DofSpring2Constraint_setLimitReversed             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setLimitReversed"),
            Generic6DofSpring2Constraint_setLinearLowerLimit          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setLinearLowerLimit"),
            Generic6DofSpring2Constraint_setLinearUpperLimit          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setLinearUpperLimit"),
            Generic6DofSpring2Constraint_setMaxMotorForce             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setMaxMotorForce"),
            Generic6DofSpring2Constraint_setRotationOrder             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setRotationOrder"),
            Generic6DofSpring2Constraint_setServo                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setServo"),
            Generic6DofSpring2Constraint_setServoTarget               = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setServoTarget"),
            Generic6DofSpring2Constraint_setStiffness                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setStiffness"),
            Generic6DofSpring2Constraint_setTargetVelocity            = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpring2Constraint_setTargetVelocity");

    }

    // --- [ btRotationalLimitMotor2_new ] ---

    @NativeType("void *")
    public static long btRotationalLimitMotor2_new() {
        long __functionAddress = Functions.RotationalLimitMotor2_new;
        return invokeP(__functionAddress);
    }

    // --- [ btRotationalLimitMotor2_new2 ] ---

    @NativeType("void *")
    public static long btRotationalLimitMotor2_new2(@NativeType("void *") long limot) {
        long __functionAddress = Functions.RotationalLimitMotor2_new2;
        if (CHECKS) {
            check(limot);
        }
        return invokePP(limot, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getBounce ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getBounce(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getBounce;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getCurrentLimit ] ---

    public static int btRotationalLimitMotor2_getCurrentLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getCurrentLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getCurrentLimitError ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getCurrentLimitError(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getCurrentLimitError;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getCurrentLimitErrorHi ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getCurrentLimitErrorHi(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getCurrentLimitErrorHi;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getCurrentPosition ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getCurrentPosition(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getCurrentPosition;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getEnableMotor ] ---

    @NativeType("bool")
    public static boolean btRotationalLimitMotor2_getEnableMotor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getEnableMotor;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getEnableSpring ] ---

    @NativeType("bool")
    public static boolean btRotationalLimitMotor2_getEnableSpring(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getEnableSpring;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getEquilibriumPoint ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getEquilibriumPoint(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getEquilibriumPoint;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getHiLimit ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getHiLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getHiLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getLoLimit ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getLoLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getLoLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getMaxMotorForce ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getMaxMotorForce(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getMaxMotorForce;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getMotorCFM ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getMotorCFM(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getMotorCFM;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getMotorERP ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getMotorERP(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getMotorERP;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getServoMotor ] ---

    @NativeType("bool")
    public static boolean btRotationalLimitMotor2_getServoMotor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getServoMotor;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getServoTarget ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getServoTarget(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getServoTarget;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getSpringDamping ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getSpringDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getSpringDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getSpringDampingLimited ] ---

    @NativeType("bool")
    public static boolean btRotationalLimitMotor2_getSpringDampingLimited(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getSpringDampingLimited;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getSpringStiffness ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getSpringStiffness(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getSpringStiffness;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getSpringStiffnessLimited ] ---

    @NativeType("bool")
    public static boolean btRotationalLimitMotor2_getSpringStiffnessLimited(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getSpringStiffnessLimited;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getStopCFM ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getStopCFM(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getStopCFM;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getStopERP ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getStopERP(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getStopERP;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_getTargetVelocity ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor2_getTargetVelocity(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_getTargetVelocity;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_isLimited ] ---

    @NativeType("bool")
    public static boolean btRotationalLimitMotor2_isLimited(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_isLimited;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setBounce ] ---

    public static void btRotationalLimitMotor2_setBounce(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setBounce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setCurrentLimit ] ---

    public static void btRotationalLimitMotor2_setCurrentLimit(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setCurrentLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setCurrentLimitError ] ---

    public static void btRotationalLimitMotor2_setCurrentLimitError(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setCurrentLimitError;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setCurrentLimitErrorHi ] ---

    public static void btRotationalLimitMotor2_setCurrentLimitErrorHi(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setCurrentLimitErrorHi;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setCurrentPosition ] ---

    public static void btRotationalLimitMotor2_setCurrentPosition(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setCurrentPosition;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setEnableMotor ] ---

    public static void btRotationalLimitMotor2_setEnableMotor(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setEnableMotor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setEnableSpring ] ---

    public static void btRotationalLimitMotor2_setEnableSpring(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setEnableSpring;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setEquilibriumPoint ] ---

    public static void btRotationalLimitMotor2_setEquilibriumPoint(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setEquilibriumPoint;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setHiLimit ] ---

    public static void btRotationalLimitMotor2_setHiLimit(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setHiLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setLoLimit ] ---

    public static void btRotationalLimitMotor2_setLoLimit(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setLoLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setMaxMotorForce ] ---

    public static void btRotationalLimitMotor2_setMaxMotorForce(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setMaxMotorForce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setMotorCFM ] ---

    public static void btRotationalLimitMotor2_setMotorCFM(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setMotorCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setMotorERP ] ---

    public static void btRotationalLimitMotor2_setMotorERP(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setMotorERP;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setServoMotor ] ---

    public static void btRotationalLimitMotor2_setServoMotor(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setServoMotor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setServoTarget ] ---

    public static void btRotationalLimitMotor2_setServoTarget(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setServoTarget;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setSpringDamping ] ---

    public static void btRotationalLimitMotor2_setSpringDamping(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setSpringDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setSpringDampingLimited ] ---

    public static void btRotationalLimitMotor2_setSpringDampingLimited(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setSpringDampingLimited;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setSpringStiffness ] ---

    public static void btRotationalLimitMotor2_setSpringStiffness(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setSpringStiffness;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setSpringStiffnessLimited ] ---

    public static void btRotationalLimitMotor2_setSpringStiffnessLimited(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setSpringStiffnessLimited;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setStopCFM ] ---

    public static void btRotationalLimitMotor2_setStopCFM(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setStopCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setStopERP ] ---

    public static void btRotationalLimitMotor2_setStopERP(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setStopERP;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_setTargetVelocity ] ---

    public static void btRotationalLimitMotor2_setTargetVelocity(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor2_setTargetVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_testLimitValue ] ---

    public static void btRotationalLimitMotor2_testLimitValue(@NativeType("void *") long obj, @NativeType("btScalar") float test_value) {
        long __functionAddress = Functions.RotationalLimitMotor2_testLimitValue;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, test_value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor2_delete ] ---

    public static void btRotationalLimitMotor2_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor2_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btTranslationalLimitMotor2_new ] ---

    @NativeType("void *")
    public static long btTranslationalLimitMotor2_new() {
        long __functionAddress = Functions.TranslationalLimitMotor2_new;
        return invokeP(__functionAddress);
    }

    // --- [ btTranslationalLimitMotor2_new2 ] ---

    @NativeType("void *")
    public static long btTranslationalLimitMotor2_new2(@NativeType("void *") long other) {
        long __functionAddress = Functions.TranslationalLimitMotor2_new2;
        if (CHECKS) {
            check(other);
        }
        return invokePP(other, __functionAddress);
    }

    // --- [ btTranslationalLimitMotor2_getBounce ] ---

    public static void nbtTranslationalLimitMotor2_getBounce(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getBounce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getBounce(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getBounce(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_getCurrentLimit ] ---

    @NativeType("int[3]")
    public static IntBuffer btTranslationalLimitMotor2_getCurrentLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getCurrentLimit;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memIntBuffer(__result, 3);
    }

    // --- [ btTranslationalLimitMotor2_getCurrentLimitError ] ---

    public static void nbtTranslationalLimitMotor2_getCurrentLimitError(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getCurrentLimitError;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getCurrentLimitError(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getCurrentLimitError(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_getCurrentLimitErrorHi ] ---

    public static void nbtTranslationalLimitMotor2_getCurrentLimitErrorHi(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getCurrentLimitErrorHi;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getCurrentLimitErrorHi(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getCurrentLimitErrorHi(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_getCurrentLinearDiff ] ---

    public static void nbtTranslationalLimitMotor2_getCurrentLinearDiff(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getCurrentLinearDiff;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getCurrentLinearDiff(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getCurrentLinearDiff(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_getEnableMotor ] ---

    @NativeType("bool[3]")
    public static ByteBuffer btTranslationalLimitMotor2_getEnableMotor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getEnableMotor;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memByteBuffer(__result, 3);
    }

    // --- [ btTranslationalLimitMotor2_getEnableSpring ] ---

    @NativeType("bool[3]")
    public static ByteBuffer btTranslationalLimitMotor2_getEnableSpring(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getEnableSpring;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memByteBuffer(__result, 3);
    }

    // --- [ btTranslationalLimitMotor2_getEquilibriumPoint ] ---

    public static void nbtTranslationalLimitMotor2_getEquilibriumPoint(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getEquilibriumPoint;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getEquilibriumPoint(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getEquilibriumPoint(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_getLowerLimit ] ---

    public static void nbtTranslationalLimitMotor2_getLowerLimit(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getLowerLimit(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getLowerLimit(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_getMaxMotorForce ] ---

    public static void nbtTranslationalLimitMotor2_getMaxMotorForce(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getMaxMotorForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getMaxMotorForce(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getMaxMotorForce(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_getMotorCFM ] ---

    public static void nbtTranslationalLimitMotor2_getMotorCFM(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getMotorCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getMotorCFM(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getMotorCFM(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_getMotorERP ] ---

    public static void nbtTranslationalLimitMotor2_getMotorERP(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getMotorERP;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getMotorERP(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getMotorERP(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_getServoMotor ] ---

    @NativeType("bool[3]")
    public static ByteBuffer btTranslationalLimitMotor2_getServoMotor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getServoMotor;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memByteBuffer(__result, 3);
    }

    // --- [ btTranslationalLimitMotor2_getServoTarget ] ---

    public static void nbtTranslationalLimitMotor2_getServoTarget(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getServoTarget;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getServoTarget(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getServoTarget(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_getSpringDamping ] ---

    public static void nbtTranslationalLimitMotor2_getSpringDamping(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getSpringDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getSpringDamping(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getSpringDamping(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_getSpringDampingLimited ] ---

    @NativeType("bool[3]")
    public static ByteBuffer btTranslationalLimitMotor2_getSpringDampingLimited(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getSpringDampingLimited;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memByteBuffer(__result, 3);
    }

    // --- [ btTranslationalLimitMotor2_getSpringStiffness ] ---

    public static void nbtTranslationalLimitMotor2_getSpringStiffness(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getSpringStiffness;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getSpringStiffness(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getSpringStiffness(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_getSpringStiffnessLimited ] ---

    @NativeType("bool[3]")
    public static ByteBuffer btTranslationalLimitMotor2_getSpringStiffnessLimited(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getSpringStiffnessLimited;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memByteBuffer(__result, 3);
    }

    // --- [ btTranslationalLimitMotor2_getStopCFM ] ---

    public static void nbtTranslationalLimitMotor2_getStopCFM(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getStopCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getStopCFM(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getStopCFM(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_getStopERP ] ---

    public static void nbtTranslationalLimitMotor2_getStopERP(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getStopERP;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getStopERP(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getStopERP(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_getTargetVelocity ] ---

    public static void nbtTranslationalLimitMotor2_getTargetVelocity(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getTargetVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getTargetVelocity(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getTargetVelocity(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_getUpperLimit ] ---

    public static void nbtTranslationalLimitMotor2_getUpperLimit(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_getUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_getUpperLimit(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_getUpperLimit(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_isLimited ] ---

    @NativeType("bool")
    public static boolean btTranslationalLimitMotor2_isLimited(@NativeType("void *") long obj, int limitIndex) {
        long __functionAddress = Functions.TranslationalLimitMotor2_isLimited;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, limitIndex, __functionAddress);
    }

    // --- [ btTranslationalLimitMotor2_setBounce ] ---

    public static void nbtTranslationalLimitMotor2_setBounce(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setBounce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setBounce(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setBounce(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_setCurrentLimitError ] ---

    public static void nbtTranslationalLimitMotor2_setCurrentLimitError(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setCurrentLimitError;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setCurrentLimitError(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setCurrentLimitError(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_setCurrentLimitErrorHi ] ---

    public static void nbtTranslationalLimitMotor2_setCurrentLimitErrorHi(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setCurrentLimitErrorHi;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setCurrentLimitErrorHi(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setCurrentLimitErrorHi(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_setCurrentLinearDiff ] ---

    public static void nbtTranslationalLimitMotor2_setCurrentLinearDiff(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setCurrentLinearDiff;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setCurrentLinearDiff(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setCurrentLinearDiff(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_setEquilibriumPoint ] ---

    public static void nbtTranslationalLimitMotor2_setEquilibriumPoint(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setEquilibriumPoint;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setEquilibriumPoint(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setEquilibriumPoint(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_setLowerLimit ] ---

    public static void nbtTranslationalLimitMotor2_setLowerLimit(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setLowerLimit(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setLowerLimit(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_setMaxMotorForce ] ---

    public static void nbtTranslationalLimitMotor2_setMaxMotorForce(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setMaxMotorForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setMaxMotorForce(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setMaxMotorForce(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_setMotorCFM ] ---

    public static void nbtTranslationalLimitMotor2_setMotorCFM(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setMotorCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setMotorCFM(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setMotorCFM(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_setMotorERP ] ---

    public static void nbtTranslationalLimitMotor2_setMotorERP(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setMotorERP;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setMotorERP(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setMotorERP(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_setServoTarget ] ---

    public static void nbtTranslationalLimitMotor2_setServoTarget(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setServoTarget;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setServoTarget(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setServoTarget(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_setSpringDamping ] ---

    public static void nbtTranslationalLimitMotor2_setSpringDamping(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setSpringDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setSpringDamping(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setSpringDamping(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_setSpringStiffness ] ---

    public static void nbtTranslationalLimitMotor2_setSpringStiffness(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setSpringStiffness;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setSpringStiffness(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setSpringStiffness(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_setStopCFM ] ---

    public static void nbtTranslationalLimitMotor2_setStopCFM(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setStopCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setStopCFM(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setStopCFM(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_setStopERP ] ---

    public static void nbtTranslationalLimitMotor2_setStopERP(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setStopERP;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setStopERP(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setStopERP(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_setTargetVelocity ] ---

    public static void nbtTranslationalLimitMotor2_setTargetVelocity(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setTargetVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setTargetVelocity(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setTargetVelocity(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_setUpperLimit ] ---

    public static void nbtTranslationalLimitMotor2_setUpperLimit(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_setUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor2_setUpperLimit(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor2_setUpperLimit(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor2_testLimitValue ] ---

    public static void btTranslationalLimitMotor2_testLimitValue(@NativeType("void *") long obj, int limitIndex, @NativeType("btScalar") float test_value) {
        long __functionAddress = Functions.TranslationalLimitMotor2_testLimitValue;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, limitIndex, test_value, __functionAddress);
    }

    // --- [ btTranslationalLimitMotor2_delete ] ---

    public static void btTranslationalLimitMotor2_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TranslationalLimitMotor2_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_new ] ---

    public static long nbtGeneric6DofSpring2Constraint_new(long rbA, long rbB, long frameInA, long frameInB, int rotOrder) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_new;
        if (CHECKS) {
            check(rbA);
            check(rbB);
        }
        return invokePPPPP(rbA, rbB, frameInA, frameInB, rotOrder, __functionAddress);
    }

    @NativeType("void *")
    public static long btGeneric6DofSpring2Constraint_new(@NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform frameInA, @NativeType("btTransform const *") BTTransform frameInB, int rotOrder) {
        return nbtGeneric6DofSpring2Constraint_new(rbA, rbB, frameInA.address(), frameInB.address(), rotOrder);
    }

    // --- [ btGeneric6DofSpring2Constraint_new2 ] ---

    public static long nbtGeneric6DofSpring2Constraint_new2(long rbB, long frameInB, int rotOrder) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_new2;
        if (CHECKS) {
            check(rbB);
        }
        return invokePPP(rbB, frameInB, rotOrder, __functionAddress);
    }

    @NativeType("void *")
    public static long btGeneric6DofSpring2Constraint_new2(@NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform frameInB, int rotOrder) {
        return nbtGeneric6DofSpring2Constraint_new2(rbB, frameInB.address(), rotOrder);
    }

    // --- [ btGeneric6DofSpring2Constraint_btGetMatrixElem ] ---

    public static float nbtGeneric6DofSpring2Constraint_btGetMatrixElem(long mat, int index) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_btGetMatrixElem;
        return invokePF(mat, index, __functionAddress);
    }

    @NativeType("btScalar")
    public static float btGeneric6DofSpring2Constraint_btGetMatrixElem(@NativeType("btMatrix3x3 const *") BTMatrix3x3 mat, int index) {
        return nbtGeneric6DofSpring2Constraint_btGetMatrixElem(mat.address(), index);
    }

    // --- [ btGeneric6DofSpring2Constraint_calculateTransforms ] ---

    public static void nbtGeneric6DofSpring2Constraint_calculateTransforms(long obj, long transA, long transB) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_calculateTransforms;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, transA, transB, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_calculateTransforms(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB) {
        nbtGeneric6DofSpring2Constraint_calculateTransforms(obj, transA.address(), transB.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_calculateTransforms2 ] ---

    public static void btGeneric6DofSpring2Constraint_calculateTransforms2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_calculateTransforms2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_enableMotor ] ---

    public static void btGeneric6DofSpring2Constraint_enableMotor(@NativeType("void *") long obj, int index, @NativeType("bool") boolean onOff) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_enableMotor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, onOff, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_enableSpring ] ---

    public static void btGeneric6DofSpring2Constraint_enableSpring(@NativeType("void *") long obj, int index, @NativeType("bool") boolean onOff) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_enableSpring;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, onOff, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_getAngle ] ---

    @NativeType("btScalar")
    public static float btGeneric6DofSpring2Constraint_getAngle(@NativeType("void *") long obj, int axis_index) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getAngle;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, axis_index, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_getAngularLowerLimit ] ---

    public static void nbtGeneric6DofSpring2Constraint_getAngularLowerLimit(long obj, long angularLower) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getAngularLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, angularLower, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_getAngularLowerLimit(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 angularLower) {
        nbtGeneric6DofSpring2Constraint_getAngularLowerLimit(obj, angularLower.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_getAngularLowerLimitReversed ] ---

    public static void nbtGeneric6DofSpring2Constraint_getAngularLowerLimitReversed(long obj, long angularLower) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getAngularLowerLimitReversed;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, angularLower, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_getAngularLowerLimitReversed(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 angularLower) {
        nbtGeneric6DofSpring2Constraint_getAngularLowerLimitReversed(obj, angularLower.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_getAngularUpperLimit ] ---

    public static void nbtGeneric6DofSpring2Constraint_getAngularUpperLimit(long obj, long angularUpper) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getAngularUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, angularUpper, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_getAngularUpperLimit(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 angularUpper) {
        nbtGeneric6DofSpring2Constraint_getAngularUpperLimit(obj, angularUpper.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_getAngularUpperLimitReversed ] ---

    public static void nbtGeneric6DofSpring2Constraint_getAngularUpperLimitReversed(long obj, long angularUpper) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getAngularUpperLimitReversed;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, angularUpper, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_getAngularUpperLimitReversed(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 angularUpper) {
        nbtGeneric6DofSpring2Constraint_getAngularUpperLimitReversed(obj, angularUpper.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_getAxis ] ---

    public static void nbtGeneric6DofSpring2Constraint_getAxis(long obj, int axis_index, long value) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getAxis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, axis_index, value, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_getAxis(@NativeType("void *") long obj, int axis_index, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtGeneric6DofSpring2Constraint_getAxis(obj, axis_index, value.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_getCalculatedTransformA ] ---

    public static void nbtGeneric6DofSpring2Constraint_getCalculatedTransformA(long obj, long value) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getCalculatedTransformA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_getCalculatedTransformA(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtGeneric6DofSpring2Constraint_getCalculatedTransformA(obj, value.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_getCalculatedTransformB ] ---

    public static void nbtGeneric6DofSpring2Constraint_getCalculatedTransformB(long obj, long value) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getCalculatedTransformB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_getCalculatedTransformB(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtGeneric6DofSpring2Constraint_getCalculatedTransformB(obj, value.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_getFrameOffsetA ] ---

    public static void nbtGeneric6DofSpring2Constraint_getFrameOffsetA(long obj, long value) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getFrameOffsetA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_getFrameOffsetA(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtGeneric6DofSpring2Constraint_getFrameOffsetA(obj, value.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_getFrameOffsetB ] ---

    public static void nbtGeneric6DofSpring2Constraint_getFrameOffsetB(long obj, long value) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getFrameOffsetB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_getFrameOffsetB(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtGeneric6DofSpring2Constraint_getFrameOffsetB(obj, value.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_getLinearLowerLimit ] ---

    public static void nbtGeneric6DofSpring2Constraint_getLinearLowerLimit(long obj, long linearLower) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getLinearLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, linearLower, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_getLinearLowerLimit(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 linearLower) {
        nbtGeneric6DofSpring2Constraint_getLinearLowerLimit(obj, linearLower.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_getLinearUpperLimit ] ---

    public static void nbtGeneric6DofSpring2Constraint_getLinearUpperLimit(long obj, long linearUpper) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getLinearUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, linearUpper, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_getLinearUpperLimit(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 linearUpper) {
        nbtGeneric6DofSpring2Constraint_getLinearUpperLimit(obj, linearUpper.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_getRelativePivotPosition ] ---

    @NativeType("btScalar")
    public static float btGeneric6DofSpring2Constraint_getRelativePivotPosition(@NativeType("void *") long obj, int axis_index) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getRelativePivotPosition;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, axis_index, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_getRotationalLimitMotor ] ---

    @NativeType("void *")
    public static long btGeneric6DofSpring2Constraint_getRotationalLimitMotor(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getRotationalLimitMotor;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_getRotationOrder ] ---

    public static int btGeneric6DofSpring2Constraint_getRotationOrder(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getRotationOrder;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_getTranslationalLimitMotor ] ---

    @NativeType("void *")
    public static long btGeneric6DofSpring2Constraint_getTranslationalLimitMotor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_getTranslationalLimitMotor;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_isLimited ] ---

    @NativeType("bool")
    public static boolean btGeneric6DofSpring2Constraint_isLimited(@NativeType("void *") long obj, int limitIndex) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_isLimited;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, limitIndex, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_matrixToEulerZXY ] ---

    public static boolean nbtGeneric6DofSpring2Constraint_matrixToEulerZXY(long mat, long xyz) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_matrixToEulerZXY;
        return invokePPZ(mat, xyz, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btGeneric6DofSpring2Constraint_matrixToEulerZXY(@NativeType("btMatrix3x3 const *") BTMatrix3x3 mat, @NativeType("btVector3 *") ΒΤVector3 xyz) {
        return nbtGeneric6DofSpring2Constraint_matrixToEulerZXY(mat.address(), xyz.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_matrixToEulerZYX ] ---

    public static boolean nbtGeneric6DofSpring2Constraint_matrixToEulerZYX(long mat, long xyz) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_matrixToEulerZYX;
        return invokePPZ(mat, xyz, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btGeneric6DofSpring2Constraint_matrixToEulerZYX(@NativeType("btMatrix3x3 const *") BTMatrix3x3 mat, @NativeType("btVector3 *") ΒΤVector3 xyz) {
        return nbtGeneric6DofSpring2Constraint_matrixToEulerZYX(mat.address(), xyz.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_matrixToEulerXZY ] ---

    public static boolean nbtGeneric6DofSpring2Constraint_matrixToEulerXZY(long mat, long xyz) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_matrixToEulerXZY;
        return invokePPZ(mat, xyz, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btGeneric6DofSpring2Constraint_matrixToEulerXZY(@NativeType("btMatrix3x3 const *") BTMatrix3x3 mat, @NativeType("btVector3 *") ΒΤVector3 xyz) {
        return nbtGeneric6DofSpring2Constraint_matrixToEulerXZY(mat.address(), xyz.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_matrixToEulerXYZ ] ---

    public static boolean nbtGeneric6DofSpring2Constraint_matrixToEulerXYZ(long mat, long xyz) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_matrixToEulerXYZ;
        return invokePPZ(mat, xyz, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btGeneric6DofSpring2Constraint_matrixToEulerXYZ(@NativeType("btMatrix3x3 const *") BTMatrix3x3 mat, @NativeType("btVector3 *") ΒΤVector3 xyz) {
        return nbtGeneric6DofSpring2Constraint_matrixToEulerXYZ(mat.address(), xyz.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_matrixToEulerYZX ] ---

    public static boolean nbtGeneric6DofSpring2Constraint_matrixToEulerYZX(long mat, long xyz) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_matrixToEulerYZX;
        return invokePPZ(mat, xyz, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btGeneric6DofSpring2Constraint_matrixToEulerYZX(@NativeType("btMatrix3x3 const *") BTMatrix3x3 mat, @NativeType("btVector3 *") ΒΤVector3 xyz) {
        return nbtGeneric6DofSpring2Constraint_matrixToEulerYZX(mat.address(), xyz.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_matrixToEulerYXZ ] ---

    public static boolean nbtGeneric6DofSpring2Constraint_matrixToEulerYXZ(long mat, long xyz) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_matrixToEulerYXZ;
        return invokePPZ(mat, xyz, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btGeneric6DofSpring2Constraint_matrixToEulerYXZ(@NativeType("btMatrix3x3 const *") BTMatrix3x3 mat, @NativeType("btVector3 *") ΒΤVector3 xyz) {
        return nbtGeneric6DofSpring2Constraint_matrixToEulerYXZ(mat.address(), xyz.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_setAngularLowerLimit ] ---

    public static void nbtGeneric6DofSpring2Constraint_setAngularLowerLimit(long obj, long angularLower) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setAngularLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, angularLower, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_setAngularLowerLimit(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 angularLower) {
        nbtGeneric6DofSpring2Constraint_setAngularLowerLimit(obj, angularLower.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_setAngularLowerLimitReversed ] ---

    public static void nbtGeneric6DofSpring2Constraint_setAngularLowerLimitReversed(long obj, long angularLower) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setAngularLowerLimitReversed;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, angularLower, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_setAngularLowerLimitReversed(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 angularLower) {
        nbtGeneric6DofSpring2Constraint_setAngularLowerLimitReversed(obj, angularLower.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_setAngularUpperLimit ] ---

    public static void nbtGeneric6DofSpring2Constraint_setAngularUpperLimit(long obj, long angularUpper) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setAngularUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, angularUpper, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_setAngularUpperLimit(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 angularUpper) {
        nbtGeneric6DofSpring2Constraint_setAngularUpperLimit(obj, angularUpper.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_setAngularUpperLimitReversed ] ---

    public static void nbtGeneric6DofSpring2Constraint_setAngularUpperLimitReversed(long obj, long angularUpper) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setAngularUpperLimitReversed;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, angularUpper, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_setAngularUpperLimitReversed(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 angularUpper) {
        nbtGeneric6DofSpring2Constraint_setAngularUpperLimitReversed(obj, angularUpper.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_setAxis ] ---

    public static void nbtGeneric6DofSpring2Constraint_setAxis(long obj, long axis1, long axis2) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setAxis;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, axis1, axis2, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_setAxis(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 axis1, @NativeType("btVector3 const *") ΒΤVector3 axis2) {
        nbtGeneric6DofSpring2Constraint_setAxis(obj, axis1.address(), axis2.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_setBounce ] ---

    public static void btGeneric6DofSpring2Constraint_setBounce(@NativeType("void *") long obj, int index, @NativeType("btScalar") float bounce) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setBounce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, bounce, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_setDamping ] ---

    public static void btGeneric6DofSpring2Constraint_setDamping(@NativeType("void *") long obj, int index, @NativeType("btScalar") float damping, @NativeType("bool") boolean limitIfNeeded) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, damping, limitIfNeeded, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_setEquilibriumPoint ] ---

    public static void btGeneric6DofSpring2Constraint_setEquilibriumPoint(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setEquilibriumPoint;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_setEquilibriumPoint2 ] ---

    public static void btGeneric6DofSpring2Constraint_setEquilibriumPoint2(@NativeType("void *") long obj, int index, @NativeType("btScalar") float val) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setEquilibriumPoint2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, val, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_setEquilibriumPoint3 ] ---

    public static void btGeneric6DofSpring2Constraint_setEquilibriumPoint3(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setEquilibriumPoint3;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_setFrames ] ---

    public static void nbtGeneric6DofSpring2Constraint_setFrames(long obj, long frameA, long frameB) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setFrames;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, frameA, frameB, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_setFrames(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform frameA, @NativeType("btTransform const *") BTTransform frameB) {
        nbtGeneric6DofSpring2Constraint_setFrames(obj, frameA.address(), frameB.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_setLimit ] ---

    public static void btGeneric6DofSpring2Constraint_setLimit(@NativeType("void *") long obj, int axis, @NativeType("btScalar") float lo, @NativeType("btScalar") float hi) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, axis, lo, hi, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_setLimitReversed ] ---

    public static void btGeneric6DofSpring2Constraint_setLimitReversed(@NativeType("void *") long obj, int axis, @NativeType("btScalar") float lo, @NativeType("btScalar") float hi) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setLimitReversed;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, axis, lo, hi, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_setLinearLowerLimit ] ---

    public static void nbtGeneric6DofSpring2Constraint_setLinearLowerLimit(long obj, long linearLower) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setLinearLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, linearLower, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_setLinearLowerLimit(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 linearLower) {
        nbtGeneric6DofSpring2Constraint_setLinearLowerLimit(obj, linearLower.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_setLinearUpperLimit ] ---

    public static void nbtGeneric6DofSpring2Constraint_setLinearUpperLimit(long obj, long linearUpper) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setLinearUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, linearUpper, __functionAddress);
    }

    public static void btGeneric6DofSpring2Constraint_setLinearUpperLimit(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 linearUpper) {
        nbtGeneric6DofSpring2Constraint_setLinearUpperLimit(obj, linearUpper.address());
    }

    // --- [ btGeneric6DofSpring2Constraint_setMaxMotorForce ] ---

    public static void btGeneric6DofSpring2Constraint_setMaxMotorForce(@NativeType("void *") long obj, int index, @NativeType("btScalar") float force) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setMaxMotorForce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, force, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_setRotationOrder ] ---

    public static void btGeneric6DofSpring2Constraint_setRotationOrder(@NativeType("void *") long obj, int order) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setRotationOrder;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, order, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_setServo ] ---

    public static void btGeneric6DofSpring2Constraint_setServo(@NativeType("void *") long obj, int index, @NativeType("bool") boolean onOff) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setServo;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, onOff, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_setServoTarget ] ---

    public static void btGeneric6DofSpring2Constraint_setServoTarget(@NativeType("void *") long obj, int index, @NativeType("btScalar") float target) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setServoTarget;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, target, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_setStiffness ] ---

    public static void btGeneric6DofSpring2Constraint_setStiffness(@NativeType("void *") long obj, int index, @NativeType("btScalar") float stiffness, @NativeType("bool") boolean limitIfNeeded) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setStiffness;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, stiffness, limitIfNeeded, __functionAddress);
    }

    // --- [ btGeneric6DofSpring2Constraint_setTargetVelocity ] ---

    public static void btGeneric6DofSpring2Constraint_setTargetVelocity(@NativeType("void *") long obj, int index, @NativeType("btScalar") float velocity) {
        long __functionAddress = Functions.Generic6DofSpring2Constraint_setTargetVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, velocity, __functionAddress);
    }

}