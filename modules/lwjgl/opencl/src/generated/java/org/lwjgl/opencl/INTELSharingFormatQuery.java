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

public class INTELSharingFormatQuery {

    protected INTELSharingFormatQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetSupportedGLTextureFormatsINTEL ] ---

    /** {@code cl_int clGetSupportedGLTextureFormatsINTEL(cl_context context, cl_mem_flags flags, cl_mem_object_type image_type, cl_uint num_entries, GLenum * gl_formats, cl_uint * num_texture_formats)} */
    public static int nclGetSupportedGLTextureFormatsINTEL(long context, long flags, int image_type, int num_entries, long gl_formats, long num_texture_formats) {
        long __functionAddress = CL.getICD().clGetSupportedGLTextureFormatsINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPPI(context, flags, image_type, num_entries, gl_formats, num_texture_formats, __functionAddress);
    }

    /** {@code cl_int clGetSupportedGLTextureFormatsINTEL(cl_context context, cl_mem_flags flags, cl_mem_object_type image_type, cl_uint num_entries, GLenum * gl_formats, cl_uint * num_texture_formats)} */
    @NativeType("cl_int")
    public static int clGetSupportedGLTextureFormatsINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_object_type") int image_type, @NativeType("GLenum *") @Nullable IntBuffer gl_formats, @NativeType("cl_uint *") @Nullable IntBuffer num_texture_formats) {
        if (CHECKS) {
            checkSafe(num_texture_formats, 1);
        }
        return nclGetSupportedGLTextureFormatsINTEL(context, flags, image_type, remainingSafe(gl_formats), memAddressSafe(gl_formats), memAddressSafe(num_texture_formats));
    }

    // --- [ clGetSupportedVA_APIMediaSurfaceFormatsINTEL ] ---

    /** {@code cl_int clGetSupportedVA_APIMediaSurfaceFormatsINTEL(cl_context context, cl_mem_flags flags, cl_mem_object_type image_type, cl_uint plane, cl_uint num_entries, VAImageFormat * va_api_formats, cl_uint * num_surface_formats)} */
    public static int nclGetSupportedVA_APIMediaSurfaceFormatsINTEL(long context, long flags, int image_type, int plane, int num_entries, long va_api_formats, long num_surface_formats) {
        long __functionAddress = CL.getICD().clGetSupportedVA_APIMediaSurfaceFormatsINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPPI(context, flags, image_type, plane, num_entries, va_api_formats, num_surface_formats, __functionAddress);
    }

    /** {@code cl_int clGetSupportedVA_APIMediaSurfaceFormatsINTEL(cl_context context, cl_mem_flags flags, cl_mem_object_type image_type, cl_uint plane, cl_uint num_entries, VAImageFormat * va_api_formats, cl_uint * num_surface_formats)} */
    @NativeType("cl_int")
    public static int clGetSupportedVA_APIMediaSurfaceFormatsINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_object_type") int image_type, @NativeType("cl_uint") int plane, @NativeType("VAImageFormat *") @Nullable PointerBuffer va_api_formats, @NativeType("cl_uint *") @Nullable IntBuffer num_surface_formats) {
        if (CHECKS) {
            checkSafe(num_surface_formats, 1);
        }
        return nclGetSupportedVA_APIMediaSurfaceFormatsINTEL(context, flags, image_type, plane, remainingSafe(va_api_formats), memAddressSafe(va_api_formats), memAddressSafe(num_surface_formats));
    }

    /** {@code cl_int clGetSupportedGLTextureFormatsINTEL(cl_context context, cl_mem_flags flags, cl_mem_object_type image_type, cl_uint num_entries, GLenum * gl_formats, cl_uint * num_texture_formats)} */
    @NativeType("cl_int")
    public static int clGetSupportedGLTextureFormatsINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_object_type") int image_type, @NativeType("GLenum *") int @Nullable [] gl_formats, @NativeType("cl_uint *") int @Nullable [] num_texture_formats) {
        long __functionAddress = CL.getICD().clGetSupportedGLTextureFormatsINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(num_texture_formats, 1);
        }
        return callPJPPI(context, flags, image_type, lengthSafe(gl_formats), gl_formats, num_texture_formats, __functionAddress);
    }

    /** {@code cl_int clGetSupportedVA_APIMediaSurfaceFormatsINTEL(cl_context context, cl_mem_flags flags, cl_mem_object_type image_type, cl_uint plane, cl_uint num_entries, VAImageFormat * va_api_formats, cl_uint * num_surface_formats)} */
    @NativeType("cl_int")
    public static int clGetSupportedVA_APIMediaSurfaceFormatsINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_object_type") int image_type, @NativeType("cl_uint") int plane, @NativeType("VAImageFormat *") @Nullable PointerBuffer va_api_formats, @NativeType("cl_uint *") int @Nullable [] num_surface_formats) {
        long __functionAddress = CL.getICD().clGetSupportedVA_APIMediaSurfaceFormatsINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(num_surface_formats, 1);
        }
        return callPJPPI(context, flags, image_type, plane, remainingSafe(va_api_formats), memAddressSafe(va_api_formats), num_surface_formats, __functionAddress);
    }

}