/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.vulkan.VK10.*;

/** Wraps a Vulkan instance handle. */
public class VkInstance extends DispatchableHandleInstance {

    /**
     * Creates a {@code VkInstance} instance for the specified native handle.
     *
     * @param handle the native {@code VkInstance} handle
     * @param ci     the {@link VkInstanceCreateInfo} structured used to create the {@code VkInstance}.
     */
    public VkInstance(long handle, VkInstanceCreateInfo ci) {
        super(handle, getInstanceCapabilities(handle, ci));
    }

    private static VKCapabilitiesInstance getInstanceCapabilities(long handle, VkInstanceCreateInfo ci) {
        VkApplicationInfo appInfo = ci.pApplicationInfo();

        int apiVersion = appInfo != null && appInfo.apiVersion() != 0
            ? appInfo.apiVersion()
            : VK_API_VERSION_1_0;

        return new VKCapabilitiesInstance(functionName -> {
            long address = callPPP(handle, memAddress(functionName), VK.getGlobalCommands().vkGetInstanceProcAddr);
            if (address == NULL && Checks.DEBUG_FUNCTIONS) {
                apiLogMissing("VK instance", functionName);
            }
            return address;
        }, apiVersion, VK.getEnabledExtensionSet(apiVersion, ci.ppEnabledExtensionNames()), getAvailableDeviceExtensions(handle));
    }

    // Will be used to identify logical device extensions that extend physical device functionality.
    // Such functions can be called on a physical device, before a logical device has been created.
    private static Set<String> getAvailableDeviceExtensions(long instance) {
        HashSet<String> extensions = new HashSet<>();

        out:
        try (MemoryStack stack = stackPush()) {
            IntBuffer ip = stack.callocInt(1);

            long GetInstanceProcAddr                = VK.getGlobalCommands().vkGetInstanceProcAddr;
            long EnumeratePhysicalDevices           = callPPP(instance, memAddress(stack.ASCII("vkEnumeratePhysicalDevices")), GetInstanceProcAddr);
            long EnumerateDeviceExtensionProperties = callPPP(instance, memAddress(stack.ASCII("vkEnumerateDeviceExtensionProperties")), GetInstanceProcAddr);
            if (EnumeratePhysicalDevices == NULL || EnumerateDeviceExtensionProperties == NULL) {
                break out;
            }

            int err = callPPPI(instance, memAddress(ip), NULL, EnumeratePhysicalDevices);
            if (err != VK_SUCCESS || ip.get(0) == 0) {
                break out;
            }

            PointerBuffer physicalDevices = stack.mallocPointer(ip.get(0));
            err = callPPPI(instance, memAddress(ip), memAddress(physicalDevices), EnumeratePhysicalDevices);
            if (err != VK_SUCCESS) {
                break out;
            }

            for (int i = 0; i < physicalDevices.remaining(); i++) {
                err = callPPPPI(physicalDevices.get(i), NULL, memAddress(ip), NULL, EnumerateDeviceExtensionProperties);
                if (err != VK_SUCCESS || ip.get(0) == 0) {
                    continue;
                }

                try (VkExtensionProperties.Buffer deviceExtensions = VkExtensionProperties.malloc(ip.get(0))) {
                    err = callPPPPI(physicalDevices.get(i), NULL, memAddress(ip), deviceExtensions.address(), EnumerateDeviceExtensionProperties);
                    if (err != VK_SUCCESS) {
                        continue;
                    }

                    for (int j = 0; j < deviceExtensions.remaining(); j++) {
                        extensions.add(deviceExtensions.get(j).extensionNameString());
                    }
                }
            }
        }

        return extensions;
    }

}