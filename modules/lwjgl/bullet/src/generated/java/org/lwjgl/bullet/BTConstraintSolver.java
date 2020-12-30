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

public class BTConstraintSolver {

    protected BTConstraintSolver() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ConstraintSolver_allSolved     = apiGetFunctionAddress(LibBullet.getLibrary(), "btConstraintSolver_allSolved"),
            ConstraintSolver_getSolverType = apiGetFunctionAddress(LibBullet.getLibrary(), "btConstraintSolver_getSolverType"),
            ConstraintSolver_prepareSolve  = apiGetFunctionAddress(LibBullet.getLibrary(), "btConstraintSolver_prepareSolve"),
            ConstraintSolver_reset         = apiGetFunctionAddress(LibBullet.getLibrary(), "btConstraintSolver_reset"),
            ConstraintSolver_solveGroup    = apiGetFunctionAddress(LibBullet.getLibrary(), "btConstraintSolver_solveGroup"),
            ConstraintSolver_delete        = apiGetFunctionAddress(LibBullet.getLibrary(), "btConstraintSolver_delete");

    }

    // --- [ btConstraintSolver_allSolved ] ---

    public static void btConstraintSolver_allSolved(@NativeType("void *") long obj, @NativeType("void *") long __unnamed0, @NativeType("void *") long __unnamed1) {
        long __functionAddress = Functions.ConstraintSolver_allSolved;
        if (CHECKS) {
            check(obj);
            check(__unnamed0);
            check(__unnamed1);
        }
        invokePPPV(obj, __unnamed0, __unnamed1, __functionAddress);
    }

    // --- [ btConstraintSolver_getSolverType ] ---

    public static int btConstraintSolver_getSolverType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConstraintSolver_getSolverType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btConstraintSolver_prepareSolve ] ---

    public static void btConstraintSolver_prepareSolve(@NativeType("void *") long obj, int __unnamed0, int __unnamed1) {
        long __functionAddress = Functions.ConstraintSolver_prepareSolve;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __unnamed0, __unnamed1, __functionAddress);
    }

    // --- [ btConstraintSolver_reset ] ---

    public static void btConstraintSolver_reset(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConstraintSolver_reset;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btConstraintSolver_solveGroup ] ---

    public static float nbtConstraintSolver_solveGroup(long obj, long bodies, int numBodies, long manifold, int numManifolds, long constraints, int numConstraints, long info, long debugDrawer, long dispatcher) {
        long __functionAddress = Functions.ConstraintSolver_solveGroup;
        if (CHECKS) {
            check(obj);
            check(info);
            check(debugDrawer);
            check(dispatcher);
        }
        return invokePPPPPPPF(obj, bodies, numBodies, manifold, numManifolds, constraints, numConstraints, info, debugDrawer, dispatcher, __functionAddress);
    }

    @NativeType("btScalar")
    public static float btConstraintSolver_solveGroup(@NativeType("void *") long obj, @NativeType("void **") PointerBuffer bodies, @NativeType("void **") PointerBuffer manifold, @NativeType("void **") PointerBuffer constraints, @NativeType("void *") long info, @NativeType("void *") long debugDrawer, @NativeType("void *") long dispatcher) {
        return nbtConstraintSolver_solveGroup(obj, memAddress(bodies), bodies.remaining(), memAddress(manifold), manifold.remaining(), memAddress(constraints), constraints.remaining(), info, debugDrawer, dispatcher);
    }

    // --- [ btConstraintSolver_delete ] ---

    public static void btConstraintSolver_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConstraintSolver_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}