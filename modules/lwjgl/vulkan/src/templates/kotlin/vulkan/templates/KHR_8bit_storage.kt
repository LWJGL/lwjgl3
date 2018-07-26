/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_8bit_storage = "KHR8bitStorage".nativeClassVK("KHR_8bit_storage", type = "device", postfix = KHR) {
    documentation =
        """
        The {@code VK_KHR_8bit_storage} extension allows use of 8-bit types in uniform and storage buffers, and push constant blocks. This extension introduces several new optional features which map to SPIR-V capabilities and allow access to 8-bit data in {@code Block}-decorated objects in the {@code Uniform} and the {@code StorageBuffer} storage classes, and objects in the {@code PushConstant} storage class.

        The {@code StorageBuffer8BitAccess} capability <b>must</b> be supported by all implementations of this extension. The other capabilities are optional.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_8bit_storage}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>178</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
                <li>Requires {@link KHRStorageBufferStorageClass VK_KHR_storage_buffer_storage_class}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Alexander Galazin @alegal-arm</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2018-02-05</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/KHR/SPV_KHR_8bit_storage.html">SPV_KHR_8bit_storage</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Alexander Galazin, Arm</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_8BIT_STORAGE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_8BIT_STORAGE_EXTENSION_NAME".."VK_KHR_8bit_storage"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES_KHR".."1000177000"
    )
}