/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shadow.txt">ARB_shadow</a> extension.
 * 
 * <p>This extension supports comparing the texture R coordinate to a depth texture value in order to produce a boolean texture value. This can be used to
 * implement shadow maps.</p>
 * 
 * <p>The extension is written in generic terms such that other texture comparison modes can be accommodated in the future.</p>
 * 
 * <p>Requires {@link ARBDepthTexture ARB_depth_texture}. Promoted to core in {@link GL14 OpenGL 1.4}.</p>
 */
public final class ARBShadow {

    /** Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv. */
    public static final int
        GL_TEXTURE_COMPARE_MODE_ARB = 0x884C,
        GL_TEXTURE_COMPARE_FUNC_ARB = 0x884D;

    /**
     * Accepted by the {@code param} parameter of TexParameterf, TexParameteri, TexParameterfv, and TexParameteriv when the {@code pname} parameter is
     * TEXTURE_COMPARE_MODE_ARB.
     */
    public static final int GL_COMPARE_R_TO_TEXTURE_ARB = 0x884E;

    private ARBShadow() {}

}