/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTShaderImageLoadStore {

    static { GL.initialize(); }

    public static final int
        GL_MAX_IMAGE_UNITS_EXT                               = 0x8F38,
        GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS_EXT = 0x8F39,
        GL_MAX_IMAGE_SAMPLES_EXT                             = 0x906D;

    public static final int
        GL_IMAGE_BINDING_NAME_EXT    = 0x8F3A,
        GL_IMAGE_BINDING_LEVEL_EXT   = 0x8F3B,
        GL_IMAGE_BINDING_LAYERED_EXT = 0x8F3C,
        GL_IMAGE_BINDING_LAYER_EXT   = 0x8F3D,
        GL_IMAGE_BINDING_ACCESS_EXT  = 0x8F3E,
        GL_IMAGE_BINDING_FORMAT_EXT  = 0x906E;

    public static final int
        GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT_EXT = 0x1,
        GL_ELEMENT_ARRAY_BARRIER_BIT_EXT       = 0x2,
        GL_UNIFORM_BARRIER_BIT_EXT             = 0x4,
        GL_TEXTURE_FETCH_BARRIER_BIT_EXT       = 0x8,
        GL_SHADER_IMAGE_ACCESS_BARRIER_BIT_EXT = 0x20,
        GL_COMMAND_BARRIER_BIT_EXT             = 0x40,
        GL_PIXEL_BUFFER_BARRIER_BIT_EXT        = 0x80,
        GL_TEXTURE_UPDATE_BARRIER_BIT_EXT      = 0x100,
        GL_BUFFER_UPDATE_BARRIER_BIT_EXT       = 0x200,
        GL_FRAMEBUFFER_BARRIER_BIT_EXT         = 0x400,
        GL_TRANSFORM_FEEDBACK_BARRIER_BIT_EXT  = 0x800,
        GL_ATOMIC_COUNTER_BARRIER_BIT_EXT      = 0x1000,
        GL_ALL_BARRIER_BITS_EXT                = 0xFFFFFFFF;

    public static final int
        GL_IMAGE_1D_EXT                                = 0x904C,
        GL_IMAGE_2D_EXT                                = 0x904D,
        GL_IMAGE_3D_EXT                                = 0x904E,
        GL_IMAGE_2D_RECT_EXT                           = 0x904F,
        GL_IMAGE_CUBE_EXT                              = 0x9050,
        GL_IMAGE_BUFFER_EXT                            = 0x9051,
        GL_IMAGE_1D_ARRAY_EXT                          = 0x9052,
        GL_IMAGE_2D_ARRAY_EXT                          = 0x9053,
        GL_IMAGE_CUBE_MAP_ARRAY_EXT                    = 0x9054,
        GL_IMAGE_2D_MULTISAMPLE_EXT                    = 0x9055,
        GL_IMAGE_2D_MULTISAMPLE_ARRAY_EXT              = 0x9056,
        GL_INT_IMAGE_1D_EXT                            = 0x9057,
        GL_INT_IMAGE_2D_EXT                            = 0x9058,
        GL_INT_IMAGE_3D_EXT                            = 0x9059,
        GL_INT_IMAGE_2D_RECT_EXT                       = 0x905A,
        GL_INT_IMAGE_CUBE_EXT                          = 0x905B,
        GL_INT_IMAGE_BUFFER_EXT                        = 0x905C,
        GL_INT_IMAGE_1D_ARRAY_EXT                      = 0x905D,
        GL_INT_IMAGE_2D_ARRAY_EXT                      = 0x905E,
        GL_INT_IMAGE_CUBE_MAP_ARRAY_EXT                = 0x905F,
        GL_INT_IMAGE_2D_MULTISAMPLE_EXT                = 0x9060,
        GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT          = 0x9061,
        GL_UNSIGNED_INT_IMAGE_1D_EXT                   = 0x9062,
        GL_UNSIGNED_INT_IMAGE_2D_EXT                   = 0x9063,
        GL_UNSIGNED_INT_IMAGE_3D_EXT                   = 0x9064,
        GL_UNSIGNED_INT_IMAGE_2D_RECT_EXT              = 0x9065,
        GL_UNSIGNED_INT_IMAGE_CUBE_EXT                 = 0x9066,
        GL_UNSIGNED_INT_IMAGE_BUFFER_EXT               = 0x9067,
        GL_UNSIGNED_INT_IMAGE_1D_ARRAY_EXT             = 0x9068,
        GL_UNSIGNED_INT_IMAGE_2D_ARRAY_EXT             = 0x9069,
        GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY_EXT       = 0x906A,
        GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_EXT       = 0x906B,
        GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT = 0x906C;

    protected EXTShaderImageLoadStore() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindImageTextureEXT ] ---

    /** {@code void glBindImageTextureEXT(GLuint index, GLuint texture, GLint level, GLboolean layered, GLint layer, GLenum access, GLint format)} */
    public static native void glBindImageTextureEXT(@NativeType("GLuint") int index, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLboolean") boolean layered, @NativeType("GLint") int layer, @NativeType("GLenum") int access, @NativeType("GLint") int format);

    // --- [ glMemoryBarrierEXT ] ---

    /** {@code void glMemoryBarrierEXT(GLbitfield barriers)} */
    public static native void glMemoryBarrierEXT(@NativeType("GLbitfield") int barriers);

}