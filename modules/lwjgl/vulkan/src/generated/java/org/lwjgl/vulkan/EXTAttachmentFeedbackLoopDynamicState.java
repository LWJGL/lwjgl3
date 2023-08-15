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
 * This extension adds support for setting attachment feedback loops dynamically on command buffers.
 * 
 * <h5>VK_EXT_attachment_feedback_loop_dynamic_state</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_attachment_feedback_loop_dynamic_state}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>525</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} and {@link EXTAttachmentFeedbackLoopLayout VK_EXT_attachment_feedback_loop_layout}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Mike Blumenkrantz <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_attachment_feedback_loop_dynamic_state]%20@zmike%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_attachment_feedback_loop_dynamic_state%20extension*">zmike</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_attachment_feedback_loop_dynamic_state.adoc">VK_EXT_attachment_feedback_loop_dynamic_state</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-04-28</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Mike Blumenkrantz, Valve</li>
 * <li>Daniel Story, Nintendo</li>
 * <li>Stu Smith, AMD</li>
 * <li>Samuel Pitoiset, Valve</li>
 * <li>Ricardo Garcia, Igalia</li>
 * </ul></dd>
 * </dl>
 */
public class EXTAttachmentFeedbackLoopDynamicState {

    /** The extension specification version. */
    public static final int VK_EXT_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_EXTENSION_NAME = "VK_EXT_attachment_feedback_loop_dynamic_state";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT = 1000524000;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT = 1000524000;

    protected EXTAttachmentFeedbackLoopDynamicState() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetAttachmentFeedbackLoopEnableEXT ] ---

    /**
     * Specify whether attachment feedback loops are enabled dynamically on a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> whether a pipeline <b>can</b> access a resource as a non-attachment while it is also used as an attachment that is written to, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetAttachmentFeedbackLoopEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkImageAspectFlags                          aspectMask);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>For attachments that are written to in a render pass, only attachments with the aspects specified in {@code aspectMask} <b>can</b> be accessed as non-attachments by subsequent <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#drawing">drawing commands</a>.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-attachmentFeedbackLoopDynamicState">{@code attachmentFeedbackLoopDynamicState}</a> feature <b>must</b> be enabled</li>
     * <li>{@code aspectMask} <b>must</b> only include {@link VK13#VK_IMAGE_ASPECT_NONE IMAGE_ASPECT_NONE}, {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}, {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT}, and {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-attachmentFeedbackLoopLayout">{@code attachmentFeedbackLoopLayout}</a> feature is not enabled, {@code aspectMask} <b>must</b> be {@link VK13#VK_IMAGE_ASPECT_NONE IMAGE_ASPECT_NONE}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code aspectMask} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param aspectMask    specifies the types of attachments for which feedback loops will be enabled. Attachment types whose aspects are not included in {@code aspectMask} will have feedback loops disabled.
     */
    public static void vkCmdSetAttachmentFeedbackLoopEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkImageAspectFlags") int aspectMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetAttachmentFeedbackLoopEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), aspectMask, __functionAddress);
    }

}