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

public class BTMultiBodyConstraintSolver {

    protected BTMultiBodyConstraintSolver() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MultiBodyConstraintSolver_new                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraintSolver_new"),
            MultiBodyConstraintSolver_solveGroupCacheFriendlyFinish = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraintSolver_solveGroupCacheFriendlyFinish"),
            MultiBodyConstraintSolver_solveMultiBodyGroup           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyConstraintSolver_solveMultiBodyGroup");

    }

    // --- [ btMultiBodyConstraintSolver_new ] ---

    @NativeType("void *")
    public static long btMultiBodyConstraintSolver_new() {
        long __functionAddress = Functions.MultiBodyConstraintSolver_new;
        return invokeP(__functionAddress);
    }

    // --- [ btMultiBodyConstraintSolver_solveGroupCacheFriendlyFinish ] ---

    public static float nbtMultiBodyConstraintSolver_solveGroupCacheFriendlyFinish(long obj, long bodies, int numBodies, long infoGlobal) {
        long __functionAddress = Functions.MultiBodyConstraintSolver_solveGroupCacheFriendlyFinish;
        if (CHECKS) {
            check(obj);
            check(infoGlobal);
        }
        return invokePPPF(obj, bodies, numBodies, infoGlobal, __functionAddress);
    }

    @NativeType("btScalar")
    public static float btMultiBodyConstraintSolver_solveGroupCacheFriendlyFinish(@NativeType("void *") long obj, @NativeType("void **") PointerBuffer bodies, @NativeType("void *") long infoGlobal) {
        return nbtMultiBodyConstraintSolver_solveGroupCacheFriendlyFinish(obj, memAddress(bodies), bodies.remaining(), infoGlobal);
    }

    // --- [ btMultiBodyConstraintSolver_solveMultiBodyGroup ] ---

    public static void nbtMultiBodyConstraintSolver_solveMultiBodyGroup(long obj, long bodies, int numBodies, long manifold, int numManifolds, long constraints, int numConstraints, long multiBodyConstraints, int numMultiBodyConstraints, long info, long debugDrawer, long dispatcher) {
        long __functionAddress = Functions.MultiBodyConstraintSolver_solveMultiBodyGroup;
        if (CHECKS) {
            check(obj);
            check(info);
            check(debugDrawer);
            check(dispatcher);
        }
        invokePPPPPPPPV(obj, bodies, numBodies, manifold, numManifolds, constraints, numConstraints, multiBodyConstraints, numMultiBodyConstraints, info, debugDrawer, dispatcher, __functionAddress);
    }

    public static void btMultiBodyConstraintSolver_solveMultiBodyGroup(@NativeType("void *") long obj, @NativeType("void **") PointerBuffer bodies, @NativeType("void **") PointerBuffer manifold, @NativeType("void **") PointerBuffer constraints, @NativeType("void **") PointerBuffer multiBodyConstraints, @NativeType("void *") long info, @NativeType("void *") long debugDrawer, @NativeType("void *") long dispatcher) {
        nbtMultiBodyConstraintSolver_solveMultiBodyGroup(obj, memAddress(bodies), bodies.remaining(), memAddress(manifold), manifold.remaining(), memAddress(constraints), constraints.remaining(), memAddress(multiBodyConstraints), multiBodyConstraints.remaining(), info, debugDrawer, dispatcher);
    }

}