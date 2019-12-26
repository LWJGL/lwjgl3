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
 * <li>Initialize Vulkan to have {@code VkPhysicalDevice} and {@code VkDevice} object.</li>
 * <li>Fill {@link VmaAllocatorCreateInfo} structure and create {@code VmaAllocator} object by calling {@link #vmaCreateAllocator CreateAllocator}.</li>
 * </ol>
 * 
 * <pre><code>
 * VmaAllocatorCreateInfo allocatorInfo = {};
 * allocatorInfo.physicalDevice = physicalDevice;
 * allocatorInfo.device = device;
 * 
 * VmaAllocator allocator;
 * vmaCreateAllocator(&amp;allocatorInfo, &amp;allocator);</code></pre>
 * 
 * <h4>Resource allocation</h4>
 * 
 * <p>When you want to create a buffer or image:</p>
 * 
 * <ol>
 * <li>Fill {@code VkBufferCreateInfo} / {@code VkImageCreateInfo} structure.</li>
 * <li>Fill {@code VmaAllocationCreateInfo} structure.</li>
 * <li>Call {@link #vmaCreateBuffer CreateBuffer} / {@link #vmaCreateImage CreateImage} to get {@code VkBuffer}/{@code VkImage} with memory already allocated and bound to it.</li>
 * </ol>
 * 
 * <pre><code>
 * VkBufferCreateInfo bufferInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 * bufferInfo.size = 65536;
 * bufferInfo.usage = VK_BUFFER_USAGE_VERTEX_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;
 * 
 * VmaAllocationCreateInfo allocInfo = {};
 * allocInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY;
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
 * <li>If you just want to find memory type index that meets your requirements, you can use function: {@link #vmaFindMemoryTypeIndex FindMemoryTypeIndex},
 * {@link #vmaFindMemoryTypeIndexForBufferInfo FindMemoryTypeIndexForBufferInfo}, {@link #vmaFindMemoryTypeIndexForImageInfo FindMemoryTypeIndexForImageInfo}.</li>
 * <li>If you want to allocate a region of device memory without association with any specific image or buffer, you can use function {@link #vmaAllocateMemory AllocateMemory}.
 * Usage of this function is not recommended and usually not needed. {@link #vmaAllocateMemoryPages AllocateMemoryPages} function is also provided for creating multiple
 * allocations at once, which may be useful for sparse binding.</li>
 * <li>If you already have a buffer or an image created, you want to allocate memory for it and then you will bind it yourself, you can use function
 * {@link #vmaAllocateMemoryForBuffer AllocateMemoryForBuffer}, {@link #vmaAllocateMemoryForImage AllocateMemoryForImage}. For binding you should use functions: {@link #vmaBindBufferMemory BindBufferMemory}, {@link #vmaBindImageMemory BindImageMemory} or their
 * extended versions: {@link #vmaBindBufferMemory2 BindBufferMemory2}, {@link #vmaBindImageMemory2 BindImageMemory2}.</li>
 * <li>If you want to create a buffer or an image, allocate memory for it and bind them together, all in one call, you can use function {@link #vmaCreateBuffer CreateBuffer},
 * {@link #vmaCreateImage CreateImage}. This is the easiest and recommended way to use this library.</li>
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
 * {@code VmaMemoryUsage}. It defines high level, common usage types. For more details, see description of this enum.</p>
 * 
 * <p>For example, if you want to create a uniform buffer that will be filled using transfer only once or infrequently and used for rendering every frame,
 * you can do it using following code:</p>
 * 
 * <pre><code>
 * VkBufferCreateInfo bufferInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 * bufferInfo.size = 65536;
 * bufferInfo.usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;
 * 
 * VmaAllocationCreateInfo allocInfo = {};
 * allocInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY;
 * 
 * VkBuffer buffer;
 * VmaAllocation allocation;
 * vmaCreateBuffer(allocator, &amp;bufferInfo, &amp;allocInfo, &amp;buffer, &amp;allocation, nullptr);</code></pre>
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
 * allocInfo.flags = VMA_ALLOCATION_CREATE_MAPPED_BIT;
 * 
 * VkBuffer buffer;
 * VmaAllocation allocation;
 * vmaCreateBuffer(allocator, &amp;bufferInfo, &amp;allocInfo, &amp;buffer, &amp;allocation, nullptr);</code></pre>
 * 
 * <p>A memory type is chosen that has all the required flags and as many preferred flags set as possible.</p>
 * 
 * <p>If you use {@link VmaAllocationCreateInfo}{@code ::usage}, it is just internally converted to a set of required and preferred flags.</p>
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
 * <p>Memory for allocations is reserved out of larger block of {@code VkDeviceMemory} allocated from Vulkan internally. That's the main feature of this
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
 * <h4>Mapping functions</h4>
 * 
 * <p>The library provides following functions for mapping of a specific {@code VmaAllocation}: {@link #vmaMapMemory MapMemory}, {@link #vmaUnmapMemory UnmapMemory}. They are safer and more
 * convenient to use than standard Vulkan functions. You can map an allocation multiple times simultaneously - mapping is reference-counted internally.
 * You can also map different allocations simultaneously regardless of whether they use the same {@code VkDeviceMemory} block. The way it's implemented is
 * that the library always maps entire memory block, not just region of the allocation. For further details, see description of {@link #vmaMapMemory MapMemory} function.
 * Example:</p>
 * 
 * <pre><code>
 * // Having these objects initialized:
 * 
 * struct ConstantBuffer
 * {
 *     ...
 * };
 * ConstantBuffer constantBufferData;
 * 
 * VmaAllocator allocator;
 * VkBuffer constantBuffer;
 * VmaAllocation constantBufferAllocation;
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
 * allocCreateInfo.usage = VMA_MEMORY_USAGE_CPU_ONLY;
 * allocCreateInfo.flags = VMA_ALLOCATION_CREATE_MAPPED_BIT;
 * 
 * VkBuffer buf;
 * VmaAllocation alloc;
 * VmaAllocationInfo allocInfo;
 * vmaCreateBuffer(allocator, &amp;bufCreateInfo, &amp;allocCreateInfo, &amp;buf, &amp;alloc, &amp;allocInfo);
 * 
 * // Buffer is already mapped. You can access its memory.
 * memcpy(allocInfo.pMappedData, &amp;constantBufferData, sizeof(constantBufferData));</code></pre>
 * 
 * <p>There are some exceptions though, when you should consider mapping memory only for a short period of time:</p>
 * 
 * <ul>
 * <li>When operating system is Windows 7 or 8.x (Windows 10 is not affected because it uses WDDM2), device is discrete AMD GPU, and memory type is the
 * special 256 MiB pool of {@code DEVICE_LOCAL + HOST_VISIBLE} memory (selected when you use {@link #VMA_MEMORY_USAGE_CPU_TO_GPU MEMORY_USAGE_CPU_TO_GPU}), then whenever a memory block
 * allocated from this memory type stays mapped for the time of any call to {@code vkQueueSubmit()} or {@code vkQueuePresentKHR()}, this block is
 * migrated by WDDM to system RAM, which degrades performance. It doesn't matter if that particular memory block is actually used by the command
 * buffer being submitted.</li>
 * <li>On Mac/MoltenVK there is a known bug - <a href="https://github.com/KhronosGroup/MoltenVK/issues/175">Issue #175</a> which requires unmapping
 * before GPU can see updated texture.</li>
 * <li>Keeping many large memory blocks mapped may impact performance or stability of some debugging tools.</li>
 * </ul>
 * 
 * <h4>Cache flush and invalidate</h4>
 * 
 * <p>Memory in Vulkan doesn't need to be unmapped before using it on GPU, but unless a memory types has {@code VK_MEMORY_PROPERTY_HOST_COHERENT_BIT} flag
 * set, you need to manually <b>invalidate</b> cache before reading of mapped pointer and <b>flush</b> cache after writing to mapped pointer. Map/unmap
 * operations don't do that automatically. Vulkan provides following functions for this purpose {@code vkFlushMappedMemoryRangs()},
 * {@code vkInvalidateMappedMemoryRanges()}, but this library provides more convenient functions that refer to given allocation object:
 * {@link #vmaFlushAllocation FlushAllocation}, {@link #vmaInvalidateAllocation InvalidateAllocation}.</p>
 * 
 * <p>Regions of memory specified for flush/invalidate must be aligned to {@code VkPhysicalDeviceLimits::nonCoherentAtomSize}. This is automatically ensured
 * by the library. In any memory type that is {@code HOST_VISIBLE} but not {@code HOST_COHERENT}, all allocations within blocks are aligned to this value,
 * so their offsets are always multiply of {@code nonCoherentAtomSize} and two different allocations never share same "line" of this size.</p>
 * 
 * <p>Please note that memory allocated with {@link #VMA_MEMORY_USAGE_CPU_ONLY MEMORY_USAGE_CPU_ONLY} is guaranteed to be {@code HOST_COHERENT}.</p>
 * 
 * <p>Also, Windows drivers from all 3 <b>PC</b> GPU vendors (AMD, Intel, NVIDIA) currently provide {@code HOST_COHERENT} flag on all memory types that are
 * {@code HOST_VISIBLE}, so on this platform you may not need to bother.</p>
 * 
 * <h4>Finding out if memory is mappable</h4>
 * 
 * <p>It may happen that your allocation ends up in memory that is {@code HOST_VISIBLE} (available for mapping) despite it wasn't explicitly requested. For
 * example, application may work on integrated graphics with unified memory (like Intel) or allocation from video memory might have failed, so the library
 * chose system memory as fallback.</p>
 * 
 * <p>You can detect this case and map such allocation to access its memory on CPU directly, instead of launching a transfer operation. In order to do that:
 * inspect {@code allocInfo.memoryType}, call {@link #vmaGetMemoryTypeProperties GetMemoryTypeProperties}, and look for {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT} flag in properties of
 * that memory type.</p>
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
 * VmaAllocationInfo allocInfo;
 * vmaCreateBuffer(allocator, &amp;bufCreateInfo, &amp;allocCreateInfo, &amp;buf, &amp;alloc, &amp;allocInfo);
 * 
 * VkMemoryPropertyFlags memFlags;
 * vmaGetMemoryTypeProperties(allocator, allocInfo.memoryType, &amp;memFlags);
 * if((memFlags &amp; VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT) == 0)
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
 * if(allocInfo.pUserData != nullptr)
 * {
 *     // Allocation ended up in mappable memory.
 *     // It's persistently mapped. You can access it directly.
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
 * <p>When developing a graphics-intensive game or program, it is important to avoid allocating more GPU memory than it's physically available. When the
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
 * <p>To query for current memory usage and available budget, use function {@link #vmaGetBudget GetBudget}. Returned structure {@link VmaBudget} contains quantities expressed in
 * bytes, per Vulkan memory heap.</p>
 * 
 * <p>Please note that this function returns different information and works faster than {@link #vmaCalculateStats CalculateStats}. {@code vmaGetBudget()} can be called every frame
 * or even before every allocation, while {@code vmaCalculateStats()} is intended to be used rarely, only to obtain statistical information, e.g. for
 * debugging purposes.</p>
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
 * With it, the allocation is not made if it would exceed the budget or if the budget is already exceeded. Some other allocations become lost instead to
 * make room for it, if the mechanism of lost allocations is used. If that is not possible, the allocation fails with
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
 * <h4>Choosing memory type index</h4>
 * 
 * <p>When creating a pool, you must explicitly specify memory type index. To find the one suitable for your buffers or images, you can use helper functions
 * {@link #vmaFindMemoryTypeIndexForBufferInfo FindMemoryTypeIndexForBufferInfo}, {@link #vmaFindMemoryTypeIndexForImageInfo FindMemoryTypeIndexForImageInfo}. You need to provide structures with example parameters of buffers or images
 * that you are going to create in that pool.</p>
 * 
 * <pre><code>
 * VkBufferCreateInfo exampleBufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 * exampleBufCreateInfo.size = 1024; // Whatever.
 * exampleBufCreateInfo.usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT; // Change if needed.
 * 
 * VmaAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY; // Change if needed.
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
 * <p>Pools with linear algorithm support lost allocations when used as ring buffer. If there is not enough free space for a new allocation, but existing
 * allocations from the front of the queue can become lost, they become lost and the allocation succeeds.</p>
 * 
 * <p>Ring buffer is available only in pools with one memory block - {@link VmaPoolCreateInfo}{@code ::maxBlockCount} must be 1. Otherwise behavior is undefined.</p>
 * 
 * <h4>Buddy allocation algorithm</h4>
 * 
 * <p>There is another allocation algorithm that can be used with custom pools, called "buddy". Its internal data structure is based on a tree of blocks,
 * each having size that is a power of two and a half of its parent's size. When you want to allocate memory of certain size, a free node in the tree is
 * located. If it's too large, it is recursively split into two halves (called "buddies"). However, if requested allocation size is not a power of two,
 * the size of a tree node is aligned up to the nearest power of two and the remaining space is wasted. When two buddy nodes become free, they are merged
 * back into one larger node.</p>
 * 
 * <p>The advantage of buddy allocation algorithm over default algorithm is faster allocation and deallocation, as well as smaller external fragmentation.
 * The disadvantage is more wasted space (internal fragmentation).</p>
 * 
 * <p>For more information, please read <a href="https://en.wikipedia.org/wiki/Buddy_memory_allocation">"Buddy memory allocation" on Wikipedia</a> or other
 * sources that describe this concept in general.</p>
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
 * <li>Lost allocations don't work in such pools. You can use them, but they never become lost. Support may be added in the future.</li>
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
 * defragInfo.maxGpuBytesToMove = VK_WHOLE_SIZE; // Notice it's "GPU" this time.
 * defragInfo.maxGpuAllocationsToMove = UINT32_MAX; // Notice it's "GPU" this time.
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
 * <li>Your code needs to interact with device memory block metadata. If you need more access to its data than it's provided by its public interface,
 * declare your new class as a friend class e.g. in class {@code VmaBlockMetadata_Generic}.</li>
 * <li>If you want to create a flag that would enable your algorithm or pass some additional flags to configure it, add them to
 * {@code VmaDefragmentationFlagBits} and use them in {@code VmaDefragmentationInfo2::flags}.</li>
 * <li>Modify function {@code VmaBlockVectorDefragmentationContext::Begin} to create object of your new class whenever needed.</li>
 * </ul>
 * 
 * <h3>Lost allocations</h3>
 * 
 * <p>If your game oversubscribes video memory, it may work OK in previous-generation graphics APIs (DirectX 9, 10, 11, OpenGL) because resources are
 * automatically paged to system RAM. In Vulkan you can't do it because when you run out of memory, an allocation just fails. If you have more data (e.g.
 * textures) than can fit into VRAM and you don't need it all at once, you may want to upload them to GPU on demand and "push out" ones that are not used
 * for a long time to make room for the new ones, effectively using VRAM (or a cartain memory pool) as a form of cache. Vulkan Memory Allocator can help
 * you with that by supporting a concept of "lost allocations".</p>
 * 
 * <p>To create an allocation that can become lost, include {@link #VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT ALLOCATION_CREATE_CAN_BECOME_LOST_BIT} flag in {@link VmaAllocationCreateInfo}{@code ::flags}. Before
 * using a buffer or image bound to such allocation in every new frame, you need to query it if it's not lost. To check it, call {@link #vmaTouchAllocation TouchAllocation}. If
 * the allocation is lost, you should not use it or buffer/image bound to it. You mustn't forget to destroy this allocation and this buffer/image.
 * {@link #vmaGetAllocationInfo GetAllocationInfo} can also be used for checking status of the allocation. Allocation is lost when returned {@link VmaAllocationInfo}{@code ::deviceMemory}
 * == {@code VK_NULL_HANDLE}.</p>
 * 
 * <p>To create an allocation that can make some other allocations lost to make room for it, use {@link #VMA_ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT} flag. You will
 * usually use both flags {@link #VMA_ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT} and {@link #VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT ALLOCATION_CREATE_CAN_BECOME_LOST_BIT} at the same time.</p>
 * 
 * <p>Warning! Current implementation uses quite naive, brute force algorithm, which can make allocation calls that use
 * {@link #VMA_ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT} flag quite slow. A new, more optimal algorithm and data structure to speed this up is planned for the
 * future.</p>
 * 
 * <p><b>Q: When interleaving creation of new allocations with usage of existing ones, how do you make sure that an allocation won't become lost while it's used
 * in the current frame?</b></p>
 * 
 * <p>It is ensured because {@link #vmaTouchAllocation TouchAllocation} / {@link #vmaGetAllocationInfo GetAllocationInfo} not only returns allocation status/parameters and checks whether it's not lost, but
 * when it's not, it also atomically marks it as used in the current frame, which makes it impossible to become lost in that frame. It uses lockless
 * algorithm, so it works fast and doesn't involve locking any internal mutex.</p>
 * 
 * <p><b>Q: What if my allocation may still be in use by the GPU when it's rendering a previous frame while I already submit new frame on the CPU?</b></p>
 * 
 * <p>You can make sure that allocations "touched" by {@link #vmaTouchAllocation TouchAllocation} / {@link #vmaGetAllocationInfo GetAllocationInfo} will not become lost for a number of additional frames back
 * from the current one by specifying this number as {@link VmaAllocatorCreateInfo}{@code ::frameInUseCount} (for default memory pool) and
 * {@link VmaPoolCreateInfo}{@code ::frameInUseCount} (for custom pool).</p>
 * 
 * <p><b>Q: How do you inform the library when new frame starts?</b></p>
 * 
 * <p>You need to call function {@link #vmaSetCurrentFrameIndex SetCurrentFrameIndex}.</p>
 * 
 * <p>Example code:</p>
 * 
 * <pre><code>
 * struct MyBuffer
 * {
 *     VkBuffer m_Buf = nullptr;
 *     VmaAllocation m_Alloc = nullptr;
 * 
 *     // Called when the buffer is really needed in the current frame.
 *     void EnsureBuffer();
 * };
 * 
 * void MyBuffer::EnsureBuffer()
 * {
 *     // Buffer has been created.
 *     if(m_Buf != VK_NULL_HANDLE)
 *     {
 *         // Check if its allocation is not lost + mark it as used in current frame.
 *         if(vmaTouchAllocation(allocator, m_Alloc))
 *         {
 *             // It's all OK - safe to use m_Buf.
 *             return;
 *         }
 *     }
 * 
 *     // Buffer not yet exists or lost - destroy and recreate it.
 * 
 *     vmaDestroyBuffer(allocator, m_Buf, m_Alloc);
 * 
 *     VkBufferCreateInfo bufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 *     bufCreateInfo.size = 1024;
 *     bufCreateInfo.usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;
 * 
 *     VmaAllocationCreateInfo allocCreateInfo = {};
 *     allocCreateInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY;
 *     allocCreateInfo.flags = VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT |
 *         VMA_ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT;
 * 
 *     vmaCreateBuffer(allocator, &amp;bufCreateInfo, &amp;allocCreateInfo, &amp;m_Buf, &amp;m_Alloc, nullptr);
 * }</code></pre>
 * 
 * <p>When using lost allocations, you may see some Vulkan validation layer warnings about overlapping regions of memory bound to different kinds of buffers
 * and images. This is still valid as long as you implement proper handling of lost allocations (like in the example above) and don't use them.</p>
 * 
 * <p>You can create an allocation that is already in lost state from the beginning using function {@link #vmaCreateLostAllocation CreateLostAllocation}. It may be useful if you need a
 * "dummy" allocation that is not null.</p>
 * 
 * <p>You can call function {@link #vmaMakePoolAllocationsLost MakePoolAllocationsLost} to set all eligible allocations in a specified custom pool to lost state. Allocations that have been
 * "touched" in current frame or {@link VmaPoolCreateInfo}{@code ::frameInUseCount} frames back cannot become lost.</p>
 * 
 * <p><b>Q: Can I touch allocation that cannot become lost?</b></p>
 * 
 * <p>Yes, although it has no visible effect. Calls to {@link #vmaGetAllocationInfo GetAllocationInfo} and {@link #vmaTouchAllocation TouchAllocation} update last use frame index also for allocations that
 * cannot become lost, but the only way to observe it is to dump internal allocator state using {@link #vmaBuildStatsString BuildStatsString}. You can use this feature for
 * debugging purposes to explicitly mark allocations that you use in current frame and then analyze JSON dump to see for how long each allocation stays
 * unused.</p>
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
 * field when creating an allocation. It's an opaque {@code void*} pointer. You can use it e.g. as a pointer, some handle, index, key, ordinal number or
 * any other value that would associate the allocation with your custom metadata.</p>
 * 
 * <pre><code>
 * VkBufferCreateInfo bufferInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
 * // Fill bufferInfo...
 * 
 * MyBufferMetadata* pMetadata = CreateBufferMetadata();
 * 
 * VmaAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY;
 * allocCreateInfo.pUserData = pMetadata;
 * 
 * VkBuffer buffer;
 * VmaAllocation allocation;
 * vmaCreateBuffer(allocator, &amp;bufferInfo, &amp;allocCreateInfo, &amp;buffer, &amp;allocation, nullptr);</code></pre>
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
 * <p>Values of (non-zero) allocations' {@code pUserData} are printed in JSON report created by {@link #vmaBuildStatsString BuildStatsString}, in hexadecimal form.</p>
 * 
 * <h4>Allocation names</h4>
 * 
 * <p>There is alternative mode available where {@code pUserData} pointer is used to point to a null-terminated string, giving a name to the allocation. To
 * use this mode, set {@link #VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT} flag in {@link VmaAllocationCreateInfo}{@code ::flags}. Then {@code pUserData} passed as
 * {@link VmaAllocationCreateInfo}{@code ::pUserData} or argument to {@link #vmaSetAllocationUserData SetAllocationUserData} must be either null or pointer to a null-terminated string. The
 * library creates internal copy of the string, so the pointer you pass doesn't need to be valid for whole lifetime of the allocation. You can free it
 * after the call.</p>
 * 
 * <pre><code>
 * VkImageCreateInfo imageInfo = { VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO };
 * // Fill imageInfo...
 * 
 * std::string imageName = "Texture: ";
 * imageName += fileName;
 * 
 * VmaAllocationCreateInfo allocCreateInfo = {};
 * allocCreateInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY;
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
 * <p>Memory initialization works only with memory types that are {@code HOST_VISIBLE}. It works also with dedicated allocations. It doesn't work with
 * allocations created with {@link #VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT ALLOCATION_CREATE_CAN_BECOME_LOST_BIT} flag, as they cannot be mapped.</p>
 * 
 * <h4>Margins</h4>
 * 
 * <p>By default, allocations are laid out in memory blocks next to each other if possible (considering required alignment, {@code bufferImageGranularity},
 * and {@code nonCoherentAtomSize}).</p>
 * 
 * <p>Define macro {@code VMA_DEBUG_MARGIN} to some non-zero value (e.g. 16) to enforce specified number of bytes as a margin before and after every
 * allocation.</p>
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
 * <h4>Corruption detection</h4>
 * 
 * <p>You can additionally define macro {@code VMA_DEBUG_DETECT_CORRUPTION} to 1 to enable validation of contents of the margins.</p>
 * 
 * <p>When this feature is enabled, number of bytes specified as {@code VMA_DEBUG_MARGIN} (it must be multiple of 4) before and after every allocation is
 * filled with a magic number. This idea is also know as "canary". Memory is automatically mapped and unmapped if necessary.</p>
 * 
 * <p>This number is validated automatically when the allocation is destroyed. If it's not equal to the expected value, {@code VMA_ASSERT()} is executed. It
 * clearly means that either CPU or GPU overwritten the memory outside of boundaries of the allocation, which indicates a serious bug.</p>
 * 
 * <p>You can also explicitly request checking margins of all allocations in all memory blocks that belong to specified memory types by using function
 * {@link #vmaCheckCorruption CheckCorruption}, or in memory blocks that belong to specified custom pool, by using function {@link #vmaCheckPoolCorruption CheckPoolCorruption}.</p>
 * 
 * <p>Margin validation (corruption detection) works only for memory types that are {@code HOST_VISIBLE} and {@code HOST_COHERENT}.</p>
 * 
 * <h3>Record and replay</h3>
 * 
 * <h4>Introduction</h4>
 * 
 * <p>While using the library, sequence of calls to its functions together with their parameters can be recorded to a file and later replayed using
 * standalone player application. It can be useful to:</p>
 * 
 * <ul>
 * <li>Test correctness - check if same sequence of calls will not cause crash or failures on a target platform.</li>
 * <li>Gather statistics - see number of allocations, peak memory usage, number of calls etc.</li>
 * <li>Benchmark performance - see how much time it takes to replay the whole sequence.</li>
 * </ul>
 * 
 * <h4>Usage</h4>
 * 
 * <p>Recording functionality is disabled by default. To enable it, define following macro before every include of this library:</p>
 * 
 * <pre><code>
 * #define VMA_RECORDING_ENABLED 1</code></pre>
 * 
 * <p><b>To record sequence of calls to a file:</b> Fill in {@link VmaAllocatorCreateInfo}{@code ::pRecordSettings} member while creating {@code VmaAllocator}
 * object. File is opened and written during whole lifetime of the allocator.</p>
 * 
 * <p><b>To replay file:</b> Use {@code VmaReplay} - standalone command-line program. Precompiled binary can be found in "bin" directory. Its source can be
 * found in "src/VmaReplay" directory. Its project is generated by Premake. Command line syntax is printed when the program is launched without parameters.
 * Basic usage:</p>
 * 
 * <pre><code>
 * VmaReplay.exe MyRecording.csv</code></pre>
 * 
 * <p><b>Documentation of file format</b> can be found in file: "docs/Recording file format.md". It's a human-readable, text file in CSV format (Comma
 * Separated Values).</p>
 * 
 * <h4>Additional considerations</h4>
 * 
 * <ul>
 * <li>Replaying file that was recorded on a different GPU (with different parameters like {@code bufferImageGranularity}, {@code nonCoherentAtomSize},
 * and especially different set of memory heaps and types) may give different performance and memory usage results, as well as issue some warnings and
 * errors.</li>
 * <li>Current implementation of recording in VMA, as well as {@code VmaReplay} application, is coded and tested only on Windows. Inclusion of recording
 * code is driven by {@code VMA_RECORDING_ENABLED} macro. Support for other platforms should be easy to add. Contributions are welcomed.</li>
 * </ul>
 * 
 * <h3>Recommended usage patterns</h3>
 * 
 * <p>See also slides from talk: <a href="https://www.gdcvault.com/play/1025458/Advanced-Graphics-Techniques-Tutorial-New">Sawicki, Adam. Advanced Graphics
 * Techniques Tutorial: Memory management in Vulkan and DX12. Game Developers Conference, 2018</a></p>
 * 
 * <h4>Common mistakes</h4>
 * 
 * <p><b>Use of {@code CPU_TO_GPU} instead of {@code CPU_ONLY} memory</b></p>
 * 
 * <p>{@link #VMA_MEMORY_USAGE_CPU_TO_GPU MEMORY_USAGE_CPU_TO_GPU} is recommended only for resources that will be mapped and written by the CPU, as well as read directly by the GPU - like some
 * buffers or textures updated every frame (dynamic). If you create a staging copy of a resource to be written by CPU and then used as a source of
 * transfer to another resource placed in the GPU memory, that staging resource should be created with {@link #VMA_MEMORY_USAGE_CPU_ONLY MEMORY_USAGE_CPU_ONLY}. Please read the
 * descriptions of these enums carefully for details.</p>
 * 
 * <p><b>Unnecessary use of custom pools</b></p>
 * 
 * <p>Custom memory pools may be useful for special purposes - when you want to keep certain type of resources separate e.g. to reserve minimum amount of
 * memory for them, limit maximum amount of memory they can occupy, or make some of them push out the other through the mechanism of lost allocations. For
 * most resources this is not needed and so it is not recommended to create {@code VmaPool} objects and allocations out of them. Allocating from the
 * default pool is sufficient.</p>
 * 
 * <h4>Simple patterns</h4>
 * 
 * <h5>Render targets</h5>
 * 
 * <p><b>When:</b> Any resources that you frequently write and read on GPU, e.g. images used as color attachments (aka "render targets"), depth-stencil
 * attachments, images/buffers used as storage image/buffer (aka "Unordered Access View (UAV)").</p>
 * 
 * <p><b>What to do:</b> Create them in video memory that is fastest to access from GPU using {@link #VMA_MEMORY_USAGE_GPU_ONLY MEMORY_USAGE_GPU_ONLY}.</p>
 * 
 * <p>Consider using {@code VK_KHR_dedicated_allocation} extension and/or manually creating them as dedicated allocations using
 * {@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT}, especially if they are large or if you plan to destroy and recreate them e.g. when display resolution changes.
 * Prefer to create such resources first and all other GPU resources (like textures and vertex buffers) later.</p>
 * 
 * <h5>Immutable resources</h5>
 * 
 * <p><b>When:</b> Any resources that you fill on CPU only once (aka "immutable") or infrequently and then read frequently on GPU, e.g. textures, vertex and
 * index buffers, constant buffers that don't change often.</p>
 * 
 * <p><b>What to do:</b> Create them in video memory that is fastest to access from GPU using {@link #VMA_MEMORY_USAGE_GPU_ONLY MEMORY_USAGE_GPU_ONLY}.</p>
 * 
 * <p>To initialize content of such resource, create a CPU-side (aka "staging") copy of it in system memory - {@link #VMA_MEMORY_USAGE_CPU_ONLY MEMORY_USAGE_CPU_ONLY}, map it, fill it, and
 * submit a transfer from it to the GPU resource. You can keep the staging copy if you need it for another upload transfer in the future. If you don't,
 * you can destroy it or reuse this buffer for uploading different resource after the transfer finishes.</p>
 * 
 * <p>Prefer to create just buffers in system memory rather than images, even for uploading textures. Use {@code vkCmdCopyBufferToImage()}. Dont use images
 * with {@code VK_IMAGE_TILING_LINEA}R.</p>
 * 
 * <h5>Dynamic resources</h5>
 * 
 * <p><b>When:</b> Any resources that change frequently (aka "dynamic"), e.g. every frame or every draw call, written on CPU, read on GPU.</p>
 * 
 * <p><b>What to do:</b> Create them using {@link #VMA_MEMORY_USAGE_CPU_TO_GPU MEMORY_USAGE_CPU_TO_GPU}. You can map it and write to it directly on CPU, as well as read from it on GPU.</p>
 * 
 * <p>This is a more complex situation. Different solutions are possible, and the best one depends on specific GPU type, but you can use this simple approach
 * for the start. Prefer to write to such resource sequentially (e.g. using {@code memcpy}). Don't perform random access or any reads from it on CPU, as
 * it may be very slow.</p>
 * 
 * <h5>Readback</h5>
 * 
 * <p><b>When:</b> Resources that contain data written by GPU that you want to read back on CPU, e.g. results of some computations.</p>
 * 
 * <p><b>What to do:</b> Create them using {@link #VMA_MEMORY_USAGE_GPU_TO_CPU MEMORY_USAGE_GPU_TO_CPU}. You can write to them directly on GPU, as well as map and read them on CPU.</p>
 * 
 * <h4>Advanced patterns</h4>
 * 
 * <h5>Detecting integrated graphics</h5>
 * 
 * <p>You can support integrated graphics (like Intel HD Graphics, AMD APU) better by detecting it in Vulkan. To do it, call
 * {@code vkGetPhysicalDeviceProperties()}, inspect {@code VkPhysicalDeviceProperties::deviceType} and look for
 * {@code VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU}. When you find it, you can assume that memory is unified and all memory types are comparably fast to
 * access from GPU, regardless of {@code VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT}.</p>
 * 
 * <p>You can then sum up sizes of all available memory heaps and treat them as useful for your GPU resources, instead of only {@code DEVICE_LOCAL} ones. You
 * can also prefer to create your resources in memory types that are {@code HOST_VISIBLE} to map them directly instead of submitting explicit transfer
 * (see below).</p>
 * 
 * <h5>Direct access versus transfer</h5>
 * 
 * <p>For resources that you frequently write on CPU and read on GPU, many solutions are possible:</p>
 * 
 * <ol>
 * <li>Create one copy in video memory using {@link #VMA_MEMORY_USAGE_GPU_ONLY MEMORY_USAGE_GPU_ONLY}, second copy in system memory using {@link #VMA_MEMORY_USAGE_CPU_ONLY MEMORY_USAGE_CPU_ONLY} and submit explicit tranfer
 * each time.</li>
 * <li>Create just single copy using {@link #VMA_MEMORY_USAGE_CPU_TO_GPU MEMORY_USAGE_CPU_TO_GPU}, map it and fill it on CPU, read it directly on GPU.</li>
 * <li>Create just single copy using {@link #VMA_MEMORY_USAGE_CPU_ONLY MEMORY_USAGE_CPU_ONLY}, map it and fill it on CPU, read it directly on GPU.</li>
 * </ol>
 * 
 * <p>Which solution is the most efficient depends on your resource and especially on the GPU. It is best to measure it and then make the decision. Some
 * general recommendations:</p>
 * 
 * <ul>
 * <li>On integrated graphics use (2) or (3) to avoid unnecesary time and memory overhead related to using a second copy and making transfer.</li>
 * <li>For small resources (e.g. constant buffers) use (2). Discrete AMD cards have special 256 MiB pool of video memory that is directly mappable. Even
 * if the resource ends up in system memory, its data may be cached on GPU after first fetch over PCIe bus.</li>
 * <li>For larger resources (e.g. textures), decide between (1) and (2). You may want to differentiate NVIDIA and AMD, e.g. by looking for memory type
 * that is both {@code DEVICE_LOCAL} and {@code HOST_VISIBLE}. When you find it, use (2), otherwise use (1).</li>
 * </ul>
 * 
 * <p>Similarly, for resources that you frequently write on GPU and read on CPU, multiple solutions are possible:</p>
 * 
 * <ol>
 * <li>Create one copy in video memory using {@link #VMA_MEMORY_USAGE_GPU_ONLY MEMORY_USAGE_GPU_ONLY}, second copy in system memory using {@link #VMA_MEMORY_USAGE_GPU_TO_CPU MEMORY_USAGE_GPU_TO_CPU} and submit explicit
 * transfer each time.</li>
 * <li>Create just single copy using {@link #VMA_MEMORY_USAGE_GPU_TO_CPU MEMORY_USAGE_GPU_TO_CPU}, write to it directly on GPU, map it and read it on CPU.</li>
 * </ol>
 * 
 * <p>You should take some measurements to decide which option is faster in case of your specific resource.</p>
 * 
 * <p>If you don't want to specialize your code for specific types of GPUs, you can still make an simple optimization for cases when your resource ends up in
 * mappable memory to use it directly in this case instead of creating CPU-side staging copy. For details see <em>Finding out if memory is mappable</em>.</p>
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
 * existing memory blocks from GPU VRAM to system RAM (which degrades performance). This behavior is implementation-dependant - it depends on GPU vendor
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
 * for better efficiency - to be able to do some internal optimizations.</p>
 * 
 * <p>The extension is supported by this library. It will be used automatically when enabled. To enable it:</p>
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
 * <p>That's all. The extension will be automatically used whenever you create a buffer using {@link #vmaCreateBuffer CreateBuffer} or image using {@link #vmaCreateImage CreateImage}.</p>
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
 * <li><a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VK_KHR_dedicated_allocation">VK_KHR_dedicated_allocation in Vulkan specification</a></li>
 * <li><a href="http://asawicki.info/articles/VK_KHR_dedicated_allocation.php5">VK_KHR_dedicated_allocation unofficial manual</a></li>
 * </ul>
 * 
 * <h3>General considerations</h3>
 * 
 * <h4>Thread safety</h4>
 * 
 * <ul>
 * <li>The library has no global state, so separate {@code VmaAllocator} objects can be used independently. There should be no need to create multiple
 * such objects though - one per {@code VkDevice} is enough.</li>
 * <li>By default, all calls to functions that take {@code VmaAllocator} as first parameter are safe to call from multiple threads simultaneously because
 * they are synchronized internally when needed.</li>
 * <li>When the allocator is created with {@link #VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT} flag, calls to functions that take such {@code VmaAllocator}
 * object must be synchronized externally.</li>
 * <li>Access to a {@code VmaAllocation} object must be externally synchronized. For example, you must not call {@link #vmaGetAllocationInfo GetAllocationInfo} and {@link #vmaMapMemory MapMemory} from
 * different threads at the same time if you pass the same {@code VmaAllocation} object to these functions.</li>
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
 * <p>It happens when you use lost allocations, and a new image or buffer is created in place of an existing object that became lost. It may happen also
 * when you use defragmentation.</p></li>
 * </ul>
 * 
 * <h4>Allocation algorithm</h4>
 * 
 * <p>The library uses following algorithm for allocation, in order:</p>
 * 
 * <ol>
 * <li>Try to find free range of memory in existing blocks.</li>
 * <li>If failed, try to create a new block of {@code VkDeviceMemor}y, with preferred block size.</li>
 * <li>If failed, try to create such block with size/2, size/4, size/8.</li>
 * <li>If failed and {@link #VMA_ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT} flag was specified, try to find space in existing blocks, possilby making some other
 * allocations lost.</li>
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
 * <li>Data transfer. Uploading (streaming) and downloading data of buffers and images between CPU and GPU memory and related synchronization is
 * responsibility of the user.</li>
 * <li>Defining some "texture" object that would automatically stream its data from a staging copy in CPU memory to GPU memory would rather be a feature
 * of another, higher-level library implemented on top of VMA.</li>
 * <li>Allocations for imported/exported external memory. They tend to require explicit memory type index and dedicated allocation anyway, so they don't
 * interact with main features of this library. Such special purpose allocations should be made manually, using {@code vkCreateBuffer()} and
 * {@code vkAllocateMemory()}.</li>
 * <li>Recreation of buffers and images. Although the library has functions for buffer and image creation ({@link #vmaCreateBuffer CreateBuffer}, {@link #vmaCreateImage CreateImage}), you need to
 * recreate these objects yourself after defragmentation. That's because the big structures {@code VkBufferCreateInfo}, {@code VkImageCreateInfo} are
 * not stored in {@code VmaAllocation} object.</li>
 * <li>Handling CPU memory allocation failures. When dynamically creating small C++ objects in CPU memory (not Vulkan memory), allocation failures are not
 * checked and handled gracefully, because that would complicate code significantly and is usually not needed in desktop PC applications anyway.</li>
 * <li>Code free of any compiler warnings. Maintaining the library to compile and work correctly on so many different platforms is hard enough. Being free
 * of any warnings, on any version of any compiler, is simply not feasible.</li>
 * <li>This is a C++ library with C interface. Bindings or ports to any other programming languages are welcomed as external projects and are not going to
 * be included into this repository.</li>
 * </ul>
 */
public class Vma {

    /**
     * Flags to be used in {@link VmaRecordSettings}{@code ::flags}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VMA_RECORD_FLUSH_AFTER_CALL_BIT RECORD_FLUSH_AFTER_CALL_BIT} - 
     * Enables flush after recording every function call.
     * 
     * <p>Enable it if you expect your application to crash, which may leave recording file truncated. It may degrade performance though.</p>
     * </li>
     * </ul>
     */
    public static final int VMA_RECORD_FLUSH_AFTER_CALL_BIT = 0x1;

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
     * <p>The flag works only if {@link VmaAllocatorCreateInfo}{@code ::vulkanApiVersion == VK_API_VERSION_1_0}. When it's {@code VK_API_VERSION_1_1}, the flag is
     * ignored because the extension has been promoted to Vulkan 1.1.</p>
     * 
     * <p>Using this extenion will automatically allocate dedicated blocks of memory for some buffers and images instead of suballocating place for them out
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
     * <p>The flag works only if {@link VmaAllocatorCreateInfo}{@code ::vulkanApiVersion == VK_API_VERSION_1_0}. When it's {@code VK_API_VERSION_1_1}, the flag is
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
     * </ul>
     */
    public static final int
        VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT  = 0x1,
        VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT = 0x2,
        VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT         = 0x4,
        VMA_ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT        = 0x8;

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
     * Memory will be used on device only, so fast access from the device is preferred.
     * 
     * <p>It usually means device-local GPU (video) memory. No need to be mappable on host. It is roughly equivalent of {@code D3D12_HEAP_TYPE_DEFAULT}.</p>
     * 
     * <p>Usage:</p>
     * 
     * <ul>
     * <li>Resources written and read by device, e.g. images used as attachments.</li>
     * <li>Resources transferred from host once (immutable) or infrequently and read by device multiple times, e.g. textures to be sampled, vertex
     * buffers, uniform (constant) buffers, and majority of other types of resources used on GPU.</li>
     * </ul>
     * 
     * <p>Allocation may still end up in {@code HOST_VISIBLE} memory on some implementations. In such case, you are free to map it. You can use
     * {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT} with this usage type.</p>
     * </li>
     * <li>{@link #VMA_MEMORY_USAGE_CPU_ONLY MEMORY_USAGE_CPU_ONLY} - 
     * Memory will be mappable on host.
     * 
     * <p>It usually means CPU (system) memory. Guarantees to be {@code HOST_VISIBLE} and {@code HOST_COHERENT}. CPU access is typically uncached. Writes may
     * be write-combined. Resources created in this pool may still be accessible to the device, but access to them can be slow. It is roughly equivalent
     * of {@code D3D12_HEAP_TYPE_UPLOAD}.</p>
     * 
     * <p>Usage: Staging copy of resources used as transfer source.</p>
     * </li>
     * <li>{@link #VMA_MEMORY_USAGE_CPU_TO_GPU MEMORY_USAGE_CPU_TO_GPU} - 
     * Memory that is both mappable on host (guarantees to be {@code HOST_VISIBLE}) and preferably fast to access by GPU.
     * 
     * <p>CPU access is typically uncached. Writes may be write-combined.</p>
     * 
     * <p>Usage: Resources written frequently by host (dynamic), read by device. E.g. textures, vertex buffers, uniform buffers updated every frame or every
     * draw call.</p>
     * </li>
     * <li>{@link #VMA_MEMORY_USAGE_GPU_TO_CPU MEMORY_USAGE_GPU_TO_CPU} - 
     * Memory mappable on host (guarantees to be {@code HOST_VISIBLE}) and cached.
     * 
     * <p>It is roughly equivalent of {@code D3D12_HEAP_TYPE_READBACK}.</p>
     * 
     * <p>Usage:</p>
     * 
     * <ul>
     * <li>Resources written by device, read by host - results of some computations, e.g. screen capture, average scene luminance for HDR tone mapping.</li>
     * <li>Any resources read or accessed randomly on host, e.g. CPU-side copy of vertex buffer used as source of transfer, but also used for collision
     * detection.</li>
     * </ul>
     * </li>
     * <li>{@link #VMA_MEMORY_USAGE_CPU_COPY MEMORY_USAGE_CPU_COPY} - 
     * CPU memory - memory that is preferably not {@code DEVICE_LOCAL}, but also not guaranteed to be {@code HOST_VISIBLE}.
     * 
     * <p>Usage: Staging copy of resources moved from GPU memory to CPU memory as part of custom paging/residency mechanism, to be moved back to GPU memory
     * when needed.</p>
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
     * </ul>
     */
    public static final int
        VMA_MEMORY_USAGE_UNKNOWN              = 0,
        VMA_MEMORY_USAGE_GPU_ONLY             = 1,
        VMA_MEMORY_USAGE_CPU_ONLY             = 2,
        VMA_MEMORY_USAGE_CPU_TO_GPU           = 3,
        VMA_MEMORY_USAGE_GPU_TO_CPU           = 4,
        VMA_MEMORY_USAGE_CPU_COPY             = 5,
        VMA_MEMORY_USAGE_GPU_LAZILY_ALLOCATED = 6;

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
     * 
     * <p>You should not use this flag if {@link VmaAllocationCreateInfo}{@code ::pool} is not null.</p>
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
     * <p>Is it valid to use this flag for allocation made from memory type that is not {@code HOST_VISIBLE}. This flag is then ignored and memory is not
     * mapped. This is useful if you need an allocation that is efficient to use on GPU ({@code DEVICE_LOCAL}) and still want to map it directly if
     * possible on platforms that support it (e.g. Intel GPU).</p>
     * 
     * <p>You should not use this flag together with {@link #VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT ALLOCATION_CREATE_CAN_BECOME_LOST_BIT}.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT ALLOCATION_CREATE_CAN_BECOME_LOST_BIT} - 
     * Allocation created with this flag can become lost as a result of another allocation with {@link #VMA_ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT} flag, so you
     * must check it before use.
     * 
     * <p>To check if allocation is not lost, call {@link #vmaGetAllocationInfo GetAllocationInfo} and check if {@link VmaAllocationInfo}{@code ::deviceMemory} is not {@code VK_NULL_HANDLE}.</p>
     * 
     * <p>For details about supporting lost allocations, see Lost Allocations chapter of User Guide on Main Page.</p>
     * 
     * <p>You should not use this flag together with {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT}.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT} - 
     * While creating allocation using this flag, other allocations that were created with flag {@link #VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT ALLOCATION_CREATE_CAN_BECOME_LOST_BIT} can become lost.
     * 
     * <p>For details about supporting lost allocations, see Lost Allocations chapter of User Guide on Main Page.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT} - 
     * Set this flag to treat {@link VmaAllocationCreateInfo}{@code ::pUserData} as pointer to a null-terminated string. Instead of copying pointer value, a
     * local copy of the string is made and stored in allocation's {@code pUserData}. The string is automatically freed together with the allocation. It
     * is also used in {@link #vmaBuildStatsString BuildStatsString}.
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
     * <li>{@link #VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT} - Allocation strategy that chooses smallest possible free range for the allocation.</li>
     * <li>{@link #VMA_ALLOCATION_CREATE_STRATEGY_WORST_FIT_BIT ALLOCATION_CREATE_STRATEGY_WORST_FIT_BIT} - Allocation strategy that chooses biggest possible free range for the allocation.</li>
     * <li>{@link #VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT} - 
     * Allocation strategy that chooses first suitable free range for the allocation.
     * 
     * <p>"First" doesn't necessarily means the one with smallest offset in memory, but rather the one that is easiest and fastest to find.</p>
     * </li>
     * <li>{@link #VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT} - Allocation strategy that tries to minimize memory usage.</li>
     * <li>{@link #VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT} - Allocation strategy that tries to minimize allocation time.</li>
     * <li>{@link #VMA_ALLOCATION_CREATE_STRATEGY_MIN_FRAGMENTATION_BIT ALLOCATION_CREATE_STRATEGY_MIN_FRAGMENTATION_BIT} - Allocation strategy that tries to minimize memory fragmentation.</li>
     * <li>{@link #VMA_ALLOCATION_CREATE_STRATEGY_MASK ALLOCATION_CREATE_STRATEGY_MASK} - A bit mask to extract only {@code STRATEGY} bits from entire set of flags.</li>
     * </ul>
     */
    public static final int
        VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT           = 0x00000001,
        VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT             = 0x00000002,
        VMA_ALLOCATION_CREATE_MAPPED_BIT                     = 0x00000004,
        VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT            = 0x00000008,
        VMA_ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT        = 0x00000010,
        VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT      = 0x00000020,
        VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT              = 0x00000040,
        VMA_ALLOCATION_CREATE_DONT_BIND_BIT                  = 0x00000080,
        VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT              = 0x00000100,
        VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT          = 0x00010000,
        VMA_ALLOCATION_CREATE_STRATEGY_WORST_FIT_BIT         = 0x00020000,
        VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT         = 0x00040000,
        VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT        = VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT,
        VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT          = VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT,
        VMA_ALLOCATION_CREATE_STRATEGY_MIN_FRAGMENTATION_BIT = VMA_ALLOCATION_CREATE_STRATEGY_WORST_FIT_BIT,
        VMA_ALLOCATION_CREATE_STRATEGY_MASK                  = VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT | VMA_ALLOCATION_CREATE_STRATEGY_WORST_FIT_BIT | VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT;

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
     * 
     * <p>When using this flag, you must specify {@link VmaPoolCreateInfo}{@code ::maxBlockCount == 1} (or 0 for default).</p>
     * </li>
     * <li>{@link #VMA_POOL_CREATE_BUDDY_ALGORITHM_BIT POOL_CREATE_BUDDY_ALGORITHM_BIT} - 
     * Enables alternative, buddy allocation algorithm in this pool.
     * 
     * <p>It operates on a tree of blocks, each having size that is a power of two and a half of its parent's size. Comparing to default algorithm, this one
     * provides faster allocation and deallocation and decreased external fragmentation, at the expense of more memory wasted (internal fragmentation).</p>
     * </li>
     * <li>{@link #VMA_POOL_CREATE_ALGORITHM_MASK POOL_CREATE_ALGORITHM_MASK} - Bit mask to extract only {@code ALGORITHM} bits from entire set of flags.</li>
     * </ul>
     */
    public static final int
        VMA_POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT = 0x2,
        VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT                = 0x4,
        VMA_POOL_CREATE_BUDDY_ALGORITHM_BIT                 = 0x8,
        VMA_POOL_CREATE_ALGORITHM_MASK                      = VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT | VMA_POOL_CREATE_BUDDY_ALGORITHM_BIT;

    static { LibVma.initialize(); }

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

    /**
     * Sets index of the current frame.
     * 
     * <p>This function must be used if you make allocations with {@link #VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT ALLOCATION_CREATE_CAN_BECOME_LOST_BIT} and {@link #VMA_ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT} flags to
     * inform the allocator when a new frame begins. Allocations queried using {@link #vmaGetAllocationInfo GetAllocationInfo} cannot become lost in the current frame.</p>
     */
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
     * brief statistics suitable to be called every frame or every allocation, use {@link #vmaGetBudget GetBudget}.</p>
     * 
     * <p>Note that when using allocator from multiple threads, returned information may immediately become outdated.</p>
     */
    public static void vmaCalculateStats(@NativeType("VmaAllocator") long allocator, @NativeType("VmaStats *") VmaStats pStats) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaCalculateStats(allocator, pStats.address());
    }

    // --- [ vmaGetBudget ] ---

    /** Unsafe version of: {@link #vmaGetBudget GetBudget} */
    public static native void nvmaGetBudget(long allocator, long pBudget);

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
    public static void vmaGetBudget(@NativeType("VmaAllocator") long allocator, @NativeType("VmaBudget *") VmaBudget.Buffer pBudget) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaGetBudget(allocator, pBudget.address());
    }

    // --- [ vmaBuildStatsString ] ---

    /** Unsafe version of: {@link #vmaBuildStatsString BuildStatsString} */
    public static native void nvmaBuildStatsString(long allocator, long ppStatsString, int detailedMap);

    /**
     * Builds and returns statistics as string in JSON format.
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
            checkNT1(pStatsString);
        }
        nvmaFreeStatsString(allocator, memAddress(pStatsString));
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
     * that never has memory bound. It is just a convenience function, equivalent to calling:</p>
     * 
     * <ul>
     * <li>{@code vkCreateBuffer}</li>
     * <li>{@code vkGetBufferMemoryRequirements}</li>
     * <li>{@link #vmaFindMemoryTypeIndex FindMemoryTypeIndex}</li>
     * <li>{@code vkDestroyBuffer}</li>
     * </ul>
     */
    @NativeType("VkResult")
    public static int vmaFindMemoryTypeIndexForBufferInfo(@NativeType("VmaAllocator") long allocator, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pBufferCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("uint32_t *") IntBuffer pMemoryTypeIndex) {
        if (CHECKS) {
            check(allocator);
            check(pMemoryTypeIndex, 1);
            VkBufferCreateInfo.validate(pBufferCreateInfo.address());
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
     * that never has memory bound. It is just a convenience function, equivalent to calling:</p>
     * 
     * <ul>
     * <li>{@code vkCreateImage}</li>
     * <li>{@code vkGetImageMemoryRequirements}</li>
     * <li>{@link #vmaFindMemoryTypeIndex FindMemoryTypeIndex}</li>
     * <li>{@code vkDestroyImage}</li>
     * </ul>
     */
    @NativeType("VkResult")
    public static int vmaFindMemoryTypeIndexForImageInfo(@NativeType("VmaAllocator") long allocator, @NativeType("VkImageCreateInfo const *") VkImageCreateInfo pImageCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("uint32_t *") IntBuffer pMemoryTypeIndex) {
        if (CHECKS) {
            check(allocator);
            check(pMemoryTypeIndex, 1);
            VkImageCreateInfo.validate(pImageCreateInfo.address());
        }
        return nvmaFindMemoryTypeIndexForImageInfo(allocator, pImageCreateInfo.address(), pAllocationCreateInfo.address(), memAddress(pMemoryTypeIndex));
    }

    // --- [ vmaCreatePool ] ---

    /** Unsafe version of: {@link #vmaCreatePool CreatePool} */
    public static native int nvmaCreatePool(long allocator, long pCreateInfo, long pPool);

    /**
     * Allocates Vulkan device memory and creates {@code VmaPool} object.
     *
     * @param allocator   Allocator object
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
     * @param allocator  Allocator object
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

    // --- [ vmaMakePoolAllocationsLost ] ---

    /** Unsafe version of: {@link #vmaMakePoolAllocationsLost MakePoolAllocationsLost} */
    public static native void nvmaMakePoolAllocationsLost(long allocator, long pool, long pLostAllocationCount);

    /**
     * Marks all allocations in given pool as lost if they are not used in current frame or {@link VmaPoolCreateInfo}{@code ::frameInUseCount} back from now.
     *
     * @param allocator            Allocator object
     * @param pool                 pool
     * @param pLostAllocationCount number of allocations marked as lost. Optional - pass null if you don't need this information.
     */
    public static void vmaMakePoolAllocationsLost(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool, @Nullable @NativeType("size_t *") PointerBuffer pLostAllocationCount) {
        if (CHECKS) {
            check(allocator);
            check(pool);
            checkSafe(pLostAllocationCount, 1);
        }
        nvmaMakePoolAllocationsLost(allocator, pool, memAddressSafe(pLostAllocationCount));
    }

    /**
     * Marks all allocations in given pool as lost if they are not used in current frame or {@link VmaPoolCreateInfo}{@code ::frameInUseCount} back from now.
     *
     * @param allocator Allocator object
     * @param pool      pool
     */
    @NativeType("void")
    public static long vmaMakePoolAllocationsLost(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool) {
        if (CHECKS) {
            check(allocator);
            check(pool);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer pLostAllocationCount = stack.callocPointer(1);
            nvmaMakePoolAllocationsLost(allocator, pool, memAddress(pLostAllocationCount));
            return pLostAllocationCount.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
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
     *         <li>{@code VK_ERROR_VALIDATION_FAILED_EXT} - corruption detection has been performed and found memory corruptions around one of the allocations.
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
     * @param pCreateInfo           creation parameters for each alloction
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
    public static void vmaFreeMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation) {
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
    public static void vmaFreeMemoryPages(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation *") PointerBuffer pAllocations) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaFreeMemoryPages(allocator, pAllocations.remaining(), memAddress(pAllocations));
    }

    // --- [ vmaResizeAllocation ] ---

    /** Unsafe version of: {@link #vmaResizeAllocation ResizeAllocation} */
    public static native int nvmaResizeAllocation(long allocator, long allocation, long newSize);

    /**
     * Deprecated.
     * 
     * <p>In version 2.2.0 it used to try to change allocation's size without moving or reallocating it. In current version it returns {@code VK_SUCCESS} only if
     * {@code newSize} equals current allocation's size. Otherwise returns {@code VK_ERROR_OUT_OF_POOL_MEMORY}, indicating that allocation's size could not be
     * changed.</p>
     *
     * @return {@code VK_SUCCESS} if allocation's size has been successfully changed. Returns {@code VK_ERROR_OUT_OF_POOL_MEMORY} if allocation's size could not be
     *         changed.
     */
    @NativeType("VkResult")
    public static int vmaResizeAllocation(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long newSize) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        return nvmaResizeAllocation(allocator, allocation, newSize);
    }

    // --- [ vmaGetAllocationInfo ] ---

    /** Unsafe version of: {@link #vmaGetAllocationInfo GetAllocationInfo} */
    public static native void nvmaGetAllocationInfo(long allocator, long allocation, long pAllocationInfo);

    /**
     * Returns current information about specified allocation and atomically marks it as used in current frame.
     * 
     * <p>Current parameters of given allocation are returned in {@code pAllocationInfo}.</p>
     * 
     * <p>This function also atomically "touches" allocation - marks it as used in current frame, just like {@link #vmaTouchAllocation TouchAllocation}. If the allocation is in lost
     * state, {@code pAllocationInfo->deviceMemory == VK_NULL_HANDLE}.</p>
     * 
     * <p>Although this function uses atomics and doesn't lock any mutex, so it should be quite efficient, you can avoid calling it too often.</p>
     * 
     * <ul>
     * <li>You can retrieve same {@link VmaAllocationInfo} structure while creating your resource, from function {@link #vmaCreateBuffer CreateBuffer}, {@link #vmaCreateImage CreateImage}. You can remember
     * it if you are sure parameters don't change (e.g. due to defragmentation or allocation becoming lost).</li>
     * <li>If you just want to check if allocation is not lost, {@link #vmaTouchAllocation TouchAllocation} will work faster.</li>
     * </ul>
     */
    public static void vmaGetAllocationInfo(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        nvmaGetAllocationInfo(allocator, allocation, pAllocationInfo.address());
    }

    // --- [ vmaTouchAllocation ] ---

    /** Unsafe version of: {@link #vmaTouchAllocation TouchAllocation} */
    public static native int nvmaTouchAllocation(long allocator, long allocation);

    /**
     * Returns {@code VK_TRUE} if allocation is not lost and atomically marks it as used in current frame.
     * 
     * <p>If the allocation has been created with {@link #VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT ALLOCATION_CREATE_CAN_BECOME_LOST_BIT} flag, this function returns {@code VK_TRUE} if it's not in lost state,
     * so it can still be used. It then also atomically "touches" the allocation - marks it as used in current frame, so that you can be sure it won't become
     * lost in current frame or next {@code frameInUseCount} frames.</p>
     * 
     * <p>If the allocation is in lost state, the function returns {@code VK_FALSE}. Memory of such allocation, as well as buffer or image bound to it, should
     * not be used. Lost allocation and the buffer/image still need to be destroyed.</p>
     * 
     * <p>If the allocation has been created without {@link #VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT ALLOCATION_CREATE_CAN_BECOME_LOST_BIT} flag, this function always returns {@code VK_TRUE}.</p>
     */
    @NativeType("VkBool32")
    public static boolean vmaTouchAllocation(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        return nvmaTouchAllocation(allocator, allocation) != 0;
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
            check(pUserData);
        }
        nvmaSetAllocationUserData(allocator, allocation, pUserData);
    }

    // --- [ vmaCreateLostAllocation ] ---

    /** Unsafe version of: {@link #vmaCreateLostAllocation CreateLostAllocation} */
    public static native void nvmaCreateLostAllocation(long allocator, long pAllocation);

    /**
     * Creates new allocation that is in lost state from the beginning.
     * 
     * <p>It can be useful if you need a dummy, non-null allocation.</p>
     * 
     * <p>You still need to destroy created object using {@link #vmaFreeMemory FreeMemory}.</p>
     * 
     * <p>Returned allocation is not tied to any specific memory pool or memory type and not bound to any image or buffer. It has size = 0. It cannot be turned
     * into a real, non-empty allocation.</p>
     */
    public static void vmaCreateLostAllocation(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation *") PointerBuffer pAllocation) {
        if (CHECKS) {
            check(allocator);
            check(pAllocation, 1);
        }
        nvmaCreateLostAllocation(allocator, memAddress(pAllocation));
    }

    // --- [ vmaMapMemory ] ---

    /** Unsafe version of: {@link #vmaMapMemory MapMemory} */
    public static native int nvmaMapMemory(long allocator, long allocation, long ppData);

    /**
     * Maps memory represented by given allocation and returns pointer to it.
     * 
     * <p>Maps memory represented by given allocation to make it accessible to CPU code. When succeeded, {@code *ppData} contains pointer to first byte of this
     * memory. If the allocation is part of bigger {@code VkDeviceMemory} block, the pointer is correctly offseted to the beginning of region assigned to this
     * particular allocation.</p>
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
     * <p>This function always fails when called for allocation that was created with {@link #VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT ALLOCATION_CREATE_CAN_BECOME_LOST_BIT} flag. Such allocations cannot be
     * mapped.</p>
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
     */
    public static void vmaInvalidateAllocation(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long offset, @NativeType("VkDeviceSize") long size) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        nvmaInvalidateAllocation(allocator, allocation, offset, size);
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
     *         <li>{@code VK_ERROR_VALIDATION_FAILED_EXT} - corruption detection has been performed and found memory corruptions around one of the allocations.
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
     * {@code pInfo->pPools}, including calling {@link #vmaGetAllocationInfo GetAllocationInfo}, {@link #vmaTouchAllocation TouchAllocation}, or access their data.</li>
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
    public static int vmaDefragment(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation *") PointerBuffer pAllocations, @Nullable @NativeType("VkBool32 *") IntBuffer pAllocationsChanged, @Nullable @NativeType("VmaDefragmentationInfo const *") VmaDefragmentationInfo pDefragmentationInfo, @Nullable @NativeType("VmaDefragmentationStats *") VmaDefragmentationStats pDefragmentationStats) {
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
     * {@link VmaAllocatorCreateInfo}{@code ::vulkanApiVersion == VK_API_VERSION_1_1}. Otherwise the call fails.</p>
     *
     * @param allocationLocalOffset additional offset to be added while binding, relative to the beginning of the {@code allocatio}n. Normally it should be 0.
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
     * {@link VmaAllocatorCreateInfo}{@code ::vulkanApiVersion == VK_API_VERSION_1_1}. Otherwise the call fails.</p>
     *
     * @param allocationLocalOffset additional offset to be added while binding, relative to the beginning of the {@code allocatio}n. Normally it should be 0.
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
     * {@link VmaAllocationCreateInfo}{@code ::pool} is null and {@link #VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT ALLOCATION_CREATE_NEVER_ALLOCATE_BIT} is not used), it creates dedicated allocation for this
     * buffer, just like when using {@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT}.</p>
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
            VkBufferCreateInfo.validate(pBufferCreateInfo.address());
        }
        return nvmaCreateBuffer(allocator, pBufferCreateInfo.address(), pAllocationCreateInfo.address(), memAddress(pBuffer), memAddress(pAllocation), memAddressSafe(pAllocationInfo));
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
            check(allocation);
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
            VkImageCreateInfo.validate(pImageCreateInfo.address());
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
            check(allocation);
        }
        nvmaDestroyImage(allocator, image, allocation);
    }

}