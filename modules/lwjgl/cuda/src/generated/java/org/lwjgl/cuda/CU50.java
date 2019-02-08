/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/index.html">CUDA Driver API</a>. */
public class CU50 extends CU42 {

    /**
     * Resource types. ({@code CUresourcetype})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_RESOURCE_TYPE_ARRAY RESOURCE_TYPE_ARRAY} - Array resoure</li>
     * <li>{@link #CU_RESOURCE_TYPE_MIPMAPPED_ARRAY RESOURCE_TYPE_MIPMAPPED_ARRAY} - Mipmapped array resource</li>
     * <li>{@link #CU_RESOURCE_TYPE_LINEAR RESOURCE_TYPE_LINEAR} - Linear resource</li>
     * <li>{@link #CU_RESOURCE_TYPE_PITCH2D RESOURCE_TYPE_PITCH2D} - Pitch 2D resource</li>
     * </ul>
     */
    public static final int
        CU_RESOURCE_TYPE_ARRAY           = 0x0,
        CU_RESOURCE_TYPE_MIPMAPPED_ARRAY = 0x1,
        CU_RESOURCE_TYPE_LINEAR          = 0x2,
        CU_RESOURCE_TYPE_PITCH2D         = 0x3;

    /**
     * Resource view format. ({@code CUresourceViewFormat})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_RES_VIEW_FORMAT_NONE RES_VIEW_FORMAT_NONE} - No resource view format (use underlying resource format)</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_1X8 RES_VIEW_FORMAT_UINT_1X8} - 1 channel unsigned 8-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_2X8 RES_VIEW_FORMAT_UINT_2X8} - 2 channel unsigned 8-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_4X8 RES_VIEW_FORMAT_UINT_4X8} - 4 channel unsigned 8-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_1X8 RES_VIEW_FORMAT_SINT_1X8} - 1 channel signed 8-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_2X8 RES_VIEW_FORMAT_SINT_2X8} - 2 channel signed 8-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_4X8 RES_VIEW_FORMAT_SINT_4X8} - 4 channel signed 8-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_1X16 RES_VIEW_FORMAT_UINT_1X16} - 1 channel unsigned 16-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_2X16 RES_VIEW_FORMAT_UINT_2X16} - 2 channel unsigned 16-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_4X16 RES_VIEW_FORMAT_UINT_4X16} - 4 channel unsigned 16-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_1X16 RES_VIEW_FORMAT_SINT_1X16} - 1 channel signed 16-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_2X16 RES_VIEW_FORMAT_SINT_2X16} - 2 channel signed 16-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_4X16 RES_VIEW_FORMAT_SINT_4X16} - 4 channel signed 16-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_1X32 RES_VIEW_FORMAT_UINT_1X32} - 1 channel unsigned 32-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_2X32 RES_VIEW_FORMAT_UINT_2X32} - 2 channel unsigned 32-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_4X32 RES_VIEW_FORMAT_UINT_4X32} - 4 channel unsigned 32-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_1X32 RES_VIEW_FORMAT_SINT_1X32} - 1 channel signed 32-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_2X32 RES_VIEW_FORMAT_SINT_2X32} - 2 channel signed 32-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_4X32 RES_VIEW_FORMAT_SINT_4X32} - 4 channel signed 32-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_FLOAT_1X16 RES_VIEW_FORMAT_FLOAT_1X16} - 1 channel 16-bit floating point</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_FLOAT_2X16 RES_VIEW_FORMAT_FLOAT_2X16} - 2 channel 16-bit floating point</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_FLOAT_4X16 RES_VIEW_FORMAT_FLOAT_4X16} - 4 channel 16-bit floating point</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_FLOAT_1X32 RES_VIEW_FORMAT_FLOAT_1X32} - 1 channel 32-bit floating point</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_FLOAT_2X32 RES_VIEW_FORMAT_FLOAT_2X32} - 2 channel 32-bit floating point</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_FLOAT_4X32 RES_VIEW_FORMAT_FLOAT_4X32} - 4 channel 32-bit floating point</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UNSIGNED_BC1 RES_VIEW_FORMAT_UNSIGNED_BC1} - Block compressed 1</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UNSIGNED_BC2 RES_VIEW_FORMAT_UNSIGNED_BC2} - Block compressed 2</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UNSIGNED_BC3 RES_VIEW_FORMAT_UNSIGNED_BC3} - Block compressed 3</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UNSIGNED_BC4 RES_VIEW_FORMAT_UNSIGNED_BC4} - Block compressed 4 unsigned</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SIGNED_BC4 RES_VIEW_FORMAT_SIGNED_BC4} - Block compressed 4 signed</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UNSIGNED_BC5 RES_VIEW_FORMAT_UNSIGNED_BC5} - Block compressed 5 unsigned</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SIGNED_BC5 RES_VIEW_FORMAT_SIGNED_BC5} - Block compressed 5 signed</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UNSIGNED_BC6H RES_VIEW_FORMAT_UNSIGNED_BC6H} - Block compressed 6 unsigned half-float</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SIGNED_BC6H RES_VIEW_FORMAT_SIGNED_BC6H} - Block compressed 6 signed half-float</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UNSIGNED_BC7 RES_VIEW_FORMAT_UNSIGNED_BC7} - Block compressed 7</li>
     * </ul>
     */
    public static final int
        CU_RES_VIEW_FORMAT_NONE          = 0x0,
        CU_RES_VIEW_FORMAT_UINT_1X8      = 0x1,
        CU_RES_VIEW_FORMAT_UINT_2X8      = 0x2,
        CU_RES_VIEW_FORMAT_UINT_4X8      = 0x3,
        CU_RES_VIEW_FORMAT_SINT_1X8      = 0x4,
        CU_RES_VIEW_FORMAT_SINT_2X8      = 0x5,
        CU_RES_VIEW_FORMAT_SINT_4X8      = 0x6,
        CU_RES_VIEW_FORMAT_UINT_1X16     = 0x7,
        CU_RES_VIEW_FORMAT_UINT_2X16     = 0x8,
        CU_RES_VIEW_FORMAT_UINT_4X16     = 0x9,
        CU_RES_VIEW_FORMAT_SINT_1X16     = 0xA,
        CU_RES_VIEW_FORMAT_SINT_2X16     = 0xB,
        CU_RES_VIEW_FORMAT_SINT_4X16     = 0xC,
        CU_RES_VIEW_FORMAT_UINT_1X32     = 0xD,
        CU_RES_VIEW_FORMAT_UINT_2X32     = 0xE,
        CU_RES_VIEW_FORMAT_UINT_4X32     = 0xF,
        CU_RES_VIEW_FORMAT_SINT_1X32     = 0x10,
        CU_RES_VIEW_FORMAT_SINT_2X32     = 0x11,
        CU_RES_VIEW_FORMAT_SINT_4X32     = 0x12,
        CU_RES_VIEW_FORMAT_FLOAT_1X16    = 0x13,
        CU_RES_VIEW_FORMAT_FLOAT_2X16    = 0x14,
        CU_RES_VIEW_FORMAT_FLOAT_4X16    = 0x15,
        CU_RES_VIEW_FORMAT_FLOAT_1X32    = 0x16,
        CU_RES_VIEW_FORMAT_FLOAT_2X32    = 0x17,
        CU_RES_VIEW_FORMAT_FLOAT_4X32    = 0x18,
        CU_RES_VIEW_FORMAT_UNSIGNED_BC1  = 0x19,
        CU_RES_VIEW_FORMAT_UNSIGNED_BC2  = 0x1A,
        CU_RES_VIEW_FORMAT_UNSIGNED_BC3  = 0x1B,
        CU_RES_VIEW_FORMAT_UNSIGNED_BC4  = 0x1C,
        CU_RES_VIEW_FORMAT_SIGNED_BC4    = 0x1D,
        CU_RES_VIEW_FORMAT_UNSIGNED_BC5  = 0x1E,
        CU_RES_VIEW_FORMAT_SIGNED_BC5    = 0x1F,
        CU_RES_VIEW_FORMAT_UNSIGNED_BC6H = 0x20,
        CU_RES_VIEW_FORMAT_SIGNED_BC6H   = 0x21,
        CU_RES_VIEW_FORMAT_UNSIGNED_BC7  = 0x22;

