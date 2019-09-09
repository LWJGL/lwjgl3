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

public class BTMultiBodyPoint2Point {

    protected BTMultiBodyPoint2Point() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MultiBodyPoint2Point_new         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyPoint2Point_new"),
            MultiBodyPoint2Point_new2        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyPoint2Point_new2"),
            MultiBodyPoint2Point_getPivotInB = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyPoint2Point_getPivotInB"),
            MultiBodyPoint2Point_setPivotInB = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyPoint2Point_setPivotInB");

    }

    // --- [ btMultiBodyPoint2Point_new ] ---

    public static long nbtMultiBodyPoint2Point_new(long body, int link, long bodyB, long pivotInA, long pivotInB) {
        long __functionAddress = Functions.MultiBodyPoint2Point_new;
        if (CHECKS) {
            check(body);
            check(bodyB);
        }
        return invokePPPPP(body, link, bodyB, pivotInA, pivotInB, __functionAddress);
    }

    @NativeType("void *")
    public static long btMultiBodyPoint2Point_new(@NativeType("void *") long body, int link, @NativeType("void *") long bodyB, @NativeType("btVector3 const *") BTVector3 pivotInA, @NativeType("btVector3 const *") BTVector3 pivotInB) {
        return nbtMultiBodyPoint2Point_new(body, link, bodyB, pivotInA.address(), pivotInB.address());
    }

    // --- [ btMultiBodyPoint2Point_new2 ] ---

    public static long nbtMultiBodyPoint2Point_new2(long bodyA, int linkA, long bodyB, int linkB, long pivotInA, long pivotInB) {
        long __functionAddress = Functions.MultiBodyPoint2Point_new2;
        if (CHECKS) {
            check(bodyA);
            check(bodyB);
        }
        return invokePPPPP(bodyA, linkA, bodyB, linkB, pivotInA, pivotInB, __functionAddress);
    }

    @NativeType("void *")
    public static long btMultiBodyPoint2Point_new2(@NativeType("void *") long bodyA, int linkA, @NativeType("void *") long bodyB, int linkB, @NativeType("btVector3 const *") BTVector3 pivotInA, @NativeType("btVector3 const *") BTVector3 pivotInB) {
        return nbtMultiBodyPoint2Point_new2(bodyA, linkA, bodyB, linkB, pivotInA.address(), pivotInB.address());
    }

    // --- [ btMultiBodyPoint2Point_getPivotInB ] ---

    public static void nbtMultiBodyPoint2Point_getPivotInB(long obj, long value) {
        long __functionAddress = Functions.MultiBodyPoint2Point_getPivotInB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodyPoint2Point_getPivotInB(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtMultiBodyPoint2Point_getPivotInB(obj, value.address());
    }

    // --- [ btMultiBodyPoint2Point_setPivotInB ] ---

    public static void nbtMultiBodyPoint2Point_setPivotInB(long obj, long pivotInB) {
        long __functionAddress = Functions.MultiBodyPoint2Point_setPivotInB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, pivotInB, __functionAddress);
    }

    public static void btMultiBodyPoint2Point_setPivotInB(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 pivotInB) {
        nbtMultiBodyPoint2Point_setPivotInB(obj, pivotInB.address());
    }

}