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

public class BTDynamicsWorld {

    protected BTDynamicsWorld() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            DynamicsWorld_addAction               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_addAction"),
            DynamicsWorld_addConstraint           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_addConstraint"),
            DynamicsWorld_addRigidBody            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_addRigidBody"),
            DynamicsWorld_addRigidBody2           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_addRigidBody2"),
            DynamicsWorld_clearForces             = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_clearForces"),
            DynamicsWorld_getConstraint           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_getConstraint"),
            DynamicsWorld_getConstraintSolver     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_getConstraintSolver"),
            DynamicsWorld_getGravity              = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_getGravity"),
            DynamicsWorld_getNumConstraints       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_getNumConstraints"),
            DynamicsWorld_getSolverInfo           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_getSolverInfo"),
            DynamicsWorld_getWorldType            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_getWorldType"),
            DynamicsWorld_getWorldUserInfo        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_getWorldUserInfo"),
            DynamicsWorld_removeAction            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_removeAction"),
            DynamicsWorld_removeConstraint        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_removeConstraint"),
            DynamicsWorld_removeRigidBody         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_removeRigidBody"),
            DynamicsWorld_setConstraintSolver     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_setConstraintSolver"),
            DynamicsWorld_setGravity              = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_setGravity"),
            DynamicsWorld_setInternalTickCallback = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_setInternalTickCallback"),
            DynamicsWorld_setWorldUserInfo        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_setWorldUserInfo"),
            DynamicsWorld_stepSimulation          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_stepSimulation"),
            DynamicsWorld_synchronizeMotionStates = apiGetFunctionAddress(LibBullet.getLibrary(), "btDynamicsWorld_synchronizeMotionStates");

    }

    // --- [ btDynamicsWorld_addAction ] ---

    public static void btDynamicsWorld_addAction(@NativeType("void *") long obj, @NativeType("void *") long action) {
        long __functionAddress = Functions.DynamicsWorld_addAction;
        if (CHECKS) {
            check(obj);
            check(action);
        }
        invokePPV(obj, action, __functionAddress);
    }

    // --- [ btDynamicsWorld_addConstraint ] ---

    public static void btDynamicsWorld_addConstraint(@NativeType("void *") long obj, @NativeType("void *") long constraint, @NativeType("bool") boolean disableCollisionsBetweenLinkedBodies) {
        long __functionAddress = Functions.DynamicsWorld_addConstraint;
        if (CHECKS) {
            check(obj);
            check(constraint);
        }
        invokePPV(obj, constraint, disableCollisionsBetweenLinkedBodies, __functionAddress);
    }

    // --- [ btDynamicsWorld_addRigidBody ] ---

    public static void btDynamicsWorld_addRigidBody(@NativeType("void *") long obj, @NativeType("void *") long body) {
        long __functionAddress = Functions.DynamicsWorld_addRigidBody;
        if (CHECKS) {
            check(obj);
            check(body);
        }
        invokePPV(obj, body, __functionAddress);
    }

    // --- [ btDynamicsWorld_addRigidBody2 ] ---

    public static void btDynamicsWorld_addRigidBody2(@NativeType("void *") long obj, @NativeType("void *") long body, int group, int mask) {
        long __functionAddress = Functions.DynamicsWorld_addRigidBody2;
        if (CHECKS) {
            check(obj);
            check(body);
        }
        invokePPV(obj, body, group, mask, __functionAddress);
    }

    // --- [ btDynamicsWorld_clearForces ] ---

    public static void btDynamicsWorld_clearForces(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DynamicsWorld_clearForces;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDynamicsWorld_getConstraint ] ---

    @NativeType("void *")
    public static long btDynamicsWorld_getConstraint(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.DynamicsWorld_getConstraint;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btDynamicsWorld_getConstraintSolver ] ---

    @NativeType("void *")
    public static long btDynamicsWorld_getConstraintSolver(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DynamicsWorld_getConstraintSolver;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDynamicsWorld_getGravity ] ---

    public static void nbtDynamicsWorld_getGravity(long obj, long value) {
        long __functionAddress = Functions.DynamicsWorld_getGravity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDynamicsWorld_getGravity(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtDynamicsWorld_getGravity(obj, value.address());
    }

    // --- [ btDynamicsWorld_getNumConstraints ] ---

    public static int btDynamicsWorld_getNumConstraints(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DynamicsWorld_getNumConstraints;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDynamicsWorld_getSolverInfo ] ---

    @NativeType("void *")
    public static long btDynamicsWorld_getSolverInfo(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DynamicsWorld_getSolverInfo;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDynamicsWorld_getWorldType ] ---

    public static int btDynamicsWorld_getWorldType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DynamicsWorld_getWorldType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDynamicsWorld_getWorldUserInfo ] ---

    @NativeType("void *")
    public static long btDynamicsWorld_getWorldUserInfo(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DynamicsWorld_getWorldUserInfo;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDynamicsWorld_removeAction ] ---

    public static void btDynamicsWorld_removeAction(@NativeType("void *") long obj, @NativeType("void *") long action) {
        long __functionAddress = Functions.DynamicsWorld_removeAction;
        if (CHECKS) {
            check(obj);
            check(action);
        }
        invokePPV(obj, action, __functionAddress);
    }

    // --- [ btDynamicsWorld_removeConstraint ] ---

    public static void btDynamicsWorld_removeConstraint(@NativeType("void *") long obj, @NativeType("void *") long constraint) {
        long __functionAddress = Functions.DynamicsWorld_removeConstraint;
        if (CHECKS) {
            check(obj);
            check(constraint);
        }
        invokePPV(obj, constraint, __functionAddress);
    }

    // --- [ btDynamicsWorld_removeRigidBody ] ---

    public static void btDynamicsWorld_removeRigidBody(@NativeType("void *") long obj, @NativeType("void *") long body) {
        long __functionAddress = Functions.DynamicsWorld_removeRigidBody;
        if (CHECKS) {
            check(obj);
            check(body);
        }
        invokePPV(obj, body, __functionAddress);
    }

    // --- [ btDynamicsWorld_setConstraintSolver ] ---

    public static void btDynamicsWorld_setConstraintSolver(@NativeType("void *") long obj, @NativeType("void *") long solver) {
        long __functionAddress = Functions.DynamicsWorld_setConstraintSolver;
        if (CHECKS) {
            check(obj);
            check(solver);
        }
        invokePPV(obj, solver, __functionAddress);
    }

    // --- [ btDynamicsWorld_setGravity ] ---

    public static void nbtDynamicsWorld_setGravity(long obj, long gravity) {
        long __functionAddress = Functions.DynamicsWorld_setGravity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, gravity, __functionAddress);
    }

    public static void btDynamicsWorld_setGravity(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 gravity) {
        nbtDynamicsWorld_setGravity(obj, gravity.address());
    }

    // --- [ btDynamicsWorld_setInternalTickCallback ] ---

    public static void btDynamicsWorld_setInternalTickCallback(@NativeType("void *") long obj, @NativeType("void *") long cb, @NativeType("void *") long worldUserInfo, @NativeType("bool") boolean isPreTick) {
        long __functionAddress = Functions.DynamicsWorld_setInternalTickCallback;
        if (CHECKS) {
            check(obj);
            check(cb);
            check(worldUserInfo);
        }
        invokePPPV(obj, cb, worldUserInfo, isPreTick, __functionAddress);
    }

    // --- [ btDynamicsWorld_setWorldUserInfo ] ---

    public static void btDynamicsWorld_setWorldUserInfo(@NativeType("void *") long obj, @NativeType("void *") long worldUserInfo) {
        long __functionAddress = Functions.DynamicsWorld_setWorldUserInfo;
        if (CHECKS) {
            check(obj);
            check(worldUserInfo);
        }
        invokePPV(obj, worldUserInfo, __functionAddress);
    }

    // --- [ btDynamicsWorld_stepSimulation ] ---

    public static int btDynamicsWorld_stepSimulation(@NativeType("void *") long obj, @NativeType("btScalar") float timeStep, int maxSubSteps, @NativeType("btScalar") float fixedTimeStep) {
        long __functionAddress = Functions.DynamicsWorld_stepSimulation;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, timeStep, maxSubSteps, fixedTimeStep, __functionAddress);
    }

    // --- [ btDynamicsWorld_synchronizeMotionStates ] ---

    public static void btDynamicsWorld_synchronizeMotionStates(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DynamicsWorld_synchronizeMotionStates;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}