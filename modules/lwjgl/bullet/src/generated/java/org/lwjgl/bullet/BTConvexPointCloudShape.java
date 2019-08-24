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

public class BTConvexPointCloudShape {

    protected BTConvexPointCloudShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ConvexPointCloudShape_new               = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPointCloudShape_new"),
            ConvexPointCloudShape_new2              = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPointCloudShape_new2"),
            ConvexPointCloudShape_getNumPoints      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPointCloudShape_getNumPoints"),
            ConvexPointCloudShape_getScaledPoint    = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPointCloudShape_getScaledPoint"),
            ConvexPointCloudShape_getUnscaledPoints = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPointCloudShape_getUnscaledPoints"),
            ConvexPointCloudShape_setPoints         = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPointCloudShape_setPoints"),
            ConvexPointCloudShape_setPoints2        = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPointCloudShape_setPoints2");

    }

    // --- [ btConvexPointCloudShape_new ] ---

    @NativeType("void *")
    public static long btConvexPointCloudShape_new() {
        long __functionAddress = Functions.ConvexPointCloudShape_new;
        return invokeP(__functionAddress);
    }

    // --- [ btConvexPointCloudShape_new2 ] ---

    public static long nbtConvexPointCloudShape_new2(long points, int numPoints, long localScaling, boolean computeAabb) {
        long __functionAddress = Functions.ConvexPointCloudShape_new2;
        return invokePPP(points, numPoints, localScaling, computeAabb, __functionAddress);
    }

    @NativeType("void *")
    public static long btConvexPointCloudShape_new2(@NativeType("btVector3 *") ΒΤVector3 points, int numPoints, @NativeType("btVector3 const *") ΒΤVector3 localScaling, @NativeType("bool") boolean computeAabb) {
        return nbtConvexPointCloudShape_new2(points.address(), numPoints, localScaling.address(), computeAabb);
    }

    // --- [ btConvexPointCloudShape_getNumPoints ] ---

    public static int btConvexPointCloudShape_getNumPoints(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexPointCloudShape_getNumPoints;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btConvexPointCloudShape_getScaledPoint ] ---

    public static void nbtConvexPointCloudShape_getScaledPoint(long obj, int index, long value) {
        long __functionAddress = Functions.ConvexPointCloudShape_getScaledPoint;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, index, value, __functionAddress);
    }

    public static void btConvexPointCloudShape_getScaledPoint(@NativeType("void *") long obj, int index, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtConvexPointCloudShape_getScaledPoint(obj, index, value.address());
    }

    // --- [ btConvexPointCloudShape_getUnscaledPoints ] ---

    public static long nbtConvexPointCloudShape_getUnscaledPoints(long obj) {
        long __functionAddress = Functions.ConvexPointCloudShape_getUnscaledPoints;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 *")
    public static ΒΤVector3 btConvexPointCloudShape_getUnscaledPoints(@NativeType("void *") long obj) {
        long __result = nbtConvexPointCloudShape_getUnscaledPoints(obj);
        return ΒΤVector3.createSafe(__result);
    }

    // --- [ btConvexPointCloudShape_setPoints ] ---

    public static void nbtConvexPointCloudShape_setPoints(long obj, long points, int numPoints, boolean computeAabb) {
        long __functionAddress = Functions.ConvexPointCloudShape_setPoints;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, points, numPoints, computeAabb, __functionAddress);
    }

    public static void btConvexPointCloudShape_setPoints(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 points, int numPoints, @NativeType("bool") boolean computeAabb) {
        nbtConvexPointCloudShape_setPoints(obj, points.address(), numPoints, computeAabb);
    }

    // --- [ btConvexPointCloudShape_setPoints2 ] ---

    public static void nbtConvexPointCloudShape_setPoints2(long obj, long points, int numPoints, boolean computeAabb, long localScaling) {
        long __functionAddress = Functions.ConvexPointCloudShape_setPoints2;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, points, numPoints, computeAabb, localScaling, __functionAddress);
    }

    public static void btConvexPointCloudShape_setPoints2(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 points, int numPoints, @NativeType("bool") boolean computeAabb, @NativeType("btVector3 const *") ΒΤVector3 localScaling) {
        nbtConvexPointCloudShape_setPoints2(obj, points.address(), numPoints, computeAabb, localScaling.address());
    }

}