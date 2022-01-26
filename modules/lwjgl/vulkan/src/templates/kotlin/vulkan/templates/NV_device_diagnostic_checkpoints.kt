/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_device_diagnostic_checkpoints = "NVDeviceDiagnosticCheckpoints".nativeClassVK("NV_device_diagnostic_checkpoints", type = "device", postfix = "NV") {
    documentation =
        """
        This extension allows applications to insert markers in the command stream and associate them with custom data.

        If a device lost error occurs, the application <b>may</b> then query the implementation for the last markers to cross specific implementation-defined pipeline stages, in order to narrow down which commands were executing at the time and might have caused the failure.

        <h5>VK_NV_device_diagnostic_checkpoints</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_device_diagnostic_checkpoints}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>207</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Nuno Subtil <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_device_diagnostic_checkpoints]%20@nsubtil%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_device_diagnostic_checkpoints%20extension%3E%3E">nsubtil</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-07-16</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Oleg Kuznetsov, NVIDIA</li>
                <li>Alex Dunn, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Eric Werness, NVIDIA</li>
                <li>Daniel Koch, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_EXTENSION_NAME".."VK_NV_device_diagnostic_checkpoints"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_CHECKPOINT_DATA_NV".."1000206000",
        "STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV".."1000206001"
    )

    void(
        "CmdSetCheckpointNV",
        """
        Insert diagnostic checkpoint in command stream.

        <h5>C Specification</h5>
        Device diagnostic checkpoints are inserted into the command stream by calling #CmdSetCheckpointNV().

        <pre><code>
￿void vkCmdSetCheckpointNV(
￿    VkCommandBuffer                             commandBuffer,
￿    const void*                                 pCheckpointMarker);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, compute, or transfer operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute Transfer</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that will receive the marker"),
        nullable..opaque_const_p("pCheckpointMarker", "an opaque application-provided value that will be associated with the checkpoint.")
    )

    void(
        "GetQueueCheckpointDataNV",
        """
        Retrieve diagnostic checkpoint data.

        <h5>C Specification</h5>
        If the device encounters an error during execution, the implementation will return a #ERROR_DEVICE_LOST error to the application at a certain point during host execution. When this happens, the application <b>can</b> call #GetQueueCheckpointDataNV() to retrieve information on the most recent diagnostic checkpoints that were executed by the device.

        <pre><code>
￿void vkGetQueueCheckpointDataNV(
￿    VkQueue                                     queue,
￿    uint32_t*                                   pCheckpointDataCount,
￿    VkCheckpointDataNV*                         pCheckpointData);</code></pre>

        <h5>Description</h5>
        If {@code pCheckpointData} is {@code NULL}, then the number of checkpoint markers available is returned in {@code pCheckpointDataCount}.

        Otherwise, {@code pCheckpointDataCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pCheckpointData} array, and on return the variable is overwritten with the number of structures actually written to {@code pCheckpointData}.

        If {@code pCheckpointDataCount} is less than the number of checkpoint markers available, at most {@code pCheckpointDataCount} structures will be written.

        <h5>Valid Usage</h5>
        <ul>
            <li>The device that {@code queue} belongs to <b>must</b> be in the lost state</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
            <li>{@code pCheckpointDataCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pCheckpointDataCount} is not 0, and {@code pCheckpointData} is not {@code NULL}, {@code pCheckpointData} <b>must</b> be a valid pointer to an array of {@code pCheckpointDataCount} ##VkCheckpointDataNV structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkCheckpointDataNV
        """,

        VkQueue("queue", "the {@code VkQueue} object the caller would like to retrieve checkpoint data for"),
        AutoSize("pCheckpointData")..Check(1)..uint32_t.p("pCheckpointDataCount", "a pointer to an integer related to the number of checkpoint markers available or queried, as described below."),
        nullable..VkCheckpointDataNV.p("pCheckpointData", "either {@code NULL} or a pointer to an array of ##VkCheckpointDataNV structures.")
    )
}