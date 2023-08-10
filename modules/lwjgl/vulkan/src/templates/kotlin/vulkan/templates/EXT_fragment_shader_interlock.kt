/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_fragment_shader_interlock = "EXTFragmentShaderInterlock".nativeClassVK("EXT_fragment_shader_interlock", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension adds support for the {@code FragmentShaderPixelInterlockEXT}, {@code FragmentShaderSampleInterlockEXT}, and {@code FragmentShaderShadingRateInterlockEXT} capabilities from the {@code SPV_EXT_fragment_shader_interlock} extension to Vulkan.

        Enabling these capabilities provides a critical section for fragment shaders to avoid overlapping pixels being processed at the same time, and certain guarantees about the ordering of fragment shader invocations of fragments of overlapping pixels.

        This extension can be useful for algorithms that need to access per-pixel data structures via shader loads and stores. Algorithms using this extension can access per-pixel data structures in critical sections without other invocations accessing the same per-pixel data. Additionally, the ordering guarantees are useful for cases where the API ordering of fragments is meaningful. For example, applications may be able to execute programmable blending operations in the fragment shader, where the destination buffer is read via image loads and the final value is written via image stores.

        <h5>VK_EXT_fragment_shader_interlock</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_fragment_shader_interlock}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>252</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_fragment_shader_interlock]%20@pdaniell-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_fragment_shader_interlock%20extension*">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-05-02</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_fragment_shader_interlock.html">{@code SPV_EXT_fragment_shader_interlock}</a></li>
                <li>This extension provides API support for <a href="https://registry.khronos.org/OpenGL/extensions/ARB/ARB_fragment_shader_interlock.txt">{@code GL_ARB_fragment_shader_interlock}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Daniel Koch, NVIDIA</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Faith Ekstrand, Intel</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Ruihao Zhang, Qualcomm</li>
                <li>Slawomir Grajewski, Intel</li>
                <li>Spencer Fricke, Samsung</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_FRAGMENT_SHADER_INTERLOCK_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_FRAGMENT_SHADER_INTERLOCK_EXTENSION_NAME".."VK_EXT_fragment_shader_interlock"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT".."1000251000"
    )
}