/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl

import org.lwjgl.generator.*

// numeric

val cl_char = typedef(int8_t, "cl_char")
val cl_uchar = typedef(uint8_t, "cl_uchar")
val cl_short = typedef(int16_t, "cl_short")
val cl_ushort = typedef(uint16_t, "cl_ushort")
val cl_int = typedef(int32_t, "cl_int")
val cl_uint = typedef(uint32_t, "cl_uint")
val cl_long = typedef(int64_t, "cl_long")
val cl_ulong = typedef(uint64_t, "cl_ulong")
val cl_half = PrimitiveType("cl_half", PrimitiveMapping.SHORT)
val cl_float = typedef(float, "cl_float")
val cl_double = typedef(double, "cl_double")

// objects

val cl_platform_id = "cl_platform_id".handle
val cl_device_id = "cl_device_id".handle
val cl_context = "cl_context".handle
val cl_command_queue = "cl_command_queue".handle
val cl_mem = "cl_mem".handle
val cl_program = "cl_program".handle
val cl_kernel = "cl_kernel".handle
val cl_event = "cl_event".handle
val cl_sampler = "cl_sampler".handle

// typedefs

val cl_bool = typedef(intb, "cl_bool")
val cl_bitfield = typedef(cl_ulong, "cl_bitfield")
val cl_properties = typedef(cl_ulong, "cl_properties")
val cl_device_type = typedef(cl_bitfield, "cl_device_type")
val cl_platform_info = typedef(cl_uint, "cl_platform_info")
val cl_device_info = typedef(cl_uint, "cl_device_info")
val cl_device_fp_config = typedef(cl_bitfield, "cl_device_fp_config")
val cl_device_mem_cache_type = typedef(cl_uint, "cl_device_mem_cache_type")
val cl_device_local_mem_type = typedef(cl_uint, "cl_device_local_mem_type")
val cl_device_exec_capabilities = typedef(cl_bitfield, "cl_device_exec_capabilities")
val cl_device_svm_capabilities = typedef(cl_bitfield, "cl_device_svm_capabilities")
val cl_command_queue_properties = typedef(cl_bitfield, "cl_command_queue_properties")
val cl_device_partition_property = typedef(intptr_t, "cl_device_partition_property")
val cl_device_affinity_domain = typedef(cl_bitfield, "cl_device_affinity_domain")

val cl_context_properties = typedef(intptr_t, "cl_context_properties")
val cl_context_info = typedef(cl_uint, "cl_context_info")
val cl_queue_properties = typedef(cl_properties, "cl_queue_properties")
val cl_command_queue_info = typedef(cl_uint, "cl_command_queue_info")
val cl_channel_order = typedef(cl_uint, "cl_channel_order")
val cl_channel_type = typedef(cl_uint, "cl_channel_type")
val cl_mem_flags = typedef(cl_bitfield, "cl_mem_flags")
val cl_svm_mem_flags = typedef(cl_bitfield, "cl_svm_mem_flags")
val cl_mem_object_type = typedef(cl_uint, "cl_mem_object_type")
val cl_mem_info = typedef(cl_uint, "cl_mem_info")
val cl_mem_migration_flags = typedef(cl_bitfield, "cl_mem_migration_flags")
val cl_image_info = typedef(cl_uint, "cl_image_info")
val cl_buffer_create_type = typedef(cl_uint, "cl_buffer_create_type")
val cl_addressing_mode = typedef(cl_uint, "cl_addressing_mode")
val cl_filter_mode = typedef(cl_uint, "cl_filter_mode")
val cl_sampler_info = typedef(cl_uint, "cl_sampler_info")
val cl_map_flags = typedef(cl_bitfield, "cl_map_flags")
val cl_pipe_properties = typedef(intptr_t, "cl_pipe_properties")
val cl_pipe_info = typedef(cl_uint, "cl_pipe_info")
val cl_program_info = typedef(cl_uint, "cl_program_info")
val cl_program_build_info = typedef(cl_uint, "cl_program_build_info")
val cl_program_binary_type = typedef(cl_uint, "cl_program_binary_type")
val cl_build_status = typedef(cl_int, "cl_build_status")
val cl_kernel_info = typedef(cl_uint, "cl_kernel_info")
val cl_kernel_arg_info = typedef(cl_uint, "cl_kernel_arg_info")
val cl_kernel_arg_address_qualifier = typedef(cl_uint, "cl_kernel_arg_address_qualifier")
val cl_kernel_arg_access_qualifier = typedef(cl_uint, "cl_kernel_arg_access_qualifier")
val cl_kernel_arg_type_qualifier = typedef(cl_bitfield, "cl_kernel_arg_type_qualifier")
val cl_kernel_work_group_info = typedef(cl_uint, "cl_kernel_work_group_info")
val cl_kernel_sub_group_info = typedef(cl_uint, "cl_kernel_sub_group_info")
val cl_event_info = typedef(cl_uint, "cl_event_info")
val cl_command_type = typedef(cl_uint, "cl_command_type")
val cl_profiling_info = typedef(cl_uint, "cl_profiling_info")
val cl_sampler_properties = typedef(cl_properties, "cl_sampler_properties")
val cl_kernel_exec_info = typedef(cl_uint, "cl_kernel_exec_info")
val cl_device_atomic_capabilities = typedef(cl_bitfield, "cl_device_atomic_capabilities")
val cl_device_device_enqueue_capabilities = typedef(cl_bitfield, "cl_device_device_enqueue_capabilities")
val cl_khronos_vendor_id = typedef(cl_uint, "cl_khronos_vendor_id")
val cl_mem_properties = typedef(cl_properties, "cl_mem_properties")
val cl_version = typedef(cl_uint, "cl_version")

