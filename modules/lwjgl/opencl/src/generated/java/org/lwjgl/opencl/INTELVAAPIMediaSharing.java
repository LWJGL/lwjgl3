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

public class INTELVAAPIMediaSharing {

    public static final int CL_VA_API_DISPLAY_INTEL = 0x4094;

    public static final int
        CL_PREFERRED_DEVICES_FOR_VA_API_INTEL = 0x4095,
        CL_ALL_DEVICES_FOR_VA_API_INTEL       = 0x4096;

    public static final int CL_CONTEXT_VA_API_DISPLAY_INTEL = 0x4097;

    public static final int CL_MEM_VA_API_MEDIA_SURFACE_INTEL = 0x4098;

    public static final int CL_IMAGE_VA_API_PLANE_INTEL = 0x4099;

    public static final int
        CL_COMMAND_ACQUIRE_VA_API_MEDIA_SURFACES_INTEL = 0x409A,
        CL_COMMAND_RELEASE_VA_API_MEDIA_SURFACES_INTEL = 0x409B;

    public static final int CL_INVALID_VA_API_MEDIA_ADAPTER_INTEL = -1098;

    public static final int CL_INVALID_VA_API_MEDIA_SURFACE_INTEL = -1099;

    public static final int CL_VA_API_MEDIA_SURFACE_ALREADY_ACQUIRED_INTEL = -1100;

    public static final int CL_VA_API_MEDIA_SURFACE_NOT_ACQUIRED_INTEL = -1101;

    protected INTELVAAPIMediaSharing() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetDeviceIDsFromVA_APIMediaAdapterINTEL ] ---

    /** {@code cl_int clGetDeviceIDsFromVA_APIMediaAdapterINTEL(cl_platform_id platform, cl_va_api_device_source_intel media_adapter_type, void * media_adapter, cl_va_api_device_set_intel media_adapter_set, cl_uint num_entries, cl_device_id * devices, cl_uint * num_devices)} */
    public static int nclGetDeviceIDsFromVA_APIMediaAdapterINTEL(long platform, int media_adapter_type, long media_adapter, int media_adapter_set, int num_entries, long devices, long num_devices) {
        long __functionAddress = CL.getICD().clGetDeviceIDsFromVA_APIMediaAdapterINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(platform);
            check(media_adapter);
        }
        return callPPPPI(platform, media_adapter_type, media_adapter, media_adapter_set, num_entries, devices, num_devices, __functionAddress);
    }

    /** {@code cl_int clGetDeviceIDsFromVA_APIMediaAdapterINTEL(cl_platform_id platform, cl_va_api_device_source_intel media_adapter_type, void * media_adapter, cl_va_api_device_set_intel media_adapter_set, cl_uint num_entries, cl_device_id * devices, cl_uint * num_devices)} */
    @NativeType("cl_int")
    public static int clGetDeviceIDsFromVA_APIMediaAdapterINTEL(@NativeType("cl_platform_id") long platform, @NativeType("cl_va_api_device_source_intel") int media_adapter_type, @NativeType("void *") long media_adapter, @NativeType("cl_va_api_device_set_intel") int media_adapter_set, @NativeType("cl_device_id *") @Nullable PointerBuffer devices, @NativeType("cl_uint *") @Nullable IntBuffer num_devices) {
        if (CHECKS) {
            checkSafe(num_devices, 1);
        }
        return nclGetDeviceIDsFromVA_APIMediaAdapterINTEL(platform, media_adapter_type, media_adapter, media_adapter_set, remainingSafe(devices), memAddressSafe(devices), memAddressSafe(num_devices));
    }

    // --- [ clCreateFromVA_APIMediaSurfaceINTEL ] ---

    /** {@code cl_mem clCreateFromVA_APIMediaSurfaceINTEL(cl_context context, cl_mem_flags flags, VASurfaceID * surface, cl_uint plane, cl_int * errcode_ret)} */
    public static long nclCreateFromVA_APIMediaSurfaceINTEL(long context, long flags, long surface, int plane, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromVA_APIMediaSurfaceINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPPP(context, flags, surface, plane, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateFromVA_APIMediaSurfaceINTEL(cl_context context, cl_mem_flags flags, VASurfaceID * surface, cl_uint plane, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateFromVA_APIMediaSurfaceINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("VASurfaceID *") IntBuffer surface, @NativeType("cl_uint") int plane, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            check(surface, 1);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateFromVA_APIMediaSurfaceINTEL(context, flags, memAddress(surface), plane, memAddressSafe(errcode_ret));
    }

    // --- [ clEnqueueAcquireVA_APIMediaSurfacesINTEL ] ---

    /** {@code cl_int clEnqueueAcquireVA_APIMediaSurfacesINTEL(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueAcquireVA_APIMediaSurfacesINTEL(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueAcquireVA_APIMediaSurfacesINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPI(command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueAcquireVA_APIMediaSurfacesINTEL(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueAcquireVA_APIMediaSurfacesINTEL(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueAcquireVA_APIMediaSurfacesINTEL(command_queue, mem_objects.remaining(), memAddress(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueReleaseVA_APIMediaSurfacesINTEL ] ---

    /** {@code cl_int clEnqueueReleaseVA_APIMediaSurfacesINTEL(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueReleaseVA_APIMediaSurfacesINTEL(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueReleaseVA_APIMediaSurfacesINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPI(command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueReleaseVA_APIMediaSurfacesINTEL(cl_command_queue command_queue, cl_uint num_objects, cl_mem const * mem_objects, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReleaseVA_APIMediaSurfacesINTEL(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReleaseVA_APIMediaSurfacesINTEL(command_queue, mem_objects.remaining(), memAddress(mem_objects), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clGetDeviceIDsFromVA_APIMediaAdapterINTEL(cl_platform_id platform, cl_va_api_device_source_intel media_adapter_type, void * media_adapter, cl_va_api_device_set_intel media_adapter_set, cl_uint num_entries, cl_device_id * devices, cl_uint * num_devices)} */
    @NativeType("cl_int")
    public static int clGetDeviceIDsFromVA_APIMediaAdapterINTEL(@NativeType("cl_platform_id") long platform, @NativeType("cl_va_api_device_source_intel") int media_adapter_type, @NativeType("void *") long media_adapter, @NativeType("cl_va_api_device_set_intel") int media_adapter_set, @NativeType("cl_device_id *") @Nullable PointerBuffer devices, @NativeType("cl_uint *") int @Nullable [] num_devices) {
        long __functionAddress = CL.getICD().clGetDeviceIDsFromVA_APIMediaAdapterINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(platform);
            check(media_adapter);
            checkSafe(num_devices, 1);
        }
        return callPPPPI(platform, media_adapter_type, media_adapter, media_adapter_set, remainingSafe(devices), memAddressSafe(devices), num_devices, __functionAddress);
    }

    /** {@code cl_mem clCreateFromVA_APIMediaSurfaceINTEL(cl_context context, cl_mem_flags flags, VASurfaceID * surface, cl_uint plane, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateFromVA_APIMediaSurfaceINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("VASurfaceID *") int[] surface, @NativeType("cl_uint") int plane, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromVA_APIMediaSurfaceINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(surface, 1);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPP(context, flags, surface, plane, errcode_ret, __functionAddress);
    }

}