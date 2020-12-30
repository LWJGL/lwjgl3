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

public class BTUnionFind {

    protected BTUnionFind() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Element_new              = apiGetFunctionAddress(LibBullet.getLibrary(), "btElement_new"),
            Element_getId            = apiGetFunctionAddress(LibBullet.getLibrary(), "btElement_getId"),
            Element_getSz            = apiGetFunctionAddress(LibBullet.getLibrary(), "btElement_getSz"),
            Element_setId            = apiGetFunctionAddress(LibBullet.getLibrary(), "btElement_setId"),
            Element_setSz            = apiGetFunctionAddress(LibBullet.getLibrary(), "btElement_setSz"),
            Element_delete           = apiGetFunctionAddress(LibBullet.getLibrary(), "btElement_delete"),
            UnionFind_new            = apiGetFunctionAddress(LibBullet.getLibrary(), "btUnionFind_new"),
            UnionFind_allocate       = apiGetFunctionAddress(LibBullet.getLibrary(), "btUnionFind_allocate"),
            UnionFind_find           = apiGetFunctionAddress(LibBullet.getLibrary(), "btUnionFind_find"),
            UnionFind_find2          = apiGetFunctionAddress(LibBullet.getLibrary(), "btUnionFind_find2"),
            UnionFind_Free           = apiGetFunctionAddress(LibBullet.getLibrary(), "btUnionFind_Free"),
            UnionFind_getElement     = apiGetFunctionAddress(LibBullet.getLibrary(), "btUnionFind_getElement"),
            UnionFind_getNumElements = apiGetFunctionAddress(LibBullet.getLibrary(), "btUnionFind_getNumElements"),
            UnionFind_isRoot         = apiGetFunctionAddress(LibBullet.getLibrary(), "btUnionFind_isRoot"),
            UnionFind_reset          = apiGetFunctionAddress(LibBullet.getLibrary(), "btUnionFind_reset"),
            UnionFind_sortIslands    = apiGetFunctionAddress(LibBullet.getLibrary(), "btUnionFind_sortIslands"),
            UnionFind_unite          = apiGetFunctionAddress(LibBullet.getLibrary(), "btUnionFind_unite"),
            UnionFind_delete         = apiGetFunctionAddress(LibBullet.getLibrary(), "btUnionFind_delete");

    }

    // --- [ btElement_new ] ---

    @NativeType("void *")
    public static long btElement_new() {
        long __functionAddress = Functions.Element_new;
        return invokeP(__functionAddress);
    }

    // --- [ btElement_getId ] ---

    public static int btElement_getId(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Element_getId;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btElement_getSz ] ---

    public static int btElement_getSz(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Element_getSz;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btElement_setId ] ---

    public static void btElement_setId(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.Element_setId;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btElement_setSz ] ---

    public static void btElement_setSz(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.Element_setSz;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btElement_delete ] ---

    public static void btElement_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Element_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btUnionFind_new ] ---

    @NativeType("void *")
    public static long btUnionFind_new() {
        long __functionAddress = Functions.UnionFind_new;
        return invokeP(__functionAddress);
    }

    // --- [ btUnionFind_allocate ] ---

    public static void btUnionFind_allocate(@NativeType("void *") long obj, int N) {
        long __functionAddress = Functions.UnionFind_allocate;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, N, __functionAddress);
    }

    // --- [ btUnionFind_find ] ---

    public static int btUnionFind_find(@NativeType("void *") long obj, int p, int q) {
        long __functionAddress = Functions.UnionFind_find;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, p, q, __functionAddress);
    }

    // --- [ btUnionFind_find2 ] ---

    public static int btUnionFind_find2(@NativeType("void *") long obj, int x) {
        long __functionAddress = Functions.UnionFind_find2;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, x, __functionAddress);
    }

    // --- [ btUnionFind_Free ] ---

    public static void btUnionFind_Free(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UnionFind_Free;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btUnionFind_getElement ] ---

    @NativeType("void *")
    public static long btUnionFind_getElement(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.UnionFind_getElement;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btUnionFind_getNumElements ] ---

    public static int btUnionFind_getNumElements(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UnionFind_getNumElements;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btUnionFind_isRoot ] ---

    @NativeType("bool")
    public static boolean btUnionFind_isRoot(@NativeType("void *") long obj, int x) {
        long __functionAddress = Functions.UnionFind_isRoot;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, x, __functionAddress);
    }

    // --- [ btUnionFind_reset ] ---

    public static void btUnionFind_reset(@NativeType("void *") long obj, int N) {
        long __functionAddress = Functions.UnionFind_reset;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, N, __functionAddress);
    }

    // --- [ btUnionFind_sortIslands ] ---

    public static void btUnionFind_sortIslands(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UnionFind_sortIslands;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btUnionFind_unite ] ---

    public static void btUnionFind_unite(@NativeType("void *") long obj, int p, int q) {
        long __functionAddress = Functions.UnionFind_unite;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, p, q, __functionAddress);
    }

    // --- [ btUnionFind_delete ] ---

    public static void btUnionFind_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UnionFind_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}