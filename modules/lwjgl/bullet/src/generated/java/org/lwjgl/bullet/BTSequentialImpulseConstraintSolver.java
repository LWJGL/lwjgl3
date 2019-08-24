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

public class BTSequentialImpulseConstraintSolver {

    protected BTSequentialImpulseConstraintSolver() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SequentialImpulseConstraintSolver_new         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSequentialImpulseConstraintSolver_new"),
            SequentialImpulseConstraintSolver_btRand2     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSequentialImpulseConstraintSolver_btRand2"),
            SequentialImpulseConstraintSolver_btRandInt2  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSequentialImpulseConstraintSolver_btRandInt2"),
            SequentialImpulseConstraintSolver_getRandSeed = apiGetFunctionAddress(LibBullet.getLibrary(), "btSequentialImpulseConstraintSolver_getRandSeed"),
            SequentialImpulseConstraintSolver_setRandSeed = apiGetFunctionAddress(LibBullet.getLibrary(), "btSequentialImpulseConstraintSolver_setRandSeed");

    }

    // --- [ btSequentialImpulseConstraintSolver_new ] ---

    @NativeType("void *")
    public static long btSequentialImpulseConstraintSolver_new() {
        long __functionAddress = Functions.SequentialImpulseConstraintSolver_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSequentialImpulseConstraintSolver_btRand2 ] ---

    @NativeType("unsigned long")
    public static long btSequentialImpulseConstraintSolver_btRand2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SequentialImpulseConstraintSolver_btRand2;
        if (CHECKS) {
            check(obj);
        }
        return invokePN(obj, __functionAddress);
    }

    // --- [ btSequentialImpulseConstraintSolver_btRandInt2 ] ---

    public static int btSequentialImpulseConstraintSolver_btRandInt2(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.SequentialImpulseConstraintSolver_btRandInt2;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, n, __functionAddress);
    }

    // --- [ btSequentialImpulseConstraintSolver_getRandSeed ] ---

    @NativeType("unsigned long")
    public static long btSequentialImpulseConstraintSolver_getRandSeed(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SequentialImpulseConstraintSolver_getRandSeed;
        if (CHECKS) {
            check(obj);
        }
        return invokePN(obj, __functionAddress);
    }

    // --- [ btSequentialImpulseConstraintSolver_setRandSeed ] ---

    public static void btSequentialImpulseConstraintSolver_setRandSeed(@NativeType("void *") long obj, @NativeType("unsigned long") long seed) {
        long __functionAddress = Functions.SequentialImpulseConstraintSolver_setRandSeed;
        if (CHECKS) {
            check(obj);
        }
        invokePNV(obj, seed, __functionAddress);
    }

}