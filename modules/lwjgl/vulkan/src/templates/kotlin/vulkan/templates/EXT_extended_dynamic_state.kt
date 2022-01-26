/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_extended_dynamic_state = "EXTExtendedDynamicState".nativeClassVK("EXT_extended_dynamic_state", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension adds some more dynamic state to support applications that need to reduce the number of pipeline state objects they compile and bind.

        <h5>Promotion to Vulkan 1.3</h5>
        This extension has been partially promoted. All dynamic state enumerants and entry points in this extension are included in core Vulkan 1.3, with the EXT suffix omitted. The feature structure is not promoted. Extension interfaces that were promoted remain available as aliases of the core functionality.

        <h5>VK_EXT_extended_dynamic_state</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_extended_dynamic_state}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>268</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3-promotions">Vulkan 1.3</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_extended_dynamic_state]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_extended_dynamic_state%20extension%3E%3E">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-12-09</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.3 Core</li>
            </ul></dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Dan Ginsburg, Valve Corporation</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Hans-Kristian Arntzen, Valve Corporation</li>
                <li>Jan-Harald Fredriksen, Arm Limited</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Jesse Hall, Google</li>
                <li>Philip Rebohle, Valve Corporation</li>
                <li>Stuart Smith, Imagination Technologies</li>
                <li>Tobias Hector, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_EXTENDED_DYNAMIC_STATE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_EXTENDED_DYNAMIC_STATE_EXTENSION_NAME".."VK_EXT_extended_dynamic_state"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT".."1000267000"
    )

    EnumConstant(
        "Extends {@code VkDynamicState}.",

        "DYNAMIC_STATE_CULL_MODE_EXT".."1000267000",
        "DYNAMIC_STATE_FRONT_FACE_EXT".."1000267001",
        "DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT".."1000267002",
        "DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT".."1000267003",
        "DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT".."1000267004",
        "DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT".."1000267005",
        "DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT".."1000267006",
        "DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT".."1000267007",
        "DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT".."1000267008",
        "DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT".."1000267009",
        "DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT".."1000267010",
        "DYNAMIC_STATE_STENCIL_OP_EXT".."1000267011"
    )

    void(
        "CmdSetCullModeEXT",
        "See #CmdSetCullMode().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCullModeFlags("cullMode", "specifies the cull mode property to use for drawing.")
    )

    void(
        "CmdSetFrontFaceEXT",
        "See #CmdSetFrontFace().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkFrontFace("frontFace", "a {@code VkFrontFace} value specifying the front-facing triangle orientation to be used for culling.")
    )

    void(
        "CmdSetPrimitiveTopologyEXT",
        "See #CmdSetPrimitiveTopology().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkPrimitiveTopology("primitiveTopology", "specifies the primitive topology to use for drawing.")
    )

    void(
        "CmdSetViewportWithCountEXT",
        "See #CmdSetViewportWithCount().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pViewports")..uint32_t("viewportCount", "specifies the viewport count."),
        VkViewport.const.p("pViewports", "specifies the viewports to use for drawing.")
    )

    void(
        "CmdSetScissorWithCountEXT",
        "See #CmdSetScissorWithCount().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pScissors")..uint32_t("scissorCount", "specifies the scissor count."),
        VkRect2D.const.p("pScissors", "specifies the scissors to use for drawing.")
    )

    void(
        "CmdBindVertexBuffers2EXT",
        "See #CmdBindVertexBuffers2().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        uint32_t("firstBinding", "the index of the first vertex input binding whose state is updated by the command."),
        AutoSize("pBuffers", "pOffsets", "pSizes", "pStrides")..uint32_t("bindingCount", "the number of vertex input bindings whose state is updated by the command."),
        VkBuffer.const.p("pBuffers", "a pointer to an array of buffer handles."),
        VkDeviceSize.const.p("pOffsets", "a pointer to an array of buffer offsets."),
        nullable..VkDeviceSize.const.p("pSizes", "{@code NULL} or a pointer to an array of the size in bytes of vertex data bound from {@code pBuffers}."),
        nullable..VkDeviceSize.const.p("pStrides", "{@code NULL} or a pointer to an array of buffer strides.")
    )

    void(
        "CmdSetDepthTestEnableEXT",
        "See #CmdSetDepthTestEnable().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthTestEnable", "specifies if the depth test is enabled.")
    )

    void(
        "CmdSetDepthWriteEnableEXT",
        "See #CmdSetDepthWriteEnable().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthWriteEnable", "specifies if depth writes are enabled.")
    )

    void(
        "CmdSetDepthCompareOpEXT",
        "See #CmdSetDepthCompareOp().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCompareOp("depthCompareOp", "specifies the depth comparison operator.")
    )

    void(
        "CmdSetDepthBoundsTestEnableEXT",
        "See #CmdSetDepthBoundsTestEnable().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthBoundsTestEnable", "specifies if the depth bounds test is enabled.")
    )

    void(
        "CmdSetStencilTestEnableEXT",
        "See #CmdSetStencilTestEnable().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("stencilTestEnable", "specifies if the stencil test is enabled.")
    )

    void(
        "CmdSetStencilOpEXT",
        "See #CmdSetStencilOp().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkStencilFaceFlags("faceMask", "a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the stencil operation."),
        VkStencilOp("failOp", "a {@code VkStencilOp} value specifying the action performed on samples that fail the stencil test."),
        VkStencilOp("passOp", "a {@code VkStencilOp} value specifying the action performed on samples that pass both the depth and stencil tests."),
        VkStencilOp("depthFailOp", "a {@code VkStencilOp} value specifying the action performed on samples that pass the stencil test and fail the depth test."),
        VkCompareOp("compareOp", "a {@code VkCompareOp} value specifying the comparison operator used in the stencil test.")
    )
}