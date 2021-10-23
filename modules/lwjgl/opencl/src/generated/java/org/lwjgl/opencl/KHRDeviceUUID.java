/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <strong>khr_device_uuid</strong> extension.
 * 
 * <p>This extension adds the ability to query a universally unique identifier (UUID) for an OpenCL driver and OpenCL device. The UUIDs returned by the query
 * may be used to identify drivers and devices across processes or APIs.</p>
 */
public final class KHRDeviceUUID {

    public static final int
        CL_UUID_SIZE_KHR = 16,
        CL_LUID_SIZE_KHR = 0x8;

    /**
     * Returns a universally unique identifier (UUID) for the device. ({@code cl_uchar[CL_UUID_SIZE_KHR]})
     * 
     * <p>Device UUIDs must be immutable for a given device across processes, driver APIs, driver versions, and system reboots.</p>
     */
    public static final int CL_DEVICE_UUID_KHR = 0x106A;

    /** Returns a universally unique identifier (UUID) for the software driver for the device. ({@code cl_uchar[CL_UUID_SIZE_KHR]}) */
    public static final int CL_DRIVER_UUID_KHR = 0x106B;

    /** Returns {@link CL10#CL_TRUE TRUE} if the device has a valid LUID and {@link CL10#CL_FALSE FALSE} otherwise. ({@code cl_bool}) */
    public static final int CL_DEVICE_LUID_VALID_KHR = 0x106C;

    /**
     * Returns a locally unique identifier (LUID) for the device. ({@code cl_uchar[CL_LUID_SIZE_KHR]})
     * 
     * <p>It is not an error to query {@code CL_DEVICE_LUID_KHR} when {@link #CL_DEVICE_LUID_VALID_KHR DEVICE_LUID_VALID_KHR} returns {@link CL10#CL_FALSE FALSE}, but in this case the returned LUID value is
     * undefined.</p>
     * 
     * <p>When {@code CL_DEVICE_LUID_VALID_KHR} returns {@link CL10#CL_TRUE TRUE}, and the OpenCL device is running on the Windows operating system, the returned LUID value can be
     * cast to an LUID object and must be equal to the locally unique identifier of an {@code IDXGIAdapter1} object that corresponds to the OpenCL device.</p>
     */
    public static final int CL_DEVICE_LUID_KHR = 0x106D;

    /**
     * Returns a node mask for the device. ({@code cl_uint})
     * 
     * <p>It is not an error to query {@code CL_DEVICE_NODE_MASK_KHR} when {@link #CL_DEVICE_LUID_VALID_KHR DEVICE_LUID_VALID_KHR} returns {@link CL10#CL_FALSE FALSE}, but in this case the returned node mask is
     * undefined.</p>
     * 
     * <p>When {@code CL_DEVICE_LUID_VALID_KHR} returns {@link CL10#CL_TRUE TRUE}, the returned node mask must contain exactly one bit. If the OpenCL device is running on an
     * operating system that supports the Direct3D 12 API and the OpenCL device corresponds to an individual device in a linked device adapter, the returned
     * node mask identifies the Direct3D 12 node corresponding to the OpenCL device. Otherwise, the returned node mask must be 1.</p>
     */
    public static final int CL_DEVICE_NODE_MASK_KHR = 0x106E;

    private KHRDeviceUUID() {}

}