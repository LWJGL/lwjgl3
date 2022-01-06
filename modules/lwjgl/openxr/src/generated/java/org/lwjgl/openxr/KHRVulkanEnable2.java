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

import org.lwjgl.vulkan.*;

/** The KHR_vulkan_enable2 extension. */
public class KHRVulkanEnable2 {

    /** The extension specification version. */
    public static final int XR_KHR_vulkan_enable2_SPEC_VERSION = 2;

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

    /** Unsafe version of: {@link #xrCreateVulkanInstanceKHR CreateVulkanInstanceKHR} */
    public static int nxrCreateVulkanInstanceKHR(XrInstance instance, long createInfo, long vulkanInstance, long vulkanResult) {
        long __functionAddress = instance.getCapabilities().xrCreateVulkanInstanceKHR;
        if (CHECKS) {
            check(__functionAddress);
            XrVulkanInstanceCreateInfoKHR.validate(createInfo);
        }
        return callPPPPI(instance.address(), createInfo, vulkanInstance, vulkanResult, __functionAddress);
    }

    /**
     * Create an OpenXR compatible VkInstance.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrCreateVulkanInstanceKHR(
     *     XrInstance                                  instance,
     *     const XrVulkanInstanceCreateInfoKHR*        createInfo,
     *     VkInstance*                                 vulkanInstance,
     *     VkResult*                                   vulkanResult);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension <b>must</b> be enabled prior to calling {@link #xrCreateVulkanInstanceKHR CreateVulkanInstanceKHR}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrVulkanInstanceCreateInfoKHR} structure</li>
     * <li>{@code vulkanInstance} <b>must</b> be a pointer to a {@code VkInstance} value</li>
     * <li>{@code vulkanResult} <b>must</b> be a pointer to a {@code VkResult} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link XR10#XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrVulkanInstanceCreateInfoKHR}, {@link #xrCreateVulkanDeviceKHR CreateVulkanDeviceKHR}</p>
     *
     * @param instance       an {@code XrInstance} handle previously created with {@link XR10#xrCreateInstance CreateInstance}.
     * @param createInfo     extensible input struct of type {@code XrCreateVulkanInstanceCreateInfoKHR}
     * @param vulkanInstance points to a {@code VkInstance} handle to populate with the new Vulkan instance.
     * @param vulkanResult   points to a {@code VkResult} to populate with the result of the {@code vkCreateInstance} operation as returned by {@code pfnGetInstanceProcAddr}.
     */
    @NativeType("XrResult")
    public static int xrCreateVulkanInstanceKHR(XrInstance instance, @NativeType("XrVulkanInstanceCreateInfoKHR const *") XrVulkanInstanceCreateInfoKHR createInfo, @NativeType("VkInstance *") PointerBuffer vulkanInstance, @NativeType("VkResult *") IntBuffer vulkanResult) {
        if (CHECKS) {
            check(vulkanInstance, 1);
            check(vulkanResult, 1);
        }
        return nxrCreateVulkanInstanceKHR(instance, createInfo.address(), memAddress(vulkanInstance), memAddress(vulkanResult));
    }

    // --- [ xrCreateVulkanDeviceKHR ] ---

    /** Unsafe version of: {@link #xrCreateVulkanDeviceKHR CreateVulkanDeviceKHR} */
    public static int nxrCreateVulkanDeviceKHR(XrInstance instance, long createInfo, long vulkanDevice, long vulkanResult) {
        long __functionAddress = instance.getCapabilities().xrCreateVulkanDeviceKHR;
        if (CHECKS) {
            check(__functionAddress);
            XrVulkanDeviceCreateInfoKHR.validate(createInfo);
        }
        return callPPPPI(instance.address(), createInfo, vulkanDevice, vulkanResult, __functionAddress);
    }

