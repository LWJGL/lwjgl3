/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_device_fission = "EXTDeviceFission".nativeClassCL("ext_device_fission", EXT) {
    IntConstant(
        "DEVICE_PARTITION_FAILED_EXT".."-1057",
        "INVALID_PARTITION_COUNT_EXT".."-1058",
        "INVALID_PARTITION_NAME_EXT".."-1059"
    )

    IntConstant(
        "DEVICE_PARENT_DEVICE_EXT"..0x4054,
        "DEVICE_PARTITION_TYPES_EXT"..0x4055,
        "DEVICE_AFFINITY_DOMAINS_EXT"..0x4056,
        "DEVICE_REFERENCE_COUNT_EXT"..0x4057,
        "DEVICE_PARTITION_STYLE_EXT"..0x4058
    )

    IntConstant(
        "DEVICE_PARTITION_EQUALLY_EXT"..0x4050,
        "DEVICE_PARTITION_BY_COUNTS_EXT"..0x4051,
        "DEVICE_PARTITION_BY_NAMES_EXT"..0x4052,
        "DEVICE_PARTITION_BY_AFFINITY_DOMAIN_EXT"..0x4053
    )

    IntConstant(
        "AFFINITY_DOMAIN_L1_CACHE_EXT"..0x1,
        "AFFINITY_DOMAIN_L2_CACHE_EXT"..0x2,
        "AFFINITY_DOMAIN_L3_CACHE_EXT"..0x3,
        "AFFINITY_DOMAIN_L4_CACHE_EXT"..0x4,
        "AFFINITY_DOMAIN_NUMA_EXT"..0x10,
        "AFFINITY_DOMAIN_NEXT_FISSIONABLE_EXT"..0x100
    )

    LongConstant(
        "PROPERTIES_LIST_END_EXT".."0L",
        "PARTITION_BY_COUNTS_LIST_END_EXT".."0L",
        "PARTITION_BY_NAMES_LIST_END_EXT".."-1L"
    )

    cl_int("ReleaseDeviceEXT", cl_device_id("device"))
    cl_int( "RetainDeviceEXT", cl_device_id("device"))

    cl_int(
        "CreateSubDevicesEXT",

        cl_device_id("in_device"),
        NullTerminated..cl_device_partition_property_ext.const.p("properties"),
        AutoSize("out_devices")..cl_uint("num_entries"),
        nullable..cl_device_id.p("out_devices"),
        Check(1)..nullable..cl_uint.p("num_devices")
    )
}