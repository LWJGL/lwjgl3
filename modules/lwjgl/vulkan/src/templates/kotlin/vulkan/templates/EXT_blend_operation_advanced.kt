/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_blend_operation_advanced = "EXTBlendOperationAdvanced".nativeClassVK("EXT_blend_operation_advanced", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension adds a number of “{@code advanced}” blending operations that <b>can</b> be used to perform new color blending operations, many of which are more complex than the standard blend modes provided by unextended Vulkan. This extension requires different styles of usage, depending on the level of hardware support and the enabled features:

        <ul>
            <li>If ##VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT{@code ::advancedBlendCoherentOperations} is #FALSE, the new blending operations are supported, but a memory dependency <b>must</b> separate each advanced blend operation on a given sample. #ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT is used to synchronize reads using advanced blend operations.</li>
            <li>If ##VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT{@code ::advancedBlendCoherentOperations} is #TRUE, advanced blend operations obey primitive order just like basic blend operations.</li>
        </ul>

        In unextended Vulkan, the set of blending operations is limited, and <b>can</b> be expressed very simply. The #BLEND_OP_MIN and #BLEND_OP_MAX blend operations simply compute component-wise minimums or maximums of source and destination color components. The #BLEND_OP_ADD, #BLEND_OP_SUBTRACT, and #BLEND_OP_REVERSE_SUBTRACT modes multiply the source and destination colors by source and destination factors and either add the two products together or subtract one from the other. This limited set of operations supports many common blending operations but precludes the use of more sophisticated transparency and blending operations commonly available in many dedicated imaging APIs.

        This extension provides a number of new “{@code advanced}” blending operations. Unlike traditional blending operations using #BLEND_OP_ADD, these blending equations do not use source and destination factors specified by {@code VkBlendFactor}. Instead, each blend operation specifies a complete equation based on the source and destination colors. These new blend operations are used for both RGB and alpha components; they <b>must</b> not be used to perform separate RGB and alpha blending (via different values of color and alpha {@code VkBlendOp}).

        These blending operations are performed using premultiplied colors, where RGB colors <b>can</b> be considered premultiplied or non-premultiplied by alpha, according to the {@code srcPremultiplied} and {@code dstPremultiplied} members of ##VkPipelineColorBlendAdvancedStateCreateInfoEXT. If a color is considered non-premultiplied, the (R,G,B) color components are multiplied by the alpha component prior to blending. For non-premultiplied color components in the range <code>[0,1]</code>, the corresponding premultiplied color component would have values in the range <code>[0 × A, 1 × A]</code>.

        Many of these advanced blending equations are formulated where the result of blending source and destination colors with partial coverage have three separate contributions: from the portions covered by both the source and the destination, from the portion covered only by the source, and from the portion covered only by the destination. The blend parameter ##VkPipelineColorBlendAdvancedStateCreateInfoEXT{@code ::blendOverlap} <b>can</b> be used to specify a correlation between source and destination pixel coverage. If set to #BLEND_OVERLAP_CONJOINT_EXT, the source and destination are considered to have maximal overlap, as would be the case if drawing two objects on top of each other. If set to #BLEND_OVERLAP_DISJOINT_EXT, the source and destination are considered to have minimal overlap, as would be the case when rendering a complex polygon tessellated into individual non-intersecting triangles. If set to #BLEND_OVERLAP_UNCORRELATED_EXT, the source and destination coverage are assumed to have no spatial correlation within the pixel.

        In addition to the coherency issues on implementations not supporting {@code advancedBlendCoherentOperations}, this extension has several limitations worth noting. First, the new blend operations have a limit on the number of color attachments they <b>can</b> be used with, as indicated by ##VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT{@code ::advancedBlendMaxColorAttachments}. Additionally, blending precision <b>may</b> be limited to 16-bit floating-point, which <b>may</b> result in a loss of precision and dynamic range for framebuffer formats with 32-bit floating-point components, and in a loss of precision for formats with 12- and 16-bit signed or unsigned normalized integer components.

        <h5>VK_EXT_blend_operation_advanced</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_blend_operation_advanced}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>149</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_blend_operation_advanced]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_blend_operation_advanced%20extension%3E%3E">jeffbolznv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-06-12</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_BLEND_OPERATION_ADVANCED_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_BLEND_OPERATION_ADVANCED_EXTENSION_NAME".."VK_EXT_blend_operation_advanced"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT".."1000148000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT".."1000148001",
        "STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT".."1000148002"
    )

    EnumConstant(
        "Extends {@code VkBlendOp}.",

        "BLEND_OP_ZERO_EXT".."1000148000",
        "BLEND_OP_SRC_EXT".."1000148001",
        "BLEND_OP_DST_EXT".."1000148002",
        "BLEND_OP_SRC_OVER_EXT".."1000148003",
        "BLEND_OP_DST_OVER_EXT".."1000148004",
        "BLEND_OP_SRC_IN_EXT".."1000148005",
        "BLEND_OP_DST_IN_EXT".."1000148006",
        "BLEND_OP_SRC_OUT_EXT".."1000148007",
        "BLEND_OP_DST_OUT_EXT".."1000148008",
        "BLEND_OP_SRC_ATOP_EXT".."1000148009",
        "BLEND_OP_DST_ATOP_EXT".."1000148010",
        "BLEND_OP_XOR_EXT".."1000148011",
        "BLEND_OP_MULTIPLY_EXT".."1000148012",
        "BLEND_OP_SCREEN_EXT".."1000148013",
        "BLEND_OP_OVERLAY_EXT".."1000148014",
        "BLEND_OP_DARKEN_EXT".."1000148015",
        "BLEND_OP_LIGHTEN_EXT".."1000148016",
        "BLEND_OP_COLORDODGE_EXT".."1000148017",
        "BLEND_OP_COLORBURN_EXT".."1000148018",
        "BLEND_OP_HARDLIGHT_EXT".."1000148019",
        "BLEND_OP_SOFTLIGHT_EXT".."1000148020",
        "BLEND_OP_DIFFERENCE_EXT".."1000148021",
        "BLEND_OP_EXCLUSION_EXT".."1000148022",
        "BLEND_OP_INVERT_EXT".."1000148023",
        "BLEND_OP_INVERT_RGB_EXT".."1000148024",
        "BLEND_OP_LINEARDODGE_EXT".."1000148025",
        "BLEND_OP_LINEARBURN_EXT".."1000148026",
        "BLEND_OP_VIVIDLIGHT_EXT".."1000148027",
        "BLEND_OP_LINEARLIGHT_EXT".."1000148028",
        "BLEND_OP_PINLIGHT_EXT".."1000148029",
        "BLEND_OP_HARDMIX_EXT".."1000148030",
        "BLEND_OP_HSL_HUE_EXT".."1000148031",
        "BLEND_OP_HSL_SATURATION_EXT".."1000148032",
        "BLEND_OP_HSL_COLOR_EXT".."1000148033",
        "BLEND_OP_HSL_LUMINOSITY_EXT".."1000148034",
        "BLEND_OP_PLUS_EXT".."1000148035",
        "BLEND_OP_PLUS_CLAMPED_EXT".."1000148036",
        "BLEND_OP_PLUS_CLAMPED_ALPHA_EXT".."1000148037",
        "BLEND_OP_PLUS_DARKER_EXT".."1000148038",
        "BLEND_OP_MINUS_EXT".."1000148039",
        "BLEND_OP_MINUS_CLAMPED_EXT".."1000148040",
        "BLEND_OP_CONTRAST_EXT".."1000148041",
        "BLEND_OP_INVERT_OVG_EXT".."1000148042",
        "BLEND_OP_RED_EXT".."1000148043",
        "BLEND_OP_GREEN_EXT".."1000148044",
        "BLEND_OP_BLUE_EXT".."1000148045"
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits}.",

        "ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT".enum(0x00080000)
    )

    EnumConstant(
        """
        VkBlendOverlapEXT - Enumerant specifying the blend overlap parameter

        <h5>Description</h5>
        <ul>
            <li>#BLEND_OVERLAP_UNCORRELATED_EXT specifies that there is no correlation between the source and destination coverage.</li>
            <li>#BLEND_OVERLAP_CONJOINT_EXT specifies that the source and destination coverage are considered to have maximal overlap.</li>
            <li>#BLEND_OVERLAP_DISJOINT_EXT specifies that the source and destination coverage are considered to have minimal overlap.</li>
        </ul>

        <h6>Advanced Blend Overlap Modes</h6>
        <table class="lwjgl">
            <thead><tr><th>Overlap Mode</th><th>Weighting Equations</th></tr></thead>
            <tbody>
                <tr><td>#BLEND_OVERLAP_UNCORRELATED_EXT</td><td><pre><code>
￿p<sub>0</sub>(A<sub>s</sub>, A<sub>d</sub>) = A<sub>s</sub>A<sub>d</sub> \\
￿p<sub>1</sub>(A<sub>s</sub>, A<sub>d</sub>) = A<sub>s</sub>(1 &minus; A<sub>d</sub>) \\
￿p<sub>2</sub>(A<sub>s</sub>, A<sub>d</sub>) = A<sub>d</sub>(1 &minus; A<sub>s</sub>) \\</code></pre></td></tr>
                <tr><td>#BLEND_OVERLAP_CONJOINT_EXT</td><td><pre><code>
￿p<sub>0</sub>(A<sub>s</sub>, A<sub>d</sub>) = min(A<sub>s</sub>, A<sub>d</sub>) \\
￿p<sub>1</sub>(A<sub>s</sub>, A<sub>d</sub>) = max(A<sub>s</sub> &minus; A<sub>d</sub>, 0) \\
￿p<sub>2</sub>(A<sub>s</sub>, A<sub>d</sub>) = max(A<sub>d</sub> &minus; A<sub>s</sub>, 0) \\</code></pre></td></tr>
                <tr><td>#BLEND_OVERLAP_DISJOINT_EXT</td><td><pre><code>
￿p<sub>0</sub>(A<sub>s</sub>, A<sub>d</sub>) = max(A<sub>s</sub> + A<sub>d</sub> &minus; 1, 0) \\
￿p<sub>1</sub>(A<sub>s</sub>, A<sub>d</sub>) = min(A<sub>s</sub>, 1 &minus; A<sub>d</sub>) \\
￿p<sub>2</sub>(A<sub>s</sub>, A<sub>d</sub>) = min(A<sub>d</sub>, 1 &minus; A<sub>s</sub>) \\</code></pre></td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##VkPipelineColorBlendAdvancedStateCreateInfoEXT
        """,

        "BLEND_OVERLAP_UNCORRELATED_EXT".."0",
        "BLEND_OVERLAP_DISJOINT_EXT".."1",
        "BLEND_OVERLAP_CONJOINT_EXT".."2"
    )
}