/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val amd_device_topology = "AMDDeviceTopology".nativeClassCL("amd_device_topology", AMD) {
    IntConstant(
        "DEVICE_TOPOLOGY_AMD"..0x4037
    )

    IntConstant(
        "DEVICE_TOPOLOGY_TYPE_PCIE_AMD".."1"
    )
}