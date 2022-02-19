/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.vulkan.*;

/**
 * The Vulkan Memory Allocator.
 * 
 * <h3>Quick start</h3>
 * 
 * <h4>Initialization</h4>
 * 
 * <p>At program startup:</p>
 * 
 * <ol>
 * <li>Initialize Vulkan to have {@code VkPhysicalDevice}, {@code VkDevice} and {@code VkInstance} object.</li>
 * <li>Fill {@link VmaAllocatorCreateInfo} structure and create {@code VmaAllocator} object by calling {@link #vmaCreateAllocator CreateAllocator}.</li>
 * </ol>
 * 
 * <pre><code>
 * VmaVulkanFunctions vulkanFunctions = {};
 * vulkanFunctions.vkGetInstanceProcAddr = &amp;vkGetInstanceProcAddr;
 * vulkanFunctions.vkGetDeviceProcAddr = &amp;vkGetDeviceProcAddr;
 * 
 * VmaAllocatorCreateInfo allocatorCreateInfo = {};
 * allocatorCreateInfo.vulkanApiVersion = VK_API_VERSION_1_2;
 * allocatorCreateInfo.physicalDevice = physicalDevice;
 * allocatorCreateInfo.device = device;
 * allocatorCreateInfo.instance = instance;
 * allocatorCreateInfo.pVulkanFunctions = &amp;vulkanFunctions;
 * 
 * VmaAllocator allocator;
 * vmaCreateAllocator(&amp;allocatorCreateInfo, &amp;allocator);</code></pre>
 * 
 * <p>Only members {@code physicalDevice}, {@code device}, {@code instance} are required. However, you should inform the library which Vulkan version do you
 * use by setting {@code VmaAllocatorCreateInfo::vulkanApiVersion} and which extensions did you enable by setting {@code VmaAllocatorCreateInfo::flags}
 * (like {@link #VMA_ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT} for {@code VK_KHR_buffer_device_address}). Otherwise, VMA would use only features of Vulkan 1.0 core
 * with no extensions.</p>
 * 
 * <h4>Resource allocation</h4>
 * 
 * <p>When you want to create a buffer or image:</p>
 * 
 * <ol>
 * <li>Fill {@code VkBufferCreateInfo} / {@code VkImageCreateInfo} structure.</li>
 * <li>Fill {@code VmaAllocationCreateInfo} structure.</li>
 * <li>Call {@link #vmaCreateBuffer CreateBuffer} / {@link #vmaCreateImage CreateImage} to get {@code VkBuffer}/{@code VkImage} with memory already allocated and bound to it, plus
 * {@code VmaAllocation} objects that represents its underlying memory.</li>
 * </ol>
 * 
 * <pre><code>
 * VkBufferCreateInfo bufferInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 * bufferInfo.size = 65536;
 * bufferInfo.usage = VK_BUFFER_USAGE_VERTEX_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;
 * 
 * VmaAllocationCreateInfo allocInfo = {};
 * allocInfo.usage = VMA_MEMORY_USAGE_AUTO;
 * 
 * VkBuffer buffer;
 * VmaAllocation allocation;
 * vmaCreateBuffer(allocator, &amp;bufferInfo, &amp;allocInfo, &amp;buffer, &amp;allocation, nullptr);</code></pre>
 * 
 * <p>Don't forget to destroy your objects when no longer needed:</p>
 * 
 * <pre><code>
 * vmaDestroyBuffer(allocator, buffer, allocation);
 * vmaDestroyAllocator(allocator);</code></pre>
 * 
 * <h3>Choosing memory type</h3>
 * 
 * <p>Physical devices in Vulkan support various combinations of memory heaps and types. Help with choosing correct and optimal memory type for your specific
 * resource is one of the key features of this library. You can use it by filling appropriate members of VmaAllocationCreateInfo structure, as described
 * below. You can also combine multiple methods.</p>
 * 
 * <ol>
 * <li>If you just want to find memory type index that meets your requirements, you can use function: {@link #vmaFindMemoryTypeIndexForBufferInfo FindMemoryTypeIndexForBufferInfo}, 
 * {@link #vmaFindMemoryTypeIndexForImageInfo FindMemoryTypeIndexForImageInfo}, {@link #vmaFindMemoryTypeIndex FindMemoryTypeIndex}.</li>
 * <li>If you want to allocate a region of device memory without association with any specific image or buffer, you can use function {@link #vmaAllocateMemory AllocateMemory}.
 * Usage of this function is not recommended and usually not needed. {@link #vmaAllocateMemoryPages AllocateMemoryPages} function is also provided for creating multiple
 * allocations at once, which may be useful for sparse binding.</li>
 * <li>If you already have a buffer or an image created, you want to allocate memory for it and then you will bind it yourself, you can use function
 * {@link #vmaAllocateMemoryForBuffer AllocateMemoryForBuffer}, {@link #vmaAllocateMemoryForImage AllocateMemoryForImage}. For binding you should use functions: {@link #vmaBindBufferMemory BindBufferMemory}, {@link #vmaBindImageMemory BindImageMemory} or their
 * extended versions: {@link #vmaBindBufferMemory2 BindBufferMemory2}, {@link #vmaBindImageMemory2 BindImageMemory2}.</li>
 * <li><b>This is the easiest and recommended way to use this library:</b> If you want to create a buffer or an image, allocate memory for it and bind
 * them together, all in one call, you can use function {@link #vmaCreateBuffer CreateBuffer}, {@link #vmaCreateImage CreateImage}.</li>
 * </ol>
 * 
 * <p>When using 3. or 4., the library internally queries Vulkan for memory types supported for that buffer or image (function
 * {@code vkGetBufferMemoryRequirements()}) and uses only one of these types.</p>
 * 
 * <p>If no memory type can be found that meets all the requirements, these functions return {@code VK_ERROR_FEATURE_NOT_PRESENT}.</p>
 * 
 * <p>You can leave {@link VmaAllocationCreateInfo} structure completely filled with zeros. It means no requirements are specified for memory type. It is valid,
 * although not very useful.</p>
 * 
 * <h4>Usage</h4>
 * 
 * <p>The easiest way to specify memory requirements is to fill member {@link VmaAllocationCreateInfo}{@code ::usage} using one of the values of enum
 * {@code VmaMemoryUsage}. It defines high level, common usage types. Since version 3 of the library, it is recommended to use {@link #VMA_MEMORY_USAGE_AUTO MEMORY_USAGE_AUTO} to let
 * it select best memory type for your resource automatically.</p>
 * 
 * <p>For example, if you want to create a uniform buffer that will be filled using transfer only once or infrequently and then used for rendering every
 * frame as a uniform buffer, you can do it using following code. The buffer will most likely end up in a memory type with
 * {@code VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT} to be fast to access by the GPU device.</p>
 * 
 * <pre><code>
 * VkBufferCreateInfo bufferInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 * bufferInfo.size = 65536;
 * bufferInfo.usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;
 * 
 * VmaAllocationCreateInfo allocInfo = {};
 * allocInfo.usage = VMA_MEMORY_USAGE_AUTO;
 * 
 * VkBuffer buffer;
 * VmaAllocation allocation;
 * vmaCreateBuffer(allocator, &amp;bufferInfo, &amp;allocInfo, &amp;buffer, &amp;allocation, nullptr);</code></pre>
 * 
 * <p>If you have a preference for putting the resource in GPU (device) memory or CPU (host) memory on systems with discrete graphics card that have the
 * memories separate, you can use {@link #VMA_MEMORY_USAGE_AUTO_PREFER_DEVICE MEMORY_USAGE_AUTO_PREFER_DEVICE} or {@link #VMA_MEMORY_USAGE_AUTO_PREFER_HOST MEMORY_USAGE_AUTO_PREFER_HOST}.</p>
 * 
 * <p>When using {@code VMA_MEMORY_USAGE_AUTO*} while you want to map the allocated memory, you also need to specify one of the host access flags:
 * {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT} or {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT}. This will help the library decide about preferred
 * memory type to ensure it has {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT} so you can map it.</p>
 * 
 * <p>For example, a staging buffer that will be filled via mapped pointer and then used as a source of transfer to the buffer decribed previously can be
 * created like this. It will likely and up in a memory type that is {@code HOST_VISIBLE} and {@code HOST_COHERENT} but not {@code HOST_CACHED} (meaning
 * uncached, write-combined) and not {@code DEVICE_LOCAL} (meaning system RAM).</p>
 * 
 * <pre><code>
 * VkBufferCreateInfo stagingBufferInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 * stagingBufferInfo.size = 65536;
 * stagingBufferInfo.usage = VK_BUFFER_USAGE_TRANSFER_SRC_BIT;
 * 
 * VmaAllocationCreateInfo stagingAllocInfo = {};
 * stagingAllocInfo.usage = VMA_MEMORY_USAGE_AUTO;
 * stagingAllocInfo.flags = VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT;
 * 
 * VkBuffer stagingBuffer;
 * VmaAllocation stagingAllocation;
 * vmaCreateBuffer(allocator, &amp;stagingBufferInfo, &amp;stagingAllocInfo, &amp;stagingBuffer, &amp;stagingAllocation, nullptr);</code></pre>
 * 
 * <p>Usage values {@code VMA_MEMORY_USAGE_AUTO*} are legal to use only when the library knows about the resource being created by having
 * {@code VkBufferCreateInfo} / {@code VkImageCreateInfo} passed, so they work with functions like: {@link #vmaCreateBuffer CreateBuffer}, {@link #vmaCreateImage CreateImage},
 * {@link #vmaFindMemoryTypeIndexForBufferInfo FindMemoryTypeIndexForBufferInfo} etc. If you allocate raw memory using function {@link #vmaAllocateMemory AllocateMemory}, you have to use other means of selecting memory
 * type, as decribed below.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Old usage values ({@link #VMA_MEMORY_USAGE_GPU_ONLY MEMORY_USAGE_GPU_ONLY}, {@link #VMA_MEMORY_USAGE_CPU_ONLY MEMORY_USAGE_CPU_ONLY}, {@link #VMA_MEMORY_USAGE_CPU_TO_GPU MEMORY_USAGE_CPU_TO_GPU}, {@link #VMA_MEMORY_USAGE_GPU_TO_CPU MEMORY_USAGE_GPU_TO_CPU}, {@link #VMA_MEMORY_USAGE_CPU_COPY MEMORY_USAGE_CPU_COPY}) are still
 * available and work same way as in previous versions of the library for backward compatibility, but they are not recommended.</p></div>
 * 
 * <h4>Required and preferred flags</h4>
 * 
 * <p>You can specify more detailed requirements by filling members {@link VmaAllocationCreateInfo}{@code ::requiredFlags} and
 * {@link VmaAllocationCreateInfo}{@code ::preferredFlags} with a combination of bits from enum {@code VkMemoryPropertyFlags}. For example, if you want to
 * create a buffer that will be persistently mapped on host (so it must be {@code HOST_VISIBLE}) and preferably will also be {@code HOST_COHERENT} and
 * {@code HOST_CACHED}, use following code:</p>
 * 
 * <pre><code>
 * VmaAllocationCreateInfo allocInfo = {};
 * allocInfo.requiredFlags = VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT;
 * allocInfo.preferredFlags = VK_MEMORY_PROPERTY_HOST_COHERENT_BIT | VK_MEMORY_PROPERTY_HOST_CACHED_BIT;
 * allocInfo.flags = VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT | VMA_ALLOCATION_CREATE_MAPPED_BIT;
 * 
 * VkBuffer buffer;
 * VmaAllocation allocation;
 * vmaCreateBuffer(allocator, &amp;bufferInfo, &amp;allocInfo, &amp;buffer, &amp;allocation, nullptr);</code></pre>
 * 
 * <p>A memory type is chosen that has all the required flags and as many preferred flags set as possible.</p>
 * 
 * <p>Value passed in {@link VmaAllocationCreateInfo}{@code ::usage} is internally converted to a set of required and preferred flags, plus some extra "magic"
 * (heuristics).</p>
 * 
 * <h4>Explicit memory types</h4>
 * 
 * <p>If you inspected memory types available on the physical device and you have a preference for memory types that you want to use, you can fill member
 * {@link VmaAllocationCreateInfo}{@code ::memoryTypeBits}. It is a bit mask, where each bit set means that a memory type with that index is allowed to be used
 * for the allocation. Special value 0, just like {@code UINT32_MAX}, means there are no restrictions to memory type index.</p>
 * 
 * <p>Please note that this member is NOT just a memory type index. Still you can use it to choose just one, specific memory type. For example, if you
 * already determined that your buffer should be created in memory type 2, use following code:</p>
 * 
 * <pre><code>
 * uint32_t memoryTypeIndex = 2;
 * 
 * VmaAllocationCreateInfo allocInfo = {};
 * allocInfo.memoryTypeBits = 1u &lt;&lt; memoryTypeIndex;
 * 
 * VkBuffer buffer;
 * VmaAllocation allocation;
 * vmaCreateBuffer(allocator, &amp;bufferInfo, &amp;allocInfo, &amp;buffer, &amp;allocation, nullptr);</code></pre>
 * 
 * <h4>Custom memory pools</h4>
 * 
 * <p>If you allocate from custom memory pool, all the ways of specifying memory requirements described above are not applicable and the aforementioned
 * members of {@link VmaAllocationCreateInfo} structure are ignored. Memory type is selected explicitly when creating the pool and then used to make all the
 * allocations from that pool. For further details, see Custom Memory Pools below.</p>
 * 
 * <h4>Dedicated allocations</h4>
 * 
 * <p>Memory for allocations is reserved out of larger block of {@code VkDeviceMemory} allocated from Vulkan internally. That is the main feature of this
 * whole library. You can still request a separate memory block to be created for an allocation, just like you would do in a trivial solution without
 * using any allocator. In that case, a buffer or image is always bound to that memory at offset 0. This is called a "dedicated allocation". You can
 * explicitly request it by using flag {@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT}. The library can also internally decide to use dedicated allocation in some
 * cases, e.g.:</p>
 * 
 * <ul>
 * <li>When the size of the allocation is large.</li>
 * <li>When {@code VK_KHR_dedicated_allocation} extension is enabled and it reports that dedicated allocation is required or recommended for the resource.</li>
 * <li>When allocation of next big memory block fails due to not enough device memory, but allocation with the exact requested size succeeds.</li>
 * </ul>
 * 
 * <h3>Memory mapping</h3>
 * 
 * <p>To "map memory" in Vulkan means to obtain a CPU pointer to {@code VkDeviceMemory}, to be able to read from it or write to it in CPU code. Mapping is
 * possible only of memory allocated from a memory type that has {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT} flag. Functions {@code vkMapMemory()},
 * {@code vkUnmapMemory()} are designed for this purpose. You can use them directly with memory allocated by this library, but it is not recommended
 * because of following issue: Mapping the same {@code VkDeviceMemory} block multiple times is illegal - only one mapping at a time is allowed. This
 * includes mapping disjoint regions. Mapping is not reference-counted internally by Vulkan. Because of this, Vulkan Memory Allocator provides following
 * facilities:</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>If you want to be able to map an allocation, you need to specify one of the flags {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT} or
 * {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT} in {@link VmaAllocationCreateInfo}{@code ::flags}. These flags are required for an allocation to be mappable when
 * using {@link #VMA_MEMORY_USAGE_AUTO MEMORY_USAGE_AUTO} or other {@code VMA_MEMORY_USAGE_AUTO*} enum values. For other usage values they are ignored and every such allocation made in
 * {@code HOST_VISIBLE} memory type is mappable, but they can still be used for consistency.</p>
 * </div>
 * 
 * <h4>Mapping functions</h4>
 * 
 * <p>The library provides following functions for mapping of a specific {@code VmaAllocation}: {@link #vmaMapMemory MapMemory}, {@link #vmaUnmapMemory UnmapMemory}. They are safer and more
 * convenient to use than standard Vulkan functions. You can map an allocation multiple times simultaneously - mapping is reference-counted internally.
 * You can also map different allocations simultaneously regardless of whether they use the same {@code VkDeviceMemory} block. The way it is implemented
 * is that the library always maps entire memory block, not just region of the allocation. For further details, see description of {@link #vmaMapMemory MapMemory} function.
 * Example:</p>
 * 
 * <pre><code>
 * // Having these objects initialized:
 * struct ConstantBuffer
 * {
 *     ...
 * };
 * ConstantBuffer constantBufferData = ...
 * 
 * VmaAllocator allocator = ...
 * VkBuffer constantBuffer = ...
 * VmaAllocation constantBufferAllocation = ...
 * 
 * // You can map and fill your buffer using following code:
 * 
 * void* mappedData;
 * vmaMapMemory(allocator, constantBufferAllocation, &amp;mappedData);
 * memcpy(mappedData, &amp;constantBufferData, sizeof(constantBufferData));
 * vmaUnmapMemory(allocator, constantBufferAllocation);</code></pre>
 * 
 * <p>When mapping, you may see a warning from Vulkan validation layer similar to this one:</p>
 * 
 * <p><i>Mapping an image with layout {@code VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} can result in undefined behavior if this memory is used by the
 * device. Only {@code GENERAL} or {@code PREINITIALIZED} should be used.</i></p>
 * 
 * <p>It happens because the library maps entire {@code VkDeviceMemory} block, where different types of images and buffers may end up together, especially on
 * GPUs with unified memory like Intel. You can safely ignore it if you are sure you access only memory of the intended object that you wanted to map.</p>
 * 
 * <h4>Persistently mapped memory</h4>
 * 
 * <p>Kepping your memory persistently mapped is generally OK in Vulkan. You don't need to unmap it before using its data on the GPU. The library provides a
 * special feature designed for that: Allocations made with {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT} flag set in {@link VmaAllocationCreateInfo}{@code ::flags} stay mapped
 * all the time, so you can just access CPU pointer to it any time without a need to call any "map" or "unmap" function. Example:</p>
 * 
 * <pre><code>
 * VkBufferCreateInfo bufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 * bufCreateInfo.size = sizeof(ConstantBuffer);
 * bufCreateInfo.usage = VK_BUFFER_USAGE_TRANSFER_SRC_BIT;
 * 
 * VmaAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.usage = VMA_MEMORY_USAGE_AUTO;
 * allocCreateInfo.flags = VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT |
 *     VMA_ALLOCATION_CREATE_MAPPED_BIT;
 * 
 * VkBuffer buf;
 * VmaAllocation alloc;
 * VmaAllocationInfo allocInfo;
 * vmaCreateBuffer(allocator, &amp;bufCreateInfo, &amp;allocCreateInfo, &amp;buf, &amp;alloc, &amp;allocInfo);
 * 
 * // Buffer is already mapped. You can access its memory.
 * memcpy(allocInfo.pMappedData, &amp;constantBufferData, sizeof(constantBufferData));</code></pre>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>{@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT} by itself doesn't guarantee that the allocation will end up in a mappable memory type. For this, you need to also specify
 * {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT} or {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT}. {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT} only guarantees that if
 * the memory is {@code HOST_VISIBLE}, the allocation will be mapped on creation.</p></div>
 * 
 * <h4>Cache flush and invalidate</h4>
 * 
 * <p>Memory in Vulkan doesn't need to be unmapped before using it on GPU, but unless a memory types has {@code VK_MEMORY_PROPERTY_HOST_COHERENT_BIT} flag
 * set, you need to manually <b>invalidate</b> cache before reading of mapped pointer and <b>flush</b> cache after writing to mapped pointer. Map/unmap
 * operations don't do that automatically. Vulkan provides following functions for this purpose {@code vkFlushMappedMemoryRangs()},
 * {@code vkInvalidateMappedMemoryRanges()}, but this library provides more convenient functions that refer to given allocation object:
 * {@link #vmaFlushAllocation FlushAllocation}, {@link #vmaInvalidateAllocation InvalidateAllocation}, or multiple objects at once: {@link #vmaFlushAllocations FlushAllocations}, {@link #vmaInvalidateAllocations InvalidateAllocations}.</p>
 * 
 * <p>Regions of memory specified for flush/invalidate must be aligned to {@code VkPhysicalDeviceLimits::nonCoherentAtomSize}. This is automatically ensured
 * by the library. In any memory type that is {@code HOST_VISIBLE} but not {@code HOST_COHERENT}, all allocations within blocks are aligned to this value,
 * so their offsets are always multiply of {@code nonCoherentAtomSize} and two different allocations never share same "line" of this size.</p>
 * 
 * <p>Please note that memory allocated with {@link #VMA_MEMORY_USAGE_CPU_ONLY MEMORY_USAGE_CPU_ONLY} is guaranteed to be {@code HOST_COHERENT}.</p>
 * 
 * <p>Also, Windows drivers from all 3 PC GPU vendors (AMD, Intel, NVIDIA) currently provide {@code HOST_COHERENT} flag on all memory types that are 
 * {@code HOST_VISIBLE}, so on PC you may not need to bother.</p>
 * 
 * <h4>Finding out if memory is mappable</h4>
 * 
 * <p>It may happen that your allocation ends up in memory that is {@code HOST_VISIBLE} (available for mapping) despite it wasn't explicitly requested. For
 * example, application may work on integrated graphics with unified memory (like Intel) or allocation from video memory might have failed, so the library
 * chose system memory as fallback.</p>
 * 
 * <p>You can detect this case and map such allocation to access its memory on CPU directly, instead of launching a transfer operation. In order to do that:
 * call {@link #vmaGetAllocationMemoryProperties GetAllocationMemoryProperties} and look for {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT} flag.</p>
 * 
 * <pre><code>
 * VkBufferCreateInfo bufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 * bufCreateInfo.size = sizeof(ConstantBuffer);
 * bufCreateInfo.usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;
 * 
 * VmaAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY;
 * allocCreateInfo.preferredFlags = VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT;
 * 
 * VkBuffer buf;
 * VmaAllocation alloc;
 * vmaCreateBuffer(allocator, &amp;bufCreateInfo, &amp;allocCreateInfo, &amp;buf, &amp;alloc, nullptr);
 * 
 * VkMemoryPropertyFlags memFlags;
 * vmaGetAllocationMemoryProperties(allocator, alloc, &amp;memFlags);
 * if((memFlags &amp; VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT) != 0)
 * {
 *     // Allocation ended up in mappable memory. You can map it and access it directly.
 *     void* mappedData;
 *     vmaMapMemory(allocator, alloc, &amp;mappedData);
 *     memcpy(mappedData, &amp;constantBufferData, sizeof(constantBufferData));
 *     vmaUnmapMemory(allocator, alloc);
 * }
 * else
 * {
 *     // Allocation ended up in non-mappable memory.
 *     // You need to create CPU-side buffer in VMA_MEMORY_USAGE_CPU_ONLY and make a transfer.
 * }</code></pre>
 * 
 * <p>You can even use {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT} flag while creating allocations that are not necessarily {@code HOST_VISIBLE} (e.g. using
 * {@link #VMA_MEMORY_USAGE_GPU_ONLY MEMORY_USAGE_GPU_ONLY}). If the allocation ends up in memory type that is {@code HOST_VISIBL}E, it will be persistently mapped and you can use it
 * directly. If not, the flag is just ignored. Example:</p>
 * 
 * <pre><code>
 * VkBufferCreateInfo bufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 * bufCreateInfo.size = sizeof(ConstantBuffer);
 * bufCreateInfo.usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;
 * 
 * VmaAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY;
 * allocCreateInfo.flags = VMA_ALLOCATION_CREATE_MAPPED_BIT;
 * 
 * VkBuffer buf;
 * VmaAllocation alloc;
 * VmaAllocationInfo allocInfo;
 * vmaCreateBuffer(allocator, &amp;bufCreateInfo, &amp;allocCreateInfo, &amp;buf, &amp;alloc, &amp;allocInfo);
 * 
 * if(allocInfo.pMappedData != nullptr)
 * {
 *     // Allocation ended up in mappable memory.
 *     // It is persistently mapped. You can access it directly.
 *     memcpy(allocInfo.pMappedData, &amp;constantBufferData, sizeof(constantBufferData));
 * }
 * else
 * {
 *     // Allocation ended up in non-mappable memory.
 *     // You need to create CPU-side buffer in VMA_MEMORY_USAGE_CPU_ONLY and make a transfer.
 * }</code></pre>
 * 
 * <h3>Staying within budget</h3>
 * 
 * <p>When developing a graphics-intensive game or program, it is important to avoid allocating more GPU memory than it is physically available. When the
 * memory is over-committed, various bad things can happen, depending on the specific GPU, graphics driver, and operating system:</p>
 * 
 * <ul>
 * <li>It may just work without any problems.</li>
 * <li>The application may slow down because some memory blocks are moved to system RAM and the GPU has to access them through PCI Express bus.</li>
 * <li>A new allocation may take very long time to complete, even few seconds, and possibly freeze entire system.</li>
 * <li>The new allocation may fail with {@code VK_ERROR_OUT_OF_DEVICE_MEMORY}.</li>
 * <li>It may even result in GPU crash (TDR), observed as {@code VK_ERROR_DEVICE_LOST} returned somewhere later.</li>
 * </ul>
 * 
 * <h4>Querying for budget</h4>
 * 
 * <p>To query for current memory usage and available budget, use function {@link #vmaGetHeapBudgets GetHeapBudgets}. Returned structure {@link VmaBudget} contains quantities expressed in
 * bytes, per Vulkan memory heap.</p>
 * 
 * <p>Please note that this function returns different information and works faster than {@link #vmaCalculateStats CalculateStats}. {@code vmaGetHeapBudgets()} can be called every
 * frame or even before every allocation, while {@code vmaCalculateStats()} is intended to be used rarely, only to obtain statistical information, e.g.
 * for debugging purposes.</p>
 * 
 * <p>It is recommended to use <b>VK_EXT_memory_budget</b> device extension to obtain information about the budget from Vulkan device. VMA is able to use
 * this extension automatically. When not enabled, the allocator behaves same way, but then it estimates current usage and available budget based on its
 * internal information and Vulkan memory heap sizes, which may be less precise. In order to use this extension:</p>
 * 
 * <ol>
 * <li>Make sure extensions {@code VK_EXT_memory_budget} and {@code VK_KHR_get_physical_device_properties2} required by it are available and enable them.
 * Please note that the first is a device extension and the second is instance extension!</li>
 * <li>Use flag {@link #VMA_ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT} when creating {@code VmaAllocator} object.</li>
 * <li>Make sure to call {@link #vmaSetCurrentFrameIndex SetCurrentFrameIndex} every frame. Budget is queried from Vulkan inside of it to avoid overhead of querying it with every
 * allocation.</li>
 * </ol>
 * 
 * <h4>Controlling memory usage</h4>
 * 
 * <p>There are many ways in which you can try to stay within the budget.</p>
 * 
 * <p>First, when making new allocation requires allocating a new memory block, the library tries not to exceed the budget automatically. If a block with
 * default recommended size (e.g. 256 MB) would go over budget, a smaller block is allocated, possibly even dedicated memory for just this resource.</p>
 * 
 * <p>If the size of the requested resource plus current memory usage is more than the budget, by default the library still tries to create it, leaving it to
 * the Vulkan implementation whether the allocation succeeds or fails. You can change this behavior by using {@link #VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT ALLOCATION_CREATE_WITHIN_BUDGET_BIT} flag.
 * With it, the allocation is not made if it would exceed the budget or if the budget is already exceeded. The allocation then fails with
 * {@code VK_ERROR_OUT_OF_DEVICE_MEMORY}. Example usage pattern may be to pass the {@code VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT} flag when creating
 * resources that are not essential for the application (e.g. the texture of a specific object) and not to pass it when creating critically important
 * resources (e.g. render targets).</p>
 * 
 * <p>Finally, you can also use {@link #VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT ALLOCATION_CREATE_NEVER_ALLOCATE_BIT} flag to make sure a new allocation is created only when it fits inside one of the
 * existing memory blocks. If it would require to allocate a new block, if fails instead with {@code VK_ERROR_OUT_OF_DEVICE_MEMORY}. This also ensures
 * that the function call is very fast because it never goes to Vulkan to obtain a new block.</p>
 * 
 * <p>Please note that creating custom memory pools with {@link VmaPoolCreateInfo}{@code ::minBlockCount} set to more than 0 will try to allocate memory blocks
 * without checking whether they fit within budget.</p>
 * 
 * <h3>Resource aliasing (overlap)</h3>
 * 
 * <p>New explicit graphics APIs (Vulkan and Direct3D 12), thanks to manual memory management, give an opportunity to alias (overlap) multiple resources in
 * the same region of memory - a feature not available in the old APIs (Direct3D 11, OpenGL). It can be useful to save video memory, but it must be used
 * with caution.</p>
 * 
 * <p>For example, if you know the flow of your whole render frame in advance, you are going to use some intermediate textures or buffers only during a small
 * range of render passes, and you know these ranges don't overlap in time, you can bind these resources to the same place in memory, even if they have
 * completely different parameters (width, height, format etc.).</p>
 * 
 * <p>Such scenario is possible using VMA, but you need to create your images manually. Then you need to calculate parameters of an allocation to be made
 * using formula:</p>
 * 
 * <ul>
 * <li>allocation size = max(size of each image)</li>
 * <li>allocation alignment = max(alignment of each image)</li>
 * <li>allocation memoryTypeBits = bitwise AND(memoryTypeBits of each image)</li>
 * </ul>
 * 
 * <p>Following example shows two different images bound to the same place in memory, allocated to fit largest of them.</p>
 * 
 * <pre><code>
 * // A 512x512 texture to be sampled.
 * VkImageCreateInfo img1CreateInfo = { VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO };
 * img1CreateInfo.imageType = VK_IMAGE_TYPE_2D;
 * img1CreateInfo.extent.width = 512;
 * img1CreateInfo.extent.height = 512;
 * img1CreateInfo.extent.depth = 1;
 * img1CreateInfo.mipLevels = 10;
 * img1CreateInfo.arrayLayers = 1;
 * img1CreateInfo.format = VK_FORMAT_R8G8B8A8_SRGB;
 * img1CreateInfo.tiling = VK_IMAGE_TILING_OPTIMAL;
 * img1CreateInfo.initialLayout = VK_IMAGE_LAYOUT_UNDEFINED;
 * img1CreateInfo.usage = VK_IMAGE_USAGE_TRANSFER_DST_BIT | VK_IMAGE_USAGE_SAMPLED_BIT;
 * img1CreateInfo.samples = VK_SAMPLE_COUNT_1_BIT;
 * 
 * // A full screen texture to be used as color attachment.
 * VkImageCreateInfo img2CreateInfo = { VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO };
 * img2CreateInfo.imageType = VK_IMAGE_TYPE_2D;
 * img2CreateInfo.extent.width = 1920;
 * img2CreateInfo.extent.height = 1080;
 * img2CreateInfo.extent.depth = 1;
 * img2CreateInfo.mipLevels = 1;
 * img2CreateInfo.arrayLayers = 1;
 * img2CreateInfo.format = VK_FORMAT_R8G8B8A8_UNORM;
 * img2CreateInfo.tiling = VK_IMAGE_TILING_OPTIMAL;
 * img2CreateInfo.initialLayout = VK_IMAGE_LAYOUT_UNDEFINED;
 * img2CreateInfo.usage = VK_IMAGE_USAGE_SAMPLED_BIT | VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT;
 * img2CreateInfo.samples = VK_SAMPLE_COUNT_1_BIT;
 * 
 * VkImage img1;
 * res = vkCreateImage(device, &amp;img1CreateInfo, nullptr, &amp;img1);
 * VkImage img2;
 * res = vkCreateImage(device, &amp;img2CreateInfo, nullptr, &amp;img2);
 * 
 * VkMemoryRequirements img1MemReq;
 * vkGetImageMemoryRequirements(device, img1, &amp;img1MemReq);
 * VkMemoryRequirements img2MemReq;
 * vkGetImageMemoryRequirements(device, img2, &amp;img2MemReq);
 * 
 * VkMemoryRequirements finalMemReq = {};
 * finalMemReq.size = std::max(img1MemReq.size, img2MemReq.size);
 * finalMemReq.alignment = std::max(img1MemReq.alignment, img2MemReq.alignment);
 * finalMemReq.memoryTypeBits = img1MemReq.memoryTypeBits &amp; img2MemReq.memoryTypeBits;
 * // Validate if(finalMemReq.memoryTypeBits != 0)
 * 
 * VmaAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.preferredFlags = VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT;
 * 
 * VmaAllocation alloc;
 * res = vmaAllocateMemory(allocator, &amp;finalMemReq, &amp;allocCreateInfo, &amp;alloc, nullptr);
 * 
 * res = vmaBindImageMemory(allocator, alloc, img1);
 * res = vmaBindImageMemory(allocator, alloc, img2);
 * 
 * // You can use img1, img2 here, but not at the same time!
 * 
 * vmaFreeMemory(allocator, alloc);
 * vkDestroyImage(allocator, img2, nullptr);
 * vkDestroyImage(allocator, img1, nullptr);</code></pre>
 * 
 * <p>Remember that using resources that alias in memory requires proper synchronization. You need to issue a memory barrier to make sure commands that use
 * {@code img1} and {@code img2} don't overlap on GPU timeline. You also need to treat a resource after aliasing as uninitialized - containing garbage
 * data. For example, if you use {@code img1} and then want to use {@code img2}, you need to issue an image memory barrier for {@code img2} with
 * {@code oldLayout = VK_IMAGE_LAYOUT_UNDEFINED}.</p>
 * 
 * <p>Additional considerations:</p>
 * 
 * <ul>
 * <li>Vulkan also allows to interpret contents of memory between aliasing resources consistently in some cases. See chapter 11.8. "Memory Aliasing" of
 * Vulkan specification or {@code VK_IMAGE_CREATE_ALIAS_BIT} flag.</li>
 * <li>You can create more complex layout where different images and buffers are bound at different offsets inside one large allocation. For example, one
 * can imagine a big texture used in some render passes, aliasing with a set of many small buffers used between in some further passes. To bind a
 * resource at non-zero offset in an allocation, use {@link #vmaBindBufferMemory2 BindBufferMemory2} / {@link #vmaBindImageMemory2 BindImageMemory2}.</li>
 * <li>Before allocating memory for the resources you want to alias, check {@code memoryTypeBits} returned in memory requirements of each resource to make
 * sure the bits overlap. Some GPUs may expose multiple memory types suitable e.g. only for buffers or images with {@code COLOR_ATTACHMENT} usage, so
 * the sets of memory types supported by your resources may be disjoint. Aliasing them is not possible in that case.</li>
 * </ul>
 * 
 * <h3>Custom memory pools</h3>
 * 
 * <p>A memory pool contains a number of {@code VkDeviceMemory} blocks. The library automatically creates and manages default pool for each memory type
 * available on the device. Default memory pool automatically grows in size. Size of allocated blocks is also variable and managed automatically.</p>
 * 
 * <p>You can create custom pool and allocate memory out of it. It can be useful if you want to:</p>
 * 
 * <ul>
 * <li>Keep certain kind of allocations separate from others.</li>
 * <li>Enforce particular, fixed size of Vulkan memory blocks.</li>
 * <li>Limit maximum amount of Vulkan memory allocated for that pool.</li>
 * <li>Reserve minimum or fixed amount of Vulkan memory always preallocated for that pool.</li>
 * <li>Use extra parameters for a set of your allocations that are available in {@link VmaPoolCreateInfo} but not in {@link VmaAllocationCreateInfo} - e.g., custom
 * minimum alignment, custom {@code pNext} chain.</li>
 * <li>Perform defragmentation on a specific subset of your allocations.</li>
 * </ul>
 * 
 * <p>To use custom memory pools:</p>
 * 
 * <ol>
 * <li>Fill {@link VmaPoolCreateInfo} structure.</li>
 * <li>Call {@link #vmaCreatePool CreatePool} to obtain {@code VmaPool} handle.</li>
 * <li>When making an allocation, set {@link VmaAllocationCreateInfo}{@code ::pool} to this handle. You don't need to specify any other parameters of this
 * structure, like {@code usage}.</li>
 * </ol>
 * 
 * <p>Example:</p>
 * 
 * <pre><code>
 * // Create a pool that can have at most 2 blocks, 128 MiB each.
 * VmaPoolCreateInfo poolCreateInfo = {};
 * poolCreateInfo.memoryTypeIndex = ...
 * poolCreateInfo.blockSize = 128ull * 1024 * 1024;
 * poolCreateInfo.maxBlockCount = 2;
 * 
 * VmaPool pool;
 * vmaCreatePool(allocator, &amp;poolCreateInfo, &amp;pool);
 * 
 * // Allocate a buffer out of it.
 * VkBufferCreateInfo bufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 * bufCreateInfo.size = 1024;
 * bufCreateInfo.usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;
 * 
 * VmaAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.pool = pool;
 * 
 * VkBuffer buf;
 * VmaAllocation alloc;
 * VmaAllocationInfo allocInfo;
 * vmaCreateBuffer(allocator, &amp;bufCreateInfo, &amp;allocCreateInfo, &amp;buf, &amp;alloc, &amp;allocInfo);</code></pre>
 * 
 * <p>You have to free all allocations made from this pool before destroying it.</p>
 * 
 * <pre><code>
 * vmaDestroyBuffer(allocator, buf, alloc);
 * vmaDestroyPool(allocator, pool);</code></pre>
 * 
 * <p>New versions of this library support creating dedicated allocations in custom pools. It is supported only when {@code VmaPoolCreateInfo::blockSize = 0}.
 * To use this feature, set {@code VmaAllocationCreateInfo::pool} to the pointer to your custom pool and {@code VmaAllocationCreateInfo::flags} to
 * {@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Excessive use of custom pools is a common mistake when using this library. Custom pools may be useful for special purposes - when you want to keep
 * certain type of resources separate e.g. to reserve minimum amount of memory for them or limit maximum amount of memory they can occupy. For most
 * resources this is not needed and so it is not recommended to create {@code VmaPool} objects and allocations out of them. Allocating from the default
 * pool is sufficient.</p>
 * </div>
 * 
 * <h4>Choosing memory type index</h4>
 * 
 * <p>When creating a pool, you must explicitly specify memory type index. To find the one suitable for your buffers or images, you can use helper functions
 * {@link #vmaFindMemoryTypeIndexForBufferInfo FindMemoryTypeIndexForBufferInfo}, {@link #vmaFindMemoryTypeIndexForImageInfo FindMemoryTypeIndexForImageInfo}. You need to provide structures with example parameters of buffers or images
 * that you are going to create in that pool.</p>
 * 
 * <pre><code>
 * VkBufferCreateInfo exampleBufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 * exampleBufCreateInfo.size = 1024; // Doesn't matter
 * exampleBufCreateInfo.usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;
 * 
 * VmaAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.usage = VMA_MEMORY_USAGE_AUTO;
 * 
 * uint32_t memTypeIndex;
 * vmaFindMemoryTypeIndexForBufferInfo(allocator, &amp;exampleBufCreateInfo, &amp;allocCreateInfo, &amp;memTypeIndex);
 * 
 * VmaPoolCreateInfo poolCreateInfo = {};
 * poolCreateInfo.memoryTypeIndex = memTypeIndex;
 * // ...</code></pre>
 * 
 * <p>When creating buffers/images allocated in that pool, provide following parameters:</p>
 * 
 * <ul>
 * <li>{@code VkBufferCreateInfo}: Prefer to pass same parameters as above. Otherwise you risk creating resources in a memory type that is not suitable
 * for them, which may result in undefined behavior. Using different {@code VK_BUFFER_USAGE_} flags may work, but you shouldn't create images in a
 * pool intended for buffers or the other way around.</li>
 * <li>{@link VmaAllocationCreateInfo}: You don't need to pass same parameters. Fill only {@code pool} member. Other members are ignored anyway.</li>
 * </ul>
 * 
 * <h4>Linear allocation algorithm</h4>
 * 
 * <p>Each Vulkan memory block managed by this library has accompanying metadata that keeps track of used and unused regions. By default, the metadata
 * structure and algorithm tries to find best place for new allocations among free regions to optimize memory usage. This way you can allocate and free
 * objects in any order.</p>
 * 
 * <p>Sometimes there is a need to use simpler, linear allocation algorithm. You can create custom pool that uses such algorithm by adding flag
 * {@link #VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT POOL_CREATE_LINEAR_ALGORITHM_BIT} to {@link VmaPoolCreateInfo}{@code ::flags} while creating {@code VmaPool} object. Then an alternative metadata management
 * is used. It always creates new allocations after last one and doesn't reuse free regions after allocations freed in the middle. It results in better
 * allocation performance and less memory consumed by metadata.</p>
 * 
 * <p>With this one flag, you can create a custom pool that can be used in many ways: free-at-once, stack, double stack, and ring buffer. See below for
 * details.</p>
 * 
 * <h5>Free-at-once</h5>
 * 
 * <p>In a pool that uses linear algorithm, you still need to free all the allocations individually, e.g. by using {@link #vmaFreeMemory FreeMemory} or {@link #vmaDestroyBuffer DestroyBuffer}. You can
 * free them in any order. New allocations are always made after last one - free space in the middle is not reused. However, when you release all the
 * allocation and the pool becomes empty, allocation starts from the beginning again. This way you can use linear algorithm to speed up creation of
 * allocations that you are going to release all at once.</p>
 * 
 * <p>This mode is also available for pools created with {@link VmaPoolCreateInfo}{@code ::maxBlockCount} value that allows multiple memory blocks.</p>
 * 
 * <h5>Stack</h5>
 * 
 * <p>When you free an allocation that was created last, its space can be reused. Thanks to this, if you always release allocations in the order opposite to
 * their creation (LIFO - Last In First Out), you can achieve behavior of a stack.</p>
 * 
 * <p>This mode is also available for pools created with {@link VmaPoolCreateInfo}{@code ::maxBlockCount} value that allows multiple memory blocks.</p>
 * 
 * <h5>Double stack</h5>
 * 
 * <p>The space reserved by a custom pool with linear algorithm may be used by two stacks:</p>
 * 
 * <ul>
 * <li>First, default one, growing up from offset 0.</li>
 * <li>Second, "upper" one, growing down from the end towards lower offsets.</li>
 * </ul>
 * 
 * <p>To make allocation from upper stack, add flag {@link #VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT ALLOCATION_CREATE_UPPER_ADDRESS_BIT} to {@link VmaAllocationCreateInfo}{@code ::flags}.</p>
 * 
 * <p>Double stack is available only in pools with one memory block - {@link VmaPoolCreateInfo}{@code ::maxBlockCount} must be 1. Otherwise behavior is undefined.</p>
 * 
 * <p>When the two stacks' ends meet so there is not enough space between them for a new allocation, such allocation fails with usual
 * {@code VK_ERROR_OUT_OF_DEVICE_MEMORY} error.</p>
 * 
 * <h5>Ring buffer</h5>
 * 
 * <p>When you free some allocations from the beginning and there is not enough free space for a new one at the end of a pool, allocator's "cursor" wraps
 * around to the beginning and starts allocation there. Thanks to this, if you always release allocations in the same order as you created them (FIFO -
 * First In First Out), you can achieve behavior of a ring buffer / queue.</p>
 * 
 * <p>Ring buffer is available only in pools with one memory block - {@link VmaPoolCreateInfo}{@code ::maxBlockCount} must be 1. Otherwise behavior is undefined.</p>
 * 
 * <h4>Buddy allocation algorithm</h4>
 * 
 * <p>There is another allocation algorithm that can be used with custom pools, called "buddy". Its internal data structure is based on a tree of blocks,
 * each having size that is a power of two and a half of its parent's size. When you want to allocate memory of certain size, a free node in the tree is
 * located. If it is too large, it is recursively split into two halves (called "buddies"). However, if requested allocation size is not a power of two,
 * the size of a tree node is aligned up to the nearest power of two and the remaining space is wasted. When two buddy nodes become free, they are merged
 * back into one larger node.</p>
 * 
 * <p>The advantage of buddy allocation algorithm over default algorithm is faster allocation and deallocation, as well as smaller external fragmentation.
 * The disadvantage is more wasted space (internal fragmentation).</p>
 * 
 * <p>For more information, please search the Internet for "Buddy memory allocation" - sources that describe this concept in general.</p>
 * 
 * <p>To use buddy allocation algorithm with a custom pool, add flag {@link #VMA_POOL_CREATE_BUDDY_ALGORITHM_BIT POOL_CREATE_BUDDY_ALGORITHM_BIT} to {@link VmaPoolCreateInfo}{@code ::flags} while creating
 * {@code VmaPool} object.</p>
 * 
 * <p>Several limitations apply to pools that use buddy algorithm:</p>
 * 
 * <ul>
 * <li>It is recommended to use {@link VmaPoolCreateInfo}{@code ::blockSize} that is a power of two. Otherwise, only largest power of two smaller than the size
 * is used for allocations. The remaining space always stays unused.</li>
 * <li>Margins and corruption detection don't work in such pools.</li>
 * <li>Defragmentation doesn't work with allocations made from such pool.</li>
 * </ul>
 * 
 * <h3>Defragmentation</h3>
 * 
 * <p>Interleaved allocations and deallocations of many objects of varying size cause fragmentation over time, which can lead to a situation where the
 * library is unable to find a continuous range of free memory for a new allocation despite there is enough free space, just scattered across many small
 * free ranges between existing allocations.</p>
 * 
 * <p>To mitigate this problem, you can use defragmentation feature: {@link VmaDefragmentationInfo2}, {@link #vmaDefragmentationBegin DefragmentationBegin}, {@link #vmaDefragmentationEnd DefragmentationEnd}. Given set of
 * allocations, this function can move them to compact used memory, ensure more continuous free space and possibly also free some {@code VkDeviceMemory}
 * blocks.</p>
 * 
 * <p>What the defragmentation does is:</p>
 * 
 * <ul>
 * <li>Updates {@code VmaAllocation} objects to point to new {@code VkDeviceMemory} and offset. After allocation has been moved, its
 * {@link VmaAllocationInfo}{@code ::deviceMemory} and/or {@code VmaAllocationInfo::offset} changes. You must query them again using {@link #vmaGetAllocationInfo GetAllocationInfo} if
 * you need them.</li>
 * <li>Moves actual data in memory.</li>
 * </ul>
 * 
 * <p>What it doesn't do, so you need to do it yourself:</p>
 * 
 * <ul>
 * <li>Recreate buffers and images that were bound to allocations that were defragmented and bind them with their new places in memory. You must use
 * {@code vkDestroyBuffer()}, {@code vkDestroyImage()}, {@code vkCreateBuffer()}, {@code vkCreateImage()}, {@link #vmaBindBufferMemory BindBufferMemory}, {@link #vmaBindImageMemory BindImageMemory} for
 * that purpose and NOT {@link #vmaDestroyBuffer DestroyBuffer}, {@link #vmaDestroyImage DestroyImage}, {@link #vmaCreateBuffer CreateBuffer}, {@link #vmaCreateImage CreateImage}, because you don't need to destroy or create allocation
 * objects!</li>
 * <li>Recreate views and update descriptors that point to these buffers and images.</li>
 * </ul>
 * 
 * <h4>Defragmenting CPU memory</h4>
 * 
 * <p>Following example demonstrates how you can run defragmentation on CPU. Only allocations created in memory types that are {@code HOST_VISIBLE} can be
 * defragmented. Others are ignored.</p>
 * 
 * <p>The way it works is:</p>
 * 
 * <ul>
 * <li>It temporarily maps entire memory blocks when necessary.</li>
 * <li>It moves data using {@code memmove()} function.</li>
 * </ul>
 * 
 * <pre><code>
 * // Given following variables already initialized:
 * VkDevice device;
 * VmaAllocator allocator;
 * std::vector&lt;VkBuffer&gt; buffers;
 * std::vector&lt;VmaAllocation&gt; allocations;
 * 
 * 
 * const uint32_t allocCount = (uint32_t)allocations.size();
 * std::vector&lt;VkBool32&gt; allocationsChanged(allocCount);
 * 
 * VmaDefragmentationInfo2 defragInfo = {};
 * defragInfo.allocationCount = allocCount;
 * defragInfo.pAllocations = allocations.data();
 * defragInfo.pAllocationsChanged = allocationsChanged.data();
 * defragInfo.maxCpuBytesToMove = VK_WHOLE_SIZE; // No limit.
 * defragInfo.maxCpuAllocationsToMove = UINT32_MAX; // No limit.
 * 
 * VmaDefragmentationContext defragCtx;
 * vmaDefragmentationBegin(allocator, &amp;defragInfo, nullptr, &amp;defragCtx);
 * vmaDefragmentationEnd(allocator, defragCtx);
 * 
 * for(uint32_t i = 0; i &lt; allocCount; ++i)
 * {
 *     if(allocationsChanged[i])
 *     {
 *         // Destroy buffer that is immutably bound to memory region which is no longer valid.
 *         vkDestroyBuffer(device, buffers[i], nullptr);
 * 
 *         // Create new buffer with same parameters.
 *         VkBufferCreateInfo bufferInfo = ...;
 *         vkCreateBuffer(device, &amp;bufferInfo, nullptr, &amp;buffers[i]);
 * 
 *         // You can make dummy call to vkGetBufferMemoryRequirements here to silence validation layer warning.
 * 
 *         // Bind new buffer to new memory region. Data contained in it is already moved.
 *         VmaAllocationInfo allocInfo;
 *         vmaGetAllocationInfo(allocator, allocations[i], &amp;allocInfo);
 *         vmaBindBufferMemory(allocator, allocations[i], buffers[i]);
 *     }
 * }</code></pre>
 * 
 * <p>Setting {@link VmaDefragmentationInfo2}{@code ::pAllocationsChanged} is optional. This output array tells whether particular allocation in
 * {@code VmaDefragmentationInfo2::pAllocations} at the same index has been modified during defragmentation. You can pass null, but you then need to query
 * every allocation passed to defragmentation for new parameters using {@link #vmaGetAllocationInfo GetAllocationInfo} if you might need to recreate and rebind a buffer or image
 * associated with it.</p>
 * 
 * <p>If you use {@code Custom memory pools}, you can fill {@code VmaDefragmentationInfo2::poolCount} and {@code VmaDefragmentationInfo2::pPools} instead of
 * {@code VmaDefragmentationInfo2::allocationCount} and {@code VmaDefragmentationInfo2::pAllocations} to defragment all allocations in given pools. You
 * cannot use {@code VmaDefragmentationInfo2::pAllocationsChanged} in that case. You can also combine both methods.</p>
 * 
 * <h4>Defragmenting GPU memory</h4>
 * 
 * <p>It is also possible to defragment allocations created in memory types that are not {@code HOST_VISIBLE}. To do that, you need to pass a command buffer
 * that meets requirements as described in {@code VmaDefragmentationInfo2::commandBuffer}. The way it works is:</p>
 * 
 * <ul>
 * <li>It creates temporary buffers and binds them to entire memory blocks when necessary.</li>
 * <li>It issues {@code vkCmdCopyBuffer()} to passed command buffer.</li>
 * </ul>
 * 
 * <p>Example:</p>
 * 
 * <pre><code>
 * // Given following variables already initialized:
 * VkDevice device;
 * VmaAllocator allocator;
 * VkCommandBuffer commandBuffer;
 * std::vector&lt;VkBuffer&gt; buffers;
 * std::vector&lt;VmaAllocation&gt; allocations;
 * 
 * 
 * const uint32_t allocCount = (uint32_t)allocations.size();
 * std::vector&lt;VkBool32&gt; allocationsChanged(allocCount);
 * 
 * VkCommandBufferBeginInfo cmdBufBeginInfo = ...;
 * vkBeginCommandBuffer(commandBuffer, &amp;cmdBufBeginInfo);
 * 
 * VmaDefragmentationInfo2 defragInfo = {};
 * defragInfo.allocationCount = allocCount;
 * defragInfo.pAllocations = allocations.data();
 * defragInfo.pAllocationsChanged = allocationsChanged.data();
 * defragInfo.maxGpuBytesToMove = VK_WHOLE_SIZE; // Notice it is "GPU" this time.
 * defragInfo.maxGpuAllocationsToMove = UINT32_MAX; // Notice it is "GPU" this time.
 * defragInfo.commandBuffer = commandBuffer;
 * 
 * VmaDefragmentationContext defragCtx;
 * vmaDefragmentationBegin(allocator, &amp;defragInfo, nullptr, &amp;defragCtx);
 * 
 * vkEndCommandBuffer(commandBuffer);
 * 
 * // Submit commandBuffer.
 * // Wait for a fence that ensures commandBuffer execution finished.
 * 
 * vmaDefragmentationEnd(allocator, defragCtx);
 * 
 * for(uint32_t i = 0; i &lt; allocCount; ++i)
 * {
 *     if(allocationsChanged[i])
 *     {
 *         // Destroy buffer that is immutably bound to memory region which is no longer valid.
 *         vkDestroyBuffer(device, buffers[i], nullptr);
 * 
 *         // Create new buffer with same parameters.
 *         VkBufferCreateInfo bufferInfo = ...;
 *         vkCreateBuffer(device, &amp;bufferInfo, nullptr, &amp;buffers[i]);
 * 
 *         // You can make dummy call to vkGetBufferMemoryRequirements here to silence validation layer warning.
 * 
 *         // Bind new buffer to new memory region. Data contained in it is already moved.
 *         VmaAllocationInfo allocInfo;
 *         vmaGetAllocationInfo(allocator, allocations[i], &amp;allocInfo);
 *         vmaBindBufferMemory(allocator, allocations[i], buffers[i]);
 *     }
 * }</code></pre>
 * 
 * <p>You can combine these two methods by specifying non-zero {@code maxGpu*} as well as {@code maxCpu*} parameters. The library automatically chooses best
 * method to defragment each memory pool.</p>
 * 
 * <p>You may try not to block your entire program to wait until defragmentation finishes, but do it in the background, as long as you carefully fullfill
 * requirements described in function {@link #vmaDefragmentationBegin DefragmentationBegin}.</p>
 * 
 * <h4>Additional notes</h4>
 * 
 * <p>It is only legal to defragment allocations bound to:</p>
 * 
 * <ul>
 * <li>buffers</li>
 * <li>images created with {@code VK_IMAGE_CREATE_ALIAS_BIT}, {@code VK_IMAGE_TILING_LINEAR}, and being currently in {@code VK_IMAGE_LAYOUT_GENERAL} or
 * {@code VK_IMAGE_LAYOUT_PREINITIALIZED}.</li>
 * </ul>
 * 
 * <p>Defragmentation of images created with {@code VK_IMAGE_TILING_OPTIMAL} or in any other layout may give undefined results.</p>
 * 
 * <p>If you defragment allocations bound to images, new images to be bound to new memory region after defragmentation should be created with
 * {@code VK_IMAGE_LAYOUT_PREINITIALIZED} and then transitioned to their original layout from before defragmentation if needed using an image memory
 * barrier.</p>
 * 
 * <p>While using defragmentation, you may experience validation layer warnings, which you just need to ignore.</p>
 * 
 * <p>Please don't expect memory to be fully compacted after defragmentation. Algorithms inside are based on some heuristics that try to maximize number of
 * Vulkan memory blocks to make totally empty to release them, as well as to maximize continuous empty space inside remaining blocks, while minimizing the
 * number and size of allocations that need to be moved. Some fragmentation may still remain - this is normal.</p>
 * 
 * <h4>Writing custom defragmentation algorithm</h4>
 * 
 * <p>If you want to implement your own, custom defragmentation algorithm, there is infrastructure prepared for that, but it is not exposed through the
 * library API - you need to hack its source code.</p>
 * 
 * <p>Here are steps needed to do this:</p>
 * 
 * <ul>
 * <li>Main thing you need to do is to define your own class derived from base abstract class {@code VmaDefragmentationAlgorithm} and implement your
 * version of its pure virtual methods. See definition and comments of this class for details.</li>
 * <li>Your code needs to interact with device memory block metadata. If you need more access to its data than it is provided by its public interface,
 * declare your new class as a friend class e.g. in class {@code VmaBlockMetadata_Generic}.</li>
 * <li>If you want to create a flag that would enable your algorithm or pass some additional flags to configure it, add them to
 * {@code VmaDefragmentationFlagBits} and use them in {@code VmaDefragmentationInfo2::flags}.</li>
 * <li>Modify function {@code VmaBlockVectorDefragmentationContext::Begin} to create object of your new class whenever needed.</li>
 * </ul>
 * 
 * <h3>Statistics</h3>
 * 
 * <p>This library contains functions that return information about its internal state, especially the amount of memory allocated from Vulkan. Please keep in
 * mind that these functions need to traverse all internal data structures to gather these information, so they may be quite time-consuming. Don't call
 * them too often.</p>
 * 
 * <h4>Numeric statistics</h4>
 * 
 * <p>You can query for overall statistics of the allocator using function {@link #vmaCalculateStats CalculateStats}. Information are returned using structure {@link VmaStats}. It
 * contains {@link VmaStatInfo} - number of allocated blocks, number of allocations (occupied ranges in these blocks), number of unused (free) ranges in these
 * blocks, number of bytes used and unused (but still allocated from Vulkan) and other information. They are summed across memory heaps, memory types and
 * total for whole allocator.</p>
 * 
 * <p>You can query for statistics of a custom pool using function {@link #vmaGetPoolStats GetPoolStats}. Information are returned using structure {@link VmaPoolStats}.</p>
 * 
 * <p>You can query for information about specific allocation using function {@link #vmaGetAllocationInfo GetAllocationInfo}. It fill structure {@link VmaAllocationInfo}.</p>
 * 
 * <h3>JSON dump</h3>
 * 
 * <p>You can dump internal state of the allocator to a string in JSON format using function {@link #vmaBuildStatsString BuildStatsString}. The result is guaranteed to be correct
 * JSON. It uses ANSI encoding. Any strings provided by user are copied as-is and properly escaped for JSON, so if they use UTF-8, ISO-8859-2 or any other
 * encoding, this JSON string can be treated as using this encoding. It must be freed using function {@link #vmaFreeStatsString FreeStatsString}.</p>
 * 
 * <p>The format of this JSON string is not part of official documentation of the library, but it will not change in backward-incompatible way without
 * increasing library major version number and appropriate mention in changelog.</p>
 * 
 * <p>The JSON string contains all the data that can be obtained using {@link #vmaCalculateStats CalculateStats}. It can also contain detailed map of allocated memory blocks and
 * their regions - free and occupied by allocations. This allows e.g. to visualize the memory or assess fragmentation.</p>
 * 
 * <h3>Allocation names and user data</h3>
 * 
 * <h4>Allocation user data</h4>
 * 
 * <p>You can annotate allocations with your own information, e.g. for debugging purposes. To do that, fill {@link VmaAllocationCreateInfo}{@code ::pUserData}
 * field when creating an allocation. It is an opaque {@code void*} pointer. You can use it e.g. as a pointer, some handle, index, key, ordinal number or
 * any other value that would associate the allocation with your custom metadata.</p>
 * 
 * <pre><code>
 * VkBufferCreateInfo bufCreateInfo = ...
 * 
 * MyBufferMetadata* pMetadata = CreateBufferMetadata();
 * 
 * VmaAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.usage = VMA_MEMORY_USAGE_AUTO;
 * allocCreateInfo.pUserData = pMetadata;
 * 
 * VkBuffer buffer;
 * VmaAllocation allocation;
 * vmaCreateBuffer(allocator, &amp;bufCreateInfo, &amp;allocCreateInfo, &amp;buffer, &amp;allocation, nullptr);</code></pre>
 * 
 * <p>The pointer may be later retrieved as {@link VmaAllocationInfo}{@code ::pUserData}:</p>
 * 
 * <pre><code>
 * VmaAllocationInfo allocInfo;
 * vmaGetAllocationInfo(allocator, allocation, &amp;allocInfo);
 * MyBufferMetadata* pMetadata = (MyBufferMetadata*)allocInfo.pUserData;</code></pre>
 * 
 * <p>It can also be changed using function {@link #vmaSetAllocationUserData SetAllocationUserData}.</p>
 * 
 * <p>Values of (non-zero) allocations' {@code pUserData} are printed in JSON report created by {@link #vmaBuildStatsString BuildStatsString} in hexadecimal form.</p>
 * 
 * <h4>Allocation names</h4>
 * 
 * <p>There is alternative mode available where {@code pUserData} pointer is used to point to a null-terminated string, giving a name to the allocation. To
 * use this mode, set {@link #VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT} flag in {@link VmaAllocationCreateInfo}{@code ::flags}. Then {@code pUserData} passed as
 * {@link VmaAllocationCreateInfo}{@code ::pUserData} or argument to {@link #vmaSetAllocationUserData SetAllocationUserData} must be either null or a pointer to a null-terminated string. The
 * library creates internal copy of the string, so the pointer you pass doesn't need to be valid for whole lifetime of the allocation. You can free it
 * after the call.</p>
 * 
 * <pre><code>
 * VkImageCreateInfo imageInfo = ...
 * 
 * std::string imageName = "Texture: ";
 * imageName += fileName;
 * 
 * VmaAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.usage = VMA_MEMORY_USAGE_AUTO;
 * allocCreateInfo.flags = VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT;
 * allocCreateInfo.pUserData = imageName.c_str();
 * 
 * VkImage image;
 * VmaAllocation allocation;
 * vmaCreateImage(allocator, &amp;imageInfo, &amp;allocCreateInfo, &amp;image, &amp;allocation, nullptr);</code></pre>
 * 
 * <p>The value of {@code pUserData} pointer of the allocation will be different than the one you passed when setting allocation's name - pointing to a
 * buffer managed internally that holds copy of the string.</p>
 * 
 * <pre><code>
 * VmaAllocationInfo allocInfo;
 * vmaGetAllocationInfo(allocator, allocation, &amp;allocInfo);
 * const char* imageName = (const char*)allocInfo.pUserData;
 * printf("Image name: %s\n", imageName);</code></pre>
 * 
 * <p>That string is also printed in JSON report created by {@link #vmaBuildStatsString BuildStatsString}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Passing string name to VMA allocation doesn't automatically set it to the Vulkan buffer or image created with it. You must do it manually using an
 * extension like {@code VK_EXT_debug_utils}, which is independent of this library.</p>
 * </div>
 * 
 * <h3>Virtual allocator</h3>
 * 
 * <p>As an extra feature, the core allocation algorithm of the library is exposed through a simple and convenient API of "virtual allocator". It doesn't
 * allocate any real GPU memory. It just keeps track of used and free regions of a "virtual block". You can use it to allocate your own memory or other
 * objects, even completely unrelated to Vulkan. A common use case is sub-allocation of pieces of one large GPU buffer.</p>
 * 
 * <h4>Creating virtual block</h4>
 * 
 * <p>To use this functionality, there is no main "allocator" object. You don't need to have {@code VmaAllocator} object created. All you need to do is to
 * create a separate {@code VmaVirtualBlock} object for each block of memory you want to be managed by the allocator:</p>
 * 
 * <ul>
 * <li>Fill in {@link VmaVirtualBlockCreateInfo} structure.</li>
 * <li>Call {@link #vmaCreateVirtualBlock CreateVirtualBlock}. Get new {@code VmaVirtualBlock} object.</li>
 * </ul>
 * 
 * <p>Example:</p>
 * 
 * <pre><code>
 * VmaVirtualBlockCreateInfo blockCreateInfo = {};
 * blockCreateInfo.size = 1048576; // 1 MB
 * 
 * VmaVirtualBlock block;
 * VkResult res = vmaCreateVirtualBlock(&amp;blockCreateInfo, &amp;block);</code></pre>
 * 
 * <h4>Making virtual allocations</h4>
 * 
 * <p>{@code VmaVirtualBlock} object contains internal data structure that keeps track of free and occupied regions using the same code as the main Vulkan
 * memory allocator. Similarly to {@code VmaAllocation} for standard GPU allocations, there is {@code VmaVirtualAllocation} type that represents an opaque
 * handle to an allocation withing the virtual block.</p>
 * 
 * <p>In order to make such allocation:</p>
 * 
 * <ul>
 * <li>Fill in {@link VmaVirtualAllocationCreateInfo} structure.</li>
 * <li>Call {@link #vmaVirtualAllocate VirtualAllocate}. Get new {@code VmaVirtualAllocation} object that represents the allocation. You can also receive
 * {@code VkDeviceSize offset} that was assigned to the allocation.</li>
 * </ul>
 * 
 * <p>Example:</p>
 * 
 * <pre><code>
 * VmaVirtualAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.size = 4096; // 4 KB
 * 
 * VmaVirtualAllocation alloc;
 * VkDeviceSize offset;
 * res = vmaVirtualAllocate(block, &amp;allocCreateInfo, &amp;alloc, &amp;offset);
 * if(res == VK_SUCCESS)
 * {
 *     // Use the 4 KB of your memory starting at offset.
 * }
 * else
 * {
 *     // Allocation failed - no space for it could be found. Handle this error!
 * }</code></pre>
 * 
 * <h4>Deallocation</h4>
 * 
 * <p>When no longer needed, an allocation can be freed by calling {@link #vmaVirtualFree VirtualFree}. You can only pass to this function an allocation that was previously
 * returned by {@code vmaVirtualAllocate()} called for the same {@code VmaVirtualBlock}.</p>
 * 
 * <p>When whole block is no longer needed, the block object can be released by calling {@link #vmaDestroyVirtualBlock DestroyVirtualBlock}. All allocations must be freed before the
 * block is destroyed, which is checked internally by an assert. However, if you don't want to call {@code vmaVirtualFree()} for each allocation, you can
 * use {@link #vmaClearVirtualBlock ClearVirtualBlock} to free them all at once - a feature not available in normal Vulkan memory allocator. Example:</p>
 * 
 * <pre><code>
 * vmaVirtualFree(block, alloc);
 * vmaDestroyVirtualBlock(block);</code></pre>
 * 
 * <h4>Allocation parameters</h4>
 * 
 * <p>You can attach a custom pointer to each allocation by using {@link #vmaSetVirtualAllocationUserData SetVirtualAllocationUserData}. Its default value is null. It can be used to store any
 * data that needs to be associated with that allocation - e.g. an index, a handle, or a pointer to some larger data structure containing more
 * information. Example:</p>
 * 
 * <pre><code>
 * struct CustomAllocData
 * {
 *     std::string m_AllocName;
 * };
 * CustomAllocData* allocData = new CustomAllocData();
 * allocData-&gt;m_AllocName = "My allocation 1";
 * vmaSetVirtualAllocationUserData(block, alloc, allocData);</code></pre>
 * 
 * <p>The pointer can later be fetched, along with allocation offset and size, by passing the allocation handle to function {@link #vmaGetVirtualAllocationInfo GetVirtualAllocationInfo} and
 * inspecting returned structure {@code VmaVirtualAllocationInfo}. If you allocated a new object to be used as the custom pointer, don't forget to delete
 * that object before freeing the allocation! Example:</p>
 * 
 * <pre><code>
 * VmaVirtualAllocationInfo allocInfo;
 * vmaGetVirtualAllocationInfo(block, alloc, &amp;allocInfo);
 * delete (CustomAllocData*)allocInfo.pUserData;
 * 
 * vmaVirtualFree(block, alloc);</code></pre>
 * 
 * <h4>Alignment and units</h4>
 * 
 * <p>It feels natural to express sizes and offsets in bytes. If an offset of an allocation needs to be aligned to a multiply of some number (e.g. 4 bytes),
 * you can fill optional member {@code VmaVirtualAllocationCreateInfo::alignment} to request it. Example:</p>
 * 
 * <pre><code>
 * VmaVirtualAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.size = 4096; // 4 KB
 * allocCreateInfo.alignment = 4; // Returned offset must be a multiply of 4 B
 * 
 * VmaVirtualAllocation alloc;
 * res = vmaVirtualAllocate(block, &amp;allocCreateInfo, &amp;alloc, nullptr);</code></pre>
 * 
 * <p>Alignments of different allocations made from one block may vary. However, if all alignments and sizes are always multiply of some size e.g. 4 B or
 * {@code sizeof(MyDataStruct)}, you can express all sizes, alignments, and offsets in multiples of that size instead of individual bytes. It might be
 * more convenient, but you need to make sure to use this new unit consistently in all the places:</p>
 * 
 * <ul>
 * <li>{@code VmaVirtualBlockCreateInfo::size}</li>
 * <li>{@code VmaVirtualAllocationCreateInfo::size} and {@code VmaVirtualAllocationCreateInfo::alignment}</li>
 * <li>Using offset returned by {@code vmaVirtualAllocate()} or in {@code VmaVirtualAllocationInfo::offset}</li>
 * </ul>
 * 
 * <h4>Statistics</h4>
 * 
 * <p>You can obtain statistics of a virtual block using {@link #vmaCalculateVirtualBlockStats CalculateVirtualBlockStats}. The function fills structure {@code VmaStatInfo} - same as used by
 * the normal Vulkan memory allocator. Example:</p>
 * 
 * <pre><code>
 * VmaStatInfo statInfo;
 * vmaCalculateVirtualBlockStats(block, &amp;statInfo);
 * printf("My virtual block has %llu bytes used by %u virtual allocations\n",
 *     statInfo.usedBytes, statInfo.allocationCount);</code></pre>
 * 
 * <p>You can also request a full list of allocations and free regions as a string in JSON format by calling {@link #vmaBuildVirtualBlockStatsString BuildVirtualBlockStatsString}. Returned string
 * must be later freed using {@link #vmaFreeVirtualBlockStatsString FreeVirtualBlockStatsString}. The format of this string differs from the one returned by the main Vulkan allocator, but it
 * is similar.</p>
 * 
 * <h4>Additional considerations</h4>
 * 
 * <p>The "virtual allocator" functionality is implemented on a level of individual memory blocks. Keeping track of a whole collection of blocks, allocating
 * new ones when out of free space, deleting empty ones, and deciding which one to try first for a new allocation must be implemented by the user.</p>
 * 
 * <p>Alternative allocation algorithms are supported, just like in custom pools of the real GPU memory. See enum {@code VmaVirtualBlockCreateFlagBits} to
 * learn how to specify them (e.g. {@link #VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT}). Allocation strategies are also supported. See enum
 * {@code VmaVirtualAllocationCreateFlagBits} to learn how to specify them (e.g. {@link #VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT}).</p>
 * 
 * <p>Following features are supported only by the allocator of the real GPU memory and not by virtual allocations: buffer-image granularity,
 * {@code VMA_DEBUG_MARGIN}, {@code VMA_MIN_ALIGNMENT}.</p>
 * 
 * <h3>Debugging incorrect memory usage</h3>
 * 
 * <p>If you suspect a bug with memory usage, like usage of uninitialized memory or memory being overwritten out of bounds of an allocation, you can use
 * debug features of this library to verify this.</p>
 * 
 * <h4>Memory initialization</h4>
 * 
 * <p>If you experience a bug with incorrect and nondeterministic data in your program and you suspect uninitialized memory to be used, you can enable
 * automatic memory initialization to verify this. To do it, define macro {@code VMA_DEBUG_INITIALIZE_ALLOCATIONS} to 1.</p>
 * 
 * <p>It makes memory of all new allocations initialized to bit pattern {@code 0xDCDCDCDC}. Before an allocation is destroyed, its memory is filled with bit
 * pattern {@code 0xEFEFEFEF}. Memory is automatically mapped and unmapped if necessary.</p>
 * 
 * <p>If you find these values while debugging your program, good chances are that you incorrectly read Vulkan memory that is allocated but not initialized,
 * or already freed, respectively.</p>
 * 
 * <p>Memory initialization works only with memory types that are {@code HOST_VISIBLE}. It works also with dedicated allocations.</p>
 * 
 * <h4>Margins</h4>
 * 
 * <p>By default, allocations are laid out in memory blocks next to each other if possible (considering required alignment, {@code bufferImageGranularity},
 * and {@code nonCoherentAtomSize}).</p>
 * 
 * <p>Define macro {@code VMA_DEBUG_MARGIN} to some non-zero value (e.g. 16) to enforce specified number of bytes as a margin after every allocation.</p>
 * 
 * <p>If your bug goes away after enabling margins, it means it may be caused by memory being overwritten outside of allocation boundaries. It is not 100%
 * certain though. Change in application behavior may also be caused by different order and distribution of allocations across memory blocks after margins
 * are applied.</p>
 * 
 * <p>The margin is applied also before first and after last allocation in a block. It may occur only once between two adjacent allocations.</p>
 * 
 * <p>Margins work with all types of memory.</p>
 * 
 * <p>Margin is applied only to allocations made out of memory blocks and not to dedicated allocations, which have their own memory block of specific size.
 * It is thus not applied to allocations made using {@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT} flag or those automatically decided to put into dedicated
 * allocations, e.g. due to its large size or recommended by {@code VK_KHR_dedicated_allocation} extension. Margins are also not active in custom pools
 * created with {@link #VMA_POOL_CREATE_BUDDY_ALGORITHM_BIT POOL_CREATE_BUDDY_ALGORITHM_BIT} flag.</p>
 * 
 * <p>Margins appear in JSON dump as part of free space.</p>
 * 
 * <p>Note that enabling margins increases memory usage and fragmentation.</p>
 * 
 * <p>Margins do not apply to virtual allocator.</p>
 * 
 * <h4>Corruption detection</h4>
 * 
 * <p>You can additionally define macro {@code VMA_DEBUG_DETECT_CORRUPTION} to 1 to enable validation of contents of the margins.</p>
 * 
 * <p>When this feature is enabled, number of bytes specified as {@code VMA_DEBUG_MARGIN} (it must be multiple of 4) after every allocation is
 * filled with a magic number. This idea is also know as "canary". Memory is automatically mapped and unmapped if necessary.</p>
 * 
 * <p>This number is validated automatically when the allocation is destroyed. If it is not equal to the expected value, {@code VMA_ASSERT()} is executed. It
 * clearly means that either CPU or GPU overwritten the memory outside of boundaries of the allocation, which indicates a serious bug.</p>
 * 
 * <p>You can also explicitly request checking margins of all allocations in all memory blocks that belong to specified memory types by using function
 * {@link #vmaCheckCorruption CheckCorruption}, or in memory blocks that belong to specified custom pool, by using function {@link #vmaCheckPoolCorruption CheckPoolCorruption}.</p>
 * 
 * <p>Margin validation (corruption detection) works only for memory types that are {@code HOST_VISIBLE} and {@code HOST_COHERENT}.</p>
 * 
 * <h3>OpenGL Interop</h3>
 * 
 * <p>VMA provides some features that help with interoperability with OpenGL.</p>
 * 
 * <h4>Exporting memory</h4>
 * 
 * <p>If you want to attach {@code VkExportMemoryAllocateInfoKHR} structure to {@code pNext} chain of memory allocations made by the library:</p>
 * 
 * <p>It is recommended to create custom memory pools for such allocations. Define and fill in your {@code VkExportMemoryAllocateInfoKHR} structure and
 * attach it to {@link VmaPoolCreateInfo}{@code ::pMemoryAllocateNext} while creating the custom pool. Please note that the structure must remain alive and
 * unchanged for the whole lifetime of the {@code VmaPool}, not only while creating it, as no copy of the structure is made, but its original pointer is
 * used for each allocation instead.</p>
 * 
 * <p>If you want to export all memory allocated by the library from certain memory types, also dedicated allocations or other allocations made from default
 * pools, an alternative solution is to fill in {@link VmaAllocatorCreateInfo}{@code ::pTypeExternalMemoryHandleTypes}. It should point to an array with
 * {@code VkExternalMemoryHandleTypeFlagsKHR} to be automatically passed by the library through {@code VkExportMemoryAllocateInfoKHR} on each allocation
 * made from a specific memory type. Please note that new versions of the library also support dedicated allocations created in custom pools.</p>
 * 
 * <p>You should not mix these two methods in a way that allows to apply both to the same memory type. Otherwise, {@code VkExportMemoryAllocateInfoKHR}
 * structure would be attached twice to the {@code pNext} chain of {@code VkMemoryAllocateInfo}.</p>
 * 
 * <h4>Custom alignment</h4>
 * 
 * <p>Buffers or images exported to a different API like OpenGL may require a different alignment, higher than the one used by the library automatically,
 * queried from functions like {@code vkGetBufferMemoryRequirements}. To impose such alignment:</p>
 * 
 * <p>It is recommended to create custom memory pools for such allocations. Set {@link VmaPoolCreateInfo}{@code ::minAllocationAlignment} member to the minimum
 * alignment required for each allocation to be made out of this pool. The alignment actually used will be the maximum of this member and the alignment
 * returned for the specific buffer or image from a function like {@code vkGetBufferMemoryRequirements}, which is called by VMA automatically.</p>
 * 
 * <p>If you want to create a buffer with a specific minimum alignment out of default pools, use special function {@link #vmaCreateBufferWithAlignment CreateBufferWithAlignment}, which takes
 * additional parameter {@code minAlignment}.</p>
 * 
 * <p>Note the problem of alignment affects only resources placed inside bigger {@code VkDeviceMemory} blocks and not dedicated allocations, as these, by
 * definition, always have {@code alignment = 0} because the resource is bound to the beginning of its dedicated block. Contrary to Direct3D 12, Vulkan
 * doesn't have a concept of alignment of the entire memory block passed on its allocation.</p>
 * 
 * <h3>Recommended usage patterns</h3>
 * 
 * <p>Vulkan gives great flexibility in memory allocation. This chapter shows the most common patterns.</p>
 * 
 * <p>See also slides from talk: <a href="https://www.gdcvault.com/play/1025458/Advanced-Graphics-Techniques-Tutorial-New">Sawicki, Adam. Advanced Graphics
 * Techniques Tutorial: Memory management in Vulkan and DX12. Game Developers Conference, 2018</a></p>
 * 
 * <h4>GPU-only resource</h4>
 * 
 * <p><b>When:</b> Any resources that you frequently write and read on GPU, e.g. images used as color attachments (aka "render targets"), depth-stencil
 * attachments, images/buffers used as storage image/buffer (aka "Unordered Access View (UAV)").</p>
 * 
 * <p><b>What to do:</b> Let the library select the optimal memory type, which will likely have {@code VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT}.</p>
 * 
 * <pre><code>
 * VkImageCreateInfo imgCreateInfo = { VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO };
 * imgCreateInfo.imageType = VK_IMAGE_TYPE_2D;
 * imgCreateInfo.extent.width = 3840;
 * imgCreateInfo.extent.height = 2160;
 * imgCreateInfo.extent.depth = 1;
 * imgCreateInfo.mipLevels = 1;
 * imgCreateInfo.arrayLayers = 1;
 * imgCreateInfo.format = VK_FORMAT_R8G8B8A8_UNORM;
 * imgCreateInfo.tiling = VK_IMAGE_TILING_OPTIMAL;
 * imgCreateInfo.initialLayout = VK_IMAGE_LAYOUT_UNDEFINED;
 * imgCreateInfo.usage = VK_IMAGE_USAGE_SAMPLED_BIT | VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT;
 * imgCreateInfo.samples = VK_SAMPLE_COUNT_1_BIT;
 * 
 * VmaAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.usage = VMA_MEMORY_USAGE_AUTO;
 * allocCreateInfo.flags = VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT;
 * 
 * VkImage img;
 * VmaAllocation alloc;
 * vmaCreateImage(allocator, &amp;imgCreateInfo, &amp;allocCreateInfo, &amp;img, &amp;alloc, nullptr);</code></pre>
 * 
 * <p><b>Also consider:</b> creating them as dedicated allocations using {@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT}, especially if they are large or if you plan
 * to destroy and recreate them with different sizes e.g. when display resolution changes. Prefer to create such resources first and all other GPU
 * resources (like textures and vertex buffers) later.</p>
 * 
 * <h4>Staging copy for upload</h4>
 * 
 * <p><b>When:</b> A "staging" buffer than you want to map and fill from CPU code, then use as a source od transfer to some GPU resource.</p>
 * 
 * <p><b>What to do:</b> Use flag {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT}. Let the library select the optimal memory type, which will always have
 * {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT}.</p>
 * 
 * <pre><code>
 * VkBufferCreateInfo bufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 * bufCreateInfo.size = 65536;
 * bufCreateInfo.usage = VK_BUFFER_USAGE_TRANSFER_SRC_BIT;
 * 
 * VmaAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.usage = VMA_MEMORY_USAGE_AUTO;
 * allocCreateInfo.flags = VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT |
 *     VMA_ALLOCATION_CREATE_MAPPED_BIT;
 * 
 * VkBuffer buf;
 * VmaAllocation alloc;
 * VmaAllocationInfo allocInfo;
 * vmaCreateBuffer(allocator, &amp;bufCreateInfo, &amp;allocCreateInfo, &amp;buf, &amp;alloc, &amp;allocInfo);
 * 
 * ...
 * 
 * memcpy(allocInfo.pMappedData, myData, myDataSize);</code></pre>
 * 
 * <p><b>Also consider:</b> You can map the allocation using {@link #vmaMapMemory MapMemory} or you can create it as persistenly mapped using {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT}, as
 * in the example above.</p>
 * 
 * <h4>Readback</h4>
 * 
 * <p><b>When:</b> Buffers for data written by or transferred from the GPU that you want to read back on the CPU, e.g. results of some computations.</p>
 * 
 * <p><b>What to do:</b> Use flag {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT}. Let the library select the optimal memory type, which will always have
 * {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT} and {@code VK_MEMORY_PROPERTY_HOST_CACHED_BIT}.</p>
 * 
 * <pre><code>
 * VkBufferCreateInfo bufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 * bufCreateInfo.size = 65536;
 * bufCreateInfo.usage = VK_BUFFER_USAGE_TRANSFER_DST_BIT;
 * 
 * VmaAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.usage = VMA_MEMORY_USAGE_AUTO;
 * allocCreateInfo.flags = VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT |
 *     VMA_ALLOCATION_CREATE_MAPPED_BIT;
 * 
 * VkBuffer buf;
 * VmaAllocation alloc;
 * VmaAllocationInfo allocInfo;
 * vmaCreateBuffer(allocator, &amp;bufCreateInfo, &amp;allocCreateInfo, &amp;buf, &amp;alloc, &amp;allocInfo);
 * 
 * ...
 * 
 * const float* downloadedData = (const float*)allocInfo.pMappedData;</code></pre>
 * 
 * <h4>Advanced data uploading</h4>
 * 
 * <p>For resources that you frequently write on CPU via mapped pointer and frequently read on GPU e.g. as a uniform buffer (also called "dynamic"), multiple
 * options are possible:</p>
 * 
 * <ul>
 * <li>Easiest solution is to have one copy of the resource in {@code HOST_VISIBLE} memory, even if it means system RAM (not {@code DEVICE_LOCAL}) on
 * systems with a discrete graphics card, and make the device reach out to that resource directly. Reads performed by the device will then go through
 * PCI Express bus. The performace of this access may be limited, but it may be fine depending on the size of this resource (whether it is small
 * enough to quickly end up in GPU cache) and the sparsity of access.</li>
 * <li>On systems with unified memory (e.g. AMD APU or Intel integrated graphics, mobile chips), a memory type may be available that is both
 * {@code HOST_VISIBLE} (available for mapping) and {@code DEVICE_LOCAL} (fast to access from the GPU). Then, it is likely the best choice for such
 * type of resource.</li>
 * <li>Systems with a discrete graphics card and separate video memory may or may not expose a memory type that is both {@code HOST_VISIBLE} and
 * {@code DEVICE_LOCAL}, also known as Base Address Register (BAR). If they do, it represents a piece of VRAM (or entire VRAM, if ReBAR is enabled in
 * the motherboard BIOS) that is available to CPU for mapping. Writes performed by the host to that memory go through PCI Express bus. The performance
 * of these writes may be limited, but it may be fine, especially on PCIe 4.0, as long as rules of using uncached and write-combined memory are
 * followed - only sequential writes and no reads.</li>
 * <li>Finally, you may need or prefer to create a separate copy of the resource in {@code DEVICE_LOCAL} memory, a separate "staging" copy in
 * {@code HOST_VISIBLE} memory and perform an explicit transfer command between them.</li>
 * </ul>
 * 
 * <p>Thankfully, VMA offers an aid to create and use such resources in the the way optimal for the current Vulkan device. To help the library make the best
 * choice, use flag {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT} together with {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT}. It will
 * then prefer a memory type that is both {@code DEVICE_LOCAL} and {@code HOST_VISIBLE} (integrated memory or BAR), but if no such memory type is
 * available or allocation from it fails (PC graphics cards have only 256 MB of BAR by default, unless ReBAR is supported and enabled in BIOS), it will
 * fall back to {@code DEVICE_LOCAL} memory for fast GPU access. It is then up to you to detect that the allocation ended up in a memory type that is not
 * {@code HOST_VISIBLE}, so you need to create another "staging" allocation and perform explicit transfers.</p>
 * 
 * <pre><code>
 * VkBufferCreateInfo bufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 * bufCreateInfo.size = 65536;
 * bufCreateInfo.usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;
 * 
 * VmaAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.usage = VMA_MEMORY_USAGE_AUTO;
 * allocCreateInfo.flags = VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT |
 *     VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT |
 *     VMA_ALLOCATION_CREATE_MAPPED_BIT;
 * 
 * VkBuffer buf;
 * VmaAllocation alloc;
 * VmaAllocationInfo allocInfo;
 * vmaCreateBuffer(allocator, &amp;bufCreateInfo, &amp;allocCreateInfo, &amp;buf, &amp;alloc, &amp;allocInfo);
 * 
 * VkMemoryPropertyFlags memPropFlags;
 * vmaGetAllocationMemoryProperties(allocator, alloc, &amp;memPropFlags);
 * 
 * if(memPropFlags &amp; VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT)
 * {
 *     // Allocation ended up in a mappable memory and is already mapped - write to it directly.
 * 
 *     // [Executed in runtime]:
 *     memcpy(allocInfo.pMappedData, myData, myDataSize);
 * }
 * else
 * {
 *     // Allocation ended up in a non-mappable memory - need to transfer.
 *     VkBufferCreateInfo stagingBufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 *     stagingBufCreateInfo.size = 65536;
 *     stagingBufCreateInfo.usage = VK_BUFFER_USAGE_TRANSFER_SRC_BIT;
 * 
 *     VmaAllocationCreateInfo stagingAllocCreateInfo = {};
 *     stagingAllocCreateInfo.usage = VMA_MEMORY_USAGE_AUTO;
 *     stagingAllocCreateInfo.flags = VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT |
 *         VMA_ALLOCATION_CREATE_MAPPED_BIT;
 * 
 *     VkBuffer stagingBuf;
 *     VmaAllocation stagingAlloc;
 *     VmaAllocationInfo stagingAllocInfo;
 *     vmaCreateBuffer(allocator, &amp;stagingBufCreateInfo, &amp;stagingAllocCreateInfo,
 *         &amp;stagingBuf, &amp;stagingAlloc, stagingAllocInfo);
 * 
 *     // [Executed in runtime]:
 *     memcpy(stagingAllocInfo.pMappedData, myData, myDataSize);
 *     VkBufferCopy bufCopy = {
 *         0, // srcOffset
 *         0, // dstOffset,
 *         myDataSize); // size
 *     vkCmdCopyBuffer(cmdBuf, stagingBuf, buf, 1, &amp;bufCopy);
 * }</code></pre>
 * 
 * <h4>Other use cases</h4>
 * 
 * <p>Here are some other, less obvious use cases and their recommended settings:</p>
 * 
 * <ul>
 * <li>An image that is used only as transfer source and destination, but it should stay on the device, as it is used to temporarily store a copy of some
 * texture, e.g. from the current to the next frame, for temporal antialiasing or other temporal effects.
 * 
 * <ul>
 * <li>Use {@code VkImageCreateInfo::usage = VK_IMAGE_USAGE_TRANSFER_SRC_BIT | VK_IMAGE_USAGE_TRANSFER_DST_BIT}</li>
 * <li>Use {@code VmaAllocationCreateInfo::usage = VMA_MEMORY_USAGE_AUTO}</li>
 * </ul></li>
 * <li>An image that is used only as transfer source and destination, but it should be placed in the system RAM despite it doesn't need to be mapped,
 * because it serves as a "swap" copy to evict least recently used textures from VRAM.
 * 
 * <ul>
 * <li>Use {@code VkImageCreateInfo::usage = VK_IMAGE_USAGE_TRANSFER_SRC_BIT | VK_IMAGE_USAGE_TRANSFER_DST_BIT}</li>
 * <li>Use {@code VmaAllocationCreateInfo::usage = VMA_MEMORY_USAGE_AUTO_PREFER_HOST}, as VMA needs a hint here to differentiate from the previous
 * case.</li>
 * </ul></li>
 * <li>A buffer that you want to map and write from the CPU, directly read from the GPU (e.g. as a uniform or vertex buffer), but you have a clear
 * preference to place it in device or host memory due to its large size.
 * 
 * <ul>
 * <li>Use {@code VkBufferCreateInfo::usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT}</li>
 * <li>Use {@code VmaAllocationCreateInfo::usage = VMA_MEMORY_USAGE_AUTO_PREFER_DEVICE or VMA_MEMORY_USAGE_AUTO_PREFER_HOST}</li>
 * <li>Use {@code VmaAllocationCreateInfo::flags = VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT}</li>
 * </ul></li>
 * </ul>
 * 
 * <h3>Configuration</h3>
 * 
 * <h4>Custom host memory allocator</h4>
 * 
 * <p>If you use custom allocator for CPU memory rather than default operator {@code new} and {@code delete} from C++, you can make this library using your
 * allocator as well by filling optional member {@link VmaAllocatorCreateInfo}{@code ::pAllocationCallbacks}. These functions will be passed to Vulkan, as well
 * as used by the library itself to make any CPU-side allocations.</p>
 * 
 * <h4>Device memory allocation callbacks</h4>
 * 
 * <p>The library makes calls to {@code vkAllocateMemory()} and {@code vkFreeMemory()} internally. You can setup callbacks to be informed about these calls,
 * e.g. for the purpose of gathering some statistics. To do it, fill optional member {@link VmaAllocatorCreateInfo}{@code ::pDeviceMemoryCallbacks}.</p>
 * 
 * <h4>Device heap memory limit</h4>
 * 
 * <p>When device memory of certain heap runs out of free space, new allocations may fail (returning error code) or they may succeed, silently pushing some
 * existing memory blocks from GPU VRAM to system RAM (which degrades performance). This behavior is implementation-dependent - it depends on GPU vendor
 * and graphics driver.</p>
 * 
 * <p>On AMD cards it can be controlled while creating Vulkan device object by using {@code VK_AMD_memory_overallocation_behavior} extension, if available.</p>
 * 
 * <p>Alternatively, if you want to test how your program behaves with limited amount of Vulkan devicememory available without switching your graphics card
 * to one that really has smaller VRAM, you can use a feature of this library intended for this purpose. To do it, fill optional member
 * {@link VmaAllocatorCreateInfo}{@code ::pHeapSizeLimit}.</p>
 * 
 * <h3>VK_KHR_dedicated_allocation</h3>
 * 
 * <p>{@code VK_KHR_dedicated_allocation} is a Vulkan extension which can be used to improve performance on some GPUs. It augments Vulkan API with
 * possibility to query driver whether it prefers particular buffer or image to have its own, dedicated allocation (separate {@code VkDeviceMemory} block)
 * for better efficiency - to be able to do some internal optimizations. The extension is supported by this library. It will be used automatically when
 * enabled.</p>
 * 
 * <p>It has been promoted to core Vulkan 1.1, so if you use eligible Vulkan version and inform VMA about it by setting
 * {@link VmaAllocatorCreateInfo}{@code ::vulkanApiVersion}, you are all set.</p>
 * 
 * <p>Otherwise, if you want to use it as an extension:</p>
 * 
 * <p>1 . When creating Vulkan device, check if following 2 device extensions are supported (call {@code vkEnumerateDeviceExtensionProperties()}). If yes,
 * enable them (fill {@link VkDeviceCreateInfo}{@code ::ppEnabledExtensionNames}).</p>
 * 
 * <ul>
 * <li>{@code VK_KHR_get_memory_requirements2}</li>
 * <li>{@code VK_KHR_dedicated_allocation}</li>
 * </ul>
 * 
 * <p>If you enabled these extensions:</p>
 * 
 * <p>2 . Use {@link #VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT} flag when creating your {@code VmaAllocator} to inform the library that you enabled required
 * extensions and you want the library to use them.</p>
 * 
 * <pre><code>
 * allocatorInfo.flags |= VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT;
 * 
 * vmaCreateAllocator(&amp;allocatorInfo, &amp;allocator);</code></pre>
 * 
 * <p>That is all. The extension will be automatically used whenever you create a buffer using {@link #vmaCreateBuffer CreateBuffer} or image using {@link #vmaCreateImage CreateImage}.</p>
 * 
 * <p>When using the extension together with Vulkan Validation Layer, you will receive warnings like this:</p>
 * 
 * <pre><code>
 * vkBindBufferMemory(): Binding memory to buffer 0x33 but vkGetBufferMemoryRequirements() has not been called on that buffer.</code></pre>
 * 
 * <p>It is OK, you should just ignore it. It happens because you use function {@code vkGetBufferMemoryRequirements2KHR()} instead of standard
 * {@code vkGetBufferMemoryRequirements()}, while the validation layer seems to be unaware of it.</p>
 * 
 * <p>To learn more about this extension, see:</p>
 * 
 * <ul>
 * <li><a href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/chap50.html#VK_KHR_dedicated_allocation">VK_KHR_dedicated_allocation in Vulkan specification</a></li>
 * <li><a href="http://asawicki.info/articles/VK_KHR_dedicated_allocation.php5">VK_KHR_dedicated_allocation unofficial manual</a></li>
 * </ul>
 * 
 * <h4>VK_AMD_device_coherent_memory</h4>
 * 
 * <p>{@code VK_AMD_device_coherent_memory} is a device extension that enables access to additional memory types with
 * {@code VK_MEMORY_PROPERTY_DEVICE_COHERENT_BIT_AMD} and {@code VK_MEMORY_PROPERTY_DEVICE_UNCACHED_BIT_AMD} flag. It is useful mostly for allocation of
 * buffers intended for writing "breadcrumb markers" in between passes or draw calls, which in turn are useful for debugging GPU crash/hang/TDR cases.</p>
 * 
 * <p>When the extension is available but has not been enabled, Vulkan physical device still exposes those memory types, but their usage is forbidden. VMA
 * automatically takes care of that - it returns {@code VK_ERROR_FEATURE_NOT_PRESENT} when an attempt to allocate memory of such type is made.</p>
 * 
 * <p>If you want to use this extension in connection with VMA, follow these steps:</p>
 * 
 * <h5>Initialization</h5>
 * 
 * <ol>
 * <li>Call {@code vkEnumerateDeviceExtensionProperties} for the physical device. Check if the extension is supported - if returned array of
 * {@code VkExtensionProperties} contains {@code "VK_AMD_device_coherent_memory"}.</li>
 * <li>Call {@code vkGetPhysicalDeviceFeatures2} for the physical device instead of old {@code vkGetPhysicalDeviceFeatures}. Attach additional structure
 * {@code VkPhysicalDeviceCoherentMemoryFeaturesAMD} to {@code VkPhysicalDeviceFeatures2::pNext} to be returned. Check if the device feature is really
 * supported - check if {@code VkPhysicalDeviceCoherentMemoryFeaturesAMD::deviceCoherentMemory} is true.</li>
 * <li>While creating device with {@code vkCreateDevice}, enable this extension - add {@code "VK_AMD_device_coherent_memory"} to the list passed as
 * {@code VkDeviceCreateInfo::ppEnabledExtensionNames}.</li>
 * <li>While creating the device, also don't set {@code VkDeviceCreateInfo::pEnabledFeatures}. Fill in {@code VkPhysicalDeviceFeatures2} structure instead
 * and pass it as {@code VkDeviceCreateInfo::pNext}. Enable this device feature - attach additional structure
 * {@code VkPhysicalDeviceCoherentMemoryFeaturesAMD} to {@code VkPhysicalDeviceFeatures2::pNext} and set its member {@code deviceCoherentMemory} to
 * {@code VK_TRUE}.</li>
 * <li>While creating {@code VmaAllocator} with {@link #vmaCreateAllocator CreateAllocator} inform VMA that you have enabled this extension and feature - add
 * {@link #VMA_ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT} to {@link VmaAllocatorCreateInfo}{@code ::flags}.</li>
 * </ol>
 * 
 * <h5>Usage</h5>
 * 
 * <p>After following steps described above, you can create VMA allocations and custom pools out of the special {@code DEVICE_COHERENT} and
 * {@code DEVICE_UNCACHED} memory types on eligible devices. There are multiple ways to do it, for example:</p>
 * 
 * <ul>
 * <li>You can request or prefer to allocate out of such memory types by adding {@code VK_MEMORY_PROPERTY_DEVICE_UNCACHED_BIT_AMD} to
 * {@link VmaAllocationCreateInfo}{@code ::requiredFlags} or {@code VmaAllocationCreateInfo::preferredFlags}. Those flags can be freely mixed with other
 * ways of choosing memory type, like setting {@code VmaAllocationCreateInfo::usage}.</li>
 * <li>If you manually found memory type index to use for this purpose, force allocation from this specific index by setting
 * {@code VmaAllocationCreateInfo::memoryTypeBits = 1u << index}.</li>
 * </ul>
 * 
 * <h5>More information</h5>
 * 
 * <p>To learn more about this extension, see
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/man/html/VK_AMD_device_coherent_memory.html">VK_AMD_device_coherent_memory in Vulkan specification</a>.</p>
 * 
 * <p>Example use of this extension can be found in the code of the sample and test suite accompanying this library.</p>
 * 
 * <h4>Enabling buffer device address</h4>
 * 
 * <p>Device extension {@code VK_KHR_buffer_device_address} allows to fetch raw GPU pointer to a buffer and pass it for usage in a shader code. It has been
 * promoted to core Vulkan 1.2.</p>
 * 
 * <p>If you want to use this feature in connection with VMA, follow these steps:</p>
 * 
 * <h5>Initialization</h5>
 * 
 * <ol>
 * <li>(For Vulkan version &lt; 1.2) Call {@code vkEnumerateDeviceExtensionProperties} for the physical device. Check if the extension is supported - if
 * returned array of {@code VkExtensionProperties} contains {@code "VK_KHR_buffer_device_address"}.</li>
 * <li>Call {@code vkGetPhysicalDeviceFeatures2} for the physical device instead of old {@code vkGetPhysicalDeviceFeatures}. Attach additional structure
 * {@code VkPhysicalDeviceBufferDeviceAddressFeatures*} to {@code VkPhysicalDeviceFeatures2::pNext} to be returned. Check if the device feature is
 * really supported - check if {@code VkPhysicalDeviceBufferDeviceAddressFeatures::bufferDeviceAddress} is true.</li>
 * <li>(For Vulkan version &lt; 1.2) While creating device with {@code vkCreateDevice}, enable this extension - add {@code "VK_KHR_buffer_device_address"}
 * to the list passed as {@code VkDeviceCreateInfo::ppEnabledExtensionNames}.</li>
 * <li>While creating the device, also don't set {@code VkDeviceCreateInfo::pEnabledFeatures}. Fill in {@code VkPhysicalDeviceFeatures2} structure instead
 * and pass it as {@code VkDeviceCreateInfo::pNext}. Enable this device feature - attach additional structure
 * {@code VkPhysicalDeviceBufferDeviceAddressFeatures*} to {@code VkPhysicalDeviceFeatures2::pNext} and set its member {@code bufferDeviceAddress} to
 * {@code VK_TRUE}.</li>
 * <li>While creating {@code VmaAllocator} with {@link #vmaCreateAllocator CreateAllocator} inform VMA that you have enabled this feature - add
 * {@link #VMA_ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT} to {@link VmaAllocatorCreateInfo}{@code ::flags}.</li>
 * </ol>
 * 
 * <h5>Usage</h5>
 * 
 * <p>After following steps described above, you can create buffers with {@code VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT*} using VMA. The library
 * automatically adds {@code VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT*} to allocated memory blocks wherever it might be needed.</p>
 * 
 * <p>Please note that the library supports only {@code VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT*}. The second part of this functionality related to
 * "capture and replay" is not supported, as it is intended for usage in debugging tools like RenderDoc, not in everyday Vulkan usage.</p>
 * 
 * <h5>More information</h5>
 * 
 * <p>To learn more about this extension, see
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/chap46.html#VK_KHR_buffer_device_address">VK_KHR_buffer_device_address in Vulkan specification</a></p>
 * 
 * <p>Example use of this extension can be found in the code of the sample and test suite accompanying this library.</p>
 * 
 * <h3>General considerations</h3>
 * 
 * <h4>Thread safety</h4>
 * 
 * <ul>
 * <li>The library has no global state, so separate {@code VmaAllocator} objects can be used independently. There should be no need to create multiple
 * such objects though - one per {@code VkDevice} is enough.</li>
 * <li>By default, all calls to functions that take {@code VmaAllocator} as first parameter are safe to call from multiple threads simultaneously because
 * they are synchronized internally when needed. This includes allocation and deallocation from default memory pool, as well as custom
 * {@code VmaPool}.</li>
 * <li>When the allocator is created with {@link #VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT} flag, calls to functions that take such {@code VmaAllocator}
 * object must be synchronized externally.</li>
 * <li>Access to a {@code VmaAllocation} object must be externally synchronized. For example, you must not call {@link #vmaGetAllocationInfo GetAllocationInfo} and {@link #vmaMapMemory MapMemory} from
 * different threads at the same time if you pass the same {@code VmaAllocation} object to these functions.</li>
 * <li>{@code VmaVirtualBlock} is not safe to be used from multiple threads simultaneously.</li>
 * </ul>
 * 
 * <h4>Validation layer warnings</h4>
 * 
 * <p>When using this library, you can meet following types of warnings issued by Vulkan validation layer. They don't necessarily indicate a bug, so you may
 * need to just ignore them.</p>
 * 
 * <ul>
 * <li><i>{@code vkBindBufferMemory()}: Binding memory to buffer {@code 0xeb8e4} but {@code vkGetBufferMemoryRequirements()} has not been called on that
 * buffer.</i>
 * 
 * <p>It happens when {@code VK_KHR_dedicated_allocation} extension is enabled. {@code vkGetBufferMemoryRequirements2KHR} function is used instead, while
 * validation layer seems to be unaware of it.</p></li>
 * <li><i>Mapping an image with layout {@code VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} can result in undefined behavior if this memory is used by
 * the device. Only {@code GENERAL} or {@code PREINITIALIZED} should be used.</i>
 * 
 * <p>It happens when you map a buffer or image, because the library maps entire {@code VkDeviceMemory} block, where different types of images and
 * buffers may end up together, especially on GPUs with unified memory like Intel.</p></li>
 * <li><i>Non-linear image {@code 0xebc91} is aliased with linear buffer {@code 0xeb8e4} which may indicate a bug.</i>
 * 
 * <p>It may happen when you use defragmentation.</p></li>
 * </ul>
 * 
 * <h4>Allocation algorithm</h4>
 * 
 * <p>The library uses following algorithm for allocation, in order:</p>
 * 
 * <ol>
 * <li>Try to find free range of memory in existing blocks.</li>
 * <li>If failed, try to create a new block of {@code VkDeviceMemor}y, with preferred block size.</li>
 * <li>If failed, try to create such block with {@code size / 2}, {@code size / 4}, {@code size / 8}.</li>
 * <li>If failed, try to allocate separate {@code VkDeviceMemory} for this allocation, just like when you use {@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT}.</li>
 * <li>If failed, choose other memory type that meets the requirements specified in {@link VmaAllocationCreateInfo} and go to point 1.</li>
 * <li>If failed, return {@code VK_ERROR_OUT_OF_DEVICE_MEMORY}.</li>
 * </ol>
 * 
 * <h4>Features not supported</h4>
 * 
 * <p>Features deliberately excluded from the scope of this library:</p>
 * 
 * <ul>
 * <li><b>Data transfer</b>. Uploading (streaming) and downloading data of buffers and images between CPU and GPU memory and related synchronization is
 * responsibility of the user.
 * 
 * <p>Defining some "texture" object that would automatically stream its data from a staging copy in CPU memory to GPU memory would rather be a feature
 * of another, higher-level library implemented on top of VMA. VMA doesn't record any commands to a {@code VkCommandBuffer}. It just allocates memory.</p></li>
 * <li><b>Recreation of buffers and images</b>. Although the library has functions for buffer and image creation: {@link #vmaCreateBuffer CreateBuffer}, {@link #vmaCreateImage CreateImage}, you
 * need to recreate these objects yourself after defragmentation. That is because the big structures {@code VkBufferCreateInfo},
 * {@code VkImageCreateInfo} are not stored in {@code VmaAllocation} object.</li>
 * <li><b>Handling CPU memory allocation failures</b>. When dynamically creating small C++ objects in CPU memory (not Vulkan memory), allocation failures
 * are not checked and handled gracefully, because that would complicate code significantly and is usually not needed in desktop PC applications
 * anyway. Success of an allocation is just checked with an assert.</li>
 * <li><b>Code free of any compiler warnings</b>. Maintaining the library to compile and work correctly on so many different platforms is hard enough. Being free
 * of any warnings, on any version of any compiler, is simply not feasible.
 * 
 * <p>There are many preprocessor macros that make some variables unused, function parameters unreferenced, or conditional expressions constant in some
 * configurations. The code of this library should not be bigger or more complicated just to silence these warnings. It is recommended to disable such
 * warnings instead.</p></li>
 * <li>This is a C++ library with C interface. <b>Bindings or ports to any other programming languages</b> are welcome as external projects but are not
 * going to be included into this repository.</li>
 * </ul>
 */
