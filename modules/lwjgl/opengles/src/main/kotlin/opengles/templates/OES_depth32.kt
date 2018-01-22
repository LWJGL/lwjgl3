/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_depth32 = "OESDepth32".nativeClassGLES("OES_depth32", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables 32-bit depth components as a valid render buffer storage format.
        """

    IntConstant(
        "Accepted by the {@code internalformat} parameter of RenderbufferStorageOES.",

        "DEPTH_COMPONENT32_OES"..0x81A7
    )
}