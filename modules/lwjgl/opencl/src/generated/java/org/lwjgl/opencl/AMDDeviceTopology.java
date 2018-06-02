/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <strong>amd_device_topology</strong> extension.
 * 
 * <p>This extension enables the developer to get a description of the topology used to connect the device to the host.</p>
 */
public final class AMDDeviceTopology {

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}. Returns a description of the topology used to connect the device to the
     * host, using the following 32-bytes union of structures:
     * 
     * <pre><code>
     * typedef union
     * {
     *     struct { cl_uint type; cl_uint data[5]; } raw;
     *     struct { cl_uint type; cl_char unused[17]; cl_char bus; cl_char device; cl_char function; } pcie;
     * } cl_device_topology_amd;</code></pre>
     * 
     * <p>The type of the structure returned can be queried by reading the first unsigned int of the returned data. The developer can use this type to cast the
     * returned union into the right structure type.</p>
     * 
     * <p>Currently, the only supported type in the structure above is {@link #CL_DEVICE_TOPOLOGY_TYPE_PCIE_AMD DEVICE_TOPOLOGY_TYPE_PCIE_AMD}. The information returned contains the PCI
     * Bus/Device/Function of the device, and is similar to the result of the lspci command in Linux. It enables the developer to match between the OpenCL
     * device ID and the physical PCI connection of the card.</p>
     */
    public static final int CL_DEVICE_TOPOLOGY_AMD = 0x4037;

    /** Indicates the type of the struct returned by {@link #CL_DEVICE_TOPOLOGY_AMD DEVICE_TOPOLOGY_AMD}. */
    public static final int CL_DEVICE_TOPOLOGY_TYPE_PCIE_AMD = 1;

    private AMDDeviceTopology() {}

}