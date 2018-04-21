/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_device_partition_by_names.txt">intel_device_partition_by_names</a> extension.
 * 
 * <p>This extension allows the user to create sub-devices containing specific compute units. {@link #CL_DEVICE_PARTITION_BY_NAMES_INTEL DEVICE_PARTITION_BY_NAMES_INTEL} is a
 * {@code cl_device_partition_property} that is followed by a list of compute unit names, teminated by {@link #CL_PARTITION_BY_NAMES_LIST_END_INTEL PARTITION_BY_NAMES_LIST_END_INTEL}.
 * Compute unit names are integers that count up from zero to the number of compute units minus one. Only one sub-device may be created at a time with this
 * selector. An individual compute unit name may not appear more than once in the sub-device description. A sub-device created with
 * {@link #CL_DEVICE_PARTITION_BY_NAMES_INTEL DEVICE_PARTITION_BY_NAMES_INTEL} cannot be further sub-divided. A sub-device created with another partitioning mode cannot be further
 * sub-divided by {@link #CL_DEVICE_PARTITION_BY_NAMES_INTEL DEVICE_PARTITION_BY_NAMES_INTEL}.</p>
 * 
 * <p>Example: To create a three compute unit sub-device using compute units, [ 0, 1, 3 ], pass:</p>
 * 
 * <p>[ {@link #CL_DEVICE_PARTITION_BY_NAMES_INTEL DEVICE_PARTITION_BY_NAMES_INTEL}, 0, 1, 3, {@link #CL_PARTITION_BY_NAMES_LIST_END_INTEL PARTITION_BY_NAMES_LIST_END_INTEL}, 0 ]</p>
 * 
 * <p>The meaning of these numbers are, in order:</p>
 * 
 * <ul>
 * <li>0 the name of the first compute unit in the sub-device</li>
 * <li>1 the name of the second compute unit in the sub-device</li>
 * <li>3 the name of the third compute unit in the sub-device</li>
 * </ul>
 */
public final class INTELDevicePartitionByNames {

    /** Accepted in the {@code properties} argument of {@link CL12#clCreateSubDevices CreateSubDevices}. */
    public static final int CL_DEVICE_PARTITION_BY_NAMES_INTEL = 0x4052;

    /** The name list terminator. */
    public static final int CL_PARTITION_BY_NAMES_LIST_END_INTEL = -1;

    private INTELDevicePartitionByNames() {}

}