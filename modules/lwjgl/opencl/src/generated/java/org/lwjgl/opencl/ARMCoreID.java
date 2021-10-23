/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/arm/cl_arm_core_id.txt">arm_core_id</a> extension.
 * 
 * <p>This extension provides a built-in function ({@code uint arm_get_core_id( void )}) which returns a unique ID for the compute unit that a work-group is
 * running on. This value is uniform for a work-group.</p>
 * 
 * <p>This value can be used for a core-specific cache or atomic pool where the storage is required to be in global memory and persistent (but not ordered)
 * between work-groups. This does not provide any additional ordering on top of the existing guarantees between workgroups, nor does it provide any
 * guarantee of concurrent execution.</p>
 * 
 * <p>The IDs for the compute units may not be consecutive and applications must make sure they allocate enough memory to accommodate all the compute units
 * present on the device. A device info query allows the application to know the IDs associated with the compute units on a given device.</p>
 */
public final class ARMCoreID {

    /** Device info property for bitfield of cores present. */
    public static final int CL_DEVICE_COMPUTE_UNITS_BITFIELD_ARM = 0x40BF;

    private ARMCoreID() {}

}