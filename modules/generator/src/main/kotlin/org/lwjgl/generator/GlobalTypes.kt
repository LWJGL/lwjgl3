/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

val void = NativeType("void", TypeMapping.VOID)
val voidptr = "void".p
val voidptr_p = voidptr.p
val void_p = PointerType("void", PointerMapping.DATA)
val void_pp = void_p.p

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

val bool_p = bool.p
val char_p = char.p
val short_p = short.p
val short_pp = short_p.p
val int_p = int.p
val float_p = float.p
val float_pp = float_p.p
val double_p = double.p
val size_t_p = size_t.p

val int32_t_p = int32_t.p
val uint32_t_p = uint32_t.p
val uint64_t_p = uint64_t.p

val char_pp = char_p.p

val unsigned_char = IntegerType("unsigned char", PrimitiveMapping.BYTE, unsigned = true)
val unsigned_short = IntegerType("unsigned short", PrimitiveMapping.SHORT, unsigned = true)
val unsigned_int = IntegerType("unsigned int", PrimitiveMapping.INT, unsigned = true)

val unsigned_char_p = unsigned_char.p
val unsigned_short_p = unsigned_short.p
val unsigned_int_p = unsigned_int.p

// strings

val charASCII = CharType("char", CharMapping.ASCII) // for struct members
val charASCII_p = charASCII.p
val charASCII_pp = charASCII_p.p

val charUTF8 = CharType("char", CharMapping.UTF8) // for struct members
val charUTF8_p = charUTF8.p
val charUTF8_pp = charUTF8_p.p

// JNI types

val jboolean = IntegerType("jboolean", PrimitiveMapping.BOOLEAN)
val jbyte = IntegerType("jbyte", PrimitiveMapping.BYTE)
val jchar = IntegerType("jchar", PrimitiveMapping.SHORT, unsigned = true)
val jshort = IntegerType("jshort", PrimitiveMapping.SHORT)
val jint = IntegerType("jint", PrimitiveMapping.INT)
val jlong = IntegerType("jlong", PrimitiveMapping.LONG)

val jfloat = IntegerType("jfloat", PrimitiveMapping.FLOAT)
val jdouble = IntegerType("jdouble", PrimitiveMapping.DOUBLE)

val jobject = NativeType("jobject", TypeMapping("jobject", Any::class.java, Any::class.java))
val jobject_p = "jobject".opaque_p

val JNIEnv_p = "JNIEnv".p