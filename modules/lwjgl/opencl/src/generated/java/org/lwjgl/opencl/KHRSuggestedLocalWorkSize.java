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

public class KHRSuggestedLocalWorkSize {

    protected KHRSuggestedLocalWorkSize() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetKernelSuggestedLocalWorkSizeKHR ] ---

    /** {@code cl_int clGetKernelSuggestedLocalWorkSizeKHR(cl_command_queue command_queue, cl_kernel kernel, cl_uint work_dim, size_t const * global_work_offset, size_t const * global_work_size, size_t * suggested_local_work_size)} */
    public static int nclGetKernelSuggestedLocalWorkSizeKHR(long command_queue, long kernel, int work_dim, long global_work_offset, long global_work_size, long suggested_local_work_size) {
        long __functionAddress = CL.getICD().clGetKernelSuggestedLocalWorkSizeKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(kernel);
        }
        return callPPPPPI(command_queue, kernel, work_dim, global_work_offset, global_work_size, suggested_local_work_size, __functionAddress);
    }

    /** {@code cl_int clGetKernelSuggestedLocalWorkSizeKHR(cl_command_queue command_queue, cl_kernel kernel, cl_uint work_dim, size_t const * global_work_offset, size_t const * global_work_size, size_t * suggested_local_work_size)} */
    @NativeType("cl_int")
    public static int clGetKernelSuggestedLocalWorkSizeKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_kernel") long kernel, @NativeType("size_t const *") @Nullable PointerBuffer global_work_offset, @NativeType("size_t const *") PointerBuffer global_work_size, @NativeType("size_t *") PointerBuffer suggested_local_work_size) {
        if (CHECKS) {
            check(suggested_local_work_size, global_work_size.remaining());
            checkSafe(global_work_offset, global_work_size.remaining());
        }
        return nclGetKernelSuggestedLocalWorkSizeKHR(command_queue, kernel, global_work_size.remaining(), memAddressSafe(global_work_offset), memAddress(global_work_size), memAddress(suggested_local_work_size));
    }

}