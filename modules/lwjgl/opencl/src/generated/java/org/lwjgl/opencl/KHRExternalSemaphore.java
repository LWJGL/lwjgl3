/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <strong>khr_external_semaphore</strong> extension.
 * 
 * <p>{@code cl_khr_semaphore} introduced semaphores as a new type along with a set of APIs for create, release, retain, wait and signal operations on it.
 * This extension defines APIs and mechanisms to share semaphores created in an external API by importing into and exporting from OpenCL.</p>
 * 
 * <p>This extension defines:</p>
 * 
 * <ul>
 * <li>New attributes that can be passed as part of {@code cl_semaphore_properties_khr} for specifying properties of external semaphores to be imported or
 * exported.</li>
 * <li>New attributes that can be passed as part of {@code cl_semaphore_info_khr} for specifying properties of external semaphores to be exported.</li>
 * <li>An extension to {@link KHRSemaphore#clCreateSemaphoreWithPropertiesKHR CreateSemaphoreWithPropertiesKHR} to accept external semaphore properties allowing to import or export an external semaphore into
 * or from OpenCL.</li>
 * <li>Semaphore handle types required for importing and exporting semaphores.</li>
 * <li>Modifications to Wait and Signal API behavior when dealing with external semaphores created from different handle types.</li>
 * <li>API query exportable semaphores handles using specified handle type.</li>
 * </ul>
 * 
 * <p>Other related extensions define specific external semaphores that may be imported into or exported from OpenCL.</p>
 * 
 * <p>Requires {@link CL12 CL12} and the {@link KHRSemaphore khr_semaphore} extension.</p>
 */
public final class KHRExternalSemaphore {

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

    private KHRExternalSemaphore() {}

}