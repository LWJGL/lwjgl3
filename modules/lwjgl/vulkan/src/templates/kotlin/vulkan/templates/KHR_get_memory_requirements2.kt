/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_get_memory_requirements2 = "KHRGetMemoryRequirements2".nativeClassVK("KHR_get_memory_requirements2", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension provides new entry points to query memory requirements of images and buffers in a way that can be easily extended by other extensions, without introducing any further entry points. The Vulkan 1.0 ##VkMemoryRequirements and ##VkSparseImageMemoryRequirements structures do not include {@code sType} and {@code pNext} members. This extension wraps them in new structures with these members, so an application can query a chain of memory requirements structures by constructing the chain and letting the implementation fill them in. A new command is added for each {@code vkGet*MemoryRequrements} command in core Vulkan 1.0.

        <h5>Promotion to Vulkan 1.1</h5>
        All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_get_memory_requirements2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_get_memory_requirements2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>147</dd>

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
                <li>Jason Ekstrand <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_get_memory_requirements2]%20@jekstrand%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_get_memory_requirements2%20extension%3E%3E">jekstrand</a></li>
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
                <li>Jason Ekstrand, Intel</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Jesse Hall, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME".."VK_KHR_get_memory_requirements2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR".."1000146000",
        "STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR".."1000146001",
        "STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR".."1000146002",
        "STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2_KHR".."1000146003",
        "STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR".."1000146004"
    )

    void(
        "GetImageMemoryRequirements2KHR",
        "See #GetImageMemoryRequirements2().",

        VkDevice("device", "the logical device that owns the image."),
        VkImageMemoryRequirementsInfo2.const.p("pInfo", "a pointer to a ##VkImageMemoryRequirementsInfo2 structure containing parameters required for the memory requirements query."),
        VkMemoryRequirements2.p("pMemoryRequirements", "a pointer to a ##VkMemoryRequirements2 structure in which the memory requirements of the image object are returned.")
    )

    void(
        "GetBufferMemoryRequirements2KHR",
        "See #GetBufferMemoryRequirements2().",

        VkDevice("device", "the logical device that owns the buffer."),
        VkBufferMemoryRequirementsInfo2.const.p("pInfo", "a pointer to a ##VkBufferMemoryRequirementsInfo2 structure containing parameters required for the memory requirements query."),
        VkMemoryRequirements2.p("pMemoryRequirements", "a pointer to a ##VkMemoryRequirements2 structure in which the memory requirements of the buffer object are returned.")
    )

    void(
        "GetImageSparseMemoryRequirements2KHR",
        "See #GetImageSparseMemoryRequirements2().",

        VkDevice("device", "the logical device that owns the image."),
        VkImageSparseMemoryRequirementsInfo2.const.p("pInfo", "a pointer to a ##VkImageSparseMemoryRequirementsInfo2 structure containing parameters required for the memory requirements query."),
        AutoSize("pSparseMemoryRequirements")..Check(1)..uint32_t.p("pSparseMemoryRequirementCount", "a pointer to an integer related to the number of sparse memory requirements available or queried, as described below."),
        nullable..VkSparseImageMemoryRequirements2.p("pSparseMemoryRequirements", "either {@code NULL} or a pointer to an array of ##VkSparseImageMemoryRequirements2 structures.")
    )
}