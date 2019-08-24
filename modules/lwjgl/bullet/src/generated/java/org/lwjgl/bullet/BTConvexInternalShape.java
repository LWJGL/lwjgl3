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

public class BTConvexInternalShape {

    protected BTConvexInternalShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ConvexInternalShape_getImplicitShapeDimensions = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexInternalShape_getImplicitShapeDimensions"),
            ConvexInternalShape_getLocalScalingNV          = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexInternalShape_getLocalScalingNV"),
            ConvexInternalShape_getMarginNV                = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexInternalShape_getMarginNV"),
            ConvexInternalShape_setImplicitShapeDimensions = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexInternalShape_setImplicitShapeDimensions"),
            ConvexInternalShape_setSafeMargin              = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexInternalShape_setSafeMargin"),
            ConvexInternalShape_setSafeMargin2             = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexInternalShape_setSafeMargin2"),
            ConvexInternalAabbCachingShape_recalcLocalAabb = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexInternalAabbCachingShape_recalcLocalAabb");

    }

    // --- [ btConvexInternalShape_getImplicitShapeDimensions ] ---

    public static void nbtConvexInternalShape_getImplicitShapeDimensions(long obj, long value) {
        long __functionAddress = Functions.ConvexInternalShape_getImplicitShapeDimensions;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexInternalShape_getImplicitShapeDimensions(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtConvexInternalShape_getImplicitShapeDimensions(obj, value.address());
    }

    // --- [ btConvexInternalShape_getLocalScalingNV ] ---

    public static void nbtConvexInternalShape_getLocalScalingNV(long obj, long value) {
        long __functionAddress = Functions.ConvexInternalShape_getLocalScalingNV;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexInternalShape_getLocalScalingNV(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtConvexInternalShape_getLocalScalingNV(obj, value.address());
    }

    // --- [ btConvexInternalShape_getMarginNV ] ---

    @NativeType("btScalar")
    public static float btConvexInternalShape_getMarginNV(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexInternalShape_getMarginNV;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConvexInternalShape_setImplicitShapeDimensions ] ---

    public static void nbtConvexInternalShape_setImplicitShapeDimensions(long obj, long dimensions) {
        long __functionAddress = Functions.ConvexInternalShape_setImplicitShapeDimensions;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, dimensions, __functionAddress);
    }

    public static void btConvexInternalShape_setImplicitShapeDimensions(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 dimensions) {
        nbtConvexInternalShape_setImplicitShapeDimensions(obj, dimensions.address());
    }

    // --- [ btConvexInternalShape_setSafeMargin ] ---

    public static void btConvexInternalShape_setSafeMargin(@NativeType("void *") long obj, @NativeType("btScalar") float minDimension, @NativeType("btScalar") float defaultMarginMultiplier) {
        long __functionAddress = Functions.ConvexInternalShape_setSafeMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, minDimension, defaultMarginMultiplier, __functionAddress);
    }

    // --- [ btConvexInternalShape_setSafeMargin2 ] ---

    public static void nbtConvexInternalShape_setSafeMargin2(long obj, long halfExtents, float defaultMarginMultiplier) {
        long __functionAddress = Functions.ConvexInternalShape_setSafeMargin2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, halfExtents, defaultMarginMultiplier, __functionAddress);
    }

    public static void btConvexInternalShape_setSafeMargin2(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 halfExtents, @NativeType("btScalar") float defaultMarginMultiplier) {
        nbtConvexInternalShape_setSafeMargin2(obj, halfExtents.address(), defaultMarginMultiplier);
    }

    // --- [ btConvexInternalAabbCachingShape_recalcLocalAabb ] ---

    public static void btConvexInternalAabbCachingShape_recalcLocalAabb(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexInternalAabbCachingShape_recalcLocalAabb;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}