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
 * This extension allows the execution of one or more rendering commands to be conditional on a value in buffer memory. This may help an application reduce the latency by conditionally discarding rendering commands without application intervention. The conditional rendering commands are limited to draws, compute dispatches and clearing attachments within a conditional rendering block.
 * 
 * <h5>Examples</h5>
 * 
 * <p>None.</p>
 * 
 * <h5>VK_EXT_conditional_rendering</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_conditional_rendering}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>82</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Vikram Kushwaha <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_conditional_rendering]%20@vkushwaha%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_conditional_rendering%20extension%3E%3E">vkushwaha</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-05-21</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Vikram Kushwaha, NVIDIA</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Jesse Hall, Google</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Stuart Smith, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public class EXTConditionalRendering {

    /** The extension specification version. */
    public static final int VK_EXT_CONDITIONAL_RENDERING_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_EXT_CONDITIONAL_RENDERING_EXTENSION_NAME = "VK_EXT_conditional_rendering";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT = 1000081000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT        = 1000081001,
        VK_STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT                      = 1000081002;

    /** Extends {@code VkAccessFlagBits}. */
    public static final int VK_ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT = 0x100000;

    /** Extends {@code VkBufferUsageFlagBits}. */
    public static final int VK_BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT = 0x200;

    /** Extends {@code VkPipelineStageFlagBits}. */
    public static final int VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT = 0x40000;

    /**
     * VkConditionalRenderingFlagBitsEXT - Specify the behavior of conditional rendering
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_CONDITIONAL_RENDERING_INVERTED_BIT_EXT CONDITIONAL_RENDERING_INVERTED_BIT_EXT} specifies the condition used to determine whether to discard rendering commands or not. That is, if the 32-bit predicate read from {@code buffer} memory at {@code offset} is zero, the rendering commands are not discarded, and if non zero, then they are discarded.</li>
     * </ul>
     */
    public static final int VK_CONDITIONAL_RENDERING_INVERTED_BIT_EXT = 0x1;

    protected EXTConditionalRendering() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBeginConditionalRenderingEXT ] ---

    /** Unsafe version of: {@link #vkCmdBeginConditionalRenderingEXT CmdBeginConditionalRenderingEXT} */
    public static void nvkCmdBeginConditionalRenderingEXT(VkCommandBuffer commandBuffer, long pConditionalRenderingBegin) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginConditionalRenderingEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pConditionalRenderingBegin, __functionAddress);
    }

    /**
     * Define the beginning of a conditional rendering block.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To begin conditional rendering, call:</p>
     * 
     * <pre><code>
     * void vkCmdBeginConditionalRenderingEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkConditionalRenderingBeginInfoEXT*   pConditionalRenderingBegin);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Conditional rendering <b>must</b> not already be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#active-conditional-rendering">active</a></li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pConditionalRenderingBegin} <b>must</b> be a valid pointer to a valid {@link VkConditionalRenderingBeginInfoEXT} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkConditionalRenderingBeginInfoEXT}</p>
     *
     * @param commandBuffer              the command buffer into which this command will be recorded.
     * @param pConditionalRenderingBegin a pointer to a {@link VkConditionalRenderingBeginInfoEXT} structure specifying parameters of conditional rendering.
     */
    public static void vkCmdBeginConditionalRenderingEXT(VkCommandBuffer commandBuffer, @NativeType("VkConditionalRenderingBeginInfoEXT const *") VkConditionalRenderingBeginInfoEXT pConditionalRenderingBegin) {
        nvkCmdBeginConditionalRenderingEXT(commandBuffer, pConditionalRenderingBegin.address());
    }

    // --- [ vkCmdEndConditionalRenderingEXT ] ---

    /**
     * Define the end of a conditional rendering block.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To end conditional rendering, call:</p>
     * 
     * <pre><code>
     * void vkCmdEndConditionalRenderingEXT(
     *     VkCommandBuffer                             commandBuffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Once ended, conditional rendering becomes inactive.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Conditional rendering <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#active-conditional-rendering">active</a></li>
     * <li>If conditional rendering was made <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#active-conditional-rendering">active</a> outside of a render pass instance, it <b>must</b> not be ended inside a render pass instance</li>
     * <li>If conditional rendering was made <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#active-conditional-rendering">active</a> within a subpass it <b>must</b> be ended in the same subpass</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which this command will be recorded.
     */
    public static void vkCmdEndConditionalRenderingEXT(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndConditionalRenderingEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), __functionAddress);
    }

}