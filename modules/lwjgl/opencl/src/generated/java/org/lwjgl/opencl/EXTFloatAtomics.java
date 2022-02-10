/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/ext/cl_ext_float_atomics.txt">ext_float_atomics</a> extension.
 * 
 * <p>This extension enables programmers to perform atomic operations on floating-point numbers in memory.</p>
 * 
 * <p>An OpenCL device supporting this extension may support atomic operations on 16-bit half-precision floating-point values ({@code fp16}), 32-bit
 * single-precision floating-point values ({@code fp32}), or 64-bit double-precision floating-point values ({@code fp64}). For these types, an OpenCL
 * device may support basic atomic operations (load, store, and exchange), atomic addition and subtraction, and atomic min and max. The floating-point
 * numbers may be in global or local memory.</p>
 * 
 * <p>Requires {@link CL20 CL20}.</p>
 */
public final class EXTFloatAtomics {

    /** Accepted value for the {@code param_name} parameter to {@link CL10#clGetDeviceInfo GetDeviceInfo} to query the floating-point atomic capabilities of an OpenCL device. */
    public static final int
        CL_DEVICE_SINGLE_FP_ATOMIC_CAPABILITIES_EXT = 0x4231,
        CL_DEVICE_DOUBLE_FP_ATOMIC_CAPABILITIES_EXT = 0x4232,
        CL_DEVICE_HALF_FP_ATOMIC_CAPABILITIES_EXT   = 0x4233;

    /**
     * Bitfield type describing the floating-point atomic capabilities of an OpenCL device. ({@code cl_device_fp_atomic_capabilities_ext}
     * 
     * <p>Subsequent versions of this extension may add additional floating-point atomic capabilities.</p>
     */
    public static final int
        CL_DEVICE_GLOBAL_FP_ATOMIC_LOAD_STORE_EXT = 1 << 0,
        CL_DEVICE_GLOBAL_FP_ATOMIC_ADD_EXT        = 1 << 1,
        CL_DEVICE_GLOBAL_FP_ATOMIC_MIN_MAX_EXT    = 1 << 2,
        CL_DEVICE_LOCAL_FP_ATOMIC_LOAD_STORE_EXT  = 1 << 16,
        CL_DEVICE_LOCAL_FP_ATOMIC_ADD_EXT         = 1 << 17,
        CL_DEVICE_LOCAL_FP_ATOMIC_MIN_MAX_EXT     = 1 << 18;

    private EXTFloatAtomics() {}

}