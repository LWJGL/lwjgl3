/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_rectangle = "ARBTextureRectangle".nativeClassGL("ARB_texture_rectangle", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        OpenGL texturing is limited to images with power-of-two dimensions and an optional 1-texel border. The ARB_texture_rectangle extension adds a new
        texture target that supports 2D textures without requiring power-of-two dimensions.

        Non-power-of-two sized (NPOTS) textures are useful for storing video images that do not have power-of-two sized (POTS). Re-sampling artifacts are
        avoided and less texture memory may be required by using non-power-of-two sized textures. Non-power-of-two sized textures are also useful for shadow
        maps and window-space texturing.

        However, non-power-of-two sized textures have limitations that do not apply to power-of-two sized textures. NPOTS textures may not use mipmap filtering;
        POTS textures support both mipmapped and non-mipmapped filtering. NPOTS textures support only the #CLAMP, #CLAMP_TO_EDGE, and
        #CLAMP_TO_BORDER wrap modes; POTS textures support #CLAMP_TO_EDGE, #REPEAT, #CLAMP, #MIRRORED_REPEAT, and #CLAMP_TO_BORDER
        (and GL_MIRROR_CLAMP_ATI and GL_MIRROR_CLAMP_TO_EDGE_ATI if ${registryLinkTo("ATI", "texture_mirror_once")} is supported). NPOTS textures do not
        support an optional 1-texel border; POTS textures do support an optional 1-texel border.

        NPOTS textures are accessed by dimension-dependent (aka non-normalized) texture coordinates. So instead of thinking of the texture image lying in a
        [0..1]x[0..1] range, the NPOTS texture image lies in a [0..w]x[0..h] range.

        This extension adds a new texture target and related state (proxy, binding, max texture size).
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled; by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and
        GetDoublev; and by the {@code target} parameter of BindTexture, GetTexParameterfv, GetTexParameteriv, TexParameterf, TexParameteri, TexParameterfv and
        TexParameteriv.
        """,

        "TEXTURE_RECTANGLE_ARB"..0x84F5
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev.",

        "TEXTURE_BINDING_RECTANGLE_ARB"..0x84F6
    )

    IntConstant(
        "Accepted by the {@code target} parameter of GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv and TexImage2D.",

        "PROXY_TEXTURE_RECTANGLE_ARB"..0x84F7
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.",

        "MAX_RECTANGLE_TEXTURE_SIZE_ARB"..0x84F8
    )

    IntConstant(
        """
        TEXTURE_RECTANGLE_ARB Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of
        type sampler2DRect.
        """,

        "SAMPLER_2D_RECT_ARB"..0x8B63
    )

    IntConstant(
        """
        Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type
        sampler2DRectShadow.
        """,

        "SAMPLER_2D_RECT_SHADOW_ARB"..0x8B64
    )

}