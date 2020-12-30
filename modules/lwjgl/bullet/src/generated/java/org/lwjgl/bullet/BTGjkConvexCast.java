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

public class BTGjkConvexCast {

    protected BTGjkConvexCast() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GjkConvexCast_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkConvexCast_new");

    }

    // --- [ btGjkConvexCast_new ] ---

    @NativeType("void *")
    public static long btGjkConvexCast_new(@NativeType("void *") long convexA, @NativeType("void *") long convexB, @NativeType("void *") long simplexSolver) {
        long __functionAddress = Functions.GjkConvexCast_new;
        if (CHECKS) {
            check(convexA);
            check(convexB);
            check(simplexSolver);
        }
        return invokePPPP(convexA, convexB, simplexSolver, __functionAddress);
    }

}