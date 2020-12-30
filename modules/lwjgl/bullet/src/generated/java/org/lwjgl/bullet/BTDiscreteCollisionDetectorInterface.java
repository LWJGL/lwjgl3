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

public class BTDiscreteCollisionDetectorInterface {

    protected BTDiscreteCollisionDetectorInterface() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            DiscreteCollisionDetectorInterface_ClosestPointInput_new                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteCollisionDetectorInterface_ClosestPointInput_new"),
            DiscreteCollisionDetectorInterface_ClosestPointInput_getMaximumDistanceSquared = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteCollisionDetectorInterface_ClosestPointInput_getMaximumDistanceSquared"),
            DiscreteCollisionDetectorInterface_ClosestPointInput_getTransformA             = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteCollisionDetectorInterface_ClosestPointInput_getTransformA"),
            DiscreteCollisionDetectorInterface_ClosestPointInput_getTransformB             = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteCollisionDetectorInterface_ClosestPointInput_getTransformB"),
            DiscreteCollisionDetectorInterface_ClosestPointInput_setMaximumDistanceSquared = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteCollisionDetectorInterface_ClosestPointInput_setMaximumDistanceSquared"),
            DiscreteCollisionDetectorInterface_ClosestPointInput_setTransformA             = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteCollisionDetectorInterface_ClosestPointInput_setTransformA"),
            DiscreteCollisionDetectorInterface_ClosestPointInput_setTransformB             = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteCollisionDetectorInterface_ClosestPointInput_setTransformB"),
            DiscreteCollisionDetectorInterface_ClosestPointInput_delete                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteCollisionDetectorInterface_ClosestPointInput_delete"),
            DiscreteCollisionDetectorInterface_Result_addContactPoint                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteCollisionDetectorInterface_Result_addContactPoint"),
            DiscreteCollisionDetectorInterface_Result_setShapeIdentifiersA                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteCollisionDetectorInterface_Result_setShapeIdentifiersA"),
            DiscreteCollisionDetectorInterface_Result_setShapeIdentifiersB                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteCollisionDetectorInterface_Result_setShapeIdentifiersB"),
            DiscreteCollisionDetectorInterface_Result_delete                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteCollisionDetectorInterface_Result_delete"),
            DiscreteCollisionDetectorInterface_getClosestPoints                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteCollisionDetectorInterface_getClosestPoints"),
            DiscreteCollisionDetectorInterface_delete                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteCollisionDetectorInterface_delete"),
            StorageResult_getClosestPointInB                                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btStorageResult_getClosestPointInB"),
            StorageResult_getDistance                                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btStorageResult_getDistance"),
            StorageResult_getNormalOnSurfaceB                                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btStorageResult_getNormalOnSurfaceB"),
            StorageResult_setClosestPointInB                                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btStorageResult_setClosestPointInB"),
            StorageResult_setDistance                                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btStorageResult_setDistance"),
            StorageResult_setNormalOnSurfaceB                                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btStorageResult_setNormalOnSurfaceB");

    }

    // --- [ btDiscreteCollisionDetectorInterface_ClosestPointInput_new ] ---

    @NativeType("void *")
    public static long btDiscreteCollisionDetectorInterface_ClosestPointInput_new() {
        long __functionAddress = Functions.DiscreteCollisionDetectorInterface_ClosestPointInput_new;
        return invokeP(__functionAddress);
    }

    // --- [ btDiscreteCollisionDetectorInterface_ClosestPointInput_getMaximumDistanceSquared ] ---

    @NativeType("btScalar")
    public static float btDiscreteCollisionDetectorInterface_ClosestPointInput_getMaximumDistanceSquared(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DiscreteCollisionDetectorInterface_ClosestPointInput_getMaximumDistanceSquared;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btDiscreteCollisionDetectorInterface_ClosestPointInput_getTransformA ] ---

    public static void nbtDiscreteCollisionDetectorInterface_ClosestPointInput_getTransformA(long obj, long value) {
        long __functionAddress = Functions.DiscreteCollisionDetectorInterface_ClosestPointInput_getTransformA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDiscreteCollisionDetectorInterface_ClosestPointInput_getTransformA(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtDiscreteCollisionDetectorInterface_ClosestPointInput_getTransformA(obj, value.address());
    }

    // --- [ btDiscreteCollisionDetectorInterface_ClosestPointInput_getTransformB ] ---

    public static void nbtDiscreteCollisionDetectorInterface_ClosestPointInput_getTransformB(long obj, long value) {
        long __functionAddress = Functions.DiscreteCollisionDetectorInterface_ClosestPointInput_getTransformB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDiscreteCollisionDetectorInterface_ClosestPointInput_getTransformB(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtDiscreteCollisionDetectorInterface_ClosestPointInput_getTransformB(obj, value.address());
    }

    // --- [ btDiscreteCollisionDetectorInterface_ClosestPointInput_setMaximumDistanceSquared ] ---

    public static void btDiscreteCollisionDetectorInterface_ClosestPointInput_setMaximumDistanceSquared(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.DiscreteCollisionDetectorInterface_ClosestPointInput_setMaximumDistanceSquared;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDiscreteCollisionDetectorInterface_ClosestPointInput_setTransformA ] ---

    public static void nbtDiscreteCollisionDetectorInterface_ClosestPointInput_setTransformA(long obj, long value) {
        long __functionAddress = Functions.DiscreteCollisionDetectorInterface_ClosestPointInput_setTransformA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDiscreteCollisionDetectorInterface_ClosestPointInput_setTransformA(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform value) {
        nbtDiscreteCollisionDetectorInterface_ClosestPointInput_setTransformA(obj, value.address());
    }

    // --- [ btDiscreteCollisionDetectorInterface_ClosestPointInput_setTransformB ] ---

    public static void nbtDiscreteCollisionDetectorInterface_ClosestPointInput_setTransformB(long obj, long value) {
        long __functionAddress = Functions.DiscreteCollisionDetectorInterface_ClosestPointInput_setTransformB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDiscreteCollisionDetectorInterface_ClosestPointInput_setTransformB(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform value) {
        nbtDiscreteCollisionDetectorInterface_ClosestPointInput_setTransformB(obj, value.address());
    }

    // --- [ btDiscreteCollisionDetectorInterface_ClosestPointInput_delete ] ---

    public static void btDiscreteCollisionDetectorInterface_ClosestPointInput_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DiscreteCollisionDetectorInterface_ClosestPointInput_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDiscreteCollisionDetectorInterface_Result_addContactPoint ] ---

    public static void nbtDiscreteCollisionDetectorInterface_Result_addContactPoint(long obj, long normalOnBInWorld, long pointInWorld, float depth) {
        long __functionAddress = Functions.DiscreteCollisionDetectorInterface_Result_addContactPoint;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, normalOnBInWorld, pointInWorld, depth, __functionAddress);
    }

    public static void btDiscreteCollisionDetectorInterface_Result_addContactPoint(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 normalOnBInWorld, @NativeType("btVector3 const *") BTVector3 pointInWorld, @NativeType("btScalar") float depth) {
        nbtDiscreteCollisionDetectorInterface_Result_addContactPoint(obj, normalOnBInWorld.address(), pointInWorld.address(), depth);
    }

    // --- [ btDiscreteCollisionDetectorInterface_Result_setShapeIdentifiersA ] ---

    public static void btDiscreteCollisionDetectorInterface_Result_setShapeIdentifiersA(@NativeType("void *") long obj, int partId0, int index0) {
        long __functionAddress = Functions.DiscreteCollisionDetectorInterface_Result_setShapeIdentifiersA;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, partId0, index0, __functionAddress);
    }

    // --- [ btDiscreteCollisionDetectorInterface_Result_setShapeIdentifiersB ] ---

    public static void btDiscreteCollisionDetectorInterface_Result_setShapeIdentifiersB(@NativeType("void *") long obj, int partId1, int index1) {
        long __functionAddress = Functions.DiscreteCollisionDetectorInterface_Result_setShapeIdentifiersB;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, partId1, index1, __functionAddress);
    }

    // --- [ btDiscreteCollisionDetectorInterface_Result_delete ] ---

    public static void btDiscreteCollisionDetectorInterface_Result_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DiscreteCollisionDetectorInterface_Result_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDiscreteCollisionDetectorInterface_getClosestPoints ] ---

    public static void btDiscreteCollisionDetectorInterface_getClosestPoints(@NativeType("void *") long obj, @NativeType("void *") long input, @NativeType("void *") long output, @NativeType("void *") long debugDraw, @NativeType("bool") boolean swapResults) {
        long __functionAddress = Functions.DiscreteCollisionDetectorInterface_getClosestPoints;
        if (CHECKS) {
            check(obj);
            check(input);
            check(output);
            check(debugDraw);
        }
        invokePPPPV(obj, input, output, debugDraw, swapResults, __functionAddress);
    }

    // --- [ btDiscreteCollisionDetectorInterface_delete ] ---

    public static void btDiscreteCollisionDetectorInterface_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DiscreteCollisionDetectorInterface_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btStorageResult_getClosestPointInB ] ---

    public static void nbtStorageResult_getClosestPointInB(long obj, long value) {
        long __functionAddress = Functions.StorageResult_getClosestPointInB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btStorageResult_getClosestPointInB(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtStorageResult_getClosestPointInB(obj, value.address());
    }

    // --- [ btStorageResult_getDistance ] ---

    @NativeType("btScalar")
    public static float btStorageResult_getDistance(@NativeType("void *") long obj) {
        long __functionAddress = Functions.StorageResult_getDistance;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btStorageResult_getNormalOnSurfaceB ] ---

    public static void nbtStorageResult_getNormalOnSurfaceB(long obj, long value) {
        long __functionAddress = Functions.StorageResult_getNormalOnSurfaceB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btStorageResult_getNormalOnSurfaceB(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtStorageResult_getNormalOnSurfaceB(obj, value.address());
    }

    // --- [ btStorageResult_setClosestPointInB ] ---

    public static void nbtStorageResult_setClosestPointInB(long obj, long value) {
        long __functionAddress = Functions.StorageResult_setClosestPointInB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btStorageResult_setClosestPointInB(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtStorageResult_setClosestPointInB(obj, value.address());
    }

    // --- [ btStorageResult_setDistance ] ---

    public static void btStorageResult_setDistance(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.StorageResult_setDistance;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btStorageResult_setNormalOnSurfaceB ] ---

    public static void nbtStorageResult_setNormalOnSurfaceB(long obj, long value) {
        long __functionAddress = Functions.StorageResult_setNormalOnSurfaceB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btStorageResult_setNormalOnSurfaceB(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtStorageResult_setNormalOnSurfaceB(obj, value.address());
    }

}