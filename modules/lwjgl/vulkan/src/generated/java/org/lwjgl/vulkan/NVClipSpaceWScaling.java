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
 * Virtual Reality (VR) applications often involve a post-processing step to apply a “{@code barrel}” distortion to the rendered image to correct the “{@code pincushion}” distortion introduced by the optics in a VR device. The barrel distorted image has lower resolution along the edges compared to the center. Since the original image is rendered at high resolution, which is uniform across the complete image, a lot of pixels towards the edges do not make it to the final post-processed image.
 * 
 * <p>This extension provides a mechanism to render VR scenes at a non-uniform resolution, in particular a resolution that falls linearly from the center towards the edges. This is achieved by scaling the <code>w</code> coordinate of the vertices in the clip space before perspective divide. The clip space <code>w</code> coordinate of the vertices <b>can</b> be offset as of a function of <code>x</code> and <code>y</code> coordinates as follows:</p>
 * 
 * <p><code>w' = w + Ax + By</code></p>
 * 
 * <p>In the intended use case for viewport position scaling, an application should use a set of four viewports, one for each of the four quadrants of a Cartesian coordinate system. Each viewport is set to the dimension of the image, but is scissored to the quadrant it represents. The application should specify <code>A</code> and <code>B</code> coefficients of the <code>w</code>-scaling equation above, that have the same value, but different signs, for each of the viewports. The signs of <code>A</code> and <code>B</code> should match the signs of <code>x</code> and <code>y</code> for the quadrant that they represent such that the value of <code>w'</code> will always be greater than or equal to the original <code>w</code> value for the entire image. Since the offset to <code>w</code>, (<code>Ax + By</code>), is always positive, and increases with the absolute values of <code>x</code> and <code>y</code>, the effective resolution will fall off linearly from the center of the image to its edges.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <pre><code>
 * VkViewport viewports[4];
 * VkRect2D scissors[4];
 * VkViewportWScalingNV scalings[4];
 * 
 * for (int i = 0; i &lt; 4; i++) {
 *     int x = (i &amp; 2) ? 0 : currentWindowWidth / 2;
 *     int y = (i &amp; 1) ? 0 : currentWindowHeight / 2;
 * 
 *     viewports[i].x = 0;
 *     viewports[i].y = 0;
 *     viewports[i].width = currentWindowWidth;
 *     viewports[i].height = currentWindowHeight;
 *     viewports[i].minDepth = 0.0f;
 *     viewports[i].maxDepth = 1.0f;
 * 
 *     scissors[i].offset.x = x;
 *     scissors[i].offset.y = y;
 *     scissors[i].extent.width = currentWindowWidth/2;
 *     scissors[i].extent.height = currentWindowHeight/2;
 * 
 *     const float factor = 0.15;
 *     scalings[i].xcoeff = ((i &amp; 2) ? -1.0 : 1.0) * factor;
 *     scalings[i].ycoeff = ((i &amp; 1) ? -1.0 : 1.0) * factor;
 * }
 * 
 * VkPipelineViewportWScalingStateCreateInfoNV vpWScalingStateInfo = { VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV };
 * 
 * vpWScalingStateInfo.viewportWScalingEnable = VK_TRUE;
 * vpWScalingStateInfo.viewportCount = 4;
 * vpWScalingStateInfo.pViewportWScalings = &amp;scalings[0];
 * 
 * VkPipelineViewportStateCreateInfo vpStateInfo = { VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO };
 * vpStateInfo.viewportCount = 4;
 * vpStateInfo.pViewports = &amp;viewports[0];
 * vpStateInfo.scissorCount = 4;
 * vpStateInfo.pScissors = &amp;scissors[0];
 * vpStateInfo.pNext = &amp;vpWScalingStateInfo;</code></pre>
 * 
 * <p>Example shader to read from a w-scaled texture:</p>
 * 
 * <pre><code>
 * // Vertex Shader
 * // Draw a triangle that covers the whole screen
 * const vec4 positions[3] = vec4[3](vec4(-1, -1, 0, 1),
 *                                   vec4( 3, -1, 0, 1),
 *                                   vec4(-1,  3, 0, 1));
 * out vec2 uv;
 * void main()
 * {
 *     vec4 pos = positions[ gl_VertexID ];
 *     gl_Position = pos;
 *     uv = pos.xy;
 * }
 * 
 * // Fragment Shader
 * uniform sampler2D tex;
 * uniform float xcoeff;
 * uniform float ycoeff;
 * out vec4 Color;
 * in vec2 uv;
 * 
 * void main()
 * {
 *     // Handle uv as if upper right quadrant
 *     vec2 uvabs = abs(uv);
 * 
 *     // unscale: transform w-scaled image into an unscaled image
 *     //   scale: transform unscaled image int a w-scaled image
 *     float unscale = 1.0 / (1 + xcoeff * uvabs.x + xcoeff * uvabs.y);
 *     //float scale = 1.0 / (1 - xcoeff * uvabs.x - xcoeff * uvabs.y);
 * 
 *     vec2 P = vec2(unscale * uvabs.x, unscale * uvabs.y);
 * 
 *     // Go back to the right quadrant
 *     P *= sign(uv);
 * 
 *     Color = texture(tex, P * 0.5 + 0.5);
 * }</code></pre>
 * 
 * <h5>VK_NV_clip_space_w_scaling</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_clip_space_w_scaling}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>88</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Eric Werness <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_clip_space_w_scaling]%20@ewerness-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_clip_space_w_scaling%20extension%3E%3E">ewerness-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-02-15</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Eric Werness, NVIDIA</li>
 * <li>Kedarnath Thangudu, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVClipSpaceWScaling {

    /** The extension specification version. */
    public static final int VK_NV_CLIP_SPACE_W_SCALING_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME = "VK_NV_clip_space_w_scaling";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV = 1000087000;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV = 1000087000;

    protected NVClipSpaceWScaling() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetViewportWScalingNV ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetViewportWScalingNV CmdSetViewportWScalingNV}
     *
     * @param viewportCount the number of viewports whose parameters are updated by the command.
     */
    public static void nvkCmdSetViewportWScalingNV(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, long pViewportWScalings) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportWScalingNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstViewport, viewportCount, pViewportWScalings, __functionAddress);
    }

    /**
     * Set the viewport W scaling dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the viewport <b>W</b> scaling parameters, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetViewportWScalingNV(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstViewport,
     *     uint32_t                                    viewportCount,
     *     const VkViewportWScalingNV*                 pViewportWScalings);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The viewport parameters taken from element <code>i</code> of {@code pViewportWScalings} replace the current state for the viewport index <code>firstViewport + i</code>, for <code>i</code> in <code>[0, viewportCount)</code>.</p>
     * 
     * <p>This command sets the viewport <b>W</b> scaling for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineViewportWScalingStateCreateInfoNV}{@code ::pViewportWScalings} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The sum of {@code firstViewport} and {@code viewportCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pViewportWScalings} <b>must</b> be a valid pointer to an array of {@code viewportCount} {@link VkViewportWScalingNV} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkViewportWScalingNV}</p>
     *
     * @param commandBuffer      the command buffer into which the command will be recorded.
     * @param firstViewport      the index of the first viewport whose parameters are updated by the command.
     * @param pViewportWScalings a pointer to an array of {@link VkViewportWScalingNV} structures specifying viewport parameters.
     */
    public static void vkCmdSetViewportWScalingNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstViewport, @NativeType("VkViewportWScalingNV const *") VkViewportWScalingNV.Buffer pViewportWScalings) {
        nvkCmdSetViewportWScalingNV(commandBuffer, firstViewport, pViewportWScalings.remaining(), pViewportWScalings.address());
    }

}