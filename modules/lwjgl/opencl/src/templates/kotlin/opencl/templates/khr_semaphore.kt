/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_semaphore = "KHRSemaphore".nativeClassCL("khr_semaphore", KHR) {
    documentation =
        """
        Native bindings to the $extensionName extension.
        
        OpenCL provides {@code cl_event} as a primary mechanism of synchronization between host and device as well as across devices. While events can be
        waited on or can be passed as dependencies across work-submissions, they suffer from following limitations:
        ${ul(
            "They are immutable.",
            "They are not reusable."
        )}

        This extension introduces a new type of synchronization object to represent semaphores that can be reused, waited on, and signaled multiple times by
        OpenCL work-submissions.

        In particular, this extension defines:
        ${ul(
            "A new type called {@code cl_semaphore_khr} to represent the semaphore objects.",
            "A new type called {@code cl_semaphore_properties_khr} to specify metadata associated with semaphores.",
            "Routines to create, retain, and release semaphores.",
            "Routines to wait on and signal semaphore objects.",
            "Routine to query the properties of semaphore objects."
        )}

        Requires ${CL12.link}.
        """

    IntConstant(
        "Accepted value for the {@code param_name} parameter to #GetPlatformInfo() to query the semaphore types supported by an OpenCL platform.",

        "PLATFORM_SEMAPHORE_TYPES_KHR"..0x2036
    )

    IntConstant(
        "Accepted value for the {@code param_name} parameter to #GetDeviceInfo() to query the semaphore types supported by an OpenCL device.",

        "DEVICE_SEMAPHORE_TYPES_KHR"..0x204C
    )

    IntConstant(
        "Semaphore types.",

        "SEMAPHORE_TYPE_BINARY_KHR".."1"
    )

    IntConstant(
        "New attributes that can be passed as part of {@code cl_semaphore_info_khr}.",

        "SEMAPHORE_CONTEXT_KHR"..0x2039,
        "SEMAPHORE_REFERENCE_COUNT_KHR"..0x203A,
        "SEMAPHORE_PROPERTIES_KHR"..0x203B,
        "SEMAPHORE_PAYLOAD_KHR"..0x203C
    )

    IntConstant(
        "New attributes that can be passed as part of {@code cl_semaphore_info_khr} or {@code cl_semaphore_properties_khr}.",

        "SEMAPHORE_TYPE_KHR"..0x203D,
        "DEVICE_HANDLE_LIST_KHR"..0x2051,
        "DEVICE_HANDLE_LIST_END_KHR".."0"
    )

    IntConstant(
        "New return values from #GetEventInfo() when {@code param_name} is #EVENT_COMMAND_TYPE.",

        "COMMAND_SEMAPHORE_WAIT_KHR"..0x2042,
        "COMMAND_SEMAPHORE_SIGNAL_KHR"..0x2043
    )

    IntConstant(
        "The following error codes can be returned by APIs introduced as part of this specification or the specifications that depend on this.",

        "INVALID_SEMAPHORE_KHR".."-1142"
    )

    cl_semaphore_khr(
        "CreateSemaphoreWithPropertiesKHR",
        "",

        cl_context("context", ""),
        NullTerminated..cl_semaphore_properties_khr.const.p("sema_props", ""),
        ERROR_RET
    )

    cl_int(
        "EnqueueWaitSemaphoresKHR",
        "",

        cl_command_queue("command_queue", ""),
        AutoSize("sema_objects")..cl_uint("num_sema_objects", ""),
        cl_semaphore_khr.const.p("sema_objects", ""),
        Unsafe..nullable..cl_semaphore_payload_khr.const.p("sema_payload_list", ""), // TODO
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueSignalSemaphoresKHR",
        "",

        cl_command_queue("command_queue", ""),
        AutoSize("sema_objects")..cl_uint("num_sema_objects", ""),
        cl_semaphore_khr.const.p("sema_objects", ""),
        Unsafe..cl_semaphore_payload_khr.const.p("sema_payload_list", ""),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "GetSemaphoreInfoKHR",
        "",

        cl_semaphore_khr("sema_object", ""),
        cl_semaphore_info_khr("param_name", ""),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_POINTER
        )..nullable..void.p("param_value", ""),
        PARAM_VALUE_SIZE_RET
    )

    cl_int(
        "ReleaseSemaphoreKHR",
        "",

        cl_semaphore_khr("sema_object", "")
    )

    cl_int(
        "RetainSemaphoreKHR",
        "",

        cl_semaphore_khr("sema_object", "")
    )
}
