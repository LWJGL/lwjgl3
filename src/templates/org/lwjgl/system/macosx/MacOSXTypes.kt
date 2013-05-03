/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx

import org.lwjgl.generator.*

val MACOSX_PACKAGE = "org.lwjgl.system.macosx"

val voidptr = PointerType("void") // Naked pointer, used for function pointers.

val void = NativeType("void", TypeMapping.VOID)

val Boolean = PrimitiveType("Boolean", PrimitiveMapping.BYTE)
val char = IntegerType("char", PrimitiveMapping.BYTE)

val UInt8 = IntegerType("UInt8", PrimitiveMapping.BYTE, unsigned = true)
val SInt8 = IntegerType("SInt8", PrimitiveMapping.BYTE)
val UInt16 = IntegerType("UInt16", PrimitiveMapping.SHORT, unsigned = true)
val SInt16 = IntegerType("SInt16", PrimitiveMapping.SHORT)
val UInt32 = IntegerType("UInt32", PrimitiveMapping.INT, unsigned = true)
val SInt32 = IntegerType("SInt32", PrimitiveMapping.INT)
val UInt64 = IntegerType("UInt64", PrimitiveMapping.LONG, unsigned = true)
val SInt64 = IntegerType("SInt64", PrimitiveMapping.LONG)

val Float32 = PrimitiveType("Float32", PrimitiveMapping.FLOAT)
val Float64 = PrimitiveType("Float64", PrimitiveMapping.DOUBLE)

val UTF32Char = PrimitiveType("UTF32Char", UInt32)
val UTF16Char = CharType("UTF16Char", CharMapping.UTF16)
val UTF8Char = CharType("UTF8Char", CharMapping.UTF8)

val char_p = PointerType(char)

val CFTypeID = IntegerType("CFTypeID", PrimitiveMapping.LONG, unsigned = true)
val CFOptionFlags = IntegerType("CFOptionFlags", PrimitiveMapping.LONG, unsigned = true)
val CFHashCode = IntegerType("CFHashCode", PrimitiveMapping.LONG, unsigned = true)
val CFIndex = IntegerType("CFIndex", PrimitiveMapping.LONG)