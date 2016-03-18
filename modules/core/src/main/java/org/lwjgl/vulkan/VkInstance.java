/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.MemoryStack;

import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.vulkan.VKUtil.*;

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
		VkApplicationInfo appInfo = ci.pApplicationInfo();
		int apiVersion;
		if ( appInfo != null )
			apiVersion = appInfo.apiVersion();
		else {
			// TODO: Do a better job here when new Vulkan versions are released
			apiVersion = VK_MAKE_VERSION(1, 0, 0);
		}

		return new VKCapabilities(apiVersion, VK.getEnabledExtensionSet(apiVersion, ci.ppEnabledExtensionNames()), new FunctionProvider() {
			private final long GetInstanceProcAddr = VK.getFunctionProvider().getFunctionAddress("vkGetInstanceProcAddr");

			{
				if ( GetInstanceProcAddr == NULL )
					throw new IllegalStateException("A core Vulkan function is missing. Make sure that Vulkan is available.");
			}

			@Override
			public long getFunctionAddress(CharSequence functionName) {
				MemoryStack stack = stackPush();
				try {
					long address = GetInstanceProcAddr(GetInstanceProcAddr, handle, memAddress(memEncodeASCII(functionName, true, BufferAllocator.STACK)));
					if ( address == NULL )
						address = VK.getFunctionProvider().getFunctionAddress(functionName);

					return address;
				} finally {
					stack.pop();
				}
			}

			@Override
			public void free() {
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