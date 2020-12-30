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

public class BTMLCPSolver {

    protected BTMLCPSolver() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MLCPSolver_new             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMLCPSolver_new"),
            MLCPSolver_getNumFallbacks = apiGetFunctionAddress(LibBullet.getLibrary(), "btMLCPSolver_getNumFallbacks"),
            MLCPSolver_setMLCPSolver   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMLCPSolver_setMLCPSolver"),
            MLCPSolver_setNumFallbacks = apiGetFunctionAddress(LibBullet.getLibrary(), "btMLCPSolver_setNumFallbacks");

    }

    // --- [ btMLCPSolver_new ] ---

    @NativeType("void *")
    public static long btMLCPSolver_new(@NativeType("void *") long solver) {
        long __functionAddress = Functions.MLCPSolver_new;
        if (CHECKS) {
            check(solver);
        }
        return invokePP(solver, __functionAddress);
    }

    // --- [ btMLCPSolver_getNumFallbacks ] ---

    public static int btMLCPSolver_getNumFallbacks(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MLCPSolver_getNumFallbacks;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMLCPSolver_setMLCPSolver ] ---

    public static void btMLCPSolver_setMLCPSolver(@NativeType("void *") long obj, @NativeType("void *") long solver) {
        long __functionAddress = Functions.MLCPSolver_setMLCPSolver;
        if (CHECKS) {
            check(obj);
            check(solver);
        }
        invokePPV(obj, solver, __functionAddress);
    }

    // --- [ btMLCPSolver_setNumFallbacks ] ---

    public static void btMLCPSolver_setNumFallbacks(@NativeType("void *") long obj, int num) {
        long __functionAddress = Functions.MLCPSolver_setNumFallbacks;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, num, __functionAddress);
    }

}