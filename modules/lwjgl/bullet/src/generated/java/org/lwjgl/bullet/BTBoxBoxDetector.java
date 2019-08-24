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

public class BTBoxBoxDetector {

    protected BTBoxBoxDetector() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            BoxBoxDetector_new     = apiGetFunctionAddress(LibBullet.getLibrary(), "btBoxBoxDetector_new"),
            BoxBoxDetector_getBox1 = apiGetFunctionAddress(LibBullet.getLibrary(), "btBoxBoxDetector_getBox1"),
            BoxBoxDetector_getBox2 = apiGetFunctionAddress(LibBullet.getLibrary(), "btBoxBoxDetector_getBox2"),
            BoxBoxDetector_setBox1 = apiGetFunctionAddress(LibBullet.getLibrary(), "btBoxBoxDetector_setBox1"),
            BoxBoxDetector_setBox2 = apiGetFunctionAddress(LibBullet.getLibrary(), "btBoxBoxDetector_setBox2");

    }

    // --- [ btBoxBoxDetector_new ] ---

    @NativeType("void *")
    public static long btBoxBoxDetector_new(@NativeType("void *") long box1, @NativeType("void *") long box2) {
        long __functionAddress = Functions.BoxBoxDetector_new;
        if (CHECKS) {
            check(box1);
            check(box2);
        }
        return invokePPP(box1, box2, __functionAddress);
    }

    // --- [ btBoxBoxDetector_getBox1 ] ---

    @NativeType("void *")
    public static long btBoxBoxDetector_getBox1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BoxBoxDetector_getBox1;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btBoxBoxDetector_getBox2 ] ---

    @NativeType("void *")
    public static long btBoxBoxDetector_getBox2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BoxBoxDetector_getBox2;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btBoxBoxDetector_setBox1 ] ---

    public static void btBoxBoxDetector_setBox1(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.BoxBoxDetector_setBox1;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btBoxBoxDetector_setBox2 ] ---

    public static void btBoxBoxDetector_setBox2(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.BoxBoxDetector_setBox2;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

}