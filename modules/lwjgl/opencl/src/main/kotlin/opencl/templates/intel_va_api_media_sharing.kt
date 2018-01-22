/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val intel_va_api_media_sharing = "INTELVAAPIMediaSharing".nativeClassCL("intel_va_api_media_sharing", INTEL) {

    documentation =
        """
        Native bindings to the $extensionLink extension.

        The goal of this extension is to provide interoperability between OpenCL and the cross-platform Video Acceleration API (VA API). The extension
        specifically enables sharing of VA API surfaces for media. It uses similar mechanisms and provides similar surface sharing capabilities for VA API that
        are provided by the Khronos OpenCL 1.2 Media Surface Sharing extension for DX9.

        Requires ${CL12.link} and a VA API implementation supporting sharing of surfaces with OpenCL.
        """

    val MediaAdapterTypes = IntConstant(
        "Accepted as a VA API device source in the {@code media_adapter_type} parameter of #GetDeviceIDsFromVA_APIMediaAdapterINTEL().",

        "VA_API_DISPLAY_INTEL"..0x4094
    ).javaDocLinks

    val MediaAdapterSets = IntConstant(
        "Accepted as a set of VA API devices in the {@code media_adapter_set} parameter of #GetDeviceIDsFromVA_APIMediaAdapterINTEL().",

        "PREFERRED_DEVICES_FOR_VA_API_INTEL"..0x4095,
        "ALL_DEVICES_FOR_VA_API_INTEL"..0x4096
    ).javaDocLinks

    IntConstant(
        "Accepted as a property name in the {@code properties} parameter of #CreateContext() and #CreateContextFromType().",

        "CONTEXT_VA_API_DISPLAY_INTEL"..0x4097
    )

    IntConstant(
        "Accepted as the property being queried in the {@code param_name} parameter of #GetMemObjectInfo().",

        "MEM_VA_API_MEDIA_SURFACE_INTEL"..0x4098
    )

    IntConstant(
        "Accepted as the property being queried in the {@code param_name} parameter of #GetImageInfo().",

        "IMAGE_VA_API_PLANE_INTEL"..0x4099
    )

    IntConstant(
        "Returned in the {@code param_value} parameter of #GetEventInfo() when {@code param_name} is #EVENT_COMMAND_TYPE.",

        "COMMAND_ACQUIRE_VA_API_MEDIA_SURFACES_INTEL"..0x409A,
        "COMMAND_RELEASE_VA_API_MEDIA_SURFACES_INTEL"..0x409B
    )

    IntConstant(
        """
        Returned by #CreateContext() and #CreateContextFromType() if the VA API display specified for interoperability is not compatible with the
        devices against which the context is to be created.
        """,

        "INVALID_VA_API_MEDIA_ADAPTER_INTEL".."-1098"
    )

    IntConstant(
        """
        Returned by #CreateFromVA_APIMediaSurfaceINTEL() when {@code surface} is not a VA API surface of the required type, by #GetMemObjectInfo() when
        {@code param_name} is #MEM_VA_API_MEDIA_SURFACE_INTEL when {@code memobj} was not created from a VA API surface, and from #GetImageInfo() when
        {@code param_name} is #IMAGE_VA_API_PLANE_INTEL and {@code image} was not created from a VA API surface.
        """,

        "INVALID_VA_API_MEDIA_SURFACE_INTEL".."-1099"
    )

    IntConstant(
        "Returned by #EnqueueAcquireVA_APIMediaSurfacesINTEL() when any of {@code mem_objects} are currently acquired by OpenCL.",

        "VA_API_MEDIA_SURFACE_ALREADY_ACQUIRED_INTEL".."-1100"
    )

    IntConstant(
        "Returned by #EnqueueReleaseVA_APIMediaSurfacesINTEL() when any of {@code mem_objects} are not currently acquired by OpenCL.",

        "VA_API_MEDIA_SURFACE_NOT_ACQUIRED_INTEL".."-1101"
    )

    cl_int(
        "GetDeviceIDsFromVA_APIMediaAdapterINTEL",
        "Queries the OpenCL devices corresponding to a VA API display.",

        cl_platform_id.IN("platform", "the platform ID returned by #GetPlatformIDs()"),
        cl_va_api_device_source_intel.IN("media_adapter_type", "the type of {@code media_adapter}", MediaAdapterTypes),
        opaque_p.IN("media_adapter", "the media adapter whose corresponding OpenCL devices are being queried"),
        cl_va_api_device_set_intel.IN("media_adapter_set", "", MediaAdapterSets),
        AutoSize("devices")..cl_uint.IN(
            "num_entries",
            """
            the number of cl_device_id entries that can be added to {@code devices}. If {@code devices} is not #NULL then {@code num_entries} must be greater
            than zero.
            """
        ),
        nullable..cl_device_id_p.OUT(
            "devices",
            """
            returns a list of OpenCL devices found. The {@code cl_device_id} values returned in {@code devices} can be used to identify a specific OpenCL
            device. If {@code devices} is #NULL, this argument is ignored. The number of OpenCL devices returned is the minimum of the value specified by
            {@code num_entries} and the number of OpenCL devices corresponding to {@code media_adapter}.
            """
        ),
        Check(1)..nullable..cl_uint_p.OUT(
            "num_devices",
            "returns the number of OpenCL devices available that correspond to {@code media_adapter}. If {@code num_devices} is #NULL, this argument is ignored."
        )
    )

    cl_mem(
        "CreateFromVA_APIMediaSurfaceINTEL",
        "Creates an OpenCL 2D image object from a VA API media surface or a plane of a VA API media surface.",

        cl_context.IN("context", "a valid OpenCL context created from a VA API display"),
        cl_mem_flags.IN("flags", "a bit-field that is used to specify usage information", "#MEM_READ_ONLY #MEM_WRITE_ONLY #MEM_READ_WRITE"),
        Check(1)..VASurfaceID_p.IN("surface", "a pointer to the VA API surface to share"),
        cl_uint.IN("plane", "the plane of {@code surface} to share, for planar formats. For non-planar formats, {@code plane} must be 0."),
        ERROR_RET
    )

    cl_int(
        "EnqueueAcquireVA_APIMediaSurfacesINTEL",
        """
        Acquires OpenCL memory objects that have been created from VA API surfaces. The VA API surfaces are acquired by the OpenCL context associated with
        {@code command_queue} and can therefore be used by all command- queues associated with the OpenCL context.

        OpenCL memory objects created from VA API surfaces must be acquired before they can be used by any OpenCL commands queued to a command-queue. If an
        OpenCL memory object created from a VA API surface is used while it is not acquired by OpenCL, the call attempting to use that OpenCL memory object
        will return #VA_API_MEDIA_SURFACE_NOT_ACQUIRED_INTEL.

        If #CONTEXT_INTEROP_USER_SYNC is not specified as #TRUE during context creation, {@code clEnqueueAcquireVA_APIMediaSurfacesINTEL} provides the
        synchronization guarantee that any VA API calls made before {@code clEnqueueAcquireVA_APIMediaSurfacesINTEL} is called will complete executing before
        {@code event} reports completion and before the execution of any subsequent OpenCL work issued in {@code command_queue} begins. If the context was
        created with properties specifying #CONTEXT_INTEROP_USER_SYNC as #TRUE, the user is responsible for guaranteeing that any VA API calls
        involving the interop device(s) used in the OpenCL context made before {@code clEnqueueAcquireVA_APIMediaSurfacesINTEL} is called have completed before
        calling {@code clEnqueueAcquireVA_APIMediaSurfacesINTEL}.
        """,

        cl_command_queue.IN("command_queue", "a valid command-queue"),
        AutoSize("mem_objects")..cl_uint.IN("num_objects", "the number of memory objects to be acquired in {@code mem_objects}."),
        const..cl_mem_p.IN("mem_objects", "a pointer to a list of OpenCL memory objects that were created from VA API surfaces"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueReleaseVA_APIMediaSurfacesINTEL",
        """
        Releases OpenCL memory objects that have been created from VA API surfaces. The VA API surfaces are released by the OpenCL context associated with
        {@code command_queue}.

        OpenCL memory objects created from VA API surfaces which have been acquired by OpenCL must be released by OpenCL before they may be accessed by VA API.
        Accessing a VA API surface while its corresponding OpenCL memory object is acquired is in error and will result in undefined behavior, including but
        not limited to possible OpenCL errors, data corruption, and program termination.

        If #CONTEXT_INTEROP_USER_SYNC is not specified as #TRUE during context creation, {@code clEnqueueReleaseVA_APIMediaSurfacesINTEL} provides the
        synchronization guarantee that any VA API calls made after {@code clEnqueueReleaseVA_APIMediaSurfacesINTEL} is called will not start executing until
        after all events in {@code event_wait_list} are complete and all work already submitted to {@code command_queue} completes execution. If the context
        was created with properties specifying #CONTEXT_INTEROP_USER_SYNC specified as #TRUE, the user is responsible for guaranteeing that any VA API
        calls involving the interop device(s) used in the OpenCL context made after {@code clEnqueueReleaseVA_APIMediaSurfacesINTEL} is called will not start
        executing until after the event returned by {@code clEnqueueReleaseVA_APIMediaSurfacesINTEL} reports completion.
        """,

        cl_command_queue.IN("command_queue", "a valid OpenCL context created from a VA API display"),
        AutoSize("mem_objects")..cl_uint.IN("num_objects", "the number of memory objects to be released in {@code mem_objects}"),
        const..cl_mem_p.IN("mem_objects", "a pointer to a list of OpenCL memory objects that were created from VA API surfaces"),
        NEWL,
        EWL,
        EVENT
    )
}