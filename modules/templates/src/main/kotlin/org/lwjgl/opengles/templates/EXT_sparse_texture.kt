/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_sparse_texture = "EXTSparseTexture".nativeClassGLES("EXT_sparse_texture", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Recent advances in application complexity and a desire for higher resolutions have pushed texture sizes up considerably. Often, the amount of physical
        memory available to a graphics processor is a limiting factor in the performance of texture-heavy applications. Once the available physical memory is
        exhausted, paging may occur bringing performance down considerably - or worse, the application may fail. Nevertheless, the amount of address space
        available to the graphics processor has increased to the point where many gigabytes - or even terabytes of address space may be usable even though that
        amount of physical memory is not present.

        This extension allows the separation of the graphics processor's address space (reservation) from the requirement that all textures must be physically
        backed (commitment). This exposes a limited form of virtualization for textures. Use cases include sparse (or partially resident) textures, texture
        paging, on-demand and delayed loading of texture assets and application controlled level of detail.

        Requires ${GLES31.core}.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameter to TexParameter{if}{v}, GetTexParameter{if}v, TexParameterI{u}ivOES, GetTexParameterI{u}ivOES
        TexParameterI{u}ivEXT, and GetTexParameterI{u}ivEXT.
        """,

        "TEXTURE_SPARSE_EXT"..0x91A6,
        "VIRTUAL_PAGE_SIZE_INDEX_EXT"..0x91A7
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTexParameter{if}v, GetTexParameterIi{u}vOES, and GetTexParameterIi{u}vEXT.",

        "NUM_SPARSE_LEVELS_EXT"..0x91AA
    )

    IntConstant(
        "Accepted by the {@code pname} parameter to GetInternalformativ.",

        "NUM_VIRTUAL_PAGE_SIZES_EXT"..0x91A8,
        "VIRTUAL_PAGE_SIZE_X_EXT"..0x9195,
        "VIRTUAL_PAGE_SIZE_Y_EXT"..0x9196,
        "VIRTUAL_PAGE_SIZE_Z_EXT"..0x9197
    )

    IntConstant(
        "Accepted by the {@code target} parameter to GetInternalformativ.",

        "TEXTURE_2D"..0x0DE1,
        "TEXTURE_2D_ARRAY"..0x8C1A,
        "TEXTURE_CUBE_MAP"..0x8513,
        "TEXTURE_CUBE_MAP_ARRAY_OES"..0x9009,
        "TEXTURE_3D"..0x806F
    )

    IntConstant(
        "Accepted by the {@code pname} parameter to GetIntegerv, GetFloatv, GetInteger64v, and GetBooleanv.",

        "MAX_SPARSE_TEXTURE_SIZE_EXT"..0x9198,
        "MAX_SPARSE_3D_TEXTURE_SIZE_EXT"..0x9199,
        "MAX_SPARSE_ARRAY_TEXTURE_LAYERS_EXT"..0x919A,
        "SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_EXT"..0x91A9
    )

    void(
        "TexPageCommitmentARB",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLint.IN("yoffset", ""),
        GLint.IN("zoffset", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLboolean.IN("commit", "")
    )
}