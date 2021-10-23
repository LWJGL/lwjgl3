/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_sharing_format_query = "INTELSharingFormatQuery".nativeClassCL("intel_sharing_format_query", INTEL) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        Existing interop / sharing extensions require support for a minimum set of image formats, however many OpenCL implementations may support sharing image
        formats above and beyond the minimum. This extension provides a mechanism for an application to query the set of API-specific image formats that an
        OpenCL implementation can accept for sharing.

        Note that the query functionality provided by this extension does not replace API-specific query functions or guarantee that an API-specific image with
        the returned format may be created. Additionally, some APIs may require that a buffer or image be created with particular flags or parameters to be
        shared with OpenCL, so this extension does not guarantee that all API-specific images of the queried formats may be shared with OpenCL. It does,
        however, guarantee that some API-specific images of the queried formats may be shared with OpenCL.
        """

    cl_int(
        "GetSupportedGLTextureFormatsINTEL",
        """
        Can be used to query the list of OpenGL internal texture formats supported for sharing with an OpenCL implementation, given {@code flags} indicating
        how the image is going to be used and {@code image_type} indicating the type of image to create.
        
        If there are multiple devices in the context, the returned set of image formats is the union of image formats supported by all devices in the context.
        """,

        cl_context("context", " a valid OpenCL context created from an OpenGL context"),
        cl_mem_flags("flags", "a bit-field used to specify usage information about the image memory object that will be created from the OpenGL texture"),
        cl_mem_object_type("image_type", "describes the type of image that will be created from the OpenGL texture"),
        AutoSize("gl_formats")..cl_uint("num_entries", "specifies the number of entries that can be returned in the memory location given by {@code gl_formats}"),
        nullable..GLenum.p(
            "gl_formats",
            """
            a pointer to a memory location where the list of supported OpenGL internal texture formats supported for sharing is returned. If {@code gl_formats}
            is #NULL, it is ignored.
            """
        ),
        Check(1)..nullable..cl_uint.p(
            "num_texture_formats",
            """
            returns the actual total number of supported OpenGL internal texture formats for the specified context and flags for the specified
            {@code image_type}. If {@code num_texture_formats} is NULL, it is ignored.
            """
        )
    )

    cl_int(
        "GetSupportedVA_APIMediaSurfaceFormatsINTEL",
        """
        Can be used to query the list of VA_API media image formats supported for sharing with an OpenCL implementation, given flags indicating how the image
        is going to be used and {@code image_type} indicating the type of image to create.
        
        If there are multiple devices in the context, the returned set of image formats is the union of VA_API media image formats supported by all devices in
        the context.
        """,

        cl_context("context", "a valid OpenCL context that supports sharing VA_API media images"),
        cl_mem_flags("flags", "a bit-field used to specify usage information about the image memory object that will be created from the VA_API media image"),
        cl_mem_object_type("image_type", "describes the type of image that will be created from the VA_API media image"),
        cl_uint("plane", "the plane that will be shared, for planar surface formats"),
        AutoSize("va_api_formats")..cl_uint("num_entries", "the number of entries that can be returned in the memory location given by {@code va_api_formats}"),
        nullable..VAImageFormat.p(
            "va_api_formats",
            """
            a pointer to a memory location where the list of supported VA_API media image formats supported for sharing is returned. If {@code va_api_formats}
            is #NULL, it is ignored.
            """
        ),
        Check(1)..nullable..cl_uint.p(
            "num_surface_formats",
            """
            returns the actual total number of supported VA_API media image formats for the specified context and flags for the specified {@code image_type}.
            If {@code num_surface_formats} is #NULL, it is ignored.
            """
        )
    )
}