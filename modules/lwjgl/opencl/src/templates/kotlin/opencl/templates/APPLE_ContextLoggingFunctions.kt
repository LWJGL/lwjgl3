/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val APPLE_ContextLoggingFunctions = "APPLEContextLoggingFunctions".nativeClassCL("APPLE_ContextLoggingFunctions", APPLE) {
    LongConstant(
        "clLogMessagesToSystemLogAPPLE".."CL.getICD().clLogMessagesToSystemLogAPPLE"
    ).noPrefix()

    LongConstant(
        "clLogMessagesToStdoutAPPLE".."CL.getICD().clLogMessagesToStdoutAPPLE"
    ).noPrefix()

    LongConstant(
        "clLogMessagesToStderrAPPLE".."CL.getICD().clLogMessagesToStderrAPPLE"
    ).noPrefix()

    private..void("LogMessagesToSystemLogAPPLE", void())
    private..void("LogMessagesToStdoutAPPLE", void())
    private..void("LogMessagesToStderrAPPLE", void())
}