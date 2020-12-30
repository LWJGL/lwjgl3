/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTTriangleShape {

    protected BTTriangleShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            TriangleShape_new              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleShape_new"),
            TriangleShape_new2             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleShape_new2"),
            TriangleShape_calcNormal       = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleShape_calcNormal"),
            TriangleShape_getPlaneEquation = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleShape_getPlaneEquation"),
            TriangleShape_getVertexPtr     = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleShape_getVertexPtr"),
            TriangleShape_getVertices1     = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleShape_getVertices1");

    }

    // --- [ btTriangleShape_new ] ---

    @NativeType("void *")
    public static long btTriangleShape_new() {
        long __functionAddress = Functions.TriangleShape_new;
        return invokeP(__functionAddress);
    }

    // --- [ btTriangleShape_new2 ] ---

    public static long nbtTriangleShape_new2(long p0, long p1, long p2) {
        long __functionAddress = Functions.TriangleShape_new2;
        return invokePPPP(p0, p1, p2, __functionAddress);
    }

    @NativeType("void *")
    public static long btTriangleShape_new2(@NativeType("btVector3 const *") BTVector3 p0, @NativeType("btVector3 const *") BTVector3 p1, @NativeType("btVector3 const *") BTVector3 p2) {
        return nbtTriangleShape_new2(p0.address(), p1.address(), p2.address());
    }

    // --- [ btTriangleShape_calcNormal ] ---

    public static void nbtTriangleShape_calcNormal(long obj, long normal) {
        long __functionAddress = Functions.TriangleShape_calcNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, normal, __functionAddress);
    }

    public static void btTriangleShape_calcNormal(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 normal) {
        nbtTriangleShape_calcNormal(obj, normal.address());
    }

    // --- [ btTriangleShape_getPlaneEquation ] ---

    public static void nbtTriangleShape_getPlaneEquation(long obj, int i, long planeNormal, long planeSupport) {
        long __functionAddress = Functions.TriangleShape_getPlaneEquation;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, i, planeNormal, planeSupport, __functionAddress);
    }

    public static void btTriangleShape_getPlaneEquation(@NativeType("void *") long obj, int i, @NativeType("btVector3 *") BTVector3 planeNormal, @NativeType("btVector3 *") BTVector3 planeSupport) {
        nbtTriangleShape_getPlaneEquation(obj, i, planeNormal.address(), planeSupport.address());
    }

    // --- [ btTriangleShape_getVertexPtr ] ---

    @NativeType("btScalar[3]")
    public static FloatBuffer btTriangleShape_getVertexPtr(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.TriangleShape_getVertexPtr;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, index, __functionAddress);
        return memFloatBuffer(__result, 3);
    }

    // --- [ btTriangleShape_getVertices1 ] ---

    public static long nbtTriangleShape_getVertices1(long obj) {
        long __functionAddress = Functions.TriangleShape_getVertices1;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 *")
    public static BTVector3 btTriangleShape_getVertices1(@NativeType("void *") long obj) {
        long __result = nbtTriangleShape_getVertices1(obj);
        return BTVector3.createSafe(__result);
    }

}