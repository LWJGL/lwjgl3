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

public class BTGeneric6DofSpringConstraint {

    protected BTGeneric6DofSpringConstraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Generic6DofSpringConstraint_new                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpringConstraint_new"),
            Generic6DofSpringConstraint_new2                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpringConstraint_new2"),
            Generic6DofSpringConstraint_enableSpring         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpringConstraint_enableSpring"),
            Generic6DofSpringConstraint_getDamping           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpringConstraint_getDamping"),
            Generic6DofSpringConstraint_getEquilibriumPoint  = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpringConstraint_getEquilibriumPoint"),
            Generic6DofSpringConstraint_getStiffness         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpringConstraint_getStiffness"),
            Generic6DofSpringConstraint_isSpringEnabled      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpringConstraint_isSpringEnabled"),
            Generic6DofSpringConstraint_setDamping           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpringConstraint_setDamping"),
            Generic6DofSpringConstraint_setEquilibriumPoint  = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpringConstraint_setEquilibriumPoint"),
            Generic6DofSpringConstraint_setEquilibriumPoint2 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpringConstraint_setEquilibriumPoint2"),
            Generic6DofSpringConstraint_setEquilibriumPoint3 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpringConstraint_setEquilibriumPoint3"),
            Generic6DofSpringConstraint_setStiffness         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGeneric6DofSpringConstraint_setStiffness");

    }

    // --- [ btGeneric6DofSpringConstraint_new ] ---

    public static long nbtGeneric6DofSpringConstraint_new(long rbA, long rbB, long frameInA, long frameInB, boolean useLinearReferenceFrameA) {
        long __functionAddress = Functions.Generic6DofSpringConstraint_new;
        if (CHECKS) {
            check(rbA);
            check(rbB);
        }
        return invokePPPPP(rbA, rbB, frameInA, frameInB, useLinearReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btGeneric6DofSpringConstraint_new(@NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform frameInA, @NativeType("btTransform const *") BTTransform frameInB, @NativeType("bool") boolean useLinearReferenceFrameA) {
        return nbtGeneric6DofSpringConstraint_new(rbA, rbB, frameInA.address(), frameInB.address(), useLinearReferenceFrameA);
    }

    // --- [ btGeneric6DofSpringConstraint_new2 ] ---

    public static long nbtGeneric6DofSpringConstraint_new2(long rbB, long frameInB, boolean useLinearReferenceFrameB) {
        long __functionAddress = Functions.Generic6DofSpringConstraint_new2;
        if (CHECKS) {
            check(rbB);
        }
        return invokePPP(rbB, frameInB, useLinearReferenceFrameB, __functionAddress);
    }

    @NativeType("void *")
    public static long btGeneric6DofSpringConstraint_new2(@NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform frameInB, @NativeType("bool") boolean useLinearReferenceFrameB) {
        return nbtGeneric6DofSpringConstraint_new2(rbB, frameInB.address(), useLinearReferenceFrameB);
    }

    // --- [ btGeneric6DofSpringConstraint_enableSpring ] ---

    public static void btGeneric6DofSpringConstraint_enableSpring(@NativeType("void *") long obj, int index, @NativeType("bool") boolean onOff) {
        long __functionAddress = Functions.Generic6DofSpringConstraint_enableSpring;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, onOff, __functionAddress);
    }

    // --- [ btGeneric6DofSpringConstraint_getDamping ] ---

    @NativeType("btScalar")
    public static float btGeneric6DofSpringConstraint_getDamping(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.Generic6DofSpringConstraint_getDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, index, __functionAddress);
    }

    // --- [ btGeneric6DofSpringConstraint_getEquilibriumPoint ] ---

    @NativeType("btScalar")
    public static float btGeneric6DofSpringConstraint_getEquilibriumPoint(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.Generic6DofSpringConstraint_getEquilibriumPoint;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, index, __functionAddress);
    }

    // --- [ btGeneric6DofSpringConstraint_getStiffness ] ---

    @NativeType("btScalar")
    public static float btGeneric6DofSpringConstraint_getStiffness(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.Generic6DofSpringConstraint_getStiffness;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, index, __functionAddress);
    }

    // --- [ btGeneric6DofSpringConstraint_isSpringEnabled ] ---

    @NativeType("bool")
    public static boolean btGeneric6DofSpringConstraint_isSpringEnabled(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.Generic6DofSpringConstraint_isSpringEnabled;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, index, __functionAddress);
    }

    // --- [ btGeneric6DofSpringConstraint_setDamping ] ---

    public static void btGeneric6DofSpringConstraint_setDamping(@NativeType("void *") long obj, int index, @NativeType("btScalar") float damping) {
        long __functionAddress = Functions.Generic6DofSpringConstraint_setDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, damping, __functionAddress);
    }

    // --- [ btGeneric6DofSpringConstraint_setEquilibriumPoint ] ---

    public static void btGeneric6DofSpringConstraint_setEquilibriumPoint(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Generic6DofSpringConstraint_setEquilibriumPoint;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGeneric6DofSpringConstraint_setEquilibriumPoint2 ] ---

    public static void btGeneric6DofSpringConstraint_setEquilibriumPoint2(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.Generic6DofSpringConstraint_setEquilibriumPoint2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btGeneric6DofSpringConstraint_setEquilibriumPoint3 ] ---

    public static void btGeneric6DofSpringConstraint_setEquilibriumPoint3(@NativeType("void *") long obj, int index, @NativeType("btScalar") float val) {
        long __functionAddress = Functions.Generic6DofSpringConstraint_setEquilibriumPoint3;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, val, __functionAddress);
    }

    // --- [ btGeneric6DofSpringConstraint_setStiffness ] ---

    public static void btGeneric6DofSpringConstraint_setStiffness(@NativeType("void *") long obj, int index, @NativeType("btScalar") float stiffness) {
        long __functionAddress = Functions.Generic6DofSpringConstraint_setStiffness;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, stiffness, __functionAddress);
    }

}