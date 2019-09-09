/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTConvexHullShape {

    protected BTConvexHullShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ConvexHullShape_new                = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexHullShape_new"),
            ConvexHullShape_new2               = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexHullShape_new2"),
            ConvexHullShape_new3               = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexHullShape_new3"),
            ConvexHullShape_new4               = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexHullShape_new4"),
            ConvexHullShape_addPoint           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexHullShape_addPoint"),
            ConvexHullShape_getNumPoints       = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexHullShape_getNumPoints"),
            ConvexHullShape_getScaledPoint     = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexHullShape_getScaledPoint"),
            ConvexHullShape_getUnscaledPoints  = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexHullShape_getUnscaledPoints"),
            ConvexHullShape_optimizeConvexHull = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexHullShape_optimizeConvexHull");

    }

    // --- [ btConvexHullShape_new ] ---

    @NativeType("void *")
    public static long btConvexHullShape_new() {
        long __functionAddress = Functions.ConvexHullShape_new;
        return invokeP(__functionAddress);
    }

    // --- [ btConvexHullShape_new2 ] ---

    public static long nbtConvexHullShape_new2(long points) {
        long __functionAddress = Functions.ConvexHullShape_new2;
        return invokePP(points, __functionAddress);
    }

    @NativeType("void *")
    public static long btConvexHullShape_new2(@NativeType("btScalar const *") FloatBuffer points) {
        return nbtConvexHullShape_new2(memAddress(points));
    }

    // --- [ btConvexHullShape_new3 ] ---

    public static long nbtConvexHullShape_new3(long points, int numPoints) {
        long __functionAddress = Functions.ConvexHullShape_new3;
        return invokePP(points, numPoints, __functionAddress);
    }

    @NativeType("void *")
    public static long btConvexHullShape_new3(@NativeType("btScalar const *") FloatBuffer points) {
        return nbtConvexHullShape_new3(memAddress(points), points.remaining() >> 2);
    }

    // --- [ btConvexHullShape_new4 ] ---

    public static long nbtConvexHullShape_new4(long points, int numPoints, int stride) {
        long __functionAddress = Functions.ConvexHullShape_new4;
        return invokePP(points, numPoints, stride, __functionAddress);
    }

    @NativeType("void *")
    public static long btConvexHullShape_new4(@NativeType("btScalar const *") FloatBuffer points, int numPoints, int stride) {
        return nbtConvexHullShape_new4(memAddress(points), numPoints, stride);
    }

    // --- [ btConvexHullShape_addPoint ] ---

    public static void nbtConvexHullShape_addPoint(long obj, long point, boolean recalculateLocalAabb) {
        long __functionAddress = Functions.ConvexHullShape_addPoint;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, point, recalculateLocalAabb, __functionAddress);
    }

    public static void btConvexHullShape_addPoint(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 point, @NativeType("bool") boolean recalculateLocalAabb) {
        nbtConvexHullShape_addPoint(obj, point.address(), recalculateLocalAabb);
    }

    // --- [ btConvexHullShape_getNumPoints ] ---

    public static int btConvexHullShape_getNumPoints(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexHullShape_getNumPoints;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btConvexHullShape_getScaledPoint ] ---

    public static void nbtConvexHullShape_getScaledPoint(long obj, int i, long value) {
        long __functionAddress = Functions.ConvexHullShape_getScaledPoint;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, i, value, __functionAddress);
    }

    public static void btConvexHullShape_getScaledPoint(@NativeType("void *") long obj, int i, @NativeType("btVector3 *") BTVector3 value) {
        nbtConvexHullShape_getScaledPoint(obj, i, value.address());
    }

    // --- [ btConvexHullShape_getUnscaledPoints ] ---

    public static long nbtConvexHullShape_getUnscaledPoints(long obj) {
        long __functionAddress = Functions.ConvexHullShape_getUnscaledPoints;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 *")
    public static BTVector3 btConvexHullShape_getUnscaledPoints(@NativeType("void *") long obj) {
        long __result = nbtConvexHullShape_getUnscaledPoints(obj);
        return BTVector3.createSafe(__result);
    }

    // --- [ btConvexHullShape_optimizeConvexHull ] ---

    public static void btConvexHullShape_optimizeConvexHull(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexHullShape_optimizeConvexHull;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}