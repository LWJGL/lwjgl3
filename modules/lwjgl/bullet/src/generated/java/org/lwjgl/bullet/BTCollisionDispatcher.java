/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class BTCollisionDispatcher {

    protected BTCollisionDispatcher() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CollisionDispatcher_new                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionDispatcher_new"),
            CollisionDispatcher_defaultNearCallback             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionDispatcher_defaultNearCallback"),
            CollisionDispatcher_getCollisionConfiguration       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionDispatcher_getCollisionConfiguration"),
            CollisionDispatcher_getDispatcherFlags              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionDispatcher_getDispatcherFlags"),
            CollisionDispatcher_getNearCallback                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionDispatcher_getNearCallback"),
            CollisionDispatcher_registerCollisionCreateFunc     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionDispatcher_registerCollisionCreateFunc"),
            CollisionDispatcher_registerClosestPointsCreateFunc = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionDispatcher_registerClosestPointsCreateFunc"),
            CollisionDispatcher_setCollisionConfiguration       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionDispatcher_setCollisionConfiguration"),
            CollisionDispatcher_setDispatcherFlags              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionDispatcher_setDispatcherFlags"),
            CollisionDispatcher_setNearCallback                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionDispatcher_setNearCallback");

    }

    // --- [ btCollisionDispatcher_new ] ---

    @NativeType("void *")
    public static long btCollisionDispatcher_new(@NativeType("void *") long collisionConfiguration) {
        long __functionAddress = Functions.CollisionDispatcher_new;
        if (CHECKS) {
            check(collisionConfiguration);
        }
        return invokePP(collisionConfiguration, __functionAddress);
    }

    // --- [ btCollisionDispatcher_defaultNearCallback ] ---

    public static void btCollisionDispatcher_defaultNearCallback(@NativeType("void *") long collisionPair, @NativeType("void *") long dispatcher, @NativeType("void *") long dispatchInfo) {
        long __functionAddress = Functions.CollisionDispatcher_defaultNearCallback;
        if (CHECKS) {
            check(collisionPair);
            check(dispatcher);
            check(dispatchInfo);
        }
        invokePPPV(collisionPair, dispatcher, dispatchInfo, __functionAddress);
    }

    // --- [ btCollisionDispatcher_getCollisionConfiguration ] ---

    @NativeType("void *")
    public static long btCollisionDispatcher_getCollisionConfiguration(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionDispatcher_getCollisionConfiguration;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionDispatcher_getDispatcherFlags ] ---

    public static int btCollisionDispatcher_getDispatcherFlags(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionDispatcher_getDispatcherFlags;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionDispatcher_getNearCallback ] ---

    public static long nbtCollisionDispatcher_getNearCallback(long obj) {
        long __functionAddress = Functions.CollisionDispatcher_getNearCallback;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btNearCallback")
    public static BTNearCallback btCollisionDispatcher_getNearCallback(@NativeType("void *") long obj) {
        return BTNearCallback.createSafe(nbtCollisionDispatcher_getNearCallback(obj));
    }

    // --- [ btCollisionDispatcher_registerCollisionCreateFunc ] ---

    public static void btCollisionDispatcher_registerCollisionCreateFunc(@NativeType("void *") long obj, int proxyType0, int proxyType1, @NativeType("void *") long createFunc) {
        long __functionAddress = Functions.CollisionDispatcher_registerCollisionCreateFunc;
        if (CHECKS) {
            check(obj);
            check(createFunc);
        }
        invokePPV(obj, proxyType0, proxyType1, createFunc, __functionAddress);
    }

    // --- [ btCollisionDispatcher_registerClosestPointsCreateFunc ] ---

    public static void btCollisionDispatcher_registerClosestPointsCreateFunc(@NativeType("void *") long obj, int proxyType0, int proxyType1, @NativeType("void *") long createFunc) {
        long __functionAddress = Functions.CollisionDispatcher_registerClosestPointsCreateFunc;
        if (CHECKS) {
            check(obj);
            check(createFunc);
        }
        invokePPV(obj, proxyType0, proxyType1, createFunc, __functionAddress);
    }

    // --- [ btCollisionDispatcher_setCollisionConfiguration ] ---

    public static void btCollisionDispatcher_setCollisionConfiguration(@NativeType("void *") long obj, @NativeType("void *") long config) {
        long __functionAddress = Functions.CollisionDispatcher_setCollisionConfiguration;
        if (CHECKS) {
            check(obj);
            check(config);
        }
        invokePPV(obj, config, __functionAddress);
    }

    // --- [ btCollisionDispatcher_setDispatcherFlags ] ---

    public static void btCollisionDispatcher_setDispatcherFlags(@NativeType("void *") long obj, int flags) {
        long __functionAddress = Functions.CollisionDispatcher_setDispatcherFlags;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, flags, __functionAddress);
    }

    // --- [ btCollisionDispatcher_setNearCallback ] ---

    public static void nbtCollisionDispatcher_setNearCallback(long obj, long nearCallback) {
        long __functionAddress = Functions.CollisionDispatcher_setNearCallback;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, nearCallback, __functionAddress);
    }

    public static void btCollisionDispatcher_setNearCallback(@NativeType("void *") long obj, @NativeType("btNearCallback") BTNearCallbackI nearCallback) {
        nbtCollisionDispatcher_setNearCallback(obj, nearCallback.address());
    }

}