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

public class APPLEGLSharing {

    public static final int CL_INVALID_GL_CONTEXT_APPLE = -1000;

    public static final int CL_CONTEXT_PROPERTY_USE_CGL_SHAREGROUP_APPLE = 0x10000000;

    public static final int CL_CGL_DEVICES_FOR_SUPPORTED_VIRTUAL_SCREENS_APPLE = 0x10000003;

    public static final int CL_CGL_DEVICE_FOR_CURRENT_VIRTUAL_SCREEN_APPLE = 0x10000002;

    protected APPLEGLSharing() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetGLContextInfoAPPLE ] ---

    /** {@code cl_int clGetGLContextInfoAPPLE(cl_context context, void * platform_gl_ctx, cl_gl_platform_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetGLContextInfoAPPLE(long context, long platform_gl_ctx, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetGLContextInfoAPPLE;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(platform_gl_ctx);
        }
        return callPPPPPI(context, platform_gl_ctx, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetGLContextInfoAPPLE(cl_context context, void * platform_gl_ctx, cl_gl_platform_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetGLContextInfoAPPLE(@NativeType("cl_context") long context, @NativeType("void *") long platform_gl_ctx, @NativeType("cl_gl_platform_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetGLContextInfoAPPLE(context, platform_gl_ctx, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetGLContextInfoAPPLE(cl_context context, void * platform_gl_ctx, cl_gl_platform_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetGLContextInfoAPPLE(@NativeType("cl_context") long context, @NativeType("void *") long platform_gl_ctx, @NativeType("cl_gl_platform_info") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetGLContextInfoAPPLE(context, platform_gl_ctx, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

}