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

public class BTConcaveShape {

    protected BTConcaveShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ConcaveShape_processAllTriangles = apiGetFunctionAddress(LibBullet.getLibrary(), "btConcaveShape_processAllTriangles");

    }

    // --- [ btConcaveShape_processAllTriangles ] ---

    public static void nbtConcaveShape_processAllTriangles(long obj, long callback, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.ConcaveShape_processAllTriangles;
        if (CHECKS) {
            check(obj);
            check(callback);
        }
        invokePPPPV(obj, callback, aabbMin, aabbMax, __functionAddress);
    }

    public static void btConcaveShape_processAllTriangles(@NativeType("void *") long obj, @NativeType("void *") long callback, @NativeType("btVector3 const *") BTVector3 aabbMin, @NativeType("btVector3 const *") BTVector3 aabbMax) {
        nbtConcaveShape_processAllTriangles(obj, callback, aabbMin.address(), aabbMax.address());
    }

}