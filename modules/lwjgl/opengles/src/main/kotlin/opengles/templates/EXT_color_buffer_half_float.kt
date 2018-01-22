/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_color_buffer_half_float = "EXTColorBufferHalfFloat".nativeClassGLES("EXT_color_buffer_half_float", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows 16-bit floating point formats as defined in OES_texture_half_float to be rendered to via framebuffer objects.

        When using floating-point formats, certain color clamps are disabled.

        This extension also updates the framebuffer object API to allow querying attachment component types.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code internalformat} parameter of RenderbufferStorage and RenderbufferStorageMultisampleAPPLE.",

        "RGBA16F_EXT"..0x881A,
        "RGB16F_EXT"..0x881B,
        "RG16F_EXT"..0x822F,
        "R16F_EXT"..0x822D
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.",

        "FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT"..0x8211
    )

    IntConstant(
        "Returned in {@code params} by GetFramebufferAttachmentParameteriv.",

        "UNSIGNED_NORMALIZED_EXT"..0x8C17
    )
}