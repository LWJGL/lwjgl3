/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_index_type_uint8 = "EXTIndexTypeUint8".nativeClassVK("EXT_index_type_uint8", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension allows {@code uint8_t} indices to be used with #CmdBindIndexBuffer().

        <h5>VK_EXT_index_type_uint8</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_index_type_uint8}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>266</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_index_type_uint8]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_index_type_uint8%20extension%3E%3E">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-05-02</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_INDEX_TYPE_UINT8_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_INDEX_TYPE_UINT8_EXTENSION_NAME".."VK_EXT_index_type_uint8"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES_EXT".."1000265000"
    )

    EnumConstant(
        "Extends {@code VkIndexType}.",

        "INDEX_TYPE_UINT8_EXT".."1000265000"
    )
}