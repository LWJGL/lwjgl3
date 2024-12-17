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

public class KHRGLSharing {

    public static final int CL_INVALID_GL_SHAREGROUP_REFERENCE_KHR = -1000;

    public static final int CL_DEVICES_FOR_GL_CONTEXT_KHR = 0x2007;

    public static final int CL_CURRENT_DEVICE_FOR_GL_CONTEXT_KHR = 0x2006;

    public static final int
        CL_GL_CONTEXT_KHR     = 0x2008,
        CL_EGL_DISPLAY_KHR    = 0x2009,
        CL_GLX_DISPLAY_KHR    = 0x200A,
        CL_WGL_HDC_KHR        = 0x200B,
        CL_CGL_SHAREGROUP_KHR = 0x200C;

    protected KHRGLSharing() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetGLContextInfoKHR ] ---

    /** {@code cl_int clGetGLContextInfoKHR(cl_context_properties const * properties, cl_gl_context_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetGLContextInfoKHR(long properties, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetGLContextInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(properties, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetGLContextInfoKHR(cl_context_properties const * properties, cl_gl_context_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetGLContextInfoKHR(@NativeType("cl_context_properties const *") PointerBuffer properties, @NativeType("cl_gl_context_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkNT(properties);
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetGLContextInfoKHR(memAddress(properties), param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetGLContextInfoKHR(cl_context_properties const * properties, cl_gl_context_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetGLContextInfoKHR(@NativeType("cl_context_properties const *") PointerBuffer properties, @NativeType("cl_gl_context_info") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkNT(properties);
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetGLContextInfoKHR(memAddress(properties), param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

}