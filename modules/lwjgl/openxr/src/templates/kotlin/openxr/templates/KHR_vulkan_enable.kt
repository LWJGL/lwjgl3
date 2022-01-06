/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import vulkan.*
import openxr.*

val KHR_vulkan_enable = "KHRVulkanEnable".nativeClassXR("KHR_vulkan_enable", type = "instance", postfix = "KHR") {
    javaImport("org.lwjgl.vulkan.*")
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_vulkan_enable_SPEC_VERSION".."8"
    )

    StringConstant(
        "The extension name.",

        "KHR_VULKAN_ENABLE_EXTENSION_NAME".."XR_KHR_vulkan_enable"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_GRAPHICS_BINDING_VULKAN_KHR".."1000025000",
        "TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR".."1000025001",
        "TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR".."1000025002"
    )

    XrResult(
        "GetVulkanInstanceExtensionsKHR",
        """
        Get list of required Vulkan instance extensions for an OpenXR instance and system.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrGetVulkanInstanceExtensionsKHR(
￿    XrInstance                                  instance,
￿    XrSystemId                                  systemId,
￿    uint32_t                                    bufferCapacityInput,
￿    uint32_t*                                   bufferCountOutput,
￿    char*                                       buffer);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVulkanEnable XR_KHR_vulkan_enable} extension <b>must</b> be enabled prior to calling #GetVulkanInstanceExtensionsKHR()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
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
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_SYSTEM_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #GetVulkanDeviceExtensionsKHR()
        """,

        XrInstance("instance", "an {@code XrInstance} handle previously created with #CreateInstance()."),
        XrSystemId("systemId", "an {@code XrSystemId} handle for the system which will be used to create a session."),
        AutoSize("buffer")..uint32_t("bufferCapacityInput", "the capacity of the {@code buffer}, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("bufferCountOutput", "a pointer to the count of characters written (including terminating {@code \\0}), or a pointer to the required capacity in the case that {@code bufferCapacityInput} is 0."),
        nullable..char.p("buffer", "a pointer to an array of characters, but <b>can</b> be {@code NULL} if {@code bufferCapacityInput} is 0. The format of the output is a single space (ASCII {@code 0x20}) delimited string of extension names.")
    )

    XrResult(
        "GetVulkanDeviceExtensionsKHR",
        """
        Get list of required Vulkan device extensions for an OpenXR instance and system.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrGetVulkanDeviceExtensionsKHR(
￿    XrInstance                                  instance,
￿    XrSystemId                                  systemId,
￿    uint32_t                                    bufferCapacityInput,
￿    uint32_t*                                   bufferCountOutput,
￿    char*                                       buffer);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVulkanEnable XR_KHR_vulkan_enable} extension <b>must</b> be enabled prior to calling #GetVulkanDeviceExtensionsKHR()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
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
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_SYSTEM_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #GetVulkanInstanceExtensionsKHR()
        """,

        XrInstance("instance", "an {@code XrInstance} handle previously created with #CreateInstance()."),
        XrSystemId("systemId", "an {@code XrSystemId} handle for the system which will be used to create a session."),
        AutoSize("buffer")..uint32_t("bufferCapacityInput", "the capacity of the {@code buffer}, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("bufferCountOutput", "a pointer to the count of characters written (including terminating {@code \\0}), or a pointer to the required capacity in the case that {@code bufferCapacityInput} is 0."),
        nullable..char.p("buffer", "a pointer to an array of characters, but <b>can</b> be {@code NULL} if {@code bufferCapacityInput} is 0. The format of the output is a single space (ASCII {@code 0x20}) delimited string of extension names.")
    )

    XrResult(
        "GetVulkanGraphicsDeviceKHR",
        """
        Retrieve the Vulkan physical device associated with an OpenXR instance and system.

        <h5>C Specification</h5>
        To identify what graphics device needs to be used for an instance and system, call:

        <pre><code>
￿XrResult xrGetVulkanGraphicsDeviceKHR(
￿    XrInstance                                  instance,
￿    XrSystemId                                  systemId,
￿    VkInstance                                  vkInstance,
￿    VkPhysicalDevice*                           vkPhysicalDevice);</code></pre>

        <h5>Description</h5>
        #GetVulkanGraphicsDeviceKHR() function identifies to the application what graphics device (Vulkan {@code VkPhysicalDevice}) needs to be used. #GetVulkanGraphicsDeviceKHR() <b>must</b> be called prior to calling #CreateSession(), and the {@code VkPhysicalDevice} that #GetVulkanGraphicsDeviceKHR() returns should be passed to #CreateSession() in the ##XrGraphicsBindingVulkanKHR.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVulkanEnable XR_KHR_vulkan_enable} extension <b>must</b> be enabled prior to calling #GetVulkanGraphicsDeviceKHR()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code vkInstance} <b>must</b> be a valid {@code VkInstance} value</li>
            <li>{@code vkPhysicalDevice} <b>must</b> be a pointer to a {@code VkPhysicalDevice} value</li>
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
        """,

        XrInstance("instance", "an {@code XrInstance} handle previously created with #CreateInstance()."),
        XrSystemId("systemId", "an {@code XrSystemId} handle for the system which will be used to create a session."),
        VkInstance("vkInstance", "a valid Vulkan {@code VkInstance}."),
        Check(1)..VkPhysicalDevice.p("vkPhysicalDevice", "a pointer to a {@code VkPhysicalDevice} value to populate.")
    )

    XrResult(
        "GetVulkanGraphicsRequirementsKHR",
        """
        Retrieve the Vulkan version requirements for an instance and system.

        <h5>C Specification</h5>
        To query Vulkan API version requirements, call:

        <pre><code>
￿XrResult xrGetVulkanGraphicsRequirementsKHR(
￿    XrInstance                                  instance,
￿    XrSystemId                                  systemId,
￿    XrGraphicsRequirementsVulkanKHR*            graphicsRequirements);</code></pre>

        <h5>Description</h5>
        The #GetVulkanGraphicsRequirementsKHR() function identifies to the application the minimum Vulkan version requirement and the highest known tested Vulkan version. The runtime <b>must</b> return #ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING (#ERROR_VALIDATION_FAILURE <b>may</b> be returned due to legacy behavior) on calls to #CreateSession() if #GetVulkanGraphicsRequirementsKHR() has not been called for the same {@code instance} and {@code systemId}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVulkanEnable XR_KHR_vulkan_enable} extension <b>must</b> be enabled prior to calling #GetVulkanGraphicsRequirementsKHR()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code graphicsRequirements} <b>must</b> be a pointer to an ##XrGraphicsRequirementsVulkanKHR structure</li>
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
        ##XrGraphicsRequirementsVulkanKHR
        """,

        XrInstance("instance", "an {@code XrInstance} handle previously created with #CreateInstance()."),
        XrSystemId("systemId", "an {@code XrSystemId} handle for the system which will be used to create a session."),
        XrGraphicsRequirementsVulkanKHR.p("graphicsRequirements", "the ##XrGraphicsRequirementsVulkanKHR output structure.")
    )
}