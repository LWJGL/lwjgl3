/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_sharing_format_query = "INTELSharingFormatQuery".nativeClassCL("intel_sharing_format_query", INTEL) {
    cl_int(
        "GetSupportedGLTextureFormatsINTEL",

        cl_context("context"),
        cl_mem_flags("flags"),
        cl_mem_object_type("image_type"),
        AutoSize("gl_formats")..cl_uint("num_entries"),
        nullable..GLenum.p("gl_formats"),
        Check(1)..nullable..cl_uint.p("num_texture_formats")
    )

    cl_int(
        "GetSupportedVA_APIMediaSurfaceFormatsINTEL",

        cl_context("context"),
        cl_mem_flags("flags"),
        cl_mem_object_type("image_type"),
        cl_uint("plane"),
        AutoSize("va_api_formats")..cl_uint("num_entries"),
        nullable..VAImageFormat.p("va_api_formats"),
        Check(1)..nullable..cl_uint.p("num_surface_formats")
    )
}