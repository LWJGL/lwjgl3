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

public class BTGearConstraint {

    protected BTGearConstraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GearConstraint_new      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGearConstraint_new"),
            GearConstraint_getAxisA = apiGetFunctionAddress(LibBullet.getLibrary(), "btGearConstraint_getAxisA"),
            GearConstraint_getAxisB = apiGetFunctionAddress(LibBullet.getLibrary(), "btGearConstraint_getAxisB"),
            GearConstraint_getRatio = apiGetFunctionAddress(LibBullet.getLibrary(), "btGearConstraint_getRatio"),
            GearConstraint_setAxisA = apiGetFunctionAddress(LibBullet.getLibrary(), "btGearConstraint_setAxisA"),
            GearConstraint_setAxisB = apiGetFunctionAddress(LibBullet.getLibrary(), "btGearConstraint_setAxisB"),
            GearConstraint_setRatio = apiGetFunctionAddress(LibBullet.getLibrary(), "btGearConstraint_setRatio");

    }

    // --- [ btGearConstraint_new ] ---

    public static long nbtGearConstraint_new(long rbA, long rbB, long axisInA, long axisInB, float ratio) {
        long __functionAddress = Functions.GearConstraint_new;
        if (CHECKS) {
            check(rbA);
            check(rbB);
        }
        return invokePPPPP(rbA, rbB, axisInA, axisInB, ratio, __functionAddress);
    }

    @NativeType("void *")
    public static long btGearConstraint_new(@NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btVector3 const *") ΒΤVector3 axisInA, @NativeType("btVector3 const *") ΒΤVector3 axisInB, @NativeType("btScalar") float ratio) {
        return nbtGearConstraint_new(rbA, rbB, axisInA.address(), axisInB.address(), ratio);
    }

    // --- [ btGearConstraint_getAxisA ] ---

    public static void nbtGearConstraint_getAxisA(long obj, long value) {
        long __functionAddress = Functions.GearConstraint_getAxisA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGearConstraint_getAxisA(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtGearConstraint_getAxisA(obj, value.address());
    }

    // --- [ btGearConstraint_getAxisB ] ---

    public static void nbtGearConstraint_getAxisB(long obj, long value) {
        long __functionAddress = Functions.GearConstraint_getAxisB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGearConstraint_getAxisB(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtGearConstraint_getAxisB(obj, value.address());
    }

    // --- [ btGearConstraint_getRatio ] ---

    @NativeType("btScalar")
    public static float btGearConstraint_getRatio(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GearConstraint_getRatio;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btGearConstraint_setAxisA ] ---

    public static void nbtGearConstraint_setAxisA(long obj, long axisA) {
        long __functionAddress = Functions.GearConstraint_setAxisA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, axisA, __functionAddress);
    }

    public static void btGearConstraint_setAxisA(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 axisA) {
        nbtGearConstraint_setAxisA(obj, axisA.address());
    }

    // --- [ btGearConstraint_setAxisB ] ---

    public static void nbtGearConstraint_setAxisB(long obj, long axisB) {
        long __functionAddress = Functions.GearConstraint_setAxisB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, axisB, __functionAddress);
    }

    public static void btGearConstraint_setAxisB(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 axisB) {
        nbtGearConstraint_setAxisB(obj, axisB.address());
    }

    // --- [ btGearConstraint_setRatio ] ---

    public static void btGearConstraint_setRatio(@NativeType("void *") long obj, @NativeType("btScalar") float ratio) {
        long __functionAddress = Functions.GearConstraint_setRatio;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, ratio, __functionAddress);
    }

}