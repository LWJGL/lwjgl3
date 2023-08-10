/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/GLX_ARB_create_context.txt">GLX_ARB_create_context_profile</a> extension.
 * 
 * <p>Adds an attribute to {@link GLXARBCreateContext}, specifying the GL profile requested for a context of OpenGL 3.2 or later.</p>
 * 
 * <p>Requires {@link GLX14 GLX 1.4} and {@link GL32 OpenGL 3.2}.</p>
 */
public final class GLXARBCreateContextProfile {

    /** Accepted as an attribute name in {@code attrib_list}. */
    public static final int GLX_CONTEXT_PROFILE_MASK_ARB = 0x9126;

    /** Accepted as bits in the attribute value for {@link #GLX_CONTEXT_PROFILE_MASK_ARB CONTEXT_PROFILE_MASK_ARB} in {@code attrib_list}. */
    public static final int
        GLX_CONTEXT_CORE_PROFILE_BIT_ARB          = 0x1,
        GLX_CONTEXT_COMPATIBILITY_PROFILE_BIT_ARB = 0x2;

    /** GLX error. */
    public static final int GLXBadProfileARB = 13;

    private GLXARBCreateContextProfile() {}

}