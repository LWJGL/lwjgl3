/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val img_generate_mipmap = "IMGGenerateMipmap".nativeClassCL("img_generate_mipmap", IMG) {
    IntConstant(
        "MIPMAP_FILTER_ANY_IMG"..0x0,
        "MIPMAP_FILTER_BOX_IMG"..0x1
    )

    IntConstant(
        "COMMAND_GENERATE_MIPMAP_IMG"..0x40D6
    )

    cl_int(
        "EnqueueGenerateMipmapIMG",

        cl_command_queue("command_queue"),
        cl_mem("src_image"),
        cl_mem("dst_image"),
        cl_mipmap_filter_mode_img("mipmap_filter_mode"),
        Check(2)..nullable..size_t.const.p("array_region"),
        Check(2)..nullable..size_t.const.p("mip_region"),
        NEWL,
        EWL,
        EVENT
    )
}