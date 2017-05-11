/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val ANDROID_image_native_buffer = "ANDROIDImageNativeBuffer".nativeClassEGL("ANDROID_image_native_buffer", postfix = ANDROID) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables using an Android window buffer (struct ANativeWindowBuffer) as an EGLImage source.

        Requires ${EGL12.core} and ${KHR_image_base.link}.
        """

    IntConstant(
        "",

        "NATIVE_BUFFER_ANDROID"..0x3140
    )
}