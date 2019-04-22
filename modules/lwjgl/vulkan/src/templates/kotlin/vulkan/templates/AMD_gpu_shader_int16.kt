/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_gpu_shader_int16 = "AMDGPUShaderInt16".nativeClassVK("AMD_gpu_shader_int16", type = "device", postfix = AMD) {
    documentation =
        """
        This extension adds support for using 16-bit integer variables in shaders.

        <h5>Deprecation by VK_KHR_shader_float16_int8</h5>
        Functionality in this extension was included in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html\#VK_KHR_shader_float16_int8">VK_KHR_shader_float16_int8</a> extension, when ##VkPhysicalDeviceFeatures{@code ::shaderInt16} and slink::VkPhysicalDeviceFloat16Int8FeaturesKHR{@code ::shaderFloat16} are enabled.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_gpu_shader_int16}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>133</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Deprecated</em> by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html\#VK_KHR_shader_float16_int8">VK_KHR_shader_float16_int8</a> extension</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Qun Lin <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_AMD_gpu_shader_int16:%20&amp;body=@linqun%20">linqun</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2019-04-11</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Requires the <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/AMD/SPV_AMD_gpu_shader_int16.html">{@code SPV_AMD_gpu_shader_int16}</a> SPIR-V extension.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Daniel Rakos, AMD</li>
                <li>Dominik Witczak, AMD</li>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Rex Xu, AMD</li>
                <li>Timothy Lottes, AMD</li>
                <li>Zhi Cai, AMD</li>
            </ul></dd>

            <dt><b>External Dependencies</b></dt>
            <dd><ul>
                <li><a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/AMD/SPV_AMD_gpu_shader_int16.html">{@code SPV_AMD_gpu_shader_int16}</a></li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_GPU_SHADER_INT16_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "AMD_GPU_SHADER_INT16_EXTENSION_NAME".."VK_AMD_gpu_shader_int16"
    )
}