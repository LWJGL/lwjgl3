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

/** Wraps a Vulkan instance handle. */
public class VkInstance extends DispatchableHandle {

	/**
	 * Creates a {@link VkInstance} instance for the specified native handle.
	 *
	 * @param handle the native {@code VkInstance} handle
	 * @param ci     the {@link VkInstanceCreateInfo} structured used to create the {@code VkInstance}.
	 */
	public VkInstance(long handle, VkInstanceCreateInfo ci) {
		super(handle, getInstanceCapabilities(handle, ci));
	}

	private static VKCapabilities getInstanceCapabilities(final long handle, VkInstanceCreateInfo ci) {
		int apiVersion = ci.pApplicationInfo().apiVersion();
		return new VKCapabilities(apiVersion, VK.getEnabledExtensionSet(apiVersion, ci.ppEnabledExtensionNames()), new FunctionProvider.Default() {
			private final long GetInstanceProcAddr = VK.getFunctionProvider().getFunctionAddress("vkGetInstanceProcAddr");

			{
				if ( GetInstanceProcAddr == NULL )
					throw new IllegalStateException("A core Vulkan function is missing. Make sure that Vulkan is available.");
			}

			@Override
			public long getFunctionAddress(CharSequence functionName) {
				APIBuffer __buffer = apiBuffer();
				__buffer.stringParamASCII(functionName, true);

				long address = GetInstanceProcAddr(GetInstanceProcAddr, handle, __buffer.address());
				if ( address == NULL )
					address = VK.getFunctionProvider().getFunctionAddress(functionName);

				return address;
			}

			@Override
			protected void destroy() {
			}
		});
	}

	static long GetInstanceProcAddr(long __functionAddress, long handle, long functionName) {
		long address = callPPP(__functionAddress, handle, functionName);
		if ( address == NULL )
			address = callPPP(__functionAddress, NULL, functionName);

		return address;
	}

}