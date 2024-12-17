/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val CL30 = "CL30".nativeClassCL("CL30") {
    extends = CL22
    IntConstant(
        "VERSION_3_0".."1"
    )

    IntConstant(
        "PLATFORM_NUMERIC_VERSION"..0x0906
    )

    IntConstant(
        "PLATFORM_EXTENSIONS_WITH_VERSION"..0x0907
    )

    IntConstant(
        "DEVICE_NUMERIC_VERSION"..0x105E
    )

    IntConstant(
        "DEVICE_EXTENSIONS_WITH_VERSION"..0x1060
    )

    IntConstant(
        "DEVICE_ILS_WITH_VERSION"..0x1061
    )

    IntConstant(
        "DEVICE_BUILT_IN_KERNELS_WITH_VERSION"..0x1062
    )

    IntConstant(
        "DEVICE_ATOMIC_MEMORY_CAPABILITIES"..0x1063
    )

    IntConstant(
        "DEVICE_ATOMIC_FENCE_CAPABILITIES"..0x1064
    )

    IntConstant(
        "DEVICE_NON_UNIFORM_WORK_GROUP_SUPPORT"..0x1065
    )

    IntConstant(
        "DEVICE_OPENCL_C_ALL_VERSIONS"..0x1066
    )

    IntConstant(
        "DEVICE_PREFERRED_WORK_GROUP_SIZE_MULTIPLE"..0x1067
    )

    IntConstant(
        "DEVICE_WORK_GROUP_COLLECTIVE_FUNCTIONS_SUPPORT"..0x1068
    )

    IntConstant(
        "DEVICE_GENERIC_ADDRESS_SPACE_SUPPORT"..0x1069
    )

    IntConstant(
        "DEVICE_OPENCL_C_FEATURES"..0x106F
    )

    IntConstant(
        "DEVICE_DEVICE_ENQUEUE_CAPABILITIES"..0x1070
    )

    IntConstant(
        "DEVICE_PIPE_SUPPORT"..0x1071
    )

    IntConstant(
        "DEVICE_LATEST_CONFORMANCE_VERSION_PASSED"..0x1072
    )

    IntConstant(
        "QUEUE_PROPERTIES_ARRAY"..0x1098
    )

    IntConstant(
        "MEM_PROPERTIES"..0x110A
    )

    IntConstant(
        "PIPE_PROPERTIES"..0x1122
    )

    IntConstant(
        "SAMPLER_PROPERTIES"..0x1158
    )

    IntConstant(
        "COMMAND_SVM_MIGRATE_MEM"..0x120E
    )

    IntConstant(
        "DEVICE_ATOMIC_ORDER_RELAXED".."(1 << 0)",
        "DEVICE_ATOMIC_ORDER_ACQ_REL".."(1 << 1)",
        "DEVICE_ATOMIC_ORDER_SEQ_CST".."(1 << 2)",
        "DEVICE_ATOMIC_SCOPE_WORK_ITEM".."(1 << 3)",
        "DEVICE_ATOMIC_SCOPE_WORK_GROUP".."(1 << 4)",
        "DEVICE_ATOMIC_SCOPE_DEVICE".."(1 << 5)",
        "DEVICE_ATOMIC_SCOPE_ALL_DEVICES".."(1 << 6)"
    )

    IntConstant(
        "DEVICE_QUEUE_SUPPORTED".."(1 << 0)",
        "DEVICE_QUEUE_REPLACEABLE_DEFAULT".."(1 << 1)"
    )

    IntConstant(
        "VERSION_MAJOR_BITS".."10",
        "VERSION_MINOR_BITS".."10",
        "VERSION_PATCH_BITS".."12",

        "VERSION_MAJOR_MASK".."((1 << CL_VERSION_MAJOR_BITS) - 1)",
        "VERSION_MINOR_MASK".."((1 << CL_VERSION_MINOR_BITS) - 1)",
        "VERSION_PATCH_MASK".."((1 << CL_VERSION_PATCH_BITS) - 1)",
    )

    macro(expression = "version >>> (CL_VERSION_MINOR_BITS + CL_VERSION_PATCH_BITS)")..uint32_t(
        "CL_VERSION_MAJOR",

        uint32_t("version"),

        noPrefix = true
    )

    macro(expression = "(version >>> CL_VERSION_PATCH_BITS) & CL_VERSION_MINOR_MASK")..uint32_t(
        "CL_VERSION_MINOR",

        uint32_t("version"),

        noPrefix = true
    )

    macro(expression = "version & CL_VERSION_PATCH_MASK")..uint32_t(
        "CL_VERSION_PATCH",

        uint32_t("version"),

        noPrefix = true
    )

    macro(expression = """((major & CL_VERSION_MAJOR_MASK) << (CL_VERSION_MINOR_BITS + CL_VERSION_PATCH_BITS)) |
               ((minor & CL_VERSION_MINOR_MASK) << CL_VERSION_PATCH_BITS) |
               (patch & CL_VERSION_PATCH_MASK)""")..uint32_t(
        "CL_MAKE_VERSION",

        uint32_t("major"),
        uint32_t("minor"),
        uint32_t("patch"),

        noPrefix = true
    )

    cl_int(
        "SetContextDestructorCallback",

        cl_context("context"),
        cl_context_destructor_callback("pfn_notify"),
        nullable..opaque_p("user_data")
    )

    cl_mem(
        "CreateBufferWithProperties",

        cl_context("context"),
        nullable..NullTerminated..cl_mem_properties.const.p("properties"),
        cl_mem_flags("flags"),
        AutoSize("host_ptr")..size_t("size"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..optional..void.p("host_ptr"),
        ERROR_RET
    )

    cl_mem(
        "CreateImageWithProperties",

        cl_context("context"),
        nullable..NullTerminated..cl_mem_properties.const.p("properties"),
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
}
