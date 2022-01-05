/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val INTEL_shader_integer_functions2 = "INTELShaderIntegerFunctions2".nativeClassVK("INTEL_shader_integer_functions2", type = "device", postfix = "INTEL") {
    documentation =
        """
        This extension adds support for several new integer instructions in SPIR-V for use in graphics shaders. Many of these instructions have pre-existing counterparts in the Kernel environment.

        The added integer functions are defined by the <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/INTEL/SPV_INTEL_shader_integer_functions2.html">{@code SPV_INTEL_shader_integer_functions2}</a> SPIR-V extension and can be used with the GL_INTEL_shader_integer_functions2 GLSL extension.

        <h5>VK_INTEL_shader_integer_functions2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_INTEL_shader_integer_functions2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>210</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Ian Romanick <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_INTEL_shader_integer_functions2]%20@ianromanick%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_INTEL_shader_integer_functions2%20extension%3E%3E">ianromanick</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-04-30</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/INTEL/SPV_INTEL_shader_integer_functions2.html">{@code SPV_INTEL_shader_integer_functions2}</a>.</li>
                <li>This extension provides API support for <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/INTEL/INTEL_shader_integer_functions2.txt">{@code GL_INTEL_shader_integer_functions2}</a>.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ian Romanick, Intel</li>
                <li>Ben Ashbaugh, Intel</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "INTEL_SHADER_INTEGER_FUNCTIONS_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "INTEL_SHADER_INTEGER_FUNCTIONS_2_EXTENSION_NAME".."VK_INTEL_shader_integer_functions2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL".."1000209000"
    )
}