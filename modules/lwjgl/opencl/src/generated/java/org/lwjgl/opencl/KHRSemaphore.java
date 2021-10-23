/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to the <strong>khr_semaphore</strong> extension.
 * 
 * <p>OpenCL provides {@code cl_event} as a primary mechanism of synchronization between host and device as well as across devices. While events can be
 * waited on or can be passed as dependencies across work-submissions, they suffer from following limitations:</p>
 * 
 * <ul>
 * <li>They are immutable.</li>
 * <li>They are not reusable.</li>
 * </ul>
 * 
 * <p>This extension introduces a new type of synchronization object to represent semaphores that can be reused, waited on, and signaled multiple times by
 * OpenCL work-submissions.</p>
 * 
 * <p>In particular, this extension defines:</p>
 * 
 * <ul>
 * <li>A new type called {@code cl_semaphore_khr} to represent the semaphore objects.</li>
 * <li>A new type called {@code cl_semaphore_properties_khr} to specify metadata associated with semaphores.</li>
 * <li>Routines to create, retain, and release semaphores.</li>
 * <li>Routines to wait on and signal semaphore objects.</li>
 * <li>Routine to query the properties of semaphore objects.</li>
 * </ul>
 * 
 * <p>Requires {@link CL12 CL12}.</p>
 */
public class KHRSemaphore {

    /** Accepted value for the {@code param_name} parameter to {@link CL10#clGetPlatformInfo GetPlatformInfo} to query the semaphore types supported by an OpenCL platform. */
    public static final int CL_PLATFORM_SEMAPHORE_TYPES_KHR = 0x2036;

    /** Accepted value for the {@code param_name} parameter to {@link CL10#clGetDeviceInfo GetDeviceInfo} to query the semaphore types supported by an OpenCL device. */
    public static final int CL_DEVICE_SEMAPHORE_TYPES_KHR = 0x204C;

    /** Semaphore types. */
    public static final int CL_SEMAPHORE_TYPE_BINARY_KHR = 1;

    /** New attributes that can be passed as part of {@code cl_semaphore_info_khr}. */
    public static final int
        CL_SEMAPHORE_CONTEXT_KHR         = 0x2039,
        CL_SEMAPHORE_REFERENCE_COUNT_KHR = 0x203A,
        CL_SEMAPHORE_PROPERTIES_KHR      = 0x203B,
        CL_SEMAPHORE_PAYLOAD_KHR         = 0x203C;

    /** New attributes that can be passed as part of {@code cl_semaphore_info_khr} or {@code cl_semaphore_properties_khr}. */
    public static final int
        CL_SEMAPHORE_TYPE_KHR         = 0x203D,
        CL_DEVICE_HANDLE_LIST_KHR     = 0x2051,
        CL_DEVICE_HANDLE_LIST_END_KHR = 0;

    /** New return values from {@link CL10#clGetEventInfo GetEventInfo} when {@code param_name} is {@link CL10#CL_EVENT_COMMAND_TYPE EVENT_COMMAND_TYPE}. */
    public static final int
        CL_COMMAND_SEMAPHORE_WAIT_KHR   = 0x2042,
        CL_COMMAND_SEMAPHORE_SIGNAL_KHR = 0x2043;

    /** The following error codes can be returned by APIs introduced as part of this specification or the specifications that depend on this. */
    public static final int CL_INVALID_SEMAPHORE_KHR = -1142;

