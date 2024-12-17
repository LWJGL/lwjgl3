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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHREGLImage {

    public static final int
        CL_EGL_RESOURCE_NOT_ACQUIRED_KHR = -1092,
        CL_INVALID_EGL_OBJECT_KHR        = -1093;

    public static final int
        CL_COMMAND_ACQUIRE_EGL_OBJECTS_KHR = 0x202D,
        CL_COMMAND_RELEASE_EGL_OBJECTS_KHR = 0x202E;

    protected KHREGLImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateFromEGLImageKHR ] ---

    /** {@code cl_mem clCreateFromEGLImageKHR(cl_context context, CLeglDisplayKHR display, CLeglImageKHR image, cl_mem_flags flags, cl_egl_image_properties_khr const * properties, cl_int * errcode_ret)} */
    public static long nclCreateFromEGLImageKHR(long context, long display, long image, long flags, long properties, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromEGLImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(display);
            check(image);
        }
        return callPPPJPPP(context, display, image, flags, properties, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateFromEGLImageKHR(cl_context context, CLeglDisplayKHR display, CLeglImageKHR image, cl_mem_flags flags, cl_egl_image_properties_khr const * properties, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateFromEGLImageKHR(@NativeType("cl_context") long context, @NativeType("CLeglDisplayKHR") long display, @NativeType("CLeglImageKHR") long image, @NativeType("cl_mem_flags") long flags, @NativeType("cl_egl_image_properties_khr const *") @Nullable PointerBuffer properties, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateFromEGLImageKHR(context, display, image, flags, memAddressSafe(properties), memAddressSafe(errcode_ret));
    }

    // --- [ clEnqueueAcquireEGLObjectsKHR ] ---

    /** {@code cl_int clEnqueueAcquireEGLObjectsKHR(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueAcquireEGLObjectsKHR(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueAcquireEGLObjectsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPI(command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueAcquireEGLObjectsKHR(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueAcquireEGLObjectsKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueAcquireEGLObjectsKHR(command_queue, mem_objects.remaining(), memAddress(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueReleaseEGLObjectsKHR ] ---

    /** {@code cl_int clEnqueueReleaseEGLObjectsKHR(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueReleaseEGLObjectsKHR(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueReleaseEGLObjectsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPI(command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueReleaseEGLObjectsKHR(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReleaseEGLObjectsKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReleaseEGLObjectsKHR(command_queue, mem_objects.remaining(), memAddress(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueReleaseEGLObjectsKHR(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReleaseEGLObjectsKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") long mem_object, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer mem_objects = stack.pointers(mem_object);
            return nclEnqueueReleaseEGLObjectsKHR(command_queue, 1, memAddress(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code cl_mem clCreateFromEGLImageKHR(cl_context context, CLeglDisplayKHR display, CLeglImageKHR image, cl_mem_flags flags, cl_egl_image_properties_khr const * properties, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateFromEGLImageKHR(@NativeType("cl_context") long context, @NativeType("CLeglDisplayKHR") long display, @NativeType("CLeglImageKHR") long image, @NativeType("cl_mem_flags") long flags, @NativeType("cl_egl_image_properties_khr const *") @Nullable PointerBuffer properties, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromEGLImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(display);
            check(image);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPPJPPP(context, display, image, flags, memAddressSafe(properties), errcode_ret, __functionAddress);
    }

}