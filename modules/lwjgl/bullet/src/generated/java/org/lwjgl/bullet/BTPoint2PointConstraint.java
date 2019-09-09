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

public class BTPoint2PointConstraint {

    protected BTPoint2PointConstraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ConstraintSetting_new                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btConstraintSetting_new"),
            ConstraintSetting_getDamping                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btConstraintSetting_getDamping"),
            ConstraintSetting_getImpulseClamp                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btConstraintSetting_getImpulseClamp"),
            ConstraintSetting_getTau                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btConstraintSetting_getTau"),
            ConstraintSetting_setDamping                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btConstraintSetting_setDamping"),
            ConstraintSetting_setImpulseClamp                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btConstraintSetting_setImpulseClamp"),
            ConstraintSetting_setTau                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btConstraintSetting_setTau"),
            ConstraintSetting_delete                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btConstraintSetting_delete"),
            Point2PointConstraint_new                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btPoint2PointConstraint_new"),
            Point2PointConstraint_new2                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btPoint2PointConstraint_new2"),
            Point2PointConstraint_getFlags                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btPoint2PointConstraint_getFlags"),
            Point2PointConstraint_getInfo1NonVirtual            = apiGetFunctionAddress(LibBullet.getLibrary(), "btPoint2PointConstraint_getInfo1NonVirtual"),
            Point2PointConstraint_getInfo2NonVirtual            = apiGetFunctionAddress(LibBullet.getLibrary(), "btPoint2PointConstraint_getInfo2NonVirtual"),
            Point2PointConstraint_getPivotInA                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btPoint2PointConstraint_getPivotInA"),
            Point2PointConstraint_getPivotInB                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btPoint2PointConstraint_getPivotInB"),
            Point2PointConstraint_getSetting                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btPoint2PointConstraint_getSetting"),
            Point2PointConstraint_getUseSolveConstraintObsolete = apiGetFunctionAddress(LibBullet.getLibrary(), "btPoint2PointConstraint_getUseSolveConstraintObsolete"),
            Point2PointConstraint_setPivotA                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btPoint2PointConstraint_setPivotA"),
            Point2PointConstraint_setPivotB                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btPoint2PointConstraint_setPivotB"),
            Point2PointConstraint_setUseSolveConstraintObsolete = apiGetFunctionAddress(LibBullet.getLibrary(), "btPoint2PointConstraint_setUseSolveConstraintObsolete"),
            Point2PointConstraint_updateRHS                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btPoint2PointConstraint_updateRHS");

    }

    // --- [ btConstraintSetting_new ] ---

    @NativeType("void *")
    public static long btConstraintSetting_new() {
        long __functionAddress = Functions.ConstraintSetting_new;
        return invokeP(__functionAddress);
    }

    // --- [ btConstraintSetting_getDamping ] ---

    @NativeType("btScalar")
    public static float btConstraintSetting_getDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConstraintSetting_getDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConstraintSetting_getImpulseClamp ] ---

    @NativeType("btScalar")
    public static float btConstraintSetting_getImpulseClamp(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConstraintSetting_getImpulseClamp;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConstraintSetting_getTau ] ---

    @NativeType("btScalar")
    public static float btConstraintSetting_getTau(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConstraintSetting_getTau;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConstraintSetting_setDamping ] ---

    public static void btConstraintSetting_setDamping(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ConstraintSetting_setDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btConstraintSetting_setImpulseClamp ] ---

    public static void btConstraintSetting_setImpulseClamp(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ConstraintSetting_setImpulseClamp;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btConstraintSetting_setTau ] ---

    public static void btConstraintSetting_setTau(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ConstraintSetting_setTau;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btConstraintSetting_delete ] ---

    public static void btConstraintSetting_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConstraintSetting_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btPoint2PointConstraint_new ] ---

    public static long nbtPoint2PointConstraint_new(long rbA, long rbB, long pivotInA, long pivotInB) {
        long __functionAddress = Functions.Point2PointConstraint_new;
        if (CHECKS) {
            check(rbA);
            check(rbB);
        }
        return invokePPPPP(rbA, rbB, pivotInA, pivotInB, __functionAddress);
    }

    @NativeType("void *")
    public static long btPoint2PointConstraint_new(@NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btVector3 const *") BTVector3 pivotInA, @NativeType("btVector3 const *") BTVector3 pivotInB) {
        return nbtPoint2PointConstraint_new(rbA, rbB, pivotInA.address(), pivotInB.address());
    }

    // --- [ btPoint2PointConstraint_new2 ] ---

    public static long nbtPoint2PointConstraint_new2(long rbA, long pivotInA) {
        long __functionAddress = Functions.Point2PointConstraint_new2;
        if (CHECKS) {
            check(rbA);
        }
        return invokePPP(rbA, pivotInA, __functionAddress);
    }

    @NativeType("void *")
    public static long btPoint2PointConstraint_new2(@NativeType("void *") long rbA, @NativeType("btVector3 const *") BTVector3 pivotInA) {
        return nbtPoint2PointConstraint_new2(rbA, pivotInA.address());
    }

    // --- [ btPoint2PointConstraint_getFlags ] ---

    public static int btPoint2PointConstraint_getFlags(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Point2PointConstraint_getFlags;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btPoint2PointConstraint_getInfo1NonVirtual ] ---

    public static void btPoint2PointConstraint_getInfo1NonVirtual(@NativeType("void *") long obj, @NativeType("void *") long info) {
        long __functionAddress = Functions.Point2PointConstraint_getInfo1NonVirtual;
        if (CHECKS) {
            check(obj);
            check(info);
        }
        invokePPV(obj, info, __functionAddress);
    }

    // --- [ btPoint2PointConstraint_getInfo2NonVirtual ] ---

    public static void nbtPoint2PointConstraint_getInfo2NonVirtual(long obj, long info, long body0_trans, long body1_trans) {
        long __functionAddress = Functions.Point2PointConstraint_getInfo2NonVirtual;
        if (CHECKS) {
            check(obj);
            check(info);
        }
        invokePPPPV(obj, info, body0_trans, body1_trans, __functionAddress);
    }

    public static void btPoint2PointConstraint_getInfo2NonVirtual(@NativeType("void *") long obj, @NativeType("void *") long info, @NativeType("btTransform const *") BTTransform body0_trans, @NativeType("btTransform const *") BTTransform body1_trans) {
        nbtPoint2PointConstraint_getInfo2NonVirtual(obj, info, body0_trans.address(), body1_trans.address());
    }

    // --- [ btPoint2PointConstraint_getPivotInA ] ---

    public static void nbtPoint2PointConstraint_getPivotInA(long obj, long value) {
        long __functionAddress = Functions.Point2PointConstraint_getPivotInA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btPoint2PointConstraint_getPivotInA(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtPoint2PointConstraint_getPivotInA(obj, value.address());
    }

    // --- [ btPoint2PointConstraint_getPivotInB ] ---

    public static void nbtPoint2PointConstraint_getPivotInB(long obj, long value) {
        long __functionAddress = Functions.Point2PointConstraint_getPivotInB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btPoint2PointConstraint_getPivotInB(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtPoint2PointConstraint_getPivotInB(obj, value.address());
    }

    // --- [ btPoint2PointConstraint_getSetting ] ---

    @NativeType("void *")
    public static long btPoint2PointConstraint_getSetting(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Point2PointConstraint_getSetting;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btPoint2PointConstraint_getUseSolveConstraintObsolete ] ---

    @NativeType("bool")
    public static boolean btPoint2PointConstraint_getUseSolveConstraintObsolete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Point2PointConstraint_getUseSolveConstraintObsolete;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btPoint2PointConstraint_setPivotA ] ---

    public static void nbtPoint2PointConstraint_setPivotA(long obj, long pivotA) {
        long __functionAddress = Functions.Point2PointConstraint_setPivotA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, pivotA, __functionAddress);
    }

    public static void btPoint2PointConstraint_setPivotA(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 pivotA) {
        nbtPoint2PointConstraint_setPivotA(obj, pivotA.address());
    }

    // --- [ btPoint2PointConstraint_setPivotB ] ---

    public static void nbtPoint2PointConstraint_setPivotB(long obj, long pivotB) {
        long __functionAddress = Functions.Point2PointConstraint_setPivotB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, pivotB, __functionAddress);
    }

    public static void btPoint2PointConstraint_setPivotB(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 pivotB) {
        nbtPoint2PointConstraint_setPivotB(obj, pivotB.address());
    }

    // --- [ btPoint2PointConstraint_setUseSolveConstraintObsolete ] ---

    public static void btPoint2PointConstraint_setUseSolveConstraintObsolete(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.Point2PointConstraint_setUseSolveConstraintObsolete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btPoint2PointConstraint_updateRHS ] ---

    public static void btPoint2PointConstraint_updateRHS(@NativeType("void *") long obj, @NativeType("btScalar") float timeStep) {
        long __functionAddress = Functions.Point2PointConstraint_updateRHS;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, timeStep, __functionAddress);
    }

}