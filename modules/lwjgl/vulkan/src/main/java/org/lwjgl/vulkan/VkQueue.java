/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan;

/** Wraps a Vulkan queue handle. */
public class VkQueue extends DispatchableHandleDevice {

    private final VkDevice device;

    /**
     * Creates a {@code VkQueue} using the specified native handle and device.
     *
     * @param handle the native {@code VkQueue} handle
     * @param device the device from which the queue was retrieved
     */
    public VkQueue(long handle, VkDevice device) {
        super(handle, device.getCapabilities());
        this.device = device;
    }

    /** Returns the device from which this {@code VkQueue} was retrieved. */
    public VkDevice getDevice() {
        return device;
    }

}