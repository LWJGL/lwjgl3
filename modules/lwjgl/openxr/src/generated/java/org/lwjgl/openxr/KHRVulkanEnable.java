/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.vulkan.*;

/** The KHR_vulkan_enable extension. */
public class KHRVulkanEnable {

    /** The extension specification version. */
    public static final int XR_KHR_vulkan_enable_SPEC_VERSION = 7;

    /** The extension name. */
    public static final String XR_KHR_VULKAN_ENABLE_EXTENSION_NAME = "XR_KHR_vulkan_enable";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_GRAPHICS_BINDING_VULKAN_KHR TYPE_GRAPHICS_BINDING_VULKAN_KHR}</li>
     * <li>{@link #XR_TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR}</li>
     * <li>{@link #XR_TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_GRAPHICS_BINDING_VULKAN_KHR      = 1000025000,
        XR_TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR       = 1000025001,
        XR_TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR = 1000025002;

    protected KHRVulkanEnable() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetVulkanInstanceExtensionsKHR ] ---

    public static int nxrGetVulkanInstanceExtensionsKHR(XrInstance instance, long systemId, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanInstanceExtensionsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetVulkanInstanceExtensionsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @Nullable @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetVulkanInstanceExtensionsKHR(instance, systemId, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetVulkanDeviceExtensionsKHR ] ---

    public static int nxrGetVulkanDeviceExtensionsKHR(XrInstance instance, long systemId, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanDeviceExtensionsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetVulkanDeviceExtensionsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @Nullable @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetVulkanDeviceExtensionsKHR(instance, systemId, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetVulkanGraphicsDeviceKHR ] ---

    public static int nxrGetVulkanGraphicsDeviceKHR(XrInstance instance, long systemId, VkInstance vkInstance, long vkPhysicalDevice) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanGraphicsDeviceKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, vkInstance.address(), vkPhysicalDevice, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetVulkanGraphicsDeviceKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, VkInstance vkInstance, @NativeType("VkPhysicalDevice *") PointerBuffer vkPhysicalDevice) {
        if (CHECKS) {
            check(vkPhysicalDevice, 1);
        }
        return nxrGetVulkanGraphicsDeviceKHR(instance, systemId, vkInstance, memAddress(vkPhysicalDevice));
    }

    // --- [ xrGetVulkanGraphicsRequirementsKHR ] ---

    public static int nxrGetVulkanGraphicsRequirementsKHR(XrInstance instance, long systemId, long graphicsRequirements) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanGraphicsRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(instance.address(), systemId, graphicsRequirements, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetVulkanGraphicsRequirementsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrGraphicsRequirementsVulkanKHR *") XrGraphicsRequirementsVulkanKHR graphicsRequirements) {
        return nxrGetVulkanGraphicsRequirementsKHR(instance, systemId, graphicsRequirements.address());
    }

    /** Array version of: {@link #xrGetVulkanInstanceExtensionsKHR GetVulkanInstanceExtensionsKHR} */
    @NativeType("XrResult")
    public static int xrGetVulkanInstanceExtensionsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") int[] bufferCountOutput, @Nullable @NativeType("char *") ByteBuffer buffer) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanInstanceExtensionsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(bufferCountOutput, 1);
        }
        return callPJPPI(instance.address(), systemId, remainingSafe(buffer), bufferCountOutput, memAddressSafe(buffer), __functionAddress);
    }

    /** Array version of: {@link #xrGetVulkanDeviceExtensionsKHR GetVulkanDeviceExtensionsKHR} */
    @NativeType("XrResult")
    public static int xrGetVulkanDeviceExtensionsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") int[] bufferCountOutput, @Nullable @NativeType("char *") ByteBuffer buffer) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanDeviceExtensionsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(bufferCountOutput, 1);
        }
        return callPJPPI(instance.address(), systemId, remainingSafe(buffer), bufferCountOutput, memAddressSafe(buffer), __functionAddress);
    }

}