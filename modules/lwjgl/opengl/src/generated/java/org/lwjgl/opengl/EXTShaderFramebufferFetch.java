/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_framebuffer_fetch.txt">EXT_shader_framebuffer_fetch</a> extension.
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
 * <p>This extension provides two alternative name strings:</p>
 * 
 * <ul>
 * <li>{@code GL_EXT_shader_framebuffer_fetch} guarantees full coherency between framebuffer reads and writes. If this extension string is exposed, the
 * result of reading from the framebuffer from a fragment shader invocation is guaranteed to reflect values written by any previous overlapping
 * samples in API primitive order, unless requested otherwise in the shader source using the noncoherent layout qualifier.</li>
 * <li>{@code GL_EXT_shader_framebuffer_fetch_non_coherent} provides limited implicit coherency guarantees. Instead, the application is expected to call
 * the {@link EXTShaderFramebufferFetchNonCoherent#glFramebufferFetchBarrierEXT FramebufferFetchBarrierEXT} command for previous framebuffer writes to become visible to subsequent fragment shader invocations. For this
 * extension to give well-defined results applications may have to split rendering into multiple passes separated with
 * {@code FramebufferFetchBarrierEXT} calls. The functionality provided by this extension is requested in the shader source using the noncoherent
 * layout qualifier.</li>
 * </ul>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}.</p>
 */
public final class EXTShaderFramebufferFetch {

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_FRAGMENT_SHADER_DISCARDS_SAMPLES_EXT = 0x8A52;

    private EXTShaderFramebufferFetch() {}

}