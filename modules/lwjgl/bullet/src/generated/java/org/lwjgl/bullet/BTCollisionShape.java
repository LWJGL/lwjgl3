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

public class BTCollisionShape {

    protected BTCollisionShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CollisionShape_calculateLocalInertia                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_calculateLocalInertia"),
            CollisionShape_calculateSerializeBufferSize           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_calculateSerializeBufferSize"),
            CollisionShape_calculateTemporalAabb                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_calculateTemporalAabb"),
            CollisionShape_getAabb                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_getAabb"),
            CollisionShape_getAngularMotionDisc                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_getAngularMotionDisc"),
            CollisionShape_getAnisotropicRollingFrictionDirection = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_getAnisotropicRollingFrictionDirection"),
            CollisionShape_getBoundingSphere                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_getBoundingSphere"),
            CollisionShape_getContactBreakingThreshold            = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_getContactBreakingThreshold"),
            CollisionShape_getLocalScaling                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_getLocalScaling"),
            CollisionShape_getMargin                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_getMargin"),
            CollisionShape_getName                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_getName"),
            CollisionShape_getShapeType                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_getShapeType"),
            CollisionShape_getUserIndex                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_getUserIndex"),
            CollisionShape_getUserPointer                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_getUserPointer"),
            CollisionShape_isCompound                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_isCompound"),
            CollisionShape_isConcave                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_isConcave"),
            CollisionShape_isConvex                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_isConvex"),
            CollisionShape_isConvex2d                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_isConvex2d"),
            CollisionShape_isInfinite                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_isInfinite"),
            CollisionShape_isNonMoving                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_isNonMoving"),
            CollisionShape_isPolyhedral                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_isPolyhedral"),
            CollisionShape_isSoftBody                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_isSoftBody"),
            CollisionShape_serialize                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_serialize"),
            CollisionShape_serializeSingleShape                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_serializeSingleShape"),
            CollisionShape_setLocalScaling                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_setLocalScaling"),
            CollisionShape_setMargin                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_setMargin"),
            CollisionShape_setUserIndex                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_setUserIndex"),
            CollisionShape_setUserPointer                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_setUserPointer"),
            CollisionShape_delete                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionShape_delete");

    }

    // --- [ btCollisionShape_calculateLocalInertia ] ---

    public static void nbtCollisionShape_calculateLocalInertia(long obj, float mass, long inertia) {
        long __functionAddress = Functions.CollisionShape_calculateLocalInertia;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, mass, inertia, __functionAddress);
    }

    public static void btCollisionShape_calculateLocalInertia(@NativeType("void *") long obj, @NativeType("btScalar") float mass, @NativeType("btVector3 *") BTVector3 inertia) {
        nbtCollisionShape_calculateLocalInertia(obj, mass, inertia.address());
    }

    // --- [ btCollisionShape_calculateSerializeBufferSize ] ---

    public static int btCollisionShape_calculateSerializeBufferSize(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionShape_calculateSerializeBufferSize;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionShape_calculateTemporalAabb ] ---

    public static void nbtCollisionShape_calculateTemporalAabb(long obj, long curTrans, long linvel, long angvel, float timeStep, long temporalAabbMin, long temporalAabbMax) {
        long __functionAddress = Functions.CollisionShape_calculateTemporalAabb;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPPPV(obj, curTrans, linvel, angvel, timeStep, temporalAabbMin, temporalAabbMax, __functionAddress);
    }

    public static void btCollisionShape_calculateTemporalAabb(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform curTrans, @NativeType("btVector3 const *") BTVector3 linvel, @NativeType("btVector3 const *") BTVector3 angvel, @NativeType("btScalar") float timeStep, @NativeType("btVector3 *") BTVector3 temporalAabbMin, @NativeType("btVector3 *") BTVector3 temporalAabbMax) {
        nbtCollisionShape_calculateTemporalAabb(obj, curTrans.address(), linvel.address(), angvel.address(), timeStep, temporalAabbMin.address(), temporalAabbMax.address());
    }

    // --- [ btCollisionShape_getAabb ] ---

    public static void nbtCollisionShape_getAabb(long obj, long t, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.CollisionShape_getAabb;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPV(obj, t, aabbMin, aabbMax, __functionAddress);
    }

    public static void btCollisionShape_getAabb(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform t, @NativeType("btVector3 *") BTVector3 aabbMin, @NativeType("btVector3 *") BTVector3 aabbMax) {
        nbtCollisionShape_getAabb(obj, t.address(), aabbMin.address(), aabbMax.address());
    }

    // --- [ btCollisionShape_getAngularMotionDisc ] ---

    @NativeType("btScalar")
    public static float btCollisionShape_getAngularMotionDisc(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionShape_getAngularMotionDisc;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionShape_getAnisotropicRollingFrictionDirection ] ---

    public static void nbtCollisionShape_getAnisotropicRollingFrictionDirection(long obj, long value) {
        long __functionAddress = Functions.CollisionShape_getAnisotropicRollingFrictionDirection;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionShape_getAnisotropicRollingFrictionDirection(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionShape_getAnisotropicRollingFrictionDirection(obj, value.address());
    }

    // --- [ btCollisionShape_getBoundingSphere ] ---

    public static void nbtCollisionShape_getBoundingSphere(long obj, long center, long radius) {
        long __functionAddress = Functions.CollisionShape_getBoundingSphere;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, center, radius, __functionAddress);
    }

    public static void btCollisionShape_getBoundingSphere(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 center, @NativeType("btScalar *") FloatBuffer radius) {
        if (CHECKS) {
            check(radius, 1);
        }
        nbtCollisionShape_getBoundingSphere(obj, center.address(), memAddress(radius));
    }

    // --- [ btCollisionShape_getContactBreakingThreshold ] ---

    @NativeType("btScalar")
    public static float btCollisionShape_getContactBreakingThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float defaultContactThresholdFactor) {
        long __functionAddress = Functions.CollisionShape_getContactBreakingThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, defaultContactThresholdFactor, __functionAddress);
    }

    // --- [ btCollisionShape_getLocalScaling ] ---

    public static void nbtCollisionShape_getLocalScaling(long obj, long value) {
        long __functionAddress = Functions.CollisionShape_getLocalScaling;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionShape_getLocalScaling(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionShape_getLocalScaling(obj, value.address());
    }

    // --- [ btCollisionShape_getMargin ] ---

    @NativeType("btScalar")
    public static float btCollisionShape_getMargin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionShape_getMargin;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionShape_getName ] ---

    public static long nbtCollisionShape_getName(long obj) {
        long __functionAddress = Functions.CollisionShape_getName;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String btCollisionShape_getName(@NativeType("void *") long obj) {
        long __result = nbtCollisionShape_getName(obj);
        return memUTF8Safe(__result);
    }

    // --- [ btCollisionShape_getShapeType ] ---

    public static int btCollisionShape_getShapeType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionShape_getShapeType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionShape_getUserIndex ] ---

    public static int btCollisionShape_getUserIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionShape_getUserIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionShape_getUserPointer ] ---

    @NativeType("void *")
    public static long btCollisionShape_getUserPointer(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionShape_getUserPointer;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionShape_isCompound ] ---

    @NativeType("bool")
    public static boolean btCollisionShape_isCompound(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionShape_isCompound;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionShape_isConcave ] ---

    @NativeType("bool")
    public static boolean btCollisionShape_isConcave(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionShape_isConcave;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionShape_isConvex ] ---

    @NativeType("bool")
    public static boolean btCollisionShape_isConvex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionShape_isConvex;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionShape_isConvex2d ] ---

    @NativeType("bool")
    public static boolean btCollisionShape_isConvex2d(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionShape_isConvex2d;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionShape_isInfinite ] ---

    @NativeType("bool")
    public static boolean btCollisionShape_isInfinite(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionShape_isInfinite;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionShape_isNonMoving ] ---

    @NativeType("bool")
    public static boolean btCollisionShape_isNonMoving(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionShape_isNonMoving;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionShape_isPolyhedral ] ---

    @NativeType("bool")
    public static boolean btCollisionShape_isPolyhedral(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionShape_isPolyhedral;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionShape_isSoftBody ] ---

    @NativeType("bool")
    public static boolean btCollisionShape_isSoftBody(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionShape_isSoftBody;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionShape_serialize ] ---

    public static long nbtCollisionShape_serialize(long obj, long dataBuffer, long serializer) {
        long __functionAddress = Functions.CollisionShape_serialize;
        if (CHECKS) {
            check(obj);
            check(dataBuffer);
            check(serializer);
        }
        return invokePPPP(obj, dataBuffer, serializer, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String btCollisionShape_serialize(@NativeType("void *") long obj, @NativeType("void *") long dataBuffer, @NativeType("void *") long serializer) {
        long __result = nbtCollisionShape_serialize(obj, dataBuffer, serializer);
        return memUTF8Safe(__result);
    }

    // --- [ btCollisionShape_serializeSingleShape ] ---

    public static void btCollisionShape_serializeSingleShape(@NativeType("void *") long obj, @NativeType("void *") long serializer) {
        long __functionAddress = Functions.CollisionShape_serializeSingleShape;
        if (CHECKS) {
            check(obj);
            check(serializer);
        }
        invokePPV(obj, serializer, __functionAddress);
    }

    // --- [ btCollisionShape_setLocalScaling ] ---

    public static void nbtCollisionShape_setLocalScaling(long obj, long scaling) {
        long __functionAddress = Functions.CollisionShape_setLocalScaling;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, scaling, __functionAddress);
    }

    public static void btCollisionShape_setLocalScaling(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 scaling) {
        nbtCollisionShape_setLocalScaling(obj, scaling.address());
    }

    // --- [ btCollisionShape_setMargin ] ---

    public static void btCollisionShape_setMargin(@NativeType("void *") long obj, @NativeType("btScalar") float margin) {
        long __functionAddress = Functions.CollisionShape_setMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, margin, __functionAddress);
    }

    // --- [ btCollisionShape_setUserIndex ] ---

    public static void btCollisionShape_setUserIndex(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.CollisionShape_setUserIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btCollisionShape_setUserPointer ] ---

    public static void btCollisionShape_setUserPointer(@NativeType("void *") long obj, @NativeType("void *") long userPtr) {
        long __functionAddress = Functions.CollisionShape_setUserPointer;
        if (CHECKS) {
            check(obj);
            check(userPtr);
        }
        invokePPV(obj, userPtr, __functionAddress);
    }

    // --- [ btCollisionShape_delete ] ---

    public static void btCollisionShape_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionShape_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}