/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVStreamMetadata {

    public static final int
        EGL_MAX_STREAM_METADATA_BLOCKS_NV     = 0x3250,
        EGL_MAX_STREAM_METADATA_BLOCK_SIZE_NV = 0x3251,
        EGL_MAX_STREAM_METADATA_TOTAL_SIZE_NV = 0x3252;

    public static final int
        EGL_PRODUCER_METADATA_NV = 0x3253,
        EGL_CONSUMER_METADATA_NV = 0x3254,
        EGL_PENDING_METADATA_NV  = 0x3328;

    public static final int
        EGL_METADATA0_SIZE_NV = 0x3255,
        EGL_METADATA1_SIZE_NV = 0x3256,
        EGL_METADATA2_SIZE_NV = 0x3257,
        EGL_METADATA3_SIZE_NV = 0x3258,
        EGL_METADATA0_TYPE_NV = 0x3259,
        EGL_METADATA1_TYPE_NV = 0x325A,
        EGL_METADATA2_TYPE_NV = 0x325B,
        EGL_METADATA3_TYPE_NV = 0x325C;

    protected NVStreamMetadata() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQueryDisplayAttribNV ] ---

    /** {@code EGLBoolean eglQueryDisplayAttribNV(EGLDisplay dpy, EGLint attribute, EGLAttrib * value)} */
    public static int neglQueryDisplayAttribNV(long dpy, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryDisplayAttribNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPI(dpy, attribute, value, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryDisplayAttribNV(EGLDisplay dpy, EGLint attribute, EGLAttrib * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDisplayAttribNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryDisplayAttribNV(dpy, attribute, memAddress(value)) != 0;
    }

    // --- [ eglSetStreamMetadataNV ] ---

    /** {@code EGLBoolean eglSetStreamMetadataNV(EGLDisplay dpy, EGLStreamKHR stream, EGLint n, EGLint offset, EGLint size, void const * data)} */
    public static int neglSetStreamMetadataNV(long dpy, long stream, int n, int offset, int size, long data) {
        long __functionAddress = EGL.getCapabilities().eglSetStreamMetadataNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPPI(dpy, stream, n, offset, size, data, __functionAddress);
    }

    /** {@code EGLBoolean eglSetStreamMetadataNV(EGLDisplay dpy, EGLStreamKHR stream, EGLint n, EGLint offset, EGLint size, void const * data)} */
    @NativeType("EGLBoolean")
    public static boolean eglSetStreamMetadataNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLint") int n, @NativeType("EGLint") int offset, @NativeType("void const *") ByteBuffer data) {
        return neglSetStreamMetadataNV(dpy, stream, n, offset, data.remaining(), memAddress(data)) != 0;
    }

    // --- [ eglQueryStreamMetadataNV ] ---

    /** {@code EGLBoolean eglQueryStreamMetadataNV(EGLDisplay dpy, EGLStreamKHR stream, EGLenum name, EGLint n, EGLint offset, EGLint size, void * data)} */
    public static int neglQueryStreamMetadataNV(long dpy, long stream, int name, int n, int offset, int size, long data) {
        long __functionAddress = EGL.getCapabilities().eglQueryStreamMetadataNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPPI(dpy, stream, name, n, offset, size, data, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryStreamMetadataNV(EGLDisplay dpy, EGLStreamKHR stream, EGLenum name, EGLint n, EGLint offset, EGLint size, void * data)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryStreamMetadataNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLenum") int name, @NativeType("EGLint") int n, @NativeType("EGLint") int offset, @NativeType("void *") ByteBuffer data) {
        return neglQueryStreamMetadataNV(dpy, stream, name, n, offset, data.remaining(), memAddress(data)) != 0;
    }

}