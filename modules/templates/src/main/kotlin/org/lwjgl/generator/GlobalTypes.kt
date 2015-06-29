/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

val void = NativeType("void", TypeMapping.VOID)
val voidptr = PointerType("void") // Naked pointer
val voidptr_p = PointerType(voidptr)
val void_p = PointerType("void", PointerMapping.DATA)
val void_pp = PointerType(void_p)

val char = IntegerType("char", PrimitiveMapping.BYTE)
val short = IntegerType("short", PrimitiveMapping.SHORT)
val int = IntegerType("int", PrimitiveMapping.INT)
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

val size_t = IntegerType("size_t", PrimitiveMapping.PTR, unsigned = true)
val ptrdiff_t = IntegerType("ptrdiff_t", PrimitiveMapping.PTR)
val uintptr_t = IntegerType("uintptr_t", PrimitiveMapping.PTR, unsigned = true)

val char_p = PointerType(char)
val short_p = PointerType(short)
val short_pp = PointerType(short_p)
val int_p = PointerType(int)
val float_p = PointerType(float)
val float_pp = PointerType(float_p)
val double_p = PointerType(double)
val size_t_p = PointerType(size_t)

val char_pp = PointerType(char_p)

val unsigned_char = IntegerType("unsigned char", PrimitiveMapping.BYTE, unsigned = true)
val unsigned_short = IntegerType("unsigned short", PrimitiveMapping.SHORT, unsigned = true)
val unsigned_int = IntegerType("unsigned int", PrimitiveMapping.INT, unsigned = true)

val unsigned_char_p = PointerType(unsigned_char)
val unsigned_short_p = PointerType(unsigned_short)
val unsigned_int_p = PointerType(unsigned_int)

val unsigned_char_pp = PointerType(unsigned_char_p)

// strings

val charASCII = CharType("char", CharMapping.ASCII) // for struct members
val charASCII_p = CharSequenceType(name = "char", charMapping = CharMapping.ASCII)
val charASCII_pp = PointerType(charASCII_p)

val charUTF8 = CharType("char", CharMapping.UTF8) // for struct members
val charUTF8_p = CharSequenceType(name = "char", charMapping = CharMapping.UTF8)
val charUTF8_pp = PointerType(charUTF8_p)