public class Vma {

    static { LibVma.initialize(); }

    /**
     * Flags for created {@code VmaAllocator}. ({@code VmaAllocatorCreateFlagBits})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT} - 
     * Allocator and all objects created from it will not be synchronized internally, so you must guarantee they are used from only one thread at a time
     * or synchronized externally by you.
     * 
     * <p>Using this flag may increase performance because internal mutexes are not used.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT} - 
     * Enables usage of {@code VK_KHR_dedicated_allocation} extension.
     * 
     * <p>The flag works only if {@link VmaAllocatorCreateInfo}{@code ::vulkanApiVersion == VK_API_VERSION_1_0}. When it is {@code VK_API_VERSION_1_1}, the flag is
     * ignored because the extension has been promoted to Vulkan 1.1.</p>
     * 
     * <p>Using this extension will automatically allocate dedicated blocks of memory for some buffers and images instead of suballocating place for them out
     * of bigger memory blocks (as if you explicitly used {@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT} flag) when it is recommended by the driver. It may
     * improve performance on some GPUs.</p>
     * 
     * <p>You may set this flag only if you found out that following device extensions are supported, you enabled them while creating Vulkan device passed as
     * {@link VmaAllocatorCreateInfo}{@code ::device}, and you want them to be used internally by this library:</p>
     * 
     * <ul>
     * <li>{@code VK_KHR_get_memory_requirements2} (device extension)</li>
     * <li>{@code VK_KHR_dedicated_allocation} (device extension)</li>
     * </ul>
     * 
     * <p>When this flag is set, you can experience following warnings reported by Vulkan validation layer. You can ignore them.</p>
     * 
     * <pre><code>
     * &gt; vkBindBufferMemory(): Binding memory to buffer 0x2d but vkGetBufferMemoryRequirements() has not been called on that buffer.</code></pre>
     * </li>
     * <li>{@link #VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT} - 
     * Enables usage of {@code VK_KHR_bind_memory2} extension.
     * 
     * <p>The flag works only if {@link VmaAllocatorCreateInfo}{@code ::vulkanApiVersion == VK_API_VERSION_1_0}. When it is {@code VK_API_VERSION_1_1}, the flag is
     * ignored because the extension has been promoted to Vulkan 1.1.</p>
     * 
     * <p>You may set this flag only if you found out that this device extension is supported, you enabled it while creating Vulkan device passed as
     * {@link VmaAllocatorCreateInfo}{@code ::device}, and you want it to be used internally by this library.</p>
     * 
     * <p>The extension provides functions {@code vkBindBufferMemory2KHR} and {@code vkBindImageMemory2KHR}, which allow to pass a chain of {@code pNext}
     * structures while binding. This flag is required if you use {@code pNext} parameter in {@link #vmaBindBufferMemory2 BindBufferMemory2} or {@link #vmaBindImageMemory2 BindImageMemory2}.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT} - 
     * Enables usage of {@code VK_EXT_memory_budget} extension.
     * 
     * <p>You may set this flag only if you found out that this device extension is supported, you enabled it while creating Vulkan device passed as
     * {@link VmaAllocatorCreateInfo}{@code ::device}, and you want it to be used internally by this library, along with another instance extension
     * {@code VK_KHR_get_physical_device_properties2}, which is required by it (or Vulkan 1.1, where this extension is promoted).</p>
     * 
     * <p>The extension provides query for current memory usage and budget, which will probably be more accurate than an estimation used by the library
     * otherwise.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT} - 
     * Enables usage of {@code VK_AMD_device_coherent_memory} extension.
     * 
     * <p>You may set this flag only if you:</p>
     * 
     * <ul>
     * <li>found out that this device extension is supported and enabled it while creating Vulkan device passed as VmaAllocatorCreateInfo::device,</li>
     * <li>checked that `VkPhysicalDeviceCoherentMemoryFeaturesAMD::deviceCoherentMemory` is true and set it while creating the Vulkan device,</li>
     * <li>want it to be used internally by this library.</li>
     * </ul>
     * 
     * <p>The extension and accompanying device feature provide access to memory types with `VK_MEMORY_PROPERTY_DEVICE_COHERENT_BIT_AMD` and `VK_MEMORY_PROPERTY_DEVICE_UNCACHED_BIT_AMD` flags. They are useful mostly for writing breadcrumb markers - a common method for debugging GPU crash/hang/TDR.</p>
     * 
     * <p>When the extension is not enabled, such memory types are still enumerated, but their usage is illegal. To protect from this error, if you don't create the allocator with this flag, it will refuse to allocate any memory or create a custom pool in such memory type, returning `VK_ERROR_FEATURE_NOT_PRESENT`.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT} - 
     * Enables usage of "buffer device address" feature, which allows you to use function {@code vkGetBufferDeviceAddress*} to get raw GPU pointer to a
     * buffer and pass it for usage inside a shader.
     * 
     * <p>You may set this flag only if you:</p>
     * 
     * <ol>
     * <li>(For Vulkan version &lt; 1.2) Found as available and enabled device extension {@code VK_KHR_buffer_device_address}. This extension is promoted
     * to core Vulkan 1.2.</li>
     * <li>Found as available and enabled device feature {@code VkPhysicalDeviceBufferDeviceAddressFeatures::bufferDeviceAddress}.</li>
     * </ol>
     * 
     * <p>When this flag is set, you can create buffers with {@code VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT} using VMA. The library automatically adds
     * {@code VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT} to allocated memory blocks wherever it might be needed.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT} - 
     * Enables usage of {@code VK_EXT_memory_priority} extension in the library.
     * 
     * <p>You may set this flag only if you found available and enabled this device extension, along with
     * {@code VkPhysicalDeviceMemoryPriorityFeaturesEXT::memoryPriority == VK_TRUE}, while creating Vulkan device passed as
     * {@code VmaAllocatorCreateInfo::device}.</p>
     * 
     * <p>When this flag is used, {@code VmaAllocationCreateInfo::priority} and {@code VmaPoolCreateInfo::priority} are used to set priorities of allocated
     * Vulkan memory. Without it, these variables are ignored.</p>
     * 
     * <p>A priority must be a floating-point value between 0 and 1, indicating the priority of the allocation relative to other memory allocations. Larger
     * values are higher priority. The granularity of the priorities is implementation-dependent. It is automatically passed to every call to
     * {@code vkAllocateMemory} done by the library using structure {@code VkMemoryPriorityAllocateInfoEXT}. The value to be used for default priority is
     * 0.5. For more details, see the documentation of the {@code VK_EXT_memory_priority} extension.</p>
     * </li>
     * </ul>
     */
    public static final int
        VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT    = 0x1,
        VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT   = 0x2,
        VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT           = 0x4,
        VMA_ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT          = 0x8,
        VMA_ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT = 0x10,
        VMA_ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT      = 0x20,
        VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT        = 0x40;

