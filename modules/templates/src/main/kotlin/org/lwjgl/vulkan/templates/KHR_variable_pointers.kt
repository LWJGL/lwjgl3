/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_variable_pointers = "KHRVariablePointers".nativeClassVK("KHR_variable_pointers", type = "device", postfix = KHR) {
    documentation =
        """
        The {@code VK_KHR_variable_pointers} extension allows implementations to indicate their level of support for the {@code SPV_KHR_variable_pointers} SPIR-V extension. The SPIR-V extension allows shader modules to use invocation-private pointers into uniform and/or storage buffers, where the pointer values can be dynamic and non-uniform.

        The {@code SPV_KHR_variable_pointers} extension introduces two capabilities. The first, {@code VariablePointersStorageBuffer}, <b>must</b> be supported by all implementations of this extension. The second, {@code VariablePointers}, is optional.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_variable_pointers}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>121</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VK_KHR_get_physical_device_properties2">{@code VK_KHR_get_physical_device_properties2}</a></li>
                <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VK_KHR_storage_buffer_storage_class">{@code VK_KHR_storage_buffer_storage_class}</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jesse Hall @jessehall</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-03-14</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Requires the <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/KHR/SPV_KHR_variable_pointers.html">SPV_KHR_variable_pointers</a> SPIR-V extension.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>John Kessenich, Google</li>
                <li>Neil Henning, Codeplay</li>
                <li>David Neto, Google</li>
                <li>Daniel Koch, Nvidia</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Weifeng Zhang, Qualcomm</li>
                <li>Stephen Clarke, Imagination Technologies</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Jesse Hall, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_VARIABLE_POINTERS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_VARIABLE_POINTERS_EXTENSION_NAME".."VK_KHR_variable_pointers"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES_KHR".."1000120000"
    )
}