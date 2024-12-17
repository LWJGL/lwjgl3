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
import static org.lwjgl.system.MemoryUtil.*;

public class NVXGpuMulticast2 {

    static { GL.initialize(); }

    protected NVXGpuMulticast2() {
        throw new UnsupportedOperationException();
    }

    // --- [ glAsyncCopyImageSubDataNVX ] ---

    /** {@code GLuint glAsyncCopyImageSubDataNVX(GLsizei waitSemaphoreCount, GLuint const * waitSemaphoreArray, GLuint64 const * waitValueArray, GLuint srcGpu, GLbitfield dstGpuMask, GLuint srcName, GLenum srcTarget, GLint srcLevel, GLint srcX, GLint srcY, GLint srcZ, GLuint dstName, GLenum dstTarget, GLint dstLevel, GLint dstX, GLint dstY, GLint dstZ, GLsizei srcWidth, GLsizei srcHeight, GLsizei srcDepth, GLsizei signalSemaphoreCount, GLuint const * signalSemaphoreArray, GLuint64 const * signalValueArray)} */
    public static native int nglAsyncCopyImageSubDataNVX(int waitSemaphoreCount, long waitSemaphoreArray, long waitValueArray, int srcGpu, int dstGpuMask, int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth, int signalSemaphoreCount, long signalSemaphoreArray, long signalValueArray);

    /** {@code GLuint glAsyncCopyImageSubDataNVX(GLsizei waitSemaphoreCount, GLuint const * waitSemaphoreArray, GLuint64 const * waitValueArray, GLuint srcGpu, GLbitfield dstGpuMask, GLuint srcName, GLenum srcTarget, GLint srcLevel, GLint srcX, GLint srcY, GLint srcZ, GLuint dstName, GLenum dstTarget, GLint dstLevel, GLint dstX, GLint dstY, GLint dstZ, GLsizei srcWidth, GLsizei srcHeight, GLsizei srcDepth, GLsizei signalSemaphoreCount, GLuint const * signalSemaphoreArray, GLuint64 const * signalValueArray)} */
    @NativeType("GLuint")
    public static int glAsyncCopyImageSubDataNVX(@NativeType("GLuint const *") IntBuffer waitSemaphoreArray, @NativeType("GLuint64 const *") LongBuffer waitValueArray, @NativeType("GLuint") int srcGpu, @NativeType("GLbitfield") int dstGpuMask, @NativeType("GLuint") int srcName, @NativeType("GLenum") int srcTarget, @NativeType("GLint") int srcLevel, @NativeType("GLint") int srcX, @NativeType("GLint") int srcY, @NativeType("GLint") int srcZ, @NativeType("GLuint") int dstName, @NativeType("GLenum") int dstTarget, @NativeType("GLint") int dstLevel, @NativeType("GLint") int dstX, @NativeType("GLint") int dstY, @NativeType("GLint") int dstZ, @NativeType("GLsizei") int srcWidth, @NativeType("GLsizei") int srcHeight, @NativeType("GLsizei") int srcDepth, @NativeType("GLuint const *") IntBuffer signalSemaphoreArray, @NativeType("GLuint64 const *") LongBuffer signalValueArray) {
        if (CHECKS) {
            check(waitValueArray, waitSemaphoreArray.remaining());
            check(signalValueArray, signalSemaphoreArray.remaining());
        }
        return nglAsyncCopyImageSubDataNVX(waitSemaphoreArray.remaining(), memAddress(waitSemaphoreArray), memAddress(waitValueArray), srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth, signalSemaphoreArray.remaining(), memAddress(signalSemaphoreArray), memAddress(signalValueArray));
    }

    // --- [ glAsyncCopyBufferSubDataNVX ] ---

    /** {@code GLsync glAsyncCopyBufferSubDataNVX(GLsizei waitSemaphoreCount, GLuint const * waitSemaphoreArray, GLuint64 const * fenceValueArray, GLuint readGpu, GLbitfield writeGpuMask, GLuint readBuffer, GLuint writeBuffer, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size, GLsizei signalSemaphoreCount, GLuint const * signalSemaphoreArray, GLuint64 const * signalValueArray)} */
    public static native long nglAsyncCopyBufferSubDataNVX(int waitSemaphoreCount, long waitSemaphoreArray, long fenceValueArray, int readGpu, int writeGpuMask, int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size, int signalSemaphoreCount, long signalSemaphoreArray, long signalValueArray);

