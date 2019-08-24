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

public class BTConvexConcaveCollisionAlgorithm {

    protected BTConvexConcaveCollisionAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ConvexTriangleCallback_new                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexTriangleCallback_new"),
            ConvexTriangleCallback_clearCache                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexTriangleCallback_clearCache"),
            ConvexTriangleCallback_clearWrapperData               = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexTriangleCallback_clearWrapperData"),
            ConvexTriangleCallback_getAabbMax                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexTriangleCallback_getAabbMax"),
            ConvexTriangleCallback_getAabbMin                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexTriangleCallback_getAabbMin"),
            ConvexTriangleCallback_getManifoldPtr                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexTriangleCallback_getManifoldPtr"),
            ConvexTriangleCallback_getTriangleCount               = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexTriangleCallback_getTriangleCount"),
            ConvexTriangleCallback_setManifoldPtr                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexTriangleCallback_setManifoldPtr"),
            ConvexTriangleCallback_setTimeStepAndCounters         = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexTriangleCallback_setTimeStepAndCounters"),
            ConvexTriangleCallback_setTriangleCount               = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexTriangleCallback_setTriangleCount"),
            ConvexConcaveCollisionAlgorithm_CreateFunc_new        = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexConcaveCollisionAlgorithm_CreateFunc_new"),
            ConvexConcaveCollisionAlgorithm_SwappedCreateFunc_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexConcaveCollisionAlgorithm_SwappedCreateFunc_new"),
            ConvexConcaveCollisionAlgorithm_new                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexConcaveCollisionAlgorithm_new"),
            ConvexConcaveCollisionAlgorithm_clearCache            = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexConcaveCollisionAlgorithm_clearCache");

    }

    // --- [ btConvexTriangleCallback_new ] ---

    @NativeType("void *")
    public static long btConvexTriangleCallback_new(@NativeType("void *") long dispatcher, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("bool") boolean isSwapped) {
        long __functionAddress = Functions.ConvexTriangleCallback_new;
        if (CHECKS) {
            check(dispatcher);
            check(body0Wrap);
            check(body1Wrap);
        }
        return invokePPPP(dispatcher, body0Wrap, body1Wrap, isSwapped, __functionAddress);
    }

    // --- [ btConvexTriangleCallback_clearCache ] ---

    public static void btConvexTriangleCallback_clearCache(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexTriangleCallback_clearCache;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btConvexTriangleCallback_clearWrapperData ] ---

    public static void btConvexTriangleCallback_clearWrapperData(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexTriangleCallback_clearWrapperData;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btConvexTriangleCallback_getAabbMax ] ---

    public static void nbtConvexTriangleCallback_getAabbMax(long obj, long value) {
        long __functionAddress = Functions.ConvexTriangleCallback_getAabbMax;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexTriangleCallback_getAabbMax(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtConvexTriangleCallback_getAabbMax(obj, value.address());
    }

    // --- [ btConvexTriangleCallback_getAabbMin ] ---

    public static void nbtConvexTriangleCallback_getAabbMin(long obj, long value) {
        long __functionAddress = Functions.ConvexTriangleCallback_getAabbMin;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexTriangleCallback_getAabbMin(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtConvexTriangleCallback_getAabbMin(obj, value.address());
    }

    // --- [ btConvexTriangleCallback_getManifoldPtr ] ---

    @NativeType("void *")
    public static long btConvexTriangleCallback_getManifoldPtr(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexTriangleCallback_getManifoldPtr;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btConvexTriangleCallback_getTriangleCount ] ---

    public static int btConvexTriangleCallback_getTriangleCount(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexTriangleCallback_getTriangleCount;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btConvexTriangleCallback_setManifoldPtr ] ---

    public static void btConvexTriangleCallback_setManifoldPtr(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.ConvexTriangleCallback_setManifoldPtr;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btConvexTriangleCallback_setTimeStepAndCounters ] ---

    public static void btConvexTriangleCallback_setTimeStepAndCounters(@NativeType("void *") long obj, @NativeType("btScalar") float collisionMarginTriangle, @NativeType("void *") long dispatchInfo, @NativeType("void *") long convexBodyWrap, @NativeType("void *") long triBodyWrap, @NativeType("void *") long resultOut) {
        long __functionAddress = Functions.ConvexTriangleCallback_setTimeStepAndCounters;
        if (CHECKS) {
            check(obj);
            check(dispatchInfo);
            check(convexBodyWrap);
            check(triBodyWrap);
            check(resultOut);
        }
        invokePPPPPV(obj, collisionMarginTriangle, dispatchInfo, convexBodyWrap, triBodyWrap, resultOut, __functionAddress);
    }

    // --- [ btConvexTriangleCallback_setTriangleCount ] ---

    public static void btConvexTriangleCallback_setTriangleCount(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ConvexTriangleCallback_setTriangleCount;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btConvexConcaveCollisionAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btConvexConcaveCollisionAlgorithm_CreateFunc_new() {
        long __functionAddress = Functions.ConvexConcaveCollisionAlgorithm_CreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btConvexConcaveCollisionAlgorithm_SwappedCreateFunc_new ] ---

    @NativeType("void *")
    public static long btConvexConcaveCollisionAlgorithm_SwappedCreateFunc_new() {
        long __functionAddress = Functions.ConvexConcaveCollisionAlgorithm_SwappedCreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btConvexConcaveCollisionAlgorithm_new ] ---

    @NativeType("void *")
    public static long btConvexConcaveCollisionAlgorithm_new(@NativeType("void *") long ci, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("bool") boolean isSwapped) {
        long __functionAddress = Functions.ConvexConcaveCollisionAlgorithm_new;
        if (CHECKS) {
            check(ci);
            check(body0Wrap);
            check(body1Wrap);
        }
        return invokePPPP(ci, body0Wrap, body1Wrap, isSwapped, __functionAddress);
    }

    // --- [ btConvexConcaveCollisionAlgorithm_clearCache ] ---

    public static void btConvexConcaveCollisionAlgorithm_clearCache(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexConcaveCollisionAlgorithm_clearCache;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}