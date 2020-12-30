/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTSimulationIslandManager {

    protected BTSimulationIslandManager() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SimulationIslandManager_IslandCallback_processIsland = apiGetFunctionAddress(LibBullet.getLibrary(), "btSimulationIslandManager_IslandCallback_processIsland"),
            SimulationIslandManager_IslandCallback_delete        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSimulationIslandManager_IslandCallback_delete"),
            SimulationIslandManager_new                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSimulationIslandManager_new"),
            SimulationIslandManager_buildAndProcessIslands       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSimulationIslandManager_buildAndProcessIslands"),
            SimulationIslandManager_buildIslands                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSimulationIslandManager_buildIslands"),
            SimulationIslandManager_findUnions                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSimulationIslandManager_findUnions"),
            SimulationIslandManager_getSplitIslands              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSimulationIslandManager_getSplitIslands"),
            SimulationIslandManager_getUnionFind                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSimulationIslandManager_getUnionFind"),
            SimulationIslandManager_initUnionFind                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSimulationIslandManager_initUnionFind"),
            SimulationIslandManager_setSplitIslands              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSimulationIslandManager_setSplitIslands"),
            SimulationIslandManager_storeIslandActivationState   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSimulationIslandManager_storeIslandActivationState"),
            SimulationIslandManager_updateActivationState        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSimulationIslandManager_updateActivationState"),
            SimulationIslandManager_delete                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSimulationIslandManager_delete");

    }

    // --- [ btSimulationIslandManager_IslandCallback_processIsland ] ---

    public static void nbtSimulationIslandManager_IslandCallback_processIsland(long obj, long bodies, int numBodies, long manifolds, int numManifolds, int islandId) {
        long __functionAddress = Functions.SimulationIslandManager_IslandCallback_processIsland;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, bodies, numBodies, manifolds, numManifolds, islandId, __functionAddress);
    }

    public static void btSimulationIslandManager_IslandCallback_processIsland(@NativeType("void *") long obj, @NativeType("void **") PointerBuffer bodies, @NativeType("void **") PointerBuffer manifolds, int islandId) {
        nbtSimulationIslandManager_IslandCallback_processIsland(obj, memAddress(bodies), bodies.remaining(), memAddress(manifolds), manifolds.remaining(), islandId);
    }

    // --- [ btSimulationIslandManager_IslandCallback_delete ] ---

    public static void btSimulationIslandManager_IslandCallback_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SimulationIslandManager_IslandCallback_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSimulationIslandManager_new ] ---

    @NativeType("void *")
    public static long btSimulationIslandManager_new() {
        long __functionAddress = Functions.SimulationIslandManager_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSimulationIslandManager_buildAndProcessIslands ] ---

    public static void btSimulationIslandManager_buildAndProcessIslands(@NativeType("void *") long obj, @NativeType("void *") long dispatcher, @NativeType("void *") long collisionWorld, @NativeType("void *") long callback) {
        long __functionAddress = Functions.SimulationIslandManager_buildAndProcessIslands;
        if (CHECKS) {
            check(obj);
            check(dispatcher);
            check(collisionWorld);
            check(callback);
        }
        invokePPPPV(obj, dispatcher, collisionWorld, callback, __functionAddress);
    }

    // --- [ btSimulationIslandManager_buildIslands ] ---

    public static void btSimulationIslandManager_buildIslands(@NativeType("void *") long obj, @NativeType("void *") long dispatcher, @NativeType("void *") long colWorld) {
        long __functionAddress = Functions.SimulationIslandManager_buildIslands;
        if (CHECKS) {
            check(obj);
            check(dispatcher);
            check(colWorld);
        }
        invokePPPV(obj, dispatcher, colWorld, __functionAddress);
    }

    // --- [ btSimulationIslandManager_findUnions ] ---

    public static void btSimulationIslandManager_findUnions(@NativeType("void *") long obj, @NativeType("void *") long dispatcher, @NativeType("void *") long colWorld) {
        long __functionAddress = Functions.SimulationIslandManager_findUnions;
        if (CHECKS) {
            check(obj);
            check(dispatcher);
            check(colWorld);
        }
        invokePPPV(obj, dispatcher, colWorld, __functionAddress);
    }

    // --- [ btSimulationIslandManager_getSplitIslands ] ---

    @NativeType("bool")
    public static boolean btSimulationIslandManager_getSplitIslands(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SimulationIslandManager_getSplitIslands;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSimulationIslandManager_getUnionFind ] ---

    @NativeType("void *")
    public static long btSimulationIslandManager_getUnionFind(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SimulationIslandManager_getUnionFind;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSimulationIslandManager_initUnionFind ] ---

    public static void btSimulationIslandManager_initUnionFind(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.SimulationIslandManager_initUnionFind;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, n, __functionAddress);
    }

    // --- [ btSimulationIslandManager_setSplitIslands ] ---

    public static void btSimulationIslandManager_setSplitIslands(@NativeType("void *") long obj, @NativeType("bool") boolean doSplitIslands) {
        long __functionAddress = Functions.SimulationIslandManager_setSplitIslands;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, doSplitIslands, __functionAddress);
    }

    // --- [ btSimulationIslandManager_storeIslandActivationState ] ---

    public static void btSimulationIslandManager_storeIslandActivationState(@NativeType("void *") long obj, @NativeType("void *") long world) {
        long __functionAddress = Functions.SimulationIslandManager_storeIslandActivationState;
        if (CHECKS) {
            check(obj);
            check(world);
        }
        invokePPV(obj, world, __functionAddress);
    }

    // --- [ btSimulationIslandManager_updateActivationState ] ---

    public static void btSimulationIslandManager_updateActivationState(@NativeType("void *") long obj, @NativeType("void *") long colWorld, @NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.SimulationIslandManager_updateActivationState;
        if (CHECKS) {
            check(obj);
            check(colWorld);
            check(dispatcher);
        }
        invokePPPV(obj, colWorld, dispatcher, __functionAddress);
    }

    // --- [ btSimulationIslandManager_delete ] ---

    public static void btSimulationIslandManager_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SimulationIslandManager_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}