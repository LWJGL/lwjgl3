/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

const val INVALID_PROPERTY = "#INVALID_PROPERTY"

val CL11 = "CL11".nativeClassCL("CL11") {
    extends = CL10
    IntConstant(
        "MISALIGNED_SUB_BUFFER_OFFSET".."-13",
        "EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST".."-14",
        "INVALID_PROPERTY".."-64"
    )

    IntConstant(
        "VERSION_1_1"..0x1
    )

    IntConstant(
        "DEVICE_PREFERRED_VECTOR_WIDTH_HALF"..0x1034,
        "DEVICE_HOST_UNIFIED_MEMORY"..0x1035,
        "DEVICE_NATIVE_VECTOR_WIDTH_CHAR"..0x1036,
        "DEVICE_NATIVE_VECTOR_WIDTH_SHORT"..0x1037,
        "DEVICE_NATIVE_VECTOR_WIDTH_INT"..0x1038,
        "DEVICE_NATIVE_VECTOR_WIDTH_LONG"..0x1039,
        "DEVICE_NATIVE_VECTOR_WIDTH_FLOAT"..0x103A,
        "DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE"..0x103B,
        "DEVICE_NATIVE_VECTOR_WIDTH_HALF"..0x103C,
        "DEVICE_OPENCL_C_VERSION"..0x103D
    )

    IntConstant(
        "FP_SOFT_FLOAT".."1 << 6"
    )

    IntConstant(
        "CONTEXT_NUM_DEVICES"..0x1083
    )

    IntConstant(
        "Rx"..0x10BA,
        "RGx"..0x10BB,
        "RGBx"..0x10BC
    )

    IntConstant(
        "MEM_ASSOCIATED_MEMOBJECT"..0x1107,
        "MEM_OFFSET"..0x1108
    )

    IntConstant(
        "ADDRESS_MIRRORED_REPEAT"..0x1134
    )

    IntConstant(
        "KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE"..0x11B3,
        "KERNEL_PRIVATE_MEM_SIZE"..0x11B4
    )

    IntConstant(
        "EVENT_CONTEXT"..0x11D4
    )

    IntConstant(
        "COMMAND_READ_BUFFER_RECT"..0x1201,
        "COMMAND_WRITE_BUFFER_RECT"..0x1202,
        "COMMAND_COPY_BUFFER_RECT"..0x1203,
        "COMMAND_USER"..0x1204
    )

    IntConstant(
        "BUFFER_CREATE_TYPE_REGION"..0x1220
    )

    cl_mem(
        "CreateSubBuffer",

        cl_mem("buffer"),
        cl_mem_flags("flags"),
        cl_buffer_create_type("buffer_create_type"),
        Unsafe..void.const.p("buffer_create_info"),
        ERROR_RET
    )

    cl_int(
        "SetMemObjectDestructorCallback",

        cl_mem("memobj"),
        cl_mem_object_destructor_callback("pfn_notify"),
        nullable..opaque_p("user_data")
    )

    val BufferRectBufferOrigin = Check(3)..size_t.const.p("buffer_origin")
    val BufferRectHostOrigin = Check(3)..size_t.const.p("host_origin")
    val BufferRectRegion = Check(3)..size_t.const.p("region")
    val BufferRectBufferRowPitch = size_t("buffer_row_pitch")
    val BufferRectBufferSlicePitch = size_t("buffer_slice_pitch")
    val BufferRectHostRowPitch = size_t("host_row_pitch")
    val BufferRectHostSlicePitch = size_t("host_slice_pitch")

    Code(
        javaInit = statement(
            "\t\tif (!blocking_read) { throw new IllegalArgumentException(\"Non blocking reads cannot be used when the ptr parameter is a Java array.\"); }",
            ApplyTo.ARRAY_ONLY
        )
    )..cl_int(
        "EnqueueReadBufferRect",

        cl_command_queue("command_queue"),
        cl_mem("buffer"),
        cl_bool("blocking_read"),
        BufferRectBufferOrigin,
        BufferRectHostOrigin,
        BufferRectRegion,
        BufferRectBufferRowPitch,
        BufferRectBufferSlicePitch,
        BufferRectHostRowPitch,
        BufferRectHostSlicePitch,
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..Unsafe..void.p("ptr"),
        NEWL,
        EWL,
        EVENT
    )

    Code(
        javaInit = statement(
            "\t\tif (!blocking_write) { throw new IllegalArgumentException(\"Non blocking writes cannot be used when the ptr parameter is a Java array.\"); }",
            ApplyTo.ARRAY_ONLY
        )
    )..cl_int(
        "EnqueueWriteBufferRect",

        cl_command_queue("command_queue"),
        cl_mem("buffer"),
        cl_bool("blocking_write"),
        BufferRectBufferOrigin,
        BufferRectHostOrigin,
        BufferRectRegion,
        BufferRectBufferRowPitch,
        BufferRectBufferSlicePitch,
        BufferRectHostRowPitch,
        BufferRectHostSlicePitch,
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..Unsafe..void.const.p("ptr"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueCopyBufferRect",

        cl_command_queue("command_queue"),
        cl_mem("src_buffer"),
        cl_mem("dst_buffer"),
        Check(3)..size_t.p("src_origin"),
        Check(3)..size_t.p("dst_origin"),
        Check(3)..size_t.p("region"),
        size_t("src_row_pitch"),
        size_t("src_slice_pitch"),
        size_t("dst_row_pitch"),
        size_t("dst_slice_pitch"),
        NEWL,
        EWL,
        EVENT
    )

    cl_event(
        "CreateUserEvent",

        cl_context("context"),
        ERROR_RET
    )

    cl_int(
        "SetUserEventStatus",

        cl_event("event"),
        cl_int("execution_status")
    )

    cl_int(
        "SetEventCallback",

        cl_event("event"),
        cl_int("command_exec_callback_type"),
        cl_event_callback("pfn_notify"),
        nullable..opaque_p("user_data")
    )

}