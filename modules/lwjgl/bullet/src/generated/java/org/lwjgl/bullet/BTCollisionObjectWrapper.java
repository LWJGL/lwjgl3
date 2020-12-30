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

public class BTCollisionObjectWrapper {

    protected BTCollisionObjectWrapper() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CollisionObjectWrapper_getCollisionObject = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObjectWrapper_getCollisionObject"),
            CollisionObjectWrapper_getCollisionShape  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObjectWrapper_getCollisionShape"),
            CollisionObjectWrapper_getIndex           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObjectWrapper_getIndex"),
            CollisionObjectWrapper_getParent          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObjectWrapper_getParent"),
            CollisionObjectWrapper_getPartId          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObjectWrapper_getPartId"),
            CollisionObjectWrapper_getWorldTransform  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObjectWrapper_getWorldTransform"),
            CollisionObjectWrapper_setCollisionObject = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObjectWrapper_setCollisionObject"),
            CollisionObjectWrapper_setIndex           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObjectWrapper_setIndex"),
            CollisionObjectWrapper_setParent          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObjectWrapper_setParent"),
            CollisionObjectWrapper_setPartId          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObjectWrapper_setPartId"),
            CollisionObjectWrapper_setShape           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObjectWrapper_setShape");

    }

    // --- [ btCollisionObjectWrapper_getCollisionObject ] ---

    @NativeType("void *")
    public static long btCollisionObjectWrapper_getCollisionObject(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObjectWrapper_getCollisionObject;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionObjectWrapper_getCollisionShape ] ---

    @NativeType("void *")
    public static long btCollisionObjectWrapper_getCollisionShape(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObjectWrapper_getCollisionShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionObjectWrapper_getIndex ] ---

    public static int btCollisionObjectWrapper_getIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObjectWrapper_getIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionObjectWrapper_getParent ] ---

    @NativeType("void *")
    public static long btCollisionObjectWrapper_getParent(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObjectWrapper_getParent;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionObjectWrapper_getPartId ] ---

    public static int btCollisionObjectWrapper_getPartId(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObjectWrapper_getPartId;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionObjectWrapper_getWorldTransform ] ---

    public static void nbtCollisionObjectWrapper_getWorldTransform(long obj, long value) {
        long __functionAddress = Functions.CollisionObjectWrapper_getWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionObjectWrapper_getWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtCollisionObjectWrapper_getWorldTransform(obj, value.address());
    }

    // --- [ btCollisionObjectWrapper_setCollisionObject ] ---

    public static void btCollisionObjectWrapper_setCollisionObject(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.CollisionObjectWrapper_setCollisionObject;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btCollisionObjectWrapper_setIndex ] ---

    public static void btCollisionObjectWrapper_setIndex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.CollisionObjectWrapper_setIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionObjectWrapper_setParent ] ---

    public static void btCollisionObjectWrapper_setParent(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.CollisionObjectWrapper_setParent;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btCollisionObjectWrapper_setPartId ] ---

    public static void btCollisionObjectWrapper_setPartId(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.CollisionObjectWrapper_setPartId;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionObjectWrapper_setShape ] ---

    public static void btCollisionObjectWrapper_setShape(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.CollisionObjectWrapper_setShape;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

}