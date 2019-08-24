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

public class BTMultiBodyFixedConstraint {

    protected BTMultiBodyFixedConstraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MultiBodyFixedConstraint_new         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyFixedConstraint_new"),
            MultiBodyFixedConstraint_new2        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyFixedConstraint_new2"),
            MultiBodyFixedConstraint_getFrameInA = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyFixedConstraint_getFrameInA"),
            MultiBodyFixedConstraint_getFrameInB = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyFixedConstraint_getFrameInB"),
            MultiBodyFixedConstraint_getPivotInA = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyFixedConstraint_getPivotInA"),
            MultiBodyFixedConstraint_getPivotInB = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyFixedConstraint_getPivotInB"),
            MultiBodyFixedConstraint_setFrameInA = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyFixedConstraint_setFrameInA"),
            MultiBodyFixedConstraint_setFrameInB = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyFixedConstraint_setFrameInB"),
            MultiBodyFixedConstraint_setPivotInA = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyFixedConstraint_setPivotInA"),
            MultiBodyFixedConstraint_setPivotInB = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyFixedConstraint_setPivotInB");

    }

    // --- [ btMultiBodyFixedConstraint_new ] ---

    public static long nbtMultiBodyFixedConstraint_new(long body, int link, long bodyB, long pivotInA, long pivotInB, long frameInA, long frameInB) {
        long __functionAddress = Functions.MultiBodyFixedConstraint_new;
        if (CHECKS) {
            check(body);
            check(bodyB);
        }
        return invokePPPPPPP(body, link, bodyB, pivotInA, pivotInB, frameInA, frameInB, __functionAddress);
    }

    @NativeType("void *")
    public static long btMultiBodyFixedConstraint_new(@NativeType("void *") long body, int link, @NativeType("void *") long bodyB, @NativeType("btVector3 const *") ΒΤVector3 pivotInA, @NativeType("btVector3 const *") ΒΤVector3 pivotInB, @NativeType("btMatrix3x3 const *") BTMatrix3x3 frameInA, @NativeType("btMatrix3x3 const *") BTMatrix3x3 frameInB) {
        return nbtMultiBodyFixedConstraint_new(body, link, bodyB, pivotInA.address(), pivotInB.address(), frameInA.address(), frameInB.address());
    }

    // --- [ btMultiBodyFixedConstraint_new2 ] ---

    public static long nbtMultiBodyFixedConstraint_new2(long bodyA, int linkA, long bodyB, int linkB, long pivotInA, long pivotInB, long frameInA, long frameInB) {
        long __functionAddress = Functions.MultiBodyFixedConstraint_new2;
        if (CHECKS) {
            check(bodyA);
            check(bodyB);
        }
        return invokePPPPPPP(bodyA, linkA, bodyB, linkB, pivotInA, pivotInB, frameInA, frameInB, __functionAddress);
    }

    @NativeType("void *")
    public static long btMultiBodyFixedConstraint_new2(@NativeType("void *") long bodyA, int linkA, @NativeType("void *") long bodyB, int linkB, @NativeType("btVector3 const *") ΒΤVector3 pivotInA, @NativeType("btVector3 const *") ΒΤVector3 pivotInB, @NativeType("btMatrix3x3 const *") BTMatrix3x3 frameInA, @NativeType("btMatrix3x3 const *") BTMatrix3x3 frameInB) {
        return nbtMultiBodyFixedConstraint_new2(bodyA, linkA, bodyB, linkB, pivotInA.address(), pivotInB.address(), frameInA.address(), frameInB.address());
    }

    // --- [ btMultiBodyFixedConstraint_getFrameInA ] ---

    public static void nbtMultiBodyFixedConstraint_getFrameInA(long obj, long value) {
        long __functionAddress = Functions.MultiBodyFixedConstraint_getFrameInA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodyFixedConstraint_getFrameInA(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtMultiBodyFixedConstraint_getFrameInA(obj, value.address());
    }

    // --- [ btMultiBodyFixedConstraint_getFrameInB ] ---

    public static void nbtMultiBodyFixedConstraint_getFrameInB(long obj, long value) {
        long __functionAddress = Functions.MultiBodyFixedConstraint_getFrameInB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodyFixedConstraint_getFrameInB(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtMultiBodyFixedConstraint_getFrameInB(obj, value.address());
    }

    // --- [ btMultiBodyFixedConstraint_getPivotInA ] ---

    public static void nbtMultiBodyFixedConstraint_getPivotInA(long obj, long value) {
        long __functionAddress = Functions.MultiBodyFixedConstraint_getPivotInA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodyFixedConstraint_getPivotInA(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBodyFixedConstraint_getPivotInA(obj, value.address());
    }

    // --- [ btMultiBodyFixedConstraint_getPivotInB ] ---

    public static void nbtMultiBodyFixedConstraint_getPivotInB(long obj, long value) {
        long __functionAddress = Functions.MultiBodyFixedConstraint_getPivotInB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodyFixedConstraint_getPivotInB(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBodyFixedConstraint_getPivotInB(obj, value.address());
    }

    // --- [ btMultiBodyFixedConstraint_setFrameInA ] ---

    public static void nbtMultiBodyFixedConstraint_setFrameInA(long obj, long frameInA) {
        long __functionAddress = Functions.MultiBodyFixedConstraint_setFrameInA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, frameInA, __functionAddress);
    }

    public static void btMultiBodyFixedConstraint_setFrameInA(@NativeType("void *") long obj, @NativeType("btMatrix3x3 const *") BTMatrix3x3 frameInA) {
        nbtMultiBodyFixedConstraint_setFrameInA(obj, frameInA.address());
    }

    // --- [ btMultiBodyFixedConstraint_setFrameInB ] ---

    public static void nbtMultiBodyFixedConstraint_setFrameInB(long obj, long frameInB) {
        long __functionAddress = Functions.MultiBodyFixedConstraint_setFrameInB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, frameInB, __functionAddress);
    }

    public static void btMultiBodyFixedConstraint_setFrameInB(@NativeType("void *") long obj, @NativeType("btMatrix3x3 const *") BTMatrix3x3 frameInB) {
        nbtMultiBodyFixedConstraint_setFrameInB(obj, frameInB.address());
    }

    // --- [ btMultiBodyFixedConstraint_setPivotInA ] ---

    public static void nbtMultiBodyFixedConstraint_setPivotInA(long obj, long pivotInA) {
        long __functionAddress = Functions.MultiBodyFixedConstraint_setPivotInA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, pivotInA, __functionAddress);
    }

    public static void btMultiBodyFixedConstraint_setPivotInA(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 pivotInA) {
        nbtMultiBodyFixedConstraint_setPivotInA(obj, pivotInA.address());
    }

    // --- [ btMultiBodyFixedConstraint_setPivotInB ] ---

    public static void nbtMultiBodyFixedConstraint_setPivotInB(long obj, long pivotInB) {
        long __functionAddress = Functions.MultiBodyFixedConstraint_setPivotInB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, pivotInB, __functionAddress);
    }

    public static void btMultiBodyFixedConstraint_setPivotInB(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 pivotInB) {
        nbtMultiBodyFixedConstraint_setPivotInB(obj, pivotInB.address());
    }

}