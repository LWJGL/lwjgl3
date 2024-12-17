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

public class GL20 extends GL15 {

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
        GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D,
        GL_MAX_TEXTURE_COORDS               = 0x8871;

    public static final int
        GL_VERTEX_PROGRAM_POINT_SIZE = 0x8642,
        GL_VERTEX_PROGRAM_TWO_SIDE   = 0x8643;

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

    public static final int GL_POINT_SPRITE = 0x8861;

    public static final int GL_COORD_REPLACE = 0x8862;

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

    protected GL20() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCreateProgram ] ---

    /** {@code GLuint glCreateProgram(void)} */
    @NativeType("GLuint")
    public static int glCreateProgram() {
        return GL20C.glCreateProgram();
    }

    // --- [ glDeleteProgram ] ---

    /** {@code void glDeleteProgram(GLuint program)} */
    public static void glDeleteProgram(@NativeType("GLuint") int program) {
        GL20C.glDeleteProgram(program);
    }

    // --- [ glIsProgram ] ---

    /** {@code GLboolean glIsProgram(GLuint program)} */
    @NativeType("GLboolean")
    public static boolean glIsProgram(@NativeType("GLuint") int program) {
        return GL20C.glIsProgram(program);
    }

    // --- [ glCreateShader ] ---

    /** {@code GLuint glCreateShader(GLenum type)} */
    @NativeType("GLuint")
    public static int glCreateShader(@NativeType("GLenum") int type) {
        return GL20C.glCreateShader(type);
    }

    // --- [ glDeleteShader ] ---

    /** {@code void glDeleteShader(GLuint shader)} */
    public static void glDeleteShader(@NativeType("GLuint") int shader) {
        GL20C.glDeleteShader(shader);
    }

    // --- [ glIsShader ] ---

    /** {@code GLboolean glIsShader(GLuint shader)} */
    @NativeType("GLboolean")
    public static boolean glIsShader(@NativeType("GLuint") int shader) {
        return GL20C.glIsShader(shader);
    }

    // --- [ glAttachShader ] ---

    /** {@code void glAttachShader(GLuint program, GLuint shader)} */
    public static void glAttachShader(@NativeType("GLuint") int program, @NativeType("GLuint") int shader) {
        GL20C.glAttachShader(program, shader);
    }

    // --- [ glDetachShader ] ---

    /** {@code void glDetachShader(GLuint program, GLuint shader)} */
    public static void glDetachShader(@NativeType("GLuint") int program, @NativeType("GLuint") int shader) {
        GL20C.glDetachShader(program, shader);
    }

    // --- [ glShaderSource ] ---

    /** {@code void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * strings, GLint const * length)} */
    public static void nglShaderSource(int shader, int count, long strings, long length) {
        GL20C.nglShaderSource(shader, count, strings, length);
    }

    /** {@code void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * strings, GLint const * length)} */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer strings, @NativeType("GLint const *") @Nullable IntBuffer length) {
        GL20C.glShaderSource(shader, strings, length);
    }

    /** {@code void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * strings, GLint const * length)} */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") CharSequence... strings) {
        GL20C.glShaderSource(shader, strings);
    }

    /** {@code void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * strings, GLint const * length)} */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") CharSequence string) {
        GL20C.glShaderSource(shader, string);
    }

    // --- [ glCompileShader ] ---

    /** {@code void glCompileShader(GLuint shader)} */
    public static void glCompileShader(@NativeType("GLuint") int shader) {
        GL20C.glCompileShader(shader);
    }

    // --- [ glLinkProgram ] ---

    /** {@code void glLinkProgram(GLuint program)} */
    public static void glLinkProgram(@NativeType("GLuint") int program) {
        GL20C.glLinkProgram(program);
    }

    // --- [ glUseProgram ] ---

    /** {@code void glUseProgram(GLuint program)} */
    public static void glUseProgram(@NativeType("GLuint") int program) {
        GL20C.glUseProgram(program);
    }

    // --- [ glValidateProgram ] ---

    /** {@code void glValidateProgram(GLuint program)} */
    public static void glValidateProgram(@NativeType("GLuint") int program) {
        GL20C.glValidateProgram(program);
    }

    // --- [ glUniform1f ] ---

    /** {@code void glUniform1f(GLint location, GLfloat v0)} */
    public static void glUniform1f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0) {
        GL20C.glUniform1f(location, v0);
    }

    // --- [ glUniform2f ] ---

    /** {@code void glUniform2f(GLint location, GLfloat v0, GLfloat v1)} */
    public static void glUniform2f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1) {
        GL20C.glUniform2f(location, v0, v1);
    }

    // --- [ glUniform3f ] ---

    /** {@code void glUniform3f(GLint location, GLfloat v0, GLfloat v1, GLfloat v2)} */
    public static void glUniform3f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2) {
        GL20C.glUniform3f(location, v0, v1, v2);
    }

    // --- [ glUniform4f ] ---

    /** {@code void glUniform4f(GLint location, GLfloat v0, GLfloat v1, GLfloat v2, GLfloat v3)} */
    public static void glUniform4f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3) {
        GL20C.glUniform4f(location, v0, v1, v2, v3);
    }

    // --- [ glUniform1i ] ---

    /** {@code void glUniform1i(GLint location, GLint v0)} */
    public static void glUniform1i(@NativeType("GLint") int location, @NativeType("GLint") int v0) {
        GL20C.glUniform1i(location, v0);
    }

    // --- [ glUniform2i ] ---

    /** {@code void glUniform2i(GLint location, GLint v0, GLint v1)} */
    public static void glUniform2i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1) {
        GL20C.glUniform2i(location, v0, v1);
    }

    // --- [ glUniform3i ] ---

    /** {@code void glUniform3i(GLint location, GLint v0, GLint v1, GLint v2)} */
    public static void glUniform3i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2) {
        GL20C.glUniform3i(location, v0, v1, v2);
    }

    // --- [ glUniform4i ] ---

    /** {@code void glUniform4i(GLint location, GLint v0, GLint v1, GLint v2, GLint v3)} */
    public static void glUniform4i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3) {
        GL20C.glUniform4i(location, v0, v1, v2, v3);
    }

    // --- [ glUniform1fv ] ---

    /** {@code void glUniform1fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void nglUniform1fv(int location, int count, long value) {
        GL20C.nglUniform1fv(location, count, value);
    }

    /** {@code void glUniform1fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform1fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        GL20C.glUniform1fv(location, value);
    }

    // --- [ glUniform2fv ] ---

    /** {@code void glUniform2fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void nglUniform2fv(int location, int count, long value) {
        GL20C.nglUniform2fv(location, count, value);
    }

    /** {@code void glUniform2fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform2fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        GL20C.glUniform2fv(location, value);
    }

    // --- [ glUniform3fv ] ---

    /** {@code void glUniform3fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void nglUniform3fv(int location, int count, long value) {
        GL20C.nglUniform3fv(location, count, value);
    }

    /** {@code void glUniform3fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform3fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        GL20C.glUniform3fv(location, value);
    }

    // --- [ glUniform4fv ] ---

    /** {@code void glUniform4fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void nglUniform4fv(int location, int count, long value) {
        GL20C.nglUniform4fv(location, count, value);
    }

    /** {@code void glUniform4fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform4fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        GL20C.glUniform4fv(location, value);
    }

    // --- [ glUniform1iv ] ---

    /** {@code void glUniform1iv(GLint location, GLsizei count, GLint const * value)} */
    public static void nglUniform1iv(int location, int count, long value) {
        GL20C.nglUniform1iv(location, count, value);
    }

    /** {@code void glUniform1iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform1iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        GL20C.glUniform1iv(location, value);
    }

    // --- [ glUniform2iv ] ---

    /** {@code void glUniform2iv(GLint location, GLsizei count, GLint const * value)} */
    public static void nglUniform2iv(int location, int count, long value) {
        GL20C.nglUniform2iv(location, count, value);
    }

    /** {@code void glUniform2iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform2iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        GL20C.glUniform2iv(location, value);
    }

    // --- [ glUniform3iv ] ---

    /** {@code void glUniform3iv(GLint location, GLsizei count, GLint const * value)} */
    public static void nglUniform3iv(int location, int count, long value) {
        GL20C.nglUniform3iv(location, count, value);
    }

    /** {@code void glUniform3iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform3iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        GL20C.glUniform3iv(location, value);
    }

    // --- [ glUniform4iv ] ---

    /** {@code void glUniform4iv(GLint location, GLsizei count, GLint const * value)} */
    public static void nglUniform4iv(int location, int count, long value) {
        GL20C.nglUniform4iv(location, count, value);
    }

    /** {@code void glUniform4iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform4iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        GL20C.glUniform4iv(location, value);
    }

    // --- [ glUniformMatrix2fv ] ---

    /** {@code void glUniformMatrix2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void nglUniformMatrix2fv(int location, int count, boolean transpose, long value) {
        GL20C.nglUniformMatrix2fv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL20C.glUniformMatrix2fv(location, transpose, value);
    }

    // --- [ glUniformMatrix3fv ] ---

    /** {@code void glUniformMatrix3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void nglUniformMatrix3fv(int location, int count, boolean transpose, long value) {
        GL20C.nglUniformMatrix3fv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL20C.glUniformMatrix3fv(location, transpose, value);
    }

    // --- [ glUniformMatrix4fv ] ---

    /** {@code void glUniformMatrix4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void nglUniformMatrix4fv(int location, int count, boolean transpose, long value) {
        GL20C.nglUniformMatrix4fv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL20C.glUniformMatrix4fv(location, transpose, value);
    }

    // --- [ glGetShaderiv ] ---

    /** {@code void glGetShaderiv(GLuint shader, GLenum pname, GLint * params)} */
    public static void nglGetShaderiv(int shader, int pname, long params) {
        GL20C.nglGetShaderiv(shader, pname, params);
    }

    /** {@code void glGetShaderiv(GLuint shader, GLenum pname, GLint * params)} */
    public static void glGetShaderiv(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL20C.glGetShaderiv(shader, pname, params);
    }

    /** {@code void glGetShaderiv(GLuint shader, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetShaderi(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname) {
        return GL20C.glGetShaderi(shader, pname);
    }

    // --- [ glGetProgramiv ] ---

    /** {@code void glGetProgramiv(GLuint program, GLenum pname, GLint * params)} */
    public static void nglGetProgramiv(int program, int pname, long params) {
        GL20C.nglGetProgramiv(program, pname, params);
    }

    /** {@code void glGetProgramiv(GLuint program, GLenum pname, GLint * params)} */
    public static void glGetProgramiv(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL20C.glGetProgramiv(program, pname, params);
    }

    /** {@code void glGetProgramiv(GLuint program, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetProgrami(@NativeType("GLuint") int program, @NativeType("GLenum") int pname) {
        return GL20C.glGetProgrami(program, pname);
    }

    // --- [ glGetShaderInfoLog ] ---

    /** {@code void glGetShaderInfoLog(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    public static void nglGetShaderInfoLog(int shader, int maxLength, long length, long infoLog) {
        GL20C.nglGetShaderInfoLog(shader, maxLength, length, infoLog);
    }

    /** {@code void glGetShaderInfoLog(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    public static void glGetShaderInfoLog(@NativeType("GLuint") int shader, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        GL20C.glGetShaderInfoLog(shader, length, infoLog);
    }

    /** {@code void glGetShaderInfoLog(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetShaderInfoLog(@NativeType("GLuint") int shader, @NativeType("GLsizei") int maxLength) {
        return GL20C.glGetShaderInfoLog(shader, maxLength);
    }

    /** {@code void glGetShaderInfoLog(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetShaderInfoLog(@NativeType("GLuint") int shader) {
        return glGetShaderInfoLog(shader, glGetShaderi(shader, GL_INFO_LOG_LENGTH));
    }

    // --- [ glGetProgramInfoLog ] ---

    /** {@code void glGetProgramInfoLog(GLuint program, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    public static void nglGetProgramInfoLog(int program, int maxLength, long length, long infoLog) {
        GL20C.nglGetProgramInfoLog(program, maxLength, length, infoLog);
    }

    /** {@code void glGetProgramInfoLog(GLuint program, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    public static void glGetProgramInfoLog(@NativeType("GLuint") int program, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        GL20C.glGetProgramInfoLog(program, length, infoLog);
    }

    /** {@code void glGetProgramInfoLog(GLuint program, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetProgramInfoLog(@NativeType("GLuint") int program, @NativeType("GLsizei") int maxLength) {
        return GL20C.glGetProgramInfoLog(program, maxLength);
    }

    /** {@code void glGetProgramInfoLog(GLuint program, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetProgramInfoLog(@NativeType("GLuint") int program) {
        return glGetProgramInfoLog(program, glGetProgrami(program, GL_INFO_LOG_LENGTH));
    }

    // --- [ glGetAttachedShaders ] ---

    /** {@code void glGetAttachedShaders(GLuint program, GLsizei maxCount, GLsizei * count, GLuint * shaders)} */
    public static void nglGetAttachedShaders(int program, int maxCount, long count, long shaders) {
        GL20C.nglGetAttachedShaders(program, maxCount, count, shaders);
    }

    /** {@code void glGetAttachedShaders(GLuint program, GLsizei maxCount, GLsizei * count, GLuint * shaders)} */
    public static void glGetAttachedShaders(@NativeType("GLuint") int program, @NativeType("GLsizei *") @Nullable IntBuffer count, @NativeType("GLuint *") IntBuffer shaders) {
        GL20C.glGetAttachedShaders(program, count, shaders);
    }

    // --- [ glGetUniformLocation ] ---

    /** {@code GLint glGetUniformLocation(GLuint program, GLchar const * name)} */
    public static int nglGetUniformLocation(int program, long name) {
        return GL20C.nglGetUniformLocation(program, name);
    }

    /** {@code GLint glGetUniformLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetUniformLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        return GL20C.glGetUniformLocation(program, name);
    }

    /** {@code GLint glGetUniformLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetUniformLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        return GL20C.glGetUniformLocation(program, name);
    }

    // --- [ glGetActiveUniform ] ---

    /** {@code void glGetActiveUniform(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void nglGetActiveUniform(int program, int index, int maxLength, long length, long size, long type, long name) {
        GL20C.nglGetActiveUniform(program, index, maxLength, length, size, type, name);
    }

    /** {@code void glGetActiveUniform(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        GL20C.glGetActiveUniform(program, index, length, size, type, name);
    }

    /** {@code void glGetActiveUniform(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int maxLength, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return GL20C.glGetActiveUniform(program, index, maxLength, size, type);
    }

    /** {@code void glGetActiveUniform(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetActiveUniform(program, index, glGetProgrami(program, GL_ACTIVE_UNIFORM_MAX_LENGTH), size, type);
    }

    // --- [ glGetUniformfv ] ---

    /** {@code void glGetUniformfv(GLuint program, GLint location, GLfloat * params)} */
    public static void nglGetUniformfv(int program, int location, long params) {
        GL20C.nglGetUniformfv(program, location, params);
    }

    /** {@code void glGetUniformfv(GLuint program, GLint location, GLfloat * params)} */
    public static void glGetUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        GL20C.glGetUniformfv(program, location, params);
    }

    /** {@code void glGetUniformfv(GLuint program, GLint location, GLfloat * params)} */
    @NativeType("void")
    public static float glGetUniformf(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return GL20C.glGetUniformf(program, location);
    }

    // --- [ glGetUniformiv ] ---

    /** {@code void glGetUniformiv(GLuint program, GLint location, GLint * params)} */
    public static void nglGetUniformiv(int program, int location, long params) {
        GL20C.nglGetUniformiv(program, location, params);
    }

    /** {@code void glGetUniformiv(GLuint program, GLint location, GLint * params)} */
    public static void glGetUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        GL20C.glGetUniformiv(program, location, params);
    }

    /** {@code void glGetUniformiv(GLuint program, GLint location, GLint * params)} */
    @NativeType("void")
    public static int glGetUniformi(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return GL20C.glGetUniformi(program, location);
    }

    // --- [ glGetShaderSource ] ---

    /** {@code void glGetShaderSource(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * source)} */
    public static void nglGetShaderSource(int shader, int maxLength, long length, long source) {
        GL20C.nglGetShaderSource(shader, maxLength, length, source);
    }

    /** {@code void glGetShaderSource(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * source)} */
    public static void glGetShaderSource(@NativeType("GLuint") int shader, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer source) {
        GL20C.glGetShaderSource(shader, length, source);
    }

    /** {@code void glGetShaderSource(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * source)} */
    @NativeType("void")
    public static String glGetShaderSource(@NativeType("GLuint") int shader, @NativeType("GLsizei") int maxLength) {
        return GL20C.glGetShaderSource(shader, maxLength);
    }

    /** {@code void glGetShaderSource(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * source)} */
    @NativeType("void")
    public static String glGetShaderSource(@NativeType("GLuint") int shader) {
        return glGetShaderSource(shader, glGetShaderi(shader, GL_SHADER_SOURCE_LENGTH));
    }

    // --- [ glVertexAttrib1f ] ---

    /** {@code void glVertexAttrib1f(GLuint index, GLfloat v0)} */
    public static void glVertexAttrib1f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0) {
        GL20C.glVertexAttrib1f(index, v0);
    }

    // --- [ glVertexAttrib1s ] ---

    /** {@code void glVertexAttrib1s(GLuint index, GLshort v0)} */
    public static void glVertexAttrib1s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0) {
        GL20C.glVertexAttrib1s(index, v0);
    }

    // --- [ glVertexAttrib1d ] ---

    /** {@code void glVertexAttrib1d(GLuint index, GLdouble v0)} */
    public static void glVertexAttrib1d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0) {
        GL20C.glVertexAttrib1d(index, v0);
    }

    // --- [ glVertexAttrib2f ] ---

    /** {@code void glVertexAttrib2f(GLuint index, GLfloat v0, GLfloat v1)} */
    public static void glVertexAttrib2f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1) {
        GL20C.glVertexAttrib2f(index, v0, v1);
    }

    // --- [ glVertexAttrib2s ] ---

    /** {@code void glVertexAttrib2s(GLuint index, GLshort v0, GLshort v1)} */
    public static void glVertexAttrib2s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1) {
        GL20C.glVertexAttrib2s(index, v0, v1);
    }

    // --- [ glVertexAttrib2d ] ---

    /** {@code void glVertexAttrib2d(GLuint index, GLdouble v0, GLdouble v1)} */
    public static void glVertexAttrib2d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1) {
        GL20C.glVertexAttrib2d(index, v0, v1);
    }

    // --- [ glVertexAttrib3f ] ---

    /** {@code void glVertexAttrib3f(GLuint index, GLfloat v0, GLfloat v1, GLfloat v2)} */
    public static void glVertexAttrib3f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2) {
        GL20C.glVertexAttrib3f(index, v0, v1, v2);
    }

    // --- [ glVertexAttrib3s ] ---

    /** {@code void glVertexAttrib3s(GLuint index, GLshort v0, GLshort v1, GLshort v2)} */
    public static void glVertexAttrib3s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2) {
        GL20C.glVertexAttrib3s(index, v0, v1, v2);
    }

    // --- [ glVertexAttrib3d ] ---

    /** {@code void glVertexAttrib3d(GLuint index, GLdouble v0, GLdouble v1, GLdouble v2)} */
    public static void glVertexAttrib3d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2) {
        GL20C.glVertexAttrib3d(index, v0, v1, v2);
    }

    // --- [ glVertexAttrib4f ] ---

    /** {@code void glVertexAttrib4f(GLuint index, GLfloat v0, GLfloat v1, GLfloat v2, GLfloat v3)} */
    public static void glVertexAttrib4f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3) {
        GL20C.glVertexAttrib4f(index, v0, v1, v2, v3);
    }

    // --- [ glVertexAttrib4s ] ---

    /** {@code void glVertexAttrib4s(GLuint index, GLshort v0, GLshort v1, GLshort v2, GLshort v3)} */
    public static void glVertexAttrib4s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2, @NativeType("GLshort") short v3) {
        GL20C.glVertexAttrib4s(index, v0, v1, v2, v3);
    }

    // --- [ glVertexAttrib4d ] ---

    /** {@code void glVertexAttrib4d(GLuint index, GLdouble v0, GLdouble v1, GLdouble v2, GLdouble v3)} */
    public static void glVertexAttrib4d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2, @NativeType("GLdouble") double v3) {
        GL20C.glVertexAttrib4d(index, v0, v1, v2, v3);
    }

    // --- [ glVertexAttrib4Nub ] ---

    /** {@code void glVertexAttrib4Nub(GLuint index, GLubyte x, GLubyte y, GLubyte z, GLubyte w)} */
    public static void glVertexAttrib4Nub(@NativeType("GLuint") int index, @NativeType("GLubyte") byte x, @NativeType("GLubyte") byte y, @NativeType("GLubyte") byte z, @NativeType("GLubyte") byte w) {
        GL20C.glVertexAttrib4Nub(index, x, y, z, w);
    }

    // --- [ glVertexAttrib1fv ] ---

    /** {@code void glVertexAttrib1fv(GLuint index, GLfloat const * v)} */
    public static void nglVertexAttrib1fv(int index, long v) {
        GL20C.nglVertexAttrib1fv(index, v);
    }

    /** {@code void glVertexAttrib1fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib1fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        GL20C.glVertexAttrib1fv(index, v);
    }

    // --- [ glVertexAttrib1sv ] ---

    /** {@code void glVertexAttrib1sv(GLuint index, GLshort const * v)} */
    public static void nglVertexAttrib1sv(int index, long v) {
        GL20C.nglVertexAttrib1sv(index, v);
    }

    /** {@code void glVertexAttrib1sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib1sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        GL20C.glVertexAttrib1sv(index, v);
    }

    // --- [ glVertexAttrib1dv ] ---

    /** {@code void glVertexAttrib1dv(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttrib1dv(int index, long v) {
        GL20C.nglVertexAttrib1dv(index, v);
    }

    /** {@code void glVertexAttrib1dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        GL20C.glVertexAttrib1dv(index, v);
    }

    // --- [ glVertexAttrib2fv ] ---

    /** {@code void glVertexAttrib2fv(GLuint index, GLfloat const * v)} */
    public static void nglVertexAttrib2fv(int index, long v) {
        GL20C.nglVertexAttrib2fv(index, v);
    }

    /** {@code void glVertexAttrib2fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib2fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        GL20C.glVertexAttrib2fv(index, v);
    }

    // --- [ glVertexAttrib2sv ] ---

    /** {@code void glVertexAttrib2sv(GLuint index, GLshort const * v)} */
    public static void nglVertexAttrib2sv(int index, long v) {
        GL20C.nglVertexAttrib2sv(index, v);
    }

    /** {@code void glVertexAttrib2sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib2sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        GL20C.glVertexAttrib2sv(index, v);
    }

    // --- [ glVertexAttrib2dv ] ---

    /** {@code void glVertexAttrib2dv(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttrib2dv(int index, long v) {
        GL20C.nglVertexAttrib2dv(index, v);
    }

    /** {@code void glVertexAttrib2dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        GL20C.glVertexAttrib2dv(index, v);
    }

    // --- [ glVertexAttrib3fv ] ---

    /** {@code void glVertexAttrib3fv(GLuint index, GLfloat const * v)} */
    public static void nglVertexAttrib3fv(int index, long v) {
        GL20C.nglVertexAttrib3fv(index, v);
    }

    /** {@code void glVertexAttrib3fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib3fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        GL20C.glVertexAttrib3fv(index, v);
    }

    // --- [ glVertexAttrib3sv ] ---

    /** {@code void glVertexAttrib3sv(GLuint index, GLshort const * v)} */
    public static void nglVertexAttrib3sv(int index, long v) {
        GL20C.nglVertexAttrib3sv(index, v);
    }

    /** {@code void glVertexAttrib3sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib3sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        GL20C.glVertexAttrib3sv(index, v);
    }

    // --- [ glVertexAttrib3dv ] ---

    /** {@code void glVertexAttrib3dv(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttrib3dv(int index, long v) {
        GL20C.nglVertexAttrib3dv(index, v);
    }

    /** {@code void glVertexAttrib3dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        GL20C.glVertexAttrib3dv(index, v);
    }

    // --- [ glVertexAttrib4fv ] ---

    /** {@code void glVertexAttrib4fv(GLuint index, GLfloat const * v)} */
    public static void nglVertexAttrib4fv(int index, long v) {
        GL20C.nglVertexAttrib4fv(index, v);
    }

    /** {@code void glVertexAttrib4fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib4fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        GL20C.glVertexAttrib4fv(index, v);
    }

    // --- [ glVertexAttrib4sv ] ---

    /** {@code void glVertexAttrib4sv(GLuint index, GLshort const * v)} */
    public static void nglVertexAttrib4sv(int index, long v) {
        GL20C.nglVertexAttrib4sv(index, v);
    }

    /** {@code void glVertexAttrib4sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        GL20C.glVertexAttrib4sv(index, v);
    }

    // --- [ glVertexAttrib4dv ] ---

    /** {@code void glVertexAttrib4dv(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttrib4dv(int index, long v) {
        GL20C.nglVertexAttrib4dv(index, v);
    }

    /** {@code void glVertexAttrib4dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        GL20C.glVertexAttrib4dv(index, v);
    }

    // --- [ glVertexAttrib4iv ] ---

    /** {@code void glVertexAttrib4iv(GLuint index, GLint const * v)} */
    public static void nglVertexAttrib4iv(int index, long v) {
        GL20C.nglVertexAttrib4iv(index, v);
    }

    /** {@code void glVertexAttrib4iv(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        GL20C.glVertexAttrib4iv(index, v);
    }

    // --- [ glVertexAttrib4bv ] ---

    /** {@code void glVertexAttrib4bv(GLuint index, GLbyte const * v)} */
    public static void nglVertexAttrib4bv(int index, long v) {
        GL20C.nglVertexAttrib4bv(index, v);
    }

    /** {@code void glVertexAttrib4bv(GLuint index, GLbyte const * v)} */
    public static void glVertexAttrib4bv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        GL20C.glVertexAttrib4bv(index, v);
    }

    // --- [ glVertexAttrib4ubv ] ---

    /** {@code void glVertexAttrib4ubv(GLuint index, GLubyte const * v)} */
    public static void nglVertexAttrib4ubv(int index, long v) {
        GL20C.nglVertexAttrib4ubv(index, v);
    }

    /** {@code void glVertexAttrib4ubv(GLuint index, GLubyte const * v)} */
    public static void glVertexAttrib4ubv(@NativeType("GLuint") int index, @NativeType("GLubyte const *") ByteBuffer v) {
        GL20C.glVertexAttrib4ubv(index, v);
    }

    // --- [ glVertexAttrib4usv ] ---

    /** {@code void glVertexAttrib4usv(GLuint index, GLushort const * v)} */
    public static void nglVertexAttrib4usv(int index, long v) {
        GL20C.nglVertexAttrib4usv(index, v);
    }

    /** {@code void glVertexAttrib4usv(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4usv(@NativeType("GLuint") int index, @NativeType("GLushort const *") ShortBuffer v) {
        GL20C.glVertexAttrib4usv(index, v);
    }

    // --- [ glVertexAttrib4uiv ] ---

    /** {@code void glVertexAttrib4uiv(GLuint index, GLuint const * v)} */
    public static void nglVertexAttrib4uiv(int index, long v) {
        GL20C.nglVertexAttrib4uiv(index, v);
    }

    /** {@code void glVertexAttrib4uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        GL20C.glVertexAttrib4uiv(index, v);
    }

    // --- [ glVertexAttrib4Nbv ] ---

    /** {@code void glVertexAttrib4Nbv(GLuint index, GLbyte const * v)} */
    public static void nglVertexAttrib4Nbv(int index, long v) {
        GL20C.nglVertexAttrib4Nbv(index, v);
    }

    /** {@code void glVertexAttrib4Nbv(GLuint index, GLbyte const * v)} */
    public static void glVertexAttrib4Nbv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        GL20C.glVertexAttrib4Nbv(index, v);
    }

    // --- [ glVertexAttrib4Nsv ] ---

    /** {@code void glVertexAttrib4Nsv(GLuint index, GLshort const * v)} */
    public static void nglVertexAttrib4Nsv(int index, long v) {
        GL20C.nglVertexAttrib4Nsv(index, v);
    }

    /** {@code void glVertexAttrib4Nsv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4Nsv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        GL20C.glVertexAttrib4Nsv(index, v);
    }

    // --- [ glVertexAttrib4Niv ] ---

    /** {@code void glVertexAttrib4Niv(GLuint index, GLint const * v)} */
    public static void nglVertexAttrib4Niv(int index, long v) {
        GL20C.nglVertexAttrib4Niv(index, v);
    }

    /** {@code void glVertexAttrib4Niv(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4Niv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        GL20C.glVertexAttrib4Niv(index, v);
    }

    // --- [ glVertexAttrib4Nubv ] ---

    /** {@code void glVertexAttrib4Nubv(GLuint index, GLubyte const * v)} */
    public static void nglVertexAttrib4Nubv(int index, long v) {
        GL20C.nglVertexAttrib4Nubv(index, v);
    }

    /** {@code void glVertexAttrib4Nubv(GLuint index, GLubyte const * v)} */
    public static void glVertexAttrib4Nubv(@NativeType("GLuint") int index, @NativeType("GLubyte const *") ByteBuffer v) {
        GL20C.glVertexAttrib4Nubv(index, v);
    }

    // --- [ glVertexAttrib4Nusv ] ---

    /** {@code void glVertexAttrib4Nusv(GLuint index, GLushort const * v)} */
    public static void nglVertexAttrib4Nusv(int index, long v) {
        GL20C.nglVertexAttrib4Nusv(index, v);
    }

    /** {@code void glVertexAttrib4Nusv(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4Nusv(@NativeType("GLuint") int index, @NativeType("GLushort const *") ShortBuffer v) {
        GL20C.glVertexAttrib4Nusv(index, v);
    }

    // --- [ glVertexAttrib4Nuiv ] ---

    /** {@code void glVertexAttrib4Nuiv(GLuint index, GLuint const * v)} */
    public static void nglVertexAttrib4Nuiv(int index, long v) {
        GL20C.nglVertexAttrib4Nuiv(index, v);
    }

    /** {@code void glVertexAttrib4Nuiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4Nuiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        GL20C.glVertexAttrib4Nuiv(index, v);
    }

    // --- [ glVertexAttribPointer ] ---

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        GL20C.nglVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        GL20C.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        GL20C.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        GL20C.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        GL20C.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        GL20C.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    // --- [ glEnableVertexAttribArray ] ---

    /** {@code void glEnableVertexAttribArray(GLuint index)} */
    public static void glEnableVertexAttribArray(@NativeType("GLuint") int index) {
        GL20C.glEnableVertexAttribArray(index);
    }

    // --- [ glDisableVertexAttribArray ] ---

    /** {@code void glDisableVertexAttribArray(GLuint index)} */
    public static void glDisableVertexAttribArray(@NativeType("GLuint") int index) {
        GL20C.glDisableVertexAttribArray(index);
    }

    // --- [ glBindAttribLocation ] ---

    /** {@code void glBindAttribLocation(GLuint program, GLuint index, GLchar const * name)} */
    public static void nglBindAttribLocation(int program, int index, long name) {
        GL20C.nglBindAttribLocation(program, index, name);
    }

    /** {@code void glBindAttribLocation(GLuint program, GLuint index, GLchar const * name)} */
    public static void glBindAttribLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        GL20C.glBindAttribLocation(program, index, name);
    }

    /** {@code void glBindAttribLocation(GLuint program, GLuint index, GLchar const * name)} */
    public static void glBindAttribLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name) {
        GL20C.glBindAttribLocation(program, index, name);
    }

    // --- [ glGetActiveAttrib ] ---

    /** {@code void glGetActiveAttrib(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void nglGetActiveAttrib(int program, int index, int maxLength, long length, long size, long type, long name) {
        GL20C.nglGetActiveAttrib(program, index, maxLength, length, size, type, name);
    }

    /** {@code void glGetActiveAttrib(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        GL20C.glGetActiveAttrib(program, index, length, size, type, name);
    }

    /** {@code void glGetActiveAttrib(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int maxLength, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return GL20C.glGetActiveAttrib(program, index, maxLength, size, type);
    }

    /** {@code void glGetActiveAttrib(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetActiveAttrib(program, index, glGetProgrami(program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH), size, type);
    }

    // --- [ glGetAttribLocation ] ---

    /** {@code GLint glGetAttribLocation(GLuint program, GLchar const * name)} */
    public static int nglGetAttribLocation(int program, long name) {
        return GL20C.nglGetAttribLocation(program, name);
    }

    /** {@code GLint glGetAttribLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetAttribLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        return GL20C.glGetAttribLocation(program, name);
    }

    /** {@code GLint glGetAttribLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetAttribLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        return GL20C.glGetAttribLocation(program, name);
    }

    // --- [ glGetVertexAttribiv ] ---

    /** {@code void glGetVertexAttribiv(GLuint index, GLenum pname, GLint * params)} */
    public static void nglGetVertexAttribiv(int index, int pname, long params) {
        GL20C.nglGetVertexAttribiv(index, pname, params);
    }

    /** {@code void glGetVertexAttribiv(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL20C.glGetVertexAttribiv(index, pname, params);
    }

    /** {@code void glGetVertexAttribiv(GLuint index, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetVertexAttribi(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return GL20C.glGetVertexAttribi(index, pname);
    }

    // --- [ glGetVertexAttribfv ] ---

    /** {@code void glGetVertexAttribfv(GLuint index, GLenum pname, GLfloat * params)} */
    public static void nglGetVertexAttribfv(int index, int pname, long params) {
        GL20C.nglGetVertexAttribfv(index, pname, params);
    }

    /** {@code void glGetVertexAttribfv(GLuint index, GLenum pname, GLfloat * params)} */
    public static void glGetVertexAttribfv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        GL20C.glGetVertexAttribfv(index, pname, params);
    }

    // --- [ glGetVertexAttribdv ] ---

    /** {@code void glGetVertexAttribdv(GLuint index, GLenum pname, GLdouble * params)} */
    public static void nglGetVertexAttribdv(int index, int pname, long params) {
        GL20C.nglGetVertexAttribdv(index, pname, params);
    }

    /** {@code void glGetVertexAttribdv(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        GL20C.glGetVertexAttribdv(index, pname, params);
    }

    // --- [ glGetVertexAttribPointerv ] ---

    /** {@code void glGetVertexAttribPointerv(GLuint index, GLenum pname, void ** pointer)} */
    public static void nglGetVertexAttribPointerv(int index, int pname, long pointer) {
        GL20C.nglGetVertexAttribPointerv(index, pname, pointer);
    }

    /** {@code void glGetVertexAttribPointerv(GLuint index, GLenum pname, void ** pointer)} */
    public static void glGetVertexAttribPointerv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer pointer) {
        GL20C.glGetVertexAttribPointerv(index, pname, pointer);
    }

    /** {@code void glGetVertexAttribPointerv(GLuint index, GLenum pname, void ** pointer)} */
    @NativeType("void")
    public static long glGetVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return GL20C.glGetVertexAttribPointer(index, pname);
    }

    // --- [ glDrawBuffers ] ---

    /** {@code void glDrawBuffers(GLsizei n, GLenum const * bufs)} */
    public static void nglDrawBuffers(int n, long bufs) {
        GL20C.nglDrawBuffers(n, bufs);
    }

    /** {@code void glDrawBuffers(GLsizei n, GLenum const * bufs)} */
    public static void glDrawBuffers(@NativeType("GLenum const *") IntBuffer bufs) {
        GL20C.glDrawBuffers(bufs);
    }

    /** {@code void glDrawBuffers(GLsizei n, GLenum const * bufs)} */
    public static void glDrawBuffers(@NativeType("GLenum const *") int buf) {
        GL20C.glDrawBuffers(buf);
    }

    // --- [ glBlendEquationSeparate ] ---

    /** {@code void glBlendEquationSeparate(GLenum modeRGB, GLenum modeAlpha)} */
    public static void glBlendEquationSeparate(@NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha) {
        GL20C.glBlendEquationSeparate(modeRGB, modeAlpha);
    }

    // --- [ glStencilOpSeparate ] ---

    /** {@code void glStencilOpSeparate(GLenum face, GLenum sfail, GLenum dpfail, GLenum dppass)} */
    public static void glStencilOpSeparate(@NativeType("GLenum") int face, @NativeType("GLenum") int sfail, @NativeType("GLenum") int dpfail, @NativeType("GLenum") int dppass) {
        GL20C.glStencilOpSeparate(face, sfail, dpfail, dppass);
    }

    // --- [ glStencilFuncSeparate ] ---

    /** {@code void glStencilFuncSeparate(GLenum face, GLenum func, GLint ref, GLuint mask)} */
    public static void glStencilFuncSeparate(@NativeType("GLenum") int face, @NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask) {
        GL20C.glStencilFuncSeparate(face, func, ref, mask);
    }

    // --- [ glStencilMaskSeparate ] ---

    /** {@code void glStencilMaskSeparate(GLenum face, GLuint mask)} */
    public static void glStencilMaskSeparate(@NativeType("GLenum") int face, @NativeType("GLuint") int mask) {
        GL20C.glStencilMaskSeparate(face, mask);
    }

    /** {@code void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * strings, GLint const * length)} */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer strings, @NativeType("GLint const *") int @Nullable [] length) {
        GL20C.glShaderSource(shader, strings, length);
    }

    /** {@code void glUniform1fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform1fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        GL20C.glUniform1fv(location, value);
    }

    /** {@code void glUniform2fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform2fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        GL20C.glUniform2fv(location, value);
    }

    /** {@code void glUniform3fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform3fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        GL20C.glUniform3fv(location, value);
    }

    /** {@code void glUniform4fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform4fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        GL20C.glUniform4fv(location, value);
    }

    /** {@code void glUniform1iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform1iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        GL20C.glUniform1iv(location, value);
    }

    /** {@code void glUniform2iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform2iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        GL20C.glUniform2iv(location, value);
    }

    /** {@code void glUniform3iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform3iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        GL20C.glUniform3iv(location, value);
    }

    /** {@code void glUniform4iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform4iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        GL20C.glUniform4iv(location, value);
    }

    /** {@code void glUniformMatrix2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL20C.glUniformMatrix2fv(location, transpose, value);
    }

    /** {@code void glUniformMatrix3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL20C.glUniformMatrix3fv(location, transpose, value);
    }

    /** {@code void glUniformMatrix4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL20C.glUniformMatrix4fv(location, transpose, value);
    }

    /** {@code void glGetShaderiv(GLuint shader, GLenum pname, GLint * params)} */
    public static void glGetShaderiv(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL20C.glGetShaderiv(shader, pname, params);
    }

    /** {@code void glGetProgramiv(GLuint program, GLenum pname, GLint * params)} */
    public static void glGetProgramiv(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL20C.glGetProgramiv(program, pname, params);
    }

    /** {@code void glGetShaderInfoLog(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    public static void glGetShaderInfoLog(@NativeType("GLuint") int shader, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        GL20C.glGetShaderInfoLog(shader, length, infoLog);
    }

    /** {@code void glGetProgramInfoLog(GLuint program, GLsizei maxLength, GLsizei * length, GLchar * infoLog)} */
    public static void glGetProgramInfoLog(@NativeType("GLuint") int program, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        GL20C.glGetProgramInfoLog(program, length, infoLog);
    }

    /** {@code void glGetAttachedShaders(GLuint program, GLsizei maxCount, GLsizei * count, GLuint * shaders)} */
    public static void glGetAttachedShaders(@NativeType("GLuint") int program, @NativeType("GLsizei *") int @Nullable [] count, @NativeType("GLuint *") int[] shaders) {
        GL20C.glGetAttachedShaders(program, count, shaders);
    }

    /** {@code void glGetActiveUniform(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        GL20C.glGetActiveUniform(program, index, length, size, type, name);
    }

    /** {@code void glGetUniformfv(GLuint program, GLint location, GLfloat * params)} */
    public static void glGetUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        GL20C.glGetUniformfv(program, location, params);
    }

    /** {@code void glGetUniformiv(GLuint program, GLint location, GLint * params)} */
    public static void glGetUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        GL20C.glGetUniformiv(program, location, params);
    }

    /** {@code void glGetShaderSource(GLuint shader, GLsizei maxLength, GLsizei * length, GLchar * source)} */
    public static void glGetShaderSource(@NativeType("GLuint") int shader, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer source) {
        GL20C.glGetShaderSource(shader, length, source);
    }

    /** {@code void glVertexAttrib1fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib1fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        GL20C.glVertexAttrib1fv(index, v);
    }

    /** {@code void glVertexAttrib1sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib1sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        GL20C.glVertexAttrib1sv(index, v);
    }

    /** {@code void glVertexAttrib1dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        GL20C.glVertexAttrib1dv(index, v);
    }

    /** {@code void glVertexAttrib2fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib2fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        GL20C.glVertexAttrib2fv(index, v);
    }

    /** {@code void glVertexAttrib2sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib2sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        GL20C.glVertexAttrib2sv(index, v);
    }

    /** {@code void glVertexAttrib2dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        GL20C.glVertexAttrib2dv(index, v);
    }

    /** {@code void glVertexAttrib3fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib3fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        GL20C.glVertexAttrib3fv(index, v);
    }

    /** {@code void glVertexAttrib3sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib3sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        GL20C.glVertexAttrib3sv(index, v);
    }

    /** {@code void glVertexAttrib3dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        GL20C.glVertexAttrib3dv(index, v);
    }

    /** {@code void glVertexAttrib4fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib4fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        GL20C.glVertexAttrib4fv(index, v);
    }

    /** {@code void glVertexAttrib4sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        GL20C.glVertexAttrib4sv(index, v);
    }

    /** {@code void glVertexAttrib4dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        GL20C.glVertexAttrib4dv(index, v);
    }

    /** {@code void glVertexAttrib4iv(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        GL20C.glVertexAttrib4iv(index, v);
    }

    /** {@code void glVertexAttrib4usv(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4usv(@NativeType("GLuint") int index, @NativeType("GLushort const *") short[] v) {
        GL20C.glVertexAttrib4usv(index, v);
    }

    /** {@code void glVertexAttrib4uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        GL20C.glVertexAttrib4uiv(index, v);
    }

    /** {@code void glVertexAttrib4Nsv(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4Nsv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        GL20C.glVertexAttrib4Nsv(index, v);
    }

    /** {@code void glVertexAttrib4Niv(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4Niv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        GL20C.glVertexAttrib4Niv(index, v);
    }

    /** {@code void glVertexAttrib4Nusv(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4Nusv(@NativeType("GLuint") int index, @NativeType("GLushort const *") short[] v) {
        GL20C.glVertexAttrib4Nusv(index, v);
    }

    /** {@code void glVertexAttrib4Nuiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4Nuiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        GL20C.glVertexAttrib4Nuiv(index, v);
    }

    /** {@code void glGetActiveAttrib(GLuint program, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        GL20C.glGetActiveAttrib(program, index, length, size, type, name);
    }

    /** {@code void glGetVertexAttribiv(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL20C.glGetVertexAttribiv(index, pname, params);
    }

    /** {@code void glGetVertexAttribfv(GLuint index, GLenum pname, GLfloat * params)} */
    public static void glGetVertexAttribfv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        GL20C.glGetVertexAttribfv(index, pname, params);
    }

    /** {@code void glGetVertexAttribdv(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        GL20C.glGetVertexAttribdv(index, pname, params);
    }

    /** {@code void glDrawBuffers(GLsizei n, GLenum const * bufs)} */
    public static void glDrawBuffers(@NativeType("GLenum const *") int[] bufs) {
        GL20C.glDrawBuffers(bufs);
    }

}