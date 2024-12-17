/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL40C extends GL33C {

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

    protected GL40C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendEquationi ] ---

    /** {@code void glBlendEquationi(GLuint buf, GLenum mode)} */
    public static native void glBlendEquationi(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode);

    // --- [ glBlendEquationSeparatei ] ---

    /** {@code void glBlendEquationSeparatei(GLuint buf, GLenum modeRGB, GLenum modeAlpha)} */
    public static native void glBlendEquationSeparatei(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha);

    // --- [ glBlendFunci ] ---

    /** {@code void glBlendFunci(GLuint buf, GLenum sfactor, GLenum dfactor)} */
    public static native void glBlendFunci(@NativeType("GLuint") int buf, @NativeType("GLenum") int sfactor, @NativeType("GLenum") int dfactor);

    // --- [ glBlendFuncSeparatei ] ---

    /** {@code void glBlendFuncSeparatei(GLuint buf, GLenum srcRGB, GLenum dstRGB, GLenum srcAlpha, GLenum dstAlpha)} */
    public static native void glBlendFuncSeparatei(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha);

    // --- [ glDrawArraysIndirect ] ---

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static native void nglDrawArraysIndirect(int mode, long indirect);

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect) {
        if (CHECKS) {
            check(indirect, 4 * 4);
        }
        nglDrawArraysIndirect(mode, memAddress(indirect));
    }

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect) {
        nglDrawArraysIndirect(mode, indirect);
    }

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect) {
        if (CHECKS) {
            check(indirect, (4 * 4) >> 2);
        }
        nglDrawArraysIndirect(mode, memAddress(indirect));
    }

    // --- [ glDrawElementsIndirect ] ---

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static native void nglDrawElementsIndirect(int mode, int type, long indirect);

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect) {
        if (CHECKS) {
            check(indirect, 5 * 4);
        }
        nglDrawElementsIndirect(mode, type, memAddress(indirect));
    }

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect) {
        nglDrawElementsIndirect(mode, type, indirect);
    }

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect) {
        if (CHECKS) {
            check(indirect, (5 * 4) >> 2);
        }
        nglDrawElementsIndirect(mode, type, memAddress(indirect));
    }

    // --- [ glUniform1d ] ---

    /** {@code void glUniform1d(GLint location, GLdouble x)} */
    public static native void glUniform1d(@NativeType("GLint") int location, @NativeType("GLdouble") double x);

    // --- [ glUniform2d ] ---

    /** {@code void glUniform2d(GLint location, GLdouble x, GLdouble y)} */
    public static native void glUniform2d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y);

    // --- [ glUniform3d ] ---

    /** {@code void glUniform3d(GLint location, GLdouble x, GLdouble y, GLdouble z)} */
    public static native void glUniform3d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glUniform4d ] ---

    /** {@code void glUniform4d(GLint location, GLdouble x, GLdouble y, GLdouble z, GLdouble w)} */
    public static native void glUniform4d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    // --- [ glUniform1dv ] ---

    /** {@code void glUniform1dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static native void nglUniform1dv(int location, int count, long value);

    /** {@code void glUniform1dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform1dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniform1dv(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2dv ] ---

    /** {@code void glUniform2dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static native void nglUniform2dv(int location, int count, long value);

    /** {@code void glUniform2dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform2dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniform2dv(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3dv ] ---

    /** {@code void glUniform3dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static native void nglUniform3dv(int location, int count, long value);

    /** {@code void glUniform3dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform3dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniform3dv(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4dv ] ---

    /** {@code void glUniform4dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static native void nglUniform4dv(int location, int count, long value);

    /** {@code void glUniform4dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform4dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniform4dv(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glUniformMatrix2dv ] ---

    /** {@code void glUniformMatrix2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglUniformMatrix2dv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix2dv(location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3dv ] ---

    /** {@code void glUniformMatrix3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglUniformMatrix3dv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix3dv(location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4dv ] ---

    /** {@code void glUniformMatrix4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglUniformMatrix4dv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix4dv(location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix2x3dv ] ---

    /** {@code void glUniformMatrix2x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglUniformMatrix2x3dv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix2x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix2x3dv(location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix2x4dv ] ---

    /** {@code void glUniformMatrix2x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglUniformMatrix2x4dv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix2x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix2x4dv(location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3x2dv ] ---

    /** {@code void glUniformMatrix3x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglUniformMatrix3x2dv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix3x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix3x2dv(location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3x4dv ] ---

    /** {@code void glUniformMatrix3x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglUniformMatrix3x4dv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix3x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix3x4dv(location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4x2dv ] ---

    /** {@code void glUniformMatrix4x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglUniformMatrix4x2dv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix4x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix4x2dv(location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4x3dv ] ---

    /** {@code void glUniformMatrix4x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglUniformMatrix4x3dv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix4x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix4x3dv(location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glGetUniformdv ] ---

    /** {@code void glGetUniformdv(GLuint program, GLint location, GLdouble * params)} */
    public static native void nglGetUniformdv(int program, int location, long params);

    /** {@code void glGetUniformdv(GLuint program, GLint location, GLdouble * params)} */
    public static void glGetUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformdv(program, location, memAddress(params));
    }

    /** {@code void glGetUniformdv(GLuint program, GLint location, GLdouble * params)} */
    @NativeType("void")
    public static double glGetUniformd(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetUniformdv(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMinSampleShading ] ---

    /** {@code void glMinSampleShading(GLfloat value)} */
    public static native void glMinSampleShading(@NativeType("GLfloat") float value);

    // --- [ glGetSubroutineUniformLocation ] ---

    /** {@code GLint glGetSubroutineUniformLocation(GLuint program, GLenum shadertype, GLchar const * name)} */
    public static native int nglGetSubroutineUniformLocation(int program, int shadertype, long name);

    /** {@code GLint glGetSubroutineUniformLocation(GLuint program, GLenum shadertype, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetSubroutineUniformLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetSubroutineUniformLocation(program, shadertype, memAddress(name));
    }

    /** {@code GLint glGetSubroutineUniformLocation(GLuint program, GLenum shadertype, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetSubroutineUniformLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetSubroutineUniformLocation(program, shadertype, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSubroutineIndex ] ---

    /** {@code GLuint glGetSubroutineIndex(GLuint program, GLenum shadertype, GLchar const * name)} */
    public static native int nglGetSubroutineIndex(int program, int shadertype, long name);

    /** {@code GLuint glGetSubroutineIndex(GLuint program, GLenum shadertype, GLchar const * name)} */
    @NativeType("GLuint")
    public static int glGetSubroutineIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetSubroutineIndex(program, shadertype, memAddress(name));
    }

    /** {@code GLuint glGetSubroutineIndex(GLuint program, GLenum shadertype, GLchar const * name)} */
    @NativeType("GLuint")
    public static int glGetSubroutineIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetSubroutineIndex(program, shadertype, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveSubroutineUniformiv ] ---

    /** {@code void glGetActiveSubroutineUniformiv(GLuint program, GLenum shadertype, GLuint index, GLenum pname, GLint * values)} */
    public static native void nglGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, long values);

    /** {@code void glGetActiveSubroutineUniformiv(GLuint program, GLenum shadertype, GLuint index, GLenum pname, GLint * values)} */
    public static void glGetActiveSubroutineUniformiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, memAddress(values));
    }

    /** {@code void glGetActiveSubroutineUniformiv(GLuint program, GLenum shadertype, GLuint index, GLenum pname, GLint * values)} */
    @NativeType("void")
    public static int glGetActiveSubroutineUniformi(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer values = stack.callocInt(1);
            nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, memAddress(values));
            return values.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveSubroutineUniformName ] ---

    /** {@code void glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static native void nglGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, long length, long name);

    /** {@code void glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetActiveSubroutineUniformName(program, shadertype, index, name.remaining(), memAddressSafe(length), memAddress(name));
    }

    /** {@code void glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufsize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(bufsize);
            nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, memAddress(length), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index) {
        return glGetActiveSubroutineUniformName(program, shadertype, index, glGetActiveSubroutineUniformi(program, shadertype, index, GL31.GL_UNIFORM_NAME_LENGTH));
    }

    // --- [ glGetActiveSubroutineName ] ---

    /** {@code void glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static native void nglGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, long length, long name);

    /** {@code void glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetActiveSubroutineName(program, shadertype, index, name.remaining(), memAddressSafe(length), memAddress(name));
    }

    /** {@code void glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufsize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(bufsize);
            nglGetActiveSubroutineName(program, shadertype, index, bufsize, memAddress(length), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index) {
        return glGetActiveSubroutineName(program, shadertype, index, glGetProgramStagei(program, shadertype, GL_ACTIVE_SUBROUTINE_MAX_LENGTH));
    }

    // --- [ glUniformSubroutinesuiv ] ---

    /** {@code void glUniformSubroutinesuiv(GLenum shadertype, GLsizei count, GLuint const * indices)} */
    public static native void nglUniformSubroutinesuiv(int shadertype, int count, long indices);

    /** {@code void glUniformSubroutinesuiv(GLenum shadertype, GLsizei count, GLuint const * indices)} */
    public static void glUniformSubroutinesuiv(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") IntBuffer indices) {
        nglUniformSubroutinesuiv(shadertype, indices.remaining(), memAddress(indices));
    }

    /** {@code void glUniformSubroutinesuiv(GLenum shadertype, GLsizei count, GLuint const * indices)} */
    public static void glUniformSubroutinesui(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer indices = stack.ints(index);
            nglUniformSubroutinesuiv(shadertype, 1, memAddress(indices));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetUniformSubroutineuiv ] ---

    /** {@code void glGetUniformSubroutineuiv(GLenum shadertype, GLint location, GLuint * params)} */
    public static native void nglGetUniformSubroutineuiv(int shadertype, int location, long params);

    /** {@code void glGetUniformSubroutineuiv(GLenum shadertype, GLint location, GLuint * params)} */
    public static void glGetUniformSubroutineuiv(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformSubroutineuiv(shadertype, location, memAddress(params));
    }

    /** {@code void glGetUniformSubroutineuiv(GLenum shadertype, GLint location, GLuint * params)} */
    @NativeType("void")
    public static int glGetUniformSubroutineui(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetUniformSubroutineuiv(shadertype, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramStageiv ] ---

    /** {@code void glGetProgramStageiv(GLuint program, GLenum shadertype, GLenum pname, GLint * values)} */
    public static native void nglGetProgramStageiv(int program, int shadertype, int pname, long values);

    /** {@code void glGetProgramStageiv(GLuint program, GLenum shadertype, GLenum pname, GLint * values)} */
    public static void glGetProgramStageiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nglGetProgramStageiv(program, shadertype, pname, memAddress(values));
    }

    /** {@code void glGetProgramStageiv(GLuint program, GLenum shadertype, GLenum pname, GLint * values)} */
    @NativeType("void")
    public static int glGetProgramStagei(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer values = stack.callocInt(1);
            nglGetProgramStageiv(program, shadertype, pname, memAddress(values));
            return values.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glPatchParameteri ] ---

    /** {@code void glPatchParameteri(GLenum pname, GLint value)} */
    public static native void glPatchParameteri(@NativeType("GLenum") int pname, @NativeType("GLint") int value);

    // --- [ glPatchParameterfv ] ---

    /** {@code void glPatchParameterfv(GLenum pname, GLfloat const * values)} */
    public static native void nglPatchParameterfv(int pname, long values);

    /** {@code void glPatchParameterfv(GLenum pname, GLfloat const * values)} */
    public static void glPatchParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer values) {
        if (CHECKS) {
            if (DEBUG) {
                check(values, GL11.glGetInteger(GL_PATCH_VERTICES));
            }
        }
        nglPatchParameterfv(pname, memAddress(values));
    }

    // --- [ glBindTransformFeedback ] ---

    /** {@code void glBindTransformFeedback(GLenum target, GLuint id)} */
    public static native void glBindTransformFeedback(@NativeType("GLenum") int target, @NativeType("GLuint") int id);

    // --- [ glDeleteTransformFeedbacks ] ---

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static native void nglDeleteTransformFeedbacks(int n, long ids);

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") IntBuffer ids) {
        nglDeleteTransformFeedbacks(ids.remaining(), memAddress(ids));
    }

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDeleteTransformFeedbacks(1, memAddress(ids));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenTransformFeedbacks ] ---

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static native void nglGenTransformFeedbacks(int n, long ids);

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static void glGenTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids) {
        nglGenTransformFeedbacks(ids.remaining(), memAddress(ids));
    }

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    @NativeType("void")
    public static int glGenTransformFeedbacks() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglGenTransformFeedbacks(1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsTransformFeedback ] ---

    /** {@code GLboolean glIsTransformFeedback(GLuint id)} */
    @NativeType("GLboolean")
    public static native boolean glIsTransformFeedback(@NativeType("GLuint") int id);

    // --- [ glPauseTransformFeedback ] ---

    /** {@code void glPauseTransformFeedback(void)} */
    public static native void glPauseTransformFeedback();

    // --- [ glResumeTransformFeedback ] ---

    /** {@code void glResumeTransformFeedback(void)} */
    public static native void glResumeTransformFeedback();

    // --- [ glDrawTransformFeedback ] ---

    /** {@code void glDrawTransformFeedback(GLenum mode, GLuint id)} */
    public static native void glDrawTransformFeedback(@NativeType("GLenum") int mode, @NativeType("GLuint") int id);

    // --- [ glDrawTransformFeedbackStream ] ---

    /** {@code void glDrawTransformFeedbackStream(GLenum mode, GLuint id, GLuint stream)} */
    public static native void glDrawTransformFeedbackStream(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLuint") int stream);

    // --- [ glBeginQueryIndexed ] ---

    /** {@code void glBeginQueryIndexed(GLenum target, GLuint index, GLuint id)} */
    public static native void glBeginQueryIndexed(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int id);

    // --- [ glEndQueryIndexed ] ---

    /** {@code void glEndQueryIndexed(GLenum target, GLuint index)} */
    public static native void glEndQueryIndexed(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glGetQueryIndexediv ] ---

    /** {@code void glGetQueryIndexediv(GLenum target, GLuint index, GLenum pname, GLint * params)} */
    public static native void nglGetQueryIndexediv(int target, int index, int pname, long params);

    /** {@code void glGetQueryIndexediv(GLenum target, GLuint index, GLenum pname, GLint * params)} */
    public static void glGetQueryIndexediv(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryIndexediv(target, index, pname, memAddress(params));
    }

    /** {@code void glGetQueryIndexediv(GLenum target, GLuint index, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetQueryIndexedi(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryIndexediv(target, index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect) {
        long __functionAddress = GL.getICD().glDrawArraysIndirect;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (4 * 4) >> 2);
        }
        callPV(mode, indirect, __functionAddress);
    }

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect) {
        long __functionAddress = GL.getICD().glDrawElementsIndirect;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (5 * 4) >> 2);
        }
        callPV(mode, type, indirect, __functionAddress);
    }

    /** {@code void glUniform1dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform1dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniform1dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** {@code void glUniform2dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform2dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniform2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glUniform3dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform3dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniform3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glUniform4dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform4dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniform4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glUniformMatrix2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 9, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 4, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix2x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix2x3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix2x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix2x4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix3x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix3x2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix3x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix3x4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix4x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix4x2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix4x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix4x3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glGetUniformdv(GLuint program, GLint location, GLdouble * params)} */
    public static void glGetUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetUniformdv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** {@code void glGetActiveSubroutineUniformiv(GLuint program, GLenum shadertype, GLuint index, GLenum pname, GLint * values)} */
    public static void glGetActiveSubroutineUniformiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] values) {
        long __functionAddress = GL.getICD().glGetActiveSubroutineUniformiv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        callPV(program, shadertype, index, pname, values, __functionAddress);
    }

    /** {@code void glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetActiveSubroutineUniformName;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(program, shadertype, index, name.remaining(), length, memAddress(name), __functionAddress);
    }

    /** {@code void glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetActiveSubroutineName;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(program, shadertype, index, name.remaining(), length, memAddress(name), __functionAddress);
    }

    /** {@code void glUniformSubroutinesuiv(GLenum shadertype, GLsizei count, GLuint const * indices)} */
    public static void glUniformSubroutinesuiv(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") int[] indices) {
        long __functionAddress = GL.getICD().glUniformSubroutinesuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(shadertype, indices.length, indices, __functionAddress);
    }

    /** {@code void glGetUniformSubroutineuiv(GLenum shadertype, GLint location, GLuint * params)} */
    public static void glGetUniformSubroutineuiv(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetUniformSubroutineuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(shadertype, location, params, __functionAddress);
    }

    /** {@code void glGetProgramStageiv(GLuint program, GLenum shadertype, GLenum pname, GLint * values)} */
    public static void glGetProgramStageiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] values) {
        long __functionAddress = GL.getICD().glGetProgramStageiv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        callPV(program, shadertype, pname, values, __functionAddress);
    }

    /** {@code void glPatchParameterfv(GLenum pname, GLfloat const * values)} */
    public static void glPatchParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] values) {
        long __functionAddress = GL.getICD().glPatchParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            if (DEBUG) {
                check(values, GL11.glGetInteger(GL_PATCH_VERTICES));
            }
        }
        callPV(pname, values, __functionAddress);
    }

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int[] ids) {
        long __functionAddress = GL.getICD().glDeleteTransformFeedbacks;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static void glGenTransformFeedbacks(@NativeType("GLuint *") int[] ids) {
        long __functionAddress = GL.getICD().glGenTransformFeedbacks;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** {@code void glGetQueryIndexediv(GLenum target, GLuint index, GLenum pname, GLint * params)} */
    public static void glGetQueryIndexediv(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetQueryIndexediv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, index, pname, params, __functionAddress);
    }

}