/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_render_snorm.txt">EXT_render_snorm</a> extension.
 * 
 * <p>OpenGL ES 3.1 supports a variety of signed normalized texture and renderbuffer formats which are not color-renderable.</p>
 * 
 * <p>This extension enables signed normalized texture and renderbuffer formats to be color-renderable.</p>
 * 
 * <p>Requires {@link GLES31 GLES 3.1}.</p>
 */
public final class EXTRenderSnorm {

    /** Accepted by the {@code internalFormat} parameter of RenderbufferStorage and RenderbufferStorageMultisample. */
    public static final int
        GL_R16_SNORM_EXT    = 0x8F98,
        GL_RG16_SNORM_EXT   = 0x8F99,
        GL_RGBA16_SNORM_EXT = 0x8F9B;

    private EXTRenderSnorm() {}

}