    /** {@code GLsync glAsyncCopyBufferSubDataNVX(GLsizei waitSemaphoreCount, GLuint const * waitSemaphoreArray, GLuint64 const * fenceValueArray, GLuint readGpu, GLbitfield writeGpuMask, GLuint readBuffer, GLuint writeBuffer, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size, GLsizei signalSemaphoreCount, GLuint const * signalSemaphoreArray, GLuint64 const * signalValueArray)} */
    @NativeType("GLsync")
    public static long glAsyncCopyBufferSubDataNVX(@NativeType("GLuint const *") IntBuffer waitSemaphoreArray, @NativeType("GLuint64 const *") LongBuffer fenceValueArray, @NativeType("GLuint") int readGpu, @NativeType("GLbitfield") int writeGpuMask, @NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size, @NativeType("GLuint const *") IntBuffer signalSemaphoreArray, @NativeType("GLuint64 const *") LongBuffer signalValueArray) {
        if (CHECKS) {
            check(fenceValueArray, waitSemaphoreArray.remaining());
            check(signalValueArray, signalSemaphoreArray.remaining());
        }
        return nglAsyncCopyBufferSubDataNVX(waitSemaphoreArray.remaining(), memAddress(waitSemaphoreArray), memAddress(fenceValueArray), readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size, signalSemaphoreArray.remaining(), memAddress(signalSemaphoreArray), memAddress(signalValueArray));
    }

    // --- [ glUploadGpuMaskNVX ] ---

    /** {@code void glUploadGpuMaskNVX(GLbitfield mask)} */
    public static native void glUploadGpuMaskNVX(@NativeType("GLbitfield") int mask);

    // --- [ glMulticastViewportArrayvNVX ] ---

    /** {@code void glMulticastViewportArrayvNVX(GLuint gpu, GLuint first, GLsizei count, GLfloat const * v)} */
    public static native void nglMulticastViewportArrayvNVX(int gpu, int first, int count, long v);

    /** {@code void glMulticastViewportArrayvNVX(GLuint gpu, GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glMulticastViewportArrayvNVX(@NativeType("GLuint") int gpu, @NativeType("GLuint") int first, @NativeType("GLfloat const *") FloatBuffer v) {
        nglMulticastViewportArrayvNVX(gpu, first, v.remaining() >> 2, memAddress(v));
    }

    // --- [ glMulticastScissorArrayvNVX ] ---

    /** {@code void glMulticastScissorArrayvNVX(GLuint gpu, GLuint first, GLsizei count, GLint const * v)} */
    public static native void nglMulticastScissorArrayvNVX(int gpu, int first, int count, long v);

    /** {@code void glMulticastScissorArrayvNVX(GLuint gpu, GLuint first, GLsizei count, GLint const * v)} */
    public static void glMulticastScissorArrayvNVX(@NativeType("GLuint") int gpu, @NativeType("GLuint") int first, @NativeType("GLint const *") IntBuffer v) {
        nglMulticastScissorArrayvNVX(gpu, first, v.remaining() >> 2, memAddress(v));
    }

    // --- [ glMulticastViewportPositionWScaleNVX ] ---

    /** {@code void glMulticastViewportPositionWScaleNVX(GLuint gpu, GLuint index, GLfloat xcoeff, GLfloat ycoeff)} */
    public static native void glMulticastViewportPositionWScaleNVX(@NativeType("GLuint") int gpu, @NativeType("GLuint") int index, @NativeType("GLfloat") float xcoeff, @NativeType("GLfloat") float ycoeff);

