/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class APPLEContextLoggingFunctions {

    public static final long clLogMessagesToSystemLogAPPLE = CL.getICD().clLogMessagesToSystemLogAPPLE;

    public static final long clLogMessagesToStdoutAPPLE = CL.getICD().clLogMessagesToStdoutAPPLE;

    public static final long clLogMessagesToStderrAPPLE = CL.getICD().clLogMessagesToStderrAPPLE;

    protected APPLEContextLoggingFunctions() {
        throw new UnsupportedOperationException();
    }

    // --- [ clLogMessagesToSystemLogAPPLE ] ---

    /** {@code void clLogMessagesToSystemLogAPPLE(void)} */
    private static void clLogMessagesToSystemLogAPPLE() {
        long __functionAddress = CL.getICD().clLogMessagesToSystemLogAPPLE;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ clLogMessagesToStdoutAPPLE ] ---

    /** {@code void clLogMessagesToStdoutAPPLE(void)} */
    private static void clLogMessagesToStdoutAPPLE() {
        long __functionAddress = CL.getICD().clLogMessagesToStdoutAPPLE;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ clLogMessagesToStderrAPPLE ] ---

    /** {@code void clLogMessagesToStderrAPPLE(void)} */
    private static void clLogMessagesToStderrAPPLE() {
        long __functionAddress = CL.getICD().clLogMessagesToStderrAPPLE;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

}