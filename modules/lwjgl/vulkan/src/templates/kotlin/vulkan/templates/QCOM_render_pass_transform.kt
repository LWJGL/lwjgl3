/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_render_pass_transform = "QCOMRenderPassTransform".nativeClassVK("QCOM_render_pass_transform", type = "device", postfix = "QCOM") {
    documentation =
        """
        This extension provides a mechanism for applications to enable driver support for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vertexpostproc-renderpass-transform">render pass transform</a>.

        Mobile devices can be rotated and mobile applications need to render properly when a device is held in a landscape or portrait orientation. When the current orientation differs from the device’s native orientation, a rotation is required so that the “{@code up}” direction of the rendered scene matches the current orientation.

        If the Display Processing Unit (DPU) doesnt natively support rotation, the Vulkan presentation engine can handle this rotation in a separate composition pass. Alternatively, the application can render frames “{@code pre-rotated}” to avoid this extra pass. The latter is preferred to reduce power consumption and achieve the best performance because it avoids tasking the GPU with extra work to perform the copy/rotate operation.

        Unlike OpenGL ES, the burden of pre-rotation in Vulkan falls on the application. To implement pre-rotation, applications render into swapchain images matching the device native aspect ratio of the display and “{@code pre-rotate}” the rendering content to match the device’s current orientation. The burden is more than adjusting the Model View Projection (MVP) matrix in the vertex shader to account for rotation and aspect ratio. The coordinate systems of scissors, viewports, derivatives and several shader built-ins may need to be adapted to produce the correct result.

        It is difficult for some game engines to manage this burden; many chose to simply accept the performance/power overhead of performing rotation in the presentation engine.

        This extension allows applications to achieve the performance benefits of pre-rotated rendering by moving much of the above-mentioned burden to the graphics driver. The following is unchanged with this extension:

        <ul>
            <li>Applications create a swapchain matching the native orientation of the display. Applications must also set the ##VkSwapchainCreateInfoKHR{@code ::preTransform} equal to the {@code currentTransform} as returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR().</li>
        </ul>

        The following is changed with this extension:

        <ul>
            <li>At #CmdBeginRenderPass(), the application provides extension struct ##VkRenderPassTransformBeginInfoQCOM specifying the render pass transform parameters.</li>
            <li>At #BeginCommandBuffer() for secondary command buffers, the application provides extension struct ##VkCommandBufferInheritanceRenderPassTransformInfoQCOM specifying the render pass transform parameters.</li>
            <li>The {@code renderArea}, viewports, scissors, and {@code fragmentSize} are all provided in the current (non-rotated) coordinate system. The implementation will transform those into the native (rotated) coordinate system.</li>
            <li>The implementation is responsible for transforming shader built-ins ({@code FragCoord}, {@code PointCoord}, {@code SamplePosition}, {@code PrimitiveShadingRateKHR}, interpolateAt(), dFdx, dFdy, fWidth) into the rotated coordinate system.</li>
            <li>The implementation is responsible for transforming {@code position} to the rotated coordinate system.</li>
        </ul>

        <h5>VK_QCOM_render_pass_transform</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_QCOM_render_pass_transform}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>283</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRSwapchain VK_KHR_swapchain}</li>
                <li>Requires {@link KHRSurface VK_KHR_surface}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Leger <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_QCOM_render_pass_transform]%20@jackohound%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_QCOM_render_pass_transform%20extension%3E%3E">jackohound</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-03-09</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires {@link KHRSwapchain VK_KHR_swapchain}</li>
                <li>This extension interacts with {@link EXTFragmentDensityMap VK_EXT_fragment_density_map}</li>
                <li>This extension interacts with {@link KHRFragmentShadingRate VK_KHR_fragment_shading_rate}</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Leger, Qualcomm Technologies, Inc.</li>
                <li>Brandon Light, Qualcomm Technologies, Inc.</li>
                <li>Matthew Netsch, Qualcomm Technologies, Inc.</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "QCOM_RENDER_PASS_TRANSFORM_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "QCOM_RENDER_PASS_TRANSFORM_EXTENSION_NAME".."VK_QCOM_render_pass_transform"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM".."1000282000",
        "STRUCTURE_TYPE_RENDER_PASS_TRANSFORM_BEGIN_INFO_QCOM".."1000282001"
    )

    EnumConstant(
        "Extends {@code VkRenderPassCreateFlagBits}.",

        "RENDER_PASS_CREATE_TRANSFORM_BIT_QCOM".enum(0x00000002)
    )
}