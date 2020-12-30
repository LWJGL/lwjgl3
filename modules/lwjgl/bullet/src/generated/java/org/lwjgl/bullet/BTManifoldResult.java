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

public class BTManifoldResult {

    protected BTManifoldResult() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ManifoldResult_new                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_new"),
            ManifoldResult_new2                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_new2"),
            ManifoldResult_calculateCombinedContactDamping   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_calculateCombinedContactDamping"),
            ManifoldResult_calculateCombinedContactStiffness = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_calculateCombinedContactStiffness"),
            ManifoldResult_calculateCombinedFriction         = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_calculateCombinedFriction"),
            ManifoldResult_calculateCombinedRestitution      = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_calculateCombinedRestitution"),
            ManifoldResult_calculateCombinedRollingFriction  = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_calculateCombinedRollingFriction"),
            ManifoldResult_getClosestPointDistanceThreshold  = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_getClosestPointDistanceThreshold"),
            ManifoldResult_getBody0Internal                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_getBody0Internal"),
            ManifoldResult_getBody0Wrap                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_getBody0Wrap"),
            ManifoldResult_getBody1Internal                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_getBody1Internal"),
            ManifoldResult_getBody1Wrap                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_getBody1Wrap"),
            ManifoldResult_getPersistentManifold             = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_getPersistentManifold"),
            ManifoldResult_refreshContactPoints              = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_refreshContactPoints"),
            ManifoldResult_setBody0Wrap                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_setBody0Wrap"),
            ManifoldResult_setBody1Wrap                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_setBody1Wrap"),
            ManifoldResult_setClosestPointDistanceThreshold  = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_setClosestPointDistanceThreshold"),
            ManifoldResult_setPersistentManifold             = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldResult_setPersistentManifold");

    }

    // --- [ btManifoldResult_new ] ---

    @NativeType("void *")
    public static long btManifoldResult_new() {
        long __functionAddress = Functions.ManifoldResult_new;
        return invokeP(__functionAddress);
    }

    // --- [ btManifoldResult_new2 ] ---

    @NativeType("void *")
    public static long btManifoldResult_new2(@NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap) {
        long __functionAddress = Functions.ManifoldResult_new2;
        if (CHECKS) {
            check(body0Wrap);
            check(body1Wrap);
        }
        return invokePPP(body0Wrap, body1Wrap, __functionAddress);
    }

    // --- [ btManifoldResult_calculateCombinedContactDamping ] ---

    @NativeType("btScalar")
    public static float btManifoldResult_calculateCombinedContactDamping(@NativeType("void *") long body0, @NativeType("void *") long body1) {
        long __functionAddress = Functions.ManifoldResult_calculateCombinedContactDamping;
        if (CHECKS) {
            check(body0);
            check(body1);
        }
        return invokePPF(body0, body1, __functionAddress);
    }

    // --- [ btManifoldResult_calculateCombinedContactStiffness ] ---

    @NativeType("btScalar")
    public static float btManifoldResult_calculateCombinedContactStiffness(@NativeType("void *") long body0, @NativeType("void *") long body1) {
        long __functionAddress = Functions.ManifoldResult_calculateCombinedContactStiffness;
        if (CHECKS) {
            check(body0);
            check(body1);
        }
        return invokePPF(body0, body1, __functionAddress);
    }

    // --- [ btManifoldResult_calculateCombinedFriction ] ---

    @NativeType("btScalar")
    public static float btManifoldResult_calculateCombinedFriction(@NativeType("void *") long body0, @NativeType("void *") long body1) {
        long __functionAddress = Functions.ManifoldResult_calculateCombinedFriction;
        if (CHECKS) {
            check(body0);
            check(body1);
        }
        return invokePPF(body0, body1, __functionAddress);
    }

    // --- [ btManifoldResult_calculateCombinedRestitution ] ---

    @NativeType("btScalar")
    public static float btManifoldResult_calculateCombinedRestitution(@NativeType("void *") long body0, @NativeType("void *") long body1) {
        long __functionAddress = Functions.ManifoldResult_calculateCombinedRestitution;
        if (CHECKS) {
            check(body0);
            check(body1);
        }
        return invokePPF(body0, body1, __functionAddress);
    }

    // --- [ btManifoldResult_calculateCombinedRollingFriction ] ---

    @NativeType("btScalar")
    public static float btManifoldResult_calculateCombinedRollingFriction(@NativeType("void *") long body0, @NativeType("void *") long body1) {
        long __functionAddress = Functions.ManifoldResult_calculateCombinedRollingFriction;
        if (CHECKS) {
            check(body0);
            check(body1);
        }
        return invokePPF(body0, body1, __functionAddress);
    }

    // --- [ btManifoldResult_getClosestPointDistanceThreshold ] ---

    @NativeType("btScalar")
    public static float btManifoldResult_getClosestPointDistanceThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldResult_getClosestPointDistanceThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldResult_getBody0Internal ] ---

    @NativeType("void *")
    public static long btManifoldResult_getBody0Internal(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldResult_getBody0Internal;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btManifoldResult_getBody0Wrap ] ---

    @NativeType("void *")
    public static long btManifoldResult_getBody0Wrap(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldResult_getBody0Wrap;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btManifoldResult_getBody1Internal ] ---

    @NativeType("void *")
    public static long btManifoldResult_getBody1Internal(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldResult_getBody1Internal;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btManifoldResult_getBody1Wrap ] ---

    @NativeType("void *")
    public static long btManifoldResult_getBody1Wrap(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldResult_getBody1Wrap;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btManifoldResult_getPersistentManifold ] ---

    @NativeType("void *")
    public static long btManifoldResult_getPersistentManifold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldResult_getPersistentManifold;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btManifoldResult_refreshContactPoints ] ---

    public static void btManifoldResult_refreshContactPoints(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldResult_refreshContactPoints;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btManifoldResult_setBody0Wrap ] ---

    public static void btManifoldResult_setBody0Wrap(@NativeType("void *") long obj, @NativeType("void *") long obj0Wrap) {
        long __functionAddress = Functions.ManifoldResult_setBody0Wrap;
        if (CHECKS) {
            check(obj);
            check(obj0Wrap);
        }
        invokePPV(obj, obj0Wrap, __functionAddress);
    }

    // --- [ btManifoldResult_setBody1Wrap ] ---

    public static void btManifoldResult_setBody1Wrap(@NativeType("void *") long obj, @NativeType("void *") long obj1Wrap) {
        long __functionAddress = Functions.ManifoldResult_setBody1Wrap;
        if (CHECKS) {
            check(obj);
            check(obj1Wrap);
        }
        invokePPV(obj, obj1Wrap, __functionAddress);
    }

    // --- [ btManifoldResult_setClosestPointDistanceThreshold ] ---

    public static void btManifoldResult_setClosestPointDistanceThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ManifoldResult_setClosestPointDistanceThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldResult_setPersistentManifold ] ---

    public static void btManifoldResult_setPersistentManifold(@NativeType("void *") long obj, @NativeType("void *") long manifoldPtr) {
        long __functionAddress = Functions.ManifoldResult_setPersistentManifold;
        if (CHECKS) {
            check(obj);
            check(manifoldPtr);
        }
        invokePPV(obj, manifoldPtr, __functionAddress);
    }

}