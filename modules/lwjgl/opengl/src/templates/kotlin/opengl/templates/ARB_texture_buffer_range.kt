/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_buffer_range = "ARBTextureBufferRange".nativeClassGL("ARB_texture_buffer_range") {
    IntConstant(
        "TEXTURE_BUFFER_OFFSET"..0x919D,
        "TEXTURE_BUFFER_SIZE"..0x919E
    )

    IntConstant(
        "TEXTURE_BUFFER_OFFSET_ALIGNMENT"..0x919F
    )

    val src = reuse(GL43C, "TexBufferRange")

    DependsOn("GL_EXT_direct_state_access")..void(
        "TextureBufferRangeEXT",

        GLuint("texture"),
        src["target"],
        src["internalformat"],
        src["buffer"],
        src["offset"],
        src["size"]
    )
}