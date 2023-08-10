/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/WGL_ARB_create_context.txt">WGL_ARB_create_context_profile</a> extension.
 * 
 * <p>Adds an attribute to {@link WGLARBCreateContext}, specifying the GL profile requested for a context of OpenGL 3.2 or later.</p>
 * 
 * <p>Requires {@link WGLARBExtensionsString WGL_ARB_extensions_string} and {@link GL32 OpenGL 3.2}.</p>
 */
public final class WGLARBCreateContextProfile {

    /** Accepted as an attribute name in {@code attribList}. */
    public static final int WGL_CONTEXT_PROFILE_MASK_ARB = 0x9126;

    /** Accepted as bits in the attribute value for {@link #WGL_CONTEXT_PROFILE_MASK_ARB CONTEXT_PROFILE_MASK_ARB} in {@code attribList}. */
    public static final int
        WGL_CONTEXT_CORE_PROFILE_BIT_ARB          = 0x1,
        WGL_CONTEXT_COMPATIBILITY_PROFILE_BIT_ARB = 0x2;

    /** New errors returned by {@link org.lwjgl.system.windows.WinBase#GetLastError}. */
    public static final int ERROR_INVALID_PROFILE_ARB = 0x2096;

    private WGLARBCreateContextProfile() {}

}