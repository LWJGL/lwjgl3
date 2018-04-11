/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val ANGLE_texture_usage = "ANGLETextureUsage".nativeClassGLES("ANGLE_texture_usage", postfix = ANGLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        In some implementations it is advantageous to know the expected usage of a texture before the backing storage for it is allocated. This can help to
        inform the implementation's choice of format and type of memory used for the allocation. If the usage is not known in advance, the implementation
        essentially has to make a guess as to how it will be used. If it is later proven wrong, it may need to perform costly re-allocations and/or
        reformatting of the texture data, resulting in reduced performance.

        This extension adds a texture usage flag that is specified via the TEXTURE_USAGE_ANGLE TexParameter. This can be used to indicate that the application
        knows that this texture will be used for rendering.
        """

    IntConstant(
        """
        Accepted as a value for {@code pname} for the TexParameter{if} and TexParameter{if}v commands and for the {@code value} parameter of
        GetTexParameter{if}v.
        """,

        "TEXTURE_USAGE_ANGLE"..0x93A2
    )

    IntConstant(
        """
        Accepted as a value to {@code param} for the TexParameter{if} and to {@code params} for the TexParameter{if}v commands with a {@code pname} of
        TEXTURE_USAGE_ANGLE; returned as possible values for {@code data} when GetTexParameter{if}v is queried with a {@code value} of TEXTURE_USAGE_ANGLE.
        """,

        "FRAMEBUFFER_ATTACHMENT_ANGLE"..0x93A3
    )
}