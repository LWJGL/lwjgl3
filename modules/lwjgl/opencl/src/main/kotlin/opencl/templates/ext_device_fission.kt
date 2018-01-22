/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val ext_device_fission = "EXTDeviceFission".nativeClassCL("ext_device_fission", EXT) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension provides an interface for sub-dividing an OpenCL device into multiple sub-devices. There are a number of cases in which a typical user
        would like to subdivide a device:
        ${ol(
            "To reserve part of the device for use for high priority / latency-sensitive tasks",
            "To more directly control the assignment of work to individual compute units",
            "To subdivide compute devices along some shared hardware feature like a cache"
        )}
        Typically these are areas where some level of additional control is required to get optimal performance beyond that provided by standard OpenCL 1.1
        APIs. Proper use of this interface assumes some detailed knowledge of the devices in question.
        """

    IntConstant(
        "Accepted as a property name in the {@code properties} parameter of clCreateSubDeviceEXT.",

        "DEVICE_PARTITION_EQUALLY_EXT"..0x4050,
        "DEVICE_PARTITION_BY_COUNTS_EXT"..0x4051,
        "DEVICE_PARTITION_BY_NAMES_EXT"..0x4052,
        "DEVICE_PARTITION_BY_AFFINITY_DOMAIN_EXT"..0x4053
    )

    IntConstant(
        """
        Accepted as a property name, when accompanying the CL_DEVICE_PARITION_BY_AFFINITY_DOMAIN_EXT property, in the {@code properties} parameter of
        clCreateSubDeviceEXT.
        """,

        "AFFINITY_DOMAIN_L1_CACHE_EXT"..0x1,
        "AFFINITY_DOMAIN_L2_CACHE_EXT"..0x2,
        "AFFINITY_DOMAIN_L3_CACHE_EXT"..0x3,
        "AFFINITY_DOMAIN_L4_CACHE_EXT"..0x4,
        "AFFINITY_DOMAIN_NUMA_EXT"..0x10,
        "AFFINITY_DOMAIN_NEXT_FISSIONABLE_EXT"..0x100
    )

    IntConstant(
        "Accepted as a property being queried in the {@code param_name} argument of clGetDeviceInfo.",

        "DEVICE_PARENT_DEVICE_EXT"..0x4054,
        "DEVICE_PARITION_TYPES_EXT"..0x4055,
        "DEVICE_AFFINITY_DOMAINS_EXT"..0x4056,
        "DEVICE_REFERENCE_COUNT_EXT"..0x4057,
        "DEVICE_PARTITION_STYLE_EXT"..0x4058
    )

    IntConstant(
        "Accepted as the property list terminator in the {@code properties} parameter of clCreateSubDeviceEXT.",

        "PROPERTIES_LIST_END_EXT"..0x0
    )

    IntConstant(
        "Accepted as the partition counts list terminator in the {@code properties} parameter of clCreateSubDeviceEXT.",

        "PARTITION_BY_COUNTS_LIST_END_EXT"..0x0
    )

    IntConstant(
        "Accepted as the partition names list terminator in the {@code properties} parameter of clCreateSubDeviceEXT.",

        "PARTITION_BY_NAMES_LIST_END_EXT".."-1"
    )

    IntConstant(
        """
        Returned by clCreateSubDevicesEXT when the indicated partition scheme is supported by the implementation, but the implementation can not further
        partition the device in this way.
        """,

        "DEVICE_PARTITION_FAILED_EXT".."-1057"
    )

    IntConstant(
        """
        Returned by clCreateSubDevicesEXT when the total number of compute units requested exceeds CL_DEVICE_MAX_COMPUTE_UNITS, or the number of compute units
        for any one sub-device is less than 1.
        """,

        "INVALID_PARTITION_COUNT_EXT".."-1058"
    )

    IntConstant(
        "Returned by clCreateSubDevicesEXT when a compute unit name appearing in a name list following CL_DEVICE_PARTITION_BY_NAMES_EXT is not in range.",

        "INVALID_PARTITION_NAME_EXT".."-1059"
    )

    cl_int(
        "ReleaseDeviceEXT",
        "",

        cl_device_id.IN("device", "")
    )

    cl_int(
        "RetainDeviceEXT",
        "",

        cl_device_id.IN("device", "")
    )

    cl_int(
        "CreateSubDevicesEXT",
        "",

        cl_device_id.IN("in_device", ""),
        NullTerminated..const..cl_device_partition_property_ext_p.IN("properties", ""),
        AutoSize("out_devices")..cl_uint.IN("num_entries", ""),
        nullable..cl_device_id_p.OUT("out_devices", ""),
        Check(1)..nullable..cl_uint_p.OUT("num_devices", "")
    )
}