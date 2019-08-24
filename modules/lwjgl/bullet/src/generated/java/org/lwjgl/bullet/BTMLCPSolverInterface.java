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

public class BTMLCPSolverInterface {

    protected BTMLCPSolverInterface() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MLCPSolverInterface_delete = apiGetFunctionAddress(LibBullet.getLibrary(), "btMLCPSolverInterface_delete");

    }

    // --- [ btMLCPSolverInterface_delete ] ---

    /**
     * EXPORT bool btMLCPSolverInterface_solveMLCP(btMLCPSolverInterface* obj, const btMatrixX_float* A, const btVectorX_float* b, btVectorX_float* x, const
     * btVectorX_float* lo, const btVectorX_float* hi, const btAlignedObjectArray_int* limitDependency, int numIterations, bool useSparsity);
     */
    public static void btMLCPSolverInterface_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MLCPSolverInterface_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}