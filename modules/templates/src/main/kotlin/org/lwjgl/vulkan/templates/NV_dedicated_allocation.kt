/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val NV_dedicated_allocation = "NVDedicatedAllocation".nativeClassVK("NV_dedicated_allocation", type = "device", postfix = NV) {
    documentation =
        """
        This extension allows device memory to be allocated for a particular buffer or image resource, which on some devices can significantly improve the performance of that resource. Normal device memory allocations must support memory aliasing and sparse binding, which could interfere with optimizations like framebuffer compression or efficient page table usage. This is important for render targets and very large resources, but need not (and probably should not) be used for smaller resources that can benefit from suballocation.

        This extension adds a few small structures to resource creation and memory allocation: a new structure that flags whether am image/buffer will have a dedicated allocation, and a structure indicating the image or buffer that an allocation will be bound to.

        <h5>Examples</h5>
        <code><pre>
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
￿        &dedicatedImageInfo                     // pNext
￿        // Other members set as usual
￿    };
￿
￿    VkImage image;
￿    VkResult result = vkCreateImage(
￿        device,
￿        &imageCreateInfo,
￿        NULL,                       // pAllocator
￿        &image);
￿
￿    VkMemoryRequirements memoryRequirements;
￿    vkGetImageMemoryRequirements(
￿        device,
￿        image,
￿        &memoryRequirements);
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
￿        &dedicatedInfo,                                         // pNext
￿        memoryRequirements.size,                                // allocationSize
￿        FindMemoryTypeIndex(memoryRequirements.memoryTypeBits), // memoryTypeIndex
￿    };
￿
￿    VkDeviceMemory memory;
￿    vkAllocateMemory(
￿        device,
￿        &memoryAllocateInfo,
￿        NULL,                       // pAllocator
￿        &memory);
￿
￿    // Bind the image to the memory
￿
￿    vkBindImageMemory(
￿        device,
￿        image,
￿        memory,
￿        0);</pre></code>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_NV_dedicated_allocation</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>27</dd>

            <dt><b>Status</b></dt>
            <dd>Draft.</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-05-31</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Jeff Bolz (jbolz 'at' nvidia.com)</li>
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