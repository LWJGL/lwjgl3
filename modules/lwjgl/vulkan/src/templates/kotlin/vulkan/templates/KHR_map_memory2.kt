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
        This extension provides extensible versions of the Vulkan memory map and unmap commands. The new commands are functionally identical to the core commands, except that their parameters are specified using extensible structures that can be used to pass extension-specific information.

        <h5>Promotion to Vulkan 1.4</h5>
        Functionality in this extension is included in core Vulkan 1.4 with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_map_memory2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>272</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Deprecation State</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to Vulkan 1.4</li>
            </ul></dd>

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
        "See #MapMemory2().",

        VkDevice("device", "the logical device that owns the memory."),
        VkMemoryMapInfo.const.p("pMemoryMapInfo", "a pointer to a ##VkMemoryMapInfo structure describing parameters of the map."),
        Check(1)..void.p.p("ppData", "a pointer to a {@code void *} variable in which is returned a host-accessible pointer to the beginning of the mapped range. This pointer minus ##VkMemoryMapInfo{@code ::offset} <b>must</b> be aligned to at least ##VkPhysicalDeviceLimits{@code ::minMemoryMapAlignment}.")
    )

    VkResult(
        "UnmapMemory2KHR",
        "See #UnmapMemory2().",

        VkDevice("device", "the logical device that owns the memory."),
        VkMemoryUnmapInfo.const.p("pMemoryUnmapInfo", "a pointer to a ##VkMemoryUnmapInfo structure describing parameters of the unmap.")
    )
}