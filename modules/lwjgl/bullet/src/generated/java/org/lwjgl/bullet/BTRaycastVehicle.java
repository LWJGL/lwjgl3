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

public class BTRaycastVehicle {

    protected BTRaycastVehicle() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            RaycastVehicle_btVehicleTuning_new                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_btVehicleTuning_new"),
            RaycastVehicle_btVehicleTuning_getFrictionSlip          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_btVehicleTuning_getFrictionSlip"),
            RaycastVehicle_btVehicleTuning_getMaxSuspensionForce    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_btVehicleTuning_getMaxSuspensionForce"),
            RaycastVehicle_btVehicleTuning_getMaxSuspensionTravelCm = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_btVehicleTuning_getMaxSuspensionTravelCm"),
            RaycastVehicle_btVehicleTuning_getSuspensionCompression = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_btVehicleTuning_getSuspensionCompression"),
            RaycastVehicle_btVehicleTuning_getSuspensionDamping     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_btVehicleTuning_getSuspensionDamping"),
            RaycastVehicle_btVehicleTuning_getSuspensionStiffness   = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_btVehicleTuning_getSuspensionStiffness"),
            RaycastVehicle_btVehicleTuning_setFrictionSlip          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_btVehicleTuning_setFrictionSlip"),
            RaycastVehicle_btVehicleTuning_setMaxSuspensionForce    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_btVehicleTuning_setMaxSuspensionForce"),
            RaycastVehicle_btVehicleTuning_setMaxSuspensionTravelCm = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_btVehicleTuning_setMaxSuspensionTravelCm"),
            RaycastVehicle_btVehicleTuning_setSuspensionCompression = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_btVehicleTuning_setSuspensionCompression"),
            RaycastVehicle_btVehicleTuning_setSuspensionDamping     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_btVehicleTuning_setSuspensionDamping"),
            RaycastVehicle_btVehicleTuning_setSuspensionStiffness   = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_btVehicleTuning_setSuspensionStiffness"),
            RaycastVehicle_btVehicleTuning_delete                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_btVehicleTuning_delete"),
            RaycastVehicle_new                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_new"),
            RaycastVehicle_addWheel                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_addWheel"),
            RaycastVehicle_applyEngineForce                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_applyEngineForce"),
            RaycastVehicle_getChassisWorldTransform                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_getChassisWorldTransform"),
            RaycastVehicle_getCurrentSpeedKmHour                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_getCurrentSpeedKmHour"),
            RaycastVehicle_getForwardAxis                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_getForwardAxis"),
            RaycastVehicle_getForwardVector                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_getForwardVector"),
            RaycastVehicle_getNumWheels                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_getNumWheels"),
            RaycastVehicle_getRightAxis                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_getRightAxis"),
            RaycastVehicle_getRigidBody                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_getRigidBody"),
            RaycastVehicle_getSteeringValue                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_getSteeringValue"),
            RaycastVehicle_getUpAxis                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_getUpAxis"),
            RaycastVehicle_getUserConstraintId                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_getUserConstraintId"),
            RaycastVehicle_getUserConstraintType                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_getUserConstraintType"),
            RaycastVehicle_getWheelInfo                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_getWheelInfo"),
            RaycastVehicle_getWheelInfo2                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_getWheelInfo2"),
            RaycastVehicle_getWheelTransformWS                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_getWheelTransformWS"),
            RaycastVehicle_rayCast                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_rayCast"),
            RaycastVehicle_resetSuspension                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_resetSuspension"),
            RaycastVehicle_setBrake                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_setBrake"),
            RaycastVehicle_setCoordinateSystem                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_setCoordinateSystem"),
            RaycastVehicle_setPitchControl                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_setPitchControl"),
            RaycastVehicle_setSteeringValue                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_setSteeringValue"),
            RaycastVehicle_setUserConstraintId                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_setUserConstraintId"),
            RaycastVehicle_setUserConstraintType                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_setUserConstraintType"),
            RaycastVehicle_updateFriction                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_updateFriction"),
            RaycastVehicle_updateSuspension                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_updateSuspension"),
            RaycastVehicle_updateVehicle                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_updateVehicle"),
            RaycastVehicle_updateWheelTransform                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_updateWheelTransform"),
            RaycastVehicle_updateWheelTransform2                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_updateWheelTransform2"),
            RaycastVehicle_updateWheelTransformsWS                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_updateWheelTransformsWS"),
            RaycastVehicle_updateWheelTransformsWS2                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRaycastVehicle_updateWheelTransformsWS2"),
            DefaultVehicleRaycaster_new                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultVehicleRaycaster_new");

    }

    // --- [ btRaycastVehicle_btVehicleTuning_new ] ---

    @NativeType("void *")
    public static long btRaycastVehicle_btVehicleTuning_new() {
        long __functionAddress = Functions.RaycastVehicle_btVehicleTuning_new;
        return invokeP(__functionAddress);
    }

    // --- [ btRaycastVehicle_btVehicleTuning_getFrictionSlip ] ---

    @NativeType("btScalar")
    public static float btRaycastVehicle_btVehicleTuning_getFrictionSlip(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_btVehicleTuning_getFrictionSlip;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_btVehicleTuning_getMaxSuspensionForce ] ---

    @NativeType("btScalar")
    public static float btRaycastVehicle_btVehicleTuning_getMaxSuspensionForce(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_btVehicleTuning_getMaxSuspensionForce;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_btVehicleTuning_getMaxSuspensionTravelCm ] ---

    @NativeType("btScalar")
    public static float btRaycastVehicle_btVehicleTuning_getMaxSuspensionTravelCm(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_btVehicleTuning_getMaxSuspensionTravelCm;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_btVehicleTuning_getSuspensionCompression ] ---

    @NativeType("btScalar")
    public static float btRaycastVehicle_btVehicleTuning_getSuspensionCompression(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_btVehicleTuning_getSuspensionCompression;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_btVehicleTuning_getSuspensionDamping ] ---

    @NativeType("btScalar")
    public static float btRaycastVehicle_btVehicleTuning_getSuspensionDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_btVehicleTuning_getSuspensionDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_btVehicleTuning_getSuspensionStiffness ] ---

    @NativeType("btScalar")
    public static float btRaycastVehicle_btVehicleTuning_getSuspensionStiffness(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_btVehicleTuning_getSuspensionStiffness;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_btVehicleTuning_setFrictionSlip ] ---

    public static void btRaycastVehicle_btVehicleTuning_setFrictionSlip(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RaycastVehicle_btVehicleTuning_setFrictionSlip;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRaycastVehicle_btVehicleTuning_setMaxSuspensionForce ] ---

    public static void btRaycastVehicle_btVehicleTuning_setMaxSuspensionForce(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RaycastVehicle_btVehicleTuning_setMaxSuspensionForce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRaycastVehicle_btVehicleTuning_setMaxSuspensionTravelCm ] ---

    public static void btRaycastVehicle_btVehicleTuning_setMaxSuspensionTravelCm(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RaycastVehicle_btVehicleTuning_setMaxSuspensionTravelCm;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRaycastVehicle_btVehicleTuning_setSuspensionCompression ] ---

    public static void btRaycastVehicle_btVehicleTuning_setSuspensionCompression(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RaycastVehicle_btVehicleTuning_setSuspensionCompression;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRaycastVehicle_btVehicleTuning_setSuspensionDamping ] ---

    public static void btRaycastVehicle_btVehicleTuning_setSuspensionDamping(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RaycastVehicle_btVehicleTuning_setSuspensionDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRaycastVehicle_btVehicleTuning_setSuspensionStiffness ] ---

    public static void btRaycastVehicle_btVehicleTuning_setSuspensionStiffness(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RaycastVehicle_btVehicleTuning_setSuspensionStiffness;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRaycastVehicle_btVehicleTuning_delete ] ---

    public static void btRaycastVehicle_btVehicleTuning_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_btVehicleTuning_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_new ] ---

    @NativeType("void *")
    public static long btRaycastVehicle_new(@NativeType("void *") long tuning, @NativeType("void *") long chassis, @NativeType("void *") long raycaster) {
        long __functionAddress = Functions.RaycastVehicle_new;
        if (CHECKS) {
            check(tuning);
            check(chassis);
            check(raycaster);
        }
        return invokePPPP(tuning, chassis, raycaster, __functionAddress);
    }

    // --- [ btRaycastVehicle_addWheel ] ---

    public static long nbtRaycastVehicle_addWheel(long obj, long connectionPointCS0, long wheelDirectionCS0, long wheelAxleCS, float suspensionRestLength, float wheelRadius, long tuning, boolean isFrontWheel) {
        long __functionAddress = Functions.RaycastVehicle_addWheel;
        if (CHECKS) {
            check(obj);
            check(tuning);
        }
        return invokePPPPPP(obj, connectionPointCS0, wheelDirectionCS0, wheelAxleCS, suspensionRestLength, wheelRadius, tuning, isFrontWheel, __functionAddress);
    }

    @NativeType("void *")
    public static long btRaycastVehicle_addWheel(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 connectionPointCS0, @NativeType("btVector3 const *") ΒΤVector3 wheelDirectionCS0, @NativeType("btVector3 const *") ΒΤVector3 wheelAxleCS, @NativeType("btScalar") float suspensionRestLength, @NativeType("btScalar") float wheelRadius, @NativeType("void *") long tuning, @NativeType("bool") boolean isFrontWheel) {
        return nbtRaycastVehicle_addWheel(obj, connectionPointCS0.address(), wheelDirectionCS0.address(), wheelAxleCS.address(), suspensionRestLength, wheelRadius, tuning, isFrontWheel);
    }

    // --- [ btRaycastVehicle_applyEngineForce ] ---

    public static void btRaycastVehicle_applyEngineForce(@NativeType("void *") long obj, @NativeType("btScalar") float force, int wheel) {
        long __functionAddress = Functions.RaycastVehicle_applyEngineForce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, force, wheel, __functionAddress);
    }

    // --- [ btRaycastVehicle_getChassisWorldTransform ] ---

    public static void nbtRaycastVehicle_getChassisWorldTransform(long obj, long value) {
        long __functionAddress = Functions.RaycastVehicle_getChassisWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRaycastVehicle_getChassisWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtRaycastVehicle_getChassisWorldTransform(obj, value.address());
    }

    // --- [ btRaycastVehicle_getCurrentSpeedKmHour ] ---

    @NativeType("btScalar")
    public static float btRaycastVehicle_getCurrentSpeedKmHour(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_getCurrentSpeedKmHour;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_getForwardAxis ] ---

    public static int btRaycastVehicle_getForwardAxis(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_getForwardAxis;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_getForwardVector ] ---

    public static void nbtRaycastVehicle_getForwardVector(long obj, long value) {
        long __functionAddress = Functions.RaycastVehicle_getForwardVector;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRaycastVehicle_getForwardVector(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRaycastVehicle_getForwardVector(obj, value.address());
    }

    // --- [ btRaycastVehicle_getNumWheels ] ---

    public static int btRaycastVehicle_getNumWheels(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_getNumWheels;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_getRightAxis ] ---

    public static int btRaycastVehicle_getRightAxis(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_getRightAxis;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_getRigidBody ] ---

    @NativeType("void *")
    public static long btRaycastVehicle_getRigidBody(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_getRigidBody;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_getSteeringValue ] ---

    @NativeType("btScalar")
    public static float btRaycastVehicle_getSteeringValue(@NativeType("void *") long obj, int wheel) {
        long __functionAddress = Functions.RaycastVehicle_getSteeringValue;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, wheel, __functionAddress);
    }

    // --- [ btRaycastVehicle_getUpAxis ] ---

    public static int btRaycastVehicle_getUpAxis(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_getUpAxis;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_getUserConstraintId ] ---

    public static int btRaycastVehicle_getUserConstraintId(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_getUserConstraintId;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_getUserConstraintType ] ---

    public static int btRaycastVehicle_getUserConstraintType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_getUserConstraintType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_getWheelInfo ] ---

    @NativeType("void *")
    public static long btRaycastVehicle_getWheelInfo(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.RaycastVehicle_getWheelInfo;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btRaycastVehicle_getWheelInfo2 ] ---

    @NativeType("void *")
    public static long btRaycastVehicle_getWheelInfo2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_getWheelInfo2;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_getWheelTransformWS ] ---

    public static void nbtRaycastVehicle_getWheelTransformWS(long obj, int wheelIndex, long value) {
        long __functionAddress = Functions.RaycastVehicle_getWheelTransformWS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, wheelIndex, value, __functionAddress);
    }

    public static void btRaycastVehicle_getWheelTransformWS(@NativeType("void *") long obj, int wheelIndex, @NativeType("btTransform *") BTTransform value) {
        nbtRaycastVehicle_getWheelTransformWS(obj, wheelIndex, value.address());
    }

    // --- [ btRaycastVehicle_rayCast ] ---

    @NativeType("btScalar")
    public static float btRaycastVehicle_rayCast(@NativeType("void *") long obj, @NativeType("void *") long wheel) {
        long __functionAddress = Functions.RaycastVehicle_rayCast;
        if (CHECKS) {
            check(obj);
            check(wheel);
        }
        return invokePPF(obj, wheel, __functionAddress);
    }

    // --- [ btRaycastVehicle_resetSuspension ] ---

    public static void btRaycastVehicle_resetSuspension(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RaycastVehicle_resetSuspension;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btRaycastVehicle_setBrake ] ---

    public static void btRaycastVehicle_setBrake(@NativeType("void *") long obj, @NativeType("btScalar") float brake, int wheelIndex) {
        long __functionAddress = Functions.RaycastVehicle_setBrake;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, brake, wheelIndex, __functionAddress);
    }

    // --- [ btRaycastVehicle_setCoordinateSystem ] ---

    public static void btRaycastVehicle_setCoordinateSystem(@NativeType("void *") long obj, int rightIndex, int upIndex, int forwardIndex) {
        long __functionAddress = Functions.RaycastVehicle_setCoordinateSystem;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, rightIndex, upIndex, forwardIndex, __functionAddress);
    }

    // --- [ btRaycastVehicle_setPitchControl ] ---

    public static void btRaycastVehicle_setPitchControl(@NativeType("void *") long obj, @NativeType("btScalar") float pitch) {
        long __functionAddress = Functions.RaycastVehicle_setPitchControl;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, pitch, __functionAddress);
    }

    // --- [ btRaycastVehicle_setSteeringValue ] ---

    public static void btRaycastVehicle_setSteeringValue(@NativeType("void *") long obj, @NativeType("btScalar") float steering, int wheel) {
        long __functionAddress = Functions.RaycastVehicle_setSteeringValue;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, steering, wheel, __functionAddress);
    }

    // --- [ btRaycastVehicle_setUserConstraintId ] ---

    public static void btRaycastVehicle_setUserConstraintId(@NativeType("void *") long obj, int uid) {
        long __functionAddress = Functions.RaycastVehicle_setUserConstraintId;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, uid, __functionAddress);
    }

    // --- [ btRaycastVehicle_setUserConstraintType ] ---

    public static void btRaycastVehicle_setUserConstraintType(@NativeType("void *") long obj, int userConstraintType) {
        long __functionAddress = Functions.RaycastVehicle_setUserConstraintType;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, userConstraintType, __functionAddress);
    }

    // --- [ btRaycastVehicle_updateFriction ] ---

    public static void btRaycastVehicle_updateFriction(@NativeType("void *") long obj, @NativeType("btScalar") float timeStep) {
        long __functionAddress = Functions.RaycastVehicle_updateFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, timeStep, __functionAddress);
    }

    // --- [ btRaycastVehicle_updateSuspension ] ---

    public static void btRaycastVehicle_updateSuspension(@NativeType("void *") long obj, @NativeType("btScalar") float deltaTime) {
        long __functionAddress = Functions.RaycastVehicle_updateSuspension;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, deltaTime, __functionAddress);
    }

    // --- [ btRaycastVehicle_updateVehicle ] ---

    public static void btRaycastVehicle_updateVehicle(@NativeType("void *") long obj, @NativeType("btScalar") float step) {
        long __functionAddress = Functions.RaycastVehicle_updateVehicle;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, step, __functionAddress);
    }

    // --- [ btRaycastVehicle_updateWheelTransform ] ---

    public static void btRaycastVehicle_updateWheelTransform(@NativeType("void *") long obj, int wheelIndex) {
        long __functionAddress = Functions.RaycastVehicle_updateWheelTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, wheelIndex, __functionAddress);
    }

    // --- [ btRaycastVehicle_updateWheelTransform2 ] ---

    public static void btRaycastVehicle_updateWheelTransform2(@NativeType("void *") long obj, int wheelIndex, @NativeType("bool") boolean interpolatedTransform) {
        long __functionAddress = Functions.RaycastVehicle_updateWheelTransform2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, wheelIndex, interpolatedTransform, __functionAddress);
    }

    // --- [ btRaycastVehicle_updateWheelTransformsWS ] ---

    public static void btRaycastVehicle_updateWheelTransformsWS(@NativeType("void *") long obj, @NativeType("void *") long wheel) {
        long __functionAddress = Functions.RaycastVehicle_updateWheelTransformsWS;
        if (CHECKS) {
            check(obj);
            check(wheel);
        }
        invokePPV(obj, wheel, __functionAddress);
    }

    // --- [ btRaycastVehicle_updateWheelTransformsWS2 ] ---

    public static void btRaycastVehicle_updateWheelTransformsWS2(@NativeType("void *") long obj, @NativeType("void *") long wheel, @NativeType("bool") boolean interpolatedTransform) {
        long __functionAddress = Functions.RaycastVehicle_updateWheelTransformsWS2;
        if (CHECKS) {
            check(obj);
            check(wheel);
        }
        invokePPV(obj, wheel, interpolatedTransform, __functionAddress);
    }

    // --- [ btDefaultVehicleRaycaster_new ] ---

    @NativeType("void *")
    public static long btDefaultVehicleRaycaster_new(@NativeType("void *") long world) {
        long __functionAddress = Functions.DefaultVehicleRaycaster_new;
        if (CHECKS) {
            check(world);
        }
        return invokePP(world, __functionAddress);
    }

}