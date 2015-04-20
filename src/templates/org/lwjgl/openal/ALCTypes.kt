/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal

import org.lwjgl.generator.*

// void

val ALCvoid = NativeType("ALCvoid", TypeMapping.VOID)
val ALCvoid_p = PointerType("ALCvoid", PointerMapping.DATA)
val ALCvoid_pp = PointerType(ALCvoid_p)

// numeric

val ALCboolean = IntegerType("ALCboolean", PrimitiveMapping.BOOLEAN)
val ALCbyte = IntegerType("ALCbyte", PrimitiveMapping.BYTE)
val ALCubyte = IntegerType("ALCubyte", PrimitiveMapping.BYTE, unsigned = true)
val ALCshort = IntegerType("ALCshort", PrimitiveMapping.SHORT)
val ALCushort = IntegerType("ALCushort", PrimitiveMapping.SHORT, unsigned = true)
val ALCint = IntegerType("ALCint", PrimitiveMapping.INT)
val ALCuint = IntegerType("ALCuint", PrimitiveMapping.INT, unsigned = true)
val ALCfloat = PrimitiveType("ALCfloat", PrimitiveMapping.FLOAT)
val ALCdouble = PrimitiveType("ALCdouble", PrimitiveMapping.DOUBLE)

val ALCboolean_p = PointerType("ALCboolean", PointerMapping.DATA_BOOLEAN)
val ALCbyte_p = PointerType(ALCbyte)
val ALCubyte_p = PointerType(ALCubyte)
val ALCshort_p = PointerType(ALCshort)
val ALCushort_p = PointerType(ALCushort)
val ALCint_p = PointerType(ALCint)
val ALCuint_p = PointerType(ALCuint)
val ALCfloat_p = PointerType(ALCfloat)
val ALCdouble_p = PointerType(ALCdouble)

// custom numeric

val ALCsizei = IntegerType("ALCsizei", PrimitiveMapping.INT)
val ALCenum = IntegerType("ALCenum", PrimitiveMapping.INT)

val ALCsizei_p = PointerType(ALCsizei)
val ALCenum_p = PointerType(ALCenum)

// strings

val ALCcharASCII_p = CharSequenceType(name = "ALCchar", charMapping = CharMapping.ASCII)
val ALCcharASCII_pp = PointerType(ALCcharASCII_p)

val ALCcharUTF8_p = CharSequenceType(name = "ALCchar", charMapping = CharMapping.UTF8)
val ALCcharUTF8_pp = PointerType(ALCcharUTF8_p)

// misc

val ALCdevice_p = PointerType("ALCdevice")
val ALCcontext_p = PointerType("ALCcontext")

val ALCvoidptr = PointerType("void", PointerMapping.OPAQUE_POINTER) // see alcGetProcAddress