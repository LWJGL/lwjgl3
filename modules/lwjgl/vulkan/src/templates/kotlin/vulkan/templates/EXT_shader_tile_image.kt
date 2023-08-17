/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_tile_image = "EXTShaderTileImage".nativeClassVK("EXT_shader_tile_image", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension allows fragment shader invocations to read color, depth and stencil values at their pixel location in rasterization order. The functionality is only available when using dynamic render passes introduced by VK_KHR_dynamic_rendering. Example use cases are programmable blending and deferred shading.

        See <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fragops-shader-tileimage-reads">fragment shader tile image reads</a> for more information.

        <h5>Examples</h5>
        Color read example.

        <pre><code>
￿layout( location = 0 // aliased to color attachment 0  ) tileImageEXT highp attachmentEXT color0;
￿layout( location = 1 // aliased to color attachment 1  ) tileImageEXT highp attachmentEXT color1;
￿
￿layout( location = 0 ) out vec4 fragColor;
￿
￿void main()
￿{
￿    vec4 value = colorAttachmentReadEXT(color0) + colorAttachmentReadEXT(color1);
￿    fragColor = value;
￿}</code></pre>

        Depth &amp; Stencil read example.

        <pre><code>
￿void main()
￿{
￿    // read sample 0: works for non-MSAA or MSAA targets
￿    highp float last_depth = depthAttachmentReadEXT();
￿    lowp uint last_stencil = stencilAttachmentReadEXT();
￿
￿    //..
￿}</code></pre>

        <h5>VK_EXT_shader_tile_image</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_shader_tile_image}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>396</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3">Version 1.3</a></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jan-Harald Fredriksen <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_shader_tile_image]%20@janharaldfredriksen-arm%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_shader_tile_image%20extension*">janharaldfredriksen-arm</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_shader_tile_image.adoc">VK_EXT_shader_tile_image</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-03-23</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_shader_tile_image.html">{@code SPV_EXT_shader_tile_image}</a></li>
                <li>This extension provides API support for <a href="https://raw.githubusercontent.com/KhronosGroup/GLSL/master/extensions/ext/GLSL_EXT_shader_tile_image.txt">{@code GL_EXT_shader_tile_image}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Sandeep Kakarlapudi, Arm</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>James Fitzpatrick, Imagination</li>
                <li>Andrew Garrard, Imagination</li>
                <li>Jeff Leger, Qualcomm</li>
                <li>Huilong Wang, Huawei</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Hans-Kristian Arntzen, Valve</li>
                <li>Tobias Hector, AMD</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Shahbaz Youssefi, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_SHADER_TILE_IMAGE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_SHADER_TILE_IMAGE_EXTENSION_NAME".."VK_EXT_shader_tile_image"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT".."1000395000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT".."1000395001"
    )
}