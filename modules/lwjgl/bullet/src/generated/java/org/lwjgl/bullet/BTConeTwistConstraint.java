/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class BTConeTwistConstraint {

    protected BTConeTwistConstraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ConeTwistConstraint_new                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_new"),
            ConeTwistConstraint_new2                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_new2"),
            ConeTwistConstraint_calcAngleInfo                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_calcAngleInfo"),
            ConeTwistConstraint_calcAngleInfo2                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_calcAngleInfo2"),
            ConeTwistConstraint_enableMotor                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_enableMotor"),
            ConeTwistConstraint_getAFrame                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getAFrame"),
            ConeTwistConstraint_getAngularOnly                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getAngularOnly"),
            ConeTwistConstraint_getBFrame                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getBFrame"),
            ConeTwistConstraint_getBiasFactor                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getBiasFactor"),
            ConeTwistConstraint_getDamping                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getDamping"),
            ConeTwistConstraint_getFixThresh                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getFixThresh"),
            ConeTwistConstraint_getFlags                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getFlags"),
            ConeTwistConstraint_getFrameOffsetA                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getFrameOffsetA"),
            ConeTwistConstraint_getFrameOffsetB                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getFrameOffsetB"),
            ConeTwistConstraint_getInfo1NonVirtual              = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getInfo1NonVirtual"),
            ConeTwistConstraint_getInfo2NonVirtual              = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getInfo2NonVirtual"),
            ConeTwistConstraint_getLimit                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getLimit"),
            ConeTwistConstraint_getLimitSoftness                = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getLimitSoftness"),
            ConeTwistConstraint_getMaxMotorImpulse              = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getMaxMotorImpulse"),
            ConeTwistConstraint_getMotorTarget                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getMotorTarget"),
            ConeTwistConstraint_GetPointForAngle                = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_GetPointForAngle"),
            ConeTwistConstraint_getRelaxationFactor             = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getRelaxationFactor"),
            ConeTwistConstraint_getSolveSwingLimit              = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getSolveSwingLimit"),
            ConeTwistConstraint_getSolveTwistLimit              = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getSolveTwistLimit"),
            ConeTwistConstraint_getSwingSpan1                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getSwingSpan1"),
            ConeTwistConstraint_getSwingSpan2                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getSwingSpan2"),
            ConeTwistConstraint_getTwistAngle                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getTwistAngle"),
            ConeTwistConstraint_getTwistLimitSign               = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getTwistLimitSign"),
            ConeTwistConstraint_getTwistSpan                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_getTwistSpan"),
            ConeTwistConstraint_isMaxMotorImpulseNormalized     = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_isMaxMotorImpulseNormalized"),
            ConeTwistConstraint_isMotorEnabled                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_isMotorEnabled"),
            ConeTwistConstraint_isPastSwingLimit                = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_isPastSwingLimit"),
            ConeTwistConstraint_setAngularOnly                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_setAngularOnly"),
            ConeTwistConstraint_setDamping                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_setDamping"),
            ConeTwistConstraint_setFixThresh                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_setFixThresh"),
            ConeTwistConstraint_setFrames                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_setFrames"),
            ConeTwistConstraint_setLimit                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_setLimit"),
            ConeTwistConstraint_setLimit2                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_setLimit2"),
            ConeTwistConstraint_setMaxMotorImpulse              = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_setMaxMotorImpulse"),
            ConeTwistConstraint_setMaxMotorImpulseNormalized    = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_setMaxMotorImpulseNormalized"),
            ConeTwistConstraint_setMotorTarget                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_setMotorTarget"),
            ConeTwistConstraint_setMotorTargetInConstraintSpace = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_setMotorTargetInConstraintSpace"),
            ConeTwistConstraint_updateRHS                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeTwistConstraint_updateRHS");

    }

    // --- [ btConeTwistConstraint_new ] ---

    public static long nbtConeTwistConstraint_new(long rbA, long rbB, long rbAFrame, long rbBFrame) {
        long __functionAddress = Functions.ConeTwistConstraint_new;
        if (CHECKS) {
            check(rbA);
            check(rbB);
        }
        return invokePPPPP(rbA, rbB, rbAFrame, rbBFrame, __functionAddress);
    }

    @NativeType("void *")
    public static long btConeTwistConstraint_new(@NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform rbAFrame, @NativeType("btTransform const *") BTTransform rbBFrame) {
        return nbtConeTwistConstraint_new(rbA, rbB, rbAFrame.address(), rbBFrame.address());
    }

    // --- [ btConeTwistConstraint_new2 ] ---

    public static long nbtConeTwistConstraint_new2(long rbA, long rbAFrame) {
        long __functionAddress = Functions.ConeTwistConstraint_new2;
        if (CHECKS) {
            check(rbA);
        }
        return invokePPP(rbA, rbAFrame, __functionAddress);
    }

    @NativeType("void *")
    public static long btConeTwistConstraint_new2(@NativeType("void *") long rbA, @NativeType("btTransform const *") BTTransform rbAFrame) {
        return nbtConeTwistConstraint_new2(rbA, rbAFrame.address());
    }

    // --- [ btConeTwistConstraint_calcAngleInfo ] ---

    public static void btConeTwistConstraint_calcAngleInfo(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_calcAngleInfo;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_calcAngleInfo2 ] ---

    public static void nbtConeTwistConstraint_calcAngleInfo2(long obj, long transA, long transB, long invInertiaWorldA, long invInertiaWorldB) {
        long __functionAddress = Functions.ConeTwistConstraint_calcAngleInfo2;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPPV(obj, transA, transB, invInertiaWorldA, invInertiaWorldB, __functionAddress);
    }

    public static void btConeTwistConstraint_calcAngleInfo2(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB, @NativeType("btMatrix3x3 const *") BTMatrix3x3 invInertiaWorldA, @NativeType("btMatrix3x3 const *") BTMatrix3x3 invInertiaWorldB) {
        nbtConeTwistConstraint_calcAngleInfo2(obj, transA.address(), transB.address(), invInertiaWorldA.address(), invInertiaWorldB.address());
    }

    // --- [ btConeTwistConstraint_enableMotor ] ---

    public static void btConeTwistConstraint_enableMotor(@NativeType("void *") long obj, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.ConeTwistConstraint_enableMotor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, b, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getAFrame ] ---

    public static void nbtConeTwistConstraint_getAFrame(long obj, long value) {
        long __functionAddress = Functions.ConeTwistConstraint_getAFrame;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConeTwistConstraint_getAFrame(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtConeTwistConstraint_getAFrame(obj, value.address());
    }

    // --- [ btConeTwistConstraint_getAngularOnly ] ---

    @NativeType("bool")
    public static boolean btConeTwistConstraint_getAngularOnly(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_getAngularOnly;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getBFrame ] ---

    public static void nbtConeTwistConstraint_getBFrame(long obj, long value) {
        long __functionAddress = Functions.ConeTwistConstraint_getBFrame;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConeTwistConstraint_getBFrame(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtConeTwistConstraint_getBFrame(obj, value.address());
    }

    // --- [ btConeTwistConstraint_getBiasFactor ] ---

    @NativeType("btScalar")
    public static float btConeTwistConstraint_getBiasFactor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_getBiasFactor;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getDamping ] ---

    @NativeType("btScalar")
    public static float btConeTwistConstraint_getDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_getDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getFixThresh ] ---

    @NativeType("btScalar")
    public static float btConeTwistConstraint_getFixThresh(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_getFixThresh;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getFlags ] ---

    public static int btConeTwistConstraint_getFlags(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_getFlags;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getFrameOffsetA ] ---

    public static void nbtConeTwistConstraint_getFrameOffsetA(long obj, long value) {
        long __functionAddress = Functions.ConeTwistConstraint_getFrameOffsetA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConeTwistConstraint_getFrameOffsetA(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtConeTwistConstraint_getFrameOffsetA(obj, value.address());
    }

    // --- [ btConeTwistConstraint_getFrameOffsetB ] ---

    public static void nbtConeTwistConstraint_getFrameOffsetB(long obj, long value) {
        long __functionAddress = Functions.ConeTwistConstraint_getFrameOffsetB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConeTwistConstraint_getFrameOffsetB(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtConeTwistConstraint_getFrameOffsetB(obj, value.address());
    }

    // --- [ btConeTwistConstraint_getInfo1NonVirtual ] ---

    public static void btConeTwistConstraint_getInfo1NonVirtual(@NativeType("void *") long obj, @NativeType("void *") long info) {
        long __functionAddress = Functions.ConeTwistConstraint_getInfo1NonVirtual;
        if (CHECKS) {
            check(obj);
            check(info);
        }
        invokePPV(obj, info, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getInfo2NonVirtual ] ---

    public static void nbtConeTwistConstraint_getInfo2NonVirtual(long obj, long info, long transA, long transB, long invInertiaWorldA, long invInertiaWorldB) {
        long __functionAddress = Functions.ConeTwistConstraint_getInfo2NonVirtual;
        if (CHECKS) {
            check(obj);
            check(info);
        }
        invokePPPPPPV(obj, info, transA, transB, invInertiaWorldA, invInertiaWorldB, __functionAddress);
    }

    public static void btConeTwistConstraint_getInfo2NonVirtual(@NativeType("void *") long obj, @NativeType("void *") long info, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB, @NativeType("btMatrix3x3 const *") BTMatrix3x3 invInertiaWorldA, @NativeType("btMatrix3x3 const *") BTMatrix3x3 invInertiaWorldB) {
        nbtConeTwistConstraint_getInfo2NonVirtual(obj, info, transA.address(), transB.address(), invInertiaWorldA.address(), invInertiaWorldB.address());
    }

    // --- [ btConeTwistConstraint_getLimit ] ---

    @NativeType("btScalar")
    public static float btConeTwistConstraint_getLimit(@NativeType("void *") long obj, int limitIndex) {
        long __functionAddress = Functions.ConeTwistConstraint_getLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, limitIndex, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getLimitSoftness ] ---

    @NativeType("btScalar")
    public static float btConeTwistConstraint_getLimitSoftness(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_getLimitSoftness;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getMaxMotorImpulse ] ---

    @NativeType("btScalar")
    public static float btConeTwistConstraint_getMaxMotorImpulse(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_getMaxMotorImpulse;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getMotorTarget ] ---

    public static void nbtConeTwistConstraint_getMotorTarget(long obj, long value) {
        long __functionAddress = Functions.ConeTwistConstraint_getMotorTarget;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConeTwistConstraint_getMotorTarget(@NativeType("void *") long obj, @NativeType("btQuaternion *") BTVector3 value) {
        nbtConeTwistConstraint_getMotorTarget(obj, value.address());
    }

    // --- [ btConeTwistConstraint_GetPointForAngle ] ---

    public static void nbtConeTwistConstraint_GetPointForAngle(long obj, float fAngleInRadians, float fLength, long value) {
        long __functionAddress = Functions.ConeTwistConstraint_GetPointForAngle;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, fAngleInRadians, fLength, value, __functionAddress);
    }

    public static void btConeTwistConstraint_GetPointForAngle(@NativeType("void *") long obj, @NativeType("btScalar") float fAngleInRadians, @NativeType("btScalar") float fLength, @NativeType("btVector3 *") BTVector3 value) {
        nbtConeTwistConstraint_GetPointForAngle(obj, fAngleInRadians, fLength, value.address());
    }

    // --- [ btConeTwistConstraint_getRelaxationFactor ] ---

    @NativeType("btScalar")
    public static float btConeTwistConstraint_getRelaxationFactor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_getRelaxationFactor;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getSolveSwingLimit ] ---

    public static int btConeTwistConstraint_getSolveSwingLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_getSolveSwingLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getSolveTwistLimit ] ---

    public static int btConeTwistConstraint_getSolveTwistLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_getSolveTwistLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getSwingSpan1 ] ---

    @NativeType("btScalar")
    public static float btConeTwistConstraint_getSwingSpan1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_getSwingSpan1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getSwingSpan2 ] ---

    @NativeType("btScalar")
    public static float btConeTwistConstraint_getSwingSpan2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_getSwingSpan2;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getTwistAngle ] ---

    @NativeType("btScalar")
    public static float btConeTwistConstraint_getTwistAngle(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_getTwistAngle;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getTwistLimitSign ] ---

    @NativeType("btScalar")
    public static float btConeTwistConstraint_getTwistLimitSign(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_getTwistLimitSign;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_getTwistSpan ] ---

    @NativeType("btScalar")
    public static float btConeTwistConstraint_getTwistSpan(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_getTwistSpan;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_isMaxMotorImpulseNormalized ] ---

    @NativeType("bool")
    public static boolean btConeTwistConstraint_isMaxMotorImpulseNormalized(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_isMaxMotorImpulseNormalized;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_isMotorEnabled ] ---

    @NativeType("bool")
    public static boolean btConeTwistConstraint_isMotorEnabled(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_isMotorEnabled;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_isPastSwingLimit ] ---

    @NativeType("bool")
    public static boolean btConeTwistConstraint_isPastSwingLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeTwistConstraint_isPastSwingLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btConeTwistConstraint_setAngularOnly ] ---

    public static void btConeTwistConstraint_setAngularOnly(@NativeType("void *") long obj, @NativeType("bool") boolean angularOnly) {
        long __functionAddress = Functions.ConeTwistConstraint_setAngularOnly;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, angularOnly, __functionAddress);
    }

    // --- [ btConeTwistConstraint_setDamping ] ---

    public static void btConeTwistConstraint_setDamping(@NativeType("void *") long obj, @NativeType("btScalar") float damping) {
        long __functionAddress = Functions.ConeTwistConstraint_setDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, damping, __functionAddress);
    }

    // --- [ btConeTwistConstraint_setFixThresh ] ---

    public static void btConeTwistConstraint_setFixThresh(@NativeType("void *") long obj, @NativeType("btScalar") float fixThresh) {
        long __functionAddress = Functions.ConeTwistConstraint_setFixThresh;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, fixThresh, __functionAddress);
    }

    // --- [ btConeTwistConstraint_setFrames ] ---

    public static void nbtConeTwistConstraint_setFrames(long obj, long frameA, long frameB) {
        long __functionAddress = Functions.ConeTwistConstraint_setFrames;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, frameA, frameB, __functionAddress);
    }

    public static void btConeTwistConstraint_setFrames(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform frameA, @NativeType("btTransform const *") BTTransform frameB) {
        nbtConeTwistConstraint_setFrames(obj, frameA.address(), frameB.address());
    }

    // --- [ btConeTwistConstraint_setLimit ] ---

    public static void btConeTwistConstraint_setLimit(@NativeType("void *") long obj, int limitIndex, @NativeType("btScalar") float limitValue) {
        long __functionAddress = Functions.ConeTwistConstraint_setLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, limitIndex, limitValue, __functionAddress);
    }

    // --- [ btConeTwistConstraint_setLimit2 ] ---

    public static void btConeTwistConstraint_setLimit2(@NativeType("void *") long obj, @NativeType("btScalar") float _swingSpan1, @NativeType("btScalar") float _swingSpan2, @NativeType("btScalar") float _twistSpan, @NativeType("btScalar") float _softness, @NativeType("btScalar") float _biasFactor, @NativeType("btScalar") float _relaxationFactor) {
        long __functionAddress = Functions.ConeTwistConstraint_setLimit2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, _swingSpan1, _swingSpan2, _twistSpan, _softness, _biasFactor, _relaxationFactor, __functionAddress);
    }

    // --- [ btConeTwistConstraint_setMaxMotorImpulse ] ---

    public static void btConeTwistConstraint_setMaxMotorImpulse(@NativeType("void *") long obj, @NativeType("btScalar") float maxMotorImpulse) {
        long __functionAddress = Functions.ConeTwistConstraint_setMaxMotorImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, maxMotorImpulse, __functionAddress);
    }

    // --- [ btConeTwistConstraint_setMaxMotorImpulseNormalized ] ---

    public static void btConeTwistConstraint_setMaxMotorImpulseNormalized(@NativeType("void *") long obj, @NativeType("btScalar") float maxMotorImpulse) {
        long __functionAddress = Functions.ConeTwistConstraint_setMaxMotorImpulseNormalized;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, maxMotorImpulse, __functionAddress);
    }

    // --- [ btConeTwistConstraint_setMotorTarget ] ---

    public static void nbtConeTwistConstraint_setMotorTarget(long obj, long q) {
        long __functionAddress = Functions.ConeTwistConstraint_setMotorTarget;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, q, __functionAddress);
    }

    public static void btConeTwistConstraint_setMotorTarget(@NativeType("void *") long obj, @NativeType("btQuaternion const *") BTVector3 q) {
        nbtConeTwistConstraint_setMotorTarget(obj, q.address());
    }

    // --- [ btConeTwistConstraint_setMotorTargetInConstraintSpace ] ---

    public static void nbtConeTwistConstraint_setMotorTargetInConstraintSpace(long obj, long q) {
        long __functionAddress = Functions.ConeTwistConstraint_setMotorTargetInConstraintSpace;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, q, __functionAddress);
    }

    public static void btConeTwistConstraint_setMotorTargetInConstraintSpace(@NativeType("void *") long obj, @NativeType("btQuaternion const *") BTVector3 q) {
        nbtConeTwistConstraint_setMotorTargetInConstraintSpace(obj, q.address());
    }

    // --- [ btConeTwistConstraint_updateRHS ] ---

    public static void btConeTwistConstraint_updateRHS(@NativeType("void *") long obj, @NativeType("btScalar") float timeStep) {
        long __functionAddress = Functions.ConeTwistConstraint_updateRHS;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, timeStep, __functionAddress);
    }

}