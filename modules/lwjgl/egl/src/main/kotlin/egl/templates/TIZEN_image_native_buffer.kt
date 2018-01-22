/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val TIZEN_image_native_buffer = "TIZENImageNativeBuffer".nativeClassEGL("TIZEN_image_native_buffer", postfix = TIZEN) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables using a Tizen native buffer (struct native_buffer) as an EGLImage source.

        Requires ${EGL12.core}.
        """

    IntConstant(
        "",

        "NATIVE_BUFFER_TIZEN"..0x32A0
    )
}