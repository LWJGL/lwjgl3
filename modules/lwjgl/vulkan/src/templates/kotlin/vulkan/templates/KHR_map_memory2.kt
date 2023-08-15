/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_map_memory2 = "KHRMapMemory2".nativeClassVK("KHR_map_memory2", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension provides extensible versions of the Vulkan memory map and unmap entry points. The new entry points are functionally identical to the core entry points, except that their parameters are specified using extensible structures that can be used to pass extension-specific information.

        <h5>VK_KHR_map_memory2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_map_memory2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>272</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Faith Ekstrand <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_map_memory2]%20@gfxstrand%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_map_memory2%20extension*">gfxstrand</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_map_memory2.adoc">VK_KHR_map_memory2</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-03-14</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>None</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Faith Ekstrand, Collabora</li>
                <li>Tobias Hector, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_MAP_MEMORY_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_MAP_MEMORY_2_EXTENSION_NAME".."VK_KHR_map_memory2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR".."1000271000",
        "STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR".."1000271001"
    )

    VkResult(
        "MapMemory2KHR",
        """
        Map a memory object into application address space.

        <h5>C Specification</h5>
        Alternatively, to retrieve a host virtual address pointer to a region of a mappable memory object, call:

        <pre><code>
￿VkResult vkMapMemory2KHR(
￿    VkDevice                                    device,
￿    const VkMemoryMapInfoKHR*                   pMemoryMapInfo,
￿    void**                                      ppData);</code></pre>

        <h5>Description</h5>
        This function behaves identically to #MapMemory() except that it gets its parameters via an extensible structure pointer rather than directly as function arguments.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pMemoryMapInfo} <b>must</b> be a valid pointer to a valid ##VkMemoryMapInfoKHR structure</li>
            <li>{@code ppData} <b>must</b> be a valid pointer to a pointer value</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_MEMORY_MAP_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkMemoryMapInfoKHR
        """,

        VkDevice("device", "the logical device that owns the memory."),
        VkMemoryMapInfoKHR.const.p("pMemoryMapInfo", "a pointer to a ##VkMemoryMapInfoKHR structure describing parameters of the map."),
        Check(1)..void.p.p("ppData", "a pointer to a {@code void *} variable in which is returned a host-accessible pointer to the beginning of the mapped range. This pointer minus ##VkMemoryMapInfoKHR{@code ::offset} <b>must</b> be aligned to at least ##VkPhysicalDeviceLimits{@code ::minMemoryMapAlignment}.")
    )

    VkResult(
        "UnmapMemory2KHR",
        """
        Unmap a previously mapped memory object.

        <h5>C Specification</h5>
        Alternatively, to unmap a memory object once host access to it is no longer needed by the application, call:

        <pre><code>
￿VkResult vkUnmapMemory2KHR(
￿    VkDevice                                    device,
￿    const VkMemoryUnmapInfoKHR*                 pMemoryUnmapInfo);</code></pre>

        <h5>Description</h5>
        This function behaves identically to #UnmapMemory() except that it gets its parameters via an extensible structure pointer rather than directly as function arguments.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pMemoryUnmapInfo} <b>must</b> be a valid pointer to a valid ##VkMemoryUnmapInfoKHR structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkMemoryUnmapInfoKHR
        """,

        VkDevice("device", "the logical device that owns the memory."),
        VkMemoryUnmapInfoKHR.const.p("pMemoryUnmapInfo", "a pointer to a ##VkMemoryUnmapInfoKHR structure describing parameters of the unmap.")
    )
}