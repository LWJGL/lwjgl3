/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <strong>khr_throttle_hints</strong> extension.
 * 
 * <p>This extension adds throttle hints for OpenCL, but does not specify the throttling behaviour or minimum guarantees. It is expected that the user guide
 * associated with each implementation which supports this extension describe the throttling behaviour guaranteed.</p>
 */
public final class KHRThrottleHints {

    /** cl_command_queue_properties */
    public static final int CL_QUEUE_THROTTLE_KHR = 0x1097;

    /** cl_queue_throttle_khr */
    public static final int
        CL_QUEUE_THROTTLE_HIGH_KHR = (1<<0),
        CL_QUEUE_THROTTLE_MED_KHR  = (1<<1),
        CL_QUEUE_THROTTLE_LOW_KHR  = (1<<2);

    private KHRThrottleHints() {}

}