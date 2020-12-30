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

public class BTSoftBodySolvers {

    protected BTSoftBodySolvers() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SoftBodySolver_checkInitialized              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodySolver_checkInitialized"),
            SoftBodySolver_copyBackToSoftBodies          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodySolver_copyBackToSoftBodies"),
            SoftBodySolver_getNumberOfPositionIterations = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodySolver_getNumberOfPositionIterations"),
            SoftBodySolver_getNumberOfVelocityIterations = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodySolver_getNumberOfVelocityIterations"),
            SoftBodySolver_getTimeScale                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodySolver_getTimeScale"),
            SoftBodySolver_predictMotion                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodySolver_predictMotion"),
            SoftBodySolver_setNumberOfPositionIterations = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodySolver_setNumberOfPositionIterations"),
            SoftBodySolver_setNumberOfVelocityIterations = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodySolver_setNumberOfVelocityIterations"),
            SoftBodySolver_solveConstraints              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodySolver_solveConstraints"),
            SoftBodySolver_updateSoftBodies              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodySolver_updateSoftBodies"),
            SoftBodySolver_delete                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodySolver_delete"),
            SoftBodySolverOutput_delete                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodySolverOutput_delete");

    }

    // --- [ btSoftBodySolver_checkInitialized ] ---

    @NativeType("bool")
    public static boolean btSoftBodySolver_checkInitialized(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodySolver_checkInitialized;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSoftBodySolver_copyBackToSoftBodies ] ---

    public static void btSoftBodySolver_copyBackToSoftBodies(@NativeType("void *") long obj, @NativeType("bool") boolean bMove) {
        long __functionAddress = Functions.SoftBodySolver_copyBackToSoftBodies;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, bMove, __functionAddress);
    }

    // --- [ btSoftBodySolver_getNumberOfPositionIterations ] ---

    public static int btSoftBodySolver_getNumberOfPositionIterations(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodySolver_getNumberOfPositionIterations;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBodySolver_getNumberOfVelocityIterations ] ---

    public static int btSoftBodySolver_getNumberOfVelocityIterations(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodySolver_getNumberOfVelocityIterations;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBodySolver_getTimeScale ] ---

    /** EXPORT SolverTypes btSoftBodySolver_getSolverType(btSoftBodySolver* obj); */
    public static float btSoftBodySolver_getTimeScale(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodySolver_getTimeScale;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBodySolver_predictMotion ] ---

    /** EXPORT void btSoftBodySolver_optimize(btSoftBodySolver* obj, btAlignedObjectArray_btSoftBodyPtr* softBodies, bool forceUpdate); */
    public static void btSoftBodySolver_predictMotion(@NativeType("void *") long obj, float solverdt) {
        long __functionAddress = Functions.SoftBodySolver_predictMotion;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, solverdt, __functionAddress);
    }

    // --- [ btSoftBodySolver_setNumberOfPositionIterations ] ---

    /**
     * EXPORT void btSoftBodySolver_processCollision(btSoftBodySolver* obj, btSoftBody* __unnamed0, const btCollisionObjectWrapper* __unnamed1); EXPORT void
     * btSoftBodySolver_processCollision2(btSoftBodySolver* obj, btSoftBody* __unnamed0, btSoftBody* __unnamed1);
     */
    public static void btSoftBodySolver_setNumberOfPositionIterations(@NativeType("void *") long obj, int iterations) {
        long __functionAddress = Functions.SoftBodySolver_setNumberOfPositionIterations;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, iterations, __functionAddress);
    }

    // --- [ btSoftBodySolver_setNumberOfVelocityIterations ] ---

    public static void btSoftBodySolver_setNumberOfVelocityIterations(@NativeType("void *") long obj, int iterations) {
        long __functionAddress = Functions.SoftBodySolver_setNumberOfVelocityIterations;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, iterations, __functionAddress);
    }

    // --- [ btSoftBodySolver_solveConstraints ] ---

    public static void btSoftBodySolver_solveConstraints(@NativeType("void *") long obj, float solverdt) {
        long __functionAddress = Functions.SoftBodySolver_solveConstraints;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, solverdt, __functionAddress);
    }

    // --- [ btSoftBodySolver_updateSoftBodies ] ---

    public static void btSoftBodySolver_updateSoftBodies(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodySolver_updateSoftBodies;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBodySolver_delete ] ---

    public static void btSoftBodySolver_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodySolver_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBodySolverOutput_delete ] ---

    /**
     * EXPORT void btSoftBodySolverOutput_copySoftBodyToVertexBuffer(btSoftBodySolverOutput* obj, const btSoftBody* softBody, btVertexBufferDescriptor*
     * vertexBuffer);
     */
    public static void btSoftBodySolverOutput_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodySolverOutput_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}