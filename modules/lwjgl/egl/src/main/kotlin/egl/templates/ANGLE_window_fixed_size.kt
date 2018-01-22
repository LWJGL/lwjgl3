/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val ANGLE_window_fixed_size = "ANGLEWindowFixedSize".nativeClassEGL("ANGLE_window_fixed_size", postfix = ANGLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows creating a window surface with a fixed size that is specified when it is created.
        """

    IntConstant(
        "",

        "FIXED_SIZE_ANGLE"..0x3201
    )
}