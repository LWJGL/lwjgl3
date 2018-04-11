/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_ARB_create_context_robustness = "WGLARBCreateContextRobustness".nativeClassWGL("WGL_ARB_create_context_robustness", ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows creating an OpenGL context supporting robust buffer access behavior and a specified graphics reset notification behavior.

        Requires ${WGL_ARB_extensions_string.link}, ${WGL_ARB_create_context.link} and ${ARB_robustness.link}.
        """

    val wglCreateContextAttribsARB = "WGLARBCreateContext#wglCreateContextAttribsARB()"
    IntConstant(
        """
        Accepted as a bit in the attribute value for WGLARBCreateContext#WGL_CONTEXT_FLAGS_ARB in the {@code attrib_list} argument to
        $wglCreateContextAttribsARB.
        """,

        "CONTEXT_ROBUST_ACCESS_BIT_ARB"..0x00000004
    )

    IntConstant(
        "Accepted as an attribute name in the {@code attrib_list} argument to $wglCreateContextAttribsARB.",

        "CONTEXT_RESET_NOTIFICATION_STRATEGY_ARB"..0x8256
    )

    IntConstant(
        """
        Accepted as an attribute value for #CONTEXT_RESET_NOTIFICATION_STRATEGY_ARB in the {@code attrib_list} argument to
        $wglCreateContextAttribsARB.
        """,

        "NO_RESET_NOTIFICATION_ARB"..0x8261,
        "LOSE_CONTEXT_ON_RESET_ARB"..0x8252
    )
}