/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal

import org.lwjgl.generator.*

// void

val ALvoid = NativeType("ALvoid", TypeMapping.VOID)
val ALvoid_p = PointerType("ALvoid", PointerMapping.DATA)
val ALvoid_pp = PointerType(ALvoid_p)

// numeric

val ALboolean = NativeType("ALboolean", TypeMapping.BOOLEAN)
val ALbyte = PrimitiveType("ALbyte", PrimitiveMapping.BYTE)
val ALubyte = PrimitiveType("ALubyte", PrimitiveMapping.BYTE)
val ALshort = PrimitiveType("ALshort", PrimitiveMapping.SHORT)
val ALushort = PrimitiveType("ALushort", PrimitiveMapping.SHORT)
val ALint = PrimitiveType("ALint", PrimitiveMapping.INT)
val ALuint = PrimitiveType("ALuint", PrimitiveMapping.INT)
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

// custom numeric

val ALsizei = PrimitiveType("ALsizei", PrimitiveMapping.INT)
val ALenum = PrimitiveType("ALenum", PrimitiveMapping.INT)

val ALsizei_p = PointerType(ALsizei)
val ALenum_p = PointerType(ALenum)

// strings

val ALcharASCII_p = CharSequenceType(name = "ALchar", charMapping = CharMapping.ASCII)
val ALcharASCII_pp = PointerType(ALcharASCII_p)

val ALcharUTF8_p = CharSequenceType(name = "ALchar", charMapping = CharMapping.UTF8)
val ALcharUTF8_pp = PointerType(ALcharUTF8_p)

val ALvoidptr = PointerType("void") // see alGetProcAddress