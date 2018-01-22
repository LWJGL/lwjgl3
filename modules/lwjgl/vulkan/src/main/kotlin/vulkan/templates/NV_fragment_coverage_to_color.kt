/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val NV_fragment_coverage_to_color = "NVFragmentCoverageToColor".nativeClassVK("NV_fragment_coverage_to_color", type = "device", postfix = NV) {
    documentation =
        """
        This extension allows the fragment coverage value, represented as an integer bitmask, to be substituted for a color output being written to a single-component color attachment with integer components (e.g. #FORMAT_R8_UINT). The functionality provided by this extension is different from simply writing the {@code SampleMask} fragment shader output, in that the coverage value written to the framebuffer is taken after stencil test and depth test, as well as after fragment operations such as alpha-to-coverage.

        This functionality may be useful for deferred rendering algorithms, where the second pass needs to know which samples belong to which original fragments.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_fragment_coverage_to_color}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>150</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz @jbolz</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-05-21</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_FRAGMENT_COVERAGE_TO_COLOR_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_FRAGMENT_COVERAGE_TO_COLOR_EXTENSION_NAME".."VK_NV_fragment_coverage_to_color"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV".."1000149000"
    )
}