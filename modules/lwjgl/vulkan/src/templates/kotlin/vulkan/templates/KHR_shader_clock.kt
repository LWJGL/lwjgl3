/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_clock = "KHRShaderClock".nativeClassVK("KHR_shader_clock", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension advertises the SPIR-V {@code ShaderClockKHR} capability for Vulkan, which allows a shader to query a real-time or monotonically incrementing counter at the subgroup level or across the device level. The two valid SPIR-V scopes for {@code OpReadClockKHR} are {@code Subgroup} and {@code Device}.

        When using GLSL source-based shading languages, the {@code clockRealtime*EXT}() timing functions map to the {@code OpReadClockKHR} instruction with a scope of {@code Device}, and the {@code clock*ARB}() timing functions map to the {@code OpReadClockKHR} instruction with a scope of {@code Subgroup}.

        <h5>VK_KHR_shader_clock</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_shader_clock}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>182</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Aaron Hagan <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_shader_clock]%20@ahagan%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_shader_clock%20extension%3E%3E">ahagan</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-4-25</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_shader_clock.html">{@code SPV_KHR_shader_clock}</a>.</li>
                <li>This extension provides API support for <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_clock.txt">{@code ARB_shader_clock}</a> and <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GL_EXT_shader_realtime_clock.txt">{@code EXT_shader_realtime_clock}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Aaron Hagan, AMD</li>
                <li>Daniel Koch, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SHADER_CLOCK_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_SHADER_CLOCK_EXTENSION_NAME".."VK_KHR_shader_clock"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR".."1000181000"
    )
}