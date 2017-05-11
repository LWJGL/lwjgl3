/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_protected_content = "EXTProtectedContent".nativeClassEGL("EXT_protected_content", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces the concept of protected contexts and protected resources, specifically surfaces and {@code EGLImages}. Applications can
        choose at creation time whether a context, surface or {@code EGLImage} is protected or not.

        A protected context is required to allow the GPU to operate on protected resources, including protected surfaces and protected {@code EGLImages}.

        An explanation of undefined behavior in this extension: Several places in this extension mention undefined behavior can result, which can include
        program termination. The reason for this is because one way to handle protected content is by using a protected virtual to physical memory translation
        layer. With this sort of solution a system may generate read or write faults when a non-protected source tries to access a protected buffer. Depending
        on the system these faults might be ignored or they might cause process termination. This undefined behavior should not include actually allowing a
        transfer of data from a protected surface to a non-protected surface.

        Requires ${EGL14.core}.
        """

    IntConstant(
        "{@code EGLSurface} attribute name.",

        "PROTECTED_CONTENT_EXT"..0x32C0
    )
}