/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux

import org.lwjgl.generator.*

val LINUX_PACKAGE = "org.lwjgl.system.linux"

val voidptr = PointerType("void") // Naked pointer, used for function pointers.

val void = NativeType("void", TypeMapping.VOID)
val void_p = PointerType("void", PointerMapping.DATA)

val char = PrimitiveType("char", PrimitiveMapping.BYTE)
val short = PrimitiveType("short", PrimitiveMapping.SHORT)
val int = PrimitiveType("int", PrimitiveMapping.INT)
val long = PrimitiveType("long", PrimitiveMapping.PTR)
val ssize_t = IntegerType("ssize_t", PrimitiveMapping.PTR)
val double = PrimitiveType("double", PrimitiveMapping.DOUBLE)

val unsigned_char = IntegerType("unsigned char", PrimitiveMapping.BYTE, unsigned = true)
val unsigned_int = IntegerType("unsigned int", PrimitiveMapping.INT, unsigned = true)
val unsigned_short = IntegerType("unsigned short", PrimitiveMapping.SHORT, unsigned = true)
val unsigned_long = IntegerType("unsigned long", PrimitiveMapping.PTR, unsigned = true)
val size_t = IntegerType("size_t", PrimitiveMapping.PTR, unsigned = true)

val char_p = PointerType(char)
val char_pp = PointerType(char_p)
val unsigned_char_p = PointerType(unsigned_char)
val unsigned_char_pp = PointerType(unsigned_char_p)
val unsigned_short_p = PointerType(unsigned_short)
val int_p = PointerType(int)
val unsigned_int_p = PointerType(unsigned_int)
val unsigned_long_p = PointerType(unsigned_long)
val double_p = PointerType(double)

val charASCII = CharType("char", CharMapping.ASCII)
val charASCII_p = CharSequenceType(charASCII)
val charASCII_pp = PointerType(charASCII_p)

val charUTF8 = CharType("char", CharMapping.UTF8)
val charUTF8_p = CharSequenceType(charUTF8)
val charUTF8_pp = PointerType(charUTF8_p)

val clockid_t = PrimitiveType("clock_id_t", PrimitiveMapping.INT) // TODO: figure this out
val time_t = PrimitiveType("time_t", PrimitiveMapping.LONG) // TODO: time_t can be any type

val timespec = StructType(
	struct(LINUX_PACKAGE, "timespec", globalIdentifier = false) {
		javaDoc("Time structure")
		nativeImport (
			"LinuxLWJGL.h",
		    "<sys/time.h>"
		)

		time_t.member("tv_sec", "sec")
		long.member("tv_nsec", "nsec")
	}
)
val timespec_p = StructType(timespec)

val timeval = StructType(
	struct(LINUX_PACKAGE, "timeval", globalIdentifier = false) {
		javaDoc("Time structure")
		nativeImport (
			"LinuxLWJGL.h",
			"<sys/time.h>"
		)

		long.member("tv_sec", "sec")
		long.member("tv_usec", "usec")
	}
)
val timeval_p = StructType(timeval)

val timezone = StructType(
	struct(LINUX_PACKAGE, "timezone", globalIdentifier = false) {
		javaDoc("Timezone structure")
		nativeImport (
			"LinuxLWJGL.h",
			"<linux/time.h>"
		)

		int.member("tz_minuteswest")
		int.member("tz_dsttime")
	}
)
val timezone_p = StructType(timezone)

val fd_set_p = PointerType("fd_set") // fd_set for select and pselect. A struct, but we use macros to access.