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

public class BTSphereShape {

    protected BTSphereShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SphereShape_new               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSphereShape_new"),
            SphereShape_getRadius         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSphereShape_getRadius"),
            SphereShape_setUnscaledRadius = apiGetFunctionAddress(LibBullet.getLibrary(), "btSphereShape_setUnscaledRadius");

    }

    // --- [ btSphereShape_new ] ---

    @NativeType("void *")
    public static long btSphereShape_new(@NativeType("btScalar") float radius) {
        long __functionAddress = Functions.SphereShape_new;
        return invokeP(radius, __functionAddress);
    }

    // --- [ btSphereShape_getRadius ] ---

    @NativeType("btScalar")
    public static float btSphereShape_getRadius(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SphereShape_getRadius;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSphereShape_setUnscaledRadius ] ---

    public static void btSphereShape_setUnscaledRadius(@NativeType("void *") long obj, @NativeType("btScalar") float radius) {
        long __functionAddress = Functions.SphereShape_setUnscaledRadius;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, radius, __functionAddress);
    }

}