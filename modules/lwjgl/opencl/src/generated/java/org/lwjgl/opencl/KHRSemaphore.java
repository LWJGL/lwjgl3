/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

public class KHRSemaphore {

    public static final int CL_PLATFORM_SEMAPHORE_TYPES_KHR = 0x2036;

    public static final int CL_DEVICE_SEMAPHORE_TYPES_KHR = 0x204C;

    public static final int CL_SEMAPHORE_TYPE_BINARY_KHR = 1;

    public static final int
        CL_SEMAPHORE_CONTEXT_KHR         = 0x2039,
        CL_SEMAPHORE_REFERENCE_COUNT_KHR = 0x203A,
        CL_SEMAPHORE_PROPERTIES_KHR      = 0x203B,
        CL_SEMAPHORE_PAYLOAD_KHR         = 0x203C;

    public static final int
        CL_SEMAPHORE_TYPE_KHR         = 0x203D,
        CL_DEVICE_HANDLE_LIST_KHR     = 0x2051,
        CL_DEVICE_HANDLE_LIST_END_KHR = 0;

    public static final int
        CL_COMMAND_SEMAPHORE_WAIT_KHR   = 0x2042,
        CL_COMMAND_SEMAPHORE_SIGNAL_KHR = 0x2043;

    public static final int CL_INVALID_SEMAPHORE_KHR = -1142;

