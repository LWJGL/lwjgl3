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

public class BTCollisionConfiguration {

    protected BTCollisionConfiguration() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CollisionConfiguration_getCollisionAlgorithmCreateFunc = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionConfiguration_getCollisionAlgorithmCreateFunc"),
            CollisionConfiguration_getCollisionAlgorithmPool       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionConfiguration_getCollisionAlgorithmPool"),
            CollisionConfiguration_getPersistentManifoldPool       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionConfiguration_getPersistentManifoldPool"),
            CollisionConfiguration_delete                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionConfiguration_delete");

    }

    // --- [ btCollisionConfiguration_getCollisionAlgorithmCreateFunc ] ---

    @NativeType("void *")
    public static long btCollisionConfiguration_getCollisionAlgorithmCreateFunc(@NativeType("void *") long obj, int proxyType0, int proxyType1) {
        long __functionAddress = Functions.CollisionConfiguration_getCollisionAlgorithmCreateFunc;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, proxyType0, proxyType1, __functionAddress);
    }

    // --- [ btCollisionConfiguration_getCollisionAlgorithmPool ] ---

    @NativeType("void *")
    public static long btCollisionConfiguration_getCollisionAlgorithmPool(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionConfiguration_getCollisionAlgorithmPool;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionConfiguration_getPersistentManifoldPool ] ---

    @NativeType("void *")
    public static long btCollisionConfiguration_getPersistentManifoldPool(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionConfiguration_getPersistentManifoldPool;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionConfiguration_delete ] ---

    public static void btCollisionConfiguration_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionConfiguration_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}