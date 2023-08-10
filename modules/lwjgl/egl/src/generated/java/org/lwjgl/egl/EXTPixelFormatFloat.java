/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_pixel_format_float.txt">EXT_pixel_format_float</a> extension.
 * 
 * <p>This extensions aims to provide similar functionality as {@code GL_ARB_color_buffer_float}, {@code WGL_ARB_pixel_format_float} and
 * {@code GLX_ARB_fbconfig_float}. This extension allows exposing new {@code EGLConfigs} that support formats with floating-point RGBA components. This is
 * done by introducing a new {@code EGLConfig} attribute that represents the component type, i.e. fixed-point or floating-point. Such new
 * {@code EGLConfigs} can be used to create floating-point rendering surfaces and contexts.</p>
 */
public final class EXTPixelFormatFloat {

    /** Accepted as an attribute name in the {@code attrib_list} argument of {@link EGL10#eglChooseConfig ChooseConfig}, and the {@code attribute} argument of {@link EGL10#eglGetConfigAttrib GetConfigAttrib}. */
    public static final int EGL_COLOR_COMPONENT_TYPE_EXT = 0x3339;

    /** Accepted as attribute values for the {@link #EGL_COLOR_COMPONENT_TYPE_EXT COLOR_COMPONENT_TYPE_EXT} attribute of {@link EGL10#eglChooseConfig ChooseConfig}. */
    public static final int
        EGL_COLOR_COMPONENT_TYPE_FIXED_EXT = 0x333A,
        EGL_COLOR_COMPONENT_TYPE_FLOAT_EXT = 0x333B;

    private EXTPixelFormatFloat() {}

}