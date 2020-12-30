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

public class BTCompoundCollisionAlgorithm {

    protected BTCompoundCollisionAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CompoundCollisionAlgorithm_CreateFunc_new        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundCollisionAlgorithm_CreateFunc_new"),
            CompoundCollisionAlgorithm_SwappedCreateFunc_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundCollisionAlgorithm_SwappedCreateFunc_new"),
            CompoundCollisionAlgorithm_new                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundCollisionAlgorithm_new"),
            CompoundCollisionAlgorithm_getChildAlgorithm     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundCollisionAlgorithm_getChildAlgorithm");

    }

    // --- [ btCompoundCollisionAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btCompoundCollisionAlgorithm_CreateFunc_new() {
        long __functionAddress = Functions.CompoundCollisionAlgorithm_CreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btCompoundCollisionAlgorithm_SwappedCreateFunc_new ] ---

    @NativeType("void *")
    public static long btCompoundCollisionAlgorithm_SwappedCreateFunc_new() {
        long __functionAddress = Functions.CompoundCollisionAlgorithm_SwappedCreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btCompoundCollisionAlgorithm_new ] ---

    @NativeType("void *")
    public static long btCompoundCollisionAlgorithm_new(@NativeType("void *") long ci, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("bool") boolean isSwapped) {
        long __functionAddress = Functions.CompoundCollisionAlgorithm_new;
        if (CHECKS) {
            check(ci);
            check(body0Wrap);
            check(body1Wrap);
        }
        return invokePPPP(ci, body0Wrap, body1Wrap, isSwapped, __functionAddress);
    }

    // --- [ btCompoundCollisionAlgorithm_getChildAlgorithm ] ---

    @NativeType("void *")
    public static long btCompoundCollisionAlgorithm_getChildAlgorithm(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.CompoundCollisionAlgorithm_getChildAlgorithm;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

}