val cl_icdl_info = typedef(cl_uint, "cl_icdl_info")

// strings

val cl_charASCII = CharType("cl_char", CharMapping.ASCII)
val cl_charUTF8 = CharType("cl_char", CharMapping.UTF8)

// structs

val cl_image_format = struct(Module.OPENCL, "CLImageFormat", nativeName = "cl_image_format") {
    cl_channel_order("image_channel_order")
    cl_channel_type("image_channel_data_type")
}

val cl_image_desc = struct(Module.OPENCL, "CLImageDesc", nativeName = "cl_image_desc") {
    cl_mem_object_type("image_type")
    size_t("image_width")
    size_t("image_height")
    size_t("image_depth")
    size_t("image_array_size")
    size_t("image_row_pitch")
    size_t("image_slice_pitch")
    cl_uint("num_mip_levels")
    cl_uint("num_samples")
    union {
        nullable..cl_mem("buffer")
        nullable..cl_mem("mem_object")
    }
}

val cl_bus_address_amd = struct(Module.OPENCL, "CLBusAddressAMD", nativeName = "cl_bus_address_amd") {
    cl_long("surfbusaddress")
    cl_long("signalbusaddress")
}

fun config() {
    struct(Module.OPENCL, "CLBufferRegion", nativeName = "cl_buffer_region") {
        size_t("origin")
        size_t("size")
    }

    val CL_NAME_VERSION_MAX_NAME_SIZE = 64
    struct(Module.OPENCL, "CLNameVersion", nativeName = "cl_name_version", mutable = false) {
        cl_version("version")
        charASCII("name")[CL_NAME_VERSION_MAX_NAME_SIZE]
    }.definition.setUsageOutput()

    union(Module.OPENCL, "CLDeviceTopologyAMD", nativeName = "cl_device_topology_amd", mutable = false) {
        struct {
            cl_uint("type")
            cl_uint("data")[5]
        }("raw")
        struct {
            cl_uint("type")
            padding(17)
            cl_char("bus")
            cl_char("device")
            cl_char("function")
        }("pcie")
    }.definition.setUsageOutput()

    struct(Module.OPENCL, "CLMotionEstimationDescINTEL", nativeName = "cl_motion_estimation_desc_intel") {
        cl_uint("mb_block_type")
        cl_uint("subpixel_mode")
        cl_uint("sad_adjust_mode")
        cl_uint("search_path_type")
    }.definition.setUsageInput()

    val CL_QUEUE_FAMILY_MAX_NAME_SIZE_INTEL = 64
    struct(Module.OPENCL, "CLQueueFamilyPropertiesINTEL", nativeName = "cl_queue_family_properties_intel", mutable = false) {
        cl_command_queue_properties("properties")
        cl_command_queue_capabilities_intel("capabilities")
        cl_uint("count")
        charASCII("name")[CL_QUEUE_FAMILY_MAX_NAME_SIZE_INTEL]
    }.definition.setUsageOutput()

    struct(Module.OPENCL, "CLDevicePCIBusInfoKHR", nativeName = "cl_device_pci_bus_info_khr", mutable = false) {
        cl_uint("pci_domain")
        cl_uint("pci_bus")
        cl_uint("pci_device")
        cl_uint("pci_function")
    }.definition.setUsageOutput()

    struct(Module.OPENCL, "CLDeviceIntegerDotProductAccelerationPropertiesKHR", nativeName = "cl_device_integer_dot_product_acceleration_properties_khr", mutable = false) {
        cl_bool("signed_accelerated")
        cl_bool("unsigned_accelerated")
        cl_bool("mixed_signedness_accelerated")
        cl_bool("accumulating_saturating_signed_accelerated")
        cl_bool("accumulating_saturating_unsigned_accelerated")
        cl_bool("accumulating_saturating_mixed_signedness_accelerated")
    }.definition.setUsageOutput()

    val CL_NAME_VERSION_MAX_NAME_SIZE_KHR = 64
    struct(Module.OPENCL, "CLNameVersionKHR", nativeName = "cl_name_version_khr", mutable = false) {
        cl_version_khr("version")
        charASCII("name")[CL_NAME_VERSION_MAX_NAME_SIZE_KHR]
    }.definition.setUsageOutput()
}

