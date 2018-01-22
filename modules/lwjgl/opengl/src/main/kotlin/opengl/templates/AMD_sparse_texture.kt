/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_sparse_texture = "AMDSparseTexture".nativeClassGL("AMD_sparse_texture", postfix = AMD) {
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

        Requires ${GL20.core} or ${ARB_fragment_shader.link}.
        """

    IntConstant(
        "Accepted by the {@code flags} parameter to TexStorageSparseAMD and TextureStorageSparseAMD.",

        "TEXTURE_STORAGE_SPARSE_BIT_AMD"..0x00000001
    )

    IntConstant(
        "Accepted by the {@code pname} parameter to GetInternalformativ.",

        "VIRTUAL_PAGE_SIZE_X_AMD"..0x9195,
        "VIRTUAL_PAGE_SIZE_Y_AMD"..0x9196,
        "VIRTUAL_PAGE_SIZE_Z_AMD"..0x9197
    )

    IntConstant(
        "Accepted by the {@code pname} parameter to GetIntegerv, GetFloatv, GetDoublev, GetInteger64v, and GetBooleanv.",

        "MAX_SPARSE_TEXTURE_SIZE_AMD"..0x9198,
        "MAX_SPARSE_3D_TEXTURE_SIZE_AMD"..0x9199,
        "MAX_SPARSE_ARRAY_TEXTURE_LAYERS"..0x919A
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTexParameter{if}v.",

        "MIN_SPARSE_LEVEL_AMD"..0x919B
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameter{if}{v} and GetTexParameter{if}v.",

        "MIN_LOD_WARNING_AMD"..0x919C
    )

    void(
        "TexStorageSparseAMD",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLsizei.IN("layers", ""),
        GLbitfield.IN("flags", "")
    )

    void(
        "TextureStorageSparseAMD",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLenum.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLsizei.IN("layers", ""),
        GLbitfield.IN("flags", "")
    )
}