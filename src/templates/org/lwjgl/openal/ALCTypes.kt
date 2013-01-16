/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal

import org.lwjgl.generator.*

// void

val ALCvoid = NativeType("ALCvoid", TypeMapping.VOID)
val ALCvoid_p = PointerType(name = "ALCvoid", mapping = PointerMapping.DATA)
val ALCvoid_pp = PointerType(name = "ALCvoid*", mapping = PointerMapping.DATA_POINTER)

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

val ALCboolean_p = PointerType(name = "ALCboolean", mapping = PointerMapping.DATA_BOOLEAN)
val ALCbyte_p = PointerType(name = "ALCbyte", mapping = PointerMapping.DATA_BYTE)
val ALCubyte_p = PointerType(name = "ALCubyte", mapping = PointerMapping.DATA_BYTE)
val ALCshort_p = PointerType(name = "ALCshort", mapping = PointerMapping.DATA_SHORT)
val ALCushort_p = PointerType(name = "ALCushort", mapping = PointerMapping.DATA_SHORT)
val ALCint_p = PointerType(name = "ALCint", mapping = PointerMapping.DATA_INT)
val ALCuint_p = PointerType(name = "ALCuint", mapping = PointerMapping.DATA_INT)
val ALCfloat_p = PointerType(name = "ALCfloat", mapping = PointerMapping.DATA_FLOAT)
val ALCdouble_p = PointerType(name = "ALCdouble", mapping = PointerMapping.DATA_DOUBLE)

// custom numeric

val ALCsizei = PrimitiveType("ALCsizei", PrimitiveMapping.INT)
val ALCenum = PrimitiveType("ALCenum", PrimitiveMapping.INT)

val ALCsizei_p = PointerType(name = "ALCsizei", mapping = PointerMapping.DATA_INT)
val ALCenum_p = PointerType(name = "ALCenum", mapping = PointerMapping.DATA_INT)

// strings

val ALCchar_p = CharSequenceType(name = "ALCchar", charMapping = CharMapping.UTF8)
val ALCchar_pp = PointerType(name = "ALCchar*", mapping = PointerMapping.DATA_POINTER)

// misc

val ALCdevice_p = PointerType("ALCdevice")
val ALCcontext_p = PointerType("ALCcontext")

val ALCvoidptr = PointerType(name = "ALCvoid", mapping = PointerMapping.NAKED_POINTER) // see alcGetProcAddress