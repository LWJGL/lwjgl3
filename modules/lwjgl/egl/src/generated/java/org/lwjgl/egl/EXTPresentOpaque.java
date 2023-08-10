/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_present_opaque.txt">EXT_present_opaque</a> extension.
 * 
 * <p>This extension adds a new EGL surface attribute {@link #EGL_PRESENT_OPAQUE_EXT PRESENT_OPAQUE_EXT} to indicate that the surface should be presented as opaque, disregarding any alpha
 * channel if present. If surface attribute {@code EGL_PRESENT_OPAQUE_EXT} is {@link EGL10#EGL_TRUE TRUE}, then the surface will be presented as opaque.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4} and {@link KHRImageBase KHR_image_base}.</p>
 */
public final class EXTPresentOpaque {

    /** New {@code EGLSurface} attribute name. */
    public static final int EGL_PRESENT_OPAQUE_EXT = 0x31DF;

    private EXTPresentOpaque() {}

}