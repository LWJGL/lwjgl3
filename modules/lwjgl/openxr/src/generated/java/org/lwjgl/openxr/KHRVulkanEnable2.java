/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The KHR_vulkan_enable2 extension. */
public class KHRVulkanEnable2 {

    /** The extension specification version. */
    public static final int XR_KHR_vulkan_enable2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_KHR_VULKAN_ENABLE2_EXTENSION_NAME = "XR_KHR_vulkan_enable2";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_VULKAN_INSTANCE_CREATE_INFO_KHR TYPE_VULKAN_INSTANCE_CREATE_INFO_KHR}</li>
     * <li>{@link #XR_TYPE_VULKAN_DEVICE_CREATE_INFO_KHR TYPE_VULKAN_DEVICE_CREATE_INFO_KHR}</li>
     * <li>{@link #XR_TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR}</li>
     * <li>{@link #XR_TYPE_GRAPHICS_BINDING_VULKAN2_KHR TYPE_GRAPHICS_BINDING_VULKAN2_KHR}</li>
     * <li>{@link #XR_TYPE_SWAPCHAIN_IMAGE_VULKAN2_KHR TYPE_SWAPCHAIN_IMAGE_VULKAN2_KHR}</li>
     * <li>{@link #XR_TYPE_GRAPHICS_REQUIREMENTS_VULKAN2_KHR TYPE_GRAPHICS_REQUIREMENTS_VULKAN2_KHR}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_VULKAN_INSTANCE_CREATE_INFO_KHR     = 1000090000,
        XR_TYPE_VULKAN_DEVICE_CREATE_INFO_KHR       = 1000090001,
        XR_TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR = 1000090003,
        XR_TYPE_GRAPHICS_BINDING_VULKAN2_KHR        = 1000090000,
        XR_TYPE_SWAPCHAIN_IMAGE_VULKAN2_KHR         = 1000090001,
        XR_TYPE_GRAPHICS_REQUIREMENTS_VULKAN2_KHR   = 1000090002;

    protected KHRVulkanEnable2() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateVulkanInstanceKHR ] ---

    public static int nxrCreateVulkanInstanceKHR(XrInstance instance, long createInfo, long vulkanInstance, long vulkanResult) {
        long __functionAddress = instance.getCapabilities().xrCreateVulkanInstanceKHR;
        if (CHECKS) {
            check(__functionAddress);
            XrVulkanInstanceCreateInfoKHR.validate(createInfo);
        }
        return callPPPPI(instance.address(), createInfo, vulkanInstance, vulkanResult, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrCreateVulkanInstanceKHR(XrInstance instance, @NativeType("XrVulkanInstanceCreateInfoKHR const *") XrVulkanInstanceCreateInfoKHR createInfo, @NativeType("VkInstance *") PointerBuffer vulkanInstance, @NativeType("VkResult *") IntBuffer vulkanResult) {
        if (CHECKS) {
            check(vulkanInstance, 1);
            check(vulkanResult, 1);
        }
        return nxrCreateVulkanInstanceKHR(instance, createInfo.address(), memAddress(vulkanInstance), memAddress(vulkanResult));
    }

    // --- [ xrCreateVulkanDeviceKHR ] ---

    public static int nxrCreateVulkanDeviceKHR(XrInstance instance, long createInfo, long vulkanDevice, long vulkanResult) {
        long __functionAddress = instance.getCapabilities().xrCreateVulkanDeviceKHR;
        if (CHECKS) {
            check(__functionAddress);
            XrVulkanDeviceCreateInfoKHR.validate(createInfo);
        }
        return callPPPPI(instance.address(), createInfo, vulkanDevice, vulkanResult, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrCreateVulkanDeviceKHR(XrInstance instance, @NativeType("XrVulkanDeviceCreateInfoKHR const *") XrVulkanDeviceCreateInfoKHR createInfo, @NativeType("VkDevice *") PointerBuffer vulkanDevice, @NativeType("VkResult *") IntBuffer vulkanResult) {
        if (CHECKS) {
            check(vulkanDevice, 1);
            check(vulkanResult, 1);
        }
        return nxrCreateVulkanDeviceKHR(instance, createInfo.address(), memAddress(vulkanDevice), memAddress(vulkanResult));
    }

    // --- [ xrGetVulkanGraphicsDevice2KHR ] ---

    public static int nxrGetVulkanGraphicsDevice2KHR(XrInstance instance, long getInfo, long vulkanPhysicalDevice) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanGraphicsDevice2KHR;
        if (CHECKS) {
            check(__functionAddress);
            XrVulkanGraphicsDeviceGetInfoKHR.validate(getInfo);
        }
        return callPPPI(instance.address(), getInfo, vulkanPhysicalDevice, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetVulkanGraphicsDevice2KHR(XrInstance instance, @NativeType("XrVulkanGraphicsDeviceGetInfoKHR const *") XrVulkanGraphicsDeviceGetInfoKHR getInfo, @NativeType("VkPhysicalDevice *") PointerBuffer vulkanPhysicalDevice) {
        if (CHECKS) {
            check(vulkanPhysicalDevice, 1);
        }
        return nxrGetVulkanGraphicsDevice2KHR(instance, getInfo.address(), memAddress(vulkanPhysicalDevice));
    }

    // --- [ xrGetVulkanGraphicsRequirements2KHR ] ---

    /** Unsafe version of: {@link #xrGetVulkanGraphicsRequirements2KHR GetVulkanGraphicsRequirements2KHR} */
    public static int nxrGetVulkanGraphicsRequirements2KHR(XrInstance instance, long systemId, long graphicsRequirements) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanGraphicsRequirements2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(instance.address(), systemId, graphicsRequirements, __functionAddress);
    }

    /** See {@link KHRVulkanEnable#xrGetVulkanGraphicsRequirementsKHR GetVulkanGraphicsRequirementsKHR}. */
    @NativeType("XrResult")
    public static int xrGetVulkanGraphicsRequirements2KHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrGraphicsRequirementsVulkanKHR *") XrGraphicsRequirementsVulkanKHR.Buffer graphicsRequirements) {
        if (CHECKS) {
            check(graphicsRequirements, 1);
        }
        return nxrGetVulkanGraphicsRequirements2KHR(instance, systemId, graphicsRequirements.address());
    }

    /** Array version of: {@link #xrCreateVulkanInstanceKHR CreateVulkanInstanceKHR} */
    @NativeType("XrResult")
    public static int xrCreateVulkanInstanceKHR(XrInstance instance, @NativeType("XrVulkanInstanceCreateInfoKHR const *") XrVulkanInstanceCreateInfoKHR createInfo, @NativeType("VkInstance *") PointerBuffer vulkanInstance, @NativeType("VkResult *") int[] vulkanResult) {
        long __functionAddress = instance.getCapabilities().xrCreateVulkanInstanceKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(vulkanInstance, 1);
            check(vulkanResult, 1);
            XrVulkanInstanceCreateInfoKHR.validate(createInfo.address());
        }
        return callPPPPI(instance.address(), createInfo.address(), memAddress(vulkanInstance), vulkanResult, __functionAddress);
    }

    /** Array version of: {@link #xrCreateVulkanDeviceKHR CreateVulkanDeviceKHR} */
    @NativeType("XrResult")
    public static int xrCreateVulkanDeviceKHR(XrInstance instance, @NativeType("XrVulkanDeviceCreateInfoKHR const *") XrVulkanDeviceCreateInfoKHR createInfo, @NativeType("VkDevice *") PointerBuffer vulkanDevice, @NativeType("VkResult *") int[] vulkanResult) {
        long __functionAddress = instance.getCapabilities().xrCreateVulkanDeviceKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(vulkanDevice, 1);
            check(vulkanResult, 1);
            XrVulkanDeviceCreateInfoKHR.validate(createInfo.address());
        }
        return callPPPPI(instance.address(), createInfo.address(), memAddress(vulkanDevice), vulkanResult, __functionAddress);
    }

}