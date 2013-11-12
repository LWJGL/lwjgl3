/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux

import org.lwjgl.generator.*

val LINUX_PACKAGE = "org.lwjgl.system.linux"

val ssize_t = IntegerType("ssize_t", PrimitiveMapping.PTR)
val size_t = IntegerType("size_t", PrimitiveMapping.PTR, unsigned = true)

val clockid_t = PrimitiveType("clock_id_t", PrimitiveMapping.INT) // TODO: figure this out
val time_t = PrimitiveType("time_t", PrimitiveMapping.LONG) // TODO: time_t can be any type

val timespec = StructType(
	struct(LINUX_PACKAGE, "timespec", globalIdentifier = false) {
		documentation = "Time structure"
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
		documentation = "Time structure"
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
		documentation = "Timezone structure"
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