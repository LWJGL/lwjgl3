/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val CL20 = "CL20".nativeClassCL("CL20") {
    extends = CL12
    IntConstant(
        "VERSION_2_0".."1"
    )

    IntConstant(
        "INVALID_PIPE_SIZE".."-69",
        "INVALID_DEVICE_QUEUE".."-70"
    )

    IntConstant(
        "DEVICE_QUEUE_ON_HOST_PROPERTIES"..0x102A
    )

    IntConstant(
        "DEVICE_IMAGE_PITCH_ALIGNMENT"..0x104A
    )

    IntConstant(
        "DEVICE_IMAGE_BASE_ADDRESS_ALIGNMENT"..0x104B
    )

    IntConstant(
        "DEVICE_MAX_READ_WRITE_IMAGE_ARGS"..0x104C
    )

    IntConstant(
        "DEVICE_MAX_GLOBAL_VARIABLE_SIZE"..0x104D
    )

    IntConstant(
        "DEVICE_QUEUE_ON_DEVICE_PROPERTIES"..0x104E,
        "DEVICE_QUEUE_ON_DEVICE_PREFERRED_SIZE"..0x104F,
        "DEVICE_QUEUE_ON_DEVICE_MAX_SIZE"..0x1050
    )

    IntConstant(
        "DEVICE_MAX_ON_DEVICE_QUEUES"..0x1051
    )

    IntConstant(
        "DEVICE_MAX_ON_DEVICE_EVENTS"..0x1052
    )

    IntConstant(
        "DEVICE_SVM_CAPABILITIES"..0x1053
    )

    IntConstant(
        "DEVICE_GLOBAL_VARIABLE_PREFERRED_TOTAL_SIZE"..0x1054
    )

    IntConstant(
        "DEVICE_MAX_PIPE_ARGS"..0x1055,
        "DEVICE_PIPE_MAX_ACTIVE_RESERVATIONS"..0x1056,
        "DEVICE_PIPE_MAX_PACKET_SIZE"..0x1057
    )

    IntConstant(
        "DEVICE_PREFERRED_PLATFORM_ATOMIC_ALIGNMENT"..0x1058,
        "DEVICE_PREFERRED_GLOBAL_ATOMIC_ALIGNMENT"..0x1059,
        "DEVICE_PREFERRED_LOCAL_ATOMIC_ALIGNMENT"..0x105A
    )

    IntConstant(
        "QUEUE_ON_DEVICE".."1 << 2",
        "QUEUE_ON_DEVICE_DEFAULT".."1 << 3"
    )

    IntConstant(
        "DEVICE_SVM_COARSE_GRAIN_BUFFER".."1 << 0",
        "DEVICE_SVM_FINE_GRAIN_BUFFER".."1 << 1",
        "DEVICE_SVM_FINE_GRAIN_SYSTEM".."1 << 2",
        "DEVICE_SVM_ATOMICS".."1 << 3"
    )

    IntConstant(
        "QUEUE_SIZE"..0x1094
    )

    IntConstant(
        "MEM_SVM_FINE_GRAIN_BUFFER".."1 << 10"
    )

    IntConstant(
        "MEM_SVM_ATOMICS".."1 << 11"
    )

    IntConstant(
        "MEM_KERNEL_READ_AND_WRITE".."1 << 12"
    )

    IntConstant(
        "MEM_OBJECT_PIPE"..0x10F7
    )

    IntConstant(
        "MEM_USES_SVM_POINTER"..0x1109
    )

    IntConstant(
        "sRGB"..0x10BF,
        "sRGBx"..0x10C0,
        "sRGBA"..0x10C1,
        "sBGRA"..0x10C2,
        "ABGR"..0x10C3
    )

    IntConstant(
        "PIPE_PACKET_SIZE"..0x1120
    )

    IntConstant(
        "PIPE_MAX_PACKETS"..0x1121
    )

    IntConstant(
        "SAMPLER_MIP_FILTER_MODE"..0x1155,
        "SAMPLER_LOD_MIN"..0x1156,
        "SAMPLER_LOD_MAX"..0x1157
    )

    IntConstant(
        "PROGRAM_BUILD_GLOBAL_VARIABLE_TOTAL_SIZE"..0x1185
    )

    IntConstant(
        "KERNEL_ARG_TYPE_PIPE".."1 << 3"
    )

    IntConstant(
        "KERNEL_EXEC_INFO_SVM_PTRS"..0x11B6
    )

    IntConstant(
        "KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM"..0x11B7
    )

    IntConstant(
        "COMMAND_SVM_FREE"..0x1209,
        "COMMAND_SVM_MEMCPY"..0x120A,
        "COMMAND_SVM_MEMFILL"..0x120B,
        "COMMAND_SVM_MAP"..0x120C,
        "COMMAND_SVM_UNMAP"..0x120D
    )

    IntConstant(
        "PROFILING_COMMAND_COMPLETE"..0x1284
    )

    cl_command_queue(
        "CreateCommandQueueWithProperties",

        cl_context("context"),
        cl_device_id("device"),
        nullable..NullTerminated..cl_queue_properties.const.p("properties"),
        ERROR_RET
    )

    cl_mem(
        "CreatePipe",

        cl_context("context"),
        cl_mem_flags("flags"),
        cl_uint("pipe_packet_size"),
        cl_uint("pipe_max_packets"),
        nullable..NullTerminated..cl_pipe_properties.const.p("properties"),
        ERROR_RET
    )

    cl_int(
        "GetPipeInfo",

        cl_mem("pipe"),
        cl_pipe_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_INT)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    void.p(
        "SVMAlloc",

        cl_context("context"),
        cl_svm_mem_flags("flags"),
        AutoSizeResult..size_t("size"),
        unsigned_int("alignment")
    )

    void(
        "SVMFree",

        cl_context("context"),
        Unsafe..void.p("svm_pointer")
    )

    cl_int(
        "EnqueueSVMFree",

        cl_command_queue("command_queue"),
        AutoSize("svm_pointers")..cl_uint("num_svm_pointers"),
        void.p.p("svm_pointers"),
        nullable..cl_svmfree_callback("pfn_free_func"),
        nullable..opaque_p("user_data"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueSVMMemcpy",

        cl_command_queue("command_queue"),
        cl_bool("blocking_copy"),
        void.p("dst_ptr"),
        void.const.p("src_ptr"),
        AutoSize("src_ptr", "dst_ptr")..size_t("size"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueSVMMemFill",

        cl_command_queue("command_queue"),
        void.p("svm_ptr"),
        void.const.p("pattern"),
        AutoSize("pattern")..size_t("pattern_size"),
        AutoSize("svm_ptr")..size_t("size"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueSVMMap",

        cl_command_queue("command_queue"),
        cl_bool("blocking_map"),
        cl_map_flags("map_flags"),
        void.p("svm_ptr"),
        AutoSize("svm_ptr")..size_t("size"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueSVMUnmap",

        cl_command_queue("command_queue"),
        Unsafe..void.p("svm_ptr"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "SetKernelArgSVMPointer",

        cl_kernel("kernel"),
        cl_uint("arg_index"),
        Unsafe..void.const.p("arg_value")
    )

    cl_int(
        "SetKernelExecInfo",

        cl_kernel("kernel"),
        cl_kernel_exec_info("param_name"),
        AutoSize("param_value")..size_t("param_value_size"),
        MultiType(PointerMapping.DATA_POINTER, PointerMapping.DATA_INT)..void.const.p("param_value")
    )

    cl_sampler(
        "CreateSamplerWithProperties",

        cl_context("context"),
        nullable..NullTerminated..cl_sampler_properties.const.p("sampler_properties"),
        ERROR_RET
    )
}
