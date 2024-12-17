/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_storage_compression = "EXTTextureStorageCompression".nativeClassGLES("EXT_texture_storage_compression", postfix = EXT) {
    IntConstant(
        "SURFACE_COMPRESSION_EXT"..0x96C0
    )

    IntConstant(
        "NUM_SURFACE_COMPRESSION_FIXED_RATES_EXT"..0x8F6E
    )

    IntConstant(
        "SURFACE_COMPRESSION_FIXED_RATE_NONE_EXT"..0x96C1,
        "SURFACE_COMPRESSION_FIXED_RATE_DEFAULT_EXT"..0x96C2,
        "SURFACE_COMPRESSION_FIXED_RATE_1BPC_EXT"..0x96C4,
        "SURFACE_COMPRESSION_FIXED_RATE_2BPC_EXT"..0x96C5,
        "SURFACE_COMPRESSION_FIXED_RATE_3BPC_EXT"..0x96C6,
        "SURFACE_COMPRESSION_FIXED_RATE_4BPC_EXT"..0x96C7,
        "SURFACE_COMPRESSION_FIXED_RATE_5BPC_EXT"..0x96C8,
        "SURFACE_COMPRESSION_FIXED_RATE_6BPC_EXT"..0x96C9,
        "SURFACE_COMPRESSION_FIXED_RATE_7BPC_EXT"..0x96CA,
        "SURFACE_COMPRESSION_FIXED_RATE_8BPC_EXT"..0x96CB,
        "SURFACE_COMPRESSION_FIXED_RATE_9BPC_EXT"..0x96CC,
        "SURFACE_COMPRESSION_FIXED_RATE_10BPC_EXT"..0x96CD,
        "SURFACE_COMPRESSION_FIXED_RATE_11BPC_EXT"..0x96CE,
        "SURFACE_COMPRESSION_FIXED_RATE_12BPC_EXT"..0x96CF
    )

    void(
        "TexStorageAttribs2DEXT",

        GLenum("target"),
        GLsizei("levels"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        nullable..NullTerminated..GLint.const.p("attrib_list")
    )

    void(
        "TexStorageAttribs3DEXT",

        GLenum("target"),
        GLsizei("levels"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        nullable..NullTerminated..GLint.const.p("attrib_list")
    )
}