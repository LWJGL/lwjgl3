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

public class CL20 extends CL12 {

    public static final int CL_VERSION_2_0 = 1;

    public static final int
        CL_INVALID_PIPE_SIZE    = -69,
        CL_INVALID_DEVICE_QUEUE = -70;

    public static final int CL_DEVICE_QUEUE_ON_HOST_PROPERTIES = 0x102A;

    public static final int CL_DEVICE_IMAGE_PITCH_ALIGNMENT = 0x104A;

    public static final int CL_DEVICE_IMAGE_BASE_ADDRESS_ALIGNMENT = 0x104B;

    public static final int CL_DEVICE_MAX_READ_WRITE_IMAGE_ARGS = 0x104C;

    public static final int CL_DEVICE_MAX_GLOBAL_VARIABLE_SIZE = 0x104D;

    public static final int
        CL_DEVICE_QUEUE_ON_DEVICE_PROPERTIES     = 0x104E,
        CL_DEVICE_QUEUE_ON_DEVICE_PREFERRED_SIZE = 0x104F,
        CL_DEVICE_QUEUE_ON_DEVICE_MAX_SIZE       = 0x1050;

    public static final int CL_DEVICE_MAX_ON_DEVICE_QUEUES = 0x1051;

    public static final int CL_DEVICE_MAX_ON_DEVICE_EVENTS = 0x1052;

    public static final int CL_DEVICE_SVM_CAPABILITIES = 0x1053;

    public static final int CL_DEVICE_GLOBAL_VARIABLE_PREFERRED_TOTAL_SIZE = 0x1054;

    public static final int
        CL_DEVICE_MAX_PIPE_ARGS                = 0x1055,
        CL_DEVICE_PIPE_MAX_ACTIVE_RESERVATIONS = 0x1056,
        CL_DEVICE_PIPE_MAX_PACKET_SIZE         = 0x1057;

    public static final int
        CL_DEVICE_PREFERRED_PLATFORM_ATOMIC_ALIGNMENT = 0x1058,
        CL_DEVICE_PREFERRED_GLOBAL_ATOMIC_ALIGNMENT   = 0x1059,
        CL_DEVICE_PREFERRED_LOCAL_ATOMIC_ALIGNMENT    = 0x105A;

    public static final int
        CL_QUEUE_ON_DEVICE         = 1 << 2,
        CL_QUEUE_ON_DEVICE_DEFAULT = 1 << 3;

    public static final int
        CL_DEVICE_SVM_COARSE_GRAIN_BUFFER = 1 << 0,
        CL_DEVICE_SVM_FINE_GRAIN_BUFFER   = 1 << 1,
        CL_DEVICE_SVM_FINE_GRAIN_SYSTEM   = 1 << 2,
        CL_DEVICE_SVM_ATOMICS             = 1 << 3;

    public static final int CL_QUEUE_SIZE = 0x1094;

    public static final int CL_MEM_SVM_FINE_GRAIN_BUFFER = 1 << 10;

    public static final int CL_MEM_SVM_ATOMICS = 1 << 11;

    public static final int CL_MEM_KERNEL_READ_AND_WRITE = 1 << 12;

    public static final int CL_MEM_OBJECT_PIPE = 0x10F7;

    public static final int CL_MEM_USES_SVM_POINTER = 0x1109;

    public static final int
        CL_sRGB  = 0x10BF,
        CL_sRGBx = 0x10C0,
        CL_sRGBA = 0x10C1,
        CL_sBGRA = 0x10C2,
        CL_ABGR  = 0x10C3;

    public static final int CL_PIPE_PACKET_SIZE = 0x1120;

    public static final int CL_PIPE_MAX_PACKETS = 0x1121;

    public static final int
        CL_SAMPLER_MIP_FILTER_MODE = 0x1155,
        CL_SAMPLER_LOD_MIN         = 0x1156,
        CL_SAMPLER_LOD_MAX         = 0x1157;

    public static final int CL_PROGRAM_BUILD_GLOBAL_VARIABLE_TOTAL_SIZE = 0x1185;

    public static final int CL_KERNEL_ARG_TYPE_PIPE = 1 << 3;

    public static final int CL_KERNEL_EXEC_INFO_SVM_PTRS = 0x11B6;

    public static final int CL_KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM = 0x11B7;

    public static final int
        CL_COMMAND_SVM_FREE    = 0x1209,
        CL_COMMAND_SVM_MEMCPY  = 0x120A,
        CL_COMMAND_SVM_MEMFILL = 0x120B,
        CL_COMMAND_SVM_MAP     = 0x120C,
        CL_COMMAND_SVM_UNMAP   = 0x120D;

