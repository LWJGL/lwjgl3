/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shadow_ambient.txt">ARB_shadow_ambient</a> extension.
 * 
 * <p>This extension allows the user to specify the texture value to use when the texture compare function fails. Normally this value is zero. By allowing an
 * arbitrary value we can get functionality which otherwise requires an advanced texture combine extension (such as
 * <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_register_combiners.txt">NV_register_combiners</a>) and multiple texture units.</p>
 * 
 * <p>Requires {@link ARBShadow ARB_shadow} and {@link ARBDepthTexture ARB_depth_texture}.</p>
 */
public final class ARBShadowAmbient {

    /** Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv. */
    public static final int GL_TEXTURE_COMPARE_FAIL_VALUE_ARB = 0x80BF;

    private ARBShadowAmbient() {}

}