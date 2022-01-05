/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_device_coherent_memory = "AMDDeviceCoherentMemory".nativeClassVK("AMD_device_coherent_memory", type = "device", postfix = "AMD") {
    documentation =
        """
        This extension adds the device coherent and device uncached memory types. Any device accesses to device coherent memory are automatically made visible to any other device access. Device uncached memory indicates to applications that caches are disabled for a particular memory type, which guarantees device coherence.

        Device coherent and uncached memory are expected to have lower performance for general access than non-device coherent memory, but can be useful in certain scenarios; particularly so for debugging.

        <h5>VK_AMD_device_coherent_memory</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_device_coherent_memory}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>230</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_device_coherent_memory]%20@tobski%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_device_coherent_memory%20extension%3E%3E">tobski</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-02-04</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ping Fu, AMD</li>
                <li>Timothy Lottes, AMD</li>
                <li>Tobias Hector, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_DEVICE_COHERENT_MEMORY_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_DEVICE_COHERENT_MEMORY_EXTENSION_NAME".."VK_AMD_device_coherent_memory"
    )

    EnumConstant(
        "Extends {@code VkMemoryPropertyFlagBits}.",

        "MEMORY_PROPERTY_DEVICE_COHERENT_BIT_AMD".enum(0x00000040),
        "MEMORY_PROPERTY_DEVICE_UNCACHED_BIT_AMD".enum(0x00000080)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD".."1000229000"
    )
}