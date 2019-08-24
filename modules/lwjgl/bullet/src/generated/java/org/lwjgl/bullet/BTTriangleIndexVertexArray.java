/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTTriangleIndexVertexArray {

    protected BTTriangleIndexVertexArray() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            IndexedMesh_new                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_new"),
            IndexedMesh_getIndexType                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_getIndexType"),
            IndexedMesh_getNumTriangles                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_getNumTriangles"),
            IndexedMesh_getNumVertices                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_getNumVertices"),
            IndexedMesh_getTriangleIndexBase             = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_getTriangleIndexBase"),
            IndexedMesh_getTriangleIndexStride           = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_getTriangleIndexStride"),
            IndexedMesh_getVertexBase                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_getVertexBase"),
            IndexedMesh_getVertexStride                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_getVertexStride"),
            IndexedMesh_getVertexType                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_getVertexType"),
            IndexedMesh_setIndexType                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_setIndexType"),
            IndexedMesh_setNumTriangles                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_setNumTriangles"),
            IndexedMesh_setNumVertices                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_setNumVertices"),
            IndexedMesh_setTriangleIndexBase             = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_setTriangleIndexBase"),
            IndexedMesh_setTriangleIndexStride           = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_setTriangleIndexStride"),
            IndexedMesh_setVertexBase                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_setVertexBase"),
            IndexedMesh_setVertexStride                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_setVertexStride"),
            IndexedMesh_setVertexType                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_setVertexType"),
            IndexedMesh_delete                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btIndexedMesh_delete"),
            TriangleIndexVertexArray_new                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleIndexVertexArray_new"),
            TriangleIndexVertexArray_new2                = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleIndexVertexArray_new2"),
            TriangleIndexVertexArray_addIndexedMesh      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleIndexVertexArray_addIndexedMesh"),
            TriangleIndexVertexArray_getIndexedMeshArray = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleIndexVertexArray_getIndexedMeshArray");

    }

    // --- [ btIndexedMesh_new ] ---

    @NativeType("void *")
    public static long btIndexedMesh_new() {
        long __functionAddress = Functions.IndexedMesh_new;
        return invokeP(__functionAddress);
    }

    // --- [ btIndexedMesh_getIndexType ] ---

    public static int btIndexedMesh_getIndexType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.IndexedMesh_getIndexType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btIndexedMesh_getNumTriangles ] ---

    public static int btIndexedMesh_getNumTriangles(@NativeType("void *") long obj) {
        long __functionAddress = Functions.IndexedMesh_getNumTriangles;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btIndexedMesh_getNumVertices ] ---

    public static int btIndexedMesh_getNumVertices(@NativeType("void *") long obj) {
        long __functionAddress = Functions.IndexedMesh_getNumVertices;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btIndexedMesh_getTriangleIndexBase ] ---

    @NativeType("void const *")
    public static long btIndexedMesh_getTriangleIndexBase(@NativeType("void *") long obj) {
        long __functionAddress = Functions.IndexedMesh_getTriangleIndexBase;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btIndexedMesh_getTriangleIndexStride ] ---

    public static int btIndexedMesh_getTriangleIndexStride(@NativeType("void *") long obj) {
        long __functionAddress = Functions.IndexedMesh_getTriangleIndexStride;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btIndexedMesh_getVertexBase ] ---

    @NativeType("void const *")
    public static long btIndexedMesh_getVertexBase(@NativeType("void *") long obj) {
        long __functionAddress = Functions.IndexedMesh_getVertexBase;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btIndexedMesh_getVertexStride ] ---

    public static int btIndexedMesh_getVertexStride(@NativeType("void *") long obj) {
        long __functionAddress = Functions.IndexedMesh_getVertexStride;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btIndexedMesh_getVertexType ] ---

    public static int btIndexedMesh_getVertexType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.IndexedMesh_getVertexType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btIndexedMesh_setIndexType ] ---

    public static void btIndexedMesh_setIndexType(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.IndexedMesh_setIndexType;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btIndexedMesh_setNumTriangles ] ---

    public static void btIndexedMesh_setNumTriangles(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.IndexedMesh_setNumTriangles;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btIndexedMesh_setNumVertices ] ---

    public static void btIndexedMesh_setNumVertices(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.IndexedMesh_setNumVertices;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btIndexedMesh_setTriangleIndexBase ] ---

    public static void nbtIndexedMesh_setTriangleIndexBase(long obj, long value) {
        long __functionAddress = Functions.IndexedMesh_setTriangleIndexBase;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btIndexedMesh_setTriangleIndexBase(@NativeType("void *") long obj, @NativeType("unsigned char const *") ByteBuffer value) {
        nbtIndexedMesh_setTriangleIndexBase(obj, memAddress(value));
    }

    // --- [ btIndexedMesh_setTriangleIndexStride ] ---

    public static void btIndexedMesh_setTriangleIndexStride(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.IndexedMesh_setTriangleIndexStride;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btIndexedMesh_setVertexBase ] ---

    public static void nbtIndexedMesh_setVertexBase(long obj, long value) {
        long __functionAddress = Functions.IndexedMesh_setVertexBase;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btIndexedMesh_setVertexBase(@NativeType("void *") long obj, @NativeType("unsigned char const *") ByteBuffer value) {
        nbtIndexedMesh_setVertexBase(obj, memAddress(value));
    }

    // --- [ btIndexedMesh_setVertexStride ] ---

    public static void btIndexedMesh_setVertexStride(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.IndexedMesh_setVertexStride;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btIndexedMesh_setVertexType ] ---

    public static void btIndexedMesh_setVertexType(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.IndexedMesh_setVertexType;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btIndexedMesh_delete ] ---

    public static void btIndexedMesh_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.IndexedMesh_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btTriangleIndexVertexArray_new ] ---

    @NativeType("void *")
    public static long btTriangleIndexVertexArray_new() {
        long __functionAddress = Functions.TriangleIndexVertexArray_new;
        return invokeP(__functionAddress);
    }

    // --- [ btTriangleIndexVertexArray_new2 ] ---

    /** Unsafe version of: {@link #btTriangleIndexVertexArray_new2 TriangleIndexVertexArray_new2} */
    public static long nbtTriangleIndexVertexArray_new2(int numTriangles, long triangleIndexBase, int triangleIndexStride, int numVertices, long vertexBase, int vertexStride) {
        long __functionAddress = Functions.TriangleIndexVertexArray_new2;
        return invokePPP(numTriangles, triangleIndexBase, triangleIndexStride, numVertices, vertexBase, vertexStride, __functionAddress);
    }

    /**
     * @param triangleIndexStride Size in byte of the indices for one triangle (3*sizeof(index_type) if the indices are tightly packed)
     * @param vertexStride        Size of a vertex, in bytes
     */
    @NativeType("void *")
    public static long btTriangleIndexVertexArray_new2(int numTriangles, @NativeType("int *") IntBuffer triangleIndexBase, int triangleIndexStride, int numVertices, @NativeType("btScalar *") FloatBuffer vertexBase, int vertexStride) {
        return nbtTriangleIndexVertexArray_new2(numTriangles, memAddress(triangleIndexBase), triangleIndexStride, numVertices, memAddress(vertexBase), vertexStride);
    }

    // --- [ btTriangleIndexVertexArray_addIndexedMesh ] ---

    public static void btTriangleIndexVertexArray_addIndexedMesh(@NativeType("void *") long obj, @NativeType("void *") long mesh, int indexType) {
        long __functionAddress = Functions.TriangleIndexVertexArray_addIndexedMesh;
        if (CHECKS) {
            check(obj);
            check(mesh);
        }
        invokePPV(obj, mesh, indexType, __functionAddress);
    }

    // --- [ btTriangleIndexVertexArray_getIndexedMeshArray ] ---

    @NativeType("void *")
    public static long btTriangleIndexVertexArray_getIndexedMeshArray(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleIndexVertexArray_getIndexedMeshArray;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

}