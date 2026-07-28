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

public class KHRUnifiedSVM {

    public static final int CL_PLATFORM_SVM_TYPE_CAPABILITIES_KHR = 0x909;

    public static final int CL_DEVICE_SVM_TYPE_CAPABILITIES_KHR = 0x1077;

    public static final long
        CL_SVM_CAPABILITY_SINGLE_ADDRESS_SPACE_KHR     = 1L << 0,
        CL_SVM_CAPABILITY_SYSTEM_ALLOCATED_KHR         = 1L << 1,
        CL_SVM_CAPABILITY_DEVICE_OWNED_KHR             = 1L << 2,
        CL_SVM_CAPABILITY_DEVICE_UNASSOCIATED_KHR      = 1L << 3,
        CL_SVM_CAPABILITY_CONTEXT_ACCESS_KHR           = 1L << 4,
        CL_SVM_CAPABILITY_HOST_OWNED_KHR               = 1L << 5,
        CL_SVM_CAPABILITY_HOST_READ_KHR                = 1L << 6,
        CL_SVM_CAPABILITY_HOST_WRITE_KHR               = 1L << 7,
        CL_SVM_CAPABILITY_HOST_MAP_KHR                 = 1L << 8,
        CL_SVM_CAPABILITY_DEVICE_READ_KHR              = 1L << 9,
        CL_SVM_CAPABILITY_DEVICE_WRITE_KHR             = 1L << 10,
        CL_SVM_CAPABILITY_DEVICE_ATOMIC_ACCESS_KHR     = 1L << 11,
        CL_SVM_CAPABILITY_CONCURRENT_ACCESS_KHR        = 1L << 12,
        CL_SVM_CAPABILITY_CONCURRENT_ATOMIC_ACCESS_KHR = 1L << 13,
        CL_SVM_CAPABILITY_INDIRECT_ACCESS_KHR          = 1L << 14;

    public static final int
        CL_SVM_ALLOC_ASSOCIATED_DEVICE_HANDLE_KHR = 0x2078,
        CL_SVM_ALLOC_ACCESS_FLAGS_KHR             = 0x2079,
        CL_SVM_ALLOC_ALIGNMENT_KHR                = 0x207A;

    public static final long
        CL_SVM_ALLOC_ACCESS_HOST_NOREAD_KHR    = 1L << 0,
        CL_SVM_ALLOC_ACCESS_HOST_NOWRITE_KHR   = 1L << 1,
        CL_SVM_ALLOC_ACCESS_DEVICE_NOREAD_KHR  = 1L << 8,
        CL_SVM_ALLOC_ACCESS_DEVICE_NOWRITE_KHR = 1L << 9;

    public static final int
        CL_SVM_INFO_TYPE_INDEX_KHR               = 0x2088,
        CL_SVM_INFO_CAPABILITIES_KHR             = 0x2089,
        CL_SVM_INFO_PROPERTIES_KHR               = 0x208A,
        CL_SVM_INFO_ACCESS_FLAGS_KHR             = 0x208B,
        CL_SVM_INFO_BASE_PTR_KHR                 = 0x419B,
        CL_SVM_INFO_SIZE_KHR                     = 0x419C,
        CL_SVM_INFO_ASSOCIATED_DEVICE_HANDLE_KHR = 0x419D;

    public static final int CL_KERNEL_EXEC_INFO_SVM_INDIRECT_ACCESS_KHR = 0x11BB;

