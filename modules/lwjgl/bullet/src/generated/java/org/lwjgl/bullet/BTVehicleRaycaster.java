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

public class BTVehicleRaycaster {

    protected BTVehicleRaycaster() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            VehicleRaycaster_btVehicleRaycasterResult_new                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btVehicleRaycaster_btVehicleRaycasterResult_new"),
            VehicleRaycaster_btVehicleRaycasterResult_getDistFraction     = apiGetFunctionAddress(LibBullet.getLibrary(), "btVehicleRaycaster_btVehicleRaycasterResult_getDistFraction"),
            VehicleRaycaster_btVehicleRaycasterResult_getHitNormalInWorld = apiGetFunctionAddress(LibBullet.getLibrary(), "btVehicleRaycaster_btVehicleRaycasterResult_getHitNormalInWorld"),
            VehicleRaycaster_btVehicleRaycasterResult_getHitPointInWorld  = apiGetFunctionAddress(LibBullet.getLibrary(), "btVehicleRaycaster_btVehicleRaycasterResult_getHitPointInWorld"),
            VehicleRaycaster_btVehicleRaycasterResult_setDistFraction     = apiGetFunctionAddress(LibBullet.getLibrary(), "btVehicleRaycaster_btVehicleRaycasterResult_setDistFraction"),
            VehicleRaycaster_btVehicleRaycasterResult_setHitNormalInWorld = apiGetFunctionAddress(LibBullet.getLibrary(), "btVehicleRaycaster_btVehicleRaycasterResult_setHitNormalInWorld"),
            VehicleRaycaster_btVehicleRaycasterResult_setHitPointInWorld  = apiGetFunctionAddress(LibBullet.getLibrary(), "btVehicleRaycaster_btVehicleRaycasterResult_setHitPointInWorld"),
            VehicleRaycaster_btVehicleRaycasterResult_delete              = apiGetFunctionAddress(LibBullet.getLibrary(), "btVehicleRaycaster_btVehicleRaycasterResult_delete"),
            VehicleRaycaster_castRay                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btVehicleRaycaster_castRay"),
            VehicleRaycaster_delete                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btVehicleRaycaster_delete");

    }

    // --- [ btVehicleRaycaster_btVehicleRaycasterResult_new ] ---

    @NativeType("void *")
    public static long btVehicleRaycaster_btVehicleRaycasterResult_new() {
        long __functionAddress = Functions.VehicleRaycaster_btVehicleRaycasterResult_new;
        return invokeP(__functionAddress);
    }

    // --- [ btVehicleRaycaster_btVehicleRaycasterResult_getDistFraction ] ---

    @NativeType("btScalar")
    public static float btVehicleRaycaster_btVehicleRaycasterResult_getDistFraction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.VehicleRaycaster_btVehicleRaycasterResult_getDistFraction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btVehicleRaycaster_btVehicleRaycasterResult_getHitNormalInWorld ] ---

    public static void nbtVehicleRaycaster_btVehicleRaycasterResult_getHitNormalInWorld(long obj, long value) {
        long __functionAddress = Functions.VehicleRaycaster_btVehicleRaycasterResult_getHitNormalInWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btVehicleRaycaster_btVehicleRaycasterResult_getHitNormalInWorld(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtVehicleRaycaster_btVehicleRaycasterResult_getHitNormalInWorld(obj, value.address());
    }

    // --- [ btVehicleRaycaster_btVehicleRaycasterResult_getHitPointInWorld ] ---

    public static void nbtVehicleRaycaster_btVehicleRaycasterResult_getHitPointInWorld(long obj, long value) {
        long __functionAddress = Functions.VehicleRaycaster_btVehicleRaycasterResult_getHitPointInWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btVehicleRaycaster_btVehicleRaycasterResult_getHitPointInWorld(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtVehicleRaycaster_btVehicleRaycasterResult_getHitPointInWorld(obj, value.address());
    }

    // --- [ btVehicleRaycaster_btVehicleRaycasterResult_setDistFraction ] ---

    public static void btVehicleRaycaster_btVehicleRaycasterResult_setDistFraction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.VehicleRaycaster_btVehicleRaycasterResult_setDistFraction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btVehicleRaycaster_btVehicleRaycasterResult_setHitNormalInWorld ] ---

    public static void nbtVehicleRaycaster_btVehicleRaycasterResult_setHitNormalInWorld(long obj, long value) {
        long __functionAddress = Functions.VehicleRaycaster_btVehicleRaycasterResult_setHitNormalInWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btVehicleRaycaster_btVehicleRaycasterResult_setHitNormalInWorld(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtVehicleRaycaster_btVehicleRaycasterResult_setHitNormalInWorld(obj, value.address());
    }

    // --- [ btVehicleRaycaster_btVehicleRaycasterResult_setHitPointInWorld ] ---

    public static void nbtVehicleRaycaster_btVehicleRaycasterResult_setHitPointInWorld(long obj, long value) {
        long __functionAddress = Functions.VehicleRaycaster_btVehicleRaycasterResult_setHitPointInWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btVehicleRaycaster_btVehicleRaycasterResult_setHitPointInWorld(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtVehicleRaycaster_btVehicleRaycasterResult_setHitPointInWorld(obj, value.address());
    }

    // --- [ btVehicleRaycaster_btVehicleRaycasterResult_delete ] ---

    public static void btVehicleRaycaster_btVehicleRaycasterResult_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.VehicleRaycaster_btVehicleRaycasterResult_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btVehicleRaycaster_castRay ] ---

    public static long nbtVehicleRaycaster_castRay(long obj, long from, long to, long result) {
        long __functionAddress = Functions.VehicleRaycaster_castRay;
        if (CHECKS) {
            check(obj);
            check(result);
        }
        return invokePPPPP(obj, from, to, result, __functionAddress);
    }

    @NativeType("void *")
    public static long btVehicleRaycaster_castRay(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 from, @NativeType("btVector3 const *") ΒΤVector3 to, @NativeType("void *") long result) {
        return nbtVehicleRaycaster_castRay(obj, from.address(), to.address(), result);
    }

    // --- [ btVehicleRaycaster_delete ] ---

    public static void btVehicleRaycaster_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.VehicleRaycaster_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}