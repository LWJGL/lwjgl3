/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_array.txt">EXT_texture_array</a> extension.
 * 
 * <p>This extension introduces the notion of one- and two-dimensional array textures. An array texture is a collection of one- and two-dimensional images of
 * identical size and format, arranged in layers. A one-dimensional array texture is specified using TexImage2D; a two-dimensional array texture is
 * specified using TexImage3D. The height (1D array) or depth (2D array) specify the number of layers in the image.</p>
 * 
 * <p>An array texture is accessed as a single unit in a programmable shader, using a single coordinate vector. A single layer is selected, and that layer is
 * then accessed as though it were a one- or two-dimensional texture. The layer used is specified using the "t" or "r" texture coordinate for 1D and 2D
 * array textures, respectively. The layer coordinate is provided as an unnormalized floating-point value in the range {@code [0,<n>-1]}, where
 * {@code <n>} is the number of layers in the array texture. Texture lookups do not filter between layers, though such filtering can be achieved using
 * programmable shaders. When mipmapping is used, each level of an array texture has the same number of layers as the base level; the number of layers is
 * not reduced as the image size decreases.</p>
 * 
 * <p>Array textures can be rendered to by binding them to a framebuffer object (EXT_framebuffer_object). A single layer of an array texture can be bound
 * using normal framebuffer object mechanisms, or an entire array texture can be bound and rendered to using the layered rendering mechanisms provided by
 * NV_geometry_program4.</p>
 * 
 * <p>This extension does not provide for the use of array textures with fixed-function fragment processing. Such support could be added by providing an
 * additional extension allowing applications to pass the new target enumerants (TEXTURE_1D_ARRAY_EXT and TEXTURE_2D_ARRAY_EXT) to Enable and Disable.</p>
 * 
 * <p>Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public class EXTTextureArray {

    static { GL.initialize(); }

    /** Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, GenerateMipmapEXT, and BindTexture. */
    public static final int
        GL_TEXTURE_1D_ARRAY_EXT = 0x8C18,
        GL_TEXTURE_2D_ARRAY_EXT = 0x8C1A;

    /** Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CopyTexSubImage3D, CompressedTexImage3D, and CompressedTexSubImage3D. */
    public static final int GL_PROXY_TEXTURE_2D_ARRAY_EXT = 0x8C1B;

    /**
     * Accepted by the {@code target} parameter of TexImage2D, TexSubImage2D, CopyTexImage2D, CopyTexSubImage2D, CompressedTexImage2D, and
     * CompressedTexSubImage2D.
     */
    public static final int GL_PROXY_TEXTURE_1D_ARRAY_EXT = 0x8C19;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv. */
    public static final int
        GL_TEXTURE_BINDING_1D_ARRAY_EXT = 0x8C1C,
        GL_TEXTURE_BINDING_2D_ARRAY_EXT = 0x8C1D,
        GL_MAX_ARRAY_TEXTURE_LAYERS_EXT = 0x88FF;

    /**
     * Accepted by the {@code param} parameter of TexParameterf, TexParameteri, TexParameterfv, and TexParameteriv when the {@code pname} parameter is
     * TEXTURE_COMPARE_MODE_ARB.
     */
    public static final int GL_COMPARE_REF_DEPTH_TO_TEXTURE_EXT = 0x884E;

    /**
     * COMPARE_REF_DEPTH_TO_TEXTURE_EXT is simply an alias for the existing COMPARE_R_TO_TEXTURE token in OpenGL 2.0; the alternate name reflects the fact that
     * the R coordinate is not always used.) Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameterivEXT.
     */
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT = 0x8CD4;

    /**
     * FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER is simply an alias for the FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT token provided in EXT_framebuffer_object.
     * This extension generalizes the notion of "{@code zoffset}" to include layers of an array texture.) Returned by the {@code type} parameter of
     * GetActiveUniform.
     */
    public static final int
        GL_SAMPLER_1D_ARRAY_EXT        = 0x8DC0,
        GL_SAMPLER_2D_ARRAY_EXT        = 0x8DC1,
        GL_SAMPLER_1D_ARRAY_SHADOW_EXT = 0x8DC3,
        GL_SAMPLER_2D_ARRAY_SHADOW_EXT = 0x8DC4;

    protected EXTTextureArray() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferTextureLayerEXT ] ---

    public static native void glFramebufferTextureLayerEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer);

}