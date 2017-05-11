/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_texture_mirror_clamp = "EXTTextureMirrorClamp".nativeClassGL("EXT_texture_mirror_clamp", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        EXT_texture_mirror_clamp extends the set of texture wrap modes to include three modes (#MIRROR_CLAMP_EXT, #MIRROR_CLAMP_TO_EDGE_EXT,
        #MIRROR_CLAMP_TO_BORDER_EXT) that effectively use a texture map twice as large as the original image in which the additional half of the new image is
        a mirror image of the original image.

        This new mode relaxes the need to generate images whose opposite edges match by using the original image to generate a matching "mirror image". This
        mode allows the texture to be mirrored only once in the negative s, t, and r directions.
        """

    IntConstant(
        """
        Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
        when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.
        """,

        "MIRROR_CLAMP_EXT"..0x8742,
        "MIRROR_CLAMP_TO_EDGE_EXT"..0x8743,
        "MIRROR_CLAMP_TO_BORDER_EXT"..0x8912
    )
}