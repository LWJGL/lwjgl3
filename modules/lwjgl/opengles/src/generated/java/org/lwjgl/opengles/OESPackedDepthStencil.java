/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_packed_depth_stencil.txt">OES_packed_depth_stencil</a> extension.
 * 
 * <p>Many OpenGL implementations have chosen to interleave the depth and stencil buffers into one buffer, often with 24 bits of depth precision and 8 bits
 * of stencil data. 32 bits is more than is needed for the depth buffer much of the time; a 24-bit depth buffer, on the other hand, requires that reads
 * and writes of depth data be unaligned with respect to power-of-two boundaries. On the other hand, 8 bits of stencil data is more than sufficient for
 * most applications, so it is only natural to pack the two buffers into a single buffer with both depth and stencil data. OpenGL never provides direct
 * access to the buffers, so the OpenGL implementation can provide an interface to applications where it appears the one merged buffer is composed of two
 * logical buffers.</p>
 * 
 * <p>One disadvantage of this scheme is that OpenGL lacks any means by which this packed data can be handled efficiently. For example, when an application
 * reads from the 24-bit depth buffer, using the type GL_UNSIGNED_SHORT will lose 8 bits of data, while GL_UNSIGNED_INT has 8 too many. Both require
 * expensive format conversion operations. A 24-bit format would be no more suitable, because it would also suffer from the unaligned memory accesses that
 * made the standalone 24-bit depth buffer an unattractive proposition in the first place.</p>
 * 
 * <p>If OES_depth_texture is supported, a new data format, GL_DEPTH_STENCIL_OES, as well as a packed data type, UNSIGNED_INT_24_8_OES, together can be used
 * with glTex[Sub]Image2D. This provides an efficient way to supply data for a 24-bit depth texture. When a texture with DEPTH_STENCIL_OES data is bound
 * for texturing, only the depth component is accessible through the texture fetcher.</p>
 * 
 * <p>This extension also provides a new sized internal format, DEPTH24_STENCIL8_OES, which can be used for renderbuffer storage. When a renderbuffer or
 * texture image with a DEPTH_STENCIL_OES base internal format is attached to both the depth and stencil attachment points of a framebuffer object, then
 * it becomes both the depth and stencil buffers of the framebuffer. This fits nicely with hardware that interleaves both depth and stencil data into a
 * single buffer.</p>
 */
public final class OESPackedDepthStencil {

    /** Accepted by the {@code format} parameter of TexImage2D and TexSubImage2D and by the {@code internalformat} parameter of TexImage2D. */
    public static final int GL_DEPTH_STENCIL_OES = 0x84F9;

    /** Accepted by the {@code type} parameter of TexImage2D and TexSubImage2D. */
    public static final int GL_UNSIGNED_INT_24_8_OES = 0x84FA;

    /**
     * Accepted by the {@code internalformat} parameter of RenderbufferStorage, and returned in the {@code params} parameter of GetRenderbufferParameteriv when
     * {@code pname} is RENDERBUFFER_INTERNAL_FORMAT.
     */
    public static final int GL_DEPTH24_STENCIL8_OES = 0x88F0;

    private OESPackedDepthStencil() {}

}