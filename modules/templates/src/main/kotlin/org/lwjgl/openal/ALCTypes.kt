/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal

import org.lwjgl.generator.*

// void

val ALCvoid = NativeType("ALCvoid", TypeMapping.VOID)
val ALCvoid_p = PointerType("ALCvoid", PointerMapping.DATA)
val ALCvoid_pp = ALCvoid_p.p

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
val ALCbyte_p = ALCbyte.p
val ALCubyte_p = ALCubyte.p
val ALCshort_p = ALCshort.p
val ALCushort_p = ALCushort.p
val ALCint_p = ALCint.p
val ALCuint_p = ALCuint.p
val ALCfloat_p = ALCfloat.p
val ALCdouble_p = ALCdouble.p

// custom numeric

val ALCsizei = IntegerType("ALCsizei", PrimitiveMapping.INT)
val ALCenum = IntegerType("ALCenum", PrimitiveMapping.INT)

val ALCsizei_p = ALCsizei.p
val ALCenum_p = ALCenum.p

// strings

val ALCcharASCII_p = CharSequenceType(name = "ALCchar", charMapping = CharMapping.ASCII)
val ALCcharASCII_pp = ALCcharASCII_p.p

val ALCcharUTF8_p = CharSequenceType(name = "ALCchar", charMapping = CharMapping.UTF8)
val ALCcharUTF8_pp = ALCcharUTF8_p.p

// misc

val ALCdevice_p = PointerType("ALCdevice")
val ALCcontext_p = PointerType("ALCcontext")

val ALCvoidptr = PointerType("void", PointerMapping.OPAQUE_POINTER) // see alcGetProcAddress