    public static final long
        CL_SVM_TYPE_MACRO_COARSE_GRAIN_BUFFER_KHR  = 
        CL_SVM_CAPABILITY_SINGLE_ADDRESS_SPACE_KHR |
        CL_SVM_CAPABILITY_DEVICE_UNASSOCIATED_KHR |
        CL_SVM_CAPABILITY_CONTEXT_ACCESS_KHR      |
        CL_SVM_CAPABILITY_HOST_MAP_KHR            |
        CL_SVM_CAPABILITY_DEVICE_READ_KHR         |
        CL_SVM_CAPABILITY_DEVICE_WRITE_KHR        |
        CL_SVM_CAPABILITY_DEVICE_ATOMIC_ACCESS_KHR,
        CL_SVM_TYPE_MACRO_FINE_GRAIN_BUFFER_KHR    = 
        CL_SVM_CAPABILITY_SINGLE_ADDRESS_SPACE_KHR |
        CL_SVM_CAPABILITY_DEVICE_UNASSOCIATED_KHR  |
        CL_SVM_CAPABILITY_CONTEXT_ACCESS_KHR       |
        CL_SVM_CAPABILITY_HOST_READ_KHR            |
        CL_SVM_CAPABILITY_HOST_WRITE_KHR           |
        CL_SVM_CAPABILITY_HOST_MAP_KHR             |
        CL_SVM_CAPABILITY_DEVICE_READ_KHR          |
        CL_SVM_CAPABILITY_DEVICE_WRITE_KHR         |
        CL_SVM_CAPABILITY_DEVICE_ATOMIC_ACCESS_KHR |
        CL_SVM_CAPABILITY_CONCURRENT_ACCESS_KHR,
        CL_SVM_TYPE_MACRO_DEVICE_KHR               = 
        CL_SVM_CAPABILITY_SINGLE_ADDRESS_SPACE_KHR |
        CL_SVM_CAPABILITY_DEVICE_OWNED_KHR         |
        CL_SVM_CAPABILITY_DEVICE_READ_KHR          |
        CL_SVM_CAPABILITY_DEVICE_WRITE_KHR         |
        CL_SVM_CAPABILITY_DEVICE_ATOMIC_ACCESS_KHR |
        CL_SVM_CAPABILITY_INDIRECT_ACCESS_KHR,
        CL_SVM_TYPE_MACRO_HOST_KHR                 = 
        CL_SVM_CAPABILITY_SINGLE_ADDRESS_SPACE_KHR |
        CL_SVM_CAPABILITY_DEVICE_UNASSOCIATED_KHR  |
        CL_SVM_CAPABILITY_CONTEXT_ACCESS_KHR       |
        CL_SVM_CAPABILITY_HOST_OWNED_KHR           |
        CL_SVM_CAPABILITY_HOST_READ_KHR            |
        CL_SVM_CAPABILITY_HOST_WRITE_KHR           |
        CL_SVM_CAPABILITY_DEVICE_READ_KHR          |
        CL_SVM_CAPABILITY_DEVICE_WRITE_KHR         |
        CL_SVM_CAPABILITY_INDIRECT_ACCESS_KHR,
        CL_SVM_TYPE_MACRO_SINGLE_DEVICE_SHARED_KHR = 
        CL_SVM_CAPABILITY_SINGLE_ADDRESS_SPACE_KHR |
        CL_SVM_CAPABILITY_HOST_READ_KHR            |
        CL_SVM_CAPABILITY_HOST_WRITE_KHR           |
        CL_SVM_CAPABILITY_DEVICE_READ_KHR          |
        CL_SVM_CAPABILITY_DEVICE_WRITE_KHR         |
        CL_SVM_CAPABILITY_INDIRECT_ACCESS_KHR,
        CL_SVM_TYPE_MACRO_SYSTEM_KHR               = 
        CL_SVM_CAPABILITY_SINGLE_ADDRESS_SPACE_KHR |
        CL_SVM_CAPABILITY_SYSTEM_ALLOCATED_KHR     |
        CL_SVM_CAPABILITY_DEVICE_UNASSOCIATED_KHR  |
        CL_SVM_CAPABILITY_CONTEXT_ACCESS_KHR       |
        CL_SVM_CAPABILITY_HOST_READ_KHR            |
        CL_SVM_CAPABILITY_HOST_WRITE_KHR           |
        CL_SVM_CAPABILITY_HOST_MAP_KHR             |
        CL_SVM_CAPABILITY_DEVICE_READ_KHR          |
        CL_SVM_CAPABILITY_DEVICE_WRITE_KHR         |
        CL_SVM_CAPABILITY_DEVICE_ATOMIC_ACCESS_KHR |
        CL_SVM_CAPABILITY_CONCURRENT_ACCESS_KHR    |
        CL_SVM_CAPABILITY_CONCURRENT_ATOMIC_ACCESS_KHR |
        CL_SVM_CAPABILITY_INDIRECT_ACCESS_KHR;

    protected KHRUnifiedSVM() {
        throw new UnsupportedOperationException();
    }

    // --- [ clSVMAllocWithPropertiesKHR ] ---

