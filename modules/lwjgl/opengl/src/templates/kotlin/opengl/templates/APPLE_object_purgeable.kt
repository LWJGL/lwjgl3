/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val APPLE_object_purgeable = "APPLEObjectPurgeable".nativeClassGL("APPLE_object_purgeable") {
    IntConstant(
        "RELEASED_APPLE"..0x8A19,
        "VOLATILE_APPLE"..0x8A1A
    )

    IntConstant(
        "RETAINED_APPLE"..0x8A1B,
        "UNDEFINED_APPLE"..0x8A1C
    )

    IntConstant(
        "PURGEABLE_APPLE"..0x8A1D
    )

    IntConstant(
        "BUFFER_OBJECT_APPLE"..0x85B3
    )

    GLenum(
        "ObjectPurgeableAPPLE",

        GLenum("objectType"),
        GLuint("name"),
        GLenum("option")
    )

    GLenum(
        "ObjectUnpurgeableAPPLE",

        GLenum("objectType"),
        GLuint("name"),
        GLenum("option")
    )

    void(
        "GetObjectParameterivAPPLE",

        GLenum("objectType"),
        GLuint("name"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )
}