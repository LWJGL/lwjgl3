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
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_sharing_format_query.txt">intel_sharing_format_query</a> extension.
 * 
 * <p>Existing interop / sharing extensions require support for a minimum set of image formats, however many OpenCL implementations may support sharing image
 * formats above and beyond the minimum. This extension provides a mechanism for an application to query the set of API-specific image formats that an
 * OpenCL implementation can accept for sharing.</p>
 * 
 * <p>Note that the query functionality provided by this extension does not replace API-specific query functions or guarantee that an API-specific image with
 * the returned format may be created. Additionally, some APIs may require that a buffer or image be created with particular flags or parameters to be
 * shared with OpenCL, so this extension does not guarantee that all API-specific images of the queried formats may be shared with OpenCL. It does,
 * however, guarantee that some API-specific images of the queried formats may be shared with OpenCL.</p>
 */
public class INTELSharingFormatQuery {

    protected INTELSharingFormatQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetSupportedGLTextureFormatsINTEL ] ---

    /**
     * Unsafe version of: {@link #clGetSupportedGLTextureFormatsINTEL GetSupportedGLTextureFormatsINTEL}
     *
     * @param num_entries specifies the number of entries that can be returned in the memory location given by {@code gl_formats}
     */
    public static int nclGetSupportedGLTextureFormatsINTEL(long context, long flags, int image_type, int num_entries, long gl_formats, long num_texture_formats) {
        long __functionAddress = CL.getICD().clGetSupportedGLTextureFormatsINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPPI(context, flags, image_type, num_entries, gl_formats, num_texture_formats, __functionAddress);
    }

    /**
     * Can be used to query the list of OpenGL internal texture formats supported for sharing with an OpenCL implementation, given {@code flags} indicating
     * how the image is going to be used and {@code image_type} indicating the type of image to create.
     * 
     * <p>If there are multiple devices in the context, the returned set of image formats is the union of image formats supported by all devices in the context.</p>
     *
     * @param context             a valid OpenCL context created from an OpenGL context
     * @param flags               a bit-field used to specify usage information about the image memory object that will be created from the OpenGL texture
     * @param image_type          describes the type of image that will be created from the OpenGL texture
     * @param gl_formats          a pointer to a memory location where the list of supported OpenGL internal texture formats supported for sharing is returned. If {@code gl_formats}
     *                            is {@code NULL}, it is ignored.
     * @param num_texture_formats returns the actual total number of supported OpenGL internal texture formats for the specified context and flags for the specified
     *                            {@code image_type}. If {@code num_texture_formats} is NULL, it is ignored.
     */
    @NativeType("cl_int")
    public static int clGetSupportedGLTextureFormatsINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_object_type") int image_type, @Nullable @NativeType("GLenum *") IntBuffer gl_formats, @Nullable @NativeType("cl_uint *") IntBuffer num_texture_formats) {
        if (CHECKS) {
            checkSafe(num_texture_formats, 1);
        }
        return nclGetSupportedGLTextureFormatsINTEL(context, flags, image_type, remainingSafe(gl_formats), memAddressSafe(gl_formats), memAddressSafe(num_texture_formats));
    }

    // --- [ clGetSupportedVA_APIMediaSurfaceFormatsINTEL ] ---

    /**
     * Unsafe version of: {@link #clGetSupportedVA_APIMediaSurfaceFormatsINTEL GetSupportedVA_APIMediaSurfaceFormatsINTEL}
     *
     * @param num_entries the number of entries that can be returned in the memory location given by {@code va_api_formats}
     */
    public static int nclGetSupportedVA_APIMediaSurfaceFormatsINTEL(long context, long flags, int image_type, int plane, int num_entries, long va_api_formats, long num_surface_formats) {
        long __functionAddress = CL.getICD().clGetSupportedVA_APIMediaSurfaceFormatsINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPPI(context, flags, image_type, plane, num_entries, va_api_formats, num_surface_formats, __functionAddress);
    }

    /**
     * Can be used to query the list of VA_API media image formats supported for sharing with an OpenCL implementation, given flags indicating how the image
     * is going to be used and {@code image_type} indicating the type of image to create.
     * 
     * <p>If there are multiple devices in the context, the returned set of image formats is the union of VA_API media image formats supported by all devices in
     * the context.</p>
     *
     * @param context             a valid OpenCL context that supports sharing VA_API media images
     * @param flags               a bit-field used to specify usage information about the image memory object that will be created from the VA_API media image
     * @param image_type          describes the type of image that will be created from the VA_API media image
     * @param plane               the plane that will be shared, for planar surface formats
     * @param va_api_formats      a pointer to a memory location where the list of supported VA_API media image formats supported for sharing is returned. If {@code va_api_formats}
     *                            is {@code NULL}, it is ignored.
     * @param num_surface_formats returns the actual total number of supported VA_API media image formats for the specified context and flags for the specified {@code image_type}.
     *                            If {@code num_surface_formats} is {@code NULL}, it is ignored.
     */
    @NativeType("cl_int")
    public static int clGetSupportedVA_APIMediaSurfaceFormatsINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_object_type") int image_type, @NativeType("cl_uint") int plane, @Nullable @NativeType("VAImageFormat *") PointerBuffer va_api_formats, @Nullable @NativeType("cl_uint *") IntBuffer num_surface_formats) {
        if (CHECKS) {
            checkSafe(num_surface_formats, 1);
        }
        return nclGetSupportedVA_APIMediaSurfaceFormatsINTEL(context, flags, image_type, plane, remainingSafe(va_api_formats), memAddressSafe(va_api_formats), memAddressSafe(num_surface_formats));
    }

    /** Array version of: {@link #clGetSupportedGLTextureFormatsINTEL GetSupportedGLTextureFormatsINTEL} */
    @NativeType("cl_int")
    public static int clGetSupportedGLTextureFormatsINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_object_type") int image_type, @Nullable @NativeType("GLenum *") int[] gl_formats, @Nullable @NativeType("cl_uint *") int[] num_texture_formats) {
        long __functionAddress = CL.getICD().clGetSupportedGLTextureFormatsINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(num_texture_formats, 1);
        }
        return callPJPPI(context, flags, image_type, lengthSafe(gl_formats), gl_formats, num_texture_formats, __functionAddress);
    }

    /** Array version of: {@link #clGetSupportedVA_APIMediaSurfaceFormatsINTEL GetSupportedVA_APIMediaSurfaceFormatsINTEL} */
    @NativeType("cl_int")
    public static int clGetSupportedVA_APIMediaSurfaceFormatsINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_object_type") int image_type, @NativeType("cl_uint") int plane, @Nullable @NativeType("VAImageFormat *") PointerBuffer va_api_formats, @Nullable @NativeType("cl_uint *") int[] num_surface_formats) {
        long __functionAddress = CL.getICD().clGetSupportedVA_APIMediaSurfaceFormatsINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(num_surface_formats, 1);
        }
        return callPJPPI(context, flags, image_type, plane, remainingSafe(va_api_formats), memAddressSafe(va_api_formats), num_surface_formats, __functionAddress);
    }

}