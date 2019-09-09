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

public class BTHinge2Constraint {

    protected BTHinge2Constraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Hinge2Constraint_new           = apiGetFunctionAddress(LibBullet.getLibrary(), "btHinge2Constraint_new"),
            Hinge2Constraint_getAnchor     = apiGetFunctionAddress(LibBullet.getLibrary(), "btHinge2Constraint_getAnchor"),
            Hinge2Constraint_getAnchor2    = apiGetFunctionAddress(LibBullet.getLibrary(), "btHinge2Constraint_getAnchor2"),
            Hinge2Constraint_getAngle1     = apiGetFunctionAddress(LibBullet.getLibrary(), "btHinge2Constraint_getAngle1"),
            Hinge2Constraint_getAngle2     = apiGetFunctionAddress(LibBullet.getLibrary(), "btHinge2Constraint_getAngle2"),
            Hinge2Constraint_getAxis1      = apiGetFunctionAddress(LibBullet.getLibrary(), "btHinge2Constraint_getAxis1"),
            Hinge2Constraint_getAxis2      = apiGetFunctionAddress(LibBullet.getLibrary(), "btHinge2Constraint_getAxis2"),
            Hinge2Constraint_setLowerLimit = apiGetFunctionAddress(LibBullet.getLibrary(), "btHinge2Constraint_setLowerLimit"),
            Hinge2Constraint_setUpperLimit = apiGetFunctionAddress(LibBullet.getLibrary(), "btHinge2Constraint_setUpperLimit");

    }

    // --- [ btHinge2Constraint_new ] ---

    public static long nbtHinge2Constraint_new(long rbA, long rbB, long anchor, long axis1, long axis2) {
        long __functionAddress = Functions.Hinge2Constraint_new;
        if (CHECKS) {
            check(rbA);
            check(rbB);
        }
        return invokePPPPPP(rbA, rbB, anchor, axis1, axis2, __functionAddress);
    }

    @NativeType("void *")
    public static long btHinge2Constraint_new(@NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btVector3 *") BTVector3 anchor, @NativeType("btVector3 *") BTVector3 axis1, @NativeType("btVector3 *") BTVector3 axis2) {
        return nbtHinge2Constraint_new(rbA, rbB, anchor.address(), axis1.address(), axis2.address());
    }

    // --- [ btHinge2Constraint_getAnchor ] ---

    public static void nbtHinge2Constraint_getAnchor(long obj, long value) {
        long __functionAddress = Functions.Hinge2Constraint_getAnchor;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btHinge2Constraint_getAnchor(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtHinge2Constraint_getAnchor(obj, value.address());
    }

    // --- [ btHinge2Constraint_getAnchor2 ] ---

    public static void nbtHinge2Constraint_getAnchor2(long obj, long value) {
        long __functionAddress = Functions.Hinge2Constraint_getAnchor2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btHinge2Constraint_getAnchor2(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtHinge2Constraint_getAnchor2(obj, value.address());
    }

    // --- [ btHinge2Constraint_getAngle1 ] ---

    @NativeType("btScalar")
    public static float btHinge2Constraint_getAngle1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Hinge2Constraint_getAngle1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btHinge2Constraint_getAngle2 ] ---

    @NativeType("btScalar")
    public static float btHinge2Constraint_getAngle2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Hinge2Constraint_getAngle2;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btHinge2Constraint_getAxis1 ] ---

    public static void nbtHinge2Constraint_getAxis1(long obj, long value) {
        long __functionAddress = Functions.Hinge2Constraint_getAxis1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btHinge2Constraint_getAxis1(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtHinge2Constraint_getAxis1(obj, value.address());
    }

    // --- [ btHinge2Constraint_getAxis2 ] ---

    public static void nbtHinge2Constraint_getAxis2(long obj, long value) {
        long __functionAddress = Functions.Hinge2Constraint_getAxis2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btHinge2Constraint_getAxis2(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtHinge2Constraint_getAxis2(obj, value.address());
    }

    // --- [ btHinge2Constraint_setLowerLimit ] ---

    public static void btHinge2Constraint_setLowerLimit(@NativeType("void *") long obj, @NativeType("btScalar") float ang1min) {
        long __functionAddress = Functions.Hinge2Constraint_setLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, ang1min, __functionAddress);
    }

    // --- [ btHinge2Constraint_setUpperLimit ] ---

    public static void btHinge2Constraint_setUpperLimit(@NativeType("void *") long obj, @NativeType("btScalar") float ang1max) {
        long __functionAddress = Functions.Hinge2Constraint_setUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, ang1max, __functionAddress);
    }

}