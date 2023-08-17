/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_external_memory_acquire_unmodified = "EXTExternalMemoryAcquireUnmodified".nativeClassVK("EXT_external_memory_acquire_unmodified", type = "device", postfix = "EXT") {
    documentation =
        """
        A memory barrier <b>may</b> have a performance penalty when acquiring ownership of a subresource range from an external queue family. This extension provides API that <b>may</b> reduce the performance penalty if ownership of the subresource range was previously released to the external queue family and if the resource’s memory has remained unmodified between the release and acquire operations.

        <h5>VK_EXT_external_memory_acquire_unmodified</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_external_memory_acquire_unmodified}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>454</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRExternalMemory VK_KHR_external_memory}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Lina Versace <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_external_memory_acquire_unmodified]%20@versalinyaa%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_external_memory_acquire_unmodified%20extension*">versalinyaa</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_external_memory_acquire_unmodified.adoc">VK_EXT_external_memory_acquire_unmodified</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-03-09</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Lina Versace, Google</li>
                <li>Chia-I Wu, Google</li>
                <li>James Jones, NVIDIA</li>
                <li>Yiwei Zhang, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXTENSION_NAME".."VK_EXT_external_memory_acquire_unmodified"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT".."1000453000"
    )
}