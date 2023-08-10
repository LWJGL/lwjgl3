/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shadow_samplers.txt">EXT_shadow_samplers</a> extension.
 * 
 * <p>This extension supports comparing the texture R coordinate to a depth texture value returning the result as a float value in the range [0,1]. This can
 * be used to implement shadow maps.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public final class EXTShadowSamplers {

    /** Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv. */
    public static final int
        GL_TEXTURE_COMPARE_MODE_EXT = 0x884C,
        GL_TEXTURE_COMPARE_FUNC_EXT = 0x884D;

    /**
     * Accepted by the {@code param} parameter of TexParameterf, TexParameteri, TexParameterfv, and TexParameteriv when the {@code pname} parameter is
     * TEXTURE_COMPARE_MODE_EXT.
     */
    public static final int GL_COMPARE_REF_TO_TEXTURE_EXT = 0x884E;

    /** Returned in {@code type} by glGetActiveUniform. */
    public static final int GL_SAMPLER_2D_SHADOW_EXT = 0x8B62;

    private EXTShadowSamplers() {}

}