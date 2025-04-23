/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan;

/** Wraps a Vulkan external compute queue handle ({@code VK_NV_external_compute_queue}). */
public class VkExternalComputeQueueNV extends DispatchableHandleDevice {

    private final VkDevice device;

    /**
     * Creates a {@code VkExternalComputeQueueNV} using the specified native handle and device.
     *
     * @param handle the native {@code VkExternalComputeQueueNV} handle
     * @param device the device from which the external compute queue was retrieved
     */
    public VkExternalComputeQueueNV(long handle, VkDevice device) {
        super(handle, device.getCapabilities());
        this.device = device;
    }

    /** Returns the device from which this {@code VkExternalComputeQueueNV} was retrieved. */
    public VkDevice getDevice() {
        return device;
    }

    @Override
    public VKCapabilitiesInstance getCapabilitiesInstance() {
        return getDevice().getCapabilitiesInstance();
    }
}