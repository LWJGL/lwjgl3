/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_suggested_local_work_size = "KHRSuggestedLocalWorkSize".nativeClassCL("khr_suggested_local_work_size", KHR) {
    documentation =
        """
        Native bindings to the $extensionName extension.
        
        This extension adds the ability to query a suggested local work group size for a kernel running on a device for a specified global work size and global
        work offset. The suggested local work group size will match the work group size that would be chosen if the kernel were enqueued with the specified
        global work size and global work offset and a NULL local work size.

        By using the suggested local work group size query an application has greater insight into the local work group size chosen by the OpenCL
        implementation, and the OpenCL implementation need not re-compute the local work group size if the same kernel is enqueued multiple times with the same
        parameters.
        """

    cl_int(
        "GetKernelSuggestedLocalWorkSizeKHR",
        """
        Query a suggested local work size for a kernel object.
        
        The returned suggested local work size is expected to match the local work size that would be chosen if the specified kernel object, with the same
        kernel arguments, were enqueued into the specified command queue with the specified global work size, specified global work offset, and with a #NULL
        local work size.
        """,

        cl_command_queue("command_queue", "specifies the command queue and device for the query"),
        cl_kernel(
            "kernel",
            "the kernel object and kernel arguments for the query. The OpenCL context associated with {@code kernel} and {@code command_queue} must the same."
        ),
        AutoSize("global_work_size", "suggested_local_work_size", "global_work_offset")..cl_uint(
            "work_dim",
            "specifies the number of work dimensions in the input global work offset and global work size, and the output suggested local work size"
        ),
        nullable..size_t.const.p(
            "global_work_offset",
            """
            can be used to specify an array of at least {@code work_dim} global ID offset values for the query. This is optional and may be #NULL to indicate
            there is no global ID offset.
            """
        ),
        size_t.const.p("global_work_size", ""),
        size_t.p("suggested_local_work_size", "")
    )
}