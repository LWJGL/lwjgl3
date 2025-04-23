/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class IMGUseGrallocPtr {

    public static final int
        CL_COMMAND_ACQUIRE_GRALLOC_OBJECTS_IMG = 0x40D2,
        CL_COMMAND_RELEASE_GRALLOC_OBJECTS_IMG = 0x40D3;

    public static final int
        CL_GRALLOC_RESOURCE_NOT_ACQUIRED_IMG = 0x40D4,
        CL_INVALID_GRALLOC_OBJECT_IMG        = 0x40D5;

    public static final int CL_MEM_USE_GRALLOC_PTR_IMG = 1 << 28;

    protected IMGUseGrallocPtr() {
        throw new UnsupportedOperationException();
    }

    // --- [ clEnqueueAcquireGrallocObjectsIMG ] ---

    /** {@code cl_int clEnqueueAcquireGrallocObjectsIMG(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueAcquireGrallocObjectsIMG(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueAcquireGrallocObjectsIMG;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPI(command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueAcquireGrallocObjectsIMG(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueAcquireGrallocObjectsIMG(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") @Nullable PointerBuffer mem_objects, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueAcquireGrallocObjectsIMG(command_queue, remainingSafe(mem_objects), memAddressSafe(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueReleaseGrallocObjectsIMG ] ---

    /** {@code cl_int clEnqueueReleaseGrallocObjectsIMG(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueReleaseGrallocObjectsIMG(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueReleaseGrallocObjectsIMG;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPI(command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueReleaseGrallocObjectsIMG(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReleaseGrallocObjectsIMG(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") @Nullable PointerBuffer mem_objects, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReleaseGrallocObjectsIMG(command_queue, remainingSafe(mem_objects), memAddressSafe(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

}