/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/arm/cl_arm_import_memory.txt">arm_import_memory</a> extension.
 * 
 * <p>This extension adds a new function that allows for direct memory import into OpenCL via the {@link #clImportMemoryARM ImportMemoryARM} function.</p>
 * 
 * <p>Memory imported through this interface will be mapped into the device's page tables directly, providing zero copy access. It will never fall back to
 * copy operations and aliased buffers, instead producing an error when mapping is not possible.</p>
 * 
 * <p>Types of memory supported for import are specified as additional extension strings.</p>
 */
public class ARMImportMemory {

    /** Default and valid properties name for {@code cl_arm_import_memory}. */
    public static final int CL_IMPORT_TYPE_ARM = 0x40B2;

    /** Host process memory type default value for {@link #CL_IMPORT_TYPE_ARM IMPORT_TYPE_ARM} property */
    public static final int CL_IMPORT_TYPE_HOST_ARM = 0x40B3;

    /** DMA BUF memory type value for {@link #CL_IMPORT_TYPE_ARM IMPORT_TYPE_ARM} property. */
    public static final int CL_IMPORT_TYPE_DMA_BUF_ARM = 0x40B4;

    /** Protected memory property. */
    public static final int CL_IMPORT_TYPE_PROTECTED_ARM = 0x40B5;

    /** Android hardware buffer type value for {@link #CL_IMPORT_TYPE_ARM IMPORT_TYPE_ARM} property. */
    public static final int CL_IMPORT_TYPE_ANDROID_HARDWARE_BUFFER_ARM = 0x41E2;

    /** Data consistency with host property. */
    public static final int CL_IMPORT_DMA_BUF_DATA_CONSISTENCY_WITH_HOST_ARM = 0x41E3;

    /** Index of plane in a multiplanar hardware buffer. */
    public static final int CL_IMPORT_ANDROID_HARDWARE_BUFFER_PLANE_INDEX_ARM = 0x41EF;

    /** Index of layer in a multilayer hardware buffer. */
    public static final int CL_IMPORT_ANDROID_HARDWARE_BUFFER_LAYER_INDEX_ARM = 0x41F0;

    /** Import memory size value to indicate a size for the whole buffer. */
    public static final long CL_IMPORT_MEMORY_WHOLE_ALLOCATION_ARM = -1L;

    protected ARMImportMemory() {
        throw new UnsupportedOperationException();
    }

    // --- [ clImportMemoryARM ] ---

    /** Unsafe version of: {@link #clImportMemoryARM ImportMemoryARM} */
    public static long nclImportMemoryARM(long context, long flags, long properties, long memory, long size, long errcode_ret) {
        long __functionAddress = CL.getICD().clImportMemoryARM;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPPPPP(context, flags, properties, memory, size, errcode_ret, __functionAddress);
    }

    /** @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned. */
    @NativeType("cl_mem")
    public static long clImportMemoryARM(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @Nullable @NativeType("cl_import_properties_arm const *") PointerBuffer properties, @NativeType("void *") ByteBuffer memory, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclImportMemoryARM(context, flags, memAddressSafe(properties), memAddress(memory), memory.remaining(), memAddressSafe(errcode_ret));
    }

    /** Array version of: {@link #clImportMemoryARM ImportMemoryARM} */
    @NativeType("cl_mem")
    public static long clImportMemoryARM(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @Nullable @NativeType("cl_import_properties_arm const *") PointerBuffer properties, @NativeType("void *") ByteBuffer memory, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
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