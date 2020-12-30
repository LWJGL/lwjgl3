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

public class BTConvexConvexAlgorithm {

    protected BTConvexConvexAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ConvexConvexAlgorithm_CreateFunc_new                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexConvexAlgorithm_CreateFunc_new"),
            ConvexConvexAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexConvexAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold"),
            ConvexConvexAlgorithm_CreateFunc_getNumPerturbationIterations          = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexConvexAlgorithm_CreateFunc_getNumPerturbationIterations"),
            ConvexConvexAlgorithm_CreateFunc_getPdSolver                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexConvexAlgorithm_CreateFunc_getPdSolver"),
            ConvexConvexAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexConvexAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold"),
            ConvexConvexAlgorithm_CreateFunc_setNumPerturbationIterations          = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexConvexAlgorithm_CreateFunc_setNumPerturbationIterations"),
            ConvexConvexAlgorithm_CreateFunc_setPdSolver                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexConvexAlgorithm_CreateFunc_setPdSolver"),
            ConvexConvexAlgorithm_new                                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexConvexAlgorithm_new"),
            ConvexConvexAlgorithm_getManifold                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexConvexAlgorithm_getManifold"),
            ConvexConvexAlgorithm_setLowLevelOfDetail                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexConvexAlgorithm_setLowLevelOfDetail");

    }

    // --- [ btConvexConvexAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btConvexConvexAlgorithm_CreateFunc_new(@NativeType("void *") long pdSolver) {
        long __functionAddress = Functions.ConvexConvexAlgorithm_CreateFunc_new;
        if (CHECKS) {
            check(pdSolver);
        }
        return invokePP(pdSolver, __functionAddress);
    }

    // --- [ btConvexConvexAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold ] ---

    public static int btConvexConvexAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexConvexAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btConvexConvexAlgorithm_CreateFunc_getNumPerturbationIterations ] ---

    public static int btConvexConvexAlgorithm_CreateFunc_getNumPerturbationIterations(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexConvexAlgorithm_CreateFunc_getNumPerturbationIterations;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btConvexConvexAlgorithm_CreateFunc_getPdSolver ] ---

    @NativeType("void *")
    public static long btConvexConvexAlgorithm_CreateFunc_getPdSolver(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexConvexAlgorithm_CreateFunc_getPdSolver;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btConvexConvexAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold ] ---

    public static void btConvexConvexAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ConvexConvexAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btConvexConvexAlgorithm_CreateFunc_setNumPerturbationIterations ] ---

    public static void btConvexConvexAlgorithm_CreateFunc_setNumPerturbationIterations(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ConvexConvexAlgorithm_CreateFunc_setNumPerturbationIterations;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btConvexConvexAlgorithm_CreateFunc_setPdSolver ] ---

    public static void btConvexConvexAlgorithm_CreateFunc_setPdSolver(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.ConvexConvexAlgorithm_CreateFunc_setPdSolver;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btConvexConvexAlgorithm_new ] ---

    @NativeType("void *")
    public static long btConvexConvexAlgorithm_new(@NativeType("void *") long mf, @NativeType("void *") long ci, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("void *") long pdSolver, int numPerturbationIterations, int minimumPointsPerturbationThreshold) {
        long __functionAddress = Functions.ConvexConvexAlgorithm_new;
        if (CHECKS) {
            check(mf);
            check(ci);
            check(body0Wrap);
            check(body1Wrap);
            check(pdSolver);
        }
        return invokePPPPPP(mf, ci, body0Wrap, body1Wrap, pdSolver, numPerturbationIterations, minimumPointsPerturbationThreshold, __functionAddress);
    }

    // --- [ btConvexConvexAlgorithm_getManifold ] ---

    @NativeType("void *")
    public static long btConvexConvexAlgorithm_getManifold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexConvexAlgorithm_getManifold;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btConvexConvexAlgorithm_setLowLevelOfDetail ] ---

    public static void btConvexConvexAlgorithm_setLowLevelOfDetail(@NativeType("void *") long obj, @NativeType("bool") boolean useLowLevel) {
        long __functionAddress = Functions.ConvexConvexAlgorithm_setLowLevelOfDetail;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, useLowLevel, __functionAddress);
    }

}