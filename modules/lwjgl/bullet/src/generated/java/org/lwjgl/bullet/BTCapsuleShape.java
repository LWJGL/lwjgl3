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

public class BTCapsuleShape {

    protected BTCapsuleShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CapsuleShape_new              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCapsuleShape_new"),
            CapsuleShape_deSerializeFloat = apiGetFunctionAddress(LibBullet.getLibrary(), "btCapsuleShape_deSerializeFloat"),
            CapsuleShape_getHalfHeight    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCapsuleShape_getHalfHeight"),
            CapsuleShape_getRadius        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCapsuleShape_getRadius"),
            CapsuleShape_getUpAxis        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCapsuleShape_getUpAxis"),
            CapsuleShapeX_new             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCapsuleShapeX_new"),
            CapsuleShapeZ_new             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCapsuleShapeZ_new");

    }

    // --- [ btCapsuleShape_new ] ---

    @NativeType("void *")
    public static long btCapsuleShape_new(@NativeType("btScalar") float radius, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.CapsuleShape_new;
        return invokeP(radius, height, __functionAddress);
    }

    // --- [ btCapsuleShape_deSerializeFloat ] ---

    public static void btCapsuleShape_deSerializeFloat(@NativeType("void *") long obj, @NativeType("void *") long dataBuffer) {
        long __functionAddress = Functions.CapsuleShape_deSerializeFloat;
        if (CHECKS) {
            check(obj);
            check(dataBuffer);
        }
        invokePPV(obj, dataBuffer, __functionAddress);
    }

    // --- [ btCapsuleShape_getHalfHeight ] ---

    @NativeType("btScalar")
    public static float btCapsuleShape_getHalfHeight(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CapsuleShape_getHalfHeight;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCapsuleShape_getRadius ] ---

    @NativeType("btScalar")
    public static float btCapsuleShape_getRadius(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CapsuleShape_getRadius;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCapsuleShape_getUpAxis ] ---

    public static int btCapsuleShape_getUpAxis(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CapsuleShape_getUpAxis;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCapsuleShapeX_new ] ---

    @NativeType("void *")
    public static long btCapsuleShapeX_new(@NativeType("btScalar") float radius, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.CapsuleShapeX_new;
        return invokeP(radius, height, __functionAddress);
    }

    // --- [ btCapsuleShapeZ_new ] ---

    @NativeType("void *")
    public static long btCapsuleShapeZ_new(@NativeType("btScalar") float radius, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.CapsuleShapeZ_new;
        return invokeP(radius, height, __functionAddress);
    }

}