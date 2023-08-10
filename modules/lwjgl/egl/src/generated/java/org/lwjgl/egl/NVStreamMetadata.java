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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_stream_metadata.txt">NV_stream_metadata</a> extension.
 * 
 * <p>Application suites which make use of streams to transmit images may need to communicate additional data between the producer and consumer, synchronized
 * with the frame updates. This data may change infrequently, such as a movie title and track number to be displayed to the user, or every frame, such as
 * a focal length and exposure time used to process the image. Transmitting this data outside the scope of the stream may be inconvenient, particularly in
 * the case of cross-process streams. But the nature of the data is highly application-dependent, so it is not feasible for an EGL implementation to
 * define specific extensions for a broad range of application data.</p>
 * 
 * <p>This extension provides a means for an application (or application suite in the cross-process case) to associate arbitrary metadata with a stream.
 * Multiple metadata fields are available, allowing them to be updated and used independently by separate subcomponents of producers and consumers,
 * respectively. The format of the data is determined by the application, which is responsible for writing and reading it correctly.</p>
 * 
 * <p>Requires {@link KHRStream KHR_stream}.</p>
 */
public class NVStreamMetadata {

    /** Accepted as {@code attribute} by {@link #eglQueryDisplayAttribNV QueryDisplayAttribNV}. */
    public static final int
        EGL_MAX_STREAM_METADATA_BLOCKS_NV     = 0x3250,
        EGL_MAX_STREAM_METADATA_BLOCK_SIZE_NV = 0x3251,
        EGL_MAX_STREAM_METADATA_TOTAL_SIZE_NV = 0x3252;

    /** Accepted as {@code name} by {@link #eglQueryStreamMetadataNV QueryStreamMetadataNV}. */
    public static final int
        EGL_PRODUCER_METADATA_NV = 0x3253,
        EGL_CONSUMER_METADATA_NV = 0x3254,
        EGL_PENDING_METADATA_NV  = 0x3328;

    /** Accepted in {@code attrib_list} by {@link KHRStream#eglCreateStreamKHR CreateStreamKHR} and as {@code attribute} by {@link KHRStream#eglQueryStreamKHR QueryStreamKHR}. */
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

    public static int neglQueryDisplayAttribNV(long dpy, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryDisplayAttribNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPI(dpy, attribute, value, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryDisplayAttribNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryDisplayAttribNV(dpy, attribute, memAddress(value)) != 0;
    }

    // --- [ eglSetStreamMetadataNV ] ---

    public static int neglSetStreamMetadataNV(long dpy, long stream, int n, int offset, int size, long data) {
        long __functionAddress = EGL.getCapabilities().eglSetStreamMetadataNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPPI(dpy, stream, n, offset, size, data, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglSetStreamMetadataNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLint") int n, @NativeType("EGLint") int offset, @NativeType("void const *") ByteBuffer data) {
        return neglSetStreamMetadataNV(dpy, stream, n, offset, data.remaining(), memAddress(data)) != 0;
    }

    // --- [ eglQueryStreamMetadataNV ] ---

    public static int neglQueryStreamMetadataNV(long dpy, long stream, int name, int n, int offset, int size, long data) {
        long __functionAddress = EGL.getCapabilities().eglQueryStreamMetadataNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPPI(dpy, stream, name, n, offset, size, data, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryStreamMetadataNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLenum") int name, @NativeType("EGLint") int n, @NativeType("EGLint") int offset, @NativeType("void *") ByteBuffer data) {
        return neglQueryStreamMetadataNV(dpy, stream, name, n, offset, data.remaining(), memAddress(data)) != 0;
    }

}