    protected KHRSemaphore() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateSemaphoreWithPropertiesKHR ] ---

    /** {@code cl_semaphore_khr clCreateSemaphoreWithPropertiesKHR(cl_context context, cl_semaphore_properties_khr const * sema_props, cl_int * errcode_ret)} */
    public static long nclCreateSemaphoreWithPropertiesKHR(long context, long sema_props, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateSemaphoreWithPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPP(context, sema_props, errcode_ret, __functionAddress);
    }

    /** {@code cl_semaphore_khr clCreateSemaphoreWithPropertiesKHR(cl_context context, cl_semaphore_properties_khr const * sema_props, cl_int * errcode_ret)} */
    @NativeType("cl_semaphore_khr")
    public static long clCreateSemaphoreWithPropertiesKHR(@NativeType("cl_context") long context, @NativeType("cl_semaphore_properties_khr const *") LongBuffer sema_props, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNT(sema_props);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateSemaphoreWithPropertiesKHR(context, memAddress(sema_props), memAddressSafe(errcode_ret));
    }

    // --- [ clEnqueueWaitSemaphoresKHR ] ---

    /** {@code cl_int clEnqueueWaitSemaphoresKHR(cl_command_queue command_queue, cl_uint num_sema_objects, cl_semaphore_khr const * sema_objects, cl_semaphore_payload_khr const * sema_payload_list, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueWaitSemaphoresKHR(long command_queue, int num_sema_objects, long sema_objects, long sema_payload_list, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueWaitSemaphoresKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPPI(command_queue, num_sema_objects, sema_objects, sema_payload_list, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueWaitSemaphoresKHR(cl_command_queue command_queue, cl_uint num_sema_objects, cl_semaphore_khr const * sema_objects, cl_semaphore_payload_khr const * sema_payload_list, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWaitSemaphoresKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_semaphore_khr const *") PointerBuffer sema_objects, @NativeType("cl_semaphore_payload_khr const *") @Nullable LongBuffer sema_payload_list, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueWaitSemaphoresKHR(command_queue, sema_objects.remaining(), memAddress(sema_objects), memAddressSafe(sema_payload_list), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueSignalSemaphoresKHR ] ---

    /** {@code cl_int clEnqueueSignalSemaphoresKHR(cl_command_queue command_queue, cl_uint num_sema_objects, cl_semaphore_khr const * sema_objects, cl_semaphore_payload_khr const * sema_payload_list, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueSignalSemaphoresKHR(long command_queue, int num_sema_objects, long sema_objects, long sema_payload_list, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueSignalSemaphoresKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPPI(command_queue, num_sema_objects, sema_objects, sema_payload_list, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueSignalSemaphoresKHR(cl_command_queue command_queue, cl_uint num_sema_objects, cl_semaphore_khr const * sema_objects, cl_semaphore_payload_khr const * sema_payload_list, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueSignalSemaphoresKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_semaphore_khr const *") PointerBuffer sema_objects, @NativeType("cl_semaphore_payload_khr const *") LongBuffer sema_payload_list, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueSignalSemaphoresKHR(command_queue, sema_objects.remaining(), memAddress(sema_objects), memAddress(sema_payload_list), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clGetSemaphoreInfoKHR ] ---

    /** {@code cl_int clGetSemaphoreInfoKHR(cl_semaphore_khr sema_object, cl_semaphore_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetSemaphoreInfoKHR(long sema_object, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetSemaphoreInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(sema_object);
        }
        return callPPPPI(sema_object, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetSemaphoreInfoKHR(cl_semaphore_khr sema_object, cl_semaphore_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetSemaphoreInfoKHR(@NativeType("cl_semaphore_khr") long sema_object, @NativeType("cl_semaphore_info_khr") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSemaphoreInfoKHR(sema_object, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetSemaphoreInfoKHR(cl_semaphore_khr sema_object, cl_semaphore_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetSemaphoreInfoKHR(@NativeType("cl_semaphore_khr") long sema_object, @NativeType("cl_semaphore_info_khr") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSemaphoreInfoKHR(sema_object, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetSemaphoreInfoKHR(cl_semaphore_khr sema_object, cl_semaphore_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetSemaphoreInfoKHR(@NativeType("cl_semaphore_khr") long sema_object, @NativeType("cl_semaphore_info_khr") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSemaphoreInfoKHR(sema_object, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clReleaseSemaphoreKHR ] ---

    /** {@code cl_int clReleaseSemaphoreKHR(cl_semaphore_khr sema_object)} */
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

    /** {@code cl_int clRetainSemaphoreKHR(cl_semaphore_khr sema_object)} */
    @NativeType("cl_int")
    public static int clRetainSemaphoreKHR(@NativeType("cl_semaphore_khr") long sema_object) {
        long __functionAddress = CL.getICD().clRetainSemaphoreKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(sema_object);
        }
        return callPI(sema_object, __functionAddress);
    }

    /** {@code cl_semaphore_khr clCreateSemaphoreWithPropertiesKHR(cl_context context, cl_semaphore_properties_khr const * sema_props, cl_int * errcode_ret)} */
    @NativeType("cl_semaphore_khr")
    public static long clCreateSemaphoreWithPropertiesKHR(@NativeType("cl_context") long context, @NativeType("cl_semaphore_properties_khr const *") long[] sema_props, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateSemaphoreWithPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNT(sema_props);
            checkSafe(errcode_ret, 1);
        }
        return callPPPP(context, sema_props, errcode_ret, __functionAddress);
    }

    /** {@code cl_int clEnqueueWaitSemaphoresKHR(cl_command_queue command_queue, cl_uint num_sema_objects, cl_semaphore_khr const * sema_objects, cl_semaphore_payload_khr const * sema_payload_list, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWaitSemaphoresKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_semaphore_khr const *") PointerBuffer sema_objects, @NativeType("cl_semaphore_payload_khr const *") long @Nullable [] sema_payload_list, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWaitSemaphoresKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            checkSafe(event, 1);
        }
        return callPPPPPI(command_queue, sema_objects.remaining(), memAddress(sema_objects), sema_payload_list, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueSignalSemaphoresKHR(cl_command_queue command_queue, cl_uint num_sema_objects, cl_semaphore_khr const * sema_objects, cl_semaphore_payload_khr const * sema_payload_list, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueSignalSemaphoresKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_semaphore_khr const *") PointerBuffer sema_objects, @NativeType("cl_semaphore_payload_khr const *") long[] sema_payload_list, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueSignalSemaphoresKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            checkSafe(event, 1);
        }
        return callPPPPPI(command_queue, sema_objects.remaining(), memAddress(sema_objects), sema_payload_list, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clGetSemaphoreInfoKHR(cl_semaphore_khr sema_object, cl_semaphore_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetSemaphoreInfoKHR(@NativeType("cl_semaphore_khr") long sema_object, @NativeType("cl_semaphore_info_khr") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetSemaphoreInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(sema_object);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(sema_object, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

}