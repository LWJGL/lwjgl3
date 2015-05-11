/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val APPLE_ContextLoggingFunctions = "APPLEContextLoggingFunctions".nativeClassCL("APPLE_ContextLoggingFunctions", APPLE) {
	nativeImport(
		"OpenCL.h"
	)

	documentation =
		"""
		Native bindings to the $extensionName extension.

		Provides convenience functions that are intended to be used as the {@code pfn_notify} parameter to CL10#CreateContext().

		Note that if you pass $NULL to the CL10#CreateContext() {@code pfn_notify} parameter, you can also use these by setting the {@code CL_LOG_ERRORS}
		environment variable to one of stdout, stderr, or console. Pass your own do-nothing context logging function to disable the {@code CL_LOG_ERRORS}
		override.
		"""

	void(
		"LogMessagesToSystemLogAPPLE",
		"Forwards on all log messages to the Apple System Logger.",

		const _ char_p.IN("errstr", ""),
		const _ void_p.IN("private_info", ""),
		size_t.IN("cb", ""),
		void_p.IN("user_data", "")
	)

	void(
		"LogMessagesToStdoutAPPLE",
		"Forwards on all log messages to the standard output stream.",

		const _ char_p.IN("errstr", ""),
		const _ void_p.IN("private_info", ""),
		size_t.IN("cb", ""),
		void_p.IN("user_data", "")
	)

	void(
		"LogMessagesToStderrAPPLE",
		"Forwards on all log messages to the standard error stream.",

		const _ char_p.IN("errstr", ""),
		const _ void_p.IN("private_info", ""),
		size_t.IN("cb", ""),
		void_p.IN("user_data", "")
	)
}