    /** {@code void * clSVMAllocWithPropertiesKHR(cl_context context, cl_svm_alloc_properties_khr const * properties, cl_uint svm_type_index, size_t size, cl_int * errcode_ret)} */
    public static long nclSVMAllocWithPropertiesKHR(long context, long properties, int svm_type_index, long size, long errcode_ret) {
        long __functionAddress = CL.getICD().clSVMAllocWithPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPP(context, properties, svm_type_index, size, errcode_ret, __functionAddress);
    }

    /** {@code void * clSVMAllocWithPropertiesKHR(cl_context context, cl_svm_alloc_properties_khr const * properties, cl_uint svm_type_index, size_t size, cl_int * errcode_ret)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer clSVMAllocWithPropertiesKHR(@NativeType("cl_context") long context, @NativeType("cl_svm_alloc_properties_khr const *") @Nullable LongBuffer properties, @NativeType("cl_uint") int svm_type_index, @NativeType("size_t") long size, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        long __result = nclSVMAllocWithPropertiesKHR(context, memAddressSafe(properties), svm_type_index, size, memAddressSafe(errcode_ret));
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ clSVMFreeWithPropertiesKHR ] ---

    /** {@code cl_int clSVMFreeWithPropertiesKHR(cl_context context, cl_svm_free_properties_khr const * properties, cl_svm_free_flags_khr flags, void * ptr)} */
    public static int nclSVMFreeWithPropertiesKHR(long context, long properties, long flags, long ptr) {
        long __functionAddress = CL.getICD().clSVMFreeWithPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPJPI(context, properties, flags, ptr, __functionAddress);
    }

    /** {@code cl_int clSVMFreeWithPropertiesKHR(cl_context context, cl_svm_free_properties_khr const * properties, cl_svm_free_flags_khr flags, void * ptr)} */
    @NativeType("cl_int")
    public static int clSVMFreeWithPropertiesKHR(@NativeType("cl_context") long context, @NativeType("cl_svm_free_properties_khr const *") @Nullable LongBuffer properties, @NativeType("cl_svm_free_flags_khr") long flags, @NativeType("void *") ByteBuffer ptr) {
        if (CHECKS) {
            checkNTSafe(properties);
        }
        return nclSVMFreeWithPropertiesKHR(context, memAddressSafe(properties), flags, memAddress(ptr));
    }

    // --- [ clGetSVMPointerInfoKHR ] ---

    /** {@code cl_int clGetSVMPointerInfoKHR(cl_context context, cl_device_id device, void const * ptr, cl_svm_pointer_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetSVMPointerInfoKHR(long context, long device, long ptr, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetSVMPointerInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
        }
        return callPPPPPPI(context, device, ptr, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetSVMPointerInfoKHR(cl_context context, cl_device_id device, void const * ptr, cl_svm_pointer_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetSVMPointerInfoKHR(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_svm_pointer_info_khr") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSVMPointerInfoKHR(context, device, memAddress(ptr), param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetSVMPointerInfoKHR(cl_context context, cl_device_id device, void const * ptr, cl_svm_pointer_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetSVMPointerInfoKHR(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_svm_pointer_info_khr") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSVMPointerInfoKHR(context, device, memAddress(ptr), param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetSVMPointerInfoKHR(cl_context context, cl_device_id device, void const * ptr, cl_svm_pointer_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetSVMPointerInfoKHR(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_svm_pointer_info_khr") int param_name, @NativeType("void *") @Nullable LongBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSVMPointerInfoKHR(context, device, memAddress(ptr), param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetSVMPointerInfoKHR(cl_context context, cl_device_id device, void const * ptr, cl_svm_pointer_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetSVMPointerInfoKHR(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_svm_pointer_info_khr") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSVMPointerInfoKHR(context, device, memAddress(ptr), param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clGetSVMSuggestedTypeIndexKHR ] ---

    /** {@code cl_int clGetSVMSuggestedTypeIndexKHR(cl_context context, cl_svm_capabilities_khr required_capabilities, cl_svm_capabilities_khr desired_capabilities, cl_svm_alloc_properties_khr const * properties, size_t size, cl_uint * suggested_svm_type_index)} */
    public static int nclGetSVMSuggestedTypeIndexKHR(long context, long required_capabilities, long desired_capabilities, long properties, long size, long suggested_svm_type_index) {
        long __functionAddress = CL.getICD().clGetSVMSuggestedTypeIndexKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJJPPPI(context, required_capabilities, desired_capabilities, properties, size, suggested_svm_type_index, __functionAddress);
    }

