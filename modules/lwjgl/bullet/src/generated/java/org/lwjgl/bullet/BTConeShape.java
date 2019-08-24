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

public class BTConeShape {

    protected BTConeShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ConeShape_new            = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeShape_new"),
            ConeShape_getConeUpIndex = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeShape_getConeUpIndex"),
            ConeShape_getHeight      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeShape_getHeight"),
            ConeShape_getRadius      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeShape_getRadius"),
            ConeShape_setConeUpIndex = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeShape_setConeUpIndex"),
            ConeShape_setHeight      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeShape_setHeight"),
            ConeShape_setRadius      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeShape_setRadius"),
            ConeShapeX_new           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeShapeX_new"),
            ConeShapeZ_new           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConeShapeZ_new");

    }

    // --- [ btConeShape_new ] ---

    @NativeType("void *")
    public static long btConeShape_new(@NativeType("btScalar") float radius, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.ConeShape_new;
        return invokeP(radius, height, __functionAddress);
    }

    // --- [ btConeShape_getConeUpIndex ] ---

    public static int btConeShape_getConeUpIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeShape_getConeUpIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btConeShape_getHeight ] ---

    @NativeType("btScalar")
    public static float btConeShape_getHeight(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeShape_getHeight;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConeShape_getRadius ] ---

    @NativeType("btScalar")
    public static float btConeShape_getRadius(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConeShape_getRadius;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConeShape_setConeUpIndex ] ---

    public static void btConeShape_setConeUpIndex(@NativeType("void *") long obj, int upIndex) {
        long __functionAddress = Functions.ConeShape_setConeUpIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, upIndex, __functionAddress);
    }

    // --- [ btConeShape_setHeight ] ---

    public static void btConeShape_setHeight(@NativeType("void *") long obj, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.ConeShape_setHeight;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, height, __functionAddress);
    }

    // --- [ btConeShape_setRadius ] ---

    public static void btConeShape_setRadius(@NativeType("void *") long obj, @NativeType("btScalar") float radius) {
        long __functionAddress = Functions.ConeShape_setRadius;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, radius, __functionAddress);
    }

    // --- [ btConeShapeX_new ] ---

    @NativeType("void *")
    public static long btConeShapeX_new(@NativeType("btScalar") float radius, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.ConeShapeX_new;
        return invokeP(radius, height, __functionAddress);
    }

    // --- [ btConeShapeZ_new ] ---

    @NativeType("void *")
    public static long btConeShapeZ_new(@NativeType("btScalar") float radius, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.ConeShapeZ_new;
        return invokeP(radius, height, __functionAddress);
    }

}