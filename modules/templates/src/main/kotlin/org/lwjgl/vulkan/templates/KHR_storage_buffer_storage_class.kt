/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_storage_buffer_storage_class = "KHRStorageBufferStorageClass".nativeClassVK("KHR_storage_buffer_storage_class", type = "device", postfix = KHR) {
    documentation =
        """
        This extension adds support for the following SPIR-V extension in Vulkan:

        <ul>
            <li>SPV_KHR_storage_buffer_storage_class</li>
        </ul>

        This extension provides a new SPIR-V {@code StorageBuffer} storage class. A {@code Block}-decorated object in this class is equivalent to a {@code BufferBlock}-decorated object in the <b>Uniform</b> storage class.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHR_storage_buffer_storage_class</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>132</dd>

            <dt><b>Status</b></dt>
            <dd>Draft</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-03-23</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>This extension requires Vulkan 1.0.</li>
                <li>This extension requires the <a target="_blank" href="https://gitlab.khronos.org/spirv/spirv-extensions/blob/master/SPV_KHR_storage_buffer_storage_class.asciidoc">SPV_KHR_storage_buffer_storage_class</a> SPIR-V extension.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Alexander Galazin, ARM</li>
                <li>David Neto, Google</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jan-Harald Fredriksen (jan-harald.fredriksen 'at' arm.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_STORAGE_BUFFER_STORAGE_CLASS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_STORAGE_BUFFER_STORAGE_CLASS_EXTENSION_NAME".."VK_KHR_storage_buffer_storage_class"
    )
}