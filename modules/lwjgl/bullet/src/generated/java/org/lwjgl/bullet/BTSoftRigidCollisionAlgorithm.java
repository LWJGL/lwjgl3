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

public class BTSoftRigidCollisionAlgorithm {

    protected BTSoftRigidCollisionAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SoftRigidCollisionAlgorithm_CreateFunc_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftRigidCollisionAlgorithm_CreateFunc_new"),
            SoftRigidCollisionAlgorithm_new            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftRigidCollisionAlgorithm_new");

    }

    // --- [ btSoftRigidCollisionAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btSoftRigidCollisionAlgorithm_CreateFunc_new() {
        long __functionAddress = Functions.SoftRigidCollisionAlgorithm_CreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftRigidCollisionAlgorithm_new ] ---

    @NativeType("void *")
    public static long btSoftRigidCollisionAlgorithm_new(@NativeType("void *") long mf, @NativeType("void *") long ci, @NativeType("void *") long col0, @NativeType("void *") long col1Wrap, @NativeType("bool") boolean isSwapped) {
        long __functionAddress = Functions.SoftRigidCollisionAlgorithm_new;
        if (CHECKS) {
            check(mf);
            check(ci);
            check(col0);
            check(col1Wrap);
        }
        return invokePPPPP(mf, ci, col0, col1Wrap, isSwapped, __functionAddress);
    }

}