/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_shared_texture_palette = "EXTSharedTexturePalette".nativeClassGL("EXT_shared_texture_palette", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        EXT_shared_texture_palette defines a shared texture palette which may be used in place of the texture object palettes provided by
        ${registryLinkTo("EXT", "paletted_texture")}. This is useful for rapidly changing a palette common to many textures, rather than having to reload the
        new palette for each texture. The extension acts as a switch, causing all lookups that would normally be done on the texture's palette to instead use
        the shared palette.

        Requires ${registryLinkTo("EXT", "paletted_texture")}.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, IsEnabled, Enable, Disable, ColorTableEXT,
        ColorSubTableEXT, GetColorTableEXT, GetColorTableParameterivEXT, and GetColorTableParameterfd EXT.
        """,

        "SHARED_TEXTURE_PALETTE_EXT"..0x81FB
    )
}