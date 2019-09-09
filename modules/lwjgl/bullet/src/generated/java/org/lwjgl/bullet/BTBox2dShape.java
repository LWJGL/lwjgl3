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

public class BTBox2dShape {

    protected BTBox2dShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Box2dShape_new                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btBox2dShape_new"),
            Box2dShape_new2                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btBox2dShape_new2"),
            Box2dShape_new3                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btBox2dShape_new3"),
            Box2dShape_getCentroid                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btBox2dShape_getCentroid"),
            Box2dShape_getHalfExtentsWithMargin    = apiGetFunctionAddress(LibBullet.getLibrary(), "btBox2dShape_getHalfExtentsWithMargin"),
            Box2dShape_getHalfExtentsWithoutMargin = apiGetFunctionAddress(LibBullet.getLibrary(), "btBox2dShape_getHalfExtentsWithoutMargin"),
            Box2dShape_getNormals                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btBox2dShape_getNormals"),
            Box2dShape_getPlaneEquation            = apiGetFunctionAddress(LibBullet.getLibrary(), "btBox2dShape_getPlaneEquation"),
            Box2dShape_getVertexCount              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBox2dShape_getVertexCount"),
            Box2dShape_getVertices                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btBox2dShape_getVertices");

    }

    // --- [ btBox2dShape_new ] ---

    public static long nbtBox2dShape_new(long boxHalfExtents) {
        long __functionAddress = Functions.Box2dShape_new;
        return invokePP(boxHalfExtents, __functionAddress);
    }

    @NativeType("void *")
    public static long btBox2dShape_new(@NativeType("btVector3 const *") BTVector3 boxHalfExtents) {
        return nbtBox2dShape_new(boxHalfExtents.address());
    }

    // --- [ btBox2dShape_new2 ] ---

    @NativeType("void *")
    public static long btBox2dShape_new2(@NativeType("btScalar") float boxHalfExtent) {
        long __functionAddress = Functions.Box2dShape_new2;
        return invokeP(boxHalfExtent, __functionAddress);
    }

    // --- [ btBox2dShape_new3 ] ---

    @NativeType("void *")
    public static long btBox2dShape_new3(@NativeType("btScalar") float boxHalfExtentX, @NativeType("btScalar") float boxHalfExtentY, @NativeType("btScalar") float boxHalfExtentZ) {
        long __functionAddress = Functions.Box2dShape_new3;
        return invokeP(boxHalfExtentX, boxHalfExtentY, boxHalfExtentZ, __functionAddress);
    }

    // --- [ btBox2dShape_getCentroid ] ---

    public static void nbtBox2dShape_getCentroid(long obj, long value) {
        long __functionAddress = Functions.Box2dShape_getCentroid;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBox2dShape_getCentroid(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtBox2dShape_getCentroid(obj, value.address());
    }

    // --- [ btBox2dShape_getHalfExtentsWithMargin ] ---

    public static void nbtBox2dShape_getHalfExtentsWithMargin(long obj, long value) {
        long __functionAddress = Functions.Box2dShape_getHalfExtentsWithMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBox2dShape_getHalfExtentsWithMargin(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtBox2dShape_getHalfExtentsWithMargin(obj, value.address());
    }

    // --- [ btBox2dShape_getHalfExtentsWithoutMargin ] ---

    public static void nbtBox2dShape_getHalfExtentsWithoutMargin(long obj, long value) {
        long __functionAddress = Functions.Box2dShape_getHalfExtentsWithoutMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBox2dShape_getHalfExtentsWithoutMargin(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtBox2dShape_getHalfExtentsWithoutMargin(obj, value.address());
    }

    // --- [ btBox2dShape_getNormals ] ---

    public static long nbtBox2dShape_getNormals(long obj) {
        long __functionAddress = Functions.Box2dShape_getNormals;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 const *")
    public static BTVector3 btBox2dShape_getNormals(@NativeType("void *") long obj) {
        long __result = nbtBox2dShape_getNormals(obj);
        return BTVector3.createSafe(__result);
    }

    // --- [ btBox2dShape_getPlaneEquation ] ---

    public static void nbtBox2dShape_getPlaneEquation(long obj, long plane, int i) {
        long __functionAddress = Functions.Box2dShape_getPlaneEquation;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, plane, i, __functionAddress);
    }

    public static void btBox2dShape_getPlaneEquation(@NativeType("void *") long obj, @NativeType("btVector4 *") BTVector3 plane, int i) {
        nbtBox2dShape_getPlaneEquation(obj, plane.address(), i);
    }

    // --- [ btBox2dShape_getVertexCount ] ---

    public static int btBox2dShape_getVertexCount(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Box2dShape_getVertexCount;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btBox2dShape_getVertices ] ---

    public static long nbtBox2dShape_getVertices(long obj) {
        long __functionAddress = Functions.Box2dShape_getVertices;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 const *")
    public static BTVector3 btBox2dShape_getVertices(@NativeType("void *") long obj) {
        long __result = nbtBox2dShape_getVertices(obj);
        return BTVector3.createSafe(__result);
    }

}