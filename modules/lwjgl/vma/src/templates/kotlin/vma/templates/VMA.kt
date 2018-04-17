/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vma.templates

import org.lwjgl.generator.*
import vma.*
import vulkan.*

val VMA = "Vma".nativeClass(Module.VMA, "Vma", prefix = "VMA") {
    nativeDirective(
        """#include "lwjgl_malloc.h"
DISABLE_WARNINGS()
#define VMA_IMPLEMENTATION
#define VMA_STATIC_VULKAN_FUNCTIONS 0
#define VMA_SYSTEM_ALIGNED_MALLOC org_lwjgl_aligned_alloc
#define VMA_SYSTEM_FREE org_lwjgl_aligned_free
#include "vk_mem_alloc.h"
ENABLE_WARNINGS()"""
    )
    javaImport("org.lwjgl.vulkan.*")

    cpp = true
    documentation =
        """
        The Vulkan Memory Allocator.

        <h3>Quick start</h3>

        <h4>Initialization</h4>

        At program startup:

        ${ol(
            "Initialize Vulkan to have {@code VkPhysicalDevice} and {@code VkDevice} object.",
            "Fill VmaAllocatorCreateInfo structure and create `VmaAllocator` object by calling vmaCreateAllocator()."
        )}

        ${code(
            """
VmaAllocatorCreateInfo allocatorInfo = {};
allocatorInfo.physicalDevice = physicalDevice;
allocatorInfo.device = device;

VmaAllocator allocator;
vmaCreateAllocator(&allocatorInfo, &allocator);"""
        )}

        <h4>Resource allocation</h4>

        When you want to create a buffer or image:
        ${ol(
            "Fill {@code VkBufferCreateInfo} / {@code VkImageCreateInfo} structure.",
            "Fill {@code VmaAllocationCreateInfo} structure.",
            "Call #CreateBuffer() / #CreateImage() to get {@code VkBuffer}/{@code VkImage} with memory already allocated and bound to it."
        )}

        ${code(
            """
VkBufferCreateInfo bufferInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
bufferInfo.size = 65536;
bufferInfo.usage = VK_BUFFER_USAGE_VERTEX_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;

VmaAllocationCreateInfo allocInfo = {};
allocInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY;

VkBuffer buffer;
VmaAllocation allocation;
vmaCreateBuffer(allocator, &bufferInfo, &allocInfo, &buffer, &allocation, nullptr);"""
        )}

        Don't forget to destroy your objects when no longer needed:

        ${code(
            """
vmaDestroyBuffer(allocator, buffer, allocation);
vmaDestroyAllocator(allocator);"""
        )}
        
        <h3>Choosing memory type</h3>

        Physical devices in Vulkan support various combinations of memory heaps and types. Help with choosing correct and optimal memory type for your specific
        resource is one of the key features of this library. You can use it by filling appropriate members of VmaAllocationCreateInfo structure, as described
        below. You can also combine multiple methods.
        ${ol(
            "If you just want to find memory type index that meets your requirements, you can use function #FindMemoryTypeIndex().",
            """
            If you want to allocate a region of device memory without association with any specific image or buffer, you can use function #AllocateMemory().
            Usage of this function is not recommended and usually not needed.
            """,
            """
            If you already have a buffer or an image created, you want to allocate memory for it and then you will bind it yourself, you can use function
            #AllocateMemoryForBuffer(), #AllocateMemoryForImage(). For binding you should use functions: #BindBufferMemory(), #BindImageMemory().
            """,
            """
            If you want to create a buffer or an image, allocate memory for it and bind them together, all in one call, you can use function #CreateBuffer(),
            #CreateImage(). This is the recommended way to use this library.
            """
        )}
        When using 3. or 4., the library internally queries Vulkan for memory types supported for that buffer or image (function
        {@code vkGetBufferMemoryRequirements()}) and uses only one of these types.

        If no memory type can be found that meets all the requirements, these functions return {@code VK_ERROR_FEATURE_NOT_PRESENT}.

        You can leave ##VmaAllocationCreateInfo structure completely filled with zeros. It means no requirements are specified for memory type. It is valid,
        although not very useful.

        <h4>Usage</h4>

        The easiest way to specify memory requirements is to fill member ##VmaAllocationCreateInfo{@code ::usage} using one of the values of enum
        {@code VmaMemoryUsage}. It defines high level, common usage types. For more details, see description of this enum.

        For example, if you want to create a uniform buffer that will be filled using transfer only once or infrequently and used for rendering every frame,
        you can do it using following code:

        ${codeBlock("""
VkBufferCreateInfo bufferInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
bufferInfo.size = 65536;
bufferInfo.usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;

VmaAllocationCreateInfo allocInfo = {};
allocInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY;

VkBuffer buffer;
VmaAllocation allocation;
vmaCreateBuffer(allocator, &bufferInfo, &allocInfo, &buffer, &allocation, nullptr);""")}

        <h4>Required and preferred flags</h4>

        You can specify more detailed requirements by filling members ##VmaAllocationCreateInfo{@code ::requiredFlags} and
        ##VmaAllocationCreateInfo{@code ::preferredFlags} with a combination of bits from enum {@code VkMemoryPropertyFlags}. For example, if you want to
        create a buffer that will be persistently mapped on host (so it must be {@code HOST_VISIBLE}) and preferably will also be {@code HOST_COHERENT} and
        {@code HOST_CACHED}, use following code:

        ${codeBlock("""
VmaAllocationCreateInfo allocInfo = {};
allocInfo.requiredFlags = VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT;
allocInfo.preferredFlags = VK_MEMORY_PROPERTY_HOST_COHERENT_BIT | VK_MEMORY_PROPERTY_HOST_CACHED_BIT;
allocInfo.flags = VMA_ALLOCATION_CREATE_MAPPED_BIT;

VkBuffer buffer;
VmaAllocation allocation;
vmaCreateBuffer(allocator, &bufferInfo, &allocInfo, &buffer, &allocation, nullptr);""")}

        A memory type is chosen that has all the required flags and as many preferred flags set as possible.

        If you use ##VmaAllocationCreateInfo{@code ::usage}, it is just internally converted to a set of required and preferred flags.

        <h4>Explicit memory types</h4>

        If you inspected memory types available on the physical device and you have a preference for memory types that you want to use, you can fill member
        ##VmaAllocationCreateInfo{@code ::memoryTypeBits}. It is a bit mask, where each bit set means that a memory type with that index is allowed to be used
        for the allocation. Special value 0, just like {@code UINT32_MAX}, means there are no restrictions to memory type index.

        Please note that this member is NOT just a memory type index. Still you can use it to choose just one, specific memory type. For example, if you
        already determined that your buffer should be created in memory type 2, use following code:

        ${codeBlock("""
uint32_t memoryTypeIndex = 2;

VmaAllocationCreateInfo allocInfo = {};
allocInfo.memoryTypeBits = 1u << memoryTypeIndex;

VkBuffer buffer;
VmaAllocation allocation;
vmaCreateBuffer(allocator, &bufferInfo, &allocInfo, &buffer, &allocation, nullptr);""")}

        <h4>Custom memory pools</h4>

        If you allocate from custom memory pool, all the ways of specifying memory requirements described above are not applicable and the aforementioned
        members of ##VmaAllocationCreateInfo structure are ignored. Memory type is selected explicitly when creating the pool and then used to make all the
        allocations from that pool. For further details, see Custom Memory Pools below.


        <h3>Memory mapping</h3>

        To "map memory" in Vulkan means to obtain a CPU pointer to {@code VkDeviceMemory}, to be able to read from it or write to it in CPU code. Mapping is
        possible only of memory allocated from a memory type that has {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT} flag. Functions {@code vkMapMemory()},
        {@code vkUnmapMemory()} are designed for this purpose. You can use them directly with memory allocated by this library, but it is not recommended
        because of following issue: Mapping the same {@code VkDeviceMemory} block multiple times is illegal - only one mapping at a time is allowed. This
        includes mapping disjoint regions. Mapping is not reference-counted internally by Vulkan. Because of this, Vulkan Memory Allocator provides following
        facilities:

        <h4>Mapping functions</h4>

        The library provides following functions for mapping of a specific {@code VmaAllocation}: #MapMemory(), #UnmapMemory(). They are safer and more
        convenient to use than standard Vulkan functions. You can map an allocation multiple times simultaneously - mapping is reference-counted internally.
        You can also map different allocations simultaneously regardless of whether they use the same {@code VkDeviceMemory} block. They way it's implemented
        is that the library always maps entire memory block, not just region of the allocation. For further details, see description of #MapMemory() function.
        Example:

        ${codeBlock("""
// Having these objects initialized:

struct ConstantBuffer
{
    ...
};
ConstantBuffer constantBufferData;

VmaAllocator allocator;
VmaBuffer constantBuffer;
VmaAllocation constantBufferAllocation;

// You can map and fill your buffer using following code:

void* mappedData;
vmaMapMemory(allocator, constantBufferAllocation, &mappedData);
memcpy(mappedData, &constantBufferData, sizeof(constantBufferData));
vmaUnmapMemory(allocator, constantBufferAllocation);""")}

        <h4>Persistently mapped memory</h4>

        Kepping your memory persistently mapped is generally OK in Vulkan. You don't need to unmap it before using its data on the GPU. The library provides a
        special feature designed for that: Allocations made with #ALLOCATION_CREATE_MAPPED_BIT flag set in ##VmaAllocationCreateInfo{@code ::flags} stay mapped
        all the time, so you can just access CPU pointer to it any time without a need to call any "map" or "unmap" function. Example:

        ${codeBlock("""
VkBufferCreateInfo bufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
bufCreateInfo.size = sizeof(ConstantBuffer);
bufCreateInfo.usage = VK_BUFFER_USAGE_TRANSFER_SRC_BIT;

VmaAllocationCreateInfo allocCreateInfo = {};
allocCreateInfo.usage = VMA_MEMORY_USAGE_CPU_ONLY;
allocCreateInfo.flags = VMA_ALLOCATION_CREATE_MAPPED_BIT;

VkBuffer buf;
VmaAllocation alloc;
VmaAllocationInfo allocInfo;
vmaCreateBuffer(allocator, &bufCreateInfo, &allocCreateInfo, &buf, &alloc, &allocInfo);

// Buffer is already mapped. You can access its memory.
memcpy(allocInfo.pMappedData, &constantBufferData, sizeof(constantBufferData));""")}

        There are some exceptions though, when you should consider mapping memory only for a short period of time:
        ${ul(
            """
            When operating system is Windows 7 or 8.x (Windows 10 is not affected because it uses WDDM2), device is discrete AMD GPU, and memory type is the
            special 256 MiB pool of {@code DEVICE_LOCAL + HOST_VISIBLE} memory (selected when you use #MEMORY_USAGE_CPU_TO_GPU), then whenever a memory block
            allocated from this memory type stays mapped for the time of any call to {@code vkQueueSubmit()} or {@code vkQueuePresentKHR()}, this block is
            migrated by WDDM to system RAM, which degrades performance. It doesn't matter if that particular memory block is actually used by the command
            buffer being submitted.
            """,
            "Keeping many large memory blocks mapped may impact performance or stability of some debugging tools."
        )}

        <h4>Cache control</h4>
  
        Memory in Vulkan doesn't need to be unmapped before using it on GPU, but unless a memory types has {@code VK_MEMORY_PROPERTY_HOST_COHERENT_BIT} flag
        set, you need to manually invalidate cache before reading of mapped pointer using function {@code vkInvalidateMappedMemoryRanges()} and flush cache
        after writing to mapped pointer using function {@code vkFlushMappedMemoryRanges()}. Example:

        ${codeBlock("""
memcpy(allocInfo.pMappedData, &constantBufferData, sizeof(constantBufferData));

VkMemoryPropertyFlags memFlags;
vmaGetMemoryTypeProperties(allocator, allocInfo.memoryType, &memFlags);
if((memFlags & VK_MEMORY_PROPERTY_HOST_COHERENT_BIT) == 0)
{
    VkMappedMemoryRange memRange = { VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE };
    memRange.memory = allocInfo.deviceMemory;
    memRange.offset = allocInfo.offset;
    memRange.size   = allocInfo.size;
    vkFlushMappedMemoryRanges(device, 1, &memRange);
}""")}

        Please note that memory allocated with #MEMORY_USAGE_CPU_ONLY is guaranteed to be host coherent.

        Also, Windows drivers from all 3 PC GPU vendors (AMD, Intel, NVIDIA) currently provide {@code VK_MEMORY_PROPERTY_HOST_COHERENT_BIT} flag on all memory
        types that are {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT}, so on this platform you may not need to bother.

        <h4>Finding out if memory is mappable</h4>

        It may happen that your allocation ends up in memory that is {@code HOST_VISIBLE} (available for mapping) despite it wasn't explicitly requested. For
        example, application may work on integrated graphics with unified memory (like Intel) or allocation from video memory might have failed, so the library
        chose system memory as fallback.

        You can detect this case and map such allocation to access its memory on CPU directly, instead of launching a transfer operation. In order to do that:
        inspect {@code allocInfo.memoryType}, call #GetMemoryTypeProperties(), and look for {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT} flag in properties of
        that memory type.

        ${code("""
VkBufferCreateInfo bufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
bufCreateInfo.size = sizeof(ConstantBuffer);
bufCreateInfo.usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;

VmaAllocationCreateInfo allocCreateInfo = {};
allocCreateInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY;

VkBuffer buf;
VmaAllocation alloc;
VmaAllocationInfo allocInfo;
vmaCreateBuffer(allocator, &bufCreateInfo, &allocCreateInfo, &buf, &alloc, &allocInfo);

VkMemoryPropertyFlags memFlags;
vmaGetMemoryTypeProperties(allocator, allocInfo.memoryType, &memFlags);
if((memFlags & VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT) == 0)
{
    // Allocation ended up in mappable memory. You can map it and access it directly.
    void* mappedData;
    vmaMapMemory(allocator, alloc, &mappedData);
    memcpy(mappedData, &constantBufferData, sizeof(constantBufferData));
    vmaUnmapMemory(allocator, alloc);
}
else
{
    // Allocation ended up in non-mappable memory.
    // You need to create CPU-side buffer in VMA_MEMORY_USAGE_CPU_ONLY and make a transfer.
}""")}

        You can even use #ALLOCATION_CREATE_MAPPED_BIT flag while creating allocations that are not necessarily {@code HOST_VISIBLE} (e.g. using
        #MEMORY_USAGE_GPU_ONLY). If the allocation ends up in memory type that is {@code HOST_VISIBL}E, it will be persistently mapped and you can use it
        directly. If not, the flag is just ignored. Example:

        ${code("""
VkBufferCreateInfo bufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
bufCreateInfo.size = sizeof(ConstantBuffer);
bufCreateInfo.usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;

VmaAllocationCreateInfo allocCreateInfo = {};
allocCreateInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY;
allocCreateInfo.flags = VMA_ALLOCATION_CREATE_MAPPED_BIT;

VkBuffer buf;
VmaAllocation alloc;
VmaAllocationInfo allocInfo;
vmaCreateBuffer(allocator, &bufCreateInfo, &allocCreateInfo, &buf, &alloc, &allocInfo);

if(allocInfo.pUserData != nullptr)
{
    // Allocation ended up in mappable memory.
    // It's persistently mapped. You can access it directly.
    memcpy(allocInfo.pMappedData, &constantBufferData, sizeof(constantBufferData));
}
else
{
    // Allocation ended up in non-mappable memory.
    // You need to create CPU-side buffer in VMA_MEMORY_USAGE_CPU_ONLY and make a transfer.
}""")}

        <h3>Custom memory pools</h3>

        A memory pool contains a number of {@code VkDeviceMemory} blocks. The library automatically creates and manages default pool for each memory type
        available on the device. Default memory pool automatically grows in size. Size of allocated blocks is also variable and managed automatically.

        You can create custom pool and allocate memory out of it. It can be useful if you want to:
        ${ul(
            "Keep certain kind of allocations separate from others.",
            "Enforce particular, fixed size of Vulkan memory blocks.",
            "Limit maximum amount of Vulkan memory allocated for that pool.",
            "Reserve minimum or fixed amount of Vulkan memory always preallocated for that pool."
        )}

        To use custom memory pools:
        ${ol(
            "Fill ##VmaPoolCreateInfo structure.",
            "Call #CreatePool() to obtain {@code VmaPool} handle.",
            """
            When making an allocation, set ##VmaAllocationCreateInfo{@code ::pool} to this handle. You don't need to specify any other parameters of this
            structure, like usage.
            """
        )}
        Example:

        ${codeBlock("""
// Create a pool that can have at most 2 blocks, 128 MiB each.
VmaPoolCreateInfo poolCreateInfo = {};
poolCreateInfo.memoryTypeIndex = ...
poolCreateInfo.blockSize = 128ull * 1024 * 1024;
poolCreateInfo.maxBlockCount = 2;

VmaPool pool;
vmaCreatePool(allocator, &poolCreateInfo, &pool);

// Allocate a buffer out of it.
VkBufferCreateInfo bufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
bufCreateInfo.size = 1024;
bufCreateInfo.usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;

VmaAllocationCreateInfo allocCreateInfo = {};
allocCreateInfo.pool = pool;

VkBuffer buf;
VmaAllocation alloc;
VmaAllocationInfo allocInfo;
vmaCreateBuffer(allocator, &bufCreateInfo, &allocCreateInfo, &buf, &alloc, &allocInfo);""")}

        You have to free all allocations made from this pool before destroying it.

        ${codeBlock("""
vmaDestroyBuffer(allocator, buf, alloc);
vmaDestroyPool(allocator, pool);""")}

        <h4>Choosing memory type index</h4>

        When creating a pool, you must explicitly specify memory type index. To find the one suitable for your buffers or images, you can use helper functions
        #FindMemoryTypeIndexForBufferInfo(), #FindMemoryTypeIndexForImageInfo(). You need to provide structures with example parameters of buffers or images
        that you are going to create in that pool.

        ${codeBlock("""
VkBufferCreateInfo exampleBufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
exampleBufCreateInfo.size = 1024; // Whatever.
exampleBufCreateInfo.usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT; // Change if needed.

VmaAllocationCreateInfo allocCreateInfo = {};
allocCreateInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY; // Change if needed.

uint32_t memTypeIndex;
vmaFindMemoryTypeIndexForBufferInfo(allocator, &exampleBufCreateInfo, &allocCreateInfo, &memTypeIndex);

VmaPoolCreateInfo poolCreateInfo = {};
poolCreateInfo.memoryTypeIndex = memTypeIndex;
// ...""")}

        When creating buffers/images allocated in that pool, provide following parameters:

        ${ul(
            """
            {@code VkBufferCreateInfo}: Prefer to pass same parameters as above. Otherwise you risk creating resources in a memory type that is not suitable
            for them, which may result in undefined behavior. Using different {@code VK_BUFFER_USAGE_} flags may work, but you shouldn't create images in a
            pool intended for buffers or the other way around.
            """,
            "##VmaAllocationCreateInfo: You don't need to pass same parameters. Fill only {@code pool} member. Other members are ignored anyway."
        )}

        <h3>Defragmentation</h3>

        Interleaved allocations and deallocations of many objects of varying size can cause fragmentation, which can lead to a situation where the library is
        unable to find a continuous range of free memory for a new allocation despite there is enough free space, just scattered across many small free ranges
        between existing allocations.

        To mitigate this problem, you can use #Defragment(). Given set of allocations, this function can move them to compact used memory, ensure more
        continuous free space and possibly also free some {@code VkDeviceMemory}. It can work only on allocations made from memory type that is
        {@code HOST_VISIBLE}. Allocations are modified to point to the new {@code VkDeviceMemory} and offset. Data in this memory is also {@code memmove}-ed to
        the new place. However, if you have images or buffers bound to these allocations (and you certainly do), you need to destroy, recreate, and bind them
        to the new place in memory.

        For further details and example code, see documentation of function #Defragment().

        <h3>Lost allocations</h3>

        If your game oversubscribes video memory, it may work OK in previous-generation graphics APIs (DirectX 9, 10, 11, OpenGL) because resources are
        automatically paged to system RAM. In Vulkan you can't do it because when you run out of memory, an allocation just fails. If you have more data (e.g.
        textures) than can fit into VRAM and you don't need it all at once, you may want to upload them to GPU on demand and "push out" ones that are not used
        for a long time to make room for the new ones, effectively using VRAM (or a cartain memory pool) as a form of cache. Vulkan Memory Allocator can help
        you with that by supporting a concept of "lost allocations".

        To create an allocation that can become lost, include #ALLOCATION_CREATE_CAN_BECOME_LOST_BIT flag in ##VmaAllocationCreateInfo{@code ::flags}. Before
        using a buffer or image bound to such allocation in every new frame, you need to query it if it's not lost. To check it, call #TouchAllocation(). If
        the allocation is lost, you should not use it or buffer/image bound to it. You mustn't forget to destroy this allocation and this buffer/image.
        #GetAllocationInfo() can also be used for checking status of the allocation. Allocation is lost when returned ##VmaAllocationInfo{@code ::deviceMemory}
        == {@code VK_NULL_HANDLE}.

        To create an allocation that can make some other allocations lost to make room for it, use #ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT flag. You will
        usually use both flags #ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT and #ALLOCATION_CREATE_CAN_BECOME_LOST_BIT at the same time.

        Warning! Current implementation uses quite naive, brute force algorithm, which can make allocation calls that use
        #ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT flag quite slow. A new, more optimal algorithm and data structure to speed this up is planned for the
        future.

        <b>Q: When interleaving creation of new allocations with usage of existing ones, how do you make sure that an allocation won't become lost while it's used
        in the current frame?</b>

        It is ensured because #TouchAllocation() / #GetAllocationInfo() not only returns allocation status/parameters and checks whether it's not lost, but
        when it's not, it also atomically marks it as used in the current frame, which makes it impossible to become lost in that frame. It uses lockless
        algorithm, so it works fast and doesn't involve locking any internal mutex.

        <b>Q: What if my allocation may still be in use by the GPU when it's rendering a previous frame while I already submit new frame on the CPU?</b>

        You can make sure that allocations "touched" by #TouchAllocation() / #GetAllocationInfo() will not become lost for a number of additional frames back
        from the current one by specifying this number as ##VmaAllocatorCreateInfo{@code ::frameInUseCount} (for default memory pool) and
        ##VmaPoolCreateInfo{@code ::frameInUseCount} (for custom pool).

        <b>Q: How do you inform the library when new frame starts?</b>

        You need to call function #SetCurrentFrameIndex().

        Example code:

        ${codeBlock("""
struct MyBuffer
{
    VkBuffer m_Buf = nullptr;
    VmaAllocation m_Alloc = nullptr;

    // Called when the buffer is really needed in the current frame.
    void EnsureBuffer();
};

void MyBuffer::EnsureBuffer()
{
    // Buffer has been created.
    if(m_Buf != VK_NULL_HANDLE)
    {
        // Check if its allocation is not lost + mark it as used in current frame.
        if(vmaTouchAllocation(allocator, m_Alloc))
        {
            // It's all OK - safe to use m_Buf.
            return;
        }
    }

    // Buffer not yet exists or lost - destroy and recreate it.

    vmaDestroyBuffer(allocator, m_Buf, m_Alloc);

    VkBufferCreateInfo bufCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
    bufCreateInfo.size = 1024;
    bufCreateInfo.usage = VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;

    VmaAllocationCreateInfo allocCreateInfo = {};
    allocCreateInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY;
    allocCreateInfo.flags = VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT |
        VMA_ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT;

    vmaCreateBuffer(allocator, &bufCreateInfo, &allocCreateInfo, &m_Buf, &m_Alloc, nullptr);
}""")}

        When using lost allocations, you may see some Vulkan validation layer warnings about overlapping regions of memory bound to different kinds of buffers
        and images. This is still valid as long as you implement proper handling of lost allocations (like in the example above) and don't use them.

        You can create an allocation that is already in lost state from the beginning using function #CreateLostAllocation(). It may be useful if you need a
        "dummy" allocation that is not null.

        You can call function #MakePoolAllocationsLost() to set all eligible allocations in a specified custom pool to lost state. Allocations that have been
        "touched" in current frame or ##VmaPoolCreateInfo{@code ::frameInUseCount} frames back cannot become lost.

        <h3>Statistics</h3>

        This library contains functions that return information about its internal state, especially the amount of memory allocated from Vulkan. Please keep in
        mind that these functions need to traverse all internal data structures to gather these information, so they may be quite time-consuming. Don't call
        them too often.

        <h4>Numeric statistics</h4>

        You can query for overall statistics of the allocator using function #CalculateStats(). Information are returned using structure ##VmaStats. It
        contains ##VmaStatInfo - number of allocated blocks, number of allocations (occupied ranges in these blocks), number of unused (free) ranges in these
        blocks, number of bytes used and unused (but still allocated from Vulkan) and other information. They are summed across memory heaps, memory types and
        total for whole allocator.

        You can query for statistics of a custom pool using function #GetPoolStats(). Information are returned using structure ##VmaPoolStats.

        You can query for information about specific allocation using function #GetAllocationInfo(). It fill structure ##VmaAllocationInfo.

        <h3>JSON dump</h3>

        You can dump internal state of the allocator to a string in JSON format using function #BuildStatsString(). The result is guaranteed to be correct
        JSON. It uses ANSI encoding. Any strings provided by user are copied as-is and properly escaped for JSON, so if they use UTF-8, ISO-8859-2 or any other
        encoding, this JSON string can be treated as using this encoding. It must be freed using function #FreeStatsString().

        The format of this JSON string is not part of official documentation of the library, but it will not change in backward-incompatible way without
        increasing library major version number and appropriate mention in changelog.

        The JSON string contains all the data that can be obtained using #CalculateStats(). It can also contain detailed map of allocated memory blocks and
        their regions - free and occupied by allocations. This allows e.g. to visualize the memory or assess fragmentation.

        <h3>Allocation names and user data</h3>

        <h4>Allocation user data</h4>

        You can annotate allocations with your own information, e.g. for debugging purposes. To do that, fill ##VmaAllocationCreateInfo{@code ::pUserData}
        field when creating an allocation. It's an opaque {@code void*} pointer. You can use it e.g. as a pointer, some handle, index, key, ordinal number or
        any other value that would associate the allocation with your custom metadata.

        ${codeBlock("""
VkBufferCreateInfo bufferInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO };
// Fill bufferInfo...

MyBufferMetadata* pMetadata = CreateBufferMetadata();

VmaAllocationCreateInfo allocCreateInfo = {};
allocCreateInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY;
allocCreateInfo.pUserData = pMetadata;

VkBuffer buffer;
VmaAllocation allocation;
vmaCreateBuffer(allocator, &bufferInfo, &allocCreateInfo, &buffer, &allocation, nullptr);""")}

        The pointer may be later retrieved as ##VmaAllocationInfo{@code ::pUserData}:

        ${codeBlock("""
VmaAllocationInfo allocInfo;
vmaGetAllocationInfo(allocator, allocation, &allocInfo);
MyBufferMetadata* pMetadata = (MyBufferMetadata*)allocInfo.pUserData;""")}

        It can also be changed using function #SetAllocationUserData().

        Values of (non-zero) allocations' {@code pUserData} are printed in JSON report created by #BuildStatsString(), in hexadecimal form.

        <h4>Allocation names</h4>

        There is alternative mode available where {@code pUserData} pointer is used to point to a null-terminated string, giving a name to the allocation. To
        use this mode, set #ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT flag in ##VmaAllocationCreateInfo{@code ::flags}. Then {@code pUserData} passed as
        ##VmaAllocationCreateInfo{@code ::pUserData} or argument to #SetAllocationUserData() must be either null or pointer to a null-terminated string. The
        library creates internal copy of the string, so the pointer you pass doesn't need to be valid for whole lifetime of the allocation. You can free it
        after the call.

        ${codeBlock("""
VkImageCreateInfo imageInfo = { VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO };
// Fill imageInfo...

std::string imageName = "Texture: ";
imageName += fileName;

VmaAllocationCreateInfo allocCreateInfo = {};
allocCreateInfo.usage = VMA_MEMORY_USAGE_GPU_ONLY;
allocCreateInfo.flags = VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT;
allocCreateInfo.pUserData = imageName.c_str();

VkImage image;
VmaAllocation allocation;
vmaCreateImage(allocator, &imageInfo, &allocCreateInfo, &image, &allocation, nullptr);""")}

        The value of {@code pUserData} pointer of the allocation will be different than the one you passed when setting allocation's name - pointing to a
        buffer managed internally that holds copy of the string.

        ${codeBlock("""
VmaAllocationInfo allocInfo;
vmaGetAllocationInfo(allocator, allocation, &allocInfo);
const char* imageName = (const char*)allocInfo.pUserData;
printf("Image name: %s\n", imageName);""")}

        That string is also printed in JSON report created by #BuildStatsString().

        <h3>Recommended usage patterns</h3>

        <h4>Simple patterns</h4>

        <h5>Render targets</h5>

        <b>When:</b> Any resources that you frequently write and read on GPU, e.g. images used as color attachments (aka "render targets"), depth-stencil
        attachments, images/buffers used as storage image/buffer (aka "Unordered Access View (UAV)").

        <b>What to do:</b> Create them in video memory that is fastest to access from GPU using #MEMORY_USAGE_GPU_ONLY.

        Consider using {@code VK_KHR_dedicated_allocation} extension and/or manually creating them as dedicated allocations using
        #ALLOCATION_CREATE_DEDICATED_MEMORY_BIT, especially if they are large or if you plan to destroy and recreate them e.g. when display resolution changes.
        Prefer to create such resources first and all other GPU resources (like textures and vertex buffers) later.

        <h5>Immutable resources</h5>

        <b>When:</b> Any resources that you fill on CPU only once (aka "immutable") or infrequently and then read frequently on GPU, e.g. textures, vertex and
        index buffers, constant buffers that don't change often.

        <b>What to do:</b> Create them in video memory that is fastest to access from GPU using #MEMORY_USAGE_GPU_ONLY.

        To initialize content of such resource, create a CPU-side (aka "staging") copy of it in system memory - #MEMORY_USAGE_CPU_ONLY, map it, fill it, and
        submit a transfer from it to the GPU resource. You can keep the staging copy if you need it for another upload transfer in the future. If you don't,
        you can destroy it or reuse this buffer for uploading different resource after the transfer finishes.

        Prefer to create just buffers in system memory rather than images, even for uploading textures. Use {@code vkCmdCopyBufferToImage()}. Dont use images
        with {@code VK_IMAGE_TILING_LINEA}R.

        <h5>Dynamic resources</h5>

        <b>When:</b> Any resources that change frequently (aka "dynamic"), e.g. every frame or every draw call, written on CPU, read on GPU.

        <b>What to do:</b> Create them using #MEMORY_USAGE_CPU_TO_GPU. You can map it and write to it directly on CPU, as well as read from it on GPU.

        This is a more complex situation. Different solutions are possible, and the best one depends on specific GPU type, but you can use this simple approach
        for the start. Prefer to write to such resource sequentially (e.g. using {@code memcpy}). Don't perform random access or any reads from it, as it may
        be very slow.

        <h5>Readback</h5>

        <b>When:</b> Resources that contain data written by GPU that you want to read back on CPU, e.g. results of some computations.

        <b>What to do:</b> Create them using #MEMORY_USAGE_GPU_TO_CPU. You can write to them directly on GPU, as well as map and read them on CPU.

        <h4>Advanced patterns</h4>

        <h5>Detecting integrated graphics</h5>

        You can support integrated graphics (like Intel HD Graphics, AMD APU) better by detecting it in Vulkan. To do it, call
        {@code vkGetPhysicalDeviceProperties()}, inspect {@code VkPhysicalDeviceProperties::deviceType} and look for
        {@code VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU}. When you find it, you can assume that memory is unified and all memory types are equally fast to access
        from GPU, regardless of {@code VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT}.

        You can then sum up sizes of all available memory heaps and treat them as useful for your GPU resources, instead of only {@code DEVICE_LOCAL} ones. You
        can also prefer to create your resources in memory types that are {@code HOST_VISIBLE} to map them directly instead of submitting explicit transfer
        (see below).

        <h5>Direct access versus transfer</h5>

        For resources that you frequently write on CPU and read on GPU, many solutions are possible:

        ${ol(
            """
            Create one copy in video memory using #MEMORY_USAGE_GPU_ONLY, second copy in system memory using #MEMORY_USAGE_CPU_ONLY and submit explicit tranfer
            each time.
            """,
            "Create just single copy using #MEMORY_USAGE_CPU_TO_GPU, map it and fill it on CPU, read it directly on GPU.",
            "Create just single copy using #MEMORY_USAGE_CPU_ONLY, map it and fill it on CPU, read it directly on GPU."
        )}

        Which solution is the most efficient depends on your resource and especially on the GPU. It is best to measure it and then make the decision. Some
        general recommendations:

        ${ul(
            "On integrated graphics use (2) or (3) to avoid unnecesary time and memory overhead related to using a second copy.",
            """
            For small resources (e.g. constant buffers) use (2). Discrete AMD cards have special 256 MiB pool of video memory that is directly mappable. Even
            if the resource ends up in system memory, its data may be cached on GPU after first fetch over PCIe bus.
            """,
            """
            For larger resources (e.g. textures), decide between (1) and (2). You may want to differentiate NVIDIA and AMD, e.g. by looking for memory type
            that is both {@code DEVICE_LOCAL} and {@code HOST_VISIBLE}. When you find it, use (2), otherwise use (1).
            """
        )}

        Similarly, for resources that you frequently write on GPU and read on CPU, multiple solutions are possible:

        ${ol(
            """
            Create one copy in video memory using #MEMORY_USAGE_GPU_ONLY, second copy in system memory using #MEMORY_USAGE_GPU_TO_CPU and submit explicit
            transfer each time.
            """,
            "Create just single copy using #MEMORY_USAGE_GPU_TO_CPU, write to it directly on GPU, map it and read it on CPU."
        )}

        You should take some measurements to decide which option is faster in case of your specific resource.

        If you don't want to specialize your code for specific types of GPUs, you can still make an simple optimization for cases when your resource ends up in
        mappable memory to use it directly in this case instead of creating CPU-side staging copy. For details see <em>Finding out if memory is mappable</em>.

        <h3>Configuration</h3>

        <h4>Custom host memory allocator</h4>

        If you use custom allocator for CPU memory rather than default operator {@code new} and {@code delete} from C++, you can make this library using your
        allocator as well by filling optional member ##VmaAllocatorCreateInfo{@code ::pAllocationCallbacks}. These functions will be passed to Vulkan, as well
        as used by the library itself to make any CPU-side allocations.

        <h4>Device memory allocation callbacks</h4>

        The library makes calls to {@code vkAllocateMemory()} and {@code vkFreeMemory()} internally. You can setup callbacks to be informed about these calls,
        e.g. for the purpose of gathering some statistics. To do it, fill optional member ##VmaAllocatorCreateInfo{@code ::pDeviceMemoryCallbacks}.

        <h4>Device heap memory limit</h4>

        If you want to test how your program behaves with limited amount of Vulkan device memory available without switching your graphics card to one that
        really has smaller VRAM, you can use a feature of this library intended for this purpose. To do it, fill optional member
        ##VmaAllocatorCreateInfo{@code ::pHeapSizeLimit}.

        <h3>VK_KHR_dedicated_allocation</h3>

        {@code VK_KHR_dedicated_allocation} is a Vulkan extension which can be used to improve performance on some GPUs. It augments Vulkan API with
        possibility to query driver whether it prefers particular buffer or image to have its own, dedicated allocation (separate {@code VkDeviceMemory} block)
        for better efficiency - to be able to do some internal optimizations.

        The extension is supported by this library. It will be used automatically when enabled. To enable it:

        1 . When creating Vulkan device, check if following 2 device extensions are supported (call {@code vkEnumerateDeviceExtensionProperties()}). If yes,
        enable them (fill ##VkDeviceCreateInfo{@code ::ppEnabledExtensionNames}).

        ${ul(
            "{@code VK_KHR_get_memory_requirements2}",
            "{@code VK_KHR_dedicated_allocation}"
        )}

        If you enabled these extensions:

        2 . Use #ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT flag when creating your {@code VmaAllocator} to inform the library that you enabled required
        extensions and you want the library to use them.

        ${codeBlock("""
allocatorInfo.flags |= VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT;

vmaCreateAllocator(&allocatorInfo, &allocator);""")}

        That's all. The extension will be automatically used whenever you create a buffer using #CreateBuffer() or image using #CreateImage().

        When using the extension together with Vulkan Validation Layer, you will receive warnings like this:
${codeBlock("""
vkBindBufferMemory(): Binding memory to buffer 0x33 but vkGetBufferMemoryRequirements() has not been called on that buffer.""")}

        It is OK, you should just ignore it. It happens because you use function {@code vkGetBufferMemoryRequirements2KHR()} instead of standard
        {@code vkGetBufferMemoryRequirements()}, while the validation layer seems to be unaware of it.

        To learn more about this extension, see:

        ${ul(
            """<a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VK_KHR_dedicated_allocation">VK_KHR_dedicated_allocation in Vulkan specification</a>""",
            """<a href="http://asawicki.info/articles/VK_KHR_dedicated_allocation.php5">VK_KHR_dedicated_allocation unofficial manual</a>"""
        )}

        <h3>General considerations</h3>

        <h4>Thread safety</h4>

        ${ul(
            """
            The library has no global state, so separate {@code VmaAllocator} objects can be used independently. There should be no need to create multiple
            such objects though - one per {@code VkDevice} is enough.
            """,
            """
            By default, all calls to functions that take {@code VmaAllocator} as first parameter are safe to call from multiple threads simultaneously because
            they are synchronized internally when needed.
            """,
            """
            When the allocator is created with #ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT flag, calls to functions that take such {@code VmaAllocator}
            object must be synchronized externally.
            """,
            """
            Access to a {@code VmaAllocation} object must be externally synchronized. For example, you must not call #GetAllocationInfo() and #MapMemory() from
            different threads at the same time if you pass the same {@code VmaAllocation} object to these functions.
            """
        )}

        <h4>Allocation algorithm</h4>
        
        The library uses following algorithm for allocation, in order:
        
        ${ol(
            "Try to find free range of memory in existing blocks.",
            "If failed, try to create a new block of {@code VkDeviceMemor}y, with preferred block size.",
            "If failed, try to create such block with size/2, size/4, size/8.",
            """
            If failed and #ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT flag was specified, try to find space in existing blocks, possilby making some other
            allocations lost.
            """,
            "If failed, try to allocate separate {@code VkDeviceMemory} for this allocation, just like when you use #ALLOCATION_CREATE_DEDICATED_MEMORY_BIT.",
            "If failed, choose other memory type that meets the requirements specified in ##VmaAllocationCreateInfo and go to point 1.",
            "If failed, return {@code VK_ERROR_OUT_OF_DEVICE_MEMORY}."
        )}

        <h4>Features not supported</h4>

        Features deliberately excluded from the scope of this library:
        ${ul(
            """
            Data transfer - issuing commands that transfer data between buffers or images, any usage of {@code VkCommandList} or {@code VkCommandQueue} and
            related synchronization is responsibility of the user.
            """,
            "Support for any programming languages other than C/C++. Bindings to other languages are welcomed as external projects."
        )}
        """

    EnumConstant(
        "Flags for created {@code VmaAllocator}. ({@code VmaAllocatorCreateFlagBits})",

        "ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT".enum(
            """
            Allocator and all objects created from it will not be synchronized internally, so you must guarantee they are used from only one thread at a time
            or synchronized externally by you.

            Using this flag may increase performance because internal mutexes are not used.
            """,
            0x00000001
        ),
        "ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT".enum(
            """
            Enables usage of {@code VK_KHR_dedicated_allocation} extension.

            Using this extenion will automatically allocate dedicated blocks of memory for some buffers and images instead of suballocating place for them out
            of bigger memory blocks (as if you explicitly used #ALLOCATION_CREATE_DEDICATED_MEMORY_BIT flag) when it is recommended by the driver. It may
            improve performance on some GPUs.

            You may set this flag only if you found out that following device extensions are supported, you enabled them while creating Vulkan device passed as
            ##VmaAllocatorCreateInfo{@code ::device}, and you want them to be used internally by this library:
            ${ul(
                "{@code VK_KHR_get_memory_requirements2}",
                "{@code VK_KHR_dedicated_allocation}"
            )}
            When this flag is set, you can experience following warnings reported by Vulkan validation layer. You can ignore them.
            ${codeBlock("""
> vkBindBufferMemory(): Binding memory to buffer 0x2d but vkGetBufferMemoryRequirements() has not been called on that buffer.""")}
            """,
            0x00000002
        )
    )

    EnumConstant(
        "{@code VmaMemoryUsage}",

        "MEMORY_USAGE_UNKNOWN".enum(
            """
            No intended memory usage specified.

            Use other members of ##VmaAllocationCreateInfo to specify your requirements.
            """,
            "0"
        ),
        "MEMORY_USAGE_GPU_ONLY".enum(
            """
            Memory will be used on device only, so fast access from the device is preferred.

            It usually means device-local GPU (video) memory. No need to be mappable on host. It is roughly equivalent of {@code D3D12_HEAP_TYPE_DEFAULT}.

            Usage:
            ${ul(
                "Resources written and read by device, e.g. images used as attachments.",
                """
                Resources transferred from host once (immutable) or infrequently and read by device multiple times, e.g. textures to be sampled, vertex
                buffers, uniform (constant) buffers, and majority of other types of resources used by device.
                """
            )}
            Allocation may still end up in {@code HOST_VISIBLE} memory on some implementations. In such case, you are free to map it. You can use
            #ALLOCATION_CREATE_MAPPED_BIT with this usage type.
            """,
            "2"
        ),
        "MEMORY_USAGE_CPU_ONLY".enum(
            """
            Memory will be mappable on host.

            It usually means CPU (system) memory. Resources created in this pool may still be accessible to the device, but access to them can be slower.
            Guarantees to be {@code HOST_VISIBLE} and {@code HOST_COHERENT}. CPU read may be uncached. It is roughly equivalent of
            {@code D3D12_HEAP_TYPE_UPLOAD}.

            Usage: Staging copy of resources used as transfer source.
            """,
            "1"
        ),
        "MEMORY_USAGE_CPU_TO_GPU".enum(
            """
            Memory that is both mappable on host (guarantees to be {@code HOST_VISIBLE}) and preferably fast to access by GPU.

            CPU reads may be uncached and very slow.

            Usage: Resources written frequently by host (dynamic), read by device. E.g. textures, vertex buffers, uniform buffers updated every frame or every
            draw call.
            """,
            "3"
        ),
        "MEMORY_USAGE_GPU_TO_CPU".enum(
            """
            Memory mappable on host (guarantees to be {@code HOST_VISIBLE}) and cached.

            It is roughly equivalent of {@code D3D12_HEAP_TYPE_READBACK}.

            Usage:
            ${ul(
                "Resources written by device, read by host - results of some computations, e.g. screen capture, average scene luminance for HDR tone mapping.",
                """
                Any resources read or accessed randomly on host, e.g. CPU-side copy of vertex buffer used as source of transfer, but also used for collision
                detection.
                """
            )}
            """,
            "4"
        )
    )

    EnumConstant(
        "Flags to be passed as ##VmaAllocationCreateInfo{@code ::flags}. ({@code VmaAllocationCreateFlagBits})",

        "ALLOCATION_CREATE_DEDICATED_MEMORY_BIT".enum(
            """
            Set this flag if the allocation should have its own memory block.

            Use it for special, big resources, like fullscreen images used as attachments.

            This flag must also be used for host visible resources that you want to map simultaneously because otherwise they might end up as regions of the
            same {@code VkDeviceMemory}, while mapping same {@code VkDeviceMemory} multiple times simultaneously is illegal.

            You should not use this flag if ##VmaAllocationCreateInfo{@code ::pool} is not null.
            """,
            0x00000001
        ),
        "ALLOCATION_CREATE_NEVER_ALLOCATE_BIT".enum(
            """
            Set this flag to only try to allocate from existing {@code VkDeviceMemory} blocks and never create new such block.

            If new allocation cannot be placed in any of the existing blocks, allocation fails with {@code VK_ERROR_OUT_OF_DEVICE_MEMORY} error.

            You should not use #ALLOCATION_CREATE_DEDICATED_MEMORY_BIT and #ALLOCATION_CREATE_NEVER_ALLOCATE_BIT at the same time. It makes no sense.

            If ##VmaAllocationCreateInfo{@code ::pool} is not null, this flag is implied and ignored.
            """,
            0x00000002
        ),
        "ALLOCATION_CREATE_MAPPED_BIT".enum(
            """
            Set this flag to use a memory that will be persistently mapped and retrieve pointer to it.

            Pointer to mapped memory will be returned through ##VmaAllocationInfo{@code ::pMappedData}.

            Is it valid to use this flag for allocation made from memory type that is not {@code HOST_VISIBLE}. This flag is then ignored and memory is not
            mapped. This is useful if you need an allocation that is efficient to use on GPU ({@code DEVICE_LOCAL}) and still want to map it directly if
            possible on platforms that support it (e.g. Intel GPU).

            You should not use this flag together with #ALLOCATION_CREATE_CAN_BECOME_LOST_BIT.
            """,
            0x00000004
        ),
        "ALLOCATION_CREATE_CAN_BECOME_LOST_BIT".enum(
            """
            Allocation created with this flag can become lost as a result of another allocation with #ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT flag, so you
            must check it before use.

            To check if allocation is not lost, call #GetAllocationInfo() and check if ##VmaAllocationInfo{@code ::deviceMemory} is not {@code VK_NULL_HANDLE}.

            For details about supporting lost allocations, see Lost Allocations chapter of User Guide on Main Page.

            You should not use this flag together with #ALLOCATION_CREATE_MAPPED_BIT.
            """,
            0x00000008
        ),
        "ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT".enum(
            """
            While creating allocation using this flag, other allocations that were created with flag #ALLOCATION_CREATE_CAN_BECOME_LOST_BIT can become lost.

            For details about supporting lost allocations, see Lost Allocations chapter of User Guide on Main Page.
            """,
            0x00000010
        ),
        "ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT".enum(
            """
            Set this flag to treat ##VmaAllocationCreateInfo{@code ::pUserData} as pointer to a null-terminated string. Instead of copying pointer value, a
            local copy of the string is made and stored in allocation's {@code pUserData}. The string is automatically freed together with the allocation. It
            is also used in #BuildStatsString().
            """,
            0x00000020
        )
    )

    EnumConstant(
        "Flags to be passed as ##VmaPoolCreateInfo{@code ::flags}. ({@code VmaPoolCreateFlagBits})",

        "POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT".enum(
            """
            Use this flag if you always allocate only buffers and linear images or only optimal images out of this pool and so Buffer-Image Granularity can be
            ignored.

            This is no optional optimization flag.

            If you always allocate using #CreateBuffer(), #CreateImage(), #AllocateMemoryForBuffer(), then you don't need to use it because allocator knows
            exact type of your allocations so it can handle Buffer-Image Granularity in the optimal way.

            If you also allocate using #AllocateMemoryForImage() or #AllocateMemory(), exact type of such allocations is not known, so allocator must be
            conservative in handling Buffer-Image Granularity, which can lead to suboptimal allocation (wasted memory). In that case, if you can make sure you
            always allocate only buffers and linear images or only optimal images out of this pool, use this flag to make allocator disregard Buffer-Image
            Granularity and so make allocations more optimal.
            """,
            0x00000002
        )
    )

    VkResult(
        "CreateAllocator",
        """
        Creates Allocator object.

        LWJGL: Use ##VmaVulkanFunctions{@code ::set(VkInstance, VkDevice)} to populate the ##VmaAllocatorCreateInfo{@code ::pVulkanFunctions} struct.
        """,

        VmaAllocatorCreateInfo.const.p.IN("pCreateInfo", ""),
        Check(1)..VmaAllocator.p.OUT("pAllocator", "")
    )

    void(
        "DestroyAllocator",
        "Destroys allocator object.",

        VmaAllocator.IN("allocator", "")
    )

    void(
        "GetPhysicalDeviceProperties",
        """
        {@code PhysicalDeviceProperties} are fetched from {@code physicalDevice} by the allocator. You can access it here, without fetching it again on your
        own.
        """,

        VmaAllocator.IN("allocator", ""),
        Check(1)..VkPhysicalDeviceProperties.const.p.p.IN("ppPhysicalDeviceProperties", "")
    )

    void(
        "GetMemoryProperties",
        """
        {@code PhysicalDeviceMemoryProperties} are fetched from {@code physicalDevice} by the allocator. You can access it here, without fetching it again on
        your own.
        """,

        VmaAllocator.IN("allocator", ""),
        Check(1)..VkPhysicalDeviceMemoryProperties.const.p.p.IN("ppPhysicalDeviceMemoryProperties", "")
    )

    void(
        "GetMemoryTypeProperties",
        """
        Given Memory Type Index, returns Property Flags of this memory type.

        This is just a convenience function. Same information can be obtained using #GetMemoryProperties().
        """,

        VmaAllocator.IN("allocator", ""),
        uint32_t.IN("memoryTypeIndex", ""),
        Check(1)..VkMemoryPropertyFlags.p.OUT("pFlags", "")
    )

    void(
        "SetCurrentFrameIndex",
        """
        Sets index of the current frame.

        This function must be used if you make allocations with #ALLOCATION_CREATE_CAN_BECOME_LOST_BIT and #ALLOCATION_CREATE_CAN_MAKE_OTHER_LOST_BIT flags to
        inform the allocator when a new frame begins. Allocations queried using #GetAllocationInfo() cannot become lost in the current frame.
        """,

        VmaAllocator.IN("allocator", ""),
        uint32_t.IN("frameIndex", "")
    )

    void(
        "CalculateStats",
        "Retrieves statistics from current state of the Allocator.",

        VmaAllocator.IN("allocator", ""),
        VmaStats.p.OUT("pStats", "")
    )

    void(
        "BuildStatsString",
        "Builds and returns statistics as string in JSON format.",

        VmaAllocator.IN("allocator", ""),
        Check(1)..charASCII.p.p.OUT("ppStatsString", "must be freed using #FreeStatsString() function"),
        VkBool32.IN("detailedMap", "")
    )

    void(
        "FreeStatsString",
        "",

        VmaAllocator.IN("allocator", ""),
        charASCII.p.IN("pStatsString", "")
    )

    VkResult(
        "FindMemoryTypeIndex",
        """
        Helps to find {@code memoryTypeIndex}, given {@code memoryTypeBits} and ##VmaAllocationCreateInfo.

        This algorithm tries to find a memory type that:
        ${ul(
            "Is allowed by {@code memoryTypeBits}.",
            "Contains all the flags from {@code pAllocationCreateInfo->requiredFlags}.",
            "Matches intended usage.",
            "Has as many flags from {@code pAllocationCreateInfo->preferredFlags} as possible."
        )}
        """,

        VmaAllocator.IN("allocator", ""),
        uint32_t.IN("memoryTypeBits", ""),
        VmaAllocationCreateInfo.const.p.IN("pAllocationCreateInfo", ""),
        Check(1)..uint32_t.p.OUT("pMemoryTypeIndex", ""),

        returnDoc =
        """
        {@code VK_ERROR_FEATURE_NOT_PRESENT} if not found.

        Receiving such result from this function or any other allocating function probably means that your device doesn't support any memory type with
        requested features for the specific type of resource you want to use it for. Please check parameters of your resource, like image layout
        ({@code OPTIMAL} versus LINEAR) or mip level count.
        """
    )

    VkResult(
        "FindMemoryTypeIndexForBufferInfo",
        """
        Helps to find {@code memoryTypeIndex}, given {@code VkBufferCreateInfo} and ##VmaAllocationCreateInfo.

        It can be useful e.g. to determine value to be used as ##VmaPoolCreateInfo{@code ::memoryTypeIndex}. It internally creates a temporary, dummy buffer
        that never has memory bound. It is just a convenience function, equivalent to calling:

        ${ul(
            "{@code vkCreateBuffer}",
            "{@code vkGetBufferMemoryRequirements}",
            "#FindMemoryTypeIndex()",
            "{@code vkDestroyBuffer}"
        )}
        """,

        VmaAllocator.IN("allocator", ""),
        VkBufferCreateInfo.const.p.IN("pBufferCreateInfo", ""),
        VmaAllocationCreateInfo.const.p.IN("pAllocationCreateInfo", ""),
        Check(1)..uint32_t.p.OUT("pMemoryTypeIndex", "")
    )

    VkResult(
        "FindMemoryTypeIndexForImageInfo",
        """
        Helps to find {@code memoryTypeIndex}, given {@code VkImageCreateInfo} and ##VmaAllocationCreateInfo.

        It can be useful e.g. to determine value to be used as ##VmaPoolCreateInfo{@code ::memoryTypeIndex}. It internally creates a temporary, dummy image
        that never has memory bound. It is just a convenience function, equivalent to calling:

        ${ul(
            "{@code vkCreateImage}",
            "{@code vkGetImageMemoryRequirements}",
            "#FindMemoryTypeIndex()",
            "{@code vkDestroyImage}"
        )}
        """,

        VmaAllocator.IN("allocator", ""),
        VkImageCreateInfo.const.p.IN("pImageCreateInfo", ""),
        VmaAllocationCreateInfo.const.p.IN("pAllocationCreateInfo", ""),
        Check(1)..uint32_t.p.OUT("pMemoryTypeIndex", "")
    )

    VkResult(
        "CreatePool",
        "Allocates Vulkan device memory and creates {@code VmaPool} object.",

        VmaAllocator.IN("allocator", "Allocator object"),
        VmaPoolCreateInfo.const.p.IN("pCreateInfo", "parameters of pool to create"),
        Check(1)..VmaPool.p.OUT("pPool", "handle to created pool")
    )

    void(
        "DestroyPool",
        "Destroys {@code VmaPool} object and frees Vulkan device memory.",

        VmaAllocator.IN("allocator", ""),
        VmaPool.IN("pool", "")
    )

    void(
        "GetPoolStats",
        "Retrieves statistics of existing VmaPool object.",

        VmaAllocator.IN("allocator", "Allocator object"),
        VmaPool.IN("pool", "pool object"),
        VmaPoolStats.p.OUT("pPoolStats", "statistics of specified pool")
    )

    void(
        "MakePoolAllocationsLost",
        "Marks all allocations in given pool as lost if they are not used in current frame or ##VmaPoolCreateInfo{@code ::frameInUseCount} back from now.",

        VmaAllocator.IN("allocator", "Allocator object"),
        VmaPool.IN("pool", "pool"),
        ReturnParam..nullable..Check(1)..size_t.p.OUT(
            "pLostAllocationCount",
            "number of allocations marked as lost. Optional - pass null if you don't need this information."
        )
    )

    VkResult(
        "AllocateMemory",
        """
        General purpose memory allocation.

        You should free the memory using #FreeMemory().

        It is recommended to use #AllocateMemoryForBuffer(), #AllocateMemoryForImage(), #CreateBuffer(), #CreateImage() instead whenever possible.
        """,

        VmaAllocator.IN("allocator", ""),
        VkMemoryRequirements.const.p.IN("pVkMemoryRequirements", ""),
        VmaAllocationCreateInfo.const.p.IN("pCreateInfo", ""),
        Check(1)..VmaAllocation.p.OUT("pAllocation", "handle to allocated memory"),
        nullable..VmaAllocationInfo.p.OUT(
            "pAllocationInfo",
            "information about allocated memory. Optional. It can be later fetched using function #GetAllocationInfo()."
        )
    )

    VkResult(
        "AllocateMemoryForBuffer",
        """
        Buffer memory allocation.

        You should free the memory using #FreeMemory().
        """,

        VmaAllocator.IN("allocator", ""),
        VkBuffer.IN("buffer", ""),
        VmaAllocationCreateInfo.const.p.IN("pCreateInfo", ""),
        Check(1)..VmaAllocation.p.OUT("pAllocation", "handle to allocated memory"),
        nullable..VmaAllocationInfo.p.OUT(
            "pAllocationInfo",
            "information about allocated memory. Optional. It can be later fetched using function #GetAllocationInfo()."
        )
    )

    VkResult(
        "AllocateMemoryForImage",
        "Function similar to #AllocateMemoryForBuffer().",

        VmaAllocator.IN("allocator", ""),
        VkImage.IN("image", ""),
        VmaAllocationCreateInfo.const.p.IN("pCreateInfo", ""),
        Check(1)..VmaAllocation.p.OUT("pAllocation", "handle to allocated memory"),
        nullable..VmaAllocationInfo.p.OUT(
            "pAllocationInfo",
            "information about allocated memory. Optional. It can be later fetched using function #GetAllocationInfo()."
        )
    )

    void(
        "FreeMemory",
        "Frees memory previously allocated using #AllocateMemory(), #AllocateMemoryForBuffer(), or #AllocateMemoryForImage().",

        VmaAllocator.IN("allocator", ""),
        VmaAllocation.IN("allocation", "")
    )

    void(
        "GetAllocationInfo",
        """
        Returns current information about specified allocation and atomically marks it as used in current frame.

        Current parameters of given allocation are returned in {@code pAllocationInfo}.

        This function also atomically "touches" allocation - marks it as used in current frame, just like #TouchAllocation(). If the allocation is in lost
        state, {@code pAllocationInfo->deviceMemory == VK_NULL_HANDLE}.

        Although this function uses atomics and doesn't lock any mutex, so it should be quite efficient, you can avoid calling it too often.

        ${ul(
            """
            You can retrieve same ##VmaAllocationInfo structure while creating your resource, from function #CreateBuffer(), #CreateImage(). You can remember
            it if you are sure parameters don't change (e.g. due to defragmentation or allocation becoming lost).
            """,
            "If you just want to check if allocation is not lost, #TouchAllocation() will work faster."
        )}
        """,

        VmaAllocator.IN("allocator", ""),
        VmaAllocation.IN("allocation", ""),
        VmaAllocationInfo.p.OUT("pAllocationInfo", "")
    )

    VkBool32(
        "TouchAllocation",
        """
        Returns {@code VK_TRUE} if allocation is not lost and atomically marks it as used in current frame.

        If the allocation has been created with #ALLOCATION_CREATE_CAN_BECOME_LOST_BIT flag, this function returns {@code VK_TRUE} if it's not in lost state,
        so it can still be used. It then also atomically "touches" the allocation - marks it as used in current frame, so that you can be sure it won't become
        lost in current frame or next {@code frameInUseCount} frames.

        If the allocation is in lost state, the function returns {@code VK_FALSE}. Memory of such allocation, as well as buffer or image bound to it, should
        not be used. Lost allocation and the buffer/image still need to be destroyed.

        If the allocation has been created without #ALLOCATION_CREATE_CAN_BECOME_LOST_BIT flag, this function always returns {@code VK_TRUE}.
        """,

        VmaAllocator.IN("allocator", ""),
        VmaAllocation.IN("allocation", "")
    )

    void(
        "SetAllocationUserData",
        """
        Sets {@code pUserData} in given allocation to new value.

        If the allocation was created with #ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT, {@code pUserData} must be either null, or pointer to a null-terminated
        string. The function makes local copy of the string and sets it as allocation's {@code pUserData}. String passed as {@code pUserData} doesn't need to
        be valid for whole lifetime of the allocation - you can free it after this call. String previously pointed by allocation's {@code pUserData} is freed
        from memory.

        If the flag was not used, the value of pointer {@code pUserData} is just copied to allocation's {@code pUserData}. It is opaque, so you can use it
        however you want - e.g. as a pointer, ordinal number or some handle to you own data.
        """,

        VmaAllocator.IN("allocator", ""),
        VmaAllocation.IN("allocation", ""),
        opaque_p.IN("pUserData", "")
    )

    void(
        "CreateLostAllocation",
        """
        Creates new allocation that is in lost state from the beginning.

        It can be useful if you need a dummy, non-null allocation.

        You still need to destroy created object using #FreeMemory().

        Returned allocation is not tied to any specific memory pool or memory type and not bound to any image or buffer. It has size = 0. It cannot be turned
        into a real, non-empty allocation.
        """,

        VmaAllocator.IN("allocator", ""),
        Check(1)..VmaAllocation.p.OUT("pAllocation", "")
    )

    VkResult(
        "MapMemory",
        """
        Maps memory represented by given allocation and returns pointer to it.

        Maps memory represented by given allocation to make it accessible to CPU code. When succeeded, {@code *ppData} contains pointer to first byte of this
        memory. If the allocation is part of bigger {@code VkDeviceMemory} block, the pointer is correctly offseted to the beginning of region assigned to this
        particular allocation.

        Mapping is internally reference-counted and synchronized, so despite raw Vulkan function {@code vkMapMemory()} cannot be used to map same block of
        {@code VkDeviceMemory} multiple times simultaneously, it is safe to call this function on allocations assigned to the same memory block. Actual Vulkan
        memory will be mapped on first mapping and unmapped on last unmapping.

        If the function succeeded, you must call #UnmapMemory() to unmap the allocation when mapping is no longer needed or before freeing the allocation, at
        the latest.

        It also safe to call this function multiple times on the same allocation. You must call {@code vmaUnmapMemory()} same number of times as you called
        {@code vmaMapMemory()}.

        It is also safe to call this function on allocation created with #ALLOCATION_CREATE_MAPPED_BIT flag. Its memory stays mapped all the time. You must
        still call {@code vmaUnmapMemory()} same number of times as you called {@code vmaMapMemory()}. You must not call {@code vmaUnmapMemory()} additional
        time to free the "0-th" mapping made automatically due to #ALLOCATION_CREATE_MAPPED_BIT flag.

        This function fails when used on allocation made in memory type that is not {@code HOST_VISIBLE}.

        This function always fails when called for allocation that was created with #ALLOCATION_CREATE_CAN_BECOME_LOST_BIT flag. Such allocations cannot be
        mapped.
        """,

        VmaAllocator.IN("allocator", ""),
        VmaAllocation.IN("allocation", ""),
        Check(1)..void.p.p.OUT("ppData", "")
    )

    void(
        "UnmapMemory",
        """
        Unmaps memory represented by given allocation, mapped previously using #MapMemory().

        For details, see description of {@code vmaMapMemory()}.
        """,

        VmaAllocator.IN("allocator", ""),
        VmaAllocation.IN("allocation", "")
    )

    VkResult(
        "Defragment",
        """
        Compacts memory by moving allocations.

        This function works by moving allocations to different places (different {@code VkDeviceMemory} objects and/or different offsets) in order to optimize
        memory usage. Only allocations that are in {@code pAllocations} array can be moved. All other allocations are considered nonmovable in this call. Basic
        rules:
        ${ul(
            """
            Only allocations made in memory types that have {@code VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT} flag can be compacted. You may pass other allocations
            but it makes no sense - these will never be moved.
            """,
            "You may pass allocations made with #ALLOCATION_CREATE_DEDICATED_MEMORY_BIT but it makes no sense - they will never be moved.",
            """
            Both allocations made with or without #ALLOCATION_CREATE_MAPPED_BIT  flag can be compacted. If not persistently mapped, memory will be mapped
            temporarily inside this function if needed.
            """,
            "You must not pass same {@code VmaAllocation} object multiple times in {@code pAllocations} array."
        )}

        The function also frees empty {@code VkDeviceMemory} blocks.

        After allocation has been moved, its ##VmaAllocationInfo{@code ::deviceMemory} and/or ##VmaAllocationInfo{@code ::offset} changes. You must query them
        again using #GetAllocationInfo() if you need them.

        If an allocation has been moved, data in memory is copied to new place automatically, but if it was bound to a buffer or an image, you must destroy
        that object yourself, create new one and bind it to the new memory pointed by the allocation. You must use {@code vkDestroyBuffer()},
        {@code vkDestroyImage()}, {@code vkCreateBuffer()}, {@code vkCreateImage()} for that purpose and NOT #DestroyBuffer(), #DestroyImage(),
        #CreateBuffer(), #CreateImage()! Example:
        ${codeBlock("""
VkDevice device = ...;
VmaAllocator allocator = ...;
std::vector<VkBuffer> buffers = ...;
std::vector<VmaAllocation> allocations = ...;

std::vector<VkBool32> allocationsChanged(allocations.size());
vmaDefragment(allocator, allocations.data(), allocations.size(), allocationsChanged.data(), nullptr, nullptr);

for(size_t i = 0; i < allocations.size(); ++i)
{
    if(allocationsChanged[i])
    {
        VmaAllocationInfo allocInfo;
        vmaGetAllocationInfo(allocator, allocations[i], &allocInfo);

        vkDestroyBuffer(device, buffers[i], nullptr);

        VkBufferCreateInfo bufferInfo = ...;
        vkCreateBuffer(device, &bufferInfo, nullptr, &buffers[i]);

        // You can make dummy call to vkGetBufferMemoryRequirements here to silence validation layer warning.

        vkBindBufferMemory(device, buffers[i], allocInfo.deviceMemory, allocInfo.offset);
    }
}""")}

        Note: Please don't expect memory to be fully compacted after this call. Algorithms inside are based on some heuristics that try to maximize number of
        Vulkan memory blocks to make totally empty to release them, as well as to maximimze continuous empty space inside remaining blocks, while minimizing
        the number and size of data that needs to be moved. Some fragmentation still remains after this call. This is normal.

        Warning: This function is not 100% correct according to Vulkan specification. Use it at your own risk. That's because Vulkan doesn't guarantee that
        memory requirements (size and alignment) for a new buffer or image are consistent. They may be different even for subsequent calls with the same
        parameters. It really does happen on some platforms, especially with images.

        Warning: This function may be time-consuming, so you shouldn't call it too often (like every frame or after every resource creation/destruction). You
        can call it on special occasions (like when reloading a game level or when you just destroyed a lot of objects).
        """,

        VmaAllocator.IN("allocator", ""),
        VmaAllocation.p.OUT("pAllocations", "array of allocations that can be moved during this compaction"),
        AutoSize("pAllocations", "pAllocationsChanged")..size_t.IN("allocationCount", "number of elements in {@code pAllocations} and {@code pAllocationsChanged} arrays"),
        nullable..VkBool32.p.OUT(
            "pAllocationsChanged",
            """
            array of boolean values that will indicate whether matching allocation in {@code pAllocations} array has been moved. This parameter is optional.
            Pass null if you don't need this information.
            """
        ),
        nullable..VmaDefragmentationInfo.const.p.IN("pDefragmentationInfo", "configuration parameters. Optional - pass null to use default values."),
        nullable..VmaDefragmentationStats.p.OUT(
            "pDefragmentationStats",
            "statistics returned by the function. Optional - pass null if you don't need this information."
        ),
        returnDoc =
        """
        {@code VK_SUCCESS} if completed, {@code VK_INCOMPLETE} if succeeded but didn't make all possible optimizations because limits specified in
        {@code pDefragmentationInfo} have been reached, negative error code in case of error.
        """
    )

    VkResult(
        "BindBufferMemory",
        """
        Binds buffer to allocation.

        Binds specified buffer to region of memory represented by specified allocation. Gets {@code VkDeviceMemory} handle and offset from the allocation. If
        you want to create a buffer, allocate memory for it and bind them together separately, you should use this function for binding instead of standard
        {@code vkBindBufferMemory()}, because it ensures proper synchronization so that when a {@code VkDeviceMemory} object is used by multiple allocations,
        calls to {@code vkBind*Memory()} or {@code vkMapMemory()} won't happen from multiple threads simultaneously (which is illegal in Vulkan).

        It is recommended to use function #CreateBuffer() instead of this one.
        """,

        VmaAllocator.IN("allocator", ""),
        VmaAllocation.IN("allocation", ""),
        VkBuffer.IN("buffer", "")
    )

    VkResult(
        "BindImageMemory",
        """
        Binds image to allocation.

        Binds specified image to region of memory represented by specified allocation. Gets {@code VkDeviceMemory} handle and offset from the allocation. If
        you want to create an image, allocate memory for it and bind them together separately, you should use this function for binding instead of standard
        {@code vkBindImageMemory()}, because it ensures proper synchronization so that when a {@code VkDeviceMemory} object is used by multiple allocations,
        calls to {@code vkBind*Memory()} or {@code vkMapMemory()} won't happen from multiple threads simultaneously (which is illegal in Vulkan).

        It is recommended to use function vmaCreateImage() instead of this one.
        """,

        VmaAllocator.IN("allocator", ""),
        VmaAllocation.IN("allocation", ""),
        VkImage.IN("image", "")
    )

    VkResult(
        "CreateBuffer",
        """
        This function automatically:
        ${ul(
            "Creates buffer.",
            "Allocates appropriate memory for it.",
            "Binds the buffer with the memory."
        )}
        If any of these operations fail, buffer and allocation are not created, returned value is negative error code, {@code *pBuffer} and
        {@code *pAllocation} are null.

        If the function succeeded, you must destroy both buffer and allocation when you no longer need them using either convenience function #DestroyBuffer()
        or separately, using {@code vkDestroyBuffer()} and #FreeMemory().

        If #ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT flag was used, {@code VK_KHR_dedicated_allocation} extension is used internally to query driver
        whether it requires or prefers the new buffer to have dedicated allocation. If yes, and if dedicated allocation is possible
        ##VmaAllocationCreateInfo{@code ::pool} is null and #ALLOCATION_CREATE_NEVER_ALLOCATE_BIT is not used), it creates dedicated allocation for this
        buffer, just like when using #ALLOCATION_CREATE_DEDICATED_MEMORY_BIT.
        """,

        VmaAllocator.IN("allocator", ""),
        VkBufferCreateInfo.const.p.IN("pBufferCreateInfo", ""),
        VmaAllocationCreateInfo.const.p.IN("pAllocationCreateInfo", ""),
        Check(1)..VkBuffer.p.OUT("pBuffer", "buffer that was created"),
        Check(1)..VmaAllocation.p.OUT("pAllocation", "allocation that was created"),
        nullable..VmaAllocationInfo.p.OUT(
            "pAllocationInfo",
            "information about allocated memory. Optional. It can be later fetched using function #GetAllocationInfo()."
        )
    )

    void(
        "DestroyBuffer",
        """
        Destroys Vulkan buffer and frees allocated memory.

        This is just a convenience function equivalent to:
        ${codeBlock("""
vkDestroyBuffer(device, buffer, allocationCallbacks);
vmaFreeMemory(allocator, allocation);""")}

        It it safe to pass null as buffer and/or allocation.
        """,

        VmaAllocator.IN("allocator", ""),
        VkBuffer.IN("buffer", ""),
        VmaAllocation.IN("allocation", "")
    )

    VkResult(
        "CreateImage",
        "Function similar to #CreateBuffer().",

        VmaAllocator.IN("allocator", ""),
        VkImageCreateInfo.const.p.IN("pImageCreateInfo", ""),
        VmaAllocationCreateInfo.const.p.IN("pAllocationCreateInfo", ""),
        Check(1)..VkImage.p.OUT("pImage", "image that was created"),
        Check(1)..VmaAllocation.p.OUT("pAllocation", "allocation that was created"),
        nullable..VmaAllocationInfo.p.OUT(
            "pAllocationInfo",
            "information about allocated memory. Optional. It can be later fetched using function #GetAllocationInfo()."
        )
    )

    void(
        "DestroyImage",
        """
        Destroys Vulkan image and frees allocated memory.

        This is just a convenience function equivalent to:
        ${codeBlock("""
vkDestroyImage(device, image, allocationCallbacks);
vmaFreeMemory(allocator, allocation);""")}

        It it safe to pass null as image and/or allocation.
        """,

        VmaAllocator.IN("allocator", ""),
        VkImage.IN("image", ""),
        VmaAllocation.IN("allocation", "")
    )
}