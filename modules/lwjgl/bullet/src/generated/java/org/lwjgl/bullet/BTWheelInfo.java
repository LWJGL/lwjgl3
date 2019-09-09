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

public class BTWheelInfo {

    protected BTWheelInfo() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            WheelInfoConstructionInfo_new                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_new"),
            WheelInfoConstructionInfo_getBIsFrontWheel            = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_getBIsFrontWheel"),
            WheelInfoConstructionInfo_getChassisConnectionCS      = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_getChassisConnectionCS"),
            WheelInfoConstructionInfo_getFrictionSlip             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_getFrictionSlip"),
            WheelInfoConstructionInfo_getMaxSuspensionForce       = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_getMaxSuspensionForce"),
            WheelInfoConstructionInfo_getMaxSuspensionTravelCm    = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_getMaxSuspensionTravelCm"),
            WheelInfoConstructionInfo_getSuspensionRestLength     = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_getSuspensionRestLength"),
            WheelInfoConstructionInfo_getSuspensionStiffness      = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_getSuspensionStiffness"),
            WheelInfoConstructionInfo_getWheelAxleCS              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_getWheelAxleCS"),
            WheelInfoConstructionInfo_getWheelDirectionCS         = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_getWheelDirectionCS"),
            WheelInfoConstructionInfo_getWheelRadius              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_getWheelRadius"),
            WheelInfoConstructionInfo_getWheelsDampingCompression = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_getWheelsDampingCompression"),
            WheelInfoConstructionInfo_getWheelsDampingRelaxation  = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_getWheelsDampingRelaxation"),
            WheelInfoConstructionInfo_setBIsFrontWheel            = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_setBIsFrontWheel"),
            WheelInfoConstructionInfo_setChassisConnectionCS      = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_setChassisConnectionCS"),
            WheelInfoConstructionInfo_setFrictionSlip             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_setFrictionSlip"),
            WheelInfoConstructionInfo_setMaxSuspensionForce       = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_setMaxSuspensionForce"),
            WheelInfoConstructionInfo_setMaxSuspensionTravelCm    = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_setMaxSuspensionTravelCm"),
            WheelInfoConstructionInfo_setSuspensionRestLength     = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_setSuspensionRestLength"),
            WheelInfoConstructionInfo_setSuspensionStiffness      = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_setSuspensionStiffness"),
            WheelInfoConstructionInfo_setWheelAxleCS              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_setWheelAxleCS"),
            WheelInfoConstructionInfo_setWheelDirectionCS         = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_setWheelDirectionCS"),
            WheelInfoConstructionInfo_setWheelRadius              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_setWheelRadius"),
            WheelInfoConstructionInfo_setWheelsDampingCompression = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_setWheelsDampingCompression"),
            WheelInfoConstructionInfo_setWheelsDampingRelaxation  = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_setWheelsDampingRelaxation"),
            WheelInfoConstructionInfo_delete                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfoConstructionInfo_delete"),
            WheelInfo_RaycastInfo_new                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_new"),
            WheelInfo_RaycastInfo_getContactNormalWS              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_getContactNormalWS"),
            WheelInfo_RaycastInfo_getContactPointWS               = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_getContactPointWS"),
            WheelInfo_RaycastInfo_getGroundObject                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_getGroundObject"),
            WheelInfo_RaycastInfo_getHardPointWS                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_getHardPointWS"),
            WheelInfo_RaycastInfo_getIsInContact                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_getIsInContact"),
            WheelInfo_RaycastInfo_getSuspensionLength             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_getSuspensionLength"),
            WheelInfo_RaycastInfo_getWheelAxleWS                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_getWheelAxleWS"),
            WheelInfo_RaycastInfo_getWheelDirectionWS             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_getWheelDirectionWS"),
            WheelInfo_RaycastInfo_setContactNormalWS              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_setContactNormalWS"),
            WheelInfo_RaycastInfo_setContactPointWS               = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_setContactPointWS"),
            WheelInfo_RaycastInfo_setGroundObject                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_setGroundObject"),
            WheelInfo_RaycastInfo_setHardPointWS                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_setHardPointWS"),
            WheelInfo_RaycastInfo_setIsInContact                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_setIsInContact"),
            WheelInfo_RaycastInfo_setSuspensionLength             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_setSuspensionLength"),
            WheelInfo_RaycastInfo_setWheelAxleWS                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_setWheelAxleWS"),
            WheelInfo_RaycastInfo_setWheelDirectionWS             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_setWheelDirectionWS"),
            WheelInfo_RaycastInfo_delete                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_RaycastInfo_delete"),
            WheelInfo_new                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_new"),
            WheelInfo_getBIsFrontWheel                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getBIsFrontWheel"),
            WheelInfo_getBrake                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getBrake"),
            WheelInfo_getChassisConnectionPointCS                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getChassisConnectionPointCS"),
            WheelInfo_getClientInfo                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getClientInfo"),
            WheelInfo_getClippedInvContactDotSuspension           = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getClippedInvContactDotSuspension"),
            WheelInfo_getDeltaRotation                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getDeltaRotation"),
            WheelInfo_getEngineForce                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getEngineForce"),
            WheelInfo_getFrictionSlip                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getFrictionSlip"),
            WheelInfo_getMaxSuspensionForce                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getMaxSuspensionForce"),
            WheelInfo_getMaxSuspensionTravelCm                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getMaxSuspensionTravelCm"),
            WheelInfo_getRaycastInfo                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getRaycastInfo"),
            WheelInfo_getRollInfluence                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getRollInfluence"),
            WheelInfo_getRotation                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getRotation"),
            WheelInfo_getSkidInfo                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getSkidInfo"),
            WheelInfo_getSteering                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getSteering"),
            WheelInfo_getSuspensionRelativeVelocity               = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getSuspensionRelativeVelocity"),
            WheelInfo_getSuspensionRestLength                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getSuspensionRestLength"),
            WheelInfo_getSuspensionRestLength1                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getSuspensionRestLength1"),
            WheelInfo_getSuspensionStiffness                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getSuspensionStiffness"),
            WheelInfo_getWheelAxleCS                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getWheelAxleCS"),
            WheelInfo_getWheelDirectionCS                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getWheelDirectionCS"),
            WheelInfo_getWheelsDampingCompression                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getWheelsDampingCompression"),
            WheelInfo_getWheelsDampingRelaxation                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getWheelsDampingRelaxation"),
            WheelInfo_getWheelsRadius                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getWheelsRadius"),
            WheelInfo_getWheelsSuspensionForce                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getWheelsSuspensionForce"),
            WheelInfo_getWorldTransform                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_getWorldTransform"),
            WheelInfo_setBIsFrontWheel                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setBIsFrontWheel"),
            WheelInfo_setBrake                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setBrake"),
            WheelInfo_setChassisConnectionPointCS                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setChassisConnectionPointCS"),
            WheelInfo_setClientInfo                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setClientInfo"),
            WheelInfo_setClippedInvContactDotSuspension           = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setClippedInvContactDotSuspension"),
            WheelInfo_setDeltaRotation                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setDeltaRotation"),
            WheelInfo_setEngineForce                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setEngineForce"),
            WheelInfo_setFrictionSlip                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setFrictionSlip"),
            WheelInfo_setMaxSuspensionForce                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setMaxSuspensionForce"),
            WheelInfo_setMaxSuspensionTravelCm                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setMaxSuspensionTravelCm"),
            WheelInfo_setRollInfluence                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setRollInfluence"),
            WheelInfo_setRotation                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setRotation"),
            WheelInfo_setSkidInfo                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setSkidInfo"),
            WheelInfo_setSteering                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setSteering"),
            WheelInfo_setSuspensionRelativeVelocity               = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setSuspensionRelativeVelocity"),
            WheelInfo_setSuspensionRestLength1                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setSuspensionRestLength1"),
            WheelInfo_setSuspensionStiffness                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setSuspensionStiffness"),
            WheelInfo_setWheelAxleCS                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setWheelAxleCS"),
            WheelInfo_setWheelDirectionCS                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setWheelDirectionCS"),
            WheelInfo_setWheelsDampingCompression                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setWheelsDampingCompression"),
            WheelInfo_setWheelsDampingRelaxation                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setWheelsDampingRelaxation"),
            WheelInfo_setWheelsRadius                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setWheelsRadius"),
            WheelInfo_setWheelsSuspensionForce                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setWheelsSuspensionForce"),
            WheelInfo_setWorldTransform                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_setWorldTransform"),
            WheelInfo_updateWheel                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_updateWheel"),
            WheelInfo_delete                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btWheelInfo_delete");

    }

    // --- [ btWheelInfoConstructionInfo_new ] ---

    @NativeType("void *")
    public static long btWheelInfoConstructionInfo_new() {
        long __functionAddress = Functions.WheelInfoConstructionInfo_new;
        return invokeP(__functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_getBIsFrontWheel ] ---

    @NativeType("bool")
    public static boolean btWheelInfoConstructionInfo_getBIsFrontWheel(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_getBIsFrontWheel;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_getChassisConnectionCS ] ---

    public static void nbtWheelInfoConstructionInfo_getChassisConnectionCS(long obj, long value) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_getChassisConnectionCS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfoConstructionInfo_getChassisConnectionCS(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtWheelInfoConstructionInfo_getChassisConnectionCS(obj, value.address());
    }

    // --- [ btWheelInfoConstructionInfo_getFrictionSlip ] ---

    @NativeType("btScalar")
    public static float btWheelInfoConstructionInfo_getFrictionSlip(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_getFrictionSlip;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_getMaxSuspensionForce ] ---

    @NativeType("btScalar")
    public static float btWheelInfoConstructionInfo_getMaxSuspensionForce(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_getMaxSuspensionForce;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_getMaxSuspensionTravelCm ] ---

    @NativeType("btScalar")
    public static float btWheelInfoConstructionInfo_getMaxSuspensionTravelCm(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_getMaxSuspensionTravelCm;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_getSuspensionRestLength ] ---

    @NativeType("btScalar")
    public static float btWheelInfoConstructionInfo_getSuspensionRestLength(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_getSuspensionRestLength;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_getSuspensionStiffness ] ---

    @NativeType("btScalar")
    public static float btWheelInfoConstructionInfo_getSuspensionStiffness(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_getSuspensionStiffness;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_getWheelAxleCS ] ---

    public static void nbtWheelInfoConstructionInfo_getWheelAxleCS(long obj, long value) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_getWheelAxleCS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfoConstructionInfo_getWheelAxleCS(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtWheelInfoConstructionInfo_getWheelAxleCS(obj, value.address());
    }

    // --- [ btWheelInfoConstructionInfo_getWheelDirectionCS ] ---

    public static void nbtWheelInfoConstructionInfo_getWheelDirectionCS(long obj, long value) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_getWheelDirectionCS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfoConstructionInfo_getWheelDirectionCS(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtWheelInfoConstructionInfo_getWheelDirectionCS(obj, value.address());
    }

    // --- [ btWheelInfoConstructionInfo_getWheelRadius ] ---

    @NativeType("btScalar")
    public static float btWheelInfoConstructionInfo_getWheelRadius(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_getWheelRadius;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_getWheelsDampingCompression ] ---

    @NativeType("btScalar")
    public static float btWheelInfoConstructionInfo_getWheelsDampingCompression(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_getWheelsDampingCompression;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_getWheelsDampingRelaxation ] ---

    @NativeType("btScalar")
    public static float btWheelInfoConstructionInfo_getWheelsDampingRelaxation(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_getWheelsDampingRelaxation;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_setBIsFrontWheel ] ---

    public static void btWheelInfoConstructionInfo_setBIsFrontWheel(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_setBIsFrontWheel;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_setChassisConnectionCS ] ---

    public static void nbtWheelInfoConstructionInfo_setChassisConnectionCS(long obj, long value) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_setChassisConnectionCS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfoConstructionInfo_setChassisConnectionCS(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtWheelInfoConstructionInfo_setChassisConnectionCS(obj, value.address());
    }

    // --- [ btWheelInfoConstructionInfo_setFrictionSlip ] ---

    public static void btWheelInfoConstructionInfo_setFrictionSlip(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_setFrictionSlip;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_setMaxSuspensionForce ] ---

    public static void btWheelInfoConstructionInfo_setMaxSuspensionForce(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_setMaxSuspensionForce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_setMaxSuspensionTravelCm ] ---

    public static void btWheelInfoConstructionInfo_setMaxSuspensionTravelCm(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_setMaxSuspensionTravelCm;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_setSuspensionRestLength ] ---

    public static void btWheelInfoConstructionInfo_setSuspensionRestLength(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_setSuspensionRestLength;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_setSuspensionStiffness ] ---

    public static void btWheelInfoConstructionInfo_setSuspensionStiffness(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_setSuspensionStiffness;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_setWheelAxleCS ] ---

    public static void nbtWheelInfoConstructionInfo_setWheelAxleCS(long obj, long value) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_setWheelAxleCS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfoConstructionInfo_setWheelAxleCS(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtWheelInfoConstructionInfo_setWheelAxleCS(obj, value.address());
    }

    // --- [ btWheelInfoConstructionInfo_setWheelDirectionCS ] ---

    public static void nbtWheelInfoConstructionInfo_setWheelDirectionCS(long obj, long value) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_setWheelDirectionCS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfoConstructionInfo_setWheelDirectionCS(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtWheelInfoConstructionInfo_setWheelDirectionCS(obj, value.address());
    }

    // --- [ btWheelInfoConstructionInfo_setWheelRadius ] ---

    public static void btWheelInfoConstructionInfo_setWheelRadius(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_setWheelRadius;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_setWheelsDampingCompression ] ---

    public static void btWheelInfoConstructionInfo_setWheelsDampingCompression(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_setWheelsDampingCompression;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_setWheelsDampingRelaxation ] ---

    public static void btWheelInfoConstructionInfo_setWheelsDampingRelaxation(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_setWheelsDampingRelaxation;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfoConstructionInfo_delete ] ---

    public static void btWheelInfoConstructionInfo_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfoConstructionInfo_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btWheelInfo_RaycastInfo_new ] ---

    @NativeType("void *")
    public static long btWheelInfo_RaycastInfo_new() {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_new;
        return invokeP(__functionAddress);
    }

    // --- [ btWheelInfo_RaycastInfo_getContactNormalWS ] ---

    public static void nbtWheelInfo_RaycastInfo_getContactNormalWS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_getContactNormalWS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_RaycastInfo_getContactNormalWS(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtWheelInfo_RaycastInfo_getContactNormalWS(obj, value.address());
    }

    // --- [ btWheelInfo_RaycastInfo_getContactPointWS ] ---

    public static void nbtWheelInfo_RaycastInfo_getContactPointWS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_getContactPointWS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_RaycastInfo_getContactPointWS(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtWheelInfo_RaycastInfo_getContactPointWS(obj, value.address());
    }

    // --- [ btWheelInfo_RaycastInfo_getGroundObject ] ---

    @NativeType("void *")
    public static long btWheelInfo_RaycastInfo_getGroundObject(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_getGroundObject;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btWheelInfo_RaycastInfo_getHardPointWS ] ---

    public static void nbtWheelInfo_RaycastInfo_getHardPointWS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_getHardPointWS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_RaycastInfo_getHardPointWS(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtWheelInfo_RaycastInfo_getHardPointWS(obj, value.address());
    }

    // --- [ btWheelInfo_RaycastInfo_getIsInContact ] ---

    @NativeType("bool")
    public static boolean btWheelInfo_RaycastInfo_getIsInContact(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_getIsInContact;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btWheelInfo_RaycastInfo_getSuspensionLength ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_RaycastInfo_getSuspensionLength(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_getSuspensionLength;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_RaycastInfo_getWheelAxleWS ] ---

    public static void nbtWheelInfo_RaycastInfo_getWheelAxleWS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_getWheelAxleWS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_RaycastInfo_getWheelAxleWS(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtWheelInfo_RaycastInfo_getWheelAxleWS(obj, value.address());
    }

    // --- [ btWheelInfo_RaycastInfo_getWheelDirectionWS ] ---

    public static void nbtWheelInfo_RaycastInfo_getWheelDirectionWS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_getWheelDirectionWS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_RaycastInfo_getWheelDirectionWS(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtWheelInfo_RaycastInfo_getWheelDirectionWS(obj, value.address());
    }

    // --- [ btWheelInfo_RaycastInfo_setContactNormalWS ] ---

    public static void nbtWheelInfo_RaycastInfo_setContactNormalWS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_setContactNormalWS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_RaycastInfo_setContactNormalWS(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtWheelInfo_RaycastInfo_setContactNormalWS(obj, value.address());
    }

    // --- [ btWheelInfo_RaycastInfo_setContactPointWS ] ---

    public static void nbtWheelInfo_RaycastInfo_setContactPointWS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_setContactPointWS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_RaycastInfo_setContactPointWS(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtWheelInfo_RaycastInfo_setContactPointWS(obj, value.address());
    }

    // --- [ btWheelInfo_RaycastInfo_setGroundObject ] ---

    public static void btWheelInfo_RaycastInfo_setGroundObject(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_setGroundObject;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_RaycastInfo_setHardPointWS ] ---

    public static void nbtWheelInfo_RaycastInfo_setHardPointWS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_setHardPointWS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_RaycastInfo_setHardPointWS(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtWheelInfo_RaycastInfo_setHardPointWS(obj, value.address());
    }

    // --- [ btWheelInfo_RaycastInfo_setIsInContact ] ---

    public static void btWheelInfo_RaycastInfo_setIsInContact(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_setIsInContact;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_RaycastInfo_setSuspensionLength ] ---

    public static void btWheelInfo_RaycastInfo_setSuspensionLength(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_setSuspensionLength;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_RaycastInfo_setWheelAxleWS ] ---

    public static void nbtWheelInfo_RaycastInfo_setWheelAxleWS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_setWheelAxleWS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_RaycastInfo_setWheelAxleWS(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtWheelInfo_RaycastInfo_setWheelAxleWS(obj, value.address());
    }

    // --- [ btWheelInfo_RaycastInfo_setWheelDirectionWS ] ---

    public static void nbtWheelInfo_RaycastInfo_setWheelDirectionWS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_setWheelDirectionWS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_RaycastInfo_setWheelDirectionWS(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtWheelInfo_RaycastInfo_setWheelDirectionWS(obj, value.address());
    }

    // --- [ btWheelInfo_RaycastInfo_delete ] ---

    public static void btWheelInfo_RaycastInfo_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_RaycastInfo_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btWheelInfo_new ] ---

    @NativeType("void *")
    public static long btWheelInfo_new(@NativeType("void *") long ci) {
        long __functionAddress = Functions.WheelInfo_new;
        if (CHECKS) {
            check(ci);
        }
        return invokePP(ci, __functionAddress);
    }

    // --- [ btWheelInfo_getBIsFrontWheel ] ---

    @NativeType("bool")
    public static boolean btWheelInfo_getBIsFrontWheel(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getBIsFrontWheel;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getBrake ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getBrake(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getBrake;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getChassisConnectionPointCS ] ---

    public static void nbtWheelInfo_getChassisConnectionPointCS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_getChassisConnectionPointCS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_getChassisConnectionPointCS(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtWheelInfo_getChassisConnectionPointCS(obj, value.address());
    }

    // --- [ btWheelInfo_getClientInfo ] ---

    @NativeType("void *")
    public static long btWheelInfo_getClientInfo(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getClientInfo;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getClippedInvContactDotSuspension ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getClippedInvContactDotSuspension(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getClippedInvContactDotSuspension;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getDeltaRotation ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getDeltaRotation(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getDeltaRotation;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getEngineForce ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getEngineForce(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getEngineForce;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getFrictionSlip ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getFrictionSlip(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getFrictionSlip;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getMaxSuspensionForce ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getMaxSuspensionForce(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getMaxSuspensionForce;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getMaxSuspensionTravelCm ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getMaxSuspensionTravelCm(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getMaxSuspensionTravelCm;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getRaycastInfo ] ---

    @NativeType("void *")
    public static long btWheelInfo_getRaycastInfo(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getRaycastInfo;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getRollInfluence ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getRollInfluence(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getRollInfluence;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getRotation ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getRotation(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getRotation;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getSkidInfo ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getSkidInfo(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getSkidInfo;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getSteering ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getSteering(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getSteering;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getSuspensionRelativeVelocity ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getSuspensionRelativeVelocity(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getSuspensionRelativeVelocity;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getSuspensionRestLength ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getSuspensionRestLength(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getSuspensionRestLength;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getSuspensionRestLength1 ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getSuspensionRestLength1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getSuspensionRestLength1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getSuspensionStiffness ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getSuspensionStiffness(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getSuspensionStiffness;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getWheelAxleCS ] ---

    public static void nbtWheelInfo_getWheelAxleCS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_getWheelAxleCS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_getWheelAxleCS(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtWheelInfo_getWheelAxleCS(obj, value.address());
    }

    // --- [ btWheelInfo_getWheelDirectionCS ] ---

    public static void nbtWheelInfo_getWheelDirectionCS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_getWheelDirectionCS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_getWheelDirectionCS(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtWheelInfo_getWheelDirectionCS(obj, value.address());
    }

    // --- [ btWheelInfo_getWheelsDampingCompression ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getWheelsDampingCompression(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getWheelsDampingCompression;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getWheelsDampingRelaxation ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getWheelsDampingRelaxation(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getWheelsDampingRelaxation;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getWheelsRadius ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getWheelsRadius(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getWheelsRadius;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getWheelsSuspensionForce ] ---

    @NativeType("btScalar")
    public static float btWheelInfo_getWheelsSuspensionForce(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_getWheelsSuspensionForce;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btWheelInfo_getWorldTransform ] ---

    public static void nbtWheelInfo_getWorldTransform(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_getWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_getWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtWheelInfo_getWorldTransform(obj, value.address());
    }

    // --- [ btWheelInfo_setBIsFrontWheel ] ---

    public static void btWheelInfo_setBIsFrontWheel(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.WheelInfo_setBIsFrontWheel;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setBrake ] ---

    public static void btWheelInfo_setBrake(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setBrake;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setChassisConnectionPointCS ] ---

    public static void nbtWheelInfo_setChassisConnectionPointCS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_setChassisConnectionPointCS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_setChassisConnectionPointCS(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtWheelInfo_setChassisConnectionPointCS(obj, value.address());
    }

    // --- [ btWheelInfo_setClientInfo ] ---

    public static void btWheelInfo_setClientInfo(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.WheelInfo_setClientInfo;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setClippedInvContactDotSuspension ] ---

    public static void btWheelInfo_setClippedInvContactDotSuspension(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setClippedInvContactDotSuspension;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setDeltaRotation ] ---

    public static void btWheelInfo_setDeltaRotation(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setDeltaRotation;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setEngineForce ] ---

    public static void btWheelInfo_setEngineForce(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setEngineForce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setFrictionSlip ] ---

    public static void btWheelInfo_setFrictionSlip(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setFrictionSlip;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setMaxSuspensionForce ] ---

    public static void btWheelInfo_setMaxSuspensionForce(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setMaxSuspensionForce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setMaxSuspensionTravelCm ] ---

    public static void btWheelInfo_setMaxSuspensionTravelCm(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setMaxSuspensionTravelCm;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setRollInfluence ] ---

    public static void btWheelInfo_setRollInfluence(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setRollInfluence;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setRotation ] ---

    public static void btWheelInfo_setRotation(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setRotation;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setSkidInfo ] ---

    public static void btWheelInfo_setSkidInfo(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setSkidInfo;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setSteering ] ---

    public static void btWheelInfo_setSteering(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setSteering;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setSuspensionRelativeVelocity ] ---

    public static void btWheelInfo_setSuspensionRelativeVelocity(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setSuspensionRelativeVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setSuspensionRestLength1 ] ---

    public static void btWheelInfo_setSuspensionRestLength1(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setSuspensionRestLength1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setSuspensionStiffness ] ---

    public static void btWheelInfo_setSuspensionStiffness(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setSuspensionStiffness;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setWheelAxleCS ] ---

    public static void nbtWheelInfo_setWheelAxleCS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_setWheelAxleCS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_setWheelAxleCS(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtWheelInfo_setWheelAxleCS(obj, value.address());
    }

    // --- [ btWheelInfo_setWheelDirectionCS ] ---

    public static void nbtWheelInfo_setWheelDirectionCS(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_setWheelDirectionCS;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_setWheelDirectionCS(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtWheelInfo_setWheelDirectionCS(obj, value.address());
    }

    // --- [ btWheelInfo_setWheelsDampingCompression ] ---

    public static void btWheelInfo_setWheelsDampingCompression(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setWheelsDampingCompression;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setWheelsDampingRelaxation ] ---

    public static void btWheelInfo_setWheelsDampingRelaxation(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setWheelsDampingRelaxation;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setWheelsRadius ] ---

    public static void btWheelInfo_setWheelsRadius(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setWheelsRadius;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setWheelsSuspensionForce ] ---

    public static void btWheelInfo_setWheelsSuspensionForce(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.WheelInfo_setWheelsSuspensionForce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btWheelInfo_setWorldTransform ] ---

    public static void nbtWheelInfo_setWorldTransform(long obj, long value) {
        long __functionAddress = Functions.WheelInfo_setWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btWheelInfo_setWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform value) {
        nbtWheelInfo_setWorldTransform(obj, value.address());
    }

    // --- [ btWheelInfo_updateWheel ] ---

    public static void btWheelInfo_updateWheel(@NativeType("void *") long obj, @NativeType("void *") long chassis, @NativeType("void *") long raycastInfo) {
        long __functionAddress = Functions.WheelInfo_updateWheel;
        if (CHECKS) {
            check(obj);
            check(chassis);
            check(raycastInfo);
        }
        invokePPPV(obj, chassis, raycastInfo, __functionAddress);
    }

    // --- [ btWheelInfo_delete ] ---

    public static void btWheelInfo_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WheelInfo_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}