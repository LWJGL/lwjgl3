/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_bind_memory2 = "KHRBindMemory2".nativeClassVK("KHR_bind_memory2", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension provides versions of #BindBufferMemory() and #BindImageMemory() that allow multiple bindings to be performed at once, and are extensible.

        This extension also introduces #IMAGE_CREATE_ALIAS_BIT_KHR, which allows “{@code identical}” images that alias the same memory to interpret the contents consistently, even across image layout changes.

        <h5>Promotion to Vulkan 1.1</h5>
        All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_bind_memory2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_bind_memory2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>158</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1-promotions">Vulkan 1.1</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_bind_memory2]%20@tobski%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_bind_memory2%20extension%3E%3E">tobski</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-09-05</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.1 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Tobias Hector, Imagination Technologies</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_BIND_MEMORY_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_BIND_MEMORY_2_EXTENSION_NAME".."VK_KHR_bind_memory2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR".."1000157000",
        "STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR".."1000157001"
    )

    EnumConstant(
        "Extends {@code VkImageCreateFlagBits}.",

        "IMAGE_CREATE_ALIAS_BIT_KHR".enum(0x00000400)
    )

    VkResult(
        "BindBufferMemory2KHR",
        "See #BindBufferMemory2().",

        VkDevice("device", "the logical device that owns the buffers and memory."),
        AutoSize("pBindInfos")..uint32_t("bindInfoCount", "the number of elements in {@code pBindInfos}."),
        VkBindBufferMemoryInfo.const.p("pBindInfos", "a pointer to an array of {@code bindInfoCount} ##VkBindBufferMemoryInfo structures describing buffers and memory to bind.")
    )

    VkResult(
        "BindImageMemory2KHR",
        "See #BindImageMemory2().",

        VkDevice("device", "the logical device that owns the images and memory."),
        AutoSize("pBindInfos")..uint32_t("bindInfoCount", "the number of elements in {@code pBindInfos}."),
        VkBindImageMemoryInfo.const.p("pBindInfos", "a pointer to an array of ##VkBindImageMemoryInfo structures, describing images and memory to bind.")
    )
}