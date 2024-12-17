/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_EXT_STATIC_BUFFER = "EXTStaticBuffer".nativeClassAL("EXT_STATIC_BUFFER") {
    ALvoid(
        "BufferDataStatic",

        ALint("buffer"),
        ALenum("format"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..ALvoid.p("data"),
        AutoSize("data")..ALsizei("len"),
        ALsizei("freq")
    ).directContext()
}