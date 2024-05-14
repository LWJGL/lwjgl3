/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_raw_access_chains = "NVRawAccessChains".nativeClassVK("NV_raw_access_chains", type = "device", postfix = "NV") {
    documentation =
        """
        This extension allows the use of the {@code SPV_NV_raw_access_chains} extension in SPIR-V shader modules. This enables SPIR-V producers to efficiently implement interfaces similar to Direct3D structured buffers and byte address buffers, allowing shaders compiled from an HLSL source to generate more efficient code.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_raw_access_chains}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>556</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>SPIR-V Dependencies</b></dt>
            <dd><ul>
                <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_raw_access_chains.html">SPV_NV_raw_access_chains</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Rodrigo Locatti <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_raw_access_chains]%20@rlocatti%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_raw_access_chains%20extension*">rlocatti</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-12-04</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_raw_access_chains.html">{@code SPV_NV_raw_access_chains}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Hans-Kristian Arntzen, Valve</li>
                <li>Rodrigo Locatti, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_RAW_ACCESS_CHAINS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_RAW_ACCESS_CHAINS_EXTENSION_NAME".."VK_NV_raw_access_chains"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAW_ACCESS_CHAINS_FEATURES_NV".."1000555000"
    )
}