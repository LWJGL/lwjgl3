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

public class BTPointCollector {

    protected BTPointCollector() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            PointCollector_new                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btPointCollector_new"),
            PointCollector_getDistance         = apiGetFunctionAddress(LibBullet.getLibrary(), "btPointCollector_getDistance"),
            PointCollector_getHasResult        = apiGetFunctionAddress(LibBullet.getLibrary(), "btPointCollector_getHasResult"),
            PointCollector_getNormalOnBInWorld = apiGetFunctionAddress(LibBullet.getLibrary(), "btPointCollector_getNormalOnBInWorld"),
            PointCollector_getPointInWorld     = apiGetFunctionAddress(LibBullet.getLibrary(), "btPointCollector_getPointInWorld"),
            PointCollector_setDistance         = apiGetFunctionAddress(LibBullet.getLibrary(), "btPointCollector_setDistance"),
            PointCollector_setHasResult        = apiGetFunctionAddress(LibBullet.getLibrary(), "btPointCollector_setHasResult"),
            PointCollector_setNormalOnBInWorld = apiGetFunctionAddress(LibBullet.getLibrary(), "btPointCollector_setNormalOnBInWorld"),
            PointCollector_setPointInWorld     = apiGetFunctionAddress(LibBullet.getLibrary(), "btPointCollector_setPointInWorld");

    }

    // --- [ btPointCollector_new ] ---

    @NativeType("void *")
    public static long btPointCollector_new() {
        long __functionAddress = Functions.PointCollector_new;
        return invokeP(__functionAddress);
    }

    // --- [ btPointCollector_getDistance ] ---

    @NativeType("btScalar")
    public static float btPointCollector_getDistance(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PointCollector_getDistance;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btPointCollector_getHasResult ] ---

    @NativeType("bool")
    public static boolean btPointCollector_getHasResult(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PointCollector_getHasResult;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btPointCollector_getNormalOnBInWorld ] ---

    public static void nbtPointCollector_getNormalOnBInWorld(long obj, long value) {
        long __functionAddress = Functions.PointCollector_getNormalOnBInWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btPointCollector_getNormalOnBInWorld(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtPointCollector_getNormalOnBInWorld(obj, value.address());
    }

    // --- [ btPointCollector_getPointInWorld ] ---

    public static void nbtPointCollector_getPointInWorld(long obj, long value) {
        long __functionAddress = Functions.PointCollector_getPointInWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btPointCollector_getPointInWorld(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtPointCollector_getPointInWorld(obj, value.address());
    }

    // --- [ btPointCollector_setDistance ] ---

    public static void btPointCollector_setDistance(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.PointCollector_setDistance;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btPointCollector_setHasResult ] ---

    public static void btPointCollector_setHasResult(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.PointCollector_setHasResult;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btPointCollector_setNormalOnBInWorld ] ---

    public static void nbtPointCollector_setNormalOnBInWorld(long obj, long value) {
        long __functionAddress = Functions.PointCollector_setNormalOnBInWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btPointCollector_setNormalOnBInWorld(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtPointCollector_setNormalOnBInWorld(obj, value.address());
    }

    // --- [ btPointCollector_setPointInWorld ] ---

    public static void nbtPointCollector_setPointInWorld(long obj, long value) {
        long __functionAddress = Functions.PointCollector_setPointInWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btPointCollector_setPointInWorld(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtPointCollector_setPointInWorld(obj, value.address());
    }

}