    /**
     * {@code VmaMemoryUsage}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VMA_MEMORY_USAGE_UNKNOWN MEMORY_USAGE_UNKNOWN} - 
     * No intended memory usage specified.
     * 
     * <p>Use other members of {@link VmaAllocationCreateInfo} to specify your requirements.</p>
     * </li>
     * <li>{@link #VMA_MEMORY_USAGE_GPU_ONLY MEMORY_USAGE_GPU_ONLY} - 
     * Obsolete, preserved for backward compatibility.
     * 
     * <p>Prefers {@code VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT}.</p>
     * </li>
     * <li>{@link #VMA_MEMORY_USAGE_CPU_ONLY MEMORY_USAGE_CPU_ONLY} - 
     * Obsolete, preserved for backward compatibility.
     * 
     * <p>Guarantees {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT} and {@code VK_MEMORY_PROPERTY_HOST_COHERENT_BIT}.</p>
     * </li>
     * <li>{@link #VMA_MEMORY_USAGE_CPU_TO_GPU MEMORY_USAGE_CPU_TO_GPU} - 
     * Obsolete, preserved for backward compatibility.
     * 
     * <p>Guarantees {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT}, prefers {@code VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT}.</p>
     * </li>
     * <li>{@link #VMA_MEMORY_USAGE_GPU_TO_CPU MEMORY_USAGE_GPU_TO_CPU} - 
     * Obsolete, preserved for backward compatibility.
     * 
     * <p>Guarantees {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT}, prefers {@code VK_MEMORY_PROPERTY_HOST_CACHED_BIT}.</p>
     * </li>
     * <li>{@link #VMA_MEMORY_USAGE_CPU_COPY MEMORY_USAGE_CPU_COPY} - 
     * Obsolete, preserved for backward compatibility.
     * 
     * <p>Prefers not {@code VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT}.</p>
     * </li>
     * <li>{@link #VMA_MEMORY_USAGE_GPU_LAZILY_ALLOCATED MEMORY_USAGE_GPU_LAZILY_ALLOCATED} - 
     * Lazily allocated GPU memory having {@code VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT}.
     * 
     * <p>Exists mostly on mobile platforms. Using it on desktop PC or other GPUs with no such memory type present will fail the allocation.</p>
     * 
     * <p>Usage: Memory for transient attachment images (color attachments, depth attachments etc.), created with
     * {@code VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}.</p>
     * 
     * <p>Allocations with this usage are always created as dedicated - it implies {@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT}.</p>
     * </li>
     * <li>{@link #VMA_MEMORY_USAGE_AUTO MEMORY_USAGE_AUTO} - 
     * Selects best memory type automatically. This flag is recommended for most common use cases.
     * 
     * <p>When using this flag, if you want to map the allocation (using {@link #vmaMapMemory MapMemory} or {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT}), you must pass one of the flags:
     * {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT} or {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT} in {@link VmaAllocationCreateInfo}{@code ::flags}.</p>
     * 
     * <p>It can be used only with functions that let the library know {@code VkBufferCreateInfo} or {@code VkImageCreateInfo}, e.g. {@link #vmaCreateBuffer CreateBuffer},
     * {@link #vmaCreateImage CreateImage}, {@link #vmaFindMemoryTypeIndexForBufferInfo FindMemoryTypeIndexForBufferInfo}, {@link #vmaFindMemoryTypeIndexForImageInfo FindMemoryTypeIndexForImageInfo} and not with generic memory allocation functions.</p>
     * </li>
     * <li>{@link #VMA_MEMORY_USAGE_AUTO_PREFER_DEVICE MEMORY_USAGE_AUTO_PREFER_DEVICE} - 
     * Selects best memory type automatically with preference for GPU (device) memory.
     * 
     * <p>When using this flag, if you want to map the allocation (using {@link #vmaMapMemory MapMemory} or {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT}), you must pass one of the flags:
     * {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT} or {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT} in {@link VmaAllocationCreateInfo}{@code ::flags}.</p>
     * 
     * <p>It can be used only with functions that let the library know {@code VkBufferCreateInfo} or {@code VkImageCreateInfo}, e.g. {@link #vmaCreateBuffer CreateBuffer},
     * {@link #vmaCreateImage CreateImage}, {@link #vmaFindMemoryTypeIndexForBufferInfo FindMemoryTypeIndexForBufferInfo}, {@link #vmaFindMemoryTypeIndexForImageInfo FindMemoryTypeIndexForImageInfo} and not with generic memory allocation functions.</p>
     * </li>
     * <li>{@link #VMA_MEMORY_USAGE_AUTO_PREFER_HOST MEMORY_USAGE_AUTO_PREFER_HOST} - 
     * Selects best memory type automatically with preference for CPU (host) memory.
     * 
     * <p>When using this flag, if you want to map the allocation (using {@link #vmaMapMemory MapMemory} or {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT}), you must pass one of the flags:
     * {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT} or {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT} in {@link VmaAllocationCreateInfo}{@code ::flags}.</p>
     * 
     * <p>It can be used only with functions that let the library know {@code VkBufferCreateInfo} or {@code VkImageCreateInfo}, e.g. {@link #vmaCreateBuffer CreateBuffer},
     * {@link #vmaCreateImage CreateImage}, {@link #vmaFindMemoryTypeIndexForBufferInfo FindMemoryTypeIndexForBufferInfo}, {@link #vmaFindMemoryTypeIndexForImageInfo FindMemoryTypeIndexForImageInfo} and not with generic memory allocation functions.</p>
     * </li>
     * </ul>
     */
    public static final int
        VMA_MEMORY_USAGE_UNKNOWN              = 0,
        VMA_MEMORY_USAGE_GPU_ONLY             = 1,
        VMA_MEMORY_USAGE_CPU_ONLY             = 2,
        VMA_MEMORY_USAGE_CPU_TO_GPU           = 3,
        VMA_MEMORY_USAGE_GPU_TO_CPU           = 4,
        VMA_MEMORY_USAGE_CPU_COPY             = 5,
        VMA_MEMORY_USAGE_GPU_LAZILY_ALLOCATED = 6,
        VMA_MEMORY_USAGE_AUTO                 = 7,
        VMA_MEMORY_USAGE_AUTO_PREFER_DEVICE   = 8,
        VMA_MEMORY_USAGE_AUTO_PREFER_HOST     = 9;

