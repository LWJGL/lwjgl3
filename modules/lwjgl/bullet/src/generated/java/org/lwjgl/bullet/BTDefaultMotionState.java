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

public class BTDefaultMotionState {

    protected BTDefaultMotionState() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            DefaultMotionState_new                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultMotionState_new"),
            DefaultMotionState_new2                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultMotionState_new2"),
            DefaultMotionState_new3                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultMotionState_new3"),
            DefaultMotionState_getCenterOfMassOffset = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultMotionState_getCenterOfMassOffset"),
            DefaultMotionState_getGraphicsWorldTrans = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultMotionState_getGraphicsWorldTrans"),
            DefaultMotionState_getStartWorldTrans    = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultMotionState_getStartWorldTrans"),
            DefaultMotionState_getUserPointer        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultMotionState_getUserPointer"),
            DefaultMotionState_setCenterOfMassOffset = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultMotionState_setCenterOfMassOffset"),
            DefaultMotionState_setGraphicsWorldTrans = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultMotionState_setGraphicsWorldTrans"),
            DefaultMotionState_setStartWorldTrans    = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultMotionState_setStartWorldTrans"),
            DefaultMotionState_setUserPointer        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultMotionState_setUserPointer");

    }

    // --- [ btDefaultMotionState_new ] ---

    @NativeType("void *")
    public static long btDefaultMotionState_new() {
        long __functionAddress = Functions.DefaultMotionState_new;
        return invokeP(__functionAddress);
    }

    // --- [ btDefaultMotionState_new2 ] ---

    public static long nbtDefaultMotionState_new2(long startTrans) {
        long __functionAddress = Functions.DefaultMotionState_new2;
        return invokePP(startTrans, __functionAddress);
    }

    @NativeType("void *")
    public static long btDefaultMotionState_new2(@NativeType("btTransform const *") BTTransform startTrans) {
        return nbtDefaultMotionState_new2(startTrans.address());
    }

    // --- [ btDefaultMotionState_new3 ] ---

    public static long nbtDefaultMotionState_new3(long startTrans, long centerOfMassOffset) {
        long __functionAddress = Functions.DefaultMotionState_new3;
        return invokePPP(startTrans, centerOfMassOffset, __functionAddress);
    }

    @NativeType("void *")
    public static long btDefaultMotionState_new3(@NativeType("btTransform const *") BTTransform startTrans, @NativeType("btTransform const *") BTTransform centerOfMassOffset) {
        return nbtDefaultMotionState_new3(startTrans.address(), centerOfMassOffset.address());
    }

    // --- [ btDefaultMotionState_getCenterOfMassOffset ] ---

    public static void nbtDefaultMotionState_getCenterOfMassOffset(long obj, long value) {
        long __functionAddress = Functions.DefaultMotionState_getCenterOfMassOffset;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDefaultMotionState_getCenterOfMassOffset(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtDefaultMotionState_getCenterOfMassOffset(obj, value.address());
    }

    // --- [ btDefaultMotionState_getGraphicsWorldTrans ] ---

    public static void nbtDefaultMotionState_getGraphicsWorldTrans(long obj, long value) {
        long __functionAddress = Functions.DefaultMotionState_getGraphicsWorldTrans;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDefaultMotionState_getGraphicsWorldTrans(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtDefaultMotionState_getGraphicsWorldTrans(obj, value.address());
    }

    // --- [ btDefaultMotionState_getStartWorldTrans ] ---

    public static void nbtDefaultMotionState_getStartWorldTrans(long obj, long value) {
        long __functionAddress = Functions.DefaultMotionState_getStartWorldTrans;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDefaultMotionState_getStartWorldTrans(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtDefaultMotionState_getStartWorldTrans(obj, value.address());
    }

    // --- [ btDefaultMotionState_getUserPointer ] ---

    @NativeType("void *")
    public static long btDefaultMotionState_getUserPointer(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DefaultMotionState_getUserPointer;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDefaultMotionState_setCenterOfMassOffset ] ---

    public static void nbtDefaultMotionState_setCenterOfMassOffset(long obj, long value) {
        long __functionAddress = Functions.DefaultMotionState_setCenterOfMassOffset;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDefaultMotionState_setCenterOfMassOffset(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform value) {
        nbtDefaultMotionState_setCenterOfMassOffset(obj, value.address());
    }

    // --- [ btDefaultMotionState_setGraphicsWorldTrans ] ---

    public static void nbtDefaultMotionState_setGraphicsWorldTrans(long obj, long value) {
        long __functionAddress = Functions.DefaultMotionState_setGraphicsWorldTrans;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDefaultMotionState_setGraphicsWorldTrans(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform value) {
        nbtDefaultMotionState_setGraphicsWorldTrans(obj, value.address());
    }

    // --- [ btDefaultMotionState_setStartWorldTrans ] ---

    public static void nbtDefaultMotionState_setStartWorldTrans(long obj, long value) {
        long __functionAddress = Functions.DefaultMotionState_setStartWorldTrans;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDefaultMotionState_setStartWorldTrans(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform value) {
        nbtDefaultMotionState_setStartWorldTrans(obj, value.address());
    }

    // --- [ btDefaultMotionState_setUserPointer ] ---

    public static void btDefaultMotionState_setUserPointer(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.DefaultMotionState_setUserPointer;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

}