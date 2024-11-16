/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension allows the application to control the viewport depth clamp range separately from the viewport {@code minDepth} and {@code maxDepth}. This gives the ability for the application to restrict depth values to an application-defined range rather than the viewport depth range or the range defined in the {@link EXTDepthClampZeroOne VK_EXT_depth_clamp_zero_one} extension.
 * 
 * <p>It can be used to set a smaller or larger clamping range than the viewport depth range without affecting the depth mapping of the viewport transform. Another possible use of this extension is to restrict depth values beyond the viewport depth range to a clamping range other than the [0, 1] range defined in the {@link EXTDepthClampZeroOne VK_EXT_depth_clamp_zero_one} extension.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_depth_clamp_control}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>583</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1">Version 1.1</a></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jules Blok <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_depth_clamp_control]%20@jules%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_depth_clamp_control%20extension*">jules</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_depth_clamp_control.adoc">VK_EXT_depth_clamp_control</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2024-07-15</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jules Blok, Independent</li>
 * </ul></dd>
 * </dl>
 */
public class EXTDepthClampControl {

    /** The extension specification version. */
    public static final int VK_EXT_DEPTH_CLAMP_CONTROL_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_DEPTH_CLAMP_CONTROL_EXTENSION_NAME = "VK_EXT_depth_clamp_control";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT      = 1000582000,
        VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT = 1000582001;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_DEPTH_CLAMP_RANGE_EXT = 1000582000;

    protected EXTDepthClampControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetDepthClampRangeEXT ] ---

    /** Unsafe version of: {@link #vkCmdSetDepthClampRangeEXT CmdSetDepthClampRangeEXT} */
    public static void nvkCmdSetDepthClampRangeEXT(VkCommandBuffer commandBuffer, int depthClampMode, long pDepthClampRange) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClampRangeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), depthClampMode, pDepthClampRange, __functionAddress);
    }

    /**
     * Set the viewport depth clamp range dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the viewport depth clamp range parameters, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthClampRangeEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkDepthClampModeEXT                         depthClampMode,
     *     const VkDepthClampRangeEXT*                 pDepthClampRange);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the viewport depth clamp range for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DEPTH_CLAMP_RANGE_EXT DYNAMIC_STATE_DEPTH_CLAMP_RANGE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineViewportDepthClampControlCreateInfoEXT}{@code ::depthClampMode} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code depthClampMode} is set to {@link EXTShaderObject#VK_DEPTH_CLAMP_MODE_USER_DEFINED_RANGE_EXT DEPTH_CLAMP_MODE_USER_DEFINED_RANGE_EXT}, then {@code pDepthClampRange} must be a valid pointer to a valid {@link VkDepthClampRangeEXT} structure.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code depthClampMode} <b>must</b> be a valid {@code VkDepthClampModeEXT} value</li>
     * <li>If {@code pDepthClampRange} is not {@code NULL}, {@code pDepthClampRange} <b>must</b> be a valid pointer to a valid {@link VkDepthClampRangeEXT} structure</li>
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
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDepthClampRangeEXT}</p>
     *
     * @param commandBuffer    the command buffer into which the command will be recorded.
     * @param depthClampMode   determines how the clamp range is determined for each viewport.
     * @param pDepthClampRange sets the depth clamp range for all viewports if {@code depthClampMode} is set to {@link EXTShaderObject#VK_DEPTH_CLAMP_MODE_USER_DEFINED_RANGE_EXT DEPTH_CLAMP_MODE_USER_DEFINED_RANGE_EXT}.
     */
    public static void vkCmdSetDepthClampRangeEXT(VkCommandBuffer commandBuffer, @NativeType("VkDepthClampModeEXT") int depthClampMode, @NativeType("VkDepthClampRangeEXT const *") @Nullable VkDepthClampRangeEXT pDepthClampRange) {
        nvkCmdSetDepthClampRangeEXT(commandBuffer, depthClampMode, memAddressSafe(pDepthClampRange));
    }

}