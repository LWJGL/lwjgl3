/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVGPUMulticast {

    static { GL.initialize(); }

    public static final int GL_PER_GPU_STORAGE_BIT_NV = 0x800;

    public static final int
        GL_MULTICAST_GPUS_NV  = 0x92BA,
        GL_RENDER_GPU_MASK_NV = 0x9558;

    public static final int GL_PER_GPU_STORAGE_NV = 0x9548;

    public static final int GL_MULTICAST_PROGRAMMABLE_SAMPLE_LOCATION_NV = 0x9549;

    protected NVGPUMulticast() {
        throw new UnsupportedOperationException();
    }

    // --- [ glRenderGpuMaskNV ] ---

    /** {@code void glRenderGpuMaskNV(GLbitfield mask)} */
    public static native void glRenderGpuMaskNV(@NativeType("GLbitfield") int mask);

    // --- [ glMulticastBufferSubDataNV ] ---

    /** {@code void glMulticastBufferSubDataNV(GLbitfield gpuMask, GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static native void nglMulticastBufferSubDataNV(int gpuMask, int buffer, long offset, long size, long data);

    /** {@code void glMulticastBufferSubDataNV(GLbitfield gpuMask, GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data) {
        nglMulticastBufferSubDataNV(gpuMask, buffer, offset, data.remaining(), memAddress(data));
    }

    /** {@code void glMulticastBufferSubDataNV(GLbitfield gpuMask, GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data) {
        nglMulticastBufferSubDataNV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    /** {@code void glMulticastBufferSubDataNV(GLbitfield gpuMask, GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data) {
        nglMulticastBufferSubDataNV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glMulticastBufferSubDataNV(GLbitfield gpuMask, GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data) {
        nglMulticastBufferSubDataNV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glMulticastBufferSubDataNV(GLbitfield gpuMask, GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") DoubleBuffer data) {
        nglMulticastBufferSubDataNV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    // --- [ glMulticastCopyBufferSubDataNV ] ---

    /** {@code void glMulticastCopyBufferSubDataNV(GLuint readGpu, GLbitfield writeGpuMask, GLuint readBuffer, GLuint writeBuffer, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size)} */
    public static native void glMulticastCopyBufferSubDataNV(@NativeType("GLuint") int readGpu, @NativeType("GLbitfield") int writeGpuMask, @NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size);

    // --- [ glMulticastCopyImageSubDataNV ] ---

    /** {@code void glMulticastCopyImageSubDataNV(GLuint srcGpu, GLbitfield dstGpuMask, GLuint srcName, GLenum srcTarget, GLint srcLevel, GLint srcX, GLint srxY, GLint srcZ, GLuint dstName, GLenum dstTarget, GLint dstLevel, GLint dstX, GLint dstY, GLint dstZ, GLsizei srcWidth, GLsizei srcHeight, GLsizei srcDepth)} */
    public static native void glMulticastCopyImageSubDataNV(@NativeType("GLuint") int srcGpu, @NativeType("GLbitfield") int dstGpuMask, @NativeType("GLuint") int srcName, @NativeType("GLenum") int srcTarget, @NativeType("GLint") int srcLevel, @NativeType("GLint") int srcX, @NativeType("GLint") int srxY, @NativeType("GLint") int srcZ, @NativeType("GLuint") int dstName, @NativeType("GLenum") int dstTarget, @NativeType("GLint") int dstLevel, @NativeType("GLint") int dstX, @NativeType("GLint") int dstY, @NativeType("GLint") int dstZ, @NativeType("GLsizei") int srcWidth, @NativeType("GLsizei") int srcHeight, @NativeType("GLsizei") int srcDepth);

    // --- [ glMulticastBlitFramebufferNV ] ---

    /** {@code void glMulticastBlitFramebufferNV(GLuint srcGpu, GLuint dstGpu, GLint srcX0, GLint srcY0, GLint srcX1, GLint srcY1, GLint dstX0, GLint dstY0, GLint dstX1, GLint dstY1, GLbitfield mask, GLenum filter)} */
    public static native void glMulticastBlitFramebufferNV(@NativeType("GLuint") int srcGpu, @NativeType("GLuint") int dstGpu, @NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter);

    // --- [ glMulticastFramebufferSampleLocationsfvNV ] ---

    /** {@code void glMulticastFramebufferSampleLocationsfvNV(GLuint gpu, GLuint framebuffer, GLuint start, GLsizei count, GLfloat const * v)} */
    public static native void nglMulticastFramebufferSampleLocationsfvNV(int gpu, int framebuffer, int start, int count, long v);

    /** {@code void glMulticastFramebufferSampleLocationsfvNV(GLuint gpu, GLuint framebuffer, GLuint start, GLsizei count, GLfloat const * v)} */
    public static void glMulticastFramebufferSampleLocationsfvNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int framebuffer, @NativeType("GLuint") int start, @NativeType("GLfloat const *") FloatBuffer v) {
        nglMulticastFramebufferSampleLocationsfvNV(gpu, framebuffer, start, v.remaining() >> 1, memAddress(v));
    }

    // --- [ glMulticastBarrierNV ] ---

    /** {@code void glMulticastBarrierNV(void)} */
    public static native void glMulticastBarrierNV();

    // --- [ glMulticastWaitSyncNV ] ---

    /** {@code void glMulticastWaitSyncNV(GLuint signalGpu, GLbitfield waitGpuMask)} */
    public static native void glMulticastWaitSyncNV(@NativeType("GLuint") int signalGpu, @NativeType("GLbitfield") int waitGpuMask);

    // --- [ glMulticastGetQueryObjectivNV ] ---

    /** {@code void glMulticastGetQueryObjectivNV(GLuint gpu, GLuint id, GLenum pname, GLint * params)} */
    public static native void nglMulticastGetQueryObjectivNV(int gpu, int id, int pname, long params);

    /** {@code void glMulticastGetQueryObjectivNV(GLuint gpu, GLuint id, GLenum pname, GLint * params)} */
    public static void glMulticastGetQueryObjectivNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglMulticastGetQueryObjectivNV(gpu, id, pname, memAddress(params));
    }

    /** {@code void glMulticastGetQueryObjectivNV(GLuint gpu, GLuint id, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glMulticastGetQueryObjectiNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglMulticastGetQueryObjectivNV(gpu, id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMulticastGetQueryObjectuivNV ] ---

    /** {@code void glMulticastGetQueryObjectuivNV(GLuint gpu, GLuint id, GLenum pname, GLuint * params)} */
    public static native void nglMulticastGetQueryObjectuivNV(int gpu, int id, int pname, long params);

    /** {@code void glMulticastGetQueryObjectuivNV(GLuint gpu, GLuint id, GLenum pname, GLuint * params)} */
    public static void glMulticastGetQueryObjectuivNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglMulticastGetQueryObjectuivNV(gpu, id, pname, memAddress(params));
    }

    /** {@code void glMulticastGetQueryObjectuivNV(GLuint gpu, GLuint id, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glMulticastGetQueryObjectuiNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglMulticastGetQueryObjectuivNV(gpu, id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMulticastGetQueryObjecti64vNV ] ---

    /** {@code void glMulticastGetQueryObjecti64vNV(GLuint gpu, GLuint id, GLenum pname, GLint64 * params)} */
    public static native void nglMulticastGetQueryObjecti64vNV(int gpu, int id, int pname, long params);

    /** {@code void glMulticastGetQueryObjecti64vNV(GLuint gpu, GLuint id, GLenum pname, GLint64 * params)} */
    public static void glMulticastGetQueryObjecti64vNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglMulticastGetQueryObjecti64vNV(gpu, id, pname, memAddress(params));
    }

    /** {@code void glMulticastGetQueryObjecti64vNV(GLuint gpu, GLuint id, GLenum pname, GLint64 * params)} */
    @NativeType("void")
    public static long glMulticastGetQueryObjecti64NV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglMulticastGetQueryObjecti64vNV(gpu, id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMulticastGetQueryObjectui64vNV ] ---

    /** {@code void glMulticastGetQueryObjectui64vNV(GLuint gpu, GLuint id, GLenum pname, GLuint64 * params)} */
    public static native void nglMulticastGetQueryObjectui64vNV(int gpu, int id, int pname, long params);

    /** {@code void glMulticastGetQueryObjectui64vNV(GLuint gpu, GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glMulticastGetQueryObjectui64vNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglMulticastGetQueryObjectui64vNV(gpu, id, pname, memAddress(params));
    }

    /** {@code void glMulticastGetQueryObjectui64vNV(GLuint gpu, GLuint id, GLenum pname, GLuint64 * params)} */
    @NativeType("void")
    public static long glMulticastGetQueryObjectui64NV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglMulticastGetQueryObjectui64vNV(gpu, id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glMulticastBufferSubDataNV(GLbitfield gpuMask, GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data) {
        long __functionAddress = GL.getICD().glMulticastBufferSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /** {@code void glMulticastBufferSubDataNV(GLbitfield gpuMask, GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data) {
        long __functionAddress = GL.getICD().glMulticastBufferSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glMulticastBufferSubDataNV(GLbitfield gpuMask, GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data) {
        long __functionAddress = GL.getICD().glMulticastBufferSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glMulticastBufferSubDataNV(GLbitfield gpuMask, GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") double[] data) {
        long __functionAddress = GL.getICD().glMulticastBufferSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** {@code void glMulticastFramebufferSampleLocationsfvNV(GLuint gpu, GLuint framebuffer, GLuint start, GLsizei count, GLfloat const * v)} */
    public static void glMulticastFramebufferSampleLocationsfvNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int framebuffer, @NativeType("GLuint") int start, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glMulticastFramebufferSampleLocationsfvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(gpu, framebuffer, start, v.length >> 1, v, __functionAddress);
    }

    /** {@code void glMulticastGetQueryObjectivNV(GLuint gpu, GLuint id, GLenum pname, GLint * params)} */
    public static void glMulticastGetQueryObjectivNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glMulticastGetQueryObjectivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(gpu, id, pname, params, __functionAddress);
    }

    /** {@code void glMulticastGetQueryObjectuivNV(GLuint gpu, GLuint id, GLenum pname, GLuint * params)} */
    public static void glMulticastGetQueryObjectuivNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glMulticastGetQueryObjectuivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(gpu, id, pname, params, __functionAddress);
    }

    /** {@code void glMulticastGetQueryObjecti64vNV(GLuint gpu, GLuint id, GLenum pname, GLint64 * params)} */
    public static void glMulticastGetQueryObjecti64vNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glMulticastGetQueryObjecti64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(gpu, id, pname, params, __functionAddress);
    }

    /** {@code void glMulticastGetQueryObjectui64vNV(GLuint gpu, GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glMulticastGetQueryObjectui64vNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GL.getICD().glMulticastGetQueryObjectui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(gpu, id, pname, params, __functionAddress);
    }

}