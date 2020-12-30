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

public class BTMultiBodyJointLimitConstraint {

    protected BTMultiBodyJointLimitConstraint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MultiBodyJointLimitConstraint_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyJointLimitConstraint_new");

    }

    // --- [ btMultiBodyJointLimitConstraint_new ] ---

    @NativeType("void *")
    public static long btMultiBodyJointLimitConstraint_new(@NativeType("void *") long body, int link, @NativeType("btScalar") float lower, @NativeType("btScalar") float upper) {
        long __functionAddress = Functions.MultiBodyJointLimitConstraint_new;
        if (CHECKS) {
            check(body);
        }
        return invokePP(body, link, lower, upper, __functionAddress);
    }

}