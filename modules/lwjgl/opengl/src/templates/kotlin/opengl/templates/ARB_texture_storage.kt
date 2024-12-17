/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_storage = "ARBTextureStorage".nativeClassGL("ARB_texture_storage") {
    IntConstant(
        "TEXTURE_IMMUTABLE_FORMAT"..0x912F
    )

    reuse(GL42C, "TexStorage1D")
    reuse(GL42C, "TexStorage2D")
    reuse(GL42C, "TexStorage3D")

    var src = GL42C["TexStorage1D"]
    val texture = GLuint("texture")
    DependsOn("GL_EXT_direct_state_access")..void(
        "TextureStorage1DEXT",

        texture,
        src["target"],
        src["levels"],
        src["internalformat"],
        src["width"]
    )

    src = GL42C["TexStorage2D"]
    DependsOn("GL_EXT_direct_state_access")..void(
        "TextureStorage2DEXT",

        texture,
        src["target"],
        src["levels"],
        src["internalformat"],
        src["width"],
        src["height"]
    )

    src = GL42C["TexStorage3D"]
    DependsOn("GL_EXT_direct_state_access")..void(
        "TextureStorage3DEXT",

        texture,
        src["target"],
        src["levels"],
        src["internalformat"],
        src["width"],
        src["height"],
        src["depth"]
    )
}