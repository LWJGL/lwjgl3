/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTDeviceFission {

    public static final int
        CL_DEVICE_PARTITION_FAILED_EXT = -1057,
        CL_INVALID_PARTITION_COUNT_EXT = -1058,
        CL_INVALID_PARTITION_NAME_EXT  = -1059;

    public static final int
        CL_DEVICE_PARENT_DEVICE_EXT    = 0x4054,
        CL_DEVICE_PARTITION_TYPES_EXT  = 0x4055,
        CL_DEVICE_AFFINITY_DOMAINS_EXT = 0x4056,
        CL_DEVICE_REFERENCE_COUNT_EXT  = 0x4057,
        CL_DEVICE_PARTITION_STYLE_EXT  = 0x4058;

    public static final int
        CL_DEVICE_PARTITION_EQUALLY_EXT            = 0x4050,
        CL_DEVICE_PARTITION_BY_COUNTS_EXT          = 0x4051,
        CL_DEVICE_PARTITION_BY_NAMES_EXT           = 0x4052,
        CL_DEVICE_PARTITION_BY_AFFINITY_DOMAIN_EXT = 0x4053;

    public static final int
        CL_AFFINITY_DOMAIN_L1_CACHE_EXT         = 0x1,
        CL_AFFINITY_DOMAIN_L2_CACHE_EXT         = 0x2,
        CL_AFFINITY_DOMAIN_L3_CACHE_EXT         = 0x3,
        CL_AFFINITY_DOMAIN_L4_CACHE_EXT         = 0x4,
        CL_AFFINITY_DOMAIN_NUMA_EXT             = 0x10,
        CL_AFFINITY_DOMAIN_NEXT_FISSIONABLE_EXT = 0x100;

    public static final long
        CL_PROPERTIES_LIST_END_EXT          = 0L,
        CL_PARTITION_BY_COUNTS_LIST_END_EXT = 0L,
        CL_PARTITION_BY_NAMES_LIST_END_EXT  = -1L;

    protected EXTDeviceFission() {
        throw new UnsupportedOperationException();
    }

    // --- [ clReleaseDeviceEXT ] ---

    /** {@code cl_int clReleaseDeviceEXT(cl_device_id device)} */
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

    /** {@code cl_int clRetainDeviceEXT(cl_device_id device)} */
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

    /** {@code cl_int clCreateSubDevicesEXT(cl_device_id in_device, cl_device_partition_property_ext const * properties, cl_uint num_entries, cl_device_id * out_devices, cl_uint * num_devices)} */
    public static int nclCreateSubDevicesEXT(long in_device, long properties, int num_entries, long out_devices, long num_devices) {
        long __functionAddress = CL.getICD().clCreateSubDevicesEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(in_device);
        }
        return callPPPPI(in_device, properties, num_entries, out_devices, num_devices, __functionAddress);
    }

    /** {@code cl_int clCreateSubDevicesEXT(cl_device_id in_device, cl_device_partition_property_ext const * properties, cl_uint num_entries, cl_device_id * out_devices, cl_uint * num_devices)} */
    @NativeType("cl_int")
    public static int clCreateSubDevicesEXT(@NativeType("cl_device_id") long in_device, @NativeType("cl_device_partition_property_ext const *") LongBuffer properties, @NativeType("cl_device_id *") @Nullable PointerBuffer out_devices, @NativeType("cl_uint *") @Nullable IntBuffer num_devices) {
        if (CHECKS) {
            checkNT(properties);
            checkSafe(num_devices, 1);
        }
        return nclCreateSubDevicesEXT(in_device, memAddress(properties), remainingSafe(out_devices), memAddressSafe(out_devices), memAddressSafe(num_devices));
    }

    /** {@code cl_int clCreateSubDevicesEXT(cl_device_id in_device, cl_device_partition_property_ext const * properties, cl_uint num_entries, cl_device_id * out_devices, cl_uint * num_devices)} */
    @NativeType("cl_int")
    public static int clCreateSubDevicesEXT(@NativeType("cl_device_id") long in_device, @NativeType("cl_device_partition_property_ext const *") long[] properties, @NativeType("cl_device_id *") @Nullable PointerBuffer out_devices, @NativeType("cl_uint *") int @Nullable [] num_devices) {
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