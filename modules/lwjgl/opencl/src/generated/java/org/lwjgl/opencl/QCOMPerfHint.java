/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class QCOMPerfHint {

    public static final int
        CL_PERF_HINT_HIGH_QCOM   = 0x40C3,
        CL_PERF_HINT_NORMAL_QCOM = 0x40C4,
        CL_PERF_HINT_LOW_QCOM    = 0x40C5;

    public static final int CL_CONTEXT_PERF_HINT_QCOM = 0x40C2;

    protected QCOMPerfHint() {
        throw new UnsupportedOperationException();
    }

    // --- [ clSetPerfHintQCOM ] ---

    /** {@code cl_int clSetPerfHintQCOM(cl_context context, cl_perf_hint_qcom perf_hint)} */
    @NativeType("cl_int")
    public static int clSetPerfHintQCOM(@NativeType("cl_context") long context, @NativeType("cl_perf_hint_qcom") int perf_hint) {
        long __functionAddress = CL.getICD().clSetPerfHintQCOM;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPI(context, perf_hint, __functionAddress);
    }

}