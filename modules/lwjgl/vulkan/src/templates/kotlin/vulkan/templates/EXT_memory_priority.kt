/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_memory_priority = "EXTMemoryPriority".nativeClassVK("EXT_memory_priority", type = "device", postfix = EXT) {
    documentation =
        """
        This extension adds a {@code priority} value specified at memory allocation time. On some systems with both device-local and non-device-local memory heaps, the implementation may transparently move memory from one heap to another when a heap becomes full (for example, when the total memory used across all processes exceeds the size of the heap). In such a case, this priority value may be used to determine which allocations are more likely to remain in device-local memory.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_memory_priority}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>239</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_memory_priority:%20&amp;body=@jeffbolznv%20">jeffbolznv</a></li>
            </ul></dd>

            <dt>Last Modified Date</dt>
            <dd>2018-10-08</dd>

            <dt>Contributors</dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Jeff Juliano, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_MEMORY_PRIORITY_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_MEMORY_PRIORITY_EXTENSION_NAME".."VK_EXT_memory_priority"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT".."1000238000",
        "STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT".."1000238001"
    )
}