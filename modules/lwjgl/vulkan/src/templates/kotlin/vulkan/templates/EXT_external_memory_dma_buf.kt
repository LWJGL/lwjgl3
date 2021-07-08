/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_external_memory_dma_buf = "EXTExternalMemoryDmaBuf".nativeClassVK("EXT_external_memory_dma_buf", type = "device", postfix = EXT) {
    documentation =
        """
        A {@code dma_buf} is a type of file descriptor, defined by the Linux kernel, that allows sharing memory across kernel device drivers and across processes. This extension enables applications to import a {@code dma_buf} as {@code VkDeviceMemory}, to export {@code VkDeviceMemory} as a {@code dma_buf}, and to create {@code VkBuffer} objects that <b>can</b> be bound to that memory.

        <h5>VK_EXT_external_memory_dma_buf</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_external_memory_dma_buf}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>126</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRExternalMemoryFd VK_KHR_external_memory_fd}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Chad Versace <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_external_memory_dma_buf:%20&amp;body=@chadversary%20">chadversary</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-10-10</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Chad Versace, Google</li>
                <li>James Jones, NVIDIA</li>
                <li>Jason Ekstrand, Intel</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_EXTERNAL_MEMORY_DMA_BUF_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_EXTERNAL_MEMORY_DMA_BUF_EXTENSION_NAME".."VK_EXT_external_memory_dma_buf"
    )

    EnumConstant(
        "Extends {@code VkExternalMemoryHandleTypeFlagBits}.",

        "EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT".enum(0x00000200)
    )
}