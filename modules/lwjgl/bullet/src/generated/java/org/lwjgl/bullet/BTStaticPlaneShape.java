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

public class BTStaticPlaneShape {

    protected BTStaticPlaneShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            StaticPlaneShape_new              = apiGetFunctionAddress(LibBullet.getLibrary(), "btStaticPlaneShape_new"),
            StaticPlaneShape_getPlaneConstant = apiGetFunctionAddress(LibBullet.getLibrary(), "btStaticPlaneShape_getPlaneConstant"),
            StaticPlaneShape_getPlaneNormal   = apiGetFunctionAddress(LibBullet.getLibrary(), "btStaticPlaneShape_getPlaneNormal");

    }

    // --- [ btStaticPlaneShape_new ] ---

    public static long nbtStaticPlaneShape_new(long planeNormal, float planeConstant) {
        long __functionAddress = Functions.StaticPlaneShape_new;
        return invokePP(planeNormal, planeConstant, __functionAddress);
    }

    @NativeType("void *")
    public static long btStaticPlaneShape_new(@NativeType("btVector3 const *") BTVector3 planeNormal, @NativeType("btScalar") float planeConstant) {
        return nbtStaticPlaneShape_new(planeNormal.address(), planeConstant);
    }

    // --- [ btStaticPlaneShape_getPlaneConstant ] ---

    @NativeType("btScalar")
    public static float btStaticPlaneShape_getPlaneConstant(@NativeType("void *") long obj) {
        long __functionAddress = Functions.StaticPlaneShape_getPlaneConstant;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btStaticPlaneShape_getPlaneNormal ] ---

    public static void nbtStaticPlaneShape_getPlaneNormal(long obj, long value) {
        long __functionAddress = Functions.StaticPlaneShape_getPlaneNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btStaticPlaneShape_getPlaneNormal(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtStaticPlaneShape_getPlaneNormal(obj, value.address());
    }

}