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

public class BTMultiBodySliderConstraint {

    protected BTMultiBodySliderConstraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MultiBodySliderConstraint_new          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySliderConstraint_new"),
            MultiBodySliderConstraint_new2         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySliderConstraint_new2"),
            MultiBodySliderConstraint_getFrameInA  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySliderConstraint_getFrameInA"),
            MultiBodySliderConstraint_getFrameInB  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySliderConstraint_getFrameInB"),
            MultiBodySliderConstraint_getJointAxis = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySliderConstraint_getJointAxis"),
            MultiBodySliderConstraint_getPivotInA  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySliderConstraint_getPivotInA"),
            MultiBodySliderConstraint_getPivotInB  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySliderConstraint_getPivotInB"),
            MultiBodySliderConstraint_setFrameInA  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySliderConstraint_setFrameInA"),
            MultiBodySliderConstraint_setFrameInB  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySliderConstraint_setFrameInB"),
            MultiBodySliderConstraint_setJointAxis = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySliderConstraint_setJointAxis"),
            MultiBodySliderConstraint_setPivotInA  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySliderConstraint_setPivotInA"),
            MultiBodySliderConstraint_setPivotInB  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySliderConstraint_setPivotInB");

    }

    // --- [ btMultiBodySliderConstraint_new ] ---

    public static long nbtMultiBodySliderConstraint_new(long body, int link, long bodyB, long pivotInA, long pivotInB, long frameInA, long frameInB, long jointAxis) {
        long __functionAddress = Functions.MultiBodySliderConstraint_new;
        if (CHECKS) {
            check(body);
            check(bodyB);
        }
        return invokePPPPPPPP(body, link, bodyB, pivotInA, pivotInB, frameInA, frameInB, jointAxis, __functionAddress);
    }

    @NativeType("void *")
    public static long btMultiBodySliderConstraint_new(@NativeType("void *") long body, int link, @NativeType("void *") long bodyB, @NativeType("btVector3 const *") BTVector3 pivotInA, @NativeType("btVector3 const *") BTVector3 pivotInB, @NativeType("btMatrix3x3 const *") BTMatrix3x3 frameInA, @NativeType("btMatrix3x3 const *") BTMatrix3x3 frameInB, @NativeType("btVector3 const *") BTVector3 jointAxis) {
        return nbtMultiBodySliderConstraint_new(body, link, bodyB, pivotInA.address(), pivotInB.address(), frameInA.address(), frameInB.address(), jointAxis.address());
    }

    // --- [ btMultiBodySliderConstraint_new2 ] ---

    public static long nbtMultiBodySliderConstraint_new2(long bodyA, int linkA, long bodyB, int linkB, long pivotInA, long pivotInB, long frameInA, long frameInB, long jointAxis) {
        long __functionAddress = Functions.MultiBodySliderConstraint_new2;
        if (CHECKS) {
            check(bodyA);
            check(bodyB);
        }
        return invokePPPPPPPP(bodyA, linkA, bodyB, linkB, pivotInA, pivotInB, frameInA, frameInB, jointAxis, __functionAddress);
    }

    @NativeType("void *")
    public static long btMultiBodySliderConstraint_new2(@NativeType("void *") long bodyA, int linkA, @NativeType("void *") long bodyB, int linkB, @NativeType("btVector3 const *") BTVector3 pivotInA, @NativeType("btVector3 const *") BTVector3 pivotInB, @NativeType("btMatrix3x3 const *") BTMatrix3x3 frameInA, @NativeType("btMatrix3x3 const *") BTMatrix3x3 frameInB, @NativeType("btVector3 const *") BTVector3 jointAxis) {
        return nbtMultiBodySliderConstraint_new2(bodyA, linkA, bodyB, linkB, pivotInA.address(), pivotInB.address(), frameInA.address(), frameInB.address(), jointAxis.address());
    }

    // --- [ btMultiBodySliderConstraint_getFrameInA ] ---

    public static void nbtMultiBodySliderConstraint_getFrameInA(long obj, long value) {
        long __functionAddress = Functions.MultiBodySliderConstraint_getFrameInA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySliderConstraint_getFrameInA(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtMultiBodySliderConstraint_getFrameInA(obj, value.address());
    }

    // --- [ btMultiBodySliderConstraint_getFrameInB ] ---

    public static void nbtMultiBodySliderConstraint_getFrameInB(long obj, long value) {
        long __functionAddress = Functions.MultiBodySliderConstraint_getFrameInB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySliderConstraint_getFrameInB(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtMultiBodySliderConstraint_getFrameInB(obj, value.address());
    }

    // --- [ btMultiBodySliderConstraint_getJointAxis ] ---

    public static void nbtMultiBodySliderConstraint_getJointAxis(long obj, long value) {
        long __functionAddress = Functions.MultiBodySliderConstraint_getJointAxis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySliderConstraint_getJointAxis(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtMultiBodySliderConstraint_getJointAxis(obj, value.address());
    }

    // --- [ btMultiBodySliderConstraint_getPivotInA ] ---

    public static void nbtMultiBodySliderConstraint_getPivotInA(long obj, long value) {
        long __functionAddress = Functions.MultiBodySliderConstraint_getPivotInA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySliderConstraint_getPivotInA(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtMultiBodySliderConstraint_getPivotInA(obj, value.address());
    }

    // --- [ btMultiBodySliderConstraint_getPivotInB ] ---

    public static void nbtMultiBodySliderConstraint_getPivotInB(long obj, long value) {
        long __functionAddress = Functions.MultiBodySliderConstraint_getPivotInB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySliderConstraint_getPivotInB(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtMultiBodySliderConstraint_getPivotInB(obj, value.address());
    }

    // --- [ btMultiBodySliderConstraint_setFrameInA ] ---

    public static void nbtMultiBodySliderConstraint_setFrameInA(long obj, long frameInA) {
        long __functionAddress = Functions.MultiBodySliderConstraint_setFrameInA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, frameInA, __functionAddress);
    }

    public static void btMultiBodySliderConstraint_setFrameInA(@NativeType("void *") long obj, @NativeType("btMatrix3x3 const *") BTMatrix3x3 frameInA) {
        nbtMultiBodySliderConstraint_setFrameInA(obj, frameInA.address());
    }

    // --- [ btMultiBodySliderConstraint_setFrameInB ] ---

    public static void nbtMultiBodySliderConstraint_setFrameInB(long obj, long frameInB) {
        long __functionAddress = Functions.MultiBodySliderConstraint_setFrameInB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, frameInB, __functionAddress);
    }

    public static void btMultiBodySliderConstraint_setFrameInB(@NativeType("void *") long obj, @NativeType("btMatrix3x3 const *") BTMatrix3x3 frameInB) {
        nbtMultiBodySliderConstraint_setFrameInB(obj, frameInB.address());
    }

    // --- [ btMultiBodySliderConstraint_setJointAxis ] ---

    public static void nbtMultiBodySliderConstraint_setJointAxis(long obj, long jointAxis) {
        long __functionAddress = Functions.MultiBodySliderConstraint_setJointAxis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, jointAxis, __functionAddress);
    }

    public static void btMultiBodySliderConstraint_setJointAxis(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 jointAxis) {
        nbtMultiBodySliderConstraint_setJointAxis(obj, jointAxis.address());
    }

    // --- [ btMultiBodySliderConstraint_setPivotInA ] ---

    public static void nbtMultiBodySliderConstraint_setPivotInA(long obj, long pivotInA) {
        long __functionAddress = Functions.MultiBodySliderConstraint_setPivotInA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, pivotInA, __functionAddress);
    }

    public static void btMultiBodySliderConstraint_setPivotInA(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 pivotInA) {
        nbtMultiBodySliderConstraint_setPivotInA(obj, pivotInA.address());
    }

    // --- [ btMultiBodySliderConstraint_setPivotInB ] ---

    public static void nbtMultiBodySliderConstraint_setPivotInB(long obj, long pivotInB) {
        long __functionAddress = Functions.MultiBodySliderConstraint_setPivotInB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, pivotInB, __functionAddress);
    }

    public static void btMultiBodySliderConstraint_setPivotInB(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 pivotInB) {
        nbtMultiBodySliderConstraint_setPivotInB(obj, pivotInB.address());
    }

}