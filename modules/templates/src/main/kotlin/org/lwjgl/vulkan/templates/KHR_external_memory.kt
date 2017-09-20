/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_external_memory = "KHRExternalMemory".nativeClassVK("KHR_external_memory", type = "device", postfix = KHR) {
    documentation =
        """
        An application may wish to reference device memory in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension enables an application to export non-Vulkan handles from Vulkan memory objects such that the underlying resources can be referenced outside the scope of the Vulkan logical device that created them.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_external_memory}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>73</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VK_KHR_external_memory_capabilities">{@code VK_KHR_external_memory_capabilities}</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones @cubanismo</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-10-20</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Interacts with VK_KHR_dedicated_allocation.</li>
                <li>Interacts with VK_NV_dedicated_allocation.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jason Ekstrand, Intel</li>
                <li>Ian Elliot, Google</li>
                <li>Jesse Hall, Google</li>
                <li>Tobias Hector, Imagination Technologies</li>
                <li>James Jones, NVIDIA</li>
                <li>Jeff Juliano, NVIDIA</li>
                <li>Matthew Netsch, Qualcomm Technologies, Inc.</li>
                <li>Daniel Rakos, AMD</li>
                <li>Carsten Rohde, NVIDIA</li>
                <li>Ray Smith, ARM</li>
                <li>Chad Versace, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_EXTERNAL_MEMORY_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_EXTERNAL_MEMORY_EXTENSION_NAME".."VK_KHR_external_memory"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO_KHR".."1000072000",
        "STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_KHR".."1000072001",
        "STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_KHR".."1000072002"
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_INVALID_EXTERNAL_HANDLE_KHR".."-1000072003"
    )

    EnumConstant(
        "VK_QUEUE_FAMILY_EXTERNAL_KHR",

        "QUEUE_FAMILY_EXTERNAL_KHR".."(~0-1)"
    )
}