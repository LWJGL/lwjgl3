/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan;

/** Wraps a Vulkan queue handle. */
public class VkQueue extends DispatchableHandleDevice {

    /**
     * Creates a {@code VkQueue} using the specified native handle and device.
     *
     * @param handle the native {@code VkQueue} handle
     * @param device the device from which the queue was retrieved
     */
    public VkQueue(long handle, VkDevice device) {
        super(handle, device.getCapabilities());
    }

}