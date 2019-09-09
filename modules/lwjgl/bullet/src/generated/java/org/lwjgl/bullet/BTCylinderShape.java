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

public class BTCylinderShape {

    protected BTCylinderShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CylinderShape_new                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCylinderShape_new"),
            CylinderShape_new2                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCylinderShape_new2"),
            CylinderShape_getHalfExtentsWithMargin    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCylinderShape_getHalfExtentsWithMargin"),
            CylinderShape_getHalfExtentsWithoutMargin = apiGetFunctionAddress(LibBullet.getLibrary(), "btCylinderShape_getHalfExtentsWithoutMargin"),
            CylinderShape_getRadius                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCylinderShape_getRadius"),
            CylinderShape_getUpAxis                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCylinderShape_getUpAxis"),
            CylinderShapeX_new                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCylinderShapeX_new"),
            CylinderShapeX_new2                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCylinderShapeX_new2"),
            CylinderShapeZ_new                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCylinderShapeZ_new"),
            CylinderShapeZ_new2                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCylinderShapeZ_new2");

    }

    // --- [ btCylinderShape_new ] ---

    public static long nbtCylinderShape_new(long halfExtents) {
        long __functionAddress = Functions.CylinderShape_new;
        return invokePP(halfExtents, __functionAddress);
    }

    @NativeType("void *")
    public static long btCylinderShape_new(@NativeType("btVector3 const *") BTVector3 halfExtents) {
        return nbtCylinderShape_new(halfExtents.address());
    }

    // --- [ btCylinderShape_new2 ] ---

    @NativeType("void *")
    public static long btCylinderShape_new2(@NativeType("btScalar") float halfExtentX, @NativeType("btScalar") float halfExtentY, @NativeType("btScalar") float halfExtentZ) {
        long __functionAddress = Functions.CylinderShape_new2;
        return invokeP(halfExtentX, halfExtentY, halfExtentZ, __functionAddress);
    }

    // --- [ btCylinderShape_getHalfExtentsWithMargin ] ---

    public static void nbtCylinderShape_getHalfExtentsWithMargin(long obj, long value) {
        long __functionAddress = Functions.CylinderShape_getHalfExtentsWithMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCylinderShape_getHalfExtentsWithMargin(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCylinderShape_getHalfExtentsWithMargin(obj, value.address());
    }

    // --- [ btCylinderShape_getHalfExtentsWithoutMargin ] ---

    public static void nbtCylinderShape_getHalfExtentsWithoutMargin(long obj, long value) {
        long __functionAddress = Functions.CylinderShape_getHalfExtentsWithoutMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCylinderShape_getHalfExtentsWithoutMargin(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCylinderShape_getHalfExtentsWithoutMargin(obj, value.address());
    }

    // --- [ btCylinderShape_getRadius ] ---

    @NativeType("btScalar")
    public static float btCylinderShape_getRadius(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CylinderShape_getRadius;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCylinderShape_getUpAxis ] ---

    public static int btCylinderShape_getUpAxis(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CylinderShape_getUpAxis;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCylinderShapeX_new ] ---

    public static long nbtCylinderShapeX_new(long halfExtents) {
        long __functionAddress = Functions.CylinderShapeX_new;
        return invokePP(halfExtents, __functionAddress);
    }

    @NativeType("void *")
    public static long btCylinderShapeX_new(@NativeType("btVector3 const *") BTVector3 halfExtents) {
        return nbtCylinderShapeX_new(halfExtents.address());
    }

    // --- [ btCylinderShapeX_new2 ] ---

    @NativeType("void *")
    public static long btCylinderShapeX_new2(@NativeType("btScalar") float halfExtentX, @NativeType("btScalar") float halfExtentY, @NativeType("btScalar") float halfExtentZ) {
        long __functionAddress = Functions.CylinderShapeX_new2;
        return invokeP(halfExtentX, halfExtentY, halfExtentZ, __functionAddress);
    }

    // --- [ btCylinderShapeZ_new ] ---

    public static long nbtCylinderShapeZ_new(long halfExtents) {
        long __functionAddress = Functions.CylinderShapeZ_new;
        return invokePP(halfExtents, __functionAddress);
    }

    @NativeType("void *")
    public static long btCylinderShapeZ_new(@NativeType("btVector3 const *") BTVector3 halfExtents) {
        return nbtCylinderShapeZ_new(halfExtents.address());
    }

    // --- [ btCylinderShapeZ_new2 ] ---

    @NativeType("void *")
    public static long btCylinderShapeZ_new2(@NativeType("btScalar") float halfExtentX, @NativeType("btScalar") float halfExtentY, @NativeType("btScalar") float halfExtentZ) {
        long __functionAddress = Functions.CylinderShapeZ_new2;
        return invokeP(halfExtentX, halfExtentY, halfExtentZ, __functionAddress);
    }

}