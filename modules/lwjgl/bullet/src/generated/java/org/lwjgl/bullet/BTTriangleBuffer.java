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

public class BTTriangleBuffer {

    protected BTTriangleBuffer() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Triangle_new                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangle_new"),
            Triangle_getPartId             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangle_getPartId"),
            Triangle_getTriangleIndex      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangle_getTriangleIndex"),
            Triangle_getVertex0            = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangle_getVertex0"),
            Triangle_getVertex1            = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangle_getVertex1"),
            Triangle_getVertex2            = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangle_getVertex2"),
            Triangle_setPartId             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangle_setPartId"),
            Triangle_setTriangleIndex      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangle_setTriangleIndex"),
            Triangle_setVertex0            = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangle_setVertex0"),
            Triangle_setVertex1            = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangle_setVertex1"),
            Triangle_setVertex2            = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangle_setVertex2"),
            Triangle_delete                = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangle_delete"),
            TriangleBuffer_new             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleBuffer_new"),
            TriangleBuffer_clearBuffer     = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleBuffer_clearBuffer"),
            TriangleBuffer_getNumTriangles = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleBuffer_getNumTriangles"),
            TriangleBuffer_getTriangle     = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleBuffer_getTriangle");

    }

    // --- [ btTriangle_new ] ---

    @NativeType("void *")
    public static long btTriangle_new() {
        long __functionAddress = Functions.Triangle_new;
        return invokeP(__functionAddress);
    }

    // --- [ btTriangle_getPartId ] ---

    public static int btTriangle_getPartId(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Triangle_getPartId;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTriangle_getTriangleIndex ] ---

    public static int btTriangle_getTriangleIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Triangle_getTriangleIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTriangle_getVertex0 ] ---

    public static void nbtTriangle_getVertex0(long obj, long value) {
        long __functionAddress = Functions.Triangle_getVertex0;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTriangle_getVertex0(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtTriangle_getVertex0(obj, value.address());
    }

    // --- [ btTriangle_getVertex1 ] ---

    public static void nbtTriangle_getVertex1(long obj, long value) {
        long __functionAddress = Functions.Triangle_getVertex1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTriangle_getVertex1(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtTriangle_getVertex1(obj, value.address());
    }

    // --- [ btTriangle_getVertex2 ] ---

    public static void nbtTriangle_getVertex2(long obj, long value) {
        long __functionAddress = Functions.Triangle_getVertex2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTriangle_getVertex2(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtTriangle_getVertex2(obj, value.address());
    }

    // --- [ btTriangle_setPartId ] ---

    public static void btTriangle_setPartId(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.Triangle_setPartId;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTriangle_setTriangleIndex ] ---

    public static void btTriangle_setTriangleIndex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.Triangle_setTriangleIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTriangle_setVertex0 ] ---

    public static void nbtTriangle_setVertex0(long obj, long value) {
        long __functionAddress = Functions.Triangle_setVertex0;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTriangle_setVertex0(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtTriangle_setVertex0(obj, value.address());
    }

    // --- [ btTriangle_setVertex1 ] ---

    public static void nbtTriangle_setVertex1(long obj, long value) {
        long __functionAddress = Functions.Triangle_setVertex1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTriangle_setVertex1(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtTriangle_setVertex1(obj, value.address());
    }

    // --- [ btTriangle_setVertex2 ] ---

    public static void nbtTriangle_setVertex2(long obj, long value) {
        long __functionAddress = Functions.Triangle_setVertex2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTriangle_setVertex2(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtTriangle_setVertex2(obj, value.address());
    }

    // --- [ btTriangle_delete ] ---

    public static void btTriangle_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Triangle_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btTriangleBuffer_new ] ---

    @NativeType("void *")
    public static long btTriangleBuffer_new() {
        long __functionAddress = Functions.TriangleBuffer_new;
        return invokeP(__functionAddress);
    }

    // --- [ btTriangleBuffer_clearBuffer ] ---

    public static void btTriangleBuffer_clearBuffer(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleBuffer_clearBuffer;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btTriangleBuffer_getNumTriangles ] ---

    public static int btTriangleBuffer_getNumTriangles(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleBuffer_getNumTriangles;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTriangleBuffer_getTriangle ] ---

    @NativeType("void *")
    public static long btTriangleBuffer_getTriangle(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.TriangleBuffer_getTriangle;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

}