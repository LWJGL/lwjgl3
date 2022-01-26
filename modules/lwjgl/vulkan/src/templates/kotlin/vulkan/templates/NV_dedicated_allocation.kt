/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_dedicated_allocation = "NVDedicatedAllocation".nativeClassVK("NV_dedicated_allocation", type = "device", postfix = "NV") {
    documentation =
        """
        This extension allows device memory to be allocated for a particular buffer or image resource, which on some devices can significantly improve the performance of that resource. Normal device memory allocations must support memory aliasing and sparse binding, which could interfere with optimizations like framebuffer compression or efficient page table usage. This is important for render targets and very large resources, but need not (and probably should not) be used for smaller resources that can benefit from suballocation.

        This extension adds a few small structures to resource creation and memory allocation: a new structure that flags whether am image/buffer will have a dedicated allocation, and a structure indicating the image or buffer that an allocation will be bound to.

        <h5>Examples</h5>
        <pre><code>
￿    // Create an image with
￿    // VkDedicatedAllocationImageCreateInfoNV::dedicatedAllocation
￿    // set to VK_TRUE
￿
￿    VkDedicatedAllocationImageCreateInfoNV dedicatedImageInfo =
￿    {
￿        VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV,            // sType
￿        NULL,                                                                   // pNext
￿        VK_TRUE,                                                                // dedicatedAllocation
￿    };
￿
￿    VkImageCreateInfo imageCreateInfo =
￿    {
￿        VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO,    // sType
￿        &amp;dedicatedImageInfo                     // pNext
￿        // Other members set as usual
￿    };
￿
￿    VkImage image;
￿    VkResult result = vkCreateImage(
￿        device,
￿        &amp;imageCreateInfo,
￿        NULL,                       // pAllocator
￿        &amp;image);
￿
￿    VkMemoryRequirements memoryRequirements;
￿    vkGetImageMemoryRequirements(
￿        device,
￿        image,
￿        &amp;memoryRequirements);
￿
￿    // Allocate memory with VkDedicatedAllocationMemoryAllocateInfoNV::image
￿    // pointing to the image we are allocating the memory for
￿
￿    VkDedicatedAllocationMemoryAllocateInfoNV dedicatedInfo =
￿    {
￿        VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV,             // sType
￿        NULL,                                                                       // pNext
￿        image,                                                                      // image
￿        VK_NULL_HANDLE,                                                             // buffer
￿    };
￿
￿    VkMemoryAllocateInfo memoryAllocateInfo =
￿    {
￿        VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO,                 // sType
￿        &amp;dedicatedInfo,                                         // pNext
￿        memoryRequirements.size,                                // allocationSize
￿        FindMemoryTypeIndex(memoryRequirements.memoryTypeBits), // memoryTypeIndex
￿    };
￿
￿    VkDeviceMemory memory;
￿    vkAllocateMemory(
￿        device,
￿        &amp;memoryAllocateInfo,
￿        NULL,                       // pAllocator
￿        &amp;memory);
￿
￿    // Bind the image to the memory
￿
￿    vkBindImageMemory(
￿        device,
￿        image,
￿        memory,
￿        0);</code></pre>

        <h5>VK_NV_dedicated_allocation</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_dedicated_allocation}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>27</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li>
                    <em>Deprecated</em> by {@link KHRDedicatedAllocation VK_KHR_dedicated_allocation} extension
                    <ul>
                        <li>Which in turn was <em>promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1-promotions">Vulkan 1.1</a></li>
                    </ul>
                </li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_dedicated_allocation]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_dedicated_allocation%20extension%3E%3E">jeffbolznv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2016-05-31</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_DEDICATED_ALLOCATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_DEDICATED_ALLOCATION_EXTENSION_NAME".."VK_NV_dedicated_allocation"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV".."1000026000",
        "STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV".."1000026001",
        "STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV".."1000026002"
    )
}