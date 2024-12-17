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

public class QCOMEXTHostPtr {

    public static final int
        CL_DEVICE_EXT_MEM_PADDING_IN_BYTES_QCOM = 0x40A0,
        CL_DEVICE_PAGE_SIZE_QCOM                = 0x40A1;

    public static final int CL_MEM_EXT_HOST_PTR_QCOM = 1 << 29;

    public static final int
        CL_MEM_HOST_UNCACHED_QCOM        = 0x40A4,
        CL_MEM_HOST_WRITEBACK_QCOM       = 0x40A5,
        CL_MEM_HOST_WRITETHROUGH_QCOM    = 0x40A6,
        CL_MEM_HOST_WRITE_COMBINING_QCOM = 0x40A7;

    public static final int
        CL_IMAGE_ROW_ALIGNMENT_QCOM   = 0x40A2,
        CL_IMAGE_SLICE_ALIGNMENT_QCOM = 0x40A3;

    protected QCOMEXTHostPtr() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetDeviceImageInfoQCOM ] ---

    /** {@code cl_int clGetDeviceImageInfoQCOM(cl_device_id device, size_t image_width, size_t image_height, cl_image_format const * image_format, cl_image_pitch_info_qcom param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetDeviceImageInfoQCOM(long device, long image_width, long image_height, long image_format, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetDeviceImageInfoQCOM;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPPPPPPPI(device, image_width, image_height, image_format, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetDeviceImageInfoQCOM(cl_device_id device, size_t image_width, size_t image_height, cl_image_format const * image_format, cl_image_pitch_info_qcom param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetDeviceImageInfoQCOM(@NativeType("cl_device_id") long device, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_pitch_info_qcom") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetDeviceImageInfoQCOM(device, image_width, image_height, image_format.address(), param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetDeviceImageInfoQCOM(cl_device_id device, size_t image_width, size_t image_height, cl_image_format const * image_format, cl_image_pitch_info_qcom param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetDeviceImageInfoQCOM(@NativeType("cl_device_id") long device, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_pitch_info_qcom") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetDeviceImageInfoQCOM(device, image_width, image_height, image_format.address(), param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetDeviceImageInfoQCOM(cl_device_id device, size_t image_width, size_t image_height, cl_image_format const * image_format, cl_image_pitch_info_qcom param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetDeviceImageInfoQCOM(@NativeType("cl_device_id") long device, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_pitch_info_qcom") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetDeviceImageInfoQCOM;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPPPPI(device, image_width, image_height, image_format.address(), param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

}