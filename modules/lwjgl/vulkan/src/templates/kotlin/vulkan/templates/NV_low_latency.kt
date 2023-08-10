/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_low_latency = "NVLowLatency".nativeClassVK("NV_low_latency", type = "device", postfix = "NV") {
    documentation =
        """
        This extension adds the ##VkQueryLowLatencySupportNV structure, a structure used to query support for NVIDIA Reflex.

        <h5>VK_NV_low_latency</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_low_latency}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>311</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Charles Hansen <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_low_latency]%20@cshansen%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_low_latency%20extension*">cshansen</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-02-10</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Charles Hansen, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_LOW_LATENCY_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_LOW_LATENCY_EXTENSION_NAME".."VK_NV_low_latency"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV".."1000310000"
    )
}