    /** {@code cl_int clGetSVMSuggestedTypeIndexKHR(cl_context context, cl_svm_capabilities_khr required_capabilities, cl_svm_capabilities_khr desired_capabilities, cl_svm_alloc_properties_khr const * properties, size_t size, cl_uint * suggested_svm_type_index)} */
    @NativeType("cl_int")
    public static int clGetSVMSuggestedTypeIndexKHR(@NativeType("cl_context") long context, @NativeType("cl_svm_capabilities_khr") long required_capabilities, @NativeType("cl_svm_capabilities_khr") long desired_capabilities, @NativeType("cl_svm_alloc_properties_khr const *") @Nullable LongBuffer properties, @NativeType("size_t") long size, @NativeType("cl_uint *") IntBuffer suggested_svm_type_index) {
        if (CHECKS) {
            checkNTSafe(properties);
            check(suggested_svm_type_index, 1);
        }
        return nclGetSVMSuggestedTypeIndexKHR(context, required_capabilities, desired_capabilities, memAddressSafe(properties), size, memAddress(suggested_svm_type_index));
    }

    /** {@code void * clSVMAllocWithPropertiesKHR(cl_context context, cl_svm_alloc_properties_khr const * properties, cl_uint svm_type_index, size_t size, cl_int * errcode_ret)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer clSVMAllocWithPropertiesKHR(@NativeType("cl_context") long context, @NativeType("cl_svm_alloc_properties_khr const *") long @Nullable [] properties, @NativeType("cl_uint") int svm_type_index, @NativeType("size_t") long size, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clSVMAllocWithPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        long __result = callPPPPP(context, properties, svm_type_index, size, errcode_ret, __functionAddress);
        return memByteBufferSafe(__result, (int)size);
    }

    /** {@code cl_int clSVMFreeWithPropertiesKHR(cl_context context, cl_svm_free_properties_khr const * properties, cl_svm_free_flags_khr flags, void * ptr)} */
    @NativeType("cl_int")
    public static int clSVMFreeWithPropertiesKHR(@NativeType("cl_context") long context, @NativeType("cl_svm_free_properties_khr const *") long @Nullable [] properties, @NativeType("cl_svm_free_flags_khr") long flags, @NativeType("void *") ByteBuffer ptr) {
        long __functionAddress = CL.getICD().clSVMFreeWithPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
        }
        return callPPJPI(context, properties, flags, memAddress(ptr), __functionAddress);
    }

    /** {@code cl_int clGetSVMPointerInfoKHR(cl_context context, cl_device_id device, void const * ptr, cl_svm_pointer_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetSVMPointerInfoKHR(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_svm_pointer_info_khr") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetSVMPointerInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPPPI(context, device, memAddress(ptr), param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clGetSVMPointerInfoKHR(cl_context context, cl_device_id device, void const * ptr, cl_svm_pointer_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetSVMPointerInfoKHR(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_svm_pointer_info_khr") int param_name, @NativeType("void *") long @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetSVMPointerInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPPPI(context, device, memAddress(ptr), param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 3, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clGetSVMSuggestedTypeIndexKHR(cl_context context, cl_svm_capabilities_khr required_capabilities, cl_svm_capabilities_khr desired_capabilities, cl_svm_alloc_properties_khr const * properties, size_t size, cl_uint * suggested_svm_type_index)} */
    @NativeType("cl_int")
    public static int clGetSVMSuggestedTypeIndexKHR(@NativeType("cl_context") long context, @NativeType("cl_svm_capabilities_khr") long required_capabilities, @NativeType("cl_svm_capabilities_khr") long desired_capabilities, @NativeType("cl_svm_alloc_properties_khr const *") long @Nullable [] properties, @NativeType("size_t") long size, @NativeType("cl_uint *") int[] suggested_svm_type_index) {
        long __functionAddress = CL.getICD().clGetSVMSuggestedTypeIndexKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            check(suggested_svm_type_index, 1);
        }
        return callPJJPPPI(context, required_capabilities, desired_capabilities, properties, size, suggested_svm_type_index, __functionAddress);
    }

}