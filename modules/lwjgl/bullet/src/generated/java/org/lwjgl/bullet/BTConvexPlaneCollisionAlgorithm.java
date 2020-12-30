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

public class BTConvexPlaneCollisionAlgorithm {

    protected BTConvexPlaneCollisionAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ConvexPlaneCollisionAlgorithm_CreateFunc_new                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPlaneCollisionAlgorithm_CreateFunc_new"),
            ConvexPlaneCollisionAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPlaneCollisionAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold"),
            ConvexPlaneCollisionAlgorithm_CreateFunc_getNumPerturbationIterations          = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPlaneCollisionAlgorithm_CreateFunc_getNumPerturbationIterations"),
            ConvexPlaneCollisionAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPlaneCollisionAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold"),
            ConvexPlaneCollisionAlgorithm_CreateFunc_setNumPerturbationIterations          = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPlaneCollisionAlgorithm_CreateFunc_setNumPerturbationIterations"),
            ConvexPlaneCollisionAlgorithm_new                                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPlaneCollisionAlgorithm_new"),
            ConvexPlaneCollisionAlgorithm_collideSingleContact                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPlaneCollisionAlgorithm_collideSingleContact");

    }

    // --- [ btConvexPlaneCollisionAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btConvexPlaneCollisionAlgorithm_CreateFunc_new() {
        long __functionAddress = Functions.ConvexPlaneCollisionAlgorithm_CreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btConvexPlaneCollisionAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold ] ---

    public static int btConvexPlaneCollisionAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexPlaneCollisionAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btConvexPlaneCollisionAlgorithm_CreateFunc_getNumPerturbationIterations ] ---

    public static int btConvexPlaneCollisionAlgorithm_CreateFunc_getNumPerturbationIterations(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexPlaneCollisionAlgorithm_CreateFunc_getNumPerturbationIterations;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btConvexPlaneCollisionAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold ] ---

    public static void btConvexPlaneCollisionAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ConvexPlaneCollisionAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btConvexPlaneCollisionAlgorithm_CreateFunc_setNumPerturbationIterations ] ---

    public static void btConvexPlaneCollisionAlgorithm_CreateFunc_setNumPerturbationIterations(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ConvexPlaneCollisionAlgorithm_CreateFunc_setNumPerturbationIterations;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btConvexPlaneCollisionAlgorithm_new ] ---

    @NativeType("void *")
    public static long btConvexPlaneCollisionAlgorithm_new(@NativeType("void *") long mf, @NativeType("void *") long ci, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("bool") boolean isSwapped, int numPerturbationIterations, int minimumPointsPerturbationThreshold) {
        long __functionAddress = Functions.ConvexPlaneCollisionAlgorithm_new;
        if (CHECKS) {
            check(mf);
            check(ci);
            check(body0Wrap);
            check(body1Wrap);
        }
        return invokePPPPP(mf, ci, body0Wrap, body1Wrap, isSwapped, numPerturbationIterations, minimumPointsPerturbationThreshold, __functionAddress);
    }

    // --- [ btConvexPlaneCollisionAlgorithm_collideSingleContact ] ---

    public static void nbtConvexPlaneCollisionAlgorithm_collideSingleContact(long obj, long perturbeRot, long body0Wrap, long body1Wrap, long dispatchInfo, long resultOut) {
        long __functionAddress = Functions.ConvexPlaneCollisionAlgorithm_collideSingleContact;
        if (CHECKS) {
            check(obj);
            check(body0Wrap);
            check(body1Wrap);
            check(dispatchInfo);
            check(resultOut);
        }
        invokePPPPPPV(obj, perturbeRot, body0Wrap, body1Wrap, dispatchInfo, resultOut, __functionAddress);
    }

    public static void btConvexPlaneCollisionAlgorithm_collideSingleContact(@NativeType("void *") long obj, @NativeType("btQuaternion const *") BTVector3 perturbeRot, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("void *") long dispatchInfo, @NativeType("void *") long resultOut) {
        nbtConvexPlaneCollisionAlgorithm_collideSingleContact(obj, perturbeRot.address(), body0Wrap, body1Wrap, dispatchInfo, resultOut);
    }

}