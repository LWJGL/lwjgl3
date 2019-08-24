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

public class BTBox2dBox2dCollisionAlgorithm {

    protected BTBox2dBox2dCollisionAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Box2dBox2dCollisionAlgorithm_CreateFunc_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btBox2dBox2dCollisionAlgorithm_CreateFunc_new"),
            Box2dBox2dCollisionAlgorithm_new            = apiGetFunctionAddress(LibBullet.getLibrary(), "btBox2dBox2dCollisionAlgorithm_new"),
            Box2dBox2dCollisionAlgorithm_new2           = apiGetFunctionAddress(LibBullet.getLibrary(), "btBox2dBox2dCollisionAlgorithm_new2");

    }

    // --- [ btBox2dBox2dCollisionAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btBox2dBox2dCollisionAlgorithm_CreateFunc_new() {
        long __functionAddress = Functions.Box2dBox2dCollisionAlgorithm_CreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btBox2dBox2dCollisionAlgorithm_new ] ---

    @NativeType("void *")
    public static long btBox2dBox2dCollisionAlgorithm_new(@NativeType("void *") long ci) {
        long __functionAddress = Functions.Box2dBox2dCollisionAlgorithm_new;
        if (CHECKS) {
            check(ci);
        }
        return invokePP(ci, __functionAddress);
    }

    // --- [ btBox2dBox2dCollisionAlgorithm_new2 ] ---

    @NativeType("void *")
    public static long btBox2dBox2dCollisionAlgorithm_new2(@NativeType("void *") long mf, @NativeType("void *") long ci, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap) {
        long __functionAddress = Functions.Box2dBox2dCollisionAlgorithm_new2;
        if (CHECKS) {
            check(mf);
            check(ci);
            check(body0Wrap);
            check(body1Wrap);
        }
        return invokePPPPP(mf, ci, body0Wrap, body1Wrap, __functionAddress);
    }

}