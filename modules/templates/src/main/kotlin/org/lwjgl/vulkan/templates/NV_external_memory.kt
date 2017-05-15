/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val NV_external_memory = "NVExternalMemory".nativeClassVK("NV_external_memory", type = "device", postfix = NV) {
    documentation =
        """
        Applications may wish to export memory to other Vulkan instances or other APIs, or import memory from other Vulkan instances or other APIs to enable Vulkan workloads to be split up across application module, process, or API boundaries. This extension enables applications to create exportable Vulkan memory objects such that the underlying resources can be referenced outside the Vulkan instance that created them.

        <h5>Examples</h5>
        <code><pre>
￿    // TODO: Write some sample code here.</pre></code>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_NV_external_memory</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>57</dd>

            <dt><b>Status</b></dt>
            <dd>Complete</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-08-19</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>Requires VK_NV_external_memory_capabilities.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>James Jones, NVIDIA</li>
                <li>Carsten Rohde, NVIDIA</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones (jajones 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_EXTERNAL_MEMORY_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_EXTERNAL_MEMORY_EXTENSION_NAME".."VK_NV_external_memory"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV".."1000056000",
        "STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV".."1000056001"
    )
}