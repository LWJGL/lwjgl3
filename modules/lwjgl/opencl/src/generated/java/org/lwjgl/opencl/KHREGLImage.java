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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/khr/cl_khr_egl_image.txt">khr_egl_image</a> extension.
 * 
 * <p>This extension provides a mechanism for creating derived resources, such as OpenCL image objects, from {@code EGLImages}.</p>
 */
public class KHREGLImage {

    /** Error Codes */
    public static final int
        CL_EGL_RESOURCE_NOT_ACQUIRED_KHR = -1092,
        CL_INVALID_EGL_OBJECT_KHR        = -1093;

    /** Command types. */
    public static final int
        CL_COMMAND_ACQUIRE_EGL_OBJECTS_KHR = 0x202D,
        CL_COMMAND_RELEASE_EGL_OBJECTS_KHR = 0x202E;

    protected KHREGLImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateFromEGLImageKHR ] ---

    /** Unsafe version of: {@link #clCreateFromEGLImageKHR CreateFromEGLImageKHR} */
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

    /**
     * Creates an {@code EGLImage} target of type {@code cl_mem} from the {@code EGLImage} source provided as {@code image}.
     *
     * @param display     an {@code EGLDisplay}
     * @param image       an {@code EGLImageKHR}
     * @param flags       a bit-field that is used to specify usage information about the memory object being created
     * @param properties  a list of property names and their corresponding values
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     */
    @NativeType("cl_mem")
    public static long clCreateFromEGLImageKHR(@NativeType("cl_context") long context, @NativeType("CLeglDisplayKHR") long display, @NativeType("CLeglImageKHR") long image, @NativeType("cl_mem_flags") long flags, @Nullable @NativeType("cl_egl_image_properties_khr const *") PointerBuffer properties, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateFromEGLImageKHR(context, display, image, flags, memAddressSafe(properties), memAddressSafe(errcode_ret));
    }

    // --- [ clEnqueueAcquireEGLObjectsKHR ] ---

    /**
     * Unsafe version of: {@link #clEnqueueAcquireEGLObjectsKHR EnqueueAcquireEGLObjectsKHR}
     *
     * @param num_objects             the number of memory objects to be acquired in {@code mem_objects}
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueAcquireEGLObjectsKHR(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueAcquireEGLObjectsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPI(command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Acquires OpenCL memory objects that have been created from EGL resources. The EGL objects are acquired by the OpenCL context associated with
     * {@code command_queue} and can therefore be used by all command-queues associated with the OpenCL context.
     *
     * @param command_queue   a valid command-queue
     * @param mem_objects     a pointer to a list of OpenCL memory objects that were created from EGL resources, within the context associated with {@code command_queue}
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     */
    @NativeType("cl_int")
    public static int clEnqueueAcquireEGLObjectsKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueAcquireEGLObjectsKHR(command_queue, mem_objects.remaining(), memAddress(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueReleaseEGLObjectsKHR ] ---

    /**
     * Unsafe version of: {@link #clEnqueueReleaseEGLObjectsKHR EnqueueReleaseEGLObjectsKHR}
     *
     * @param num_objects             the number of memory objects to be released in {@code mem_objects}
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueReleaseEGLObjectsKHR(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueReleaseEGLObjectsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPI(command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Releases OpenCL memory objects that have been created from EGL resources. The EGL objects are released by the OpenCL context associated with
     * {@code command_queue}.
     *
     * @param command_queue   a valid command-queue
     * @param mem_objects     a pointer to a list of OpenCL memory objects that were created from EGL resources, within the context associated with {@code command_queue}
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     */
    @NativeType("cl_int")
    public static int clEnqueueReleaseEGLObjectsKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReleaseEGLObjectsKHR(command_queue, mem_objects.remaining(), memAddress(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Releases OpenCL memory objects that have been created from EGL resources. The EGL objects are released by the OpenCL context associated with
     * {@code command_queue}.
     *
     * @param command_queue   a valid command-queue
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     */
    @NativeType("cl_int")
    public static int clEnqueueReleaseEGLObjectsKHR(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") long mem_object, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
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

    /** Array version of: {@link #clCreateFromEGLImageKHR CreateFromEGLImageKHR} */
    @NativeType("cl_mem")
    public static long clCreateFromEGLImageKHR(@NativeType("cl_context") long context, @NativeType("CLeglDisplayKHR") long display, @NativeType("CLeglImageKHR") long image, @NativeType("cl_mem_flags") long flags, @Nullable @NativeType("cl_egl_image_properties_khr const *") PointerBuffer properties, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
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