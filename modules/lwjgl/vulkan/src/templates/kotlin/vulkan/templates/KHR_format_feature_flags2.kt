/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_format_feature_flags2 = "KHRFormatFeatureFlags2".nativeClassVK("KHR_format_feature_flags2", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension adds a new {@code VkFormatFeatureFlagBits2KHR} 64bits format feature flag type to extend the existing {@code VkFormatFeatureFlagBits} which is limited to 31 flags. At the time of this writing 29 bits of {@code VkFormatFeatureFlagBits} are already used.

        Because ##VkFormatProperties2 is already defined to extend the Vulkan 1.0 #GetPhysicalDeviceFormatProperties() entry point, this extension defines a new ##VkFormatProperties3KHR to extend the ##VkFormatProperties.

        On top of replicating all the bits from {@code VkFormatFeatureFlagBits}, {@code VkFormatFeatureFlagBits2KHR} adds the following bits :

        <ul>
            <li>#FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT_KHR and #FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT_KHR indicate that an implementation supports respectively reading and writing a given {@code VkFormat} through storage operations without specifying the format in the shader.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT_KHR indicates that an implementation supports depth comparison performed by {@code OpImage*Dref} instructions on a given {@code VkFormat}. Previously the result of executing a {@code OpImage*Dref*} instruction on an image view, where the {@code format} was not one of the depth/stencil formats with a depth component, was undefined. This bit clarifies on which formats such instructions can be used.</li>
        </ul>

        <h5>Promotion to Vulkan 1.3</h5>
        Functionality in this extension is included in core Vulkan 1.3, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_format_feature_flags2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_format_feature_flags2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>361</dd>

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
                <li>Lionel Landwerlin <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_format_feature_flags2]%20@llandwerlin%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_format_feature_flags2%20extension%3E%3E">llandwerlin</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-07-01</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.3 Core</li>
            </ul></dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Lionel Landwerlin, Intel</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Tobias Hector, AMD</li>
                <li>Spencer Fricke, Samsung Electronics</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Jan-Harald Fredriksen, ARM</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_FORMAT_FEATURE_FLAGS_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_FORMAT_FEATURE_FLAGS_2_EXTENSION_NAME".."VK_KHR_format_feature_flags2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_FORMAT_PROPERTIES_3_KHR".."1000360000"
    )

    EnumConstantLong(
        "Extends {@code VkFormatFeatureFlagBits2}.",

        "FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT_KHR".enum(0x00000001L),
        "FORMAT_FEATURE_2_STORAGE_IMAGE_BIT_KHR".enum(0x00000002L),
        "FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT_KHR".enum(0x00000004L),
        "FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR".enum(0x00000008L),
        "FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT_KHR".enum(0x00000010L),
        "FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT_KHR".enum(0x00000020L),
        "FORMAT_FEATURE_2_VERTEX_BUFFER_BIT_KHR".enum(0x00000040L),
        "FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT_KHR".enum(0x00000080L),
        "FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT_KHR".enum(0x00000100L),
        "FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT_KHR".enum(0x00000200L),
        "FORMAT_FEATURE_2_BLIT_SRC_BIT_KHR".enum(0x00000400L),
        "FORMAT_FEATURE_2_BLIT_DST_BIT_KHR".enum(0x00000800L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT_KHR".enum(0x00001000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT".enum(0x00002000L),
        "FORMAT_FEATURE_2_TRANSFER_SRC_BIT_KHR".enum(0x00004000L),
        "FORMAT_FEATURE_2_TRANSFER_DST_BIT_KHR".enum(0x00008000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT_KHR".enum(0x00010000L),
        "FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT_KHR".enum(0x00020000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR".enum(0x00040000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR".enum(0x00080000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR".enum(0x00100000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR".enum(0x00200000L),
        "FORMAT_FEATURE_2_DISJOINT_BIT_KHR".enum(0x00400000L),
        "FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT_KHR".enum(0x00800000L),
        "FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT_KHR".enum(0x80000000L),
        "FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT_KHR".enum(0x100000000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT_KHR".enum(0x200000000L)
    )
}