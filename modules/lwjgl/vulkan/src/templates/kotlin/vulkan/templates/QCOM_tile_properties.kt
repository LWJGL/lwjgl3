/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_tile_properties = "QCOMTileProperties".nativeClassVK("QCOM_tile_properties", type = "device", postfix = "QCOM") {
    documentation =
        """
        This extension allows an application to query the tile properties. This extension supports both renderpasses and dynamic rendering.

        <h5>VK_QCOM_tile_properties</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_QCOM_tile_properties}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>485</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Leger <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_QCOM_tile_properties]%20@jackohound%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_QCOM_tile_properties%20extension*">jackohound</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_QCOM_tile_properties.adoc">VK_QCOM_tile_properties</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-07-11</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension interacts with {@link EXTSubpassMergeFeedback VK_EXT_subpass_merge_feedback}</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jonathan Wicks, Qualcomm Technologies, Inc.</li>
                <li>Jonathan Tinkham, Qualcomm Technologies, Inc.</li>
                <li>Arpit Agarwal, Qualcomm Technologies, Inc.</li>
                <li>Jeff Leger, Qualcomm Technologies, Inc.</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "QCOM_TILE_PROPERTIES_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "QCOM_TILE_PROPERTIES_EXTENSION_NAME".."VK_QCOM_tile_properties"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM".."1000484000",
        "STRUCTURE_TYPE_TILE_PROPERTIES_QCOM".."1000484001"
    )

    VkResult(
        "GetFramebufferTilePropertiesQCOM",
        """
        Get tile properties from the attachments in framebuffer.

        <h5>C Specification</h5>
        To query the tile properties from the attachments in framebuffer, call:

        <pre><code>
￿VkResult vkGetFramebufferTilePropertiesQCOM(
￿    VkDevice                                    device,
￿    VkFramebuffer                               framebuffer,
￿    uint32_t*                                   pPropertiesCount,
￿    VkTilePropertiesQCOM*                       pProperties);</code></pre>

        <h5>Description</h5>
        If {@code pProperties} is {@code NULL}, then the number of tile properties available is returned in {@code pPropertiesCount}. Otherwise, {@code pPropertiesCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of properties actually written to {@code pProperties}. If {@code pPropertiesCount} is less than the number of tile properties available, at most {@code pPropertiesCount} structures will be written, and #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available properties were returned.

        The number of tile properties available is determined by the number of merged subpasses, and each tile property is associated with a merged subpass. There will be at most as many properties as there are subpasses within the render pass. To obtain the tile properties for a given merged subpass, the {@code pProperties} array can be indexed using the {@code postMergeIndex} value provided in ##VkRenderPassSubpassFeedbackInfoEXT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code framebuffer} <b>must</b> be a valid {@code VkFramebuffer} handle</li>
            <li>{@code pPropertiesCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertiesCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertiesCount} ##VkTilePropertiesQCOM structures</li>
            <li>{@code framebuffer} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkTilePropertiesQCOM
        """,

        VkDevice("device", "a logical device associated with the framebuffer."),
        VkFramebuffer("framebuffer", "a handle of the framebuffer to query."),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertiesCount", "a pointer to an integer related to the number of tile properties available or queried, as described below."),
        nullable..VkTilePropertiesQCOM.p("pProperties", "either {@code NULL} or a pointer to an array of ##VkTilePropertiesQCOM structures.")
    )

    VkResult(
        "GetDynamicRenderingTilePropertiesQCOM",
        """
        Get the properties when using dynamic rendering.

        <h5>C Specification</h5>
        To query the tile properties when using dynamic rendering, call:

        <pre><code>
￿VkResult vkGetDynamicRenderingTilePropertiesQCOM(
￿    VkDevice                                    device,
￿    const VkRenderingInfo*                      pRenderingInfo,
￿    VkTilePropertiesQCOM*                       pProperties);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pRenderingInfo} <b>must</b> be a valid pointer to a valid ##VkRenderingInfo structure</li>
            <li>{@code pProperties} <b>must</b> be a valid pointer to a ##VkTilePropertiesQCOM structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkRenderingInfo, ##VkTilePropertiesQCOM
        """,

        VkDevice("device", "a logical device associated with the render pass."),
        VkRenderingInfo.const.p("pRenderingInfo", "a pointer to the ##VkRenderingInfo structure specifying details of the render pass instance in dynamic rendering."),
        VkTilePropertiesQCOM.p("pProperties", "a pointer to a ##VkTilePropertiesQCOM structure in which the properties are returned.")
    )
}