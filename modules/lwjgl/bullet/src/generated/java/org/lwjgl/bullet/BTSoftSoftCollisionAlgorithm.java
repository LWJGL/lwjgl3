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

public class BTSoftSoftCollisionAlgorithm {

    protected BTSoftSoftCollisionAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SoftSoftCollisionAlgorithm_CreateFunc_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftSoftCollisionAlgorithm_CreateFunc_new"),
            SoftSoftCollisionAlgorithm_new            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftSoftCollisionAlgorithm_new"),
            SoftSoftCollisionAlgorithm_new2           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftSoftCollisionAlgorithm_new2");

    }

    // --- [ btSoftSoftCollisionAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btSoftSoftCollisionAlgorithm_CreateFunc_new() {
        long __functionAddress = Functions.SoftSoftCollisionAlgorithm_CreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftSoftCollisionAlgorithm_new ] ---

    @NativeType("void *")
    public static long btSoftSoftCollisionAlgorithm_new(@NativeType("void *") long ci) {
        long __functionAddress = Functions.SoftSoftCollisionAlgorithm_new;
        if (CHECKS) {
            check(ci);
        }
        return invokePP(ci, __functionAddress);
    }

    // --- [ btSoftSoftCollisionAlgorithm_new2 ] ---

    @NativeType("void *")
    public static long btSoftSoftCollisionAlgorithm_new2(@NativeType("void *") long mf, @NativeType("void *") long ci, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap) {
        long __functionAddress = Functions.SoftSoftCollisionAlgorithm_new2;
        if (CHECKS) {
            check(mf);
            check(ci);
            check(body0Wrap);
            check(body1Wrap);
        }
        return invokePPPPP(mf, ci, body0Wrap, body1Wrap, __functionAddress);
    }

}