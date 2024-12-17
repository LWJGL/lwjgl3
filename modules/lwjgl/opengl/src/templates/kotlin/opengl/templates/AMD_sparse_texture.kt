/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_sparse_texture = "AMDSparseTexture".nativeClassGL("AMD_sparse_texture", postfix = AMD) {
    IntConstant(
        "TEXTURE_STORAGE_SPARSE_BIT_AMD"..0x00000001
    )

    IntConstant(
        "VIRTUAL_PAGE_SIZE_X_AMD"..0x9195,
        "VIRTUAL_PAGE_SIZE_Y_AMD"..0x9196,
        "VIRTUAL_PAGE_SIZE_Z_AMD"..0x9197
    )

    IntConstant(
        "MAX_SPARSE_TEXTURE_SIZE_AMD"..0x9198,
        "MAX_SPARSE_3D_TEXTURE_SIZE_AMD"..0x9199,
        "MAX_SPARSE_ARRAY_TEXTURE_LAYERS"..0x919A
    )

    IntConstant(
        "MIN_SPARSE_LEVEL_AMD"..0x919B
    )

    IntConstant(
        "MIN_LOD_WARNING_AMD"..0x919C
    )

    void(
        "TexStorageSparseAMD",

        GLenum("target"),
        GLenum("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLsizei("layers"),
        GLbitfield("flags")
    )

    void(
        "TextureStorageSparseAMD",

        GLuint("texture"),
        GLenum("target"),
        GLenum("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLsizei("layers"),
        GLbitfield("flags")
    )
}