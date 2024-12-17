/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_sparse_texture = "ARBSparseTexture".nativeClassGL("ARB_sparse_texture", postfix = ARB) {
    IntConstant(
        "TEXTURE_SPARSE_ARB"..0x91A6,
        "VIRTUAL_PAGE_SIZE_INDEX_ARB"..0x91A7
    )

    IntConstant(
        "NUM_SPARSE_LEVELS_ARB"..0x91AA
    )

    IntConstant(
        "NUM_VIRTUAL_PAGE_SIZES_ARB"..0x91A8,
        "VIRTUAL_PAGE_SIZE_X_ARB"..0x9195,
        "VIRTUAL_PAGE_SIZE_Y_ARB"..0x9196,
        "VIRTUAL_PAGE_SIZE_Z_ARB"..0x9197
    )

    IntConstant(
        "MAX_SPARSE_TEXTURE_SIZE_ARB"..0x9198,
        "MAX_SPARSE_3D_TEXTURE_SIZE_ARB"..0x9199,
        "MAX_SPARSE_ARRAY_TEXTURE_LAYERS_ARB"..0x919A,
        "SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_ARB"..0x91A9
    )

    val TexSubImage3D = GL12C["TexSubImage3D"]
    val TexPageCommitmentARB = void(
        "TexPageCommitmentARB",

        GLenum("target"),
        TexSubImage3D["level"],
        TexSubImage3D["xoffset"],
        TexSubImage3D["yoffset"],
        TexSubImage3D["zoffset"],
        TexSubImage3D["width"],
        TexSubImage3D["height"],
        TexSubImage3D["depth"],
        GLboolean("commit")
    )

    DependsOn("GL_EXT_direct_state_access")..void(
        "TexturePageCommitmentEXT",

        GLuint("texture"),
        TexPageCommitmentARB["level"],
        TexPageCommitmentARB["xoffset"],
        TexPageCommitmentARB["yoffset"],
        TexPageCommitmentARB["zoffset"],
        TexPageCommitmentARB["width"],
        TexPageCommitmentARB["height"],
        TexPageCommitmentARB["depth"],
        TexPageCommitmentARB["commit"]
    )
}