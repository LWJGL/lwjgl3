/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_unified_svm = "KHRUnifiedSVM".nativeClassCL("khr_unified_svm", KHR) {
    IntConstant(
        "PLATFORM_SVM_TYPE_CAPABILITIES_KHR"..0x0909
    )

    IntConstant(
        "DEVICE_SVM_TYPE_CAPABILITIES_KHR"..0x1077
    )

    LongConstant(
        "SVM_CAPABILITY_SINGLE_ADDRESS_SPACE_KHR".."1L << 0",
        "SVM_CAPABILITY_SYSTEM_ALLOCATED_KHR".."1L << 1",
        "SVM_CAPABILITY_DEVICE_OWNED_KHR".."1L << 2",
        "SVM_CAPABILITY_DEVICE_UNASSOCIATED_KHR".."1L << 3",
        "SVM_CAPABILITY_CONTEXT_ACCESS_KHR".."1L << 4",
        "SVM_CAPABILITY_HOST_OWNED_KHR".."1L << 5",
        "SVM_CAPABILITY_HOST_READ_KHR".."1L << 6",
        "SVM_CAPABILITY_HOST_WRITE_KHR".."1L << 7",
        "SVM_CAPABILITY_HOST_MAP_KHR".."1L << 8",
        "SVM_CAPABILITY_DEVICE_READ_KHR".."1L << 9",
        "SVM_CAPABILITY_DEVICE_WRITE_KHR".."1L << 10",
        "SVM_CAPABILITY_DEVICE_ATOMIC_ACCESS_KHR".."1L << 11",
        "SVM_CAPABILITY_CONCURRENT_ACCESS_KHR".."1L << 12",
        "SVM_CAPABILITY_CONCURRENT_ATOMIC_ACCESS_KHR".."1L << 13",
        "SVM_CAPABILITY_INDIRECT_ACCESS_KHR".."1L << 14"
    )

    IntConstant(
        "SVM_ALLOC_ASSOCIATED_DEVICE_HANDLE_KHR"..0x2078,
        "SVM_ALLOC_ACCESS_FLAGS_KHR"..0x2079,
        "SVM_ALLOC_ALIGNMENT_KHR"..0x207A
    )

    LongConstant(
        "SVM_ALLOC_ACCESS_HOST_NOREAD_KHR".."1L << 0",
        "SVM_ALLOC_ACCESS_HOST_NOWRITE_KHR".."1L << 1",
        "SVM_ALLOC_ACCESS_DEVICE_NOREAD_KHR".."1L << 8",
        "SVM_ALLOC_ACCESS_DEVICE_NOWRITE_KHR".."1L << 9"
    )

    IntConstant(
        "SVM_INFO_TYPE_INDEX_KHR"..0x2088,
        "SVM_INFO_CAPABILITIES_KHR"..0x2089,
        "SVM_INFO_PROPERTIES_KHR"..0x208A,
        "SVM_INFO_ACCESS_FLAGS_KHR"..0x208B,
        "SVM_INFO_BASE_PTR_KHR"..0x419B,
        "SVM_INFO_SIZE_KHR"..0x419C,
        "SVM_INFO_ASSOCIATED_DEVICE_HANDLE_KHR"..0x419D
    )

    IntConstant(
        "KERNEL_EXEC_INFO_SVM_INDIRECT_ACCESS_KHR"..0x11BB
    )

    LongConstant(
        "SVM_TYPE_MACRO_COARSE_GRAIN_BUFFER_KHR".."""
        CL_SVM_CAPABILITY_SINGLE_ADDRESS_SPACE_KHR |
        CL_SVM_CAPABILITY_DEVICE_UNASSOCIATED_KHR |
        CL_SVM_CAPABILITY_CONTEXT_ACCESS_KHR      |
        CL_SVM_CAPABILITY_HOST_MAP_KHR            |
        CL_SVM_CAPABILITY_DEVICE_READ_KHR         |
        CL_SVM_CAPABILITY_DEVICE_WRITE_KHR        |
        CL_SVM_CAPABILITY_DEVICE_ATOMIC_ACCESS_KHR""",

        "SVM_TYPE_MACRO_FINE_GRAIN_BUFFER_KHR".."""
        CL_SVM_CAPABILITY_SINGLE_ADDRESS_SPACE_KHR |
        CL_SVM_CAPABILITY_DEVICE_UNASSOCIATED_KHR  |
        CL_SVM_CAPABILITY_CONTEXT_ACCESS_KHR       |
        CL_SVM_CAPABILITY_HOST_READ_KHR            |
        CL_SVM_CAPABILITY_HOST_WRITE_KHR           |
        CL_SVM_CAPABILITY_HOST_MAP_KHR             |
        CL_SVM_CAPABILITY_DEVICE_READ_KHR          |
        CL_SVM_CAPABILITY_DEVICE_WRITE_KHR         |
        CL_SVM_CAPABILITY_DEVICE_ATOMIC_ACCESS_KHR |
        CL_SVM_CAPABILITY_CONCURRENT_ACCESS_KHR""",

        "SVM_TYPE_MACRO_DEVICE_KHR".."""
        CL_SVM_CAPABILITY_SINGLE_ADDRESS_SPACE_KHR |
        CL_SVM_CAPABILITY_DEVICE_OWNED_KHR         |
        CL_SVM_CAPABILITY_DEVICE_READ_KHR          |
        CL_SVM_CAPABILITY_DEVICE_WRITE_KHR         |
        CL_SVM_CAPABILITY_DEVICE_ATOMIC_ACCESS_KHR |
        CL_SVM_CAPABILITY_INDIRECT_ACCESS_KHR""",

        "SVM_TYPE_MACRO_HOST_KHR".."""
        CL_SVM_CAPABILITY_SINGLE_ADDRESS_SPACE_KHR |
        CL_SVM_CAPABILITY_DEVICE_UNASSOCIATED_KHR  |
        CL_SVM_CAPABILITY_CONTEXT_ACCESS_KHR       |
        CL_SVM_CAPABILITY_HOST_OWNED_KHR           |
        CL_SVM_CAPABILITY_HOST_READ_KHR            |
        CL_SVM_CAPABILITY_HOST_WRITE_KHR           |
        CL_SVM_CAPABILITY_DEVICE_READ_KHR          |
        CL_SVM_CAPABILITY_DEVICE_WRITE_KHR         |
        CL_SVM_CAPABILITY_INDIRECT_ACCESS_KHR""",

        "SVM_TYPE_MACRO_SINGLE_DEVICE_SHARED_KHR".."""
        CL_SVM_CAPABILITY_SINGLE_ADDRESS_SPACE_KHR |
        CL_SVM_CAPABILITY_HOST_READ_KHR            |
        CL_SVM_CAPABILITY_HOST_WRITE_KHR           |
        CL_SVM_CAPABILITY_DEVICE_READ_KHR          |
        CL_SVM_CAPABILITY_DEVICE_WRITE_KHR         |
        CL_SVM_CAPABILITY_INDIRECT_ACCESS_KHR""",

        "SVM_TYPE_MACRO_SYSTEM_KHR".."""
        CL_SVM_CAPABILITY_SINGLE_ADDRESS_SPACE_KHR |
        CL_SVM_CAPABILITY_SYSTEM_ALLOCATED_KHR     |
        CL_SVM_CAPABILITY_DEVICE_UNASSOCIATED_KHR  |
        CL_SVM_CAPABILITY_CONTEXT_ACCESS_KHR       |
        CL_SVM_CAPABILITY_HOST_READ_KHR            |
        CL_SVM_CAPABILITY_HOST_WRITE_KHR           |
        CL_SVM_CAPABILITY_HOST_MAP_KHR             |
        CL_SVM_CAPABILITY_DEVICE_READ_KHR          |
        CL_SVM_CAPABILITY_DEVICE_WRITE_KHR         |
        CL_SVM_CAPABILITY_DEVICE_ATOMIC_ACCESS_KHR |
        CL_SVM_CAPABILITY_CONCURRENT_ACCESS_KHR    |
        CL_SVM_CAPABILITY_CONCURRENT_ATOMIC_ACCESS_KHR |
        CL_SVM_CAPABILITY_INDIRECT_ACCESS_KHR"""
    )

    void.p(
        "SVMAllocWithPropertiesKHR",

        cl_context("context"),
        nullable..NullTerminated..cl_svm_alloc_properties_khr.const.p("properties"),
        cl_uint("svm_type_index"),
        AutoSizeResult..size_t("size"),
        ERROR_RET
    )

    cl_int(
        "SVMFreeWithPropertiesKHR",

        cl_context("context"),
        nullable..NullTerminated..cl_svm_free_properties_khr.const.p("properties"),
        cl_svm_free_flags_khr("flags"),
        Unsafe..void.p("ptr")
    )

    cl_int(
        "GetSVMPointerInfoKHR",

        cl_context("context"),
        cl_device_id("device"),
        Unsafe..void.const.p("ptr"),
        cl_svm_pointer_info_khr("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_POINTER
        )..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_int(
        "GetSVMSuggestedTypeIndexKHR",

        cl_context("context"),
        cl_svm_capabilities_khr("required_capabilities"),
        cl_svm_capabilities_khr("desired_capabilities"),
        nullable..NullTerminated..cl_svm_alloc_properties_khr.const.p("properties"),
        size_t("size"),
        Check("1")..cl_uint.p("suggested_svm_type_index")
    )
}