/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class CL31 extends CL30 {

    public static final int CL_DEVICE_MAX_WORK_GROUP_SIZES = 0x1005;

    public static final int
        CL_UUID_SIZE = 16,
        CL_LUID_SIZE = 8;

    public static final int
        CL_DEVICE_UUID       = 0x106A,
        CL_DRIVER_UUID       = 0x106B,
        CL_DEVICE_LUID_VALID = 0x106C,
        CL_DEVICE_LUID       = 0x106D,
        CL_DEVICE_NODE_MASK  = 0x106E;

    public static final int
        CL_DEVICE_INTEGER_DOT_PRODUCT_CAPABILITIES                          = 0x1073,
        CL_DEVICE_INTEGER_DOT_PRODUCT_ACCELERATION_PROPERTIES_8BIT          = 0x1074,
        CL_DEVICE_INTEGER_DOT_PRODUCT_ACCELERATION_PROPERTIES_4x8BIT_PACKED = 0x1075;

    public static final long
        CL_DEVICE_INTEGER_DOT_PRODUCT_INPUT_4x8BIT_PACKED = (1L << 0),
        CL_DEVICE_INTEGER_DOT_PRODUCT_INPUT_4x8BIT        = (1L << 1);

    public static final int
        CL_DEVICE_SPIRV_EXTENDED_INSTRUCTION_SETS = 0x12B9,
        CL_DEVICE_SPIRV_EXTENSIONS                = 0x12BA,
        CL_DEVICE_SPIRV_CAPABILITIES              = 0x12BB;

    protected CL31() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetKernelSuggestedLocalWorkSize ] ---

    /** {@code cl_int clGetKernelSuggestedLocalWorkSize(cl_command_queue command_queue, cl_kernel kernel, cl_uint work_dim, size_t const * global_work_offset, size_t const * global_work_size, size_t * suggested_local_work_size)} */
    public static int nclGetKernelSuggestedLocalWorkSize(long command_queue, long kernel, int work_dim, long global_work_offset, long global_work_size, long suggested_local_work_size) {
        long __functionAddress = CL.getICD().clGetKernelSuggestedLocalWorkSize;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(kernel);
        }
        return callPPPPPI(command_queue, kernel, work_dim, global_work_offset, global_work_size, suggested_local_work_size, __functionAddress);
    }

    /** {@code cl_int clGetKernelSuggestedLocalWorkSize(cl_command_queue command_queue, cl_kernel kernel, cl_uint work_dim, size_t const * global_work_offset, size_t const * global_work_size, size_t * suggested_local_work_size)} */
    @NativeType("cl_int")
    public static int clGetKernelSuggestedLocalWorkSize(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_kernel") long kernel, @NativeType("size_t const *") @Nullable PointerBuffer global_work_offset, @NativeType("size_t const *") PointerBuffer global_work_size, @NativeType("size_t *") PointerBuffer suggested_local_work_size) {
        if (CHECKS) {
            check(suggested_local_work_size, global_work_size.remaining());
            checkSafe(global_work_offset, global_work_size.remaining());
        }
        return nclGetKernelSuggestedLocalWorkSize(command_queue, kernel, global_work_size.remaining(), memAddressSafe(global_work_offset), memAddress(global_work_size), memAddress(suggested_local_work_size));
    }

}