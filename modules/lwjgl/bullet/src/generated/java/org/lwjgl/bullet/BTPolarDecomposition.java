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

public class BTPolarDecomposition {

    protected BTPolarDecomposition() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            PolarDecomposition_new           = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolarDecomposition_new"),
            PolarDecomposition_decompose     = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolarDecomposition_decompose"),
            PolarDecomposition_maxIterations = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolarDecomposition_maxIterations"),
            PolarDecomposition_delete        = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolarDecomposition_delete");

    }

    // --- [ btPolarDecomposition_new ] ---

    @NativeType("void *")
    public static long btPolarDecomposition_new(@NativeType("btScalar") float tolerance, @NativeType("unsigned int") int maxIterations) {
        long __functionAddress = Functions.PolarDecomposition_new;
        return invokeP(tolerance, maxIterations, __functionAddress);
    }

    // --- [ btPolarDecomposition_decompose ] ---

    public static int nbtPolarDecomposition_decompose(long obj, long a, long u, long h) {
        long __functionAddress = Functions.PolarDecomposition_decompose;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPPI(obj, a, u, h, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int btPolarDecomposition_decompose(@NativeType("void *") long obj, @NativeType("btMatrix3x3 const *") BTMatrix3x3 a, @NativeType("btMatrix3x3 *") BTMatrix3x3 u, @NativeType("btMatrix3x3 *") BTMatrix3x3 h) {
        return nbtPolarDecomposition_decompose(obj, a.address(), u.address(), h.address());
    }

    // --- [ btPolarDecomposition_maxIterations ] ---

    @NativeType("unsigned int")
    public static int btPolarDecomposition_maxIterations(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PolarDecomposition_maxIterations;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btPolarDecomposition_delete ] ---

    public static void btPolarDecomposition_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PolarDecomposition_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}