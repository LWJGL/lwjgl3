/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <strong>khr_suggested_local_work_size</strong> extension.
 * 
 * <p>This extension adds the ability to query a suggested local work group size for a kernel running on a device for a specified global work size and global
 * work offset. The suggested local work group size will match the work group size that would be chosen if the kernel were enqueued with the specified
 * global work size and global work offset and a NULL local work size.</p>
 * 
 * <p>By using the suggested local work group size query an application has greater insight into the local work group size chosen by the OpenCL
 * implementation, and the OpenCL implementation need not re-compute the local work group size if the same kernel is enqueued multiple times with the same
 * parameters.</p>
 */
public class KHRSuggestedLocalWorkSize {

    protected KHRSuggestedLocalWorkSize() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetKernelSuggestedLocalWorkSizeKHR ] ---

    /**
     * Unsafe version of: {@link #clGetKernelSuggestedLocalWorkSizeKHR GetKernelSuggestedLocalWorkSizeKHR}
     *
     * @param work_dim specifies the number of work dimensions in the input global work offset and global work size, and the output suggested local work size
     */
    public static int nclGetKernelSuggestedLocalWorkSizeKHR(long command_queue, long kernel, int work_dim, long global_work_offset, long global_work_size, long suggested_local_work_size) {
        long __functionAddress = CL.getICD().clGetKernelSuggestedLocalWorkSizeKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(kernel);
        }
        return callPPPPPI(command_queue, kernel, work_dim, global_work_offset, global_work_size, suggested_local_work_size, __functionAddress);
    }

    /**
     * Query a suggested local work size for a kernel object.
     * 
     * <p>The returned suggested local work size is expected to match the local work size that would be chosen if the specified kernel object, with the same
     * kernel arguments, were enqueued into the specified command queue with the specified global work size, specified global work offset, and with a {@code NULL}
     * local work size.</p>
     *
     * @param command_queue      specifies the command queue and device for the query
     * @param kernel             the kernel object and kernel arguments for the query. The OpenCL context associated with {@code kernel} and {@code command_queue} must the same.
     * @param global_work_offset can be used to specify an array of at least {@code work_dim} global ID offset values for the query. This is optional and may be {@code NULL} to indicate
     *                           there is no global ID offset.
     */
    @NativeType("cl_int")
    public static int clGetKernelSuggestedLocalWorkSizeKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_kernel") long kernel, @Nullable @NativeType("size_t const *") PointerBuffer global_work_offset, @NativeType("size_t const *") PointerBuffer global_work_size, @NativeType("size_t *") PointerBuffer suggested_local_work_size) {
        if (CHECKS) {
            check(suggested_local_work_size, global_work_size.remaining());
            checkSafe(global_work_offset, global_work_size.remaining());
        }
        return nclGetKernelSuggestedLocalWorkSizeKHR(command_queue, kernel, global_work_size.remaining(), memAddressSafe(global_work_offset), memAddress(global_work_size), memAddress(suggested_local_work_size));
    }

}