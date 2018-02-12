/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

val void = "void".void
val opaque_p = "void".opaque.p
val opaque_const_p = "void".opaque.const.p

val bool = PrimitiveType("bool", PrimitiveMapping.BOOLEAN)
val char = IntegerType("char", PrimitiveMapping.BYTE)
val short = IntegerType("short", PrimitiveMapping.SHORT)
val int = IntegerType("int", PrimitiveMapping.INT)
val intb = PrimitiveType("int", PrimitiveMapping.BOOLEAN4) // integer mapped to boolean
val unsigned = IntegerType("unsigned", PrimitiveMapping.INT, unsigned = true)
val float = PrimitiveType("float", PrimitiveMapping.FLOAT)
val double = PrimitiveType("double", PrimitiveMapping.DOUBLE)

val int8_t = IntegerType("int8_t", PrimitiveMapping.BYTE)
val uint8_t = IntegerType("uint8_t", PrimitiveMapping.BYTE, unsigned = true)
val int16_t = IntegerType("int16_t", PrimitiveMapping.SHORT)
val uint16_t = IntegerType("uint16_t", PrimitiveMapping.SHORT, unsigned = true)
val int32_t = IntegerType("int32_t", PrimitiveMapping.INT)
val uint32_t = IntegerType("uint32_t", PrimitiveMapping.INT, unsigned = true)
val int64_t = IntegerType("int64_t", PrimitiveMapping.LONG)
val uint64_t = IntegerType("uint64_t", PrimitiveMapping.LONG, unsigned = true)

val size_t = IntegerType("size_t", PrimitiveMapping.POINTER, unsigned = true)
val ptrdiff_t = IntegerType("ptrdiff_t", PrimitiveMapping.POINTER)
val intptr_t = IntegerType("intptr_t", PrimitiveMapping.POINTER)
val uintptr_t = IntegerType("uintptr_t", PrimitiveMapping.POINTER, unsigned = true)

val va_list = "va_list".p

val unsigned_char = IntegerType("unsigned char", PrimitiveMapping.BYTE, unsigned = true)
val unsigned_short = IntegerType("unsigned short", PrimitiveMapping.SHORT, unsigned = true)
val unsigned_int = IntegerType("unsigned int", PrimitiveMapping.INT, unsigned = true)

// strings

val charASCII = CharType("char", CharMapping.ASCII)
val charUTF8 = CharType("char", CharMapping.UTF8)