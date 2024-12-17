/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_rg = "ARBTextureRG".nativeClassGL("ARB_texture_rg") {
    IntConstant(
        "R8"..0x8229,
        "R16"..0x822A,
        "RG8"..0x822B,
        "RG16"..0x822C,
        "R16F"..0x822D,
        "R32F"..0x822E,
        "RG16F"..0x822F,
        "RG32F"..0x8230,
        "R8I"..0x8231,
        "R8UI"..0x8232,
        "R16I"..0x8233,
        "R16UI"..0x8234,
        "R32I"..0x8235,
        "R32UI"..0x8236,
        "RG8I"..0x8237,
        "RG8UI"..0x8238,
        "RG16I"..0x8239,
        "RG16UI"..0x823A,
        "RG32I"..0x823B,
        "RG32UI"..0x823C,
        "RG"..0x8227,
        "COMPRESSED_RED"..0x8225,
        "COMPRESSED_RG"..0x8226
    )

    IntConstant(
        "RG_INTEGER"..0x8228
    )
}