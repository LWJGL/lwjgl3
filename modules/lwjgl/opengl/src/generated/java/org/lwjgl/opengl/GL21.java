/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * The OpenGL functionality up to version 2.1. Includes the deprecated symbols of the Compatibility Profile.
 * 
 * <p>OpenGL 2.1 implementations must support at least revision 1.20 of the OpenGL Shading Language.</p>
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_pixel_buffer_object.txt">ARB_pixel_buffer_object</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_sRGB.txt">EXT_texture_sRGB</a></li>
 * </ul>
 */
public class GL21 extends GL20 {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_CURRENT_RASTER_SECONDARY_COLOR = 0x845F;

    /** Returned by the {@code type} parameter of GetActiveUniform. */
    public static final int
        GL_FLOAT_MAT2x3 = 0x8B65,
        GL_FLOAT_MAT2x4 = 0x8B66,
        GL_FLOAT_MAT3x2 = 0x8B67,
        GL_FLOAT_MAT3x4 = 0x8B68,
        GL_FLOAT_MAT4x2 = 0x8B69,
        GL_FLOAT_MAT4x3 = 0x8B6A;

    /**
     * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferParameteriv, and
     * GetBufferPointerv.
     */
    public static final int
        GL_PIXEL_PACK_BUFFER   = 0x88EB,
        GL_PIXEL_UNPACK_BUFFER = 0x88EC;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_PIXEL_PACK_BUFFER_BINDING   = 0x88ED,
        GL_PIXEL_UNPACK_BUFFER_BINDING = 0x88EF;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D. */
    public static final int
        GL_SRGB                        = 0x8C40,
        GL_SRGB8                       = 0x8C41,
        GL_SRGB_ALPHA                  = 0x8C42,
        GL_SRGB8_ALPHA8                = 0x8C43,
        GL_SLUMINANCE_ALPHA            = 0x8C44,
        GL_SLUMINANCE8_ALPHA8          = 0x8C45,
        GL_SLUMINANCE                  = 0x8C46,
        GL_SLUMINANCE8                 = 0x8C47,
        GL_COMPRESSED_SRGB             = 0x8C48,
        GL_COMPRESSED_SRGB_ALPHA       = 0x8C49,
        GL_COMPRESSED_SLUMINANCE       = 0x8C4A,
        GL_COMPRESSED_SLUMINANCE_ALPHA = 0x8C4B;

    protected GL21() {
        throw new UnsupportedOperationException();
    }

    // --- [ glUniformMatrix2x3fv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix2x3fv UniformMatrix2x3fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglUniformMatrix2x3fv(int location, int count, boolean transpose, long value) {
        GL21C.nglUniformMatrix2x3fv(location, count, transpose, value);
    }

    /**
     * Specifies the value of a single mat2x3 uniform variable or a mat2x3 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix2x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL21C.glUniformMatrix2x3fv(location, transpose, value);
    }

    // --- [ glUniformMatrix3x2fv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix3x2fv UniformMatrix3x2fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglUniformMatrix3x2fv(int location, int count, boolean transpose, long value) {
        GL21C.nglUniformMatrix3x2fv(location, count, transpose, value);
    }

    /**
     * Specifies the value of a single mat3x2 uniform variable or a mat3x2 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix3x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL21C.glUniformMatrix3x2fv(location, transpose, value);
    }

    // --- [ glUniformMatrix2x4fv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix2x4fv UniformMatrix2x4fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglUniformMatrix2x4fv(int location, int count, boolean transpose, long value) {
        GL21C.nglUniformMatrix2x4fv(location, count, transpose, value);
    }

    /**
     * Specifies the value of a single mat2x4 uniform variable or a mat2x4 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix2x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL21C.glUniformMatrix2x4fv(location, transpose, value);
    }

    // --- [ glUniformMatrix4x2fv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix4x2fv UniformMatrix4x2fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglUniformMatrix4x2fv(int location, int count, boolean transpose, long value) {
        GL21C.nglUniformMatrix4x2fv(location, count, transpose, value);
    }

    /**
     * Specifies the value of a single mat4x2 uniform variable or a mat4x2 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix4x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL21C.glUniformMatrix4x2fv(location, transpose, value);
    }

    // --- [ glUniformMatrix3x4fv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix3x4fv UniformMatrix3x4fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglUniformMatrix3x4fv(int location, int count, boolean transpose, long value) {
        GL21C.nglUniformMatrix3x4fv(location, count, transpose, value);
    }

    /**
     * Specifies the value of a single mat3x4 uniform variable or a mat3x4 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix3x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL21C.glUniformMatrix3x4fv(location, transpose, value);
    }

    // --- [ glUniformMatrix4x3fv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix4x3fv UniformMatrix4x3fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglUniformMatrix4x3fv(int location, int count, boolean transpose, long value) {
        GL21C.nglUniformMatrix4x3fv(location, count, transpose, value);
    }

    /**
     * Specifies the value of a single mat4x3 uniform variable or a mat4x3 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix4x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL21C.glUniformMatrix4x3fv(location, transpose, value);
    }

    /**
     * Array version of: {@link #glUniformMatrix2x3fv UniformMatrix2x3fv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix2x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL21C.glUniformMatrix2x3fv(location, transpose, value);
    }

    /**
     * Array version of: {@link #glUniformMatrix3x2fv UniformMatrix3x2fv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix3x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL21C.glUniformMatrix3x2fv(location, transpose, value);
    }

    /**
     * Array version of: {@link #glUniformMatrix2x4fv UniformMatrix2x4fv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix2x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL21C.glUniformMatrix2x4fv(location, transpose, value);
    }

    /**
     * Array version of: {@link #glUniformMatrix4x2fv UniformMatrix4x2fv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix4x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL21C.glUniformMatrix4x2fv(location, transpose, value);
    }

    /**
     * Array version of: {@link #glUniformMatrix3x4fv UniformMatrix3x4fv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix3x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL21C.glUniformMatrix3x4fv(location, transpose, value);
    }

    /**
     * Array version of: {@link #glUniformMatrix4x3fv UniformMatrix4x3fv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix4x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL21C.glUniformMatrix4x3fv(location, transpose, value);
    }

}