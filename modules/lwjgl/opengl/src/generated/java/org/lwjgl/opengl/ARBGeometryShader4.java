/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBGeometryShader4 {

    static { GL.initialize(); }

    public static final int GL_GEOMETRY_SHADER_ARB = 0x8DD9;

    public static final int
        GL_GEOMETRY_VERTICES_OUT_ARB = 0x8DDA,
        GL_GEOMETRY_INPUT_TYPE_ARB   = 0x8DDB,
        GL_GEOMETRY_OUTPUT_TYPE_ARB  = 0x8DDC;

    public static final int
        GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_ARB     = 0x8C29,
        GL_MAX_GEOMETRY_VARYING_COMPONENTS_ARB      = 0x8DDD,
        GL_MAX_VERTEX_VARYING_COMPONENTS_ARB        = 0x8DDE,
        GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_ARB      = 0x8DDF,
        GL_MAX_GEOMETRY_OUTPUT_VERTICES_ARB         = 0x8DE0,
        GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_ARB = 0x8DE1;

    public static final int
        GL_LINES_ADJACENCY_ARB          = 0xA,
        GL_LINE_STRIP_ADJACENCY_ARB     = 0xB,
        GL_TRIANGLES_ADJACENCY_ARB      = 0xC,
        GL_TRIANGLE_STRIP_ADJACENCY_ARB = 0xD;

    public static final int
        GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_ARB = 0x8DA8,
        GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_ARB   = 0x8DA9;

    public static final int
        GL_FRAMEBUFFER_ATTACHMENT_LAYERED_ARB   = 0x8DA7,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;

    public static final int GL_PROGRAM_POINT_SIZE_ARB = 0x8642;

    protected ARBGeometryShader4() {
        throw new UnsupportedOperationException();
    }

    // --- [ glProgramParameteriARB ] ---

    /** {@code void glProgramParameteriARB(GLuint program, GLenum pname, GLint value)} */
    public static native void glProgramParameteriARB(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint") int value);

    // --- [ glFramebufferTextureARB ] ---

    /** {@code void glFramebufferTextureARB(GLenum target, GLenum attachment, GLuint texture, GLint level)} */
    public static native void glFramebufferTextureARB(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glFramebufferTextureLayerARB ] ---

    /** {@code void glFramebufferTextureLayerARB(GLenum target, GLenum attachment, GLuint texture, GLint level, GLint layer)} */
    public static native void glFramebufferTextureLayerARB(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer);

    // --- [ glFramebufferTextureFaceARB ] ---

    /** {@code void glFramebufferTextureFaceARB(GLenum target, GLenum attachment, GLuint texture, GLint level, GLenum face)} */
    public static native void glFramebufferTextureFaceARB(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int face);

}