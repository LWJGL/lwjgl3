/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/ext/cl_ext_device_fission.txt">ext_device_fission</a> extension.
 * 
 * <p>This extension provides an interface for sub-dividing an OpenCL device into multiple sub-devices. There are a number of cases in which a typical user
 * would like to subdivide a device:</p>
 * 
 * <ol>
 * <li>To reserve part of the device for use for high priority / latency-sensitive tasks</li>
 * <li>To more directly control the assignment of work to individual compute units</li>
 * <li>To subdivide compute devices along some shared hardware feature like a cache</li>
 * </ol>
 * 
 * <p>Typically these are areas where some level of additional control is required to get optimal performance beyond that provided by standard OpenCL 1.1
 * APIs. Proper use of this interface assumes some detailed knowledge of the devices in question.</p>
 */
public class EXTDeviceFission {

    /** Accepted as a property name in the {@code properties} parameter of clCreateSubDeviceEXT. */
    public static final int
        CL_DEVICE_PARTITION_EQUALLY_EXT            = 0x4050,
        CL_DEVICE_PARTITION_BY_COUNTS_EXT          = 0x4051,
        CL_DEVICE_PARTITION_BY_NAMES_EXT           = 0x4052,
        CL_DEVICE_PARTITION_BY_AFFINITY_DOMAIN_EXT = 0x4053;

    /**
     * Accepted as a property name, when accompanying the CL_DEVICE_PARITION_BY_AFFINITY_DOMAIN_EXT property, in the {@code properties} parameter of
     * clCreateSubDeviceEXT.
     */
    public static final int
        CL_AFFINITY_DOMAIN_L1_CACHE_EXT         = 0x1,
        CL_AFFINITY_DOMAIN_L2_CACHE_EXT         = 0x2,
        CL_AFFINITY_DOMAIN_L3_CACHE_EXT         = 0x3,
        CL_AFFINITY_DOMAIN_L4_CACHE_EXT         = 0x4,
        CL_AFFINITY_DOMAIN_NUMA_EXT             = 0x10,
        CL_AFFINITY_DOMAIN_NEXT_FISSIONABLE_EXT = 0x100;

    /** Accepted as a property being queried in the {@code param_name} argument of clGetDeviceInfo. */
    public static final int
        CL_DEVICE_PARENT_DEVICE_EXT    = 0x4054,
        CL_DEVICE_PARITION_TYPES_EXT   = 0x4055,
        CL_DEVICE_AFFINITY_DOMAINS_EXT = 0x4056,
        CL_DEVICE_REFERENCE_COUNT_EXT  = 0x4057,
        CL_DEVICE_PARTITION_STYLE_EXT  = 0x4058;

    /** Accepted as the property list terminator in the {@code properties} parameter of clCreateSubDeviceEXT. */
    public static final int CL_PROPERTIES_LIST_END_EXT = 0x0;

    /** Accepted as the partition counts list terminator in the {@code properties} parameter of clCreateSubDeviceEXT. */
    public static final int CL_PARTITION_BY_COUNTS_LIST_END_EXT = 0x0;

    /** Accepted as the partition names list terminator in the {@code properties} parameter of clCreateSubDeviceEXT. */
    public static final int CL_PARTITION_BY_NAMES_LIST_END_EXT = -1;

    /**
     * Returned by clCreateSubDevicesEXT when the indicated partition scheme is supported by the implementation, but the implementation can not further
     * partition the device in this way.
     */
    public static final int CL_DEVICE_PARTITION_FAILED_EXT = -1057;

    /**
     * Returned by clCreateSubDevicesEXT when the total number of compute units requested exceeds CL_DEVICE_MAX_COMPUTE_UNITS, or the number of compute units
     * for any one sub-device is less than 1.
     */
    public static final int CL_INVALID_PARTITION_COUNT_EXT = -1058;

    /** Returned by clCreateSubDevicesEXT when a compute unit name appearing in a name list following CL_DEVICE_PARTITION_BY_NAMES_EXT is not in range. */
    public static final int CL_INVALID_PARTITION_NAME_EXT = -1059;

    protected EXTDeviceFission() {
        throw new UnsupportedOperationException();
    }

    // --- [ clReleaseDeviceEXT ] ---

    @NativeType("cl_int")
    public static int clReleaseDeviceEXT(@NativeType("cl_device_id") long device) {
        long __functionAddress = CL.getICD().clReleaseDeviceEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPI(device, __functionAddress);
    }

    // --- [ clRetainDeviceEXT ] ---

    @NativeType("cl_int")
    public static int clRetainDeviceEXT(@NativeType("cl_device_id") long device) {
        long __functionAddress = CL.getICD().clRetainDeviceEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPI(device, __functionAddress);
    }

    // --- [ clCreateSubDevicesEXT ] ---

    public static int nclCreateSubDevicesEXT(long in_device, long properties, int num_entries, long out_devices, long num_devices) {
        long __functionAddress = CL.getICD().clCreateSubDevicesEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(in_device);
        }
        return callPPPPI(in_device, properties, num_entries, out_devices, num_devices, __functionAddress);
    }

    @NativeType("cl_int")
    public static int clCreateSubDevicesEXT(@NativeType("cl_device_id") long in_device, @NativeType("cl_device_partition_property_ext const *") LongBuffer properties, @Nullable @NativeType("cl_device_id *") PointerBuffer out_devices, @Nullable @NativeType("cl_uint *") IntBuffer num_devices) {
        if (CHECKS) {
            checkNT(properties);
            checkSafe(num_devices, 1);
        }
        return nclCreateSubDevicesEXT(in_device, memAddress(properties), remainingSafe(out_devices), memAddressSafe(out_devices), memAddressSafe(num_devices));
    }

    /** Array version of: {@link #clCreateSubDevicesEXT CreateSubDevicesEXT} */
    @NativeType("cl_int")
    public static int clCreateSubDevicesEXT(@NativeType("cl_device_id") long in_device, @NativeType("cl_device_partition_property_ext const *") long[] properties, @Nullable @NativeType("cl_device_id *") PointerBuffer out_devices, @Nullable @NativeType("cl_uint *") int[] num_devices) {
        long __functionAddress = CL.getICD().clCreateSubDevicesEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(in_device);
            checkNT(properties);
            checkSafe(num_devices, 1);
        }
        return callPPPPI(in_device, properties, remainingSafe(out_devices), memAddressSafe(out_devices), num_devices, __functionAddress);
    }

}