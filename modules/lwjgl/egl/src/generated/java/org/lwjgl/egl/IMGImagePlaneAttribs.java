/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/IMG/EGL_IMG_image_plane_attribs.txt">IMG_image_plane_attribs</a> extension.
 * 
 * <p>This extension allows creating an EGLImage from a single plane of a multi-planar Android native image buffer (ANativeWindowBuffer) or a native pixmap
 * (EGLNativePixmap).</p>
 */
public final class IMGImagePlaneAttribs {

    /** Accepted by the {@code attrib_list} parameter of eglCreateImageKHR. */
    public static final int
        EGL_NATIVE_BUFFER_MULTIPLANE_SEPARATE_IMG = 0x3105,
        EGL_NATIVE_BUFFER_PLANE_OFFSET_IMG        = 0x3106;

    private IMGImagePlaneAttribs() {}

}