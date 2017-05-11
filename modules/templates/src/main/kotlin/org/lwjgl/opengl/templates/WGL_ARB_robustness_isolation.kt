/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_ARB_robustness_application_isolation = "WGLARBRobustnessApplicationIsolation".nativeClassWGL("WGL_ARB_robustness_application_isolation", ARB) {
    documentation =
        """
        Native bindings to the ${registryLink("ARB", "wgl_robustness_isolation")} extension.

        GL_ARB_robustness and WGL_ARB_create_context_robustness allow creating an OpenGL context supporting graphics reset notification behavior.
        WGL_ARB_robustness_application_isolation provides stronger guarantees about the possible side-effects of a graphics reset.

        If the graphics driver advertises the WGL_ARB_robustness_application_isolation extension string, then the driver guarantees that if a particular
        application causes a graphics reset to occur:
        ${ol(
            "No other application on the system is affected by the graphics reset.",
            "No other application on the system receives any notification that the graphics reset occurred."
        )}

        Requires ${WGL_ARB_extensions_string.link} and ${WGL_ARB_create_context_robustness.link}.
        """

    IntConstant(
        """
        Accepted as a bit in the attribute value for WGLARBCreateContext#WGL_CONTEXT_FLAGS_ARB in the {@code attribList} argument to
        WGLARBCreateContext#wglCreateContextAttribsARB().
        """,

        "CONTEXT_RESET_ISOLATION_BIT_ARB"..0x00000008
    )
}

val WGL_ARB_robustness_share_group_isolation = EXT_FLAG.nativeClassWGL("WGL_ARB_robustness_share_group_isolation", postfix = ARB) {
    documentation =
        """
        Native bindings to the ${registryLink("ARB", "wgl_robustness_isolation")} extension.

        GL_ARB_robustness and WGL_ARB_create_context_robustness allow creating an OpenGL context supporting graphics reset notification behavior.
        WGL_ARB_robustness_share_group_isolation provides stronger guarantees about the possible side-effects of a graphics reset.

        If the graphics driver advertises the WGL_ARB_robustness_share_group_isolation extension string, then the driver guarantees that if a context in a
        particular share group causes a graphics reset to occur:
        ${ol(
            """
            No other share group within the application is affected by the graphics reset. Additionally, no other application on the system is affected by the
            graphics reset.
            """,
            """
            No other share group within the application receives any notification that the graphics reset occurred. Additionally, no other application on the
            system receives any notification that the graphics reset occurred.
            """
        )}

        Requires ${WGL_ARB_extensions_string.link} and ${WGL_ARB_create_context_robustness.link}.
        """
}