/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_create_context = "KHRCreateContext".nativeClassEGL("KHR_create_context", postfix = KHR) {
    IntConstant(
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