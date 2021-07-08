/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_sampler_filter_minmax = "EXTSamplerFilterMinmax".nativeClassVK("EXT_sampler_filter_minmax", type = "device", postfix = EXT) {
    documentation =
        """
        In unextended Vulkan, minification and magnification filters such as LINEAR allow sampled image lookups to return a filtered texel value produced by computing a weighted average of a collection of texels in the neighborhood of the texture coordinate provided.

        This extension provides a new sampler parameter which allows applications to produce a filtered texel value by computing a component-wise minimum (MIN) or maximum (MAX) of the texels that would normally be averaged. The reduction mode is orthogonal to the minification and magnification filter parameters. The filter parameters are used to identify the set of texels used to produce a final filtered value; the reduction mode identifies how these texels are combined.

        <h5>Promotion to Vulkan 1.2</h5>
        All functionality in this extension is included in core Vulkan 1.2, with the EXT suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_EXT_sampler_filter_minmax</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_sampler_filter_minmax}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>131</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#versions-1.2-promotions">Vulkan 1.2</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_sampler_filter_minmax:%20&amp;body=@jeffbolznv%20">jeffbolznv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-05-19</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.2 Core</li>
            </ul></dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Piers Daniell, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_SAMPLER_FILTER_MINMAX_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_SAMPLER_FILTER_MINMAX_EXTENSION_NAME".."VK_EXT_sampler_filter_minmax"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES_EXT".."1000130000",
        "STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO_EXT".."1000130001"
    )

    EnumConstant(
        "Extends {@code VkFormatFeatureFlagBits}.",

        "FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT_EXT".enum(0x00010000)
    )

    EnumConstant(
        "Extends {@code VkSamplerReductionMode}.",

        "SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT".."0",
        "SAMPLER_REDUCTION_MODE_MIN_EXT".."1",
        "SAMPLER_REDUCTION_MODE_MAX_EXT".."2"
    )
}