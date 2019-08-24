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

public class BTTetrahedronShape {

    protected BTTetrahedronShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            BU_Simplex1to4_new       = apiGetFunctionAddress(LibBullet.getLibrary(), "btBU_Simplex1to4_new"),
            BU_Simplex1to4_new2      = apiGetFunctionAddress(LibBullet.getLibrary(), "btBU_Simplex1to4_new2"),
            BU_Simplex1to4_new3      = apiGetFunctionAddress(LibBullet.getLibrary(), "btBU_Simplex1to4_new3"),
            BU_Simplex1to4_new4      = apiGetFunctionAddress(LibBullet.getLibrary(), "btBU_Simplex1to4_new4"),
            BU_Simplex1to4_new5      = apiGetFunctionAddress(LibBullet.getLibrary(), "btBU_Simplex1to4_new5"),
            BU_Simplex1to4_addVertex = apiGetFunctionAddress(LibBullet.getLibrary(), "btBU_Simplex1to4_addVertex"),
            BU_Simplex1to4_getIndex  = apiGetFunctionAddress(LibBullet.getLibrary(), "btBU_Simplex1to4_getIndex"),
            BU_Simplex1to4_reset     = apiGetFunctionAddress(LibBullet.getLibrary(), "btBU_Simplex1to4_reset");

    }

    // --- [ btBU_Simplex1to4_new ] ---

    @NativeType("void *")
    public static long btBU_Simplex1to4_new() {
        long __functionAddress = Functions.BU_Simplex1to4_new;
        return invokeP(__functionAddress);
    }

    // --- [ btBU_Simplex1to4_new2 ] ---

    public static long nbtBU_Simplex1to4_new2(long pt0) {
        long __functionAddress = Functions.BU_Simplex1to4_new2;
        return invokePP(pt0, __functionAddress);
    }

    @NativeType("void *")
    public static long btBU_Simplex1to4_new2(@NativeType("btVector3 const *") ΒΤVector3 pt0) {
        return nbtBU_Simplex1to4_new2(pt0.address());
    }

    // --- [ btBU_Simplex1to4_new3 ] ---

    public static long nbtBU_Simplex1to4_new3(long pt0, long pt1) {
        long __functionAddress = Functions.BU_Simplex1to4_new3;
        return invokePPP(pt0, pt1, __functionAddress);
    }

    @NativeType("void *")
    public static long btBU_Simplex1to4_new3(@NativeType("btVector3 const *") ΒΤVector3 pt0, @NativeType("btVector3 const *") ΒΤVector3 pt1) {
        return nbtBU_Simplex1to4_new3(pt0.address(), pt1.address());
    }

    // --- [ btBU_Simplex1to4_new4 ] ---

    public static long nbtBU_Simplex1to4_new4(long pt0, long pt1, long pt2) {
        long __functionAddress = Functions.BU_Simplex1to4_new4;
        return invokePPPP(pt0, pt1, pt2, __functionAddress);
    }

    @NativeType("void *")
    public static long btBU_Simplex1to4_new4(@NativeType("btVector3 const *") ΒΤVector3 pt0, @NativeType("btVector3 const *") ΒΤVector3 pt1, @NativeType("btVector3 const *") ΒΤVector3 pt2) {
        return nbtBU_Simplex1to4_new4(pt0.address(), pt1.address(), pt2.address());
    }

    // --- [ btBU_Simplex1to4_new5 ] ---

    public static long nbtBU_Simplex1to4_new5(long pt0, long pt1, long pt2, long pt3) {
        long __functionAddress = Functions.BU_Simplex1to4_new5;
        return invokePPPPP(pt0, pt1, pt2, pt3, __functionAddress);
    }

    @NativeType("void *")
    public static long btBU_Simplex1to4_new5(@NativeType("btVector3 const *") ΒΤVector3 pt0, @NativeType("btVector3 const *") ΒΤVector3 pt1, @NativeType("btVector3 const *") ΒΤVector3 pt2, @NativeType("btVector3 const *") ΒΤVector3 pt3) {
        return nbtBU_Simplex1to4_new5(pt0.address(), pt1.address(), pt2.address(), pt3.address());
    }

    // --- [ btBU_Simplex1to4_addVertex ] ---

    public static void nbtBU_Simplex1to4_addVertex(long obj, long pt) {
        long __functionAddress = Functions.BU_Simplex1to4_addVertex;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, pt, __functionAddress);
    }

    public static void btBU_Simplex1to4_addVertex(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 pt) {
        nbtBU_Simplex1to4_addVertex(obj, pt.address());
    }

    // --- [ btBU_Simplex1to4_getIndex ] ---

    public static int btBU_Simplex1to4_getIndex(@NativeType("void *") long obj, int i) {
        long __functionAddress = Functions.BU_Simplex1to4_getIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, i, __functionAddress);
    }

    // --- [ btBU_Simplex1to4_reset ] ---

    public static void btBU_Simplex1to4_reset(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BU_Simplex1to4_reset;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}