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

public class BTMotionState {

    protected BTMotionState() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MotionStateWrapper_new        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMotionStateWrapper_new"),
            MotionState_getWorldTransform = apiGetFunctionAddress(LibBullet.getLibrary(), "btMotionState_getWorldTransform"),
            MotionState_setWorldTransform = apiGetFunctionAddress(LibBullet.getLibrary(), "btMotionState_setWorldTransform"),
            MotionState_delete            = apiGetFunctionAddress(LibBullet.getLibrary(), "btMotionState_delete");

    }

    // --- [ btMotionStateWrapper_new ] ---

    public static long nbtMotionStateWrapper_new(long getWorldTransformCallback, long setWorldTransformCallback) {
        long __functionAddress = Functions.MotionStateWrapper_new;
        return invokePPP(getWorldTransformCallback, setWorldTransformCallback, __functionAddress);
    }

    @NativeType("void *")
    public static long btMotionStateWrapper_new(@NativeType("p_btMotionState_getWorldTransform") BTMotionStateGetWorldTransformI getWorldTransformCallback, @NativeType("p_btMotionState_setWorldTransform") BTMotionStateSetWorldTransformI setWorldTransformCallback) {
        return nbtMotionStateWrapper_new(getWorldTransformCallback.address(), setWorldTransformCallback.address());
    }

    // --- [ btMotionState_getWorldTransform ] ---

    public static void nbtMotionState_getWorldTransform(long obj, long worldTrans) {
        long __functionAddress = Functions.MotionState_getWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, worldTrans, __functionAddress);
    }

    public static void btMotionState_getWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform worldTrans) {
        nbtMotionState_getWorldTransform(obj, worldTrans.address());
    }

    // --- [ btMotionState_setWorldTransform ] ---

    public static void nbtMotionState_setWorldTransform(long obj, long worldTrans) {
        long __functionAddress = Functions.MotionState_setWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, worldTrans, __functionAddress);
    }

    public static void btMotionState_setWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform worldTrans) {
        nbtMotionState_setWorldTransform(obj, worldTrans.address());
    }

    // --- [ btMotionState_delete ] ---

    public static void btMotionState_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MotionState_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}