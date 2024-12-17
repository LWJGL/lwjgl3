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

public class INTELUnifiedSharedMemory {

    public static final int
        CL_DEVICE_HOST_MEM_CAPABILITIES_INTEL                 = 0x4190,
        CL_DEVICE_DEVICE_MEM_CAPABILITIES_INTEL               = 0x4191,
        CL_DEVICE_SINGLE_DEVICE_SHARED_MEM_CAPABILITIES_INTEL = 0x4192,
        CL_DEVICE_CROSS_DEVICE_SHARED_MEM_CAPABILITIES_INTEL  = 0x4193,
        CL_DEVICE_SHARED_SYSTEM_MEM_CAPABILITIES_INTEL        = 0x4194;

    public static final int
        CL_UNIFIED_SHARED_MEMORY_ACCESS_INTEL                   = 1 << 0,
        CL_UNIFIED_SHARED_MEMORY_ATOMIC_ACCESS_INTEL            = 1 << 1,
        CL_UNIFIED_SHARED_MEMORY_CONCURRENT_ACCESS_INTEL        = 1 << 2,
        CL_UNIFIED_SHARED_MEMORY_CONCURRENT_ATOMIC_ACCESS_INTEL = 1 << 3;

    public static final int CL_MEM_ALLOC_FLAGS_INTEL = 0x4195;

    public static final int
        CL_MEM_ALLOC_WRITE_COMBINED_INTEL           = 1 << 0,
        CL_MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL = 1 << 1,
        CL_MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL   = 1 << 2;

    public static final int
        CL_MEM_ALLOC_TYPE_INTEL     = 0x419A,
        CL_MEM_ALLOC_BASE_PTR_INTEL = 0x419B,
        CL_MEM_ALLOC_SIZE_INTEL     = 0x419C,
        CL_MEM_ALLOC_DEVICE_INTEL   = 0x419D;

    public static final int
        CL_MEM_TYPE_UNKNOWN_INTEL = 0x4196,
        CL_MEM_TYPE_HOST_INTEL    = 0x4197,
        CL_MEM_TYPE_DEVICE_INTEL  = 0x4198,
        CL_MEM_TYPE_SHARED_INTEL  = 0x4199;

    public static final int
        CL_KERNEL_EXEC_INFO_INDIRECT_HOST_ACCESS_INTEL   = 0x4200,
        CL_KERNEL_EXEC_INFO_INDIRECT_DEVICE_ACCESS_INTEL = 0x4201,
        CL_KERNEL_EXEC_INFO_INDIRECT_SHARED_ACCESS_INTEL = 0x4202;

    public static final int CL_KERNEL_EXEC_INFO_USM_PTRS_INTEL = 0x4203;

    public static final int
        CL_COMMAND_MEMFILL_INTEL    = 0x4204,
        CL_COMMAND_MEMCPY_INTEL     = 0x4205,
        CL_COMMAND_MIGRATEMEM_INTEL = 0x4206,
        CL_COMMAND_MEMADVISE_INTEL  = 0x4207;

    protected INTELUnifiedSharedMemory() {
        throw new UnsupportedOperationException();
    }

    // --- [ clHostMemAllocINTEL ] ---

    /** {@code void * clHostMemAllocINTEL(cl_context context, cl_mem_properties_intel const * properties, size_t size, cl_uint alignment, cl_int * errcode_ret)} */
    public static long nclHostMemAllocINTEL(long context, long properties, long size, int alignment, long errcode_ret) {
        long __functionAddress = CL.getICD().clHostMemAllocINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPP(context, properties, size, alignment, errcode_ret, __functionAddress);
    }

