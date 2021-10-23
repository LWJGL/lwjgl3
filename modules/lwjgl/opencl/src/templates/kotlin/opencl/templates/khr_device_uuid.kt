/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_device_uuid = "KHRDeviceUUID".nativeClassCL("khr_device_uuid", KHR) {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension adds the ability to query a universally unique identifier (UUID) for an OpenCL driver and OpenCL device. The UUIDs returned by the query
        may be used to identify drivers and devices across processes or APIs.
        """

    IntConstant(
        "",

        "UUID_SIZE_KHR".."16",
        "LUID_SIZE_KHR"..8
    )

    IntConstant(
        """
        Returns a universally unique identifier (UUID) for the device. ({@code cl_uchar[CL_UUID_SIZE_KHR]})

        Device UUIDs must be immutable for a given device across processes, driver APIs, driver versions, and system reboots.
        """,

        "DEVICE_UUID_KHR"..0x106A
    )

    IntConstant(
        "Returns a universally unique identifier (UUID) for the software driver for the device. ({@code cl_uchar[CL_UUID_SIZE_KHR]})",

        "DRIVER_UUID_KHR"..0x106B
    )

    IntConstant(
        "Returns #TRUE if the device has a valid LUID and #FALSE otherwise. ({@code cl_bool})",

        "DEVICE_LUID_VALID_KHR"..0x106C
    )

    IntConstant(
        """
        Returns a locally unique identifier (LUID) for the device. ({@code cl_uchar[CL_LUID_SIZE_KHR]})

        It is not an error to query {@code CL_DEVICE_LUID_KHR} when #DEVICE_LUID_VALID_KHR returns #FALSE, but in this case the returned LUID value is
        undefined.

        When {@code CL_DEVICE_LUID_VALID_KHR} returns #TRUE, and the OpenCL device is running on the Windows operating system, the returned LUID value can be
        cast to an LUID object and must be equal to the locally unique identifier of an {@code IDXGIAdapter1} object that corresponds to the OpenCL device.
        """,

        "DEVICE_LUID_KHR"..0x106D
    )

    IntConstant(
        """
        Returns a node mask for the device. ({@code cl_uint})

        It is not an error to query {@code CL_DEVICE_NODE_MASK_KHR} when #DEVICE_LUID_VALID_KHR returns #FALSE, but in this case the returned node mask is
        undefined.

        When {@code CL_DEVICE_LUID_VALID_KHR} returns #TRUE, the returned node mask must contain exactly one bit. If the OpenCL device is running on an
        operating system that supports the Direct3D 12 API and the OpenCL device corresponds to an individual device in a linked device adapter, the returned
        node mask identifies the Direct3D 12 node corresponding to the OpenCL device. Otherwise, the returned node mask must be 1.
        """,

        "DEVICE_NODE_MASK_KHR"..0x106E
    )
}