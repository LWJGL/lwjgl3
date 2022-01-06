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
    public static final int XR_KHR_vulkan_enable_SPEC_VERSION = 8;

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

    /**
     * Unsafe version of: {@link #xrGetVulkanInstanceExtensionsKHR GetVulkanInstanceExtensionsKHR}
     *
     * @param bufferCapacityInput the capacity of the {@code buffer}, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrGetVulkanInstanceExtensionsKHR(XrInstance instance, long systemId, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanInstanceExtensionsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /**
     * Get list of required Vulkan instance extensions for an OpenXR instance and system.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrGetVulkanInstanceExtensionsKHR(
     *     XrInstance                                  instance,
     *     XrSystemId                                  systemId,
     *     uint32_t                                    bufferCapacityInput,
     *     uint32_t*                                   bufferCountOutput,
     *     char*                                       buffer);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link KHRVulkanEnable XR_KHR_vulkan_enable} extension <b>must</b> be enabled prior to calling {@link #xrGetVulkanInstanceExtensionsKHR GetVulkanInstanceExtensionsKHR}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
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
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link XR10#XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrGetVulkanDeviceExtensionsKHR GetVulkanDeviceExtensionsKHR}</p>
     *
     * @param instance          an {@code XrInstance} handle previously created with {@link XR10#xrCreateInstance CreateInstance}.
     * @param systemId          an {@code XrSystemId} handle for the system which will be used to create a session.
     * @param bufferCountOutput a pointer to the count of characters written (including terminating {@code \0}), or a pointer to the required capacity in the case that {@code bufferCapacityInput} is 0.
     * @param buffer            a pointer to an array of characters, but <b>can</b> be {@code NULL} if {@code bufferCapacityInput} is 0. The format of the output is a single space (ASCII {@code 0x20}) delimited string of extension names.
     */
    @NativeType("XrResult")
    public static int xrGetVulkanInstanceExtensionsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @Nullable @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetVulkanInstanceExtensionsKHR(instance, systemId, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetVulkanDeviceExtensionsKHR ] ---

    /**
     * Unsafe version of: {@link #xrGetVulkanDeviceExtensionsKHR GetVulkanDeviceExtensionsKHR}
     *
     * @param bufferCapacityInput the capacity of the {@code buffer}, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrGetVulkanDeviceExtensionsKHR(XrInstance instance, long systemId, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanDeviceExtensionsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /**
     * Get list of required Vulkan device extensions for an OpenXR instance and system.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrGetVulkanDeviceExtensionsKHR(
     *     XrInstance                                  instance,
     *     XrSystemId                                  systemId,
     *     uint32_t                                    bufferCapacityInput,
     *     uint32_t*                                   bufferCountOutput,
     *     char*                                       buffer);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link KHRVulkanEnable XR_KHR_vulkan_enable} extension <b>must</b> be enabled prior to calling {@link #xrGetVulkanDeviceExtensionsKHR GetVulkanDeviceExtensionsKHR}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
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
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link XR10#XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrGetVulkanInstanceExtensionsKHR GetVulkanInstanceExtensionsKHR}</p>
     *
     * @param instance          an {@code XrInstance} handle previously created with {@link XR10#xrCreateInstance CreateInstance}.
     * @param systemId          an {@code XrSystemId} handle for the system which will be used to create a session.
     * @param bufferCountOutput a pointer to the count of characters written (including terminating {@code \0}), or a pointer to the required capacity in the case that {@code bufferCapacityInput} is 0.
     * @param buffer            a pointer to an array of characters, but <b>can</b> be {@code NULL} if {@code bufferCapacityInput} is 0. The format of the output is a single space (ASCII {@code 0x20}) delimited string of extension names.
     */
    @NativeType("XrResult")
    public static int xrGetVulkanDeviceExtensionsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @Nullable @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetVulkanDeviceExtensionsKHR(instance, systemId, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetVulkanGraphicsDeviceKHR ] ---

    /** Unsafe version of: {@link #xrGetVulkanGraphicsDeviceKHR GetVulkanGraphicsDeviceKHR} */
    public static int nxrGetVulkanGraphicsDeviceKHR(XrInstance instance, long systemId, VkInstance vkInstance, long vkPhysicalDevice) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanGraphicsDeviceKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, vkInstance.address(), vkPhysicalDevice, __functionAddress);
    }

    /**
     * Retrieve the Vulkan physical device associated with an OpenXR instance and system.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To identify what graphics device needs to be used for an instance and system, call:</p>
     * 
     * <pre><code>
     * XrResult xrGetVulkanGraphicsDeviceKHR(
     *     XrInstance                                  instance,
     *     XrSystemId                                  systemId,
     *     VkInstance                                  vkInstance,
     *     VkPhysicalDevice*                           vkPhysicalDevice);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrGetVulkanGraphicsDeviceKHR GetVulkanGraphicsDeviceKHR} function identifies to the application what graphics device (Vulkan {@code VkPhysicalDevice}) needs to be used. {@link #xrGetVulkanGraphicsDeviceKHR GetVulkanGraphicsDeviceKHR} <b>must</b> be called prior to calling {@link XR10#xrCreateSession CreateSession}, and the {@code VkPhysicalDevice} that {@link #xrGetVulkanGraphicsDeviceKHR GetVulkanGraphicsDeviceKHR} returns should be passed to {@link XR10#xrCreateSession CreateSession} in the {@link XrGraphicsBindingVulkanKHR}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link KHRVulkanEnable XR_KHR_vulkan_enable} extension <b>must</b> be enabled prior to calling {@link #xrGetVulkanGraphicsDeviceKHR GetVulkanGraphicsDeviceKHR}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code vkInstance} <b>must</b> be a valid {@code VkInstance} value</li>
     * <li>{@code vkPhysicalDevice} <b>must</b> be a pointer to a {@code VkPhysicalDevice} value</li>
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
     * @param instance         an {@code XrInstance} handle previously created with {@link XR10#xrCreateInstance CreateInstance}.
     * @param systemId         an {@code XrSystemId} handle for the system which will be used to create a session.
     * @param vkInstance       a valid Vulkan {@code VkInstance}.
     * @param vkPhysicalDevice a pointer to a {@code VkPhysicalDevice} value to populate.
     */
    @NativeType("XrResult")
    public static int xrGetVulkanGraphicsDeviceKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, VkInstance vkInstance, @NativeType("VkPhysicalDevice *") PointerBuffer vkPhysicalDevice) {
        if (CHECKS) {
            check(vkPhysicalDevice, 1);
        }
        return nxrGetVulkanGraphicsDeviceKHR(instance, systemId, vkInstance, memAddress(vkPhysicalDevice));
    }

    // --- [ xrGetVulkanGraphicsRequirementsKHR ] ---

    /** Unsafe version of: {@link #xrGetVulkanGraphicsRequirementsKHR GetVulkanGraphicsRequirementsKHR} */
    public static int nxrGetVulkanGraphicsRequirementsKHR(XrInstance instance, long systemId, long graphicsRequirements) {
        long __functionAddress = instance.getCapabilities().xrGetVulkanGraphicsRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(instance.address(), systemId, graphicsRequirements, __functionAddress);
    }

    /**
     * Retrieve the Vulkan version requirements for an instance and system.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query Vulkan API version requirements, call:</p>
     * 
     * <pre><code>
     * XrResult xrGetVulkanGraphicsRequirementsKHR(
     *     XrInstance                                  instance,
     *     XrSystemId                                  systemId,
     *     XrGraphicsRequirementsVulkanKHR*            graphicsRequirements);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetVulkanGraphicsRequirementsKHR GetVulkanGraphicsRequirementsKHR} function identifies to the application the minimum Vulkan version requirement and the highest known tested Vulkan version. The runtime <b>must</b> return {@link XR10#XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING} ({@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} <b>may</b> be returned due to legacy behavior) on calls to {@link XR10#xrCreateSession CreateSession} if {@link #xrGetVulkanGraphicsRequirementsKHR GetVulkanGraphicsRequirementsKHR} has not been called for the same {@code instance} and {@code systemId}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link KHRVulkanEnable XR_KHR_vulkan_enable} extension <b>must</b> be enabled prior to calling {@link #xrGetVulkanGraphicsRequirementsKHR GetVulkanGraphicsRequirementsKHR}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code graphicsRequirements} <b>must</b> be a pointer to an {@link XrGraphicsRequirementsVulkanKHR} structure</li>
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
     * <p>{@link XrGraphicsRequirementsVulkanKHR}</p>
     *
     * @param instance             an {@code XrInstance} handle previously created with {@link XR10#xrCreateInstance CreateInstance}.
     * @param systemId             an {@code XrSystemId} handle for the system which will be used to create a session.
     * @param graphicsRequirements the {@link XrGraphicsRequirementsVulkanKHR} output structure.
     */
    @NativeType("XrResult")
    public static int xrGetVulkanGraphicsRequirementsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrGraphicsRequirementsVulkanKHR *") XrGraphicsRequirementsVulkanKHR graphicsRequirements) {
        return nxrGetVulkanGraphicsRequirementsKHR(instance, systemId, graphicsRequirements.address());
    }

}