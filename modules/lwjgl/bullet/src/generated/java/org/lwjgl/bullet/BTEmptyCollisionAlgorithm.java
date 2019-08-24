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

public class BTEmptyCollisionAlgorithm {

    protected BTEmptyCollisionAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            EmptyAlgorithm_CreateFunc_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btEmptyAlgorithm_CreateFunc_new"),
            EmptyAlgorithm_new            = apiGetFunctionAddress(LibBullet.getLibrary(), "btEmptyAlgorithm_new");

    }

    // --- [ btEmptyAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btEmptyAlgorithm_CreateFunc_new() {
        long __functionAddress = Functions.EmptyAlgorithm_CreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btEmptyAlgorithm_new ] ---

    @NativeType("void *")
    public static long btEmptyAlgorithm_new(@NativeType("void *") long ci) {
        long __functionAddress = Functions.EmptyAlgorithm_new;
        if (CHECKS) {
            check(ci);
        }
        return invokePP(ci, __functionAddress);
    }

}