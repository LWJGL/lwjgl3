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

public class BTConvex2dShape {

    protected BTConvex2dShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Convex2dShape_new           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvex2dShape_new"),
            Convex2dShape_getChildShape = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvex2dShape_getChildShape");

    }

    // --- [ btConvex2dShape_new ] ---

    @NativeType("void *")
    public static long btConvex2dShape_new(@NativeType("void *") long convexChildShape) {
        long __functionAddress = Functions.Convex2dShape_new;
        if (CHECKS) {
            check(convexChildShape);
        }
        return invokePP(convexChildShape, __functionAddress);
    }

    // --- [ btConvex2dShape_getChildShape ] ---

    @NativeType("void *")
    public static long btConvex2dShape_getChildShape(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Convex2dShape_getChildShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

}