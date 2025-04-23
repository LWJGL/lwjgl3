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

public class LOADERInfo {

    public static final int
        CL_ICDL_OCL_VERSION = 1,
        CL_ICDL_VERSION     = 2,
        CL_ICDL_NAME        = 3,
        CL_ICDL_VENDOR      = 4;

    protected LOADERInfo() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetICDLoaderInfoOCLICD ] ---

    /** {@code cl_int clGetICDLoaderInfoOCLICD(cl_icdl_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetICDLoaderInfoOCLICD(int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetICDLoaderInfoOCLICD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetICDLoaderInfoOCLICD(cl_icdl_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetICDLoaderInfoOCLICD(@NativeType("cl_icdl_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetICDLoaderInfoOCLICD(param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetICDLoaderInfoOCLICD(cl_icdl_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetICDLoaderInfoOCLICD(@NativeType("cl_icdl_info") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetICDLoaderInfoOCLICD(param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetICDLoaderInfoOCLICD(cl_icdl_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetICDLoaderInfoOCLICD(@NativeType("cl_icdl_info") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetICDLoaderInfoOCLICD(param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetICDLoaderInfoOCLICD(cl_icdl_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetICDLoaderInfoOCLICD(@NativeType("cl_icdl_info") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetICDLoaderInfoOCLICD;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPI(param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

}