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

val ALCboolean = NativeType("ALCboolean", TypeMapping.BOOLEAN)
val ALCbyte = PrimitiveType("ALCbyte", PrimitiveMapping.BYTE)
val ALCubyte = PrimitiveType("ALCubyte", PrimitiveMapping.BYTE)
val ALCshort = PrimitiveType("ALCshort", PrimitiveMapping.SHORT)
val ALCushort = PrimitiveType("ALCushort", PrimitiveMapping.SHORT)
val ALCint = PrimitiveType("ALCint", PrimitiveMapping.INT)
val ALCuint = PrimitiveType("ALCuint", PrimitiveMapping.INT)
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

val ALCsizei = PrimitiveType("ALCsizei", PrimitiveMapping.INT)
val ALCenum = PrimitiveType("ALCenum", PrimitiveMapping.INT)

val ALCsizei_p = PointerType(ALCsizei)
val ALCenum_p = PointerType(ALCenum)

// strings

val ALCchar_p = CharSequenceType("ALCchar")
val ALCchar_pp = PointerType(ALCchar_p)

// misc

val ALCdevice_p = PointerType("ALCdevice")
val ALCcontext_p = PointerType("ALCcontext")

val ALCvoidptr = PointerType("void", PointerMapping.NAKED_POINTER) // see alcGetProcAddress