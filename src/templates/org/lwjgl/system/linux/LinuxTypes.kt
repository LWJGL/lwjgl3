/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux

import org.lwjgl.generator.*

val LINUX_PACKAGE = "org.lwjgl.system.linux"

val voidptr = PointerType("void") // Naked pointer, used for function pointers.

val void = NativeType("void", TypeMapping.VOID)
val void_p = PointerType("void")

val char = PrimitiveType("char", PrimitiveMapping.BYTE)
val int = PrimitiveType("int", PrimitiveMapping.INT)
val Bool = PrimitiveType("Bool", int)
val long = PrimitiveType("long", PrimitiveMapping.PTR)

val unsigned_char = PrimitiveType("unsigned char", PrimitiveMapping.BYTE)
val unsigned_int = PrimitiveType("unsigned int", PrimitiveMapping.INT)
val unsigned_short = PrimitiveType("unsigned short", PrimitiveMapping.SHORT)
val unsigned_long = PrimitiveType("unsigned long", PrimitiveMapping.PTR)

val Bool_p = PointerType(Bool)
val char_p = PointerType(char)
val char_pp = PointerType(char_p)
val unsigned_char_p = PointerType(unsigned_char)
val unsigned_char_pp = PointerType(unsigned_char_p)
val unsigned_short_p = PointerType(unsigned_short)
val int_p = PointerType(int)
val unsigned_int_p = PointerType(unsigned_int)
val unsigned_long_p = PointerType(unsigned_long)

val charASCII_p = CharSequenceType(name = "char", charMapping = CharMapping.ASCII)
val charASCII_pp = PointerType(charASCII_p)

val charUTF8_p = CharSequenceType(name = "char", charMapping = CharMapping.UTF8)
val charUTF8_pp = PointerType(charUTF8_p)

val clockid_t = PrimitiveType("clock_id_t", PrimitiveMapping.INT) // TODO: figure this out
val time_t = PrimitiveType("time_t", PrimitiveMapping.LONG) // TODO: time_t can be any type

val timespec = StructType(
	struct(LINUX_PACKAGE, "timespec") {
		javaDoc("Time structure")
		nativeImport ("LinuxLWJGL.h")

		time_t.member("tv_sec", "sec")
		long.member("tv_nsec", "nsec")
	}
)
val timespec_p = StructType(timespec)

val timeval = StructType(
	struct(LINUX_PACKAGE, "timeval") {
		javaDoc("Time structure")
		nativeImport ("LinuxLWJGL.h")

		long.member("tv_sec", "sec")
		long.member("tv_usec", "usec")
	}
)
val timeval_p = StructType(timeval)

val timezone = StructType(
	struct(LINUX_PACKAGE, "timezone") {
		javaDoc("Timezone structure")
		nativeImport ("LinuxLWJGL.h")

		int.member("tz_minuteswest")
		int.member("tz_dsttime")
	}
)
val timezone_p = StructType(timezone)

val fd_set_p = PointerType("fd_set") // fd_set for select and pselect. A struct, but we use macros to access.