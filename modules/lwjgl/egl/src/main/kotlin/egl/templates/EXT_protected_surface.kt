/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_protected_surface = "EXTProtectedSurface".nativeClassEGL("EXT_protected_surface", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds a new EGL surface attribute EGL_PROTECTED_CONTENT_EXT to indicate if the content in the surface buffer is protected or not. If
        surface attribute EGL_PROTECTED_CONTENT_EXT is EGL_TRUE, then the surface content is only accessible to secure accesses. Any attempt to access the
        buffer content non-securely will fail and result in undefined behavior up to and including program termination. Also, any copy operations from the
        protected surface to any non-protected surface by GPU are considered illegal.

        Requires ${EGL14.core} and ${KHR_image_base.link}.
        """

    IntConstant(
        "",

        "PROTECTED_CONTENT_EXT"..0x32C0
    )
}