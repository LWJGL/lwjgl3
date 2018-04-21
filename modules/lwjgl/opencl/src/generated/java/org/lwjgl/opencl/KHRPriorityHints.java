/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <strong>khr_priority_hints</strong> extension.
 * 
 * <p>This extension adds priority hints for OpenCL, but does not specify the scheduling behavior or minimum guarantees. It is expected that the the user
 * guides associated with each implementation which supports this extension describe the scheduling behavior guaranteed.</p>
 */
public final class KHRPriorityHints {

    /** cl_command_queue_properties */
    public static final int CL_QUEUE_PRIORITY_KHR = 0x1096;

    /** cl_queue_priority_khr */
    public static final int
        CL_QUEUE_PRIORITY_HIGH_KHR = (1<<0),
        CL_QUEUE_PRIORITY_MED_KHR  = (1<<1),
        CL_QUEUE_PRIORITY_LOW_KHR  = (1<<2);

    private KHRPriorityHints() {}

}