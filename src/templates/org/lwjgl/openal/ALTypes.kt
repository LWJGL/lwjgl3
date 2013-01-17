/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal

import org.lwjgl.generator.*

// void

val ALvoid = NativeType("ALvoid", TypeMapping.VOID)
val ALvoid_p = PointerType(name = "ALvoid", mapping = PointerMapping.DATA)
val ALvoid_pp = PointerType(name = "ALvoid*", mapping = PointerMapping.DATA_POINTER)

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

val ALboolean_p = PointerType(name = "ALboolean", mapping = PointerMapping.DATA_BOOLEAN)
val ALbyte_p = PointerType(name = "ALbyte", mapping = PointerMapping.DATA_BYTE)
val ALubyte_p = PointerType(name = "ALubyte", mapping = PointerMapping.DATA_BYTE)
val ALshort_p = PointerType(name = "ALshort", mapping = PointerMapping.DATA_SHORT)
val ALushort_p = PointerType(name = "ALushort", mapping = PointerMapping.DATA_SHORT)
val ALint_p = PointerType(name = "ALint", mapping = PointerMapping.DATA_INT)
val ALuint_p = PointerType(name = "ALuint", mapping = PointerMapping.DATA_INT)
val ALfloat_p = PointerType(name = "ALfloat", mapping = PointerMapping.DATA_FLOAT)
val ALdouble_p = PointerType(name = "ALdouble", mapping = PointerMapping.DATA_DOUBLE)

// custom numeric

val ALsizei = PrimitiveType("ALsizei", PrimitiveMapping.INT)
val ALenum = PrimitiveType("ALenum", PrimitiveMapping.INT)

val ALsizei_p = PointerType(name = "ALsizei", mapping = PointerMapping.DATA_INT)
val ALenum_p = PointerType(name = "ALenum", mapping = PointerMapping.DATA_INT)

// strings

val ALchar_p = CharSequenceType("ALchar")
val ALchar_pp = PointerType(name = "ALchar*", mapping = PointerMapping.DATA_POINTER)

val ALvoidptr = PointerType(name = "void", mapping = PointerMapping.NAKED_POINTER) // see alGetProcAddress