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

public class CL21 extends CL20 {

    public static final int CL_VERSION_2_1 = 1;

    public static final int CL_PLATFORM_HOST_TIMER_RESOLUTION = 0x905;

    public static final int CL_DEVICE_IL_VERSION = 0x105B;

    public static final int CL_DEVICE_MAX_NUM_SUB_GROUPS = 0x105C;

    public static final int CL_DEVICE_SUB_GROUP_INDEPENDENT_FORWARD_PROGRESS = 0x105D;

    public static final int CL_QUEUE_DEVICE_DEFAULT = 0x1095;

    public static final int CL_UNORM_INT_101010_2 = 0x10E0;

    public static final int CL_PROGRAM_IL = 0x1169;

    public static final int CL_KERNEL_MAX_NUM_SUB_GROUPS = 0x11B9;

    public static final int CL_KERNEL_COMPILE_NUM_SUB_GROUPS = 0x11BA;

    public static final int CL_KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE = 0x2033;

    public static final int CL_KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE = 0x2034;

    public static final int CL_KERNEL_LOCAL_SIZE_FOR_SUB_GROUP_COUNT = 0x2034;

    protected CL21() {
        throw new UnsupportedOperationException();
    }

    // --- [ clSetDefaultDeviceCommandQueue ] ---

    /** {@code cl_int clSetDefaultDeviceCommandQueue(cl_context context, cl_device_id device, cl_command_queue command_queue)} */
    @NativeType("cl_int")
    public static int clSetDefaultDeviceCommandQueue(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_command_queue") long command_queue) {
        long __functionAddress = CL.getICD().clSetDefaultDeviceCommandQueue;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
            check(command_queue);
        }
        return callPPPI(context, device, command_queue, __functionAddress);
    }

    // --- [ clGetDeviceAndHostTimer ] ---

    /** {@code cl_int clGetDeviceAndHostTimer(cl_device_id device, cl_ulong * device_timestamp, cl_ulong * host_timestamp)} */
    public static int nclGetDeviceAndHostTimer(long device, long device_timestamp, long host_timestamp) {
        long __functionAddress = CL.getICD().clGetDeviceAndHostTimer;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPPPI(device, device_timestamp, host_timestamp, __functionAddress);
    }

    /** {@code cl_int clGetDeviceAndHostTimer(cl_device_id device, cl_ulong * device_timestamp, cl_ulong * host_timestamp)} */
    @NativeType("cl_int")
    public static int clGetDeviceAndHostTimer(@NativeType("cl_device_id") long device, @NativeType("cl_ulong *") LongBuffer device_timestamp, @NativeType("cl_ulong *") LongBuffer host_timestamp) {
        if (CHECKS) {
            check(device_timestamp, 1);
            check(host_timestamp, 1);
        }
        return nclGetDeviceAndHostTimer(device, memAddress(device_timestamp), memAddress(host_timestamp));
    }

    // --- [ clGetHostTimer ] ---

    /** {@code cl_int clGetHostTimer(cl_device_id device, cl_ulong * host_timestamp)} */
    public static int nclGetHostTimer(long device, long host_timestamp) {
        long __functionAddress = CL.getICD().clGetHostTimer;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPPI(device, host_timestamp, __functionAddress);
    }

    /** {@code cl_int clGetHostTimer(cl_device_id device, cl_ulong * host_timestamp)} */
    @NativeType("cl_int")
    public static int clGetHostTimer(@NativeType("cl_device_id") long device, @NativeType("cl_ulong *") LongBuffer host_timestamp) {
        if (CHECKS) {
            check(host_timestamp, 1);
        }
        return nclGetHostTimer(device, memAddress(host_timestamp));
    }

    // --- [ clCreateProgramWithIL ] ---

    /** {@code cl_program clCreateProgramWithIL(cl_context context, void const * il, size_t length, cl_int * errcode_ret)} */
    public static long nclCreateProgramWithIL(long context, long il, long length, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithIL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPP(context, il, length, errcode_ret, __functionAddress);
    }

    /** {@code cl_program clCreateProgramWithIL(cl_context context, void const * il, size_t length, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithIL(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer il, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateProgramWithIL(context, memAddress(il), il.remaining(), memAddressSafe(errcode_ret));
    }

    // --- [ clCloneKernel ] ---

    /** {@code cl_kernel clCloneKernel(cl_kernel source_kernel, cl_int * errcode_ret)} */
    public static long nclCloneKernel(long source_kernel, long errcode_ret) {
        long __functionAddress = CL.getICD().clCloneKernel;
        if (CHECKS) {
            check(__functionAddress);
            check(source_kernel);
        }
        return callPPP(source_kernel, errcode_ret, __functionAddress);
    }

    /** {@code cl_kernel clCloneKernel(cl_kernel source_kernel, cl_int * errcode_ret)} */
    @NativeType("cl_kernel")
    public static long clCloneKernel(@NativeType("cl_kernel") long source_kernel, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCloneKernel(source_kernel, memAddressSafe(errcode_ret));
    }

    // --- [ clGetKernelSubGroupInfo ] ---

    /** {@code cl_int clGetKernelSubGroupInfo(cl_kernel kernel, cl_device_id device, cl_kernel_sub_group_info param_name, size_t input_value_size, void const * input_value, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetKernelSubGroupInfo(long kernel, long device, int param_name, long input_value_size, long input_value, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelSubGroupInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPPPPPPI(kernel, device, param_name, input_value_size, input_value, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetKernelSubGroupInfo(cl_kernel kernel, cl_device_id device, cl_kernel_sub_group_info param_name, size_t input_value_size, void const * input_value, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelSubGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_sub_group_info") int param_name, @NativeType("void const *") @Nullable ByteBuffer input_value, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelSubGroupInfo(kernel, device, param_name, remainingSafe(input_value), memAddressSafe(input_value), remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetKernelSubGroupInfo(cl_kernel kernel, cl_device_id device, cl_kernel_sub_group_info param_name, size_t input_value_size, void const * input_value, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelSubGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_sub_group_info") int param_name, @NativeType("void const *") @Nullable ByteBuffer input_value, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelSubGroupInfo(kernel, device, param_name, remainingSafe(input_value), memAddressSafe(input_value), Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clEnqueueSVMMigrateMem ] ---

    /** {@code cl_int clEnqueueSVMMigrateMem(cl_command_queue command_queue, cl_uint num_svm_pointers, void const ** svm_pointers, size_t const * sizes, cl_mem_migration_flags flags, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueSVMMigrateMem(long command_queue, int num_svm_pointers, long svm_pointers, long sizes, long flags, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueSVMMigrateMem;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPJPPI(command_queue, num_svm_pointers, svm_pointers, sizes, flags, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueSVMMigrateMem(cl_command_queue command_queue, cl_uint num_svm_pointers, void const ** svm_pointers, size_t const * sizes, cl_mem_migration_flags flags, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueSVMMigrateMem(@NativeType("cl_command_queue") long command_queue, @NativeType("void const **") PointerBuffer svm_pointers, @NativeType("size_t const *") @Nullable PointerBuffer sizes, @NativeType("cl_mem_migration_flags") long flags, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(sizes, svm_pointers.remaining());
            checkSafe(event, 1);
        }
        return nclEnqueueSVMMigrateMem(command_queue, svm_pointers.remaining(), memAddress(svm_pointers), memAddressSafe(sizes), flags, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clGetDeviceAndHostTimer(cl_device_id device, cl_ulong * device_timestamp, cl_ulong * host_timestamp)} */
    @NativeType("cl_int")
    public static int clGetDeviceAndHostTimer(@NativeType("cl_device_id") long device, @NativeType("cl_ulong *") long[] device_timestamp, @NativeType("cl_ulong *") long[] host_timestamp) {
        long __functionAddress = CL.getICD().clGetDeviceAndHostTimer;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            check(device_timestamp, 1);
            check(host_timestamp, 1);
        }
        return callPPPI(device, device_timestamp, host_timestamp, __functionAddress);
    }

    /** {@code cl_int clGetHostTimer(cl_device_id device, cl_ulong * host_timestamp)} */
    @NativeType("cl_int")
    public static int clGetHostTimer(@NativeType("cl_device_id") long device, @NativeType("cl_ulong *") long[] host_timestamp) {
        long __functionAddress = CL.getICD().clGetHostTimer;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            check(host_timestamp, 1);
        }
        return callPPI(device, host_timestamp, __functionAddress);
    }

    /** {@code cl_program clCreateProgramWithIL(cl_context context, void const * il, size_t length, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithIL(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer il, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithIL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPPPPP(context, memAddress(il), (long)il.remaining(), errcode_ret, __functionAddress);
    }

    /** {@code cl_kernel clCloneKernel(cl_kernel source_kernel, cl_int * errcode_ret)} */
    @NativeType("cl_kernel")
    public static long clCloneKernel(@NativeType("cl_kernel") long source_kernel, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCloneKernel;
        if (CHECKS) {
            check(__functionAddress);
            check(source_kernel);
            checkSafe(errcode_ret, 1);
        }
        return callPPP(source_kernel, errcode_ret, __functionAddress);
    }

}