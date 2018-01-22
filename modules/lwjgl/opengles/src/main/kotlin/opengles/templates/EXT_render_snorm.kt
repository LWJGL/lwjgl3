/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_render_snorm = "EXTRenderSnorm".nativeClassGLES("EXT_render_snorm", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        OpenGL ES 3.1 supports a variety of signed normalized texture and renderbuffer formats which are not color-renderable.

        This extension enables signed normalized texture and renderbuffer formats to be color-renderable.

        Requires ${GLES31.core}.
        """

    IntConstant(
        "Accepted by the {@code internalFormat} parameter of RenderbufferStorage and RenderbufferStorageMultisample.",

        "R16_SNORM_EXT"..0x8F98,
        "RG16_SNORM_EXT"..0x8F99,
        "RGBA16_SNORM_EXT"..0x8F9B
    )
}