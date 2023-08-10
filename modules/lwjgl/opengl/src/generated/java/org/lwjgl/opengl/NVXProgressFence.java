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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NVX/NVX_progress_fence.txt">NVX_progress_fence</a> extension.
 * 
 * <p>This extension uses the concept of GL semaphores as defined in {@link EXTSemaphore EXT_semaphore} to better coordinate operations between multiple GPU command
 * streams. A semaphore type called "progress fence" is derived from the GL semaphore. The progress fence semaphore is created by
 * {@link #glCreateProgressFenceNVX CreateProgressFenceNVX}) returning the name of a newly created semaphore object. Like other semaphores, these are signaled by the GL server. Each
 * signal operation is queued in the GPU command stream with an associated fence value that is written to the semaphore at the completion of a signal
 * operation.</p>
 * 
 * <p>A GL server wait can be added to the command stream using {@link #glWaitSemaphoreui64NVX WaitSemaphoreui64NVX}. This blocks the GPU until the progress fence semaphore reaches or
 * exceeds the specified fence value.</p>
 * 
 * <p>A GL client wait can be initiated using {@link #glClientWaitSemaphoreui64NVX ClientWaitSemaphoreui64NVX}. This blocks the CPU until the specified fence value is reached.</p>
 * 
 * <p>Requires {@code EXT_external_objects} and {@code EXT_external_objects_win32}.</p>
 */
public class NVXProgressFence {

    static { GL.initialize(); }

    protected NVXProgressFence() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCreateProgressFenceNVX ] ---

    @NativeType("GLuint")
    public static native int glCreateProgressFenceNVX();

    // --- [ glSignalSemaphoreui64NVX ] ---

    public static native void nglSignalSemaphoreui64NVX(int signalGpu, int fenceObjectCount, long semaphoreArray, long fenceValueArray);

    public static void glSignalSemaphoreui64NVX(@NativeType("GLuint") int signalGpu, @NativeType("GLuint const *") IntBuffer semaphoreArray, @NativeType("GLuint64 const *") LongBuffer fenceValueArray) {
        if (CHECKS) {
            check(fenceValueArray, semaphoreArray.remaining());
        }
        nglSignalSemaphoreui64NVX(signalGpu, semaphoreArray.remaining(), memAddress(semaphoreArray), memAddress(fenceValueArray));
    }

    // --- [ glWaitSemaphoreui64NVX ] ---

    public static native void nglWaitSemaphoreui64NVX(int waitGpu, int fenceObjectCount, long semaphoreArray, long fenceValueArray);

    public static void glWaitSemaphoreui64NVX(@NativeType("GLuint") int waitGpu, @NativeType("GLuint const *") IntBuffer semaphoreArray, @NativeType("GLuint64 const *") LongBuffer fenceValueArray) {
        if (CHECKS) {
            check(fenceValueArray, semaphoreArray.remaining());
        }
        nglWaitSemaphoreui64NVX(waitGpu, semaphoreArray.remaining(), memAddress(semaphoreArray), memAddress(fenceValueArray));
    }

    // --- [ glClientWaitSemaphoreui64NVX ] ---

    public static native void nglClientWaitSemaphoreui64NVX(int fenceObjectCount, long semaphoreArray, long fenceValueArray);

    public static void glClientWaitSemaphoreui64NVX(@NativeType("GLuint const *") IntBuffer semaphoreArray, @NativeType("GLuint64 const *") LongBuffer fenceValueArray) {
        if (CHECKS) {
            check(fenceValueArray, semaphoreArray.remaining());
        }
        nglClientWaitSemaphoreui64NVX(semaphoreArray.remaining(), memAddress(semaphoreArray), memAddress(fenceValueArray));
    }

    /** Array version of: {@link #glSignalSemaphoreui64NVX SignalSemaphoreui64NVX} */
    public static void glSignalSemaphoreui64NVX(@NativeType("GLuint") int signalGpu, @NativeType("GLuint const *") int[] semaphoreArray, @NativeType("GLuint64 const *") long[] fenceValueArray) {
        long __functionAddress = GL.getICD().glSignalSemaphoreui64NVX;
        if (CHECKS) {
            check(__functionAddress);
            check(fenceValueArray, semaphoreArray.length);
        }
        callPPV(signalGpu, semaphoreArray.length, semaphoreArray, fenceValueArray, __functionAddress);
    }

    /** Array version of: {@link #glWaitSemaphoreui64NVX WaitSemaphoreui64NVX} */
    public static void glWaitSemaphoreui64NVX(@NativeType("GLuint") int waitGpu, @NativeType("GLuint const *") int[] semaphoreArray, @NativeType("GLuint64 const *") long[] fenceValueArray) {
        long __functionAddress = GL.getICD().glWaitSemaphoreui64NVX;
        if (CHECKS) {
            check(__functionAddress);
            check(fenceValueArray, semaphoreArray.length);
        }
        callPPV(waitGpu, semaphoreArray.length, semaphoreArray, fenceValueArray, __functionAddress);
    }

    /** Array version of: {@link #glClientWaitSemaphoreui64NVX ClientWaitSemaphoreui64NVX} */
    public static void glClientWaitSemaphoreui64NVX(@NativeType("GLuint const *") int[] semaphoreArray, @NativeType("GLuint64 const *") long[] fenceValueArray) {
        long __functionAddress = GL.getICD().glClientWaitSemaphoreui64NVX;
        if (CHECKS) {
            check(__functionAddress);
            check(fenceValueArray, semaphoreArray.length);
        }
        callPPV(semaphoreArray.length, semaphoreArray, fenceValueArray, __functionAddress);
    }

}