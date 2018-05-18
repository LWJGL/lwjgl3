/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows device memory to be allocated for a particular buffer or image resource, which on some devices can significantly improve the performance of that resource. Normal device memory allocations must support memory aliasing and sparse binding, which could interfere with optimizations like framebuffer compression or efficient page table usage. This is important for render targets and very large resources, but need not (and probably should not) be used for smaller resources that can benefit from suballocation.
 * 
 * <p>This extension adds a few small structures to resource creation and memory allocation: a new structure that flags whether am image/buffer will have a dedicated allocation, and a structure indicating the image or buffer that an allocation will be bound to.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <code><pre>
 *     // Create an image with
 *     // VkDedicatedAllocationImageCreateInfoNV::dedicatedAllocation
 *     // set to VK_TRUE
 * 
 *     VkDedicatedAllocationImageCreateInfoNV dedicatedImageInfo =
 *     {
 *         VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV,            // sType
 *         NULL,                                                                   // pNext
 *         VK_TRUE,                                                                // dedicatedAllocation
 *     };
 * 
 *     VkImageCreateInfo imageCreateInfo =
 *     {
 *         VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO,    // sType
 *         &dedicatedImageInfo                     // pNext
 *         // Other members set as usual
 *     };
 * 
 *     VkImage image;
 *     VkResult result = vkCreateImage(
 *         device,
 *         &imageCreateInfo,
 *         NULL,                       // pAllocator
 *         &image);
 * 
 *     VkMemoryRequirements memoryRequirements;
 *     vkGetImageMemoryRequirements(
 *         device,
 *         image,
 *         &memoryRequirements);
 * 
 *     // Allocate memory with VkDedicatedAllocationMemoryAllocateInfoNV::image
 *     // pointing to the image we are allocating the memory for
 * 
 *     VkDedicatedAllocationMemoryAllocateInfoNV dedicatedInfo =
 *     {
 *         VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV,             // sType
 *         NULL,                                                                       // pNext
 *         image,                                                                      // image
 *         VK_NULL_HANDLE,                                                             // buffer
 *     };
 * 
 *     VkMemoryAllocateInfo memoryAllocateInfo =
 *     {
 *         VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO,                 // sType
 *         &dedicatedInfo,                                         // pNext
 *         memoryRequirements.size,                                // allocationSize
 *         FindMemoryTypeIndex(memoryRequirements.memoryTypeBits), // memoryTypeIndex
 *     };
 * 
 *     VkDeviceMemory memory;
 *     vkAllocateMemory(
 *         device,
 *         &memoryAllocateInfo,
 *         NULL,                       // pAllocator
 *         &memory);
 * 
 *     // Bind the image to the memory
 * 
 *     vkBindImageMemory(
 *         device,
 *         image,
 *         memory,
 *         0);</pre></code>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_dedicated_allocation}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>27</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz @jeffbolznv</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-05-31</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class NVDedicatedAllocation {

    /** The extension specification version. */
    public static final int VK_NV_DEDICATED_ALLOCATION_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_DEDICATED_ALLOCATION_EXTENSION_NAME = "VK_NV_dedicated_allocation";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV    = 1000026000,
        VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV   = 1000026001,
        VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV = 1000026002;

    private NVDedicatedAllocation() {}

}