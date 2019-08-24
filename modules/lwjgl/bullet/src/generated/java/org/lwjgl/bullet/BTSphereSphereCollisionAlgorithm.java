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

public class BTSphereSphereCollisionAlgorithm {

    protected BTSphereSphereCollisionAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SphereSphereCollisionAlgorithm_CreateFunc_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btSphereSphereCollisionAlgorithm_CreateFunc_new"),
            SphereSphereCollisionAlgorithm_new            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSphereSphereCollisionAlgorithm_new"),
            SphereSphereCollisionAlgorithm_new2           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSphereSphereCollisionAlgorithm_new2");

    }

    // --- [ btSphereSphereCollisionAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btSphereSphereCollisionAlgorithm_CreateFunc_new() {
        long __functionAddress = Functions.SphereSphereCollisionAlgorithm_CreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSphereSphereCollisionAlgorithm_new ] ---

    @NativeType("void *")
    public static long btSphereSphereCollisionAlgorithm_new(@NativeType("void *") long mf, @NativeType("void *") long ci, @NativeType("void *") long col0Wrap, @NativeType("void *") long col1Wrap) {
        long __functionAddress = Functions.SphereSphereCollisionAlgorithm_new;
        if (CHECKS) {
            check(mf);
            check(ci);
            check(col0Wrap);
            check(col1Wrap);
        }
        return invokePPPPP(mf, ci, col0Wrap, col1Wrap, __functionAddress);
    }

    // --- [ btSphereSphereCollisionAlgorithm_new2 ] ---

    @NativeType("void *")
    public static long btSphereSphereCollisionAlgorithm_new2(@NativeType("void *") long ci) {
        long __functionAddress = Functions.SphereSphereCollisionAlgorithm_new2;
        if (CHECKS) {
            check(ci);
        }
        return invokePP(ci, __functionAddress);
    }

}