/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * This extension enables reads from attachments and resources written by previous fragment shaders within a dynamic render pass.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_dynamic_rendering_local_read}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>233</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRDynamicRendering VK_KHR_dynamic_rendering} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.3">Version 1.3</a></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tobias Hector <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_dynamic_rendering_local_read]%20@tobski%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_dynamic_rendering_local_read%20extension*">tobski</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_dynamic_rendering_local_read.adoc">VK_KHR_dynamic_rendering_local_read</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-11-03</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Tobias Hector, AMD</li>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * <li>Connor Abbott, Valve</li>
 * <li>Pan Gao, Huawei</li>
 * <li>Lionel Landwerlin, Intel</li>
 * <li>Shahbaz Youssefi, Google</li>
 * <li>Alyssa Rosenzweig, Valve</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Mike Blumenkrantz, Valve</li>
 * <li>Graeme Leese, Broadcom</li>
 * <li>Piers Daniell, Nvidia</li>
 * <li>Stuart Smith, AMD</li>
 * <li>Daniel Story, Nintendo</li>
 * <li>James Fitzpatrick, Imagination</li>
 * <li>Piotr Byszewski, Mobica</li>
 * <li>Spencer Fricke, LunarG</li>
 * <li>Tom Olson, Arm</li>
 * <li>Michal Pietrasiuk, Intel</li>
 * <li>Matthew Netsch, Qualcomm</li>
 * <li>Marty Johnson, Khronos</li>
 * <li>Wyvern Wang, Huawei</li>
 * <li>Jeff Bolz, Nvidia</li>
 * <li>Samuel (Sheng-Wen) Huang, MediaTek</li>
 * </ul></dd>
 * </dl>
 */
public class KHRDynamicRenderingLocalRead {

    /** The extension specification version. */
    public static final int VK_KHR_DYNAMIC_RENDERING_LOCAL_READ_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_DYNAMIC_RENDERING_LOCAL_READ_EXTENSION_NAME = "VK_KHR_dynamic_rendering_local_read";

    /** Extends {@code VkImageLayout}. */
    public static final int VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ_KHR = 1000232000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO_KHR STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES_KHR = 1000232000,
        VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO_KHR                    = 1000232001,
        VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR                 = 1000232002;

    protected KHRDynamicRenderingLocalRead() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetRenderingAttachmentLocationsKHR ] ---

    /** Unsafe version of: {@link #vkCmdSetRenderingAttachmentLocationsKHR CmdSetRenderingAttachmentLocationsKHR} */
    public static void nvkCmdSetRenderingAttachmentLocationsKHR(VkCommandBuffer commandBuffer, long pLocationInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRenderingAttachmentLocationsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pLocationInfo, __functionAddress);
    }

    /**
     * Set color attachment location mappings for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To set the fragment output location mappings during rendering, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetRenderingAttachmentLocationsKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkRenderingAttachmentLocationInfoKHR* pLocationInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the attachment location mappings for subsequent drawing commands, and <b>must</b> match the mappings provided to the currently bound pipeline, if one is bound, which <b>can</b> be set by chaining {@link VkRenderingAttachmentLocationInfoKHR} to {@link VkGraphicsPipelineCreateInfo}.</p>
     * 
     * <p>Until this command is called, mappings in the command buffer state are treated as each color attachment specified in {@link VK13#vkCmdBeginRendering CmdBeginRendering} having a location equal to its index in {@link VkRenderingInfo}{@code ::pColorAttachments}. This state is reset whenever {@link VK13#vkCmdBeginRendering CmdBeginRendering} is called.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicRenderingLocalRead">{@code dynamicRenderingLocalRead}</a> <b>must</b> be enabled</li>
     * <li>{@code pLocationInfo→colorAttachmentCount} <b>must</b> be equal to the value of {@link VkRenderingInfo}{@code ::colorAttachmentCount} used to begin the current render pass instance</li>
     * <li>The current render pass instance <b>must</b> have been started or resumed by {@link VK13#vkCmdBeginRendering CmdBeginRendering} in this {@code commandBuffer}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pLocationInfo} <b>must</b> be a valid pointer to a valid {@link VkRenderingAttachmentLocationInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRenderingAttachmentLocationInfoKHR}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pLocationInfo a {@link VkRenderingAttachmentLocationInfoKHR} structure indicating the new mappings.
     */
    public static void vkCmdSetRenderingAttachmentLocationsKHR(VkCommandBuffer commandBuffer, @NativeType("VkRenderingAttachmentLocationInfoKHR const *") VkRenderingAttachmentLocationInfoKHR pLocationInfo) {
        nvkCmdSetRenderingAttachmentLocationsKHR(commandBuffer, pLocationInfo.address());
    }

    // --- [ vkCmdSetRenderingInputAttachmentIndicesKHR ] ---

    /** Unsafe version of: {@link #vkCmdSetRenderingInputAttachmentIndicesKHR CmdSetRenderingInputAttachmentIndicesKHR} */
    public static void nvkCmdSetRenderingInputAttachmentIndicesKHR(VkCommandBuffer commandBuffer, long pInputAttachmentIndexInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRenderingInputAttachmentIndicesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInputAttachmentIndexInfo, __functionAddress);
    }

    /**
     * Set input attachment index mappings for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To set the input attachment index mappings during dynamic rendering, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetRenderingInputAttachmentIndicesKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkRenderingInputAttachmentIndexInfoKHR* pInputAttachmentIndexInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the input attachment index mappings for subsequent drawing commands, and <b>must</b> match the mappings provided to the currently bound pipeline, if one is bound, which <b>can</b> be set by chaining {@link VkRenderingInputAttachmentIndexInfoKHR} to {@link VkGraphicsPipelineCreateInfo}.</p>
     * 
     * <p>Until this command is called, mappings in the command buffer state are treated as each color attachment specified in {@link VK13#vkCmdBeginRendering CmdBeginRendering} mapping to subpass inputs with a {@code InputAttachmentIndex} equal to its index in {@link VkRenderingInfo}{@code ::pColorAttachments}, and depth/stencil attachments mapping to input attachments without these decorations. This state is reset whenever {@link VK13#vkCmdBeginRendering CmdBeginRendering} is called.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicRenderingLocalRead">{@code dynamicRenderingLocalRead}</a> <b>must</b> be enabled</li>
     * <li>{@code pInputAttachmentIndexInfo→colorAttachmentCount} <b>must</b> be equal to the value of {@link VkRenderingInfo}{@code ::colorAttachmentCount} used to begin the current render pass instance</li>
     * <li>The current render pass instance <b>must</b> have been started or resumed by {@link VK13#vkCmdBeginRendering CmdBeginRendering} in this {@code commandBuffer}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pInputAttachmentIndexInfo} <b>must</b> be a valid pointer to a valid {@link VkRenderingInputAttachmentIndexInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRenderingInputAttachmentIndexInfoKHR}</p>
     *
     * @param commandBuffer             the command buffer into which the command will be recorded.
     * @param pInputAttachmentIndexInfo a {@link VkRenderingInputAttachmentIndexInfoKHR} structure indicating the new mappings.
     */
    public static void vkCmdSetRenderingInputAttachmentIndicesKHR(VkCommandBuffer commandBuffer, @NativeType("VkRenderingInputAttachmentIndexInfoKHR const *") VkRenderingInputAttachmentIndexInfoKHR pInputAttachmentIndexInfo) {
        nvkCmdSetRenderingInputAttachmentIndicesKHR(commandBuffer, pInputAttachmentIndexInfo.address());
    }

}