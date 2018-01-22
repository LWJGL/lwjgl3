/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_multiview_window = "EXTMultiviewWindow".nativeClassEGL("EXT_multiview_window", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Adds support for creating an onscreen EGLSurface containing multiple color buffers.

        EXT_multi_draw_buffers can be used with this extension to render and display multiple color buffers to a supported device.

        Requires ${EGL14.core}.
        """

    IntConstant(
        "",

        "MULTIVIEW_VIEW_COUNT_EXT"..0x3134
    )
}