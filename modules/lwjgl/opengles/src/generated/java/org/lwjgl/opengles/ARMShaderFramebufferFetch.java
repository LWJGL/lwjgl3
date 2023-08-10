/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARM/ARM_shader_framebuffer_fetch.txt">ARM_shader_framebuffer_fetch</a> extension.
 * 
 * <p>This extension enables fragment shaders to read existing framebuffer data as input. This permits use-cases such as programmable blending, and other
 * operations that may not be possible to implement with fixed-function blending.</p>
 * 
 * <p>This extension also adds the ability to indicate that a shader should be run once per sample instead of once per pixel.</p>
 * 
 * <p>Reading framebuffer data as input in combination with multiple render targets (MRT) may not be supported by all implementations. This extension allows
 * applications to query for this capability.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public final class ARMShaderFramebufferFetch {

    /** Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
    public static final int GL_FETCH_PER_SAMPLE_ARM = 0x8F65;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
    public static final int GL_FRAGMENT_SHADER_FRAMEBUFFER_FETCH_MRT_ARM = 0x8F66;

    private ARMShaderFramebufferFetch() {}

}