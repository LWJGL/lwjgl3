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

public class BTHingeConstraint {

    protected BTHingeConstraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            HingeConstraint_new                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_new"),
            HingeConstraint_new2                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_new2"),
            HingeConstraint_new3                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_new3"),
            HingeConstraint_new4                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_new4"),
            HingeConstraint_enableAngularMotor                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_enableAngularMotor"),
            HingeConstraint_enableMotor                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_enableMotor"),
            HingeConstraint_getAFrame                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getAFrame"),
            HingeConstraint_getAngularOnly                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getAngularOnly"),
            HingeConstraint_getBFrame                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getBFrame"),
            HingeConstraint_getEnableAngularMotor                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getEnableAngularMotor"),
            HingeConstraint_getFlags                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getFlags"),
            HingeConstraint_getFrameOffsetA                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getFrameOffsetA"),
            HingeConstraint_getFrameOffsetB                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getFrameOffsetB"),
            HingeConstraint_getHingeAngle                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getHingeAngle"),
            HingeConstraint_getHingeAngle2                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getHingeAngle2"),
            HingeConstraint_getInfo1NonVirtual                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getInfo1NonVirtual"),
            HingeConstraint_getInfo2Internal                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getInfo2Internal"),
            HingeConstraint_getInfo2InternalUsingFrameOffset         = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getInfo2InternalUsingFrameOffset"),
            HingeConstraint_getInfo2NonVirtual                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getInfo2NonVirtual"),
            HingeConstraint_getLimitBiasFactor                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getLimitBiasFactor"),
            HingeConstraint_getLimitRelaxationFactor                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getLimitRelaxationFactor"),
            HingeConstraint_getLimitSign                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getLimitSign"),
            HingeConstraint_getLimitSoftness                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getLimitSoftness"),
            HingeConstraint_getLowerLimit                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getLowerLimit"),
            HingeConstraint_getMaxMotorImpulse                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getMaxMotorImpulse"),
            HingeConstraint_getMotorTargetVelocity                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getMotorTargetVelocity"),
            HingeConstraint_getSolveLimit                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getSolveLimit"),
            HingeConstraint_getUpperLimit                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getUpperLimit"),
            HingeConstraint_getUseFrameOffset                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getUseFrameOffset"),
            HingeConstraint_getUseReferenceFrameA                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_getUseReferenceFrameA"),
            HingeConstraint_hasLimit                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_hasLimit"),
            HingeConstraint_setAngularOnly                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_setAngularOnly"),
            HingeConstraint_setAxis                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_setAxis"),
            HingeConstraint_setFrames                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_setFrames"),
            HingeConstraint_setLimit                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_setLimit"),
            HingeConstraint_setLimit2                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_setLimit2"),
            HingeConstraint_setLimit3                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_setLimit3"),
            HingeConstraint_setLimit4                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_setLimit4"),
            HingeConstraint_setMaxMotorImpulse                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_setMaxMotorImpulse"),
            HingeConstraint_setMotorTarget                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_setMotorTarget"),
            HingeConstraint_setMotorTarget2                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_setMotorTarget2"),
            HingeConstraint_setMotorTargetVelocity                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_setMotorTargetVelocity"),
            HingeConstraint_setUseFrameOffset                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_setUseFrameOffset"),
            HingeConstraint_setUseReferenceFrameA                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_setUseReferenceFrameA"),
            HingeConstraint_testLimit                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_testLimit"),
            HingeConstraint_updateRHS                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeConstraint_updateRHS"),
            HingeAccumulatedAngleConstraint_new                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeAccumulatedAngleConstraint_new"),
            HingeAccumulatedAngleConstraint_new2                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeAccumulatedAngleConstraint_new2"),
            HingeAccumulatedAngleConstraint_new3                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeAccumulatedAngleConstraint_new3"),
            HingeAccumulatedAngleConstraint_new4                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeAccumulatedAngleConstraint_new4"),
            HingeAccumulatedAngleConstraint_getAccumulatedHingeAngle = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeAccumulatedAngleConstraint_getAccumulatedHingeAngle"),
            HingeAccumulatedAngleConstraint_setAccumulatedHingeAngle = apiGetFunctionAddress(LibBullet.getLibrary(), "btHingeAccumulatedAngleConstraint_setAccumulatedHingeAngle");

    }

    // --- [ btHingeConstraint_new ] ---

    public static long nbtHingeConstraint_new(long rbA, long rbB, long pivotInA, long pivotInB, long axisInA, long axisInB, boolean useReferenceFrameA) {
        long __functionAddress = Functions.HingeConstraint_new;
        if (CHECKS) {
            check(rbA);
            check(rbB);
        }
        return invokePPPPPPP(rbA, rbB, pivotInA, pivotInB, axisInA, axisInB, useReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btHingeConstraint_new(@NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btVector3 const *") ΒΤVector3 pivotInA, @NativeType("btVector3 const *") ΒΤVector3 pivotInB, @NativeType("btVector3 const *") ΒΤVector3 axisInA, @NativeType("btVector3 const *") ΒΤVector3 axisInB, @NativeType("bool") boolean useReferenceFrameA) {
        return nbtHingeConstraint_new(rbA, rbB, pivotInA.address(), pivotInB.address(), axisInA.address(), axisInB.address(), useReferenceFrameA);
    }

    // --- [ btHingeConstraint_new2 ] ---

    public static long nbtHingeConstraint_new2(long rbA, long pivotInA, long axisInA, boolean useReferenceFrameA) {
        long __functionAddress = Functions.HingeConstraint_new2;
        if (CHECKS) {
            check(rbA);
        }
        return invokePPPP(rbA, pivotInA, axisInA, useReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btHingeConstraint_new2(@NativeType("void *") long rbA, @NativeType("btVector3 const *") ΒΤVector3 pivotInA, @NativeType("btVector3 const *") ΒΤVector3 axisInA, @NativeType("bool") boolean useReferenceFrameA) {
        return nbtHingeConstraint_new2(rbA, pivotInA.address(), axisInA.address(), useReferenceFrameA);
    }

    // --- [ btHingeConstraint_new3 ] ---

    public static long nbtHingeConstraint_new3(long rbA, long rbB, long rbAFrame, long rbBFrame, boolean useReferenceFrameA) {
        long __functionAddress = Functions.HingeConstraint_new3;
        if (CHECKS) {
            check(rbA);
            check(rbB);
        }
        return invokePPPPP(rbA, rbB, rbAFrame, rbBFrame, useReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btHingeConstraint_new3(@NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform rbAFrame, @NativeType("btTransform const *") BTTransform rbBFrame, @NativeType("bool") boolean useReferenceFrameA) {
        return nbtHingeConstraint_new3(rbA, rbB, rbAFrame.address(), rbBFrame.address(), useReferenceFrameA);
    }

    // --- [ btHingeConstraint_new4 ] ---

    public static long nbtHingeConstraint_new4(long rbA, long rbAFrame, boolean useReferenceFrameA) {
        long __functionAddress = Functions.HingeConstraint_new4;
        if (CHECKS) {
            check(rbA);
        }
        return invokePPP(rbA, rbAFrame, useReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btHingeConstraint_new4(@NativeType("void *") long rbA, @NativeType("btTransform const *") BTTransform rbAFrame, @NativeType("bool") boolean useReferenceFrameA) {
        return nbtHingeConstraint_new4(rbA, rbAFrame.address(), useReferenceFrameA);
    }

    // --- [ btHingeConstraint_enableAngularMotor ] ---

    public static void btHingeConstraint_enableAngularMotor(@NativeType("void *") long obj, @NativeType("bool") boolean enableMotor, @NativeType("btScalar") float targetVelocity, @NativeType("btScalar") float maxMotorImpulse) {
        long __functionAddress = Functions.HingeConstraint_enableAngularMotor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, enableMotor, targetVelocity, maxMotorImpulse, __functionAddress);
    }

    // --- [ btHingeConstraint_enableMotor ] ---

    public static void btHingeConstraint_enableMotor(@NativeType("void *") long obj, @NativeType("bool") boolean enableMotor) {
        long __functionAddress = Functions.HingeConstraint_enableMotor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, enableMotor, __functionAddress);
    }

    // --- [ btHingeConstraint_getAFrame ] ---

    public static void nbtHingeConstraint_getAFrame(long obj, long value) {
        long __functionAddress = Functions.HingeConstraint_getAFrame;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btHingeConstraint_getAFrame(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtHingeConstraint_getAFrame(obj, value.address());
    }

    // --- [ btHingeConstraint_getAngularOnly ] ---

    @NativeType("bool")
    public static boolean btHingeConstraint_getAngularOnly(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_getAngularOnly;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_getBFrame ] ---

    public static void nbtHingeConstraint_getBFrame(long obj, long value) {
        long __functionAddress = Functions.HingeConstraint_getBFrame;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btHingeConstraint_getBFrame(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtHingeConstraint_getBFrame(obj, value.address());
    }

    // --- [ btHingeConstraint_getEnableAngularMotor ] ---

    @NativeType("bool")
    public static boolean btHingeConstraint_getEnableAngularMotor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_getEnableAngularMotor;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_getFlags ] ---

    public static int btHingeConstraint_getFlags(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_getFlags;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_getFrameOffsetA ] ---

    public static void nbtHingeConstraint_getFrameOffsetA(long obj, long value) {
        long __functionAddress = Functions.HingeConstraint_getFrameOffsetA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btHingeConstraint_getFrameOffsetA(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtHingeConstraint_getFrameOffsetA(obj, value.address());
    }

    // --- [ btHingeConstraint_getFrameOffsetB ] ---

    public static void nbtHingeConstraint_getFrameOffsetB(long obj, long value) {
        long __functionAddress = Functions.HingeConstraint_getFrameOffsetB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btHingeConstraint_getFrameOffsetB(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtHingeConstraint_getFrameOffsetB(obj, value.address());
    }

    // --- [ btHingeConstraint_getHingeAngle ] ---

    public static float nbtHingeConstraint_getHingeAngle(long obj, long transA, long transB) {
        long __functionAddress = Functions.HingeConstraint_getHingeAngle;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPF(obj, transA, transB, __functionAddress);
    }

    @NativeType("btScalar")
    public static float btHingeConstraint_getHingeAngle(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB) {
        return nbtHingeConstraint_getHingeAngle(obj, transA.address(), transB.address());
    }

    // --- [ btHingeConstraint_getHingeAngle2 ] ---

    @NativeType("btScalar")
    public static float btHingeConstraint_getHingeAngle2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_getHingeAngle2;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_getInfo1NonVirtual ] ---

    public static void btHingeConstraint_getInfo1NonVirtual(@NativeType("void *") long obj, @NativeType("void *") long info) {
        long __functionAddress = Functions.HingeConstraint_getInfo1NonVirtual;
        if (CHECKS) {
            check(obj);
            check(info);
        }
        invokePPV(obj, info, __functionAddress);
    }

    // --- [ btHingeConstraint_getInfo2Internal ] ---

    public static void nbtHingeConstraint_getInfo2Internal(long obj, long info, long transA, long transB, long angVelA, long angVelB) {
        long __functionAddress = Functions.HingeConstraint_getInfo2Internal;
        if (CHECKS) {
            check(obj);
            check(info);
        }
        invokePPPPPPV(obj, info, transA, transB, angVelA, angVelB, __functionAddress);
    }

    public static void btHingeConstraint_getInfo2Internal(@NativeType("void *") long obj, @NativeType("void *") long info, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB, @NativeType("btVector3 const *") ΒΤVector3 angVelA, @NativeType("btVector3 const *") ΒΤVector3 angVelB) {
        nbtHingeConstraint_getInfo2Internal(obj, info, transA.address(), transB.address(), angVelA.address(), angVelB.address());
    }

    // --- [ btHingeConstraint_getInfo2InternalUsingFrameOffset ] ---

    public static void nbtHingeConstraint_getInfo2InternalUsingFrameOffset(long obj, long info, long transA, long transB, long angVelA, long angVelB) {
        long __functionAddress = Functions.HingeConstraint_getInfo2InternalUsingFrameOffset;
        if (CHECKS) {
            check(obj);
            check(info);
        }
        invokePPPPPPV(obj, info, transA, transB, angVelA, angVelB, __functionAddress);
    }

    public static void btHingeConstraint_getInfo2InternalUsingFrameOffset(@NativeType("void *") long obj, @NativeType("void *") long info, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB, @NativeType("btVector3 const *") ΒΤVector3 angVelA, @NativeType("btVector3 const *") ΒΤVector3 angVelB) {
        nbtHingeConstraint_getInfo2InternalUsingFrameOffset(obj, info, transA.address(), transB.address(), angVelA.address(), angVelB.address());
    }

    // --- [ btHingeConstraint_getInfo2NonVirtual ] ---

    public static void nbtHingeConstraint_getInfo2NonVirtual(long obj, long info, long transA, long transB, long angVelA, long angVelB) {
        long __functionAddress = Functions.HingeConstraint_getInfo2NonVirtual;
        if (CHECKS) {
            check(obj);
            check(info);
        }
        invokePPPPPPV(obj, info, transA, transB, angVelA, angVelB, __functionAddress);
    }

    public static void btHingeConstraint_getInfo2NonVirtual(@NativeType("void *") long obj, @NativeType("void *") long info, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB, @NativeType("btVector3 const *") ΒΤVector3 angVelA, @NativeType("btVector3 const *") ΒΤVector3 angVelB) {
        nbtHingeConstraint_getInfo2NonVirtual(obj, info, transA.address(), transB.address(), angVelA.address(), angVelB.address());
    }

    // --- [ btHingeConstraint_getLimitBiasFactor ] ---

    @NativeType("btScalar")
    public static float btHingeConstraint_getLimitBiasFactor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_getLimitBiasFactor;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_getLimitRelaxationFactor ] ---

    @NativeType("btScalar")
    public static float btHingeConstraint_getLimitRelaxationFactor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_getLimitRelaxationFactor;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_getLimitSign ] ---

    @NativeType("btScalar")
    public static float btHingeConstraint_getLimitSign(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_getLimitSign;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_getLimitSoftness ] ---

    @NativeType("btScalar")
    public static float btHingeConstraint_getLimitSoftness(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_getLimitSoftness;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_getLowerLimit ] ---

    @NativeType("btScalar")
    public static float btHingeConstraint_getLowerLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_getLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_getMaxMotorImpulse ] ---

    @NativeType("btScalar")
    public static float btHingeConstraint_getMaxMotorImpulse(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_getMaxMotorImpulse;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_getMotorTargetVelocity ] ---

    @NativeType("btScalar")
    public static float btHingeConstraint_getMotorTargetVelocity(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_getMotorTargetVelocity;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_getSolveLimit ] ---

    public static int btHingeConstraint_getSolveLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_getSolveLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_getUpperLimit ] ---

    @NativeType("btScalar")
    public static float btHingeConstraint_getUpperLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_getUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_getUseFrameOffset ] ---

    @NativeType("bool")
    public static boolean btHingeConstraint_getUseFrameOffset(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_getUseFrameOffset;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_getUseReferenceFrameA ] ---

    @NativeType("bool")
    public static boolean btHingeConstraint_getUseReferenceFrameA(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_getUseReferenceFrameA;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_hasLimit ] ---

    @NativeType("bool")
    public static boolean btHingeConstraint_hasLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeConstraint_hasLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btHingeConstraint_setAngularOnly ] ---

    public static void btHingeConstraint_setAngularOnly(@NativeType("void *") long obj, @NativeType("bool") boolean angularOnly) {
        long __functionAddress = Functions.HingeConstraint_setAngularOnly;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, angularOnly, __functionAddress);
    }

    // --- [ btHingeConstraint_setAxis ] ---

    public static void nbtHingeConstraint_setAxis(long obj, long axisInA) {
        long __functionAddress = Functions.HingeConstraint_setAxis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, axisInA, __functionAddress);
    }

    public static void btHingeConstraint_setAxis(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 axisInA) {
        nbtHingeConstraint_setAxis(obj, axisInA.address());
    }

    // --- [ btHingeConstraint_setFrames ] ---

    public static void nbtHingeConstraint_setFrames(long obj, long frameA, long frameB) {
        long __functionAddress = Functions.HingeConstraint_setFrames;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, frameA, frameB, __functionAddress);
    }

    public static void btHingeConstraint_setFrames(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform frameA, @NativeType("btTransform const *") BTTransform frameB) {
        nbtHingeConstraint_setFrames(obj, frameA.address(), frameB.address());
    }

    // --- [ btHingeConstraint_setLimit ] ---

    public static void btHingeConstraint_setLimit(@NativeType("void *") long obj, @NativeType("btScalar") float low, @NativeType("btScalar") float high) {
        long __functionAddress = Functions.HingeConstraint_setLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, low, high, __functionAddress);
    }

    // --- [ btHingeConstraint_setLimit2 ] ---

    public static void btHingeConstraint_setLimit2(@NativeType("void *") long obj, @NativeType("btScalar") float low, @NativeType("btScalar") float high, @NativeType("btScalar") float _softness) {
        long __functionAddress = Functions.HingeConstraint_setLimit2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, low, high, _softness, __functionAddress);
    }

    // --- [ btHingeConstraint_setLimit3 ] ---

    public static void btHingeConstraint_setLimit3(@NativeType("void *") long obj, @NativeType("btScalar") float low, @NativeType("btScalar") float high, @NativeType("btScalar") float _softness, @NativeType("btScalar") float _biasFactor) {
        long __functionAddress = Functions.HingeConstraint_setLimit3;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, low, high, _softness, _biasFactor, __functionAddress);
    }

    // --- [ btHingeConstraint_setLimit4 ] ---

    public static void btHingeConstraint_setLimit4(@NativeType("void *") long obj, @NativeType("btScalar") float low, @NativeType("btScalar") float high, @NativeType("btScalar") float _softness, @NativeType("btScalar") float _biasFactor, @NativeType("btScalar") float _relaxationFactor) {
        long __functionAddress = Functions.HingeConstraint_setLimit4;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, low, high, _softness, _biasFactor, _relaxationFactor, __functionAddress);
    }

    // --- [ btHingeConstraint_setMaxMotorImpulse ] ---

    public static void btHingeConstraint_setMaxMotorImpulse(@NativeType("void *") long obj, @NativeType("btScalar") float maxMotorImpulse) {
        long __functionAddress = Functions.HingeConstraint_setMaxMotorImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, maxMotorImpulse, __functionAddress);
    }

    // --- [ btHingeConstraint_setMotorTarget ] ---

    public static void btHingeConstraint_setMotorTarget(@NativeType("void *") long obj, @NativeType("btScalar") float targetAngle, @NativeType("btScalar") float dt) {
        long __functionAddress = Functions.HingeConstraint_setMotorTarget;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, targetAngle, dt, __functionAddress);
    }

    // --- [ btHingeConstraint_setMotorTarget2 ] ---

    public static void nbtHingeConstraint_setMotorTarget2(long obj, long qAinB, float dt) {
        long __functionAddress = Functions.HingeConstraint_setMotorTarget2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, qAinB, dt, __functionAddress);
    }

    public static void btHingeConstraint_setMotorTarget2(@NativeType("void *") long obj, @NativeType("btQuaternion const *") ΒΤVector3 qAinB, @NativeType("btScalar") float dt) {
        nbtHingeConstraint_setMotorTarget2(obj, qAinB.address(), dt);
    }

    // --- [ btHingeConstraint_setMotorTargetVelocity ] ---

    public static void btHingeConstraint_setMotorTargetVelocity(@NativeType("void *") long obj, @NativeType("btScalar") float motorTargetVelocity) {
        long __functionAddress = Functions.HingeConstraint_setMotorTargetVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, motorTargetVelocity, __functionAddress);
    }

    // --- [ btHingeConstraint_setUseFrameOffset ] ---

    public static void btHingeConstraint_setUseFrameOffset(@NativeType("void *") long obj, @NativeType("bool") boolean frameOffsetOnOff) {
        long __functionAddress = Functions.HingeConstraint_setUseFrameOffset;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, frameOffsetOnOff, __functionAddress);
    }

    // --- [ btHingeConstraint_setUseReferenceFrameA ] ---

    public static void btHingeConstraint_setUseReferenceFrameA(@NativeType("void *") long obj, @NativeType("bool") boolean useReferenceFrameA) {
        long __functionAddress = Functions.HingeConstraint_setUseReferenceFrameA;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, useReferenceFrameA, __functionAddress);
    }

    // --- [ btHingeConstraint_testLimit ] ---

    public static void nbtHingeConstraint_testLimit(long obj, long transA, long transB) {
        long __functionAddress = Functions.HingeConstraint_testLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, transA, transB, __functionAddress);
    }

    public static void btHingeConstraint_testLimit(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB) {
        nbtHingeConstraint_testLimit(obj, transA.address(), transB.address());
    }

    // --- [ btHingeConstraint_updateRHS ] ---

    public static void btHingeConstraint_updateRHS(@NativeType("void *") long obj, @NativeType("btScalar") float timeStep) {
        long __functionAddress = Functions.HingeConstraint_updateRHS;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, timeStep, __functionAddress);
    }

    // --- [ btHingeAccumulatedAngleConstraint_new ] ---

    public static long nbtHingeAccumulatedAngleConstraint_new(long rbA, long rbB, long pivotInA, long pivotInB, long axisInA, long axisInB, boolean useReferenceFrameA) {
        long __functionAddress = Functions.HingeAccumulatedAngleConstraint_new;
        if (CHECKS) {
            check(rbA);
            check(rbB);
        }
        return invokePPPPPPP(rbA, rbB, pivotInA, pivotInB, axisInA, axisInB, useReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btHingeAccumulatedAngleConstraint_new(@NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btVector3 const *") ΒΤVector3 pivotInA, @NativeType("btVector3 const *") ΒΤVector3 pivotInB, @NativeType("btVector3 const *") ΒΤVector3 axisInA, @NativeType("btVector3 const *") ΒΤVector3 axisInB, @NativeType("bool") boolean useReferenceFrameA) {
        return nbtHingeAccumulatedAngleConstraint_new(rbA, rbB, pivotInA.address(), pivotInB.address(), axisInA.address(), axisInB.address(), useReferenceFrameA);
    }

    // --- [ btHingeAccumulatedAngleConstraint_new2 ] ---

    public static long nbtHingeAccumulatedAngleConstraint_new2(long rbA, long pivotInA, long axisInA, boolean useReferenceFrameA) {
        long __functionAddress = Functions.HingeAccumulatedAngleConstraint_new2;
        if (CHECKS) {
            check(rbA);
        }
        return invokePPPP(rbA, pivotInA, axisInA, useReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btHingeAccumulatedAngleConstraint_new2(@NativeType("void *") long rbA, @NativeType("btVector3 const *") ΒΤVector3 pivotInA, @NativeType("btVector3 const *") ΒΤVector3 axisInA, @NativeType("bool") boolean useReferenceFrameA) {
        return nbtHingeAccumulatedAngleConstraint_new2(rbA, pivotInA.address(), axisInA.address(), useReferenceFrameA);
    }

    // --- [ btHingeAccumulatedAngleConstraint_new3 ] ---

    public static long nbtHingeAccumulatedAngleConstraint_new3(long rbA, long rbB, long rbAFrame, long rbBFrame, boolean useReferenceFrameA) {
        long __functionAddress = Functions.HingeAccumulatedAngleConstraint_new3;
        if (CHECKS) {
            check(rbA);
            check(rbB);
        }
        return invokePPPPP(rbA, rbB, rbAFrame, rbBFrame, useReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btHingeAccumulatedAngleConstraint_new3(@NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform rbAFrame, @NativeType("btTransform const *") BTTransform rbBFrame, @NativeType("bool") boolean useReferenceFrameA) {
        return nbtHingeAccumulatedAngleConstraint_new3(rbA, rbB, rbAFrame.address(), rbBFrame.address(), useReferenceFrameA);
    }

    // --- [ btHingeAccumulatedAngleConstraint_new4 ] ---

    public static long nbtHingeAccumulatedAngleConstraint_new4(long rbA, long rbAFrame, boolean useReferenceFrameA) {
        long __functionAddress = Functions.HingeAccumulatedAngleConstraint_new4;
        if (CHECKS) {
            check(rbA);
        }
        return invokePPP(rbA, rbAFrame, useReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btHingeAccumulatedAngleConstraint_new4(@NativeType("void *") long rbA, @NativeType("btTransform const *") BTTransform rbAFrame, @NativeType("bool") boolean useReferenceFrameA) {
        return nbtHingeAccumulatedAngleConstraint_new4(rbA, rbAFrame.address(), useReferenceFrameA);
    }

    // --- [ btHingeAccumulatedAngleConstraint_getAccumulatedHingeAngle ] ---

    @NativeType("btScalar")
    public static float btHingeAccumulatedAngleConstraint_getAccumulatedHingeAngle(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HingeAccumulatedAngleConstraint_getAccumulatedHingeAngle;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btHingeAccumulatedAngleConstraint_setAccumulatedHingeAngle ] ---

    public static void btHingeAccumulatedAngleConstraint_setAccumulatedHingeAngle(@NativeType("void *") long obj, @NativeType("btScalar") float accAngle) {
        long __functionAddress = Functions.HingeAccumulatedAngleConstraint_setAccumulatedHingeAngle;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, accAngle, __functionAddress);
    }

}