/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val pocl_content_size = "pocl_content_size".nativeClassCL("pocl_content_size", POCL) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension provides a way to to indicate a buffer which will hold the number of meaningful bytes in another buffer, after kernel execution.

        The implementation can use this as an optimization hint, to internally optimize buffer transfers in scenarios with kernels producing dynamic data
        sizes, by not transferring the bytes that were not written to.        
        """

    cl_int(
        "SetContentSizeBufferPoCL",
        """
        Used to indicate that the buffer {@code content_size_buffer} will hold the meaningful byte count of the content of buffer buffer.
        
        The user is responsible for maintaining the correct meaningful byte count (the implementation does not update the {@code content_size_buffer}).
        """,

        cl_mem("buffer", "a valid {@code cl_mem} object of #MEM_OBJECT_BUFFER type."),
        cl_mem(
            "content_size_buffer",
            """
            a valid {@code cl_mem} object of #MEM_OBJECT_BUFFER type. {@code content_size_buffer} must be at least 64bits large. The meaningful byte count is
            stored as 64bit unsigned integer, little endian.
            """
        )
    )
}