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

/** Wraps a Vulkan device dispatchable handle. */
public class VkDevice extends DispatchableHandle {

	/**
	 * Creates a {@code VkDevice} using the specified native handle and physical device.
	 *
	 * @param handle         the native {@code VkDevice} handle
	 * @param physicalDevice the physical device on which the device was created
	 */
	public VkDevice(long handle, VkPhysicalDevice physicalDevice) {
		super(handle, getDeviceCapabilities(handle, physicalDevice));
	}

	private static VKCapabilities getDeviceCapabilities(final long handle, final VkPhysicalDevice physicalDevice) {
		return new VKCapabilities(new FunctionProvider.Default() {
			@Override
			public long getFunctionAddress(CharSequence functionName) {
				APIBuffer __buffer = apiBuffer();
				__buffer.stringParamASCII(functionName, true);

				long address = callPPP(physicalDevice.getCapabilities().__VK10.GetDeviceProcAddr, handle, __buffer.address());
				if ( address == NULL ) {
					address = callPPP(physicalDevice.getCapabilities().__VK10.GetInstanceProcAddr, physicalDevice.getInstance().address(), __buffer.address());
					if ( address == NULL )
						address = VK.getFunctionProvider().getFunctionAddress(functionName);
				}

				return address;
			}

			@Override
			protected void destroy() {
			}
		});
	}

}