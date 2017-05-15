/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val NV_clip_space_w_scaling = "NVClipSpaceWScaling".nativeClassVK("NV_clip_space_w_scaling", type = "device", postfix = NV) {
    documentation =
        """
        Virtual Reality (VR) applications often involve a post-processing step to apply a "barrel" distortion to the rendered image to correct the "pincushion" distortion introduced by the optics in a VR device. The barrel distorted image has lower resolution along the edges compared to the center. Since the original image is rendered at high resolution, which is uniform across the complete image, a lot of pixels towards the edges do not make it to the final post-processed image.

        This extension provides a mechanism to render VR scenes at a non-uniform resolution, in particular a resolution that falls linearly from the center towards the edges. This is achieved by scaling the "w" coordinate of the vertices in the clip space before perspective divide. The clip space "w" coordinate of the vertices <b>can</b> be offset as of a function of "x" and "y" coordinates as follows:

        w' = w + Ax + By

        In the intended use case for viewport position scaling, an application should use a set of 4 viewports, one for each of the 4 quadrants of a Cartesian coordinate system. Each viewport is set to the dimension of the image, but is scissored to the quadrant it represents. The application should specify A and B coefficients of the w-scaling equation above, that have the same value, but different signs, for each of the viewports. The signs of A and B should match the signs of X and Y for the quadrant that they represent such that the value of "w'" will always be greater than or equal to the original "w" value for the entire image. Since the offset to "w", (Ax + By), is always positive and increases with the absolute values of "x" and "y", the effective resolution will fall off linearly from the center of the image to its edges.

        <h5>Examples</h5>
        <code><pre>
￿VkViewport viewports[4];
￿VkRect2D scissors[4];
￿VkViewportWScalingNV scalings[4];
￿
￿for (int i = 0; i < 4; i++) {
￿    int x = (i & 2) ? 0 : currentWindowWidth / 2;
￿    int y = (i & 1) ? 0 : currentWindowHeight / 2;
￿
￿    viewports[i].x = 0;
￿    viewports[i].y = 0;
￿    viewports[i].width = currentWindowWidth;
￿    viewports[i].height = currentWindowHeight;
￿    viewports[i].minDepth = 0.0f;
￿    viewports[i].maxDepth = 1.0f;
￿
￿    scissors[i].offset.x = x;
￿    scissors[i].offset.y = y;
￿    scissors[i].extent.width = currentWindowWidth/2;
￿    scissors[i].extent.height = currentWindowHeight/2;
￿
￿    const float factor = 0.15;
￿    scalings[i].xcoeff = ((i & 2) ? -1.0 : 1.0) * factor;
￿    scalings[i].ycoeff = ((i & 1) ? -1.0 : 1.0) * factor;
￿}
￿
￿VkPipelineViewportWScalingStateCreateInfoNV vpWScalingStateInfo = { VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV };
￿
￿vpWScalingStateInfo.viewportWScalingEnable = VK_TRUE;
￿vpWScalingStateInfo.viewportCount = 4;
￿vpWScalingStateInfo.pViewportWScalings = &scalings[0];
￿
￿VkPipelineViewportStateCreateInfo vpStateInfo = { VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO };
￿vpStateInfo.viewportCount = 4;
￿vpStateInfo.pViewports = &viewports[0];
￿vpStateInfo.scissorCount = 4;
￿vpStateInfo.pScissors = &scissors[0];
￿vpStateInfo.pNext = &vpWScalingStateInfo;</pre></code>

        Example shader to read from a w-scaled texture:

        <code><pre>
￿// Vertex Shader
￿// Draw a triangle that covers the whole screen
￿const vec4 positions[3] = vec4[3](vec4(-1, -1, 0, 1),
￿                                  vec4( 3, -1, 0, 1),
￿                                  vec4(-1,  3, 0, 1));
￿out vec2 uv;
￿void main()
￿{
￿    vec4 pos = positions[ gl_VertexID ];
￿    gl_Position = pos;
￿    uv = pos.xy;
￿}
￿
￿// Fragment Shader
￿uniform sampler2D tex;
￿uniform float xcoeff;
￿uniform float ycoeff;
￿out vec4 Color;
￿in vec2 uv;
￿
￿void main()
￿{
￿    // Handle uv as if upper right quadrant
￿    vec2 uvabs = abs(uv);
￿
￿    // unscale: transform w-scaled image into an unscaled image
￿    //   scale: transform unscaled image int a w-scaled image
￿    float unscale = 1.0 / (1 + xcoeff * uvabs.x + xcoeff * uvabs.y);
￿    //float scale = 1.0 / (1 - xcoeff * uvabs.x - xcoeff * uvabs.y);
￿
￿    vec2 P = vec2(unscale * uvabs.x, unscale * uvabs.y);
￿
￿    // Go back to the right quadrant
￿    P *= sign(uv);
￿
￿    Color = texture(tex, P * 0.5 + 0.5);
￿}</pre></code>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_NV_clip_space_w_scaling</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>88</dd>

            <dt><b>Status</b></dt>
            <dd>Complete.</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-02-15</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0. of the Vulkan API.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Eric Werness, NVIDIA</li>
                <li>Kedarnath Thangudu, NVIDIA</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Eric Werness (ewerness 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_CLIP_SPACE_W_SCALING_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME".."VK_NV_clip_space_w_scaling"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV".."1000087000"
    )

    EnumConstant(
        "Extends {@code VkDynamicState}.",

        "DYNAMIC_STATE_VIEWPORT_W_SCALING_NV".."1000087000"
    )

    void(
        "CmdSetViewportWScalingNV",
        """
        Set the viewport W scaling on a command buffer.

        <h5>C Specification</h5>
        If the bound pipeline state object was not created with the #DYNAMIC_STATE_VIEWPORT_W_SCALING_NV dynamic state enabled, viewport W scaling parameters are specified using the {@code pViewportWScalings} member of ##VkPipelineViewportWScalingStateCreateInfoNV in the pipeline state object. If the pipeline state object was created with the #DYNAMIC_STATE_VIEWPORT dynamic state enabled, the viewport transformation parameters are dynamically set and changed with the command:

        <code><pre>
￿void vkCmdSetViewportWScalingNV(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstViewport,
￿    uint32_t                                    viewportCount,
￿    const VkViewportWScalingNV*                 pViewportWScalings);</pre></code>

        <h5>Description</h5>
        The viewport parameters taken from element <code>i</code> of {@code pViewportScalings} replace the current state for the viewport index <code>firstViewport {plus} i</code>, for <code>i</code> in <code>[0, viewportCount)</code>.

        <h5>Valid Usage</h5>
        <ul>
            <li>The currently bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_VIEWPORT_W_SCALING_NV dynamic state enabled</li>
            <li>{@code firstViewport} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxViewports}</li>
            <li>The sum of {@code firstViewport} and {@code viewportCount} <b>must</b> be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive</li>
            <li>{@code pViewportScalings} <b>must</b> be a pointer to an array of {@code viewportCount} valid ##VkViewportWScalingNV structures</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>{@code viewportCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkViewportWScalingNV
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t.IN("firstViewport", "the index of the first viewport whose parameters are updated by the command."),
        AutoSize("pViewportWScalings")..uint32_t.IN("viewportCount", "the number of viewports whose parameters are updated by the command."),
        const..VkViewportWScalingNV.p.IN("pViewportWScalings", "")
    )
}