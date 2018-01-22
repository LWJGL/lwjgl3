/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.vulkan.VK10.*;

/** Wraps a Vulkan instance handle. */
public class VkInstance extends DispatchableHandleInstance {

    /**
     * Creates a {@link VkInstance} instance for the specified native handle.
     *
     * @param handle the native {@code VkInstance} handle
     * @param ci     the {@link VkInstanceCreateInfo} structured used to create the {@code VkInstance}.
     */
    public VkInstance(long handle, VkInstanceCreateInfo ci) {
        super(handle, getInstanceCapabilities(handle, ci));
    }

    private static VKCapabilitiesInstance getInstanceCapabilities(long handle, VkInstanceCreateInfo ci) {
        VkApplicationInfo appInfo = ci.pApplicationInfo();

        int apiVersion;
        if (appInfo != null) {
            apiVersion = appInfo.apiVersion();
        } else {
            // TODO: Do a better job here when new Vulkan versions are released
            apiVersion = VK_MAKE_VERSION(1, 0, 0);
        }

        long GetInstanceProcAddr = VK.getFunctionProvider().getFunctionAddress("vkGetInstanceProcAddr");
        if (GetInstanceProcAddr == NULL) {
            throw new IllegalStateException("A core Vulkan function is missing. Make sure that Vulkan is available.");
        }

        return new VKCapabilitiesInstance(functionName -> {
            long address = callPPP(GetInstanceProcAddr, handle, memAddress(functionName));
            if (address == NULL && Checks.DEBUG_FUNCTIONS) {
                apiLog("Failed to locate address for VK instance function " + memASCII(functionName));
            }
            return address;
        }, apiVersion, VK.getEnabledExtensionSet(apiVersion, ci.ppEnabledExtensionNames()));
    }

}