/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

fun Time() = "Time".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h",
		"<sys/time.h>",
		"<time.h>"
	)

	javaDoc("Native bindings to <time.h>.")

	// TODO: clockid_t is an unknown type. Figure out a way to pass the correct values here

	int.func(
		"clock_getres",
		"""
		Finds the resolution (precision) of the specified clock {@code clk_id}, and, if res is non-$NULL, stores it in the {@link timespec} struct pointed to by
		{@code res}. The resolution of clocks depends on the implementation and cannot be configured by a particular process.
		""",

		clockid_t.IN("clk_id", "the clock"),
		nullable _ timespec_p.OUT("res", "a pointer to a {@link timespec} structure")
	)

	int.func(
		"clock_gettime",
		"Retrieves the time of the specified clock {@code clk_id} and stores it in the {@link timespec} struct pointed to by {@code res}.",

		clockid_t.IN("clk_id", "the clock"),
		timespec_p.OUT("tp", "a pointer to a {@link timespec} structure")
	)

	int.func(
		"gettimeofday",
		"Returns the time and the timezone",

		nullable _ timeval_p.OUT("tv", "the time"),
		nullable _ timezone_p.OUT("tz", "the timezone")
	)

}