/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension adds some more dynamic state to support applications that need to reduce the number of pipeline state objects they compile and bind.
 * 
 * <h5>VK_EXT_extended_dynamic_state</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_extended_dynamic_state}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>268</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_extended_dynamic_state] @pdaniell-nv%0A&lt;&lt;Here describe the issue or question you have about the VK_EXT_extended_dynamic_state extension&gt;&gt;">pdaniell-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-12-09</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Dan Ginsburg, Valve Corporation</li>
 * <li>Graeme Leese, Broadcom</li>
 * <li>Hans-Kristian Arntzen, Valve Corporation</li>
 * <li>Jan-Harald Fredriksen, Arm Limited</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Jesse Hall, Google</li>
 * <li>Philip Rebohle, Valve Corporation</li>
 * <li>Stuart Smith, Imagination Technologies</li>
 * <li>Tobias Hector, AMD</li>
 * </ul></dd>
 * </dl>
 */
public class EXTExtendedDynamicState {

    /** The extension specification version. */
    public static final int VK_EXT_EXTENDED_DYNAMIC_STATE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_EXTENDED_DYNAMIC_STATE_EXTENSION_NAME = "VK_EXT_extended_dynamic_state";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT = 1000267000;

    /**
     * Extends {@code VkDynamicState}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DYNAMIC_STATE_CULL_MODE_EXT DYNAMIC_STATE_CULL_MODE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_FRONT_FACE_EXT DYNAMIC_STATE_FRONT_FACE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_STENCIL_OP_EXT DYNAMIC_STATE_STENCIL_OP_EXT}</li>
     * </ul>
     */
    public static final int
        VK_DYNAMIC_STATE_CULL_MODE_EXT                   = 1000267000,
        VK_DYNAMIC_STATE_FRONT_FACE_EXT                  = 1000267001,
        VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT          = 1000267002,
        VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT         = 1000267003,
        VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT          = 1000267004,
        VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT = 1000267005,
        VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT           = 1000267006,
        VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT          = 1000267007,
        VK_DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT            = 1000267008,
        VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT    = 1000267009,
        VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT         = 1000267010,
        VK_DYNAMIC_STATE_STENCIL_OP_EXT                  = 1000267011;

