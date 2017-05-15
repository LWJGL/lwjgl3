/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_get_physical_device_properties2 = "KHRGetPhysicalDeviceProperties2".nativeClassVK("KHR_get_physical_device_properties2", type = "instance", postfix = KHR) {
    documentation =
        """
        This extension provides new entry points to query device features, device properties, and format properties in a way that can be easily extended by other extensions, without introducing any further entry points. The Vulkan 1.0 feature/limit/formatproperty structures do not include {@code sType}/{@code pNext} members. This extension wraps them in new structures with {@code sType}/{@code pNext} members, so an application can query a chain of feature/limit/formatproperty structures by constructing the chain and letting the implementation fill them in. A new command is added for each ftext:vkGetPhysicalDevice* command in core Vulkan 1.0. The new feature structure (and a chain of extension structures) can also be passed in to device creation to enable features.

        This extension also allows applications to use the physical-device components of device extensions before #CreateDevice() is called.

        <h5>Examples</h5>
        <code><pre>
￿    // Get features with a hypothetical future extension.
￿    VkHypotheticalExtensionFeaturesKHR hypotheticalFeatures =
￿    {
￿        VK_STRUCTURE_TYPE_HYPOTHETICAL_FEATURES_KHR,                            // sType
￿        NULL,                                                                   // pNext
￿    };
￿
￿    VkPhysicalDeviceFeatures2KHR features =
￿    {
￿        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR,                       // sType
￿        &hypotheticalFeatures,                                                  // pNext
￿    };
￿
￿    // After this call, features and hypotheticalFeatures have been filled out.
￿    vkGetPhysicalDeviceFeatures2KHR(physicalDevice, &features);
￿
￿    // Properties/limits can be chained and queried similarly.
￿
￿    // Enable some features:
￿    VkHypotheticalExtensionFeaturesKHR enabledHypotheticalFeatures =
￿    {
￿        VK_STRUCTURE_TYPE_HYPOTHETICAL_FEATURES_KHR,                            // sType
￿        NULL,                                                                   // pNext
￿    };
￿
￿    VkPhysicalDeviceFeatures2KHR enabledFeatures =
￿    {
￿        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR,                       // sType
￿        &enabledHypotheticalFeatures,                                           // pNext
￿    };
￿
￿    enabledFeatures.features.xyz = VK_TRUE;
￿    enabledHypotheticalFeatures.abc = VK_TRUE;
￿
￿    VkDeviceCreateInfo deviceCreateInfo =
￿    {
￿        VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO,                                   // sType
￿        &enabledFeatures,                                                       // pNext
￿        ...
￿        NULL,                                                                   // pEnabledFeatures
￿    }
￿
￿    VkDevice device;
￿    vkCreateDevice(physicalDevice, &deviceCreateInfo, NULL, &device);</pre></code>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHR_get_physical_device_properties2</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>60</dd>

            <dt><b>Status</b></dt>
            <dd>Complete.</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-11-02</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Ian Elliott, Google</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Jeff Bolz (jbolz 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION".."1"
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
        """
        Reports capabilities of a physical device.

        <h5>C Specification</h5>
        To query supported features defined by the core or extensions, call:

        <code><pre>
￿void vkGetPhysicalDeviceFeatures2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkPhysicalDeviceFeatures2KHR*               pFeatures);</pre></code>

        <h5>Description</h5>
        Each structure in {@code pFeatures} and its {@code pNext} chain contain members corresponding to fine-grained features. #GetPhysicalDeviceFeatures2KHR() writes each member to a boolean value indicating whether that feature is supported.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pFeatures} <b>must</b> be a pointer to a ##VkPhysicalDeviceFeatures2KHR structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceFeatures2KHR
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the supported features."),
        VkPhysicalDeviceFeatures2KHR.p.OUT("pFeatures", "a pointer to a ##VkPhysicalDeviceFeatures2KHR structure in which the physical device features are returned.")
    )

    void(
        "GetPhysicalDeviceProperties2KHR",
        """
        Returns properties of a physical device.

        <h5>C Specification</h5>
        To query general properties of physical devices once enumerated, call:

        <code><pre>
￿void vkGetPhysicalDeviceProperties2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkPhysicalDeviceProperties2KHR*             pProperties);</pre></code>

        <h5>Description</h5>
        Each structure in {@code pProperties} and its {@code pNext} chain contain members corresponding to properties or implementation-dependent limits. #GetPhysicalDeviceProperties2KHR() writes each member to a value indicating the value of that property or limit.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pProperties} <b>must</b> be a pointer to a ##VkPhysicalDeviceProperties2KHR structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceProperties2KHR
        """,

        VkPhysicalDevice.IN("physicalDevice", "the handle to the physical device whose properties will be queried."),
        VkPhysicalDeviceProperties2KHR.p.OUT("pProperties", "points to an instance of the ##VkPhysicalDeviceProperties2KHR structure, that will be filled with returned information.")
    )

    void(
        "GetPhysicalDeviceFormatProperties2KHR",
        """
        Lists physical device's format capabilities.

        <h5>C Specification</h5>
        To query supported format features which are properties of the physical device, call:

        <code><pre>
￿void vkGetPhysicalDeviceFormatProperties2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkFormat                                    format,
￿    VkFormatProperties2KHR*                     pFormatProperties);</pre></code>

        <h5>Description</h5>
        #GetPhysicalDeviceFormatProperties2KHR() behaves similarly to #GetPhysicalDeviceFormatProperties(), with the ability to return extended information in a {@code pNext} chain of output structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code pFormatProperties} <b>must</b> be a pointer to a ##VkFormatProperties2KHR structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkFormatProperties2KHR
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the format properties."),
        VkFormat.IN("format", "the format whose properties are queried."),
        VkFormatProperties2KHR.p.OUT("pFormatProperties", "a pointer to a ##VkFormatProperties2KHR structure in which physical device properties for {@code format} are returned.")
    )

    VkResult(
        "GetPhysicalDeviceImageFormatProperties2KHR",
        """
        Lists physical device's image format capabilities.

        <h5>C Specification</h5>
        To query additional capabilities specific to image types, call:

        <code><pre>
￿VkResult vkGetPhysicalDeviceImageFormatProperties2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceImageFormatInfo2KHR*  pImageFormatInfo,
￿    VkImageFormatProperties2KHR*                pImageFormatProperties);</pre></code>

        <h5>Description</h5>
        #GetPhysicalDeviceImageFormatProperties2KHR() behaves similarly to #GetPhysicalDeviceImageFormatProperties(), with the ability to return extended information in a {@code pNext} chain of output structures.

        If the loader implementation emulates #GetPhysicalDeviceImageFormatProperties2KHR() on a device that does not support the extension, and the query involves a structure the loader does not support, #GetPhysicalDeviceImageFormatProperties2KHR() returns #ERROR_FORMAT_NOT_SUPPORTED.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pImageFormatInfo} <b>must</b> be a pointer to a valid ##VkPhysicalDeviceImageFormatInfo2KHR structure</li>
            <li>{@code pImageFormatProperties} <b>must</b> be a pointer to a ##VkImageFormatProperties2KHR structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_FORMAT_NOT_SUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkImageFormatProperties2KHR, ##VkPhysicalDeviceImageFormatInfo2KHR
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the image capabilities."),
        const..VkPhysicalDeviceImageFormatInfo2KHR.p.IN("pImageFormatInfo", "points to an instance of the ##VkPhysicalDeviceImageFormatInfo2KHR structure, describing the parameters that would be consumed by #CreateImage()."),
        VkImageFormatProperties2KHR.p.OUT("pImageFormatProperties", "points to an instance of the ##VkImageFormatProperties2KHR structure in which capabilities are returned.")
    )

    void(
        "GetPhysicalDeviceQueueFamilyProperties2KHR",
        """
        Reports properties of the queues of the specified physical device.

        <h5>C Specification</h5>
        To query properties of queues available on a physical device, call:

        <code><pre>
￿void vkGetPhysicalDeviceQueueFamilyProperties2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pQueueFamilyPropertyCount,
￿    VkQueueFamilyProperties2KHR*                pQueueFamilyProperties);</pre></code>

        <h5>Description</h5>
        #GetPhysicalDeviceQueueFamilyProperties2KHR() behaves similarly to #GetPhysicalDeviceQueueFamilyProperties(), with the ability to return extended information in a {@code pNext} chain of output structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pQueueFamilyPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pQueueFamilyPropertyCount} is not 0, and {@code pQueueFamilyProperties} is not {@code NULL}, {@code pQueueFamilyProperties} <b>must</b> be a pointer to an array of {@code pQueueFamilyPropertyCount} ##VkQueueFamilyProperties2KHR structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkQueueFamilyProperties2KHR
        """,

        VkPhysicalDevice.IN("physicalDevice", "the handle to the physical device whose properties will be queried."),
        AutoSize("pQueueFamilyProperties")..Check(1)..uint32_t_p.INOUT("pQueueFamilyPropertyCount", "a pointer to an integer related to the number of queue families available or queried, as described in #GetPhysicalDeviceQueueFamilyProperties()."),
        nullable..VkQueueFamilyProperties2KHR.p.OUT("pQueueFamilyProperties", "either {@code NULL} or a pointer to an array of ##VkQueueFamilyProperties2KHR structures.")
    )

    void(
        "GetPhysicalDeviceMemoryProperties2KHR",
        """
        Reports memory information for the specified physical device.

        <h5>C Specification</h5>
        To query memory properties, call:

        <code><pre>
￿void vkGetPhysicalDeviceMemoryProperties2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkPhysicalDeviceMemoryProperties2KHR*       pMemoryProperties);</pre></code>

        <h5>Description</h5>
        #GetPhysicalDeviceMemoryProperties2KHR() behaves similarly to #GetPhysicalDeviceMemoryProperties(), with the ability to return extended information in a {@code pNext} chain of output structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pMemoryProperties} <b>must</b> be a pointer to a ##VkPhysicalDeviceMemoryProperties2KHR structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceMemoryProperties2KHR
        """,

        VkPhysicalDevice.IN("physicalDevice", "the handle to the device to query."),
        VkPhysicalDeviceMemoryProperties2KHR.p.OUT("pMemoryProperties", "points to an instance of ##VkPhysicalDeviceMemoryProperties2KHR structure in which the properties are returned.")
    )

    void(
        "GetPhysicalDeviceSparseImageFormatProperties2KHR",
        """
        Retrieve properties of an image format applied to sparse images.

        <h5>C Specification</h5>
        #GetPhysicalDeviceSparseImageFormatProperties2KHR() returns an array of ##VkSparseImageFormatProperties2KHR. Each element will describe properties for one set of image aspects that are bound simultaneously in the image. This is usually one element for each aspect in the image, but for interleaved depth/stencil images there is only one element describing the combined aspects.

        <code><pre>
￿void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceSparseImageFormatInfo2KHR* pFormatInfo,
￿    uint32_t*                                   pPropertyCount,
￿    VkSparseImageFormatProperties2KHR*          pProperties);</pre></code>

        <h5>Description</h5>
        #GetPhysicalDeviceSparseImageFormatProperties2KHR() behaves identically to #GetPhysicalDeviceSparseImageFormatProperties(), with the ability to return extended information by adding extension structures to its {@code pNext} chain.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pFormatInfo} <b>must</b> be a pointer to a valid ##VkPhysicalDeviceSparseImageFormatInfo2KHR structure</li>
            <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} ##VkSparseImageFormatProperties2KHR structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceSparseImageFormatInfo2KHR, ##VkSparseImageFormatProperties2KHR
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the sparse image capabilities."),
        const..VkPhysicalDeviceSparseImageFormatInfo2KHR.p.IN("pFormatInfo", "a pointer to a structure of type ##VkPhysicalDeviceSparseImageFormatInfo2KHR containing input parameters to the command."),
        AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT("pPropertyCount", "a pointer to an integer related to the number of sparse format properties available or queried, as described below."),
        nullable..VkSparseImageFormatProperties2KHR.p.OUT("pProperties", "either {@code NULL} or a pointer to an array of ##VkSparseImageFormatProperties2KHR structures.")
    )
}