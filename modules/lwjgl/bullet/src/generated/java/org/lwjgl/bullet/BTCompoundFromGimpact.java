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

public class BTCompoundFromGimpact {

    protected BTCompoundFromGimpact() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CompoundFromGImpact_btCreateCompoundFromGimpactShape = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundFromGImpact_btCreateCompoundFromGimpactShape");

    }

    // --- [ btCompoundFromGImpact_btCreateCompoundFromGimpactShape ] ---

    @NativeType("void *")
    public static long btCompoundFromGImpact_btCreateCompoundFromGimpactShape(@NativeType("void *") long gimpactMesh, @NativeType("btScalar") float depth) {
        long __functionAddress = Functions.CompoundFromGImpact_btCreateCompoundFromGimpactShape;
        if (CHECKS) {
            check(gimpactMesh);
        }
        return invokePP(gimpactMesh, depth, __functionAddress);
    }

}