/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_YUV_target.txt">EXT_YUV_target</a> extension.
 * 
 * <p>This extension adds support for three new YUV related items: first rendering to YUV images, second sampling from YUV images while keeping the data in
 * YUV space, third it defines a new built in function that does conversion from RGB to YUV with controls to choose ITU-R BT.601-7, ITU-R BT.601-7 Full
 * range (JFIF images), or ITU-R BT.709-5 standard.</p>
 * 
 * <p>This new functionality is layered on top of the OES_EGL_image_external extension.</p>
 * 
 * <p>To perform the YUV rendering capability in this extension an application will attach a texture to the framebuffer object as the color attachment. If
 * the texture has a target type of TEXTURE_EXTERNAL_OES with YUV color format then the GL driver can use this framebuffer object as the render target,
 * TEXTURE_EXTERNAL_OES target with RGB color format are not allowed with this extension.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}.</p>
 */
public final class EXTYUVTarget {

    /** Returned in the {@code type} parameter of GetActiveUniform. */
    public static final int GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT = 0x8BE7;

    /**
     * Reuse tokens as in extension "OES_EGL_image_external." Accepted as a target in the {@code target} parameter of BindTexture, EGLImageTargetTexture2DOES,
     * and FramebufferTexture2D.
     */
    public static final int GL_TEXTURE_EXTERNAL_OES = 0x8D65;

    /** Accepted as {@code value} in GetIntegerv() and GetFloatv() queries. */
    public static final int GL_TEXTURE_BINDING_EXTERNAL_OES = 0x8D67;

    /** Accepted as {@code value} in GetTexParameter*() queries. */
    public static final int GL_REQUIRED_TEXTURE_IMAGE_UNITS_OES = 0x8D68;

    private EXTYUVTarget() {}

}