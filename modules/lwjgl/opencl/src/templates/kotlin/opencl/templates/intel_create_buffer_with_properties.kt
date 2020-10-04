/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_create_buffer_with_properties = "INTELCreateBufferWithProperties".nativeClassCL("intel_create_buffer_with_properties", INTEL) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension allows OpenCL 1.x and 2.x devices to support the {@code clCreateBufferWithProperties} API that was added in OpenCL 3.0. This allows
        older OpenCL implementations to support other optional extensions or features that use the {@code clCreateBufferWithProperties} API to specify
        additional buffer properties, without recreating the API that is already part of OpenCL 3.0.
        """

    cl_mem(
        "CreateBufferWithPropertiesINTEL",
        "",

        cl_context("context", "a valid OpenCL context used to create the buffer object"),
        nullable..NullTerminated..cl_mem_properties_intel.const.p(
            "properties",
            """
            an optional list of properties for the buffer object and their corresponding values.

            Each property name is immediately followed by the corresponding desired value. The list is terminated with the special property 0. If no properties
            are required, properties may be #NULL. This extension does not define any optional properties for buffers.
            """
        ),
        cl_mem_flags(
            "flags",
            """
            a bit-field that is used to specify allocation and usage information such as the memory arena that should be used to allocate the buffer object and
            how it will be used
            """
        ),
        AutoSize("host_ptr")..size_t("size", "the size in bytes of the buffer memory object to be allocated"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..optional..void.p(
            "host_ptr",
            """
            a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
            greater than or equal to {@code size} bytes.
            """
        ),
        ERROR_RET,

        returnDoc =
        """
        a valid non-zero buffer object and $errcode_ret is set to $SUCCESS if the buffer object is created successfully. Otherwise, it returns a #NULL value
        with one of the following error values returned in $errcode_ret:
        ${ul(
            ICE,
            "$INVALID_VALUE if a property name in properties is not a supported property name, if the value specified for a supported property name is not valid, or if the same property name is specified more than once.",
            "$INVALID_VALUE if values specified in flags are not valid as defined in table 5.3.",
            "$INVALID_BUFFER_SIZE if size is 0.",
            """
            $INVALID_HOST_PTR if {@code host_ptr} is #NULL and #MEM_USE_HOST_PTR or #MEM_COPY_HOST_PTR are set in flags or if {@code host_ptr} is not #NULL but
            #MEM_COPY_HOST_PTR or #MEM_USE_HOST_PTR are not set in flags.
            """,
            "#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for buffer object.",
            OORE,
            OOHME
        )}
        """
    )
}
