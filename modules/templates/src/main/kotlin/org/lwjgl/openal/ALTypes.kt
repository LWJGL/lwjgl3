/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal

import org.lwjgl.generator.*

val OPENAL_PACKAGE = "org.lwjgl.openal"

fun config() {
	packageInfo(
		OPENAL_PACKAGE,
		"""
		Contains bindings to the <a href="http://www.openal.org/">OpenAL</a> cross-platform 3D audio API.

        LWJGL comes with a software OpenAL implementation, <a href="http://www.openal-soft.org/">OpenAL Soft</a>.
		"""
	)
}

// void

val ALvoid = NativeType("ALvoid", TypeMapping.VOID)
val ALvoid_p = PointerType("ALvoid", PointerMapping.DATA)

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
val ALbyte_p = ALbyte.p
val ALubyte_p = ALubyte.p
val ALshort_p = ALshort.p
val ALushort_p = ALushort.p
val ALint_p = ALint.p
val ALuint_p = ALuint.p
val ALfloat_p = ALfloat.p
val ALdouble_p = ALdouble.p

val ALint64SOFT = IntegerType("ALint64SOFT", PrimitiveMapping.LONG)
val ALint64SOFT_p = ALint64SOFT.p

// custom numeric

val ALsizei = IntegerType("ALsizei", PrimitiveMapping.INT)
val ALenum = IntegerType("ALenum", PrimitiveMapping.INT)

val ALsizei_p = ALsizei.p
val ALenum_p = ALenum.p

// strings

val ALcharASCII_p = CharSequenceType(name = "ALchar", charMapping = CharMapping.ASCII)
val ALcharASCII_pp = ALcharASCII_p.p

val ALcharUTF8_p = CharSequenceType(name = "ALchar", charMapping = CharMapping.UTF8)
val ALcharUTF8_pp = ALcharUTF8_p.p

val ALvoidptr = "void".p // see alGetProcAddress