    /**
     * Create an OpenXR compatible VkDevice.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrCreateVulkanDeviceKHR(
     *     XrInstance                                  instance,
     *     const XrVulkanDeviceCreateInfoKHR*          createInfo,
     *     VkDevice*                                   vulkanDevice,
     *     VkResult*                                   vulkanResult);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension <b>must</b> be enabled prior to calling {@link #xrCreateVulkanDeviceKHR CreateVulkanDeviceKHR}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrVulkanDeviceCreateInfoKHR} structure</li>
     * <li>{@code vulkanDevice} <b>must</b> be a pointer to a {@code VkDevice} value</li>
     * <li>{@code vulkanResult} <b>must</b> be a pointer to a {@code VkResult} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link XR10#XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrVulkanDeviceCreateInfoKHR}, {@link #xrCreateVulkanInstanceKHR CreateVulkanInstanceKHR}</p>
     *
     * @param instance     an {@code XrInstance} handle previously created with {@link XR10#xrCreateInstance CreateInstance}.
     * @param createInfo   extensible input struct of type {@code XrCreateVulkanDeviceCreateInfoKHR}
     * @param vulkanDevice points to a {@code VkDevice} handle to populate with the new Vulkan device.
     * @param vulkanResult points to a {@code VkResult} to populate with the result of the {@code vkCreateDevice} operation as returned by {@code pfnGetInstanceProcAddr}.
     */
    @NativeType("XrResult")
    public static int xrCreateVulkanDeviceKHR(XrInstance instance, @NativeType("XrVulkanDeviceCreateInfoKHR const *") XrVulkanDeviceCreateInfoKHR createInfo, @NativeType("VkDevice *") PointerBuffer vulkanDevice, @NativeType("VkResult *") IntBuffer vulkanResult) {
        if (CHECKS) {
            check(vulkanDevice, 1);
            check(vulkanResult, 1);
        }
        return nxrCreateVulkanDeviceKHR(instance, createInfo.address(), memAddress(vulkanDevice), memAddress(vulkanResult));
    }

    // --- [ xrGetVulkanGraphicsDevice2KHR ] ---

    /** Unsafe version of: {@link #xrGetVulkanGraphicsDevice2KHR GetVulkanGraphicsDevice2KHR} */
    public static int nxrGetVulkanGraphicsDevice2KHR(XrInstance instance, long getInfo, long vulkanPhysicalDevice) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanGraphicsDevice2KHR;
        if (CHECKS) {
            check(__functionAddress);
            XrVulkanGraphicsDeviceGetInfoKHR.validate(getInfo);
        }
        return callPPPI(instance.address(), getInfo, vulkanPhysicalDevice, __functionAddress);
    }

    /**
     * Retrieve the Vulkan physical device associated with an OpenXR instance and system.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrGetVulkanGraphicsDevice2KHR(
     *     XrInstance                                  instance,
     *     const XrVulkanGraphicsDeviceGetInfoKHR*     getInfo,
     *     VkPhysicalDevice*                           vulkanPhysicalDevice);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension <b>must</b> be enabled prior to calling {@link #xrGetVulkanGraphicsDevice2KHR GetVulkanGraphicsDevice2KHR}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code getInfo} <b>must</b> be a pointer to a valid {@link XrVulkanGraphicsDeviceGetInfoKHR} structure</li>
     * <li>{@code vulkanPhysicalDevice} <b>must</b> be a pointer to a {@code VkPhysicalDevice} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrVulkanGraphicsDeviceGetInfoKHR}</p>
     *
     * @param instance             an {@code XrInstance} handle previously created with {@link XR10#xrCreateInstance CreateInstance}.
     * @param getInfo              extensible input struct of type {@link XrVulkanGraphicsDeviceGetInfoKHR}
     * @param vulkanPhysicalDevice a pointer to a {@code VkPhysicalDevice} handle to populate.
     */
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

    /**
     * See {@link KHRVulkanEnable#xrGetVulkanGraphicsRequirementsKHR GetVulkanGraphicsRequirementsKHR}.
     *
     * @param instance             an {@code XrInstance} handle previously created with {@link XR10#xrCreateInstance CreateInstance}.
     * @param systemId             an {@code XrSystemId} handle for the system which will be used to create a session.
     * @param graphicsRequirements the {@link XrGraphicsRequirementsVulkanKHR} output structure.
     */
    @NativeType("XrResult")
    public static int xrGetVulkanGraphicsRequirements2KHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrGraphicsRequirementsVulkanKHR *") XrGraphicsRequirementsVulkanKHR graphicsRequirements) {
        return nxrGetVulkanGraphicsRequirements2KHR(instance, systemId, graphicsRequirements.address());
    }

}