/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTGeometryShader4 {

    static { GL.initialize(); }

    public static final int GL_GEOMETRY_SHADER_EXT = 0x8DD9;

    public static final int
        GL_GEOMETRY_VERTICES_OUT_EXT = 0x8DDA,
        GL_GEOMETRY_INPUT_TYPE_EXT   = 0x8DDB,
        GL_GEOMETRY_OUTPUT_TYPE_EXT  = 0x8DDC;

    public static final int
        GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT     = 0x8C29,
        GL_MAX_GEOMETRY_VARYING_COMPONENTS_EXT      = 0x8DDD,
        GL_MAX_VERTEX_VARYING_COMPONENTS_EXT        = 0x8DDE,
        GL_MAX_VARYING_COMPONENTS_EXT               = 0x8B4B,
        GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT      = 0x8DDF,
        GL_MAX_GEOMETRY_OUTPUT_VERTICES_EXT         = 0x8DE0,
        GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT = 0x8DE1;

    public static final int
        GL_LINES_ADJACENCY_EXT          = 0xA,
        GL_LINE_STRIP_ADJACENCY_EXT     = 0xB,
        GL_TRIANGLES_ADJACENCY_EXT      = 0xC,
        GL_TRIANGLE_STRIP_ADJACENCY_EXT = 0xD;

    public static final int
        GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT = 0x8DA8,
        GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_EXT   = 0x8DA9;

    public static final int
        GL_FRAMEBUFFER_ATTACHMENT_LAYERED_EXT       = 0x8DA7,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT = 0x8CD4;

    public static final int GL_PROGRAM_POINT_SIZE_EXT = 0x8642;

    protected EXTGeometryShader4() {
        throw new UnsupportedOperationException();
    }

    // --- [ glProgramParameteriEXT ] ---

    /** {@code void glProgramParameteriEXT(GLuint program, GLenum pname, GLint value)} */
    public static native void glProgramParameteriEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint") int value);

    // --- [ glFramebufferTextureEXT ] ---

    /** {@code void glFramebufferTextureEXT(GLenum target, GLenum attachment, GLuint texture, GLint level)} */
    public static native void glFramebufferTextureEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glFramebufferTextureLayerEXT ] ---

    /** {@code void glFramebufferTextureLayerEXT(GLenum target, GLenum attachment, GLuint texture, GLint level, GLint layer)} */
    public static void glFramebufferTextureLayerEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        EXTTextureArray.glFramebufferTextureLayerEXT(target, attachment, texture, level, layer);
    }

    // --- [ glFramebufferTextureFaceEXT ] ---

    /** {@code void glFramebufferTextureFaceEXT(GLenum target, GLenum attachment, GLuint texture, GLint level, GLenum face)} */
    public static native void glFramebufferTextureFaceEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int face);

}