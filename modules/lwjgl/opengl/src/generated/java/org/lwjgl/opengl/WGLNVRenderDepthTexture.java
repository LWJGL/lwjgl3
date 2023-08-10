/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/WGL_NV_render_depth_texture.txt">WGL_NV_render_depth_texture</a> extension.
 * 
 * <p>This extension allows a depth buffer to be used for both rendering and texturing. It is built upon the ARB_render_texture extension; the only addition
 * in this extension is the ability to use a depth buffer as a DEPTH_COMPONENT texture map.</p>
 */
public final class WGLNVRenderDepthTexture {

    /**
     * Accepted by the {@code piAttributes} parameter of wglGetPixelFormatAttribivARB, wglGetPixelFormatAttribfvARB, and the {@code piAttribIList} and
     * {@code pfAttribIList} parameters of wglChoosePixelFormatARB.
     */
    public static final int
        WGL_BIND_TO_TEXTURE_DEPTH_NV           = 0x20A3,
        WGL_BIND_TO_TEXTURE_RECTANGLE_DEPTH_NV = 0x20A4;

    /** Accepted by the {@code piAttribList} parameter of wglCreatePbufferARB and by the {@code iAttribute} parameter of wglQueryPbufferARB. */
    public static final int WGL_DEPTH_TEXTURE_FORMAT_NV = 0x20A5;

    /**
     * Accepted as a value in the {@code piAttribList} parameter of wglCreatePbufferARB and returned in the value parameter of wglQueryPbufferARB when
     * {@code iAttribute} is WGL_DEPTH_TEXTURE_FORMAT_NV.
     */
    public static final int
        WGL_TEXTURE_DEPTH_COMPONENT_NV = 0x20A6,
        WGL_NO_TEXTURE_ARB             = 0x2077;

    /** Accepted by the {@code iBuffer} parameter of wglBindTexImageARB. */
    public static final int WGL_DEPTH_COMPONENT_NV = 0x20A7;

    private WGLNVRenderDepthTexture() {}

}