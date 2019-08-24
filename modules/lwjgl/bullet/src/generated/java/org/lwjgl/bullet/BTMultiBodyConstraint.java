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

public class BTMultiBodyConstraint {

    protected BTMultiBodyConstraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MultiBodyConstraint_allocateJacobiansMultiDof = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_allocateJacobiansMultiDof"),
            MultiBodyConstraint_createConstraintRows      = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_createConstraintRows"),
            MultiBodyConstraint_debugDraw                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_debugDraw"),
            MultiBodyConstraint_finalizeMultiDof          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_finalizeMultiDof"),
            MultiBodyConstraint_getAppliedImpulse         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_getAppliedImpulse"),
            MultiBodyConstraint_getIslandIdA              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_getIslandIdA"),
            MultiBodyConstraint_getIslandIdB              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_getIslandIdB"),
            MultiBodyConstraint_getMaxAppliedImpulse      = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_getMaxAppliedImpulse"),
            MultiBodyConstraint_getMultiBodyA             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_getMultiBodyA"),
            MultiBodyConstraint_getMultiBodyB             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_getMultiBodyB"),
            MultiBodyConstraint_getNumRows                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_getNumRows"),
            MultiBodyConstraint_getPosition               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_getPosition"),
            MultiBodyConstraint_internalSetAppliedImpulse = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_internalSetAppliedImpulse"),
            MultiBodyConstraint_isUnilateral              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_isUnilateral"),
            MultiBodyConstraint_jacobianA                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_jacobianA"),
            MultiBodyConstraint_jacobianB                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_jacobianB"),
            MultiBodyConstraint_setMaxAppliedImpulse      = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_setMaxAppliedImpulse"),
            MultiBodyConstraint_setPosition               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_setPosition"),
            MultiBodyConstraint_updateJacobianSizes       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_updateJacobianSizes"),
            MultiBodyConstraint_delete                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraint_delete");

    }

    // --- [ btMultiBodyConstraint_allocateJacobiansMultiDof ] ---

    public static void btMultiBodyConstraint_allocateJacobiansMultiDof(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyConstraint_allocateJacobiansMultiDof;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_createConstraintRows ] ---

    public static void btMultiBodyConstraint_createConstraintRows(@NativeType("void *") long obj, @NativeType("void *") long constraintRows, @NativeType("void *") long data, @NativeType("void *") long infoGlobal) {
        long __functionAddress = Functions.MultiBodyConstraint_createConstraintRows;
        if (CHECKS) {
            check(obj);
            check(constraintRows);
            check(data);
            check(infoGlobal);
        }
        invokePPPPV(obj, constraintRows, data, infoGlobal, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_debugDraw ] ---

    public static void btMultiBodyConstraint_debugDraw(@NativeType("void *") long obj, @NativeType("void *") long drawer) {
        long __functionAddress = Functions.MultiBodyConstraint_debugDraw;
        if (CHECKS) {
            check(obj);
            check(drawer);
        }
        invokePPV(obj, drawer, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_finalizeMultiDof ] ---

    public static void btMultiBodyConstraint_finalizeMultiDof(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyConstraint_finalizeMultiDof;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_getAppliedImpulse ] ---

    @NativeType("btScalar")
    public static float btMultiBodyConstraint_getAppliedImpulse(@NativeType("void *") long obj, int dof) {
        long __functionAddress = Functions.MultiBodyConstraint_getAppliedImpulse;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, dof, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_getIslandIdA ] ---

    public static int btMultiBodyConstraint_getIslandIdA(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyConstraint_getIslandIdA;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_getIslandIdB ] ---

    public static int btMultiBodyConstraint_getIslandIdB(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyConstraint_getIslandIdB;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_getMaxAppliedImpulse ] ---

    @NativeType("btScalar")
    public static float btMultiBodyConstraint_getMaxAppliedImpulse(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyConstraint_getMaxAppliedImpulse;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_getMultiBodyA ] ---

    @NativeType("void *")
    public static long btMultiBodyConstraint_getMultiBodyA(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyConstraint_getMultiBodyA;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_getMultiBodyB ] ---

    @NativeType("void *")
    public static long btMultiBodyConstraint_getMultiBodyB(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyConstraint_getMultiBodyB;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_getNumRows ] ---

    public static int btMultiBodyConstraint_getNumRows(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyConstraint_getNumRows;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_getPosition ] ---

    @NativeType("btScalar")
    public static float btMultiBodyConstraint_getPosition(@NativeType("void *") long obj, int row) {
        long __functionAddress = Functions.MultiBodyConstraint_getPosition;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, row, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_internalSetAppliedImpulse ] ---

    public static void btMultiBodyConstraint_internalSetAppliedImpulse(@NativeType("void *") long obj, int dof, @NativeType("btScalar") float appliedImpulse) {
        long __functionAddress = Functions.MultiBodyConstraint_internalSetAppliedImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dof, appliedImpulse, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_isUnilateral ] ---

    @NativeType("bool")
    public static boolean btMultiBodyConstraint_isUnilateral(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyConstraint_isUnilateral;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_jacobianA ] ---

    @NativeType("void *")
    public static long btMultiBodyConstraint_jacobianA(@NativeType("void *") long obj, int row) {
        long __functionAddress = Functions.MultiBodyConstraint_jacobianA;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, row, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_jacobianB ] ---

    @NativeType("void *")
    public static long btMultiBodyConstraint_jacobianB(@NativeType("void *") long obj, int row) {
        long __functionAddress = Functions.MultiBodyConstraint_jacobianB;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, row, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_setMaxAppliedImpulse ] ---

    public static void btMultiBodyConstraint_setMaxAppliedImpulse(@NativeType("void *") long obj, @NativeType("btScalar") float maxImp) {
        long __functionAddress = Functions.MultiBodyConstraint_setMaxAppliedImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, maxImp, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_setPosition ] ---

    public static void btMultiBodyConstraint_setPosition(@NativeType("void *") long obj, int row, @NativeType("btScalar") float pos) {
        long __functionAddress = Functions.MultiBodyConstraint_setPosition;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, row, pos, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_updateJacobianSizes ] ---

    public static void btMultiBodyConstraint_updateJacobianSizes(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyConstraint_updateJacobianSizes;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btMultiBodyConstraint_delete ] ---

    public static void btMultiBodyConstraint_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyConstraint_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}