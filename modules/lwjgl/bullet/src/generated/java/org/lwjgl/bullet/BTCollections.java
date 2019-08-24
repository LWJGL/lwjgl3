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

public class BTCollections {

    protected BTCollections() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CompoundShapeChild_array_at             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShapeChild_array_at"),
            SoftBodyNodePtrArray_at                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyNodePtrArray_at"),
            SoftBodyNodePtrArray_set                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyNodePtrArray_set"),
            Vector3_array_at                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btVector3_array_at"),
            Vector3_array_set                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btVector3_array_set"),
            AlignedObjectArray_btVector3_at         = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btVector3_at"),
            AlignedObjectArray_btVector3_push_back  = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btVector3_push_back"),
            AlignedObjectArray_btVector3_push_back2 = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btVector3_push_back2"),
            AlignedObjectArray_btVector3_set        = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btVector3_set"),
            AlignedObjectArray_btVector3_size       = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btVector3_size"),
            AlignedObjectArray_btVector3_delete     = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btVector3_delete");

    }

    // --- [ btCompoundShapeChild_array_at ] ---

    @NativeType("void *")
    public static long btCompoundShapeChild_array_at(@NativeType("void *") long a, int n) {
        long __functionAddress = Functions.CompoundShapeChild_array_at;
        if (CHECKS) {
            check(a);
        }
        return invokePP(a, n, __functionAddress);
    }

    // --- [ btSoftBodyNodePtrArray_at ] ---

    @NativeType("void *")
    public static long btSoftBodyNodePtrArray_at(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.SoftBodyNodePtrArray_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

    // --- [ btSoftBodyNodePtrArray_set ] ---

    public static void btSoftBodyNodePtrArray_set(@NativeType("void *") long obj, @NativeType("void *") long value, int index) {
        long __functionAddress = Functions.SoftBodyNodePtrArray_set;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, index, __functionAddress);
    }

    // --- [ btVector3_array_at ] ---

    public static void nbtVector3_array_at(long a, int n, long value) {
        long __functionAddress = Functions.Vector3_array_at;
        invokePPV(a, n, value, __functionAddress);
    }

    public static void btVector3_array_at(@NativeType("btVector3 const *") ΒΤVector3 a, int n, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtVector3_array_at(a.address(), n, value.address());
    }

    // --- [ btVector3_array_set ] ---

    public static void nbtVector3_array_set(long obj, int n, long value) {
        long __functionAddress = Functions.Vector3_array_set;
        invokePPV(obj, n, value, __functionAddress);
    }

    public static void btVector3_array_set(@NativeType("btVector3 *") ΒΤVector3 obj, int n, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtVector3_array_set(obj.address(), n, value.address());
    }

    // --- [ btAlignedObjectArray_btVector3_at ] ---

    public static void nbtAlignedObjectArray_btVector3_at(long obj, int n, long value) {
        long __functionAddress = Functions.AlignedObjectArray_btVector3_at;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, n, value, __functionAddress);
    }

    public static void btAlignedObjectArray_btVector3_at(@NativeType("void *") long obj, int n, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtAlignedObjectArray_btVector3_at(obj, n, value.address());
    }

    // --- [ btAlignedObjectArray_btVector3_push_back ] ---

    public static void nbtAlignedObjectArray_btVector3_push_back(long obj, long value) {
        long __functionAddress = Functions.AlignedObjectArray_btVector3_push_back;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btAlignedObjectArray_btVector3_push_back(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtAlignedObjectArray_btVector3_push_back(obj, value.address());
    }

    // --- [ btAlignedObjectArray_btVector3_push_back2 ] ---

    public static void nbtAlignedObjectArray_btVector3_push_back2(long obj, long value) {
        long __functionAddress = Functions.AlignedObjectArray_btVector3_push_back2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btAlignedObjectArray_btVector3_push_back2(@NativeType("void *") long obj, @NativeType("btVector4 const *") ΒΤVector3 value) {
        nbtAlignedObjectArray_btVector3_push_back2(obj, value.address());
    }

    // --- [ btAlignedObjectArray_btVector3_set ] ---

    public static void nbtAlignedObjectArray_btVector3_set(long obj, int n, long value) {
        long __functionAddress = Functions.AlignedObjectArray_btVector3_set;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, n, value, __functionAddress);
    }

    public static void btAlignedObjectArray_btVector3_set(@NativeType("void *") long obj, int n, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtAlignedObjectArray_btVector3_set(obj, n, value.address());
    }

    // --- [ btAlignedObjectArray_btVector3_size ] ---

    public static int btAlignedObjectArray_btVector3_size(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btVector3_size;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btVector3_delete ] ---

    public static void btAlignedObjectArray_btVector3_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btVector3_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}