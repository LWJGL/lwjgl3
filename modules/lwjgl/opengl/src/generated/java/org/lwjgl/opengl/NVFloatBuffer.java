/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_float_buffer.txt">NV_float_buffer</a> extension.
 * 
 * <p>This extension builds upon NV_fragment_program to provide a framebuffer and texture format that allows fragment programs to read and write
 * unconstrained floating point data.</p>
 */
public final class NVFloatBuffer {

    /** Accepted by the {@code internalformat} parameter of TexImage2D and CopyTexImage2D. */
    public static final int
        GL_FLOAT_R_NV      = 0x8880,
        GL_FLOAT_RG_NV     = 0x8881,
        GL_FLOAT_RGB_NV    = 0x8882,
        GL_FLOAT_RGBA_NV   = 0x8883,
        GL_FLOAT_R16_NV    = 0x8884,
        GL_FLOAT_R32_NV    = 0x8885,
        GL_FLOAT_RG16_NV   = 0x8886,
        GL_FLOAT_RG32_NV   = 0x8887,
        GL_FLOAT_RGB16_NV  = 0x8888,
        GL_FLOAT_RGB32_NV  = 0x8889,
        GL_FLOAT_RGBA16_NV = 0x888A,
        GL_FLOAT_RGBA32_NV = 0x888B;

    /** Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv. */
    public static final int GL_TEXTURE_FLOAT_COMPONENTS_NV = 0x888C;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_FLOAT_CLEAR_COLOR_VALUE_NV = 0x888D,
        GL_FLOAT_RGBA_MODE_NV         = 0x888E;

    private NVFloatBuffer() {}

}