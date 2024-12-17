/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_device_partition_by_names = "INTELDevicePartitionByNames".nativeClassCL("intel_device_partition_by_names", INTEL) {
    IntConstant(
        "DEVICE_PARTITION_BY_NAMES_INTEL"..0x4052
    )

    IntConstant(
        "PARTITION_BY_NAMES_LIST_END_INTEL".."-1"
    )

}