    protected KHRSemaphore() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateSemaphoreWithPropertiesKHR ] ---

    /** Unsafe version of: {@link #clCreateSemaphoreWithPropertiesKHR CreateSemaphoreWithPropertiesKHR} */
    public static long nclCreateSemaphoreWithPropertiesKHR(long context, long sema_props, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateSemaphoreWithPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPP(context, sema_props, errcode_ret, __functionAddress);
    }

    /** @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned. */
    @NativeType("cl_semaphore_khr")
    public static long clCreateSemaphoreWithPropertiesKHR(@NativeType("cl_context") long context, @NativeType("cl_semaphore_properties_khr const *") LongBuffer sema_props, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNT(sema_props);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateSemaphoreWithPropertiesKHR(context, memAddress(sema_props), memAddressSafe(errcode_ret));
    }

    // --- [ clEnqueueWaitSemaphoresKHR ] ---

    /**
     * Unsafe version of: {@link #clEnqueueWaitSemaphoresKHR EnqueueWaitSemaphoresKHR}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueWaitSemaphoresKHR(long command_queue, int num_sema_objects, long sema_objects, long sema_payload_list, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueWaitSemaphoresKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPPI(command_queue, num_sema_objects, sema_objects, sema_payload_list, num_events_in_wait_list, event_wait_list, event, __functionAddress);
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
    public static int clEnqueueWaitSemaphoresKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_semaphore_khr const *") PointerBuffer sema_objects, @Nullable @NativeType("cl_semaphore_payload_khr const *") LongBuffer sema_payload_list, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueWaitSemaphoresKHR(command_queue, sema_objects.remaining(), memAddress(sema_objects), memAddressSafe(sema_payload_list), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueSignalSemaphoresKHR ] ---

    /**
     * Unsafe version of: {@link #clEnqueueSignalSemaphoresKHR EnqueueSignalSemaphoresKHR}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueSignalSemaphoresKHR(long command_queue, int num_sema_objects, long sema_objects, long sema_payload_list, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueSignalSemaphoresKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPPI(command_queue, num_sema_objects, sema_objects, sema_payload_list, num_events_in_wait_list, event_wait_list, event, __functionAddress);
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
    public static int clEnqueueSignalSemaphoresKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_semaphore_khr const *") PointerBuffer sema_objects, @NativeType("cl_semaphore_payload_khr const *") LongBuffer sema_payload_list, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueSignalSemaphoresKHR(command_queue, sema_objects.remaining(), memAddress(sema_objects), memAddress(sema_payload_list), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clGetSemaphoreInfoKHR ] ---

    /**
     * Unsafe version of: {@link #clGetSemaphoreInfoKHR GetSemaphoreInfoKHR}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetSemaphoreInfoKHR(long sema_object, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetSemaphoreInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(sema_object);
        }
        return callPPPPI(sema_object, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored. */
    @NativeType("cl_int")
    public static int clGetSemaphoreInfoKHR(@NativeType("cl_semaphore_khr") long sema_object, @NativeType("cl_semaphore_info_khr") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSemaphoreInfoKHR(sema_object, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored. */
    @NativeType("cl_int")
    public static int clGetSemaphoreInfoKHR(@NativeType("cl_semaphore_khr") long sema_object, @NativeType("cl_semaphore_info_khr") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSemaphoreInfoKHR(sema_object, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored. */
    @NativeType("cl_int")
    public static int clGetSemaphoreInfoKHR(@NativeType("cl_semaphore_khr") long sema_object, @NativeType("cl_semaphore_info_khr") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSemaphoreInfoKHR(sema_object, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clReleaseSemaphoreKHR ] ---

    @NativeType("cl_int")
    public static int clReleaseSemaphoreKHR(@NativeType("cl_semaphore_khr") long sema_object) {
        long __functionAddress = CL.getICD().clReleaseSemaphoreKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(sema_object);
        }
        return callPI(sema_object, __functionAddress);
    }

    // --- [ clRetainSemaphoreKHR ] ---

    @NativeType("cl_int")
    public static int clRetainSemaphoreKHR(@NativeType("cl_semaphore_khr") long sema_object) {
        long __functionAddress = CL.getICD().clRetainSemaphoreKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(sema_object);
        }
        return callPI(sema_object, __functionAddress);
    }

    /** Array version of: {@link #clCreateSemaphoreWithPropertiesKHR CreateSemaphoreWithPropertiesKHR} */
    @NativeType("cl_semaphore_khr")
    public static long clCreateSemaphoreWithPropertiesKHR(@NativeType("cl_context") long context, @NativeType("cl_semaphore_properties_khr const *") long[] sema_props, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateSemaphoreWithPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNT(sema_props);
            checkSafe(errcode_ret, 1);
        }
        return callPPPP(context, sema_props, errcode_ret, __functionAddress);
    }

    /** Array version of: {@link #clEnqueueWaitSemaphoresKHR EnqueueWaitSemaphoresKHR} */
    @NativeType("cl_int")
    public static int clEnqueueWaitSemaphoresKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_semaphore_khr const *") PointerBuffer sema_objects, @Nullable @NativeType("cl_semaphore_payload_khr const *") long[] sema_payload_list, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWaitSemaphoresKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            checkSafe(event, 1);
        }
        return callPPPPPI(command_queue, sema_objects.remaining(), memAddress(sema_objects), sema_payload_list, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** Array version of: {@link #clEnqueueSignalSemaphoresKHR EnqueueSignalSemaphoresKHR} */
    @NativeType("cl_int")
    public static int clEnqueueSignalSemaphoresKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_semaphore_khr const *") PointerBuffer sema_objects, @NativeType("cl_semaphore_payload_khr const *") long[] sema_payload_list, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueSignalSemaphoresKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            checkSafe(event, 1);
        }
        return callPPPPPI(command_queue, sema_objects.remaining(), memAddress(sema_objects), sema_payload_list, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** Array version of: {@link #clGetSemaphoreInfoKHR GetSemaphoreInfoKHR} */
    @NativeType("cl_int")
    public static int clGetSemaphoreInfoKHR(@NativeType("cl_semaphore_khr") long sema_object, @NativeType("cl_semaphore_info_khr") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetSemaphoreInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(sema_object);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(sema_object, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

}