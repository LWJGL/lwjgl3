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

public class BTGeneric6DofConstraint {

    protected BTGeneric6DofConstraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            RotationalLimitMotor_new                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_new"),
            RotationalLimitMotor_new2                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_new2"),
            RotationalLimitMotor_getAccumulatedImpulse          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getAccumulatedImpulse"),
            RotationalLimitMotor_getBounce                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getBounce"),
            RotationalLimitMotor_getCurrentLimit                = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getCurrentLimit"),
            RotationalLimitMotor_getCurrentLimitError           = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getCurrentLimitError"),
            RotationalLimitMotor_getCurrentPosition             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getCurrentPosition"),
            RotationalLimitMotor_getDamping                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getDamping"),
            RotationalLimitMotor_getEnableMotor                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getEnableMotor"),
            RotationalLimitMotor_getHiLimit                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getHiLimit"),
            RotationalLimitMotor_getLimitSoftness               = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getLimitSoftness"),
            RotationalLimitMotor_getLoLimit                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getLoLimit"),
            RotationalLimitMotor_getMaxLimitForce               = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getMaxLimitForce"),
            RotationalLimitMotor_getMaxMotorForce               = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getMaxMotorForce"),
            RotationalLimitMotor_getNormalCFM                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getNormalCFM"),
            RotationalLimitMotor_getStopCFM                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getStopCFM"),
            RotationalLimitMotor_getStopERP                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getStopERP"),
            RotationalLimitMotor_getTargetVelocity              = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_getTargetVelocity"),
            RotationalLimitMotor_isLimited                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_isLimited"),
            RotationalLimitMotor_needApplyTorques               = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_needApplyTorques"),
            RotationalLimitMotor_setAccumulatedImpulse          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setAccumulatedImpulse"),
            RotationalLimitMotor_setBounce                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setBounce"),
            RotationalLimitMotor_setCurrentLimit                = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setCurrentLimit"),
            RotationalLimitMotor_setCurrentLimitError           = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setCurrentLimitError"),
            RotationalLimitMotor_setCurrentPosition             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setCurrentPosition"),
            RotationalLimitMotor_setDamping                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setDamping"),
            RotationalLimitMotor_setEnableMotor                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setEnableMotor"),
            RotationalLimitMotor_setHiLimit                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setHiLimit"),
            RotationalLimitMotor_setLimitSoftness               = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setLimitSoftness"),
            RotationalLimitMotor_setLoLimit                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setLoLimit"),
            RotationalLimitMotor_setMaxLimitForce               = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setMaxLimitForce"),
            RotationalLimitMotor_setMaxMotorForce               = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setMaxMotorForce"),
            RotationalLimitMotor_setNormalCFM                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setNormalCFM"),
            RotationalLimitMotor_setStopCFM                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setStopCFM"),
            RotationalLimitMotor_setStopERP                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setStopERP"),
            RotationalLimitMotor_setTargetVelocity              = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_setTargetVelocity"),
            RotationalLimitMotor_solveAngularLimits             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_solveAngularLimits"),
            RotationalLimitMotor_testLimitValue                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_testLimitValue"),
            RotationalLimitMotor_delete                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btRotationalLimitMotor_delete"),
            TranslationalLimitMotor_new                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_new"),
            TranslationalLimitMotor_new2                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_new2"),
            TranslationalLimitMotor_getAccumulatedImpulse       = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_getAccumulatedImpulse"),
            TranslationalLimitMotor_getCurrentLimit             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_getCurrentLimit"),
            TranslationalLimitMotor_getCurrentLimitError        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_getCurrentLimitError"),
            TranslationalLimitMotor_getCurrentLinearDiff        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_getCurrentLinearDiff"),
            TranslationalLimitMotor_getDamping                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_getDamping"),
            TranslationalLimitMotor_getEnableMotor              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_getEnableMotor"),
            TranslationalLimitMotor_getLimitSoftness            = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_getLimitSoftness"),
            TranslationalLimitMotor_getLowerLimit               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_getLowerLimit"),
            TranslationalLimitMotor_getMaxMotorForce            = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_getMaxMotorForce"),
            TranslationalLimitMotor_getNormalCFM                = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_getNormalCFM"),
            TranslationalLimitMotor_getRestitution              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_getRestitution"),
            TranslationalLimitMotor_getStopCFM                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_getStopCFM"),
            TranslationalLimitMotor_getStopERP                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_getStopERP"),
            TranslationalLimitMotor_getTargetVelocity           = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_getTargetVelocity"),
            TranslationalLimitMotor_getUpperLimit               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_getUpperLimit"),
            TranslationalLimitMotor_isLimited                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_isLimited"),
            TranslationalLimitMotor_needApplyForce              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_needApplyForce"),
            TranslationalLimitMotor_setAccumulatedImpulse       = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_setAccumulatedImpulse"),
            TranslationalLimitMotor_setCurrentLimitError        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_setCurrentLimitError"),
            TranslationalLimitMotor_setCurrentLinearDiff        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_setCurrentLinearDiff"),
            TranslationalLimitMotor_setDamping                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_setDamping"),
            TranslationalLimitMotor_setLimitSoftness            = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_setLimitSoftness"),
            TranslationalLimitMotor_setLowerLimit               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_setLowerLimit"),
            TranslationalLimitMotor_setMaxMotorForce            = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_setMaxMotorForce"),
            TranslationalLimitMotor_setNormalCFM                = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_setNormalCFM"),
            TranslationalLimitMotor_setRestitution              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_setRestitution"),
            TranslationalLimitMotor_setStopCFM                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_setStopCFM"),
            TranslationalLimitMotor_setStopERP                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_setStopERP"),
            TranslationalLimitMotor_setTargetVelocity           = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_setTargetVelocity"),
            TranslationalLimitMotor_setUpperLimit               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_setUpperLimit"),
            TranslationalLimitMotor_solveLinearAxis             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_solveLinearAxis"),
            TranslationalLimitMotor_testLimitValue              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_testLimitValue"),
            TranslationalLimitMotor_delete                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTranslationalLimitMotor_delete"),
            Generic6DofConstraint_new                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_new"),
            Generic6DofConstraint_new2                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_new2"),
            Generic6DofConstraint_calcAnchorPos                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_calcAnchorPos"),
            Generic6DofConstraint_calculateTransforms           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_calculateTransforms"),
            Generic6DofConstraint_calculateTransforms2          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_calculateTransforms2"),
            Generic6DofConstraint_get_limit_motor_info2         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_get_limit_motor_info2"),
            Generic6DofConstraint_getAngle                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getAngle"),
            Generic6DofConstraint_getAngularLowerLimit          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getAngularLowerLimit"),
            Generic6DofConstraint_getAngularUpperLimit          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getAngularUpperLimit"),
            Generic6DofConstraint_getAxis                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getAxis"),
            Generic6DofConstraint_getCalculatedTransformA       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getCalculatedTransformA"),
            Generic6DofConstraint_getCalculatedTransformB       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getCalculatedTransformB"),
            Generic6DofConstraint_getFlags                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getFlags"),
            Generic6DofConstraint_getFrameOffsetA               = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getFrameOffsetA"),
            Generic6DofConstraint_getFrameOffsetB               = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getFrameOffsetB"),
            Generic6DofConstraint_getInfo1NonVirtual            = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getInfo1NonVirtual"),
            Generic6DofConstraint_getInfo2NonVirtual            = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getInfo2NonVirtual"),
            Generic6DofConstraint_getLinearLowerLimit           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getLinearLowerLimit"),
            Generic6DofConstraint_getLinearUpperLimit           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getLinearUpperLimit"),
            Generic6DofConstraint_getRelativePivotPosition      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getRelativePivotPosition"),
            Generic6DofConstraint_getRotationalLimitMotor       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getRotationalLimitMotor"),
            Generic6DofConstraint_getTranslationalLimitMotor    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getTranslationalLimitMotor"),
            Generic6DofConstraint_getUseFrameOffset             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getUseFrameOffset"),
            Generic6DofConstraint_getUseLinearReferenceFrameA   = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getUseLinearReferenceFrameA"),
            Generic6DofConstraint_getUseSolveConstraintObsolete = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_getUseSolveConstraintObsolete"),
            Generic6DofConstraint_isLimited                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_isLimited"),
            Generic6DofConstraint_setAngularLowerLimit          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_setAngularLowerLimit"),
            Generic6DofConstraint_setAngularUpperLimit          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_setAngularUpperLimit"),
            Generic6DofConstraint_setAxis                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_setAxis"),
            Generic6DofConstraint_setFrames                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_setFrames"),
            Generic6DofConstraint_setLimit                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_setLimit"),
            Generic6DofConstraint_setLinearLowerLimit           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_setLinearLowerLimit"),
            Generic6DofConstraint_setLinearUpperLimit           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_setLinearUpperLimit"),
            Generic6DofConstraint_setUseFrameOffset             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_setUseFrameOffset"),
            Generic6DofConstraint_setUseLinearReferenceFrameA   = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_setUseLinearReferenceFrameA"),
            Generic6DofConstraint_setUseSolveConstraintObsolete = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_setUseSolveConstraintObsolete"),
            Generic6DofConstraint_testAngularLimitMotor         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_testAngularLimitMotor"),
            Generic6DofConstraint_updateRHS                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofConstraint_updateRHS");

    }

    // --- [ btRotationalLimitMotor_new ] ---

    @NativeType("void *")
    public static long btRotationalLimitMotor_new() {
        long __functionAddress = Functions.RotationalLimitMotor_new;
        return invokeP(__functionAddress);
    }

    // --- [ btRotationalLimitMotor_new2 ] ---

    @NativeType("void *")
    public static long btRotationalLimitMotor_new2(@NativeType("void *") long limot) {
        long __functionAddress = Functions.RotationalLimitMotor_new2;
        if (CHECKS) {
            check(limot);
        }
        return invokePP(limot, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getAccumulatedImpulse ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor_getAccumulatedImpulse(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getAccumulatedImpulse;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getBounce ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor_getBounce(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getBounce;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getCurrentLimit ] ---

    public static int btRotationalLimitMotor_getCurrentLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getCurrentLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getCurrentLimitError ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor_getCurrentLimitError(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getCurrentLimitError;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getCurrentPosition ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor_getCurrentPosition(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getCurrentPosition;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getDamping ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor_getDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getEnableMotor ] ---

    @NativeType("bool")
    public static boolean btRotationalLimitMotor_getEnableMotor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getEnableMotor;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getHiLimit ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor_getHiLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getHiLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getLimitSoftness ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor_getLimitSoftness(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getLimitSoftness;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getLoLimit ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor_getLoLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getLoLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getMaxLimitForce ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor_getMaxLimitForce(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getMaxLimitForce;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getMaxMotorForce ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor_getMaxMotorForce(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getMaxMotorForce;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getNormalCFM ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor_getNormalCFM(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getNormalCFM;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getStopCFM ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor_getStopCFM(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getStopCFM;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getStopERP ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor_getStopERP(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getStopERP;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_getTargetVelocity ] ---

    @NativeType("btScalar")
    public static float btRotationalLimitMotor_getTargetVelocity(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_getTargetVelocity;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_isLimited ] ---

    @NativeType("bool")
    public static boolean btRotationalLimitMotor_isLimited(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_isLimited;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_needApplyTorques ] ---

    @NativeType("bool")
    public static boolean btRotationalLimitMotor_needApplyTorques(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_needApplyTorques;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setAccumulatedImpulse ] ---

    public static void btRotationalLimitMotor_setAccumulatedImpulse(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor_setAccumulatedImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setBounce ] ---

    public static void btRotationalLimitMotor_setBounce(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor_setBounce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setCurrentLimit ] ---

    public static void btRotationalLimitMotor_setCurrentLimit(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.RotationalLimitMotor_setCurrentLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setCurrentLimitError ] ---

    public static void btRotationalLimitMotor_setCurrentLimitError(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor_setCurrentLimitError;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setCurrentPosition ] ---

    public static void btRotationalLimitMotor_setCurrentPosition(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor_setCurrentPosition;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setDamping ] ---

    public static void btRotationalLimitMotor_setDamping(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor_setDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setEnableMotor ] ---

    public static void btRotationalLimitMotor_setEnableMotor(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.RotationalLimitMotor_setEnableMotor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setHiLimit ] ---

    public static void btRotationalLimitMotor_setHiLimit(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor_setHiLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setLimitSoftness ] ---

    public static void btRotationalLimitMotor_setLimitSoftness(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor_setLimitSoftness;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setLoLimit ] ---

    public static void btRotationalLimitMotor_setLoLimit(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor_setLoLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setMaxLimitForce ] ---

    public static void btRotationalLimitMotor_setMaxLimitForce(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor_setMaxLimitForce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setMaxMotorForce ] ---

    public static void btRotationalLimitMotor_setMaxMotorForce(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor_setMaxMotorForce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setNormalCFM ] ---

    public static void btRotationalLimitMotor_setNormalCFM(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor_setNormalCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setStopCFM ] ---

    public static void btRotationalLimitMotor_setStopCFM(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor_setStopCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setStopERP ] ---

    public static void btRotationalLimitMotor_setStopERP(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor_setStopERP;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_setTargetVelocity ] ---

    public static void btRotationalLimitMotor_setTargetVelocity(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RotationalLimitMotor_setTargetVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_solveAngularLimits ] ---

    public static float nbtRotationalLimitMotor_solveAngularLimits(long obj, float timeStep, long axis, float jacDiagABInv, long body0, long body1) {
        long __functionAddress = Functions.RotationalLimitMotor_solveAngularLimits;
        if (CHECKS) {
            check(obj);
            check(body0);
            check(body1);
        }
        return invokePPPPF(obj, timeStep, axis, jacDiagABInv, body0, body1, __functionAddress);
    }

    @NativeType("btScalar")
    public static float btRotationalLimitMotor_solveAngularLimits(@NativeType("void *") long obj, @NativeType("btScalar") float timeStep, @NativeType("btVector3 *") ΒΤVector3 axis, @NativeType("btScalar") float jacDiagABInv, @NativeType("void *") long body0, @NativeType("void *") long body1) {
        return nbtRotationalLimitMotor_solveAngularLimits(obj, timeStep, axis.address(), jacDiagABInv, body0, body1);
    }

    // --- [ btRotationalLimitMotor_testLimitValue ] ---

    public static int btRotationalLimitMotor_testLimitValue(@NativeType("void *") long obj, @NativeType("btScalar") float test_value) {
        long __functionAddress = Functions.RotationalLimitMotor_testLimitValue;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, test_value, __functionAddress);
    }

    // --- [ btRotationalLimitMotor_delete ] ---

    public static void btRotationalLimitMotor_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RotationalLimitMotor_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btTranslationalLimitMotor_new ] ---

    @NativeType("void *")
    public static long btTranslationalLimitMotor_new() {
        long __functionAddress = Functions.TranslationalLimitMotor_new;
        return invokeP(__functionAddress);
    }

    // --- [ btTranslationalLimitMotor_new2 ] ---

    @NativeType("void *")
    public static long btTranslationalLimitMotor_new2(@NativeType("void *") long other) {
        long __functionAddress = Functions.TranslationalLimitMotor_new2;
        if (CHECKS) {
            check(other);
        }
        return invokePP(other, __functionAddress);
    }

    // --- [ btTranslationalLimitMotor_getAccumulatedImpulse ] ---

    public static void nbtTranslationalLimitMotor_getAccumulatedImpulse(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_getAccumulatedImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_getAccumulatedImpulse(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_getAccumulatedImpulse(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_getCurrentLimit ] ---

    @NativeType("int[3]")
    public static IntBuffer btTranslationalLimitMotor_getCurrentLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TranslationalLimitMotor_getCurrentLimit;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memIntBuffer(__result, 3);
    }

    // --- [ btTranslationalLimitMotor_getCurrentLimitError ] ---

    public static void nbtTranslationalLimitMotor_getCurrentLimitError(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_getCurrentLimitError;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_getCurrentLimitError(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_getCurrentLimitError(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_getCurrentLinearDiff ] ---

    public static void nbtTranslationalLimitMotor_getCurrentLinearDiff(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_getCurrentLinearDiff;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_getCurrentLinearDiff(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_getCurrentLinearDiff(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_getDamping ] ---

    @NativeType("btScalar")
    public static float btTranslationalLimitMotor_getDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TranslationalLimitMotor_getDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTranslationalLimitMotor_getEnableMotor ] ---

    @NativeType("bool[3]")
    public static ByteBuffer btTranslationalLimitMotor_getEnableMotor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TranslationalLimitMotor_getEnableMotor;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memByteBuffer(__result, 3);
    }

    // --- [ btTranslationalLimitMotor_getLimitSoftness ] ---

    @NativeType("btScalar")
    public static float btTranslationalLimitMotor_getLimitSoftness(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TranslationalLimitMotor_getLimitSoftness;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTranslationalLimitMotor_getLowerLimit ] ---

    public static void nbtTranslationalLimitMotor_getLowerLimit(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_getLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_getLowerLimit(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_getLowerLimit(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_getMaxMotorForce ] ---

    public static void nbtTranslationalLimitMotor_getMaxMotorForce(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_getMaxMotorForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_getMaxMotorForce(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_getMaxMotorForce(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_getNormalCFM ] ---

    public static void nbtTranslationalLimitMotor_getNormalCFM(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_getNormalCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_getNormalCFM(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_getNormalCFM(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_getRestitution ] ---

    @NativeType("btScalar")
    public static float btTranslationalLimitMotor_getRestitution(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TranslationalLimitMotor_getRestitution;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTranslationalLimitMotor_getStopCFM ] ---

    public static void nbtTranslationalLimitMotor_getStopCFM(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_getStopCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_getStopCFM(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_getStopCFM(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_getStopERP ] ---

    public static void nbtTranslationalLimitMotor_getStopERP(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_getStopERP;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_getStopERP(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_getStopERP(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_getTargetVelocity ] ---

    public static void nbtTranslationalLimitMotor_getTargetVelocity(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_getTargetVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_getTargetVelocity(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_getTargetVelocity(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_getUpperLimit ] ---

    public static void nbtTranslationalLimitMotor_getUpperLimit(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_getUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_getUpperLimit(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_getUpperLimit(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_isLimited ] ---

    @NativeType("bool")
    public static boolean btTranslationalLimitMotor_isLimited(@NativeType("void *") long obj, int limitIndex) {
        long __functionAddress = Functions.TranslationalLimitMotor_isLimited;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, limitIndex, __functionAddress);
    }

    // --- [ btTranslationalLimitMotor_needApplyForce ] ---

    @NativeType("bool")
    public static boolean btTranslationalLimitMotor_needApplyForce(@NativeType("void *") long obj, int limitIndex) {
        long __functionAddress = Functions.TranslationalLimitMotor_needApplyForce;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, limitIndex, __functionAddress);
    }

    // --- [ btTranslationalLimitMotor_setAccumulatedImpulse ] ---

    public static void nbtTranslationalLimitMotor_setAccumulatedImpulse(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_setAccumulatedImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_setAccumulatedImpulse(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_setAccumulatedImpulse(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_setCurrentLimitError ] ---

    public static void nbtTranslationalLimitMotor_setCurrentLimitError(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_setCurrentLimitError;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_setCurrentLimitError(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_setCurrentLimitError(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_setCurrentLinearDiff ] ---

    public static void nbtTranslationalLimitMotor_setCurrentLinearDiff(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_setCurrentLinearDiff;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_setCurrentLinearDiff(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_setCurrentLinearDiff(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_setDamping ] ---

    public static void btTranslationalLimitMotor_setDamping(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TranslationalLimitMotor_setDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTranslationalLimitMotor_setLimitSoftness ] ---

    public static void btTranslationalLimitMotor_setLimitSoftness(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TranslationalLimitMotor_setLimitSoftness;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTranslationalLimitMotor_setLowerLimit ] ---

    public static void nbtTranslationalLimitMotor_setLowerLimit(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_setLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_setLowerLimit(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_setLowerLimit(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_setMaxMotorForce ] ---

    public static void nbtTranslationalLimitMotor_setMaxMotorForce(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_setMaxMotorForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_setMaxMotorForce(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_setMaxMotorForce(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_setNormalCFM ] ---

    public static void nbtTranslationalLimitMotor_setNormalCFM(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_setNormalCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_setNormalCFM(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_setNormalCFM(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_setRestitution ] ---

    public static void btTranslationalLimitMotor_setRestitution(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TranslationalLimitMotor_setRestitution;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTranslationalLimitMotor_setStopCFM ] ---

    public static void nbtTranslationalLimitMotor_setStopCFM(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_setStopCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_setStopCFM(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_setStopCFM(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_setStopERP ] ---

    public static void nbtTranslationalLimitMotor_setStopERP(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_setStopERP;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_setStopERP(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_setStopERP(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_setTargetVelocity ] ---

    public static void nbtTranslationalLimitMotor_setTargetVelocity(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_setTargetVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_setTargetVelocity(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_setTargetVelocity(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_setUpperLimit ] ---

    public static void nbtTranslationalLimitMotor_setUpperLimit(long obj, long value) {
        long __functionAddress = Functions.TranslationalLimitMotor_setUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTranslationalLimitMotor_setUpperLimit(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtTranslationalLimitMotor_setUpperLimit(obj, value.address());
    }

    // --- [ btTranslationalLimitMotor_solveLinearAxis ] ---

    public static float nbtTranslationalLimitMotor_solveLinearAxis(long obj, float timeStep, float jacDiagABInv, long body1, long pointInA, long body2, long pointInB, int limit_index, long axis_normal_on_a, long anchorPos) {
        long __functionAddress = Functions.TranslationalLimitMotor_solveLinearAxis;
        if (CHECKS) {
            check(obj);
            check(body1);
            check(body2);
        }
        return invokePPPPPPPF(obj, timeStep, jacDiagABInv, body1, pointInA, body2, pointInB, limit_index, axis_normal_on_a, anchorPos, __functionAddress);
    }

    @NativeType("btScalar")
    public static float btTranslationalLimitMotor_solveLinearAxis(@NativeType("void *") long obj, @NativeType("btScalar") float timeStep, @NativeType("btScalar") float jacDiagABInv, @NativeType("void *") long body1, @NativeType("btVector3 const *") ΒΤVector3 pointInA, @NativeType("void *") long body2, @NativeType("btVector3 const *") ΒΤVector3 pointInB, int limit_index, @NativeType("btVector3 const *") ΒΤVector3 axis_normal_on_a, @NativeType("btVector3 const *") ΒΤVector3 anchorPos) {
        return nbtTranslationalLimitMotor_solveLinearAxis(obj, timeStep, jacDiagABInv, body1, pointInA.address(), body2, pointInB.address(), limit_index, axis_normal_on_a.address(), anchorPos.address());
    }

    // --- [ btTranslationalLimitMotor_testLimitValue ] ---

    public static int btTranslationalLimitMotor_testLimitValue(@NativeType("void *") long obj, int limitIndex, @NativeType("btScalar") float test_value) {
        long __functionAddress = Functions.TranslationalLimitMotor_testLimitValue;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, limitIndex, test_value, __functionAddress);
    }

    // --- [ btTranslationalLimitMotor_delete ] ---

    public static void btTranslationalLimitMotor_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TranslationalLimitMotor_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_new ] ---

    public static long nbtGeneric6DofConstraint_new(long rbA, long rbB, long frameInA, long frameInB, boolean useLinearReferenceFrameA) {
        long __functionAddress = Functions.Generic6DofConstraint_new;
        if (CHECKS) {
            check(rbA);
            check(rbB);
        }
        return invokePPPPP(rbA, rbB, frameInA, frameInB, useLinearReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btGeneric6DofConstraint_new(@NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform frameInA, @NativeType("btTransform const *") BTTransform frameInB, @NativeType("bool") boolean useLinearReferenceFrameA) {
        return nbtGeneric6DofConstraint_new(rbA, rbB, frameInA.address(), frameInB.address(), useLinearReferenceFrameA);
    }

    // --- [ btGeneric6DofConstraint_new2 ] ---

    public static long nbtGeneric6DofConstraint_new2(long rbB, long frameInB, boolean useLinearReferenceFrameB) {
        long __functionAddress = Functions.Generic6DofConstraint_new2;
        if (CHECKS) {
            check(rbB);
        }
        return invokePPP(rbB, frameInB, useLinearReferenceFrameB, __functionAddress);
    }

    @NativeType("void *")
    public static long btGeneric6DofConstraint_new2(@NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform frameInB, @NativeType("bool") boolean useLinearReferenceFrameB) {
        return nbtGeneric6DofConstraint_new2(rbB, frameInB.address(), useLinearReferenceFrameB);
    }

    // --- [ btGeneric6DofConstraint_calcAnchorPos ] ---

    public static void btGeneric6DofConstraint_calcAnchorPos(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Generic6DofConstraint_calcAnchorPos;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_calculateTransforms ] ---

    public static void nbtGeneric6DofConstraint_calculateTransforms(long obj, long transA, long transB) {
        long __functionAddress = Functions.Generic6DofConstraint_calculateTransforms;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, transA, transB, __functionAddress);
    }

    public static void btGeneric6DofConstraint_calculateTransforms(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB) {
        nbtGeneric6DofConstraint_calculateTransforms(obj, transA.address(), transB.address());
    }

    // --- [ btGeneric6DofConstraint_calculateTransforms2 ] ---

    public static void btGeneric6DofConstraint_calculateTransforms2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Generic6DofConstraint_calculateTransforms2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_get_limit_motor_info2 ] ---

    public static int nbtGeneric6DofConstraint_get_limit_motor_info2(long obj, long limot, long transA, long transB, long linVelA, long linVelB, long angVelA, long angVelB, long info, int row, long ax1, int rotational, int rotAllowed) {
        long __functionAddress = Functions.Generic6DofConstraint_get_limit_motor_info2;
        if (CHECKS) {
            check(obj);
            check(limot);
            check(info);
        }
        return invokePPPPPPPPPPI(obj, limot, transA, transB, linVelA, linVelB, angVelA, angVelB, info, row, ax1, rotational, rotAllowed, __functionAddress);
    }

    public static int btGeneric6DofConstraint_get_limit_motor_info2(@NativeType("void *") long obj, @NativeType("void *") long limot, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB, @NativeType("btVector3 const *") ΒΤVector3 linVelA, @NativeType("btVector3 const *") ΒΤVector3 linVelB, @NativeType("btVector3 const *") ΒΤVector3 angVelA, @NativeType("btVector3 const *") ΒΤVector3 angVelB, @NativeType("void *") long info, int row, @NativeType("btVector3 *") ΒΤVector3 ax1, int rotational, int rotAllowed) {
        return nbtGeneric6DofConstraint_get_limit_motor_info2(obj, limot, transA.address(), transB.address(), linVelA.address(), linVelB.address(), angVelA.address(), angVelB.address(), info, row, ax1.address(), rotational, rotAllowed);
    }

    // --- [ btGeneric6DofConstraint_getAngle ] ---

    @NativeType("btScalar")
    public static float btGeneric6DofConstraint_getAngle(@NativeType("void *") long obj, int axis_index) {
        long __functionAddress = Functions.Generic6DofConstraint_getAngle;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, axis_index, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_getAngularLowerLimit ] ---

    public static void nbtGeneric6DofConstraint_getAngularLowerLimit(long obj, long angularLower) {
        long __functionAddress = Functions.Generic6DofConstraint_getAngularLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, angularLower, __functionAddress);
    }

    public static void btGeneric6DofConstraint_getAngularLowerLimit(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 angularLower) {
        nbtGeneric6DofConstraint_getAngularLowerLimit(obj, angularLower.address());
    }

    // --- [ btGeneric6DofConstraint_getAngularUpperLimit ] ---

    public static void nbtGeneric6DofConstraint_getAngularUpperLimit(long obj, long angularUpper) {
        long __functionAddress = Functions.Generic6DofConstraint_getAngularUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, angularUpper, __functionAddress);
    }

    public static void btGeneric6DofConstraint_getAngularUpperLimit(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 angularUpper) {
        nbtGeneric6DofConstraint_getAngularUpperLimit(obj, angularUpper.address());
    }

    // --- [ btGeneric6DofConstraint_getAxis ] ---

    public static void nbtGeneric6DofConstraint_getAxis(long obj, int axis_index, long value) {
        long __functionAddress = Functions.Generic6DofConstraint_getAxis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, axis_index, value, __functionAddress);
    }

    public static void btGeneric6DofConstraint_getAxis(@NativeType("void *") long obj, int axis_index, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtGeneric6DofConstraint_getAxis(obj, axis_index, value.address());
    }

    // --- [ btGeneric6DofConstraint_getCalculatedTransformA ] ---

    public static void nbtGeneric6DofConstraint_getCalculatedTransformA(long obj, long value) {
        long __functionAddress = Functions.Generic6DofConstraint_getCalculatedTransformA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGeneric6DofConstraint_getCalculatedTransformA(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtGeneric6DofConstraint_getCalculatedTransformA(obj, value.address());
    }

    // --- [ btGeneric6DofConstraint_getCalculatedTransformB ] ---

    public static void nbtGeneric6DofConstraint_getCalculatedTransformB(long obj, long value) {
        long __functionAddress = Functions.Generic6DofConstraint_getCalculatedTransformB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGeneric6DofConstraint_getCalculatedTransformB(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtGeneric6DofConstraint_getCalculatedTransformB(obj, value.address());
    }

    // --- [ btGeneric6DofConstraint_getFlags ] ---

    public static int btGeneric6DofConstraint_getFlags(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Generic6DofConstraint_getFlags;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_getFrameOffsetA ] ---

    public static void nbtGeneric6DofConstraint_getFrameOffsetA(long obj, long value) {
        long __functionAddress = Functions.Generic6DofConstraint_getFrameOffsetA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGeneric6DofConstraint_getFrameOffsetA(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtGeneric6DofConstraint_getFrameOffsetA(obj, value.address());
    }

    // --- [ btGeneric6DofConstraint_getFrameOffsetB ] ---

    public static void nbtGeneric6DofConstraint_getFrameOffsetB(long obj, long value) {
        long __functionAddress = Functions.Generic6DofConstraint_getFrameOffsetB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGeneric6DofConstraint_getFrameOffsetB(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtGeneric6DofConstraint_getFrameOffsetB(obj, value.address());
    }

    // --- [ btGeneric6DofConstraint_getInfo1NonVirtual ] ---

    public static void btGeneric6DofConstraint_getInfo1NonVirtual(@NativeType("void *") long obj, @NativeType("void *") long info) {
        long __functionAddress = Functions.Generic6DofConstraint_getInfo1NonVirtual;
        if (CHECKS) {
            check(obj);
            check(info);
        }
        invokePPV(obj, info, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_getInfo2NonVirtual ] ---

    public static void nbtGeneric6DofConstraint_getInfo2NonVirtual(long obj, long info, long transA, long transB, long linVelA, long linVelB, long angVelA, long angVelB) {
        long __functionAddress = Functions.Generic6DofConstraint_getInfo2NonVirtual;
        if (CHECKS) {
            check(obj);
            check(info);
        }
        invokePPPPPPPPV(obj, info, transA, transB, linVelA, linVelB, angVelA, angVelB, __functionAddress);
    }

    public static void btGeneric6DofConstraint_getInfo2NonVirtual(@NativeType("void *") long obj, @NativeType("void *") long info, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB, @NativeType("btVector3 const *") ΒΤVector3 linVelA, @NativeType("btVector3 const *") ΒΤVector3 linVelB, @NativeType("btVector3 const *") ΒΤVector3 angVelA, @NativeType("btVector3 const *") ΒΤVector3 angVelB) {
        nbtGeneric6DofConstraint_getInfo2NonVirtual(obj, info, transA.address(), transB.address(), linVelA.address(), linVelB.address(), angVelA.address(), angVelB.address());
    }

    // --- [ btGeneric6DofConstraint_getLinearLowerLimit ] ---

    public static void nbtGeneric6DofConstraint_getLinearLowerLimit(long obj, long linearLower) {
        long __functionAddress = Functions.Generic6DofConstraint_getLinearLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, linearLower, __functionAddress);
    }

    public static void btGeneric6DofConstraint_getLinearLowerLimit(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 linearLower) {
        nbtGeneric6DofConstraint_getLinearLowerLimit(obj, linearLower.address());
    }

    // --- [ btGeneric6DofConstraint_getLinearUpperLimit ] ---

    public static void nbtGeneric6DofConstraint_getLinearUpperLimit(long obj, long linearUpper) {
        long __functionAddress = Functions.Generic6DofConstraint_getLinearUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, linearUpper, __functionAddress);
    }

    public static void btGeneric6DofConstraint_getLinearUpperLimit(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 linearUpper) {
        nbtGeneric6DofConstraint_getLinearUpperLimit(obj, linearUpper.address());
    }

    // --- [ btGeneric6DofConstraint_getRelativePivotPosition ] ---

    @NativeType("btScalar")
    public static float btGeneric6DofConstraint_getRelativePivotPosition(@NativeType("void *") long obj, int axis_index) {
        long __functionAddress = Functions.Generic6DofConstraint_getRelativePivotPosition;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, axis_index, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_getRotationalLimitMotor ] ---

    @NativeType("void *")
    public static long btGeneric6DofConstraint_getRotationalLimitMotor(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.Generic6DofConstraint_getRotationalLimitMotor;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_getTranslationalLimitMotor ] ---

    @NativeType("void *")
    public static long btGeneric6DofConstraint_getTranslationalLimitMotor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Generic6DofConstraint_getTranslationalLimitMotor;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_getUseFrameOffset ] ---

    @NativeType("bool")
    public static boolean btGeneric6DofConstraint_getUseFrameOffset(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Generic6DofConstraint_getUseFrameOffset;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_getUseLinearReferenceFrameA ] ---

    @NativeType("bool")
    public static boolean btGeneric6DofConstraint_getUseLinearReferenceFrameA(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Generic6DofConstraint_getUseLinearReferenceFrameA;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_getUseSolveConstraintObsolete ] ---

    @NativeType("bool")
    public static boolean btGeneric6DofConstraint_getUseSolveConstraintObsolete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Generic6DofConstraint_getUseSolveConstraintObsolete;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_isLimited ] ---

    @NativeType("bool")
    public static boolean btGeneric6DofConstraint_isLimited(@NativeType("void *") long obj, int limitIndex) {
        long __functionAddress = Functions.Generic6DofConstraint_isLimited;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, limitIndex, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_setAngularLowerLimit ] ---

    public static void nbtGeneric6DofConstraint_setAngularLowerLimit(long obj, long angularLower) {
        long __functionAddress = Functions.Generic6DofConstraint_setAngularLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, angularLower, __functionAddress);
    }

    public static void btGeneric6DofConstraint_setAngularLowerLimit(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 angularLower) {
        nbtGeneric6DofConstraint_setAngularLowerLimit(obj, angularLower.address());
    }

    // --- [ btGeneric6DofConstraint_setAngularUpperLimit ] ---

    public static void nbtGeneric6DofConstraint_setAngularUpperLimit(long obj, long angularUpper) {
        long __functionAddress = Functions.Generic6DofConstraint_setAngularUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, angularUpper, __functionAddress);
    }

    public static void btGeneric6DofConstraint_setAngularUpperLimit(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 angularUpper) {
        nbtGeneric6DofConstraint_setAngularUpperLimit(obj, angularUpper.address());
    }

    // --- [ btGeneric6DofConstraint_setAxis ] ---

    public static void nbtGeneric6DofConstraint_setAxis(long obj, long axis1, long axis2) {
        long __functionAddress = Functions.Generic6DofConstraint_setAxis;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, axis1, axis2, __functionAddress);
    }

    public static void btGeneric6DofConstraint_setAxis(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 axis1, @NativeType("btVector3 const *") ΒΤVector3 axis2) {
        nbtGeneric6DofConstraint_setAxis(obj, axis1.address(), axis2.address());
    }

    // --- [ btGeneric6DofConstraint_setFrames ] ---

    public static void nbtGeneric6DofConstraint_setFrames(long obj, long frameA, long frameB) {
        long __functionAddress = Functions.Generic6DofConstraint_setFrames;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, frameA, frameB, __functionAddress);
    }

    public static void btGeneric6DofConstraint_setFrames(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform frameA, @NativeType("btTransform const *") BTTransform frameB) {
        nbtGeneric6DofConstraint_setFrames(obj, frameA.address(), frameB.address());
    }

    // --- [ btGeneric6DofConstraint_setLimit ] ---

    public static void btGeneric6DofConstraint_setLimit(@NativeType("void *") long obj, int axis, @NativeType("btScalar") float lo, @NativeType("btScalar") float hi) {
        long __functionAddress = Functions.Generic6DofConstraint_setLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, axis, lo, hi, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_setLinearLowerLimit ] ---

    public static void nbtGeneric6DofConstraint_setLinearLowerLimit(long obj, long linearLower) {
        long __functionAddress = Functions.Generic6DofConstraint_setLinearLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, linearLower, __functionAddress);
    }

    public static void btGeneric6DofConstraint_setLinearLowerLimit(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 linearLower) {
        nbtGeneric6DofConstraint_setLinearLowerLimit(obj, linearLower.address());
    }

    // --- [ btGeneric6DofConstraint_setLinearUpperLimit ] ---

    public static void nbtGeneric6DofConstraint_setLinearUpperLimit(long obj, long linearUpper) {
        long __functionAddress = Functions.Generic6DofConstraint_setLinearUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, linearUpper, __functionAddress);
    }

    public static void btGeneric6DofConstraint_setLinearUpperLimit(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 linearUpper) {
        nbtGeneric6DofConstraint_setLinearUpperLimit(obj, linearUpper.address());
    }

    // --- [ btGeneric6DofConstraint_setUseFrameOffset ] ---

    public static void btGeneric6DofConstraint_setUseFrameOffset(@NativeType("void *") long obj, @NativeType("bool") boolean frameOffsetOnOff) {
        long __functionAddress = Functions.Generic6DofConstraint_setUseFrameOffset;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, frameOffsetOnOff, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_setUseLinearReferenceFrameA ] ---

    public static void btGeneric6DofConstraint_setUseLinearReferenceFrameA(@NativeType("void *") long obj, @NativeType("bool") boolean linearReferenceFrameA) {
        long __functionAddress = Functions.Generic6DofConstraint_setUseLinearReferenceFrameA;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, linearReferenceFrameA, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_setUseSolveConstraintObsolete ] ---

    public static void btGeneric6DofConstraint_setUseSolveConstraintObsolete(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.Generic6DofConstraint_setUseSolveConstraintObsolete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_testAngularLimitMotor ] ---

    @NativeType("bool")
    public static boolean btGeneric6DofConstraint_testAngularLimitMotor(@NativeType("void *") long obj, int axis_index) {
        long __functionAddress = Functions.Generic6DofConstraint_testAngularLimitMotor;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, axis_index, __functionAddress);
    }

    // --- [ btGeneric6DofConstraint_updateRHS ] ---

    public static void btGeneric6DofConstraint_updateRHS(@NativeType("void *") long obj, @NativeType("btScalar") float timeStep) {
        long __functionAddress = Functions.Generic6DofConstraint_updateRHS;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, timeStep, __functionAddress);
    }

}