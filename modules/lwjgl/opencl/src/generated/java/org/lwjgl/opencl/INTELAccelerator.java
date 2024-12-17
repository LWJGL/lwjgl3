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

public class INTELAccelerator {

    public static final int
        CL_ACCELERATOR_DESCRIPTOR_INTEL      = 0x4090,
        CL_ACCELERATOR_REFERENCE_COUNT_INTEL = 0x4091,
        CL_ACCELERATOR_CONTEXT_INTEL         = 0x4092,
        CL_ACCELERATOR_TYPE_INTEL            = 0x4093;

    public static final int
        CL_INVALID_ACCELERATOR_INTEL            = -1094,
        CL_INVALID_ACCELERATOR_TYPE_INTEL       = -1095,
        CL_INVALID_ACCELERATOR_DESCRIPTOR_INTEL = -1096,
        CL_ACCELERATOR_TYPE_NOT_SUPPORTED_INTEL = -1097;

    protected INTELAccelerator() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateAcceleratorINTEL ] ---

    /** {@code cl_accelerator_intel clCreateAcceleratorINTEL(cl_context context, cl_accelerator_type_intel accelerator_type, size_t descriptor_size, void const * descriptor, cl_int * errcode_ret)} */
    public static long nclCreateAcceleratorINTEL(long context, int accelerator_type, long descriptor_size, long descriptor, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateAcceleratorINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPP(context, accelerator_type, descriptor_size, descriptor, errcode_ret, __functionAddress);
    }

    /** {@code cl_accelerator_intel clCreateAcceleratorINTEL(cl_context context, cl_accelerator_type_intel accelerator_type, size_t descriptor_size, void const * descriptor, cl_int * errcode_ret)} */
    @NativeType("cl_accelerator_intel")
    public static long clCreateAcceleratorINTEL(@NativeType("cl_context") long context, @NativeType("cl_accelerator_type_intel") int accelerator_type, @NativeType("void const *") ByteBuffer descriptor, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateAcceleratorINTEL(context, accelerator_type, descriptor.remaining(), memAddress(descriptor), memAddressSafe(errcode_ret));
    }

    // --- [ clRetainAcceleratorINTEL ] ---

    /** {@code cl_int clRetainAcceleratorINTEL(cl_accelerator_intel accelerator)} */
    @NativeType("cl_int")
    public static int clRetainAcceleratorINTEL(@NativeType("cl_accelerator_intel") long accelerator) {
        long __functionAddress = CL.getICD().clRetainAcceleratorINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(accelerator);
        }
        return callPI(accelerator, __functionAddress);
    }

    // --- [ clReleaseAcceleratorINTEL ] ---

    /** {@code cl_int clReleaseAcceleratorINTEL(cl_accelerator_intel accelerator)} */
    @NativeType("cl_int")
    public static int clReleaseAcceleratorINTEL(@NativeType("cl_accelerator_intel") long accelerator) {
        long __functionAddress = CL.getICD().clReleaseAcceleratorINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(accelerator);
        }
        return callPI(accelerator, __functionAddress);
    }

    // --- [ clGetAcceleratorInfoINTEL ] ---

    /** {@code cl_int clGetAcceleratorInfoINTEL(cl_accelerator_intel accelerator, cl_accelerator_info_intel param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetAcceleratorInfoINTEL(long accelerator, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetAcceleratorInfoINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(accelerator);
        }
        return callPPPPI(accelerator, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetAcceleratorInfoINTEL(cl_accelerator_intel accelerator, cl_accelerator_info_intel param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetAcceleratorInfoINTEL(@NativeType("cl_accelerator_intel") long accelerator, @NativeType("cl_accelerator_info_intel") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetAcceleratorInfoINTEL(accelerator, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetAcceleratorInfoINTEL(cl_accelerator_intel accelerator, cl_accelerator_info_intel param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetAcceleratorInfoINTEL(@NativeType("cl_accelerator_intel") long accelerator, @NativeType("cl_accelerator_info_intel") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetAcceleratorInfoINTEL(accelerator, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetAcceleratorInfoINTEL(cl_accelerator_intel accelerator, cl_accelerator_info_intel param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetAcceleratorInfoINTEL(@NativeType("cl_accelerator_intel") long accelerator, @NativeType("cl_accelerator_info_intel") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetAcceleratorInfoINTEL(accelerator, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_accelerator_intel clCreateAcceleratorINTEL(cl_context context, cl_accelerator_type_intel accelerator_type, size_t descriptor_size, void const * descriptor, cl_int * errcode_ret)} */
    @NativeType("cl_accelerator_intel")
    public static long clCreateAcceleratorINTEL(@NativeType("cl_context") long context, @NativeType("cl_accelerator_type_intel") int accelerator_type, @NativeType("void const *") ByteBuffer descriptor, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateAcceleratorINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPPPPP(context, accelerator_type, (long)descriptor.remaining(), memAddress(descriptor), errcode_ret, __functionAddress);
    }

    /** {@code cl_int clGetAcceleratorInfoINTEL(cl_accelerator_intel accelerator, cl_accelerator_info_intel param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetAcceleratorInfoINTEL(@NativeType("cl_accelerator_intel") long accelerator, @NativeType("cl_accelerator_info_intel") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetAcceleratorInfoINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(accelerator);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(accelerator, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

}