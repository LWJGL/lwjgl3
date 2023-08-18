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
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenCL/extensions/ext/cl_ext_image_requirements_info.txt">ext_image_requirements_info</a> extension.
 * 
 * <p>This extension enables applications to query requirements for an image without having to create the image.</p>
 */
public class EXTImageRequirementsInfo {

    /** Accepted value for the {@code param_name} parameter to {@link #clGetImageRequirementsInfoEXT GetImageRequirementsInfoEXT} */
    public static final int
        CL_IMAGE_REQUIREMENTS_ROW_PITCH_ALIGNMENT_EXT    = 0x1290,
        CL_IMAGE_REQUIREMENTS_BASE_ADDRESS_ALIGNMENT_EXT = 0x1292,
        CL_IMAGE_REQUIREMENTS_SIZE_EXT                   = 0x12B2,
        CL_IMAGE_REQUIREMENTS_MAX_WIDTH_EXT              = 0x12B3,
        CL_IMAGE_REQUIREMENTS_MAX_HEIGHT_EXT             = 0x12B4,
        CL_IMAGE_REQUIREMENTS_MAX_DEPTH_EXT              = 0x12B5,
        CL_IMAGE_REQUIREMENTS_MAX_ARRAY_SIZE_EXT         = 0x12B6;

    protected EXTImageRequirementsInfo() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetImageRequirementsInfoEXT ] ---

    /**
     * Unsafe version of: {@link #clGetImageRequirementsInfoEXT GetImageRequirementsInfoEXT}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetImageRequirementsInfoEXT(long context, long properties, long flags, long image_format, long image_desc, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetImageRequirementsInfoEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPJPPPPPI(context, properties, flags, image_format, image_desc, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     */
    @NativeType("cl_int")
    public static int clGetImageRequirementsInfoEXT(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("cl_image_requirements_info_ext") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetImageRequirementsInfoEXT(context, memAddressSafe(properties), flags, image_format.address(), image_desc.address(), param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     */
    @NativeType("cl_int")
    public static int clGetImageRequirementsInfoEXT(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("cl_image_requirements_info_ext") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetImageRequirementsInfoEXT(context, memAddressSafe(properties), flags, image_format.address(), image_desc.address(), param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     */
    @NativeType("cl_int")
    public static int clGetImageRequirementsInfoEXT(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("cl_image_requirements_info_ext") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetImageRequirementsInfoEXT(context, memAddressSafe(properties), flags, image_format.address(), image_desc.address(), param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** Array version of: {@link #clGetImageRequirementsInfoEXT GetImageRequirementsInfoEXT} */
    @NativeType("cl_int")
    public static int clGetImageRequirementsInfoEXT(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("cl_image_requirements_info_ext") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetImageRequirementsInfoEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPJPPPPPI(context, properties, flags, image_format.address(), image_desc.address(), param_name, (long)remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** Array version of: {@link #clGetImageRequirementsInfoEXT GetImageRequirementsInfoEXT} */
    @NativeType("cl_int")
    public static int clGetImageRequirementsInfoEXT(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("cl_image_requirements_info_ext") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetImageRequirementsInfoEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPJPPPPPI(context, properties, flags, image_format.address(), image_desc.address(), param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

}