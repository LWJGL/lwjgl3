/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class EXTGeometryShader {

    static { GLES.initialize(); }

    public static final int GL_GEOMETRY_SHADER_EXT = 0x8DD9;

    public static final int GL_GEOMETRY_SHADER_BIT_EXT = 0x4;

    public static final int
        GL_GEOMETRY_LINKED_VERTICES_OUT_EXT = 0x8916,
        GL_GEOMETRY_LINKED_INPUT_TYPE_EXT   = 0x8917,
        GL_GEOMETRY_LINKED_OUTPUT_TYPE_EXT  = 0x8918,
        GL_GEOMETRY_SHADER_INVOCATIONS_EXT  = 0x887F;

    public static final int
        GL_LAYER_PROVOKING_VERTEX_EXT                   = 0x825E,
        GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT          = 0x8DDF,
        GL_MAX_GEOMETRY_UNIFORM_BLOCKS_EXT              = 0x8A2C,
        GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS_EXT = 0x8A32,
        GL_MAX_GEOMETRY_INPUT_COMPONENTS_EXT            = 0x9123,
        GL_MAX_GEOMETRY_OUTPUT_COMPONENTS_EXT           = 0x9124,
        GL_MAX_GEOMETRY_OUTPUT_VERTICES_EXT             = 0x8DE0,
        GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT     = 0x8DE1,
        GL_MAX_GEOMETRY_SHADER_INVOCATIONS_EXT          = 0x8E5A,
        GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT         = 0x8C29,
        GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS_EXT      = 0x92CF,
        GL_MAX_GEOMETRY_ATOMIC_COUNTERS_EXT             = 0x92D5,
        GL_MAX_GEOMETRY_IMAGE_UNIFORMS_EXT              = 0x90CD,
        GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS_EXT       = 0x90D7;

    public static final int
        GL_FIRST_VERTEX_CONVENTION_EXT = 0x8E4D,
        GL_LAST_VERTEX_CONVENTION_EXT  = 0x8E4E,
        GL_UNDEFINED_VERTEX_EXT        = 0x8260;

    public static final int GL_PRIMITIVES_GENERATED_EXT = 0x8C87;

    public static final int
        GL_LINES_ADJACENCY_EXT          = 0xA,
        GL_LINE_STRIP_ADJACENCY_EXT     = 0xB,
        GL_TRIANGLES_ADJACENCY_EXT      = 0xC,
        GL_TRIANGLE_STRIP_ADJACENCY_EXT = 0xD;

    public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS_EXT = 0x9312;

    public static final int GL_MAX_FRAMEBUFFER_LAYERS_EXT = 0x9317;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT = 0x8DA8;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_EXT = 0x8DA7;

    public static final int GL_REFERENCED_BY_GEOMETRY_SHADER_EXT = 0x9309;

    protected EXTGeometryShader() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferTextureEXT ] ---

    /** {@code void glFramebufferTextureEXT(GLenum target, GLenum attachment, GLuint texture, GLint level)} */
    public static native void glFramebufferTextureEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

}