/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_no_config_context.txt">KHR_no_config_context</a> extension.
 * 
 * <p>Modern GPUs allow contexts to render to almost any combination of supported color and auxiliary buffer formats. Traditionally EGL context creation is
 * done with respect to an {@code EGLConfig} specifying buffer formats, and constrains contexts to only work with surfaces created with a "compatible"
 * config.</p>
 * 
 * <p>This extension allows creation of GL &amp; ES contexts without specifying an {@code EGLConfig}.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4}.</p>
 */
public final class KHRNoConfigContext {

    /** Accepted as the {@code config} parameter of {@link EGL10#eglCreateContext CreateContext}. */
    public static final long EGL_NO_CONFIG_KHR = 0L;

    private KHRNoConfigContext() {}

}