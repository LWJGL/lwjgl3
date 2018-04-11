/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal

import org.lwjgl.generator.*

// void

val ALCvoid = "ALCvoid".void

// numeric

val ALCboolean = IntegerType("ALCboolean", PrimitiveMapping.BOOLEAN)
val ALCint = IntegerType("ALCint", PrimitiveMapping.INT)
val ALCuint = IntegerType("ALCuint", PrimitiveMapping.INT, unsigned = true)

// custom numeric

val ALCsizei = IntegerType("ALCsizei", PrimitiveMapping.INT)
val ALCenum = IntegerType("ALCenum", PrimitiveMapping.INT)

// strings

val ALCcharASCII = CharType("ALCchar", CharMapping.ASCII)
val ALCcharUTF8 = CharType("ALCchar", CharMapping.UTF8)

// misc

val ALCdevice = "ALCdevice".opaque
val ALCcontext = "ALCcontext".opaque