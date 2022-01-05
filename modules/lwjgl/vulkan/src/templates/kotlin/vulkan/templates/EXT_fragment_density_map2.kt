/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_fragment_density_map2 = "EXTFragmentDensityMap2".nativeClassVK("EXT_fragment_density_map2", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension adds additional features and properties to {@link EXTFragmentDensityMap VK_EXT_fragment_density_map} in order to reduce fragment density map host latency as well as improved queries for subsampled sampler implementation-dependent behavior.

        <h5>VK_EXT_fragment_density_map2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_fragment_density_map2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>333</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link EXTFragmentDensityMap VK_EXT_fragment_density_map}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Matthew Netsch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_fragment_density_map2]%20@mnetsch%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_fragment_density_map2%20extension%3E%3E">mnetsch</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-06-16</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Interacts with Vulkan 1.1</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Matthew Netsch, Qualcomm Technologies, Inc.</li>
                <li>Jonathan Tinkham, Qualcomm Technologies, Inc.</li>
                <li>Jonathan Wicks, Qualcomm Technologies, Inc.</li>
                <li>Jan-Harald Fredriksen, ARM</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_FRAGMENT_DENSITY_MAP_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_FRAGMENT_DENSITY_MAP_2_EXTENSION_NAME".."VK_EXT_fragment_density_map2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES_EXT".."1000332000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT".."1000332001"
    )

    EnumConstant(
        "Extends {@code VkImageViewCreateFlagBits}.",

        "IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DEFERRED_BIT_EXT".enum(0x00000002)
    )
}