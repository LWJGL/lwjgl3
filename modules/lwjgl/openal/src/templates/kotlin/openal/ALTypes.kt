/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal

import org.lwjgl.generator.*

// void

val ALvoid = "ALvoid".void

// numeric

val ALboolean = PrimitiveType("ALboolean", PrimitiveMapping.BOOLEAN)
val ALint = IntegerType("ALint", PrimitiveMapping.INT)
val ALuint = IntegerType("ALuint", PrimitiveMapping.INT, unsigned = true)
val ALfloat = PrimitiveType("ALfloat", PrimitiveMapping.FLOAT)
val ALdouble = PrimitiveType("ALdouble", PrimitiveMapping.DOUBLE)

val ALint64SOFT = IntegerType("ALint64SOFT", PrimitiveMapping.LONG)

// custom numeric

val ALsizei = IntegerType("ALsizei", PrimitiveMapping.INT)
val ALenum = IntegerType("ALenum", PrimitiveMapping.INT)

// strings

val ALcharASCII = CharType("ALchar", CharMapping.ASCII)
val ALcharUTF8 = CharType("ALchar", CharMapping.UTF8)

// AL_EXT_debug

val ALDEBUGPROCEXT = Module.OPENAL.callback {
    void(
        "EXTDebugProc",

        ALenum("source"),
        ALenum("type"),
        ALuint("id"),
        ALenum("severity"),
        AutoSize("message")..ALsizei("length"),
        ALcharUTF8.const.p("message"),
        nullable.."ALvoid".opaque.p("userParam"),

        nativeType = "ALDEBUGPROCEXT"
    )
}

// AL_SOFT_callback_buffer

val ALBUFFERCALLBACKTYPESOFT = Module.OPENAL.callback {
    ALsizei(
        "SOFTCallbackBufferType",

        nullable.."ALvoid".opaque.p("userptr"),
        ALvoid.p("sampledata"),
        AutoSize("sampledata")..ALsizei("numbytes"),

        nativeType = "ALBUFFERCALLBACKTYPESOFT"
    )
}

// AL_SOFT_events

val ALEVENTPROCSOFT = Module.OPENAL.callback {
    void(
        "SOFTEventProc",

        ALenum("eventType"),
        ALuint("object"),
        ALuint("param"),
        AutoSize("message")..ALsizei("length"),
        ALcharASCII.const.p("message"),
        nullable.."ALvoid".opaque.p("userParam"),

        nativeType = "ALEVENTPROCSOFT"
    )
}