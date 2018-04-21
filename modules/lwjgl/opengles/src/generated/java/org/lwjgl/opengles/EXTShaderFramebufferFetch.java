/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_framebuffer_fetch.txt">EXT_shader_framebuffer_fetch</a> extension.
 * 
 * <p>Conventional OpenGL blending provides a configurable series of operations that can be used to combine the output values from a fragment shader with the
 * values already in the framebuffer. While these operations are suitable for basic image compositing, other compositing operations or operations that
 * treat fragment output as something other than a color (normals, for instance) may not be expressible without multiple passes or render-to-texture
 * operations.</p>
 * 
 * <p>This extension provides a mechanism whereby a fragment shader may read existing framebuffer data as input. This can be used to implement compositing
 * operations that would have been inconvenient or impossible with fixed-function blending. It can also be used to apply a function to the framebuffer
 * color, by writing a shader which uses the existing framebuffer color as its only input.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public final class EXTShaderFramebufferFetch {

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_FRAGMENT_SHADER_DISCARDS_SAMPLES_EXT = 0x8A52;

    private EXTShaderFramebufferFetch() {}

}