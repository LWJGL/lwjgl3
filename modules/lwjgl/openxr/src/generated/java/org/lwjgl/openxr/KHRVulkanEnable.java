/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.vulkan.*;

public class KHRVulkanEnable {

    public static final int XR_KHR_vulkan_enable_SPEC_VERSION = 8;

    public static final String XR_KHR_VULKAN_ENABLE_EXTENSION_NAME = "XR_KHR_vulkan_enable";

    public static final int
        XR_TYPE_GRAPHICS_BINDING_VULKAN_KHR      = 1000025000,
        XR_TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR       = 1000025001,
        XR_TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR = 1000025002;

    protected KHRVulkanEnable() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetVulkanInstanceExtensionsKHR ] ---

    /** {@code XrResult xrGetVulkanInstanceExtensionsKHR(XrInstance instance, XrSystemId systemId, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    public static int nxrGetVulkanInstanceExtensionsKHR(XrInstance instance, long systemId, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanInstanceExtensionsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetVulkanInstanceExtensionsKHR(XrInstance instance, XrSystemId systemId, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    @NativeType("XrResult")
    public static int xrGetVulkanInstanceExtensionsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("char *") @Nullable ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetVulkanInstanceExtensionsKHR(instance, systemId, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetVulkanDeviceExtensionsKHR ] ---

    /** {@code XrResult xrGetVulkanDeviceExtensionsKHR(XrInstance instance, XrSystemId systemId, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    public static int nxrGetVulkanDeviceExtensionsKHR(XrInstance instance, long systemId, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanDeviceExtensionsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetVulkanDeviceExtensionsKHR(XrInstance instance, XrSystemId systemId, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    @NativeType("XrResult")
    public static int xrGetVulkanDeviceExtensionsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("char *") @Nullable ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetVulkanDeviceExtensionsKHR(instance, systemId, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetVulkanGraphicsDeviceKHR ] ---

    /** {@code XrResult xrGetVulkanGraphicsDeviceKHR(XrInstance instance, XrSystemId systemId, VkInstance vkInstance, VkPhysicalDevice * vkPhysicalDevice)} */
    public static int nxrGetVulkanGraphicsDeviceKHR(XrInstance instance, long systemId, VkInstance vkInstance, long vkPhysicalDevice) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanGraphicsDeviceKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, vkInstance.address(), vkPhysicalDevice, __functionAddress);
    }

    /** {@code XrResult xrGetVulkanGraphicsDeviceKHR(XrInstance instance, XrSystemId systemId, VkInstance vkInstance, VkPhysicalDevice * vkPhysicalDevice)} */
    @NativeType("XrResult")
    public static int xrGetVulkanGraphicsDeviceKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, VkInstance vkInstance, @NativeType("VkPhysicalDevice *") PointerBuffer vkPhysicalDevice) {
        if (CHECKS) {
            check(vkPhysicalDevice, 1);
        }
        return nxrGetVulkanGraphicsDeviceKHR(instance, systemId, vkInstance, memAddress(vkPhysicalDevice));
    }

    // --- [ xrGetVulkanGraphicsRequirementsKHR ] ---

    /** {@code XrResult xrGetVulkanGraphicsRequirementsKHR(XrInstance instance, XrSystemId systemId, XrGraphicsRequirementsVulkanKHR * graphicsRequirements)} */
    public static int nxrGetVulkanGraphicsRequirementsKHR(XrInstance instance, long systemId, long graphicsRequirements) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanGraphicsRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(instance.address(), systemId, graphicsRequirements, __functionAddress);
    }

    /** {@code XrResult xrGetVulkanGraphicsRequirementsKHR(XrInstance instance, XrSystemId systemId, XrGraphicsRequirementsVulkanKHR * graphicsRequirements)} */
    @NativeType("XrResult")
    public static int xrGetVulkanGraphicsRequirementsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrGraphicsRequirementsVulkanKHR *") XrGraphicsRequirementsVulkanKHR graphicsRequirements) {
        return nxrGetVulkanGraphicsRequirementsKHR(instance, systemId, graphicsRequirements.address());
    }

}