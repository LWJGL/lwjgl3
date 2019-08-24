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

public class BTBoxShape {

    protected BTBoxShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            BoxShape_new                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btBoxShape_new"),
            BoxShape_new2                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btBoxShape_new2"),
            BoxShape_new3                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btBoxShape_new3"),
            BoxShape_getHalfExtentsWithMargin    = apiGetFunctionAddress(LibBullet.getLibrary(), "btBoxShape_getHalfExtentsWithMargin"),
            BoxShape_getHalfExtentsWithoutMargin = apiGetFunctionAddress(LibBullet.getLibrary(), "btBoxShape_getHalfExtentsWithoutMargin"),
            BoxShape_getPlaneEquation            = apiGetFunctionAddress(LibBullet.getLibrary(), "btBoxShape_getPlaneEquation");

    }

    // --- [ btBoxShape_new ] ---

    public static long nbtBoxShape_new(long boxHalfExtents) {
        long __functionAddress = Functions.BoxShape_new;
        return invokePP(boxHalfExtents, __functionAddress);
    }

    @NativeType("void *")
    public static long btBoxShape_new(@NativeType("btVector3 const *") ΒΤVector3 boxHalfExtents) {
        return nbtBoxShape_new(boxHalfExtents.address());
    }

    // --- [ btBoxShape_new2 ] ---

    @NativeType("void *")
    public static long btBoxShape_new2(@NativeType("btScalar") float boxHalfExtent) {
        long __functionAddress = Functions.BoxShape_new2;
        return invokeP(boxHalfExtent, __functionAddress);
    }

    // --- [ btBoxShape_new3 ] ---

    @NativeType("void *")
    public static long btBoxShape_new3(@NativeType("btScalar") float boxHalfExtentX, @NativeType("btScalar") float boxHalfExtentY, @NativeType("btScalar") float boxHalfExtentZ) {
        long __functionAddress = Functions.BoxShape_new3;
        return invokeP(boxHalfExtentX, boxHalfExtentY, boxHalfExtentZ, __functionAddress);
    }

    // --- [ btBoxShape_getHalfExtentsWithMargin ] ---

    public static void nbtBoxShape_getHalfExtentsWithMargin(long obj, long value) {
        long __functionAddress = Functions.BoxShape_getHalfExtentsWithMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBoxShape_getHalfExtentsWithMargin(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtBoxShape_getHalfExtentsWithMargin(obj, value.address());
    }

    // --- [ btBoxShape_getHalfExtentsWithoutMargin ] ---

    public static void nbtBoxShape_getHalfExtentsWithoutMargin(long obj, long value) {
        long __functionAddress = Functions.BoxShape_getHalfExtentsWithoutMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBoxShape_getHalfExtentsWithoutMargin(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtBoxShape_getHalfExtentsWithoutMargin(obj, value.address());
    }

    // --- [ btBoxShape_getPlaneEquation ] ---

    public static void nbtBoxShape_getPlaneEquation(long obj, long plane, int i) {
        long __functionAddress = Functions.BoxShape_getPlaneEquation;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, plane, i, __functionAddress);
    }

    public static void btBoxShape_getPlaneEquation(@NativeType("void *") long obj, @NativeType("btVector4 *") ΒΤVector3 plane, int i) {
        nbtBoxShape_getPlaneEquation(obj, plane.address(), i);
    }

}