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

public class BTTransformUtil {

    protected BTTransformUtil() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            TransformUtil_calculateDiffAxisAngle                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btTransformUtil_calculateDiffAxisAngle"),
            TransformUtil_calculateDiffAxisAngleQuaternion                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btTransformUtil_calculateDiffAxisAngleQuaternion"),
            TransformUtil_calculateVelocity                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btTransformUtil_calculateVelocity"),
            TransformUtil_calculateVelocityQuaternion                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTransformUtil_calculateVelocityQuaternion"),
            TransformUtil_integrateTransform                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btTransformUtil_integrateTransform"),
            ConvexSeparatingDistanceUtil_new                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexSeparatingDistanceUtil_new"),
            ConvexSeparatingDistanceUtil_getConservativeSeparatingDistance = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexSeparatingDistanceUtil_getConservativeSeparatingDistance"),
            ConvexSeparatingDistanceUtil_initSeparatingDistance            = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexSeparatingDistanceUtil_initSeparatingDistance"),
            ConvexSeparatingDistanceUtil_updateSeparatingDistance          = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexSeparatingDistanceUtil_updateSeparatingDistance"),
            ConvexSeparatingDistanceUtil_delete                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexSeparatingDistanceUtil_delete");

    }

    // --- [ btTransformUtil_calculateDiffAxisAngle ] ---

    public static void nbtTransformUtil_calculateDiffAxisAngle(long transform0, long transform1, long axis, long angle) {
        long __functionAddress = Functions.TransformUtil_calculateDiffAxisAngle;
        invokePPPPV(transform0, transform1, axis, angle, __functionAddress);
    }

    public static void btTransformUtil_calculateDiffAxisAngle(@NativeType("btTransform const *") BTTransform transform0, @NativeType("btTransform const *") BTTransform transform1, @NativeType("btVector3 *") BTVector3 axis, @NativeType("btScalar *") FloatBuffer angle) {
        if (CHECKS) {
            check(angle, 1);
        }
        nbtTransformUtil_calculateDiffAxisAngle(transform0.address(), transform1.address(), axis.address(), memAddress(angle));
    }

    // --- [ btTransformUtil_calculateDiffAxisAngleQuaternion ] ---

    public static void nbtTransformUtil_calculateDiffAxisAngleQuaternion(long orn0, long orn1a, long axis, long angle) {
        long __functionAddress = Functions.TransformUtil_calculateDiffAxisAngleQuaternion;
        invokePPPPV(orn0, orn1a, axis, angle, __functionAddress);
    }

    public static void btTransformUtil_calculateDiffAxisAngleQuaternion(@NativeType("btQuaternion const *") BTVector3 orn0, @NativeType("btQuaternion const *") BTVector3 orn1a, @NativeType("btVector3 *") BTVector3 axis, @NativeType("btScalar *") FloatBuffer angle) {
        if (CHECKS) {
            check(angle, 1);
        }
        nbtTransformUtil_calculateDiffAxisAngleQuaternion(orn0.address(), orn1a.address(), axis.address(), memAddress(angle));
    }

    // --- [ btTransformUtil_calculateVelocity ] ---

    public static void nbtTransformUtil_calculateVelocity(long transform0, long transform1, float timeStep, long linVel, long angVel) {
        long __functionAddress = Functions.TransformUtil_calculateVelocity;
        invokePPPPV(transform0, transform1, timeStep, linVel, angVel, __functionAddress);
    }

    public static void btTransformUtil_calculateVelocity(@NativeType("btTransform const *") BTTransform transform0, @NativeType("btTransform const *") BTTransform transform1, @NativeType("btScalar") float timeStep, @NativeType("btVector3 *") BTVector3 linVel, @NativeType("btVector3 *") BTVector3 angVel) {
        nbtTransformUtil_calculateVelocity(transform0.address(), transform1.address(), timeStep, linVel.address(), angVel.address());
    }

    // --- [ btTransformUtil_calculateVelocityQuaternion ] ---

    public static void nbtTransformUtil_calculateVelocityQuaternion(long pos0, long pos1, long orn0, long orn1, float timeStep, long linVel, long angVel) {
        long __functionAddress = Functions.TransformUtil_calculateVelocityQuaternion;
        invokePPPPPPV(pos0, pos1, orn0, orn1, timeStep, linVel, angVel, __functionAddress);
    }

    public static void btTransformUtil_calculateVelocityQuaternion(@NativeType("btVector3 const *") BTVector3 pos0, @NativeType("btVector3 const *") BTVector3 pos1, @NativeType("btQuaternion const *") BTVector3 orn0, @NativeType("btQuaternion const *") BTVector3 orn1, @NativeType("btScalar") float timeStep, @NativeType("btVector3 *") BTVector3 linVel, @NativeType("btVector3 *") BTVector3 angVel) {
        nbtTransformUtil_calculateVelocityQuaternion(pos0.address(), pos1.address(), orn0.address(), orn1.address(), timeStep, linVel.address(), angVel.address());
    }

    // --- [ btTransformUtil_integrateTransform ] ---

    public static void nbtTransformUtil_integrateTransform(long curTrans, long linvel, long angvel, float timeStep, long predictedTransform) {
        long __functionAddress = Functions.TransformUtil_integrateTransform;
        invokePPPPV(curTrans, linvel, angvel, timeStep, predictedTransform, __functionAddress);
    }

    public static void btTransformUtil_integrateTransform(@NativeType("btTransform const *") BTTransform curTrans, @NativeType("btVector3 const *") BTVector3 linvel, @NativeType("btVector3 const *") BTVector3 angvel, @NativeType("btScalar") float timeStep, @NativeType("btTransform *") BTTransform predictedTransform) {
        nbtTransformUtil_integrateTransform(curTrans.address(), linvel.address(), angvel.address(), timeStep, predictedTransform.address());
    }

    // --- [ btConvexSeparatingDistanceUtil_new ] ---

    @NativeType("void *")
    public static long btConvexSeparatingDistanceUtil_new(@NativeType("btScalar") float boundingRadiusA, @NativeType("btScalar") float boundingRadiusB) {
        long __functionAddress = Functions.ConvexSeparatingDistanceUtil_new;
        return invokeP(boundingRadiusA, boundingRadiusB, __functionAddress);
    }

    // --- [ btConvexSeparatingDistanceUtil_getConservativeSeparatingDistance ] ---

    @NativeType("btScalar")
    public static float btConvexSeparatingDistanceUtil_getConservativeSeparatingDistance(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexSeparatingDistanceUtil_getConservativeSeparatingDistance;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConvexSeparatingDistanceUtil_initSeparatingDistance ] ---

    public static void nbtConvexSeparatingDistanceUtil_initSeparatingDistance(long obj, long separatingVector, float separatingDistance, long transA, long transB) {
        long __functionAddress = Functions.ConvexSeparatingDistanceUtil_initSeparatingDistance;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPV(obj, separatingVector, separatingDistance, transA, transB, __functionAddress);
    }

    public static void btConvexSeparatingDistanceUtil_initSeparatingDistance(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 separatingVector, @NativeType("btScalar") float separatingDistance, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB) {
        nbtConvexSeparatingDistanceUtil_initSeparatingDistance(obj, separatingVector.address(), separatingDistance, transA.address(), transB.address());
    }

    // --- [ btConvexSeparatingDistanceUtil_updateSeparatingDistance ] ---

    public static void nbtConvexSeparatingDistanceUtil_updateSeparatingDistance(long obj, long transA, long transB) {
        long __functionAddress = Functions.ConvexSeparatingDistanceUtil_updateSeparatingDistance;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, transA, transB, __functionAddress);
    }

    public static void btConvexSeparatingDistanceUtil_updateSeparatingDistance(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB) {
        nbtConvexSeparatingDistanceUtil_updateSeparatingDistance(obj, transA.address(), transB.address());
    }

    // --- [ btConvexSeparatingDistanceUtil_delete ] ---

    public static void btConvexSeparatingDistanceUtil_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexSeparatingDistanceUtil_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}