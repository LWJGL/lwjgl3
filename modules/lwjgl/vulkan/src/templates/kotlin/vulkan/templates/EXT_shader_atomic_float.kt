/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_atomic_float = "EXTShaderAtomicFloat".nativeClassVK("EXT_shader_atomic_float", type = "device", postfix = EXT) {
    documentation =
        """
        This extension allows a shader to contain floating-point atomic operations on buffer, workgroup, and image memory. It also advertises the SPIR-V {@code AtomicFloat32AddEXT} and {@code AtomicFloat64AddEXT} capabilities that allows atomic addition on floating-points numbers. The supported operations include {@code OpAtomicFAddEXT}, {@code OpAtomicExchange}, {@code OpAtomicLoad} and {@code OpAtomicStore}.

        <h5>VK_EXT_shader_atomic_float</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_shader_atomic_float}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>261</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Vikram Kushwaha <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_shader_atomic_float:%20&amp;body=@vkushwaha-nv%20">vkushwaha-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-07-15</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_shader_atomic_float_add.html">{@code SPV_EXT_shader_atomic_float_add}</a></li>
                <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/tree/master/extensions/ext/GLSL_EXT_shader_atomic_float.txt">{@code GL_EXT_shader_atomic_float}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Vikram Kushwaha, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_SHADER_ATOMIC_FLOAT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_SHADER_ATOMIC_FLOAT_EXTENSION_NAME".."VK_EXT_shader_atomic_float"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT".."1000260000"
    )
}