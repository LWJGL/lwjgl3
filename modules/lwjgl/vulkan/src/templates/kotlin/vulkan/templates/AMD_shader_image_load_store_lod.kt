/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_shader_image_load_store_lod = "AMDShaderImageLoadStoreLod".nativeClassVK("AMD_shader_image_load_store_lod", type = "device", postfix = "AMD") {
    documentation =
        """
        This extension adds support for the following SPIR-V extension in Vulkan:

        <ul>
            <li><a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/AMD/SPV_AMD_shader_image_load_store_lod.html">{@code SPV_AMD_shader_image_load_store_lod}</a></li>
        </ul>

        <h5>VK_AMD_shader_image_load_store_lod</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_shader_image_load_store_lod}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>47</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Dominik Witczak <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_shader_image_load_store_lod]%20@dominikwitczakamd%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_shader_image_load_store_lod%20extension%3E%3E">dominikwitczakamd</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-08-21</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/AMD/SPV_AMD_shader_image_load_store_lod.html">{@code SPV_AMD_shader_image_load_store_lod}</a></li>
                <li>This extension provides API support for <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_shader_image_load_store_lod.txt">{@code GL_AMD_shader_image_load_store_lod}</a></li>
            </ul></dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Dominik Witczak, AMD</li>
                <li>Qun Lin, AMD</li>
                <li>Rex Xu, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_SHADER_IMAGE_LOAD_STORE_LOD_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_SHADER_IMAGE_LOAD_STORE_LOD_EXTENSION_NAME".."VK_AMD_shader_image_load_store_lod"
    )
}