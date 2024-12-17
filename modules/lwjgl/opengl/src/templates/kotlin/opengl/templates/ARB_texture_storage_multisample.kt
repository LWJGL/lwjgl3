/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_storage_multisample = "ARBTextureStorageMultisample".nativeClassGL("ARB_texture_storage_multisample") {
    reuse(GL43C, "TexStorage2DMultisample")
    reuse(GL43C, "TexStorage3DMultisample")

    var src = GL43["TexStorage2DMultisample"]
    DependsOn("GL_EXT_direct_state_access")..void(
        "TextureStorage2DMultisampleEXT",

        GLuint("texture"),
        src["target"],
        src["samples"],
        src["internalformat"],
        src["width"],
        src["height"],
        src["fixedsamplelocations"]
    )

    src = GL43["TexStorage3DMultisample"]
    DependsOn("GL_EXT_direct_state_access")..void(
        "TextureStorage3DMultisampleEXT",

        GLuint("texture"),
        src["target"],
        src["samples"],
        src["internalformat"],
        src["width"],
        src["height"],
        src["depth"],
        src["fixedsamplelocations"]
    )
}