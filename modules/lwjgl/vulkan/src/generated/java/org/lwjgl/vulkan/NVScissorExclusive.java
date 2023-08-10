/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension adds support for an exclusive scissor test to Vulkan. The exclusive scissor test behaves like the scissor test, except that the exclusive scissor test fails for pixels inside the corresponding rectangle and passes for pixels outside the rectangle. If the same rectangle is used for both the scissor and exclusive scissor tests, the exclusive scissor test will pass if and only if the scissor test fails.
 * 
 * <p>Version 2 of this extension introduces {@link #VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV} and {@link #vkCmdSetExclusiveScissorEnableNV CmdSetExclusiveScissorEnableNV}. Applications that use this dynamic state must ensure the implementation advertises at least {@code specVersion} 2 of this extension.</p>
 * 
 * <h5>VK_NV_scissor_exclusive</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_scissor_exclusive}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>206</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Pat Brown <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_scissor_exclusive]%20@nvpbrown%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_scissor_exclusive%20extension*">nvpbrown</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-01-18</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd>None</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Pat Brown, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVScissorExclusive {

    /** The extension specification version. */
    public static final int VK_NV_SCISSOR_EXCLUSIVE_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_NV_SCISSOR_EXCLUSIVE_EXTENSION_NAME = "VK_NV_scissor_exclusive";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV = 1000205000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV            = 1000205002;

    /**
     * Extends {@code VkDynamicState}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV}</li>
     * <li>{@link #VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV}</li>
     * </ul>
     */
    public static final int
        VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV = 1000205000,
        VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV        = 1000205001;

    protected NVScissorExclusive() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetExclusiveScissorEnableNV ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetExclusiveScissorEnableNV CmdSetExclusiveScissorEnableNV}
     *
     * @param exclusiveScissorCount the number of exclusive scissor rectangles updated by the command.
     */
    public static void nvkCmdSetExclusiveScissorEnableNV(VkCommandBuffer commandBuffer, int firstExclusiveScissor, int exclusiveScissorCount, long pExclusiveScissorEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetExclusiveScissorEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissorEnables, __functionAddress);
    }

    /**
     * Dynamically enable each exclusive scissor for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> whether an exclusive scissor is enabled or not, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetExclusiveScissorEnableNV(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstExclusiveScissor,
     *     uint32_t                                    exclusiveScissorCount,
     *     const VkBool32*                             pExclusiveScissorEnables);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The exclusive scissor enables taken from element <code>i</code> of {@code pExclusiveScissorEnables} replace the current state for the scissor index <code>firstExclusiveScissor + i</code>, for <code>i</code> in <code>[0, exclusiveScissorCount)</code>.</p>
     * 
     * <p>This command sets the exclusive scissor enable for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is implied by the {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV}{@code ::exclusiveScissorCount} value used to create the currently active pipeline, where all {@code exclusiveScissorCount} exclusive scissors are implicitly enabled and the remainder up to {@link VkPhysicalDeviceLimits}{@code ::maxViewports} are implicitly disabled.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-exclusiveScissor">{@code exclusiveScissor}</a> feature <b>must</b> be enabled, and the implementation <b>must</b> support at least {@code specVersion} 2 of the {@link NVScissorExclusive VK_NV_scissor_exclusive} extension</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pExclusiveScissorEnables} <b>must</b> be a valid pointer to an array of {@code exclusiveScissorCount} {@code VkBool32} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code exclusiveScissorCount} <b>must</b> be greater than 0</li>
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
     * @param commandBuffer            the command buffer into which the command will be recorded.
     * @param firstExclusiveScissor    the index of the first exclusive scissor rectangle whose state is updated by the command.
     * @param pExclusiveScissorEnables a pointer to an array of {@code VkBool32} values defining whether the exclusive scissor is enabled.
     */
    public static void vkCmdSetExclusiveScissorEnableNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstExclusiveScissor, @NativeType("VkBool32 const *") IntBuffer pExclusiveScissorEnables) {
        nvkCmdSetExclusiveScissorEnableNV(commandBuffer, firstExclusiveScissor, pExclusiveScissorEnables.remaining(), memAddress(pExclusiveScissorEnables));
    }

    // --- [ vkCmdSetExclusiveScissorNV ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetExclusiveScissorNV CmdSetExclusiveScissorNV}
     *
     * @param exclusiveScissorCount the number of exclusive scissor rectangles updated by the command.
     */
    public static void nvkCmdSetExclusiveScissorNV(VkCommandBuffer commandBuffer, int firstExclusiveScissor, int exclusiveScissorCount, long pExclusiveScissors) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetExclusiveScissorNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissors, __functionAddress);
    }

    /**
     * Set exclusive scissor rectangles dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the exclusive scissor rectangles, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetExclusiveScissorNV(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstExclusiveScissor,
     *     uint32_t                                    exclusiveScissorCount,
     *     const VkRect2D*                             pExclusiveScissors);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The scissor rectangles taken from element <code>i</code> of {@code pExclusiveScissors} replace the current state for the scissor index <code>firstExclusiveScissor + i</code>, for <code>i</code> in <code>[0, exclusiveScissorCount)</code>.</p>
     * 
     * <p>This command sets the exclusive scissor rectangles for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV}{@code ::pExclusiveScissors} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-exclusiveScissor">{@code exclusiveScissor}</a> feature <b>must</b> be enabled</li>
     * <li>The sum of {@code firstExclusiveScissor} and {@code exclusiveScissorCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-multiViewport">{@code multiViewport}</a> feature is not enabled, {@code firstExclusiveScissor} <b>must</b> be 0</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-multiViewport">{@code multiViewport}</a> feature is not enabled, {@code exclusiveScissorCount} <b>must</b> be 1</li>
     * <li>The {@code x} and {@code y} members of {@code offset} in each member of {@code pExclusiveScissors} <b>must</b> be greater than or equal to 0</li>
     * <li>Evaluation of <code>(offset.x + extent.width)</code> for each member of {@code pExclusiveScissors} <b>must</b> not cause a signed integer addition overflow</li>
     * <li>Evaluation of <code>(offset.y + extent.height)</code> for each member of {@code pExclusiveScissors} <b>must</b> not cause a signed integer addition overflow</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pExclusiveScissors} <b>must</b> be a valid pointer to an array of {@code exclusiveScissorCount} {@link VkRect2D} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code exclusiveScissorCount} <b>must</b> be greater than 0</li>
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
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRect2D}</p>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param firstExclusiveScissor the index of the first exclusive scissor rectangle whose state is updated by the command.
     * @param pExclusiveScissors    a pointer to an array of {@link VkRect2D} structures defining exclusive scissor rectangles.
     */
    public static void vkCmdSetExclusiveScissorNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstExclusiveScissor, @NativeType("VkRect2D const *") VkRect2D.Buffer pExclusiveScissors) {
        nvkCmdSetExclusiveScissorNV(commandBuffer, firstExclusiveScissor, pExclusiveScissors.remaining(), pExclusiveScissors.address());
    }

    /** Array version of: {@link #vkCmdSetExclusiveScissorEnableNV CmdSetExclusiveScissorEnableNV} */
    public static void vkCmdSetExclusiveScissorEnableNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstExclusiveScissor, @NativeType("VkBool32 const *") int[] pExclusiveScissorEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetExclusiveScissorEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstExclusiveScissor, pExclusiveScissorEnables.length, pExclusiveScissorEnables, __functionAddress);
    }

}