    /** {@code GLuint glAsyncCopyImageSubDataNVX(GLsizei waitSemaphoreCount, GLuint const * waitSemaphoreArray, GLuint64 const * waitValueArray, GLuint srcGpu, GLbitfield dstGpuMask, GLuint srcName, GLenum srcTarget, GLint srcLevel, GLint srcX, GLint srcY, GLint srcZ, GLuint dstName, GLenum dstTarget, GLint dstLevel, GLint dstX, GLint dstY, GLint dstZ, GLsizei srcWidth, GLsizei srcHeight, GLsizei srcDepth, GLsizei signalSemaphoreCount, GLuint const * signalSemaphoreArray, GLuint64 const * signalValueArray)} */
    @NativeType("GLuint")
    public static int glAsyncCopyImageSubDataNVX(@NativeType("GLuint const *") int[] waitSemaphoreArray, @NativeType("GLuint64 const *") long[] waitValueArray, @NativeType("GLuint") int srcGpu, @NativeType("GLbitfield") int dstGpuMask, @NativeType("GLuint") int srcName, @NativeType("GLenum") int srcTarget, @NativeType("GLint") int srcLevel, @NativeType("GLint") int srcX, @NativeType("GLint") int srcY, @NativeType("GLint") int srcZ, @NativeType("GLuint") int dstName, @NativeType("GLenum") int dstTarget, @NativeType("GLint") int dstLevel, @NativeType("GLint") int dstX, @NativeType("GLint") int dstY, @NativeType("GLint") int dstZ, @NativeType("GLsizei") int srcWidth, @NativeType("GLsizei") int srcHeight, @NativeType("GLsizei") int srcDepth, @NativeType("GLuint const *") int[] signalSemaphoreArray, @NativeType("GLuint64 const *") long[] signalValueArray) {
        long __functionAddress = GL.getICD().glAsyncCopyImageSubDataNVX;
        if (CHECKS) {
            check(__functionAddress);
            check(waitValueArray, waitSemaphoreArray.length);
            check(signalValueArray, signalSemaphoreArray.length);
        }
        return callPPPPI(waitSemaphoreArray.length, waitSemaphoreArray, waitValueArray, srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth, signalSemaphoreArray.length, signalSemaphoreArray, signalValueArray, __functionAddress);
    }

    /** {@code GLsync glAsyncCopyBufferSubDataNVX(GLsizei waitSemaphoreCount, GLuint const * waitSemaphoreArray, GLuint64 const * fenceValueArray, GLuint readGpu, GLbitfield writeGpuMask, GLuint readBuffer, GLuint writeBuffer, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size, GLsizei signalSemaphoreCount, GLuint const * signalSemaphoreArray, GLuint64 const * signalValueArray)} */
    @NativeType("GLsync")
    public static long glAsyncCopyBufferSubDataNVX(@NativeType("GLuint const *") int[] waitSemaphoreArray, @NativeType("GLuint64 const *") long[] fenceValueArray, @NativeType("GLuint") int readGpu, @NativeType("GLbitfield") int writeGpuMask, @NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size, @NativeType("GLuint const *") int[] signalSemaphoreArray, @NativeType("GLuint64 const *") long[] signalValueArray) {
        long __functionAddress = GL.getICD().glAsyncCopyBufferSubDataNVX;
        if (CHECKS) {
            check(__functionAddress);
            check(fenceValueArray, waitSemaphoreArray.length);
            check(signalValueArray, signalSemaphoreArray.length);
        }
        return callPPPPPPPP(waitSemaphoreArray.length, waitSemaphoreArray, fenceValueArray, readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size, signalSemaphoreArray.length, signalSemaphoreArray, signalValueArray, __functionAddress);
    }

    /** {@code void glMulticastViewportArrayvNVX(GLuint gpu, GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glMulticastViewportArrayvNVX(@NativeType("GLuint") int gpu, @NativeType("GLuint") int first, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glMulticastViewportArrayvNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(gpu, first, v.length >> 2, v, __functionAddress);
    }

    /** {@code void glMulticastScissorArrayvNVX(GLuint gpu, GLuint first, GLsizei count, GLint const * v)} */
    public static void glMulticastScissorArrayvNVX(@NativeType("GLuint") int gpu, @NativeType("GLuint") int first, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glMulticastScissorArrayvNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(gpu, first, v.length >> 2, v, __functionAddress);
    }

}