    /** {@code void * clHostMemAllocINTEL(cl_context context, cl_mem_properties_intel const * properties, size_t size, cl_uint alignment, cl_int * errcode_ret)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer clHostMemAllocINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_properties_intel const *") @Nullable LongBuffer properties, @NativeType("size_t") long size, @NativeType("cl_uint") int alignment, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        long __result = nclHostMemAllocINTEL(context, memAddressSafe(properties), size, alignment, memAddressSafe(errcode_ret));
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ clDeviceMemAllocINTEL ] ---

    /** {@code void * clDeviceMemAllocINTEL(cl_context context, cl_device_id device, cl_mem_properties_intel const * properties, size_t size, cl_uint alignment, cl_int * errcode_ret)} */
    public static long nclDeviceMemAllocINTEL(long context, long device, long properties, long size, int alignment, long errcode_ret) {
        long __functionAddress = CL.getICD().clDeviceMemAllocINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
        }
        return callPPPPPP(context, device, properties, size, alignment, errcode_ret, __functionAddress);
    }

    /** {@code void * clDeviceMemAllocINTEL(cl_context context, cl_device_id device, cl_mem_properties_intel const * properties, size_t size, cl_uint alignment, cl_int * errcode_ret)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer clDeviceMemAllocINTEL(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_mem_properties_intel const *") @Nullable LongBuffer properties, @NativeType("size_t") long size, @NativeType("cl_uint") int alignment, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        long __result = nclDeviceMemAllocINTEL(context, device, memAddressSafe(properties), size, alignment, memAddressSafe(errcode_ret));
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ clSharedMemAllocINTEL ] ---

    /** {@code void * clSharedMemAllocINTEL(cl_context context, cl_device_id device, cl_mem_properties_intel const * properties, size_t size, cl_uint alignment, cl_int * errcode_ret)} */
    public static long nclSharedMemAllocINTEL(long context, long device, long properties, long size, int alignment, long errcode_ret) {
        long __functionAddress = CL.getICD().clSharedMemAllocINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPPP(context, device, properties, size, alignment, errcode_ret, __functionAddress);
    }

    /** {@code void * clSharedMemAllocINTEL(cl_context context, cl_device_id device, cl_mem_properties_intel const * properties, size_t size, cl_uint alignment, cl_int * errcode_ret)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer clSharedMemAllocINTEL(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_mem_properties_intel const *") @Nullable LongBuffer properties, @NativeType("size_t") long size, @NativeType("cl_uint") int alignment, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        long __result = nclSharedMemAllocINTEL(context, device, memAddressSafe(properties), size, alignment, memAddressSafe(errcode_ret));
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ clMemFreeINTEL ] ---

    /** {@code cl_int clMemFreeINTEL(cl_context context, void * ptr)} */
    public static int nclMemFreeINTEL(long context, long ptr) {
        long __functionAddress = CL.getICD().clMemFreeINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPI(context, ptr, __functionAddress);
    }

    /** {@code cl_int clMemFreeINTEL(cl_context context, void * ptr)} */
    @NativeType("cl_int")
    public static int clMemFreeINTEL(@NativeType("cl_context") long context, @NativeType("void *") @Nullable ByteBuffer ptr) {
        return nclMemFreeINTEL(context, memAddressSafe(ptr));
    }

    // --- [ clMemBlockingFreeINTEL ] ---

    /** {@code cl_int clMemBlockingFreeINTEL(cl_context context, void * ptr)} */
    public static int nclMemBlockingFreeINTEL(long context, long ptr) {
        long __functionAddress = CL.getICD().clMemBlockingFreeINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPI(context, ptr, __functionAddress);
    }

    /** {@code cl_int clMemBlockingFreeINTEL(cl_context context, void * ptr)} */
    @NativeType("cl_int")
    public static int clMemBlockingFreeINTEL(@NativeType("cl_context") long context, @NativeType("void *") @Nullable ByteBuffer ptr) {
        return nclMemBlockingFreeINTEL(context, memAddressSafe(ptr));
    }

    // --- [ clGetMemAllocInfoINTEL ] ---

    /** {@code cl_int clGetMemAllocInfoINTEL(cl_context context, void const * ptr, cl_mem_info_intel param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetMemAllocInfoINTEL(long context, long ptr, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetMemAllocInfoINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPPI(context, ptr, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetMemAllocInfoINTEL(cl_context context, void const * ptr, cl_mem_info_intel param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetMemAllocInfoINTEL(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_mem_info_intel") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMemAllocInfoINTEL(context, memAddress(ptr), param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetMemAllocInfoINTEL(cl_context context, void const * ptr, cl_mem_info_intel param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetMemAllocInfoINTEL(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_mem_info_intel") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMemAllocInfoINTEL(context, memAddress(ptr), param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetMemAllocInfoINTEL(cl_context context, void const * ptr, cl_mem_info_intel param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetMemAllocInfoINTEL(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_mem_info_intel") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMemAllocInfoINTEL(context, memAddress(ptr), param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clSetKernelArgMemPointerINTEL ] ---

    /** {@code cl_int clSetKernelArgMemPointerINTEL(cl_kernel kernel, cl_uint arg_index, void const * arg_value)} */
    public static int nclSetKernelArgMemPointerINTEL(long kernel, int arg_index, long arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArgMemPointerINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(kernel, arg_index, arg_value, __functionAddress);
    }

    /** {@code cl_int clSetKernelArgMemPointerINTEL(cl_kernel kernel, cl_uint arg_index, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") ByteBuffer arg_value) {
        return nclSetKernelArgMemPointerINTEL(kernel, arg_index, memAddress(arg_value));
    }

    /** {@code cl_int clSetKernelArgMemPointerINTEL(cl_kernel kernel, cl_uint arg_index, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") ShortBuffer arg_value) {
        return nclSetKernelArgMemPointerINTEL(kernel, arg_index, memAddress(arg_value));
    }

    /** {@code cl_int clSetKernelArgMemPointerINTEL(cl_kernel kernel, cl_uint arg_index, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") IntBuffer arg_value) {
        return nclSetKernelArgMemPointerINTEL(kernel, arg_index, memAddress(arg_value));
    }

    /** {@code cl_int clSetKernelArgMemPointerINTEL(cl_kernel kernel, cl_uint arg_index, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") LongBuffer arg_value) {
        return nclSetKernelArgMemPointerINTEL(kernel, arg_index, memAddress(arg_value));
    }

    /** {@code cl_int clSetKernelArgMemPointerINTEL(cl_kernel kernel, cl_uint arg_index, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") FloatBuffer arg_value) {
        return nclSetKernelArgMemPointerINTEL(kernel, arg_index, memAddress(arg_value));
    }

    /** {@code cl_int clSetKernelArgMemPointerINTEL(cl_kernel kernel, cl_uint arg_index, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") DoubleBuffer arg_value) {
        return nclSetKernelArgMemPointerINTEL(kernel, arg_index, memAddress(arg_value));
    }

    /** {@code cl_int clSetKernelArgMemPointerINTEL(cl_kernel kernel, cl_uint arg_index, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") PointerBuffer arg_value) {
        return nclSetKernelArgMemPointerINTEL(kernel, arg_index, memAddress(arg_value));
    }

    // --- [ clEnqueueMemFillINTEL ] ---

    /** {@code cl_int clEnqueueMemFillINTEL(cl_command_queue command_queue, void * dst_ptr, void const * pattern, size_t pattern_size, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueMemFillINTEL(long command_queue, long dst_ptr, long pattern, long pattern_size, long size, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueMemFillINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPPPPI(command_queue, dst_ptr, pattern, pattern_size, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueMemFillINTEL(cl_command_queue command_queue, void * dst_ptr, void const * pattern, size_t pattern_size, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueMemFillINTEL(@NativeType("cl_command_queue") long command_queue, @NativeType("void *") ByteBuffer dst_ptr, @NativeType("void const *") ByteBuffer pattern, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueMemFillINTEL(command_queue, memAddress(dst_ptr), memAddress(pattern), pattern.remaining(), dst_ptr.remaining(), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueMemcpyINTEL ] ---

    /** {@code cl_int clEnqueueMemcpyINTEL(cl_command_queue command_queue, cl_bool blocking, void * dst_ptr, void const * src_ptr, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueMemcpyINTEL(long command_queue, int blocking, long dst_ptr, long src_ptr, long size, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueMemcpyINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPPPI(command_queue, blocking, dst_ptr, src_ptr, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueMemcpyINTEL(cl_command_queue command_queue, cl_bool blocking, void * dst_ptr, void const * src_ptr, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueMemcpyINTEL(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_bool") boolean blocking, @NativeType("void *") ByteBuffer dst_ptr, @NativeType("void const *") ByteBuffer src_ptr, @NativeType("size_t") long size, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(dst_ptr, size);
            check(src_ptr, size);
            checkSafe(event, 1);
        }
        return nclEnqueueMemcpyINTEL(command_queue, blocking ? 1 : 0, memAddress(dst_ptr), memAddress(src_ptr), size, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueMigrateMemINTEL ] ---

    /** {@code cl_int clEnqueueMigrateMemINTEL(cl_command_queue command_queue, void const * ptr, size_t size, cl_mem_migration_flags flags, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueMigrateMemINTEL(long command_queue, long ptr, long size, long flags, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueMigrateMemINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPJPPI(command_queue, ptr, size, flags, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueMigrateMemINTEL(cl_command_queue command_queue, void const * ptr, size_t size, cl_mem_migration_flags flags, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueMigrateMemINTEL(@NativeType("cl_command_queue") long command_queue, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_mem_migration_flags") long flags, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueMigrateMemINTEL(command_queue, memAddress(ptr), ptr.remaining(), flags, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueMemAdviseINTEL ] ---

    /** {@code cl_int clEnqueueMemAdviseINTEL(cl_command_queue command_queue, void const * ptr, size_t size, cl_mem_advice_intel advice, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueMemAdviseINTEL(long command_queue, long ptr, long size, long advice, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueMemAdviseINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPJPPI(command_queue, ptr, size, advice, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueMemAdviseINTEL(cl_command_queue command_queue, void const * ptr, size_t size, cl_mem_advice_intel advice, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueMemAdviseINTEL(@NativeType("cl_command_queue") long command_queue, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_mem_advice_intel") long advice, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueMemAdviseINTEL(command_queue, memAddress(ptr), ptr.remaining(), advice, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code void * clHostMemAllocINTEL(cl_context context, cl_mem_properties_intel const * properties, size_t size, cl_uint alignment, cl_int * errcode_ret)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer clHostMemAllocINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_properties_intel const *") long @Nullable [] properties, @NativeType("size_t") long size, @NativeType("cl_uint") int alignment, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clHostMemAllocINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        long __result = callPPPPP(context, properties, size, alignment, errcode_ret, __functionAddress);
        return memByteBufferSafe(__result, (int)size);
    }

    /** {@code void * clDeviceMemAllocINTEL(cl_context context, cl_device_id device, cl_mem_properties_intel const * properties, size_t size, cl_uint alignment, cl_int * errcode_ret)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer clDeviceMemAllocINTEL(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_mem_properties_intel const *") long @Nullable [] properties, @NativeType("size_t") long size, @NativeType("cl_uint") int alignment, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clDeviceMemAllocINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        long __result = callPPPPPP(context, device, properties, size, alignment, errcode_ret, __functionAddress);
        return memByteBufferSafe(__result, (int)size);
    }

    /** {@code void * clSharedMemAllocINTEL(cl_context context, cl_device_id device, cl_mem_properties_intel const * properties, size_t size, cl_uint alignment, cl_int * errcode_ret)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer clSharedMemAllocINTEL(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_mem_properties_intel const *") long @Nullable [] properties, @NativeType("size_t") long size, @NativeType("cl_uint") int alignment, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clSharedMemAllocINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        long __result = callPPPPPP(context, device, properties, size, alignment, errcode_ret, __functionAddress);
        return memByteBufferSafe(__result, (int)size);
    }

    /** {@code cl_int clGetMemAllocInfoINTEL(cl_context context, void const * ptr, cl_mem_info_intel param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetMemAllocInfoINTEL(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_mem_info_intel") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetMemAllocInfoINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPPI(context, memAddress(ptr), param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clSetKernelArgMemPointerINTEL(cl_kernel kernel, cl_uint arg_index, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") short[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArgMemPointerINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(kernel, arg_index, arg_value, __functionAddress);
    }

    /** {@code cl_int clSetKernelArgMemPointerINTEL(cl_kernel kernel, cl_uint arg_index, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") int[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArgMemPointerINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(kernel, arg_index, arg_value, __functionAddress);
    }

    /** {@code cl_int clSetKernelArgMemPointerINTEL(cl_kernel kernel, cl_uint arg_index, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") long[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArgMemPointerINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(kernel, arg_index, arg_value, __functionAddress);
    }

    /** {@code cl_int clSetKernelArgMemPointerINTEL(cl_kernel kernel, cl_uint arg_index, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") float[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArgMemPointerINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(kernel, arg_index, arg_value, __functionAddress);
    }

    /** {@code cl_int clSetKernelArgMemPointerINTEL(cl_kernel kernel, cl_uint arg_index, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") double[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArgMemPointerINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(kernel, arg_index, arg_value, __functionAddress);
    }

}