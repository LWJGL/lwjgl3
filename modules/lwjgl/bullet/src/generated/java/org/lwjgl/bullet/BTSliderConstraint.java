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

public class BTSliderConstraint {

    protected BTSliderConstraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SliderConstraint_new                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_new"),
            SliderConstraint_new2                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_new2"),
            SliderConstraint_calculateTransforms         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_calculateTransforms"),
            SliderConstraint_getAncorInA                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getAncorInA"),
            SliderConstraint_getAncorInB                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getAncorInB"),
            SliderConstraint_getAngDepth                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getAngDepth"),
            SliderConstraint_getAngularPos               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getAngularPos"),
            SliderConstraint_getCalculatedTransformA     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getCalculatedTransformA"),
            SliderConstraint_getCalculatedTransformB     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getCalculatedTransformB"),
            SliderConstraint_getDampingDirAng            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getDampingDirAng"),
            SliderConstraint_getDampingDirLin            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getDampingDirLin"),
            SliderConstraint_getDampingLimAng            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getDampingLimAng"),
            SliderConstraint_getDampingLimLin            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getDampingLimLin"),
            SliderConstraint_getDampingOrthoAng          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getDampingOrthoAng"),
            SliderConstraint_getDampingOrthoLin          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getDampingOrthoLin"),
            SliderConstraint_getFlags                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getFlags"),
            SliderConstraint_getFrameOffsetA             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getFrameOffsetA"),
            SliderConstraint_getFrameOffsetB             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getFrameOffsetB"),
            SliderConstraint_getInfo1NonVirtual          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getInfo1NonVirtual"),
            SliderConstraint_getInfo2NonVirtual          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getInfo2NonVirtual"),
            SliderConstraint_getLinDepth                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getLinDepth"),
            SliderConstraint_getLinearPos                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getLinearPos"),
            SliderConstraint_getLowerAngLimit            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getLowerAngLimit"),
            SliderConstraint_getLowerLinLimit            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getLowerLinLimit"),
            SliderConstraint_getMaxAngMotorForce         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getMaxAngMotorForce"),
            SliderConstraint_getMaxLinMotorForce         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getMaxLinMotorForce"),
            SliderConstraint_getPoweredAngMotor          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getPoweredAngMotor"),
            SliderConstraint_getPoweredLinMotor          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getPoweredLinMotor"),
            SliderConstraint_getRestitutionDirAng        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getRestitutionDirAng"),
            SliderConstraint_getRestitutionDirLin        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getRestitutionDirLin"),
            SliderConstraint_getRestitutionLimAng        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getRestitutionLimAng"),
            SliderConstraint_getRestitutionLimLin        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getRestitutionLimLin"),
            SliderConstraint_getRestitutionOrthoAng      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getRestitutionOrthoAng"),
            SliderConstraint_getRestitutionOrthoLin      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getRestitutionOrthoLin"),
            SliderConstraint_getSoftnessDirAng           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getSoftnessDirAng"),
            SliderConstraint_getSoftnessDirLin           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getSoftnessDirLin"),
            SliderConstraint_getSoftnessLimAng           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getSoftnessLimAng"),
            SliderConstraint_getSoftnessLimLin           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getSoftnessLimLin"),
            SliderConstraint_getSoftnessOrthoAng         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getSoftnessOrthoAng"),
            SliderConstraint_getSoftnessOrthoLin         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getSoftnessOrthoLin"),
            SliderConstraint_getSolveAngLimit            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getSolveAngLimit"),
            SliderConstraint_getSolveLinLimit            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getSolveLinLimit"),
            SliderConstraint_getTargetAngMotorVelocity   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getTargetAngMotorVelocity"),
            SliderConstraint_getTargetLinMotorVelocity   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getTargetLinMotorVelocity"),
            SliderConstraint_getUpperAngLimit            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getUpperAngLimit"),
            SliderConstraint_getUpperLinLimit            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getUpperLinLimit"),
            SliderConstraint_getUseFrameOffset           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getUseFrameOffset"),
            SliderConstraint_getUseLinearReferenceFrameA = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_getUseLinearReferenceFrameA"),
            SliderConstraint_setDampingDirAng            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setDampingDirAng"),
            SliderConstraint_setDampingDirLin            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setDampingDirLin"),
            SliderConstraint_setDampingLimAng            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setDampingLimAng"),
            SliderConstraint_setDampingLimLin            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setDampingLimLin"),
            SliderConstraint_setDampingOrthoAng          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setDampingOrthoAng"),
            SliderConstraint_setDampingOrthoLin          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setDampingOrthoLin"),
            SliderConstraint_setFrames                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setFrames"),
            SliderConstraint_setLowerAngLimit            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setLowerAngLimit"),
            SliderConstraint_setLowerLinLimit            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setLowerLinLimit"),
            SliderConstraint_setMaxAngMotorForce         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setMaxAngMotorForce"),
            SliderConstraint_setMaxLinMotorForce         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setMaxLinMotorForce"),
            SliderConstraint_setPoweredAngMotor          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setPoweredAngMotor"),
            SliderConstraint_setPoweredLinMotor          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setPoweredLinMotor"),
            SliderConstraint_setRestitutionDirAng        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setRestitutionDirAng"),
            SliderConstraint_setRestitutionDirLin        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setRestitutionDirLin"),
            SliderConstraint_setRestitutionLimAng        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setRestitutionLimAng"),
            SliderConstraint_setRestitutionLimLin        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setRestitutionLimLin"),
            SliderConstraint_setRestitutionOrthoAng      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setRestitutionOrthoAng"),
            SliderConstraint_setRestitutionOrthoLin      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setRestitutionOrthoLin"),
            SliderConstraint_setSoftnessDirAng           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setSoftnessDirAng"),
            SliderConstraint_setSoftnessDirLin           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setSoftnessDirLin"),
            SliderConstraint_setSoftnessLimAng           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setSoftnessLimAng"),
            SliderConstraint_setSoftnessLimLin           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setSoftnessLimLin"),
            SliderConstraint_setSoftnessOrthoAng         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setSoftnessOrthoAng"),
            SliderConstraint_setSoftnessOrthoLin         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setSoftnessOrthoLin"),
            SliderConstraint_setTargetAngMotorVelocity   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setTargetAngMotorVelocity"),
            SliderConstraint_setTargetLinMotorVelocity   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setTargetLinMotorVelocity"),
            SliderConstraint_setUpperAngLimit            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setUpperAngLimit"),
            SliderConstraint_setUpperLinLimit            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setUpperLinLimit"),
            SliderConstraint_setUseFrameOffset           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_setUseFrameOffset"),
            SliderConstraint_testAngLimits               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_testAngLimits"),
            SliderConstraint_testLinLimits               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSliderConstraint_testLinLimits");

    }

    // --- [ btSliderConstraint_new ] ---

    public static long nbtSliderConstraint_new(long rbA, long rbB, long frameInA, long frameInB, boolean useLinearReferenceFrameA) {
        long __functionAddress = Functions.SliderConstraint_new;
        if (CHECKS) {
            check(rbA);
            check(rbB);
        }
        return invokePPPPP(rbA, rbB, frameInA, frameInB, useLinearReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btSliderConstraint_new(@NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform frameInA, @NativeType("btTransform const *") BTTransform frameInB, @NativeType("bool") boolean useLinearReferenceFrameA) {
        return nbtSliderConstraint_new(rbA, rbB, frameInA.address(), frameInB.address(), useLinearReferenceFrameA);
    }

    // --- [ btSliderConstraint_new2 ] ---

    public static long nbtSliderConstraint_new2(long rbB, long frameInB, boolean useLinearReferenceFrameA) {
        long __functionAddress = Functions.SliderConstraint_new2;
        if (CHECKS) {
            check(rbB);
        }
        return invokePPP(rbB, frameInB, useLinearReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btSliderConstraint_new2(@NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform frameInB, @NativeType("bool") boolean useLinearReferenceFrameA) {
        return nbtSliderConstraint_new2(rbB, frameInB.address(), useLinearReferenceFrameA);
    }

    // --- [ btSliderConstraint_calculateTransforms ] ---

    public static void nbtSliderConstraint_calculateTransforms(long obj, long transA, long transB) {
        long __functionAddress = Functions.SliderConstraint_calculateTransforms;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, transA, transB, __functionAddress);
    }

    public static void btSliderConstraint_calculateTransforms(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB) {
        nbtSliderConstraint_calculateTransforms(obj, transA.address(), transB.address());
    }

    // --- [ btSliderConstraint_getAncorInA ] ---

    public static void nbtSliderConstraint_getAncorInA(long obj, long value) {
        long __functionAddress = Functions.SliderConstraint_getAncorInA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSliderConstraint_getAncorInA(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSliderConstraint_getAncorInA(obj, value.address());
    }

    // --- [ btSliderConstraint_getAncorInB ] ---

    public static void nbtSliderConstraint_getAncorInB(long obj, long value) {
        long __functionAddress = Functions.SliderConstraint_getAncorInB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSliderConstraint_getAncorInB(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSliderConstraint_getAncorInB(obj, value.address());
    }

    // --- [ btSliderConstraint_getAngDepth ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getAngDepth(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getAngDepth;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getAngularPos ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getAngularPos(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getAngularPos;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getCalculatedTransformA ] ---

    public static void nbtSliderConstraint_getCalculatedTransformA(long obj, long value) {
        long __functionAddress = Functions.SliderConstraint_getCalculatedTransformA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSliderConstraint_getCalculatedTransformA(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtSliderConstraint_getCalculatedTransformA(obj, value.address());
    }

    // --- [ btSliderConstraint_getCalculatedTransformB ] ---

    public static void nbtSliderConstraint_getCalculatedTransformB(long obj, long value) {
        long __functionAddress = Functions.SliderConstraint_getCalculatedTransformB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSliderConstraint_getCalculatedTransformB(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtSliderConstraint_getCalculatedTransformB(obj, value.address());
    }

    // --- [ btSliderConstraint_getDampingDirAng ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getDampingDirAng(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getDampingDirAng;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getDampingDirLin ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getDampingDirLin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getDampingDirLin;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getDampingLimAng ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getDampingLimAng(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getDampingLimAng;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getDampingLimLin ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getDampingLimLin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getDampingLimLin;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getDampingOrthoAng ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getDampingOrthoAng(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getDampingOrthoAng;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getDampingOrthoLin ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getDampingOrthoLin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getDampingOrthoLin;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getFlags ] ---

    public static int btSliderConstraint_getFlags(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getFlags;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getFrameOffsetA ] ---

    public static void nbtSliderConstraint_getFrameOffsetA(long obj, long value) {
        long __functionAddress = Functions.SliderConstraint_getFrameOffsetA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSliderConstraint_getFrameOffsetA(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtSliderConstraint_getFrameOffsetA(obj, value.address());
    }

    // --- [ btSliderConstraint_getFrameOffsetB ] ---

    public static void nbtSliderConstraint_getFrameOffsetB(long obj, long value) {
        long __functionAddress = Functions.SliderConstraint_getFrameOffsetB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSliderConstraint_getFrameOffsetB(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtSliderConstraint_getFrameOffsetB(obj, value.address());
    }

    // --- [ btSliderConstraint_getInfo1NonVirtual ] ---

    public static void btSliderConstraint_getInfo1NonVirtual(@NativeType("void *") long obj, @NativeType("void *") long info) {
        long __functionAddress = Functions.SliderConstraint_getInfo1NonVirtual;
        if (CHECKS) {
            check(obj);
            check(info);
        }
        invokePPV(obj, info, __functionAddress);
    }

    // --- [ btSliderConstraint_getInfo2NonVirtual ] ---

    public static void nbtSliderConstraint_getInfo2NonVirtual(long obj, long info, long transA, long transB, long linVelA, long linVelB, float rbAinvMass, float rbBinvMass) {
        long __functionAddress = Functions.SliderConstraint_getInfo2NonVirtual;
        if (CHECKS) {
            check(obj);
            check(info);
        }
        invokePPPPPPV(obj, info, transA, transB, linVelA, linVelB, rbAinvMass, rbBinvMass, __functionAddress);
    }

    public static void btSliderConstraint_getInfo2NonVirtual(@NativeType("void *") long obj, @NativeType("void *") long info, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB, @NativeType("btVector3 const *") ΒΤVector3 linVelA, @NativeType("btVector3 const *") ΒΤVector3 linVelB, @NativeType("btScalar") float rbAinvMass, @NativeType("btScalar") float rbBinvMass) {
        nbtSliderConstraint_getInfo2NonVirtual(obj, info, transA.address(), transB.address(), linVelA.address(), linVelB.address(), rbAinvMass, rbBinvMass);
    }

    // --- [ btSliderConstraint_getLinDepth ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getLinDepth(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getLinDepth;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getLinearPos ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getLinearPos(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getLinearPos;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getLowerAngLimit ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getLowerAngLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getLowerAngLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getLowerLinLimit ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getLowerLinLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getLowerLinLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getMaxAngMotorForce ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getMaxAngMotorForce(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getMaxAngMotorForce;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getMaxLinMotorForce ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getMaxLinMotorForce(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getMaxLinMotorForce;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getPoweredAngMotor ] ---

    @NativeType("bool")
    public static boolean btSliderConstraint_getPoweredAngMotor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getPoweredAngMotor;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getPoweredLinMotor ] ---

    @NativeType("bool")
    public static boolean btSliderConstraint_getPoweredLinMotor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getPoweredLinMotor;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getRestitutionDirAng ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getRestitutionDirAng(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getRestitutionDirAng;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getRestitutionDirLin ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getRestitutionDirLin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getRestitutionDirLin;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getRestitutionLimAng ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getRestitutionLimAng(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getRestitutionLimAng;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getRestitutionLimLin ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getRestitutionLimLin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getRestitutionLimLin;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getRestitutionOrthoAng ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getRestitutionOrthoAng(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getRestitutionOrthoAng;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getRestitutionOrthoLin ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getRestitutionOrthoLin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getRestitutionOrthoLin;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getSoftnessDirAng ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getSoftnessDirAng(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getSoftnessDirAng;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getSoftnessDirLin ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getSoftnessDirLin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getSoftnessDirLin;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getSoftnessLimAng ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getSoftnessLimAng(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getSoftnessLimAng;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getSoftnessLimLin ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getSoftnessLimLin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getSoftnessLimLin;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getSoftnessOrthoAng ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getSoftnessOrthoAng(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getSoftnessOrthoAng;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getSoftnessOrthoLin ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getSoftnessOrthoLin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getSoftnessOrthoLin;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getSolveAngLimit ] ---

    @NativeType("bool")
    public static boolean btSliderConstraint_getSolveAngLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getSolveAngLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getSolveLinLimit ] ---

    @NativeType("bool")
    public static boolean btSliderConstraint_getSolveLinLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getSolveLinLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getTargetAngMotorVelocity ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getTargetAngMotorVelocity(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getTargetAngMotorVelocity;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getTargetLinMotorVelocity ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getTargetLinMotorVelocity(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getTargetLinMotorVelocity;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getUpperAngLimit ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getUpperAngLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getUpperAngLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getUpperLinLimit ] ---

    @NativeType("btScalar")
    public static float btSliderConstraint_getUpperLinLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getUpperLinLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getUseFrameOffset ] ---

    @NativeType("bool")
    public static boolean btSliderConstraint_getUseFrameOffset(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getUseFrameOffset;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_getUseLinearReferenceFrameA ] ---

    @NativeType("bool")
    public static boolean btSliderConstraint_getUseLinearReferenceFrameA(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_getUseLinearReferenceFrameA;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_setDampingDirAng ] ---

    public static void btSliderConstraint_setDampingDirAng(@NativeType("void *") long obj, @NativeType("btScalar") float dampingDirAng) {
        long __functionAddress = Functions.SliderConstraint_setDampingDirAng;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dampingDirAng, __functionAddress);
    }

    // --- [ btSliderConstraint_setDampingDirLin ] ---

    public static void btSliderConstraint_setDampingDirLin(@NativeType("void *") long obj, @NativeType("btScalar") float dampingDirLin) {
        long __functionAddress = Functions.SliderConstraint_setDampingDirLin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dampingDirLin, __functionAddress);
    }

    // --- [ btSliderConstraint_setDampingLimAng ] ---

    public static void btSliderConstraint_setDampingLimAng(@NativeType("void *") long obj, @NativeType("btScalar") float dampingLimAng) {
        long __functionAddress = Functions.SliderConstraint_setDampingLimAng;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dampingLimAng, __functionAddress);
    }

    // --- [ btSliderConstraint_setDampingLimLin ] ---

    public static void btSliderConstraint_setDampingLimLin(@NativeType("void *") long obj, @NativeType("btScalar") float dampingLimLin) {
        long __functionAddress = Functions.SliderConstraint_setDampingLimLin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dampingLimLin, __functionAddress);
    }

    // --- [ btSliderConstraint_setDampingOrthoAng ] ---

    public static void btSliderConstraint_setDampingOrthoAng(@NativeType("void *") long obj, @NativeType("btScalar") float dampingOrthoAng) {
        long __functionAddress = Functions.SliderConstraint_setDampingOrthoAng;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dampingOrthoAng, __functionAddress);
    }

    // --- [ btSliderConstraint_setDampingOrthoLin ] ---

    public static void btSliderConstraint_setDampingOrthoLin(@NativeType("void *") long obj, @NativeType("btScalar") float dampingOrthoLin) {
        long __functionAddress = Functions.SliderConstraint_setDampingOrthoLin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dampingOrthoLin, __functionAddress);
    }

    // --- [ btSliderConstraint_setFrames ] ---

    public static void nbtSliderConstraint_setFrames(long obj, long frameA, long frameB) {
        long __functionAddress = Functions.SliderConstraint_setFrames;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, frameA, frameB, __functionAddress);
    }

    public static void btSliderConstraint_setFrames(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform frameA, @NativeType("btTransform const *") BTTransform frameB) {
        nbtSliderConstraint_setFrames(obj, frameA.address(), frameB.address());
    }

    // --- [ btSliderConstraint_setLowerAngLimit ] ---

    public static void btSliderConstraint_setLowerAngLimit(@NativeType("void *") long obj, @NativeType("btScalar") float lowerLimit) {
        long __functionAddress = Functions.SliderConstraint_setLowerAngLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, lowerLimit, __functionAddress);
    }

    // --- [ btSliderConstraint_setLowerLinLimit ] ---

    public static void btSliderConstraint_setLowerLinLimit(@NativeType("void *") long obj, @NativeType("btScalar") float lowerLimit) {
        long __functionAddress = Functions.SliderConstraint_setLowerLinLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, lowerLimit, __functionAddress);
    }

    // --- [ btSliderConstraint_setMaxAngMotorForce ] ---

    public static void btSliderConstraint_setMaxAngMotorForce(@NativeType("void *") long obj, @NativeType("btScalar") float maxAngMotorForce) {
        long __functionAddress = Functions.SliderConstraint_setMaxAngMotorForce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, maxAngMotorForce, __functionAddress);
    }

    // --- [ btSliderConstraint_setMaxLinMotorForce ] ---

    public static void btSliderConstraint_setMaxLinMotorForce(@NativeType("void *") long obj, @NativeType("btScalar") float maxLinMotorForce) {
        long __functionAddress = Functions.SliderConstraint_setMaxLinMotorForce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, maxLinMotorForce, __functionAddress);
    }

    // --- [ btSliderConstraint_setPoweredAngMotor ] ---

    public static void btSliderConstraint_setPoweredAngMotor(@NativeType("void *") long obj, @NativeType("bool") boolean onOff) {
        long __functionAddress = Functions.SliderConstraint_setPoweredAngMotor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, onOff, __functionAddress);
    }

    // --- [ btSliderConstraint_setPoweredLinMotor ] ---

    public static void btSliderConstraint_setPoweredLinMotor(@NativeType("void *") long obj, @NativeType("bool") boolean onOff) {
        long __functionAddress = Functions.SliderConstraint_setPoweredLinMotor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, onOff, __functionAddress);
    }

    // --- [ btSliderConstraint_setRestitutionDirAng ] ---

    public static void btSliderConstraint_setRestitutionDirAng(@NativeType("void *") long obj, @NativeType("btScalar") float restitutionDirAng) {
        long __functionAddress = Functions.SliderConstraint_setRestitutionDirAng;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, restitutionDirAng, __functionAddress);
    }

    // --- [ btSliderConstraint_setRestitutionDirLin ] ---

    public static void btSliderConstraint_setRestitutionDirLin(@NativeType("void *") long obj, @NativeType("btScalar") float restitutionDirLin) {
        long __functionAddress = Functions.SliderConstraint_setRestitutionDirLin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, restitutionDirLin, __functionAddress);
    }

    // --- [ btSliderConstraint_setRestitutionLimAng ] ---

    public static void btSliderConstraint_setRestitutionLimAng(@NativeType("void *") long obj, @NativeType("btScalar") float restitutionLimAng) {
        long __functionAddress = Functions.SliderConstraint_setRestitutionLimAng;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, restitutionLimAng, __functionAddress);
    }

    // --- [ btSliderConstraint_setRestitutionLimLin ] ---

    public static void btSliderConstraint_setRestitutionLimLin(@NativeType("void *") long obj, @NativeType("btScalar") float restitutionLimLin) {
        long __functionAddress = Functions.SliderConstraint_setRestitutionLimLin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, restitutionLimLin, __functionAddress);
    }

    // --- [ btSliderConstraint_setRestitutionOrthoAng ] ---

    public static void btSliderConstraint_setRestitutionOrthoAng(@NativeType("void *") long obj, @NativeType("btScalar") float restitutionOrthoAng) {
        long __functionAddress = Functions.SliderConstraint_setRestitutionOrthoAng;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, restitutionOrthoAng, __functionAddress);
    }

    // --- [ btSliderConstraint_setRestitutionOrthoLin ] ---

    public static void btSliderConstraint_setRestitutionOrthoLin(@NativeType("void *") long obj, @NativeType("btScalar") float restitutionOrthoLin) {
        long __functionAddress = Functions.SliderConstraint_setRestitutionOrthoLin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, restitutionOrthoLin, __functionAddress);
    }

    // --- [ btSliderConstraint_setSoftnessDirAng ] ---

    public static void btSliderConstraint_setSoftnessDirAng(@NativeType("void *") long obj, @NativeType("btScalar") float softnessDirAng) {
        long __functionAddress = Functions.SliderConstraint_setSoftnessDirAng;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, softnessDirAng, __functionAddress);
    }

    // --- [ btSliderConstraint_setSoftnessDirLin ] ---

    public static void btSliderConstraint_setSoftnessDirLin(@NativeType("void *") long obj, @NativeType("btScalar") float softnessDirLin) {
        long __functionAddress = Functions.SliderConstraint_setSoftnessDirLin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, softnessDirLin, __functionAddress);
    }

    // --- [ btSliderConstraint_setSoftnessLimAng ] ---

    public static void btSliderConstraint_setSoftnessLimAng(@NativeType("void *") long obj, @NativeType("btScalar") float softnessLimAng) {
        long __functionAddress = Functions.SliderConstraint_setSoftnessLimAng;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, softnessLimAng, __functionAddress);
    }

    // --- [ btSliderConstraint_setSoftnessLimLin ] ---

    public static void btSliderConstraint_setSoftnessLimLin(@NativeType("void *") long obj, @NativeType("btScalar") float softnessLimLin) {
        long __functionAddress = Functions.SliderConstraint_setSoftnessLimLin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, softnessLimLin, __functionAddress);
    }

    // --- [ btSliderConstraint_setSoftnessOrthoAng ] ---

    public static void btSliderConstraint_setSoftnessOrthoAng(@NativeType("void *") long obj, @NativeType("btScalar") float softnessOrthoAng) {
        long __functionAddress = Functions.SliderConstraint_setSoftnessOrthoAng;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, softnessOrthoAng, __functionAddress);
    }

    // --- [ btSliderConstraint_setSoftnessOrthoLin ] ---

    public static void btSliderConstraint_setSoftnessOrthoLin(@NativeType("void *") long obj, @NativeType("btScalar") float softnessOrthoLin) {
        long __functionAddress = Functions.SliderConstraint_setSoftnessOrthoLin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, softnessOrthoLin, __functionAddress);
    }

    // --- [ btSliderConstraint_setTargetAngMotorVelocity ] ---

    public static void btSliderConstraint_setTargetAngMotorVelocity(@NativeType("void *") long obj, @NativeType("btScalar") float targetAngMotorVelocity) {
        long __functionAddress = Functions.SliderConstraint_setTargetAngMotorVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, targetAngMotorVelocity, __functionAddress);
    }

    // --- [ btSliderConstraint_setTargetLinMotorVelocity ] ---

    public static void btSliderConstraint_setTargetLinMotorVelocity(@NativeType("void *") long obj, @NativeType("btScalar") float targetLinMotorVelocity) {
        long __functionAddress = Functions.SliderConstraint_setTargetLinMotorVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, targetLinMotorVelocity, __functionAddress);
    }

    // --- [ btSliderConstraint_setUpperAngLimit ] ---

    public static void btSliderConstraint_setUpperAngLimit(@NativeType("void *") long obj, @NativeType("btScalar") float upperLimit) {
        long __functionAddress = Functions.SliderConstraint_setUpperAngLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, upperLimit, __functionAddress);
    }

    // --- [ btSliderConstraint_setUpperLinLimit ] ---

    public static void btSliderConstraint_setUpperLinLimit(@NativeType("void *") long obj, @NativeType("btScalar") float upperLimit) {
        long __functionAddress = Functions.SliderConstraint_setUpperLinLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, upperLimit, __functionAddress);
    }

    // --- [ btSliderConstraint_setUseFrameOffset ] ---

    public static void btSliderConstraint_setUseFrameOffset(@NativeType("void *") long obj, @NativeType("bool") boolean frameOffsetOnOff) {
        long __functionAddress = Functions.SliderConstraint_setUseFrameOffset;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, frameOffsetOnOff, __functionAddress);
    }

    // --- [ btSliderConstraint_testAngLimits ] ---

    public static void btSliderConstraint_testAngLimits(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_testAngLimits;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSliderConstraint_testLinLimits ] ---

    public static void btSliderConstraint_testLinLimits(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SliderConstraint_testLinLimits;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}