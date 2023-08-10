/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/QCOM/QCOM_render_shared_exponent.txt">QCOM_render_shared_exponent</a> extension.
 * 
 * <p>OpenGL ES 3.2 supports a packed, shared exponent floating format {@code RGB9_E5} which is not color-renderable.</p>
 * 
 * <p>This extension enables the packed, shared exponent floating type format {@code RGB9_E5} to be color-renderable using framebuffer objects.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}</p>
 */
public final class QCOMRenderSharedExponent {

    /** Accepted by the {@code internalFormat} parameter of {@link GLES20#glRenderbufferStorage RenderbufferStorage}. */
    public static final int GL_RGB9_E5 = 0x8C3D;

    private QCOMRenderSharedExponent() {}

}