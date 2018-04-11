/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_post_depth_coverage = "EXTPostDepthCoverage".nativeClassVK("EXT_post_depth_coverage", type = "device", postfix = EXT) {
    documentation =
        """
        This extension adds support for the following SPIR-V extension in Vulkan:

        <ul>
            <li>SPV_KHR_post_depth_coverage</li>
        </ul>

        which allows the fragment shader to control whether values in the {@code SampleMask} built-in input variable reflect the coverage after the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#fragops-early">early per-fragment</a> depth and stencil tests are applied.

        This extension adds a new {@code PostDepthCoverage} execution mode under the {@code SampleMaskPostDepthCoverage} capability. When this mode is specified along with {@code EarlyFragmentTests}, the value of an input variable decorated with the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#interfaces-builtin-variables-samplemask"> {@code SampleMask}</a> built-in reflects the coverage after the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#shaders-fragment-earlytest"> early fragment tests</a> are applied. Otherwise, it reflects the coverage before the depth and stencil tests.

        When using GLSL source-based shading languages, the {@code post_depth_coverage} layout qualifier from GL_ARB_post_depth_coverage or GL_EXT_post_depth_coverage maps to the {@code PostDepthCoverage} execution mode.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_post_depth_coverage}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>156</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Koch @dgkoch</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-07-17</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires the <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/KHR/SPV_KHR_post_depth_coverage.html">SPV_KHR_post_depth_coverage</a> SPIR-V extension.</li>
                <li>This extension requires <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_post_depth_coverage.txt">GL_ARB_post_depth_coverage</a> or <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_post_depth_coverage.txt">GL_EXT_post_depth_coverage</a> for GLSL-based source languages.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_POST_DEPTH_COVERAGE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_POST_DEPTH_COVERAGE_EXTENSION_NAME".."VK_EXT_post_depth_coverage"
    )
}