/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_create_command_queue = "KHRCreateCommandQueue".nativeClassCL("khr_create_command_queue", KHR) {
    documentation =
        """
        Native bindings to the $extensionName extension.
        
        This extension allows OpenCL 1.x devices to support an equivalent of the #CreateCommandQueueWithProperties() API that was added in OpenCL 2.0. This
        allows OpenCL 1.x devices to support other optional extensions or features that use the {@code clCreateCommandQueueWithProperties} API to specify
        additional command queue properties that cannot be specified using the OpenCL 1.x {@code clCreateCommandQueue} API.

        No new command queue properties are required by this extension. Applications may use the existing #DEVICE_QUEUE_PROPERTIES query to determine command
        queue properties that are supported by the device.

        OpenCL 2.x devices may support this extension for compatibility. In this scenario, the function added by this extension will have the same capabilities
        as the core {@code clCreateCommandQueueWithProperties} API. Applications that only target OpenCL 2.x devices should use the core OpenCL 2.x
        {@code clCreateCommandQueueWithProperties} API instead of this extension API.
        """

    cl_command_queue(
        "CreateCommandQueueWithPropertiesKHR",
        "",

        cl_context("context", "a valid OpenCL context"),
        cl_device_id(
            "device",
            """
            a device associated with context. It can either be in the list of devices specified when context is created using #CreateContext() or have the same
            device type as device type specified when context is created using #CreateContextFromType().
            """
        ),
        nullable..NullTerminated..cl_queue_properties_khr.const.p(
            "properties",
            """
            a list of properties for the command-queue and their corresponding values. Each property name is immediately followed by the corresponding desired
            value. The list is terminated with {@code 0}. If a supported property and its value is not specified in properties, its default value will be used.
            {@code properties} can be #NULL in which case the default values for supported command-queue properties will be used.
            """,
            "#QUEUE_PROPERTIES"
        ),
        ERROR_RET,

        returnDoc =
        """
        a valid non-zero command-queue and $errcode_ret is set to $SUCCESS if the command-queue is created successfully. Otherwise, it returns a #NULL value
        with one of the following error values returned in $errcode_ret:
        ${ul(
            ICE,
            "$INVALID_DEVICE if {@code device} is not a valid device or is not associated with {@code context}.",
            "$INVALID_VALUE if values specified in {@code properties} are not valid.",
            "$INVALID_QUEUE_PROPERTIES if values specified in {@code properties} are valid but are not supported by the device.",
            OORE,
            OOHME
        )}
        """
    )
}