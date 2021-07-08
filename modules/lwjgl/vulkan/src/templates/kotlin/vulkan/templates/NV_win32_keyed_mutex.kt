/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_win32_keyed_mutex = "NVWin32KeyedMutex".nativeClassVK("NV_win32_keyed_mutex", type = "device", postfix = NV) {
    documentation =
        """
        Applications that wish to import Direct3D 11 memory objects into the Vulkan API may wish to use the native keyed mutex mechanism to synchronize access to the memory between Vulkan and Direct3D. This extension provides a way for an application to access the keyed mutex associated with an imported Vulkan memory object when submitting command buffers to a queue.

        <h5>Examples</h5>
        <pre><code>
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
￿                                        &amp;memoryProperties);
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
￿        &amp;properties);
￿
￿    if ((result != VK_SUCCESS) ||
￿        !(properties.externalMemoryFeatures &amp;
￿          VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV)) {
￿        abort();
￿    }
￿
￿    // Set up the external memory image creation info
￿    memset(&amp;externalMemoryImageCreateInfo,
￿           0, sizeof(externalMemoryImageCreateInfo));
￿    externalMemoryImageCreateInfo.sType =
￿        VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV;
￿    externalMemoryImageCreateInfo.handleTypes = handleType;
￿    // Set up the  core image creation info
￿    memset(&amp;imageCreateInfo, 0, sizeof(imageCreateInfo));
￿    imageCreateInfo.sType = VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO;
￿    imageCreateInfo.pNext = &amp;externalMemoryImageCreateInfo;
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
￿    vkCreateImage(device, &amp;imageCreateInfo, NULL, &amp;image);
￿    vkGetImageMemoryRequirements(device,
￿                                 image,
￿                                 &amp;imageMemoryRequirements);
￿
￿    // For simplicity, just pick the first compatible memory type.
￿    for (memoryType = 0; memoryType &lt; numMemoryTypes; memoryType++) {
￿        if ((1 &lt;&lt; memoryType) &amp; imageMemoryRequirements.memoryTypeBits) {
￿            break;
￿        }
￿    }
￿
￿    // At least one memory type must be supported given the prior external
￿    // handle capability check.
￿    assert(memoryType &lt; numMemoryTypes);
￿
￿    // Allocate the external memory object.
￿    memset(&amp;exportMemoryAllocateInfo, 0, sizeof(exportMemoryAllocateInfo));
￿    exportMemoryAllocateInfo.sType =
￿        VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV;
￿    importMemoryInfo.handleTypes = handleType;
￿    importMemoryInfo.handle = sharedNtHandle;
￿
￿    memset(&amp;memoryAllocateInfo, 0, sizeof(memoryAllocateInfo));
￿    memoryAllocateInfo.sType = VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO;
￿    memoryAllocateInfo.pNext = &amp;exportMemoryAllocateInfo;
￿    memoryAllocateInfo.allocationSize = imageMemoryRequirements.size;
￿    memoryAllocateInfo.memoryTypeIndex = memoryType;
￿
￿    vkAllocateMemory(device, &amp;memoryAllocateInfo, NULL, &amp;mem);
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
￿    keyedMutex.pAcquireSyncs = &amp;mem;
￿    keyedMutex.pAcquireKeys = &amp;acquireKey;
￿    keyedMutex.pAcquireTimeoutMilliseconds = &amp;timeout;
￿    keyedMutex.releaseCount = 1;
￿    keyedMutex.pReleaseSyncs = &amp;mem;
￿    keyedMutex.pReleaseKeys = &amp;releaseKey;
￿
￿    VkSubmitInfo submit_info = { VK_STRUCTURE_TYPE_SUBMIT_INFO, &amp;keyedMutex };
￿    submit_info.commandBufferCount = 1;
￿    submit_info.pCommandBuffers = &amp;cmd_buf;
￿    vkQueueSubmit(queue, 1, &amp;submit_info, VK_NULL_HANDLE);</code></pre>

        <h5>VK_NV_win32_keyed_mutex</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_win32_keyed_mutex}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>59</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link NVExternalMemoryWin32 VK_NV_external_memory_win32}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to {@link KHRWin32KeyedMutex VK_KHR_win32_keyed_mutex} extension</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Carsten Rohde <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_NV_win32_keyed_mutex:%20&amp;body=@crohde%20">crohde</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2016-08-19</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>James Jones, NVIDIA</li>
                <li>Carsten Rohde, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_WIN32_KEYED_MUTEX_SPEC_VERSION".."2"
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