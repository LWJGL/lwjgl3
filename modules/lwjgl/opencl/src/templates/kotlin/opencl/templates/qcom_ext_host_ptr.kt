/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val qcom_ext_host_ptr = "QCOMEXTHostPtr".nativeClassCL("qcom_ext_host_ptr", QCOM) {
    IntConstant(
        "DEVICE_EXT_MEM_PADDING_IN_BYTES_QCOM"..0x40A0,
        "DEVICE_PAGE_SIZE_QCOM"..0x40A1
    )

    IntConstant(
        "MEM_EXT_HOST_PTR_QCOM".."1 << 29"
    )

    IntConstant(
        "MEM_HOST_UNCACHED_QCOM"..0x40A4,
        "MEM_HOST_WRITEBACK_QCOM"..0x40A5,
        "MEM_HOST_WRITETHROUGH_QCOM"..0x40A6,
        "MEM_HOST_WRITE_COMBINING_QCOM"..0x40A7
    )

    IntConstant(
        "IMAGE_ROW_ALIGNMENT_QCOM"..0x40A2,
        "IMAGE_SLICE_ALIGNMENT_QCOM"..0x40A3
    )

    cl_int(
        "GetDeviceImageInfoQCOM",

        cl_device_id("device"),
        size_t("image_width"),
        size_t("image_height"),
        cl_image_format.const.p("image_format"),
        cl_image_pitch_info_qcom("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_INT
        )..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )
}