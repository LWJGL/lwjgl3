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

public class BTBvhTriangleMeshShape {

    protected BTBvhTriangleMeshShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            BvhTriangleMeshShape_new                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_new"),
            BvhTriangleMeshShape_new2                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_new2"),
            BvhTriangleMeshShape_buildOptimizedBvh              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_buildOptimizedBvh"),
            BvhTriangleMeshShape_getOptimizedBvh                = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_getOptimizedBvh"),
            BvhTriangleMeshShape_getOwnsBvh                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_getOwnsBvh"),
            BvhTriangleMeshShape_getTriangleInfoMap             = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_getTriangleInfoMap"),
            BvhTriangleMeshShape_partialRefitTree               = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_partialRefitTree"),
            BvhTriangleMeshShape_performConvexcast              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_performConvexcast"),
            BvhTriangleMeshShape_performRaycast                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_performRaycast"),
            BvhTriangleMeshShape_refitTree                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_refitTree"),
            BvhTriangleMeshShape_serializeSingleBvh             = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_serializeSingleBvh"),
            BvhTriangleMeshShape_serializeSingleTriangleInfoMap = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_serializeSingleTriangleInfoMap"),
            BvhTriangleMeshShape_setOptimizedBvh                = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_setOptimizedBvh"),
            BvhTriangleMeshShape_setOptimizedBvh2               = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_setOptimizedBvh2"),
            BvhTriangleMeshShape_setTriangleInfoMap             = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_setTriangleInfoMap"),
            BvhTriangleMeshShape_usesQuantizedAabbCompression   = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTriangleMeshShape_usesQuantizedAabbCompression");

    }

    // --- [ btBvhTriangleMeshShape_new ] ---

    @NativeType("void *")
    public static long btBvhTriangleMeshShape_new(@NativeType("void *") long meshInterface, @NativeType("bool") boolean useQuantizedAabbCompression, @NativeType("bool") boolean buildBvh) {
        long __functionAddress = Functions.BvhTriangleMeshShape_new;
        if (CHECKS) {
            check(meshInterface);
        }
        return invokePP(meshInterface, useQuantizedAabbCompression, buildBvh, __functionAddress);
    }

    // --- [ btBvhTriangleMeshShape_new2 ] ---

    public static long nbtBvhTriangleMeshShape_new2(long meshInterface, boolean useQuantizedAabbCompression, long bvhAabbMin, long bvhAabbMax, boolean buildBvh) {
        long __functionAddress = Functions.BvhTriangleMeshShape_new2;
        if (CHECKS) {
            check(meshInterface);
        }
        return invokePPPP(meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh, __functionAddress);
    }

    @NativeType("void *")
    public static long btBvhTriangleMeshShape_new2(@NativeType("void *") long meshInterface, @NativeType("bool") boolean useQuantizedAabbCompression, @NativeType("btVector3 const *") BTVector3 bvhAabbMin, @NativeType("btVector3 const *") BTVector3 bvhAabbMax, @NativeType("bool") boolean buildBvh) {
        return nbtBvhTriangleMeshShape_new2(meshInterface, useQuantizedAabbCompression, bvhAabbMin.address(), bvhAabbMax.address(), buildBvh);
    }

    // --- [ btBvhTriangleMeshShape_buildOptimizedBvh ] ---

    public static void btBvhTriangleMeshShape_buildOptimizedBvh(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BvhTriangleMeshShape_buildOptimizedBvh;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btBvhTriangleMeshShape_getOptimizedBvh ] ---

    @NativeType("void *")
    public static long btBvhTriangleMeshShape_getOptimizedBvh(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BvhTriangleMeshShape_getOptimizedBvh;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btBvhTriangleMeshShape_getOwnsBvh ] ---

    @NativeType("bool")
    public static boolean btBvhTriangleMeshShape_getOwnsBvh(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BvhTriangleMeshShape_getOwnsBvh;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btBvhTriangleMeshShape_getTriangleInfoMap ] ---

    @NativeType("void *")
    public static long btBvhTriangleMeshShape_getTriangleInfoMap(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BvhTriangleMeshShape_getTriangleInfoMap;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btBvhTriangleMeshShape_partialRefitTree ] ---

    public static void nbtBvhTriangleMeshShape_partialRefitTree(long obj, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.BvhTriangleMeshShape_partialRefitTree;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, aabbMin, aabbMax, __functionAddress);
    }

    public static void btBvhTriangleMeshShape_partialRefitTree(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 aabbMin, @NativeType("btVector3 const *") BTVector3 aabbMax) {
        nbtBvhTriangleMeshShape_partialRefitTree(obj, aabbMin.address(), aabbMax.address());
    }

    // --- [ btBvhTriangleMeshShape_performConvexcast ] ---

    public static void nbtBvhTriangleMeshShape_performConvexcast(long obj, long callback, long boxSource, long boxTarget, long boxMin, long boxMax) {
        long __functionAddress = Functions.BvhTriangleMeshShape_performConvexcast;
        if (CHECKS) {
            check(obj);
            check(callback);
        }
        invokePPPPPPV(obj, callback, boxSource, boxTarget, boxMin, boxMax, __functionAddress);
    }

    public static void btBvhTriangleMeshShape_performConvexcast(@NativeType("void *") long obj, @NativeType("btTriangleCallback *") long callback, @NativeType("btVector3 const *") BTVector3 boxSource, @NativeType("btVector3 const *") BTVector3 boxTarget, @NativeType("btVector3 const *") BTVector3 boxMin, @NativeType("btVector3 const *") BTVector3 boxMax) {
        nbtBvhTriangleMeshShape_performConvexcast(obj, callback, boxSource.address(), boxTarget.address(), boxMin.address(), boxMax.address());
    }

    // --- [ btBvhTriangleMeshShape_performRaycast ] ---

    public static void nbtBvhTriangleMeshShape_performRaycast(long obj, long callback, long raySource, long rayTarget) {
        long __functionAddress = Functions.BvhTriangleMeshShape_performRaycast;
        if (CHECKS) {
            check(obj);
            check(callback);
        }
        invokePPPPV(obj, callback, raySource, rayTarget, __functionAddress);
    }

    public static void btBvhTriangleMeshShape_performRaycast(@NativeType("void *") long obj, @NativeType("btTriangleCallback *") long callback, @NativeType("btVector3 const *") BTVector3 raySource, @NativeType("btVector3 const *") BTVector3 rayTarget) {
        nbtBvhTriangleMeshShape_performRaycast(obj, callback, raySource.address(), rayTarget.address());
    }

    // --- [ btBvhTriangleMeshShape_refitTree ] ---

    public static void nbtBvhTriangleMeshShape_refitTree(long obj, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.BvhTriangleMeshShape_refitTree;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, aabbMin, aabbMax, __functionAddress);
    }

    public static void btBvhTriangleMeshShape_refitTree(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 aabbMin, @NativeType("btVector3 const *") BTVector3 aabbMax) {
        nbtBvhTriangleMeshShape_refitTree(obj, aabbMin.address(), aabbMax.address());
    }

    // --- [ btBvhTriangleMeshShape_serializeSingleBvh ] ---

    public static void btBvhTriangleMeshShape_serializeSingleBvh(@NativeType("void *") long obj, @NativeType("void *") long serializer) {
        long __functionAddress = Functions.BvhTriangleMeshShape_serializeSingleBvh;
        if (CHECKS) {
            check(obj);
            check(serializer);
        }
        invokePPV(obj, serializer, __functionAddress);
    }

    // --- [ btBvhTriangleMeshShape_serializeSingleTriangleInfoMap ] ---

    public static void btBvhTriangleMeshShape_serializeSingleTriangleInfoMap(@NativeType("void *") long obj, @NativeType("void *") long serializer) {
        long __functionAddress = Functions.BvhTriangleMeshShape_serializeSingleTriangleInfoMap;
        if (CHECKS) {
            check(obj);
            check(serializer);
        }
        invokePPV(obj, serializer, __functionAddress);
    }

    // --- [ btBvhTriangleMeshShape_setOptimizedBvh ] ---

    public static void btBvhTriangleMeshShape_setOptimizedBvh(@NativeType("void *") long obj, @NativeType("void *") long bvh) {
        long __functionAddress = Functions.BvhTriangleMeshShape_setOptimizedBvh;
        if (CHECKS) {
            check(obj);
            check(bvh);
        }
        invokePPV(obj, bvh, __functionAddress);
    }

    // --- [ btBvhTriangleMeshShape_setOptimizedBvh2 ] ---

    public static void nbtBvhTriangleMeshShape_setOptimizedBvh2(long obj, long bvh, long localScaling) {
        long __functionAddress = Functions.BvhTriangleMeshShape_setOptimizedBvh2;
        if (CHECKS) {
            check(obj);
            check(bvh);
        }
        invokePPPV(obj, bvh, localScaling, __functionAddress);
    }

    public static void btBvhTriangleMeshShape_setOptimizedBvh2(@NativeType("void *") long obj, @NativeType("void *") long bvh, @NativeType("btVector3 const *") BTVector3 localScaling) {
        nbtBvhTriangleMeshShape_setOptimizedBvh2(obj, bvh, localScaling.address());
    }

    // --- [ btBvhTriangleMeshShape_setTriangleInfoMap ] ---

    public static void btBvhTriangleMeshShape_setTriangleInfoMap(@NativeType("void *") long obj, @NativeType("void *") long triangleInfoMap) {
        long __functionAddress = Functions.BvhTriangleMeshShape_setTriangleInfoMap;
        if (CHECKS) {
            check(obj);
            check(triangleInfoMap);
        }
        invokePPV(obj, triangleInfoMap, __functionAddress);
    }

    // --- [ btBvhTriangleMeshShape_usesQuantizedAabbCompression ] ---

    @NativeType("bool")
    public static boolean btBvhTriangleMeshShape_usesQuantizedAabbCompression(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BvhTriangleMeshShape_usesQuantizedAabbCompression;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

}