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

public class BTConvexCast {

    protected BTConvexCast() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ConvexCast_CastResult_new                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_new"),
            ConvexCast_CastResult_DebugDraw             = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_DebugDraw"),
            ConvexCast_CastResult_drawCoordSystem       = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_drawCoordSystem"),
            ConvexCast_CastResult_getAllowedPenetration = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_getAllowedPenetration"),
            ConvexCast_CastResult_getDebugDrawer        = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_getDebugDrawer"),
            ConvexCast_CastResult_getFraction           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_getFraction"),
            ConvexCast_CastResult_getHitPoint           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_getHitPoint"),
            ConvexCast_CastResult_getHitTransformA      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_getHitTransformA"),
            ConvexCast_CastResult_getHitTransformB      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_getHitTransformB"),
            ConvexCast_CastResult_getNormal             = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_getNormal"),
            ConvexCast_CastResult_reportFailure         = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_reportFailure"),
            ConvexCast_CastResult_setAllowedPenetration = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_setAllowedPenetration"),
            ConvexCast_CastResult_setDebugDrawer        = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_setDebugDrawer"),
            ConvexCast_CastResult_setFraction           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_setFraction"),
            ConvexCast_CastResult_setHitPoint           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_setHitPoint"),
            ConvexCast_CastResult_setHitTransformA      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_setHitTransformA"),
            ConvexCast_CastResult_setHitTransformB      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_setHitTransformB"),
            ConvexCast_CastResult_setNormal             = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_setNormal"),
            ConvexCast_CastResult_delete                = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_CastResult_delete"),
            ConvexCast_calcTimeOfImpact                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_calcTimeOfImpact"),
            ConvexCast_delete                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexCast_delete");

    }

    // --- [ btConvexCast_CastResult_new ] ---

    @NativeType("void *")
    public static long btConvexCast_CastResult_new() {
        long __functionAddress = Functions.ConvexCast_CastResult_new;
        return invokeP(__functionAddress);
    }

    // --- [ btConvexCast_CastResult_DebugDraw ] ---

    public static void btConvexCast_CastResult_DebugDraw(@NativeType("void *") long obj, @NativeType("btScalar") float fraction) {
        long __functionAddress = Functions.ConvexCast_CastResult_DebugDraw;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, fraction, __functionAddress);
    }

    // --- [ btConvexCast_CastResult_drawCoordSystem ] ---

    public static void nbtConvexCast_CastResult_drawCoordSystem(long obj, long trans) {
        long __functionAddress = Functions.ConvexCast_CastResult_drawCoordSystem;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, trans, __functionAddress);
    }

    public static void btConvexCast_CastResult_drawCoordSystem(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform trans) {
        nbtConvexCast_CastResult_drawCoordSystem(obj, trans.address());
    }

    // --- [ btConvexCast_CastResult_getAllowedPenetration ] ---

    @NativeType("btScalar")
    public static float btConvexCast_CastResult_getAllowedPenetration(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexCast_CastResult_getAllowedPenetration;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConvexCast_CastResult_getDebugDrawer ] ---

    @NativeType("void *")
    public static long btConvexCast_CastResult_getDebugDrawer(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexCast_CastResult_getDebugDrawer;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btConvexCast_CastResult_getFraction ] ---

    @NativeType("btScalar")
    public static float btConvexCast_CastResult_getFraction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexCast_CastResult_getFraction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConvexCast_CastResult_getHitPoint ] ---

    public static void nbtConvexCast_CastResult_getHitPoint(long obj, long value) {
        long __functionAddress = Functions.ConvexCast_CastResult_getHitPoint;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexCast_CastResult_getHitPoint(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtConvexCast_CastResult_getHitPoint(obj, value.address());
    }

    // --- [ btConvexCast_CastResult_getHitTransformA ] ---

    public static void nbtConvexCast_CastResult_getHitTransformA(long obj, long value) {
        long __functionAddress = Functions.ConvexCast_CastResult_getHitTransformA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexCast_CastResult_getHitTransformA(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtConvexCast_CastResult_getHitTransformA(obj, value.address());
    }

    // --- [ btConvexCast_CastResult_getHitTransformB ] ---

    public static void nbtConvexCast_CastResult_getHitTransformB(long obj, long value) {
        long __functionAddress = Functions.ConvexCast_CastResult_getHitTransformB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexCast_CastResult_getHitTransformB(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtConvexCast_CastResult_getHitTransformB(obj, value.address());
    }

    // --- [ btConvexCast_CastResult_getNormal ] ---

    public static void nbtConvexCast_CastResult_getNormal(long obj, long value) {
        long __functionAddress = Functions.ConvexCast_CastResult_getNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexCast_CastResult_getNormal(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtConvexCast_CastResult_getNormal(obj, value.address());
    }

    // --- [ btConvexCast_CastResult_reportFailure ] ---

    public static void btConvexCast_CastResult_reportFailure(@NativeType("void *") long obj, int errNo, int numIterations) {
        long __functionAddress = Functions.ConvexCast_CastResult_reportFailure;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, errNo, numIterations, __functionAddress);
    }

    // --- [ btConvexCast_CastResult_setAllowedPenetration ] ---

    public static void btConvexCast_CastResult_setAllowedPenetration(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ConvexCast_CastResult_setAllowedPenetration;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btConvexCast_CastResult_setDebugDrawer ] ---

    public static void btConvexCast_CastResult_setDebugDrawer(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.ConvexCast_CastResult_setDebugDrawer;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btConvexCast_CastResult_setFraction ] ---

    public static void btConvexCast_CastResult_setFraction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ConvexCast_CastResult_setFraction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btConvexCast_CastResult_setHitPoint ] ---

    public static void nbtConvexCast_CastResult_setHitPoint(long obj, long value) {
        long __functionAddress = Functions.ConvexCast_CastResult_setHitPoint;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexCast_CastResult_setHitPoint(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtConvexCast_CastResult_setHitPoint(obj, value.address());
    }

    // --- [ btConvexCast_CastResult_setHitTransformA ] ---

    public static void nbtConvexCast_CastResult_setHitTransformA(long obj, long value) {
        long __functionAddress = Functions.ConvexCast_CastResult_setHitTransformA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexCast_CastResult_setHitTransformA(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform value) {
        nbtConvexCast_CastResult_setHitTransformA(obj, value.address());
    }

    // --- [ btConvexCast_CastResult_setHitTransformB ] ---

    public static void nbtConvexCast_CastResult_setHitTransformB(long obj, long value) {
        long __functionAddress = Functions.ConvexCast_CastResult_setHitTransformB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexCast_CastResult_setHitTransformB(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform value) {
        nbtConvexCast_CastResult_setHitTransformB(obj, value.address());
    }

    // --- [ btConvexCast_CastResult_setNormal ] ---

    public static void nbtConvexCast_CastResult_setNormal(long obj, long value) {
        long __functionAddress = Functions.ConvexCast_CastResult_setNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexCast_CastResult_setNormal(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtConvexCast_CastResult_setNormal(obj, value.address());
    }

    // --- [ btConvexCast_CastResult_delete ] ---

    public static void btConvexCast_CastResult_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexCast_CastResult_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btConvexCast_calcTimeOfImpact ] ---

    public static boolean nbtConvexCast_calcTimeOfImpact(long obj, long fromA, long toA, long fromB, long toB, long result) {
        long __functionAddress = Functions.ConvexCast_calcTimeOfImpact;
        if (CHECKS) {
            check(obj);
            check(result);
        }
        return invokePPPPPPZ(obj, fromA, toA, fromB, toB, result, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btConvexCast_calcTimeOfImpact(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform fromA, @NativeType("btTransform const *") BTTransform toA, @NativeType("btTransform const *") BTTransform fromB, @NativeType("btTransform const *") BTTransform toB, @NativeType("void *") long result) {
        return nbtConvexCast_calcTimeOfImpact(obj, fromA.address(), toA.address(), fromB.address(), toB.address(), result);
    }

    // --- [ btConvexCast_delete ] ---

    public static void btConvexCast_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexCast_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}