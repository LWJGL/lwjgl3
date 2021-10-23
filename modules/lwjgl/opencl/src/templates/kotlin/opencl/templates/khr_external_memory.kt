/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_external_memory = "KHRExternalMemory".nativeClassCL("khr_external_memory", KHR) {
    documentation =
        """
        Native bindings to the $extensionName extension.
        
        This extension defines a generic mechanism to share buffer and image objects between OpenCL and many other APIs.

        In particular, the {@code cl_khr_external_memory} extension defines:
        ${ul(
            "Optional properties to import external memory exported by other APIs into OpenCL for a set of devices.",
            "Routines to explicitly hand off memory ownership between OpenCL and other APIs."
        )}

        Other related extensions define specific external memory types that may be imported into OpenCL.

        Requires ${CL30.link}.
        """

    IntConstant(
        """
        Accepted value for the {@code param_name} parameter to #GetPlatformInfo() to query external memory handle types that may be imported by all devices in
        an OpenCL platform.
        """,

        "PLATFORM_EXTERNAL_MEMORY_IMPORT_HANDLE_TYPES_KHR"..0x2044
    )

    IntConstant(
        """
        Accepted value for the {@code param_name} parameter to #GetDeviceInfo() to query external memory handle types that may be imported by an OpenCL device.
        """,

        "DEVICE_EXTERNAL_MEMORY_IMPORT_HANDLE_TYPES_KHR"..0x204F
    )

    IntConstant(
        "New properties accepted as {@code properties} to #CreateBufferWithProperties() and #CreateImageWithProperties().",

        "DEVICE_HANDLE_LIST_KHR"..0x2051,
        "DEVICE_HANDLE_LIST_END_KHR".."0"
    )

    IntConstant(
        "New return values from #GetEventInfo() when {@code param_name} is #EVENT_COMMAND_TYPE.",

        "COMMAND_ACQUIRE_EXTERNAL_MEM_OBJECTS_KHR"..0x2047,
        "COMMAND_RELEASE_EXTERNAL_MEM_OBJECTS_KHR"..0x2048
    )

    IntConstant(
        "External memory handle type added by {@code cl_khr_external_memory_dma_buf}.",

        "EXTERNAL_MEMORY_HANDLE_DMA_BUF_KHR"..0x2067
    )

    IntConstant(
        "External memory handle type added by {@code cl_khr_external_memory_opaque_fd}.",

        "EXTERNAL_MEMORY_HANDLE_OPAQUE_FD_KHR"..0x2060
    )

    IntConstant(
        "External memory handle types added by {@code cl_khr_external_memory_win32}.",

        "EXTERNAL_MEMORY_HANDLE_OPAQUE_WIN32_KHR"..0x2061,
        "EXTERNAL_MEMORY_HANDLE_OPAQUE_WIN32_KMT_KHR"..0x2062
    )

    cl_int(
        "EnqueueAcquireExternalMemObjectsKHR",
        "",

        cl_command_queue("command_queue", ""),
        AutoSize("mem_objects")..cl_uint("num_mem_objects", ""),
        cl_mem.const.p("mem_objects", ""),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueReleaseExternalMemObjectsKHR",
        "",

        cl_command_queue("command_queue", ""),
        AutoSize("mem_objects")..cl_uint("num_mem_objects", ""),
        cl_mem.const.p("mem_objects", ""),
        NEWL,
        EWL,
        EVENT
    )
}