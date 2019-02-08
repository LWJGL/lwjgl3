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

import static org.lwjgl.cuda.CUDA.*;

/** Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/index.html">CUDA Driver API</a>. */
public class CU60 extends CU55 {

    /**
     * CUDA Mem Attach Flags. ({@code CUmemAttach_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEM_ATTACH_GLOBAL MEM_ATTACH_GLOBAL} - Memory can be accessed by any stream on any device</li>
     * <li>{@link #CU_MEM_ATTACH_HOST MEM_ATTACH_HOST} - Memory cannot be accessed by any stream on any device</li>
     * <li>{@link #CU_MEM_ATTACH_SINGLE MEM_ATTACH_SINGLE} - Memory can only be accessed by a single stream on the associated device</li>
     * </ul>
     */
    public static final int
        CU_MEM_ATTACH_GLOBAL = 0x1,
        CU_MEM_ATTACH_HOST   = 0x2,
        CU_MEM_ATTACH_SINGLE = 0x4;

    protected CU60() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MemAllocManaged      = apiGetFunctionAddress(CU.getLibrary(), "cuMemAllocManaged"),
            PointerSetAttribute  = apiGetFunctionAddress(CU.getLibrary(), "cuPointerSetAttribute"),
            StreamAttachMemAsync = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuStreamAttachMemAsync"));

    }

    // --- [ cuMemAllocManaged ] ---

    public static int ncuMemAllocManaged(long dptr, long bytesize, int flags) {
        long __functionAddress = Functions.MemAllocManaged;
        return callPPI(dptr, bytesize, flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemAllocManaged(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t") long bytesize, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(dptr, 1);
        }
        return ncuMemAllocManaged(memAddress(dptr), bytesize, flags);
    }

    // --- [ cuPointerSetAttribute ] ---

    public static int ncuPointerSetAttribute(long value, int attribute, long ptr) {
        long __functionAddress = Functions.PointerSetAttribute;
        if (CHECKS) {
            check(ptr);
        }
        return callPPI(value, attribute, ptr, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuPointerSetAttribute(@NativeType("void const *") ByteBuffer value, @NativeType("CUpointer_attribute") int attribute, @NativeType("CUdeviceptr") long ptr) {
        return ncuPointerSetAttribute(memAddress(value), attribute, ptr);
    }

    // --- [ cuStreamAttachMemAsync ] ---

    @NativeType("CUresult")
    public static int cuStreamAttachMemAsync(@NativeType("CUstream") long hStream, @NativeType("CUdeviceptr") long dptr, @NativeType("size_t") long length, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.StreamAttachMemAsync;
        if (CHECKS) {
            check(dptr);
        }
        return callPPPI(hStream, dptr, length, flags, __functionAddress);
    }

}