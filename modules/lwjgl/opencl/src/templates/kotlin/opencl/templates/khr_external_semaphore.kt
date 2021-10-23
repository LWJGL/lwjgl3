/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_external_semaphore = "KHRExternalSemaphore".nativeClassCL("khr_external_semaphore", KHR) {
    documentation =
        """
        Native bindings to the $extensionName extension.
        
        {@code cl_khr_semaphore} introduced semaphores as a new type along with a set of APIs for create, release, retain, wait and signal operations on it.
        This extension defines APIs and mechanisms to share semaphores created in an external API by importing into and exporting from OpenCL.

        This extension defines:
        ${ul(
            """
            New attributes that can be passed as part of {@code cl_semaphore_properties_khr} for specifying properties of external semaphores to be imported or
            exported.
            """,
            "New attributes that can be passed as part of {@code cl_semaphore_info_khr} for specifying properties of external semaphores to be exported.",
            """
            An extension to #CreateSemaphoreWithPropertiesKHR() to accept external semaphore properties allowing to import or export an external semaphore into
            or from OpenCL.
            """,
            "Semaphore handle types required for importing and exporting semaphores.",
            "Modifications to Wait and Signal API behavior when dealing with external semaphores created from different handle types.",
            "API query exportable semaphores handles using specified handle type."
        )}

        Other related extensions define specific external semaphores that may be imported into or exported from OpenCL.

        Requires ${CL12.link} and the ${khr_semaphore.link} extension.
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
}