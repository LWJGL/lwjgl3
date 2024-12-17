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

public class NVXProgressFence {

    static { GL.initialize(); }

    protected NVXProgressFence() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCreateProgressFenceNVX ] ---

    /** {@code GLuint glCreateProgressFenceNVX(void)} */
    @NativeType("GLuint")
    public static native int glCreateProgressFenceNVX();

    // --- [ glSignalSemaphoreui64NVX ] ---

    /** {@code void glSignalSemaphoreui64NVX(GLuint signalGpu, GLsizei fenceObjectCount, GLuint const * semaphoreArray, GLuint64 const * fenceValueArray)} */
    public static native void nglSignalSemaphoreui64NVX(int signalGpu, int fenceObjectCount, long semaphoreArray, long fenceValueArray);

    /** {@code void glSignalSemaphoreui64NVX(GLuint signalGpu, GLsizei fenceObjectCount, GLuint const * semaphoreArray, GLuint64 const * fenceValueArray)} */
    public static void glSignalSemaphoreui64NVX(@NativeType("GLuint") int signalGpu, @NativeType("GLuint const *") IntBuffer semaphoreArray, @NativeType("GLuint64 const *") LongBuffer fenceValueArray) {
        if (CHECKS) {
            check(fenceValueArray, semaphoreArray.remaining());
        }
        nglSignalSemaphoreui64NVX(signalGpu, semaphoreArray.remaining(), memAddress(semaphoreArray), memAddress(fenceValueArray));
    }

    // --- [ glWaitSemaphoreui64NVX ] ---

    /** {@code void glWaitSemaphoreui64NVX(GLuint waitGpu, GLsizei fenceObjectCount, GLuint const * semaphoreArray, GLuint64 const * fenceValueArray)} */
    public static native void nglWaitSemaphoreui64NVX(int waitGpu, int fenceObjectCount, long semaphoreArray, long fenceValueArray);

    /** {@code void glWaitSemaphoreui64NVX(GLuint waitGpu, GLsizei fenceObjectCount, GLuint const * semaphoreArray, GLuint64 const * fenceValueArray)} */
    public static void glWaitSemaphoreui64NVX(@NativeType("GLuint") int waitGpu, @NativeType("GLuint const *") IntBuffer semaphoreArray, @NativeType("GLuint64 const *") LongBuffer fenceValueArray) {
        if (CHECKS) {
            check(fenceValueArray, semaphoreArray.remaining());
        }
        nglWaitSemaphoreui64NVX(waitGpu, semaphoreArray.remaining(), memAddress(semaphoreArray), memAddress(fenceValueArray));
    }

    // --- [ glClientWaitSemaphoreui64NVX ] ---

    /** {@code void glClientWaitSemaphoreui64NVX(GLsizei fenceObjectCount, GLuint const * semaphoreArray, GLuint64 const * fenceValueArray)} */
    public static native void nglClientWaitSemaphoreui64NVX(int fenceObjectCount, long semaphoreArray, long fenceValueArray);

    /** {@code void glClientWaitSemaphoreui64NVX(GLsizei fenceObjectCount, GLuint const * semaphoreArray, GLuint64 const * fenceValueArray)} */
    public static void glClientWaitSemaphoreui64NVX(@NativeType("GLuint const *") IntBuffer semaphoreArray, @NativeType("GLuint64 const *") LongBuffer fenceValueArray) {
        if (CHECKS) {
            check(fenceValueArray, semaphoreArray.remaining());
        }
        nglClientWaitSemaphoreui64NVX(semaphoreArray.remaining(), memAddress(semaphoreArray), memAddress(fenceValueArray));
    }

    /** {@code void glSignalSemaphoreui64NVX(GLuint signalGpu, GLsizei fenceObjectCount, GLuint const * semaphoreArray, GLuint64 const * fenceValueArray)} */
    public static void glSignalSemaphoreui64NVX(@NativeType("GLuint") int signalGpu, @NativeType("GLuint const *") int[] semaphoreArray, @NativeType("GLuint64 const *") long[] fenceValueArray) {
        long __functionAddress = GL.getICD().glSignalSemaphoreui64NVX;
        if (CHECKS) {
            check(__functionAddress);
            check(fenceValueArray, semaphoreArray.length);
        }
        callPPV(signalGpu, semaphoreArray.length, semaphoreArray, fenceValueArray, __functionAddress);
    }

    /** {@code void glWaitSemaphoreui64NVX(GLuint waitGpu, GLsizei fenceObjectCount, GLuint const * semaphoreArray, GLuint64 const * fenceValueArray)} */
    public static void glWaitSemaphoreui64NVX(@NativeType("GLuint") int waitGpu, @NativeType("GLuint const *") int[] semaphoreArray, @NativeType("GLuint64 const *") long[] fenceValueArray) {
        long __functionAddress = GL.getICD().glWaitSemaphoreui64NVX;
        if (CHECKS) {
            check(__functionAddress);
            check(fenceValueArray, semaphoreArray.length);
        }
        callPPV(waitGpu, semaphoreArray.length, semaphoreArray, fenceValueArray, __functionAddress);
    }

    /** {@code void glClientWaitSemaphoreui64NVX(GLsizei fenceObjectCount, GLuint const * semaphoreArray, GLuint64 const * fenceValueArray)} */
    public static void glClientWaitSemaphoreui64NVX(@NativeType("GLuint const *") int[] semaphoreArray, @NativeType("GLuint64 const *") long[] fenceValueArray) {
        long __functionAddress = GL.getICD().glClientWaitSemaphoreui64NVX;
        if (CHECKS) {
            check(__functionAddress);
            check(fenceValueArray, semaphoreArray.length);
        }
        callPPV(semaphoreArray.length, semaphoreArray, fenceValueArray, __functionAddress);
    }

}