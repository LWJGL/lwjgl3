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

/** Native bindings to the <strong>APPLE_gl_sharing</strong> extension. */
public class APPLEGLSharing {

    /** Error code returned by {@link #clGetGLContextInfoAPPLE GetGLContextInfoAPPLE} if an invalid {@code platform_gl_ctx} is provided. */
    public static final int CL_INVALID_GL_CONTEXT_APPLE = -1000;

    /**
     * This enumerated value can be specified as part of the {@code properties} argument passed to {@link CL10#clCreateContext CreateContext} to allow OpenCL compliant devices in an
     * existing CGL share group to be used as the devices in the newly created CL context. GL objects that were allocated in the specified CGL share group can
     * now be shared between CL and GL.
     */
    public static final int CL_CONTEXT_PROPERTY_USE_CGL_SHAREGROUP_APPLE = 0x10000000;

    /**
     * Accepted as the {@code param_name} argument of {@link #clGetGLContextInfoAPPLE GetGLContextInfoAPPLE}. Returns an array of {@code cl_device_ids} for the CL device(s) corresponding
     * to the virtual screen(s) for the specified CGL context.
     */
    public static final int CL_CGL_DEVICES_FOR_SUPPORTED_VIRTUAL_SCREENS_APPLE = 0x10000003;

    /**
     * Accepted as the {@code param_name} argument of {@link #clGetGLContextInfoAPPLE GetGLContextInfoAPPLE}. Returns a {@code cl_device_id} for the CL device associated with the virtual
     * screen for the specified CGL context.
     */
    public static final int CL_CGL_DEVICE_FOR_CURRENT_VIRTUAL_SCREEN_APPLE = 0x10000002;

    protected APPLEGLSharing() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetGLContextInfoAPPLE ] ---

    /**
     * Unsafe version of: {@link #clGetGLContextInfoAPPLE GetGLContextInfoAPPLE}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetGLContextInfoAPPLE(long context, long platform_gl_ctx, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetGLContextInfoAPPLE;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(platform_gl_ctx);
        }
        return callPPPPPI(context, platform_gl_ctx, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Provides a query mechanism to retrieve OpenGL context specific information from an OpenCL context to help identify device specific mappings and usage.
     * 
     * <p>For example, one possible usage would be to allow the client to map a CGL virtual screen index to an appropriate CL device id to insure that the
     * rendering device and the compute device are the same, thus guaranteeing any shared OpenGL memory that is attached o a CL memory object remains resident
     * on the active device.</p>
     *
     * @param context              the context being queried
     * @param platform_gl_ctx      the OpenGL context handle
     * @param param_name           a constant that specifies the GL context information to query. One of:<br><table><tr><td>{@link #CL_CGL_DEVICES_FOR_SUPPORTED_VIRTUAL_SCREENS_APPLE CGL_DEVICES_FOR_SUPPORTED_VIRTUAL_SCREENS_APPLE}</td></tr><tr><td>{@link #CL_CGL_DEVICE_FOR_CURRENT_VIRTUAL_SCREEN_APPLE CGL_DEVICE_FOR_CURRENT_VIRTUAL_SCREEN_APPLE}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     */
    @NativeType("cl_int")
    public static int clGetGLContextInfoAPPLE(@NativeType("cl_context") long context, @NativeType("void *") long platform_gl_ctx, @NativeType("cl_gl_platform_info") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetGLContextInfoAPPLE(context, platform_gl_ctx, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Provides a query mechanism to retrieve OpenGL context specific information from an OpenCL context to help identify device specific mappings and usage.
     * 
     * <p>For example, one possible usage would be to allow the client to map a CGL virtual screen index to an appropriate CL device id to insure that the
     * rendering device and the compute device are the same, thus guaranteeing any shared OpenGL memory that is attached o a CL memory object remains resident
     * on the active device.</p>
     *
     * @param context              the context being queried
     * @param platform_gl_ctx      the OpenGL context handle
     * @param param_name           a constant that specifies the GL context information to query. One of:<br><table><tr><td>{@link #CL_CGL_DEVICES_FOR_SUPPORTED_VIRTUAL_SCREENS_APPLE CGL_DEVICES_FOR_SUPPORTED_VIRTUAL_SCREENS_APPLE}</td></tr><tr><td>{@link #CL_CGL_DEVICE_FOR_CURRENT_VIRTUAL_SCREEN_APPLE CGL_DEVICE_FOR_CURRENT_VIRTUAL_SCREEN_APPLE}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     */
    @NativeType("cl_int")
    public static int clGetGLContextInfoAPPLE(@NativeType("cl_context") long context, @NativeType("void *") long platform_gl_ctx, @NativeType("cl_gl_platform_info") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetGLContextInfoAPPLE(context, platform_gl_ctx, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

}