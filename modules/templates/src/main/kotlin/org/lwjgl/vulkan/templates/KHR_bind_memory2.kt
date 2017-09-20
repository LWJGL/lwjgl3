/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_bind_memory2 = "KHRBindMemory2".nativeClassVK("KHR_bind_memory2", type = "device", postfix = KHR) {
    documentation =
        """
        This extension provides versions of #BindBufferMemory() and #BindImageMemory() that allow multiple bindings to be performed at once, and are extensible.

        This extension also introduces #IMAGE_CREATE_ALIAS_BIT_KHR, which allows "identical" images that alias the same memory to interpret the contents consistently, even across image layout changes.

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

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector @tobias</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-05-19</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

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
        """
        Bind device memory to buffer objects.

        <h5>C Specification</h5>
        To attach memory to buffer objects for one or more buffers at a time, call:

        <code><pre>
￿VkResult vkBindBufferMemory2KHR(
￿    VkDevice                                    device,
￿    uint32_t                                    bindInfoCount,
￿    const VkBindBufferMemoryInfoKHR*            pBindInfos);</pre></code>

        <h5>Description</h5>
        On some implementations, it <b>may</b> be more efficient to batch memory bindings into a single command.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pBindInfos} <b>must</b> be a pointer to an array of {@code bindInfoCount} valid ##VkBindBufferMemoryInfoKHR structures</li>
            <li>{@code bindInfoCount} <b>must</b> be greater than 0</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkBindBufferMemoryInfoKHR
        """,

        VkDevice.IN("device", "the logical device that owns the buffers and memory."),
        AutoSize("pBindInfos")..uint32_t.IN("bindInfoCount", "the number of elements in {@code pBindInfos}."),
        const..VkBindBufferMemoryInfoKHR.p.IN("pBindInfos", "a pointer to an array of structures of type ##VkBindBufferMemoryInfoKHR, describing buffers and memory to bind.")
    )

    VkResult(
        "BindImageMemory2KHR",
        """
        Bind device memory to image objects.

        <h5>C Specification</h5>
        To attach memory to image objects for one or more images at a time, call:

        <code><pre>
￿VkResult vkBindImageMemory2KHR(
￿    VkDevice                                    device,
￿    uint32_t                                    bindInfoCount,
￿    const VkBindImageMemoryInfoKHR*             pBindInfos);</pre></code>

        <h5>Description</h5>
        On some implementations, it <b>may</b> be more efficient to batch memory bindings into a single command.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pBindInfos} <b>must</b> be a pointer to an array of {@code bindInfoCount} valid ##VkBindImageMemoryInfoKHR structures</li>
            <li>{@code bindInfoCount} <b>must</b> be greater than 0</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkBindImageMemoryInfoKHR
        """,

        VkDevice.IN("device", "the logical device that owns the images and memory."),
        AutoSize("pBindInfos")..uint32_t.IN("bindInfoCount", "the number of elements in {@code pBindInfos}."),
        const..VkBindImageMemoryInfoKHR.p.IN("pBindInfos", "a pointer to an array of structures of type ##VkBindImageMemoryInfoKHR, describing images and memory to bind.")
    )
}