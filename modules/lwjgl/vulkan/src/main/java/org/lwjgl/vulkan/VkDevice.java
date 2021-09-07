/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static java.lang.Math.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.vulkan.VK10.*;

/** Wraps a Vulkan device dispatchable handle. */
public class VkDevice extends DispatchableHandleDevice {

    private final VkPhysicalDevice physicalDevice;

    /**
     * Creates a {@code VkDevice} instance for the specified native handle.
     *
     * <p>The Vulkan version supported by the {@code VkDevice} will be determined by querying the {@link VkPhysicalDeviceProperties} of the specified physical
     * device.</p>
     *
     * @param handle         the native {@code VkDevice} handle
     * @param physicalDevice the physical device used to create the {@code VkDevice}
     * @param ci             the {@link VkDeviceCreateInfo} structure used to create the {@code VkDevice}
     */
    public VkDevice(long handle, VkPhysicalDevice physicalDevice, VkDeviceCreateInfo ci) {
        this(handle, physicalDevice, ci, 0);
    }

    /**
     * Creates a {@code VkDevice} instance for the specified native handle.
     *
     * <p>If {@code apiVersion} is 0, the Vulkan version supported by the {@code VkDevice} will be determined by querying the {@link VkPhysicalDeviceProperties}
     * of the specified physical device. Otherwise, the specified {@code apiVersion} will be used.</p>
     *
     * @param handle         the native {@code VkDevice} handle
     * @param physicalDevice the physical device used to create the {@code VkDevice}
     * @param ci             the {@link VkDeviceCreateInfo} structure used to create the {@code VkDevice}
     * @param apiVersion     if not 0, overrides the API version supported by the device.
     */
    public VkDevice(long handle, VkPhysicalDevice physicalDevice, VkDeviceCreateInfo ci, int apiVersion) {
        super(handle, getDeviceCapabilities(handle, physicalDevice, ci, apiVersion));
        this.physicalDevice = physicalDevice;
    }

    /** Returns the physical device used to create this {@code VkDevice}. */
    public VkPhysicalDevice getPhysicalDevice() {
        return physicalDevice;
    }

    private static VKCapabilitiesDevice getDeviceCapabilities(long handle, VkPhysicalDevice physicalDevice, VkDeviceCreateInfo ci, int apiVersion) {
        long GetDeviceProcAddr;
        try (MemoryStack stack = stackPush()) {
            if (apiVersion == 0) {
                VkPhysicalDeviceProperties props = VkPhysicalDeviceProperties.calloc(stack);
                vkGetPhysicalDeviceProperties(physicalDevice, props);
                apiVersion = min(
                    props.apiVersion(),
                    physicalDevice.getInstance().getCapabilities().apiVersion
                ) & 0xFFFFF_000; // mask the patch version
            }

            GetDeviceProcAddr = vkGetInstanceProcAddr(physicalDevice.getInstance(), "vkGetDeviceProcAddr");
        }

        return new VKCapabilitiesDevice(functionName -> {
            long address = callPPP(handle, memAddress(functionName), GetDeviceProcAddr);
            if (address == NULL && Checks.DEBUG_FUNCTIONS) {
                apiLog("Failed to locate address for VK device function " + memASCII(functionName));
            }
            return address;
        }, physicalDevice.getCapabilities(), apiVersion, VK.getEnabledExtensionSet(apiVersion, ci.ppEnabledExtensionNames()));
    }

}