/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <strong>khr_external_memory</strong> extension.
 * 
 * <p>This extension defines a generic mechanism to share buffer and image objects between OpenCL and many other APIs.</p>
 * 
 * <p>In particular, the {@code cl_khr_external_memory} extension defines:</p>
 * 
 * <ul>
 * <li>Optional properties to import external memory exported by other APIs into OpenCL for a set of devices.</li>
 * <li>Routines to explicitly hand off memory ownership between OpenCL and other APIs.</li>
 * </ul>
 * 
 * <p>Other related extensions define specific external memory types that may be imported into OpenCL.</p>
 * 
 * <p>Requires {@link CL30 CL30}.</p>
 */
public class KHRExternalMemory {

    /**
     * Accepted value for the {@code param_name} parameter to {@link CL10#clGetPlatformInfo GetPlatformInfo} to query external memory handle types that may be imported by all devices in
     * an OpenCL platform.
     */
    public static final int CL_PLATFORM_EXTERNAL_MEMORY_IMPORT_HANDLE_TYPES_KHR = 0x2044;

    /** Accepted value for the {@code param_name} parameter to {@link CL10#clGetDeviceInfo GetDeviceInfo} to query external memory handle types that may be imported by an OpenCL device. */
    public static final int CL_DEVICE_EXTERNAL_MEMORY_IMPORT_HANDLE_TYPES_KHR = 0x204F;

    /** New properties accepted as {@code properties} to {@link CL30#clCreateBufferWithProperties CreateBufferWithProperties} and {@link CL30#clCreateImageWithProperties CreateImageWithProperties}. */
    public static final int
        CL_DEVICE_HANDLE_LIST_KHR     = 0x2051,
        CL_DEVICE_HANDLE_LIST_END_KHR = 0;

    /** New return values from {@link CL10#clGetEventInfo GetEventInfo} when {@code param_name} is {@link CL10#CL_EVENT_COMMAND_TYPE EVENT_COMMAND_TYPE}. */
    public static final int
        CL_COMMAND_ACQUIRE_EXTERNAL_MEM_OBJECTS_KHR = 0x2047,
        CL_COMMAND_RELEASE_EXTERNAL_MEM_OBJECTS_KHR = 0x2048;

    /** External memory handle type added by {@code cl_khr_external_memory_dma_buf}. */
    public static final int CL_EXTERNAL_MEMORY_HANDLE_DMA_BUF_KHR = 0x2067;

    /** External memory handle type added by {@code cl_khr_external_memory_opaque_fd}. */
    public static final int CL_EXTERNAL_MEMORY_HANDLE_OPAQUE_FD_KHR = 0x2060;

    /** External memory handle types added by {@code cl_khr_external_memory_win32}. */
    public static final int
        CL_EXTERNAL_MEMORY_HANDLE_OPAQUE_WIN32_KHR     = 0x2061,
        CL_EXTERNAL_MEMORY_HANDLE_OPAQUE_WIN32_KMT_KHR = 0x2062;

    protected KHRExternalMemory() {
        throw new UnsupportedOperationException();
    }

    // --- [ clEnqueueAcquireExternalMemObjectsKHR ] ---

    /**
     * Unsafe version of: {@link #clEnqueueAcquireExternalMemObjectsKHR EnqueueAcquireExternalMemObjectsKHR}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueAcquireExternalMemObjectsKHR(long command_queue, int num_mem_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueAcquireExternalMemObjectsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPI(command_queue, num_mem_objects, mem_objects, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     */
    @NativeType("cl_int")
    public static int clEnqueueAcquireExternalMemObjectsKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueAcquireExternalMemObjectsKHR(command_queue, mem_objects.remaining(), memAddress(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueReleaseExternalMemObjectsKHR ] ---

    /**
     * Unsafe version of: {@link #clEnqueueReleaseExternalMemObjectsKHR EnqueueReleaseExternalMemObjectsKHR}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueReleaseExternalMemObjectsKHR(long command_queue, int num_mem_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueReleaseExternalMemObjectsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPI(command_queue, num_mem_objects, mem_objects, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     */
    @NativeType("cl_int")
    public static int clEnqueueReleaseExternalMemObjectsKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReleaseExternalMemObjectsKHR(command_queue, mem_objects.remaining(), memAddress(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

}