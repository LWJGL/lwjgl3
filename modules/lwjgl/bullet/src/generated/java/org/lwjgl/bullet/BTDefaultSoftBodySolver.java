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

public class BTDefaultSoftBodySolver {

    protected BTDefaultSoftBodySolver() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            DefaultSoftBodySolver_new                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultSoftBodySolver_new"),
            DefaultSoftBodySolver_copySoftBodyToVertexBuffer = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultSoftBodySolver_copySoftBodyToVertexBuffer");

    }

    // --- [ btDefaultSoftBodySolver_new ] ---

    @NativeType("void *")
    public static long btDefaultSoftBodySolver_new() {
        long __functionAddress = Functions.DefaultSoftBodySolver_new;
        return invokeP(__functionAddress);
    }

    // --- [ btDefaultSoftBodySolver_copySoftBodyToVertexBuffer ] ---

    public static void btDefaultSoftBodySolver_copySoftBodyToVertexBuffer(@NativeType("void *") long obj, @NativeType("void *") long softBody, @NativeType("void *") long vertexBuffer) {
        long __functionAddress = Functions.DefaultSoftBodySolver_copySoftBodyToVertexBuffer;
        if (CHECKS) {
            check(obj);
            check(softBody);
            check(vertexBuffer);
        }
        invokePPPV(obj, softBody, vertexBuffer, __functionAddress);
    }

}