/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_ES3_compatibility = "ARBES3Compatibility".nativeClassGL("ARB_ES3_compatibility") {
    IntConstant(
        "COMPRESSED_RGB8_ETC2"..0x9274,
        "COMPRESSED_SRGB8_ETC2"..0x9275,
        "COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2"..0x9276,
        "COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2"..0x9277,
        "COMPRESSED_RGBA8_ETC2_EAC"..0x9278,
        "COMPRESSED_SRGB8_ALPHA8_ETC2_EAC"..0x9279,
        "COMPRESSED_R11_EAC"..0x9270,
        "COMPRESSED_SIGNED_R11_EAC"..0x9271,
        "COMPRESSED_RG11_EAC"..0x9272,
        "COMPRESSED_SIGNED_RG11_EAC"..0x9273
    )

    IntConstant(
        "PRIMITIVE_RESTART_FIXED_INDEX"..0x8D69
    )

    IntConstant(
        "ANY_SAMPLES_PASSED_CONSERVATIVE"..0x8D6A
    )

    IntConstant(
        "MAX_ELEMENT_INDEX"..0x8D6B
    )
}