/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTTypedConstraint {

    protected BTTypedConstraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            JointFeedback_new                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btJointFeedback_new"),
            JointFeedback_getAppliedForceBodyA                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btJointFeedback_getAppliedForceBodyA"),
            JointFeedback_getAppliedForceBodyB                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btJointFeedback_getAppliedForceBodyB"),
            JointFeedback_getAppliedTorqueBodyA                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btJointFeedback_getAppliedTorqueBodyA"),
            JointFeedback_getAppliedTorqueBodyB                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btJointFeedback_getAppliedTorqueBodyB"),
            JointFeedback_setAppliedForceBodyA                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btJointFeedback_setAppliedForceBodyA"),
            JointFeedback_setAppliedForceBodyB                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btJointFeedback_setAppliedForceBodyB"),
            JointFeedback_setAppliedTorqueBodyA                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btJointFeedback_setAppliedTorqueBodyA"),
            JointFeedback_setAppliedTorqueBodyB                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btJointFeedback_setAppliedTorqueBodyB"),
            JointFeedback_delete                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btJointFeedback_delete"),
            TypedConstraint_btConstraintInfo1_new                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo1_new"),
            TypedConstraint_btConstraintInfo1_getNub               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo1_getNub"),
            TypedConstraint_btConstraintInfo1_getNumConstraintRows = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo1_getNumConstraintRows"),
            TypedConstraint_btConstraintInfo1_setNub               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo1_setNub"),
            TypedConstraint_btConstraintInfo1_setNumConstraintRows = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo1_setNumConstraintRows"),
            TypedConstraint_btConstraintInfo1_delete               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo1_delete"),
            TypedConstraint_btConstraintInfo2_new                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_new"),
            TypedConstraint_btConstraintInfo2_getCfm               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_getCfm"),
            TypedConstraint_btConstraintInfo2_getConstraintError   = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_getConstraintError"),
            TypedConstraint_btConstraintInfo2_getDamping           = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_getDamping"),
            TypedConstraint_btConstraintInfo2_getErp               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_getErp"),
            TypedConstraint_btConstraintInfo2_getFps               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_getFps"),
            TypedConstraint_btConstraintInfo2_getJ1angularAxis     = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_getJ1angularAxis"),
            TypedConstraint_btConstraintInfo2_getJ1linearAxis      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_getJ1linearAxis"),
            TypedConstraint_btConstraintInfo2_getJ2angularAxis     = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_getJ2angularAxis"),
            TypedConstraint_btConstraintInfo2_getJ2linearAxis      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_getJ2linearAxis"),
            TypedConstraint_btConstraintInfo2_getLowerLimit        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_getLowerLimit"),
            TypedConstraint_btConstraintInfo2_getNumIterations     = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_getNumIterations"),
            TypedConstraint_btConstraintInfo2_getRowskip           = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_getRowskip"),
            TypedConstraint_btConstraintInfo2_getUpperLimit        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_getUpperLimit"),
            TypedConstraint_btConstraintInfo2_setCfm               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_setCfm"),
            TypedConstraint_btConstraintInfo2_setConstraintError   = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_setConstraintError"),
            TypedConstraint_btConstraintInfo2_setDamping           = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_setDamping"),
            TypedConstraint_btConstraintInfo2_setErp               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_setErp"),
            TypedConstraint_btConstraintInfo2_setFps               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_setFps"),
            TypedConstraint_btConstraintInfo2_setJ1angularAxis     = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_setJ1angularAxis"),
            TypedConstraint_btConstraintInfo2_setJ1linearAxis      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_setJ1linearAxis"),
            TypedConstraint_btConstraintInfo2_setJ2angularAxis     = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_setJ2angularAxis"),
            TypedConstraint_btConstraintInfo2_setJ2linearAxis      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_setJ2linearAxis"),
            TypedConstraint_btConstraintInfo2_setLowerLimit        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_setLowerLimit"),
            TypedConstraint_btConstraintInfo2_setNumIterations     = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_setNumIterations"),
            TypedConstraint_btConstraintInfo2_setRowskip           = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_setRowskip"),
            TypedConstraint_btConstraintInfo2_setUpperLimit        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_setUpperLimit"),
            TypedConstraint_btConstraintInfo2_delete               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_btConstraintInfo2_delete"),
            TypedConstraint_buildJacobian                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_buildJacobian"),
            TypedConstraint_calculateSerializeBufferSize           = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_calculateSerializeBufferSize"),
            TypedConstraint_enableFeedback                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_enableFeedback"),
            TypedConstraint_getAppliedImpulse                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getAppliedImpulse"),
            TypedConstraint_getBreakingImpulseThreshold            = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getBreakingImpulseThreshold"),
            TypedConstraint_getConstraintType                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getConstraintType"),
            TypedConstraint_getDbgDrawSize                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getDbgDrawSize"),
            TypedConstraint_getFixedBody                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getFixedBody"),
            TypedConstraint_getInfo1                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getInfo1"),
            TypedConstraint_getInfo2                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getInfo2"),
            TypedConstraint_getJointFeedback                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getJointFeedback"),
            TypedConstraint_getOverrideNumSolverIterations         = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getOverrideNumSolverIterations"),
            TypedConstraint_getParam                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getParam"),
            TypedConstraint_getParam2                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getParam2"),
            TypedConstraint_getRigidBodyA                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getRigidBodyA"),
            TypedConstraint_getRigidBodyB                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getRigidBodyB"),
            TypedConstraint_getUid                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getUid"),
            TypedConstraint_getUserConstraintId                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getUserConstraintId"),
            TypedConstraint_getUserConstraintPtr                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getUserConstraintPtr"),
            TypedConstraint_getUserConstraintType                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_getUserConstraintType"),
            TypedConstraint_internalGetAppliedImpulse              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_internalGetAppliedImpulse"),
            TypedConstraint_internalSetAppliedImpulse              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_internalSetAppliedImpulse"),
            TypedConstraint_isEnabled                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_isEnabled"),
            TypedConstraint_needsFeedback                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_needsFeedback"),
            TypedConstraint_serialize                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_serialize"),
            TypedConstraint_setBreakingImpulseThreshold            = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_setBreakingImpulseThreshold"),
            TypedConstraint_setDbgDrawSize                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_setDbgDrawSize"),
            TypedConstraint_setEnabled                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_setEnabled"),
            TypedConstraint_setJointFeedback                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_setJointFeedback"),
            TypedConstraint_setOverrideNumSolverIterations         = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_setOverrideNumSolverIterations"),
            TypedConstraint_setParam                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_setParam"),
            TypedConstraint_setParam2                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_setParam2"),
            TypedConstraint_setupSolverConstraint                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_setupSolverConstraint"),
            TypedConstraint_setUserConstraintId                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_setUserConstraintId"),
            TypedConstraint_setUserConstraintPtr                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_setUserConstraintPtr"),
            TypedConstraint_setUserConstraintType                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_setUserConstraintType"),
            TypedConstraint_solveConstraintObsolete                = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_solveConstraintObsolete"),
            TypedConstraint_delete                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btTypedConstraint_delete"),
            AngularLimit_new                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btAngularLimit_new"),
            AngularLimit_fit                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btAngularLimit_fit"),
            AngularLimit_getBiasFactor                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btAngularLimit_getBiasFactor"),
            AngularLimit_getCorrection                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btAngularLimit_getCorrection"),
            AngularLimit_getError                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btAngularLimit_getError"),
            AngularLimit_getHalfRange                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btAngularLimit_getHalfRange"),
            AngularLimit_getHigh                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btAngularLimit_getHigh"),
            AngularLimit_getLow                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btAngularLimit_getLow"),
            AngularLimit_getRelaxationFactor                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btAngularLimit_getRelaxationFactor"),
            AngularLimit_getSign                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btAngularLimit_getSign"),
            AngularLimit_getSoftness                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btAngularLimit_getSoftness"),
            AngularLimit_isLimit                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btAngularLimit_isLimit"),
            AngularLimit_set                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btAngularLimit_set"),
            AngularLimit_test                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btAngularLimit_test"),
            AngularLimit_delete                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btAngularLimit_delete");

    }

    // --- [ btJointFeedback_new ] ---

    @NativeType("void *")
    public static long btJointFeedback_new() {
        long __functionAddress = Functions.JointFeedback_new;
        return invokeP(__functionAddress);
    }

    // --- [ btJointFeedback_getAppliedForceBodyA ] ---

    public static void nbtJointFeedback_getAppliedForceBodyA(long obj, long value) {
        long __functionAddress = Functions.JointFeedback_getAppliedForceBodyA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btJointFeedback_getAppliedForceBodyA(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtJointFeedback_getAppliedForceBodyA(obj, value.address());
    }

    // --- [ btJointFeedback_getAppliedForceBodyB ] ---

    public static void nbtJointFeedback_getAppliedForceBodyB(long obj, long value) {
        long __functionAddress = Functions.JointFeedback_getAppliedForceBodyB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btJointFeedback_getAppliedForceBodyB(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtJointFeedback_getAppliedForceBodyB(obj, value.address());
    }

    // --- [ btJointFeedback_getAppliedTorqueBodyA ] ---

    public static void nbtJointFeedback_getAppliedTorqueBodyA(long obj, long value) {
        long __functionAddress = Functions.JointFeedback_getAppliedTorqueBodyA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btJointFeedback_getAppliedTorqueBodyA(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtJointFeedback_getAppliedTorqueBodyA(obj, value.address());
    }

    // --- [ btJointFeedback_getAppliedTorqueBodyB ] ---

    public static void nbtJointFeedback_getAppliedTorqueBodyB(long obj, long value) {
        long __functionAddress = Functions.JointFeedback_getAppliedTorqueBodyB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btJointFeedback_getAppliedTorqueBodyB(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtJointFeedback_getAppliedTorqueBodyB(obj, value.address());
    }

    // --- [ btJointFeedback_setAppliedForceBodyA ] ---

    public static void nbtJointFeedback_setAppliedForceBodyA(long obj, long value) {
        long __functionAddress = Functions.JointFeedback_setAppliedForceBodyA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btJointFeedback_setAppliedForceBodyA(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtJointFeedback_setAppliedForceBodyA(obj, value.address());
    }

    // --- [ btJointFeedback_setAppliedForceBodyB ] ---

    public static void nbtJointFeedback_setAppliedForceBodyB(long obj, long value) {
        long __functionAddress = Functions.JointFeedback_setAppliedForceBodyB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btJointFeedback_setAppliedForceBodyB(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtJointFeedback_setAppliedForceBodyB(obj, value.address());
    }

    // --- [ btJointFeedback_setAppliedTorqueBodyA ] ---

    public static void nbtJointFeedback_setAppliedTorqueBodyA(long obj, long value) {
        long __functionAddress = Functions.JointFeedback_setAppliedTorqueBodyA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btJointFeedback_setAppliedTorqueBodyA(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtJointFeedback_setAppliedTorqueBodyA(obj, value.address());
    }

    // --- [ btJointFeedback_setAppliedTorqueBodyB ] ---

    public static void nbtJointFeedback_setAppliedTorqueBodyB(long obj, long value) {
        long __functionAddress = Functions.JointFeedback_setAppliedTorqueBodyB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btJointFeedback_setAppliedTorqueBodyB(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtJointFeedback_setAppliedTorqueBodyB(obj, value.address());
    }

    // --- [ btJointFeedback_delete ] ---

    public static void btJointFeedback_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.JointFeedback_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo1_new ] ---

    @NativeType("void *")
    public static long btTypedConstraint_btConstraintInfo1_new() {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo1_new;
        return invokeP(__functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo1_getNub ] ---

    public static int btTypedConstraint_btConstraintInfo1_getNub(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo1_getNub;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo1_getNumConstraintRows ] ---

    public static int btTypedConstraint_btConstraintInfo1_getNumConstraintRows(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo1_getNumConstraintRows;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo1_setNub ] ---

    public static void btTypedConstraint_btConstraintInfo1_setNub(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo1_setNub;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo1_setNumConstraintRows ] ---

    public static void btTypedConstraint_btConstraintInfo1_setNumConstraintRows(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo1_setNumConstraintRows;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo1_delete ] ---

    public static void btTypedConstraint_btConstraintInfo1_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo1_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_new ] ---

    @NativeType("void *")
    public static long btTypedConstraint_btConstraintInfo2_new() {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_new;
        return invokeP(__functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_getCfm ] ---

    @NativeType("btScalar[1]")
    public static FloatBuffer btTypedConstraint_btConstraintInfo2_getCfm(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_getCfm;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memFloatBuffer(__result, 1);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_getConstraintError ] ---

    @NativeType("btScalar[1]")
    public static FloatBuffer btTypedConstraint_btConstraintInfo2_getConstraintError(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_getConstraintError;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memFloatBuffer(__result, 1);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_getDamping ] ---

    @NativeType("btScalar")
    public static float btTypedConstraint_btConstraintInfo2_getDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_getDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_getErp ] ---

    @NativeType("btScalar")
    public static float btTypedConstraint_btConstraintInfo2_getErp(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_getErp;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_getFps ] ---

    @NativeType("btScalar")
    public static float btTypedConstraint_btConstraintInfo2_getFps(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_getFps;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_getJ1angularAxis ] ---

    @NativeType("void *")
    public static long btTypedConstraint_btConstraintInfo2_getJ1angularAxis(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_getJ1angularAxis;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_getJ1linearAxis ] ---

    @NativeType("void *")
    public static long btTypedConstraint_btConstraintInfo2_getJ1linearAxis(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_getJ1linearAxis;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_getJ2angularAxis ] ---

    @NativeType("void *")
    public static long btTypedConstraint_btConstraintInfo2_getJ2angularAxis(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_getJ2angularAxis;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_getJ2linearAxis ] ---

    @NativeType("void *")
    public static long btTypedConstraint_btConstraintInfo2_getJ2linearAxis(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_getJ2linearAxis;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_getLowerLimit ] ---

    @NativeType("btScalar[1]")
    public static FloatBuffer btTypedConstraint_btConstraintInfo2_getLowerLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_getLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memFloatBuffer(__result, 1);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_getNumIterations ] ---

    public static int btTypedConstraint_btConstraintInfo2_getNumIterations(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_getNumIterations;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_getRowskip ] ---

    public static int btTypedConstraint_btConstraintInfo2_getRowskip(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_getRowskip;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_getUpperLimit ] ---

    @NativeType("btScalar[1]")
    public static FloatBuffer btTypedConstraint_btConstraintInfo2_getUpperLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_getUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memFloatBuffer(__result, 1);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_setCfm ] ---

    public static void nbtTypedConstraint_btConstraintInfo2_setCfm(long obj, long value) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_setCfm;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTypedConstraint_btConstraintInfo2_setCfm(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nbtTypedConstraint_btConstraintInfo2_setCfm(obj, memAddress(value));
    }

    // --- [ btTypedConstraint_btConstraintInfo2_setConstraintError ] ---

    public static void nbtTypedConstraint_btConstraintInfo2_setConstraintError(long obj, long value) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_setConstraintError;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTypedConstraint_btConstraintInfo2_setConstraintError(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nbtTypedConstraint_btConstraintInfo2_setConstraintError(obj, memAddress(value));
    }

    // --- [ btTypedConstraint_btConstraintInfo2_setDamping ] ---

    public static void btTypedConstraint_btConstraintInfo2_setDamping(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_setDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_setErp ] ---

    public static void btTypedConstraint_btConstraintInfo2_setErp(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_setErp;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_setFps ] ---

    public static void btTypedConstraint_btConstraintInfo2_setFps(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_setFps;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_setJ1angularAxis ] ---

    public static void nbtTypedConstraint_btConstraintInfo2_setJ1angularAxis(long obj, long value) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_setJ1angularAxis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTypedConstraint_btConstraintInfo2_setJ1angularAxis(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer value) {
        nbtTypedConstraint_btConstraintInfo2_setJ1angularAxis(obj, memAddress(value));
    }

    // --- [ btTypedConstraint_btConstraintInfo2_setJ1linearAxis ] ---

    public static void nbtTypedConstraint_btConstraintInfo2_setJ1linearAxis(long obj, long value) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_setJ1linearAxis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTypedConstraint_btConstraintInfo2_setJ1linearAxis(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer value) {
        nbtTypedConstraint_btConstraintInfo2_setJ1linearAxis(obj, memAddress(value));
    }

    // --- [ btTypedConstraint_btConstraintInfo2_setJ2angularAxis ] ---

    public static void nbtTypedConstraint_btConstraintInfo2_setJ2angularAxis(long obj, long value) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_setJ2angularAxis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTypedConstraint_btConstraintInfo2_setJ2angularAxis(@NativeType("void *") long obj, @Nullable @NativeType("btScalar *") FloatBuffer value) {
        nbtTypedConstraint_btConstraintInfo2_setJ2angularAxis(obj, memAddressSafe(value));
    }

    // --- [ btTypedConstraint_btConstraintInfo2_setJ2linearAxis ] ---

    public static void nbtTypedConstraint_btConstraintInfo2_setJ2linearAxis(long obj, long value) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_setJ2linearAxis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTypedConstraint_btConstraintInfo2_setJ2linearAxis(@NativeType("void *") long obj, @Nullable @NativeType("btScalar *") FloatBuffer value) {
        nbtTypedConstraint_btConstraintInfo2_setJ2linearAxis(obj, memAddressSafe(value));
    }

    // --- [ btTypedConstraint_btConstraintInfo2_setLowerLimit ] ---

    public static void nbtTypedConstraint_btConstraintInfo2_setLowerLimit(long obj, long value) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_setLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTypedConstraint_btConstraintInfo2_setLowerLimit(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nbtTypedConstraint_btConstraintInfo2_setLowerLimit(obj, memAddress(value));
    }

    // --- [ btTypedConstraint_btConstraintInfo2_setNumIterations ] ---

    public static void btTypedConstraint_btConstraintInfo2_setNumIterations(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_setNumIterations;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_setRowskip ] ---

    public static void btTypedConstraint_btConstraintInfo2_setRowskip(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_setRowskip;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTypedConstraint_btConstraintInfo2_setUpperLimit ] ---

    public static void nbtTypedConstraint_btConstraintInfo2_setUpperLimit(long obj, long value) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_setUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTypedConstraint_btConstraintInfo2_setUpperLimit(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nbtTypedConstraint_btConstraintInfo2_setUpperLimit(obj, memAddress(value));
    }

    // --- [ btTypedConstraint_btConstraintInfo2_delete ] ---

    public static void btTypedConstraint_btConstraintInfo2_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_btConstraintInfo2_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_buildJacobian ] ---

    public static void btTypedConstraint_buildJacobian(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_buildJacobian;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_calculateSerializeBufferSize ] ---

    public static int btTypedConstraint_calculateSerializeBufferSize(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_calculateSerializeBufferSize;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_enableFeedback ] ---

    public static void btTypedConstraint_enableFeedback(@NativeType("void *") long obj, @NativeType("bool") boolean needsFeedback) {
        long __functionAddress = Functions.TypedConstraint_enableFeedback;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, needsFeedback, __functionAddress);
    }

    // --- [ btTypedConstraint_getAppliedImpulse ] ---

    @NativeType("btScalar")
    public static float btTypedConstraint_getAppliedImpulse(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_getAppliedImpulse;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_getBreakingImpulseThreshold ] ---

    @NativeType("btScalar")
    public static float btTypedConstraint_getBreakingImpulseThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_getBreakingImpulseThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_getConstraintType ] ---

    public static int btTypedConstraint_getConstraintType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_getConstraintType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_getDbgDrawSize ] ---

    @NativeType("btScalar")
    public static float btTypedConstraint_getDbgDrawSize(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_getDbgDrawSize;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_getFixedBody ] ---

    @NativeType("void *")
    public static long btTypedConstraint_getFixedBody() {
        long __functionAddress = Functions.TypedConstraint_getFixedBody;
        return invokeP(__functionAddress);
    }

    // --- [ btTypedConstraint_getInfo1 ] ---

    public static void btTypedConstraint_getInfo1(@NativeType("void *") long obj, @NativeType("void *") long info) {
        long __functionAddress = Functions.TypedConstraint_getInfo1;
        if (CHECKS) {
            check(obj);
            check(info);
        }
        invokePPV(obj, info, __functionAddress);
    }

    // --- [ btTypedConstraint_getInfo2 ] ---

    public static void btTypedConstraint_getInfo2(@NativeType("void *") long obj, @NativeType("void *") long info) {
        long __functionAddress = Functions.TypedConstraint_getInfo2;
        if (CHECKS) {
            check(obj);
            check(info);
        }
        invokePPV(obj, info, __functionAddress);
    }

    // --- [ btTypedConstraint_getJointFeedback ] ---

    @NativeType("void *")
    public static long btTypedConstraint_getJointFeedback(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_getJointFeedback;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_getOverrideNumSolverIterations ] ---

    public static int btTypedConstraint_getOverrideNumSolverIterations(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_getOverrideNumSolverIterations;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_getParam ] ---

    @NativeType("btScalar")
    public static float btTypedConstraint_getParam(@NativeType("void *") long obj, int num) {
        long __functionAddress = Functions.TypedConstraint_getParam;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, num, __functionAddress);
    }

    // --- [ btTypedConstraint_getParam2 ] ---

    @NativeType("btScalar")
    public static float btTypedConstraint_getParam2(@NativeType("void *") long obj, int num, int axis) {
        long __functionAddress = Functions.TypedConstraint_getParam2;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, num, axis, __functionAddress);
    }

    // --- [ btTypedConstraint_getRigidBodyA ] ---

    @NativeType("void *")
    public static long btTypedConstraint_getRigidBodyA(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_getRigidBodyA;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_getRigidBodyB ] ---

    @NativeType("void *")
    public static long btTypedConstraint_getRigidBodyB(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_getRigidBodyB;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_getUid ] ---

    public static int btTypedConstraint_getUid(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_getUid;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_getUserConstraintId ] ---

    public static int btTypedConstraint_getUserConstraintId(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_getUserConstraintId;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_getUserConstraintPtr ] ---

    @NativeType("void *")
    public static long btTypedConstraint_getUserConstraintPtr(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_getUserConstraintPtr;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_getUserConstraintType ] ---

    public static int btTypedConstraint_getUserConstraintType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_getUserConstraintType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_internalGetAppliedImpulse ] ---

    @NativeType("btScalar")
    public static float btTypedConstraint_internalGetAppliedImpulse(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_internalGetAppliedImpulse;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_internalSetAppliedImpulse ] ---

    public static void btTypedConstraint_internalSetAppliedImpulse(@NativeType("void *") long obj, @NativeType("btScalar") float appliedImpulse) {
        long __functionAddress = Functions.TypedConstraint_internalSetAppliedImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, appliedImpulse, __functionAddress);
    }

    // --- [ btTypedConstraint_isEnabled ] ---

    @NativeType("bool")
    public static boolean btTypedConstraint_isEnabled(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_isEnabled;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_needsFeedback ] ---

    @NativeType("bool")
    public static boolean btTypedConstraint_needsFeedback(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_needsFeedback;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btTypedConstraint_serialize ] ---

    public static long nbtTypedConstraint_serialize(long obj, long dataBuffer, long serializer) {
        long __functionAddress = Functions.TypedConstraint_serialize;
        if (CHECKS) {
            check(obj);
            check(dataBuffer);
            check(serializer);
        }
        return invokePPPP(obj, dataBuffer, serializer, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String btTypedConstraint_serialize(@NativeType("void *") long obj, @NativeType("void *") long dataBuffer, @NativeType("void *") long serializer) {
        long __result = nbtTypedConstraint_serialize(obj, dataBuffer, serializer);
        return memUTF8Safe(__result);
    }

    // --- [ btTypedConstraint_setBreakingImpulseThreshold ] ---

    public static void btTypedConstraint_setBreakingImpulseThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float threshold) {
        long __functionAddress = Functions.TypedConstraint_setBreakingImpulseThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, threshold, __functionAddress);
    }

    // --- [ btTypedConstraint_setDbgDrawSize ] ---

    public static void btTypedConstraint_setDbgDrawSize(@NativeType("void *") long obj, @NativeType("btScalar") float dbgDrawSize) {
        long __functionAddress = Functions.TypedConstraint_setDbgDrawSize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dbgDrawSize, __functionAddress);
    }

    // --- [ btTypedConstraint_setEnabled ] ---

    public static void btTypedConstraint_setEnabled(@NativeType("void *") long obj, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.TypedConstraint_setEnabled;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, enabled, __functionAddress);
    }

    // --- [ btTypedConstraint_setJointFeedback ] ---

    public static void btTypedConstraint_setJointFeedback(@NativeType("void *") long obj, @NativeType("void *") long jointFeedback) {
        long __functionAddress = Functions.TypedConstraint_setJointFeedback;
        if (CHECKS) {
            check(obj);
            check(jointFeedback);
        }
        invokePPV(obj, jointFeedback, __functionAddress);
    }

    // --- [ btTypedConstraint_setOverrideNumSolverIterations ] ---

    public static void btTypedConstraint_setOverrideNumSolverIterations(@NativeType("void *") long obj, int overideNumIterations) {
        long __functionAddress = Functions.TypedConstraint_setOverrideNumSolverIterations;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, overideNumIterations, __functionAddress);
    }

    // --- [ btTypedConstraint_setParam ] ---

    public static void btTypedConstraint_setParam(@NativeType("void *") long obj, int num, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TypedConstraint_setParam;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, num, value, __functionAddress);
    }

    // --- [ btTypedConstraint_setParam2 ] ---

    public static void btTypedConstraint_setParam2(@NativeType("void *") long obj, int num, @NativeType("btScalar") float value, int axis) {
        long __functionAddress = Functions.TypedConstraint_setParam2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, num, value, axis, __functionAddress);
    }

    // --- [ btTypedConstraint_setupSolverConstraint ] ---

    public static void btTypedConstraint_setupSolverConstraint(@NativeType("void *") long obj, @NativeType("void *") long ca, int solverBodyA, int solverBodyB, @NativeType("btScalar") float timeStep) {
        long __functionAddress = Functions.TypedConstraint_setupSolverConstraint;
        if (CHECKS) {
            check(obj);
            check(ca);
        }
        invokePPV(obj, ca, solverBodyA, solverBodyB, timeStep, __functionAddress);
    }

    // --- [ btTypedConstraint_setUserConstraintId ] ---

    public static void btTypedConstraint_setUserConstraintId(@NativeType("void *") long obj, int uid) {
        long __functionAddress = Functions.TypedConstraint_setUserConstraintId;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, uid, __functionAddress);
    }

    // --- [ btTypedConstraint_setUserConstraintPtr ] ---

    public static void btTypedConstraint_setUserConstraintPtr(@NativeType("void *") long obj, @NativeType("void *") long ptr) {
        long __functionAddress = Functions.TypedConstraint_setUserConstraintPtr;
        if (CHECKS) {
            check(obj);
            check(ptr);
        }
        invokePPV(obj, ptr, __functionAddress);
    }

    // --- [ btTypedConstraint_setUserConstraintType ] ---

    public static void btTypedConstraint_setUserConstraintType(@NativeType("void *") long obj, int userConstraintType) {
        long __functionAddress = Functions.TypedConstraint_setUserConstraintType;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, userConstraintType, __functionAddress);
    }

    // --- [ btTypedConstraint_solveConstraintObsolete ] ---

    public static void btTypedConstraint_solveConstraintObsolete(@NativeType("void *") long obj, @NativeType("void *") long __unnamed0, @NativeType("void *") long __unnamed1, @NativeType("btScalar") float __unnamed2) {
        long __functionAddress = Functions.TypedConstraint_solveConstraintObsolete;
        if (CHECKS) {
            check(obj);
            check(__unnamed0);
            check(__unnamed1);
        }
        invokePPPV(obj, __unnamed0, __unnamed1, __unnamed2, __functionAddress);
    }

    // --- [ btTypedConstraint_delete ] ---

    public static void btTypedConstraint_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TypedConstraint_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btAngularLimit_new ] ---

    @NativeType("void *")
    public static long btAngularLimit_new() {
        long __functionAddress = Functions.AngularLimit_new;
        return invokeP(__functionAddress);
    }

    // --- [ btAngularLimit_fit ] ---

    /** Unsafe version of: {@link #btAngularLimit_fit AngularLimit_fit} */
    public static void nbtAngularLimit_fit(long obj, long angle) {
        long __functionAddress = Functions.AngularLimit_fit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, angle, __functionAddress);
    }

    /** Checks given angle against limit. If limit is active and angle doesn't fit it, the angle returned is modified so it equals to the limit closest to given angle. */
    public static void btAngularLimit_fit(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer angle) {
        if (CHECKS) {
            check(angle, 1);
        }
        nbtAngularLimit_fit(obj, memAddress(angle));
    }

    // --- [ btAngularLimit_getBiasFactor ] ---

    @NativeType("btScalar")
    public static float btAngularLimit_getBiasFactor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AngularLimit_getBiasFactor;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btAngularLimit_getCorrection ] ---

    @NativeType("btScalar")
    public static float btAngularLimit_getCorrection(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AngularLimit_getCorrection;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btAngularLimit_getError ] ---

    @NativeType("btScalar")
    public static float btAngularLimit_getError(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AngularLimit_getError;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btAngularLimit_getHalfRange ] ---

    @NativeType("btScalar")
    public static float btAngularLimit_getHalfRange(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AngularLimit_getHalfRange;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btAngularLimit_getHigh ] ---

    @NativeType("btScalar")
    public static float btAngularLimit_getHigh(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AngularLimit_getHigh;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btAngularLimit_getLow ] ---

    @NativeType("btScalar")
    public static float btAngularLimit_getLow(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AngularLimit_getLow;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btAngularLimit_getRelaxationFactor ] ---

    @NativeType("btScalar")
    public static float btAngularLimit_getRelaxationFactor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AngularLimit_getRelaxationFactor;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btAngularLimit_getSign ] ---

    @NativeType("btScalar")
    public static float btAngularLimit_getSign(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AngularLimit_getSign;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btAngularLimit_getSoftness ] ---

    @NativeType("btScalar")
    public static float btAngularLimit_getSoftness(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AngularLimit_getSoftness;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btAngularLimit_isLimit ] ---

    @NativeType("bool")
    public static boolean btAngularLimit_isLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AngularLimit_isLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btAngularLimit_set ] ---

    public static void btAngularLimit_set(@NativeType("void *") long obj, @NativeType("btScalar") float low, @NativeType("btScalar") float high, @NativeType("btScalar") float _softness, @NativeType("btScalar") float _biasFactor, @NativeType("btScalar") float _relaxationFactor) {
        long __functionAddress = Functions.AngularLimit_set;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, low, high, _softness, _biasFactor, _relaxationFactor, __functionAddress);
    }

    // --- [ btAngularLimit_test ] ---

    public static void btAngularLimit_test(@NativeType("void *") long obj, @NativeType("btScalar") float angle) {
        long __functionAddress = Functions.AngularLimit_test;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, angle, __functionAddress);
    }

    // --- [ btAngularLimit_delete ] ---

    public static void btAngularLimit_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AngularLimit_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}