    public static final int CL_PROFILING_COMMAND_COMPLETE = 0x1284;

    protected CL20() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateCommandQueueWithProperties ] ---

    /** {@code cl_command_queue clCreateCommandQueueWithProperties(cl_context context, cl_device_id device, cl_queue_properties const * properties, cl_int * errcode_ret)} */
    public static long nclCreateCommandQueueWithProperties(long context, long device, long properties, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandQueueWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
        }
        return callPPPPP(context, device, properties, errcode_ret, __functionAddress);
    }

    /** {@code cl_command_queue clCreateCommandQueueWithProperties(cl_context context, cl_device_id device, cl_queue_properties const * properties, cl_int * errcode_ret)} */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueueWithProperties(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_queue_properties const *") @Nullable LongBuffer properties, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateCommandQueueWithProperties(context, device, memAddressSafe(properties), memAddressSafe(errcode_ret));
    }

    // --- [ clCreatePipe ] ---

    /** {@code cl_mem clCreatePipe(cl_context context, cl_mem_flags flags, cl_uint pipe_packet_size, cl_uint pipe_max_packets, cl_pipe_properties const * properties, cl_int * errcode_ret)} */
    public static long nclCreatePipe(long context, long flags, int pipe_packet_size, int pipe_max_packets, long properties, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreatePipe;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPPP(context, flags, pipe_packet_size, pipe_max_packets, properties, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreatePipe(cl_context context, cl_mem_flags flags, cl_uint pipe_packet_size, cl_uint pipe_max_packets, cl_pipe_properties const * properties, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreatePipe(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_uint") int pipe_packet_size, @NativeType("cl_uint") int pipe_max_packets, @NativeType("cl_pipe_properties const *") @Nullable PointerBuffer properties, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreatePipe(context, flags, pipe_packet_size, pipe_max_packets, memAddressSafe(properties), memAddressSafe(errcode_ret));
    }

    // --- [ clGetPipeInfo ] ---

    /** {@code cl_int clGetPipeInfo(cl_mem pipe, cl_pipe_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetPipeInfo(long pipe, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetPipeInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(pipe);
        }
        return callPPPPI(pipe, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetPipeInfo(cl_mem pipe, cl_pipe_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetPipeInfo(@NativeType("cl_mem") long pipe, @NativeType("cl_pipe_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetPipeInfo(pipe, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetPipeInfo(cl_mem pipe, cl_pipe_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetPipeInfo(@NativeType("cl_mem") long pipe, @NativeType("cl_pipe_info") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetPipeInfo(pipe, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clSVMAlloc ] ---

    /** {@code void * clSVMAlloc(cl_context context, cl_svm_mem_flags flags, size_t size, unsigned int alignment)} */
    public static long nclSVMAlloc(long context, long flags, long size, int alignment) {
        long __functionAddress = CL.getICD().clSVMAlloc;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPP(context, flags, size, alignment, __functionAddress);
    }

    /** {@code void * clSVMAlloc(cl_context context, cl_svm_mem_flags flags, size_t size, unsigned int alignment)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer clSVMAlloc(@NativeType("cl_context") long context, @NativeType("cl_svm_mem_flags") long flags, @NativeType("size_t") long size, @NativeType("unsigned int") int alignment) {
        long __result = nclSVMAlloc(context, flags, size, alignment);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ clSVMFree ] ---

    /** {@code void clSVMFree(cl_context context, void * svm_pointer)} */
    public static void nclSVMFree(long context, long svm_pointer) {
        long __functionAddress = CL.getICD().clSVMFree;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        callPPV(context, svm_pointer, __functionAddress);
    }

    /** {@code void clSVMFree(cl_context context, void * svm_pointer)} */
    public static void clSVMFree(@NativeType("cl_context") long context, @NativeType("void *") ByteBuffer svm_pointer) {
        nclSVMFree(context, memAddress(svm_pointer));
    }

    // --- [ clEnqueueSVMFree ] ---

    /** {@code cl_int clEnqueueSVMFree(cl_command_queue command_queue, cl_uint num_svm_pointers, void ** svm_pointers, void (*) (cl_command_queue, cl_uint, void **, void *) pfn_free_func, void * user_data, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueSVMFree(long command_queue, int num_svm_pointers, long svm_pointers, long pfn_free_func, long user_data, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueSVMFree;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPPPI(command_queue, num_svm_pointers, svm_pointers, pfn_free_func, user_data, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueSVMFree(cl_command_queue command_queue, cl_uint num_svm_pointers, void ** svm_pointers, void (*) (cl_command_queue, cl_uint, void **, void *) pfn_free_func, void * user_data, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueSVMFree(@NativeType("cl_command_queue") long command_queue, @NativeType("void **") PointerBuffer svm_pointers, @NativeType("void (*) (cl_command_queue, cl_uint, void **, void *)") @Nullable CLSVMFreeCallbackI pfn_free_func, @NativeType("void *") long user_data, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueSVMFree(command_queue, svm_pointers.remaining(), memAddress(svm_pointers), memAddressSafe(pfn_free_func), user_data, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueSVMMemcpy ] ---

    /** {@code cl_int clEnqueueSVMMemcpy(cl_command_queue command_queue, cl_bool blocking_copy, void * dst_ptr, void const * src_ptr, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueSVMMemcpy(long command_queue, int blocking_copy, long dst_ptr, long src_ptr, long size, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueSVMMemcpy;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPPPI(command_queue, blocking_copy, dst_ptr, src_ptr, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueSVMMemcpy(cl_command_queue command_queue, cl_bool blocking_copy, void * dst_ptr, void const * src_ptr, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueSVMMemcpy(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_bool") boolean blocking_copy, @NativeType("void *") ByteBuffer dst_ptr, @NativeType("void const *") ByteBuffer src_ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(dst_ptr, src_ptr.remaining());
            checkSafe(event, 1);
        }
        return nclEnqueueSVMMemcpy(command_queue, blocking_copy ? 1 : 0, memAddress(dst_ptr), memAddress(src_ptr), src_ptr.remaining(), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueSVMMemFill ] ---

    /** {@code cl_int clEnqueueSVMMemFill(cl_command_queue command_queue, void * svm_ptr, void const * pattern, size_t pattern_size, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueSVMMemFill(long command_queue, long svm_ptr, long pattern, long pattern_size, long size, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueSVMMemFill;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPPPPI(command_queue, svm_ptr, pattern, pattern_size, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueSVMMemFill(cl_command_queue command_queue, void * svm_ptr, void const * pattern, size_t pattern_size, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueSVMMemFill(@NativeType("cl_command_queue") long command_queue, @NativeType("void *") ByteBuffer svm_ptr, @NativeType("void const *") ByteBuffer pattern, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueSVMMemFill(command_queue, memAddress(svm_ptr), memAddress(pattern), pattern.remaining(), svm_ptr.remaining(), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueSVMMap ] ---

    /** {@code cl_int clEnqueueSVMMap(cl_command_queue command_queue, cl_bool blocking_map, cl_map_flags map_flags, void * svm_ptr, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueSVMMap(long command_queue, int blocking_map, long map_flags, long svm_ptr, long size, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueSVMMap;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPJPPPPI(command_queue, blocking_map, map_flags, svm_ptr, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueSVMMap(cl_command_queue command_queue, cl_bool blocking_map, cl_map_flags map_flags, void * svm_ptr, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueSVMMap(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_bool") boolean blocking_map, @NativeType("cl_map_flags") long map_flags, @NativeType("void *") ByteBuffer svm_ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueSVMMap(command_queue, blocking_map ? 1 : 0, map_flags, memAddress(svm_ptr), svm_ptr.remaining(), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueSVMUnmap ] ---

    /** {@code cl_int clEnqueueSVMUnmap(cl_command_queue command_queue, void * svm_ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueSVMUnmap(long command_queue, long svm_ptr, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueSVMUnmap;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPI(command_queue, svm_ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueSVMUnmap(cl_command_queue command_queue, void * svm_ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueSVMUnmap(@NativeType("cl_command_queue") long command_queue, @NativeType("void *") ByteBuffer svm_ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueSVMUnmap(command_queue, memAddress(svm_ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clSetKernelArgSVMPointer ] ---

    /** {@code cl_int clSetKernelArgSVMPointer(cl_kernel kernel, cl_uint arg_index, void const * arg_value)} */
    public static int nclSetKernelArgSVMPointer(long kernel, int arg_index, long arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArgSVMPointer;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(kernel, arg_index, arg_value, __functionAddress);
    }

    /** {@code cl_int clSetKernelArgSVMPointer(cl_kernel kernel, cl_uint arg_index, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArgSVMPointer(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") ByteBuffer arg_value) {
        return nclSetKernelArgSVMPointer(kernel, arg_index, memAddress(arg_value));
    }

    // --- [ clSetKernelExecInfo ] ---

    /** {@code cl_int clSetKernelExecInfo(cl_kernel kernel, cl_kernel_exec_info param_name, size_t param_value_size, void const * param_value)} */
    public static int nclSetKernelExecInfo(long kernel, int param_name, long param_value_size, long param_value) {
        long __functionAddress = CL.getICD().clSetKernelExecInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPPI(kernel, param_name, param_value_size, param_value, __functionAddress);
    }

    /** {@code cl_int clSetKernelExecInfo(cl_kernel kernel, cl_kernel_exec_info param_name, size_t param_value_size, void const * param_value)} */
    @NativeType("cl_int")
    public static int clSetKernelExecInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_kernel_exec_info") int param_name, @NativeType("void const *") ByteBuffer param_value) {
        return nclSetKernelExecInfo(kernel, param_name, param_value.remaining(), memAddress(param_value));
    }

    /** {@code cl_int clSetKernelExecInfo(cl_kernel kernel, cl_kernel_exec_info param_name, size_t param_value_size, void const * param_value)} */
    @NativeType("cl_int")
    public static int clSetKernelExecInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_kernel_exec_info") int param_name, @NativeType("void const *") PointerBuffer param_value) {
        return nclSetKernelExecInfo(kernel, param_name, Integer.toUnsignedLong(param_value.remaining()) << POINTER_SHIFT, memAddress(param_value));
    }

    /** {@code cl_int clSetKernelExecInfo(cl_kernel kernel, cl_kernel_exec_info param_name, size_t param_value_size, void const * param_value)} */
    @NativeType("cl_int")
    public static int clSetKernelExecInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_kernel_exec_info") int param_name, @NativeType("void const *") IntBuffer param_value) {
        return nclSetKernelExecInfo(kernel, param_name, Integer.toUnsignedLong(param_value.remaining()) << 2, memAddress(param_value));
    }

    // --- [ clCreateSamplerWithProperties ] ---

    /** {@code cl_sampler clCreateSamplerWithProperties(cl_context context, cl_sampler_properties const * sampler_properties, cl_int * errcode_ret)} */
    public static long nclCreateSamplerWithProperties(long context, long sampler_properties, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateSamplerWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPP(context, sampler_properties, errcode_ret, __functionAddress);
    }

    /** {@code cl_sampler clCreateSamplerWithProperties(cl_context context, cl_sampler_properties const * sampler_properties, cl_int * errcode_ret)} */
    @NativeType("cl_sampler")
    public static long clCreateSamplerWithProperties(@NativeType("cl_context") long context, @NativeType("cl_sampler_properties const *") @Nullable LongBuffer sampler_properties, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(sampler_properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateSamplerWithProperties(context, memAddressSafe(sampler_properties), memAddressSafe(errcode_ret));
    }

    /** {@code cl_command_queue clCreateCommandQueueWithProperties(cl_context context, cl_device_id device, cl_queue_properties const * properties, cl_int * errcode_ret)} */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueueWithProperties(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_queue_properties const *") long @Nullable [] properties, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandQueueWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPPPP(context, device, properties, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreatePipe(cl_context context, cl_mem_flags flags, cl_uint pipe_packet_size, cl_uint pipe_max_packets, cl_pipe_properties const * properties, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreatePipe(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_uint") int pipe_packet_size, @NativeType("cl_uint") int pipe_max_packets, @NativeType("cl_pipe_properties const *") @Nullable PointerBuffer properties, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreatePipe;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPP(context, flags, pipe_packet_size, pipe_max_packets, memAddressSafe(properties), errcode_ret, __functionAddress);
    }

    /** {@code cl_int clGetPipeInfo(cl_mem pipe, cl_pipe_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetPipeInfo(@NativeType("cl_mem") long pipe, @NativeType("cl_pipe_info") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetPipeInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(pipe);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(pipe, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clSetKernelExecInfo(cl_kernel kernel, cl_kernel_exec_info param_name, size_t param_value_size, void const * param_value)} */
    @NativeType("cl_int")
    public static int clSetKernelExecInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_kernel_exec_info") int param_name, @NativeType("void const *") int[] param_value) {
        long __functionAddress = CL.getICD().clSetKernelExecInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPPI(kernel, param_name, Integer.toUnsignedLong(param_value.length) << 2, param_value, __functionAddress);
    }

    /** {@code cl_sampler clCreateSamplerWithProperties(cl_context context, cl_sampler_properties const * sampler_properties, cl_int * errcode_ret)} */
    @NativeType("cl_sampler")
    public static long clCreateSamplerWithProperties(@NativeType("cl_context") long context, @NativeType("cl_sampler_properties const *") long @Nullable [] sampler_properties, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateSamplerWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(sampler_properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPPP(context, sampler_properties, errcode_ret, __functionAddress);
    }

}