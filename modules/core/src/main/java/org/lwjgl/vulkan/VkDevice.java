/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.FunctionProvider;

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

	private static VKCapabilities getDeviceCapabilities(final long handle, final VkPhysicalDevice physicalDevice, VkDeviceCreateInfo ci) {
		int apiVersion = physicalDevice.getCapabilities().apiVersion;
		return new VKCapabilities(
			apiVersion,
			VK.getEnabledExtensionSet(apiVersion, ci.ppEnabledExtensionNames()),
			new FunctionProvider() {
				@Override
				public long getFunctionAddress(CharSequence functionName) {
					APIBuffer __buffer = apiBuffer();
					__buffer.stringParamASCII(functionName, true);

					VK10 vk = physicalDevice.getCapabilities().__VK10;
					long address = GetDeviceProcAddr(vk.GetDeviceProcAddr, handle, __buffer.address());
					if ( address == NULL ) {
						address = GetInstanceProcAddr(vk.GetInstanceProcAddr, physicalDevice.getInstance().address(), __buffer.address
							());
						if ( address == NULL )
							address = VK.getFunctionProvider().getFunctionAddress(functionName);
					}

					return address;
				}

				@Override
				public void free() {
				}
			}
		);
	}

	static long GetDeviceProcAddr(long __functionAddress, long handle, long functionName) {
		return callPPP(__functionAddress, handle, functionName);
	}

}