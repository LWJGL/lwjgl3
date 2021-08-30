/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_copy_commands2 = "KHRCopyCommands2".nativeClassVK("KHR_copy_commands2", type = "device", postfix = KHR) {
    documentation =
        """
        This extension provides extensible versions of the Vulkan buffer and image copy commands. The new commands are functionally identical to the core commands, except that their copy parameters are specified using extensible structures that can be used to pass extension-specific information.

        The following extensible copy commands are introduced with this extension: #CmdCopyBuffer2KHR(), #CmdCopyImage2KHR(), #CmdCopyBufferToImage2KHR(), #CmdCopyImageToBuffer2KHR(), #CmdBlitImage2KHR(), and #CmdResolveImage2KHR(). Each command contains an stext:*Info2KHR structure parameter that includes {@code sType}/{@code pNext} members. Lower level structures that describe each region to be copied are also extended with {@code sType}/{@code pNext} members.

        <h5>VK_KHR_copy_commands2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_copy_commands2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>338</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Leger <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_copy_commands2:%20&amp;body=@jackohound%20">jackohound</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-07-06</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>None</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Leger, Qualcomm</li>
                <li>Tobias Hector, AMD</li>
                <li>Jan-Harald Fredriksen, ARM</li>
                <li>Tom Olson, ARM</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_COPY_COMMANDS_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_COPY_COMMANDS_2_EXTENSION_NAME".."VK_KHR_copy_commands2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_COPY_BUFFER_INFO_2_KHR".."1000337000",
        "STRUCTURE_TYPE_COPY_IMAGE_INFO_2_KHR".."1000337001",
        "STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2_KHR".."1000337002",
        "STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR".."1000337003",
        "STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR".."1000337004",
        "STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR".."1000337005",
        "STRUCTURE_TYPE_BUFFER_COPY_2_KHR".."1000337006",
        "STRUCTURE_TYPE_IMAGE_COPY_2_KHR".."1000337007",
        "STRUCTURE_TYPE_IMAGE_BLIT_2_KHR".."1000337008",
        "STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR".."1000337009",
        "STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR".."1000337010"
    )

    void(
        "CmdCopyBuffer2KHR",
        """
        Copy data between buffer regions.

        <h5>C Specification</h5>
        To copy data between buffer objects, call:

        <pre><code>
￿void vkCmdCopyBuffer2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyBufferInfo2KHR*                 pCopyBufferInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally identical to #CmdCopyBuffer(), but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code dstBuffer} <b>must</b> not be an unprotected buffer</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCopyBufferInfo} <b>must</b> be a valid pointer to a valid ##VkCopyBufferInfo2KHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCopyBufferInfo2KHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyBufferInfo2KHR.const.p("pCopyBufferInfo", "a pointer to a ##VkCopyBufferInfo2KHR structure describing the copy parameters.")
    )

    void(
        "CmdCopyImage2KHR",
        """
        Copy data between images.

        <h5>C Specification</h5>
        To copy data between image objects, call:

        <pre><code>
￿void vkCmdCopyImage2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyImageInfo2KHR*                  pCopyImageInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally identical to #CmdCopyImage(), but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code dstImage} <b>must</b> not be an unprotected image</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCopyImageInfo} <b>must</b> be a valid pointer to a valid ##VkCopyImageInfo2KHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCopyImageInfo2KHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyImageInfo2KHR.const.p("pCopyImageInfo", "a pointer to a ##VkCopyImageInfo2KHR structure describing the copy parameters.")
    )

    void(
        "CmdCopyBufferToImage2KHR",
        """
        Copy data from a buffer into an image.

        <h5>C Specification</h5>
        To copy data from a buffer object to an image object, call:

        <pre><code>
￿void vkCmdCopyBufferToImage2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyBufferToImageInfo2KHR*          pCopyBufferToImageInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally identical to #CmdCopyBufferToImage(), but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code dstImage} <b>must</b> not be an unprotected image</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCopyBufferToImageInfo} <b>must</b> be a valid pointer to a valid ##VkCopyBufferToImageInfo2KHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCopyBufferToImageInfo2KHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyBufferToImageInfo2KHR.const.p("pCopyBufferToImageInfo", "a pointer to a ##VkCopyBufferToImageInfo2KHR structure describing the copy parameters.")
    )

    void(
        "CmdCopyImageToBuffer2KHR",
        """
        Copy image data into a buffer.

        <h5>C Specification</h5>
        To copy data from an image object to a buffer object, call:

        <pre><code>
￿void vkCmdCopyImageToBuffer2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyImageToBufferInfo2KHR*          pCopyImageToBufferInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally identical to #CmdCopyImageToBuffer(), but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code dstBuffer} <b>must</b> not be an unprotected buffer</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCopyImageToBufferInfo} <b>must</b> be a valid pointer to a valid ##VkCopyImageToBufferInfo2KHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCopyImageToBufferInfo2KHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyImageToBufferInfo2KHR.const.p("pCopyImageToBufferInfo", "a pointer to a ##VkCopyImageToBufferInfo2KHR structure describing the copy parameters.")
    )

    void(
        "CmdBlitImage2KHR",
        """
        Copy regions of an image, potentially performing format conversion,.

        <h5>C Specification</h5>
        To copy regions of a source image into a destination image, potentially performing format conversion, arbitrary scaling, and filtering, call:

        <pre><code>
￿void vkCmdBlitImage2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkBlitImageInfo2KHR*                  pBlitImageInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally identical to #CmdBlitImage(), but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code dstImage} <b>must</b> not be an unprotected image</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBlitImageInfo} <b>must</b> be a valid pointer to a valid ##VkBlitImageInfo2KHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkBlitImageInfo2KHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBlitImageInfo2KHR.const.p("pBlitImageInfo", "a pointer to a ##VkBlitImageInfo2KHR structure describing the blit parameters.")
    )

    void(
        "CmdResolveImage2KHR",
        """
        Resolve regions of an image.

        <h5>C Specification</h5>
        To resolve a multisample image to a non-multisample image, call:

        <pre><code>
￿void vkCmdResolveImage2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkResolveImageInfo2KHR*               pResolveImageInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally identical to #CmdResolveImage(), but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code dstImage} <b>must</b> not be an unprotected image</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pResolveImageInfo} <b>must</b> be a valid pointer to a valid ##VkResolveImageInfo2KHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkResolveImageInfo2KHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkResolveImageInfo2KHR.const.p("pResolveImageInfo", "a pointer to a ##VkResolveImageInfo2KHR structure describing the resolve parameters.")
    )
}