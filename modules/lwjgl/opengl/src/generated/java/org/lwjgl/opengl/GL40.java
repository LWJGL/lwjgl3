/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

public class GL40 extends GL33 {

    static { GL.initialize(); }

    public static final int GL_DRAW_INDIRECT_BUFFER = 0x8F3F;

    public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 0x8F43;

    public static final int GL_GEOMETRY_SHADER_INVOCATIONS = 0x887F;

    public static final int
        GL_MAX_GEOMETRY_SHADER_INVOCATIONS    = 0x8E5A,
        GL_MIN_FRAGMENT_INTERPOLATION_OFFSET  = 0x8E5B,
        GL_MAX_FRAGMENT_INTERPOLATION_OFFSET  = 0x8E5C,
        GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = 0x8E5D;

    public static final int
        GL_DOUBLE_VEC2   = 0x8FFC,
        GL_DOUBLE_VEC3   = 0x8FFD,
        GL_DOUBLE_VEC4   = 0x8FFE,
        GL_DOUBLE_MAT2   = 0x8F46,
        GL_DOUBLE_MAT3   = 0x8F47,
        GL_DOUBLE_MAT4   = 0x8F48,
        GL_DOUBLE_MAT2x3 = 0x8F49,
        GL_DOUBLE_MAT2x4 = 0x8F4A,
        GL_DOUBLE_MAT3x2 = 0x8F4B,
        GL_DOUBLE_MAT3x4 = 0x8F4C,
        GL_DOUBLE_MAT4x2 = 0x8F4D,
        GL_DOUBLE_MAT4x3 = 0x8F4E;

    public static final int GL_SAMPLE_SHADING = 0x8C36;

    public static final int GL_MIN_SAMPLE_SHADING_VALUE = 0x8C37;

    public static final int
        GL_ACTIVE_SUBROUTINES                   = 0x8DE5,
        GL_ACTIVE_SUBROUTINE_UNIFORMS           = 0x8DE6,
        GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS  = 0x8E47,
        GL_ACTIVE_SUBROUTINE_MAX_LENGTH         = 0x8E48,
        GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 0x8E49;

    public static final int
        GL_MAX_SUBROUTINES                  = 0x8DE7,
        GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 0x8DE8;

    public static final int
        GL_NUM_COMPATIBLE_SUBROUTINES = 0x8E4A,
        GL_COMPATIBLE_SUBROUTINES     = 0x8E4B;

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

    public static final int GL_TEXTURE_CUBE_MAP_ARRAY = 0x9009;

    public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 0x900A;

    public static final int GL_PROXY_TEXTURE_CUBE_MAP_ARRAY = 0x900B;

    public static final int
        GL_SAMPLER_CUBE_MAP_ARRAY              = 0x900C,
        GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW       = 0x900D,
        GL_INT_SAMPLER_CUBE_MAP_ARRAY          = 0x900E,
        GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900F;

    public static final int
        GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5E,
        GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5F;

    public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;

    public static final int
        GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23,
        GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24,
        GL_TRANSFORM_FEEDBACK_BINDING       = 0x8E25;

    public static final int
        GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 0x8E70,
        GL_MAX_VERTEX_STREAMS             = 0x8E71;

