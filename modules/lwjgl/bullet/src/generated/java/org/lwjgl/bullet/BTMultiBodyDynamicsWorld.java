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

public class BTMultiBodyDynamicsWorld {

    protected BTMultiBodyDynamicsWorld() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MultiBodyDynamicsWorld_new                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyDynamicsWorld_new"),
            MultiBodyDynamicsWorld_addMultiBody                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyDynamicsWorld_addMultiBody"),
            MultiBodyDynamicsWorld_addMultiBodyConstraint         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyDynamicsWorld_addMultiBodyConstraint"),
            MultiBodyDynamicsWorld_clearMultiBodyConstraintForces = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyDynamicsWorld_clearMultiBodyConstraintForces"),
            MultiBodyDynamicsWorld_clearMultiBodyForces           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyDynamicsWorld_clearMultiBodyForces"),
            MultiBodyDynamicsWorld_debugDrawMultiBodyConstraint   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyDynamicsWorld_debugDrawMultiBodyConstraint"),
            MultiBodyDynamicsWorld_forwardKinematics              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyDynamicsWorld_forwardKinematics"),
            MultiBodyDynamicsWorld_getMultiBody                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyDynamicsWorld_getMultiBody"),
            MultiBodyDynamicsWorld_getMultiBodyConstraint         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyDynamicsWorld_getMultiBodyConstraint"),
            MultiBodyDynamicsWorld_getNumMultibodies              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyDynamicsWorld_getNumMultibodies"),
            MultiBodyDynamicsWorld_getNumMultiBodyConstraints     = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyDynamicsWorld_getNumMultiBodyConstraints"),
            MultiBodyDynamicsWorld_integrateTransforms            = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyDynamicsWorld_integrateTransforms"),
            MultiBodyDynamicsWorld_removeMultiBody                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyDynamicsWorld_removeMultiBody"),
            MultiBodyDynamicsWorld_removeMultiBodyConstraint      = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyDynamicsWorld_removeMultiBodyConstraint");

    }

    // --- [ btMultiBodyDynamicsWorld_new ] ---

    @NativeType("void *")
    public static long btMultiBodyDynamicsWorld_new(@NativeType("void *") long dispatcher, @NativeType("void *") long pairCache, @NativeType("void *") long constraintSolver, @NativeType("void *") long collisionConfiguration) {
        long __functionAddress = Functions.MultiBodyDynamicsWorld_new;
        if (CHECKS) {
            check(dispatcher);
            check(pairCache);
            check(constraintSolver);
            check(collisionConfiguration);
        }
        return invokePPPPP(dispatcher, pairCache, constraintSolver, collisionConfiguration, __functionAddress);
    }

    // --- [ btMultiBodyDynamicsWorld_addMultiBody ] ---

    public static void btMultiBodyDynamicsWorld_addMultiBody(@NativeType("void *") long obj, @NativeType("void *") long body, int group, int mask) {
        long __functionAddress = Functions.MultiBodyDynamicsWorld_addMultiBody;
        if (CHECKS) {
            check(obj);
            check(body);
        }
        invokePPV(obj, body, group, mask, __functionAddress);
    }

    // --- [ btMultiBodyDynamicsWorld_addMultiBodyConstraint ] ---

    public static void btMultiBodyDynamicsWorld_addMultiBodyConstraint(@NativeType("void *") long obj, @NativeType("void *") long constraint) {
        long __functionAddress = Functions.MultiBodyDynamicsWorld_addMultiBodyConstraint;
        if (CHECKS) {
            check(obj);
            check(constraint);
        }
        invokePPV(obj, constraint, __functionAddress);
    }

    // --- [ btMultiBodyDynamicsWorld_clearMultiBodyConstraintForces ] ---

    public static void btMultiBodyDynamicsWorld_clearMultiBodyConstraintForces(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyDynamicsWorld_clearMultiBodyConstraintForces;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btMultiBodyDynamicsWorld_clearMultiBodyForces ] ---

    public static void btMultiBodyDynamicsWorld_clearMultiBodyForces(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyDynamicsWorld_clearMultiBodyForces;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btMultiBodyDynamicsWorld_debugDrawMultiBodyConstraint ] ---

    public static void btMultiBodyDynamicsWorld_debugDrawMultiBodyConstraint(@NativeType("void *") long obj, @NativeType("void *") long constraint) {
        long __functionAddress = Functions.MultiBodyDynamicsWorld_debugDrawMultiBodyConstraint;
        if (CHECKS) {
            check(obj);
            check(constraint);
        }
        invokePPV(obj, constraint, __functionAddress);
    }

    // --- [ btMultiBodyDynamicsWorld_forwardKinematics ] ---

    public static void btMultiBodyDynamicsWorld_forwardKinematics(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyDynamicsWorld_forwardKinematics;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btMultiBodyDynamicsWorld_getMultiBody ] ---

    @NativeType("void *")
    public static long btMultiBodyDynamicsWorld_getMultiBody(@NativeType("void *") long obj, int mbIndex) {
        long __functionAddress = Functions.MultiBodyDynamicsWorld_getMultiBody;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, mbIndex, __functionAddress);
    }

    // --- [ btMultiBodyDynamicsWorld_getMultiBodyConstraint ] ---

    @NativeType("void *")
    public static long btMultiBodyDynamicsWorld_getMultiBodyConstraint(@NativeType("void *") long obj, int constraintIndex) {
        long __functionAddress = Functions.MultiBodyDynamicsWorld_getMultiBodyConstraint;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, constraintIndex, __functionAddress);
    }

    // --- [ btMultiBodyDynamicsWorld_getNumMultibodies ] ---

    public static int btMultiBodyDynamicsWorld_getNumMultibodies(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyDynamicsWorld_getNumMultibodies;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodyDynamicsWorld_getNumMultiBodyConstraints ] ---

    public static int btMultiBodyDynamicsWorld_getNumMultiBodyConstraints(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyDynamicsWorld_getNumMultiBodyConstraints;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodyDynamicsWorld_integrateTransforms ] ---

    public static void btMultiBodyDynamicsWorld_integrateTransforms(@NativeType("void *") long obj, @NativeType("btScalar") float timeStep) {
        long __functionAddress = Functions.MultiBodyDynamicsWorld_integrateTransforms;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, timeStep, __functionAddress);
    }

    // --- [ btMultiBodyDynamicsWorld_removeMultiBody ] ---

    public static void btMultiBodyDynamicsWorld_removeMultiBody(@NativeType("void *") long obj, @NativeType("void *") long body) {
        long __functionAddress = Functions.MultiBodyDynamicsWorld_removeMultiBody;
        if (CHECKS) {
            check(obj);
            check(body);
        }
        invokePPV(obj, body, __functionAddress);
    }

    // --- [ btMultiBodyDynamicsWorld_removeMultiBodyConstraint ] ---

    public static void btMultiBodyDynamicsWorld_removeMultiBodyConstraint(@NativeType("void *") long obj, @NativeType("void *") long constraint) {
        long __functionAddress = Functions.MultiBodyDynamicsWorld_removeMultiBodyConstraint;
        if (CHECKS) {
            check(obj);
            check(constraint);
        }
        invokePPV(obj, constraint, __functionAddress);
    }

}