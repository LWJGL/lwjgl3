/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_workgroup_memory_explicit_layout = "KHRWorkgroupMemoryExplicitLayout".nativeClassVK("KHR_workgroup_memory_explicit_layout", type = "device", postfix = KHR) {
    documentation =
        """
        This extension adds Vulkan support for the <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_workgroup_memory_explicit_layout.html">{@code SPV_KHR_workgroup_memory_explicit_layout}</a> SPIR-V extension, which allows shaders to explicitly define the layout of {@code Workgroup} storage class memory and create aliases between variables from that storage class in a compute shader.

        The aliasing feature allows different "views" on the same data, so the shader can bulk copy data from another storage class using one type (e.g. an array of large vectors), and then use the data with a more specific type. It also enables reducing the amount of workgroup memory consumed by allowing the shader to alias data whose lifetimes don't overlap.

        The explicit layout support and some form of aliasing is also required for layering OpenCL on top of Vulkan.

        <h5>VK_KHR_workgroup_memory_explicit_layout</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_workgroup_memory_explicit_layout}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>337</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Caio Marcelo de Oliveira Filho <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_workgroup_memory_explicit_layout:%20&amp;body=@cmarcelo%20">cmarcelo</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-06-01</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_workgroup_memory_explicit_layout.html">{@code SPV_KHR_workgroup_memory_explicit_layout}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Caio Marcelo de Oliveira Filho, Intel</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Daniel Koch, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_EXTENSION_NAME".."VK_KHR_workgroup_memory_explicit_layout"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR".."1000336000"
    )
}