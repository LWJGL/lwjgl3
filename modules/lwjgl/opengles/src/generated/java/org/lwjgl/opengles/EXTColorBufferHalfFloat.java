/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_color_buffer_half_float.txt">EXT_color_buffer_half_float</a> extension.
 * 
 * <p>This extension allows 16-bit floating point formats as defined in OES_texture_half_float to be rendered to via framebuffer objects.</p>
 * 
 * <p>When using floating-point formats, certain color clamps are disabled.</p>
 * 
 * <p>This extension also updates the framebuffer object API to allow querying attachment component types.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public final class EXTColorBufferHalfFloat {

    /** Accepted by the {@code internalformat} parameter of RenderbufferStorage and RenderbufferStorageMultisampleAPPLE. */
    public static final int
        GL_RGBA16F_EXT = 0x881A,
        GL_RGB16F_EXT  = 0x881B,
        GL_RG16F_EXT   = 0x822F,
        GL_R16F_EXT    = 0x822D;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = 0x8211;

    /** Returned in {@code params} by GetFramebufferAttachmentParameteriv. */
    public static final int GL_UNSIGNED_NORMALIZED_EXT = 0x8C17;

    private EXTColorBufferHalfFloat() {}

}