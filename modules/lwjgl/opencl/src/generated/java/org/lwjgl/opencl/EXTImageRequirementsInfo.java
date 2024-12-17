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

public class EXTImageRequirementsInfo {

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

    /** {@code cl_int clGetImageRequirementsInfoEXT(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, cl_image_requirements_info_ext param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetImageRequirementsInfoEXT(long context, long properties, long flags, long image_format, long image_desc, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetImageRequirementsInfoEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPJPPPPPI(context, properties, flags, image_format, image_desc, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetImageRequirementsInfoEXT(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, cl_image_requirements_info_ext param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetImageRequirementsInfoEXT(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("cl_image_requirements_info_ext") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetImageRequirementsInfoEXT(context, memAddressSafe(properties), flags, image_format.address(), image_desc.address(), param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetImageRequirementsInfoEXT(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, cl_image_requirements_info_ext param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetImageRequirementsInfoEXT(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("cl_image_requirements_info_ext") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetImageRequirementsInfoEXT(context, memAddressSafe(properties), flags, image_format.address(), image_desc.address(), param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetImageRequirementsInfoEXT(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, cl_image_requirements_info_ext param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetImageRequirementsInfoEXT(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("cl_image_requirements_info_ext") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetImageRequirementsInfoEXT(context, memAddressSafe(properties), flags, image_format.address(), image_desc.address(), param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetImageRequirementsInfoEXT(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, cl_image_requirements_info_ext param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetImageRequirementsInfoEXT(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("cl_image_requirements_info_ext") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetImageRequirementsInfoEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPJPPPPPI(context, properties, flags, image_format.address(), image_desc.address(), param_name, (long)remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clGetImageRequirementsInfoEXT(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, cl_image_requirements_info_ext param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetImageRequirementsInfoEXT(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("cl_image_requirements_info_ext") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
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