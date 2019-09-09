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
import static org.lwjgl.system.MemoryUtil.*;

public class BTCollisionObject {

    protected BTCollisionObject() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CollisionObject_new                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_new"),
            CollisionObject_activate                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_activate"),
            CollisionObject_calculateSerializeBufferSize    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_calculateSerializeBufferSize"),
            CollisionObject_checkCollideWith                = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_checkCollideWith"),
            CollisionObject_checkCollideWithOverride        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_checkCollideWithOverride"),
            CollisionObject_forceActivationState            = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_forceActivationState"),
            CollisionObject_getActivationState              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getActivationState"),
            CollisionObject_getAnisotropicFriction          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getAnisotropicFriction"),
            CollisionObject_getBroadphaseHandle             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getBroadphaseHandle"),
            CollisionObject_getCcdMotionThreshold           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getCcdMotionThreshold"),
            CollisionObject_getCcdSquareMotionThreshold     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getCcdSquareMotionThreshold"),
            CollisionObject_getCcdSweptSphereRadius         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getCcdSweptSphereRadius"),
            CollisionObject_getCollisionFlags               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getCollisionFlags"),
            CollisionObject_getCollisionShape               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getCollisionShape"),
            CollisionObject_getCompanionId                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getCompanionId"),
            CollisionObject_getContactDamping               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getContactDamping"),
            CollisionObject_getContactProcessingThreshold   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getContactProcessingThreshold"),
            CollisionObject_getContactStiffness             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getContactStiffness"),
            CollisionObject_getCustomDebugColor             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getCustomDebugColor"),
            CollisionObject_getDeactivationTime             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getDeactivationTime"),
            CollisionObject_getFriction                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getFriction"),
            CollisionObject_getHitFraction                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getHitFraction"),
            CollisionObject_getInternalType                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getInternalType"),
            CollisionObject_getInterpolationAngularVelocity = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getInterpolationAngularVelocity"),
            CollisionObject_getInterpolationLinearVelocity  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getInterpolationLinearVelocity"),
            CollisionObject_getInterpolationWorldTransform  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getInterpolationWorldTransform"),
            CollisionObject_getIslandTag                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getIslandTag"),
            CollisionObject_getRestitution                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getRestitution"),
            CollisionObject_getRollingFriction              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getRollingFriction"),
            CollisionObject_getSpinningFriction             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getSpinningFriction"),
            CollisionObject_getWorldArrayIndex              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getWorldArrayIndex"),
            CollisionObject_getUserIndex                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getUserIndex"),
            CollisionObject_getUserIndex2                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getUserIndex2"),
            CollisionObject_getUserPointer                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getUserPointer"),
            CollisionObject_getWorldTransform               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_getWorldTransform"),
            CollisionObject_hasAnisotropicFriction          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_hasAnisotropicFriction"),
            CollisionObject_hasContactResponse              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_hasContactResponse"),
            CollisionObject_internalGetExtensionPointer     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_internalGetExtensionPointer"),
            CollisionObject_internalSetExtensionPointer     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_internalSetExtensionPointer"),
            CollisionObject_isActive                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_isActive"),
            CollisionObject_isKinematicObject               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_isKinematicObject"),
            CollisionObject_isStaticObject                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_isStaticObject"),
            CollisionObject_isStaticOrKinematicObject       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_isStaticOrKinematicObject"),
            CollisionObject_mergesSimulationIslands         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_mergesSimulationIslands"),
            CollisionObject_removeCustomDebugColor          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_removeCustomDebugColor"),
            CollisionObject_serialize                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_serialize"),
            CollisionObject_serializeSingleObject           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_serializeSingleObject"),
            CollisionObject_setActivationState              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setActivationState"),
            CollisionObject_setAnisotropicFriction          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setAnisotropicFriction"),
            CollisionObject_setBroadphaseHandle             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setBroadphaseHandle"),
            CollisionObject_setCcdMotionThreshold           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setCcdMotionThreshold"),
            CollisionObject_setCcdSweptSphereRadius         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setCcdSweptSphereRadius"),
            CollisionObject_setCollisionFlags               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setCollisionFlags"),
            CollisionObject_setCollisionShape               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setCollisionShape"),
            CollisionObject_setCompanionId                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setCompanionId"),
            CollisionObject_setContactProcessingThreshold   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setContactProcessingThreshold"),
            CollisionObject_setContactStiffnessAndDamping   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setContactStiffnessAndDamping"),
            CollisionObject_setCustomDebugColor             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setCustomDebugColor"),
            CollisionObject_setDeactivationTime             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setDeactivationTime"),
            CollisionObject_setFriction                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setFriction"),
            CollisionObject_setHitFraction                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setHitFraction"),
            CollisionObject_setIgnoreCollisionCheck         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setIgnoreCollisionCheck"),
            CollisionObject_setInterpolationAngularVelocity = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setInterpolationAngularVelocity"),
            CollisionObject_setInterpolationLinearVelocity  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setInterpolationLinearVelocity"),
            CollisionObject_setInterpolationWorldTransform  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setInterpolationWorldTransform"),
            CollisionObject_setIslandTag                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setIslandTag"),
            CollisionObject_setRestitution                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setRestitution"),
            CollisionObject_setRollingFriction              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setRollingFriction"),
            CollisionObject_setSpinningFriction             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setSpinningFriction"),
            CollisionObject_setWorldArrayIndex              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setWorldArrayIndex"),
            CollisionObject_setUserIndex                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setUserIndex"),
            CollisionObject_setUserIndex2                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setUserIndex2"),
            CollisionObject_setUserPointer                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setUserPointer"),
            CollisionObject_setWorldTransform               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_setWorldTransform"),
            CollisionObject_delete                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionObject_delete");

    }

    // --- [ btCollisionObject_new ] ---

    @NativeType("void *")
    public static long btCollisionObject_new() {
        long __functionAddress = Functions.CollisionObject_new;
        return invokeP(__functionAddress);
    }

    // --- [ btCollisionObject_activate ] ---

    public static void btCollisionObject_activate(@NativeType("void *") long obj, @NativeType("bool") boolean forceActivation) {
        long __functionAddress = Functions.CollisionObject_activate;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, forceActivation, __functionAddress);
    }

    // --- [ btCollisionObject_calculateSerializeBufferSize ] ---

    public static int btCollisionObject_calculateSerializeBufferSize(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_calculateSerializeBufferSize;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionObject_checkCollideWith ] ---

    @NativeType("bool")
    public static boolean btCollisionObject_checkCollideWith(@NativeType("void *") long obj, @NativeType("void *") long co) {
        long __functionAddress = Functions.CollisionObject_checkCollideWith;
        if (CHECKS) {
            check(obj);
            check(co);
        }
        return invokePPZ(obj, co, __functionAddress);
    }

    // --- [ btCollisionObject_checkCollideWithOverride ] ---

    @NativeType("bool")
    public static boolean btCollisionObject_checkCollideWithOverride(@NativeType("void *") long obj, @NativeType("void *") long co) {
        long __functionAddress = Functions.CollisionObject_checkCollideWithOverride;
        if (CHECKS) {
            check(obj);
            check(co);
        }
        return invokePPZ(obj, co, __functionAddress);
    }

    // --- [ btCollisionObject_forceActivationState ] ---

    public static void btCollisionObject_forceActivationState(@NativeType("void *") long obj, int newState) {
        long __functionAddress = Functions.CollisionObject_forceActivationState;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, newState, __functionAddress);
    }

    // --- [ btCollisionObject_getActivationState ] ---

    public static int btCollisionObject_getActivationState(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getActivationState;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getAnisotropicFriction ] ---

    public static void nbtCollisionObject_getAnisotropicFriction(long obj, long value) {
        long __functionAddress = Functions.CollisionObject_getAnisotropicFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionObject_getAnisotropicFriction(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionObject_getAnisotropicFriction(obj, value.address());
    }

    // --- [ btCollisionObject_getBroadphaseHandle ] ---

    @NativeType("void *")
    public static long btCollisionObject_getBroadphaseHandle(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getBroadphaseHandle;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getCcdMotionThreshold ] ---

    @NativeType("btScalar")
    public static float btCollisionObject_getCcdMotionThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getCcdMotionThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getCcdSquareMotionThreshold ] ---

    @NativeType("btScalar")
    public static float btCollisionObject_getCcdSquareMotionThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getCcdSquareMotionThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getCcdSweptSphereRadius ] ---

    @NativeType("btScalar")
    public static float btCollisionObject_getCcdSweptSphereRadius(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getCcdSweptSphereRadius;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getCollisionFlags ] ---

    public static int btCollisionObject_getCollisionFlags(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getCollisionFlags;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getCollisionShape ] ---

    @NativeType("void *")
    public static long btCollisionObject_getCollisionShape(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getCollisionShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getCompanionId ] ---

    public static int btCollisionObject_getCompanionId(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getCompanionId;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getContactDamping ] ---

    @NativeType("btScalar")
    public static float btCollisionObject_getContactDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getContactDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getContactProcessingThreshold ] ---

    @NativeType("btScalar")
    public static float btCollisionObject_getContactProcessingThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getContactProcessingThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getContactStiffness ] ---

    @NativeType("btScalar")
    public static float btCollisionObject_getContactStiffness(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getContactStiffness;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getCustomDebugColor ] ---

    public static boolean nbtCollisionObject_getCustomDebugColor(long obj, long colorRGB) {
        long __functionAddress = Functions.CollisionObject_getCustomDebugColor;
        if (CHECKS) {
            check(obj);
        }
        return invokePPZ(obj, colorRGB, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btCollisionObject_getCustomDebugColor(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 colorRGB) {
        return nbtCollisionObject_getCustomDebugColor(obj, colorRGB.address());
    }

    // --- [ btCollisionObject_getDeactivationTime ] ---

    @NativeType("btScalar")
    public static float btCollisionObject_getDeactivationTime(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getDeactivationTime;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getFriction ] ---

    @NativeType("btScalar")
    public static float btCollisionObject_getFriction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getFriction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getHitFraction ] ---

    @NativeType("btScalar")
    public static float btCollisionObject_getHitFraction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getHitFraction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getInternalType ] ---

    public static int btCollisionObject_getInternalType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getInternalType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getInterpolationAngularVelocity ] ---

    public static void nbtCollisionObject_getInterpolationAngularVelocity(long obj, long value) {
        long __functionAddress = Functions.CollisionObject_getInterpolationAngularVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionObject_getInterpolationAngularVelocity(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionObject_getInterpolationAngularVelocity(obj, value.address());
    }

    // --- [ btCollisionObject_getInterpolationLinearVelocity ] ---

    public static void nbtCollisionObject_getInterpolationLinearVelocity(long obj, long value) {
        long __functionAddress = Functions.CollisionObject_getInterpolationLinearVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionObject_getInterpolationLinearVelocity(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionObject_getInterpolationLinearVelocity(obj, value.address());
    }

    // --- [ btCollisionObject_getInterpolationWorldTransform ] ---

    public static void nbtCollisionObject_getInterpolationWorldTransform(long obj, long value) {
        long __functionAddress = Functions.CollisionObject_getInterpolationWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionObject_getInterpolationWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtCollisionObject_getInterpolationWorldTransform(obj, value.address());
    }

    // --- [ btCollisionObject_getIslandTag ] ---

    public static int btCollisionObject_getIslandTag(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getIslandTag;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getRestitution ] ---

    @NativeType("btScalar")
    public static float btCollisionObject_getRestitution(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getRestitution;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getRollingFriction ] ---

    @NativeType("btScalar")
    public static float btCollisionObject_getRollingFriction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getRollingFriction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getSpinningFriction ] ---

    @NativeType("btScalar")
    public static float btCollisionObject_getSpinningFriction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getSpinningFriction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getWorldArrayIndex ] ---

    public static int btCollisionObject_getWorldArrayIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getWorldArrayIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getUserIndex ] ---

    public static int btCollisionObject_getUserIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getUserIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getUserIndex2 ] ---

    public static int btCollisionObject_getUserIndex2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getUserIndex2;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getUserPointer ] ---

    @NativeType("void *")
    public static long btCollisionObject_getUserPointer(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_getUserPointer;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionObject_getWorldTransform ] ---

    public static void nbtCollisionObject_getWorldTransform(long obj, long value) {
        long __functionAddress = Functions.CollisionObject_getWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionObject_getWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtCollisionObject_getWorldTransform(obj, value.address());
    }

    // --- [ btCollisionObject_hasAnisotropicFriction ] ---

    @NativeType("bool")
    public static boolean btCollisionObject_hasAnisotropicFriction(@NativeType("void *") long obj, int frictionMode) {
        long __functionAddress = Functions.CollisionObject_hasAnisotropicFriction;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, frictionMode, __functionAddress);
    }

    // --- [ btCollisionObject_hasContactResponse ] ---

    @NativeType("bool")
    public static boolean btCollisionObject_hasContactResponse(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_hasContactResponse;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionObject_internalGetExtensionPointer ] ---

    @NativeType("void *")
    public static long btCollisionObject_internalGetExtensionPointer(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_internalGetExtensionPointer;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionObject_internalSetExtensionPointer ] ---

    public static void btCollisionObject_internalSetExtensionPointer(@NativeType("void *") long obj, @NativeType("void *") long pointer) {
        long __functionAddress = Functions.CollisionObject_internalSetExtensionPointer;
        if (CHECKS) {
            check(obj);
            check(pointer);
        }
        invokePPV(obj, pointer, __functionAddress);
    }

    // --- [ btCollisionObject_isActive ] ---

    @NativeType("bool")
    public static boolean btCollisionObject_isActive(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_isActive;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionObject_isKinematicObject ] ---

    @NativeType("bool")
    public static boolean btCollisionObject_isKinematicObject(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_isKinematicObject;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionObject_isStaticObject ] ---

    @NativeType("bool")
    public static boolean btCollisionObject_isStaticObject(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_isStaticObject;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionObject_isStaticOrKinematicObject ] ---

    @NativeType("bool")
    public static boolean btCollisionObject_isStaticOrKinematicObject(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_isStaticOrKinematicObject;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionObject_mergesSimulationIslands ] ---

    @NativeType("bool")
    public static boolean btCollisionObject_mergesSimulationIslands(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_mergesSimulationIslands;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionObject_removeCustomDebugColor ] ---

    public static void btCollisionObject_removeCustomDebugColor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_removeCustomDebugColor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCollisionObject_serialize ] ---

    public static long nbtCollisionObject_serialize(long obj, long dataBuffer, long serializer) {
        long __functionAddress = Functions.CollisionObject_serialize;
        if (CHECKS) {
            check(obj);
            check(dataBuffer);
            check(serializer);
        }
        return invokePPPP(obj, dataBuffer, serializer, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String btCollisionObject_serialize(@NativeType("void *") long obj, @NativeType("void *") long dataBuffer, @NativeType("void *") long serializer) {
        long __result = nbtCollisionObject_serialize(obj, dataBuffer, serializer);
        return memUTF8Safe(__result);
    }

    // --- [ btCollisionObject_serializeSingleObject ] ---

    public static void btCollisionObject_serializeSingleObject(@NativeType("void *") long obj, @NativeType("void *") long serializer) {
        long __functionAddress = Functions.CollisionObject_serializeSingleObject;
        if (CHECKS) {
            check(obj);
            check(serializer);
        }
        invokePPV(obj, serializer, __functionAddress);
    }

    // --- [ btCollisionObject_setActivationState ] ---

    public static void btCollisionObject_setActivationState(@NativeType("void *") long obj, int newState) {
        long __functionAddress = Functions.CollisionObject_setActivationState;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, newState, __functionAddress);
    }

    // --- [ btCollisionObject_setAnisotropicFriction ] ---

    public static void nbtCollisionObject_setAnisotropicFriction(long obj, long anisotropicFriction, int frictionMode) {
        long __functionAddress = Functions.CollisionObject_setAnisotropicFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, anisotropicFriction, frictionMode, __functionAddress);
    }

    public static void btCollisionObject_setAnisotropicFriction(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 anisotropicFriction, int frictionMode) {
        nbtCollisionObject_setAnisotropicFriction(obj, anisotropicFriction.address(), frictionMode);
    }

    // --- [ btCollisionObject_setBroadphaseHandle ] ---

    public static void btCollisionObject_setBroadphaseHandle(@NativeType("void *") long obj, @NativeType("void *") long handle) {
        long __functionAddress = Functions.CollisionObject_setBroadphaseHandle;
        if (CHECKS) {
            check(obj);
            check(handle);
        }
        invokePPV(obj, handle, __functionAddress);
    }

    // --- [ btCollisionObject_setCcdMotionThreshold ] ---

    public static void btCollisionObject_setCcdMotionThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float ccdMotionThreshold) {
        long __functionAddress = Functions.CollisionObject_setCcdMotionThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, ccdMotionThreshold, __functionAddress);
    }

    // --- [ btCollisionObject_setCcdSweptSphereRadius ] ---

    public static void btCollisionObject_setCcdSweptSphereRadius(@NativeType("void *") long obj, @NativeType("btScalar") float radius) {
        long __functionAddress = Functions.CollisionObject_setCcdSweptSphereRadius;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, radius, __functionAddress);
    }

    // --- [ btCollisionObject_setCollisionFlags ] ---

    public static void btCollisionObject_setCollisionFlags(@NativeType("void *") long obj, int flags) {
        long __functionAddress = Functions.CollisionObject_setCollisionFlags;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, flags, __functionAddress);
    }

    // --- [ btCollisionObject_setCollisionShape ] ---

    public static void btCollisionObject_setCollisionShape(@NativeType("void *") long obj, @NativeType("void *") long collisionShape) {
        long __functionAddress = Functions.CollisionObject_setCollisionShape;
        if (CHECKS) {
            check(obj);
            check(collisionShape);
        }
        invokePPV(obj, collisionShape, __functionAddress);
    }

    // --- [ btCollisionObject_setCompanionId ] ---

    public static void btCollisionObject_setCompanionId(@NativeType("void *") long obj, int id) {
        long __functionAddress = Functions.CollisionObject_setCompanionId;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, id, __functionAddress);
    }

    // --- [ btCollisionObject_setContactProcessingThreshold ] ---

    public static void btCollisionObject_setContactProcessingThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float contactProcessingThreshold) {
        long __functionAddress = Functions.CollisionObject_setContactProcessingThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, contactProcessingThreshold, __functionAddress);
    }

    // --- [ btCollisionObject_setContactStiffnessAndDamping ] ---

    public static void btCollisionObject_setContactStiffnessAndDamping(@NativeType("void *") long obj, @NativeType("btScalar") float stiffness, @NativeType("btScalar") float damping) {
        long __functionAddress = Functions.CollisionObject_setContactStiffnessAndDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, stiffness, damping, __functionAddress);
    }

    // --- [ btCollisionObject_setCustomDebugColor ] ---

    public static void nbtCollisionObject_setCustomDebugColor(long obj, long colorRGB) {
        long __functionAddress = Functions.CollisionObject_setCustomDebugColor;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, colorRGB, __functionAddress);
    }

    public static void btCollisionObject_setCustomDebugColor(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 colorRGB) {
        nbtCollisionObject_setCustomDebugColor(obj, colorRGB.address());
    }

    // --- [ btCollisionObject_setDeactivationTime ] ---

    public static void btCollisionObject_setDeactivationTime(@NativeType("void *") long obj, @NativeType("btScalar") float time) {
        long __functionAddress = Functions.CollisionObject_setDeactivationTime;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, time, __functionAddress);
    }

    // --- [ btCollisionObject_setFriction ] ---

    public static void btCollisionObject_setFriction(@NativeType("void *") long obj, @NativeType("btScalar") float frict) {
        long __functionAddress = Functions.CollisionObject_setFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, frict, __functionAddress);
    }

    // --- [ btCollisionObject_setHitFraction ] ---

    public static void btCollisionObject_setHitFraction(@NativeType("void *") long obj, @NativeType("btScalar") float hitFraction) {
        long __functionAddress = Functions.CollisionObject_setHitFraction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, hitFraction, __functionAddress);
    }

    // --- [ btCollisionObject_setIgnoreCollisionCheck ] ---

    public static void btCollisionObject_setIgnoreCollisionCheck(@NativeType("void *") long obj, @NativeType("void *") long co, @NativeType("bool") boolean ignoreCollisionCheck) {
        long __functionAddress = Functions.CollisionObject_setIgnoreCollisionCheck;
        if (CHECKS) {
            check(obj);
            check(co);
        }
        invokePPV(obj, co, ignoreCollisionCheck, __functionAddress);
    }

    // --- [ btCollisionObject_setInterpolationAngularVelocity ] ---

    public static void nbtCollisionObject_setInterpolationAngularVelocity(long obj, long angvel) {
        long __functionAddress = Functions.CollisionObject_setInterpolationAngularVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, angvel, __functionAddress);
    }

    public static void btCollisionObject_setInterpolationAngularVelocity(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 angvel) {
        nbtCollisionObject_setInterpolationAngularVelocity(obj, angvel.address());
    }

    // --- [ btCollisionObject_setInterpolationLinearVelocity ] ---

    public static void nbtCollisionObject_setInterpolationLinearVelocity(long obj, long linvel) {
        long __functionAddress = Functions.CollisionObject_setInterpolationLinearVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, linvel, __functionAddress);
    }

    public static void btCollisionObject_setInterpolationLinearVelocity(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 linvel) {
        nbtCollisionObject_setInterpolationLinearVelocity(obj, linvel.address());
    }

    // --- [ btCollisionObject_setInterpolationWorldTransform ] ---

    public static void nbtCollisionObject_setInterpolationWorldTransform(long obj, long trans) {
        long __functionAddress = Functions.CollisionObject_setInterpolationWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, trans, __functionAddress);
    }

    public static void btCollisionObject_setInterpolationWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform trans) {
        nbtCollisionObject_setInterpolationWorldTransform(obj, trans.address());
    }

    // --- [ btCollisionObject_setIslandTag ] ---

    public static void btCollisionObject_setIslandTag(@NativeType("void *") long obj, int tag) {
        long __functionAddress = Functions.CollisionObject_setIslandTag;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, tag, __functionAddress);
    }

    // --- [ btCollisionObject_setRestitution ] ---

    public static void btCollisionObject_setRestitution(@NativeType("void *") long obj, @NativeType("btScalar") float rest) {
        long __functionAddress = Functions.CollisionObject_setRestitution;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, rest, __functionAddress);
    }

    // --- [ btCollisionObject_setRollingFriction ] ---

    public static void btCollisionObject_setRollingFriction(@NativeType("void *") long obj, @NativeType("btScalar") float frict) {
        long __functionAddress = Functions.CollisionObject_setRollingFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, frict, __functionAddress);
    }

    // --- [ btCollisionObject_setSpinningFriction ] ---

    public static void btCollisionObject_setSpinningFriction(@NativeType("void *") long obj, @NativeType("btScalar") float frict) {
        long __functionAddress = Functions.CollisionObject_setSpinningFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, frict, __functionAddress);
    }

    // --- [ btCollisionObject_setWorldArrayIndex ] ---

    public static void btCollisionObject_setWorldArrayIndex(@NativeType("void *") long obj, int ix) {
        long __functionAddress = Functions.CollisionObject_setWorldArrayIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, ix, __functionAddress);
    }

    // --- [ btCollisionObject_setUserIndex ] ---

    public static void btCollisionObject_setUserIndex(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.CollisionObject_setUserIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btCollisionObject_setUserIndex2 ] ---

    public static void btCollisionObject_setUserIndex2(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.CollisionObject_setUserIndex2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btCollisionObject_setUserPointer ] ---

    public static void btCollisionObject_setUserPointer(@NativeType("void *") long obj, @NativeType("void *") long userPointer) {
        long __functionAddress = Functions.CollisionObject_setUserPointer;
        if (CHECKS) {
            check(obj);
            check(userPointer);
        }
        invokePPV(obj, userPointer, __functionAddress);
    }

    // --- [ btCollisionObject_setWorldTransform ] ---

    public static void nbtCollisionObject_setWorldTransform(long obj, long worldTrans) {
        long __functionAddress = Functions.CollisionObject_setWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, worldTrans, __functionAddress);
    }

    public static void btCollisionObject_setWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform worldTrans) {
        nbtCollisionObject_setWorldTransform(obj, worldTrans.address());
    }

    // --- [ btCollisionObject_delete ] ---

    public static void btCollisionObject_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionObject_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}