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

public class BTMultiBodySolverConstraint {

    protected BTMultiBodySolverConstraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MultiBodySolverConstraint_new                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_new"),
            MultiBodySolverConstraint_getAngularComponentA           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getAngularComponentA"),
            MultiBodySolverConstraint_getAngularComponentB           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getAngularComponentB"),
            MultiBodySolverConstraint_getAppliedImpulse              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getAppliedImpulse"),
            MultiBodySolverConstraint_getAppliedPushImpulse          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getAppliedPushImpulse"),
            MultiBodySolverConstraint_getCfm                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getCfm"),
            MultiBodySolverConstraint_getContactNormal1              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getContactNormal1"),
            MultiBodySolverConstraint_getContactNormal2              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getContactNormal2"),
            MultiBodySolverConstraint_getDeltaVelAindex              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getDeltaVelAindex"),
            MultiBodySolverConstraint_getDeltaVelBindex              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getDeltaVelBindex"),
            MultiBodySolverConstraint_getFriction                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getFriction"),
            MultiBodySolverConstraint_getFrictionIndex               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getFrictionIndex"),
            MultiBodySolverConstraint_getJacAindex                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getJacAindex"),
            MultiBodySolverConstraint_getJacBindex                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getJacBindex"),
            MultiBodySolverConstraint_getJacDiagABInv                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getJacDiagABInv"),
            MultiBodySolverConstraint_getLinkA                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getLinkA"),
            MultiBodySolverConstraint_getLinkB                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getLinkB"),
            MultiBodySolverConstraint_getLowerLimit                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getLowerLimit"),
            MultiBodySolverConstraint_getMultiBodyA                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getMultiBodyA"),
            MultiBodySolverConstraint_getMultiBodyB                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getMultiBodyB"),
            MultiBodySolverConstraint_getOrgConstraint               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getOrgConstraint"),
            MultiBodySolverConstraint_getOrgDofIndex                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getOrgDofIndex"),
            MultiBodySolverConstraint_getOriginalContactPoint        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getOriginalContactPoint"),
            MultiBodySolverConstraint_getOverrideNumSolverIterations = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getOverrideNumSolverIterations"),
            MultiBodySolverConstraint_getRelpos1CrossNormal          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getRelpos1CrossNormal"),
            MultiBodySolverConstraint_getRelpos2CrossNormal          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getRelpos2CrossNormal"),
            MultiBodySolverConstraint_getRhs                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getRhs"),
            MultiBodySolverConstraint_getRhsPenetration              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getRhsPenetration"),
            MultiBodySolverConstraint_getSolverBodyIdA               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getSolverBodyIdA"),
            MultiBodySolverConstraint_getSolverBodyIdB               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getSolverBodyIdB"),
            MultiBodySolverConstraint_getUnusedPadding4              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getUnusedPadding4"),
            MultiBodySolverConstraint_getUpperLimit                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_getUpperLimit"),
            MultiBodySolverConstraint_setAngularComponentA           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setAngularComponentA"),
            MultiBodySolverConstraint_setAngularComponentB           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setAngularComponentB"),
            MultiBodySolverConstraint_setAppliedImpulse              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setAppliedImpulse"),
            MultiBodySolverConstraint_setAppliedPushImpulse          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setAppliedPushImpulse"),
            MultiBodySolverConstraint_setCfm                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setCfm"),
            MultiBodySolverConstraint_setContactNormal1              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setContactNormal1"),
            MultiBodySolverConstraint_setContactNormal2              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setContactNormal2"),
            MultiBodySolverConstraint_setDeltaVelAindex              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setDeltaVelAindex"),
            MultiBodySolverConstraint_setDeltaVelBindex              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setDeltaVelBindex"),
            MultiBodySolverConstraint_setFriction                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setFriction"),
            MultiBodySolverConstraint_setFrictionIndex               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setFrictionIndex"),
            MultiBodySolverConstraint_setJacAindex                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setJacAindex"),
            MultiBodySolverConstraint_setJacBindex                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setJacBindex"),
            MultiBodySolverConstraint_setJacDiagABInv                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setJacDiagABInv"),
            MultiBodySolverConstraint_setLinkA                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setLinkA"),
            MultiBodySolverConstraint_setLinkB                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setLinkB"),
            MultiBodySolverConstraint_setLowerLimit                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setLowerLimit"),
            MultiBodySolverConstraint_setMultiBodyA                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setMultiBodyA"),
            MultiBodySolverConstraint_setMultiBodyB                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setMultiBodyB"),
            MultiBodySolverConstraint_setOrgConstraint               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setOrgConstraint"),
            MultiBodySolverConstraint_setOrgDofIndex                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setOrgDofIndex"),
            MultiBodySolverConstraint_setOriginalContactPoint        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setOriginalContactPoint"),
            MultiBodySolverConstraint_setOverrideNumSolverIterations = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setOverrideNumSolverIterations"),
            MultiBodySolverConstraint_setRelpos1CrossNormal          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setRelpos1CrossNormal"),
            MultiBodySolverConstraint_setRelpos2CrossNormal          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setRelpos2CrossNormal"),
            MultiBodySolverConstraint_setRhs                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setRhs"),
            MultiBodySolverConstraint_setRhsPenetration              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setRhsPenetration"),
            MultiBodySolverConstraint_setSolverBodyIdA               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setSolverBodyIdA"),
            MultiBodySolverConstraint_setSolverBodyIdB               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setSolverBodyIdB"),
            MultiBodySolverConstraint_setUnusedPadding4              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setUnusedPadding4"),
            MultiBodySolverConstraint_setUpperLimit                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_setUpperLimit"),
            MultiBodySolverConstraint_delete                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodySolverConstraint_delete");

    }

    // --- [ btMultiBodySolverConstraint_new ] ---

    @NativeType("void *")
    public static long btMultiBodySolverConstraint_new() {
        long __functionAddress = Functions.MultiBodySolverConstraint_new;
        return invokeP(__functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getAngularComponentA ] ---

    public static void nbtMultiBodySolverConstraint_getAngularComponentA(long obj, long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getAngularComponentA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySolverConstraint_getAngularComponentA(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBodySolverConstraint_getAngularComponentA(obj, value.address());
    }

    // --- [ btMultiBodySolverConstraint_getAngularComponentB ] ---

    public static void nbtMultiBodySolverConstraint_getAngularComponentB(long obj, long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getAngularComponentB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySolverConstraint_getAngularComponentB(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBodySolverConstraint_getAngularComponentB(obj, value.address());
    }

    // --- [ btMultiBodySolverConstraint_getAppliedImpulse ] ---

    @NativeType("btScalar")
    public static float btMultiBodySolverConstraint_getAppliedImpulse(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getAppliedImpulse;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getAppliedPushImpulse ] ---

    @NativeType("btScalar")
    public static float btMultiBodySolverConstraint_getAppliedPushImpulse(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getAppliedPushImpulse;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getCfm ] ---

    @NativeType("btScalar")
    public static float btMultiBodySolverConstraint_getCfm(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getCfm;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getContactNormal1 ] ---

    public static void nbtMultiBodySolverConstraint_getContactNormal1(long obj, long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getContactNormal1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySolverConstraint_getContactNormal1(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBodySolverConstraint_getContactNormal1(obj, value.address());
    }

    // --- [ btMultiBodySolverConstraint_getContactNormal2 ] ---

    public static void nbtMultiBodySolverConstraint_getContactNormal2(long obj, long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getContactNormal2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySolverConstraint_getContactNormal2(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBodySolverConstraint_getContactNormal2(obj, value.address());
    }

    // --- [ btMultiBodySolverConstraint_getDeltaVelAindex ] ---

    public static int btMultiBodySolverConstraint_getDeltaVelAindex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getDeltaVelAindex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getDeltaVelBindex ] ---

    public static int btMultiBodySolverConstraint_getDeltaVelBindex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getDeltaVelBindex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getFriction ] ---

    @NativeType("btScalar")
    public static float btMultiBodySolverConstraint_getFriction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getFriction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getFrictionIndex ] ---

    public static int btMultiBodySolverConstraint_getFrictionIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getFrictionIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getJacAindex ] ---

    public static int btMultiBodySolverConstraint_getJacAindex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getJacAindex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getJacBindex ] ---

    public static int btMultiBodySolverConstraint_getJacBindex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getJacBindex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getJacDiagABInv ] ---

    @NativeType("btScalar")
    public static float btMultiBodySolverConstraint_getJacDiagABInv(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getJacDiagABInv;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getLinkA ] ---

    public static int btMultiBodySolverConstraint_getLinkA(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getLinkA;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getLinkB ] ---

    public static int btMultiBodySolverConstraint_getLinkB(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getLinkB;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getLowerLimit ] ---

    @NativeType("btScalar")
    public static float btMultiBodySolverConstraint_getLowerLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getMultiBodyA ] ---

    @NativeType("void *")
    public static long btMultiBodySolverConstraint_getMultiBodyA(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getMultiBodyA;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getMultiBodyB ] ---

    @NativeType("void *")
    public static long btMultiBodySolverConstraint_getMultiBodyB(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getMultiBodyB;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getOrgConstraint ] ---

    @NativeType("void *")
    public static long btMultiBodySolverConstraint_getOrgConstraint(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getOrgConstraint;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getOrgDofIndex ] ---

    public static int btMultiBodySolverConstraint_getOrgDofIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getOrgDofIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getOriginalContactPoint ] ---

    @NativeType("void *")
    public static long btMultiBodySolverConstraint_getOriginalContactPoint(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getOriginalContactPoint;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getOverrideNumSolverIterations ] ---

    public static int btMultiBodySolverConstraint_getOverrideNumSolverIterations(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getOverrideNumSolverIterations;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getRelpos1CrossNormal ] ---

    public static void nbtMultiBodySolverConstraint_getRelpos1CrossNormal(long obj, long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getRelpos1CrossNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySolverConstraint_getRelpos1CrossNormal(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBodySolverConstraint_getRelpos1CrossNormal(obj, value.address());
    }

    // --- [ btMultiBodySolverConstraint_getRelpos2CrossNormal ] ---

    public static void nbtMultiBodySolverConstraint_getRelpos2CrossNormal(long obj, long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getRelpos2CrossNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySolverConstraint_getRelpos2CrossNormal(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBodySolverConstraint_getRelpos2CrossNormal(obj, value.address());
    }

    // --- [ btMultiBodySolverConstraint_getRhs ] ---

    @NativeType("btScalar")
    public static float btMultiBodySolverConstraint_getRhs(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getRhs;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getRhsPenetration ] ---

    @NativeType("btScalar")
    public static float btMultiBodySolverConstraint_getRhsPenetration(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getRhsPenetration;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getSolverBodyIdA ] ---

    public static int btMultiBodySolverConstraint_getSolverBodyIdA(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getSolverBodyIdA;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getSolverBodyIdB ] ---

    public static int btMultiBodySolverConstraint_getSolverBodyIdB(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getSolverBodyIdB;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getUnusedPadding4 ] ---

    @NativeType("btScalar")
    public static float btMultiBodySolverConstraint_getUnusedPadding4(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getUnusedPadding4;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_getUpperLimit ] ---

    @NativeType("btScalar")
    public static float btMultiBodySolverConstraint_getUpperLimit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_getUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setAngularComponentA ] ---

    public static void nbtMultiBodySolverConstraint_setAngularComponentA(long obj, long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setAngularComponentA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySolverConstraint_setAngularComponentA(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtMultiBodySolverConstraint_setAngularComponentA(obj, value.address());
    }

    // --- [ btMultiBodySolverConstraint_setAngularComponentB ] ---

    public static void nbtMultiBodySolverConstraint_setAngularComponentB(long obj, long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setAngularComponentB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySolverConstraint_setAngularComponentB(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtMultiBodySolverConstraint_setAngularComponentB(obj, value.address());
    }

    // --- [ btMultiBodySolverConstraint_setAppliedImpulse ] ---

    public static void btMultiBodySolverConstraint_setAppliedImpulse(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setAppliedImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setAppliedPushImpulse ] ---

    public static void btMultiBodySolverConstraint_setAppliedPushImpulse(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setAppliedPushImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setCfm ] ---

    public static void btMultiBodySolverConstraint_setCfm(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setCfm;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setContactNormal1 ] ---

    public static void nbtMultiBodySolverConstraint_setContactNormal1(long obj, long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setContactNormal1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySolverConstraint_setContactNormal1(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtMultiBodySolverConstraint_setContactNormal1(obj, value.address());
    }

    // --- [ btMultiBodySolverConstraint_setContactNormal2 ] ---

    public static void nbtMultiBodySolverConstraint_setContactNormal2(long obj, long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setContactNormal2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySolverConstraint_setContactNormal2(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtMultiBodySolverConstraint_setContactNormal2(obj, value.address());
    }

    // --- [ btMultiBodySolverConstraint_setDeltaVelAindex ] ---

    public static void btMultiBodySolverConstraint_setDeltaVelAindex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setDeltaVelAindex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setDeltaVelBindex ] ---

    public static void btMultiBodySolverConstraint_setDeltaVelBindex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setDeltaVelBindex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setFriction ] ---

    public static void btMultiBodySolverConstraint_setFriction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setFrictionIndex ] ---

    public static void btMultiBodySolverConstraint_setFrictionIndex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setFrictionIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setJacAindex ] ---

    public static void btMultiBodySolverConstraint_setJacAindex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setJacAindex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setJacBindex ] ---

    public static void btMultiBodySolverConstraint_setJacBindex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setJacBindex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setJacDiagABInv ] ---

    public static void btMultiBodySolverConstraint_setJacDiagABInv(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setJacDiagABInv;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setLinkA ] ---

    public static void btMultiBodySolverConstraint_setLinkA(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setLinkA;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setLinkB ] ---

    public static void btMultiBodySolverConstraint_setLinkB(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setLinkB;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setLowerLimit ] ---

    public static void btMultiBodySolverConstraint_setLowerLimit(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setLowerLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setMultiBodyA ] ---

    public static void btMultiBodySolverConstraint_setMultiBodyA(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setMultiBodyA;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setMultiBodyB ] ---

    public static void btMultiBodySolverConstraint_setMultiBodyB(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setMultiBodyB;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setOrgConstraint ] ---

    public static void btMultiBodySolverConstraint_setOrgConstraint(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setOrgConstraint;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setOrgDofIndex ] ---

    public static void btMultiBodySolverConstraint_setOrgDofIndex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setOrgDofIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setOriginalContactPoint ] ---

    public static void btMultiBodySolverConstraint_setOriginalContactPoint(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setOriginalContactPoint;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setOverrideNumSolverIterations ] ---

    public static void btMultiBodySolverConstraint_setOverrideNumSolverIterations(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setOverrideNumSolverIterations;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setRelpos1CrossNormal ] ---

    public static void nbtMultiBodySolverConstraint_setRelpos1CrossNormal(long obj, long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setRelpos1CrossNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySolverConstraint_setRelpos1CrossNormal(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtMultiBodySolverConstraint_setRelpos1CrossNormal(obj, value.address());
    }

    // --- [ btMultiBodySolverConstraint_setRelpos2CrossNormal ] ---

    public static void nbtMultiBodySolverConstraint_setRelpos2CrossNormal(long obj, long value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setRelpos2CrossNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBodySolverConstraint_setRelpos2CrossNormal(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtMultiBodySolverConstraint_setRelpos2CrossNormal(obj, value.address());
    }

    // --- [ btMultiBodySolverConstraint_setRhs ] ---

    public static void btMultiBodySolverConstraint_setRhs(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setRhs;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setRhsPenetration ] ---

    public static void btMultiBodySolverConstraint_setRhsPenetration(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setRhsPenetration;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setSolverBodyIdA ] ---

    public static void btMultiBodySolverConstraint_setSolverBodyIdA(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setSolverBodyIdA;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setSolverBodyIdB ] ---

    public static void btMultiBodySolverConstraint_setSolverBodyIdB(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setSolverBodyIdB;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setUnusedPadding4 ] ---

    public static void btMultiBodySolverConstraint_setUnusedPadding4(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setUnusedPadding4;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_setUpperLimit ] ---

    public static void btMultiBodySolverConstraint_setUpperLimit(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.MultiBodySolverConstraint_setUpperLimit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodySolverConstraint_delete ] ---

    public static void btMultiBodySolverConstraint_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodySolverConstraint_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}