/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_color_buffer_float.txt">GLX_ARB_fbconfig_float</a> extension.
 * 
 * <p>The standard OpenGL pipeline is based on a fixed-point pipeline. While color components are nominally floating-point values in the pipeline, components
 * are frequently clamped to the range [0,1] to accomodate the fixed-point color buffer representation and allow for fixed-point computational hardware.</p>
 * 
 * <p>This extension adds pixel formats or visuals with floating-point RGBA color components and controls for clamping of color components within the pipeline.</p>
 */
public final class GLXARBFBConfigFloat {

    /** Accepted as values of the {@code render_type} arguments in the {@link GLX13#glXCreateNewContext CreateNewContext} and {@link GLX#glXCreateContext CreateContext} functions. */
    public static final int GLX_RGBA_FLOAT_TYPE_ARB = 0x20B9;

    /** Accepted as a bit set in the GLX_RENDER_TYPE variable. */
    public static final int GLX_RGBA_FLOAT_BIT_ARB = 0x4;

    private GLXARBFBConfigFloat() {}

}