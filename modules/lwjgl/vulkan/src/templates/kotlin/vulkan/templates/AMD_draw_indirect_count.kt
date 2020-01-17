/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_draw_indirect_count = "AMDDrawIndirectCount".nativeClassVK("AMD_draw_indirect_count", type = "device", postfix = AMD) {
    documentation =
        """
        This extension allows an application to source the number of draw calls for indirect draw calls from a buffer. This enables applications to generate arbitrary amounts of draw commands and execute them without host intervention.

        <h5>Promotion to VK_KHR_draw_indirect_count</h5>
        All functionality in this extension is included in {@link KHRDrawIndirectCount VK_KHR_draw_indirect_count}, with the suffix changed to KHR. The original type, enum and command names are still available as aliases of the core functionality.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_draw_indirect_count}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>34</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li>
                    <em>Promoted</em> to {@link KHRDrawIndirectCount VK_KHR_draw_indirect_count} extension
                    <ul>
                        <li>Which in turn was <em>promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#versions-1.2-promotions">Vulkan 1.2</a></li>
                    </ul>
                </li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_AMD_draw_indirect_count:%20&amp;body=@drakos-amd%20">drakos-amd</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-08-23</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VK_KHR_draw_indirect_count">VK_KHR_draw_indirect_count</a></li>
            </ul></dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Derrick Owens, AMD</li>
                <li>Graham Sellers, AMD</li>
                <li>Daniel Rakos, AMD</li>
                <li>Dominik Witczak, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_DRAW_INDIRECT_COUNT_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME".."VK_AMD_draw_indirect_count"
    )

    void(
        "CmdDrawIndirectCountAMD",
        "See #CmdDrawIndirectCount().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkBuffer("buffer", "the buffer containing draw parameters."),
        VkDeviceSize("offset", "the byte offset into {@code buffer} where parameters begin."),
        VkBuffer("countBuffer", "the buffer containing the draw count."),
        VkDeviceSize("countBufferOffset", "the byte offset into {@code countBuffer} where the draw count begins."),
        uint32_t("maxDrawCount", "specifies the maximum number of draws that will be executed. The actual number of executed draw calls is the minimum of the count specified in {@code countBuffer} and {@code maxDrawCount}."),
        uint32_t("stride", "the byte stride between successive sets of draw parameters.")
    )

    void(
        "CmdDrawIndexedIndirectCountAMD",
        "See #CmdDrawIndexedIndirectCountKHR().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkBuffer("buffer", "the buffer containing draw parameters."),
        VkDeviceSize("offset", "the byte offset into {@code buffer} where parameters begin."),
        VkBuffer("countBuffer", "the buffer containing the draw count."),
        VkDeviceSize("countBufferOffset", "the byte offset into {@code countBuffer} where the draw count begins."),
        uint32_t("maxDrawCount", "specifies the maximum number of draws that will be executed. The actual number of executed draw calls is the minimum of the count specified in {@code countBuffer} and {@code maxDrawCount}."),
        uint32_t("stride", "the byte stride between successive sets of draw parameters.")
    )
}