    /**
     * Flags to be passed as {@link VmaAllocationCreateInfo}{@code ::flags}. ({@code VmaAllocationCreateFlagBits})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT} - 
     * Set this flag if the allocation should have its own memory block.
     * 
     * <p>Use it for special, big resources, like fullscreen images used as attachments.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT ALLOCATION_CREATE_NEVER_ALLOCATE_BIT} - 
     * Set this flag to only try to allocate from existing {@code VkDeviceMemory} blocks and never create new such block.
     * 
     * <p>If new allocation cannot be placed in any of the existing blocks, allocation fails with {@code VK_ERROR_OUT_OF_DEVICE_MEMORY} error.</p>
     * 
     * <p>You should not use {@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT} and {@link #VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT ALLOCATION_CREATE_NEVER_ALLOCATE_BIT} at the same time. It makes no sense.</p>
     * 
     * <p>If {@link VmaAllocationCreateInfo}{@code ::pool} is not null, this flag is implied and ignored.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT} - 
     * Set this flag to use a memory that will be persistently mapped and retrieve pointer to it.
     * 
     * <p>Pointer to mapped memory will be returned through {@link VmaAllocationInfo}{@code ::pMappedData}.</p>
     * 
     * <p>It is valid to use this flag for allocation made from memory type that is not {@code HOST_VISIBLE}. This flag is then ignored and memory is not
     * mapped. This is useful if you need an allocation that is efficient to use on GPU ({@code DEVICE_LOCAL}) and still want to map it directly if
     * possible on platforms that support it (e.g. Intel GPU).</p>
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_RESERVED_1_BIT ALLOCATION_CREATE_RESERVED_1_BIT} - Removed. Do not use.</li>
     * <li>{@link #VMA_ALLOCATION_CREATE_RESERVED_2_BIT ALLOCATION_CREATE_RESERVED_2_BIT} - Removed. Do not use.</li>
     * <li>{@link #VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT} - 
     * Set this flag to treat {@link VmaAllocationCreateInfo}{@code ::pUserData} as pointer to a null-terminated string.
     * 
     * <p>Instead of copying pointer value, a local copy of the string is made and stored in allocation's {@code pUserData}. The string is automatically
     * freed together with the allocation. It is also used in {@link #vmaBuildStatsString BuildStatsString}.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT ALLOCATION_CREATE_UPPER_ADDRESS_BIT} - 
     * Allocation will be created from upper stack in a double stack pool.
     * 
     * <p>This flag is only allowed for custom pools created with {@link #VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT POOL_CREATE_LINEAR_ALGORITHM_BIT} flag.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_DONT_BIND_BIT ALLOCATION_CREATE_DONT_BIND_BIT} - 
     * Create both buffer/image and allocation, but don't bind them together.
     * 
     * <p>It is useful when you want to bind yourself to do some more advanced binding, e.g. using some extensions. The flag is meaningful only with
     * functions that bind by default: {@link #vmaCreateBuffer CreateBuffer}, {@link #vmaCreateImage CreateImage}. Otherwise it is ignored.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT ALLOCATION_CREATE_WITHIN_BUDGET_BIT} - 
     * Create allocation only if additional device memory required for it, if any, won't exceed memory budget.
     * 
     * <p>Otherwise return {@code VK_ERROR_OUT_OF_DEVICE_MEMORY}.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT ALLOCATION_CREATE_CAN_ALIAS_BIT} - 
     * Set this flag if the allocated memory will have aliasing resources.
     * 
     * <p>Usage of this flag prevents supplying {@code VkMemoryDedicatedAllocateInfoKHR} when {@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT} is specified.
     * Otherwise created dedicated memory will not be suitable for aliasing resources, resulting in Vulkan Validation Layer errors.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT} - 
     * Requests possibility to map the allocation (using {@link #vmaMapMemory MapMemory} or {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT}).
     * 
     * <ul>
     * <li>If you use {@link #VMA_MEMORY_USAGE_AUTO MEMORY_USAGE_AUTO} or other {@code VMA_MEMORY_USAGE_AUTO*} value, you must use this flag to be able to map the allocation.
     * Otherwise, mapping is incorrect.</li>
     * <li>If you use other value of {@code VmaMemoryUsage}, this flag is ignored and mapping is always possible in memory types that are
     * {@code HOST_VISIBLE}. This includes allocations created in custom memory pools.</li>
     * </ul>
     * 
     * <p>Declares that mapped memory will only be written sequentially, e.g. using {@code memcpy()} or a loop writing number-by-number, never read or
     * accessed randomly, so a memory type can be selected that is uncached and write-combined.</p>
     * 
     * <p>Warning: Violating this declaration may work correctly, but will likely be very slow. Watch out for implicit reads introduces by doing e.g.
     * {@code pMappedData[i] += x;}. Better prepare your data in a local variable and {@code memcpy()} it to the mapped pointer all at once.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT} - 
     * Requests possibility to map the allocation (using MapMemory() or {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT}).
     * 
     * <ul>
     * <li>If you use {@link #VMA_MEMORY_USAGE_AUTO MEMORY_USAGE_AUTO} or other {@code VMA_MEMORY_USAGE_AUTO*} value, you must use this flag to be able to map the allocation.
     * Otherwise, mapping is incorrect.</li>
     * <li>If you use other value of {@code VmaMemoryUsage}, this flag is ignored and mapping is always possible in memory types that are
     * {@code HOST_VISIBLE}. This includes allocations created in custom memory pools.</li>
     * </ul>
     * 
     * <p>Declares that mapped memory can be read, written, and accessed in random order, so a {@code HOST_CACHED} memory type is preferred.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT} - 
     * Together with {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT} or {@link #VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT}, it says that despite request for
     * host access, a not-{@code HOST_VISIBLE} memory type can be selected if it may improve performance.
     * 
     * <p>By using this flag, you declare that you will check if the allocation ended up in a {@code HOST_VISIBLE} memory type (e.g. using
     * {@link #vmaGetAllocationMemoryProperties GetAllocationMemoryProperties}) and if not, you will create some "staging" buffer and issue an explicit transfer to write/read your data. To
     * prepare for this possibility, don't forget to add appropriate flags like {@code VK_BUFFER_USAGE_TRANSFER_DST_BIT},
     * {@code VK_BUFFER_USAGE_TRANSFER_SRC_BIT} to the parameters of created buffer or image.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT} - 
     * Allocation strategy that chooses smallest possible free range for the allocation to minimize memory usage and fragmentation, possibly at the
     * expense of allocation time.
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT} - 
     * Allocation strategy that chooses first suitable free range for the allocation - not necessarily in terms of the smallest offset but the one that is
     * easiest and fastest to find to minimize allocation time, possibly at the expense of allocation quality.
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT} - Alias to {@link #VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT}.</li>
     * <li>{@link #VMA_VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT} - Alias to {@link #VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT}.</li>
     * <li>{@link #VMA_ALLOCATION_CREATE_STRATEGY_MASK ALLOCATION_CREATE_STRATEGY_MASK} - A bit mask to extract only {@code STRATEGY} bits from entire set of flags.</li>
     * </ul>
     */
    public static final int
        VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT                   = 0x00000001,
        VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT                     = 0x00000002,
        VMA_ALLOCATION_CREATE_MAPPED_BIT                             = 0x00000004,
        VMA_ALLOCATION_CREATE_RESERVED_1_BIT                         = 0x00000008,
        VMA_ALLOCATION_CREATE_RESERVED_2_BIT                         = 0x00000010,
        VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT              = 0x00000020,
        VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT                      = 0x00000040,
        VMA_ALLOCATION_CREATE_DONT_BIND_BIT                          = 0x00000080,
        VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT                      = 0x00000100,
        VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT                          = 0x00000200,
        VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT       = 0x00000400,
        VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT                 = 0x00000800,
        VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT = 0x00001000,
        VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT                = 0x00010000,
        VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT                  = 0x00020000,
        VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT                  = VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT,
        VMA_VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT             = VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT,
        VMA_ALLOCATION_CREATE_STRATEGY_MASK                          = VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT | VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT;

