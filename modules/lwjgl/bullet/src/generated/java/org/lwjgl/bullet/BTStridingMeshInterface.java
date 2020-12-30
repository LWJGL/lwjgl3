/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTStridingMeshInterface {

    protected BTStridingMeshInterface() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            StridingMeshInterface_calculateAabbBruteForce          = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_calculateAabbBruteForce"),
            StridingMeshInterface_calculateSerializeBufferSize     = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_calculateSerializeBufferSize"),
            StridingMeshInterface_getLockedReadOnlyVertexIndexBase = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_getLockedReadOnlyVertexIndexBase"),
            StridingMeshInterface_getLockedVertexIndexBase         = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_getLockedVertexIndexBase"),
            StridingMeshInterface_getNumSubParts                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_getNumSubParts"),
            StridingMeshInterface_getPremadeAabb                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_getPremadeAabb"),
            StridingMeshInterface_getScaling                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_getScaling"),
            StridingMeshInterface_hasPremadeAabb                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_hasPremadeAabb"),
            StridingMeshInterface_InternalProcessAllTriangles      = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_InternalProcessAllTriangles"),
            StridingMeshInterface_preallocateIndices               = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_preallocateIndices"),
            StridingMeshInterface_preallocateVertices              = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_preallocateVertices"),
            StridingMeshInterface_serialize                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_serialize"),
            StridingMeshInterface_setPremadeAabb                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_setPremadeAabb"),
            StridingMeshInterface_setScaling                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_setScaling"),
            StridingMeshInterface_unLockReadOnlyVertexBase         = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_unLockReadOnlyVertexBase"),
            StridingMeshInterface_unLockVertexBase                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_unLockVertexBase"),
            StridingMeshInterface_delete                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btStridingMeshInterface_delete");

    }

    // --- [ btStridingMeshInterface_calculateAabbBruteForce ] ---

    public static void nbtStridingMeshInterface_calculateAabbBruteForce(long obj, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.StridingMeshInterface_calculateAabbBruteForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, aabbMin, aabbMax, __functionAddress);
    }

    public static void btStridingMeshInterface_calculateAabbBruteForce(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 aabbMin, @NativeType("btVector3 *") BTVector3 aabbMax) {
        nbtStridingMeshInterface_calculateAabbBruteForce(obj, aabbMin.address(), aabbMax.address());
    }

    // --- [ btStridingMeshInterface_calculateSerializeBufferSize ] ---

    public static int btStridingMeshInterface_calculateSerializeBufferSize(@NativeType("void *") long obj) {
        long __functionAddress = Functions.StridingMeshInterface_calculateSerializeBufferSize;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btStridingMeshInterface_getLockedReadOnlyVertexIndexBase ] ---

    public static void nbtStridingMeshInterface_getLockedReadOnlyVertexIndexBase(long obj, long vertexbase, long numverts, long type, long vertexStride, long indexbase, long indexstride, long numfaces, long indicestype, int subpart) {
        long __functionAddress = Functions.StridingMeshInterface_getLockedReadOnlyVertexIndexBase;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPPPPPPV(obj, vertexbase, numverts, type, vertexStride, indexbase, indexstride, numfaces, indicestype, subpart, __functionAddress);
    }

    public static void btStridingMeshInterface_getLockedReadOnlyVertexIndexBase(@NativeType("void *") long obj, @NativeType("unsigned char const **") PointerBuffer vertexbase, @NativeType("int *") IntBuffer numverts, @NativeType("int *") IntBuffer type, @NativeType("int *") IntBuffer vertexStride, @NativeType("unsigned char const **") PointerBuffer indexbase, @NativeType("int *") IntBuffer indexstride, @NativeType("int *") IntBuffer numfaces, @NativeType("int *") IntBuffer indicestype, int subpart) {
        if (CHECKS) {
            check(vertexbase, 1);
            check(numverts, 1);
            check(type, 1);
            check(vertexStride, 1);
            check(indexbase, 1);
            check(indexstride, 1);
            check(numfaces, 1);
            check(indicestype, 1);
        }
        nbtStridingMeshInterface_getLockedReadOnlyVertexIndexBase(obj, memAddress(vertexbase), memAddress(numverts), memAddress(type), memAddress(vertexStride), memAddress(indexbase), memAddress(indexstride), memAddress(numfaces), memAddress(indicestype), subpart);
    }

    // --- [ btStridingMeshInterface_getLockedVertexIndexBase ] ---

    public static void nbtStridingMeshInterface_getLockedVertexIndexBase(long obj, long vertexbase, long numverts, long type, long vertexStride, long indexbase, long indexstride, long numfaces, long indicestype, int subpart) {
        long __functionAddress = Functions.StridingMeshInterface_getLockedVertexIndexBase;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPPPPPPV(obj, vertexbase, numverts, type, vertexStride, indexbase, indexstride, numfaces, indicestype, subpart, __functionAddress);
    }

    public static void btStridingMeshInterface_getLockedVertexIndexBase(@NativeType("void *") long obj, @NativeType("unsigned char **") PointerBuffer vertexbase, @NativeType("int *") IntBuffer numverts, @NativeType("int *") IntBuffer type, @NativeType("int *") IntBuffer vertexStride, @NativeType("unsigned char **") PointerBuffer indexbase, @NativeType("int *") IntBuffer indexstride, @NativeType("int *") IntBuffer numfaces, @NativeType("int *") IntBuffer indicestype, int subpart) {
        if (CHECKS) {
            check(vertexbase, 1);
            check(numverts, 1);
            check(type, 1);
            check(vertexStride, 1);
            check(indexbase, 1);
            check(indexstride, 1);
            check(numfaces, 1);
            check(indicestype, 1);
        }
        nbtStridingMeshInterface_getLockedVertexIndexBase(obj, memAddress(vertexbase), memAddress(numverts), memAddress(type), memAddress(vertexStride), memAddress(indexbase), memAddress(indexstride), memAddress(numfaces), memAddress(indicestype), subpart);
    }

    // --- [ btStridingMeshInterface_getNumSubParts ] ---

    public static int btStridingMeshInterface_getNumSubParts(@NativeType("void *") long obj) {
        long __functionAddress = Functions.StridingMeshInterface_getNumSubParts;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btStridingMeshInterface_getPremadeAabb ] ---

    public static void nbtStridingMeshInterface_getPremadeAabb(long obj, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.StridingMeshInterface_getPremadeAabb;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, aabbMin, aabbMax, __functionAddress);
    }

    public static void btStridingMeshInterface_getPremadeAabb(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 aabbMin, @NativeType("btVector3 *") BTVector3 aabbMax) {
        nbtStridingMeshInterface_getPremadeAabb(obj, aabbMin.address(), aabbMax.address());
    }

    // --- [ btStridingMeshInterface_getScaling ] ---

    public static void nbtStridingMeshInterface_getScaling(long obj, long value) {
        long __functionAddress = Functions.StridingMeshInterface_getScaling;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btStridingMeshInterface_getScaling(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtStridingMeshInterface_getScaling(obj, value.address());
    }

    // --- [ btStridingMeshInterface_hasPremadeAabb ] ---

    @NativeType("bool")
    public static boolean btStridingMeshInterface_hasPremadeAabb(@NativeType("void *") long obj) {
        long __functionAddress = Functions.StridingMeshInterface_hasPremadeAabb;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btStridingMeshInterface_InternalProcessAllTriangles ] ---

    public static void nbtStridingMeshInterface_InternalProcessAllTriangles(long obj, long callback, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.StridingMeshInterface_InternalProcessAllTriangles;
        if (CHECKS) {
            check(obj);
            check(callback);
        }
        invokePPPPV(obj, callback, aabbMin, aabbMax, __functionAddress);
    }

    public static void btStridingMeshInterface_InternalProcessAllTriangles(@NativeType("void *") long obj, @NativeType("void *") long callback, @NativeType("btVector3 const *") BTVector3 aabbMin, @NativeType("btVector3 const *") BTVector3 aabbMax) {
        nbtStridingMeshInterface_InternalProcessAllTriangles(obj, callback, aabbMin.address(), aabbMax.address());
    }

    // --- [ btStridingMeshInterface_preallocateIndices ] ---

    public static void btStridingMeshInterface_preallocateIndices(@NativeType("void *") long obj, int numindices) {
        long __functionAddress = Functions.StridingMeshInterface_preallocateIndices;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, numindices, __functionAddress);
    }

    // --- [ btStridingMeshInterface_preallocateVertices ] ---

    public static void btStridingMeshInterface_preallocateVertices(@NativeType("void *") long obj, int numverts) {
        long __functionAddress = Functions.StridingMeshInterface_preallocateVertices;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, numverts, __functionAddress);
    }

    // --- [ btStridingMeshInterface_serialize ] ---

    public static long nbtStridingMeshInterface_serialize(long obj, long dataBuffer, long serializer) {
        long __functionAddress = Functions.StridingMeshInterface_serialize;
        if (CHECKS) {
            check(obj);
            check(dataBuffer);
            check(serializer);
        }
        return invokePPPP(obj, dataBuffer, serializer, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String btStridingMeshInterface_serialize(@NativeType("void *") long obj, @NativeType("void *") long dataBuffer, @NativeType("void *") long serializer) {
        long __result = nbtStridingMeshInterface_serialize(obj, dataBuffer, serializer);
        return memUTF8Safe(__result);
    }

    // --- [ btStridingMeshInterface_setPremadeAabb ] ---

    public static void nbtStridingMeshInterface_setPremadeAabb(long obj, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.StridingMeshInterface_setPremadeAabb;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, aabbMin, aabbMax, __functionAddress);
    }

    public static void btStridingMeshInterface_setPremadeAabb(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 aabbMin, @NativeType("btVector3 const *") BTVector3 aabbMax) {
        nbtStridingMeshInterface_setPremadeAabb(obj, aabbMin.address(), aabbMax.address());
    }

    // --- [ btStridingMeshInterface_setScaling ] ---

    public static void nbtStridingMeshInterface_setScaling(long obj, long scaling) {
        long __functionAddress = Functions.StridingMeshInterface_setScaling;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, scaling, __functionAddress);
    }

    public static void btStridingMeshInterface_setScaling(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 scaling) {
        nbtStridingMeshInterface_setScaling(obj, scaling.address());
    }

    // --- [ btStridingMeshInterface_unLockReadOnlyVertexBase ] ---

    public static void btStridingMeshInterface_unLockReadOnlyVertexBase(@NativeType("void *") long obj, int subpart) {
        long __functionAddress = Functions.StridingMeshInterface_unLockReadOnlyVertexBase;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, subpart, __functionAddress);
    }

    // --- [ btStridingMeshInterface_unLockVertexBase ] ---

    public static void btStridingMeshInterface_unLockVertexBase(@NativeType("void *") long obj, int subpart) {
        long __functionAddress = Functions.StridingMeshInterface_unLockVertexBase;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, subpart, __functionAddress);
    }

    // --- [ btStridingMeshInterface_delete ] ---

    public static void btStridingMeshInterface_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.StridingMeshInterface_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}