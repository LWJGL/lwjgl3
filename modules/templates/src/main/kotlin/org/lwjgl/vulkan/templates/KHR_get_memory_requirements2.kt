/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_get_memory_requirements2 = "KHRGetMemoryRequirements2".nativeClassVK("KHR_get_memory_requirements2", type = "device", postfix = KHR) {
    documentation =
        """
        This extension provides new entry points to query memory requirements of images and buffers in a way that can be easily extended by other extensions, without introducing any further entry points. The Vulkan 1.0 VkMemoryRequirements and VkSparseImageMemoryRequirements structures do not include an sType/pNext, this extension wraps them in new structures with sType/pNext so an application can query a chain of memory requirements structures by constructing the chain and letting the implementation fill them in. A new command is added for each ftext:vkGet*MemoryRequrements command in core Vulkan 1.0.

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

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jason Ekstrand @jekstrand</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-03-23</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

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
        """
        Returns the memory requirements for specified Vulkan object.

        <h5>C Specification</h5>
        To determine the memory requirements for an image resource, call:

        <code><pre>
￿void vkGetImageMemoryRequirements2KHR(
￿    VkDevice                                    device,
￿    const VkImageMemoryRequirementsInfo2KHR*    pInfo,
￿    VkMemoryRequirements2KHR*                   pMemoryRequirements);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a pointer to a valid ##VkImageMemoryRequirementsInfo2KHR structure</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a pointer to a ##VkMemoryRequirements2KHR structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageMemoryRequirementsInfo2KHR, ##VkMemoryRequirements2KHR
        """,

        VkDevice.IN("device", "the logical device that owns the image."),
        const..VkImageMemoryRequirementsInfo2KHR.p.IN("pInfo", "a pointer to an instance of the ##VkImageMemoryRequirementsInfo2KHR structure containing parameters required for the memory requirements query."),
        VkMemoryRequirements2KHR.p.OUT("pMemoryRequirements", "points to an instance of the ##VkMemoryRequirements2KHR structure in which the memory requirements of the image object are returned.")
    )

    void(
        "GetBufferMemoryRequirements2KHR",
        """
        Returns the memory requirements for specified Vulkan object.

        <h5>C Specification</h5>
        To determine the memory requirements for a buffer resource, call:

        <code><pre>
￿void vkGetBufferMemoryRequirements2KHR(
￿    VkDevice                                    device,
￿    const VkBufferMemoryRequirementsInfo2KHR*   pInfo,
￿    VkMemoryRequirements2KHR*                   pMemoryRequirements);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a pointer to a valid ##VkBufferMemoryRequirementsInfo2KHR structure</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a pointer to a ##VkMemoryRequirements2KHR structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkBufferMemoryRequirementsInfo2KHR, ##VkMemoryRequirements2KHR
        """,

        VkDevice.IN("device", "the logical device that owns the buffer."),
        const..VkBufferMemoryRequirementsInfo2KHR.p.IN("pInfo", "a pointer to an instance of the ##VkBufferMemoryRequirementsInfo2KHR structure containing parameters required for the memory requirements query."),
        VkMemoryRequirements2KHR.p.OUT("pMemoryRequirements", "points to an instance of the ##VkMemoryRequirements2KHR structure in which the memory requirements of the buffer object are returned.")
    )

    void(
        "GetImageSparseMemoryRequirements2KHR",
        "",

        VkDevice.IN("device", ""),
        const..VkImageSparseMemoryRequirementsInfo2KHR.p.IN("pInfo", ""),
        AutoSize("pSparseMemoryRequirements")..Check(1)..uint32_t_p.INOUT("pSparseMemoryRequirementCount", ""),
        nullable..VkSparseImageMemoryRequirements2KHR.p.OUT("pSparseMemoryRequirements", "")
    )
}