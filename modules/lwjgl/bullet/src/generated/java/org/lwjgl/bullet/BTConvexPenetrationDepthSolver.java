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

public class BTConvexPenetrationDepthSolver {

    protected BTConvexPenetrationDepthSolver() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ConvexPenetrationDepthSolver_calcPenDepth = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPenetrationDepthSolver_calcPenDepth"),
            ConvexPenetrationDepthSolver_delete       = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPenetrationDepthSolver_delete");

    }

    // --- [ btConvexPenetrationDepthSolver_calcPenDepth ] ---

    public static boolean nbtConvexPenetrationDepthSolver_calcPenDepth(long obj, long simplexSolver, long convexA, long convexB, long transA, long transB, long v, long pa, long pb, long debugDraw) {
        long __functionAddress = Functions.ConvexPenetrationDepthSolver_calcPenDepth;
        if (CHECKS) {
            check(obj);
            check(simplexSolver);
            check(convexA);
            check(convexB);
            check(debugDraw);
        }
        return invokePPPPPPPPPPZ(obj, simplexSolver, convexA, convexB, transA, transB, v, pa, pb, debugDraw, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btConvexPenetrationDepthSolver_calcPenDepth(@NativeType("void *") long obj, @NativeType("void *") long simplexSolver, @NativeType("void *") long convexA, @NativeType("void *") long convexB, @NativeType("btTransform const *") BTTransform transA, @NativeType("btTransform const *") BTTransform transB, @NativeType("btVector3 *") BTVector3 v, @NativeType("btVector3 *") BTVector3 pa, @NativeType("btVector3 *") BTVector3 pb, @NativeType("void *") long debugDraw) {
        return nbtConvexPenetrationDepthSolver_calcPenDepth(obj, simplexSolver, convexA, convexB, transA.address(), transB.address(), v.address(), pa.address(), pb.address(), debugDraw);
    }

    // --- [ btConvexPenetrationDepthSolver_delete ] ---

    public static void btConvexPenetrationDepthSolver_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexPenetrationDepthSolver_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}