    protected GL40() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendEquationi ] ---

    /** {@code void glBlendEquationi(GLuint buf, GLenum mode)} */
    public static void glBlendEquationi(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode) {
        GL40C.glBlendEquationi(buf, mode);
    }

    // --- [ glBlendEquationSeparatei ] ---

    /** {@code void glBlendEquationSeparatei(GLuint buf, GLenum modeRGB, GLenum modeAlpha)} */
    public static void glBlendEquationSeparatei(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha) {
        GL40C.glBlendEquationSeparatei(buf, modeRGB, modeAlpha);
    }

    // --- [ glBlendFunci ] ---

    /** {@code void glBlendFunci(GLuint buf, GLenum sfactor, GLenum dfactor)} */
    public static void glBlendFunci(@NativeType("GLuint") int buf, @NativeType("GLenum") int sfactor, @NativeType("GLenum") int dfactor) {
        GL40C.glBlendFunci(buf, sfactor, dfactor);
    }

    // --- [ glBlendFuncSeparatei ] ---

    /** {@code void glBlendFuncSeparatei(GLuint buf, GLenum srcRGB, GLenum dstRGB, GLenum srcAlpha, GLenum dstAlpha)} */
    public static void glBlendFuncSeparatei(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha) {
        GL40C.glBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    // --- [ glDrawArraysIndirect ] ---

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void nglDrawArraysIndirect(int mode, long indirect) {
        GL40C.nglDrawArraysIndirect(mode, indirect);
    }

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect) {
        GL40C.glDrawArraysIndirect(mode, indirect);
    }

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect) {
        GL40C.glDrawArraysIndirect(mode, indirect);
    }

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect) {
        GL40C.glDrawArraysIndirect(mode, indirect);
    }

    // --- [ glDrawElementsIndirect ] ---

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void nglDrawElementsIndirect(int mode, int type, long indirect) {
        GL40C.nglDrawElementsIndirect(mode, type, indirect);
    }

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect) {
        GL40C.glDrawElementsIndirect(mode, type, indirect);
    }

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect) {
        GL40C.glDrawElementsIndirect(mode, type, indirect);
    }

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect) {
        GL40C.glDrawElementsIndirect(mode, type, indirect);
    }

    // --- [ glUniform1d ] ---

    /** {@code void glUniform1d(GLint location, GLdouble x)} */
    public static void glUniform1d(@NativeType("GLint") int location, @NativeType("GLdouble") double x) {
        GL40C.glUniform1d(location, x);
    }

    // --- [ glUniform2d ] ---

    /** {@code void glUniform2d(GLint location, GLdouble x, GLdouble y)} */
    public static void glUniform2d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        GL40C.glUniform2d(location, x, y);
    }

    // --- [ glUniform3d ] ---

    /** {@code void glUniform3d(GLint location, GLdouble x, GLdouble y, GLdouble z)} */
    public static void glUniform3d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        GL40C.glUniform3d(location, x, y, z);
    }

    // --- [ glUniform4d ] ---

    /** {@code void glUniform4d(GLint location, GLdouble x, GLdouble y, GLdouble z, GLdouble w)} */
    public static void glUniform4d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        GL40C.glUniform4d(location, x, y, z, w);
    }

    // --- [ glUniform1dv ] ---

    /** {@code void glUniform1dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void nglUniform1dv(int location, int count, long value) {
        GL40C.nglUniform1dv(location, count, value);
    }

    /** {@code void glUniform1dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform1dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniform1dv(location, value);
    }

    // --- [ glUniform2dv ] ---

    /** {@code void glUniform2dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void nglUniform2dv(int location, int count, long value) {
        GL40C.nglUniform2dv(location, count, value);
    }

    /** {@code void glUniform2dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform2dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniform2dv(location, value);
    }

    // --- [ glUniform3dv ] ---

    /** {@code void glUniform3dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void nglUniform3dv(int location, int count, long value) {
        GL40C.nglUniform3dv(location, count, value);
    }

    /** {@code void glUniform3dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform3dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniform3dv(location, value);
    }

    // --- [ glUniform4dv ] ---

    /** {@code void glUniform4dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void nglUniform4dv(int location, int count, long value) {
        GL40C.nglUniform4dv(location, count, value);
    }

    /** {@code void glUniform4dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform4dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniform4dv(location, value);
    }

    // --- [ glUniformMatrix2dv ] ---

    /** {@code void glUniformMatrix2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix2dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix2dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix2dv(location, transpose, value);
    }

    // --- [ glUniformMatrix3dv ] ---

    /** {@code void glUniformMatrix3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix3dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix3dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix3dv(location, transpose, value);
    }

    // --- [ glUniformMatrix4dv ] ---

    /** {@code void glUniformMatrix4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix4dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix4dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix4dv(location, transpose, value);
    }

    // --- [ glUniformMatrix2x3dv ] ---

    /** {@code void glUniformMatrix2x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix2x3dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix2x3dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix2x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix2x3dv(location, transpose, value);
    }

    // --- [ glUniformMatrix2x4dv ] ---

    /** {@code void glUniformMatrix2x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix2x4dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix2x4dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix2x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix2x4dv(location, transpose, value);
    }

    // --- [ glUniformMatrix3x2dv ] ---

    /** {@code void glUniformMatrix3x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix3x2dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix3x2dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix3x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix3x2dv(location, transpose, value);
    }

    // --- [ glUniformMatrix3x4dv ] ---

    /** {@code void glUniformMatrix3x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix3x4dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix3x4dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix3x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix3x4dv(location, transpose, value);
    }

    // --- [ glUniformMatrix4x2dv ] ---

    /** {@code void glUniformMatrix4x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix4x2dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix4x2dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix4x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix4x2dv(location, transpose, value);
    }

    // --- [ glUniformMatrix4x3dv ] ---

    /** {@code void glUniformMatrix4x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix4x3dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix4x3dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix4x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix4x3dv(location, transpose, value);
    }

    // --- [ glGetUniformdv ] ---

    /** {@code void glGetUniformdv(GLuint program, GLint location, GLdouble * params)} */
    public static void nglGetUniformdv(int program, int location, long params) {
        GL40C.nglGetUniformdv(program, location, params);
    }

    /** {@code void glGetUniformdv(GLuint program, GLint location, GLdouble * params)} */
    public static void glGetUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") DoubleBuffer params) {
        GL40C.glGetUniformdv(program, location, params);
    }

    /** {@code void glGetUniformdv(GLuint program, GLint location, GLdouble * params)} */
    @NativeType("void")
    public static double glGetUniformd(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return GL40C.glGetUniformd(program, location);
    }

    // --- [ glMinSampleShading ] ---

    /** {@code void glMinSampleShading(GLfloat value)} */
    public static void glMinSampleShading(@NativeType("GLfloat") float value) {
        GL40C.glMinSampleShading(value);
    }

    // --- [ glGetSubroutineUniformLocation ] ---

    /** {@code GLint glGetSubroutineUniformLocation(GLuint program, GLenum shadertype, GLchar const * name)} */
    public static int nglGetSubroutineUniformLocation(int program, int shadertype, long name) {
        return GL40C.nglGetSubroutineUniformLocation(program, shadertype, name);
    }

    /** {@code GLint glGetSubroutineUniformLocation(GLuint program, GLenum shadertype, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetSubroutineUniformLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") ByteBuffer name) {
        return GL40C.glGetSubroutineUniformLocation(program, shadertype, name);
    }

    /** {@code GLint glGetSubroutineUniformLocation(GLuint program, GLenum shadertype, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetSubroutineUniformLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") CharSequence name) {
        return GL40C.glGetSubroutineUniformLocation(program, shadertype, name);
    }

    // --- [ glGetSubroutineIndex ] ---

    /** {@code GLuint glGetSubroutineIndex(GLuint program, GLenum shadertype, GLchar const * name)} */
    public static int nglGetSubroutineIndex(int program, int shadertype, long name) {
        return GL40C.nglGetSubroutineIndex(program, shadertype, name);
    }

    /** {@code GLuint glGetSubroutineIndex(GLuint program, GLenum shadertype, GLchar const * name)} */
    @NativeType("GLuint")
    public static int glGetSubroutineIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") ByteBuffer name) {
        return GL40C.glGetSubroutineIndex(program, shadertype, name);
    }

    /** {@code GLuint glGetSubroutineIndex(GLuint program, GLenum shadertype, GLchar const * name)} */
    @NativeType("GLuint")
    public static int glGetSubroutineIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") CharSequence name) {
        return GL40C.glGetSubroutineIndex(program, shadertype, name);
    }

    // --- [ glGetActiveSubroutineUniformiv ] ---

    /** {@code void glGetActiveSubroutineUniformiv(GLuint program, GLenum shadertype, GLuint index, GLenum pname, GLint * values)} */
    public static void nglGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, long values) {
        GL40C.nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    /** {@code void glGetActiveSubroutineUniformiv(GLuint program, GLenum shadertype, GLuint index, GLenum pname, GLint * values)} */
    public static void glGetActiveSubroutineUniformiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer values) {
        GL40C.glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    /** {@code void glGetActiveSubroutineUniformiv(GLuint program, GLenum shadertype, GLuint index, GLenum pname, GLint * values)} */
    @NativeType("void")
    public static int glGetActiveSubroutineUniformi(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return GL40C.glGetActiveSubroutineUniformi(program, shadertype, index, pname);
    }

    // --- [ glGetActiveSubroutineUniformName ] ---

    /** {@code void glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void nglGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, long length, long name) {
        GL40C.nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, length, name);
    }

    /** {@code void glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        GL40C.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
    }

    /** {@code void glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufsize) {
        return GL40C.glGetActiveSubroutineUniformName(program, shadertype, index, bufsize);
    }

    /** {@code void glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index) {
        return glGetActiveSubroutineUniformName(program, shadertype, index, glGetActiveSubroutineUniformi(program, shadertype, index, GL31.GL_UNIFORM_NAME_LENGTH));
    }

    // --- [ glGetActiveSubroutineName ] ---

    /** {@code void glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void nglGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, long length, long name) {
        GL40C.nglGetActiveSubroutineName(program, shadertype, index, bufsize, length, name);
    }

    /** {@code void glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        GL40C.glGetActiveSubroutineName(program, shadertype, index, length, name);
    }

    /** {@code void glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufsize) {
        return GL40C.glGetActiveSubroutineName(program, shadertype, index, bufsize);
    }

    /** {@code void glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index) {
        return glGetActiveSubroutineName(program, shadertype, index, glGetProgramStagei(program, shadertype, GL_ACTIVE_SUBROUTINE_MAX_LENGTH));
    }

    // --- [ glUniformSubroutinesuiv ] ---

    /** {@code void glUniformSubroutinesuiv(GLenum shadertype, GLsizei count, GLuint const * indices)} */
    public static void nglUniformSubroutinesuiv(int shadertype, int count, long indices) {
        GL40C.nglUniformSubroutinesuiv(shadertype, count, indices);
    }

    /** {@code void glUniformSubroutinesuiv(GLenum shadertype, GLsizei count, GLuint const * indices)} */
    public static void glUniformSubroutinesuiv(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") IntBuffer indices) {
        GL40C.glUniformSubroutinesuiv(shadertype, indices);
    }

    /** {@code void glUniformSubroutinesuiv(GLenum shadertype, GLsizei count, GLuint const * indices)} */
    public static void glUniformSubroutinesui(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") int index) {
        GL40C.glUniformSubroutinesui(shadertype, index);
    }

    // --- [ glGetUniformSubroutineuiv ] ---

    /** {@code void glGetUniformSubroutineuiv(GLenum shadertype, GLint location, GLuint * params)} */
    public static void nglGetUniformSubroutineuiv(int shadertype, int location, long params) {
        GL40C.nglGetUniformSubroutineuiv(shadertype, location, params);
    }

    /** {@code void glGetUniformSubroutineuiv(GLenum shadertype, GLint location, GLuint * params)} */
    public static void glGetUniformSubroutineuiv(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        GL40C.glGetUniformSubroutineuiv(shadertype, location, params);
    }

    /** {@code void glGetUniformSubroutineuiv(GLenum shadertype, GLint location, GLuint * params)} */
    @NativeType("void")
    public static int glGetUniformSubroutineui(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location) {
        return GL40C.glGetUniformSubroutineui(shadertype, location);
    }

    // --- [ glGetProgramStageiv ] ---

    /** {@code void glGetProgramStageiv(GLuint program, GLenum shadertype, GLenum pname, GLint * values)} */
    public static void nglGetProgramStageiv(int program, int shadertype, int pname, long values) {
        GL40C.nglGetProgramStageiv(program, shadertype, pname, values);
    }

    /** {@code void glGetProgramStageiv(GLuint program, GLenum shadertype, GLenum pname, GLint * values)} */
    public static void glGetProgramStageiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer values) {
        GL40C.glGetProgramStageiv(program, shadertype, pname, values);
    }

    /** {@code void glGetProgramStageiv(GLuint program, GLenum shadertype, GLenum pname, GLint * values)} */
    @NativeType("void")
    public static int glGetProgramStagei(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname) {
        return GL40C.glGetProgramStagei(program, shadertype, pname);
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

    // --- [ glBindTransformFeedback ] ---

    /** {@code void glBindTransformFeedback(GLenum target, GLuint id)} */
    public static void glBindTransformFeedback(@NativeType("GLenum") int target, @NativeType("GLuint") int id) {
        GL40C.glBindTransformFeedback(target, id);
    }

    // --- [ glDeleteTransformFeedbacks ] ---

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static void nglDeleteTransformFeedbacks(int n, long ids) {
        GL40C.nglDeleteTransformFeedbacks(n, ids);
    }

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") IntBuffer ids) {
        GL40C.glDeleteTransformFeedbacks(ids);
    }

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int id) {
        GL40C.glDeleteTransformFeedbacks(id);
    }

    // --- [ glGenTransformFeedbacks ] ---

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static void nglGenTransformFeedbacks(int n, long ids) {
        GL40C.nglGenTransformFeedbacks(n, ids);
    }

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static void glGenTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids) {
        GL40C.glGenTransformFeedbacks(ids);
    }

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    @NativeType("void")
    public static int glGenTransformFeedbacks() {
        return GL40C.glGenTransformFeedbacks();
    }

    // --- [ glIsTransformFeedback ] ---

    /** {@code GLboolean glIsTransformFeedback(GLuint id)} */
    @NativeType("GLboolean")
    public static boolean glIsTransformFeedback(@NativeType("GLuint") int id) {
        return GL40C.glIsTransformFeedback(id);
    }

    // --- [ glPauseTransformFeedback ] ---

    /** {@code void glPauseTransformFeedback(void)} */
    public static void glPauseTransformFeedback() {
        GL40C.glPauseTransformFeedback();
    }

    // --- [ glResumeTransformFeedback ] ---

    /** {@code void glResumeTransformFeedback(void)} */
    public static void glResumeTransformFeedback() {
        GL40C.glResumeTransformFeedback();
    }

    // --- [ glDrawTransformFeedback ] ---

    /** {@code void glDrawTransformFeedback(GLenum mode, GLuint id)} */
    public static void glDrawTransformFeedback(@NativeType("GLenum") int mode, @NativeType("GLuint") int id) {
        GL40C.glDrawTransformFeedback(mode, id);
    }

    // --- [ glDrawTransformFeedbackStream ] ---

    /** {@code void glDrawTransformFeedbackStream(GLenum mode, GLuint id, GLuint stream)} */
    public static void glDrawTransformFeedbackStream(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLuint") int stream) {
        GL40C.glDrawTransformFeedbackStream(mode, id, stream);
    }

    // --- [ glBeginQueryIndexed ] ---

    /** {@code void glBeginQueryIndexed(GLenum target, GLuint index, GLuint id)} */
    public static void glBeginQueryIndexed(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int id) {
        GL40C.glBeginQueryIndexed(target, index, id);
    }

    // --- [ glEndQueryIndexed ] ---

    /** {@code void glEndQueryIndexed(GLenum target, GLuint index)} */
    public static void glEndQueryIndexed(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        GL40C.glEndQueryIndexed(target, index);
    }

    // --- [ glGetQueryIndexediv ] ---

    /** {@code void glGetQueryIndexediv(GLenum target, GLuint index, GLenum pname, GLint * params)} */
    public static void nglGetQueryIndexediv(int target, int index, int pname, long params) {
        GL40C.nglGetQueryIndexediv(target, index, pname, params);
    }

    /** {@code void glGetQueryIndexediv(GLenum target, GLuint index, GLenum pname, GLint * params)} */
    public static void glGetQueryIndexediv(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL40C.glGetQueryIndexediv(target, index, pname, params);
    }

    /** {@code void glGetQueryIndexediv(GLenum target, GLuint index, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetQueryIndexedi(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return GL40C.glGetQueryIndexedi(target, index, pname);
    }

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect) {
        GL40C.glDrawArraysIndirect(mode, indirect);
    }

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect) {
        GL40C.glDrawElementsIndirect(mode, type, indirect);
    }

    /** {@code void glUniform1dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform1dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniform1dv(location, value);
    }

    /** {@code void glUniform2dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform2dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniform2dv(location, value);
    }

    /** {@code void glUniform3dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform3dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniform3dv(location, value);
    }

    /** {@code void glUniform4dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform4dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniform4dv(location, value);
    }

    /** {@code void glUniformMatrix2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix2dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix3dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix4dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix2x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix2x3dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix2x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix2x4dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix3x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix3x2dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix3x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix3x4dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix4x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix4x2dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix4x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix4x3dv(location, transpose, value);
    }

    /** {@code void glGetUniformdv(GLuint program, GLint location, GLdouble * params)} */
    public static void glGetUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") double[] params) {
        GL40C.glGetUniformdv(program, location, params);
    }

    /** {@code void glGetActiveSubroutineUniformiv(GLuint program, GLenum shadertype, GLuint index, GLenum pname, GLint * values)} */
    public static void glGetActiveSubroutineUniformiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] values) {
        GL40C.glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    /** {@code void glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer name) {
        GL40C.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
    }

    /** {@code void glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer name) {
        GL40C.glGetActiveSubroutineName(program, shadertype, index, length, name);
    }

    /** {@code void glUniformSubroutinesuiv(GLenum shadertype, GLsizei count, GLuint const * indices)} */
    public static void glUniformSubroutinesuiv(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") int[] indices) {
        GL40C.glUniformSubroutinesuiv(shadertype, indices);
    }

    /** {@code void glGetUniformSubroutineuiv(GLenum shadertype, GLint location, GLuint * params)} */
    public static void glGetUniformSubroutineuiv(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        GL40C.glGetUniformSubroutineuiv(shadertype, location, params);
    }

    /** {@code void glGetProgramStageiv(GLuint program, GLenum shadertype, GLenum pname, GLint * values)} */
    public static void glGetProgramStageiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] values) {
        GL40C.glGetProgramStageiv(program, shadertype, pname, values);
    }

    /** {@code void glPatchParameterfv(GLenum pname, GLfloat const * values)} */
    public static void glPatchParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] values) {
        GL40C.glPatchParameterfv(pname, values);
    }

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int[] ids) {
        GL40C.glDeleteTransformFeedbacks(ids);
    }

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static void glGenTransformFeedbacks(@NativeType("GLuint *") int[] ids) {
        GL40C.glGenTransformFeedbacks(ids);
    }

    /** {@code void glGetQueryIndexediv(GLenum target, GLuint index, GLenum pname, GLint * params)} */
    public static void glGetQueryIndexediv(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL40C.glGetQueryIndexediv(target, index, pname, params);
    }

}