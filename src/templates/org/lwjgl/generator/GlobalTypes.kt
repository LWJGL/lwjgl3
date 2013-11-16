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
val long = IntegerType("long", PrimitiveMapping.PTR)
val float = PrimitiveType("float", PrimitiveMapping.FLOAT)
val double = PrimitiveType("double", PrimitiveMapping.DOUBLE)

val char_p = PointerType(char)
val short_p = PointerType(short)
val int_p = PointerType(int)
val long_p = PointerType(long)
val float_p = PointerType(float)
val double_p = PointerType(double)

val char_pp = PointerType(char_p)

val unsigned_char = IntegerType("unsigned char", PrimitiveMapping.BYTE, unsigned = true)
val unsigned_short = IntegerType("unsigned short", PrimitiveMapping.SHORT, unsigned = true)
val unsigned_int = IntegerType("unsigned int", PrimitiveMapping.INT, unsigned = true)
val unsigned_long = IntegerType("unsigned long", PrimitiveMapping.PTR, unsigned = true)

val unsigned_char_p = PointerType(unsigned_char)
val unsigned_short_p = PointerType(unsigned_short)
val unsigned_int_p = PointerType(unsigned_int)
val unsigned_long_p = PointerType(unsigned_long)

val unsigned_char_pp = PointerType(unsigned_char_p)

// strings

val charASCII = CharType("char", CharMapping.ASCII) // for struct members
val charASCII_p = CharSequenceType(name = "char", charMapping = CharMapping.ASCII)
val charASCII_pp = PointerType(charASCII_p)

val charUTF8 = CharType("char", CharMapping.UTF8) // for struct members
val charUTF8_p = CharSequenceType(name = "char", charMapping = CharMapping.UTF8)
val charUTF8_pp = PointerType(charUTF8_p)