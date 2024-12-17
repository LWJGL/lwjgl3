/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val pocl_content_size = "pocl_content_size".nativeClassCL("pocl_content_size", POCL) {
    cl_int(
        "SetContentSizeBufferPoCL",

        cl_mem("buffer"),
        cl_mem("content_size_buffer")
    )
}