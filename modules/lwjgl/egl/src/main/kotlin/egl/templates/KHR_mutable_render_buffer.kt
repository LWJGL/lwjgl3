/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_mutable_render_buffer = "KHRMutableRenderBuffer".nativeClassEGL("KHR_mutable_render_buffer", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The aim of this extension is to allow toggling of front-buffer rendering for window surfaces after their initial creation.

        This allows for implementations to switch between back-buffered and single-buffered rendering without requiring re-creation of the surface. It is not
        expected for toggling to be a frequent event.

        This extension does not guarantee when rendering results appear on-screen. To avoid incorrect results, applications will need to use mechanisms not
        included in this extension to synchronize rendering with the display. This functionality is not covered by this extension, and vendors are encouraged
        to provide guidelines on how this is achieved on their implementation.

        Requires ${EGL12.core}.
        """

    IntConstant(
        "Accepted as a new value for the #SURFACE_TYPE {@code EGLConfig} attribute.",

        "MUTABLE_RENDER_BUFFER_BIT_KHR"..0x00001000
    )
}