// callback functions
val cl_context_callback = Module.OPENCL.callback {
    void(
        "CLContextCallback",

        NullTerminated..cl_charUTF8.const.p("errinfo"),
        void.const.p("private_info"),
        AutoSize("private_info")..size_t("cb"),
        void.p("user_data")
    ) {}
}

val cl_program_callback = Module.OPENCL.callback {
    void(
        "CLProgramCallback",

        cl_program("program"),
        void.p("user_data")
    ) {}
}

val cl_native_kernel = Module.OPENCL.callback {
    void(
        "CLNativeKernel",

        void.p("args")
    ) {}
}

val cl_mem_object_destructor_callback = Module.OPENCL.callback {
    void(
        "CLMemObjectDestructorCallback",

        cl_mem("memobj"),
        void.p("user_data")
    ) {}
}

val cl_event_callback = Module.OPENCL.callback {
    void(
        "CLEventCallback",
        cl_event("event"),
        cl_int("event_command_exec_status"),
        void.p("user_data")
    ) {}
}

val cl_svmfree_callback = Module.OPENCL.callback {
    void(
        "CLSVMFreeCallback",
        cl_command_queue("queue"),
        AutoSize("svm_pointers")..cl_uint("num_svm_pointers"),
        void.p.p("svm_pointers"),
        void.p("user_data")
    ) {}
}

val cl_program_release_callback = Module.OPENCL.callback {
    void(
        "CLProgramReleaseCallback",

        cl_program("program"),
        void.p("user_data")
    ) {
    }
}

val cl_context_destructor_callback = Module.OPENCL.callback {
    void(
        "CLContextDestructorCallback",

        cl_context("context"),
        void.p("user_data")
    ) {
    }
}

// OpenGL interop

val GLint = IntegerType("GLint", PrimitiveMapping.INT)
val GLuint = IntegerType("GLuint", PrimitiveMapping.INT, unsigned = true)
val GLenum = IntegerType("GLenum", PrimitiveMapping.INT, unsigned = true)
val GLsync = "GLsync".handle

val cl_gl_context_info = IntegerType("cl_gl_context_info", PrimitiveMapping.INT)
val cl_gl_platform_info = IntegerType("cl_gl_platform_info", PrimitiveMapping.INT)
val cl_gl_object_type = IntegerType("cl_gl_object_type", PrimitiveMapping.INT)
val cl_gl_texture_info = IntegerType("cl_gl_texture_info", PrimitiveMapping.INT)

// EGL interop

val CLeglImageKHR = "CLeglImageKHR".handle
val CLeglDisplayKHR = "CLeglDisplayKHR".handle
val CLeglSyncKHR = "CLeglSyncKHR".handle

val cl_egl_image_properties_khr = typedef(intptr_t, "cl_egl_image_properties_khr")

// APPLE

val cl_queue_properties_APPLE = typedef(intptr_t, "cl_queue_properties_APPLE")

// ARM

val cl_import_properties_arm = typedef(intptr_t, "cl_import_properties_arm")

// EXT

val cl_report_live_objects_altera_callback = Module.OPENCL.callback {
    void(
        "CLReportLiveObjectsAlteraCallback",

        void.p("user_data"),
        void.p("obj_ptr"),
        charASCII.const.p("type_name"),
        cl_uint("refcount")
    ) {}
}

val cl_device_partition_property_ext = typedef(cl_bitfield, "cl_device_partition_property_ext")
val cl_mem_migration_flags_ext = typedef(cl_bitfield, "cl_mem_migration_flags_ext")

val cl_image_pitch_info_qcom = typedef(cl_uint, "cl_image_pitch_info_qcom")
val cl_mem_ext_host_ptr = struct(Module.OPENCL, "CLMemEXTHostPtr", nativeName = "cl_mem_ext_host_ptr") {
    cl_uint("allocation_type")
    cl_uint("host_cache_policy")
}.p

val cl_image_requirements_info_ext = typedef(cl_uint, "cl_image_requirements_info_ext")

val cl_mem_device_address_ext = typedef(cl_ulong, "cl_mem_device_address_ext")

// IMG

val cl_mipmap_filter_mode_img = typedef(cl_uint, "cl_mipmap_filter_mode_img")

// INTEL

