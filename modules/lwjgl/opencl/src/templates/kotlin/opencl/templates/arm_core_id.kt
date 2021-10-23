/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val arm_core_id = "ARMCoreID".nativeClassCL("arm_core_id", ARM) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension provides a built-in function ({@code uint arm_get_core_id( void )}) which returns a unique ID for the compute unit that a work-group is
        running on. This value is uniform for a work-group.

        This value can be used for a core-specific cache or atomic pool where the storage is required to be in global memory and persistent (but not ordered)
        between work-groups. This does not provide any additional ordering on top of the existing guarantees between workgroups, nor does it provide any
        guarantee of concurrent execution.

        The IDs for the compute units may not be consecutive and applications must make sure they allocate enough memory to accommodate all the compute units
        present on the device. A device info query allows the application to know the IDs associated with the compute units on a given device.        
        """

    IntConstant(
        "Device info property for bitfield of cores present.",

        "DEVICE_COMPUTE_UNITS_BITFIELD_ARM"..0x40BF
    )
}
