/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan;

/** Wraps a Vulkan physical device handle. */
public class VkPhysicalDevice extends DispatchableHandleInstance {

    private final VkInstance instance;

    /**
     * Creates a {@code VkPhysicalDevice} using the specified native handle and Vulkan instance.
     *
     * @param handle   the native {@code VkDevice} handle
     * @param instance the Vulkan instance from which the physical device was enumerated
     */
    public VkPhysicalDevice(long handle, VkInstance instance) {
        super(handle, instance.getCapabilities());
        this.instance = instance;
    }

    /** Returns the Vulkan instance from which this physical device was enumerated. */
    public VkInstance getInstance() {
        return instance;
    }

}