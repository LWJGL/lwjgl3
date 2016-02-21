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
	 * Creates a {@code VkInstance} using the specified native handle.
	 *
	 * @param handle the native {@code VkInstance} handle
	 */
	public VkInstance(long handle) {
		super(handle, getInstanceCapabilities(handle));
	}

	private static VKCapabilities getInstanceCapabilities(final long handle) {
		return new VKCapabilities(new FunctionProvider.Default() {
			private final long GetInstanceProcAddr = VK.getFunctionProvider().getFunctionAddress("vkGetInstanceProcAddr");

			{
				if ( GetInstanceProcAddr == NULL )
					throw new IllegalStateException("A core Vulkan function is missing. Make sure that Vulkan is available.");
			}

			@Override
			public long getFunctionAddress(CharSequence functionName) {
				APIBuffer __buffer = apiBuffer();
				__buffer.stringParamASCII(functionName, true);

				long address = callPPP(GetInstanceProcAddr, handle, __buffer.address());
				if ( address == NULL )
					address = VK.getFunctionProvider().getFunctionAddress(functionName);

				return address;
			}

			@Override
			protected void destroy() {
			}
		});
	}

}