/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_create_context.txt">KHR_create_context</a> extension.
 * 
 * <p>With the advent of new versions of OpenGL which deprecate features and/or break backward compatibility with older versions, there is a need and desire
 * to indicate at context creation which interface will be used. This extension adds a new context creation routine with attributes specifying the OpenGL
 * version, context properties, and profile requested for the context. It also allows making an OpenGL 3.0 or later context (or other client API context
 * supporting the ability) current without providing a default framebuffer. The new context creation attributes are also defined to work for OpenGL ES
 * context creation when that makes sense, and the extension has been augmented to allow configs to advertise support for creating OpenGL ES 3.0 contexts.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4}.</p>
 */
public final class KHRCreateContext {

    public static final int
        EGL_CONTEXT_MAJOR_VERSION_KHR                      = 0x3098,
        EGL_CONTEXT_MINOR_VERSION_KHR                      = 0x30FB,
        EGL_CONTEXT_FLAGS_KHR                              = 0x30FC,
        EGL_CONTEXT_OPENGL_PROFILE_MASK_KHR                = 0x30FD,
        EGL_CONTEXT_OPENGL_RESET_NOTIFICATION_STRATEGY_KHR = 0x31BD,
        EGL_NO_RESET_NOTIFICATION_KHR                      = 0x31BE,
        EGL_LOSE_CONTEXT_ON_RESET_KHR                      = 0x31BF,
        EGL_CONTEXT_OPENGL_DEBUG_BIT_KHR                   = 0x1,
        EGL_CONTEXT_OPENGL_FORWARD_COMPATIBLE_BIT_KHR      = 0x2,
        EGL_CONTEXT_OPENGL_ROBUST_ACCESS_BIT_KHR           = 0x4,
        EGL_CONTEXT_OPENGL_CORE_PROFILE_BIT_KHR            = 0x1,
        EGL_CONTEXT_OPENGL_COMPATIBILITY_PROFILE_BIT_KHR   = 0x2,
        EGL_OPENGL_ES3_BIT                                 = 0x40,
        EGL_OPENGL_ES3_BIT_KHR                             = 0x40;

    private KHRCreateContext() {}

}