val cl_accelerator_intel = "cl_accelerator_intel".handle
val cl_accelerator_type_intel = typedef(cl_uint, "cl_accelerator_type_intel")
val cl_accelerator_info_intel = typedef(cl_uint, "cl_accelerator_info_intel")
val cl_mem_info_intel = typedef(cl_uint, "cl_mem_info_intel")

val cl_mem_advice_intel = typedef(cl_bitfield, "cl_mem_advice_intel")
val cl_mem_properties_intel = typedef(cl_bitfield, "cl_mem_properties_intel")

val cl_va_api_device_source_intel = typedef(cl_uint, "cl_va_api_device_source_intel")
val cl_va_api_device_set_intel = typedef(cl_uint, "cl_va_api_device_set_intel")
val VASurfaceID = typedef(unsigned_int, "VASurfaceID")
val VAImageFormat = "VAImageFormat".handle // struct
val cl_command_queue_capabilities_intel = typedef(cl_bitfield, "cl_command_queue_capabilities_intel")

// KHR

val cl_command_buffer_khr = "cl_command_buffer_khr".handle
val cl_mutable_command_khr = "cl_mutable_command_khr".handle
val cl_semaphore_khr = "cl_semaphore_khr".handle

val cl_command_buffer_info_khr = typedef(cl_uint, "cl_command_buffer_info_khr")
val cl_command_buffer_properties_khr = typedef(cl_properties, "cl_command_buffer_properties_khr")
val cl_command_properties_khr = typedef(cl_properties, "cl_command_properties_khr")
val cl_device_kernel_clock_capabilities_khr = typedef(cl_bitfield, "cl_device_kernel_clock_capabilities_khr")
val cl_ndrange_kernel_command_properties_khr = typedef(cl_properties, "cl_ndrange_kernel_command_properties_khr")
val cl_queue_properties_khr = typedef(cl_properties, "cl_queue_properties_khr")
val cl_semaphore_properties_khr = typedef(cl_properties, "cl_semaphore_properties_khr")
val cl_semaphore_info_khr = typedef(cl_uint, "cl_semaphore_info_khr")
val cl_semaphore_type_khr = typedef(cl_uint, "cl_semaphore_type_khr")
val cl_semaphore_payload_khr = typedef(cl_ulong, "cl_semaphore_payload_khr")
val cl_sync_point_khr = typedef(cl_uint, "cl_sync_point_khr")
val cl_version_khr = typedef(cl_uint, "cl_version_khr")

val cl_command_buffer_update_type_khr = typedef(cl_uint, "cl_command_buffer_update_type_khr")
val cl_mutable_dispatch_fields_khr = typedef(cl_bitfield, "cl_mutable_dispatch_fields_khr")
val cl_mutable_command_info_khr = typedef(cl_uint, "cl_mutable_command_info_khr")
val cl_mutable_dispatch_asserts_khr = typedef(cl_bitfield, "cl_mutable_dispatch_asserts_khr")

val cl_semaphore_reimport_properties_khr = typedef(cl_properties, "cl_semaphore_reimport_properties_khr")

val cl_mutable_dispatch_arg_khr = struct(Module.OPENCL, "CLMutableDispatchArgKHR", nativeName = "cl_mutable_dispatch_arg_khr") {
    cl_uint("arg_index")
    AutoSize("arg_value")..size_t("arg_size")
    nullable..void.const.p("arg_value")
}

val cl_mutable_dispatch_exec_info_khr = struct(Module.OPENCL, "CLMutableDispatchExecInfoKHR", nativeName = "cl_mutable_dispatch_exec_info_khr") {
    cl_uint("param_name")
    AutoSize("param_value")..size_t("param_value_size")
    nullable..void.const.p("param_value")
}

val cl_mutable_dispatch_config_khr = struct(Module.OPENCL, "CLMutableDispatchConfigKHR", nativeName = "cl_mutable_dispatch_config_khr") {
    cl_mutable_command_khr("command")
    AutoSize("arg_list")..cl_uint("num_args")
    AutoSize("arg_svm_list")..cl_uint("num_svm_args")
    AutoSize("exec_info_list")..cl_uint("num_exec_infos")
    cl_uint("work_dim")
    nullable..cl_mutable_dispatch_arg_khr.const.p("arg_list")
    nullable..cl_mutable_dispatch_arg_khr.const.p("arg_svm_list")
    nullable..cl_mutable_dispatch_exec_info_khr.const.p("exec_info_list")
    Check("work_dim")..nullable..size_t.const.p("global_work_offset")
    Check("work_dim")..nullable..size_t.const.p("global_work_size")
    Check("work_dim")..nullable..size_t.const.p("local_work_size")
}

// NV

val cl_mem_flags_NV = typedef(cl_bitfield, "cl_mem_flags_NV")

// QCOM

val cl_perf_hint_qcom = typedef(cl_uint, "cl_perf_hint_qcom")