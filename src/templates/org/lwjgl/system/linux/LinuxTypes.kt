/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux

import org.lwjgl.generator.*

val LINUX_PACKAGE = "org.lwjgl.system.linux"

val long = IntegerType("long", PrimitiveMapping.PTR)
val unsigned_long = IntegerType("unsigned long", PrimitiveMapping.PTR, unsigned = true)
val unsigned_long_p = PointerType(unsigned_long)

val ssize_t = IntegerType("ssize_t", PrimitiveMapping.PTR)

val clockid_t = PrimitiveType("clock_id_t", PrimitiveMapping.INT) // TODO: figure this out
val time_t = PrimitiveType("time_t", PrimitiveMapping.LONG) // TODO: time_t can be any type

val timespec = struct(LINUX_PACKAGE, "timespec", identifierType = StructIdentifierType.STRUCT) {
	documentation = "Time structure"
	nativeImport (
		"LinuxLWJGL.h",
		"<sys/time.h>"
	)

	time_t.member("tv_sec", "sec")
	long.member("tv_nsec", "nsec")
}.nativeType
val timespec_p = StructType(timespec)

val timeval = struct(LINUX_PACKAGE, "timeval", identifierType = StructIdentifierType.STRUCT) {
	documentation = "Time structure"
	nativeImport (
		"LinuxLWJGL.h",
		"<sys/time.h>"
	)

	long.member("tv_sec", "sec")
	long.member("tv_usec", "usec")
}.nativeType
val timeval_p = StructType(timeval)

val timezone = struct(LINUX_PACKAGE, "timezone", identifierType = StructIdentifierType.STRUCT) {
	documentation = "Timezone structure"
	nativeImport (
		"LinuxLWJGL.h",
		"<linux/time.h>"
	)

	int.member("tz_minuteswest")
	int.member("tz_dsttime")
}.nativeType
val timezone_p = StructType(timezone)

val fd_set_p = PointerType("fd_set") // fd_set for select and pselect. A struct, but we use macros to access.