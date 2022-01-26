/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_global_priority_query = "EXTGlobalPriorityQuery".nativeClassVK("EXT_global_priority_query", type = "device", postfix = "EXT") {
    documentation =
        """
        This device extension allows applications to query the global queue priorities supported by a queue family. It allows implementations to report which global priority levels are treated differently by the implementation, instead of silently mapping multiple requested global priority levels to the same internal priority, or using device creation failure to signal that a requested priority is not supported. It is intended primarily for use by system integration along with certain platform-specific priority enforcement rules.

        <h5>VK_EXT_global_priority_query</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_global_priority_query}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>389</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link EXTGlobalPriority VK_EXT_global_priority}</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to {@link KHRGlobalPriority VK_KHR_global_priority} extension</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Yiwei Zhang <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_global_priority_query]%20@zhangyiwei%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_global_priority_query%20extension%3E%3E">zhangyiwei</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-03-29</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Yiwei Zhang, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_GLOBAL_PRIORITY_QUERY_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_GLOBAL_PRIORITY_QUERY_EXTENSION_NAME".."VK_EXT_global_priority_query"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_EXT".."1000388000",
        "STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_EXT".."1000388001"
    )

    EnumConstant(
        "VK_MAX_GLOBAL_PRIORITY_SIZE_EXT",

        "MAX_GLOBAL_PRIORITY_SIZE_EXT".."16"
    )
}