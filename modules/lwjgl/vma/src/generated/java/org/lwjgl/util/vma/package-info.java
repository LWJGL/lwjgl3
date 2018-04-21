/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */

/**
 * Contains bindings to <a target="_blank" href="https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator">Vulkan</a>, an easy to integrate Vulkan memory
 * allocation library.
 * 
 * <h4>Problem</h4>
 * 
 * <p>Memory allocation and resource (buffer and image) creation in Vulkan is difficult (comparing to older graphics API-s, like D3D11 or OpenGL) for several
 * reasons:</p>
 * 
 * <ul>
 * <li>It requires a lot of boilerplate code, just like everything else in Vulkan, because it is a low-level and high-performance API.</li>
 * <li>There is additional level of indirection: {@code VkDeviceMemory} is allocated separately from creating {@code VkBuffer/VkImage} and they must be
 * bound together. The binding cannot be changed later - resource must be recreated.</li>
 * <li>Driver must be queried for supported memory heaps and memory types. Different IHVs provide different types of it.</li>
 * <li>It is recommended practice to allocate bigger chunks of memory and assign parts of them to particular resources.</li>
 * </ul>
 * 
 * <h4>Features</h4>
 * 
 * <p>This library can help game developers to manage memory allocations and resource creation by offering some higher-level functions. Features of the
 * library are divided into several layers, low level to high level:</p>
 * 
 * <ol>
 * <li>Functions that help to choose correct and optimal memory type based on intended usage of the memory.
 * 
 * <p>- Required or preferred traits of the memory are expressed using higher-level description comparing to Vulkan flags.</p></li>
 * <li>Functions that allocate memory blocks, reserve and return parts of them (`VkDeviceMemory` + offset + size) to the user.
 * 
 * <p>- Library keeps track of allocated memory blocks, used and unused ranges inside them, finds best matching unused ranges for new allocations, takes
 * all the rules of alignment and buffer/image granularity into consideration.</p></li>
 * <li>Functions that can create an image/buffer, allocate memory for it and bind them together - all in one call.</li>
 * </ol>
 * 
 * <p>Additional features:</p>
 * 
 * <ul>
 * <li>Thread-safety: Library is designed to be used by multithreaded code.</li>
 * <li>Configuration: Fill optional members of CreateInfo structure to provide custom CPU memory allocator and other parameters.</li>
 * <li>Customization: Predefine appropriate macros to provide your own implementation of all external facilities used by the library, from assert, mutex,
 * and atomic, to vector and linked list.</li>
 * <li>Support memory mapping, reference-counted internally. Support for persistently mapped memory: Just allocate with appropriate flag and you get
 * access to mapped pointer.</li>
 * <li>Custom memory pools: Create a pool with desired parameters (e.g. fixed or limited maximum size) and allocate memory out of it.</li>
 * <li>Support for VK_KHR_dedicated_allocation extension: Enable it and it will be used automatically by the library.</li>
 * <li>Defragmentation: Call one function and let the library move data around to free some memory blocks and make your allocations better compacted.</li>
 * <li>Lost allocations: Allocate memory with appropriate flags and let the library remove allocations that are not used for many frames to make room for
 * new ones.</li>
 * <li>Statistics: Obtain detailed statistics about the amount of memory used, unused, number of allocated blocks, number of allocations etc. - globally,
 * per memory heap, and per memory type.</li>
 * <li>Debug annotations: Associate string with name or opaque pointer to your own data with every allocation.</li>
 * <li>JSON dump: Obtain a string in JSON format with detailed map of internal state, including list of allocations and gaps between them.</li>
 * </ul>
 */
@org.lwjgl.system.NonnullDefault
package org.lwjgl.util.vma;

