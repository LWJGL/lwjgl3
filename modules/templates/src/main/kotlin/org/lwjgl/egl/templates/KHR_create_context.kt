/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_create_context = "KHRCreateContext".nativeClassEGL("KHR_create_context", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        With the advent of new versions of OpenGL which deprecate features and/or break backward compatibility with older versions, there is a need and desire
        to indicate at context creation which interface will be used. This extension adds a new context creation routine with attributes specifying the OpenGL
        version, context properties, and profile requested for the context. It also allows making an OpenGL 3.0 or later context (or other client API context
        supporting the ability) current without providing a default framebuffer. The new context creation attributes are also defined to work for OpenGL ES
        context creation when that makes sense, and the extension has been augmented to allow configs to advertise support for creating OpenGL ES 3.0 contexts.

        Requires ${EGL14.core}.
        """

    IntConstant(
        "",

        "CONTEXT_MAJOR_VERSION_KHR"..0x3098,
        "CONTEXT_MINOR_VERSION_KHR"..0x30FB,
        "CONTEXT_FLAGS_KHR"..0x30FC,
        "CONTEXT_OPENGL_PROFILE_MASK_KHR"..0x30FD,
        "CONTEXT_OPENGL_RESET_NOTIFICATION_STRATEGY_KHR"..0x31BD,
        "NO_RESET_NOTIFICATION_KHR"..0x31BE,
        "LOSE_CONTEXT_ON_RESET_KHR"..0x31BF,
        "CONTEXT_OPENGL_DEBUG_BIT_KHR"..0x00000001,
        "CONTEXT_OPENGL_FORWARD_COMPATIBLE_BIT_KHR"..0x00000002,
        "CONTEXT_OPENGL_ROBUST_ACCESS_BIT_KHR"..0x00000004,
        "CONTEXT_OPENGL_CORE_PROFILE_BIT_KHR"..0x00000001,
        "CONTEXT_OPENGL_COMPATIBILITY_PROFILE_BIT_KHR"..0x00000002,
        "OPENGL_ES3_BIT"..0x00000040,
        "OPENGL_ES3_BIT_KHR"..0x00000040
    )
}