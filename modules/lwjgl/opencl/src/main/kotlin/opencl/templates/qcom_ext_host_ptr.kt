/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val qcom_ext_host_ptr = "QCOMEXTHostPtr".nativeClassCL("qcom_ext_host_ptr", QCOM) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension extends the functionality provided by #CreateBuffer(), #CreateImage2D(), #CreateImage3D(). It allows applications to specify
        a new flag #MEM_EXT_HOST_PTR_QCOM which enables the driver to map external memory allocations --to be defined in future layered extensions-- to the
        device's address space and thus avoiding having to copy data back and forth between the host and the device.

        Requires ${CL11.link}.
        """

    IntConstant(
        "Accepted by the {@code param_name} argument of #GetDeviceInfo().",

        "DEVICE_EXT_MEM_PADDING_IN_BYTES_QCOM"..0x40A0,
        "DEVICE_PAGE_SIZE_QCOM"..0x40A1
    )

    IntConstant(
        "Accepted by the {@code flags} argument of #CreateBuffer(), #CreateImage2D() and #CreateImage3D().",

        "MEM_EXT_HOST_PTR_QCOM".."1 << 29"
    )

    IntConstant(
        "host_cache_policy.",

        "MEM_HOST_UNCACHED_QCOM"..0x40A4,
        "MEM_HOST_WRITEBACK_QCOM"..0x40A5,
        "MEM_HOST_WRITETHROUGH_QCOM"..0x40A6,
        "MEM_HOST_WRITE_COMBINING_QCOM"..0x40A7
    )

    val image_pitch_infos = IntConstant(
        "Accepted by the {@code param_name} argument of #GetDeviceImageInfoQCOM().",

        "IMAGE_ROW_ALIGNMENT_QCOM"..0x40A2,
        "IMAGE_SLICE_ALIGNMENT_QCOM"..0x40A3
    ).javaDocLinks

    cl_int(
        "GetDeviceImageInfoQCOM",
        """
        An application that creates OpenCL image objects with the #MEM_EXT_HOST_PTR_QCOM flag can invoke this function to query the required row pitch, slice
        pitch and alignment for a particular device.
        """,

        cl_device_id.IN("device", "a valid device"),
        size_t.IN("image_width", "width of the image in image elements (pixels)"),
        size_t.IN("image_height", "height of the image in image elements (pixels)"),
        const..cl_image_format_p.IN("image_format", "format of the image"),
        cl_image_pitch_info_qcom.IN("param_name", "the parameter to query", "#IMAGE_ROW_PITCH #IMAGE_SLICE_PITCH $image_pitch_infos"),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_INT
        )..nullable..void_p.OUT("param_value", param_value),
        PARAM_VALUE_SIZE_RET
    )
}