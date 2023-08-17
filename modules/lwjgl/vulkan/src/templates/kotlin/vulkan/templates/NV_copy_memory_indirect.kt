/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_copy_memory_indirect = "NVCopyMemoryIndirect".nativeClassVK("NV_copy_memory_indirect", type = "device", postfix = "NV") {
    documentation =
        """
        This extension adds support for performing copies between memory and image regions using indirect parameters that are read by the device from a buffer during execution. This functionality <b>may</b> be useful for performing copies where the copy parameters are not known during the command buffer creation time.

        <h5>VK_NV_copy_memory_indirect</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_copy_memory_indirect}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>427</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} and {@link KHRBufferDeviceAddress VK_KHR_buffer_device_address}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Vikram Kushwaha <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_copy_memory_indirect]%20@vkushwaha-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_copy_memory_indirect%20extension*">vkushwaha-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-10-14</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Vikram Kushwaha, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Christoph Kubisch, NVIDIA</li>
                <li>Daniel Koch, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_COPY_MEMORY_INDIRECT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_COPY_MEMORY_INDIRECT_EXTENSION_NAME".."VK_NV_copy_memory_indirect"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV".."1000426000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_NV".."1000426001"
    )

    void(
        "CmdCopyMemoryIndirectNV",
        """
        Copy data between memory regions.

        <h5>C Specification</h5>
        To copy data between two memory regions by specifying copy parameters indirectly in a buffer, call:

        <pre><code>
￿void vkCmdCopyMemoryIndirectNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkDeviceAddress                             copyBufferAddress,
￿    uint32_t                                    copyCount,
￿    uint32_t                                    stride);</code></pre>

        <h5>Description</h5>
        Each region read from {@code copyBufferAddress} is copied from the source region to the specified destination region. The results are undefined if any of the source and destination regions overlap in memory.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-indirectCopy">{@code indirectCopy}</a> feature <b>must</b> be enabled</li>
            <li>{@code copyBufferAddress} <b>must</b> be 4 byte aligned</li>
            <li>{@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to sizeof(##VkCopyMemoryIndirectCommandNV)</li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support at least one of the ##VkPhysicalDeviceCopyMemoryIndirectPropertiesNV{@code ::supportedQueues}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
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
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Transfer Graphics Compute</td><td>Action</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkDeviceAddress("copyBufferAddress", "the buffer address specifying the copy parameters. This buffer is laid out in memory as an array of ##VkCopyMemoryIndirectCommandNV structures."),
        uint32_t("copyCount", "the number of copies to execute, and can be zero."),
        uint32_t("stride", "the stride in bytes between successive sets of copy parameters.")
    )

    void(
        "CmdCopyMemoryToImageIndirectNV",
        """
        Copy data from a memory region into an image.

        <h5>C Specification</h5>
        To copy data from a memory region to an image object by specifying copy parameters in a buffer, call:

        <pre><code>
￿void vkCmdCopyMemoryToImageIndirectNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkDeviceAddress                             copyBufferAddress,
￿    uint32_t                                    copyCount,
￿    uint32_t                                    stride,
￿    VkImage                                     dstImage,
￿    VkImageLayout                               dstImageLayout,
￿    const VkImageSubresourceLayers*             pImageSubresources);</code></pre>

        <h5>Description</h5>
        Each region in {@code copyBufferAddress} is copied from the source memory region to an image region in the destination image. If the destination image is of type #IMAGE_TYPE_3D, the starting slice and number of slices to copy are specified in {@code pImageSubresources}{@code ::baseArrayLayer} and {@code pImageSubresources}{@code ::layerCount} respectively. The copy <b>must</b> be performed on a queue that supports indirect copy operations, see ##VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-indirectCopy">{@code indirectCopy}</a> feature <b>must</b> be enabled</li>
            <li>{@code dstImage} <b>must</b> not be a protected image</li>
            <li>The {@code aspectMask} member for every subresource in {@code pImageSubresources} <b>must</b> only have a single bit set</li>
            <li>The image region specified by each element in {@code copyBufferAddress} <b>must</b> be a region that is contained within {@code dstImage}</li>
            <li>{@code dstImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
        </ul>

        <ul>
            <li>{@code dstImage} <b>must</b> have a sample count equal to #SAMPLE_COUNT_1_BIT</li>
            <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code dstImageLayout} <b>must</b> be #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL, #IMAGE_LAYOUT_GENERAL, or #IMAGE_LAYOUT_SHARED_PRESENT_KHR</li>
            <li>The specified {@code mipLevel} of each region <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>If {@code layerCount} is not #REMAINING_ARRAY_LAYERS, the specified {@code baseArrayLayer} + {@code layerCount} of each region <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>The {@code imageOffset} and {@code imageExtent} members of each region <b>must</b> respect the image transfer granularity requirements of {@code commandBuffer}’s command pool’s queue family, as described in ##VkQueueFamilyProperties</li>
            <li>{@code dstImage} <b>must</b> not have been created with {@code flags} containing #IMAGE_CREATE_SUBSAMPLED_BIT_EXT</li>
            <li>If the queue family used to create the {@code VkCommandPool} which {@code commandBuffer} was allocated from does not support #QUEUE_GRAPHICS_BIT, for each region, the {@code aspectMask} member of {@code pImageSubresources} <b>must</b> not be #IMAGE_ASPECT_DEPTH_BIT or #IMAGE_ASPECT_STENCIL_BIT</li>
            <li>For each region in {@code copyBufferAddress}, {@code imageOffset.y} and <code>(imageExtent.height + imageOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified subresource</li>
            <li>{@code offset} <b>must</b> be 4 byte aligned</li>
            <li>{@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to sizeof(##VkCopyMemoryToImageIndirectCommandNV)</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pImageSubresources} <b>must</b> be a valid pointer to an array of {@code copyCount} valid ##VkImageSubresourceLayers structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code copyCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and {@code dstImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Transfer Graphics Compute</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkImageSubresourceLayers
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkDeviceAddress("copyBufferAddress", "the buffer address specifying the copy parameters. This buffer is laid out in memory as an array of ##VkCopyMemoryToImageIndirectCommandNV structures."),
        AutoSize("pImageSubresources")..uint32_t("copyCount", "the number of copies to execute, and can be zero."),
        uint32_t("stride", "the byte stride between successive sets of copy parameters."),
        VkImage("dstImage", "the destination image."),
        VkImageLayout("dstImageLayout", "the layout of the destination image subresources for the copy."),
        VkImageSubresourceLayers.const.p("pImageSubresources", "a pointer to an array of size {@code copyCount} of ##VkImageSubresourceLayers used to specify the specific image subresource of the destination image data for that copy.")
    )
}