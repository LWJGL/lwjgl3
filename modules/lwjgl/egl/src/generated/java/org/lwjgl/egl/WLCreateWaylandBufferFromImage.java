/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/WL/EGL_WL_create_wayland_buffer_from_image.txt">WL_create_wayland_buffer_from_image</a> extension.
 * 
 * <p>This extension provides an entry point to create a {@code wl_buffer} which shares its contents with a given {@code EGLImage}. The expected use case for
 * this is in a nested Wayland compositor which is using subsurfaces to present buffers from its clients. Using this extension it can attach the client
 * buffers directly to the subsurface without having to blit the contents into an intermediate buffer. The compositing can then be done in the parent
 * compositor.</p>
 * 
 * <p>The nested compositor can create an {@code EGLImage} from a client buffer resource using the existing {@link WLBindWaylandDisplay WL_bind_wayland_display} extension. It
 * should also be possible to create buffers using other types of images although there is no expected use case for that.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4} and {@link KHRImageBase KHR_image_base}.</p>
 */
public class WLCreateWaylandBufferFromImage {

    protected WLCreateWaylandBufferFromImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateWaylandBufferFromImageWL ] ---

    @NativeType("struct wl_buffer *")
    public static long eglCreateWaylandBufferFromImageWL(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image) {
        long __functionAddress = EGL.getCapabilities().eglCreateWaylandBufferFromImageWL;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(image);
        }
        return callPPP(dpy, image, __functionAddress);
    }

}