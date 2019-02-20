/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal

import org.lwjgl.generator.*

// void

val ALvoid = "ALvoid".void

// numeric

val ALboolean = IntegerType("ALboolean", PrimitiveMapping.BOOLEAN)
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