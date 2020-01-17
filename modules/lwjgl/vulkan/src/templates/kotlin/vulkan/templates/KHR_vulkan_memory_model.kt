/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_vulkan_memory_model = "KHRVulkanMemoryModel".nativeClassVK("KHR_vulkan_memory_model", type = "device", postfix = KHR) {
    documentation =
        """
        The {@code VK_KHR_vulkan_memory_model} extension allows use of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#memory-model">Vulkan Memory Model</a>, which formally defines how to synchronize memory accesses to the same memory locations performed by multiple shader invocations.

        <h5>Promotion to Vulkan 1.2</h5>
        All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_vulkan_memory_model}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>212</dd>

            <dt><b>Revision</b></dt>
            <dd>3</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#versions-1.2-promotions">Vulkan 1.2</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_vulkan_memory_model:%20&amp;body=@jeffbolznv%20">jeffbolznv</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2018-12-10</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.2 Core</li>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_vulkan_memory_model.html">{@code SPV_KHR_vulkan_memory_model}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Alan Baker, Google</li>
                <li>Tobias Hector, AMD</li>
                <li>David Neto, Google</li>
                <li>Robert Simpson, Qualcomm Technologies, Inc.</li>
                <li>Brian Sumner, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_VULKAN_MEMORY_MODEL_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "KHR_VULKAN_MEMORY_MODEL_EXTENSION_NAME".."VK_KHR_vulkan_memory_model"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES_KHR".."1000211000"
    )
}