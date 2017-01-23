/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal

import org.lwjgl.generator.*

// void

val ALCvoid = NativeType("ALCvoid", TypeMapping.VOID)
val ALCvoid_p = PointerType("ALCvoid", PointerMapping.DATA)

// numeric

val ALCboolean = IntegerType("ALCboolean", PrimitiveMapping.BOOLEAN)
val ALCint = IntegerType("ALCint", PrimitiveMapping.INT)
val ALCuint = IntegerType("ALCuint", PrimitiveMapping.INT, unsigned = true)

val ALCint_p = ALCint.p

// custom numeric

val ALCsizei = IntegerType("ALCsizei", PrimitiveMapping.INT)
val ALCenum = IntegerType("ALCenum", PrimitiveMapping.INT)

// strings

val ALCcharASCII_p = CharSequenceType(name = "ALCchar", charMapping = CharMapping.ASCII)
val ALCcharUTF8_p = CharSequenceType(name = "ALCchar", charMapping = CharMapping.UTF8)

// misc

val ALCdevice_p = "ALCdevice".p
val ALCcontext_p = "ALCcontext".p

val ALCopaque_p = PointerType("void", PointerMapping.OPAQUE_POINTER) // see alcGetProcAddress