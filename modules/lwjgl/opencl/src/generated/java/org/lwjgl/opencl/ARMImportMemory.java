/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ARMImportMemory {

    public static final int CL_IMPORT_TYPE_ARM = 0x40B2;

    public static final int CL_IMPORT_TYPE_HOST_ARM = 0x40B3;

    public static final int CL_IMPORT_TYPE_DMA_BUF_ARM = 0x40B4;

    public static final int CL_IMPORT_TYPE_PROTECTED_ARM = 0x40B5;

    public static final int CL_IMPORT_TYPE_ANDROID_HARDWARE_BUFFER_ARM = 0x41E2;

    public static final int CL_IMPORT_DMA_BUF_DATA_CONSISTENCY_WITH_HOST_ARM = 0x41E3;

    public static final int CL_IMPORT_ANDROID_HARDWARE_BUFFER_PLANE_INDEX_ARM = 0x41EF;

    public static final int CL_IMPORT_ANDROID_HARDWARE_BUFFER_LAYER_INDEX_ARM = 0x41F0;

    public static final long CL_IMPORT_MEMORY_WHOLE_ALLOCATION_ARM = -1L;

    protected ARMImportMemory() {
        throw new UnsupportedOperationException();
    }

    // --- [ clImportMemoryARM ] ---

    /** {@code cl_mem clImportMemoryARM(cl_context context, cl_mem_flags flags, cl_import_properties_arm const * properties, void * memory, size_t size, cl_int * errcode_ret)} */
    public static long nclImportMemoryARM(long context, long flags, long properties, long memory, long size, long errcode_ret) {
        long __functionAddress = CL.getICD().clImportMemoryARM;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPPPPP(context, flags, properties, memory, size, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clImportMemoryARM(cl_context context, cl_mem_flags flags, cl_import_properties_arm const * properties, void * memory, size_t size, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clImportMemoryARM(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_import_properties_arm const *") @Nullable PointerBuffer properties, @NativeType("void *") ByteBuffer memory, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclImportMemoryARM(context, flags, memAddressSafe(properties), memAddress(memory), memory.remaining(), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clImportMemoryARM(cl_context context, cl_mem_flags flags, cl_import_properties_arm const * properties, void * memory, size_t size, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clImportMemoryARM(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_import_properties_arm const *") @Nullable PointerBuffer properties, @NativeType("void *") ByteBuffer memory, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clImportMemoryARM;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPP(context, flags, memAddressSafe(properties), memAddress(memory), (long)memory.remaining(), errcode_ret, __functionAddress);
    }

}