/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_image2d_from_buffer = "KHRImage2DFromBuffer".nativeClassCL("khr_image2d_from_buffer", KHR) {

    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo().

        Returns the row pitch alignment size in pixels for images created from a buffer. The value returned must be a power of 2. If the device does not support
        images, this value should be 0.
        """,

        "DEVICE_IMAGE_PITCH_ALIGNMENT"..0x104A
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo().

        This query should be used when an image is created from a buffer which was created using #MEM_USE_HOST_PTR. The value returned must be a
        power of 2.

        This query specifies the minimum alignment in pixels of the {@code host_ptr} specified to #CreateBuffer(). If the device does not support
        images, this value should be 0.
        """,

        "DEVICE_IMAGE_BASE_ADDRESS_ALIGNMENT"..0x104B
    )

}