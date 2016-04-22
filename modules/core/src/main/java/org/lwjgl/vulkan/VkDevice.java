/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.vulkan.VkInstance.*;

/** Wraps a Vulkan device dispatchable handle. */
public class VkDevice extends DispatchableHandle {

	/**
	 * Creates a {@link VkDevice} instance for the specified native handle.
	 *
	 * @param handle         the native {@code VkDevice} handle
	 * @param physicalDevice the physical device used to create the {@code VkDevice}
	 * @param ci             the {@link VkDeviceCreateInfo} structure used to create the {@code VkDevice}
	 */
	public VkDevice(long handle, VkPhysicalDevice physicalDevice, VkDeviceCreateInfo ci) {
		super(handle, getDeviceCapabilities(handle, physicalDevice, ci));
	}

	private static VKCapabilities getDeviceCapabilities(long handle, VkPhysicalDevice physicalDevice, VkDeviceCreateInfo ci) {
		int apiVersion = physicalDevice.getCapabilities().apiVersion;
		return new VKCapabilities(functionName -> {
			VKCapabilities caps = physicalDevice.getCapabilities();
			long address = GetDeviceProcAddr(caps.vkGetDeviceProcAddr, handle, memAddress(functionName));
			if ( address == NULL ) {
				address = GetInstanceProcAddr(caps.vkGetInstanceProcAddr, physicalDevice.getInstance().address(), memAddress(functionName));
				if ( address == NULL ) {
					address = VK.getFunctionProvider().getFunctionAddress(functionName);
					if ( address == NULL && Checks.DEBUG_FUNCTIONS )
						apiLog("Failed to locate address for VK device function " + memASCII(functionName));
				}
			}
			return address;
		}, apiVersion, VK.getEnabledExtensionSet(apiVersion, ci.ppEnabledExtensionNames()));
	}

	static long GetDeviceProcAddr(long __functionAddress, long handle, long functionName) {
		return callPPP(__functionAddress, handle, functionName);
	}

}