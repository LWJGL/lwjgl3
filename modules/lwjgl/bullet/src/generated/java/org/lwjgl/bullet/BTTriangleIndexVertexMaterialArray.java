/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTTriangleIndexVertexMaterialArray {

    protected BTTriangleIndexVertexMaterialArray() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MaterialProperties_new                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_new"),
            MaterialProperties_getMaterialBase                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_getMaterialBase"),
            MaterialProperties_getMaterialStride                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_getMaterialStride"),
            MaterialProperties_getMaterialType                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_getMaterialType"),
            MaterialProperties_getNumMaterials                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_getNumMaterials"),
            MaterialProperties_getNumTriangles                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_getNumTriangles"),
            MaterialProperties_getTriangleMaterialsBase                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_getTriangleMaterialsBase"),
            MaterialProperties_getTriangleMaterialStride                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_getTriangleMaterialStride"),
            MaterialProperties_getTriangleType                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_getTriangleType"),
            MaterialProperties_setMaterialBase                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_setMaterialBase"),
            MaterialProperties_setMaterialStride                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_setMaterialStride"),
            MaterialProperties_setMaterialType                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_setMaterialType"),
            MaterialProperties_setNumMaterials                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_setNumMaterials"),
            MaterialProperties_setNumTriangles                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_setNumTriangles"),
            MaterialProperties_setTriangleMaterialsBase                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_setTriangleMaterialsBase"),
            MaterialProperties_setTriangleMaterialStride                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_setTriangleMaterialStride"),
            MaterialProperties_setTriangleType                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_setTriangleType"),
            MaterialProperties_delete                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btMaterialProperties_delete"),
            TriangleIndexVertexMaterialArray_new                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleIndexVertexMaterialArray_new"),
            TriangleIndexVertexMaterialArray_new2                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleIndexVertexMaterialArray_new2"),
            TriangleIndexVertexMaterialArray_addMaterialProperties         = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleIndexVertexMaterialArray_addMaterialProperties"),
            TriangleIndexVertexMaterialArray_getLockedMaterialBase         = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleIndexVertexMaterialArray_getLockedMaterialBase"),
            TriangleIndexVertexMaterialArray_getLockedReadOnlyMaterialBase = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleIndexVertexMaterialArray_getLockedReadOnlyMaterialBase");

    }

    // --- [ btMaterialProperties_new ] ---

    @NativeType("void *")
    public static long btMaterialProperties_new() {
        long __functionAddress = Functions.MaterialProperties_new;
        return invokeP(__functionAddress);
    }

    // --- [ btMaterialProperties_getMaterialBase ] ---

    @NativeType("void const *")
    public static long btMaterialProperties_getMaterialBase(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MaterialProperties_getMaterialBase;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMaterialProperties_getMaterialStride ] ---

    public static int btMaterialProperties_getMaterialStride(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MaterialProperties_getMaterialStride;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMaterialProperties_getMaterialType ] ---

    public static int btMaterialProperties_getMaterialType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MaterialProperties_getMaterialType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMaterialProperties_getNumMaterials ] ---

    public static int btMaterialProperties_getNumMaterials(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MaterialProperties_getNumMaterials;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMaterialProperties_getNumTriangles ] ---

    public static int btMaterialProperties_getNumTriangles(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MaterialProperties_getNumTriangles;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMaterialProperties_getTriangleMaterialsBase ] ---

    @NativeType("void const *")
    public static long btMaterialProperties_getTriangleMaterialsBase(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MaterialProperties_getTriangleMaterialsBase;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMaterialProperties_getTriangleMaterialStride ] ---

    public static int btMaterialProperties_getTriangleMaterialStride(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MaterialProperties_getTriangleMaterialStride;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMaterialProperties_getTriangleType ] ---

    public static int btMaterialProperties_getTriangleType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MaterialProperties_getTriangleType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMaterialProperties_setMaterialBase ] ---

    public static void nbtMaterialProperties_setMaterialBase(long obj, long value) {
        long __functionAddress = Functions.MaterialProperties_setMaterialBase;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMaterialProperties_setMaterialBase(@NativeType("void *") long obj, @NativeType("unsigned char const *") ByteBuffer value) {
        nbtMaterialProperties_setMaterialBase(obj, memAddress(value));
    }

    // --- [ btMaterialProperties_setMaterialStride ] ---

    public static void btMaterialProperties_setMaterialStride(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MaterialProperties_setMaterialStride;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMaterialProperties_setMaterialType ] ---

    public static void btMaterialProperties_setMaterialType(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MaterialProperties_setMaterialType;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMaterialProperties_setNumMaterials ] ---

    public static void btMaterialProperties_setNumMaterials(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MaterialProperties_setNumMaterials;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMaterialProperties_setNumTriangles ] ---

    public static void btMaterialProperties_setNumTriangles(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MaterialProperties_setNumTriangles;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMaterialProperties_setTriangleMaterialsBase ] ---

    public static void nbtMaterialProperties_setTriangleMaterialsBase(long obj, long value) {
        long __functionAddress = Functions.MaterialProperties_setTriangleMaterialsBase;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMaterialProperties_setTriangleMaterialsBase(@NativeType("void *") long obj, @NativeType("unsigned char const *") ByteBuffer value) {
        nbtMaterialProperties_setTriangleMaterialsBase(obj, memAddress(value));
    }

    // --- [ btMaterialProperties_setTriangleMaterialStride ] ---

    public static void btMaterialProperties_setTriangleMaterialStride(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MaterialProperties_setTriangleMaterialStride;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMaterialProperties_setTriangleType ] ---

    public static void btMaterialProperties_setTriangleType(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MaterialProperties_setTriangleType;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMaterialProperties_delete ] ---

    public static void btMaterialProperties_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MaterialProperties_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btTriangleIndexVertexMaterialArray_new ] ---

    @NativeType("void *")
    public static long btTriangleIndexVertexMaterialArray_new() {
        long __functionAddress = Functions.TriangleIndexVertexMaterialArray_new;
        return invokeP(__functionAddress);
    }

    // --- [ btTriangleIndexVertexMaterialArray_new2 ] ---

    /** Unsafe version of: {@link #btTriangleIndexVertexMaterialArray_new2 TriangleIndexVertexMaterialArray_new2} */
    public static long nbtTriangleIndexVertexMaterialArray_new2(int numTriangles, long triangleIndexBase, int triangleIndexStride, int numVertices, long vertexBase, int vertexStride, int numMaterials, long materialBase, int materialStride, long triangleMaterialsBase, int materialIndexStride) {
        long __functionAddress = Functions.TriangleIndexVertexMaterialArray_new2;
        return invokePPPPP(numTriangles, triangleIndexBase, triangleIndexStride, numVertices, vertexBase, vertexStride, numMaterials, materialBase, materialStride, triangleMaterialsBase, materialIndexStride, __functionAddress);
    }

    /**
     * 2 btScalar values make up one material, friction then restitution
     *
     * @param triangleMaterialsBase 1 integer value makes up one entry eg: m_triangleMaterials[1] = 5; // This will set triangle 2 to use material 5
     */
    @NativeType("void *")
    public static long btTriangleIndexVertexMaterialArray_new2(int numTriangles, @NativeType("int *") IntBuffer triangleIndexBase, int triangleIndexStride, int numVertices, @NativeType("btScalar *") FloatBuffer vertexBase, int vertexStride, int numMaterials, @NativeType("unsigned char *") ByteBuffer materialBase, int materialStride, @NativeType("int *") IntBuffer triangleMaterialsBase, int materialIndexStride) {
        return nbtTriangleIndexVertexMaterialArray_new2(numTriangles, memAddress(triangleIndexBase), triangleIndexStride, numVertices, memAddress(vertexBase), vertexStride, numMaterials, memAddress(materialBase), materialStride, memAddress(triangleMaterialsBase), materialIndexStride);
    }

    // --- [ btTriangleIndexVertexMaterialArray_addMaterialProperties ] ---

    public static void btTriangleIndexVertexMaterialArray_addMaterialProperties(@NativeType("void *") long obj, @NativeType("void *") long mat, int triangleType) {
        long __functionAddress = Functions.TriangleIndexVertexMaterialArray_addMaterialProperties;
        if (CHECKS) {
            check(obj);
            check(mat);
        }
        invokePPV(obj, mat, triangleType, __functionAddress);
    }

    // --- [ btTriangleIndexVertexMaterialArray_getLockedMaterialBase ] ---

    public static void nbtTriangleIndexVertexMaterialArray_getLockedMaterialBase(long obj, long materialBase, long numMaterials, long materialType, long materialStride, long triangleMaterialBase, long numTriangles, long triangleMaterialStride, long triangleType, int subpart) {
        long __functionAddress = Functions.TriangleIndexVertexMaterialArray_getLockedMaterialBase;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPPPPPPV(obj, materialBase, numMaterials, materialType, materialStride, triangleMaterialBase, numTriangles, triangleMaterialStride, triangleType, subpart, __functionAddress);
    }

    public static void btTriangleIndexVertexMaterialArray_getLockedMaterialBase(@NativeType("void *") long obj, @NativeType("unsigned char **") PointerBuffer materialBase, @NativeType("int *") IntBuffer numMaterials, @NativeType("int *") IntBuffer materialType, @NativeType("int *") IntBuffer materialStride, @NativeType("unsigned char **") PointerBuffer triangleMaterialBase, @NativeType("int *") IntBuffer numTriangles, @NativeType("int *") IntBuffer triangleMaterialStride, @NativeType("int *") IntBuffer triangleType, int subpart) {
        if (CHECKS) {
            check(materialBase, 1);
            check(numMaterials, 1);
            check(materialType, 1);
            check(materialStride, 1);
            check(triangleMaterialBase, 1);
            check(numTriangles, 1);
            check(triangleMaterialStride, 1);
            check(triangleType, 1);
        }
        nbtTriangleIndexVertexMaterialArray_getLockedMaterialBase(obj, memAddress(materialBase), memAddress(numMaterials), memAddress(materialType), memAddress(materialStride), memAddress(triangleMaterialBase), memAddress(numTriangles), memAddress(triangleMaterialStride), memAddress(triangleType), subpart);
    }

    // --- [ btTriangleIndexVertexMaterialArray_getLockedReadOnlyMaterialBase ] ---

    public static void nbtTriangleIndexVertexMaterialArray_getLockedReadOnlyMaterialBase(long obj, long materialBase, long numMaterials, long materialType, long materialStride, long triangleMaterialBase, long numTriangles, long triangleMaterialStride, long triangleType, int subpart) {
        long __functionAddress = Functions.TriangleIndexVertexMaterialArray_getLockedReadOnlyMaterialBase;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPPPPPPV(obj, materialBase, numMaterials, materialType, materialStride, triangleMaterialBase, numTriangles, triangleMaterialStride, triangleType, subpart, __functionAddress);
    }

    public static void btTriangleIndexVertexMaterialArray_getLockedReadOnlyMaterialBase(@NativeType("void *") long obj, @NativeType("unsigned char const **") PointerBuffer materialBase, @NativeType("int *") IntBuffer numMaterials, @NativeType("int *") IntBuffer materialType, @NativeType("int *") IntBuffer materialStride, @NativeType("unsigned char const **") PointerBuffer triangleMaterialBase, @NativeType("int *") IntBuffer numTriangles, @NativeType("int *") IntBuffer triangleMaterialStride, @NativeType("int *") IntBuffer triangleType, int subpart) {
        if (CHECKS) {
            check(materialBase, 1);
            check(numMaterials, 1);
            check(materialType, 1);
            check(materialStride, 1);
            check(triangleMaterialBase, 1);
            check(numTriangles, 1);
            check(triangleMaterialStride, 1);
            check(triangleType, 1);
        }
        nbtTriangleIndexVertexMaterialArray_getLockedReadOnlyMaterialBase(obj, memAddress(materialBase), memAddress(numMaterials), memAddress(materialType), memAddress(materialStride), memAddress(triangleMaterialBase), memAddress(numTriangles), memAddress(triangleMaterialStride), memAddress(triangleType), subpart);
    }

}