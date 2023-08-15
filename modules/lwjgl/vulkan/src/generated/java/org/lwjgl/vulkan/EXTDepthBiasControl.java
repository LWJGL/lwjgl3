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
 * This extension adds a new structure, {@link VkDepthBiasRepresentationInfoEXT}, that can be added to a {@code pNext} chain of {@link VkPipelineRasterizationStateCreateInfo} and allows setting the scaling and representation of depth bias for a pipeline.
 * 
 * <p>This state can also be set dynamically by using the new structure mentioned above in combination with the new {@code vkCmdSetDepthBias2EXT} command.</p>
 * 
 * <h5>VK_EXT_depth_bias_control</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_depth_bias_control}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>284</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>Special Use</b></dt>
 * <dd><ul>
 * <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">D3D support</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Joshua Ashton <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_depth_bias_control]%20@Joshua-Ashton%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_depth_bias_control%20extension*">Joshua-Ashton</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_depth_bias_control.adoc">VK_EXT_depth_bias_control</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-02-15</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Joshua Ashton, VALVE</li>
 * <li>Hans-Kristian Arntzen, VALVE</li>
 * <li>Mike Blumenkrantz, VALVE</li>
 * <li>Georg Lehmann, VALVE</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Lionel Landwerlin, INTEL</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Ricardo Garcia, IGALIA</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Shahbaz Youssefi, GOOGLE</li>
 * <li>Tom Olson, ARM</li>
 * </ul></dd>
 * </dl>
 */
public class EXTDepthBiasControl {

    /** The extension specification version. */
    public static final int VK_EXT_DEPTH_BIAS_CONTROL_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_DEPTH_BIAS_CONTROL_EXTENSION_NAME = "VK_EXT_depth_bias_control";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT = 1000283000,
        VK_STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT                             = 1000283001,
        VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT              = 1000283002;

    /**
     * VkDepthBiasRepresentationEXT - Specify the depth bias representation
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORMAT_EXT DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORMAT_EXT} specifies that the depth bias representation is a factor of the format’s <code>r</code> as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-depthbias-computation">primsrast-depthbias-computation</a>.</li>
     * <li>{@link #VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_EXT DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_EXT} specifies that the depth bias representation is a factor of a constant <code>r</code> defined by the bit-size or mantissa of the format as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-depthbias-computation">primsrast-depthbias-computation</a>.</li>
     * <li>{@link #VK_DEPTH_BIAS_REPRESENTATION_FLOAT_EXT DEPTH_BIAS_REPRESENTATION_FLOAT_EXT} specifies that the depth bias representation is a factor of constant <code>r</code> equal to 1.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDepthBiasRepresentationInfoEXT}</p>
     */
    public static final int
        VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORMAT_EXT      = 0,
        VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_EXT = 1,
        VK_DEPTH_BIAS_REPRESENTATION_FLOAT_EXT                                 = 2;

    protected EXTDepthBiasControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetDepthBias2EXT ] ---

    /** Unsafe version of: {@link #vkCmdSetDepthBias2EXT CmdSetDepthBias2EXT} */
    public static void nvkCmdSetDepthBias2EXT(VkCommandBuffer commandBuffer, long pDepthBiasInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBias2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pDepthBiasInfo, __functionAddress);
    }

    /**
     * Set depth bias factors and clamp dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the depth bias parameters, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthBias2EXT(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkDepthBiasInfoEXT*                   pDepthBiasInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally identical to {@link VK10#vkCmdSetDepthBias CmdSetDepthBias}, but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pDepthBiasInfo} <b>must</b> be a valid pointer to a valid {@link VkDepthBiasInfoEXT} structure</li>
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
     * <p>{@link VkDepthBiasInfoEXT}</p>
     *
     * @param commandBuffer  the command buffer into which the command will be recorded.
     * @param pDepthBiasInfo a pointer to a {@link VkDepthBiasInfoEXT} structure specifying depth bias parameters.
     */
    public static void vkCmdSetDepthBias2EXT(VkCommandBuffer commandBuffer, @NativeType("VkDepthBiasInfoEXT const *") VkDepthBiasInfoEXT pDepthBiasInfo) {
        nvkCmdSetDepthBias2EXT(commandBuffer, pDepthBiasInfo.address());
    }

}