    protected EXTExtendedDynamicState() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetCullModeEXT ] ---

    /**
     * Set the cull mode property.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>If the bound graphics pipeline state was created with the {@link #VK_DYNAMIC_STATE_CULL_MODE_EXT DYNAMIC_STATE_CULL_MODE_EXT} dynamic state enabled then the cull mode is set dynamically by calling:</p>
     * 
     * <pre><code>
     * void vkCmdSetCullModeEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkCullModeFlags                             cullMode);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code cullMode} <b>must</b> be a valid combination of {@code VkCullModeFlagBits} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param cullMode      specifies the cull mode property to use for drawing.
     */
    public static void vkCmdSetCullModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkCullModeFlags") int cullMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCullModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), cullMode, __functionAddress);
    }

    // --- [ vkCmdSetFrontFaceEXT ] ---

    /**
     * Set the front face property.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>If the bound graphics pipeline state was created with the {@link #VK_DYNAMIC_STATE_FRONT_FACE_EXT DYNAMIC_STATE_FRONT_FACE_EXT} dynamic state enabled then the front face property is set dynamically by calling:</p>
     * 
     * <pre><code>
     * void vkCmdSetFrontFaceEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkFrontFace                                 frontFace);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code frontFace} <b>must</b> be a valid {@code VkFrontFace} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param frontFace     specifies the front face property to use for drawing.
     */
    public static void vkCmdSetFrontFaceEXT(VkCommandBuffer commandBuffer, @NativeType("VkFrontFace") int frontFace) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFrontFaceEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), frontFace, __functionAddress);
    }

    // --- [ vkCmdSetPrimitiveTopologyEXT ] ---

    /**
     * Set the primitive topology state.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The primitive topology is specified by the {@link VkPipelineInputAssemblyStateCreateInfo}{@code ::topology} property of the currently active pipeline, if the pipeline was not created with {@link #VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT} enabled.</p>
     * 
     * <p>Otherwise, the primitive topology is set by calling:</p>
     * 
     * <pre><code>
     * void vkCmdSetPrimitiveTopologyEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkPrimitiveTopology                         primitiveTopology);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code primitiveTopology} <b>must</b> be a valid {@code VkPrimitiveTopology} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     */
    public static void vkCmdSetPrimitiveTopologyEXT(VkCommandBuffer commandBuffer, @NativeType("VkPrimitiveTopology") int primitiveTopology) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPrimitiveTopologyEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), primitiveTopology, __functionAddress);
    }

    // --- [ vkCmdSetViewportWithCountEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetViewportWithCountEXT CmdSetViewportWithCountEXT}
     *
     * @param viewportCount specifies the viewport count.
     */
    public static void nvkCmdSetViewportWithCountEXT(VkCommandBuffer commandBuffer, int viewportCount, long pViewports) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportWithCountEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), viewportCount, pViewports, __functionAddress);
    }

    /**
     * Set the viewport count and viewports.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>If the bound graphics pipeline state was created with the {@link #VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT} dynamic state enabled then the viewport count and viewport transformation parameters are set dynamically by calling:</p>
     * 
     * <pre><code>
     * void vkCmdSetViewportWithCountEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    viewportCount,
     *     const VkViewport*                           pViewports);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
     * <li>{@code viewportCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-multiViewport">multiple viewports</a> feature is not enabled, {@code viewportCount} <b>must</b> be 1</li>
     * <li>{@code commandBuffer} <b>must</b> not have {@link VkCommandBufferInheritanceViewportScissorInfoNV}{@code ::viewportScissor2D} enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pViewports} <b>must</b> be a valid pointer to an array of {@code viewportCount} valid {@link VkViewport} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>{@code viewportCount} <b>must</b> be greater than 0</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkViewport}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pViewports    specifies the viewports to use for drawing.
     */
    public static void vkCmdSetViewportWithCountEXT(VkCommandBuffer commandBuffer, @NativeType("VkViewport const *") VkViewport.Buffer pViewports) {
        nvkCmdSetViewportWithCountEXT(commandBuffer, pViewports.remaining(), pViewports.address());
    }

    // --- [ vkCmdSetScissorWithCountEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetScissorWithCountEXT CmdSetScissorWithCountEXT}
     *
     * @param scissorCount specifies the scissor count.
     */
    public static void nvkCmdSetScissorWithCountEXT(VkCommandBuffer commandBuffer, int scissorCount, long pScissors) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetScissorWithCountEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), scissorCount, pScissors, __functionAddress);
    }

    /**
     * Set the scissor count and scissors.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>If the bound graphics pipeline state was created with the {@link #VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT} dynamic state enabled then the scissor count and scissor rectangular bounds are set dynamically by calling:</p>
     * 
     * <pre><code>
     * void vkCmdSetScissorWithCountEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    scissorCount,
     *     const VkRect2D*                             pScissors);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
     * <li>{@code scissorCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-multiViewport">multiple viewports</a> feature is not enabled, {@code scissorCount} <b>must</b> be 1</li>
     * <li>The {@code x} and {@code y} members of {@code offset} member of any element of {@code pScissors} <b>must</b> be greater than or equal to 0</li>
     * <li>Evaluation of <code>(offset.x + extent.width)</code> <b>must</b> not cause a signed integer addition overflow for any element of {@code pScissors}</li>
     * <li>Evaluation of <code>(offset.y + extent.height)</code> <b>must</b> not cause a signed integer addition overflow for any element of {@code pScissors}</li>
     * <li>{@code commandBuffer} <b>must</b> not have {@link VkCommandBufferInheritanceViewportScissorInfoNV}{@code ::viewportScissor2D} enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pScissors} <b>must</b> be a valid pointer to an array of {@code scissorCount} {@link VkRect2D} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>{@code scissorCount} <b>must</b> be greater than 0</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRect2D}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pScissors     specifies the scissors to use for drawing.
     */
    public static void vkCmdSetScissorWithCountEXT(VkCommandBuffer commandBuffer, @NativeType("VkRect2D const *") VkRect2D.Buffer pScissors) {
        nvkCmdSetScissorWithCountEXT(commandBuffer, pScissors.remaining(), pScissors.address());
    }

    // --- [ vkCmdBindVertexBuffers2EXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdBindVertexBuffers2EXT CmdBindVertexBuffers2EXT}
     *
     * @param bindingCount the number of vertex input bindings whose state is updated by the command.
     */
    public static void nvkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets, long pSizes, long pStrides) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPPV(commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides, __functionAddress);
    }

    /**
     * Bind vertex buffers to a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to bind vertex buffers, along with their sizes and strides, to a command buffer for use in subsequent drawing commands, call:</p>
     * 
     * <pre><code>
     * void vkCmdBindVertexBuffers2EXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstBinding,
     *     uint32_t                                    bindingCount,
     *     const VkBuffer*                             pBuffers,
     *     const VkDeviceSize*                         pOffsets,
     *     const VkDeviceSize*                         pSizes,
     *     const VkDeviceSize*                         pStrides);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The values taken from elements <code>i</code> of {@code pBuffers} and {@code pOffsets} replace the current state for the vertex input binding <code>firstBinding + i</code>, for <code>i</code> in <code>[0, bindingCount)</code>. The vertex input binding is updated to start at the offset indicated by {@code pOffsets}[i] from the start of the buffer {@code pBuffers}[i]. If {@code pSizes} is not {@code NULL} then {@code pSizes}[i] specifies the bound size of the vertex buffer starting from the corresponding elements of {@code pBuffers}[i] plus {@code pOffsets}[i]. All vertex input attributes that use each of these bindings will use these updated addresses in their address calculations for subsequent drawing commands. If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-nullDescriptor">nullDescriptor</a> feature is enabled, elements of {@code pBuffers} <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and <b>can</b> be used by the vertex shader. If a vertex input attribute is bound to a vertex input binding that is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the values taken from memory are considered to be zero, and missing G, B, or A components are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fxvertex-input-extraction">filled with <code>(0,0,1)</code></a>.</p>
     * 
     * <p>If the bound pipeline state object was created with the {@link #VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT} dynamic state enabled then {@code pStrides}[i] specifies the byte stride between consecutive elements within the corresponding buffer. In this case the {@link VkVertexInputBindingDescription}{@code ::stride} state from the pipeline state object is ignored.</p>
     * 
     * <p>If the bound pipeline state object was also created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled then {@link EXTVertexInputDynamicState#vkCmdSetVertexInputEXT CmdSetVertexInputEXT} <b>can</b> be used instead of {@code vkCmdBindVertexBuffers2EXT} to set the stride.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code firstBinding} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
     * <li>The sum of {@code firstBinding} and {@code bindingCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
     * <li>All elements of {@code pOffsets} <b>must</b> be less than the size of the corresponding element in {@code pBuffers}</li>
     * <li>If {@code pSizes} is not {@code NULL}, all elements of {@code pOffsets} plus {@code pSizes} <b>must</b> be less than or equal to the size of the corresponding element in {@code pBuffers}</li>
     * <li>All elements of {@code pBuffers} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_VERTEX_BUFFER_BIT BUFFER_USAGE_VERTEX_BUFFER_BIT} flag</li>
     * <li>Each element of {@code pBuffers} that is non-sparse <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-nullDescriptor">nullDescriptor</a> feature is not enabled, all elements of {@code pBuffers} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If an element of {@code pBuffers} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then the corresponding element of {@code pOffsets} <b>must</b> be zero</li>
     * <li>If {@code pStrides} is not {@code NULL} each element of {@code pStrides} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindingStride}</li>
     * <li>If {@code pStrides} is not {@code NULL} each element of {@code pStrides} <b>must</b> be either 0 or greater than or equal to the maximum extent of all vertex input attributes fetched from the corresponding binding, where the extent is calculated as the {@link VkVertexInputAttributeDescription}{@code ::offset} plus {@link VkVertexInputAttributeDescription}{@code ::format} size</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pBuffers} <b>must</b> be a valid pointer to an array of {@code bindingCount} valid or {@link VK10#VK_NULL_HANDLE NULL_HANDLE} {@code VkBuffer} handles</li>
     * <li>{@code pOffsets} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
     * <li>If {@code pSizes} is not {@code NULL}, {@code pSizes} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
     * <li>If {@code pStrides} is not {@code NULL}, {@code pStrides} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>If any of {@code pSizes}, or {@code pStrides} are not {@code NULL}, {@code bindingCount} <b>must</b> be greater than 0</li>
     * <li>Both of {@code commandBuffer}, and the elements of {@code pBuffers} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     * @param firstBinding  the index of the first vertex input binding whose state is updated by the command.
     * @param pBuffers      a pointer to an array of buffer handles.
     * @param pOffsets      a pointer to an array of buffer offsets.
     * @param pSizes        {@code NULL} or a pointer to an array of the size in bytes of vertex data bound from {@code pBuffers}.
     * @param pStrides      {@code NULL} or a pointer to an array of buffer strides.
     */
    public static void vkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") LongBuffer pBuffers, @NativeType("VkDeviceSize const *") LongBuffer pOffsets, @Nullable @NativeType("VkDeviceSize const *") LongBuffer pSizes, @Nullable @NativeType("VkDeviceSize const *") LongBuffer pStrides) {
        if (CHECKS) {
            check(pOffsets, pBuffers.remaining());
            checkSafe(pSizes, pBuffers.remaining());
            checkSafe(pStrides, pBuffers.remaining());
        }
        nvkCmdBindVertexBuffers2EXT(commandBuffer, firstBinding, pBuffers.remaining(), memAddress(pBuffers), memAddress(pOffsets), memAddressSafe(pSizes), memAddressSafe(pStrides));
    }

    // --- [ vkCmdSetDepthTestEnableEXT ] ---

    /**
     * Set the depth test enable for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To dynamically enable or disable the depth test, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthTestEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    depthTestEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the state for a given draw when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer   the command buffer into which the command will be recorded.
     * @param depthTestEnable specifies if the depth test is enabled.
     */
    public static void vkCmdSetDepthTestEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthTestEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthWriteEnableEXT ] ---

    /**
     * Set the depth write enable for the command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To dynamically enable or disable depth writes, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthWriteEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    depthWriteEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the state for a given draw when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer    the command buffer into which the command will be recorded.
     * @param depthWriteEnable specifies if depth writes are enabled.
     */
    public static void vkCmdSetDepthWriteEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthWriteEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthWriteEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthWriteEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthCompareOpEXT ] ---

    /**
     * Set the depth comparison operator for the command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To dynamically set the depth compare operations, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthCompareOpEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkCompareOp                                 depthCompareOp);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the state for a given draw when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code depthCompareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer  the command buffer into which the command will be recorded.
     * @param depthCompareOp specifies the depth comparison operator.
     */
    public static void vkCmdSetDepthCompareOpEXT(VkCommandBuffer commandBuffer, @NativeType("VkCompareOp") int depthCompareOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthCompareOpEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthCompareOp, __functionAddress);
    }

    // --- [ vkCmdSetDepthBoundsTestEnableEXT ] ---

    /**
     * Set the depth bounds test enable for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To dynamically enable or disable the depth bounds test:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthBoundsTestEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    depthBoundsTestEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the state for a given draw when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param depthBoundsTestEnable specifies if the depth bounds test is enabled.
     */
    public static void vkCmdSetDepthBoundsTestEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthBoundsTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBoundsTestEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthBoundsTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetStencilTestEnableEXT ] ---

    /**
     * Set the stencil test enable for the command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To dynamically enable or disable the stencil test, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetStencilTestEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    stencilTestEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the state for a given draw when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer     the command buffer into which the command will be recorded.
     * @param stencilTestEnable specifies if the stencil test is enabled.
     */
    public static void vkCmdSetStencilTestEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean stencilTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilTestEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), stencilTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetStencilOpEXT ] ---

    /**
     * Set the stencil operation for the command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To dynamically set the stencil operations, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetStencilOpEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkStencilFaceFlags                          faceMask,
     *     VkStencilOp                                 failOp,
     *     VkStencilOp                                 passOp,
     *     VkStencilOp                                 depthFailOp,
     *     VkCompareOp                                 compareOp);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the state for a given draw when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_STENCIL_OP_EXT DYNAMIC_STATE_STENCIL_OP_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
     * <li>{@code faceMask} <b>must</b> not be 0</li>
     * <li>{@code failOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
     * <li>{@code passOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
     * <li>{@code depthFailOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
     * <li>{@code compareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param faceMask      a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the stencil operation.
     * @param failOp        a {@code VkStencilOp} value specifying the action performed on samples that fail the stencil test.
     * @param passOp        a {@code VkStencilOp} value specifying the action performed on samples that pass both the depth and stencil tests.
     * @param depthFailOp   a {@code VkStencilOp} value specifying the action performed on samples that pass the stencil test and fail the depth test.
     * @param compareOp     a {@code VkCompareOp} value specifying the comparison operator used in the stencil test.
     */
    public static void vkCmdSetStencilOpEXT(VkCommandBuffer commandBuffer, @NativeType("VkStencilFaceFlags") int faceMask, @NativeType("VkStencilOp") int failOp, @NativeType("VkStencilOp") int passOp, @NativeType("VkStencilOp") int depthFailOp, @NativeType("VkCompareOp") int compareOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilOpEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), faceMask, failOp, passOp, depthFailOp, compareOp, __functionAddress);
    }

    /** Array version of: {@link #vkCmdBindVertexBuffers2EXT CmdBindVertexBuffers2EXT} */
    public static void vkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") long[] pBuffers, @NativeType("VkDeviceSize const *") long[] pOffsets, @Nullable @NativeType("VkDeviceSize const *") long[] pSizes, @Nullable @NativeType("VkDeviceSize const *") long[] pStrides) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers2EXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pOffsets, pBuffers.length);
            checkSafe(pSizes, pBuffers.length);
            checkSafe(pStrides, pBuffers.length);
        }
        callPPPPPV(commandBuffer.address(), firstBinding, pBuffers.length, pBuffers, pOffsets, pSizes, pStrides, __functionAddress);
    }

}