/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_dynamic_rendering = "KHRDynamicRendering".nativeClassVK("KHR_dynamic_rendering", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension allows applications to create single-pass render pass instances without needing to create render pass objects or framebuffers. Dynamic render passes can also span across multiple primary command buffers, rather than relying on secondary command buffers.

        This extension also incorporates #ATTACHMENT_STORE_OP_NONE_KHR from {@link QCOMRenderPassStoreOps VK_QCOM_render_pass_store_ops}, enabling applications to avoid unnecessary synchronization when an attachment is not written during a render pass.

        <h5>Promotion to Vulkan 1.3</h5>
        Vulkan APIs in this extension are included in core Vulkan 1.3, with the KHR suffix omitted. External interactions defined by this extension, such as SPIR-V token names, retain their original names. The original Vulkan API names are still available as aliases of the core functionality.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_dynamic_rendering}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>45</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.1">Version 1.1</a> and {@link KHRDepthStencilResolve VK_KHR_depth_stencil_resolve} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.2">Version 1.2</a></dd>

            <dt><b>Deprecation State</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.3-promotions">Vulkan 1.3</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_dynamic_rendering]%20@tobski%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_dynamic_rendering%20extension*">tobski</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_dynamic_rendering.adoc">VK_KHR_dynamic_rendering</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-10-06</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector, AMD</li>
                <li>Arseny Kapoulkine, Roblox</li>
                <li>François Duranleau, Gameloft</li>
                <li>Stuart Smith, AMD</li>
                <li>Hai Nguyen, Google</li>
                <li>Jean-François Roy, Google</li>
                <li>Jeff Leger, Qualcomm</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Piers Daniell, Nvidia</li>
                <li>James Fitzpatrick, Imagination</li>
                <li>Piotr Byszewski, Mobica</li>
                <li>Jesse Hall, Google</li>
                <li>Mike Blumenkrantz, Valve</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_DYNAMIC_RENDERING_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_DYNAMIC_RENDERING_EXTENSION_NAME".."VK_KHR_dynamic_rendering"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_RENDERING_INFO_KHR".."1000044000",
        "STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO_KHR".."1000044001",
        "STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO_KHR".."1000044002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR".."1000044003",
        "STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR".."1000044004"
    )

    EnumConstant(
        "Extends {@code VkAttachmentStoreOp}.",

        "ATTACHMENT_STORE_OP_NONE_KHR".."1000301000"
    )

    EnumConstant(
        "Extends {@code VkRenderingFlagBits}.",

        "RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR".enum(0x00000001),
        "RENDERING_SUSPENDING_BIT_KHR".enum(0x00000002),
        "RENDERING_RESUMING_BIT_KHR".enum(0x00000004)
    )

    void(
        "CmdBeginRenderingKHR",
        "See #CmdBeginRendering().",

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command."),
        VkRenderingInfo.const.p("pRenderingInfo", "a pointer to a ##VkRenderingInfo structure specifying details of the render pass instance to begin.")
    )

    void(
        "CmdEndRenderingKHR",
        "See #CmdEndRendering().",

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command.")
    )
}