/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val NV_win32_keyed_mutex = "NVWin32KeyedMutex".nativeClassVK("NV_win32_keyed_mutex", type = "device", postfix = NV) {
    documentation =
        """
        Applications that wish to import Direct3D 11 memory objects into the Vulkan API may wish to use the native keyed mutex mechanism to synchronize access to the memory between Vulkan and Direct3D. This extension provides a way for an application to access the keyed mutex associated with an imported Vulkan memory object when submitting command buffers to a queue.

        <h5>Examples</h5>
        <code><pre>
￿    //
￿    // Import a memory object from Direct3D 11, and synchronize
￿    // access to it in Vulkan using keyed mutex objects.
￿    //
￿
￿    extern VkPhysicalDevice physicalDevice;
￿    extern VkDevice device;
￿    extern HANDLE sharedNtHandle;
￿
￿    static const VkFormat format = VK_FORMAT_R8G8B8A8_UNORM;
￿    static const VkExternalMemoryHandleTypeFlagsNV handleType =
￿        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV;
￿
￿    VkPhysicalDeviceMemoryProperties memoryProperties;
￿    VkExternalImageFormatPropertiesNV properties;
￿    VkExternalMemoryImageCreateInfoNV externalMemoryImageCreateInfo;
￿    VkImageCreateInfo imageCreateInfo;
￿    VkImage image;
￿    VkMemoryRequirements imageMemoryRequirements;
￿    uint32_t numMemoryTypes;
￿    uint32_t memoryType;
￿    VkImportMemoryWin32HandleInfoNV importMemoryInfo;
￿    VkMemoryAllocateInfo memoryAllocateInfo;
￿    VkDeviceMemory mem;
￿    VkResult result;
￿
￿    // Figure out how many memory types the device supports
￿    vkGetPhysicalDeviceMemoryProperties(physicalDevice,
￿                                        &memoryProperties);
￿    numMemoryTypes = memoryProperties.memoryTypeCount;
￿
￿    // Check the external handle type capabilities for the chosen format
￿    // Importable 2D image support with at least 1 mip level, 1 array
￿    // layer, and VK_SAMPLE_COUNT_1_BIT using optimal tiling and supporting
￿    // texturing and color rendering is required.
￿    result = vkGetPhysicalDeviceExternalImageFormatPropertiesNV(
￿        physicalDevice,
￿        format,
￿        VK_IMAGE_TYPE_2D,
￿        VK_IMAGE_TILING_OPTIMAL,
￿        VK_IMAGE_USAGE_SAMPLED_BIT |
￿        VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT,
￿        0,
￿        handleType,
￿        &properties);
￿
￿    if ((result != VK_SUCCESS) ||
￿        !(properties.externalMemoryFeatures &
￿          VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV)) {
￿        abort();
￿    }
￿
￿    // Set up the external memory image creation info
￿    memset(&externalMemoryImageCreateInfo,
￿           0, sizeof(externalMemoryImageCreateInfo));
￿    externalMemoryImageCreateInfo.sType =
￿        VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV;
￿    externalMemoryImageCreateInfo.handleTypes = handleType;
￿    // Set up the  core image creation info
￿    memset(&imageCreateInfo, 0, sizeof(imageCreateInfo));
￿    imageCreateInfo.sType = VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO;
￿    imageCreateInfo.pNext = &externalMemoryImageCreateInfo;
￿    imageCreateInfo.format = format;
￿    imageCreateInfo.extent.width = 64;
￿    imageCreateInfo.extent.height = 64;
￿    imageCreateInfo.extent.depth = 1;
￿    imageCreateInfo.mipLevels = 1;
￿    imageCreateInfo.arrayLayers = 1;
￿    imageCreateInfo.samples = VK_SAMPLE_COUNT_1_BIT;
￿    imageCreateInfo.tiling = VK_IMAGE_TILING_OPTIMAL;
￿    imageCreateInfo.usage = VK_IMAGE_USAGE_SAMPLED_BIT |
￿        VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT;
￿    imageCreateInfo.sharingMode = VK_SHARING_MODE_EXCLUSIVE;
￿    imageCreateInfo.initialLayout = VK_IMAGE_LAYOUT_UNDEFINED;
￿
￿    vkCreateImage(device, &imageCreateInfo, NULL, &image);
￿    vkGetImageMemoryRequirements(device,
￿                                 image,
￿                                 &imageMemoryRequirements);
￿
￿    // For simplicity, just pick the first compatible memory type.
￿    for (memoryType = 0; memoryType < numMemoryTypes; memoryType++) {
￿        if ((1 << memoryType) & imageMemoryRequirements.memoryTypeBits) {
￿            break;
￿        }
￿    }
￿
￿    // At least one memory type must be supported given the prior external
￿    // handle capability check.
￿    assert(memoryType < numMemoryTypes);
￿
￿    // Allocate the external memory object.
￿    memset(&exportMemoryAllocateInfo, 0, sizeof(exportMemoryAllocateInfo));
￿    exportMemoryAllocateInfo.sType =
￿        VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV;
￿    importMemoryInfo.handleTypes = handleType;
￿    importMemoryInfo.handle = sharedNtHandle;
￿
￿    memset(&memoryAllocateInfo, 0, sizeof(memoryAllocateInfo));
￿    memoryAllocateInfo.sType = VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO;
￿    memoryAllocateInfo.pNext = &exportMemoryAllocateInfo;
￿    memoryAllocateInfo.allocationSize = imageMemoryRequirements.size;
￿    memoryAllocateInfo.memoryTypeIndex = memoryType;
￿
￿    vkAllocateMemory(device, &memoryAllocateInfo, NULL, &mem);
￿
￿    vkBindImageMemory(device, image, mem, 0);
￿
￿    ...
￿
￿    const uint64_t acquireKey = 1;
￿    const uint32_t timeout = INFINITE;
￿    const uint64_t releaseKey = 2;
￿
￿    VkWin32KeyedMutexAcquireReleaseInfoNV keyedMutex =
￿        { VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV };
￿    keyedMutex.acquireCount = 1;
￿    keyedMutex.pAcquireSyncs = &mem;
￿    keyedMutex.pAcquireKeys = &acquireKey;
￿    keyedMutex.pAcquireTimeoutMilliseconds = &timeout;
￿    keyedMutex.releaseCount = 1;
￿    keyedMutex.pReleaseSyncs = &mem;
￿    keyedMutex.pReleaseKeys = &releaseKey;
￿
￿    VkSubmitInfo submit_info = { VK_STRUCTURE_TYPE_SUBMIT_INFO, &keyedMutex };
￿    submit_info.commandBufferCount = 1;
￿    submit_info.pCommandBuffers = &cmd_buf;
￿    vkQueueSubmit(queue, 1, &submit_info, VK_NULL_HANDLE);</pre></code>

        <dl>
            <dt><b>Name</b></dt>
            <dd>VK_NV_win32_keyed_mutex</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>59</dd>

            <dt><b>Status</b></dt>
            <dd>Complete</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-08-19</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>Requires VK_NV_external_memory_capabilities</li>
                <li>Requires VK_NV_external_memory_win32</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>James Jones, NVIDIA</li>
                <li>Carsten Rohde, NVIDIA</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Carsten Rohde (crohde 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_WIN32_KEYED_MUTEX_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_WIN32_KEYED_MUTEX_EXTENSION_NAME".."VK_NV_win32_keyed_mutex"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV".."1000058000"
    )
}