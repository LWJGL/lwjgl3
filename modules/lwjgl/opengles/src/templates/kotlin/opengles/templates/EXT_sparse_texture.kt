/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_sparse_texture = "EXTSparseTexture".nativeClassGLES("EXT_sparse_texture", postfix = EXT) {
    IntConstant(
        "TEXTURE_SPARSE_EXT"..0x91A6,
        "VIRTUAL_PAGE_SIZE_INDEX_EXT"..0x91A7
    )

    IntConstant(
        "NUM_SPARSE_LEVELS_EXT"..0x91AA
    )

    IntConstant(
        "NUM_VIRTUAL_PAGE_SIZES_EXT"..0x91A8,
        "VIRTUAL_PAGE_SIZE_X_EXT"..0x9195,
        "VIRTUAL_PAGE_SIZE_Y_EXT"..0x9196,
        "VIRTUAL_PAGE_SIZE_Z_EXT"..0x9197
    )

    IntConstant(
        "TEXTURE_2D"..0x0DE1,
        "TEXTURE_2D_ARRAY"..0x8C1A,
        "TEXTURE_CUBE_MAP"..0x8513,
        "TEXTURE_CUBE_MAP_ARRAY_OES"..0x9009,
        "TEXTURE_3D"..0x806F
    )

    IntConstant(
        "MAX_SPARSE_TEXTURE_SIZE_EXT"..0x9198,
        "MAX_SPARSE_3D_TEXTURE_SIZE_EXT"..0x9199,
        "MAX_SPARSE_ARRAY_TEXTURE_LAYERS_EXT"..0x919A,
        "SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_EXT"..0x91A9
    )

    void(
        "TexPageCommitmentEXT",

        GLenum("target"),
        GLint("level"),
        GLint("xoffset"),
        GLint("yoffset"),
        GLint("zoffset"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLboolean("commit")
    )
}