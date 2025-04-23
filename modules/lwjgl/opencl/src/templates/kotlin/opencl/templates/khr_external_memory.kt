/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_external_memory = "KHRExternalMemory".nativeClassCL("khr_external_memory", KHR) {
    IntConstant(
        "PLATFORM_EXTERNAL_MEMORY_IMPORT_HANDLE_TYPES_KHR"..0x2044
    )

    IntConstant(
        "DEVICE_EXTERNAL_MEMORY_IMPORT_HANDLE_TYPES_KHR"..0x204F,
        "DEVICE_EXTERNAL_MEMORY_IMPORT_ASSUME_LINEAR_IMAGES_HANDLE_TYPES_KHR"..0x2052
    )

    IntConstant(
        "MEM_DEVICE_HANDLE_LIST_KHR"..0x2051,
        "MEM_DEVICE_HANDLE_LIST_END_KHR".."0"
    )

    IntConstant(
        "COMMAND_ACQUIRE_EXTERNAL_MEM_OBJECTS_KHR"..0x2047,
        "COMMAND_RELEASE_EXTERNAL_MEM_OBJECTS_KHR"..0x2048
    )

    cl_int(
        "EnqueueAcquireExternalMemObjectsKHR",

        cl_command_queue("command_queue"),
        AutoSize("mem_objects")..cl_uint("num_mem_objects"),
        cl_mem.const.p("mem_objects"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueReleaseExternalMemObjectsKHR",

        cl_command_queue("command_queue"),
        AutoSize("mem_objects")..cl_uint("num_mem_objects"),
        cl_mem.const.p("mem_objects"),
        NEWL,
        EWL,
        EVENT
    )
}

val khr_external_memory_dma_buf = "KHRExternalMemoryDMABuf".nativeClassCL("khr_external_memory_dma_buf", KHR) {
    IntConstant(
        "EXTERNAL_MEMORY_HANDLE_DMA_BUF_KHR"..0x2067
    )
}

val khr_external_memory_opaque_fd = "KHRExternalMemoryOpaqueFD".nativeClassCL("khr_external_memory_opaque_fd", KHR) {
    IntConstant(
        "EXTERNAL_MEMORY_HANDLE_OPAQUE_FD_KHR"..0x2060
    )
}

val khr_external_memory_win32 = "KHRExternalMemoryWin32".nativeClassCL("khr_external_memory_win32", KHR) {
    IntConstant(
        "EXTERNAL_MEMORY_HANDLE_OPAQUE_WIN32_KHR"..0x2061,
        "EXTERNAL_MEMORY_HANDLE_OPAQUE_WIN32_KMT_KHR"..0x2062,
        "EXTERNAL_MEMORY_HANDLE_OPAQUE_WIN32_NAME_KHR"..0x2069,
    )
}