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

public class BTCollisionCreateFunc {

    protected BTCollisionCreateFunc() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CollisionAlgorithmCreateFunc_new                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithmCreateFunc_new"),
            CollisionAlgorithmCreateFunc_CreateCollisionAlgorithm = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithmCreateFunc_CreateCollisionAlgorithm"),
            CollisionAlgorithmCreateFunc_getSwapped               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithmCreateFunc_getSwapped"),
            CollisionAlgorithmCreateFunc_setSwapped               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithmCreateFunc_setSwapped"),
            CollisionAlgorithmCreateFunc_delete                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithmCreateFunc_delete");

    }

    // --- [ btCollisionAlgorithmCreateFunc_new ] ---

    @NativeType("void *")
    public static long btCollisionAlgorithmCreateFunc_new() {
        long __functionAddress = Functions.CollisionAlgorithmCreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btCollisionAlgorithmCreateFunc_CreateCollisionAlgorithm ] ---

    @NativeType("void *")
    public static long btCollisionAlgorithmCreateFunc_CreateCollisionAlgorithm(@NativeType("void *") long obj, @NativeType("void *") long __unnamed0, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap) {
        long __functionAddress = Functions.CollisionAlgorithmCreateFunc_CreateCollisionAlgorithm;
        if (CHECKS) {
            check(obj);
            check(__unnamed0);
            check(body0Wrap);
            check(body1Wrap);
        }
        return invokePPPPP(obj, __unnamed0, body0Wrap, body1Wrap, __functionAddress);
    }

    // --- [ btCollisionAlgorithmCreateFunc_getSwapped ] ---

    @NativeType("bool")
    public static boolean btCollisionAlgorithmCreateFunc_getSwapped(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionAlgorithmCreateFunc_getSwapped;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionAlgorithmCreateFunc_setSwapped ] ---

    public static void btCollisionAlgorithmCreateFunc_setSwapped(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.CollisionAlgorithmCreateFunc_setSwapped;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionAlgorithmCreateFunc_delete ] ---

    public static void btCollisionAlgorithmCreateFunc_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionAlgorithmCreateFunc_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}