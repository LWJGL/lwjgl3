/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_external_semaphore = "KHRExternalSemaphore".nativeClassCL("khr_external_semaphore", KHR) {
    IntConstant(
        "PLATFORM_SEMAPHORE_IMPORT_HANDLE_TYPES_KHR"..0x2037,
        "PLATFORM_SEMAPHORE_EXPORT_HANDLE_TYPES_KHR"..0x2038
    )

    IntConstant(
        "DEVICE_SEMAPHORE_IMPORT_HANDLE_TYPES_KHR"..0x204D,
        "DEVICE_SEMAPHORE_EXPORT_HANDLE_TYPES_KHR"..0x204E
    )

    IntConstant(
        "SEMAPHORE_EXPORT_HANDLE_TYPES_KHR"..0x203F,
        "SEMAPHORE_EXPORT_HANDLE_TYPES_LIST_END_KHR".."0"
    )

    IntConstant(
        "SEMAPHORE_EXPORTABLE_KHR"..0x2054
    )
}

val khr_external_semaphore_opaque_fd = "KHRExternalSemaphoreOpaqueFD".nativeClassCL("khr_external_semaphore_opaque_fd", KHR) {
    IntConstant(
        "SEMAPHORE_HANDLE_OPAQUE_FD_KHR"..0x2055,
    )
}

val khr_external_semaphore_sync_fd = "KHRExternalSemaphoreSyncFD".nativeClassCL("khr_external_semaphore_sync_fd", KHR) {
    IntConstant(
        "SEMAPHORE_HANDLE_SYNC_FD_KHR"..0x2058,
    )

    cl_int(
        "ReImportSemaphoreSyncFdKHR",

        cl_semaphore_khr("sema_object"),
        nullable..NullTerminated..cl_semaphore_reimport_properties_khr.p("reimport_props"),
        int("fd")
    )
}

val khr_external_semaphore_win32 = "KHRExternalSemaphoreWin32".nativeClassCL("khr_external_semaphore_win32", KHR) {
    IntConstant(
        "SEMAPHORE_HANDLE_OPAQUE_WIN32_KHR"..0x2056,
        "SEMAPHORE_HANDLE_OPAQUE_WIN32_KMT_KHR"..0x2057,
        "SEMAPHORE_HANDLE_OPAQUE_WIN32_NAME_KHR"..0x2068,
    )
}
