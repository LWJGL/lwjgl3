/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_stream_consumer_eglimage.txt">NV_stream_consumer_eglimage</a> extension.
 * 
 * <p>An {@code EGLStream} consists of a sequence of image frames. This extension allows these frames to be acquired as {@code EGLImages}. Frames from the
 * stream would be used as the content for the EGLImage.</p>
 * 
 * <p>Requires {@link KHRStream KHR_stream} and {@link EXTSyncReuse EXT_sync_reuse}.</p>
 */
public class NVStreamConsumerEGLImage {

    /** Accepted by the {@code target} parameter of {@link EGL15#eglCreateImage CreateImage}. */
    public static final int EGL_STREAM_CONSUMER_IMAGE_NV = 0x3373;

    /** Returned as an {@code event} from {@link #eglQueryStreamConsumerEventNV QueryStreamConsumerEventNV}. */
    public static final int
        EGL_STREAM_IMAGE_ADD_NV       = 0x3374,
        EGL_STREAM_IMAGE_REMOVE_NV    = 0x3375,
        EGL_STREAM_IMAGE_AVAILABLE_NV = 0x3376;

    protected NVStreamConsumerEGLImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglStreamImageConsumerConnectNV ] ---

    public static int neglStreamImageConsumerConnectNV(long dpy, long stream, int num_modifiers, long modifiers, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglStreamImageConsumerConnectNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPPPI(dpy, stream, num_modifiers, modifiers, attrib_list, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglStreamImageConsumerConnectNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLuint64KHR const *") LongBuffer modifiers, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglStreamImageConsumerConnectNV(dpy, stream, modifiers.remaining(), memAddress(modifiers), memAddressSafe(attrib_list)) != 0;
    }

    // --- [ eglQueryStreamConsumerEventNV ] ---

    public static int neglQueryStreamConsumerEventNV(long dpy, long stream, long timeout, long event, long aux) {
        long __functionAddress = EGL.getCapabilities().eglQueryStreamConsumerEventNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPJPPI(dpy, stream, timeout, event, aux, __functionAddress);
    }

    @NativeType("EGLint")
    public static int eglQueryStreamConsumerEventNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLTime") long timeout, @NativeType("EGLenum *") IntBuffer event, @NativeType("EGLAttrib *") PointerBuffer aux) {
        if (CHECKS) {
            check(event, 1);
            check(aux, 1);
        }
        return neglQueryStreamConsumerEventNV(dpy, stream, timeout, memAddress(event), memAddress(aux));
    }

    // --- [ eglStreamAcquireImageNV ] ---

    public static int neglStreamAcquireImageNV(long dpy, long stream, long pImage, long sync) {
        long __functionAddress = EGL.getCapabilities().eglStreamAcquireImageNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
            check(sync);
        }
        return callPPPPI(dpy, stream, pImage, sync, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglStreamAcquireImageNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLImage *") PointerBuffer pImage, @NativeType("EGLSync") long sync) {
        if (CHECKS) {
            check(pImage, 1);
        }
        return neglStreamAcquireImageNV(dpy, stream, memAddress(pImage), sync) != 0;
    }

    // --- [ eglStreamReleaseImageNV ] ---

    @NativeType("EGLBoolean")
    public static boolean eglStreamReleaseImageNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLImage") long image, @NativeType("EGLSync") long sync) {
        long __functionAddress = EGL.getCapabilities().eglStreamReleaseImageNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
            check(image);
            check(sync);
        }
        return callPPPPI(dpy, stream, image, sync, __functionAddress) != 0;
    }

    /** Array version of: {@link #eglStreamImageConsumerConnectNV StreamImageConsumerConnectNV} */
    @NativeType("EGLBoolean")
    public static boolean eglStreamImageConsumerConnectNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLuint64KHR const *") long[] modifiers, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglStreamImageConsumerConnectNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPPI(dpy, stream, modifiers.length, modifiers, memAddressSafe(attrib_list), __functionAddress) != 0;
    }

    /** Array version of: {@link #eglQueryStreamConsumerEventNV QueryStreamConsumerEventNV} */
    @NativeType("EGLint")
    public static int eglQueryStreamConsumerEventNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLTime") long timeout, @NativeType("EGLenum *") int[] event, @NativeType("EGLAttrib *") PointerBuffer aux) {
        long __functionAddress = EGL.getCapabilities().eglQueryStreamConsumerEventNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
            check(event, 1);
            check(aux, 1);
        }
        return callPPJPPI(dpy, stream, timeout, event, memAddress(aux), __functionAddress);
    }

}