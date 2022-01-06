/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import vulkan.*
import openxr.*

val KHR_vulkan_enable2 = "KHRVulkanEnable2".nativeClassXR("KHR_vulkan_enable2", type = "instance", postfix = "KHR") {
    javaImport("org.lwjgl.vulkan.*")
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_vulkan_enable2_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "KHR_VULKAN_ENABLE2_EXTENSION_NAME".."XR_KHR_vulkan_enable2"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_VULKAN_INSTANCE_CREATE_INFO_KHR".."1000090000",
        "TYPE_VULKAN_DEVICE_CREATE_INFO_KHR".."1000090001",
        "TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR".."1000090003",
        "TYPE_GRAPHICS_BINDING_VULKAN2_KHR".."1000090000",
        "TYPE_SWAPCHAIN_IMAGE_VULKAN2_KHR".."1000090001",
        "TYPE_GRAPHICS_REQUIREMENTS_VULKAN2_KHR".."1000090002"
    )

    XrResult(
        "CreateVulkanInstanceKHR",
        """
        Create an OpenXR compatible VkInstance.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrCreateVulkanInstanceKHR(
￿    XrInstance                                  instance,
￿    const XrVulkanInstanceCreateInfoKHR*        createInfo,
￿    VkInstance*                                 vulkanInstance,
￿    VkResult*                                   vulkanResult);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension <b>must</b> be enabled prior to calling #CreateVulkanInstanceKHR()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrVulkanInstanceCreateInfoKHR structure</li>
            <li>{@code vulkanInstance} <b>must</b> be a pointer to a {@code VkInstance} value</li>
            <li>{@code vulkanResult} <b>must</b> be a pointer to a {@code VkResult} value</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_SYSTEM_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrVulkanInstanceCreateInfoKHR, #CreateVulkanDeviceKHR()
        """,

        XrInstance("instance", "an {@code XrInstance} handle previously created with #CreateInstance()."),
        XrVulkanInstanceCreateInfoKHR.const.p("createInfo", "extensible input struct of type {@code XrCreateVulkanInstanceCreateInfoKHR}"),
        Check(1)..VkInstance.p("vulkanInstance", "points to a {@code VkInstance} handle to populate with the new Vulkan instance."),
        Check(1)..VkResult.p("vulkanResult", "points to a {@code VkResult} to populate with the result of the {@code vkCreateInstance} operation as returned by {@code pfnGetInstanceProcAddr}.")
    )

    XrResult(
        "CreateVulkanDeviceKHR",
        """
        Create an OpenXR compatible VkDevice.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrCreateVulkanDeviceKHR(
￿    XrInstance                                  instance,
￿    const XrVulkanDeviceCreateInfoKHR*          createInfo,
￿    VkDevice*                                   vulkanDevice,
￿    VkResult*                                   vulkanResult);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension <b>must</b> be enabled prior to calling #CreateVulkanDeviceKHR()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrVulkanDeviceCreateInfoKHR structure</li>
            <li>{@code vulkanDevice} <b>must</b> be a pointer to a {@code VkDevice} value</li>
            <li>{@code vulkanResult} <b>must</b> be a pointer to a {@code VkResult} value</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_SYSTEM_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrVulkanDeviceCreateInfoKHR, #CreateVulkanInstanceKHR()
        """,

        XrInstance("instance", "an {@code XrInstance} handle previously created with #CreateInstance()."),
        XrVulkanDeviceCreateInfoKHR.const.p("createInfo", "extensible input struct of type {@code XrCreateVulkanDeviceCreateInfoKHR}"),
        Check(1)..VkDevice.p("vulkanDevice", "points to a {@code VkDevice} handle to populate with the new Vulkan device."),
        Check(1)..VkResult.p("vulkanResult", "points to a {@code VkResult} to populate with the result of the {@code vkCreateDevice} operation as returned by {@code pfnGetInstanceProcAddr}.")
    )

    XrResult(
        "GetVulkanGraphicsDevice2KHR",
        """
        Retrieve the Vulkan physical device associated with an OpenXR instance and system.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrGetVulkanGraphicsDevice2KHR(
￿    XrInstance                                  instance,
￿    const XrVulkanGraphicsDeviceGetInfoKHR*     getInfo,
￿    VkPhysicalDevice*                           vulkanPhysicalDevice);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension <b>must</b> be enabled prior to calling #GetVulkanGraphicsDevice2KHR()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code getInfo} <b>must</b> be a pointer to a valid ##XrVulkanGraphicsDeviceGetInfoKHR structure</li>
            <li>{@code vulkanPhysicalDevice} <b>must</b> be a pointer to a {@code VkPhysicalDevice} value</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SYSTEM_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrVulkanGraphicsDeviceGetInfoKHR
        """,

        XrInstance("instance", "an {@code XrInstance} handle previously created with #CreateInstance()."),
        XrVulkanGraphicsDeviceGetInfoKHR.const.p("getInfo", "extensible input struct of type ##XrVulkanGraphicsDeviceGetInfoKHR"),
        Check(1)..VkPhysicalDevice.p("vulkanPhysicalDevice", "a pointer to a {@code VkPhysicalDevice} handle to populate.")
    )

    XrResult(
        "GetVulkanGraphicsRequirements2KHR",
        "See #GetVulkanGraphicsRequirementsKHR().",

        XrInstance("instance", "an {@code XrInstance} handle previously created with #CreateInstance()."),
        XrSystemId("systemId", "an {@code XrSystemId} handle for the system which will be used to create a session."),
        XrGraphicsRequirementsVulkanKHR.p("graphicsRequirements", "the ##XrGraphicsRequirementsVulkanKHR output structure.")
    )
}