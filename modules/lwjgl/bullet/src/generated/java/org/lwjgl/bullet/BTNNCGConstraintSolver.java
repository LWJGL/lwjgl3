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

public class BTNNCGConstraintSolver {

    protected BTNNCGConstraintSolver() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            NNCGConstraintSolver_new                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btNNCGConstraintSolver_new"),
            NNCGConstraintSolver_getOnlyForNoneContact = apiGetFunctionAddress(LibBullet.getLibrary(), "btNNCGConstraintSolver_getOnlyForNoneContact"),
            NNCGConstraintSolver_setOnlyForNoneContact = apiGetFunctionAddress(LibBullet.getLibrary(), "btNNCGConstraintSolver_setOnlyForNoneContact");

    }

    // --- [ btNNCGConstraintSolver_new ] ---

    @NativeType("void *")
    public static long btNNCGConstraintSolver_new() {
        long __functionAddress = Functions.NNCGConstraintSolver_new;
        return invokeP(__functionAddress);
    }

    // --- [ btNNCGConstraintSolver_getOnlyForNoneContact ] ---

    @NativeType("bool")
    public static boolean btNNCGConstraintSolver_getOnlyForNoneContact(@NativeType("void *") long obj) {
        long __functionAddress = Functions.NNCGConstraintSolver_getOnlyForNoneContact;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btNNCGConstraintSolver_setOnlyForNoneContact ] ---

    public static void btNNCGConstraintSolver_setOnlyForNoneContact(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.NNCGConstraintSolver_setOnlyForNoneContact;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

}