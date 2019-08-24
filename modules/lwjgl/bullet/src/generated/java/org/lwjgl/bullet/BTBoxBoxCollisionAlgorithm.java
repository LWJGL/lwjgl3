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

public class BTBoxBoxCollisionAlgorithm {

    protected BTBoxBoxCollisionAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            BoxBoxCollisionAlgorithm_CreateFunc_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btBoxBoxCollisionAlgorithm_CreateFunc_new"),
            BoxBoxCollisionAlgorithm_new            = apiGetFunctionAddress(LibBullet.getLibrary(), "btBoxBoxCollisionAlgorithm_new"),
            BoxBoxCollisionAlgorithm_new2           = apiGetFunctionAddress(LibBullet.getLibrary(), "btBoxBoxCollisionAlgorithm_new2");

    }

    // --- [ btBoxBoxCollisionAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btBoxBoxCollisionAlgorithm_CreateFunc_new() {
        long __functionAddress = Functions.BoxBoxCollisionAlgorithm_CreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btBoxBoxCollisionAlgorithm_new ] ---

    @NativeType("void *")
    public static long btBoxBoxCollisionAlgorithm_new(@NativeType("void *") long ci) {
        long __functionAddress = Functions.BoxBoxCollisionAlgorithm_new;
        if (CHECKS) {
            check(ci);
        }
        return invokePP(ci, __functionAddress);
    }

    // --- [ btBoxBoxCollisionAlgorithm_new2 ] ---

    @NativeType("void *")
    public static long btBoxBoxCollisionAlgorithm_new2(@NativeType("void *") long mf, @NativeType("void *") long ci, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap) {
        long __functionAddress = Functions.BoxBoxCollisionAlgorithm_new2;
        if (CHECKS) {
            check(mf);
            check(ci);
            check(body0Wrap);
            check(body1Wrap);
        }
        return invokePPPPP(mf, ci, body0Wrap, body1Wrap, __functionAddress);
    }

}