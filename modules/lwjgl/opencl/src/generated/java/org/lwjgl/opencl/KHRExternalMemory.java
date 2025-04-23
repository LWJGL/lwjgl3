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

public class KHRExternalMemory {

    public static final int CL_PLATFORM_EXTERNAL_MEMORY_IMPORT_HANDLE_TYPES_KHR = 0x2044;

    public static final int
        CL_DEVICE_EXTERNAL_MEMORY_IMPORT_HANDLE_TYPES_KHR                      = 0x204F,
        CL_DEVICE_EXTERNAL_MEMORY_IMPORT_ASSUME_LINEAR_IMAGES_HANDLE_TYPES_KHR = 0x2052;

    public static final int
        CL_MEM_DEVICE_HANDLE_LIST_KHR     = 0x2051,
        CL_MEM_DEVICE_HANDLE_LIST_END_KHR = 0;

    public static final int
        CL_COMMAND_ACQUIRE_EXTERNAL_MEM_OBJECTS_KHR = 0x2047,
        CL_COMMAND_RELEASE_EXTERNAL_MEM_OBJECTS_KHR = 0x2048;

    protected KHRExternalMemory() {
        throw new UnsupportedOperationException();
    }

    // --- [ clEnqueueAcquireExternalMemObjectsKHR ] ---

    /** {@code cl_int clEnqueueAcquireExternalMemObjectsKHR(cl_command_queue command_queue, cl_uint num_mem_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueAcquireExternalMemObjectsKHR(long command_queue, int num_mem_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueAcquireExternalMemObjectsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPI(command_queue, num_mem_objects, mem_objects, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueAcquireExternalMemObjectsKHR(cl_command_queue command_queue, cl_uint num_mem_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueAcquireExternalMemObjectsKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueAcquireExternalMemObjectsKHR(command_queue, mem_objects.remaining(), memAddress(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueReleaseExternalMemObjectsKHR ] ---

    /** {@code cl_int clEnqueueReleaseExternalMemObjectsKHR(cl_command_queue command_queue, cl_uint num_mem_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueReleaseExternalMemObjectsKHR(long command_queue, int num_mem_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueReleaseExternalMemObjectsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPI(command_queue, num_mem_objects, mem_objects, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueReleaseExternalMemObjectsKHR(cl_command_queue command_queue, cl_uint num_mem_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReleaseExternalMemObjectsKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReleaseExternalMemObjectsKHR(command_queue, mem_objects.remaining(), memAddress(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

}