/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/qcom/cl_qcom_ext_host_ptr.txt">qcom_ext_host_ptr</a> extension.
 * 
 * <p>This extension extends the functionality provided by {@link CL10#clCreateBuffer CreateBuffer}, {@link CL10#clCreateImage2D CreateImage2D}, {@link CL10#clCreateImage3D CreateImage3D}. It allows applications to specify
 * a new flag {@link #CL_MEM_EXT_HOST_PTR_QCOM MEM_EXT_HOST_PTR_QCOM} which enables the driver to map external memory allocations --to be defined in future layered extensions-- to the
 * device's address space and thus avoiding having to copy data back and forth between the host and the device.</p>
 * 
 * <p>Requires {@link CL11 CL11}.</p>
 */
public class QCOMEXTHostPtr {

    /** Accepted by the {@code param_name} argument of {@link CL10#clGetDeviceInfo GetDeviceInfo}. */
    public static final int
        CL_DEVICE_EXT_MEM_PADDING_IN_BYTES_QCOM = 0x40A0,
        CL_DEVICE_PAGE_SIZE_QCOM                = 0x40A1;

    /** Accepted by the {@code flags} argument of {@link CL10#clCreateBuffer CreateBuffer}, {@link CL10#clCreateImage2D CreateImage2D} and {@link CL10#clCreateImage3D CreateImage3D}. */
    public static final int CL_MEM_EXT_HOST_PTR_QCOM = 1 << 29;

    /** host_cache_policy. */
    public static final int
        CL_MEM_HOST_UNCACHED_QCOM        = 0x40A4,
        CL_MEM_HOST_WRITEBACK_QCOM       = 0x40A5,
        CL_MEM_HOST_WRITETHROUGH_QCOM    = 0x40A6,
        CL_MEM_HOST_WRITE_COMBINING_QCOM = 0x40A7;

    /** Accepted by the {@code param_name} argument of {@link #clGetDeviceImageInfoQCOM GetDeviceImageInfoQCOM}. */
    public static final int
        CL_IMAGE_ROW_ALIGNMENT_QCOM   = 0x40A2,
        CL_IMAGE_SLICE_ALIGNMENT_QCOM = 0x40A3;

    protected QCOMEXTHostPtr() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetDeviceImageInfoQCOM ] ---

    /**
     * Unsafe version of: {@link #clGetDeviceImageInfoQCOM GetDeviceImageInfoQCOM}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetDeviceImageInfoQCOM(long device, long image_width, long image_height, long image_format, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetDeviceImageInfoQCOM;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPPPPPPPI(device, image_width, image_height, image_format, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * An application that creates OpenCL image objects with the {@link #CL_MEM_EXT_HOST_PTR_QCOM MEM_EXT_HOST_PTR_QCOM} flag can invoke this function to query the required row pitch, slice
     * pitch and alignment for a particular device.
     *
     * @param device               a valid device
     * @param image_width          width of the image in image elements (pixels)
     * @param image_height         height of the image in image elements (pixels)
     * @param image_format         format of the image
     * @param param_name           the parameter to query. One of:<br><table><tr><td>{@link CL10#CL_IMAGE_ROW_PITCH IMAGE_ROW_PITCH}</td><td>{@link CL10#CL_IMAGE_SLICE_PITCH IMAGE_SLICE_PITCH}</td><td>{@link #CL_IMAGE_ROW_ALIGNMENT_QCOM IMAGE_ROW_ALIGNMENT_QCOM}</td></tr><tr><td>{@link #CL_IMAGE_SLICE_ALIGNMENT_QCOM IMAGE_SLICE_ALIGNMENT_QCOM}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     */
    @NativeType("cl_int")
    public static int clGetDeviceImageInfoQCOM(@NativeType("cl_device_id") long device, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_pitch_info_qcom") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetDeviceImageInfoQCOM(device, image_width, image_height, image_format.address(), param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * An application that creates OpenCL image objects with the {@link #CL_MEM_EXT_HOST_PTR_QCOM MEM_EXT_HOST_PTR_QCOM} flag can invoke this function to query the required row pitch, slice
     * pitch and alignment for a particular device.
     *
     * @param device               a valid device
     * @param image_width          width of the image in image elements (pixels)
     * @param image_height         height of the image in image elements (pixels)
     * @param image_format         format of the image
     * @param param_name           the parameter to query. One of:<br><table><tr><td>{@link CL10#CL_IMAGE_ROW_PITCH IMAGE_ROW_PITCH}</td><td>{@link CL10#CL_IMAGE_SLICE_PITCH IMAGE_SLICE_PITCH}</td><td>{@link #CL_IMAGE_ROW_ALIGNMENT_QCOM IMAGE_ROW_ALIGNMENT_QCOM}</td></tr><tr><td>{@link #CL_IMAGE_SLICE_ALIGNMENT_QCOM IMAGE_SLICE_ALIGNMENT_QCOM}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     */
    @NativeType("cl_int")
    public static int clGetDeviceImageInfoQCOM(@NativeType("cl_device_id") long device, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_pitch_info_qcom") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetDeviceImageInfoQCOM(device, image_width, image_height, image_format.address(), param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** Array version of: {@link #clGetDeviceImageInfoQCOM GetDeviceImageInfoQCOM} */
    @NativeType("cl_int")
    public static int clGetDeviceImageInfoQCOM(@NativeType("cl_device_id") long device, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_pitch_info_qcom") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetDeviceImageInfoQCOM;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPPPPI(device, image_width, image_height, image_format.address(), param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

}