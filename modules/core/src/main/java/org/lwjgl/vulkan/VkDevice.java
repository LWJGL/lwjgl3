/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Wraps a Vulkan device dispatchable handle. */
public class VkDevice extends DispatchableHandleDevice {

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

    private static VKCapabilitiesDevice getDeviceCapabilities(long handle, VkPhysicalDevice physicalDevice, VkDeviceCreateInfo ci) {
        VKCapabilitiesInstance capsInstance = physicalDevice.getCapabilities();

        long vkGetDeviceProcAddr;
        try (MemoryStack stack = stackPush()) {
            vkGetDeviceProcAddr = callPPP(
                VK.getGlobalCommands().vkGetInstanceProcAddr,
                physicalDevice.getInstance().address(),
                memAddress(stack.ASCII("vkGetDeviceProcAddr"))
            );
        }

        return new VKCapabilitiesDevice(functionName -> {
            long address = callPPP(vkGetDeviceProcAddr, handle, memAddress(functionName));
            if (address == NULL && Checks.DEBUG_FUNCTIONS) {
                apiLog("Failed to locate address for VK device function " + memASCII(functionName));
            }
            return address;
        }, capsInstance, VK.getEnabledExtensionSet(capsInstance.apiVersion, ci.ppEnabledExtensionNames()));
    }

}