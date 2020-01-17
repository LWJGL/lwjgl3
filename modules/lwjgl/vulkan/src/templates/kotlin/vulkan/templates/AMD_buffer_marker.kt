/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_buffer_marker = "AMDBufferMarker".nativeClassVK("AMD_buffer_marker", type = "device", postfix = AMD) {
    documentation =
        """
        This extension adds a new operation to execute pipelined writes of small marker values into a {@code VkBuffer} object.

        The primary purpose of these markers is to facilitate the development of debugging tools for tracking which pipelined command contributed to device loss.

        <h5>Examples</h5>
        None.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_buffer_marker}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>180</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_AMD_buffer_marker:%20&amp;body=@drakos-amd%20">drakos-amd</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2018-01-26</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Jaakko Konttinen, AMD</li>
                <li>Daniel Rakos, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_BUFFER_MARKER_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_BUFFER_MARKER_EXTENSION_NAME".."VK_AMD_buffer_marker"
    )

    void(
        "CmdWriteBufferMarkerAMD",
        """
        Execute a pipelined write of a marker value into a buffer.

        <h5>C Specification</h5>
        To write a 32-bit marker value into a buffer as a pipelined operation, call:

        <pre><code>
￿void vkCmdWriteBufferMarkerAMD(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineStageFlagBits                     pipelineStage,
￿    VkBuffer                                    dstBuffer,
￿    VkDeviceSize                                dstOffset,
￿    uint32_t                                    marker);</code></pre>

        <h5>Description</h5>
        The command will write the 32-bit marker value into the buffer only after all preceding commands have finished executing up to at least the specified pipeline stage. This includes the completion of other preceding {@code vkCmdWriteBufferMarkerAMD} commands so long as their specified pipeline stages occur either at the same time or earlier than this command's specified {@code pipelineStage}.

        While consecutive buffer marker writes with the same {@code pipelineStage} parameter are implicitly complete in submission order, memory and execution dependencies between buffer marker writes and other operations must still be explicitly ordered using synchronization commands. The access scope for buffer marker writes falls under the #ACCESS_TRANSFER_WRITE_BIT, and the pipeline stages for identifying the synchronization scope <b>must</b> include both {@code pipelineStage} and #PIPELINE_STAGE_TRANSFER_BIT.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Similar to {@code vkCmdWriteTimestamp}, if an implementation is unable to write a marker at any specific pipeline stage, it <b>may</b> instead do so at any logically later stage.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Implementations <b>may</b> only support a limited number of pipelined marker write operations in flight at a given time, thus excessive number of marker write operations <b>may</b> degrade command execution performance.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dstOffset} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus 4.</li>
            <li>{@code dstBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pipelineStage} <b>must</b> be a valid {@code VkPipelineStageFlagBits} value</li>
            <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>Both of {@code commandBuffer}, and {@code dstBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Transfer Graphics Compute</td><td>Transfer</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkPipelineStageFlagBits("pipelineStage", "one of the {@code VkPipelineStageFlagBits} values, specifying the pipeline stage whose completion triggers the marker write."),
        VkBuffer("dstBuffer", "the buffer where the marker will be written to."),
        VkDeviceSize("dstOffset", "the byte offset into the buffer where the marker will be written to."),
        uint32_t("marker", "the 32-bit value of the marker.")
    )
}