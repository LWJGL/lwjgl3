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

public class BTOptimizedBvh {

    protected BTOptimizedBvh() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            OptimizedBvh_new                = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvh_new"),
            OptimizedBvh_build              = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvh_build"),
            OptimizedBvh_deSerializeInPlace = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvh_deSerializeInPlace"),
            OptimizedBvh_refit              = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvh_refit"),
            OptimizedBvh_refitPartial       = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvh_refitPartial"),
            OptimizedBvh_serializeInPlace   = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvh_serializeInPlace"),
            OptimizedBvh_updateBvhNodes     = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvh_updateBvhNodes");

    }

    // --- [ btOptimizedBvh_new ] ---

    @NativeType("void *")
    public static long btOptimizedBvh_new() {
        long __functionAddress = Functions.OptimizedBvh_new;
        return invokeP(__functionAddress);
    }

    // --- [ btOptimizedBvh_build ] ---

    public static void nbtOptimizedBvh_build(long obj, long triangles, boolean useQuantizedAabbCompression, long bvhAabbMin, long bvhAabbMax) {
        long __functionAddress = Functions.OptimizedBvh_build;
        if (CHECKS) {
            check(obj);
            check(triangles);
        }
        invokePPPPV(obj, triangles, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, __functionAddress);
    }

    public static void btOptimizedBvh_build(@NativeType("void *") long obj, @NativeType("void *") long triangles, @NativeType("bool") boolean useQuantizedAabbCompression, @NativeType("btVector3 const *") ΒΤVector3 bvhAabbMin, @NativeType("btVector3 const *") ΒΤVector3 bvhAabbMax) {
        nbtOptimizedBvh_build(obj, triangles, useQuantizedAabbCompression, bvhAabbMin.address(), bvhAabbMax.address());
    }

    // --- [ btOptimizedBvh_deSerializeInPlace ] ---

    @NativeType("void *")
    public static long btOptimizedBvh_deSerializeInPlace(@NativeType("void *") long i_alignedDataBuffer, @NativeType("unsigned int") int i_dataBufferSize, @NativeType("bool") boolean i_swapEndian) {
        long __functionAddress = Functions.OptimizedBvh_deSerializeInPlace;
        if (CHECKS) {
            check(i_alignedDataBuffer);
        }
        return invokePP(i_alignedDataBuffer, i_dataBufferSize, i_swapEndian, __functionAddress);
    }

    // --- [ btOptimizedBvh_refit ] ---

    public static void nbtOptimizedBvh_refit(long obj, long triangles, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.OptimizedBvh_refit;
        if (CHECKS) {
            check(obj);
            check(triangles);
        }
        invokePPPPV(obj, triangles, aabbMin, aabbMax, __functionAddress);
    }

    public static void btOptimizedBvh_refit(@NativeType("void *") long obj, @NativeType("void *") long triangles, @NativeType("btVector3 const *") ΒΤVector3 aabbMin, @NativeType("btVector3 const *") ΒΤVector3 aabbMax) {
        nbtOptimizedBvh_refit(obj, triangles, aabbMin.address(), aabbMax.address());
    }

    // --- [ btOptimizedBvh_refitPartial ] ---

    public static void nbtOptimizedBvh_refitPartial(long obj, long triangles, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.OptimizedBvh_refitPartial;
        if (CHECKS) {
            check(obj);
            check(triangles);
        }
        invokePPPPV(obj, triangles, aabbMin, aabbMax, __functionAddress);
    }

    public static void btOptimizedBvh_refitPartial(@NativeType("void *") long obj, @NativeType("void *") long triangles, @NativeType("btVector3 const *") ΒΤVector3 aabbMin, @NativeType("btVector3 const *") ΒΤVector3 aabbMax) {
        nbtOptimizedBvh_refitPartial(obj, triangles, aabbMin.address(), aabbMax.address());
    }

    // --- [ btOptimizedBvh_serializeInPlace ] ---

    @NativeType("bool")
    public static boolean btOptimizedBvh_serializeInPlace(@NativeType("void *") long obj, @NativeType("void *") long o_alignedDataBuffer, @NativeType("unsigned int") int i_dataBufferSize, @NativeType("bool") boolean i_swapEndian) {
        long __functionAddress = Functions.OptimizedBvh_serializeInPlace;
        if (CHECKS) {
            check(obj);
            check(o_alignedDataBuffer);
        }
        return invokePPZ(obj, o_alignedDataBuffer, i_dataBufferSize, i_swapEndian, __functionAddress);
    }

    // --- [ btOptimizedBvh_updateBvhNodes ] ---

    public static void btOptimizedBvh_updateBvhNodes(@NativeType("void *") long obj, @NativeType("void *") long meshInterface, int firstNode, int endNode, int index) {
        long __functionAddress = Functions.OptimizedBvh_updateBvhNodes;
        if (CHECKS) {
            check(obj);
            check(meshInterface);
        }
        invokePPV(obj, meshInterface, firstNode, endNode, index, __functionAddress);
    }

}