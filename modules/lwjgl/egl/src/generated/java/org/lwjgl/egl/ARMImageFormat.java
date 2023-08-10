/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/ARM/EGL_ARM_image_format.txt">ARM_image_format</a> extension.
 * 
 * <p>When an {@code EGLImage} is created from an existing image resource the implementation will deduce the format of the image data from that resource. In
 * some cases, however, the implementation may not know how to map the existing image resource to a known format. This extension extends the list of
 * attributes accepted by {@link KHRImageBase#eglCreateImageKHR CreateImageKHR} such that applications can tell the implementation how to interpret the data.</p>
 */
public final class ARMImageFormat {

    /** Accepted as an attribute name in the {@code attrib_list} argument of {@link KHRImageBase#eglCreateImageKHR CreateImageKHR}. */
    public static final int EGL_COLOR_COMPONENT_TYPE_EXT = 0x3339;

    /** Accepted as attribute values for the {@link #EGL_COLOR_COMPONENT_TYPE_EXT COLOR_COMPONENT_TYPE_EXT} attribute of {@link KHRImageBase#eglCreateImageKHR CreateImageKHR}. */
    public static final int
        EGL_COLOR_COMPONENT_TYPE_FIXED_EXT            = 0x333A,
        EGL_COLOR_COMPONENT_TYPE_FLOAT_EXT            = 0x333B,
        EGL_COLOR_COMPONENT_TYPE_UNSIGNED_INTEGER_ARM = 0x3287,
        EGL_COLOR_COMPONENT_TYPE_INTEGER_ARM          = 0x3288;

    private ARMImageFormat() {}

}