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

public class BTCollisionAlgorithm {

    protected BTCollisionAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CollisionAlgorithmConstructionInfo_new            = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithmConstructionInfo_new"),
            CollisionAlgorithmConstructionInfo_new2           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithmConstructionInfo_new2"),
            CollisionAlgorithmConstructionInfo_getDispatcher1 = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithmConstructionInfo_getDispatcher1"),
            CollisionAlgorithmConstructionInfo_getManifold    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithmConstructionInfo_getManifold"),
            CollisionAlgorithmConstructionInfo_setDispatcher1 = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithmConstructionInfo_setDispatcher1"),
            CollisionAlgorithmConstructionInfo_setManifold    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithmConstructionInfo_setManifold"),
            CollisionAlgorithmConstructionInfo_delete         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithmConstructionInfo_delete"),
            CollisionAlgorithm_calculateTimeOfImpact          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithm_calculateTimeOfImpact"),
            CollisionAlgorithm_getAllContactManifolds         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithm_getAllContactManifolds"),
            CollisionAlgorithm_processCollision               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithm_processCollision"),
            CollisionAlgorithm_delete                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionAlgorithm_delete");

    }

    // --- [ btCollisionAlgorithmConstructionInfo_new ] ---

    @NativeType("void *")
    public static long btCollisionAlgorithmConstructionInfo_new() {
        long __functionAddress = Functions.CollisionAlgorithmConstructionInfo_new;
        return invokeP(__functionAddress);
    }

    // --- [ btCollisionAlgorithmConstructionInfo_new2 ] ---

    @NativeType("void *")
    public static long btCollisionAlgorithmConstructionInfo_new2(@NativeType("void *") long dispatcher, int temp) {
        long __functionAddress = Functions.CollisionAlgorithmConstructionInfo_new2;
        if (CHECKS) {
            check(dispatcher);
        }
        return invokePP(dispatcher, temp, __functionAddress);
    }

    // --- [ btCollisionAlgorithmConstructionInfo_getDispatcher1 ] ---

    @NativeType("void *")
    public static long btCollisionAlgorithmConstructionInfo_getDispatcher1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionAlgorithmConstructionInfo_getDispatcher1;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionAlgorithmConstructionInfo_getManifold ] ---

    @NativeType("void *")
    public static long btCollisionAlgorithmConstructionInfo_getManifold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionAlgorithmConstructionInfo_getManifold;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionAlgorithmConstructionInfo_setDispatcher1 ] ---

    public static void btCollisionAlgorithmConstructionInfo_setDispatcher1(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.CollisionAlgorithmConstructionInfo_setDispatcher1;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btCollisionAlgorithmConstructionInfo_setManifold ] ---

    public static void btCollisionAlgorithmConstructionInfo_setManifold(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.CollisionAlgorithmConstructionInfo_setManifold;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btCollisionAlgorithmConstructionInfo_delete ] ---

    public static void btCollisionAlgorithmConstructionInfo_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionAlgorithmConstructionInfo_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCollisionAlgorithm_calculateTimeOfImpact ] ---

    @NativeType("btScalar")
    public static float btCollisionAlgorithm_calculateTimeOfImpact(@NativeType("void *") long obj, @NativeType("void *") long body0, @NativeType("void *") long body1, @NativeType("void *") long dispatchInfo, @NativeType("void *") long resultOut) {
        long __functionAddress = Functions.CollisionAlgorithm_calculateTimeOfImpact;
        if (CHECKS) {
            check(obj);
            check(body0);
            check(body1);
            check(dispatchInfo);
            check(resultOut);
        }
        return invokePPPPPF(obj, body0, body1, dispatchInfo, resultOut, __functionAddress);
    }

    // --- [ btCollisionAlgorithm_getAllContactManifolds ] ---

    public static void btCollisionAlgorithm_getAllContactManifolds(@NativeType("void *") long obj, @NativeType("void *") long manifoldArray) {
        long __functionAddress = Functions.CollisionAlgorithm_getAllContactManifolds;
        if (CHECKS) {
            check(obj);
            check(manifoldArray);
        }
        invokePPV(obj, manifoldArray, __functionAddress);
    }

    // --- [ btCollisionAlgorithm_processCollision ] ---

    public static void btCollisionAlgorithm_processCollision(@NativeType("void *") long obj, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("void *") long dispatchInfo, @NativeType("void *") long resultOut) {
        long __functionAddress = Functions.CollisionAlgorithm_processCollision;
        if (CHECKS) {
            check(obj);
            check(body0Wrap);
            check(body1Wrap);
            check(dispatchInfo);
            check(resultOut);
        }
        invokePPPPPV(obj, body0Wrap, body1Wrap, dispatchInfo, resultOut, __functionAddress);
    }

    // --- [ btCollisionAlgorithm_delete ] ---

    public static void btCollisionAlgorithm_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionAlgorithm_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}