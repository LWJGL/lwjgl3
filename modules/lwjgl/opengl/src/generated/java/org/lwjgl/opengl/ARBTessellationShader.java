/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBTessellationShader {

    static { GL.initialize(); }

    public static final int GL_PATCHES = 0xE;

    public static final int GL_PATCH_VERTICES = 0x8E72;

    public static final int
        GL_PATCH_DEFAULT_INNER_LEVEL = 0x8E73,
        GL_PATCH_DEFAULT_OUTER_LEVEL = 0x8E74;

    public static final int
        GL_TESS_CONTROL_OUTPUT_VERTICES = 0x8E75,
        GL_TESS_GEN_MODE                = 0x8E76,
        GL_TESS_GEN_SPACING             = 0x8E77,
        GL_TESS_GEN_VERTEX_ORDER        = 0x8E78,
        GL_TESS_GEN_POINT_MODE          = 0x8E79;

    public static final int GL_ISOLINES = 0x8E7A;

    public static final int
        GL_FRACTIONAL_ODD  = 0x8E7B,
        GL_FRACTIONAL_EVEN = 0x8E7C;

    public static final int
        GL_MAX_PATCH_VERTICES                              = 0x8E7D,
        GL_MAX_TESS_GEN_LEVEL                              = 0x8E7E,
        GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS             = 0x8E7F,
        GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS          = 0x8E80,
        GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS            = 0x8E81,
        GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS         = 0x8E82,
        GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS              = 0x8E83,
        GL_MAX_TESS_PATCH_COMPONENTS                       = 0x8E84,
        GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS        = 0x8E85,
        GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS           = 0x8E86,
        GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS                 = 0x8E89,
        GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS              = 0x8E8A,
        GL_MAX_TESS_CONTROL_INPUT_COMPONENTS               = 0x886C,
        GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS            = 0x886D,
        GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS    = 0x8E1E,
        GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E1F;

    public static final int
        GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER    = 0x84F0,
        GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x84F1;

    public static final int
        GL_TESS_EVALUATION_SHADER = 0x8E87,
        GL_TESS_CONTROL_SHADER    = 0x8E88;

    protected ARBTessellationShader() {
        throw new UnsupportedOperationException();
    }

    // --- [ glPatchParameteri ] ---

    /** {@code void glPatchParameteri(GLenum pname, GLint value)} */
    public static void glPatchParameteri(@NativeType("GLenum") int pname, @NativeType("GLint") int value) {
        GL40C.glPatchParameteri(pname, value);
    }

    // --- [ glPatchParameterfv ] ---

    /** {@code void glPatchParameterfv(GLenum pname, GLfloat const * values)} */
    public static void nglPatchParameterfv(int pname, long values) {
        GL40C.nglPatchParameterfv(pname, values);
    }

    /** {@code void glPatchParameterfv(GLenum pname, GLfloat const * values)} */
    public static void glPatchParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer values) {
        GL40C.glPatchParameterfv(pname, values);
    }

    /** {@code void glPatchParameterfv(GLenum pname, GLfloat const * values)} */
    public static void glPatchParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] values) {
        GL40C.glPatchParameterfv(pname, values);
    }

}