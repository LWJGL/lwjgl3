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

public class BTFixedConstraint {

    protected BTFixedConstraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            FixedConstraint_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btFixedConstraint_new");

    }

    // --- [ btFixedConstraint_new ] ---

    public static long nbtFixedConstraint_new(long rbA, long rbB, long frameInA, long frameInB) {
        long __functionAddress = Functions.FixedConstraint_new;
        if (CHECKS) {
            check(rbA);
            check(rbB);
        }
        return invokePPPPP(rbA, rbB, frameInA, frameInB, __functionAddress);
    }

    @NativeType("void *")
    public static long btFixedConstraint_new(@NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform frameInA, @NativeType("btTransform const *") BTTransform frameInB) {
        return nbtFixedConstraint_new(rbA, rbB, frameInA.address(), frameInB.address());
    }

}