/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_device_attribute_query = "INTELDeviceAttributeQuery".nativeClassCL("intel_device_attribute_query", INTEL) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension can be used to query additional information about Intel OpenCL devices. The additional information may be useful to tailor a specific
        workload to the properties of the device.
        """

    IntConstant(
        """
        Possible values accepted as the {@code param_name} parameter of #GetDeviceInfo(), depending on the device type and the extension version.

        Additional queries may be added in subsequent versions of the extension.
        """,

        "DEVICE_IP_VERSION_INTEL"..0x4250,
        "DEVICE_ID_INTEL"..0x4251,
        "DEVICE_NUM_SLICES_INTEL"..0x4252,
        "DEVICE_NUM_SUB_SLICES_PER_SLICE_INTEL"..0x4253,
        "DEVICE_NUM_EUS_PER_SUB_SLICE_INTEL"..0x4254,
        "DEVICE_NUM_THREADS_PER_EU_INTEL"..0x4255,
        "DEVICE_FEATURE_CAPABILITIES_INTEL"..0x4256
    )

    IntConstant(
        """
        Bitfield type describing the feature capabilities of a device. ({@code cl_device_feature_capabilities_intel})

        Additional feature flags may be added in subsequent versions of the extension.
        """,

        "DEVICE_FEATURE_FLAG_DP4A_INTEL".."1 << 0",
        "DEVICE_FEATURE_FLAG_DPAS_INTEL".."1 << 1"
    )
}