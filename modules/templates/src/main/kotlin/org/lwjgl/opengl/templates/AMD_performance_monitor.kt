/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_performance_monitor = "AMDPerformanceMonitor".nativeClassGL("AMD_performance_monitor", postfix = AMD) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension enables the capture and reporting of performance monitors. Performance monitors contain groups of counters which hold arbitrary counted
		data. Typically, the counters hold information on performance-related counters in the underlying hardware. The extension is general enough to allow the
		implementation to choose which counters to expose and pick the data type and range of the counters. The extension also allows counting to start and end
		on arbitrary boundaries during rendering.
		"""

	IntConstant(
		"Accepted by the {@code pame} parameter of GetPerfMonitorCounterInfoAMD.",

		"COUNTER_TYPE_AMD" _ 0x8BC0,
		"COUNTER_RANGE_AMD" _ 0x8BC1
	)

	IntConstant(
		"Returned as a valid value in {@code data} parameter of GetPerfMonitorCounterInfoAMD if {@code pname} = COUNTER_TYPE_AMD.",

		"UNSIGNED_INT64_AMD" _ 0x8BC2,
		"PERCENTAGE_AMD" _ 0x8BC3
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetPerfMonitorCounterDataAMD.",

		"PERFMON_RESULT_AVAILABLE_AMD" _ 0x8BC4,
		"PERFMON_RESULT_SIZE_AMD" _ 0x8BC5,
		"PERFMON_RESULT_AMD" _ 0x8BC6
	)

	void(
		"GetPerfMonitorGroupsAMD",
		"",

		nullable _ Check(1) _ GLint_p.OUT("numGroups", ""),
		AutoSize("groups") _ GLsizei.IN("groupsSize", ""),
		nullable _ GLuint_p.OUT("groups", "")
	)

	void(
		"GetPerfMonitorCountersAMD",
		"",

		GLuint.IN("group", ""),
		Check(1) _ GLint_p.OUT("numCounters", ""),
		Check(1) _ GLint_p.OUT("maxActiveCounters", ""),
		AutoSize("counters") _ GLsizei.IN("counterSize", ""),
		GLuint_p.OUT("counters", "")
	)

	void(
		"GetPerfMonitorGroupStringAMD",
		"",

		GLuint.IN("group", ""),
		AutoSize("groupString") _ GLsizei.IN("bufSize", ""),
		Check(1) _ GLsizei_p.OUT("length", ""),
		GLcharASCII_p.OUT("groupString", "")
	)

	void(
		"GetPerfMonitorCounterStringAMD",
		"",

		GLuint.IN("group", ""),
		GLuint.IN("counter", ""),
		AutoSize("counterString") _ GLsizei.IN("bufSize", ""),
		nullable _ Check(1) _ GLsizei_p.OUT("length", ""),
		nullable _ GLcharASCII_p.OUT("counterString", "")
	)

	void(
		"GetPerfMonitorCounterInfoAMD",
		"",

		GLuint.IN("group", ""),
		GLuint.IN("counter", ""),
		GLenum.IN("pname", ""),
		Check(4) _ MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT) _ void_p.OUT("data", "")
	)

	void(
		"GenPerfMonitorsAMD",
		"",

		AutoSize("monitors") _ GLsizei.IN("n", ""),
		returnValue _ GLuint_p.OUT("monitors", "")
	)

	void(
		"DeletePerfMonitorsAMD",
		"",

		AutoSize("monitors") _ GLsizei.IN("n", ""),
		SingleValue("monitor") _ GLuint_p.IN("monitors", "")
	)

	void(
		"SelectPerfMonitorCountersAMD",
		"",

		GLuint.IN("monitor", ""),
		GLboolean.IN("enable", ""),
		GLuint.IN("group", ""),
		AutoSize("counterList") _ GLint.IN("numCounters", ""),
		GLuint_p.IN("counterList", "")
	)

	void(
		"BeginPerfMonitorAMD",
		"",

		GLuint.IN("monitor", "")
	)

	void(
		"EndPerfMonitorAMD",
		"",

		GLuint.IN("monitor", "")
	)

	void(
		"GetPerfMonitorCounterDataAMD",
		"",

		GLuint.IN("monitor", ""),
		GLenum.IN("pname", ""),
		AutoSize("data") _ GLsizei.IN("dataSize", ""),
		GLuint_p.OUT("data", ""),
		Check(1) _ nullable _ GLint_p.OUT("bytesWritten", "")
	)
}