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
 * <li>Fill VmaAllocatorCreateInfo structure and create `VmaAllocator` object by calling vmaCreateAllocator().</li>
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
 * <li>If you just want to find memory type index that meets your requirements, you can use function {@link #vmaFindMemoryTypeIndex FindMemoryTypeIndex}.</li>
 * <li>If you want to allocate a region of device memory without association with any specific image or buffer, you can use function {@link #vmaAllocateMemory AllocateMemory}.
 * Usage of this function is not recommended and usually not needed.</li>
 * <li>If you already have a buffer or an image created, you want to allocate memory for it and then you will bind it yourself, you can use function
 * {@link #vmaAllocateMemoryForBuffer AllocateMemoryForBuffer}, {@link #vmaAllocateMemoryForImage AllocateMemoryForImage}. For binding you should use functions: {@link #vmaBindBufferMemory BindBufferMemory}, {@link #vmaBindImageMemory BindImageMemory}.</li>
 * <li>If you want to create a buffer or an image, allocate memory for it and bind them together, all in one call, you can use function {@link #vmaCreateBuffer CreateBuffer},
 * {@link #vmaCreateImage CreateImage}. This is the recommended way to use this library.</li>
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
 * You can also map different allocations simultaneously regardless of whether they use the same {@code VkDeviceMemory} block. They way it's implemented
 * is that the library always maps entire memory block, not just region of the allocation. For further details, see description of {@link #vmaMapMemory MapMemory} function.
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
 * VmaBuffer constantBuffer;
 * VmaAllocation constantBufferAllocation;
 * 
 * // You can map and fill your buffer using following code:
 * 
 * void* mappedData;
 * vmaMapMemory(allocator, constantBufferAllocation, &amp;mappedData);
 * memcpy(mappedData, &amp;constantBufferData, sizeof(constantBufferData));
 * vmaUnmapMemory(allocator, constantBufferAllocation);</code></pre>
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
 * <li>Keeping many large memory blocks mapped may impact performance or stability of some debugging tools.</li>
 * </ul>
 * 
 * <h4>Cache control</h4>
 * 
 * <p>Memory in Vulkan doesn't need to be unmapped before using it on GPU, but unless a memory types has {@code VK_MEMORY_PROPERTY_HOST_COHERENT_BIT} flag
 * set, you need to manually invalidate cache before reading of mapped pointer using function {@code vkInvalidateMappedMemoryRanges()} and flush cache
 * after writing to mapped pointer using function {@code vkFlushMappedMemoryRanges()}. Example:</p>
 * 
 * <pre><code>
 * memcpy(allocInfo.pMappedData, &amp;constantBufferData, sizeof(constantBufferData));
 * 
 * VkMemoryPropertyFlags memFlags;
 * vmaGetMemoryTypeProperties(allocator, allocInfo.memoryType, &amp;memFlags);
 * if((memFlags &amp; VK_MEMORY_PROPERTY_HOST_COHERENT_BIT) == 0)
 * {
 *     VkMappedMemoryRange memRange = { VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE };
 *     memRange.memory = allocInfo.deviceMemory;
 *     memRange.offset = allocInfo.offset;
 *     memRange.size   = allocInfo.size;
 *     vkFlushMappedMemoryRanges(device, 1, &amp;memRange);
 * }</code></pre>
 * 
 * <p>Please note that memory allocated with {@link #VMA_MEMORY_USAGE_CPU_ONLY MEMORY_USAGE_CPU_ONLY} is guaranteed to be host coherent.</p>
 * 
 * <p>Also, Windows drivers from all 3 PC GPU vendors (AMD, Intel, NVIDIA) currently provide {@code VK_MEMORY_PROPERTY_HOST_COHERENT_BIT} flag on all memory
 * types that are {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT}, so on this platform you may not need to bother.</p>
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
 * structure, like usage.</li>
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
 * <h3>Defragmentation</h3>
 * 
 * <p>Interleaved allocations and deallocations of many objects of varying size can cause fragmentation, which can lead to a situation where the library is
 * unable to find a continuous range of free memory for a new allocation despite there is enough free space, just scattered across many small free ranges
 * between existing allocations.</p>
 * 
 * <p>To mitigate this problem, you can use {@link #vmaDefragment Defragment}. Given set of allocations, this function can move them to compact used memory, ensure more
 * continuous free space and possibly also free some {@code VkDeviceMemory}. It can work only on allocations made from memory type that is
 * {@code HOST_VISIBLE}. Allocations are modified to point to the new {@code VkDeviceMemory} and offset. Data in this memory is also {@code memmove}-ed to
 * the new place. However, if you have images or buffers bound to these allocations (and you certainly do), you need to destroy, recreate, and bind them
 * to the new place in memory.</p>
 * 
 * <p>For further details and example code, see documentation of function {@link #vmaDefragment Defragment}.</p>
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
 * <h3>Recommended usage patterns</h3>
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
 * for the start. Prefer to write to such resource sequentially (e.g. using {@code memcpy}). Don't perform random access or any reads from it, as it may
 * be very slow.</p>
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
 * {@code VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU}. When you find it, you can assume that memory is unified and all memory types are equally fast to access
 * from GPU, regardless of {@code VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT}.</p>
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
 * <li>On integrated graphics use (2) or (3) to avoid unnecesary time and memory overhead related to using a second copy.</li>
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
 * <p>If you want to test how your program behaves with limited amount of Vulkan device memory available without switching your graphics card to one that
 * really has smaller VRAM, you can use a feature of this library intended for this purpose. To do it, fill optional member
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
 * <li>Data transfer - issuing commands that transfer data between buffers or images, any usage of {@code VkCommandList} or {@code VkCommandQueue} and
 * related synchronization is responsibility of the user.</li>
 * <li>Support for any programming languages other than C/C++. Bindings to other languages are welcomed as external projects.</li>
 * </ul>
 */
public class Vma {

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
     * <p>Using this extenion will automatically allocate dedicated blocks of memory for some buffers and images instead of suballocating place for them out
     * of bigger memory blocks (as if you explicitly used {@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT} flag) when it is recommended by the driver. It may
     * improve performance on some GPUs.</p>
     * 
     * <p>You may set this flag only if you found out that following device extensions are supported, you enabled them while creating Vulkan device passed as
     * {@link VmaAllocatorCreateInfo}{@code ::device}, and you want them to be used internally by this library:</p>
     * 
     * <ul>
     * <li>{@code VK_KHR_get_memory_requirements2}</li>
     * <li>{@code VK_KHR_dedicated_allocation}</li>
     * </ul>
     * 
     * <p>When this flag is set, you can experience following warnings reported by Vulkan validation layer. You can ignore them.</p>
     * 
     * <pre><code>
     * &gt; vkBindBufferMemory(): Binding memory to buffer 0x2d but vkGetBufferMemoryRequirements() has not been called on that buffer.</code></pre>
     * </li>
     * </ul>
     */
    public static final int
        VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT  = 0x1,
        VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT = 0x2;

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
     * buffers, uniform (constant) buffers, and majority of other types of resources used by device.</li>
     * </ul>
     * 
     * <p>Allocation may still end up in {@code HOST_VISIBLE} memory on some implementations. In such case, you are free to map it. You can use
     * {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT} with this usage type.</p>
     * </li>
     * <li>{@link #VMA_MEMORY_USAGE_CPU_ONLY MEMORY_USAGE_CPU_ONLY} - 
     * Memory will be mappable on host.
     * 
     * <p>It usually means CPU (system) memory. Resources created in this pool may still be accessible to the device, but access to them can be slower.
     * Guarantees to be {@code HOST_VISIBLE} and {@code HOST_COHERENT}. CPU read may be uncached. It is roughly equivalent of
     * {@code D3D12_HEAP_TYPE_UPLOAD}.</p>
     * 
     * <p>Usage: Staging copy of resources used as transfer source.</p>
     * </li>
     * <li>{@link #VMA_MEMORY_USAGE_CPU_TO_GPU MEMORY_USAGE_CPU_TO_GPU} - 
     * Memory that is both mappable on host (guarantees to be {@code HOST_VISIBLE}) and preferably fast to access by GPU.
     * 
     * <p>CPU reads may be uncached and very slow.</p>
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
     * </ul>
     */
    public static final int
        VMA_MEMORY_USAGE_UNKNOWN    = 0,
        VMA_MEMORY_USAGE_GPU_ONLY   = 2,
        VMA_MEMORY_USAGE_CPU_ONLY   = 1,
        VMA_MEMORY_USAGE_CPU_TO_GPU = 3,
        VMA_MEMORY_USAGE_GPU_TO_CPU = 4;

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
     * <p>This flag must also be used for host visible resources that you want to map simultaneously because otherwise they might end up as regions of the
     * same {@code VkDeviceMemory}, while mapping same {@code VkDeviceMemory} multiple times simultaneously is illegal.</p>
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
     * </ul>
     */
    public static final int
        VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT      = 0x1,
        VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT        = 0x2,
        VMA_ALLOCATION_CREATE_MAPPED_BIT                = 0x4,
        VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT       = 0x8,
        VMA_ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT   = 0x10,
        VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT = 0x20;

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
     * <p>This is no optional optimization flag.</p>
     * 
     * <p>If you always allocate using {@link #vmaCreateBuffer CreateBuffer}, {@link #vmaCreateImage CreateImage}, {@link #vmaAllocateMemoryForBuffer AllocateMemoryForBuffer}, then you don't need to use it because allocator knows
     * exact type of your allocations so it can handle Buffer-Image Granularity in the optimal way.</p>
     * 
     * <p>If you also allocate using {@link #vmaAllocateMemoryForImage AllocateMemoryForImage} or {@link #vmaAllocateMemory AllocateMemory}, exact type of such allocations is not known, so allocator must be
     * conservative in handling Buffer-Image Granularity, which can lead to suboptimal allocation (wasted memory). In that case, if you can make sure you
     * always allocate only buffers and linear images or only optimal images out of this pool, use this flag to make allocator disregard Buffer-Image
     * Granularity and so make allocations more optimal.</p>
     * </li>
     * </ul>
     */
    public static final int VMA_POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT = 0x2;

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

    /** Retrieves statistics from current state of the Allocator. */
    public static void vmaCalculateStats(@NativeType("VmaAllocator") long allocator, @NativeType("VmaStats *") VmaStats pStats) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaCalculateStats(allocator, pStats.address());
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

    public static void vmaFreeStatsString(@NativeType("VmaAllocator") long allocator, @NativeType("char *") CharSequence pStatsString) {
        if (CHECKS) {
            check(allocator);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pStatsStringEncoded = stack.ASCII(pStatsString);
            nvmaFreeStatsString(allocator, memAddress(pStatsStringEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
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
            VmaAllocationCreateInfo.validate(pAllocationCreateInfo.address());
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
            VmaAllocationCreateInfo.validate(pAllocationCreateInfo.address());
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
            VmaAllocationCreateInfo.validate(pAllocationCreateInfo.address());
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

    // --- [ vmaAllocateMemory ] ---

    /** Unsafe version of: {@link #vmaAllocateMemory AllocateMemory} */
    public static native int nvmaAllocateMemory(long allocator, long pVkMemoryRequirements, long pCreateInfo, long pAllocation, long pAllocationInfo);

    /**
     * General purpose memory allocation.
     * 
     * <p>You should free the memory using {@link #vmaFreeMemory FreeMemory}.</p>
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
            VmaAllocationCreateInfo.validate(pCreateInfo.address());
        }
        return nvmaAllocateMemory(allocator, pVkMemoryRequirements.address(), pCreateInfo.address(), memAddress(pAllocation), memAddressSafe(pAllocationInfo));
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
            VmaAllocationCreateInfo.validate(pCreateInfo.address());
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
            VmaAllocationCreateInfo.validate(pCreateInfo.address());
        }
        return nvmaAllocateMemoryForImage(allocator, image, pCreateInfo.address(), memAddress(pAllocation), memAddressSafe(pAllocationInfo));
    }

    // --- [ vmaFreeMemory ] ---

    /** Unsafe version of: {@link #vmaFreeMemory FreeMemory} */
    public static native void nvmaFreeMemory(long allocator, long allocation);

    /** Frees memory previously allocated using {@link #vmaAllocateMemory AllocateMemory}, {@link #vmaAllocateMemoryForBuffer AllocateMemoryForBuffer}, or {@link #vmaAllocateMemoryForImage AllocateMemoryForImage}. */
    public static void vmaFreeMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        nvmaFreeMemory(allocator, allocation);
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
     */
    public static void vmaUnmapMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        nvmaUnmapMemory(allocator, allocation);
    }

    // --- [ vmaDefragment ] ---

    /**
     * Unsafe version of: {@link #vmaDefragment Defragment}
     *
     * @param allocationCount number of elements in {@code pAllocations} and {@code pAllocationsChanged} arrays
     */
    public static native int nvmaDefragment(long allocator, long pAllocations, long allocationCount, long pAllocationsChanged, long pDefragmentationInfo, long pDefragmentationStats);

    /**
     * Compacts memory by moving allocations.
     * 
     * <p>This function works by moving allocations to different places (different {@code VkDeviceMemory} objects and/or different offsets) in order to optimize
     * memory usage. Only allocations that are in {@code pAllocations} array can be moved. All other allocations are considered nonmovable in this call. Basic
     * rules:</p>
     * 
     * <ul>
     * <li>Only allocations made in memory types that have {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT} flag can be compacted. You may pass other allocations
     * but it makes no sense - these will never be moved.</li>
     * <li>You may pass allocations made with {@link #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT} but it makes no sense - they will never be moved.</li>
     * <li>Both allocations made with or without {@link #VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT}  flag can be compacted. If not persistently mapped, memory will be mapped
     * temporarily inside this function if needed.</li>
     * <li>You must not pass same {@code VmaAllocation} object multiple times in {@code pAllocations} array.</li>
     * </ul>
     * 
     * <p>The function also frees empty {@code VkDeviceMemory} blocks.</p>
     * 
     * <p>After allocation has been moved, its {@link VmaAllocationInfo}{@code ::deviceMemory} and/or {@link VmaAllocationInfo}{@code ::offset} changes. You must query them
     * again using {@link #vmaGetAllocationInfo GetAllocationInfo} if you need them.</p>
     * 
     * <p>If an allocation has been moved, data in memory is copied to new place automatically, but if it was bound to a buffer or an image, you must destroy
     * that object yourself, create new one and bind it to the new memory pointed by the allocation. You must use {@code vkDestroyBuffer()},
     * {@code vkDestroyImage()}, {@code vkCreateBuffer()}, {@code vkCreateImage()} for that purpose and NOT {@link #vmaDestroyBuffer DestroyBuffer}, {@link #vmaDestroyImage DestroyImage},
     * {@link #vmaCreateBuffer CreateBuffer}, {@link #vmaCreateImage CreateImage}! Example:</p>
     * 
     * <pre><code>
     * VkDevice device = ...;
     * VmaAllocator allocator = ...;
     * std::vector&lt;VkBuffer&gt; buffers = ...;
     * std::vector&lt;VmaAllocation&gt; allocations = ...;
     * 
     * std::vector&lt;VkBool32&gt; allocationsChanged(allocations.size());
     * vmaDefragment(allocator, allocations.data(), allocations.size(), allocationsChanged.data(), nullptr, nullptr);
     * 
     * for(size_t i = 0; i &lt; allocations.size(); ++i)
     * {
     *     if(allocationsChanged[i])
     *     {
     *         VmaAllocationInfo allocInfo;
     *         vmaGetAllocationInfo(allocator, allocations[i], &amp;allocInfo);
     * 
     *         vkDestroyBuffer(device, buffers[i], nullptr);
     * 
     *         VkBufferCreateInfo bufferInfo = ...;
     *         vkCreateBuffer(device, &amp;bufferInfo, nullptr, &amp;buffers[i]);
     * 
     *         // You can make dummy call to vkGetBufferMemoryRequirements here to silence validation layer warning.
     * 
     *         vkBindBufferMemory(device, buffers[i], allocInfo.deviceMemory, allocInfo.offset);
     *     }
     * }</code></pre>
     * 
     * <p>Note: Please don't expect memory to be fully compacted after this call. Algorithms inside are based on some heuristics that try to maximize number of
     * Vulkan memory blocks to make totally empty to release them, as well as to maximimze continuous empty space inside remaining blocks, while minimizing
     * the number and size of data that needs to be moved. Some fragmentation still remains after this call. This is normal.</p>
     * 
     * <p>Warning: This function is not 100% correct according to Vulkan specification. Use it at your own risk. That's because Vulkan doesn't guarantee that
     * memory requirements (size and alignment) for a new buffer or image are consistent. They may be different even for subsequent calls with the same
     * parameters. It really does happen on some platforms, especially with images.</p>
     * 
     * <p>Warning: This function may be time-consuming, so you shouldn't call it too often (like every frame or after every resource creation/destruction). You
     * can call it on special occasions (like when reloading a game level or when you just destroyed a lot of objects).</p>
     *
     * @param pAllocations          array of allocations that can be moved during this compaction
     * @param pAllocationsChanged   array of boolean values that will indicate whether matching allocation in {@code pAllocations} array has been moved. This parameter is optional.
     *                              Pass null if you don't need this information.
     * @param pDefragmentationInfo  configuration parameters. Optional - pass null to use default values.
     * @param pDefragmentationStats statistics returned by the function. Optional - pass null if you don't need this information.
     *
     * @return {@code VK_SUCCESS} if completed, {@code VK_INCOMPLETE} if succeeded but didn't make all possible optimizations because limits specified in
     *         {@code pDefragmentationInfo} have been reached, negative error code in case of error.
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
            VmaAllocationCreateInfo.validate(pAllocationCreateInfo.address());
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
            VmaAllocationCreateInfo.validate(pAllocationCreateInfo.address());
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