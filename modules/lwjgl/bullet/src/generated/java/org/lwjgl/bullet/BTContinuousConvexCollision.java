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

public class BTContinuousConvexCollision {

    protected BTContinuousConvexCollision() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ContinuousConvexCollision_new  = apiGetFunctionAddress(LibBullet.getLibrary(), "btContinuousConvexCollision_new"),
            ContinuousConvexCollision_new2 = apiGetFunctionAddress(LibBullet.getLibrary(), "btContinuousConvexCollision_new2");

    }

    // --- [ btContinuousConvexCollision_new ] ---

    @NativeType("void *")
    public static long btContinuousConvexCollision_new(@NativeType("void *") long shapeA, @NativeType("void *") long shapeB, @NativeType("void *") long simplexSolver, @NativeType("void *") long penetrationDepthSolver) {
        long __functionAddress = Functions.ContinuousConvexCollision_new;
        if (CHECKS) {
            check(shapeA);
            check(shapeB);
            check(simplexSolver);
            check(penetrationDepthSolver);
        }
        return invokePPPPP(shapeA, shapeB, simplexSolver, penetrationDepthSolver, __functionAddress);
    }

    // --- [ btContinuousConvexCollision_new2 ] ---

    @NativeType("void *")
    public static long btContinuousConvexCollision_new2(@NativeType("void *") long shapeA, @NativeType("void *") long plane) {
        long __functionAddress = Functions.ContinuousConvexCollision_new2;
        if (CHECKS) {
            check(shapeA);
            check(plane);
        }
        return invokePPP(shapeA, plane, __functionAddress);
    }

}