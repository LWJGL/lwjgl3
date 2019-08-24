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

public class BTSphereTriangleCollisionAlgorithm {

    protected BTSphereTriangleCollisionAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SphereTriangleCollisionAlgorithm_CreateFunc_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btSphereTriangleCollisionAlgorithm_CreateFunc_new"),
            SphereTriangleCollisionAlgorithm_new            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSphereTriangleCollisionAlgorithm_new"),
            SphereTriangleCollisionAlgorithm_new2           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSphereTriangleCollisionAlgorithm_new2");

    }

    // --- [ btSphereTriangleCollisionAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btSphereTriangleCollisionAlgorithm_CreateFunc_new() {
        long __functionAddress = Functions.SphereTriangleCollisionAlgorithm_CreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSphereTriangleCollisionAlgorithm_new ] ---

    @NativeType("void *")
    public static long btSphereTriangleCollisionAlgorithm_new(@NativeType("void *") long mf, @NativeType("void *") long ci, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("bool") boolean swapped) {
        long __functionAddress = Functions.SphereTriangleCollisionAlgorithm_new;
        if (CHECKS) {
            check(mf);
            check(ci);
            check(body0Wrap);
            check(body1Wrap);
        }
        return invokePPPPP(mf, ci, body0Wrap, body1Wrap, swapped, __functionAddress);
    }

    // --- [ btSphereTriangleCollisionAlgorithm_new2 ] ---

    @NativeType("void *")
    public static long btSphereTriangleCollisionAlgorithm_new2(@NativeType("void *") long ci) {
        long __functionAddress = Functions.SphereTriangleCollisionAlgorithm_new2;
        if (CHECKS) {
            check(ci);
        }
        return invokePP(ci, __functionAddress);
    }

}