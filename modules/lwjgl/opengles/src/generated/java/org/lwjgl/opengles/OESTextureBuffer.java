/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_texture_buffer.txt">OES_texture_buffer</a> extension.
 * 
 * <p>This extension provides a new texture type, called a buffer texture. Buffer textures are one-dimensional arrays of texels whose storage comes from an
 * attached buffer object. When a buffer object is bound to a buffer texture, a format is specified, and the data in the buffer object is treated as an
 * array of texels of the specified format.</p>
 * 
 * <p>The use of a buffer object to provide storage allows the texture data to be specified in a number of different ways: via buffer object loads
 * (BufferData), direct CPU writes (MapBuffer), or framebuffer readbacks to pixel buffer objects (ReadPixels). A buffer object can also be loaded by
 * transform feedback, which captures selected transformed attributes of vertices processed by the GL. Several of these mechanisms do not require an extra
 * data copy, which would be required when using conventional TexImage-like entry points.</p>
 * 
 * <p>Buffer textures do not support mipmapping, texture lookups with normalized floating-point texture coordinates, and texture filtering of any sort. They
 * can be accessed via single texel fetch operations in programmable shaders, using a new sampler type and texel fetch function, and access can be
 * controlled using the same memory barrier operations as for other texture types.</p>
 * 
 * <p>Buffer textures are treated as (potentially large) one-dimensional textures; the maximum texture size supported for buffer textures in the initial
 * implementation of this extension is 2<sup>27</sup> texels (note that this extension only guarantees support for buffer textures with 2<sup>16</sup>
 * texels, but we expect most implementations to exceed that substantially). When a buffer object is attached to a buffer texture, a size is not
 * specified; rather, the number of texels in the texture is taken by dividing the size of the buffer object by the size of each texel.</p>
 * 
 * <p>This extension also allows a sub-range of the buffer's data store to be attached to a texture. This can be used, for example, to allow multiple buffer
 * textures to be backed by independent sub-ranges of the same buffer object, or for different sub-ranges of a single buffer object to be used for
 * different purposes.</p>
 * 
 * <p>Requires {@link GLES31 GLES 3.1}.</p>
 */
public class OESTextureBuffer {

    static { GLES.initialize(); }

    /**
     * Accepted by the {@code target} parameter of BindBuffer, BufferData, BufferSubData, MapBufferRange, BindTexture, UnmapBuffer, GetBufferParameteriv,
     * GetBufferPointerv, TexBufferOES, and TexBufferRangeOES.
     */
    public static final int GL_TEXTURE_BUFFER_OES = 0x8C2A;

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetFloatv, and GetIntegerv. */
    public static final int GL_TEXTURE_BUFFER_BINDING_OES = 0x8C2A;

    /**
     * (note that this token name is an alias for TEXTURE_BUFFER_OES, and is used for naming consistency with queries for the buffers bound to other buffer
     * binding points). MAX_TEXTURE_BUFFER_SIZE_OES 0x8C2B TEXTURE_BINDING_BUFFER_OES 0x8C2C TEXTURE_BUFFER_OFFSET_ALIGNMENT_OES 0x919F Returned in the
     * {@code type} parameter of GetActiveUniform, the {@code params} parameter of GetActiveUniformsiv, and the {@code params} parameter of
     * GetProgramResourceiv when the TYPE property is queried on the UNIFORM interface.
     */
    public static final int
        GL_SAMPLER_BUFFER_OES              = 0x8DC2,
        GL_INT_SAMPLER_BUFFER_OES          = 0x8DD0,
        GL_UNSIGNED_INT_SAMPLER_BUFFER_OES = 0x8DD8,
        GL_IMAGE_BUFFER_OES                = 0x9051,
        GL_INT_IMAGE_BUFFER_OES            = 0x905C,
        GL_UNSIGNED_INT_IMAGE_BUFFER_OES   = 0x9067;

    /** Accepted by the {@code pname} parameter of GetTexLevelParameter. */
    public static final int
        GL_TEXTURE_BUFFER_DATA_STORE_BINDING_OES = 0x8C2D,
        GL_TEXTURE_BUFFER_OFFSET_OES             = 0x919D,
        GL_TEXTURE_BUFFER_SIZE_OES               = 0x919E;

    protected OESTextureBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexBufferOES ] ---

    public static native void glTexBufferOES(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer);

    // --- [ glTexBufferRangeOES ] ---

    public static native void glTexBufferRangeOES(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

}