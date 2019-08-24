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

public class BTHeightfieldTerrainShape {

    protected BTHeightfieldTerrainShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            HeightfieldTerrainShape_new                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btHeightfieldTerrainShape_new"),
            HeightfieldTerrainShape_new2                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btHeightfieldTerrainShape_new2"),
            HeightfieldTerrainShape_performRaycast            = apiGetFunctionAddress(LibBullet.getLibrary(), "btHeightfieldTerrainShape_performRaycast"),
            HeightfieldTerrainShape_buildAccelerator          = apiGetFunctionAddress(LibBullet.getLibrary(), "btHeightfieldTerrainShape_buildAccelerator"),
            HeightfieldTerrainShape_clearAccelerator          = apiGetFunctionAddress(LibBullet.getLibrary(), "btHeightfieldTerrainShape_clearAccelerator"),
            HeightfieldTerrainShape_getUpAxis                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btHeightfieldTerrainShape_getUpAxis"),
            HeightfieldTerrainShape_setFlipTriangleWinding    = apiGetFunctionAddress(LibBullet.getLibrary(), "btHeightfieldTerrainShape_setFlipTriangleWinding"),
            HeightfieldTerrainShape_setUseDiamondSubdivision  = apiGetFunctionAddress(LibBullet.getLibrary(), "btHeightfieldTerrainShape_setUseDiamondSubdivision"),
            HeightfieldTerrainShape_setUseDiamondSubdivision2 = apiGetFunctionAddress(LibBullet.getLibrary(), "btHeightfieldTerrainShape_setUseDiamondSubdivision2"),
            HeightfieldTerrainShape_setUseZigzagSubdivision   = apiGetFunctionAddress(LibBullet.getLibrary(), "btHeightfieldTerrainShape_setUseZigzagSubdivision"),
            HeightfieldTerrainShape_setUseZigzagSubdivision2  = apiGetFunctionAddress(LibBullet.getLibrary(), "btHeightfieldTerrainShape_setUseZigzagSubdivision2");

    }

    // --- [ btHeightfieldTerrainShape_new ] ---

    @NativeType("void *")
    public static long btHeightfieldTerrainShape_new(int heightStickWidth, int heightStickLength, @NativeType("void *") long heightfieldData, @NativeType("btScalar") float heightScale, @NativeType("btScalar") float minHeight, @NativeType("btScalar") float maxHeight, int upAxis, int heightDataType, @NativeType("bool") boolean flipQuadEdges) {
        long __functionAddress = Functions.HeightfieldTerrainShape_new;
        if (CHECKS) {
            check(heightfieldData);
        }
        return invokePP(heightStickWidth, heightStickLength, heightfieldData, heightScale, minHeight, maxHeight, upAxis, heightDataType, flipQuadEdges, __functionAddress);
    }

    // --- [ btHeightfieldTerrainShape_new2 ] ---

    @NativeType("void *")
    public static long btHeightfieldTerrainShape_new2(int heightStickWidth, int heightStickLength, @NativeType("void *") long heightfieldData, @NativeType("btScalar") float maxHeight, int upAxis, @NativeType("bool") boolean useFloatData, @NativeType("bool") boolean flipQuadEdges) {
        long __functionAddress = Functions.HeightfieldTerrainShape_new2;
        if (CHECKS) {
            check(heightfieldData);
        }
        return invokePP(heightStickWidth, heightStickLength, heightfieldData, maxHeight, upAxis, useFloatData, flipQuadEdges, __functionAddress);
    }

    // --- [ btHeightfieldTerrainShape_performRaycast ] ---

    public static void nbtHeightfieldTerrainShape_performRaycast(long obj, long callback, long raySource, long rayTarget) {
        long __functionAddress = Functions.HeightfieldTerrainShape_performRaycast;
        if (CHECKS) {
            check(obj);
            check(callback);
        }
        invokePPPPV(obj, callback, raySource, rayTarget, __functionAddress);
    }

    public static void btHeightfieldTerrainShape_performRaycast(@NativeType("void *") long obj, @NativeType("void *") long callback, @NativeType("btVector3 const *") ΒΤVector3 raySource, @NativeType("btVector3 const *") ΒΤVector3 rayTarget) {
        nbtHeightfieldTerrainShape_performRaycast(obj, callback, raySource.address(), rayTarget.address());
    }

    // --- [ btHeightfieldTerrainShape_buildAccelerator ] ---

    public static void btHeightfieldTerrainShape_buildAccelerator(@NativeType("void *") long obj, int chunkSize) {
        long __functionAddress = Functions.HeightfieldTerrainShape_buildAccelerator;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, chunkSize, __functionAddress);
    }

    // --- [ btHeightfieldTerrainShape_clearAccelerator ] ---

    public static void btHeightfieldTerrainShape_clearAccelerator(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HeightfieldTerrainShape_clearAccelerator;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btHeightfieldTerrainShape_getUpAxis ] ---

    public static int btHeightfieldTerrainShape_getUpAxis(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HeightfieldTerrainShape_getUpAxis;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btHeightfieldTerrainShape_setFlipTriangleWinding ] ---

    public static void btHeightfieldTerrainShape_setFlipTriangleWinding(@NativeType("void *") long obj, @NativeType("bool") boolean flipTriangleWinding) {
        long __functionAddress = Functions.HeightfieldTerrainShape_setFlipTriangleWinding;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, flipTriangleWinding, __functionAddress);
    }

    // --- [ btHeightfieldTerrainShape_setUseDiamondSubdivision ] ---

    public static void btHeightfieldTerrainShape_setUseDiamondSubdivision(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HeightfieldTerrainShape_setUseDiamondSubdivision;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btHeightfieldTerrainShape_setUseDiamondSubdivision2 ] ---

    public static void btHeightfieldTerrainShape_setUseDiamondSubdivision2(@NativeType("void *") long obj, @NativeType("bool") boolean useDiamondSubdivision) {
        long __functionAddress = Functions.HeightfieldTerrainShape_setUseDiamondSubdivision2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, useDiamondSubdivision, __functionAddress);
    }

    // --- [ btHeightfieldTerrainShape_setUseZigzagSubdivision ] ---

    public static void btHeightfieldTerrainShape_setUseZigzagSubdivision(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HeightfieldTerrainShape_setUseZigzagSubdivision;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btHeightfieldTerrainShape_setUseZigzagSubdivision2 ] ---

    public static void btHeightfieldTerrainShape_setUseZigzagSubdivision2(@NativeType("void *") long obj, @NativeType("bool") boolean useZigzagSubdivision) {
        long __functionAddress = Functions.HeightfieldTerrainShape_setUseZigzagSubdivision2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, useZigzagSubdivision, __functionAddress);
    }

}