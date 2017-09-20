/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_external_fence = "KHRExternalFence".nativeClassVK("KHR_external_fence", type = "device", postfix = KHR) {
    documentation =
        """
        An application using external memory may wish to synchronize access to that memory using fences. This extension enables an application to create fences from which non-Vulkan handles that reference the underlying synchronization primitive can be exported.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_external_fence}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>114</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VK_KHR_external_fence_capabilities">{@code VK_KHR_external_fence_capabilities}</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jesse Hall @jessehall</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-05-08</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jesse Hall, Google</li>
                <li>James Jones, NVIDIA</li>
                <li>Jeff Juliano, NVIDIA</li>
                <li>Cass Everitt, Oculus</li>
                <li>Contributors to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VK_KHR_external_semaphore">VK_KHR_external_semaphore</a></li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_EXTERNAL_FENCE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_EXTERNAL_FENCE_EXTENSION_NAME".."VK_KHR_external_fence"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO_KHR".."1000113000"
    )

    EnumConstant(
        """
        VkFenceImportFlagBitsKHR - Bitmask specifying additional parameters of fence payload import

        <h5>Description</h5>
        <ul>
            <li>#FENCE_IMPORT_TEMPORARY_BIT_KHR specifies that the fence payload will be imported only temporarily, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-fences-importing">Importing Fence Payloads</a>, regardless of the permanence of {@code handleType}.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkFenceImportFlagsKHR}
        """,

        "FENCE_IMPORT_TEMPORARY_BIT_KHR".enum(0x00000001)
    )
}