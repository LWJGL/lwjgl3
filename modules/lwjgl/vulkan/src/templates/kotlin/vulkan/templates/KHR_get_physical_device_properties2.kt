/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_get_physical_device_properties2 = "KHRGetPhysicalDeviceProperties2".nativeClassVK("KHR_get_physical_device_properties2", type = "instance", postfix = "KHR") {
    documentation =
        """
        This extension provides new entry points to query device features, device properties, and format properties in a way that can be easily extended by other extensions, without introducing any further entry points. The Vulkan 1.0 feature/limit/formatproperty structures do not include {@code sType}/{@code pNext} members. This extension wraps them in new structures with {@code sType}/{@code pNext} members, so an application can query a chain of feature/limit/formatproperty structures by constructing the chain and letting the implementation fill them in. A new command is added for each {@code vkGetPhysicalDevice*} command in core Vulkan 1.0. The new feature structure (and a {@code pNext} chain of extending structures) can also be passed in to device creation to enable features.

        This extension also allows applications to use the physical-device components of device extensions before #CreateDevice() is called.

        <h5>Promotion to Vulkan 1.1</h5>
        All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>Examples</h5>
        <pre><code>
￿    // Get features with a hypothetical future extension.
￿    VkHypotheticalExtensionFeaturesKHR hypotheticalFeatures =
￿    {
￿        VK_STRUCTURE_TYPE_HYPOTHETICAL_FEATURES_KHR,                // sType
￿        NULL,                                                       // pNext
￿    };
￿
￿    VkPhysicalDeviceFeatures2KHR features =
￿    {
￿        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR,           // sType
￿        &amp;hypotheticalFeatures,                                      // pNext
￿    };
￿
￿    // After this call, features and hypotheticalFeatures have been filled out.
￿    vkGetPhysicalDeviceFeatures2KHR(physicalDevice, &amp;features);
￿
￿    // Properties/limits can be chained and queried similarly.
￿
￿    // Enable some features:
￿    VkHypotheticalExtensionFeaturesKHR enabledHypotheticalFeatures =
￿    {
￿        VK_STRUCTURE_TYPE_HYPOTHETICAL_FEATURES_KHR,                // sType
￿        NULL,                                                       // pNext
￿    };
￿
￿    VkPhysicalDeviceFeatures2KHR enabledFeatures =
￿    {
￿        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR,           // sType
￿        &amp;enabledHypotheticalFeatures,                               // pNext
￿    };
￿
￿    enabledFeatures.features.xyz = VK_TRUE;
￿    enabledHypotheticalFeatures.abc = VK_TRUE;
￿
￿    VkDeviceCreateInfo deviceCreateInfo =
￿    {
￿        VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO,                       // sType
￿        &amp;enabledFeatures,                                           // pNext
￿        ...
￿        NULL,                                                       // pEnabledFeatures
￿    };
￿
￿    VkDevice device;
￿    vkCreateDevice(physicalDevice, &amp;deviceCreateInfo, NULL, &amp;device);</code></pre>

        <h5>VK_KHR_get_physical_device_properties2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_get_physical_device_properties2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>60</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1-promotions">Vulkan 1.1</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_get_physical_device_properties2]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_get_physical_device_properties2%20extension%3E%3E">jeffbolznv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-09-05</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.1 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Ian Elliott, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME".."VK_KHR_get_physical_device_properties2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR".."1000059000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2_KHR".."1000059001",
        "STRUCTURE_TYPE_FORMAT_PROPERTIES_2_KHR".."1000059002",
        "STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2_KHR".."1000059003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR".."1000059004",
        "STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2_KHR".."1000059005",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR".."1000059006",
        "STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR".."1000059007",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR".."1000059008"
    )

    void(
        "GetPhysicalDeviceFeatures2KHR",
        "See #GetPhysicalDeviceFeatures2().",

        VkPhysicalDevice("physicalDevice", "the physical device from which to query the supported features."),
        VkPhysicalDeviceFeatures2.p("pFeatures", "a pointer to a ##VkPhysicalDeviceFeatures2 structure in which the physical device features are returned.")
    )

    void(
        "GetPhysicalDeviceProperties2KHR",
        "See #GetPhysicalDeviceProperties2().",

        VkPhysicalDevice("physicalDevice", "the handle to the physical device whose properties will be queried."),
        VkPhysicalDeviceProperties2.p("pProperties", "a pointer to a ##VkPhysicalDeviceProperties2 structure in which properties are returned.")
    )

    void(
        "GetPhysicalDeviceFormatProperties2KHR",
        "See #GetPhysicalDeviceFormatProperties2().",

        VkPhysicalDevice("physicalDevice", "the physical device from which to query the format properties."),
        VkFormat("format", "the format whose properties are queried."),
        VkFormatProperties2.p("pFormatProperties", "a pointer to a ##VkFormatProperties2 structure in which physical device properties for {@code format} are returned.")
    )

    VkResult(
        "GetPhysicalDeviceImageFormatProperties2KHR",
        "See #GetPhysicalDeviceImageFormatProperties2().",

        VkPhysicalDevice("physicalDevice", "the physical device from which to query the image capabilities."),
        VkPhysicalDeviceImageFormatInfo2.const.p("pImageFormatInfo", "a pointer to a ##VkPhysicalDeviceImageFormatInfo2 structure describing the parameters that would be consumed by #CreateImage()."),
        VkImageFormatProperties2.p("pImageFormatProperties", "a pointer to a ##VkImageFormatProperties2 structure in which capabilities are returned.")
    )

    void(
        "GetPhysicalDeviceQueueFamilyProperties2KHR",
        "See #GetPhysicalDeviceQueueFamilyProperties2().",

        VkPhysicalDevice("physicalDevice", "the handle to the physical device whose properties will be queried."),
        AutoSize("pQueueFamilyProperties")..Check(1)..uint32_t.p("pQueueFamilyPropertyCount", "a pointer to an integer related to the number of queue families available or queried, as described in #GetPhysicalDeviceQueueFamilyProperties()."),
        nullable..VkQueueFamilyProperties2.p("pQueueFamilyProperties", "either {@code NULL} or a pointer to an array of ##VkQueueFamilyProperties2 structures.")
    )

    void(
        "GetPhysicalDeviceMemoryProperties2KHR",
        "See #GetPhysicalDeviceMemoryProperties2().",

        VkPhysicalDevice("physicalDevice", "the handle to the device to query."),
        VkPhysicalDeviceMemoryProperties2.p("pMemoryProperties", "a pointer to a ##VkPhysicalDeviceMemoryProperties2 structure in which the properties are returned.")
    )

    void(
        "GetPhysicalDeviceSparseImageFormatProperties2KHR",
        "See #GetPhysicalDeviceSparseImageFormatProperties2().",

        VkPhysicalDevice("physicalDevice", "the physical device from which to query the sparse image format properties."),
        VkPhysicalDeviceSparseImageFormatInfo2.const.p("pFormatInfo", "a pointer to a ##VkPhysicalDeviceSparseImageFormatInfo2 structure containing input parameters to the command."),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount", "a pointer to an integer related to the number of sparse format properties available or queried, as described below."),
        nullable..VkSparseImageFormatProperties2.p("pProperties", "either {@code NULL} or a pointer to an array of ##VkSparseImageFormatProperties2 structures.")
    )
}