/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <strong>APPLE_ContextLoggingFunctions</strong> extension.
 * 
 * <p>Provides convenience functions that are intended to be used as the {@code pfn_notify} parameter to {@link CL10#clCreateContext CreateContext}.</p>
 * 
 * <p>Note that if you pass {@code NULL} to the {@link CL10#clCreateContext CreateContext} {@code pfn_notify} parameter, you can also use these by setting the {@code CL_LOG_ERRORS}
 * environment variable to one of stdout, stderr, or console. Pass your own do-nothing context logging function to disable the {@code CL_LOG_ERRORS}
 * override.</p>
 */
public class APPLEContextLoggingFunctions {

    /** Forwards on all log messages to the Apple System Logger. */
    public static final long clLogMessagesToSystemLogAPPLE = CL.getICD().clLogMessagesToSystemLogAPPLE;

    /** Forwards on all log messages to the standard output stream. */
    public static final long clLogMessagesToStdoutAPPLE = CL.getICD().clLogMessagesToStdoutAPPLE;

    /** Forwards on all log messages to the standard error stream. */
    public static final long clLogMessagesToStderrAPPLE = CL.getICD().clLogMessagesToStderrAPPLE;

    protected APPLEContextLoggingFunctions() {
        throw new UnsupportedOperationException();
    }

    // --- [ clLogMessagesToSystemLogAPPLE ] ---

    private static void clLogMessagesToSystemLogAPPLE() {
        long __functionAddress = CL.getICD().clLogMessagesToSystemLogAPPLE;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ clLogMessagesToStdoutAPPLE ] ---

    private static void clLogMessagesToStdoutAPPLE() {
        long __functionAddress = CL.getICD().clLogMessagesToStdoutAPPLE;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ clLogMessagesToStderrAPPLE ] ---

    private static void clLogMessagesToStderrAPPLE() {
        long __functionAddress = CL.getICD().clLogMessagesToStderrAPPLE;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

}