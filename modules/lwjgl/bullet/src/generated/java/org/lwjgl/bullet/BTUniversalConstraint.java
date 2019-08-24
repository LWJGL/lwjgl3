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

public class BTUniversalConstraint {

    protected BTUniversalConstraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            UniversalConstraint_new           = apiGetFunctionAddress(LibBullet.getLibrary(), "btUniversalConstraint_new"),
            UniversalConstraint_getAnchor     = apiGetFunctionAddress(LibBullet.getLibrary(), "btUniversalConstraint_getAnchor"),
            UniversalConstraint_getAnchor2    = apiGetFunctionAddress(LibBullet.getLibrary(), "btUniversalConstraint_getAnchor2"),
            UniversalConstraint_getAngle1     = apiGetFunctionAddress(LibBullet.getLibrary(), "btUniversalConstraint_getAngle1"),
            UniversalConstraint_getAngle2     = apiGetFunctionAddress(LibBullet.getLibrary(), "btUniversalConstraint_getAngle2"),
            UniversalConstraint_getAxis1      = apiGetFunctionAddress(LibBullet.getLibrary(), "btUniversalConstraint_getAxis1"),
            UniversalConstraint_getAxis2      = apiGetFunctionAddress(LibBullet.getLibrary(), "btUniversalConstraint_getAxis2"),
            UniversalConstraint_setLowerLimit = apiGetFunctionAddress(LibBullet.getLibrary(), "btUniversalConstraint_setLowerLimit"),
            UniversalConstraint_setUpperLimit = apiGetFunctionAddress(LibBullet.getLibrary(), "btUniversalConstraint_setUpperLimit");

    }

    // --- [ btUniversalConstraint_new ] ---

    public static long nbtUniversalConstraint_new(long rbA, long rbB, long anchor, long axis1, long axis2) {
        long __functionAddress = Functions.UniversalConstraint_new;
        if (CHECKS) {
            check(rbA);
            check(rbB);
        }
        return invokePPPPPP(rbA, rbB, anchor, axis1, axis2, __functionAddress);
    }

    @NativeType("void *")
    public static long btUniversalConstraint_new(@NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btVector3 const *") ΒΤVector3 anchor, @NativeType("btVector3 const *") ΒΤVector3 axis1, @NativeType("btVector3 const *") ΒΤVector3 axis2) {
        return nbtUniversalConstraint_new(rbA, rbB, anchor.address(), axis1.address(), axis2.address());
    }

    // --- [ btUniversalConstraint_getAnchor ] ---

    public static void nbtUniversalConstraint_getAnchor(long obj, long value) {
        long __functionAddress = Functions.UniversalConstraint_getAnchor;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btUniversalConstraint_getAnchor(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtUniversalConstraint_getAnchor(obj, value.address());
    }

    // --- [ btUniversalConstraint_getAnchor2 ] ---

    public static void nbtUniversalConstraint_getAnchor2(long obj, long value) {
        long __functionAddress = Functions.UniversalConstraint_getAnchor2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btUniversalConstraint_getAnchor2(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtUniversalConstraint_getAnchor2(obj, value.address());
    }

    // --- [ btUniversalConstraint_getAngle1 ] ---

    @NativeType("btScalar")
    public static float btUniversalConstraint_getAngle1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UniversalConstraint_getAngle1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btUniversalConstraint_getAngle2 ] ---

    @NativeType("btScalar")
    public static float btUniversalConstraint_getAngle2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UniversalConstraint_getAngle2;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btUniversalConstraint_getAxis1 ] ---

    public static void nbtUniversalConstraint_getAxis1(long obj, long value) {
        long __functionAddress = Functions.UniversalConstraint_getAxis1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btUniversalConstraint_getAxis1(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtUniversalConstraint_getAxis1(obj, value.address());
    }

    // --- [ btUniversalConstraint_getAxis2 ] ---

    public static void nbtUniversalConstraint_getAxis2(long obj, long value) {
        long __functionAddress = Functions.UniversalConstraint_getAxis2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btUniversalConstraint_getAxis2(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtUniversalConstraint_getAxis2(obj, value.address());
    }

    // --- [ btUniversalConstraint_setLowerLimit ] ---

    public static void btUniversalConstraint_setLowerLimit(@NativeType("void *") long obj, @NativeType("btScalar") float ang1min, @NativeType("btScalar") float ang2min) {
        long __functionAddress = Functions.UniversalConstraint_setLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, ang1min, ang2min, __functionAddress);
    }

    // --- [ btUniversalConstraint_setUpperLimit ] ---

    public static void btUniversalConstraint_setUpperLimit(@NativeType("void *") long obj, @NativeType("btScalar") float ang1max, @NativeType("btScalar") float ang2max) {
        long __functionAddress = Functions.UniversalConstraint_setUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, ang1max, ang2max, __functionAddress);
    }

}