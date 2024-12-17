/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class CL12GL extends CL10GL {

    public static final int
        CL_GL_OBJECT_TEXTURE_2D_ARRAY = 0x200E,
        CL_GL_OBJECT_TEXTURE1D        = 0x200F,
        CL_GL_OBJECT_TEXTURE1D_ARRAY  = 0x2010,
        CL_GL_OBJECT_TEXTURE_BUFFER   = 0x2011;

    protected CL12GL() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateFromGLTexture ] ---

    /** {@code cl_mem clCreateFromGLTexture(cl_context context, cl_mem_flags flags, GLenum texture_target, GLint miplevel, GLuint texture, cl_int * errcode_ret)} */
    public static long nclCreateFromGLTexture(long context, long flags, int texture_target, int miplevel, int texture, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromGLTexture;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPP(context, flags, texture_target, miplevel, texture, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateFromGLTexture(cl_context context, cl_mem_flags flags, GLenum texture_target, GLint miplevel, GLuint texture, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateFromGLTexture(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("GLenum") int texture_target, @NativeType("GLint") int miplevel, @NativeType("GLuint") int texture, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateFromGLTexture(context, flags, texture_target, miplevel, texture, memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateFromGLTexture(cl_context context, cl_mem_flags flags, GLenum texture_target, GLint miplevel, GLuint texture, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateFromGLTexture(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("GLenum") int texture_target, @NativeType("GLint") int miplevel, @NativeType("GLuint") int texture, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromGLTexture;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPP(context, flags, texture_target, miplevel, texture, errcode_ret, __functionAddress);
    }

}