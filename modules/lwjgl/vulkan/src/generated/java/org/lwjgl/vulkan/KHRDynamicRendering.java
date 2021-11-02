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
 * This extension allows applications to create single-pass render pass instances without needing to create render pass objects or framebuffers. Dynamic render passes can also span across multiple primary command buffers, rather than relying on secondary command buffers.
 * 
 * <p>This extension also incorporates {@link #VK_ATTACHMENT_STORE_OP_NONE_KHR ATTACHMENT_STORE_OP_NONE_KHR} from {@link QCOMRenderPassStoreOps VK_QCOM_render_pass_store_ops}, enabling applications to avoid unnecessary synchronization when an attachment is not written during a render pass.</p>
 * 
 * <h5>VK_KHR_dynamic_rendering</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_dynamic_rendering}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>45</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_dynamic_rendering]%20@tobski%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_dynamic_rendering%20extension%3E%3E">tobski</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_dynamic_rendering.asciidoc">VK_KHR_dynamic_rendering</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-10-06</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Tobias Hector, AMD</li>
 * <li>Arseny Kapoulkine, Roblox</li>
 * <li>François Duranleau, Gameloft</li>
 * <li>Stuart Smith, AMD</li>
 * <li>Hai Nguyen, Google</li>
 * <li>Jean-François Roy, Google</li>
 * <li>Jeff Leger, Qualcomm</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Piers Daniell, Nvidia</li>
 * <li>James Fitzpatrick, Imagination</li>
 * <li>Piotr Byszewski, Mobica</li>
 * <li>Jesse Hall, Google</li>
 * <li>Mike Blumenkrantz, Valve</li>
 * </ul></dd>
 * </dl>
 */
public class KHRDynamicRendering {

    /** The extension specification version. */
    public static final int VK_KHR_DYNAMIC_RENDERING_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_DYNAMIC_RENDERING_EXTENSION_NAME = "VK_KHR_dynamic_rendering";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDERING_INFO_KHR STRUCTURE_TYPE_RENDERING_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO_KHR STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_RENDERING_INFO_KHR                             = 1000044000,
        VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO_KHR                  = 1000044001,
        VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO_KHR             = 1000044002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR = 1000044003,
        VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR  = 1000044004;

    /** Extends {@code VkAttachmentStoreOp}. */
    public static final int VK_ATTACHMENT_STORE_OP_NONE_KHR = 1000301000;

    /** Extends {@code VkPipelineCreateFlagBits}. */
    public static final int VK_PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x200000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR = 1000044006;

    /** Extends {@code VkPipelineCreateFlagBits}. */
    public static final int VK_PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT = 0x400000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT = 1000044007;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD = 1000044008;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_NV = 1000044008;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX = 1000044009;

    /**
     * VkRenderingFlagBitsKHR - Bitmask specifying additional properties of a dynamic render pass instance
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR} specifies that draw calls for the render pass instance will be recorded in secondary command buffers.</li>
     * <li>{@link #VK_RENDERING_RESUMING_BIT_KHR RENDERING_RESUMING_BIT_KHR} specifies that the render pass instance is resuming an earlier suspended render pass instance.</li>
     * <li>{@link #VK_RENDERING_SUSPENDING_BIT_KHR RENDERING_SUSPENDING_BIT_KHR} specifies that the render pass instance will be suspended.</li>
     * </ul>
     * 
     * <p>The contents of {@code pRenderingInfo} <b>must</b> match between suspended render pass instances and the render pass instances that resume them, other than the presence or absence of the {@link #VK_RENDERING_RESUMING_BIT_KHR RENDERING_RESUMING_BIT_KHR}, {@link #VK_RENDERING_SUSPENDING_BIT_KHR RENDERING_SUSPENDING_BIT_KHR}, and {@link #VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR} flags. No action or synchronization commands, or other render pass instances, are allowed between suspending and resuming render pass instances.</p>
     */
    public static final int
        VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR = 0x1,
        VK_RENDERING_SUSPENDING_BIT_KHR                         = 0x2,
        VK_RENDERING_RESUMING_BIT_KHR                           = 0x4;

    protected KHRDynamicRendering() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBeginRenderingKHR ] ---

    /** Unsafe version of: {@link #vkCmdBeginRenderingKHR CmdBeginRenderingKHR} */
    public static void nvkCmdBeginRenderingKHR(VkCommandBuffer commandBuffer, long pRenderingInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginRenderingKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkRenderingInfoKHR.validate(pRenderingInfo);
        }
        callPPV(commandBuffer.address(), pRenderingInfo, __functionAddress);
    }

    /**
     * Begin a dynamic render pass instance.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To begin a render pass instance, call:</p>
     * 
     * <pre><code>
     * void vkCmdBeginRenderingKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkRenderingInfoKHR*                   pRenderingInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>After beginning a render pass instance, the command buffer is ready to record <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#drawing">draw commands</a>.</p>
     * 
     * <p>If {@code pRenderingInfo→flags} includes {@link #VK_RENDERING_RESUMING_BIT_KHR RENDERING_RESUMING_BIT_KHR} then this render pass is resumed from a render pass instance that has been suspended earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-submission-order">submission order</a>.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-dynamicRendering">{@code dynamicRendering}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code commandBuffer} is a secondary command buffer, {@code pRenderingInfo→flags} <b>must</b> not include {@link #VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pRenderingInfo} <b>must</b> be a valid pointer to a valid {@link VkRenderingInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRenderingInfoKHR}</p>
     *
     * @param commandBuffer  the command buffer in which to record the command.
     * @param pRenderingInfo a pointer to a {@link VkRenderingInfoKHR} structure specifying details of the render pass instance to begin.
     */
    public static void vkCmdBeginRenderingKHR(VkCommandBuffer commandBuffer, @NativeType("VkRenderingInfoKHR const *") VkRenderingInfoKHR pRenderingInfo) {
        nvkCmdBeginRenderingKHR(commandBuffer, pRenderingInfo.address());
    }

    // --- [ vkCmdEndRenderingKHR ] ---

    /**
     * End a dynamic render pass instance.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To end a render pass instance, call:</p>
     * 
     * <pre><code>
     * void vkCmdEndRenderingKHR(
     *     VkCommandBuffer                             commandBuffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If the value of {@code pRenderingInfo→flags} used to begin this render pass instance included {@link #VK_RENDERING_SUSPENDING_BIT_KHR RENDERING_SUSPENDING_BIT_KHR}, then this render pass is suspended and will be resumed later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-submission-order">submission order</a>.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The current render pass instance <b>must</b> have been begun with {@link #vkCmdBeginRenderingKHR CmdBeginRenderingKHR}</li>
     * <li>The current render pass instance <b>must</b> have been begun in {@code commandBuffer}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer in which to record the command.
     */
    public static void vkCmdEndRenderingKHR(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRenderingKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), __functionAddress);
    }

}