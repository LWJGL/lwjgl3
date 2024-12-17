/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

// Arguments

val NEWL = AutoSize("event_wait_list")..Parameter(cl_uint, "num_events_in_wait_list")
val EWL = nullable..Parameter(cl_event.const.p, "event_wait_list")
val EVENT = Check(1)..nullable..Parameter(cl_event.p, "event")

val ERROR_RET = Check(1)..nullable..Parameter(cl_int.p, "errcode_ret")

val PARAM_VALUE_SIZE = AutoSize("param_value")..Parameter(size_t, "param_value_size")
val PARAM_VALUE_SIZE_RET = Check(1)..nullable..Parameter(size_t.p, "param_value_size_ret")

val CL10 = "CL10".nativeClassCL("CL10") {
    IntConstant(
        "SUCCESS".."0",
        // We use expr here so that they are not converted to hex by the generator.
        "DEVICE_NOT_FOUND".."-1",
        "DEVICE_NOT_AVAILABLE".."-2",
        "COMPILER_NOT_AVAILABLE".."-3",
        "MEM_OBJECT_ALLOCATION_FAILURE".."-4",
        "OUT_OF_RESOURCES".."-5",
        "OUT_OF_HOST_MEMORY".."-6",
        "PROFILING_INFO_NOT_AVAILABLE".."-7",
        "MEM_COPY_OVERLAP".."-8",
        "IMAGE_FORMAT_MISMATCH".."-9",
        "IMAGE_FORMAT_NOT_SUPPORTED".."-10",
        "BUILD_PROGRAM_FAILURE".."-11",
        "MAP_FAILURE".."-12",

        "INVALID_VALUE".."-30",
        "INVALID_DEVICE_TYPE".."-31",
        "INVALID_PLATFORM".."-32",
        "INVALID_DEVICE".."-33",
        "INVALID_CONTEXT".."-34",
        "INVALID_QUEUE_PROPERTIES".."-35",
        "INVALID_COMMAND_QUEUE".."-36",
        "INVALID_HOST_PTR".."-37",
        "INVALID_MEM_OBJECT".."-38",
        "INVALID_IMAGE_FORMAT_DESCRIPTOR".."-39",
        "INVALID_IMAGE_SIZE".."-40",
        "INVALID_SAMPLER".."-41",
        "INVALID_BINARY".."-42",
        "INVALID_BUILD_OPTIONS".."-43",
        "INVALID_PROGRAM".."-44",
        "INVALID_PROGRAM_EXECUTABLE".."-45",
        "INVALID_KERNEL_NAME".."-46",
        "INVALID_KERNEL_DEFINITION".."-47",
        "INVALID_KERNEL".."-48",
        "INVALID_ARG_INDEX".."-49",
        "INVALID_ARG_VALUE".."-50",
        "INVALID_ARG_SIZE".."-51",
        "INVALID_KERNEL_ARGS".."-52",
        "INVALID_WORK_DIMENSION".."-53",
        "INVALID_WORK_GROUP_SIZE".."-54",
        "INVALID_WORK_ITEM_SIZE".."-55",
        "INVALID_GLOBAL_OFFSET".."-56",
        "INVALID_EVENT_WAIT_LIST".."-57",
        "INVALID_EVENT".."-58",
        "INVALID_OPERATION".."-59",
        "INVALID_BUFFER_SIZE".."-61",
        "INVALID_GLOBAL_WORK_SIZE".."-63"
    )

    IntConstant(
        "VERSION_1_0".."1"
    )

    IntConstant(
        "FALSE".."0",
        "TRUE".."1"
    )

    IntConstant(
        "PLATFORM_PROFILE"..0x0900,
        "PLATFORM_VERSION"..0x0901,
        "PLATFORM_NAME"..0x0902,
        "PLATFORM_VENDOR"..0x0903,
        "PLATFORM_EXTENSIONS"..0x0904
    )

    IntConstant(
        "DEVICE_TYPE_DEFAULT".."1 << 0",
        "DEVICE_TYPE_CPU".."1 << 1",
        "DEVICE_TYPE_GPU".."1 << 2",
        "DEVICE_TYPE_ACCELERATOR".."1 << 3",
        "DEVICE_TYPE_ALL"..0xFFFFFFFF.i
    )

    IntConstant(
        "DEVICE_TYPE"..0x1000,
        "DEVICE_VENDOR_ID"..0x1001,
        "DEVICE_MAX_COMPUTE_UNITS"..0x1002,
        "DEVICE_MAX_WORK_ITEM_DIMENSIONS"..0x1003,
        "DEVICE_MAX_WORK_GROUP_SIZE"..0x1004,
        "DEVICE_MAX_WORK_ITEM_SIZES"..0x1005,
        "DEVICE_PREFERRED_VECTOR_WIDTH_CHAR"..0x1006,
        "DEVICE_PREFERRED_VECTOR_WIDTH_SHORT"..0x1007,
        "DEVICE_PREFERRED_VECTOR_WIDTH_INT"..0x1008,
        "DEVICE_PREFERRED_VECTOR_WIDTH_LONG"..0x1009,
        "DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT"..0x100A,
        "DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE"..0x100B,
        "DEVICE_MAX_CLOCK_FREQUENCY"..0x100C,
        "DEVICE_ADDRESS_BITS"..0x100D,
        "DEVICE_MAX_READ_IMAGE_ARGS"..0x100E,
        "DEVICE_MAX_WRITE_IMAGE_ARGS"..0x100F,
        "DEVICE_MAX_MEM_ALLOC_SIZE"..0x1010,
        "DEVICE_IMAGE2D_MAX_WIDTH"..0x1011,
        "DEVICE_IMAGE2D_MAX_HEIGHT"..0x1012,
        "DEVICE_IMAGE3D_MAX_WIDTH"..0x1013,
        "DEVICE_IMAGE3D_MAX_HEIGHT"..0x1014,
        "DEVICE_IMAGE3D_MAX_DEPTH"..0x1015,
        "DEVICE_IMAGE_SUPPORT"..0x1016,
        "DEVICE_MAX_PARAMETER_SIZE"..0x1017,
        "DEVICE_MAX_SAMPLERS"..0x1018,
        "DEVICE_MEM_BASE_ADDR_ALIGN"..0x1019,
        "DEVICE_MIN_DATA_TYPE_ALIGN_SIZE"..0x101A,
        "DEVICE_SINGLE_FP_CONFIG"..0x101B,
        "DEVICE_GLOBAL_MEM_CACHE_TYPE"..0x101C,
        "DEVICE_GLOBAL_MEM_CACHELINE_SIZE"..0x101D,
        "DEVICE_GLOBAL_MEM_CACHE_SIZE"..0x101E,
        "DEVICE_GLOBAL_MEM_SIZE"..0x101F,
        "DEVICE_MAX_CONSTANT_BUFFER_SIZE"..0x1020,
        "DEVICE_MAX_CONSTANT_ARGS"..0x1021,
        "DEVICE_LOCAL_MEM_TYPE"..0x1022,
        "DEVICE_LOCAL_MEM_SIZE"..0x1023,
        "DEVICE_ERROR_CORRECTION_SUPPORT"..0x1024,
        "DEVICE_PROFILING_TIMER_RESOLUTION"..0x1025,
        "DEVICE_ENDIAN_LITTLE"..0x1026,
        "DEVICE_AVAILABLE"..0x1027,
        "DEVICE_COMPILER_AVAILABLE"..0x1028,
        "DEVICE_EXECUTION_CAPABILITIES"..0x1029,
        "DEVICE_QUEUE_PROPERTIES"..0x102A,
        "DEVICE_NAME"..0x102B,
        "DEVICE_VENDOR"..0x102C,
        "DRIVER_VERSION"..0x102D,
        "DEVICE_PROFILE"..0x102E,
        "DEVICE_VERSION"..0x102F,
        "DEVICE_EXTENSIONS"..0x1030,
        "DEVICE_PLATFORM"..0x1031
    )

    IntConstant(
        "FP_DENORM".."1 << 0",
        "FP_INF_NAN".."1 << 1",
        "FP_ROUND_TO_NEAREST".."1 << 2",
        "FP_ROUND_TO_ZERO".."1 << 3",
        "FP_ROUND_TO_INF".."1 << 4",
        "FP_FMA".."1 << 5"
    )

    IntConstant(
        "NONE"..0x0,
        "READ_ONLY_CACHE"..0x1,
        "READ_WRITE_CACHE"..0x2
    )

    IntConstant(
        "LOCAL"..0x1,
        "GLOBAL"..0x2
    )

    IntConstant(
        "EXEC_KERNEL".."1 << 0",
        "EXEC_NATIVE_KERNEL".."1 << 1"
    )

    IntConstant(
        "QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE".."1 << 0",
        "QUEUE_PROFILING_ENABLE".."1 << 1"
    )

    IntConstant(
        "CONTEXT_REFERENCE_COUNT"..0x1080,
        "CONTEXT_DEVICES"..0x1081,
        "CONTEXT_PROPERTIES"..0x1082
    )

    IntConstant(
        "CONTEXT_PLATFORM"..0x1084
    )

    IntConstant(
        "QUEUE_CONTEXT"..0x1090,
        "QUEUE_DEVICE"..0x1091,
        "QUEUE_REFERENCE_COUNT"..0x1092,
        "QUEUE_PROPERTIES"..0x1093
    )

    IntConstant(
        "MEM_READ_WRITE".."1 << 0",
        "MEM_WRITE_ONLY".."1 << 1",
        "MEM_READ_ONLY".."1 << 2",
        "MEM_USE_HOST_PTR".."1 << 3",
        "MEM_ALLOC_HOST_PTR".."1 << 4",
        "MEM_COPY_HOST_PTR".."1 << 5"
    )

    IntConstant(
        "R"..0x10B0,
        "A"..0x10B1,
        "RG"..0x10B2,
        "RA"..0x10B3,
        "RGB"..0x10B4,
        "RGBA"..0x10B5,
        "BGRA"..0x10B6,
        "ARGB"..0x10B7,
        "INTENSITY"..0x10B8,
        "LUMINANCE"..0x10B9
    )

    IntConstant(
        "SNORM_INT8"..0x10D0,
        "SNORM_INT16"..0x10D1,
        "UNORM_INT8"..0x10D2,
        "UNORM_INT16"..0x10D3,
        "UNORM_SHORT_565"..0x10D4,
        "UNORM_SHORT_555"..0x10D5,
        "UNORM_INT_101010"..0x10D6,
        "SIGNED_INT8"..0x10D7,
        "SIGNED_INT16"..0x10D8,
        "SIGNED_INT32"..0x10D9,
        "UNSIGNED_INT8"..0x10DA,
        "UNSIGNED_INT16"..0x10DB,
        "UNSIGNED_INT32"..0x10DC,
        "HALF_FLOAT"..0x10DD,
        "FLOAT"..0x10DE
    )

    IntConstant(
        "MEM_OBJECT_BUFFER"..0x10F0,
        "MEM_OBJECT_IMAGE2D"..0x10F1,
        "MEM_OBJECT_IMAGE3D"..0x10F2
    )

    IntConstant(
        "MEM_TYPE"..0x1100,
        "MEM_FLAGS"..0x1101,
        "MEM_SIZE"..0x1102,
        "MEM_HOST_PTR"..0x1103,
        "MEM_MAP_COUNT"..0x1104,
        "MEM_REFERENCE_COUNT"..0x1105,
        "MEM_CONTEXT"..0x1106
    )

    IntConstant(
        "IMAGE_FORMAT"..0x1110,
        "IMAGE_ELEMENT_SIZE"..0x1111,
        "IMAGE_ROW_PITCH"..0x1112,
        "IMAGE_SLICE_PITCH"..0x1113,
        "IMAGE_WIDTH"..0x1114,
        "IMAGE_HEIGHT"..0x1115,
        "IMAGE_DEPTH"..0x1116
    )

    IntConstant(
        "ADDRESS_NONE"..0x1130,
        "ADDRESS_CLAMP_TO_EDGE"..0x1131,
        "ADDRESS_CLAMP"..0x1132,
        "ADDRESS_REPEAT"..0x1133
    )

    IntConstant(
        "FILTER_NEAREST"..0x1140,
        "FILTER_LINEAR"..0x1141
    )

    IntConstant(
        "SAMPLER_REFERENCE_COUNT"..0x1150,
        "SAMPLER_CONTEXT"..0x1151,
        "SAMPLER_NORMALIZED_COORDS"..0x1152,
        "SAMPLER_ADDRESSING_MODE"..0x1153,
        "SAMPLER_FILTER_MODE"..0x1154
    )

    IntConstant(
        "MAP_READ".."1 << 0",
        "MAP_WRITE".."1 << 1"
    )

    IntConstant(
        "PROGRAM_REFERENCE_COUNT"..0x1160,
        "PROGRAM_CONTEXT"..0x1161,
        "PROGRAM_NUM_DEVICES"..0x1162,
        "PROGRAM_DEVICES"..0x1163,
        "PROGRAM_SOURCE"..0x1164,
        "PROGRAM_BINARY_SIZES"..0x1165,
        "PROGRAM_BINARIES"..0x1166
    )

    IntConstant(
        "PROGRAM_BUILD_STATUS"..0x1181,
        "PROGRAM_BUILD_OPTIONS"..0x1182,
        "PROGRAM_BUILD_LOG"..0x1183
    )

    IntConstant(
        "BUILD_SUCCESS".."0",
        "BUILD_NONE".."-1",
        "BUILD_ERROR".."-2",
        "BUILD_IN_PROGRESS".."-3"
    )

    IntConstant(
        "KERNEL_FUNCTION_NAME"..0x1190,
        "KERNEL_NUM_ARGS"..0x1191,
        "KERNEL_REFERENCE_COUNT"..0x1192,
        "KERNEL_CONTEXT"..0x1193,
        "KERNEL_PROGRAM"..0x1194
    )

    IntConstant(
        "KERNEL_WORK_GROUP_SIZE"..0x11B0,
        "KERNEL_COMPILE_WORK_GROUP_SIZE"..0x11B1,
        "KERNEL_LOCAL_MEM_SIZE"..0x11B2
    )

    IntConstant(
        "EVENT_COMMAND_QUEUE"..0x11D0,
        "EVENT_COMMAND_TYPE"..0x11D1,
        "EVENT_REFERENCE_COUNT"..0x11D2,
        "EVENT_COMMAND_EXECUTION_STATUS"..0x11D3
    )

    IntConstant(
        "COMMAND_NDRANGE_KERNEL"..0x11F0,
        "COMMAND_TASK"..0x11F1,
        "COMMAND_NATIVE_KERNEL"..0x11F2,
        "COMMAND_READ_BUFFER"..0x11F3,
        "COMMAND_WRITE_BUFFER"..0x11F4,
        "COMMAND_COPY_BUFFER"..0x11F5,
        "COMMAND_READ_IMAGE"..0x11F6,
        "COMMAND_WRITE_IMAGE"..0x11F7,
        "COMMAND_COPY_IMAGE"..0x11F8,
        "COMMAND_COPY_IMAGE_TO_BUFFER"..0x11F9,
        "COMMAND_COPY_BUFFER_TO_IMAGE"..0x11FA,
        "COMMAND_MAP_BUFFER"..0x11FB,
        "COMMAND_MAP_IMAGE"..0x11FC,
        "COMMAND_UNMAP_MEM_OBJECT"..0x11FD,
        "COMMAND_MARKER"..0x11FE,
        "COMMAND_ACQUIRE_GL_OBJECTS"..0x11FF,
        "COMMAND_RELEASE_GL_OBJECTS"..0x1200
    )

    IntConstant(
        "COMPLETE"..0x0,
        "RUNNING"..0x1,
        "SUBMITTED"..0x2,
        "QUEUED"..0x3
    )

    IntConstant(
        "PROFILING_COMMAND_QUEUED"..0x1280,
        "PROFILING_COMMAND_SUBMIT"..0x1281,
        "PROFILING_COMMAND_START"..0x1282,
        "PROFILING_COMMAND_END"..0x1283
    )

    // ------------------[ OPENCL Platform Layer ]------------------

    cl_int(
        "GetPlatformIDs",

        AutoSize("platforms")..cl_uint("num_entries"),
        nullable..cl_platform_id.p("platforms"),
        Check(1)..nullable..cl_uint.p("num_platforms")
    )

    cl_int(
        "GetPlatformInfo",

        cl_platform_id("platform"),
        cl_platform_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_LONG
        )..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_int(
        "GetDeviceIDs",

        nullable..cl_platform_id("platform"),
        cl_device_type("device_type"),
        AutoSize("devices")..cl_uint("num_entries"),
        nullable..cl_device_id.p("devices"),
        Check(1)..nullable..cl_uint.p("num_devices")
    )

    cl_int(
        "GetDeviceInfo",

        cl_device_id("device"),
        cl_device_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_INT, PointerMapping.DATA_LONG, PointerMapping.DATA_POINTER
        )..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_context(
        "CreateContext",

        nullable..NullTerminated..cl_context_properties.const.p("properties"),
        AutoSize("devices")..cl_uint("num_devices"),
        SingleValue("device")..cl_device_id.const.p("devices"),
        nullable..cl_context_callback("pfn_notify"),
        nullable..opaque_p("user_data"),
        ERROR_RET
    )

    cl_context(
        "CreateContextFromType",

        nullable..NullTerminated..cl_context_properties.const.p("properties"),
        cl_device_type("device_type"),
        nullable..cl_context_callback("pfn_notify"),
        nullable..opaque_p("user_data"),
        ERROR_RET
    )

    cl_int(
        "RetainContext",

        cl_context("context")
    )

    cl_int(
        "ReleaseContext",

        cl_context("context")
    )

    cl_int(
        "GetContextInfo",

        cl_context("context"),
        cl_context_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_POINTER)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    // ------------------[ OPENCL Runtime ]------------------

    DeprecatedCL("1.2")..cl_command_queue(
        "CreateCommandQueue",

        cl_context("context"),
        cl_device_id("device"),
        cl_command_queue_properties("properties"),
        ERROR_RET
    )

    cl_int(
        "RetainCommandQueue",

        cl_command_queue("command_queue")
    )

    cl_int(
        "ReleaseCommandQueue",

        cl_command_queue("command_queue")
    )

    cl_int(
        "GetCommandQueueInfo",

        cl_command_queue("command_queue"),
        cl_command_queue_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_LONG, PointerMapping.DATA_POINTER)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_mem(
        "CreateBuffer",

        cl_context("context"),
        cl_mem_flags("flags"),
        AutoSize("host_ptr")..size_t("size"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE)..optional..void.p("host_ptr"),
        ERROR_RET
    )

    Code(
        javaInit = statement(
            "\t\tif (!blocking_read) { throw new IllegalArgumentException(\"Non blocking reads cannot be used when the ptr parameter is a Java array.\"); }",
            ApplyTo.ARRAY_ONLY
        )
    )..cl_int(
        "EnqueueReadBuffer",

        cl_command_queue("command_queue"),
        cl_mem("buffer"),
        cl_bool("blocking_read"),
        size_t("offset"),
        AutoSize("ptr")..size_t("size"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..void.p("ptr"),
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
        "EnqueueWriteBuffer",

        cl_command_queue("command_queue"),
        cl_mem("buffer"),
        cl_bool("blocking_write"),
        size_t("offset"),
        AutoSize("ptr")..size_t("size"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.const.p("ptr"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueCopyBuffer",

        cl_command_queue("command_queue"),
        cl_mem("src_buffer"),
        cl_mem("dst_buffer"),
        size_t("src_offset"),
        size_t("dst_offset"),
        size_t("size"),
        NEWL,
        EWL,
        EVENT
    )

    MapPointer("size", oldBufferOverloads = true)..void.p(
        "EnqueueMapBuffer",

        cl_command_queue("command_queue"),
        cl_mem("buffer"),
        cl_bool("blocking_map"),
        cl_map_flags("map_flags"),
        size_t("offset"),
        size_t("size"),
        NEWL,
        EWL,
        EVENT,
        ERROR_RET
    )

    DeprecatedCL("1.1")..cl_mem(
        "CreateImage2D",

        cl_context("context"),
        cl_mem_flags("flags"),
        cl_image_format.const.p("image_format"),
        size_t("image_width"),
        size_t("image_height"),
        size_t("image_row_pitch"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Unsafe..nullable..void.p("host_ptr"),
        ERROR_RET
    )

    DeprecatedCL("1.1")..cl_mem(
        "CreateImage3D",

        cl_context("context"),
        cl_mem_flags("flags"),
        cl_image_format.const.p("image_format"),
        size_t("image_width"),
        size_t("image_height"),
        size_t("image_depth"),
        size_t("image_row_pitch"),
        size_t("image_slice_pitch"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Unsafe..nullable..void.p("host_ptr"),
        ERROR_RET
    )

    cl_int(
        "GetSupportedImageFormats",

        cl_context("context"),
        cl_mem_flags("flags"),
        cl_mem_object_type("image_type"),
        AutoSize("image_formats")..cl_uint("num_entries"),
        nullable..cl_image_format.p("image_formats"),
        Check(1)..nullable..cl_uint.p("num_image_formats")
    )

    Code(
        javaInit = statement(
            "\t\tif (!blocking_read) { throw new IllegalArgumentException(\"Non blocking reads cannot be used when the ptr parameter is a Java array.\"); }",
            ApplyTo.ARRAY_ONLY
        )
    )..cl_int(
        "EnqueueReadImage",

        cl_command_queue("command_queue"),
        cl_mem("image"),
        cl_bool("blocking_read"),
        Check(3)..size_t.const.p("origin"),
        Check(3)..size_t.const.p("region"),
        size_t("row_pitch"),
        size_t("slice_pitch"),
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
        "EnqueueWriteImage",

        cl_command_queue("command_queue"),
        cl_mem("image"),
        cl_bool("blocking_write"),
        Check(3)..size_t.const.p("origin"),
        Check(3)..size_t.const.p("region"),
        size_t("input_row_pitch"),
        size_t("input_slice_pitch"),
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
        "EnqueueCopyImage",

        cl_command_queue("command_queue"),
        cl_mem("src_image"),
        cl_mem("dst_image"),
        Check(3)..size_t.const.p("src_origin"),
        Check(3)..size_t.const.p("dst_origin"),
        Check(3)..size_t.const.p("region"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueCopyImageToBuffer",

        cl_command_queue("command_queue"),
        cl_mem("src_image"),
        cl_mem("dst_buffer"),
        Check(3)..size_t.const.p("src_origin"),
        Check(3)..size_t.const.p("region"),
        size_t("dst_offset"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueCopyBufferToImage",

        cl_command_queue("command_queue"),
        cl_mem("src_buffer"),
        cl_mem("dst_image"),
        size_t("src_offset"),
        Check(3)..size_t.const.p("dst_origin"),
        Check(3)..size_t.const.p("region"),
        NEWL,
        EWL,
        EVENT
    )

    customMethod("""
    private static long getMemObjectInfoPointer(long cl_mem, int param_name) {
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.pointers(0);
            return clGetMemObjectInfo(cl_mem, param_name, pp, null) == CL_SUCCESS ? pp.get(0) : NULL;
        }
    }
    """)

    MapPointer("(int)getMemObjectInfoPointer(image, CL_MEM_SIZE)", oldBufferOverloads = true)..void.p(
        "EnqueueMapImage",

        cl_command_queue("command_queue"),
        cl_mem("image"),
        cl_bool("blocking_map"),
        cl_map_flags("map_flags"),
        Check(3)..size_t.const.p("origin"),
        Check(3)..size_t.const.p("region"),
        Check(1)..size_t.p("image_row_pitch"),
        Check(1)..nullable..size_t.p("image_slice_pitch"),
        NEWL,
        EWL,
        EVENT,
        ERROR_RET
    )

    cl_int(
        "GetImageInfo",

        cl_mem("image"),
        cl_image_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_POINTER
        )..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_int(
        "RetainMemObject",

        cl_mem("memobj")
    )

    cl_int(
        "ReleaseMemObject",

        cl_mem("memobj")
    )

    cl_int(
        "EnqueueUnmapMemObject",

        cl_command_queue("command_queue"),
        cl_mem("memobj"),
        Unsafe..void.p("mapped_ptr"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "GetMemObjectInfo",

        cl_mem("memobj"),
        cl_mem_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_POINTER
        )..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    DeprecatedCL("1.2")..cl_sampler(
        "CreateSampler",

        cl_context("context"),
        cl_bool("normalized_coords"),
        cl_addressing_mode("addressing_mode"),
        cl_filter_mode("filter_mode"),
        ERROR_RET
    )

    cl_int(
        "RetainSampler",

        cl_sampler("sampler")
    )

    cl_int(
        "ReleaseSampler",

        cl_sampler("sampler")
    )

    cl_int(
        "GetSamplerInfo",

        cl_sampler("sampler"),
        cl_sampler_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_POINTER
        )..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_program(
        "CreateProgramWithSource",

        cl_context("context"),
        AutoSize("strings", "lengths")..cl_uint("count"),
        PointerArray(cl_charUTF8.p, "string", "lengths")..cl_charUTF8.const.p.p("strings"),
        nullable..size_t.const.p("lengths"),
        ERROR_RET
    )

    cl_program(
        "CreateProgramWithBinary",

        cl_context("context"),
        AutoSize("binaries", "device_list", "lengths", "binary_status")..cl_uint("num_devices"),
        cl_device_id.const.p("device_list"),
        size_t.const.p("lengths"),
        PointerArray(cl_uchar.p, "binary", "lengths")..cl_uchar.const.p.p("binaries"),
        nullable..cl_int.p("binary_status"),
        ERROR_RET
    )

    cl_int(
        "RetainProgram",

        cl_program("program")
    )

    cl_int(
        "ReleaseProgram",

        cl_program("program")
    )

    cl_int(
        "BuildProgram",

        cl_program("program"),
        AutoSize("device_list")..cl_uint("num_devices"),
        SingleValue("device")..nullable..cl_device_id.const.p("device_list"),
        cl_charASCII.const.p("options"),
        nullable..cl_program_callback("pfn_notify"),
        nullable..opaque_p("user_data")
    )

    DeprecatedCL("1.1")..cl_int(
        "UnloadCompiler",
        void()
    )

    cl_int(
        "GetProgramInfo",

        cl_program("program"),
        cl_program_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_POINTER)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_int(
        "GetProgramBuildInfo",

        cl_program("program"),
        cl_device_id("device"),
        cl_program_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_POINTER)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_kernel(
        "CreateKernel",

        cl_program("program"),
        cl_charASCII.const.p("kernel_name"),
        ERROR_RET
    )

    cl_int(
        "CreateKernelsInProgram",

        cl_program("program"),
        AutoSize("kernels")..cl_uint("num_kernels"),
        nullable..cl_kernel.p("kernels"),
        Check(1)..nullable..cl_uint.p("num_kernels_ret")
    )

    cl_int(
        "RetainKernel",

        cl_kernel("kernel")
    )

    cl_int(
        "ReleaseKernel",

        cl_kernel("kernel")
    )

    cl_int(
        "SetKernelArg",

        cl_kernel("kernel"),
        cl_uint("arg_index"),
        AutoSize("arg_value")..size_t("arg_size"),
        // optional generates clSetKernelArg(long kernel, int arg_index, long arg_size)
        // MultiType generates clSetKernalArg(long kernel, int arg_index, <type>Buffer arg_value)
        // SingleValue generates clSetKernelArg<xp>(long kernel, int arg_index, <p> arg<x-1>, ...), where x = 1..4
        optional..MultiTypeAll..SingleValue("arg")..void.const.p("arg_value")
    )

    cl_int(
        "GetKernelInfo",

        cl_kernel("kernel"),
        cl_kernel_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_POINTER)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_int(
        "GetKernelWorkGroupInfo",

        cl_kernel("kernel"),
        cl_device_id("device"),
        cl_kernel_work_group_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_LONG, PointerMapping.DATA_POINTER)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_int(
        "EnqueueNDRangeKernel",

        cl_command_queue("command_queue"),
        cl_kernel("kernel"),
        cl_uint("work_dim"),
        Check("work_dim")..nullable..size_t.const.p("global_work_offset"),
        Check("work_dim")..nullable..size_t.const.p("global_work_size"),
        Check("work_dim")..nullable..size_t.const.p("local_work_size"),
        NEWL,
        EWL,
        EVENT
    )

    DeprecatedCL("1.2")..cl_int(
        "EnqueueTask",

        cl_command_queue("command_queue"),
        cl_kernel("kernel"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueNativeKernel",

        cl_command_queue("command_queue"),
        cl_native_kernel("user_func"),
        nullable..void.p("args"),
        AutoSize("args")..size_t("cb_args"),
        AutoSize("mem_list", "args_mem_loc")..cl_uint("num_mem_objects"),
        SingleValue("memobj")..nullable..cl_mem.const.p("mem_list"),
        SingleValue("memobj_loc")..nullable..void.const.p.p("args_mem_loc"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "WaitForEvents",

        AutoSize("event_list")..cl_uint("num_events"),
        SingleValue("event")..cl_event.const.p("event_list")
    )

    cl_int(
        "GetEventInfo",

        cl_event("event"),
        cl_event_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_POINTER)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_int(
        "RetainEvent",

        cl_event("event")
    )

    cl_int(
        "ReleaseEvent",

        cl_event("event")
    )

    DeprecatedCL("1.1")..cl_int(
        "EnqueueMarker",

        cl_command_queue("command_queue"),
        EVENT
    )

    DeprecatedCL("1.1")..cl_int(
        "EnqueueBarrier",

        cl_command_queue("command_queue")
    )

    DeprecatedCL("1.1")..cl_int(
        "EnqueueWaitForEvents",

        cl_command_queue("command_queue"),
        AutoSize("event_list")..cl_uint("num_events"),
        SingleValue("event")..cl_event.const.p("event_list")
    )

    cl_int(
        "GetEventProfilingInfo",

        cl_event("event"),
        cl_profiling_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_LONG)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_int(
        "Flush",

        cl_command_queue("command_queue")
    )

    cl_int(
        "Finish",

        cl_command_queue("command_queue")
    )

    DeprecatedCL("1.1")..opaque_p(
        "GetExtensionFunctionAddress",

        cl_charASCII.const.p("funcname")
    )

}