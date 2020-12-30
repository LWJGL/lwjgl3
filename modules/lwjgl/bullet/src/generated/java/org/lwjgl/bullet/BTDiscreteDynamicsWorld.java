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

public class BTDiscreteDynamicsWorld {

    protected BTDiscreteDynamicsWorld() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            DiscreteDynamicsWorld_new                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteDynamicsWorld_new"),
            DiscreteDynamicsWorld_applyGravity                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteDynamicsWorld_applyGravity"),
            DiscreteDynamicsWorld_debugDrawConstraint                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteDynamicsWorld_debugDrawConstraint"),
            DiscreteDynamicsWorld_getApplySpeculativeContactRestitution = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteDynamicsWorld_getApplySpeculativeContactRestitution"),
            DiscreteDynamicsWorld_getCollisionWorld                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteDynamicsWorld_getCollisionWorld"),
            DiscreteDynamicsWorld_getLatencyMotionStateInterpolation    = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteDynamicsWorld_getLatencyMotionStateInterpolation"),
            DiscreteDynamicsWorld_getSimulationIslandManager            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteDynamicsWorld_getSimulationIslandManager"),
            DiscreteDynamicsWorld_getSynchronizeAllMotionStates         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteDynamicsWorld_getSynchronizeAllMotionStates"),
            DiscreteDynamicsWorld_setApplySpeculativeContactRestitution = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteDynamicsWorld_setApplySpeculativeContactRestitution"),
            DiscreteDynamicsWorld_setLatencyMotionStateInterpolation    = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteDynamicsWorld_setLatencyMotionStateInterpolation"),
            DiscreteDynamicsWorld_setNumTasks                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteDynamicsWorld_setNumTasks"),
            DiscreteDynamicsWorld_setSynchronizeAllMotionStates         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteDynamicsWorld_setSynchronizeAllMotionStates"),
            DiscreteDynamicsWorld_synchronizeSingleMotionState          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteDynamicsWorld_synchronizeSingleMotionState"),
            DiscreteDynamicsWorld_updateVehicles                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDiscreteDynamicsWorld_updateVehicles");

    }

    // --- [ btDiscreteDynamicsWorld_new ] ---

    @NativeType("void *")
    public static long btDiscreteDynamicsWorld_new(@NativeType("void *") long dispatcher, @NativeType("void *") long pairCache, @NativeType("void *") long constraintSolver, @NativeType("void *") long collisionConfiguration) {
        long __functionAddress = Functions.DiscreteDynamicsWorld_new;
        if (CHECKS) {
            check(dispatcher);
            check(pairCache);
            check(constraintSolver);
            check(collisionConfiguration);
        }
        return invokePPPPP(dispatcher, pairCache, constraintSolver, collisionConfiguration, __functionAddress);
    }

    // --- [ btDiscreteDynamicsWorld_applyGravity ] ---

    public static void btDiscreteDynamicsWorld_applyGravity(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DiscreteDynamicsWorld_applyGravity;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDiscreteDynamicsWorld_debugDrawConstraint ] ---

    public static void btDiscreteDynamicsWorld_debugDrawConstraint(@NativeType("void *") long obj, @NativeType("void *") long constraint) {
        long __functionAddress = Functions.DiscreteDynamicsWorld_debugDrawConstraint;
        if (CHECKS) {
            check(obj);
            check(constraint);
        }
        invokePPV(obj, constraint, __functionAddress);
    }

    // --- [ btDiscreteDynamicsWorld_getApplySpeculativeContactRestitution ] ---

    @NativeType("bool")
    public static boolean btDiscreteDynamicsWorld_getApplySpeculativeContactRestitution(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DiscreteDynamicsWorld_getApplySpeculativeContactRestitution;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btDiscreteDynamicsWorld_getCollisionWorld ] ---

    @NativeType("void *")
    public static long btDiscreteDynamicsWorld_getCollisionWorld(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DiscreteDynamicsWorld_getCollisionWorld;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDiscreteDynamicsWorld_getLatencyMotionStateInterpolation ] ---

    @NativeType("bool")
    public static boolean btDiscreteDynamicsWorld_getLatencyMotionStateInterpolation(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DiscreteDynamicsWorld_getLatencyMotionStateInterpolation;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btDiscreteDynamicsWorld_getSimulationIslandManager ] ---

    @NativeType("void *")
    public static long btDiscreteDynamicsWorld_getSimulationIslandManager(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DiscreteDynamicsWorld_getSimulationIslandManager;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDiscreteDynamicsWorld_getSynchronizeAllMotionStates ] ---

    @NativeType("bool")
    public static boolean btDiscreteDynamicsWorld_getSynchronizeAllMotionStates(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DiscreteDynamicsWorld_getSynchronizeAllMotionStates;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btDiscreteDynamicsWorld_setApplySpeculativeContactRestitution ] ---

    public static void btDiscreteDynamicsWorld_setApplySpeculativeContactRestitution(@NativeType("void *") long obj, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.DiscreteDynamicsWorld_setApplySpeculativeContactRestitution;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, enable, __functionAddress);
    }

    // --- [ btDiscreteDynamicsWorld_setLatencyMotionStateInterpolation ] ---

    public static void btDiscreteDynamicsWorld_setLatencyMotionStateInterpolation(@NativeType("void *") long obj, @NativeType("bool") boolean latencyInterpolation) {
        long __functionAddress = Functions.DiscreteDynamicsWorld_setLatencyMotionStateInterpolation;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, latencyInterpolation, __functionAddress);
    }

    // --- [ btDiscreteDynamicsWorld_setNumTasks ] ---

    public static void btDiscreteDynamicsWorld_setNumTasks(@NativeType("void *") long obj, int numTasks) {
        long __functionAddress = Functions.DiscreteDynamicsWorld_setNumTasks;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, numTasks, __functionAddress);
    }

    // --- [ btDiscreteDynamicsWorld_setSynchronizeAllMotionStates ] ---

    public static void btDiscreteDynamicsWorld_setSynchronizeAllMotionStates(@NativeType("void *") long obj, @NativeType("bool") boolean synchronizeAll) {
        long __functionAddress = Functions.DiscreteDynamicsWorld_setSynchronizeAllMotionStates;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, synchronizeAll, __functionAddress);
    }

    // --- [ btDiscreteDynamicsWorld_synchronizeSingleMotionState ] ---

    public static void btDiscreteDynamicsWorld_synchronizeSingleMotionState(@NativeType("void *") long obj, @NativeType("void *") long body) {
        long __functionAddress = Functions.DiscreteDynamicsWorld_synchronizeSingleMotionState;
        if (CHECKS) {
            check(obj);
            check(body);
        }
        invokePPV(obj, body, __functionAddress);
    }

    // --- [ btDiscreteDynamicsWorld_updateVehicles ] ---

    public static void btDiscreteDynamicsWorld_updateVehicles(@NativeType("void *") long obj, @NativeType("btScalar") float timeStep) {
        long __functionAddress = Functions.DiscreteDynamicsWorld_updateVehicles;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, timeStep, __functionAddress);
    }

}