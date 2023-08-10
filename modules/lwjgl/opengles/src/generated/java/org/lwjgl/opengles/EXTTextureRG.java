/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_rg.txt">EXT_texture_rg</a> extension.
 * 
 * <p>Historically one- and two-component textures have been specified in OpenGL ES using the luminance or luminance-alpha (L/LA) formats. With the advent of
 * programmable shaders and render-to-texture capabilities these legacy formats carry some historical artifacts which are no longer useful.</p>
 * 
 * <p>For example, when sampling from such textures, the luminance values are replicated across the color components. This is no longer necessary with
 * programmable shaders.</p>
 * 
 * <p>It is also desirable to be able to render to one- and two-component format textures using capabilities such as framebuffer objects (FBO), but rendering
 * to L/LA formats is under-specified (specifically how to map R/G/B/A values to L/A texture channels).</p>
 * 
 * <p>This extension adds new base internal formats for one-component RED and two-component RG (red green) textures as well as sized RED and RG internal
 * formats for renderbuffers. The RED and RG texture formats can be used for both texturing and rendering into with framebuffer objects.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public final class EXTTextureRG {

    /**
     * Accepted by the {@code internalformat} parameter of TexImage2D and CopyTexImage2D, and the {@code format} parameter of TexImage2D, TexSubImage2D, and
     * ReadPixels.
     */
    public static final int
        GL_RED_EXT = 0x1903,
        GL_RG_EXT  = 0x8227;

    /** Accepted by the {@code internalformat} parameter of RenderbufferStorage and RenderbufferStorageMultisampleAPPLE. */
    public static final int
        GL_R8_EXT  = 0x8229,
        GL_RG8_EXT = 0x822B;

    private EXTTextureRG() {}

}