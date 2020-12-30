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

public class BTUniformScalingShape {

    protected BTUniformScalingShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            UniformScalingShape_new                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btUniformScalingShape_new"),
            UniformScalingShape_getChildShape           = apiGetFunctionAddress(LibBullet.getLibrary(), "btUniformScalingShape_getChildShape"),
            UniformScalingShape_getUniformScalingFactor = apiGetFunctionAddress(LibBullet.getLibrary(), "btUniformScalingShape_getUniformScalingFactor");

    }

    // --- [ btUniformScalingShape_new ] ---

    @NativeType("void *")
    public static long btUniformScalingShape_new(@NativeType("void *") long convexChildShape, @NativeType("btScalar") float uniformScalingFactor) {
        long __functionAddress = Functions.UniformScalingShape_new;
        if (CHECKS) {
            check(convexChildShape);
        }
        return invokePP(convexChildShape, uniformScalingFactor, __functionAddress);
    }

    // --- [ btUniformScalingShape_getChildShape ] ---

    @NativeType("void *")
    public static long btUniformScalingShape_getChildShape(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UniformScalingShape_getChildShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btUniformScalingShape_getUniformScalingFactor ] ---

    @NativeType("btScalar")
    public static float btUniformScalingShape_getUniformScalingFactor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UniformScalingShape_getUniformScalingFactor;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

}