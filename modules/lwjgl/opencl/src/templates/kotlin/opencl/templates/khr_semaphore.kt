/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_semaphore = "KHRSemaphore".nativeClassCL("khr_semaphore", KHR) {
    IntConstant(
        "PLATFORM_SEMAPHORE_TYPES_KHR"..0x2036
    )

    IntConstant(
        "DEVICE_SEMAPHORE_TYPES_KHR"..0x204C
    )

    IntConstant(
        "SEMAPHORE_TYPE_BINARY_KHR".."1"
    )

    IntConstant(
        "SEMAPHORE_CONTEXT_KHR"..0x2039,
        "SEMAPHORE_REFERENCE_COUNT_KHR"..0x203A,
        "SEMAPHORE_PROPERTIES_KHR"..0x203B,
        "SEMAPHORE_PAYLOAD_KHR"..0x203C
    )

    IntConstant(
        "SEMAPHORE_TYPE_KHR"..0x203D,
        "SEMAPHORE_DEVICE_HANDLE_LIST_KHR"..0x2051,
        "SEMAPHORE_DEVICE_HANDLE_LIST_END_KHR".."0"
    )

    IntConstant(
        "COMMAND_SEMAPHORE_WAIT_KHR"..0x2042,
        "COMMAND_SEMAPHORE_SIGNAL_KHR"..0x2043
    )

    IntConstant(
        "INVALID_SEMAPHORE_KHR".."-1142"
    )

    cl_semaphore_khr(
        "CreateSemaphoreWithPropertiesKHR",

        cl_context("context"),
        NullTerminated..cl_semaphore_properties_khr.const.p("sema_props"),
        ERROR_RET
    )

    cl_int(
        "EnqueueWaitSemaphoresKHR",

        cl_command_queue("command_queue"),
        AutoSize("sema_objects", "sema_payload_list")..cl_uint("num_sema_objects"),
        cl_semaphore_khr.const.p("sema_objects"),
        nullable..cl_semaphore_payload_khr.const.p("sema_payload_list"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueSignalSemaphoresKHR",

        cl_command_queue("command_queue"),
        AutoSize("sema_objects", "sema_payload_list")..cl_uint("num_sema_objects"),
        cl_semaphore_khr.const.p("sema_objects"),
        nullable..cl_semaphore_payload_khr.const.p("sema_payload_list"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "GetSemaphoreInfoKHR",

        cl_semaphore_khr("sema_object"),
        cl_semaphore_info_khr("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_POINTER
        )..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_int(
        "ReleaseSemaphoreKHR",

        cl_semaphore_khr("sema_object")
    )

    cl_int(
        "RetainSemaphoreKHR",

        cl_semaphore_khr("sema_object")
    )
}
