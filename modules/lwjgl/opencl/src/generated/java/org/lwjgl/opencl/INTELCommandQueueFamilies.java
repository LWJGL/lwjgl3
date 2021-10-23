/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_command_queue_families.txt">intel_command_queue_families</a> extension.
 * 
 * <p>Some OpenCL devices may support different sets of command queues with different capabilities or execution properties. These sets are described in this
 * extension as command queue families. Applications may be able to improve performance or predictability by creating command queues from a specific
 * command queue family.</p>
 * 
 * <p>This extension adds the ability to:</p>
 * 
 * <ul>
 * <li>Query the command queue families supported by an OpenCL device and their capabilities.</li>
 * <li>Create an OpenCL command queue from a specific command queue family.</li>
 * <li>Query the command queue family and command queue index associated with an OpenCL command queue.</li>
 * </ul>
 * 
 * <p>Requires {@link CL20 CL20}.</p>
 */
public final class INTELCommandQueueFamilies {

    /**
     * Accepted value for the {@code param_name} parameter to {@link CL10#clGetDeviceInfo GetDeviceInfo} to query the number of command queue families and command queue family
     * properties supported by an OpenCL device.
     */
    public static final int CL_DEVICE_QUEUE_FAMILY_PROPERTIES_INTEL = 0x418B;

    /**
     * Accepted as a property name for the {@code properties} parameter to {@link CL20#clCreateCommandQueueWithProperties CreateCommandQueueWithProperties} to specify the command queue family and command
     * queue index that this command queue should submit work to; and for the {@code param_name} parameter to {@link CL10#clGetCommandQueueInfo GetCommandQueueInfo} to query the command
     * queue family or command queue index associated with a command queue.
     */
    public static final int
        CL_QUEUE_FAMILY_INTEL = 0x418C,
        CL_QUEUE_INDEX_INTEL  = 0x418D;

    /**
     * Bitfield type describing the capabilities of the queues in a command queue family. Subsequent versions of this extension may add additional queue
     * capabilities.
     */
    public static final int
        CL_QUEUE_DEFAULT_CAPABILITIES_INTEL                    = 0,
        CL_QUEUE_CAPABILITY_CREATE_SINGLE_QUEUE_EVENTS_INTEL   = (1 << 0),
        CL_QUEUE_CAPABILITY_CREATE_CROSS_QUEUE_EVENTS_INTEL    = (1 << 1),
        CL_QUEUE_CAPABILITY_SINGLE_QUEUE_EVENT_WAIT_LIST_INTEL = (1 << 2),
        CL_QUEUE_CAPABILITY_CROSS_QUEUE_EVENT_WAIT_LIST_INTEL  = (1 << 3),
        CL_QUEUE_CAPABILITY_TRANSFER_BUFFER_INTEL              = (1 << 8),
        CL_QUEUE_CAPABILITY_TRANSFER_BUFFER_RECT_INTEL         = (1 << 9),
        CL_QUEUE_CAPABILITY_MAP_BUFFER_INTEL                   = (1 << 10),
        CL_QUEUE_CAPABILITY_FILL_BUFFER_INTEL                  = (1 << 11),
        CL_QUEUE_CAPABILITY_TRANSFER_IMAGE_INTEL               = (1 << 12),
        CL_QUEUE_CAPABILITY_MAP_IMAGE_INTEL                    = (1 << 13),
        CL_QUEUE_CAPABILITY_FILL_IMAGE_INTEL                   = (1 << 14),
        CL_QUEUE_CAPABILITY_TRANSFER_BUFFER_IMAGE_INTEL        = (1 << 15),
        CL_QUEUE_CAPABILITY_TRANSFER_IMAGE_BUFFER_INTEL        = (1 << 16),
        CL_QUEUE_CAPABILITY_MARKER_INTEL                       = (1 << 24),
        CL_QUEUE_CAPABILITY_BARRIER_INTEL                      = (1 << 25),
        CL_QUEUE_CAPABILITY_KERNEL_INTEL                       = (1 << 26);

    private INTELCommandQueueFamilies() {}

}