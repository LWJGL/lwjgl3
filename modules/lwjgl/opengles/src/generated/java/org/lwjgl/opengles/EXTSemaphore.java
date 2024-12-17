/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTSemaphore {

    static { GLES.initialize(); }

    public static final int
        GL_NUM_DEVICE_UUIDS_EXT = 0x9596,
        GL_DEVICE_UUID_EXT      = 0x9597,
        GL_DRIVER_UUID_EXT      = 0x9598;

    public static final int GL_UUID_SIZE_EXT = 16;

    public static final int
        GL_LAYOUT_GENERAL_EXT                            = 0x958D,
        GL_LAYOUT_COLOR_ATTACHMENT_EXT                   = 0x958E,
        GL_LAYOUT_DEPTH_STENCIL_ATTACHMENT_EXT           = 0x958F,
        GL_LAYOUT_DEPTH_STENCIL_READ_ONLY_EXT            = 0x9590,
        GL_LAYOUT_SHADER_READ_ONLY_EXT                   = 0x9591,
        GL_LAYOUT_TRANSFER_SRC_EXT                       = 0x9592,
        GL_LAYOUT_TRANSFER_DST_EXT                       = 0x9593,
        GL_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_EXT = 0x9530,
        GL_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_EXT = 0x9531;

    protected EXTSemaphore() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetUnsignedBytevEXT ] ---

    /** {@code void glGetUnsignedBytevEXT(GLenum pname, GLubyte * data)} */
    public static void nglGetUnsignedBytevEXT(int pname, long data) {
        EXTMemoryObject.nglGetUnsignedBytevEXT(pname, data);
    }

    /** {@code void glGetUnsignedBytevEXT(GLenum pname, GLubyte * data)} */
    public static void glGetUnsignedBytevEXT(@NativeType("GLenum") int pname, @NativeType("GLubyte *") ByteBuffer data) {
        EXTMemoryObject.glGetUnsignedBytevEXT(pname, data);
    }

    // --- [ glGetUnsignedBytei_vEXT ] ---

    /** {@code void glGetUnsignedBytei_vEXT(GLenum target, GLuint index, GLubyte * data)} */
    public static void nglGetUnsignedBytei_vEXT(int target, int index, long data) {
        EXTMemoryObject.nglGetUnsignedBytei_vEXT(target, index, data);
    }

    /** {@code void glGetUnsignedBytei_vEXT(GLenum target, GLuint index, GLubyte * data)} */
    public static void glGetUnsignedBytei_vEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLubyte *") ByteBuffer data) {
        EXTMemoryObject.glGetUnsignedBytei_vEXT(target, index, data);
    }

    // --- [ glGenSemaphoresEXT ] ---

    /** {@code void glGenSemaphoresEXT(GLsizei n, GLuint * semaphores)} */
    public static native void nglGenSemaphoresEXT(int n, long semaphores);

    /** {@code void glGenSemaphoresEXT(GLsizei n, GLuint * semaphores)} */
    public static void glGenSemaphoresEXT(@NativeType("GLuint *") IntBuffer semaphores) {
        nglGenSemaphoresEXT(semaphores.remaining(), memAddress(semaphores));
    }

    /** {@code void glGenSemaphoresEXT(GLsizei n, GLuint * semaphores)} */
    @NativeType("void")
    public static int glGenSemaphoresEXT() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer semaphores = stack.callocInt(1);
            nglGenSemaphoresEXT(1, memAddress(semaphores));
            return semaphores.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteSemaphoresEXT ] ---

    /** {@code void glDeleteSemaphoresEXT(GLsizei n, GLuint const * semaphores)} */
    public static native void nglDeleteSemaphoresEXT(int n, long semaphores);

    /** {@code void glDeleteSemaphoresEXT(GLsizei n, GLuint const * semaphores)} */
    public static void glDeleteSemaphoresEXT(@NativeType("GLuint const *") IntBuffer semaphores) {
        nglDeleteSemaphoresEXT(semaphores.remaining(), memAddress(semaphores));
    }

    /** {@code void glDeleteSemaphoresEXT(GLsizei n, GLuint const * semaphores)} */
    public static void glDeleteSemaphoresEXT(@NativeType("GLuint const *") int semaphore) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer semaphores = stack.ints(semaphore);
            nglDeleteSemaphoresEXT(1, memAddress(semaphores));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsSemaphoreEXT ] ---

    /** {@code GLboolean glIsSemaphoreEXT(GLuint semaphore)} */
    @NativeType("GLboolean")
    public static native boolean glIsSemaphoreEXT(@NativeType("GLuint") int semaphore);

    // --- [ glSemaphoreParameterui64vEXT ] ---

    /** {@code void glSemaphoreParameterui64vEXT(GLuint semaphore, GLenum pname, GLuint64 const * params)} */
    public static native void nglSemaphoreParameterui64vEXT(int semaphore, int pname, long params);

    /** {@code void glSemaphoreParameterui64vEXT(GLuint semaphore, GLenum pname, GLuint64 const * params)} */
    public static void glSemaphoreParameterui64vEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLuint64 const *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSemaphoreParameterui64vEXT(semaphore, pname, memAddress(params));
    }

    /** {@code void glSemaphoreParameterui64vEXT(GLuint semaphore, GLenum pname, GLuint64 const * params)} */
    public static void glSemaphoreParameterui64EXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLuint64 const *") long param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.longs(param);
            nglSemaphoreParameterui64vEXT(semaphore, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSemaphoreParameterui64vEXT ] ---

    /** {@code void glGetSemaphoreParameterui64vEXT(GLuint semaphore, GLenum pname, GLuint64 * params)} */
    public static native void nglGetSemaphoreParameterui64vEXT(int semaphore, int pname, long params);

    /** {@code void glGetSemaphoreParameterui64vEXT(GLuint semaphore, GLenum pname, GLuint64 * params)} */
    public static void glGetSemaphoreParameterui64vEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSemaphoreParameterui64vEXT(semaphore, pname, memAddress(params));
    }

    /** {@code void glGetSemaphoreParameterui64vEXT(GLuint semaphore, GLenum pname, GLuint64 * params)} */
    @NativeType("void")
    public static long glGetSemaphoreParameterui64EXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetSemaphoreParameterui64vEXT(semaphore, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glWaitSemaphoreEXT ] ---

    /** {@code void glWaitSemaphoreEXT(GLuint semaphore, GLuint numBufferBarriers, GLuint const * buffers, GLuint numTextureBarriers, GLuint const * textures, GLenum const * srcLayouts)} */
    public static native void nglWaitSemaphoreEXT(int semaphore, int numBufferBarriers, long buffers, int numTextureBarriers, long textures, long srcLayouts);

    /** {@code void glWaitSemaphoreEXT(GLuint semaphore, GLuint numBufferBarriers, GLuint const * buffers, GLuint numTextureBarriers, GLuint const * textures, GLenum const * srcLayouts)} */
    public static void glWaitSemaphoreEXT(@NativeType("GLuint") int semaphore, @NativeType("GLuint const *") IntBuffer buffers, @NativeType("GLuint const *") IntBuffer textures, @NativeType("GLenum const *") IntBuffer srcLayouts) {
        if (CHECKS) {
            check(srcLayouts, textures.remaining());
        }
        nglWaitSemaphoreEXT(semaphore, buffers.remaining(), memAddress(buffers), textures.remaining(), memAddress(textures), memAddress(srcLayouts));
    }

    // --- [ glSignalSemaphoreEXT ] ---

    /** {@code void glSignalSemaphoreEXT(GLuint semaphore, GLuint numBufferBarriers, GLuint const * buffers, GLuint numTextureBarriers, GLuint const * textures, GLenum const * dstLayouts)} */
    public static native void nglSignalSemaphoreEXT(int semaphore, int numBufferBarriers, long buffers, int numTextureBarriers, long textures, long dstLayouts);

    /** {@code void glSignalSemaphoreEXT(GLuint semaphore, GLuint numBufferBarriers, GLuint const * buffers, GLuint numTextureBarriers, GLuint const * textures, GLenum const * dstLayouts)} */
    public static void glSignalSemaphoreEXT(@NativeType("GLuint") int semaphore, @NativeType("GLuint const *") IntBuffer buffers, @NativeType("GLuint const *") IntBuffer textures, @NativeType("GLenum const *") IntBuffer dstLayouts) {
        if (CHECKS) {
            check(dstLayouts, textures.remaining());
        }
        nglSignalSemaphoreEXT(semaphore, buffers.remaining(), memAddress(buffers), textures.remaining(), memAddress(textures), memAddress(dstLayouts));
    }

    /** {@code void glGenSemaphoresEXT(GLsizei n, GLuint * semaphores)} */
    public static void glGenSemaphoresEXT(@NativeType("GLuint *") int[] semaphores) {
        long __functionAddress = GLES.getICD().glGenSemaphoresEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(semaphores.length, semaphores, __functionAddress);
    }

    /** {@code void glDeleteSemaphoresEXT(GLsizei n, GLuint const * semaphores)} */
    public static void glDeleteSemaphoresEXT(@NativeType("GLuint const *") int[] semaphores) {
        long __functionAddress = GLES.getICD().glDeleteSemaphoresEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(semaphores.length, semaphores, __functionAddress);
    }

    /** {@code void glSemaphoreParameterui64vEXT(GLuint semaphore, GLenum pname, GLuint64 const * params)} */
    public static void glSemaphoreParameterui64vEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLuint64 const *") long[] params) {
        long __functionAddress = GLES.getICD().glSemaphoreParameterui64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(semaphore, pname, params, __functionAddress);
    }

    /** {@code void glGetSemaphoreParameterui64vEXT(GLuint semaphore, GLenum pname, GLuint64 * params)} */
    public static void glGetSemaphoreParameterui64vEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GLES.getICD().glGetSemaphoreParameterui64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(semaphore, pname, params, __functionAddress);
    }

    /** {@code void glWaitSemaphoreEXT(GLuint semaphore, GLuint numBufferBarriers, GLuint const * buffers, GLuint numTextureBarriers, GLuint const * textures, GLenum const * srcLayouts)} */
    public static void glWaitSemaphoreEXT(@NativeType("GLuint") int semaphore, @NativeType("GLuint const *") int[] buffers, @NativeType("GLuint const *") int[] textures, @NativeType("GLenum const *") int[] srcLayouts) {
        long __functionAddress = GLES.getICD().glWaitSemaphoreEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(srcLayouts, textures.length);
        }
        callPPPV(semaphore, buffers.length, buffers, textures.length, textures, srcLayouts, __functionAddress);
    }

    /** {@code void glSignalSemaphoreEXT(GLuint semaphore, GLuint numBufferBarriers, GLuint const * buffers, GLuint numTextureBarriers, GLuint const * textures, GLenum const * dstLayouts)} */
    public static void glSignalSemaphoreEXT(@NativeType("GLuint") int semaphore, @NativeType("GLuint const *") int[] buffers, @NativeType("GLuint const *") int[] textures, @NativeType("GLenum const *") int[] dstLayouts) {
        long __functionAddress = GLES.getICD().glSignalSemaphoreEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dstLayouts, textures.length);
        }
        callPPPV(semaphore, buffers.length, buffers, textures.length, textures, dstLayouts, __functionAddress);
    }

}