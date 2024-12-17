/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class ALTERALiveObjectTracking {

    protected ALTERALiveObjectTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ clTrackLiveObjectsAltera ] ---

    /** {@code void clTrackLiveObjectsAltera(cl_platform_id platform)} */
    public static void clTrackLiveObjectsAltera(@NativeType("cl_platform_id") long platform) {
        long __functionAddress = CL.getICD().clTrackLiveObjectsAltera;
        if (CHECKS) {
            check(__functionAddress);
            check(platform);
        }
        callPV(platform, __functionAddress);
    }

    // --- [ clReportLiveObjectsAltera ] ---

    /** {@code void clReportLiveObjectsAltera(cl_platform_id platform, void (*) (void *, void *, char const *, cl_uint) report_fn, void * user_data)} */
    public static void nclReportLiveObjectsAltera(long platform, long report_fn, long user_data) {
        long __functionAddress = CL.getICD().clReportLiveObjectsAltera;
        if (CHECKS) {
            check(__functionAddress);
            check(platform);
            check(user_data);
        }
        callPPPV(platform, report_fn, user_data, __functionAddress);
    }

    /** {@code void clReportLiveObjectsAltera(cl_platform_id platform, void (*) (void *, void *, char const *, cl_uint) report_fn, void * user_data)} */
    public static void clReportLiveObjectsAltera(@NativeType("cl_platform_id") long platform, @NativeType("void (*) (void *, void *, char const *, cl_uint)") CLReportLiveObjectsAlteraCallbackI report_fn, @NativeType("void *") long user_data) {
        nclReportLiveObjectsAltera(platform, report_fn.address(), user_data);
    }

}