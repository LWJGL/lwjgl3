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

public class BTMinkowskiSumShape {

    protected BTMinkowskiSumShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MinkowskiSumShape_new           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMinkowskiSumShape_new"),
            MinkowskiSumShape_getShapeA     = apiGetFunctionAddress(LibBullet.getLibrary(), "btMinkowskiSumShape_getShapeA"),
            MinkowskiSumShape_getShapeB     = apiGetFunctionAddress(LibBullet.getLibrary(), "btMinkowskiSumShape_getShapeB"),
            MinkowskiSumShape_getTransformA = apiGetFunctionAddress(LibBullet.getLibrary(), "btMinkowskiSumShape_getTransformA"),
            MinkowskiSumShape_GetTransformB = apiGetFunctionAddress(LibBullet.getLibrary(), "btMinkowskiSumShape_GetTransformB"),
            MinkowskiSumShape_setTransformA = apiGetFunctionAddress(LibBullet.getLibrary(), "btMinkowskiSumShape_setTransformA"),
            MinkowskiSumShape_setTransformB = apiGetFunctionAddress(LibBullet.getLibrary(), "btMinkowskiSumShape_setTransformB");

    }

    // --- [ btMinkowskiSumShape_new ] ---

    @NativeType("void *")
    public static long btMinkowskiSumShape_new(@NativeType("void *") long shapeA, @NativeType("void *") long shapeB) {
        long __functionAddress = Functions.MinkowskiSumShape_new;
        if (CHECKS) {
            check(shapeA);
            check(shapeB);
        }
        return invokePPP(shapeA, shapeB, __functionAddress);
    }

    // --- [ btMinkowskiSumShape_getShapeA ] ---

    @NativeType("void *")
    public static long btMinkowskiSumShape_getShapeA(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MinkowskiSumShape_getShapeA;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMinkowskiSumShape_getShapeB ] ---

    @NativeType("void *")
    public static long btMinkowskiSumShape_getShapeB(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MinkowskiSumShape_getShapeB;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMinkowskiSumShape_getTransformA ] ---

    public static void nbtMinkowskiSumShape_getTransformA(long obj, long value) {
        long __functionAddress = Functions.MinkowskiSumShape_getTransformA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMinkowskiSumShape_getTransformA(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtMinkowskiSumShape_getTransformA(obj, value.address());
    }

    // --- [ btMinkowskiSumShape_GetTransformB ] ---

    public static void nbtMinkowskiSumShape_GetTransformB(long obj, long value) {
        long __functionAddress = Functions.MinkowskiSumShape_GetTransformB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMinkowskiSumShape_GetTransformB(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtMinkowskiSumShape_GetTransformB(obj, value.address());
    }

    // --- [ btMinkowskiSumShape_setTransformA ] ---

    public static void nbtMinkowskiSumShape_setTransformA(long obj, long transA) {
        long __functionAddress = Functions.MinkowskiSumShape_setTransformA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, transA, __functionAddress);
    }

    public static void btMinkowskiSumShape_setTransformA(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform transA) {
        nbtMinkowskiSumShape_setTransformA(obj, transA.address());
    }

    // --- [ btMinkowskiSumShape_setTransformB ] ---

    public static void nbtMinkowskiSumShape_setTransformB(long obj, long transB) {
        long __functionAddress = Functions.MinkowskiSumShape_setTransformB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, transB, __functionAddress);
    }

    public static void btMinkowskiSumShape_setTransformB(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform transB) {
        nbtMinkowskiSumShape_setTransformB(obj, transB.address());
    }

}