/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan;

/** Wraps a Vulkan command buffer handle. */
public class VkCommandBuffer extends DispatchableHandle {

	/**
	 * Creates a {@code VkCommandBuffer} using the specified native handle and device.
	 *
	 * @param handle the native {@code VkCommandBuffer} handle
	 * @param device the device on which the command buffer was created
	 */
	public VkCommandBuffer(long handle, VkDevice device) {
		super(handle, device.getCapabilities());
	}

}