    protected CU50() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MipmappedArrayCreate                    = apiGetFunctionAddress(CU.getLibrary(), "cuMipmappedArrayCreate"),
            MipmappedArrayGetLevel                  = apiGetFunctionAddress(CU.getLibrary(), "cuMipmappedArrayGetLevel"),
            MipmappedArrayDestroy                   = apiGetFunctionAddress(CU.getLibrary(), "cuMipmappedArrayDestroy"),
            TexObjectCreate                         = apiGetFunctionAddress(CU.getLibrary(), "cuTexObjectCreate"),
            TexObjectDestroy                        = apiGetFunctionAddress(CU.getLibrary(), "cuTexObjectDestroy"),
            TexObjectGetResourceDesc                = apiGetFunctionAddress(CU.getLibrary(), "cuTexObjectGetResourceDesc"),
            TexObjectGetTextureDesc                 = apiGetFunctionAddress(CU.getLibrary(), "cuTexObjectGetTextureDesc"),
            TexObjectGetResourceViewDesc            = apiGetFunctionAddress(CU.getLibrary(), "cuTexObjectGetResourceViewDesc"),
            SurfObjectCreate                        = apiGetFunctionAddress(CU.getLibrary(), "cuSurfObjectCreate"),
            SurfObjectDestroy                       = apiGetFunctionAddress(CU.getLibrary(), "cuSurfObjectDestroy"),
            SurfObjectGetResourceDesc               = apiGetFunctionAddress(CU.getLibrary(), "cuSurfObjectGetResourceDesc"),
            GraphicsResourceGetMappedMipmappedArray = apiGetFunctionAddress(CU.getLibrary(), "cuGraphicsResourceGetMappedMipmappedArray");

    }

    // --- [ cuMipmappedArrayCreate ] ---

    public static int ncuMipmappedArrayCreate(long pHandle, long pMipmappedArrayDesc, int numMipmapLevels) {
        long __functionAddress = Functions.MipmappedArrayCreate;
        return callPPI(pHandle, pMipmappedArrayDesc, numMipmapLevels, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMipmappedArrayCreate(@NativeType("CUmipmappedArray *") PointerBuffer pHandle, @NativeType("CUDA_ARRAY3D_DESCRIPTOR const *") CUDA_ARRAY3D_DESCRIPTOR pMipmappedArrayDesc, @NativeType("unsigned int") int numMipmapLevels) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return ncuMipmappedArrayCreate(memAddress(pHandle), pMipmappedArrayDesc.address(), numMipmapLevels);
    }

    // --- [ cuMipmappedArrayGetLevel ] ---

    public static int ncuMipmappedArrayGetLevel(long pLevelArray, long hMipmappedArray, int level) {
        long __functionAddress = Functions.MipmappedArrayGetLevel;
        if (CHECKS) {
            check(hMipmappedArray);
        }
        return callPPI(pLevelArray, hMipmappedArray, level, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMipmappedArrayGetLevel(@NativeType("CUarray *") PointerBuffer pLevelArray, @NativeType("CUmipmappedArray") long hMipmappedArray, @NativeType("unsigned int") int level) {
        if (CHECKS) {
            check(pLevelArray, 1);
        }
        return ncuMipmappedArrayGetLevel(memAddress(pLevelArray), hMipmappedArray, level);
    }

    // --- [ cuMipmappedArrayDestroy ] ---

    @NativeType("CUresult")
    public static int cuMipmappedArrayDestroy(@NativeType("CUmipmappedArray") long hMipmappedArray) {
        long __functionAddress = Functions.MipmappedArrayDestroy;
        if (CHECKS) {
            check(hMipmappedArray);
        }
        return callPI(hMipmappedArray, __functionAddress);
    }

    // --- [ cuTexObjectCreate ] ---

    public static int ncuTexObjectCreate(long pTexObject, long pResDesc, long pTexDesc, long pResViewDesc) {
        long __functionAddress = Functions.TexObjectCreate;
        return callPPPPI(pTexObject, pResDesc, pTexDesc, pResViewDesc, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexObjectCreate(@NativeType("CUtexObject *") LongBuffer pTexObject, @NativeType("CUDA_RESOURCE_DESC const *") CUDA_RESOURCE_DESC pResDesc, @NativeType("CUDA_TEXTURE_DESC const *") CUDA_TEXTURE_DESC pTexDesc, @NativeType("CUDA_RESOURCE_VIEW_DESC const *") CUDA_RESOURCE_VIEW_DESC pResViewDesc) {
        if (CHECKS) {
            check(pTexObject, 1);
        }
        return ncuTexObjectCreate(memAddress(pTexObject), pResDesc.address(), pTexDesc.address(), pResViewDesc.address());
    }

    // --- [ cuTexObjectDestroy ] ---

    @NativeType("CUresult")
    public static int cuTexObjectDestroy(@NativeType("CUtexObject") long texObject) {
        long __functionAddress = Functions.TexObjectDestroy;
        return callJI(texObject, __functionAddress);
    }

    // --- [ cuTexObjectGetResourceDesc ] ---

    public static int ncuTexObjectGetResourceDesc(long pResDesc, long texObject) {
        long __functionAddress = Functions.TexObjectGetResourceDesc;
        return callPJI(pResDesc, texObject, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexObjectGetResourceDesc(@NativeType("CUDA_RESOURCE_DESC *") CUDA_RESOURCE_DESC pResDesc, @NativeType("CUtexObject") long texObject) {
        return ncuTexObjectGetResourceDesc(pResDesc.address(), texObject);
    }

    // --- [ cuTexObjectGetTextureDesc ] ---

    public static int ncuTexObjectGetTextureDesc(long pTexDesc, long texObject) {
        long __functionAddress = Functions.TexObjectGetTextureDesc;
        return callPJI(pTexDesc, texObject, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexObjectGetTextureDesc(@NativeType("CUDA_TEXTURE_DESC *") CUDA_TEXTURE_DESC pTexDesc, @NativeType("CUtexObject") long texObject) {
        return ncuTexObjectGetTextureDesc(pTexDesc.address(), texObject);
    }

    // --- [ cuTexObjectGetResourceViewDesc ] ---

    public static int ncuTexObjectGetResourceViewDesc(long pResViewDesc, long texObject) {
        long __functionAddress = Functions.TexObjectGetResourceViewDesc;
        return callPJI(pResViewDesc, texObject, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexObjectGetResourceViewDesc(@NativeType("CUDA_RESOURCE_VIEW_DESC *") CUDA_RESOURCE_VIEW_DESC pResViewDesc, @NativeType("CUtexObject") long texObject) {
        return ncuTexObjectGetResourceViewDesc(pResViewDesc.address(), texObject);
    }

    // --- [ cuSurfObjectCreate ] ---

    public static int ncuSurfObjectCreate(long pSurfObject, long pResDesc) {
        long __functionAddress = Functions.SurfObjectCreate;
        return callPPI(pSurfObject, pResDesc, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuSurfObjectCreate(@NativeType("CUsurfObject *") LongBuffer pSurfObject, @NativeType("CUDA_RESOURCE_DESC const *") CUDA_RESOURCE_DESC pResDesc) {
        if (CHECKS) {
            check(pSurfObject, 1);
        }
        return ncuSurfObjectCreate(memAddress(pSurfObject), pResDesc.address());
    }

    // --- [ cuSurfObjectDestroy ] ---

    @NativeType("CUresult")
    public static int cuSurfObjectDestroy(@NativeType("CUsurfObject") long surfObject) {
        long __functionAddress = Functions.SurfObjectDestroy;
        return callJI(surfObject, __functionAddress);
    }

    // --- [ cuSurfObjectGetResourceDesc ] ---

    public static int ncuSurfObjectGetResourceDesc(long pResDesc, long surfObject) {
        long __functionAddress = Functions.SurfObjectGetResourceDesc;
        return callPJI(pResDesc, surfObject, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuSurfObjectGetResourceDesc(@NativeType("CUDA_RESOURCE_DESC *") CUDA_RESOURCE_DESC pResDesc, @NativeType("CUsurfObject") long surfObject) {
        return ncuSurfObjectGetResourceDesc(pResDesc.address(), surfObject);
    }

    // --- [ cuGraphicsResourceGetMappedMipmappedArray ] ---

    public static int ncuGraphicsResourceGetMappedMipmappedArray(long pMipmappedArray, long resource) {
        long __functionAddress = Functions.GraphicsResourceGetMappedMipmappedArray;
        if (CHECKS) {
            check(resource);
        }
        return callPPI(pMipmappedArray, resource, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphicsResourceGetMappedMipmappedArray(@NativeType("CUmipmappedArray *") PointerBuffer pMipmappedArray, @NativeType("CUgraphicsResource") long resource) {
        if (CHECKS) {
            check(pMipmappedArray, 1);
        }
        return ncuGraphicsResourceGetMappedMipmappedArray(memAddress(pMipmappedArray), resource);
    }

}