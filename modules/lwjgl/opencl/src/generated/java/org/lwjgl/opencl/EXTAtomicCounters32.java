/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/ext/cl_ext_atomic_counters_32.txt">ext_atomic_counters_32</a> extension.
 * 
 * <p>This extension adds support in the OpenCL C language for 32-bit atomic counters. Atomic counter is a device-level counter that can be added /
 * decremented by work-items in a work-group or across work-groups executing a kernel, where the atomicity of the operation is guaranteed. The access to
 * the counter is done only via add/dec built-in functions, and as such no two workitems will see the same value returned in the case that a given kernel
 * only increments or decrements the counter.</p>
 * 
 * <p>This feature is highly useful for produce/consume to unordered queues.</p>
 */
public final class EXTAtomicCounters32 {

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}.
     * 
     * <p>Max number of atomic counters that can be used by a kernel. The minimum value is 8.</p>
     */
    public static final int CL_DEVICE_MAX_ATOMIC_COUNTERS_EXT = 0x4032;

    private EXTAtomicCounters32() {}

}