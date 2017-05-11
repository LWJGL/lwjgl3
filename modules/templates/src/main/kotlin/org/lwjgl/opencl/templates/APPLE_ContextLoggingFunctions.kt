/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val APPLE_ContextLoggingFunctions = "APPLEContextLoggingFunctions".nativeClassCL("APPLE_ContextLoggingFunctions", APPLE) {
    documentation =
        """
        Native bindings to the $extensionName extension.

        Provides convenience functions that are intended to be used as the {@code pfn_notify} parameter to #CreateContext().

        Note that if you pass #NULL to the #CreateContext() {@code pfn_notify} parameter, you can also use these by setting the {@code CL_LOG_ERRORS}
        environment variable to one of stdout, stderr, or console. Pass your own do-nothing context logging function to disable the {@code CL_LOG_ERRORS}
        override.
        """

    LongConstant(
        "Forwards on all log messages to the Apple System Logger.",
        "clLogMessagesToSystemLogAPPLE".."CL.getICD().clLogMessagesToSystemLogAPPLE"
    ).noPrefix()

    LongConstant(
        "Forwards on all log messages to the standard output stream.",
        "clLogMessagesToStdoutAPPLE".."CL.getICD().clLogMessagesToStdoutAPPLE"
    ).noPrefix()

    LongConstant(
        "Forwards on all log messages to the standard error stream.",
        "clLogMessagesToStderrAPPLE".."CL.getICD().clLogMessagesToStderrAPPLE"
    ).noPrefix()

    private..macro(expression = "")..void("LogMessagesToSystemLogAPPLE", "")
    private..macro(expression = "")..void("LogMessagesToStdoutAPPLE", "")
    private..macro(expression = "")..void("LogMessagesToStderrAPPLE", "")
}