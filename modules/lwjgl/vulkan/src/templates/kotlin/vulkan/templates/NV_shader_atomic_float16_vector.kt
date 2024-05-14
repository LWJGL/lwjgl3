/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_shader_atomic_float16_vector = "NVShaderAtomicFloat16Vector".nativeClassVK("NV_shader_atomic_float16_vector", type = "device", postfix = "NV") {
    documentation =
        """
        This extension allows a shader to perform atomic add, min, max, and exchange operations on 2- and 4-component vectors of float16. Buffer, workgroup, and image storage classes are all supported.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_shader_atomic_float16_vector}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>564</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>SPIR-V Dependencies</b></dt>
            <dd><ul>
                <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_shader_atomic_fp16_vector.html">SPV_NV_shader_atomic_fp16_vector</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_shader_atomic_float16_vector]%20@jeffbolznv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_shader_atomic_float16_vector%20extension*">jeffbolznv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2024-02-03</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension provides API support for <a href="https://registry.khronos.org/OpenGL/extensions/NV/NV_shader_atomic_fp16_vector.txt">{@code GL_NV_shader_atomic_fp16_vector}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_SHADER_ATOMIC_FLOAT16_VECTOR_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_SHADER_ATOMIC_FLOAT16_VECTOR_EXTENSION_NAME".."VK_NV_shader_atomic_float16_vector"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT16_VECTOR_FEATURES_NV".."1000563000"
    )
}