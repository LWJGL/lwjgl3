/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_surfaceless_context.txt">OES_surfaceless_context</a> extension.
 * 
 * <p>Applications that only want to render to framebuffer objects should not need to create a throw-away EGL surface (typically a 1x1 pbuffer) just to get a
 * current context. The EGL extension KHR_surfaceless_context provides a mechanism for making a context current without a surface. This extensions
 * specifies the behaviour of OpenGL ES 1.x and OpenGL ES 2.0 when such a context is made current.</p>
 */
public final class OESSurfacelessContext {

    /** Returned by glCheckFramebufferStatusOES and glCheckFramebufferStatus. */
    public static final int GL_FRAMEBUFFER_UNDEFINED_OES = 0x8219;

    private OESSurfacelessContext() {}

}