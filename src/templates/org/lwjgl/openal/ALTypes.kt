/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal

import org.lwjgl.generator.*

val OPENAL_PACKAGE = "org.lwjgl.openal"

// void

val ALvoid = NativeType("ALvoid", TypeMapping.VOID)
val ALvoid_p = PointerType("ALvoid", PointerMapping.DATA)
val ALvoid_pp = PointerType(ALvoid_p)

// numeric

val ALboolean = IntegerType("ALboolean", PrimitiveMapping.BOOLEAN)
val ALbyte = IntegerType("ALbyte", PrimitiveMapping.BYTE)
val ALubyte = IntegerType("ALubyte", PrimitiveMapping.BYTE, unsigned = true)
val ALshort = IntegerType("ALshort", PrimitiveMapping.SHORT)
val ALushort = IntegerType("ALushort", PrimitiveMapping.SHORT, unsigned = true)
val ALint = IntegerType("ALint", PrimitiveMapping.INT)
val ALuint = IntegerType("ALuint", PrimitiveMapping.INT, unsigned = true)
val ALfloat = PrimitiveType("ALfloat", PrimitiveMapping.FLOAT)
val ALdouble = PrimitiveType("ALdouble", PrimitiveMapping.DOUBLE)

val ALboolean_p = PointerType("ALboolean", PointerMapping.DATA_BOOLEAN)
val ALbyte_p = PointerType(ALbyte)
val ALubyte_p = PointerType(ALubyte)
val ALshort_p = PointerType(ALshort)
val ALushort_p = PointerType(ALushort)
val ALint_p = PointerType(ALint)
val ALuint_p = PointerType(ALuint)
val ALfloat_p = PointerType(ALfloat)
val ALdouble_p = PointerType(ALdouble)

val ALint64SOFT = IntegerType("ALint64SOFT", PrimitiveMapping.LONG)
val ALint64SOFT_p = PointerType(ALint64SOFT)

// custom numeric

val ALsizei = IntegerType("ALsizei", PrimitiveMapping.INT)
val ALenum = IntegerType("ALenum", PrimitiveMapping.INT)

val ALsizei_p = PointerType(ALsizei)
val ALenum_p = PointerType(ALenum)

// strings

val ALcharASCII_p = CharSequenceType(name = "ALchar", charMapping = CharMapping.ASCII)
val ALcharASCII_pp = PointerType(ALcharASCII_p)

val ALcharUTF8_p = CharSequenceType(name = "ALchar", charMapping = CharMapping.UTF8)
val ALcharUTF8_pp = PointerType(ALcharUTF8_p)

val ALvoidptr = PointerType("void") // see alGetProcAddress