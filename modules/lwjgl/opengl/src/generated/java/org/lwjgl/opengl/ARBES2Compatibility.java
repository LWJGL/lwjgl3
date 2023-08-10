/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_ES2_compatibility.txt">ARB_ES2_compatibility</a> extension.
 * 
 * <p>This extension adds support for features of OpenGL ES 2.0 that are missing from OpenGL 3.x. Enabling these features will ease the process of porting
 * applications from OpenGL ES 2.0 to OpenGL.</p>
 * 
 * <p>Promoted to core in {@link GL41 OpenGL 4.1}.</p>
 */
public class ARBES2Compatibility {

    static { GL.initialize(); }

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int
        GL_SHADER_COMPILER                  = 0x8DFA,
        GL_SHADER_BINARY_FORMATS            = 0x8DF8,
        GL_NUM_SHADER_BINARY_FORMATS        = 0x8DF9,
        GL_MAX_VERTEX_UNIFORM_VECTORS       = 0x8DFB,
        GL_MAX_VARYING_VECTORS              = 0x8DFC,
        GL_MAX_FRAGMENT_UNIFORM_VECTORS     = 0x8DFD,
        GL_IMPLEMENTATION_COLOR_READ_TYPE   = 0x8B9A,
        GL_IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;

    /** Accepted by the {@code type} parameter of VertexAttribPointer. */
    public static final int GL_FIXED = 0x140C;

    /** Accepted by the {@code precisiontype} parameter of GetShaderPrecisionFormat. */
    public static final int
        GL_LOW_FLOAT    = 0x8DF0,
        GL_MEDIUM_FLOAT = 0x8DF1,
        GL_HIGH_FLOAT   = 0x8DF2,
        GL_LOW_INT      = 0x8DF3,
        GL_MEDIUM_INT   = 0x8DF4,
        GL_HIGH_INT     = 0x8DF5;

    /** Accepted by the {@code format} parameter of most commands taking sized internal formats. */
    public static final int GL_RGB565 = 0x8D62;

    protected ARBES2Compatibility() {
        throw new UnsupportedOperationException();
    }

    // --- [ glReleaseShaderCompiler ] ---

    /** Releases resources allocated by the shader compiler. This is a hint from the application, and does not prevent later use of the shader compiler. */
    public static void glReleaseShaderCompiler() {
        GL41C.glReleaseShaderCompiler();
    }

    // --- [ glShaderBinary ] ---

    /**
     * Unsafe version of: {@link #glShaderBinary ShaderBinary}
     *
     * @param count  the number of shader object handles contained in {@code shaders}
     * @param length the length of the array whose address is given in binary
     */
    public static void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length) {
        GL41C.nglShaderBinary(count, shaders, binaryformat, binary, length);
    }

    /**
     * Loads pre-compiled shader binaries.
     *
     * @param shaders      an array of shader handles into which to load pre-compiled shader binaries
     * @param binaryformat the format of the shader binaries contained in {@code binary}
     * @param binary       an array of bytes containing pre-compiled binary shader code
     */
    public static void glShaderBinary(@NativeType("GLuint const *") IntBuffer shaders, @NativeType("GLenum") int binaryformat, @NativeType("void const *") ByteBuffer binary) {
        GL41C.glShaderBinary(shaders, binaryformat, binary);
    }

    // --- [ glGetShaderPrecisionFormat ] ---

    /** Unsafe version of: {@link #glGetShaderPrecisionFormat GetShaderPrecisionFormat} */
    public static void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision) {
        GL41C.nglGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    /**
     * Retrieves the range and precision for numeric formats supported by the shader compiler.
     *
     * @param shadertype    the type of shader whose precision to query. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td></tr></table>
     * @param precisiontype the numeric format whose precision and range to query
     * @param range         the address of array of two integers into which encodings of the implementation's numeric range are returned
     * @param precision     the address of an integer into which the numeric precision of the implementation is written
     */
    public static void glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") IntBuffer range, @NativeType("GLint *") IntBuffer precision) {
        GL41C.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    /**
     * Retrieves the range and precision for numeric formats supported by the shader compiler.
     *
     * @param shadertype    the type of shader whose precision to query. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td></tr></table>
     * @param precisiontype the numeric format whose precision and range to query
     * @param range         the address of array of two integers into which encodings of the implementation's numeric range are returned
     */
    @NativeType("void")
    public static int glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") IntBuffer range) {
        return GL41C.glGetShaderPrecisionFormat(shadertype, precisiontype, range);
    }

    // --- [ glDepthRangef ] ---

    /**
     * Specifies mapping of depth values from normalized device coordinates to window coordinates
     *
     * @param zNear the mapping of the near clipping plane to window coordinates. The initial value is 0.0f.
     * @param zFar  the mapping of the far clipping plane to window coordinates. The initial value is 1.0f.
     */
    public static void glDepthRangef(@NativeType("GLfloat") float zNear, @NativeType("GLfloat") float zFar) {
        GL41C.glDepthRangef(zNear, zFar);
    }

    // --- [ glClearDepthf ] ---

    /**
     * Specifies the clear value for the depth buffer
     *
     * @param depth the depth value used when the depth buffer is cleared. The initial value is 1.0f.
     */
    public static void glClearDepthf(@NativeType("GLfloat") float depth) {
        GL41C.glClearDepthf(depth);
    }

    /** Array version of: {@link #glShaderBinary ShaderBinary} */
    public static void glShaderBinary(@NativeType("GLuint const *") int[] shaders, @NativeType("GLenum") int binaryformat, @NativeType("void const *") ByteBuffer binary) {
        GL41C.glShaderBinary(shaders, binaryformat, binary);
    }

    /** Array version of: {@link #glGetShaderPrecisionFormat GetShaderPrecisionFormat} */
    public static void glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") int[] range, @NativeType("GLint *") int[] precision) {
        GL41C.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

}