    /**
     * Flags to be passed as {@link VmaPoolCreateInfo}{@code ::flags}. ({@code VmaPoolCreateFlagBits})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VMA_POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT} - 
     * Use this flag if you always allocate only buffers and linear images or only optimal images out of this pool and so Buffer-Image Granularity can be
     * ignored.
     * 
     * <p>This is an optional optimization flag.</p>
     * 
     * <p>If you always allocate using {@link #vmaCreateBuffer CreateBuffer}, {@link #vmaCreateImage CreateImage}, {@link #vmaAllocateMemoryForBuffer AllocateMemoryForBuffer}, then you don't need to use it because allocator knows
     * exact type of your allocations so it can handle Buffer-Image Granularity in the optimal way.</p>
     * 
     * <p>If you also allocate using {@link #vmaAllocateMemoryForImage AllocateMemoryForImage} or {@link #vmaAllocateMemory AllocateMemory}, exact type of such allocations is not known, so allocator must be
     * conservative in handling Buffer-Image Granularity, which can lead to suboptimal allocation (wasted memory). In that case, if you can make sure you
     * always allocate only buffers and linear images or only optimal images out of this pool, use this flag to make allocator disregard Buffer-Image
     * Granularity and so make allocations faster and more optimal.</p>
     * </li>
     * <li>{@link #VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT POOL_CREATE_LINEAR_ALGORITHM_BIT} - 
     * Enables alternative, linear allocation algorithm in this pool.
     * 
     * <p>Specify this flag to enable linear allocation algorithm, which always creates new allocations after last one and doesn't reuse space from
     * allocations freed in between. It trades memory consumption for simplified algorithm and data structure, which has better performance and uses less
     * memory for metadata.</p>
     * 
     * <p>By using this flag, you can achieve behavior of free-at-once, stack, ring buffer, and double stack.</p>
     * </li>
     * <li>{@link #VMA_POOL_CREATE_BUDDY_ALGORITHM_BIT POOL_CREATE_BUDDY_ALGORITHM_BIT} - 
     * Enables alternative, buddy allocation algorithm in this pool.
     * 
     * <p>It operates on a tree of blocks, each having size that is a power of two and a half of its parent's size. Comparing to default algorithm, this one
     * provides faster allocation and deallocation and decreased external fragmentation, at the expense of more memory wasted (internal fragmentation).</p>
     * </li>
     * <li>{@link #VMA_POOL_CREATE_TLSF_ALGORITHM_BIT POOL_CREATE_TLSF_ALGORITHM_BIT} - 
     * Enables alternative, Two-Level Segregated Fit (TLSF) allocation algorithm in this pool.
     * 
     * <p>This algorithm is based on 2-level lists dividing address space into smaller chunks. The first level is aligned to power of two which serves as
     * buckets for requested memory to fall into, and the second level is lineary subdivided into lists of free memory. This algorithm aims to achieve
     * bounded response time even in the worst case scenario. Allocation time can be sometimes slightly longer than compared to other algorithms but in
     * return the application can avoid stalls in case of fragmentation, giving predictable results, suitable for real-time use cases.</p>
     * </li>
     * <li>{@link #VMA_POOL_CREATE_ALGORITHM_MASK POOL_CREATE_ALGORITHM_MASK} - Bit mask to extract only {@code ALGORITHM} bits from entire set of flags.</li>
     * </ul>
     */
    public static final int
        VMA_POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT = 0x2,
        VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT                = 0x4,
        VMA_POOL_CREATE_BUDDY_ALGORITHM_BIT                 = 0x8,
        VMA_POOL_CREATE_TLSF_ALGORITHM_BIT                  = 0x10,
        VMA_POOL_CREATE_ALGORITHM_MASK                      = VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT | VMA_POOL_CREATE_BUDDY_ALGORITHM_BIT | VMA_POOL_CREATE_TLSF_ALGORITHM_BIT;

