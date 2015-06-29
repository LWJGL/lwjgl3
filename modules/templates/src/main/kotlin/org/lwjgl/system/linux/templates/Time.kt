/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

val time = "Time".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h",
		"<sys/time.h>",
		"<time.h>"
	)

	documentation = "Native bindings to <time.h>."

	// TODO: Is this portable? What's the type of clockid_t?
	IntConstant(
		"The IDs of the various system clocks (for POSIX.1b interval timers).",

		"CLOCK_REALTIME" _ 0,
		"CLOCK_MONOTONIC" _ 1,
		"CLOCK_PROCESS_CPUTIME_ID" _ 2,
		"CLOCK_THREAD_CPUTIME_ID" _ 3,
		"CLOCK_MONOTONIC_RAW" _ 4,
		"CLOCK_REALTIME_COARSE" _ 5,
		"CLOCK_MONOTONIC_COARSE" _ 6,
		"CLOCK_BOOTTIME" _ 7,
		"CLOCK_REALTIME_ALARM" _ 8,
		"CLOCK_BOOTTIME_ALARM" _ 9
	)

	int(
		"clock_getres",
		"""
		Finds the resolution (precision) of the specified clock {@code clk_id}, and, if res is non-$NULL, stores it in the ##timespec struct pointed to by
		{@code res}. The resolution of clocks depends on the implementation and cannot be configured by a particular process.
		""",

		clockid_t.IN("clk_id", "the clock"),
		nullable _ timespec_p.OUT("res", "a pointer to a ##timespec structure")
	)

	int(
		"clock_gettime",
		"Retrieves the time of the specified clock {@code clk_id} and stores it in the ##timespec struct pointed to by {@code res}.",

		clockid_t.IN("clk_id", "the clock"),
		timespec_p.OUT("tp", "a pointer to a ##timespec structure")
	)

	int(
		"gettimeofday",
		"Returns the time and the timezone",

		nullable _ timeval_p.OUT("tv", "the time"),
		nullable _ timezone_p.OUT("tz", "the timezone")
	)

}