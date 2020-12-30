/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;

public class BTDantzigSolver {

    protected BTDantzigSolver() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            DantzigSolver_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btDantzigSolver_new");

    }

    // --- [ btDantzigSolver_new ] ---

    @NativeType("void *")
    public static long btDantzigSolver_new() {
        long __functionAddress = Functions.DantzigSolver_new;
        return invokeP(__functionAddress);
    }

}