    /** Flags to be used in {@link #vmaDefragmentationBegin DefragmentationBegin}. {@code VmaDefragmentationFlagBits} */
    public static final int VMA_DEFRAGMENTATION_FLAG_INCREMENTAL = 0x1;

    /**
     * Flags to be passed as {@link VmaVirtualBlockCreateInfo}{@code ::flags}. ({@code VmaVirtualBlockCreateFlagBits})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT} - 
     * Enables alternative, linear allocation algorithm in this virtual block.
     * 
     * <p>Specify this flag to enable linear allocation algorithm, which always creates new allocations after last one and doesn't reuse space from
     * allocations freed in between. It trades memory consumption for simplified algorithm and data structure, which has better performance and uses less
     * memory for metadata.</p>
     * 
     * <p>By using this flag, you can achieve behavior of free-at-once, stack, ring buffer, and double stack.</p>
     * </li>
     * <li>{@link #VMA_VIRTUAL_BLOCK_CREATE_BUDDY_ALGORITHM_BIT VIRTUAL_BLOCK_CREATE_BUDDY_ALGORITHM_BIT} - 
     * Enables alternative, buddy allocation algorithm in this virtual block.
     * 
     * <p>It operates on a tree of blocks, each having size that is a power of two and a half of its parent's size. Comparing to default algorithm, this one
     * provides faster allocation and deallocation and decreased external fragmentation, at the expense of more memory wasted (internal fragmentation).</p>
     * </li>
     * <li>{@link #VMA_VIRTUAL_BLOCK_CREATE_TLSF_ALGORITHM_BIT VIRTUAL_BLOCK_CREATE_TLSF_ALGORITHM_BIT} - 
     * Enables alternative, TLSF allocation algorithm in virtual block.
     * 
     * <p>This algorithm is based on 2-level lists dividing address space into smaller chunks. The first level is aligned to power of two which serves as
     * buckets for requested memory to fall into, and the second level is lineary subdivided into lists of free memory. This algorithm aims to achieve
     * bounded response time even in the worst case scenario. Allocation time can be sometimes slightly longer than compared to other algorithms but in
     * return the application can avoid stalls in case of fragmentation, giving predictable results, suitable for real-time use cases.</p>
     * </li>
     * <li>{@link #VMA_VIRTUAL_BLOCK_CREATE_ALGORITHM_MASK VIRTUAL_BLOCK_CREATE_ALGORITHM_MASK} - Bit mask to extract only {@code ALGORITHM} bits from entire set of flags.</li>
     * </ul>
     */
    public static final int
        VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT = 0x1,
        VMA_VIRTUAL_BLOCK_CREATE_BUDDY_ALGORITHM_BIT  = 0x2,
        VMA_VIRTUAL_BLOCK_CREATE_TLSF_ALGORITHM_BIT   = 0x4,
        VMA_VIRTUAL_BLOCK_CREATE_ALGORITHM_MASK       = VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT | VMA_VIRTUAL_BLOCK_CREATE_BUDDY_ALGORITHM_BIT | VMA_VIRTUAL_BLOCK_CREATE_TLSF_ALGORITHM_BIT;

    /**
     * Flags to be passed as {@link VmaVirtualAllocationCreateInfo}{@code ::flags}. ({@code VmaVirtualAllocationCreateFlagBits})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VMA_VIRTUAL_ALLOCATION_CREATE_UPPER_ADDRESS_BIT VIRTUAL_ALLOCATION_CREATE_UPPER_ADDRESS_BIT} - 
     * Allocation will be created from upper stack in a double stack pool.
     * 
     * <p>This flag is only allowed for virtual blocks created with {@link #VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT} flag.</p>
     * </li>
     * <li>{@link #VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT} - Allocation strategy that tries to minimize memory usage.</li>
     * <li>{@link #VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT} - Allocation strategy that tries to minimize allocation time.</li>
     * <li>{@link #VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MASK VIRTUAL_ALLOCATION_CREATE_STRATEGY_MASK} - 
     * A bit mask to extract only {@code STRATEGY} bits from entire set of flags.
     * 
     * <p>These stategy flags are binary compatible with equivalent flags in {@code VmaAllocationCreateFlagBits}.</p>
     * </li>
     * </ul>
     */
    public static final int
        VMA_VIRTUAL_ALLOCATION_CREATE_UPPER_ADDRESS_BIT       = VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT,
        VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT = VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT,
        VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT   = VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT,
        VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MASK           = VMA_ALLOCATION_CREATE_STRATEGY_MASK;

    protected Vma() {
        throw new UnsupportedOperationException();
    }

    // --- [ vmaCreateAllocator ] ---

    /** Unsafe version of: {@link #vmaCreateAllocator CreateAllocator} */
    public static native int nvmaCreateAllocator(long pCreateInfo, long pAllocator);

    /**
     * Creates Allocator object.
     * 
     * <p>LWJGL: Use {@link VmaVulkanFunctions}{@code ::set(VkInstance, VkDevice)} to populate the {@link VmaAllocatorCreateInfo}{@code ::pVulkanFunctions} struct.</p>
     */
    @NativeType("VkResult")
    public static int vmaCreateAllocator(@NativeType("VmaAllocatorCreateInfo const *") VmaAllocatorCreateInfo pCreateInfo, @NativeType("VmaAllocator *") PointerBuffer pAllocator) {
        if (CHECKS) {
            check(pAllocator, 1);
            VmaAllocatorCreateInfo.validate(pCreateInfo.address());
        }
        return nvmaCreateAllocator(pCreateInfo.address(), memAddress(pAllocator));
    }

    // --- [ vmaDestroyAllocator ] ---

    /** Unsafe version of: {@link #vmaDestroyAllocator DestroyAllocator} */
    public static native void nvmaDestroyAllocator(long allocator);

