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

public class BTSparseSdf3 {

    protected BTSparseSdf3() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SparseSdf_new               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSparseSdf_new"),
            SparseSdf3_GarbageCollect   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSparseSdf3_GarbageCollect"),
            SparseSdf3_Initialize       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSparseSdf3_Initialize"),
            SparseSdf3_RemoveReferences = apiGetFunctionAddress(LibBullet.getLibrary(), "btSparseSdf3_RemoveReferences"),
            SparseSdf3_Reset            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSparseSdf3_Reset"),
            SparseSdf_delete            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSparseSdf_delete");

    }

    // --- [ btSparseSdf_new ] ---

    @NativeType("void *")
    public static long btSparseSdf_new() {
        long __functionAddress = Functions.SparseSdf_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSparseSdf3_GarbageCollect ] ---

    public static void btSparseSdf3_GarbageCollect(@NativeType("void *") long obj, int lifetime) {
        long __functionAddress = Functions.SparseSdf3_GarbageCollect;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, lifetime, __functionAddress);
    }

    // --- [ btSparseSdf3_Initialize ] ---

    public static void btSparseSdf3_Initialize(@NativeType("void *") long obj, int hashsize, int clampCells) {
        long __functionAddress = Functions.SparseSdf3_Initialize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, hashsize, clampCells, __functionAddress);
    }

    // --- [ btSparseSdf3_RemoveReferences ] ---

    public static int btSparseSdf3_RemoveReferences(@NativeType("void *") long obj, @NativeType("void *") long pcs) {
        long __functionAddress = Functions.SparseSdf3_RemoveReferences;
        if (CHECKS) {
            check(obj);
            check(pcs);
        }
        return invokePPI(obj, pcs, __functionAddress);
    }

    // --- [ btSparseSdf3_Reset ] ---

    public static void btSparseSdf3_Reset(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SparseSdf3_Reset;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSparseSdf_delete ] ---

    public static void btSparseSdf_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SparseSdf_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}