/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_va_api_media_sharing = "INTELVAAPIMediaSharing".nativeClassCL("intel_va_api_media_sharing", INTEL) {
    IntConstant(
        "VA_API_DISPLAY_INTEL"..0x4094
    )

    IntConstant(
        "PREFERRED_DEVICES_FOR_VA_API_INTEL"..0x4095,
        "ALL_DEVICES_FOR_VA_API_INTEL"..0x4096
    )

    IntConstant(
        "CONTEXT_VA_API_DISPLAY_INTEL"..0x4097
    )

    IntConstant(
        "MEM_VA_API_MEDIA_SURFACE_INTEL"..0x4098
    )

    IntConstant(
        "IMAGE_VA_API_PLANE_INTEL"..0x4099
    )

    IntConstant(
        "COMMAND_ACQUIRE_VA_API_MEDIA_SURFACES_INTEL"..0x409A,
        "COMMAND_RELEASE_VA_API_MEDIA_SURFACES_INTEL"..0x409B
    )

    IntConstant(
        "INVALID_VA_API_MEDIA_ADAPTER_INTEL".."-1098"
    )

    IntConstant(
        "INVALID_VA_API_MEDIA_SURFACE_INTEL".."-1099"
    )

    IntConstant(
        "VA_API_MEDIA_SURFACE_ALREADY_ACQUIRED_INTEL".."-1100"
    )

    IntConstant(
        "VA_API_MEDIA_SURFACE_NOT_ACQUIRED_INTEL".."-1101"
    )

    cl_int(
        "GetDeviceIDsFromVA_APIMediaAdapterINTEL",

        cl_platform_id("platform"),
        cl_va_api_device_source_intel("media_adapter_type"),
        opaque_p("media_adapter"),
        cl_va_api_device_set_intel("media_adapter_set"),
        AutoSize("devices")..cl_uint("num_entries"),
        nullable..cl_device_id.p("devices"),
        Check(1)..nullable..cl_uint.p("num_devices")
    )

    cl_mem(
        "CreateFromVA_APIMediaSurfaceINTEL",

        cl_context("context"),
        cl_mem_flags("flags"),
        Check(1)..VASurfaceID.p("surface"),
        cl_uint("plane"),
        ERROR_RET
    )

    cl_int(
        "EnqueueAcquireVA_APIMediaSurfacesINTEL",

        cl_command_queue("command_queue"),
        AutoSize("mem_objects")..cl_uint("num_objects"),
        cl_mem.const.p("mem_objects"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueReleaseVA_APIMediaSurfacesINTEL",

        cl_command_queue("command_queue"),
        AutoSize("mem_objects")..cl_uint("num_objects"),
        cl_mem.const.p("mem_objects"),
        NEWL,
        EWL,
        EVENT
    )
}