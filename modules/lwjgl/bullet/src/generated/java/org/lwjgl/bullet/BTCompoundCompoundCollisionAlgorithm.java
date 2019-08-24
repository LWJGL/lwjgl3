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

public class BTCompoundCompoundCollisionAlgorithm {

    protected BTCompoundCompoundCollisionAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CompoundCompoundCollisionAlgorithm_CreateFunc_new        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundCompoundCollisionAlgorithm_CreateFunc_new"),
            CompoundCompoundCollisionAlgorithm_SwappedCreateFunc_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundCompoundCollisionAlgorithm_SwappedCreateFunc_new"),
            CompoundCompoundCollisionAlgorithm_new                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundCompoundCollisionAlgorithm_new");

    }

    // --- [ btCompoundCompoundCollisionAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btCompoundCompoundCollisionAlgorithm_CreateFunc_new() {
        long __functionAddress = Functions.CompoundCompoundCollisionAlgorithm_CreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btCompoundCompoundCollisionAlgorithm_SwappedCreateFunc_new ] ---

    @NativeType("void *")
    public static long btCompoundCompoundCollisionAlgorithm_SwappedCreateFunc_new() {
        long __functionAddress = Functions.CompoundCompoundCollisionAlgorithm_SwappedCreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btCompoundCompoundCollisionAlgorithm_new ] ---

    @NativeType("void *")
    public static long btCompoundCompoundCollisionAlgorithm_new(@NativeType("void *") long ci, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("bool") boolean isSwapped) {
        long __functionAddress = Functions.CompoundCompoundCollisionAlgorithm_new;
        if (CHECKS) {
            check(ci);
            check(body0Wrap);
            check(body1Wrap);
        }
        return invokePPPP(ci, body0Wrap, body1Wrap, isSwapped, __functionAddress);
    }

}