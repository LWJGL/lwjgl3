/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_mutable_render_buffer.txt">KHR_mutable_render_buffer</a> extension.
 * 
 * <p>The aim of this extension is to allow toggling of front-buffer rendering for window surfaces after their initial creation.</p>
 * 
 * <p>This allows for implementations to switch between back-buffered and single-buffered rendering without requiring re-creation of the surface. It is not
 * expected for toggling to be a frequent event.</p>
 * 
 * <p>This extension does not guarantee when rendering results appear on-screen. To avoid incorrect results, applications will need to use mechanisms not
 * included in this extension to synchronize rendering with the display. This functionality is not covered by this extension, and vendors are encouraged
 * to provide guidelines on how this is achieved on their implementation.</p>
 * 
 * <p>Requires {@link EGL12 EGL 1.2}.</p>
 */
public final class KHRMutableRenderBuffer {

    /** Accepted as a new value for the {@link EGL10#EGL_SURFACE_TYPE SURFACE_TYPE} {@code EGLConfig} attribute. */
    public static final int EGL_MUTABLE_RENDER_BUFFER_BIT_KHR = 0x1000;

    private KHRMutableRenderBuffer() {}

}