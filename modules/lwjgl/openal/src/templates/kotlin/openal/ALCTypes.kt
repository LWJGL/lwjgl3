/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal

import org.lwjgl.generator.*

// void

val ALCvoid = "ALCvoid".void

// numeric

val ALCboolean = PrimitiveType("ALCboolean", PrimitiveMapping.BOOLEAN)
val ALCint = IntegerType("ALCint", PrimitiveMapping.INT)
val ALCuint = IntegerType("ALCuint", PrimitiveMapping.INT, unsigned = true)

// custom numeric

val ALCsizei = IntegerType("ALCsizei", PrimitiveMapping.INT)
val ALCenum = IntegerType("ALCenum", PrimitiveMapping.INT)

val ALCint64SOFT = IntegerType("ALCint64SOFT", PrimitiveMapping.LONG)
val ALCuint64SOFT = IntegerType("ALCuint64SOFT", PrimitiveMapping.LONG, unsigned = true)

// strings

val ALCcharASCII = CharType("ALCchar", CharMapping.ASCII)
val ALCcharUTF8 = CharType("ALCchar", CharMapping.UTF8)

// misc

val ALCdevice = "ALCdevice".opaque
val ALCcontext = "ALCcontext".opaque

val ALCEVENTPROCTYPESOFT = Module.OPENAL.callback {
    void(
        "SOFTSystemEventProc",

        ALCenum("eventType"),
        ALCenum("deviceType"),
        nullable..ALCdevice.p("device"),
        AutoSize("message")..ALCsizei("length"),
        ALCcharUTF8.const.p("message"),
        nullable.."ALCvoid".opaque.p("userParam"),

        nativeType = "ALCEVENTPROCTYPESOFT"
    )
}