/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL20C extends GL15C {

    static { GL.initialize(); }

    public static final int GL_SHADING_LANGUAGE_VERSION = 0x8B8C;

    public static final int GL_CURRENT_PROGRAM = 0x8B8D;

    public static final int
        GL_SHADER_TYPE                 = 0x8B4F,
        GL_DELETE_STATUS               = 0x8B80,
        GL_COMPILE_STATUS              = 0x8B81,
        GL_LINK_STATUS                 = 0x8B82,
        GL_VALIDATE_STATUS             = 0x8B83,
        GL_INFO_LOG_LENGTH             = 0x8B84,
        GL_ATTACHED_SHADERS            = 0x8B85,
        GL_ACTIVE_UNIFORMS             = 0x8B86,
        GL_ACTIVE_UNIFORM_MAX_LENGTH   = 0x8B87,
        GL_ACTIVE_ATTRIBUTES           = 0x8B89,
        GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8B8A,
        GL_SHADER_SOURCE_LENGTH        = 0x8B88;

    public static final int
        GL_FLOAT_VEC2        = 0x8B50,
        GL_FLOAT_VEC3        = 0x8B51,
        GL_FLOAT_VEC4        = 0x8B52,
        GL_INT_VEC2          = 0x8B53,
        GL_INT_VEC3          = 0x8B54,
        GL_INT_VEC4          = 0x8B55,
        GL_BOOL              = 0x8B56,
        GL_BOOL_VEC2         = 0x8B57,
        GL_BOOL_VEC3         = 0x8B58,
        GL_BOOL_VEC4         = 0x8B59,
        GL_FLOAT_MAT2        = 0x8B5A,
        GL_FLOAT_MAT3        = 0x8B5B,
        GL_FLOAT_MAT4        = 0x8B5C,
        GL_SAMPLER_1D        = 0x8B5D,
        GL_SAMPLER_2D        = 0x8B5E,
        GL_SAMPLER_3D        = 0x8B5F,
        GL_SAMPLER_CUBE      = 0x8B60,
        GL_SAMPLER_1D_SHADOW = 0x8B61,
        GL_SAMPLER_2D_SHADOW = 0x8B62;

    public static final int GL_VERTEX_SHADER = 0x8B31;

    public static final int
        GL_MAX_VERTEX_UNIFORM_COMPONENTS    = 0x8B4A,
        GL_MAX_VARYING_FLOATS               = 0x8B4B,
        GL_MAX_VERTEX_ATTRIBS               = 0x8869,
        GL_MAX_TEXTURE_IMAGE_UNITS          = 0x8872,
        GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS   = 0x8B4C,
        GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;

    public static final int GL_VERTEX_PROGRAM_POINT_SIZE = 0x8642;

    public static final int
        GL_VERTEX_ATTRIB_ARRAY_ENABLED    = 0x8622,
        GL_VERTEX_ATTRIB_ARRAY_SIZE       = 0x8623,
        GL_VERTEX_ATTRIB_ARRAY_STRIDE     = 0x8624,
        GL_VERTEX_ATTRIB_ARRAY_TYPE       = 0x8625,
        GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A,
        GL_CURRENT_VERTEX_ATTRIB          = 0x8626;

    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;

    public static final int GL_FRAGMENT_SHADER = 0x8B30;

    public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;

    public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;

    public static final int
        GL_MAX_DRAW_BUFFERS = 0x8824,
        GL_DRAW_BUFFER0     = 0x8825,
        GL_DRAW_BUFFER1     = 0x8826,
        GL_DRAW_BUFFER2     = 0x8827,
        GL_DRAW_BUFFER3     = 0x8828,
        GL_DRAW_BUFFER4     = 0x8829,
        GL_DRAW_BUFFER5     = 0x882A,
        GL_DRAW_BUFFER6     = 0x882B,
        GL_DRAW_BUFFER7     = 0x882C,
        GL_DRAW_BUFFER8     = 0x882D,
        GL_DRAW_BUFFER9     = 0x882E,
        GL_DRAW_BUFFER10    = 0x882F,
        GL_DRAW_BUFFER11    = 0x8830,
        GL_DRAW_BUFFER12    = 0x8831,
        GL_DRAW_BUFFER13    = 0x8832,
        GL_DRAW_BUFFER14    = 0x8833,
        GL_DRAW_BUFFER15    = 0x8834;

    public static final int GL_POINT_SPRITE_COORD_ORIGIN = 0x8CA0;

    public static final int
        GL_LOWER_LEFT = 0x8CA1,
        GL_UPPER_LEFT = 0x8CA2;

    public static final int
        GL_BLEND_EQUATION_RGB   = 0x8009,
        GL_BLEND_EQUATION_ALPHA = 0x883D;

    public static final int
        GL_STENCIL_BACK_FUNC            = 0x8800,
        GL_STENCIL_BACK_FAIL            = 0x8801,
        GL_STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802,
        GL_STENCIL_BACK_PASS_DEPTH_PASS = 0x8803,
        GL_STENCIL_BACK_REF             = 0x8CA3,
        GL_STENCIL_BACK_VALUE_MASK      = 0x8CA4,
        GL_STENCIL_BACK_WRITEMASK       = 0x8CA5;

    protected GL20C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCreateProgram ] ---

    /** {@code GLuint glCreateProgram(void)} */
    @NativeType("GLuint")
    public static native int glCreateProgram();

    // --- [ glDeleteProgram ] ---

    /** {@code void glDeleteProgram(GLuint program)} */
    public static native void glDeleteProgram(@NativeType("GLuint") int program);

    // --- [ glIsProgram ] ---

    /** {@code GLboolean glIsProgram(GLuint program)} */
    @NativeType("GLboolean")
    public static native boolean glIsProgram(@NativeType("GLuint") int program);

    // --- [ glCreateShader ] ---

    /** {@code GLuint glCreateShader(GLenum type)} */
    @NativeType("GLuint")
    public static native int glCreateShader(@NativeType("GLenum") int type);

    // --- [ glDeleteShader ] ---

    /** {@code void glDeleteShader(GLuint shader)} */
    public static native void glDeleteShader(@NativeType("GLuint") int shader);

    // --- [ glIsShader ] ---

    /** {@code GLboolean glIsShader(GLuint shader)} */
    @NativeType("GLboolean")
    public static native boolean glIsShader(@NativeType("GLuint") int shader);

    // --- [ glAttachShader ] ---

    /** {@code void glAttachShader(GLuint program, GLuint shader)} */
    public static native void glAttachShader(@NativeType("GLuint") int program, @NativeType("GLuint") int shader);

    // --- [ glDetachShader ] ---

    /** {@code void glDetachShader(GLuint program, GLuint shader)} */
    public static native void glDetachShader(@NativeType("GLuint") int program, @NativeType("GLuint") int shader);

    // --- [ glShaderSource ] ---

    /** {@code void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * strings, GLint const * length)} */
    public static native void nglShaderSource(int shader, int count, long strings, long length);

    /** {@code void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * strings, GLint const * length)} */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer strings, @NativeType("GLint const *") @Nullable IntBuffer length) {
        if (CHECKS) {
            checkSafe(length, strings.remaining());
        }
        nglShaderSource(shader, strings.remaining(), memAddress(strings), memAddressSafe(length));
    }

    /** {@code void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * strings, GLint const * length)} */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") CharSequence... strings) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringsAddress = org.lwjgl.system.APIUtil.apiArrayi(stack, MemoryUtil::memUTF8, strings);
            nglShaderSource(shader, strings.length, stringsAddress, stringsAddress - (strings.length << 2));
            org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, strings.length);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * strings, GLint const * length)} */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringsAddress = org.lwjgl.system.APIUtil.apiArrayi(stack, MemoryUtil::memUTF8, string);
            nglShaderSource(shader, 1, stringsAddress, stringsAddress - 4);
            org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCompileShader ] ---

    /** {@code void glCompileShader(GLuint shader)} */
    public static native void glCompileShader(@NativeType("GLuint") int shader);

    // --- [ glLinkProgram ] ---

    /** {@code void glLinkProgram(GLuint program)} */
    public static native void glLinkProgram(@NativeType("GLuint") int program);

    // --- [ glUseProgram ] ---

    /** {@code void glUseProgram(GLuint program)} */
    public static native void glUseProgram(@NativeType("GLuint") int program);

    // --- [ glValidateProgram ] ---

    /** {@code void glValidateProgram(GLuint program)} */
    public static native void glValidateProgram(@NativeType("GLuint") int program);

    // --- [ glUniform1f ] ---

    /** {@code void glUniform1f(GLint location, GLfloat v0)} */
    public static native void glUniform1f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0);

    // --- [ glUniform2f ] ---

    /** {@code void glUniform2f(GLint location, GLfloat v0, GLfloat v1)} */
    public static native void glUniform2f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1);

    // --- [ glUniform3f ] ---

    /** {@code void glUniform3f(GLint location, GLfloat v0, GLfloat v1, GLfloat v2)} */
    public static native void glUniform3f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2);

    // --- [ glUniform4f ] ---

    /** {@code void glUniform4f(GLint location, GLfloat v0, GLfloat v1, GLfloat v2, GLfloat v3)} */
    public static native void glUniform4f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3);

    // --- [ glUniform1i ] ---

    /** {@code void glUniform1i(GLint location, GLint v0)} */
    public static native void glUniform1i(@NativeType("GLint") int location, @NativeType("GLint") int v0);

    // --- [ glUniform2i ] ---

    /** {@code void glUniform2i(GLint location, GLint v0, GLint v1)} */
    public static native void glUniform2i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1);

    // --- [ glUniform3i ] ---

    /** {@code void glUniform3i(GLint location, GLint v0, GLint v1, GLint v2)} */
    public static native void glUniform3i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2);

    // --- [ glUniform4i ] ---

    /** {@code void glUniform4i(GLint location, GLint v0, GLint v1, GLint v2, GLint v3)} */
    public static native void glUniform4i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3);

    // --- [ glUniform1fv ] ---

    /** {@code void glUniform1fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglUniform1fv(int location, int count, long value);

    /** {@code void glUniform1fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform1fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform1fv(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2fv ] ---

    /** {@code void glUniform2fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglUniform2fv(int location, int count, long value);

    /** {@code void glUniform2fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform2fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform2fv(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3fv ] ---

    /** {@code void glUniform3fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglUniform3fv(int location, int count, long value);

    /** {@code void glUniform3fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform3fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform3fv(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4fv ] ---

    /** {@code void glUniform4fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglUniform4fv(int location, int count, long value);

    /** {@code void glUniform4fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform4fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform4fv(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glUniform1iv ] ---

    /** {@code void glUniform1iv(GLint location, GLsizei count, GLint const * value)} */
    public static native void nglUniform1iv(int location, int count, long value);

    /** {@code void glUniform1iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform1iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform1iv(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2iv ] ---

    /** {@code void glUniform2iv(GLint location, GLsizei count, GLint const * value)} */
    public static native void nglUniform2iv(int location, int count, long value);

    /** {@code void glUniform2iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform2iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform2iv(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3iv ] ---

    /** {@code void glUniform3iv(GLint location, GLsizei count, GLint const * value)} */
    public static native void nglUniform3iv(int location, int count, long value);

    /** {@code void glUniform3iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform3iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform3iv(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4iv ] ---

    /** {@code void glUniform4iv(GLint location, GLsizei count, GLint const * value)} */
    public static native void nglUniform4iv(int location, int count, long value);

    /** {@code void glUniform4iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform4iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform4iv(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glUniformMatrix2fv ] ---

    /** {@code void glUniformMatrix2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix2fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix2fv(location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3fv ] ---

    /** {@code void glUniformMatrix3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix3fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix3fv(location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4fv ] ---

    /** {@code void glUniformMatrix4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix4fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix4fv(location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glGetShaderiv ] ---

    /** {@code void glGetShaderiv(GLuint shader, GLenum pname, GLint * params)} */
    public static native void nglGetShaderiv(int shader, int pname, long params);

    /** {@code void glGetShaderiv(GLuint shader, GLenum pname, GLint * params)} */
    public static void glGetShaderiv(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetShaderiv(shader, pname, memAddress(params));
    }

    /** {@code void glGetShaderiv(GLuint shader, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetShaderi(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetShaderiv(shader, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramiv ] ---

    /** {@code void glGetProgramiv(GLuint program, GLenum pname, GLint * params)} */
    public static native void nglGetProgramiv(int program, int pname, long params);

    /** {@code void glGetProgramiv(GLuint program, GLenum pname, GLint * params)} */
    public static void glGetProgramiv(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetProgramiv(program, pname, memAddress(params));
    }

    /** {@code void glGetProgramiv(GLuint program, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetProgrami(@NativeType("GLuint") int program, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetProgramiv(program, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetShaderInfoLog ] ---

    /** {@code void glGetShaderInfoLog(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    public static native void nglGetShaderInfoLog(int shader, int maxLength, long length, long infoLog);

    /** {@code void glGetShaderInfoLog(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    public static void glGetShaderInfoLog(@NativeType("GLuint") int shader, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetShaderInfoLog(shader, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
    }

    /** {@code void glGetShaderInfoLog(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetShaderInfoLog(@NativeType("GLuint") int shader, @NativeType("GLsizei") int maxLength) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer infoLog = memAlloc(maxLength);
        try {
            IntBuffer length = stack.ints(0);
            nglGetShaderInfoLog(shader, maxLength, memAddress(length), memAddress(infoLog));
            return memUTF8(infoLog, length.get(0));
        } finally {
            memFree(infoLog);
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetShaderInfoLog(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetShaderInfoLog(@NativeType("GLuint") int shader) {
        return glGetShaderInfoLog(shader, glGetShaderi(shader, GL_INFO_LOG_LENGTH));
    }

    // --- [ glGetProgramInfoLog ] ---

    /** {@code void glGetProgramInfoLog(GLuint program, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    public static native void nglGetProgramInfoLog(int program, int maxLength, long length, long infoLog);

    /** {@code void glGetProgramInfoLog(GLuint program, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    public static void glGetProgramInfoLog(@NativeType("GLuint") int program, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramInfoLog(program, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
    }

    /** {@code void glGetProgramInfoLog(GLuint program, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetProgramInfoLog(@NativeType("GLuint") int program, @NativeType("GLsizei") int maxLength) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer infoLog = memAlloc(maxLength);
        try {
            IntBuffer length = stack.ints(0);
            nglGetProgramInfoLog(program, maxLength, memAddress(length), memAddress(infoLog));
            return memUTF8(infoLog, length.get(0));
        } finally {
            memFree(infoLog);
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetProgramInfoLog(GLuint program, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetProgramInfoLog(@NativeType("GLuint") int program) {
        return glGetProgramInfoLog(program, glGetProgrami(program, GL_INFO_LOG_LENGTH));
    }

    // --- [ glGetAttachedShaders ] ---

    /** {@code void glGetAttachedShaders(GLuint program, GLsizei maxCount, GLsizei * count, GLuint * shaders)} */
    public static native void nglGetAttachedShaders(int program, int maxCount, long count, long shaders);

    /** {@code void glGetAttachedShaders(GLuint program, GLsizei maxCount, GLsizei * count, GLuint * shaders)} */
    public static void glGetAttachedShaders(@NativeType("GLuint") int program, @NativeType("GLsizei *") @Nullable IntBuffer count, @NativeType("GLuint *") IntBuffer shaders) {
        if (CHECKS) {
            checkSafe(count, 1);
        }
        nglGetAttachedShaders(program, shaders.remaining(), memAddressSafe(count), memAddress(shaders));
    }

    // --- [ glGetUniformLocation ] ---

    /** {@code GLint glGetUniformLocation(GLuint program, GLchar const * name)} */
    public static native int nglGetUniformLocation(int program, long name);

    /** {@code GLint glGetUniformLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetUniformLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetUniformLocation(program, memAddress(name));
    }

    /** {@code GLint glGetUniformLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetUniformLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetUniformLocation(program, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveUniform ] ---

    /** {@code void glGetActiveUniform(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static native void nglGetActiveUniform(int program, int index, int maxLength, long length, long size, long type, long name);

    /** {@code void glGetActiveUniform(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        nglGetActiveUniform(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
    }

    /** {@code void glGetActiveUniform(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int maxLength, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        if (CHECKS) {
            check(size, 1);
            check(type, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(maxLength);
            nglGetActiveUniform(program, index, maxLength, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetActiveUniform(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetActiveUniform(program, index, glGetProgrami(program, GL_ACTIVE_UNIFORM_MAX_LENGTH), size, type);
    }

    // --- [ glGetUniformfv ] ---

    /** {@code void glGetUniformfv(GLuint program, GLint location, GLfloat * params)} */
    public static native void nglGetUniformfv(int program, int location, long params);

    /** {@code void glGetUniformfv(GLuint program, GLint location, GLfloat * params)} */
    public static void glGetUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformfv(program, location, memAddress(params));
    }

    /** {@code void glGetUniformfv(GLuint program, GLint location, GLfloat * params)} */
    @NativeType("void")
    public static float glGetUniformf(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetUniformfv(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetUniformiv ] ---

    /** {@code void glGetUniformiv(GLuint program, GLint location, GLint * params)} */
    public static native void nglGetUniformiv(int program, int location, long params);

    /** {@code void glGetUniformiv(GLuint program, GLint location, GLint * params)} */
    public static void glGetUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformiv(program, location, memAddress(params));
    }

    /** {@code void glGetUniformiv(GLuint program, GLint location, GLint * params)} */
    @NativeType("void")
    public static int glGetUniformi(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetUniformiv(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetShaderSource ] ---

    /** {@code void glGetShaderSource(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * source)} */
    public static native void nglGetShaderSource(int shader, int maxLength, long length, long source);

    /** {@code void glGetShaderSource(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * source)} */
    public static void glGetShaderSource(@NativeType("GLuint") int shader, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer source) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetShaderSource(shader, source.remaining(), memAddressSafe(length), memAddress(source));
    }

    /** {@code void glGetShaderSource(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * source)} */
    @NativeType("void")
    public static String glGetShaderSource(@NativeType("GLuint") int shader, @NativeType("GLsizei") int maxLength) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer source = memAlloc(maxLength);
        try {
            IntBuffer length = stack.ints(0);
            nglGetShaderSource(shader, maxLength, memAddress(length), memAddress(source));
            return memUTF8(source, length.get(0));
        } finally {
            memFree(source);
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetShaderSource(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * source)} */
    @NativeType("void")
    public static String glGetShaderSource(@NativeType("GLuint") int shader) {
        return glGetShaderSource(shader, glGetShaderi(shader, GL_SHADER_SOURCE_LENGTH));
    }

    // --- [ glVertexAttrib1f ] ---

    /** {@code void glVertexAttrib1f(GLuint index, GLfloat v0)} */
    public static native void glVertexAttrib1f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0);

    // --- [ glVertexAttrib1s ] ---

    /** {@code void glVertexAttrib1s(GLuint index, GLshort v0)} */
    public static native void glVertexAttrib1s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0);

    // --- [ glVertexAttrib1d ] ---

    /** {@code void glVertexAttrib1d(GLuint index, GLdouble v0)} */
    public static native void glVertexAttrib1d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0);

    // --- [ glVertexAttrib2f ] ---

    /** {@code void glVertexAttrib2f(GLuint index, GLfloat v0, GLfloat v1)} */
    public static native void glVertexAttrib2f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1);

    // --- [ glVertexAttrib2s ] ---

    /** {@code void glVertexAttrib2s(GLuint index, GLshort v0, GLshort v1)} */
    public static native void glVertexAttrib2s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1);

    // --- [ glVertexAttrib2d ] ---

    /** {@code void glVertexAttrib2d(GLuint index, GLdouble v0, GLdouble v1)} */
    public static native void glVertexAttrib2d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1);

    // --- [ glVertexAttrib3f ] ---

    /** {@code void glVertexAttrib3f(GLuint index, GLfloat v0, GLfloat v1, GLfloat v2)} */
    public static native void glVertexAttrib3f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2);

    // --- [ glVertexAttrib3s ] ---

    /** {@code void glVertexAttrib3s(GLuint index, GLshort v0, GLshort v1, GLshort v2)} */
    public static native void glVertexAttrib3s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2);

    // --- [ glVertexAttrib3d ] ---

    /** {@code void glVertexAttrib3d(GLuint index, GLdouble v0, GLdouble v1, GLdouble v2)} */
    public static native void glVertexAttrib3d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2);

    // --- [ glVertexAttrib4f ] ---

    /** {@code void glVertexAttrib4f(GLuint index, GLfloat v0, GLfloat v1, GLfloat v2, GLfloat v3)} */
    public static native void glVertexAttrib4f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3);

    // --- [ glVertexAttrib4s ] ---

    /** {@code void glVertexAttrib4s(GLuint index, GLshort v0, GLshort v1, GLshort v2, GLshort v3)} */
    public static native void glVertexAttrib4s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2, @NativeType("GLshort") short v3);

    // --- [ glVertexAttrib4d ] ---

    /** {@code void glVertexAttrib4d(GLuint index, GLdouble v0, GLdouble v1, GLdouble v2, GLdouble v3)} */
    public static native void glVertexAttrib4d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2, @NativeType("GLdouble") double v3);

    // --- [ glVertexAttrib4Nub ] ---

    /** {@code void glVertexAttrib4Nub(GLuint index, GLubyte x, GLubyte y, GLubyte z, GLubyte w)} */
    public static native void glVertexAttrib4Nub(@NativeType("GLuint") int index, @NativeType("GLubyte") byte x, @NativeType("GLubyte") byte y, @NativeType("GLubyte") byte z, @NativeType("GLubyte") byte w);

    // --- [ glVertexAttrib1fv ] ---

    /** {@code void glVertexAttrib1fv(GLuint index, GLfloat const * v)} */
    public static native void nglVertexAttrib1fv(int index, long v);

    /** {@code void glVertexAttrib1fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib1fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttrib1fv(index, memAddress(v));
    }

    // --- [ glVertexAttrib1sv ] ---

    /** {@code void glVertexAttrib1sv(GLuint index, GLshort const * v)} */
    public static native void nglVertexAttrib1sv(int index, long v);

    /** {@code void glVertexAttrib1sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib1sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttrib1sv(index, memAddress(v));
    }

    // --- [ glVertexAttrib1dv ] ---

    /** {@code void glVertexAttrib1dv(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttrib1dv(int index, long v);

    /** {@code void glVertexAttrib1dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttrib1dv(index, memAddress(v));
    }

    // --- [ glVertexAttrib2fv ] ---

    /** {@code void glVertexAttrib2fv(GLuint index, GLfloat const * v)} */
    public static native void nglVertexAttrib2fv(int index, long v);

    /** {@code void glVertexAttrib2fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib2fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttrib2fv(index, memAddress(v));
    }

    // --- [ glVertexAttrib2sv ] ---

    /** {@code void glVertexAttrib2sv(GLuint index, GLshort const * v)} */
    public static native void nglVertexAttrib2sv(int index, long v);

    /** {@code void glVertexAttrib2sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib2sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttrib2sv(index, memAddress(v));
    }

    // --- [ glVertexAttrib2dv ] ---

    /** {@code void glVertexAttrib2dv(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttrib2dv(int index, long v);

    /** {@code void glVertexAttrib2dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttrib2dv(index, memAddress(v));
    }

    // --- [ glVertexAttrib3fv ] ---

    /** {@code void glVertexAttrib3fv(GLuint index, GLfloat const * v)} */
    public static native void nglVertexAttrib3fv(int index, long v);

    /** {@code void glVertexAttrib3fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib3fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttrib3fv(index, memAddress(v));
    }

    // --- [ glVertexAttrib3sv ] ---

    /** {@code void glVertexAttrib3sv(GLuint index, GLshort const * v)} */
    public static native void nglVertexAttrib3sv(int index, long v);

    /** {@code void glVertexAttrib3sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib3sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttrib3sv(index, memAddress(v));
    }

    // --- [ glVertexAttrib3dv ] ---

    /** {@code void glVertexAttrib3dv(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttrib3dv(int index, long v);

    /** {@code void glVertexAttrib3dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttrib3dv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4fv ] ---

    /** {@code void glVertexAttrib4fv(GLuint index, GLfloat const * v)} */
    public static native void nglVertexAttrib4fv(int index, long v);

    /** {@code void glVertexAttrib4fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib4fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4fv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4sv ] ---

    /** {@code void glVertexAttrib4sv(GLuint index, GLshort const * v)} */
    public static native void nglVertexAttrib4sv(int index, long v);

    /** {@code void glVertexAttrib4sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4sv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4dv ] ---

    /** {@code void glVertexAttrib4dv(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttrib4dv(int index, long v);

    /** {@code void glVertexAttrib4dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4dv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4iv ] ---

    /** {@code void glVertexAttrib4iv(GLuint index, GLint const * v)} */
    public static native void nglVertexAttrib4iv(int index, long v);

    /** {@code void glVertexAttrib4iv(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4iv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4bv ] ---

    /** {@code void glVertexAttrib4bv(GLuint index, GLbyte const * v)} */
    public static native void nglVertexAttrib4bv(int index, long v);

    /** {@code void glVertexAttrib4bv(GLuint index, GLbyte const * v)} */
    public static void glVertexAttrib4bv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4bv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4ubv ] ---

    /** {@code void glVertexAttrib4ubv(GLuint index, GLubyte const * v)} */
    public static native void nglVertexAttrib4ubv(int index, long v);

    /** {@code void glVertexAttrib4ubv(GLuint index, GLubyte const * v)} */
    public static void glVertexAttrib4ubv(@NativeType("GLuint") int index, @NativeType("GLubyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4ubv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4usv ] ---

    /** {@code void glVertexAttrib4usv(GLuint index, GLushort const * v)} */
    public static native void nglVertexAttrib4usv(int index, long v);

    /** {@code void glVertexAttrib4usv(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4usv(@NativeType("GLuint") int index, @NativeType("GLushort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4usv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4uiv ] ---

    /** {@code void glVertexAttrib4uiv(GLuint index, GLuint const * v)} */
    public static native void nglVertexAttrib4uiv(int index, long v);

    /** {@code void glVertexAttrib4uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4uiv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4Nbv ] ---

    /** {@code void glVertexAttrib4Nbv(GLuint index, GLbyte const * v)} */
    public static native void nglVertexAttrib4Nbv(int index, long v);

    /** {@code void glVertexAttrib4Nbv(GLuint index, GLbyte const * v)} */
    public static void glVertexAttrib4Nbv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4Nbv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4Nsv ] ---

    /** {@code void glVertexAttrib4Nsv(GLuint index, GLshort const * v)} */
    public static native void nglVertexAttrib4Nsv(int index, long v);

    /** {@code void glVertexAttrib4Nsv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4Nsv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4Nsv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4Niv ] ---

    /** {@code void glVertexAttrib4Niv(GLuint index, GLint const * v)} */
    public static native void nglVertexAttrib4Niv(int index, long v);

    /** {@code void glVertexAttrib4Niv(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4Niv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4Niv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4Nubv ] ---

    /** {@code void glVertexAttrib4Nubv(GLuint index, GLubyte const * v)} */
    public static native void nglVertexAttrib4Nubv(int index, long v);

    /** {@code void glVertexAttrib4Nubv(GLuint index, GLubyte const * v)} */
    public static void glVertexAttrib4Nubv(@NativeType("GLuint") int index, @NativeType("GLubyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4Nubv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4Nusv ] ---

    /** {@code void glVertexAttrib4Nusv(GLuint index, GLushort const * v)} */
    public static native void nglVertexAttrib4Nusv(int index, long v);

    /** {@code void glVertexAttrib4Nusv(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4Nusv(@NativeType("GLuint") int index, @NativeType("GLushort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4Nusv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4Nuiv ] ---

    /** {@code void glVertexAttrib4Nuiv(GLuint index, GLuint const * v)} */
    public static native void nglVertexAttrib4Nuiv(int index, long v);

    /** {@code void glVertexAttrib4Nuiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4Nuiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4Nuiv(index, memAddress(v));
    }

    // --- [ glVertexAttribPointer ] ---

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static native void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer);

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
    }

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
    }

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
    }

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
    }

    // --- [ glEnableVertexAttribArray ] ---

    /** {@code void glEnableVertexAttribArray(GLuint index)} */
    public static native void glEnableVertexAttribArray(@NativeType("GLuint") int index);

    // --- [ glDisableVertexAttribArray ] ---

    /** {@code void glDisableVertexAttribArray(GLuint index)} */
    public static native void glDisableVertexAttribArray(@NativeType("GLuint") int index);

    // --- [ glBindAttribLocation ] ---

    /** {@code void glBindAttribLocation(GLuint program, GLuint index, GLchar const * name)} */
    public static native void nglBindAttribLocation(int program, int index, long name);

    /** {@code void glBindAttribLocation(GLuint program, GLuint index, GLchar const * name)} */
    public static void glBindAttribLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglBindAttribLocation(program, index, memAddress(name));
    }

    /** {@code void glBindAttribLocation(GLuint program, GLuint index, GLchar const * name)} */
    public static void glBindAttribLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglBindAttribLocation(program, index, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveAttrib ] ---

    /** {@code void glGetActiveAttrib(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static native void nglGetActiveAttrib(int program, int index, int maxLength, long length, long size, long type, long name);

    /** {@code void glGetActiveAttrib(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        nglGetActiveAttrib(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
    }

    /** {@code void glGetActiveAttrib(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int maxLength, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        if (CHECKS) {
            check(size, 1);
            check(type, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(maxLength);
            nglGetActiveAttrib(program, index, maxLength, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetActiveAttrib(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetActiveAttrib(program, index, glGetProgrami(program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH), size, type);
    }

    // --- [ glGetAttribLocation ] ---

    /** {@code GLint glGetAttribLocation(GLuint program, GLchar const * name)} */
    public static native int nglGetAttribLocation(int program, long name);

    /** {@code GLint glGetAttribLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetAttribLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetAttribLocation(program, memAddress(name));
    }

    /** {@code GLint glGetAttribLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetAttribLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetAttribLocation(program, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexAttribiv ] ---

    /** {@code void glGetVertexAttribiv(GLuint index, GLenum pname, GLint * params)} */
    public static native void nglGetVertexAttribiv(int index, int pname, long params);

    /** {@code void glGetVertexAttribiv(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetVertexAttribiv(index, pname, memAddress(params));
    }

    /** {@code void glGetVertexAttribiv(GLuint index, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetVertexAttribi(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetVertexAttribiv(index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexAttribfv ] ---

    /** {@code void glGetVertexAttribfv(GLuint index, GLenum pname, GLfloat * params)} */
    public static native void nglGetVertexAttribfv(int index, int pname, long params);

    /** {@code void glGetVertexAttribfv(GLuint index, GLenum pname, GLfloat * params)} */
    public static void glGetVertexAttribfv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribfv(index, pname, memAddress(params));
    }

    // --- [ glGetVertexAttribdv ] ---

    /** {@code void glGetVertexAttribdv(GLuint index, GLenum pname, GLdouble * params)} */
    public static native void nglGetVertexAttribdv(int index, int pname, long params);

    /** {@code void glGetVertexAttribdv(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribdv(index, pname, memAddress(params));
    }

    // --- [ glGetVertexAttribPointerv ] ---

    /** {@code void glGetVertexAttribPointerv(GLuint index, GLenum pname, void ** pointer)} */
    public static native void nglGetVertexAttribPointerv(int index, int pname, long pointer);

    /** {@code void glGetVertexAttribPointerv(GLuint index, GLenum pname, void ** pointer)} */
    public static void glGetVertexAttribPointerv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer pointer) {
        if (CHECKS) {
            check(pointer, 1);
        }
        nglGetVertexAttribPointerv(index, pname, memAddress(pointer));
    }

    /** {@code void glGetVertexAttribPointerv(GLuint index, GLenum pname, void ** pointer)} */
    @NativeType("void")
    public static long glGetVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer pointer = stack.callocPointer(1);
            nglGetVertexAttribPointerv(index, pname, memAddress(pointer));
            return pointer.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDrawBuffers ] ---

    /** {@code void glDrawBuffers(GLsizei n, GLenum const * bufs)} */
    public static native void nglDrawBuffers(int n, long bufs);

    /** {@code void glDrawBuffers(GLsizei n, GLenum const * bufs)} */
    public static void glDrawBuffers(@NativeType("GLenum const *") IntBuffer bufs) {
        nglDrawBuffers(bufs.remaining(), memAddress(bufs));
    }

    /** {@code void glDrawBuffers(GLsizei n, GLenum const * bufs)} */
    public static void glDrawBuffers(@NativeType("GLenum const *") int buf) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer bufs = stack.ints(buf);
            nglDrawBuffers(1, memAddress(bufs));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBlendEquationSeparate ] ---

    /** {@code void glBlendEquationSeparate(GLenum modeRGB, GLenum modeAlpha)} */
    public static native void glBlendEquationSeparate(@NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha);

    // --- [ glStencilOpSeparate ] ---

    /** {@code void glStencilOpSeparate(GLenum face, GLenum sfail, GLenum dpfail, GLenum dppass)} */
    public static native void glStencilOpSeparate(@NativeType("GLenum") int face, @NativeType("GLenum") int sfail, @NativeType("GLenum") int dpfail, @NativeType("GLenum") int dppass);

    // --- [ glStencilFuncSeparate ] ---

    /** {@code void glStencilFuncSeparate(GLenum face, GLenum func, GLint ref, GLuint mask)} */
    public static native void glStencilFuncSeparate(@NativeType("GLenum") int face, @NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask);

    // --- [ glStencilMaskSeparate ] ---

    /** {@code void glStencilMaskSeparate(GLenum face, GLuint mask)} */
    public static native void glStencilMaskSeparate(@NativeType("GLenum") int face, @NativeType("GLuint") int mask);

    /** {@code void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * strings, GLint const * length)} */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer strings, @NativeType("GLint const *") int @Nullable [] length) {
        long __functionAddress = GL.getICD().glShaderSource;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, strings.remaining());
        }
        callPPV(shader, strings.remaining(), memAddress(strings), length, __functionAddress);
    }

    /** {@code void glUniform1fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform1fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform1fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** {@code void glUniform2fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform2fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glUniform3fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform3fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glUniform4fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform4fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glUniform1iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform1iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform1iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** {@code void glUniform2iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform2iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform2iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glUniform3iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform3iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glUniform4iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform4iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform4iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glUniformMatrix2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 9, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 4, transpose, value, __functionAddress);
    }

    /** {@code void glGetShaderiv(GLuint shader, GLenum pname, GLint * params)} */
    public static void glGetShaderiv(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetShaderiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(shader, pname, params, __functionAddress);
    }

    /** {@code void glGetProgramiv(GLuint program, GLenum pname, GLint * params)} */
    public static void glGetProgramiv(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetProgramiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, pname, params, __functionAddress);
    }

    /** {@code void glGetShaderInfoLog(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    public static void glGetShaderInfoLog(@NativeType("GLuint") int shader, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        long __functionAddress = GL.getICD().glGetShaderInfoLog;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(shader, infoLog.remaining(), length, memAddress(infoLog), __functionAddress);
    }

    /** {@code void glGetProgramInfoLog(GLuint program, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    public static void glGetProgramInfoLog(@NativeType("GLuint") int program, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        long __functionAddress = GL.getICD().glGetProgramInfoLog;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(program, infoLog.remaining(), length, memAddress(infoLog), __functionAddress);
    }

    /** {@code void glGetAttachedShaders(GLuint program, GLsizei maxCount, GLsizei * count, GLuint * shaders)} */
    public static void glGetAttachedShaders(@NativeType("GLuint") int program, @NativeType("GLsizei *") int @Nullable [] count, @NativeType("GLuint *") int[] shaders) {
        long __functionAddress = GL.getICD().glGetAttachedShaders;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(count, 1);
        }
        callPPV(program, shaders.length, count, shaders, __functionAddress);
    }

    /** {@code void glGetActiveUniform(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetActiveUniform;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        callPPPPV(program, index, name.remaining(), length, size, type, memAddress(name), __functionAddress);
    }

    /** {@code void glGetUniformfv(GLuint program, GLint location, GLfloat * params)} */
    public static void glGetUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetUniformfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** {@code void glGetUniformiv(GLuint program, GLint location, GLint * params)} */
    public static void glGetUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetUniformiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** {@code void glGetShaderSource(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * source)} */
    public static void glGetShaderSource(@NativeType("GLuint") int shader, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer source) {
        long __functionAddress = GL.getICD().glGetShaderSource;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(shader, source.remaining(), length, memAddress(source), __functionAddress);
    }

    /** {@code void glVertexAttrib1fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib1fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib1fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib1sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib1sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib1sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib1dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib1dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib2fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib2fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib2fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib2sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib2sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib2sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib2dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib2dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib3fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib3fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib3fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib3sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib3sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib3sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib3dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib3dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib4fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4iv(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4usv(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4usv(@NativeType("GLuint") int index, @NativeType("GLushort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4usv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4Nsv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4Nsv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4Nsv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4Niv(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4Niv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4Niv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4Nusv(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4Nusv(@NativeType("GLuint") int index, @NativeType("GLushort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4Nusv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4Nuiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4Nuiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4Nuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glGetActiveAttrib(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetActiveAttrib;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        callPPPPV(program, index, name.remaining(), length, size, type, memAddress(name), __functionAddress);
    }

    /** {@code void glGetVertexAttribiv(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** {@code void glGetVertexAttribfv(GLuint index, GLenum pname, GLfloat * params)} */
    public static void glGetVertexAttribfv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** {@code void glGetVertexAttribdv(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribdv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** {@code void glDrawBuffers(GLsizei n, GLenum const * bufs)} */
    public static void glDrawBuffers(@NativeType("GLenum const *") int[] bufs) {
        long __functionAddress = GL.getICD().glDrawBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(bufs.length, bufs, __functionAddress);
    }

}