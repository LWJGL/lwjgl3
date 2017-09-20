/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_16bit_storage = "KHR16bitStorage".nativeClassVK("KHR_16bit_storage", type = "device", postfix = KHR) {
    documentation =
        """
        The {@code VK_KHR_16bit_storage} extension allows use of 16-bit types in shader input and output interfaces, and push constant blocks. This extension introduces several new optional features which map to SPIR-V capabilities and allow access to 16-bit data in {@code Block}-decorated objects in the {@code Uniform} and the {@code StorageBuffer} storage classes, and objects in the {@code PushConstant} storage class. This extension allows 16-bit variables to be declared and used as user-defined shader inputs and outputs but does not change location assignment and component assignment rules.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_16bit_storage}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>84</dd>

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
                <li>Jan-Harald Fredriksen @janharald</li>
            </ul></dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/KHR/SPV_KHR_16bit_storage.html">SPV_KHR_16bit_storage</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-03-23</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Alexander Galazin, ARM</li>
                <li>Jan-Harald Fredriksen, ARM</li>
                <li>Joerg Wagner, ARM</li>
                <li>Neil Henning, Codeplay</li>
                <li>Jeff Bolz, Nvidia</li>
                <li>Daniel Koch, Nvidia</li>
                <li>David Neto, Google</li>
                <li>John Kessenich, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_16BIT_STORAGE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_16BIT_STORAGE_EXTENSION_NAME".."VK_KHR_16bit_storage"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES_KHR".."1000083000"
    )
}