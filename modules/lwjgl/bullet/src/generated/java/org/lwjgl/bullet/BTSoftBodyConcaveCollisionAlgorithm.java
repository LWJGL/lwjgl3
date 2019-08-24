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

public class BTSoftBodyConcaveCollisionAlgorithm {

    protected BTSoftBodyConcaveCollisionAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SoftBodyConcaveCollisionAlgorithm_CreateFunc_new        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyConcaveCollisionAlgorithm_CreateFunc_new"),
            SoftBodyConcaveCollisionAlgorithm_SwappedCreateFunc_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyConcaveCollisionAlgorithm_SwappedCreateFunc_new"),
            SoftBodyConcaveCollisionAlgorithm_new                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyConcaveCollisionAlgorithm_new"),
            SoftBodyConcaveCollisionAlgorithm_clearCache            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyConcaveCollisionAlgorithm_clearCache");

    }

    // --- [ btSoftBodyConcaveCollisionAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btSoftBodyConcaveCollisionAlgorithm_CreateFunc_new() {
        long __functionAddress = Functions.SoftBodyConcaveCollisionAlgorithm_CreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBodyConcaveCollisionAlgorithm_SwappedCreateFunc_new ] ---

    @NativeType("void *")
    public static long btSoftBodyConcaveCollisionAlgorithm_SwappedCreateFunc_new() {
        long __functionAddress = Functions.SoftBodyConcaveCollisionAlgorithm_SwappedCreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBodyConcaveCollisionAlgorithm_new ] ---

    @NativeType("void *")
    public static long btSoftBodyConcaveCollisionAlgorithm_new(@NativeType("void *") long ci, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("bool") boolean isSwapped) {
        long __functionAddress = Functions.SoftBodyConcaveCollisionAlgorithm_new;
        if (CHECKS) {
            check(ci);
            check(body0Wrap);
            check(body1Wrap);
        }
        return invokePPPP(ci, body0Wrap, body1Wrap, isSwapped, __functionAddress);
    }

    // --- [ btSoftBodyConcaveCollisionAlgorithm_clearCache ] ---

    public static void btSoftBodyConcaveCollisionAlgorithm_clearCache(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodyConcaveCollisionAlgorithm_clearCache;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}