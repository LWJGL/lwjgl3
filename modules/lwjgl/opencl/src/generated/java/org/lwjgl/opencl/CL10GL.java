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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class CL10GL {

    public static final int
        CL_INVALID_GL_OBJECT = -60,
        CL_INVALID_MIP_LEVEL = -62;

    public static final int
        CL_GL_OBJECT_BUFFER       = 0x2000,
        CL_GL_OBJECT_TEXTURE2D    = 0x2001,
        CL_GL_OBJECT_TEXTURE3D    = 0x2002,
        CL_GL_OBJECT_RENDERBUFFER = 0x2003;

    public static final int
        CL_GL_TEXTURE_TARGET = 0x2004,
        CL_GL_MIPMAP_LEVEL   = 0x2005;

    protected CL10GL() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateFromGLBuffer ] ---

    /** {@code cl_mem clCreateFromGLBuffer(cl_context context, cl_mem_flags flags, GLuint bufobj, cl_int * errcode_ret)} */
    public static long nclCreateFromGLBuffer(long context, long flags, int bufobj, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromGLBuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPP(context, flags, bufobj, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateFromGLBuffer(cl_context context, cl_mem_flags flags, GLuint bufobj, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateFromGLBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("GLuint") int bufobj, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateFromGLBuffer(context, flags, bufobj, memAddressSafe(errcode_ret));
    }

    // --- [ clCreateFromGLTexture2D ] ---

    /** {@code cl_mem clCreateFromGLTexture2D(cl_context context, cl_mem_flags flags, GLenum texture_target, GLint miplevel, GLuint texture, cl_int * errcode_ret)} */
    public static long nclCreateFromGLTexture2D(long context, long flags, int texture_target, int miplevel, int texture, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromGLTexture2D;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPP(context, flags, texture_target, miplevel, texture, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateFromGLTexture2D(cl_context context, cl_mem_flags flags, GLenum texture_target, GLint miplevel, GLuint texture, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateFromGLTexture2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("GLenum") int texture_target, @NativeType("GLint") int miplevel, @NativeType("GLuint") int texture, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateFromGLTexture2D(context, flags, texture_target, miplevel, texture, memAddressSafe(errcode_ret));
    }

    // --- [ clCreateFromGLTexture3D ] ---

    /** {@code cl_mem clCreateFromGLTexture3D(cl_context context, cl_mem_flags flags, GLenum texture_target, GLint miplevel, GLuint texture, cl_int * errcode_ret)} */
    public static long nclCreateFromGLTexture3D(long context, long flags, int texture_target, int miplevel, int texture, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromGLTexture3D;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPP(context, flags, texture_target, miplevel, texture, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateFromGLTexture3D(cl_context context, cl_mem_flags flags, GLenum texture_target, GLint miplevel, GLuint texture, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateFromGLTexture3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("GLenum") int texture_target, @NativeType("GLint") int miplevel, @NativeType("GLuint") int texture, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateFromGLTexture3D(context, flags, texture_target, miplevel, texture, memAddressSafe(errcode_ret));
    }

    // --- [ clCreateFromGLRenderbuffer ] ---

    /** {@code cl_mem clCreateFromGLRenderbuffer(cl_context context, cl_mem_flags flags, GLuint renderbuffer, cl_int * errcode_ret)} */
    public static long nclCreateFromGLRenderbuffer(long context, long flags, int renderbuffer, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromGLRenderbuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPP(context, flags, renderbuffer, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateFromGLRenderbuffer(cl_context context, cl_mem_flags flags, GLuint renderbuffer, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateFromGLRenderbuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("GLuint") int renderbuffer, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateFromGLRenderbuffer(context, flags, renderbuffer, memAddressSafe(errcode_ret));
    }

    // --- [ clGetGLObjectInfo ] ---

    /** {@code cl_int clGetGLObjectInfo(cl_mem memobj, cl_gl_object_type * gl_object_type, GLuint * gl_object_name)} */
    public static int nclGetGLObjectInfo(long memobj, long gl_object_type, long gl_object_name) {
        long __functionAddress = CL.getICD().clGetGLObjectInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(memobj);
        }
        return callPPPI(memobj, gl_object_type, gl_object_name, __functionAddress);
    }

    /** {@code cl_int clGetGLObjectInfo(cl_mem memobj, cl_gl_object_type * gl_object_type, GLuint * gl_object_name)} */
    @NativeType("cl_int")
    public static int clGetGLObjectInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_gl_object_type *") @Nullable IntBuffer gl_object_type, @NativeType("GLuint *") @Nullable IntBuffer gl_object_name) {
        if (CHECKS) {
            checkSafe(gl_object_type, 1);
            checkSafe(gl_object_name, 1);
        }
        return nclGetGLObjectInfo(memobj, memAddressSafe(gl_object_type), memAddressSafe(gl_object_name));
    }

    // --- [ clGetGLTextureInfo ] ---

    /** {@code cl_int clGetGLTextureInfo(cl_mem memobj, cl_gl_texture_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetGLTextureInfo(long memobj, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetGLTextureInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(memobj);
        }
        return callPPPPI(memobj, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetGLTextureInfo(cl_mem memobj, cl_gl_texture_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetGLTextureInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_gl_texture_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetGLTextureInfo(memobj, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetGLTextureInfo(cl_mem memobj, cl_gl_texture_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetGLTextureInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_gl_texture_info") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetGLTextureInfo(memobj, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clEnqueueAcquireGLObjects ] ---

    /** {@code cl_int clEnqueueAcquireGLObjects(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueAcquireGLObjects(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueAcquireGLObjects;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPI(command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueAcquireGLObjects(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueAcquireGLObjects(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueAcquireGLObjects(command_queue, mem_objects.remaining(), memAddress(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueAcquireGLObjects(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueAcquireGLObjects(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") long mem_object, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer mem_objects = stack.pointers(mem_object);
            return nclEnqueueAcquireGLObjects(command_queue, 1, memAddress(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clEnqueueReleaseGLObjects ] ---

    /** {@code cl_int clEnqueueReleaseGLObjects(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueReleaseGLObjects(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueReleaseGLObjects;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPI(command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueReleaseGLObjects(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReleaseGLObjects(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReleaseGLObjects(command_queue, mem_objects.remaining(), memAddress(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueReleaseGLObjects(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReleaseGLObjects(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") long mem_object, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer mem_objects = stack.pointers(mem_object);
            return nclEnqueueReleaseGLObjects(command_queue, 1, memAddress(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code cl_mem clCreateFromGLBuffer(cl_context context, cl_mem_flags flags, GLuint bufobj, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateFromGLBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("GLuint") int bufobj, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromGLBuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPP(context, flags, bufobj, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateFromGLTexture2D(cl_context context, cl_mem_flags flags, GLenum texture_target, GLint miplevel, GLuint texture, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateFromGLTexture2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("GLenum") int texture_target, @NativeType("GLint") int miplevel, @NativeType("GLuint") int texture, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromGLTexture2D;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPP(context, flags, texture_target, miplevel, texture, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateFromGLTexture3D(cl_context context, cl_mem_flags flags, GLenum texture_target, GLint miplevel, GLuint texture, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateFromGLTexture3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("GLenum") int texture_target, @NativeType("GLint") int miplevel, @NativeType("GLuint") int texture, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromGLTexture3D;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPP(context, flags, texture_target, miplevel, texture, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateFromGLRenderbuffer(cl_context context, cl_mem_flags flags, GLuint renderbuffer, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateFromGLRenderbuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("GLuint") int renderbuffer, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromGLRenderbuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPP(context, flags, renderbuffer, errcode_ret, __functionAddress);
    }

    /** {@code cl_int clGetGLObjectInfo(cl_mem memobj, cl_gl_object_type * gl_object_type, GLuint * gl_object_name)} */
    @NativeType("cl_int")
    public static int clGetGLObjectInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_gl_object_type *") int @Nullable [] gl_object_type, @NativeType("GLuint *") int @Nullable [] gl_object_name) {
        long __functionAddress = CL.getICD().clGetGLObjectInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(memobj);
            checkSafe(gl_object_type, 1);
            checkSafe(gl_object_name, 1);
        }
        return callPPPI(memobj, gl_object_type, gl_object_name, __functionAddress);
    }

    /** {@code cl_int clGetGLTextureInfo(cl_mem memobj, cl_gl_texture_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetGLTextureInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_gl_texture_info") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetGLTextureInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(memobj);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(memobj, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

}