/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val arm_import_memory = "ARMImportMemory".nativeClassCL("arm_import_memory", ARM) {
    LongConstant(
        "IMPORT_TYPE_ARM"..0x40B2L,
        "IMPORT_TYPE_HOST_ARM"..0x40B3L,
        "IMPORT_TYPE_DMA_BUF_ARM"..0x40B4L,
        "IMPORT_TYPE_PROTECTED_ARM"..0x40B5L
    )

    LongConstant(
        "IMPORT_TYPE_ANDROID_HARDWARE_BUFFER_ARM"..0x41E2L,
        "IMPORT_DMA_BUF_DATA_CONSISTENCY_WITH_HOST_ARM"..0x41E3L
    )

    LongConstant(
        "IMPORT_ANDROID_HARDWARE_BUFFER_PLANE_INDEX_ARM"..0x41EFL,
        "IMPORT_ANDROID_HARDWARE_BUFFER_LAYER_INDEX_ARM"..0x41F0L
    )

    LongConstant(
        "IMPORT_MEMORY_WHOLE_ALLOCATION_ARM".."-1L"
    )

    cl_mem(
        "ImportMemoryARM",

        cl_context("context"),
        cl_mem_flags("flags"),
        nullable..NullTerminated..cl_import_properties_arm.const.p("properties"),
        void.p("memory"),
        AutoSize("memory")..size_t("size"),
        ERROR_RET
    )
}
