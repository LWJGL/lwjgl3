/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val CL12 = "CL12".nativeClassCL("CL12") {
    extends = CL11
    IntConstant(
        "COMPILE_PROGRAM_FAILURE".."-15",
        "LINKER_NOT_AVAILABLE".."-16",
        "LINK_PROGRAM_FAILURE".."-17",
        "DEVICE_PARTITION_FAILED".."-18",
        "KERNEL_ARG_INFO_NOT_AVAILABLE".."-19",
        "INVALID_IMAGE_DESCRIPTOR".."-65",
        "INVALID_COMPILER_OPTIONS".."-66",
        "INVALID_LINKER_OPTIONS".."-67",
        "INVALID_DEVICE_PARTITION_COUNT".."-68"
    )

    IntConstant(
        "VERSION_1_2".."1"
    )

    IntConstant(
        "BLOCKING".."CL10.CL_TRUE",
        "NON_BLOCKING".."CL10.CL_FALSE"
    )

    IntConstant(
        "DEVICE_TYPE_CUSTOM".."1 << 4"
    )

    IntConstant(
        "DEVICE_DOUBLE_FP_CONFIG"..0x1032,
        "DEVICE_LINKER_AVAILABLE"..0x103E,
        "DEVICE_BUILT_IN_KERNELS"..0x103F,
        "DEVICE_IMAGE_MAX_BUFFER_SIZE"..0x1040,
        "DEVICE_IMAGE_MAX_ARRAY_SIZE"..0x1041,
        "DEVICE_PARENT_DEVICE"..0x1042,
        // TODO: DEVICE_PARTITION_MAX_COMPUTE_UNITS -> https://www.khronos.org/bugzilla/show_bug.cgi?id=580
        "DEVICE_PARTITION_MAX_SUB_DEVICES"..0x1043,
        "DEVICE_PARTITION_PROPERTIES"..0x1044,
        "DEVICE_PARTITION_AFFINITY_DOMAIN"..0x1045,
        "DEVICE_PARTITION_TYPE"..0x1046,
        "DEVICE_REFERENCE_COUNT"..0x1047,
        "DEVICE_PREFERRED_INTEROP_USER_SYNC"..0x1048,
        "DEVICE_PRINTF_BUFFER_SIZE"..0x1049
    )

    IntConstant(
        "FP_CORRECTLY_ROUNDED_DIVIDE_SQRT".."1 << 7"
    )

    IntConstant(
        "CONTEXT_INTEROP_USER_SYNC"..0x1085
    )

    IntConstant(
        "DEVICE_PARTITION_BY_COUNTS_LIST_END"..0x0
    )

    IntConstant(
        "DEVICE_PARTITION_EQUALLY"..0x1086
    )

    IntConstant(
        "DEVICE_PARTITION_BY_COUNTS"..0x1087
    )

    IntConstant(
        "DEVICE_PARTITION_BY_AFFINITY_DOMAIN"..0x1088
    )

    IntConstant(
        "DEVICE_AFFINITY_DOMAIN_NUMA".."1 << 0",
        "DEVICE_AFFINITY_DOMAIN_L4_CACHE".."1 << 1",
        "DEVICE_AFFINITY_DOMAIN_L3_CACHE".."1 << 2",
        "DEVICE_AFFINITY_DOMAIN_L2_CACHE".."1 << 3",
        "DEVICE_AFFINITY_DOMAIN_L1_CACHE".."1 << 4",
        "DEVICE_AFFINITY_DOMAIN_NEXT_PARTITIONABLE".."1 << 5"
    )

    IntConstant(
        "MEM_HOST_WRITE_ONLY".."1 << 7",
        "MEM_HOST_READ_ONLY".."1 << 8",
        "MEM_HOST_NO_ACCESS".."1 << 9"
    )

    IntConstant(
        "MIGRATE_MEM_OBJECT_HOST".."1 << 0",
        "MIGRATE_MEM_OBJECT_CONTENT_UNDEFINED".."1 << 1"
    )

    IntConstant(
        "MEM_OBJECT_IMAGE2D_ARRAY"..0x10F3,
        "MEM_OBJECT_IMAGE1D"..0x10F4,
        "MEM_OBJECT_IMAGE1D_ARRAY"..0x10F5,
        "MEM_OBJECT_IMAGE1D_BUFFER"..0x10F6
    )

    IntConstant(
        "IMAGE_ARRAY_SIZE"..0x1117,
        "IMAGE_BUFFER"..0x1118,
        "IMAGE_NUM_MIP_LEVELS"..0x1119,
        "IMAGE_NUM_SAMPLES"..0x111A
    )

    IntConstant(
        "MAP_WRITE_INVALIDATE_REGION".."1 << 2"
    )

    IntConstant(
        "PROGRAM_NUM_KERNELS"..0x1167,
        "PROGRAM_KERNEL_NAMES"..0x1168
    )

    IntConstant(
        "PROGRAM_BINARY_TYPE"..0x1184
    )

    IntConstant(
        "PROGRAM_BINARY_TYPE_NONE"..0x0,
        "PROGRAM_BINARY_TYPE_COMPILED_OBJECT"..0x1,
        "PROGRAM_BINARY_TYPE_LIBRARY"..0x2,
        "PROGRAM_BINARY_TYPE_EXECUTABLE"..0x4
    )

    IntConstant(
        "KERNEL_ATTRIBUTES"..0x1195
    )

    IntConstant(
        "KERNEL_ARG_ADDRESS_QUALIFIER"..0x1196,
        "KERNEL_ARG_ACCESS_QUALIFIER"..0x1197,
        "KERNEL_ARG_TYPE_NAME"..0x1198,
        "KERNEL_ARG_TYPE_QUALIFIER"..0x1199,
        "KERNEL_ARG_NAME"..0x119A
    )

    IntConstant(
        "KERNEL_ARG_ADDRESS_GLOBAL"..0x119B,
        "KERNEL_ARG_ADDRESS_LOCAL"..0x119C,
        "KERNEL_ARG_ADDRESS_CONSTANT"..0x119D,
        "KERNEL_ARG_ADDRESS_PRIVATE"..0x119E
    )

    IntConstant(
        "KERNEL_ARG_ACCESS_READ_ONLY"..0x11A0,
        "KERNEL_ARG_ACCESS_WRITE_ONLY"..0x11A1,
        "KERNEL_ARG_ACCESS_READ_WRITE"..0x11A2,
        "KERNEL_ARG_ACCESS_NONE"..0x11A3
    )

    IntConstant(
        "KERNEL_ARG_TYPE_NONE".."0",
        "KERNEL_ARG_TYPE_CONST".."1 << 0",
        "KERNEL_ARG_TYPE_RESTRICT".."1 << 1",
        "KERNEL_ARG_TYPE_VOLATILE".."1 << 2"
    )

    IntConstant(
        "KERNEL_GLOBAL_WORK_SIZE"..0x11B5
    )

    IntConstant(
        "COMMAND_BARRIER"..0x1205,
        "COMMAND_MIGRATE_MEM_OBJECTS"..0x1206,
        "COMMAND_FILL_BUFFER"..0x1207,
        "COMMAND_FILL_IMAGE"..0x1208
    )

    opaque_p(
        "GetExtensionFunctionAddressForPlatform",

        cl_platform_id("platform"),
        cl_charASCII.const.p("funcname")
    )

    cl_int(
        "RetainDevice",

        cl_device_id("device")
    )

    cl_int(
        "ReleaseDevice",

        cl_device_id("device")
    )

    cl_int(
        "CreateSubDevices",

        cl_device_id("in_device"),
        NullTerminated..cl_device_partition_property.const.p("properties"),
        AutoSize("out_devices")..cl_uint("num_devices"),
        nullable..cl_device_id.p("out_devices"),
        Check(1)..nullable..cl_uint.p("num_devices_ret")
    )

    cl_mem(
        "CreateImage",

        cl_context("context"),
        cl_mem_flags("flags"),
        cl_image_format.const.p("image_format"),
        cl_image_desc.const.p("image_desc"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Unsafe..nullable..void.p("host_ptr"),
        ERROR_RET
    )

    cl_program(
        "CreateProgramWithBuiltInKernels",

        cl_context("context"),
        AutoSize("device_list")..cl_uint("num_devices"),
        SingleValue("device")..cl_device_id.const.p("device_list"),
        cl_charASCII.const.p("kernel_names"),
        ERROR_RET
    )

    cl_int(
        "CompileProgram",

        cl_program("program"),
        AutoSize("device_list")..cl_uint("num_devices"),
        nullable..cl_device_id.const.p("device_list"),
        cl_charASCII.const.p("options"),
        AutoSize("input_headers", "header_include_names")..cl_uint("num_input_headers"),
        nullable..cl_program.const.p("input_headers"),
        nullable..cl_charASCII.const.p.p("header_include_names"),
        nullable..cl_program_callback("pfn_notify"),
        nullable..opaque_p("user_data")
    )

    cl_program(
        "LinkProgram",

        cl_context("context"),
        AutoSize("device_list")..cl_uint("num_devices"),
        nullable..cl_device_id.const.p("device_list"),
        cl_charASCII.const.p("options"),
        AutoSize("input_programs")..cl_uint("num_input_programs"),
        SingleValue("input_program")..nullable..cl_program.const.p("input_programs"),
        nullable..cl_program_callback("pfn_notify"),
        nullable..opaque_p("user_data"),
        ERROR_RET
    )

    cl_int(
        "UnloadPlatformCompiler",

        cl_platform_id("platform")
    )

    cl_int(
        "GetKernelArgInfo",

        cl_kernel("kernel"),
        cl_uint("arg_indx"),
        cl_kernel_arg_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_LONG)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_int(
        "EnqueueFillBuffer",

        cl_command_queue("command_queue"),
        cl_mem("buffer"),
        void.const.p("pattern"),
        AutoSize("pattern")..size_t("pattern_size"),
        size_t("offset"),
        size_t("size"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueFillImage",

        cl_command_queue("command_queue"),
        cl_mem("image"),
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Check(4 x 4)..void.const.p("fill_color"),
        Check(3)..size_t.const.p("origin"),
        Check(3)..size_t.const.p("region"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueMigrateMemObjects",

        cl_command_queue("command_queue"),
        AutoSize("mem_objects")..cl_uint("num_mem_objects"),
        cl_mem.const.p("mem_objects"),
        cl_mem_migration_flags("flags"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueMarkerWithWaitList",

        cl_command_queue("command_queue"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueBarrierWithWaitList",

        cl_command_queue("command_queue"),
        NEWL,
        EWL,
        EVENT
    )
}