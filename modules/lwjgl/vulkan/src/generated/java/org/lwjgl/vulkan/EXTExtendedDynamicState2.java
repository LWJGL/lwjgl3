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
 * This extension adds some more dynamic state to support applications that need to reduce the number of pipeline state objects they compile and bind.
 * 
 * <h5>Promotion to Vulkan 1.3</h5>
 * 
 * <p>This extension has been partially promoted. The dynamic state enumerants {@link #VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE_EXT DYNAMIC_STATE_DEPTH_BIAS_ENABLE_EXT}, {@link #VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT}, and {@link #VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE_EXT DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE_EXT}; and the corresponding entry points in this extension are included in core Vulkan 1.3, with the EXT suffix omitted. The enumerants and entry points for dynamic logic operation and patch control points are not promoted, nor is the feature structure. Extension interfaces that were promoted remain available as aliases of the core functionality.</p>
 * 
 * <h5>VK_EXT_extended_dynamic_state2</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_extended_dynamic_state2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>378</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.3-promotions">Vulkan 1.3</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Vikram Kushwaha <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_extended_dynamic_state2]%20@vkushwaha-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_extended_dynamic_state2%20extension%3E%3E">vkushwaha-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-04-12</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.3 Core</li>
 * </ul></dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Vikram Kushwaha, NVIDIA</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class EXTExtendedDynamicState2 {

    /** The extension specification version. */
    public static final int VK_EXT_EXTENDED_DYNAMIC_STATE_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_EXTENDED_DYNAMIC_STATE_2_EXTENSION_NAME = "VK_EXT_extended_dynamic_state2";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT = 1000377000;

    /**
     * Extends {@code VkDynamicState}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE_EXT DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE_EXT DYNAMIC_STATE_DEPTH_BIAS_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_LOGIC_OP_EXT DYNAMIC_STATE_LOGIC_OP_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT}</li>
     * </ul>
     */
    public static final int
        VK_DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT      = 1000377000,
        VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE_EXT = 1000377001,
        VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE_EXT         = 1000377002,
        VK_DYNAMIC_STATE_LOGIC_OP_EXT                  = 1000377003,
        VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT  = 1000377004;

    protected EXTExtendedDynamicState2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetPatchControlPointsEXT ] ---

    /**
     * Specify the number of control points per patch dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the number of control points per patch, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetPatchControlPointsEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    patchControlPoints);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the number of control points per patch for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineTessellationStateCreateInfo}{@code ::patchControlPoints} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState2PatchControlPoints">extendedDynamicState2PatchControlPoints</a> feature <b>must</b> be enabled</li>
     * <li>{@code patchControlPoints} <b>must</b> be greater than zero and less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxTessellationPatchSize}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer      the command buffer into which the command will be recorded.
     * @param patchControlPoints specifies the number of control points per patch.
     */
    public static void vkCmdSetPatchControlPointsEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int patchControlPoints) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPatchControlPointsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), patchControlPoints, __functionAddress);
    }

    // --- [ vkCmdSetRasterizerDiscardEnableEXT ] ---

    /**
     * See {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable}.
     *
     * @param commandBuffer           the command buffer into which the command will be recorded.
     * @param rasterizerDiscardEnable controls whether primitives are discarded immediately before the rasterization stage.
     */
    public static void vkCmdSetRasterizerDiscardEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean rasterizerDiscardEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRasterizerDiscardEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), rasterizerDiscardEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthBiasEnableEXT ] ---

    /**
     * See {@link VK13#vkCmdSetDepthBiasEnable CmdSetDepthBiasEnable}.
     *
     * @param commandBuffer   the command buffer into which the command will be recorded.
     * @param depthBiasEnable controls whether to bias fragment depth values.
     */
    public static void vkCmdSetDepthBiasEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthBiasEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBiasEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthBiasEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetLogicOpEXT ] ---

    /**
     * Select which logical operation to apply for blend state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the logical operation to apply for blend state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetLogicOpEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkLogicOp                                   logicOp);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the logical operation for blend state for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_LOGIC_OP_EXT DYNAMIC_STATE_LOGIC_OP_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineColorBlendStateCreateInfo}{@code ::logicOp} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState2LogicOp">extendedDynamicState2LogicOp</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param logicOp       specifies the logical operation to apply for blend state.
     */
    public static void vkCmdSetLogicOpEXT(VkCommandBuffer commandBuffer, @NativeType("VkLogicOp") int logicOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLogicOpEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), logicOp, __functionAddress);
    }

    // --- [ vkCmdSetPrimitiveRestartEnableEXT ] ---

    /**
     * See {@link VK13#vkCmdSetPrimitiveRestartEnable CmdSetPrimitiveRestartEnable}.
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param primitiveRestartEnable controls whether a special vertex index value is treated as restarting the assembly of primitives. It behaves in the same way as {@link VkPipelineInputAssemblyStateCreateInfo}{@code ::primitiveRestartEnable}
     */
    public static void vkCmdSetPrimitiveRestartEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean primitiveRestartEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPrimitiveRestartEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), primitiveRestartEnable ? 1 : 0, __functionAddress);
    }

}