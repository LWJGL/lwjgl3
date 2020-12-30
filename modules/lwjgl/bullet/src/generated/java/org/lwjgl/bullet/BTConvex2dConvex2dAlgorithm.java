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

public class BTConvex2dConvex2dAlgorithm {

    protected BTConvex2dConvex2dAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Convex2dConvex2dAlgorithm_CreateFunc_new                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvex2dConvex2dAlgorithm_CreateFunc_new"),
            Convex2dConvex2dAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvex2dConvex2dAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold"),
            Convex2dConvex2dAlgorithm_CreateFunc_getNumPerturbationIterations          = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvex2dConvex2dAlgorithm_CreateFunc_getNumPerturbationIterations"),
            Convex2dConvex2dAlgorithm_CreateFunc_getPdSolver                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvex2dConvex2dAlgorithm_CreateFunc_getPdSolver"),
            Convex2dConvex2dAlgorithm_CreateFunc_getSimplexSolver                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvex2dConvex2dAlgorithm_CreateFunc_getSimplexSolver"),
            Convex2dConvex2dAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvex2dConvex2dAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold"),
            Convex2dConvex2dAlgorithm_CreateFunc_setNumPerturbationIterations          = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvex2dConvex2dAlgorithm_CreateFunc_setNumPerturbationIterations"),
            Convex2dConvex2dAlgorithm_CreateFunc_setPdSolver                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvex2dConvex2dAlgorithm_CreateFunc_setPdSolver"),
            Convex2dConvex2dAlgorithm_CreateFunc_setSimplexSolver                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvex2dConvex2dAlgorithm_CreateFunc_setSimplexSolver"),
            Convex2dConvex2dAlgorithm_new                                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvex2dConvex2dAlgorithm_new"),
            Convex2dConvex2dAlgorithm_getManifold                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvex2dConvex2dAlgorithm_getManifold"),
            Convex2dConvex2dAlgorithm_setLowLevelOfDetail                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvex2dConvex2dAlgorithm_setLowLevelOfDetail");

    }

    // --- [ btConvex2dConvex2dAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btConvex2dConvex2dAlgorithm_CreateFunc_new(@NativeType("void *") long simplexSolver, @NativeType("void *") long pdSolver) {
        long __functionAddress = Functions.Convex2dConvex2dAlgorithm_CreateFunc_new;
        if (CHECKS) {
            check(simplexSolver);
            check(pdSolver);
        }
        return invokePPP(simplexSolver, pdSolver, __functionAddress);
    }

    // --- [ btConvex2dConvex2dAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold ] ---

    public static int btConvex2dConvex2dAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Convex2dConvex2dAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btConvex2dConvex2dAlgorithm_CreateFunc_getNumPerturbationIterations ] ---

    public static int btConvex2dConvex2dAlgorithm_CreateFunc_getNumPerturbationIterations(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Convex2dConvex2dAlgorithm_CreateFunc_getNumPerturbationIterations;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btConvex2dConvex2dAlgorithm_CreateFunc_getPdSolver ] ---

    @NativeType("void *")
    public static long btConvex2dConvex2dAlgorithm_CreateFunc_getPdSolver(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Convex2dConvex2dAlgorithm_CreateFunc_getPdSolver;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btConvex2dConvex2dAlgorithm_CreateFunc_getSimplexSolver ] ---

    @NativeType("void *")
    public static long btConvex2dConvex2dAlgorithm_CreateFunc_getSimplexSolver(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Convex2dConvex2dAlgorithm_CreateFunc_getSimplexSolver;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btConvex2dConvex2dAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold ] ---

    public static void btConvex2dConvex2dAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.Convex2dConvex2dAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btConvex2dConvex2dAlgorithm_CreateFunc_setNumPerturbationIterations ] ---

    public static void btConvex2dConvex2dAlgorithm_CreateFunc_setNumPerturbationIterations(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.Convex2dConvex2dAlgorithm_CreateFunc_setNumPerturbationIterations;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btConvex2dConvex2dAlgorithm_CreateFunc_setPdSolver ] ---

    public static void btConvex2dConvex2dAlgorithm_CreateFunc_setPdSolver(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.Convex2dConvex2dAlgorithm_CreateFunc_setPdSolver;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btConvex2dConvex2dAlgorithm_CreateFunc_setSimplexSolver ] ---

    public static void btConvex2dConvex2dAlgorithm_CreateFunc_setSimplexSolver(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.Convex2dConvex2dAlgorithm_CreateFunc_setSimplexSolver;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btConvex2dConvex2dAlgorithm_new ] ---

    @NativeType("void *")
    public static long btConvex2dConvex2dAlgorithm_new(@NativeType("void *") long mf, @NativeType("void *") long ci, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("void *") long simplexSolver, @NativeType("void *") long pdSolver, int numPerturbationIterations, int minimumPointsPerturbationThreshold) {
        long __functionAddress = Functions.Convex2dConvex2dAlgorithm_new;
        if (CHECKS) {
            check(mf);
            check(ci);
            check(body0Wrap);
            check(body1Wrap);
            check(simplexSolver);
            check(pdSolver);
        }
        return invokePPPPPPP(mf, ci, body0Wrap, body1Wrap, simplexSolver, pdSolver, numPerturbationIterations, minimumPointsPerturbationThreshold, __functionAddress);
    }

    // --- [ btConvex2dConvex2dAlgorithm_getManifold ] ---

    @NativeType("void *")
    public static long btConvex2dConvex2dAlgorithm_getManifold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Convex2dConvex2dAlgorithm_getManifold;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btConvex2dConvex2dAlgorithm_setLowLevelOfDetail ] ---

    public static void btConvex2dConvex2dAlgorithm_setLowLevelOfDetail(@NativeType("void *") long obj, @NativeType("bool") boolean useLowLevel) {
        long __functionAddress = Functions.Convex2dConvex2dAlgorithm_setLowLevelOfDetail;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, useLowLevel, __functionAddress);
    }

}