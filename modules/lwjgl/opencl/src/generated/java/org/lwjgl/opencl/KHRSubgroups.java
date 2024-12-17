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
import static org.lwjgl.system.Pointer.*;

public class KHRSubgroups {

    public static final int
        CL_KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE_KHR = 0x2033,
        CL_KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE_KHR    = 0x2034;

    protected KHRSubgroups() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetKernelSubGroupInfoKHR ] ---

    /** {@code cl_int clGetKernelSubGroupInfoKHR(cl_kernel kernel, cl_device_id device, cl_kernel_sub_group_info param_name, size_t input_value_size, void const * input_value, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetKernelSubGroupInfoKHR(long kernel, long device, int param_name, long input_value_size, long input_value, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelSubGroupInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPPPPPPI(kernel, device, param_name, input_value_size, input_value, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetKernelSubGroupInfoKHR(cl_kernel kernel, cl_device_id device, cl_kernel_sub_group_info param_name, size_t input_value_size, void const * input_value, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelSubGroupInfoKHR(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_sub_group_info") int param_name, @NativeType("void const *") ByteBuffer input_value, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelSubGroupInfoKHR(kernel, device, param_name, input_value.remaining(), memAddress(input_value), remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetKernelSubGroupInfoKHR(cl_kernel kernel, cl_device_id device, cl_kernel_sub_group_info param_name, size_t input_value_size, void const * input_value, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelSubGroupInfoKHR(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_sub_group_info") int param_name, @NativeType("void const *") ByteBuffer input_value, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelSubGroupInfoKHR(kernel, device, param_name, input_value.remaining(), memAddress(input_value), Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

}