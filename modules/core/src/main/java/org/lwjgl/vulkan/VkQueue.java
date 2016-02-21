/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan;

/** Wraps a Vulkan queue handle. */
public class VkQueue extends DispatchableHandle {

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