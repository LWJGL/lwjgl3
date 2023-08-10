/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_multisample.txt">ARB_texture_multisample</a> extension.
 * 
 * <p>This extension provides support for two new types of "multisample textures" - two-dimensional and two-dimensional array - as well as mechanisms to
 * fetch a specific sample from such a texture in a shader, and to attach such textures to FBOs for rendering.</p>
 * 
 * <p>This extension also includes the following functionality, first described in {@link NVExplicitMultisample NV_explicit_multisample}:</p>
 * 
 * <ul>
 * <li>A query in the API to query the location of samples within the pixel</li>
 * <li>An explicit control for the multisample sample mask to augment the control provided by SampleCoverage</li>
 * </ul>
 * 
 * <p>Promoted to core in {@link GL32 OpenGL 3.2}.</p>
 */
public class ARBTextureMultisample {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetMultisamplefv. */
    public static final int GL_SAMPLE_POSITION = 0x8E50;

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    public static final int GL_SAMPLE_MASK = 0x8E51;

    /** Accepted by the {@code target} parameter of GetBooleani_v and GetIntegeri_v. */
    public static final int GL_SAMPLE_MASK_VALUE = 0x8E52;

    /** Accepted by the {@code target} parameter of BindTexture and TexImage2DMultisample. */
    public static final int GL_TEXTURE_2D_MULTISAMPLE = 0x9100;

    /** Accepted by the {@code target} parameter of TexImage2DMultisample. */
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 0x9101;

    /** Accepted by the {@code target} parameter of BindTexture and TexImage3DMultisample. */
    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;

    /** Accepted by the {@code target} parameter of TexImage3DMultisample. */
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9103;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
    public static final int
        GL_MAX_SAMPLE_MASK_WORDS                = 0x8E59,
        GL_MAX_COLOR_TEXTURE_SAMPLES            = 0x910E,
        GL_MAX_DEPTH_TEXTURE_SAMPLES            = 0x910F,
        GL_MAX_INTEGER_SAMPLES                  = 0x9110,
        GL_TEXTURE_BINDING_2D_MULTISAMPLE       = 0x9104,
        GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;

    /** Accepted by the {@code pname} parameter of GetTexLevelParameter. */
    public static final int
        GL_TEXTURE_SAMPLES                = 0x9106,
        GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 0x9107;

    /** Returned by the {@code type} parameter of GetActiveUniform. */
    public static final int
        GL_SAMPLER_2D_MULTISAMPLE                    = 0x9108,
        GL_INT_SAMPLER_2D_MULTISAMPLE                = 0x9109,
        GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE       = 0x910A,
        GL_SAMPLER_2D_MULTISAMPLE_ARRAY              = 0x910B,
        GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY          = 0x910C,
        GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;

    protected ARBTextureMultisample() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexImage2DMultisample ] ---

    /**
     * Establishes the data storage, format, dimensions, and number of samples of a 2D multisample texture's image.
     *
     * @param target               the target of the operation. One of:<br><table><tr><td>{@link GL32C#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32C#GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}</td></tr></table>
     * @param samples              the number of samples in the multisample texture's image
     * @param internalformat       the internal format to be used to store the multisample texture's image. {@code internalformat} must specify a color-renderable, depth-renderable,
     *                             or stencil-renderable format.
     * @param width                the width of the multisample texture's image, in texels
     * @param height               the height of the multisample texture's image, in texels
     * @param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
     *                             depend on the internal format or size of the image
     */
    public static void glTexImage2DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations) {
        GL32C.glTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
    }

    // --- [ glTexImage3DMultisample ] ---

    /**
     * Establishes the data storage, format, dimensions, and number of samples of a 3D multisample texture's image.
     *
     * @param target               the target of the operation. One of:<br><table><tr><td>{@link GL32C#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td><td>{@link GL32C#GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
     * @param samples              the number of samples in the multisample texture's image
     * @param internalformat       the internal format to be used to store the multisample texture's image. {@code internalformat} must specify a color-renderable, depth-renderable,
     *                             or stencil-renderable format.
     * @param width                the width of the multisample texture's image, in texels
     * @param height               the height of the multisample texture's image, in texels
     * @param depth                the depth of the multisample texture's image, in texels
     * @param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
     *                             depend on the internal format or size of the image
     */
    public static void glTexImage3DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations) {
        GL32C.glTexImage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    // --- [ glGetMultisamplefv ] ---

    /** Unsafe version of: {@link #glGetMultisamplefv GetMultisamplefv} */
    public static void nglGetMultisamplefv(int pname, int index, long val) {
        GL32C.nglGetMultisamplefv(pname, index, val);
    }

    /**
     * Retrieves the location of a sample.
     *
     * @param pname the sample parameter name. Must be:<br><table><tr><td>{@link GL32C#GL_SAMPLE_POSITION SAMPLE_POSITION}</td></tr></table>
     * @param index the index of the sample whose position to query
     * @param val   an array to receive the position of the sample
     */
    public static void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer val) {
        GL32C.glGetMultisamplefv(pname, index, val);
    }

    /**
     * Retrieves the location of a sample.
     *
     * @param pname the sample parameter name. Must be:<br><table><tr><td>{@link GL32C#GL_SAMPLE_POSITION SAMPLE_POSITION}</td></tr></table>
     * @param index the index of the sample whose position to query
     */
    @NativeType("void")
    public static float glGetMultisamplef(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        return GL32C.glGetMultisamplef(pname, index);
    }

    // --- [ glSampleMaski ] ---

    /**
     * Sets the value of a sub-word of the sample mask.
     *
     * @param index which 32-bit sub-word of the sample mask to update
     * @param mask  the new value of the mask sub-word
     */
    public static void glSampleMaski(@NativeType("GLuint") int index, @NativeType("GLbitfield") int mask) {
        GL32C.glSampleMaski(index, mask);
    }

    /** Array version of: {@link #glGetMultisamplefv GetMultisamplefv} */
    public static void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] val) {
        GL32C.glGetMultisamplefv(pname, index, val);
    }

}