    /** Destroys allocator object. */
    public static void vmaDestroyAllocator(@NativeType("VmaAllocator") long allocator) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaDestroyAllocator(allocator);
    }

    // --- [ vmaGetAllocatorInfo ] ---

    /** Unsafe version of: {@link #vmaGetAllocatorInfo GetAllocatorInfo} */
    public static native void nvmaGetAllocatorInfo(long allocator, long pAllocatorInfo);

    /**
     * Returns information about existing {@code VmaAllocator} object - handle to Vulkan device etc.
     * 
     * <p>It might be useful if you want to keep just the {@code VmaAllocator} handle and fetch other required handles to {@code VkPhysicalDevice},
     * {@code VkDevice} etc. every time using this function.</p>
     */
    public static void vmaGetAllocatorInfo(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocatorInfo *") VmaAllocatorInfo pAllocatorInfo) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaGetAllocatorInfo(allocator, pAllocatorInfo.address());
    }

    // --- [ vmaGetPhysicalDeviceProperties ] ---

    /** Unsafe version of: {@link #vmaGetPhysicalDeviceProperties GetPhysicalDeviceProperties} */
    public static native void nvmaGetPhysicalDeviceProperties(long allocator, long ppPhysicalDeviceProperties);

    /**
     * {@code PhysicalDeviceProperties} are fetched from {@code physicalDevice} by the allocator. You can access it here, without fetching it again on your
     * own.
     */
    public static void vmaGetPhysicalDeviceProperties(@NativeType("VmaAllocator") long allocator, @NativeType("VkPhysicalDeviceProperties const **") PointerBuffer ppPhysicalDeviceProperties) {
        if (CHECKS) {
            check(allocator);
            check(ppPhysicalDeviceProperties, 1);
        }
        nvmaGetPhysicalDeviceProperties(allocator, memAddress(ppPhysicalDeviceProperties));
    }

    // --- [ vmaGetMemoryProperties ] ---

    /** Unsafe version of: {@link #vmaGetMemoryProperties GetMemoryProperties} */
    public static native void nvmaGetMemoryProperties(long allocator, long ppPhysicalDeviceMemoryProperties);

    /**
     * {@code PhysicalDeviceMemoryProperties} are fetched from {@code physicalDevice} by the allocator. You can access it here, without fetching it again on
     * your own.
     */
    public static void vmaGetMemoryProperties(@NativeType("VmaAllocator") long allocator, @NativeType("VkPhysicalDeviceMemoryProperties const **") PointerBuffer ppPhysicalDeviceMemoryProperties) {
        if (CHECKS) {
            check(allocator);
            check(ppPhysicalDeviceMemoryProperties, 1);
        }
        nvmaGetMemoryProperties(allocator, memAddress(ppPhysicalDeviceMemoryProperties));
    }

    // --- [ vmaGetMemoryTypeProperties ] ---

    /** Unsafe version of: {@link #vmaGetMemoryTypeProperties GetMemoryTypeProperties} */
    public static native void nvmaGetMemoryTypeProperties(long allocator, int memoryTypeIndex, long pFlags);

    /**
     * Given Memory Type Index, returns Property Flags of this memory type.
     * 
     * <p>This is just a convenience function. Same information can be obtained using {@link #vmaGetMemoryProperties GetMemoryProperties}.</p>
     */
    public static void vmaGetMemoryTypeProperties(@NativeType("VmaAllocator") long allocator, @NativeType("uint32_t") int memoryTypeIndex, @NativeType("VkMemoryPropertyFlags *") IntBuffer pFlags) {
        if (CHECKS) {
            check(allocator);
            check(pFlags, 1);
        }
        nvmaGetMemoryTypeProperties(allocator, memoryTypeIndex, memAddress(pFlags));
    }

    // --- [ vmaSetCurrentFrameIndex ] ---

    /** Unsafe version of: {@link #vmaSetCurrentFrameIndex SetCurrentFrameIndex} */
    public static native void nvmaSetCurrentFrameIndex(long allocator, int frameIndex);

    /** Sets index of the current frame. */
    public static void vmaSetCurrentFrameIndex(@NativeType("VmaAllocator") long allocator, @NativeType("uint32_t") int frameIndex) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaSetCurrentFrameIndex(allocator, frameIndex);
    }

    // --- [ vmaCalculateStats ] ---

    /** Unsafe version of: {@link #vmaCalculateStats CalculateStats} */
    public static native void nvmaCalculateStats(long allocator, long pStats);

    /**
     * Retrieves statistics from current state of the Allocator.
     * 
     * <p>This function is called "calculate" not "get" because it has to traverse all internal data structures, so it may be quite slow. For faster but more
     * brief statistics suitable to be called every frame or every allocation, use {@link #vmaGetHeapBudgets GetHeapBudgets}.</p>
     * 
     * <p>Note that when using allocator from multiple threads, returned information may immediately become outdated.</p>
     */
    public static void vmaCalculateStats(@NativeType("VmaAllocator") long allocator, @NativeType("VmaStats *") VmaStats pStats) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaCalculateStats(allocator, pStats.address());
    }

    // --- [ vmaGetHeapBudgets ] ---

    /** Unsafe version of: {@link #vmaGetHeapBudgets GetHeapBudgets} */
    public static native void nvmaGetHeapBudgets(long allocator, long pBudget);

    /**
     * Retrieves information about current memory budget for all memory heaps.
     * 
     * <p>This function is called "get" not "calculate" because it is very fast, suitable to be called every frame or every allocation. For more detailed
     * statistics use {@link #vmaCalculateStats CalculateStats}.</p>
     * 
     * <p>Note that when using allocator from multiple threads, returned information may immediately become outdated.</p>
     *
     * @param pBudget must point to array with number of elements at least equal to number of memory heaps in physical device used
     */
    public static void vmaGetHeapBudgets(@NativeType("VmaAllocator") long allocator, @NativeType("VmaBudget *") VmaBudget.Buffer pBudget) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaGetHeapBudgets(allocator, pBudget.address());
    }

    // --- [ vmaFindMemoryTypeIndex ] ---

    /** Unsafe version of: {@link #vmaFindMemoryTypeIndex FindMemoryTypeIndex} */
    public static native int nvmaFindMemoryTypeIndex(long allocator, int memoryTypeBits, long pAllocationCreateInfo, long pMemoryTypeIndex);

    /**
     * Helps to find {@code memoryTypeIndex}, given {@code memoryTypeBits} and {@link VmaAllocationCreateInfo}.
     * 
     * <p>This algorithm tries to find a memory type that:</p>
     * 
     * <ul>
     * <li>Is allowed by {@code memoryTypeBits}.</li>
     * <li>Contains all the flags from {@code pAllocationCreateInfo->requiredFlags}.</li>
     * <li>Matches intended usage.</li>
     * <li>Has as many flags from {@code pAllocationCreateInfo->preferredFlags} as possible.</li>
     * </ul>
     *
     * @return {@code VK_ERROR_FEATURE_NOT_PRESENT} if not found.
     *         
     *         <p>Receiving such result from this function or any other allocating function probably means that your device doesn't support any memory type with
     *         requested features for the specific type of resource you want to use it for. Please check parameters of your resource, like image layout
     *         ({@code OPTIMAL} versus LINEAR) or mip level count.</p>
     */
    @NativeType("VkResult")
    public static int vmaFindMemoryTypeIndex(@NativeType("VmaAllocator") long allocator, @NativeType("uint32_t") int memoryTypeBits, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("uint32_t *") IntBuffer pMemoryTypeIndex) {
        if (CHECKS) {
            check(allocator);
            check(pMemoryTypeIndex, 1);
        }
        return nvmaFindMemoryTypeIndex(allocator, memoryTypeBits, pAllocationCreateInfo.address(), memAddress(pMemoryTypeIndex));
    }

    // --- [ vmaFindMemoryTypeIndexForBufferInfo ] ---

    /** Unsafe version of: {@link #vmaFindMemoryTypeIndexForBufferInfo FindMemoryTypeIndexForBufferInfo} */
    public static native int nvmaFindMemoryTypeIndexForBufferInfo(long allocator, long pBufferCreateInfo, long pAllocationCreateInfo, long pMemoryTypeIndex);

    /**
     * Helps to find {@code memoryTypeIndex}, given {@code VkBufferCreateInfo} and {@link VmaAllocationCreateInfo}.
     * 
     * <p>It can be useful e.g. to determine value to be used as {@link VmaPoolCreateInfo}{@code ::memoryTypeIndex}. It internally creates a temporary, dummy buffer
     * that never has memory bound.</p>
     */
    @NativeType("VkResult")
    public static int vmaFindMemoryTypeIndexForBufferInfo(@NativeType("VmaAllocator") long allocator, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pBufferCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("uint32_t *") IntBuffer pMemoryTypeIndex) {
        if (CHECKS) {
            check(allocator);
            check(pMemoryTypeIndex, 1);
        }
        return nvmaFindMemoryTypeIndexForBufferInfo(allocator, pBufferCreateInfo.address(), pAllocationCreateInfo.address(), memAddress(pMemoryTypeIndex));
    }

    // --- [ vmaFindMemoryTypeIndexForImageInfo ] ---

    /** Unsafe version of: {@link #vmaFindMemoryTypeIndexForImageInfo FindMemoryTypeIndexForImageInfo} */
    public static native int nvmaFindMemoryTypeIndexForImageInfo(long allocator, long pImageCreateInfo, long pAllocationCreateInfo, long pMemoryTypeIndex);

    /**
     * Helps to find {@code memoryTypeIndex}, given {@code VkImageCreateInfo} and {@link VmaAllocationCreateInfo}.
     * 
     * <p>It can be useful e.g. to determine value to be used as {@link VmaPoolCreateInfo}{@code ::memoryTypeIndex}. It internally creates a temporary, dummy image
     * that never has memory bound.</p>
     */
    @NativeType("VkResult")
    public static int vmaFindMemoryTypeIndexForImageInfo(@NativeType("VmaAllocator") long allocator, @NativeType("VkImageCreateInfo const *") VkImageCreateInfo pImageCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("uint32_t *") IntBuffer pMemoryTypeIndex) {
        if (CHECKS) {
            check(allocator);
            check(pMemoryTypeIndex, 1);
        }
        return nvmaFindMemoryTypeIndexForImageInfo(allocator, pImageCreateInfo.address(), pAllocationCreateInfo.address(), memAddress(pMemoryTypeIndex));
    }

    // --- [ vmaCreatePool ] ---

    /** Unsafe version of: {@link #vmaCreatePool CreatePool} */
    public static native int nvmaCreatePool(long allocator, long pCreateInfo, long pPool);

    /**
     * Allocates Vulkan device memory and creates {@code VmaPool} object.
     *
     * @param allocator   allocator object
     * @param pCreateInfo parameters of pool to create
     * @param pPool       handle to created pool
     */
    @NativeType("VkResult")
    public static int vmaCreatePool(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPoolCreateInfo const *") VmaPoolCreateInfo pCreateInfo, @NativeType("VmaPool *") PointerBuffer pPool) {
        if (CHECKS) {
            check(allocator);
            check(pPool, 1);
        }
        return nvmaCreatePool(allocator, pCreateInfo.address(), memAddress(pPool));
    }

    // --- [ vmaDestroyPool ] ---

    /** Unsafe version of: {@link #vmaDestroyPool DestroyPool} */
    public static native void nvmaDestroyPool(long allocator, long pool);

    /** Destroys {@code VmaPool} object and frees Vulkan device memory. */
    public static void vmaDestroyPool(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool) {
        if (CHECKS) {
            check(allocator);
            check(pool);
        }
        nvmaDestroyPool(allocator, pool);
    }

    // --- [ vmaGetPoolStats ] ---

    /** Unsafe version of: {@link #vmaGetPoolStats GetPoolStats} */
    public static native void nvmaGetPoolStats(long allocator, long pool, long pPoolStats);

    /**
     * Retrieves statistics of existing VmaPool object.
     *
     * @param allocator  allocator object
     * @param pool       pool object
     * @param pPoolStats statistics of specified pool
     */
    public static void vmaGetPoolStats(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool, @NativeType("VmaPoolStats *") VmaPoolStats pPoolStats) {
        if (CHECKS) {
            check(allocator);
            check(pool);
        }
        nvmaGetPoolStats(allocator, pool, pPoolStats.address());
    }

    // --- [ vmaCheckPoolCorruption ] ---

    /** Unsafe version of: {@link #vmaCheckPoolCorruption CheckPoolCorruption} */
    public static native int nvmaCheckPoolCorruption(long allocator, long pool);

    /**
     * Checks magic number in margins around all allocations in given memory pool in search for corruptions.
     * 
     * <p>Corruption detection is enabled only when {@code VMA_DEBUG_DETECT_CORRUPTION} macro is defined to nonzero, {@code VMA_DEBUG_MARGIN} is defined to
     * nonzero and the pool is created in memory type that is {@code HOST_VISIBLE} and {@code HOST_COHERENT}.</p>
     *
     * @return possible return values:
     *         
     *         <ul>
     *         <li>{@code VK_ERROR_FEATURE_NOT_PRESENT} - corruption detection is not enabled for specified pool.</li>
     *         <li>{@code VK_SUCCESS} - corruption detection has been performed and succeeded.</li>
     *         <li>{@code VK_ERROR_UNKNOWN} - corruption detection has been performed and found memory corruptions around one of the allocations.
     *         {@code VMA_ASSERT} is also fired in that case.</li>
     *         <li>Other value: Error returned by Vulkan, e.g. memory mapping failure.</li>
     *         </ul>
     */
    @NativeType("VkResult")
    public static int vmaCheckPoolCorruption(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool) {
        if (CHECKS) {
            check(allocator);
            check(pool);
        }
        return nvmaCheckPoolCorruption(allocator, pool);
    }

    // --- [ vmaGetPoolName ] ---

    /** Unsafe version of: {@link #vmaGetPoolName GetPoolName} */
    public static native void nvmaGetPoolName(long allocator, long pool, long ppName);

    /**
     * Retrieves name of a custom pool.
     * 
     * <p>After the call {@code ppName} is either null or points to an internally-owned null-terminated string containing name of the pool that was previously
     * set. The pointer becomes invalid when the pool is destroyed or its name is changed using {@link #vmaSetPoolName SetPoolName}.</p>
     */
    public static void vmaGetPoolName(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool, @NativeType("char const **") PointerBuffer ppName) {
        if (CHECKS) {
            check(allocator);
            check(pool);
            check(ppName, 1);
        }
        nvmaGetPoolName(allocator, pool, memAddress(ppName));
    }

    // --- [ vmaSetPoolName ] ---

    /** Unsafe version of: {@link #vmaSetPoolName SetPoolName} */
    public static native void nvmaSetPoolName(long allocator, long pool, long pName);

    /**
     * Sets name of a custom pool.
     * 
     * <p>{@code pName} can be either null or pointer to a null-terminated string with new name for the pool. Function makes internal copy of the string, so it
     * can be changed or freed immediately after this call.</p>
     */
    public static void vmaSetPoolName(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool, @Nullable @NativeType("char const *") ByteBuffer pName) {
        if (CHECKS) {
            check(allocator);
            check(pool);
            checkNT1Safe(pName);
        }
        nvmaSetPoolName(allocator, pool, memAddressSafe(pName));
    }

    /**
     * Sets name of a custom pool.
     * 
     * <p>{@code pName} can be either null or pointer to a null-terminated string with new name for the pool. Function makes internal copy of the string, so it
     * can be changed or freed immediately after this call.</p>
     */
    public static void vmaSetPoolName(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool, @Nullable @NativeType("char const *") CharSequence pName) {
        if (CHECKS) {
            check(allocator);
            check(pool);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCIISafe(pName, true);
            long pNameEncoded = pName == null ? NULL : stack.getPointerAddress();
            nvmaSetPoolName(allocator, pool, pNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ vmaAllocateMemory ] ---

    /** Unsafe version of: {@link #vmaAllocateMemory AllocateMemory} */
    public static native int nvmaAllocateMemory(long allocator, long pVkMemoryRequirements, long pCreateInfo, long pAllocation, long pAllocationInfo);

    /**
     * General purpose memory allocation.
     * 
     * <p>You should free the memory using {@link #vmaFreeMemory FreeMemory} or {@link #vmaFreeMemoryPages FreeMemoryPages}.</p>
     * 
     * <p>It is recommended to use {@link #vmaAllocateMemoryForBuffer AllocateMemoryForBuffer}, {@link #vmaAllocateMemoryForImage AllocateMemoryForImage}, {@link #vmaCreateBuffer CreateBuffer}, {@link #vmaCreateImage CreateImage} instead whenever possible.</p>
     *
     * @param pAllocation     handle to allocated memory
     * @param pAllocationInfo information about allocated memory. Optional. It can be later fetched using function {@link #vmaGetAllocationInfo GetAllocationInfo}.
     */
    @NativeType("VkResult")
    public static int vmaAllocateMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VkMemoryRequirements const *") VkMemoryRequirements pVkMemoryRequirements, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pCreateInfo, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @Nullable @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(pAllocation, 1);
        }
        return nvmaAllocateMemory(allocator, pVkMemoryRequirements.address(), pCreateInfo.address(), memAddress(pAllocation), memAddressSafe(pAllocationInfo));
    }

    // --- [ vmaAllocateMemoryPages ] ---

    /**
     * Unsafe version of: {@link #vmaAllocateMemoryPages AllocateMemoryPages}
     *
     * @param allocationCount number of allocations to make
     */
    public static native int nvmaAllocateMemoryPages(long allocator, long pVkMemoryRequirements, long pCreateInfo, long allocationCount, long pAllocations, long pAllocationInfo);

    /**
     * General purpose memory allocation for multiple allocation objects at once.
     * 
     * <p>You should free the memory using {@link #vmaFreeMemory FreeMemory} or {@link #vmaFreeMemoryPages FreeMemoryPages}.</p>
     * 
     * <p>Word "pages" is just a suggestion to use this function to allocate pieces of memory needed for sparse binding. It is just a general purpose allocation
     * function able to make multiple allocations at once. It may be internally optimized to be more efficient than calling {@link #vmaAllocateMemory AllocateMemory}
     * {@code allocationCount} times.</p>
     * 
     * <p>All allocations are made using same parameters. All of them are created out of the same memory pool and type. If any allocation fails, all allocations
     * already made within this function call are also freed, so that when returned result is not {@code VK_SUCCESS}, {@code pAllocation} array is always
     * entirely filled with {@code VK_NULL_HANDLE}.</p>
     *
     * @param allocator             allocator object
     * @param pVkMemoryRequirements memory requirements for each allocation
     * @param pCreateInfo           creation parameters for each allocation
     * @param pAllocations          pointer to array that will be filled with handles to created allocations
     * @param pAllocationInfo       pointer to array that will be filled with parameters of created allocations. Optional.
     */
    @NativeType("VkResult")
    public static int vmaAllocateMemoryPages(@NativeType("VmaAllocator") long allocator, @NativeType("VkMemoryRequirements const *") VkMemoryRequirements pVkMemoryRequirements, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pCreateInfo, @NativeType("VmaAllocation *") PointerBuffer pAllocations, @Nullable @NativeType("VmaAllocationInfo *") VmaAllocationInfo.Buffer pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            checkSafe(pAllocationInfo, pAllocations.remaining());
            check(pAllocations, 1);
        }
        return nvmaAllocateMemoryPages(allocator, pVkMemoryRequirements.address(), pCreateInfo.address(), pAllocations.remaining(), memAddress(pAllocations), memAddressSafe(pAllocationInfo));
    }

    // --- [ vmaAllocateMemoryForBuffer ] ---

    /** Unsafe version of: {@link #vmaAllocateMemoryForBuffer AllocateMemoryForBuffer} */
    public static native int nvmaAllocateMemoryForBuffer(long allocator, long buffer, long pCreateInfo, long pAllocation, long pAllocationInfo);

    /**
     * Buffer memory allocation.
     * 
     * <p>You should free the memory using {@link #vmaFreeMemory FreeMemory}.</p>
     *
     * @param pAllocation     handle to allocated memory
     * @param pAllocationInfo information about allocated memory. Optional. It can be later fetched using function {@link #vmaGetAllocationInfo GetAllocationInfo}.
     */
    @NativeType("VkResult")
    public static int vmaAllocateMemoryForBuffer(@NativeType("VmaAllocator") long allocator, @NativeType("VkBuffer") long buffer, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pCreateInfo, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @Nullable @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(pAllocation, 1);
        }
        return nvmaAllocateMemoryForBuffer(allocator, buffer, pCreateInfo.address(), memAddress(pAllocation), memAddressSafe(pAllocationInfo));
    }

    // --- [ vmaAllocateMemoryForImage ] ---

    /** Unsafe version of: {@link #vmaAllocateMemoryForImage AllocateMemoryForImage} */
    public static native int nvmaAllocateMemoryForImage(long allocator, long image, long pCreateInfo, long pAllocation, long pAllocationInfo);

    /**
     * Function similar to {@link #vmaAllocateMemoryForBuffer AllocateMemoryForBuffer}.
     *
     * @param pAllocation     handle to allocated memory
     * @param pAllocationInfo information about allocated memory. Optional. It can be later fetched using function {@link #vmaGetAllocationInfo GetAllocationInfo}.
     */
    @NativeType("VkResult")
    public static int vmaAllocateMemoryForImage(@NativeType("VmaAllocator") long allocator, @NativeType("VkImage") long image, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pCreateInfo, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @Nullable @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(pAllocation, 1);
        }
        return nvmaAllocateMemoryForImage(allocator, image, pCreateInfo.address(), memAddress(pAllocation), memAddressSafe(pAllocationInfo));
    }

    // --- [ vmaFreeMemory ] ---

    /** Unsafe version of: {@link #vmaFreeMemory FreeMemory} */
    public static native void nvmaFreeMemory(long allocator, long allocation);

    /**
     * Frees memory previously allocated using {@link #vmaAllocateMemory AllocateMemory}, {@link #vmaAllocateMemoryForBuffer AllocateMemoryForBuffer}, or {@link #vmaAllocateMemoryForImage AllocateMemoryForImage}.
     * 
     * <p>Passing {@code VK_NULL_HANDLE} as {@code allocation} is valid. Such function call is just skipped.</p>
     */
    public static void vmaFreeMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation const") long allocation) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaFreeMemory(allocator, allocation);
    }

    // --- [ vmaFreeMemoryPages ] ---

    /** Unsafe version of: {@link #vmaFreeMemoryPages FreeMemoryPages} */
    public static native void nvmaFreeMemoryPages(long allocator, long allocationCount, long pAllocations);

    /**
     * Frees memory and destroys multiple allocations.
     * 
     * <p>Word "pages" is just a suggestion to use this function to free pieces of memory used for sparse binding. It is just a general purpose function to free
     * memory and destroy allocations made using e.g. {@link #vmaAllocateMemory AllocateMemory}, {@link #vmaAllocateMemoryPages AllocateMemoryPages} and other functions. It may be internally optimized to be more
     * efficient than calling {@link #vmaFreeMemory FreeMemory} {@code allocationCount} times.</p>
     * 
     * <p>Allocations in {@code pAllocations} array can come from any memory pools and types. Passing {@code VK_NULL_HANDLE} as elements of {@code pAllocations}
     * array is valid. Such entries are just skipped.</p>
     */
    public static void vmaFreeMemoryPages(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation const *") PointerBuffer pAllocations) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaFreeMemoryPages(allocator, pAllocations.remaining(), memAddress(pAllocations));
    }

    // --- [ vmaGetAllocationInfo ] ---

    /** Unsafe version of: {@link #vmaGetAllocationInfo GetAllocationInfo} */
    public static native void nvmaGetAllocationInfo(long allocator, long allocation, long pAllocationInfo);

    /**
     * Returns current information about specified allocation.
     * 
     * <p>Current parameters of given allocation are returned in {@code pAllocationInfo}.</p>
     * 
     * <p>Although this function doesn't lock any mutex, so it should be quite efficient, you should avoid calling it too often. You can retrieve same
     * {@code VmaAllocationInfo} structure while creating your resource, from function {@link #vmaCreateBuffer CreateBuffer}, {@link #vmaCreateImage CreateImage}. You can remember it if you are sure
     * parameters don't change (e.g. due to defragmentation).</p>
     */
    public static void vmaGetAllocationInfo(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        nvmaGetAllocationInfo(allocator, allocation, pAllocationInfo.address());
    }

    // --- [ vmaSetAllocationUserData ] ---

    /** Unsafe version of: {@link #vmaSetAllocationUserData SetAllocationUserData} */
    public static native void nvmaSetAllocationUserData(long allocator, long allocation, long pUserData);

    /**
     * Sets {@code pUserData} in given allocation to new value.
     * 
     * <p>If the allocation was created with {@link #VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT}, {@code pUserData} must be either null, or pointer to a null-terminated
     * string. The function makes local copy of the string and sets it as allocation's {@code pUserData}. String passed as {@code pUserData} doesn't need to
     * be valid for whole lifetime of the allocation - you can free it after this call. String previously pointed by allocation's {@code pUserData} is freed
     * from memory.</p>
     * 
     * <p>If the flag was not used, the value of pointer {@code pUserData} is just copied to allocation's {@code pUserData}. It is opaque, so you can use it
     * however you want - e.g. as a pointer, ordinal number or some handle to you own data.</p>
     */
    public static void vmaSetAllocationUserData(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("void *") long pUserData) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        nvmaSetAllocationUserData(allocator, allocation, pUserData);
    }

    // --- [ vmaGetAllocationMemoryProperties ] ---

    /** Unsafe version of: {@link #vmaGetAllocationMemoryProperties GetAllocationMemoryProperties} */
    public static native void nvmaGetAllocationMemoryProperties(long allocator, long allocation, long pFlags);

    /**
     * Given an allocation, returns Property Flags of its memory type.
     * 
     * <p>This is just a convenience function. Same information can be obtained using {@link #vmaGetAllocationInfo GetAllocationInfo} + {@link #vmaGetMemoryProperties GetMemoryProperties}.</p>
     */
    public static void vmaGetAllocationMemoryProperties(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkMemoryPropertyFlags *") IntBuffer pFlags) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
            check(pFlags, 1);
        }
        nvmaGetAllocationMemoryProperties(allocator, allocation, memAddress(pFlags));
    }

    // --- [ vmaMapMemory ] ---

    /** Unsafe version of: {@link #vmaMapMemory MapMemory} */
    public static native int nvmaMapMemory(long allocator, long allocation, long ppData);

    /**
     * Maps memory represented by given allocation and returns pointer to it.
     * 
     * <p>Maps memory represented by given allocation to make it accessible to CPU code. When succeeded, {@code *ppData} contains pointer to first byte of this
     * memory.</p>
     * 
     * <p>If the allocation is part of a bigger {@code VkDeviceMemory} block, returned pointer is correctly offsetted to the beginning of region assigned to this
     * particular allocation. Unlike the result of {@code vkMapMemory}, it points to the allocation, not to the beginning of the whole block. You should not
     * add {@code VmaAllocationInfo::offset} to it!</p>
     * 
     * <p>Mapping is internally reference-counted and synchronized, so despite raw Vulkan function {@code vkMapMemory()} cannot be used to map same block of
     * {@code VkDeviceMemory} multiple times simultaneously, it is safe to call this function on allocations assigned to the same memory block. Actual Vulkan
     * memory will be mapped on first mapping and unmapped on last unmapping.</p>
     * 
     * <p>If the function succeeded, you must call {@link #vmaUnmapMemory UnmapMemory} to unmap the allocation when mapping is no longer needed or before freeing the allocation, at
     * the latest.</p>
     * 
     * <p>It also safe to call this function multiple times on the same allocation. You must call {@code vmaUnmapMemory()} same number of times as you called
     * {@code vmaMapMemory()}.</p>
     * 
     * <p>It is also safe to call this function on allocation created with {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT} flag. Its memory stays mapped all the time. You must
     * still call {@code vmaUnmapMemory()} same number of times as you called {@code vmaMapMemory()}. You must not call {@code vmaUnmapMemory()} additional
     * time to free the "0-th" mapping made automatically due to {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT} flag.</p>
     * 
     * <p>This function fails when used on allocation made in memory type that is not {@code HOST_VISIBLE}.</p>
     * 
     * <p>This function doesn't automatically flush or invalidate caches. If the allocation is made from a memory types that is not {@code HOST_COHERENT}, you
     * also need to use {@link #vmaInvalidateAllocation InvalidateAllocation} / {@link #vmaFlushAllocation FlushAllocation}, as required by Vulkan specification.</p>
     */
    @NativeType("VkResult")
    public static int vmaMapMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("void **") PointerBuffer ppData) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
            check(ppData, 1);
        }
        return nvmaMapMemory(allocator, allocation, memAddress(ppData));
    }

    // --- [ vmaUnmapMemory ] ---

    /** Unsafe version of: {@link #vmaUnmapMemory UnmapMemory} */
    public static native void nvmaUnmapMemory(long allocator, long allocation);

    /**
     * Unmaps memory represented by given allocation, mapped previously using {@link #vmaMapMemory MapMemory}.
     * 
     * <p>For details, see description of {@code vmaMapMemory()}.</p>
     * 
     * <p>This function doesn't automatically flush or invalidate caches. If the allocation is made from a memory types that is not {@code HOST_COHERENT}, you
     * also need to use {@link #vmaInvalidateAllocation InvalidateAllocation} / {@link #vmaFlushAllocation FlushAllocation}, as required by Vulkan specification.</p>
     */
    public static void vmaUnmapMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        nvmaUnmapMemory(allocator, allocation);
    }

    // --- [ vmaFlushAllocation ] ---

    /** Unsafe version of: {@link #vmaFlushAllocation FlushAllocation} */
    public static native void nvmaFlushAllocation(long allocator, long allocation, long offset, long size);

    /**
     * Flushes memory of given allocation.
     * 
     * <p>Calls {@code vkFlushMappedMemoryRanges()} for memory associated with given range of given allocation. It needs to be called after writing to a mapped
     * memory for memory types that are not {@code HOST_COHERENT}. Unmap operation doesn't do that automatically.</p>
     * 
     * <ul>
     * <li>{@code offset} must be relative to the beginning of allocation.</li>
     * <li>{@code size} can be {@code VK_WHOLE_SIZE}. It means all memory from {@code offset} the the end of given allocation.</li>
     * <li>{@code offset} and {@code size} don't have to be aligned. They are internally rounded down/up to multiply of {@code nonCoherentAtomSize}.</li>
     * <li>If {@code size} is 0, this call is ignored.</li>
     * <li>If memory type that the {@code allocation} belongs to is not {@code HOST_VISIBLE} or it is {@code HOST_COHERENT}, this call is ignored.</li>
     * </ul>
     * 
     * <p>Warning! {@code offset} and {@code size} are relative to the contents of given {@code allocation}. If you mean whole allocation, you can pass 0 and
     * {@code VK_WHOLE_SIZE}, respectively. Do not pass allocation's offset as {@code offset}!!!</p>
     */
    public static void vmaFlushAllocation(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long offset, @NativeType("VkDeviceSize") long size) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        nvmaFlushAllocation(allocator, allocation, offset, size);
    }

    // --- [ vmaInvalidateAllocation ] ---

    /** Unsafe version of: {@link #vmaInvalidateAllocation InvalidateAllocation} */
    public static native void nvmaInvalidateAllocation(long allocator, long allocation, long offset, long size);

    /**
     * Invalidates memory of given allocation.
     * 
     * <p>Calls {@code vkInvalidateMappedMemoryRanges()} for memory associated with given range of given allocation. It needs to be called before reading from a
     * mapped memory for memory types that are not {@code HOST_COHERENT}. Map operation doesn't do that automatically.</p>
     * 
     * <ul>
     * <li>{@code offset} must be relative to the beginning of allocation.</li>
     * <li>{@code size} can be {@code VK_WHOLE_SIZE}. It means all memory from {@code offset} the the end of given allocation.</li>
     * <li>{@code offset} and {@code size} don't have to be aligned. They are internally rounded down/up to multiply of {@code nonCoherentAtomSize}.</li>
     * <li>If {@code size} is 0, this call is ignored.</li>
     * <li>If memory type that the {@code allocation} belongs to is not {@code HOST_VISIBLE} or it is {@code HOST_COHERENT}, this call is ignored.</li>
     * </ul>
     * 
     * <p>Warning! {@code offset} and {@code size} are relative to the contents of given {@code allocation}. If you mean whole allocation, you can pass 0 and
     * {@code VK_WHOLE_SIZE}, respectively. Do not pass allocation's offset as {@code offset}!!!</p>
     * 
     * <p>This function returns the {@code VkResult} from {@code vkFlushMappedMemoryRanges} if it is called, otherwise {@code VK_SUCCESS}.</p>
     */
    public static void vmaInvalidateAllocation(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long offset, @NativeType("VkDeviceSize") long size) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        nvmaInvalidateAllocation(allocator, allocation, offset, size);
    }

    // --- [ vmaFlushAllocations ] ---

    /** Unsafe version of: {@link #vmaFlushAllocations FlushAllocations} */
    public static native int nvmaFlushAllocations(long allocator, int allocationCount, long allocations, long offsets, long sizes);

    /**
     * Flushes memory of given set of allocations.
     * 
     * <p>Calls {@code vkFlushMappedMemoryRanges()} for memory associated with given ranges of given allocations. For more information, see documentation of {@link #vmaFlushAllocation FlushAllocation}.</p>
     * 
     * <p>This function returns the {@code VkResult} from {@code vkFlushMappedMemoryRanges} if it is called, otherwise {@code VK_SUCCESS}.</p>
     *
     * @param offsets If not null, it must point to an array of offsets of regions to flush, relative to the beginning of respective allocations. Null means all ofsets are zero.
     * @param sizes   If not null, it must point to an array of sizes of regions to flush in respective allocations. Null means `VK_WHOLE_SIZE` for all allocations.
     */
    @NativeType("VkResult")
    public static int vmaFlushAllocations(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation const *") PointerBuffer allocations, @Nullable @NativeType("VkDeviceSize const *") LongBuffer offsets, @Nullable @NativeType("VkDeviceSize const *") LongBuffer sizes) {
        if (CHECKS) {
            check(allocator);
            checkSafe(offsets, allocations.remaining());
            checkSafe(sizes, allocations.remaining());
        }
        return nvmaFlushAllocations(allocator, allocations.remaining(), memAddress(allocations), memAddressSafe(offsets), memAddressSafe(sizes));
    }

    // --- [ vmaInvalidateAllocations ] ---

    /** Unsafe version of: {@link #vmaInvalidateAllocations InvalidateAllocations} */
    public static native int nvmaInvalidateAllocations(long allocator, int allocationCount, long allocations, long offsets, long sizes);

    /**
     * Invalidates memory of given set of allocations.
     * 
     * <p>Calls {@code vkInvalidateMappedMemoryRanges()} for memory associated with given ranges of given allocations. For more information, see documentation of {@link #vmaInvalidateAllocation InvalidateAllocation}.</p>
     * 
     * <p>This function returns the {@code VkResult} from {@code vkInvalidateMappedMemoryRanges} if it is called, otherwise {@code VK_SUCCESS}.</p>
     *
     * @param offsets if not null, it must point to an array of offsets of regions to flush, relative to the beginning of respective allocations. Null means all ofsets
     *                are zero.
     * @param sizes   if not null, it must point to an array of sizes of regions to flush in respective allocations. Null means {@code VK_WHOLE_SIZE} for all
     *                allocations.
     */
    @NativeType("VkResult")
    public static int vmaInvalidateAllocations(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation const *") PointerBuffer allocations, @Nullable @NativeType("VkDeviceSize const *") LongBuffer offsets, @Nullable @NativeType("VkDeviceSize const *") LongBuffer sizes) {
        if (CHECKS) {
            check(allocator);
            checkSafe(offsets, allocations.remaining());
            checkSafe(sizes, allocations.remaining());
        }
        return nvmaInvalidateAllocations(allocator, allocations.remaining(), memAddress(allocations), memAddressSafe(offsets), memAddressSafe(sizes));
    }

    // --- [ vmaCheckCorruption ] ---

    /** Unsafe version of: {@link #vmaCheckCorruption CheckCorruption} */
    public static native int nvmaCheckCorruption(long allocator, int memoryTypeBits);

    /**
     * Checks magic number in margins around all allocations in given memory types (in both default and custom pools) in search for corruptions.
     * 
     * <p>Corruption detection is enabled only when {@code VMA_DEBUG_DETECT_CORRUPTION} macro is defined to nonzero, {@code VMA_DEBUG_MARGIN} is defined to
     * nonzero and only for memory types that are {@code HOST_VISIBLE} and {@code HOST_COHERENT}.</p>
     *
     * @param memoryTypeBits bit mask, where each bit set means that a memory type with that index should be checked
     *
     * @return possible return values:
     *         
     *         <ul>
     *         <li>{@code VK_ERROR_FEATURE_NOT_PRESENT} - corruption detection is not enabled for any of specified memory types.</li>
     *         <li>{@code VK_SUCCESS} - corruption detection has been performed and succeeded.</li>
     *         <li>{@code VK_ERROR_UNKNOWN} - corruption detection has been performed and found memory corruptions around one of the allocations.
     *         {@code VMA_ASSERT} is also fired in that case.</li>
     *         <li>Other value: Error returned by Vulkan, e.g. memory mapping failure.</li>
     *         </ul>
     */
    @NativeType("VkResult")
    public static int vmaCheckCorruption(@NativeType("VmaAllocator") long allocator, @NativeType("uint32_t") int memoryTypeBits) {
        if (CHECKS) {
            check(allocator);
        }
        return nvmaCheckCorruption(allocator, memoryTypeBits);
    }

    // --- [ vmaDefragmentationBegin ] ---

    /** Unsafe version of: {@link #vmaDefragmentationBegin DefragmentationBegin} */
    public static native int nvmaDefragmentationBegin(long allocator, long pInfo, long pStats, long pContext);

    /**
     * Begins defragmentation process.
     * 
     * <p>Use this function instead of old, deprecated {@link #vmaDefragment Defragment}.</p>
     * 
     * <p>Warning! Between the call to {@code vmaDefragmentationBegin} and {@link #vmaDefragmentationEnd DefragmentationEnd}:</p>
     * 
     * <ul>
     * <li>You should not use any of allocations passed as {@code pInfo->pAllocations} or any allocations that belong to pools passed as
     * {@code pInfo->pPools}, including calling {@link #vmaGetAllocationInfo GetAllocationInfo}, or access their data.</li>
     * <li>Some mutexes protecting internal data structures may be locked, so trying to make or free any allocations, bind buffers or images, map memory, or
     * launch another simultaneous defragmentation in between may cause stall (when done on another thread) or deadlock (when done on the same thread),
     * unless you are 100% sure that defragmented allocations are in different pools.</li>
     * <li>Information returned via {@code pStats} and {@code pInfo->pAllocationsChanged} are undefined. They become valid after call to
     * {@link #vmaDefragmentationEnd DefragmentationEnd}.</li>
     * <li>If {@code pInfo->commandBuffer} is not null, you must submit that command buffer and make sure it finished execution before calling
     * {@link #vmaDefragmentationEnd DefragmentationEnd}.</li>
     * </ul>
     *
     * @param allocator allocator object
     * @param pInfo     structure filled with parameters of defragmentation
     * @param pStats    Optional. Statistics of defragmentation. You can pass null if you are not interested in this information.
     * @param pContext  context object that must be passed to {@link #vmaDefragmentationEnd DefragmentationEnd} to finish defragmentation
     *
     * @return {@code VK_SUCCESS} and {@code *pContext == null} if defragmentation finished within this function call. {@code VK_NOT_READY} and
     *         {@code *pContext != null} if defragmentation has been started and you need to call {@link #vmaDefragmentationEnd DefragmentationEnd} to finish it. Negative value in case of error.
     */
    @NativeType("VkResult")
    public static int vmaDefragmentationBegin(@NativeType("VmaAllocator") long allocator, @NativeType("VmaDefragmentationInfo2 const *") VmaDefragmentationInfo2 pInfo, @Nullable @NativeType("VmaDefragmentationStats *") VmaDefragmentationStats pStats, @NativeType("VmaDefragmentationContext *") PointerBuffer pContext) {
        if (CHECKS) {
            check(allocator);
            check(pContext, 1);
            VmaDefragmentationInfo2.validate(pInfo.address());
        }
        return nvmaDefragmentationBegin(allocator, pInfo.address(), memAddressSafe(pStats), memAddress(pContext));
    }

    // --- [ vmaDefragmentationEnd ] ---

    /** Unsafe version of: {@link #vmaDefragmentationEnd DefragmentationEnd} */
    public static native int nvmaDefragmentationEnd(long allocator, long context);

    /**
     * Ends defragmentation process.
     * 
     * <p>Use this function to finish defragmentation started by {@link #vmaDefragmentationBegin DefragmentationBegin}. It is safe to pass {@code context == null}. The function then does
     * nothing.</p>
     *
     * @param allocator allocator object
     */
    @NativeType("VkResult")
    public static int vmaDefragmentationEnd(@NativeType("VmaAllocator") long allocator, @NativeType("VmaDefragmentationContext") long context) {
        if (CHECKS) {
            check(allocator);
        }
        return nvmaDefragmentationEnd(allocator, context);
    }

    // --- [ vmaBeginDefragmentationPass ] ---

    public static native int nvmaBeginDefragmentationPass(long allocator, long context, long pInfo);

    @NativeType("VkResult")
    public static int vmaBeginDefragmentationPass(@NativeType("VmaAllocator") long allocator, @NativeType("VmaDefragmentationContext") long context, @NativeType("VmaDefragmentationPassInfo *") VmaDefragmentationPassInfo pInfo) {
        if (CHECKS) {
            check(allocator);
        }
        return nvmaBeginDefragmentationPass(allocator, context, pInfo.address());
    }

    // --- [ vmaEndDefragmentationPass ] ---

    public static native int nvmaEndDefragmentationPass(long allocator, long context);

    @NativeType("VkResult")
    public static int vmaEndDefragmentationPass(@NativeType("VmaAllocator") long allocator, @NativeType("VmaDefragmentationContext") long context) {
        if (CHECKS) {
            check(allocator);
        }
        return nvmaEndDefragmentationPass(allocator, context);
    }

    // --- [ vmaDefragment ] ---

    /**
     * Unsafe version of: {@link #vmaDefragment Defragment}
     *
     * @param allocationCount number of elements in {@code pAllocations} and {@code pAllocationsChanged} arrays
     */
    public static native int nvmaDefragment(long allocator, long pAllocations, long allocationCount, long pAllocationsChanged, long pDefragmentationInfo, long pDefragmentationStats);

    /**
     * Deprecated: This is a part of the old interface. It is recommended to use structure {@link VmaDefragmentationInfo2} and function {@link #vmaDefragmentationBegin DefragmentationBegin}
     * instead.
     * 
     * <p>Compacts memory by moving allocations.</p>
     * 
     * <p>This function works by moving allocations to different places (different {@code VkDeviceMemory} objects and/or different offsets) in order to optimize
     * memory usage. Only allocations that are in {@code pAllocations} array can be moved. All other allocations are considered nonmovable in this call. Basic
     * rules:</p>
     * 
     * <ul>
     * <li>Only allocations made in memory types that have {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT} and {@code VK_MEMORY_PROPERTY_HOST_COHERENT_BIT} flags
     * can be compacted. You may pass other allocations but it makes no sense - these will never be moved.</li>
     * <li>Custom pools created with {@link #VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT POOL_CREATE_LINEAR_ALGORITHM_BIT} or {@link #VMA_POOL_CREATE_BUDDY_ALGORITHM_BIT POOL_CREATE_BUDDY_ALGORITHM_BIT} flag are not defragmented. Allocations passed to
     * this function that come from such pools are ignored.</li>
     * <li>Allocations created with {@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT} or created as dedicated allocations for any other reason are also ignored.</li>
     * <li>Both allocations made with or without {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT} flag can be compacted. If not persistently mapped, memory will be mapped
     * temporarily inside this function if needed.</li>
     * <li>You must not pass same {@code VmaAllocation} object multiple times in {@code pAllocations} array.</li>
     * </ul>
     * 
     * <p>The function also frees empty {@code VkDeviceMemory} blocks.</p>
     * 
     * <p>Warning: This function may be time-consuming, so you shouldn't call it too often (like after every resource creation/destruction). You
     * can call it on special occasions (like when reloading a game level or when you just destroyed a lot of objects). Calling it every frame may be OK, but
     * you should measure that on your platform.</p>
     *
     * @param pAllocations          array of allocations that can be moved during this compaction
     * @param pAllocationsChanged   array of boolean values that will indicate whether matching allocation in {@code pAllocations} array has been moved. This parameter is optional.
     *                              Pass null if you don't need this information.
     * @param pDefragmentationInfo  configuration parameters. Optional - pass null to use default values.
     * @param pDefragmentationStats statistics returned by the function. Optional - pass null if you don't need this information.
     *
     * @return {@code VK_SUCCESS} if completed, negative error code in case of error.
     */
    @NativeType("VkResult")
    public static int vmaDefragment(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation const *") PointerBuffer pAllocations, @Nullable @NativeType("VkBool32 *") IntBuffer pAllocationsChanged, @Nullable @NativeType("VmaDefragmentationInfo const *") VmaDefragmentationInfo pDefragmentationInfo, @Nullable @NativeType("VmaDefragmentationStats *") VmaDefragmentationStats pDefragmentationStats) {
        if (CHECKS) {
            check(allocator);
            checkSafe(pAllocationsChanged, pAllocations.remaining());
        }
        return nvmaDefragment(allocator, memAddress(pAllocations), pAllocations.remaining(), memAddressSafe(pAllocationsChanged), memAddressSafe(pDefragmentationInfo), memAddressSafe(pDefragmentationStats));
    }

    // --- [ vmaBindBufferMemory ] ---

    /** Unsafe version of: {@link #vmaBindBufferMemory BindBufferMemory} */
    public static native int nvmaBindBufferMemory(long allocator, long allocation, long buffer);

    /**
     * Binds buffer to allocation.
     * 
     * <p>Binds specified buffer to region of memory represented by specified allocation. Gets {@code VkDeviceMemory} handle and offset from the allocation. If
     * you want to create a buffer, allocate memory for it and bind them together separately, you should use this function for binding instead of standard
     * {@code vkBindBufferMemory()}, because it ensures proper synchronization so that when a {@code VkDeviceMemory} object is used by multiple allocations,
     * calls to {@code vkBind*Memory()} or {@code vkMapMemory()} won't happen from multiple threads simultaneously (which is illegal in Vulkan).</p>
     * 
     * <p>It is recommended to use function {@link #vmaCreateBuffer CreateBuffer} instead of this one.</p>
     */
    @NativeType("VkResult")
    public static int vmaBindBufferMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkBuffer") long buffer) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        return nvmaBindBufferMemory(allocator, allocation, buffer);
    }

    // --- [ vmaBindBufferMemory2 ] ---

    /** Unsafe version of: {@link #vmaBindBufferMemory2 BindBufferMemory2} */
    public static native int nvmaBindBufferMemory2(long allocator, long allocation, long allocationLocalOffset, long buffer, long pNext);

    /**
     * Binds buffer to allocation with additional parameters.
     * 
     * <p>This function is similar to {@link #vmaBindBufferMemory BindBufferMemory}, but it provides additional parameters.</p>
     * 
     * <p>If {@code pNext} is not null, {@code VmaAllocator} object must have been created with {@link #VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT} flag or with
     * {@link VmaAllocatorCreateInfo}{@code ::vulkanApiVersion >= VK_API_VERSION_1_1}. Otherwise the call fails.</p>
     *
     * @param allocationLocalOffset additional offset to be added while binding, relative to the beginning of the {@code allocation}. Normally it should be 0.
     * @param pNext                 a chain of structures to be attached to {@code VkBindBufferMemoryInfoKHR} structure used internally. Normally it should be {@code null}.
     */
    @NativeType("VkResult")
    public static int vmaBindBufferMemory2(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long allocationLocalOffset, @NativeType("VkBuffer") long buffer, @NativeType("void const *") long pNext) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        return nvmaBindBufferMemory2(allocator, allocation, allocationLocalOffset, buffer, pNext);
    }

    // --- [ vmaBindImageMemory ] ---

    /** Unsafe version of: {@link #vmaBindImageMemory BindImageMemory} */
    public static native int nvmaBindImageMemory(long allocator, long allocation, long image);

    /**
     * Binds image to allocation.
     * 
     * <p>Binds specified image to region of memory represented by specified allocation. Gets {@code VkDeviceMemory} handle and offset from the allocation. If
     * you want to create an image, allocate memory for it and bind them together separately, you should use this function for binding instead of standard
     * {@code vkBindImageMemory()}, because it ensures proper synchronization so that when a {@code VkDeviceMemory} object is used by multiple allocations,
     * calls to {@code vkBind*Memory()} or {@code vkMapMemory()} won't happen from multiple threads simultaneously (which is illegal in Vulkan).</p>
     * 
     * <p>It is recommended to use function vmaCreateImage() instead of this one.</p>
     */
    @NativeType("VkResult")
    public static int vmaBindImageMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkImage") long image) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        return nvmaBindImageMemory(allocator, allocation, image);
    }

    // --- [ vmaBindImageMemory2 ] ---

    /** Unsafe version of: {@link #vmaBindImageMemory2 BindImageMemory2} */
    public static native int nvmaBindImageMemory2(long allocator, long allocation, long allocationLocalOffset, long image, long pNext);

    /**
     * Binds image to allocation with additional parameters.
     * 
     * <p>This function is similar to {@link #vmaBindImageMemory BindImageMemory}, but it provides additional parameters.</p>
     * 
     * <p>If {@code pNext} is not null, {@code VmaAllocator} object must have been created with {@link #VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT} flag or with
     * {@link VmaAllocatorCreateInfo}{@code ::vulkanApiVersion >= VK_API_VERSION_1_1}. Otherwise the call fails.</p>
     *
     * @param allocationLocalOffset additional offset to be added while binding, relative to the beginning of the {@code allocation}. Normally it should be 0.
     * @param pNext                 a chain of structures to be attached to {@code VkBindImageMemoryInfoKHR} structure used internally. Normally it should be null.
     */
    @NativeType("VkResult")
    public static int vmaBindImageMemory2(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long allocationLocalOffset, @NativeType("VkImage") long image, @NativeType("void const *") long pNext) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        return nvmaBindImageMemory2(allocator, allocation, allocationLocalOffset, image, pNext);
    }

    // --- [ vmaCreateBuffer ] ---

    /** Unsafe version of: {@link #vmaCreateBuffer CreateBuffer} */
    public static native int nvmaCreateBuffer(long allocator, long pBufferCreateInfo, long pAllocationCreateInfo, long pBuffer, long pAllocation, long pAllocationInfo);

    /**
     * This function automatically:
     * 
     * <ul>
     * <li>Creates buffer.</li>
     * <li>Allocates appropriate memory for it.</li>
     * <li>Binds the buffer with the memory.</li>
     * </ul>
     * 
     * <p>If any of these operations fail, buffer and allocation are not created, returned value is negative error code, {@code *pBuffer} and
     * {@code *pAllocation} are null.</p>
     * 
     * <p>If the function succeeded, you must destroy both buffer and allocation when you no longer need them using either convenience function {@link #vmaDestroyBuffer DestroyBuffer}
     * or separately, using {@code vkDestroyBuffer()} and {@link #vmaFreeMemory FreeMemory}.</p>
     * 
     * <p>If {@link #VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT} flag was used, {@code VK_KHR_dedicated_allocation} extension is used internally to query driver
     * whether it requires or prefers the new buffer to have dedicated allocation. If yes, and if dedicated allocation is possible
     * ({@link #VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT ALLOCATION_CREATE_NEVER_ALLOCATE_BIT} is not used), it creates dedicated allocation for this buffer, just like when using
     * {@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>This function creates a new {@code VkBuffer}. Sub-allocation of parts of one large buffer, although recommended as a good practice, is out of scope of
     * this library and could be implemented by the user as a higher-level logic on top of VMA.</p>
     * </div>
     *
     * @param pBuffer         buffer that was created
     * @param pAllocation     allocation that was created
     * @param pAllocationInfo information about allocated memory. Optional. It can be later fetched using function {@link #vmaGetAllocationInfo GetAllocationInfo}.
     */
    @NativeType("VkResult")
    public static int vmaCreateBuffer(@NativeType("VmaAllocator") long allocator, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pBufferCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("VkBuffer *") LongBuffer pBuffer, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @Nullable @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(pBuffer, 1);
            check(pAllocation, 1);
        }
        return nvmaCreateBuffer(allocator, pBufferCreateInfo.address(), pAllocationCreateInfo.address(), memAddress(pBuffer), memAddress(pAllocation), memAddressSafe(pAllocationInfo));
    }

    // --- [ vmaCreateBufferWithAlignment ] ---

    /** Unsafe version of: {@link #vmaCreateBufferWithAlignment CreateBufferWithAlignment} */
    public static native int nvmaCreateBufferWithAlignment(long allocator, long pBufferCreateInfo, long pAllocationCreateInfo, long minAlignment, long pBuffer, long pAllocation, long pAllocationInfo);

    /**
     * Similar to {@link #vmaCreateBuffer CreateBuffer} but provides additional parameter {@code minAlignment} which allows to specify custom, minimum alignment to be used when
     * placing the buffer inside a larger memory block, which may be needed e.g. for interop with OpenGL.
     *
     * @param minAlignment    custom, minimum alignment to be used when placing the buffer inside a larger memory block
     * @param pBuffer         buffer that was created
     * @param pAllocation     allocation that was created
     * @param pAllocationInfo information about allocated memory. Optional. It can be later fetched using function {@link #vmaGetAllocationInfo GetAllocationInfo}.
     */
    @NativeType("VkResult")
    public static int vmaCreateBufferWithAlignment(@NativeType("VmaAllocator") long allocator, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pBufferCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("VkDeviceSize") long minAlignment, @NativeType("VkBuffer *") LongBuffer pBuffer, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @Nullable @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(pBuffer, 1);
            check(pAllocation, 1);
        }
        return nvmaCreateBufferWithAlignment(allocator, pBufferCreateInfo.address(), pAllocationCreateInfo.address(), minAlignment, memAddress(pBuffer), memAddress(pAllocation), memAddressSafe(pAllocationInfo));
    }

    // --- [ vmaDestroyBuffer ] ---

    /** Unsafe version of: {@link #vmaDestroyBuffer DestroyBuffer} */
    public static native void nvmaDestroyBuffer(long allocator, long buffer, long allocation);

    /**
     * Destroys Vulkan buffer and frees allocated memory.
     * 
     * <p>This is just a convenience function equivalent to:</p>
     * 
     * <pre><code>
     * vkDestroyBuffer(device, buffer, allocationCallbacks);
     * vmaFreeMemory(allocator, allocation);</code></pre>
     * 
     * <p>It it safe to pass null as buffer and/or allocation.</p>
     */
    public static void vmaDestroyBuffer(@NativeType("VmaAllocator") long allocator, @NativeType("VkBuffer") long buffer, @NativeType("VmaAllocation") long allocation) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaDestroyBuffer(allocator, buffer, allocation);
    }

    // --- [ vmaCreateImage ] ---

    /** Unsafe version of: {@link #vmaCreateImage CreateImage} */
    public static native int nvmaCreateImage(long allocator, long pImageCreateInfo, long pAllocationCreateInfo, long pImage, long pAllocation, long pAllocationInfo);

    /**
     * Function similar to {@link #vmaCreateBuffer CreateBuffer}.
     *
     * @param pImage          image that was created
     * @param pAllocation     allocation that was created
     * @param pAllocationInfo information about allocated memory. Optional. It can be later fetched using function {@link #vmaGetAllocationInfo GetAllocationInfo}.
     */
    @NativeType("VkResult")
    public static int vmaCreateImage(@NativeType("VmaAllocator") long allocator, @NativeType("VkImageCreateInfo const *") VkImageCreateInfo pImageCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("VkImage *") LongBuffer pImage, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @Nullable @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(pImage, 1);
            check(pAllocation, 1);
        }
        return nvmaCreateImage(allocator, pImageCreateInfo.address(), pAllocationCreateInfo.address(), memAddress(pImage), memAddress(pAllocation), memAddressSafe(pAllocationInfo));
    }

    // --- [ vmaDestroyImage ] ---

    /** Unsafe version of: {@link #vmaDestroyImage DestroyImage} */
    public static native void nvmaDestroyImage(long allocator, long image, long allocation);

    /**
     * Destroys Vulkan image and frees allocated memory.
     * 
     * <p>This is just a convenience function equivalent to:</p>
     * 
     * <pre><code>
     * vkDestroyImage(device, image, allocationCallbacks);
     * vmaFreeMemory(allocator, allocation);</code></pre>
     * 
     * <p>It it safe to pass null as image and/or allocation.</p>
     */
    public static void vmaDestroyImage(@NativeType("VmaAllocator") long allocator, @NativeType("VkImage") long image, @NativeType("VmaAllocation") long allocation) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaDestroyImage(allocator, image, allocation);
    }

    // --- [ vmaCreateVirtualBlock ] ---

    /** Unsafe version of: {@link #vmaCreateVirtualBlock CreateVirtualBlock} */
    public static native int nvmaCreateVirtualBlock(long pCreateInfo, long pVirtualBlock);

    /**
     * Creates new {@code VmaVirtualBlock} object.
     *
     * @param pCreateInfo   parameters for creation
     * @param pVirtualBlock returned virtual block object or {@code NULL} if creation failed
     */
    @NativeType("VkResult")
    public static int vmaCreateVirtualBlock(@NativeType("VmaVirtualBlockCreateInfo const *") VmaVirtualBlockCreateInfo pCreateInfo, @NativeType("VmaVirtualBlock *") PointerBuffer pVirtualBlock) {
        if (CHECKS) {
            check(pVirtualBlock, 1);
        }
        return nvmaCreateVirtualBlock(pCreateInfo.address(), memAddress(pVirtualBlock));
    }

    // --- [ vmaDestroyVirtualBlock ] ---

    /** Unsafe version of: {@link #vmaDestroyVirtualBlock DestroyVirtualBlock} */
    public static native void nvmaDestroyVirtualBlock(long virtualBlock);

    /**
     * Destroys {@code VmaVirtualBlock} object.
     * 
     * <p>Please note that you should consciously handle virtual allocations that could remain unfreed in the block. You should either free them individually
     * using {@link #vmaVirtualFree VirtualFree} or call {@link #vmaClearVirtualBlock ClearVirtualBlock} if you are sure this is what you want. If you do neither, an assert is called.</p>
     * 
     * <p>If you keep pointers to some additional metadata associated with your virtual allocations in their {@code pUserData}, don't forget to free them.</p>
     */
    public static void vmaDestroyVirtualBlock(@NativeType("VmaVirtualBlock") long virtualBlock) {
        if (CHECKS) {
            check(virtualBlock);
        }
        nvmaDestroyVirtualBlock(virtualBlock);
    }

    // --- [ vmaIsVirtualBlockEmpty ] ---

    /** Unsafe version of: {@link #vmaIsVirtualBlockEmpty IsVirtualBlockEmpty} */
    public static native int nvmaIsVirtualBlockEmpty(long virtualBlock);

    /** Returns true of the {@code VmaVirtualBlock} is empty - contains 0 virtual allocations and has all its space available for new allocations. */
    @NativeType("VkBool32")
    public static boolean vmaIsVirtualBlockEmpty(@NativeType("VmaVirtualBlock") long virtualBlock) {
        if (CHECKS) {
            check(virtualBlock);
        }
        return nvmaIsVirtualBlockEmpty(virtualBlock) != 0;
    }

    // --- [ vmaGetVirtualAllocationInfo ] ---

    /** Unsafe version of: {@link #vmaGetVirtualAllocationInfo GetVirtualAllocationInfo} */
    public static native void nvmaGetVirtualAllocationInfo(long virtualBlock, long allocation, long pVirtualAllocInfo);

    /** Returns information about a specific virtual allocation within a virtual block, like its size and {@code pUserData} pointer. */
    public static void vmaGetVirtualAllocationInfo(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaVirtualAllocation") long allocation, @NativeType("VmaVirtualAllocationInfo *") VmaVirtualAllocationInfo pVirtualAllocInfo) {
        if (CHECKS) {
            check(virtualBlock);
            check(allocation);
        }
        nvmaGetVirtualAllocationInfo(virtualBlock, allocation, pVirtualAllocInfo.address());
    }

    // --- [ vmaVirtualAllocate ] ---

    /** Unsafe version of: {@link #vmaVirtualAllocate VirtualAllocate} */
    public static native int nvmaVirtualAllocate(long virtualBlock, long pCreateInfo, long pAllocation, long pOffset);

    /**
     * Allocates new virtual allocation inside given {@code VmaVirtualBlock}.
     * 
     * <p>If the allocation fails due to not enough free space available, {@code VK_ERROR_OUT_OF_DEVICE_MEMORY} is returned (despite the function doesn't ever
     * allocate actual GPU memory). {@code pAllocation} is then set to {@code VK_NULL_HANDLE} and {@code pOffset}, if not null, it set to {@code UINT64_MAX}.</p>
     *
     * @param virtualBlock virtual block
     * @param pCreateInfo  parameters for the allocation
     * @param pOffset      returned offset of the new allocation. Optional, can be null.
     */
    @NativeType("VkResult")
    public static int vmaVirtualAllocate(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaVirtualAllocationCreateInfo const *") VmaVirtualAllocationCreateInfo pCreateInfo, @NativeType("VmaVirtualAllocation *") PointerBuffer pAllocation, @Nullable @NativeType("VkDeviceSize *") LongBuffer pOffset) {
        if (CHECKS) {
            check(virtualBlock);
            check(pAllocation, 1);
            checkSafe(pOffset, 1);
        }
        return nvmaVirtualAllocate(virtualBlock, pCreateInfo.address(), memAddress(pAllocation), memAddressSafe(pOffset));
    }

    // --- [ vmaVirtualFree ] ---

    /** Unsafe version of: {@link #vmaVirtualFree VirtualFree} */
    public static native void nvmaVirtualFree(long virtualBlock, long allocation);

    /**
     * Frees virtual allocation inside given {@code VmaVirtualBlock}.
     * 
     * <p>It is correct to call this function with {@code allocation == VK_NULL_HANDLE} - it does nothing.</p>
     */
    public static void vmaVirtualFree(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaVirtualAllocation") long allocation) {
        if (CHECKS) {
            check(virtualBlock);
        }
        nvmaVirtualFree(virtualBlock, allocation);
    }

    // --- [ vmaClearVirtualBlock ] ---

    /** Unsafe version of: {@link #vmaClearVirtualBlock ClearVirtualBlock} */
    public static native void nvmaClearVirtualBlock(long virtualBlock);

    /**
     * Frees all virtual allocations inside given {@code VmaVirtualBlock}.
     * 
     * <p>You must either call this function or free each virtual allocation individually with {@link #vmaVirtualFree VirtualFree} before destroying a virtual block. Otherwise, an
     * assert is called.</p>
     * 
     * <p>If you keep pointer to some additional metadata associated with your virtual allocation in its {@code pUserData}, don't forget to free it as well.</p>
     */
    public static void vmaClearVirtualBlock(@NativeType("VmaVirtualBlock") long virtualBlock) {
        if (CHECKS) {
            check(virtualBlock);
        }
        nvmaClearVirtualBlock(virtualBlock);
    }

    // --- [ vmaSetVirtualAllocationUserData ] ---

    /** Unsafe version of: {@link #vmaSetVirtualAllocationUserData SetVirtualAllocationUserData} */
    public static native void nvmaSetVirtualAllocationUserData(long virtualBlock, long allocation, long pUserData);

    /** Changes custom pointer associated with given virtual allocation. */
    public static void vmaSetVirtualAllocationUserData(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaVirtualAllocation") long allocation, @NativeType("void *") long pUserData) {
        if (CHECKS) {
            check(virtualBlock);
            check(allocation);
            check(pUserData);
        }
        nvmaSetVirtualAllocationUserData(virtualBlock, allocation, pUserData);
    }

    // --- [ vmaCalculateVirtualBlockStats ] ---

    /** Unsafe version of: {@link #vmaCalculateVirtualBlockStats CalculateVirtualBlockStats} */
    public static native void nvmaCalculateVirtualBlockStats(long virtualBlock, long pStatInfo);

    /** Calculates and returns statistics about virtual allocations and memory usage in given {@code VmaVirtualBlock}. */
    public static void vmaCalculateVirtualBlockStats(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaStatInfo *") VmaStatInfo pStatInfo) {
        if (CHECKS) {
            check(virtualBlock);
        }
        nvmaCalculateVirtualBlockStats(virtualBlock, pStatInfo.address());
    }

    // --- [ vmaBuildVirtualBlockStatsString ] ---

    /** Unsafe version of: {@link #vmaBuildVirtualBlockStatsString BuildVirtualBlockStatsString} */
    public static native void nvmaBuildVirtualBlockStatsString(long virtualBlock, long ppStatsString, int detailedMap);

    /**
     * Builds and returns a null-terminated string in JSON format with information about given {@code VmaVirtualBlock}.
     * 
     * <p>Returned string must be freed using {@link #vmaFreeVirtualBlockStatsString FreeVirtualBlockStatsString}.</p>
     *
     * @param virtualBlock  virtual block
     * @param ppStatsString returned string
     * @param detailedMap   pass {@code VK_FALSE} to only obtain statistics as returned by {@link #vmaCalculateVirtualBlockStats CalculateVirtualBlockStats}. Pass {@code VK_TRUE} to also obtain full list of
     *                      allocations and free spaces.
     */
    public static void vmaBuildVirtualBlockStatsString(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("char **") PointerBuffer ppStatsString, @NativeType("VkBool32") boolean detailedMap) {
        if (CHECKS) {
            check(virtualBlock);
            check(ppStatsString, 1);
        }
        nvmaBuildVirtualBlockStatsString(virtualBlock, memAddress(ppStatsString), detailedMap ? 1 : 0);
    }

    // --- [ vmaFreeVirtualBlockStatsString ] ---

    /** Unsafe version of: {@link #vmaFreeVirtualBlockStatsString FreeVirtualBlockStatsString} */
    public static native void nvmaFreeVirtualBlockStatsString(long virtualBlock, long pStatsString);

    /** Frees a string returned by {@link #vmaBuildVirtualBlockStatsString BuildVirtualBlockStatsString}. */
    public static void vmaFreeVirtualBlockStatsString(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("char *") ByteBuffer pStatsString) {
        if (CHECKS) {
            check(virtualBlock);
        }
        nvmaFreeVirtualBlockStatsString(virtualBlock, memAddress(pStatsString));
    }

    // --- [ vmaBuildStatsString ] ---

    /** Unsafe version of: {@link #vmaBuildStatsString BuildStatsString} */
    public static native void nvmaBuildStatsString(long allocator, long ppStatsString, int detailedMap);

    /**
     * Builds and returns statistics as a null-terminated string in JSON format.
     *
     * @param ppStatsString must be freed using {@link #vmaFreeStatsString FreeStatsString} function
     */
    public static void vmaBuildStatsString(@NativeType("VmaAllocator") long allocator, @NativeType("char **") PointerBuffer ppStatsString, @NativeType("VkBool32") boolean detailedMap) {
        if (CHECKS) {
            check(allocator);
            check(ppStatsString, 1);
        }
        nvmaBuildStatsString(allocator, memAddress(ppStatsString), detailedMap ? 1 : 0);
    }

    // --- [ vmaFreeStatsString ] ---

    public static native void nvmaFreeStatsString(long allocator, long pStatsString);

    public static void vmaFreeStatsString(@NativeType("VmaAllocator") long allocator, @NativeType("char *") ByteBuffer pStatsString) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaFreeStatsString(allocator, memAddress(pStatsString));
    }

}