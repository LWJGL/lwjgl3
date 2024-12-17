/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBES2Compatibility {

    static { GL.initialize(); }

    public static final int
        GL_SHADER_COMPILER                  = 0x8DFA,
        GL_SHADER_BINARY_FORMATS            = 0x8DF8,
        GL_NUM_SHADER_BINARY_FORMATS        = 0x8DF9,
        GL_MAX_VERTEX_UNIFORM_VECTORS       = 0x8DFB,
        GL_MAX_VARYING_VECTORS              = 0x8DFC,
        GL_MAX_FRAGMENT_UNIFORM_VECTORS     = 0x8DFD,
        GL_IMPLEMENTATION_COLOR_READ_TYPE   = 0x8B9A,
        GL_IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;

    public static final int GL_FIXED = 0x140C;

    public static final int
        GL_LOW_FLOAT    = 0x8DF0,
        GL_MEDIUM_FLOAT = 0x8DF1,
        GL_HIGH_FLOAT   = 0x8DF2,
        GL_LOW_INT      = 0x8DF3,
        GL_MEDIUM_INT   = 0x8DF4,
        GL_HIGH_INT     = 0x8DF5;

    public static final int GL_RGB565 = 0x8D62;

    protected ARBES2Compatibility() {
        throw new UnsupportedOperationException();
    }

    // --- [ glReleaseShaderCompiler ] ---

    /** {@code void glReleaseShaderCompiler(void)} */
    public static void glReleaseShaderCompiler() {
        GL41C.glReleaseShaderCompiler();
    }

    // --- [ glShaderBinary ] ---

    /** {@code void glShaderBinary(GLsizei count, GLuint const * shaders, GLenum binaryformat, void const * binary, GLsizei length)} */
    public static void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length) {
        GL41C.nglShaderBinary(count, shaders, binaryformat, binary, length);
    }

    /** {@code void glShaderBinary(GLsizei count, GLuint const * shaders, GLenum binaryformat, void const * binary, GLsizei length)} */
    public static void glShaderBinary(@NativeType("GLuint const *") IntBuffer shaders, @NativeType("GLenum") int binaryformat, @NativeType("void const *") ByteBuffer binary) {
        GL41C.glShaderBinary(shaders, binaryformat, binary);
    }

    // --- [ glGetShaderPrecisionFormat ] ---

    /** {@code void glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint * range, GLint * precision)} */
    public static void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision) {
        GL41C.nglGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    /** {@code void glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint * range, GLint * precision)} */
    public static void glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") IntBuffer range, @NativeType("GLint *") IntBuffer precision) {
        GL41C.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    /** {@code void glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint * range, GLint * precision)} */
    @NativeType("void")
    public static int glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") IntBuffer range) {
        return GL41C.glGetShaderPrecisionFormat(shadertype, precisiontype, range);
    }

    // --- [ glDepthRangef ] ---

    /** {@code void glDepthRangef(GLfloat zNear, GLfloat zFar)} */
    public static void glDepthRangef(@NativeType("GLfloat") float zNear, @NativeType("GLfloat") float zFar) {
        GL41C.glDepthRangef(zNear, zFar);
    }

    // --- [ glClearDepthf ] ---

    /** {@code void glClearDepthf(GLfloat depth)} */
    public static void glClearDepthf(@NativeType("GLfloat") float depth) {
        GL41C.glClearDepthf(depth);
    }

    /** {@code void glShaderBinary(GLsizei count, GLuint const * shaders, GLenum binaryformat, void const * binary, GLsizei length)} */
    public static void glShaderBinary(@NativeType("GLuint const *") int[] shaders, @NativeType("GLenum") int binaryformat, @NativeType("void const *") ByteBuffer binary) {
        GL41C.glShaderBinary(shaders, binaryformat, binary);
    }

    /** {@code void glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint * range, GLint * precision)} */
    public static void glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") int[] range, @NativeType("GLint *") int[] precision) {
        GL41C.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

}