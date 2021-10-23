/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val arm_import_memory = "ARMImportMemory".nativeClassCL("arm_import_memory", ARM) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension adds a new function that allows for direct memory import into OpenCL via the #ImportMemoryARM() function.

        Memory imported through this interface will be mapped into the device's page tables directly, providing zero copy access. It will never fall back to
        copy operations and aliased buffers, instead producing an error when mapping is not possible.

        Types of memory supported for import are specified as additional extension strings.
        """

    IntConstant(
        "Default and valid properties name for {@code cl_arm_import_memory}.",

        "IMPORT_TYPE_ARM"..0x40B2
    )

    IntConstant(
        "Host process memory type default value for #IMPORT_TYPE_ARM property",

        "IMPORT_TYPE_HOST_ARM"..0x40B3
    )

    IntConstant(
        "DMA BUF memory type value for #IMPORT_TYPE_ARM property.",

        "IMPORT_TYPE_DMA_BUF_ARM"..0x40B4
    )

    IntConstant(
        "Protected memory property.",

        "IMPORT_TYPE_PROTECTED_ARM"..0x40B5
    )

    IntConstant(
        "Android hardware buffer type value for #IMPORT_TYPE_ARM property.",

        "IMPORT_TYPE_ANDROID_HARDWARE_BUFFER_ARM"..0x41E2
    )

    IntConstant(
        "Data consistency with host property.",

        "IMPORT_DMA_BUF_DATA_CONSISTENCY_WITH_HOST_ARM"..0x41E3
    )

    IntConstant(
        "Index of plane in a multiplanar hardware buffer.",

        "IMPORT_ANDROID_HARDWARE_BUFFER_PLANE_INDEX_ARM"..0x41EF
    )

    IntConstant(
        "Index of layer in a multilayer hardware buffer.",

        "IMPORT_ANDROID_HARDWARE_BUFFER_LAYER_INDEX_ARM"..0x41F0
    )

    LongConstant(
        "Import memory size value to indicate a size for the whole buffer.",

        "IMPORT_MEMORY_WHOLE_ALLOCATION_ARM".."-1L"
    )

    cl_mem(
        "ImportMemoryARM",
        "",

        cl_context("context", ""),
        cl_mem_flags("flags", ""),
        nullable..NullTerminated..cl_import_properties_arm.const.p("properties", ""),
        void.p("memory", ""),
        AutoSize("memory")..size_t("size", ""),
        ERROR_RET
    )
}
