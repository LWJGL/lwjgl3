/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_memory_decompression = "NVMemoryDecompression".nativeClassVK("NV_memory_decompression", type = "device", postfix = "NV") {
    documentation =
        """
        This extension adds support for performing memory to memory decompression.

        <h5>VK_NV_memory_decompression</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_memory_decompression}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>428</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} and {@link KHRBufferDeviceAddress VK_KHR_buffer_device_address}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Vikram Kushwaha <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_memory_decompression]%20@vkushwaha-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_memory_decompression%20extension*">vkushwaha-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-01-31</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Vikram Kushwaha, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Christoph Kubisch, NVIDIA</li>
                <li>Piers Daniell, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_MEMORY_DECOMPRESSION_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_MEMORY_DECOMPRESSION_EXTENSION_NAME".."VK_NV_memory_decompression"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV".."1000427000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV".."1000427001"
    )

    EnumConstantLong(
        """
        VkMemoryDecompressionMethodFlagBitsNV - List the supported memory decompression methods

        <h5>Description</h5>
        <ul>
            <li>#MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV specifies that the GDeflate 1.0 algorithm is used to decompress data.</li>
        </ul>
        """,

        "MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV".enum(0x00000001L)
    )

    void(
        "CmdDecompressMemoryNV",
        """
        Decompress data between memory regions.

        <h5>C Specification</h5>
        To decompress data between one or more memory regions call:

        <pre><code>
￿void vkCmdDecompressMemoryNV(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    decompressRegionCount,
￿    const VkDecompressMemoryRegionNV*           pDecompressMemoryRegions);</code></pre>

        <h5>Description</h5>
        Each region specified in {@code pDecompressMemoryRegions} is decompressed from the source to destination region based on the specified decompression method.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-memoryDecompression">{@code memoryDecompression}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pDecompressMemoryRegions} <b>must</b> be a valid pointer to an array of {@code decompressRegionCount} valid ##VkDecompressMemoryRegionNV structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code decompressRegionCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Graphics Compute</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkDecompressMemoryRegionNV
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pDecompressMemoryRegions")..uint32_t("decompressRegionCount", "the number of memory regions to decompress."),
        VkDecompressMemoryRegionNV.const.p("pDecompressMemoryRegions", "a pointer to an array of {@code decompressRegionCount} ##VkDecompressMemoryRegionNV structures specifying decompression parameters.")
    )

    void(
        "CmdDecompressMemoryIndirectCountNV",
        """
        Indirect decompress data between memory regions.

        <h5>C Specification</h5>
        To decompress data between one or more memory regions by specifying decompression parameters indirectly in a buffer, call:

        <pre><code>
￿void vkCmdDecompressMemoryIndirectCountNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkDeviceAddress                             indirectCommandsAddress,
￿    VkDeviceAddress                             indirectCommandsCountAddress,
￿    uint32_t                                    stride);</code></pre>

        <h5>Description</h5>
        Each region specified in {@code indirectCommandsAddress} is decompressed from the source to destination region based on the specified decompression method.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-memoryDecompression">{@code memoryDecompression}</a> feature <b>must</b> be enabled</li>
            <li>If {@code indirectCommandsAddress} comes from a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>The {@code VkBuffer} that {@code indirectCommandsAddress} comes from <b>must</b> have been created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set</li>
            <li>{@code offset} <b>must</b> be a multiple of 4</li>
            <li>If {@code indirectCommandsCountAddress} comes from a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>The {@code VkBuffer} that {@code indirectCommandsCountAddress} comes from <b>must</b> have been created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set</li>
            <li>{@code indirectCommandsCountAddress} <b>must</b> be a multiple of 4</li>
            <li>The count stored in {@code indirectCommandsCountAddress} <b>must</b> be less than or equal to ##VkPhysicalDeviceMemoryDecompressionPropertiesNV{@code ::maxDecompressionIndirectCount}</li>
            <li>{@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to sizeof(##VkDecompressMemoryRegionNV)</li>
            <li>If the count stored in {@code indirectCommandsCountAddress} is equal to 1, <code>(offset + sizeof(##VkDecompressMemoryRegionNV))</code> <b>must</b> be less than or equal to the size of the {@code VkBuffer} that {@code indirectCommandsAddress} comes from</li>
            <li>If the count stored in {@code indirectCommandsCountAddress} is greater than 1, {@code indirectCommandsAddress} + sizeof(##VkDecompressMemoryRegionNV) + <code>(stride × (count stored in countBuffer - 1))</code> <b>must</b> be less than or equal to the last valid address in the {@code VkBuffer} that {@code indirectCommandsAddress} was created from</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Graphics Compute</td><td>Action</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkDeviceAddress("indirectCommandsAddress", "the device address containing decompression parameters laid out as an array of ##VkDecompressMemoryRegionNV structures."),
        VkDeviceAddress("indirectCommandsCountAddress", "the device address containing the decompression count."),
        uint32_t("stride", "the byte stride between successive sets of decompression parameters located starting from {@code indirectCommandsAddress}.")
    )
}