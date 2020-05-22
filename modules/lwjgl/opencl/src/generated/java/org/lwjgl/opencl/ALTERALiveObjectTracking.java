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
 * Native bindings to the <strong>altera_live_object_tracking</strong> extension.
 * 
 * <p>This extension specifies an API for debugging OpenCL API object leaks in user applications. It provides a mechanism for tracking all live API objects,
 * and for enumerating them on demand.</p>
 * 
 * <p>The OpenCL runtime API generates and uses many kinds of objects such as contexts, programs, kernels, memory objects, command queues, and events.</p>
 * 
 * <p>It is very easy for an application to lose track of what objects it has created but not yet fully released. Forgetting to fully release an object after
 * use may result in undesirable behaviour, such as increased memory use or even command scheduler lockup. This problem gets much worse when new objects
 * leak each time through an application loop.</p>
 * 
 * <p>This extension defines two runtime API methods.</p>
 * 
 * <p>The first method specifies a future interest in enumerating all the live objects in the runtime API. Live object tracking is a debugging feature which
 * may increase memory use and runtime of the application. So it should be explicitly requested.</p>
 * 
 * <p>Ideally, the request to begin tracking live objects should occur as early as possible in the program, so that no leaked objects escape undetected.</p>
 * 
 * <p>The second method requests an enumeration of those objects via a callback mechanism.</p>
 */
public class ALTERALiveObjectTracking {

    protected ALTERALiveObjectTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ clTrackLiveObjectsAltera ] ---

    /**
     * Registers a future interest in enumerating all the live objects in the runtime API. Registering such an interest may itself increase memory use and
     * runtime, which is why is must be explicitly requested.
     * 
     * <p>Behaviour is unspecified if the {@code clTrackLiveObjectsAltera} method is called before the the first call to {@link CL10#clGetPlatformIDs GetPlatformIDs}.</p>
     *
     * @param platform the platform ID
     */
    public static void clTrackLiveObjectsAltera(@NativeType("cl_platform_id") long platform) {
        long __functionAddress = CL.getICD().clTrackLiveObjectsAltera;
        if (CHECKS) {
            check(__functionAddress);
            check(platform);
        }
        callPV(platform, __functionAddress);
    }

    // --- [ clReportLiveObjectsAltera ] ---

    /** Unsafe version of: {@link #clReportLiveObjectsAltera ReportLiveObjectsAltera} */
    public static void nclReportLiveObjectsAltera(long platform, long report_fn, long user_data) {
        long __functionAddress = CL.getICD().clReportLiveObjectsAltera;
        if (CHECKS) {
            check(__functionAddress);
            check(platform);
            check(user_data);
        }
        callPPPV(platform, report_fn, user_data, __functionAddress);
    }

    /**
     * Requests an enumeration of all live objects in the runtime. The enumeration is performed by calling the callback function once for each live object in
     * some implementation-defined sequence (i.e. not concurrently).
     *
     * @param platform  the platform for which live objects are being tracked
     * @param report_fn the callback function
     * @param user_data a pointer to user data that will be passed to {@code report_fn}
     */
    public static void clReportLiveObjectsAltera(@NativeType("cl_platform_id") long platform, @NativeType("void (*) (void *, void *, char const *, cl_uint)") CLReportLiveObjectsAlteraCallbackI report_fn, @NativeType("void *") long user_data) {
        nclReportLiveObjectsAltera(platform, report_fn.address(), user_data);
    }

}