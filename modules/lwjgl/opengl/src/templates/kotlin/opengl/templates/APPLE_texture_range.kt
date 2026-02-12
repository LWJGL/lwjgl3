/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val APPLE_texture_range = "APPLETextureRange".nativeClassGL("APPLE_texture_range") {
    IntConstant(
        "TEXTURE_STORAGE_HINT_APPLE"..0x85BC
    )

    IntConstant(
        "STORAGE_PRIVATE_APPLE"..0x85BD,
        "STORAGE_CACHED_APPLE"..0x85BE,
        "STORAGE_SHARED_APPLE"..0x85BF
    )

    IntConstant(
        "TEXTURE_RANGE_LENGTH_APPLE"..0x85B7
    )

    IntConstant(
        "TEXTURE_RANGE_POINTER_APPLE"..0x85B8
    )

    void(
        "TextureRangeAPPLE",

        GLenum("target"),
        AutoSize("pointer")..GLsizei("length"),
        void.p("pointer")
    )

    void(
        "GetTexParameterPointervAPPLE",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..ReturnParam..void.p.p("params")
    )
}